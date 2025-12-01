package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.core.content.ContextCompat;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

class Store {
    static class Token {
        private static final long REFRESH_PERIOD_MILLIS;
        final String appVersion;
        final long timestamp;
        final String token;

        static {
            Token.REFRESH_PERIOD_MILLIS = TimeUnit.DAYS.toMillis(7L);
        }

        private Token(String s, String s1, long v) {
            this.token = s;
            this.appVersion = s1;
            this.timestamp = v;
        }

        static String encode(String s, String s1, long v) {
            try {
                JSONObject jSONObject0 = new JSONObject();
                jSONObject0.put("token", s);
                jSONObject0.put("appVersion", s1);
                jSONObject0.put("timestamp", v);
                return jSONObject0.toString();
            }
            catch(JSONException jSONException0) {
                Log.w("FirebaseInstanceId", "Failed to encode token: " + jSONException0);
                return null;
            }
        }

        static String getTokenOrNull(Token store$Token0) {
            return store$Token0 == null ? null : store$Token0.token;
        }

        boolean needsRefresh(String s) {
            return System.currentTimeMillis() > this.timestamp + Token.REFRESH_PERIOD_MILLIS || !s.equals(this.appVersion);
        }

        static Token parse(String s) {
            if(TextUtils.isEmpty(s)) {
                return null;
            }
            if(s.startsWith("{")) {
                try {
                    JSONObject jSONObject0 = new JSONObject(s);
                    return new Token(jSONObject0.getString("token"), jSONObject0.getString("appVersion"), jSONObject0.getLong("timestamp"));
                }
                catch(JSONException jSONException0) {
                    Log.w("FirebaseInstanceId", "Failed to parse token: " + jSONException0);
                    return null;
                }
            }
            return new Token(s, null, 0L);
        }
    }

    final Context context;
    final SharedPreferences store;
    private final Map subtypeCreationTimes;

    public Store(Context context0) {
        this.subtypeCreationTimes = new ArrayMap();
        this.context = context0;
        this.store = context0.getSharedPreferences("com.google.android.gms.appid", 0);
        this.checkForRestore("com.google.android.gms.appid-no-backup");
    }

    private void checkForRestore(String s) {
        File file0 = new File(ContextCompat.getNoBackupFilesDir(this.context), s);
        if(file0.exists()) {
            return;
        }
        try {
            if(file0.createNewFile() && !this.isEmpty()) {
                Log.i("FirebaseInstanceId", "App restored, clearing state");
                this.deleteAll();
                FirebaseInstanceId.getInstance().resetStorageAndScheduleSync();
            }
        }
        catch(IOException iOException0) {
            if(Log.isLoggable("FirebaseInstanceId", 3)) {
                String s1 = iOException0.getMessage();
                Log.d("FirebaseInstanceId", (s1.length() == 0 ? new String("Error creating file in no backup dir: ") : "Error creating file in no backup dir: " + s1));
            }
        }
    }

    static String createSubtypeInfoKey(String s, String s1) [...] // Inlined contents

    private String createTokenKey(String s, String s1, String s2) [...] // Inlined contents

    public void deleteAll() {
        synchronized(this) {
            this.subtypeCreationTimes.clear();
            this.store.edit().clear().commit();
        }
    }

    private void deletePrefix(String s) {
        SharedPreferences.Editor sharedPreferences$Editor0 = this.store.edit();
        for(Object object0: this.store.getAll().keySet()) {
            String s1 = (String)object0;
            if(s1.startsWith(s)) {
                sharedPreferences$Editor0.remove(s1);
            }
        }
        sharedPreferences$Editor0.commit();
    }

    public void deleteToken(String s, String s1, String s2) {
        synchronized(this) {
            SharedPreferences.Editor sharedPreferences$Editor0 = this.store.edit();
            sharedPreferences$Editor0.remove(s + "|T|" + s1 + "|" + s2);
            sharedPreferences$Editor0.commit();
        }
    }

    public void deleteTokens(String s) {
        synchronized(this) {
            this.deletePrefix(s + "|T|");
        }
    }

    public long getCreationTime(String s) {
        synchronized(this) {
            Long long0 = (Long)this.subtypeCreationTimes.get(s);
            return long0 != null ? ((long)long0) : this.getCreationTimeFromSharedPreferences(s);
        }
    }

    private long getCreationTimeFromSharedPreferences(String s) {
        String s1 = this.store.getString(s + "|S|" + "cre", null);
        if(s1 != null) {
            try {
                return Long.parseLong(s1);
            }
            catch(NumberFormatException unused_ex) {
            }
        }
        return 0L;
    }

    public Token getToken(String s, String s1, String s2) {
        synchronized(this) {
            return Token.parse(this.store.getString(s + "|T|" + s1 + "|" + s2, null));
        }
    }

    public boolean isEmpty() {
        synchronized(this) {
            return this.store.getAll().isEmpty();
        }
    }

    public void saveToken(String s, String s1, String s2, String s3, String s4) {
        synchronized(this) {
            String s5 = Token.encode(s3, s4, System.currentTimeMillis());
            if(s5 == null) {
                return;
            }
            SharedPreferences.Editor sharedPreferences$Editor0 = this.store.edit();
            sharedPreferences$Editor0.putString(s + "|T|" + s1 + "|" + s2, s5);
            sharedPreferences$Editor0.commit();
        }
    }

    public long setCreationTime(String s) {
        synchronized(this) {
            long v1 = this.writeCreationTimeToSharedPreferences(s);
            this.subtypeCreationTimes.put(s, v1);
            return v1;
        }
    }

    private long writeCreationTimeToSharedPreferences(String s) {
        long v = System.currentTimeMillis();
        if(!this.store.contains(s + "|S|" + "cre")) {
            SharedPreferences.Editor sharedPreferences$Editor0 = this.store.edit();
            sharedPreferences$Editor0.putString(s + "|S|" + "cre", String.valueOf(v));
            sharedPreferences$Editor0.commit();
            return v;
        }
        return this.getCreationTimeFromSharedPreferences(s);
    }
}

