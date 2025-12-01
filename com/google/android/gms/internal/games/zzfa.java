package com.google.android.gms.internal.games;

public final class zzfa {
    public static String zzo(int v) {
        switch(v) {
            case 0: {
                return "DAILY";
            }
            case 1: {
                return "WEEKLY";
            }
            case 2: {
                return "ALL_TIME";
            }
            default: {
                throw new IllegalArgumentException("Unknown time span " + v);
            }
        }
    }
}

