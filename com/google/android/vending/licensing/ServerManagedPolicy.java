package com.google.android.vending.licensing;

import android.content.Context;
import android.util.Log;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;

public class ServerManagedPolicy implements Policy {
    private static final String DEFAULT_MAX_RETRIES = "0";
    private static final String DEFAULT_RETRY_COUNT = "0";
    private static final String DEFAULT_RETRY_UNTIL = "0";
    private static final String DEFAULT_VALIDITY_TIMESTAMP = "0";
    private static final long MILLIS_PER_MINUTE = 60000L;
    private static final String PREFS_FILE = "com.android.vending.licensing.ServerManagedPolicy";
    private static final String PREF_LAST_RESPONSE = "lastResponse";
    private static final String PREF_MAX_RETRIES = "maxRetries";
    private static final String PREF_RETRY_COUNT = "retryCount";
    private static final String PREF_RETRY_UNTIL = "retryUntil";
    private static final String PREF_VALIDITY_TIMESTAMP = "validityTimestamp";
    private static final String TAG = "ServerManagedPolicy";
    private int mLastResponse;
    private long mLastResponseTime;
    private long mMaxRetries;
    private PreferenceObfuscator mPreferences;
    private long mRetryCount;
    private long mRetryUntil;
    private long mValidityTimestamp;

    public ServerManagedPolicy(Context context0, Obfuscator obfuscator0) {
        this.mLastResponseTime = 0L;
        PreferenceObfuscator preferenceObfuscator0 = new PreferenceObfuscator(context0.getSharedPreferences("com.android.vending.licensing.ServerManagedPolicy", 0), obfuscator0);
        this.mPreferences = preferenceObfuscator0;
        this.mLastResponse = Integer.parseInt(preferenceObfuscator0.getString("lastResponse", "291"));
        this.mValidityTimestamp = Long.parseLong(this.mPreferences.getString("validityTimestamp", "0"));
        this.mRetryUntil = Long.parseLong(this.mPreferences.getString("retryUntil", "0"));
        this.mMaxRetries = Long.parseLong(this.mPreferences.getString("maxRetries", "0"));
        this.mRetryCount = Long.parseLong(this.mPreferences.getString("retryCount", "0"));
    }

    @Override  // com.google.android.vending.licensing.Policy
    public boolean allowAccess() {
        long v = System.currentTimeMillis();
        return this.mLastResponse == 0x100 ? v <= this.mValidityTimestamp : this.mLastResponse == 291 && v < this.mLastResponseTime + 60000L && (v <= this.mRetryUntil || this.mRetryCount <= this.mMaxRetries);
    }

    private Map decodeExtras(String s) {
        Map map0 = new HashMap();
        try {
            for(Object object0: URLEncodedUtils.parse(new URI("?" + s), "UTF-8")) {
                map0.put(((NameValuePair)object0).getName(), ((NameValuePair)object0).getValue());
            }
        }
        catch(URISyntaxException unused_ex) {
            Log.w("ServerManagedPolicy", "Invalid syntax error while decoding extras data from server.");
        }
        return map0;
    }

    public long getMaxRetries() {
        return this.mMaxRetries;
    }

    public long getRetryCount() {
        return this.mRetryCount;
    }

    public long getRetryUntil() {
        return this.mRetryUntil;
    }

    public long getValidityTimestamp() {
        return this.mValidityTimestamp;
    }

    @Override  // com.google.android.vending.licensing.Policy
    public void processServerResponse(int v, ResponseData responseData0) {
        if(v == 291) {
            this.setRetryCount(this.mRetryCount + 1L);
        }
        else {
            this.setRetryCount(0L);
        }
        switch(v) {
            case 0x100: {
                Map map0 = this.decodeExtras(responseData0.extra);
                this.mLastResponse = 0x100;
                this.setValidityTimestamp(((String)map0.get("VT")));
                this.setRetryUntil(((String)map0.get("GT")));
                this.setMaxRetries(((String)map0.get("GR")));
                break;
            }
            case 561: {
                this.setValidityTimestamp("0");
                this.setRetryUntil("0");
                this.setMaxRetries("0");
            }
        }
        this.setLastResponse(v);
        this.mPreferences.commit();
    }

    private void setLastResponse(int v) {
        this.mLastResponseTime = System.currentTimeMillis();
        this.mLastResponse = v;
        this.mPreferences.putString("lastResponse", Integer.toString(v));
    }

    private void setMaxRetries(String s) {
        Long long0;
        try {
            long0 = Long.parseLong(s);
        }
        catch(NumberFormatException unused_ex) {
            Log.w("ServerManagedPolicy", "Licence retry count (GR) missing, grace period disabled");
            long0 = 0L;
            s = "0";
        }
        this.mMaxRetries = (long)long0;
        this.mPreferences.putString("maxRetries", s);
    }

    private void setRetryCount(long v) {
        this.mRetryCount = v;
        this.mPreferences.putString("retryCount", Long.toString(v));
    }

    private void setRetryUntil(String s) {
        Long long0;
        try {
            long0 = Long.parseLong(s);
        }
        catch(NumberFormatException unused_ex) {
            Log.w("ServerManagedPolicy", "License retry timestamp (GT) missing, grace period disabled");
            long0 = 0L;
            s = "0";
        }
        this.mRetryUntil = (long)long0;
        this.mPreferences.putString("retryUntil", s);
    }

    private void setValidityTimestamp(String s) {
        Long long0;
        try {
            long0 = Long.parseLong(s);
        }
        catch(NumberFormatException unused_ex) {
            Log.w("ServerManagedPolicy", "License validity timestamp (VT) missing, caching for a minute");
            long0 = (long)(System.currentTimeMillis() + 60000L);
            s = "1763089219385";
        }
        this.mValidityTimestamp = (long)long0;
        this.mPreferences.putString("validityTimestamp", s);
    }
}

