package com.google.android.play.core.assetpacks;

public final class bg {
    public static boolean a(int v) {
        return v == 1 || v == 2 || v == 3 || v == 7;
    }

    public static boolean b(int v) {
        return v == 2 || v == 3 || v == 7;
    }

    static boolean c(int v, int v1) {
        switch(v) {
            case 2: {
                return v1 == 1 || v1 == 8;
            }
            case 3: {
                return v1 == 2 || (v1 == 1 || v1 == 7 || v1 == 8);
            }
            case 4: {
                return v1 != 4;
            }
            case 6: {
                return v1 != 5 && v1 != 6;
            }
            default: {
                return false;
            }
        }
    }

    public static boolean d(int v) {
        return v == 4 || v == 5 || v == 6;
    }
}

