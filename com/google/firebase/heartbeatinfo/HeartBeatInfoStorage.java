package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.content.SharedPreferences;

class HeartBeatInfoStorage {
    private static final String GLOBAL = "fire-global";
    private static HeartBeatInfoStorage instance = null;
    private static final String preferencesName = "FirebaseAppHeartBeat";
    private final SharedPreferences sharedPreferences;

    static {
    }

    private HeartBeatInfoStorage(Context context0) {
        this.sharedPreferences = context0.getSharedPreferences("FirebaseAppHeartBeat", 0);
    }

    HeartBeatInfoStorage(SharedPreferences sharedPreferences0) {
        this.sharedPreferences = sharedPreferences0;
    }

    static HeartBeatInfoStorage getInstance(Context context0) {
        synchronized(HeartBeatInfoStorage.class) {
            if(HeartBeatInfoStorage.instance == null) {
                HeartBeatInfoStorage.instance = new HeartBeatInfoStorage(context0);
            }
            return HeartBeatInfoStorage.instance;
        }
    }

    boolean shouldSendGlobalHeartBeat(long v) {
        synchronized(this) {
            return this.shouldSendSdkHeartBeat("fire-global", v);
        }
    }

    boolean shouldSendSdkHeartBeat(String s, long v) {
        synchronized(this) {
            if(this.sharedPreferences.contains(s)) {
                if(v - this.sharedPreferences.getLong(s, -1L) >= 86400000L) {
                    this.sharedPreferences.edit().putLong(s, v).apply();
                    return true;
                }
                return false;
            }
            this.sharedPreferences.edit().putLong(s, v).apply();
            return true;
        }
    }
}

