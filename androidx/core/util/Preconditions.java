package androidx.core.util;

import android.text.TextUtils;
import java.util.Locale;

public final class Preconditions {
    public static void checkArgument(boolean z) {
        if(!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void checkArgument(boolean z, Object object0) {
        if(!z) {
            throw new IllegalArgumentException(String.valueOf(object0));
        }
    }

    public static int checkArgumentInRange(int v, int v1, int v2, String s) {
        if(v < v1) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", s, v1, v2));
        }
        if(v > v2) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", s, v1, v2));
        }
        return v;
    }

    public static int checkArgumentNonnegative(int v) {
        if(v < 0) {
            throw new IllegalArgumentException();
        }
        return v;
    }

    public static int checkArgumentNonnegative(int v, String s) {
        if(v < 0) {
            throw new IllegalArgumentException(s);
        }
        return v;
    }

    public static int checkFlagsArgument(int v, int v1) {
        if((v & v1) != v) {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(v) + ", but only 0x" + Integer.toHexString(v1) + " are allowed");
        }
        return v;
    }

    public static Object checkNotNull(Object object0) {
        object0.getClass();
        return object0;
    }

    public static Object checkNotNull(Object object0, Object object1) {
        if(object0 == null) {
            throw new NullPointerException(String.valueOf(object1));
        }
        return object0;
    }

    public static void checkState(boolean z) {
        Preconditions.checkState(z, null);
    }

    public static void checkState(boolean z, String s) {
        if(!z) {
            throw new IllegalStateException(s);
        }
    }

    public static CharSequence checkStringNotEmpty(CharSequence charSequence0) {
        if(TextUtils.isEmpty(charSequence0)) {
            throw new IllegalArgumentException();
        }
        return charSequence0;
    }

    public static CharSequence checkStringNotEmpty(CharSequence charSequence0, Object object0) {
        if(TextUtils.isEmpty(charSequence0)) {
            throw new IllegalArgumentException(String.valueOf(object0));
        }
        return charSequence0;
    }

    public static CharSequence checkStringNotEmpty(CharSequence charSequence0, String s, Object[] arr_object) {
        if(TextUtils.isEmpty(charSequence0)) {
            throw new IllegalArgumentException(String.format(s, arr_object));
        }
        return charSequence0;
    }
}

