package com.google.android.vending.licensing;

import android.content.Context;
import android.util.Log;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;

public class APKExpansionPolicy implements Policy {
    private static final String DEFAULT_MAX_RETRIES = "0";
    private static final String DEFAULT_RETRY_COUNT = "0";
    private static final String DEFAULT_RETRY_UNTIL = "0";
    private static final String DEFAULT_VALIDITY_TIMESTAMP = "0";
    public static final int MAIN_FILE_URL_INDEX = 0;
    private static final long MILLIS_PER_MINUTE = 60000L;
    public static final int PATCH_FILE_URL_INDEX = 1;
    private static final String PREFS_FILE = "com.android.vending.licensing.APKExpansionPolicy";
    private static final String PREF_LAST_RESPONSE = "lastResponse";
    private static final String PREF_MAX_RETRIES = "maxRetries";
    private static final String PREF_RETRY_COUNT = "retryCount";
    private static final String PREF_RETRY_UNTIL = "retryUntil";
    private static final String PREF_VALIDITY_TIMESTAMP = "validityTimestamp";
    private static final String TAG = "APKExpansionPolicy";
    private Vector mExpansionFileNames;
    private Vector mExpansionFileSizes;
    private Vector mExpansionURLs;
    private int mLastResponse;
    private long mLastResponseTime;
    private long mMaxRetries;
    private PreferenceObfuscator mPreferences;
    private long mRetryCount;
    private long mRetryUntil;
    private long mValidityTimestamp;

    public APKExpansionPolicy(Context context0, Obfuscator obfuscator0) {
        this.mLastResponseTime = 0L;
        this.mExpansionURLs = new Vector();
        this.mExpansionFileNames = new Vector();
        this.mExpansionFileSizes = new Vector();
        PreferenceObfuscator preferenceObfuscator0 = new PreferenceObfuscator(context0.getSharedPreferences("com.android.vending.licensing.APKExpansionPolicy", 0), obfuscator0);
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
                NameValuePair nameValuePair0 = (NameValuePair)object0;
                String s1 = nameValuePair0.getName();
                int v = 0;
                while(map0.containsKey(s1)) {
                    ++v;
                    s1 = nameValuePair0.getName() + v;
                }
                map0.put(s1, nameValuePair0.getValue());
            }
        }
        catch(URISyntaxException unused_ex) {
            Log.w("APKExpansionPolicy", "Invalid syntax error while decoding extras data from server.");
        }
        return map0;
    }

    public String getExpansionFileName(int v) {
        return v >= this.mExpansionFileNames.size() ? null : ((String)this.mExpansionFileNames.elementAt(v));
    }

    public long getExpansionFileSize(int v) {
        return v >= this.mExpansionFileSizes.size() ? -1L : ((long)(((Long)this.mExpansionFileSizes.elementAt(v))));
    }

    public String getExpansionURL(int v) {
        return v >= this.mExpansionURLs.size() ? null : ((String)this.mExpansionURLs.elementAt(v));
    }

    public int getExpansionURLCount() {
        return this.mExpansionURLs.size();
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
                this.setValidityTimestamp("1763089219131");
                for(Object object0: map0.keySet()) {
                    String s = (String)object0;
                    if(s.equals("VT")) {
                        this.setValidityTimestamp(((String)map0.get(s)));
                    }
                    else if(s.equals("GT")) {
                        this.setRetryUntil(((String)map0.get(s)));
                    }
                    else if(s.equals("GR")) {
                        this.setMaxRetries(((String)map0.get(s)));
                    }
                    else if(s.startsWith("FILE_URL")) {
                        this.setExpansionURL(Integer.parseInt(s.substring(8)) - 1, ((String)map0.get(s)));
                    }
                    else if(s.startsWith("FILE_NAME")) {
                        this.setExpansionFileName(Integer.parseInt(s.substring(9)) - 1, ((String)map0.get(s)));
                    }
                    else if(s.startsWith("FILE_SIZE")) {
                        this.setExpansionFileSize(Integer.parseInt(s.substring(9)) - 1, Long.parseLong(((String)map0.get(s))));
                    }
                }
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

    public void resetPolicy() {
        this.mPreferences.putString("lastResponse", "291");
        this.setRetryUntil("0");
        this.setMaxRetries("0");
        this.setRetryCount(0L);
        this.setValidityTimestamp("0");
        this.mPreferences.commit();
    }

    public void setExpansionFileName(int v, String s) {
        if(v >= this.mExpansionFileNames.size()) {
            this.mExpansionFileNames.setSize(v + 1);
        }
        this.mExpansionFileNames.set(v, s);
    }

    public void setExpansionFileSize(int v, long v1) {
        if(v >= this.mExpansionFileSizes.size()) {
            this.mExpansionFileSizes.setSize(v + 1);
        }
        this.mExpansionFileSizes.set(v, v1);
    }

    public void setExpansionURL(int v, String s) {
        if(v >= this.mExpansionURLs.size()) {
            this.mExpansionURLs.setSize(v + 1);
        }
        this.mExpansionURLs.set(v, s);
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
            Log.w("APKExpansionPolicy", "Licence retry count (GR) missing, grace period disabled");
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
            Log.w("APKExpansionPolicy", "License retry timestamp (GT) missing, grace period disabled");
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
            Log.w("APKExpansionPolicy", "License validity timestamp (VT) missing, caching for a minute");
            long0 = (long)(System.currentTimeMillis() + 60000L);
            s = "1763089218919";
        }
        this.mValidityTimestamp = (long)long0;
        this.mPreferences.putString("validityTimestamp", s);
    }
}

