package androidx.core.os;

import android.os.Message;

public final class MessageCompat {
    private static boolean sTryIsAsynchronous = true;
    private static boolean sTrySetAsynchronous = true;

    static {
    }

    public static boolean isAsynchronous(Message message0) {
        return message0.isAsynchronous();
    }

    public static void setAsynchronous(Message message0, boolean z) {
        message0.setAsynchronous(z);
    }
}

