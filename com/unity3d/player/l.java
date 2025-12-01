package com.unity3d.player;

import android.os.Build;

final class l implements Thread.UncaughtExceptionHandler {
    private volatile Thread.UncaughtExceptionHandler a;

    final boolean a() {
        synchronized(this) {
            Thread.UncaughtExceptionHandler thread$UncaughtExceptionHandler0 = Thread.getDefaultUncaughtExceptionHandler();
            if(thread$UncaughtExceptionHandler0 == this) {
                return false;
            }
            this.a = thread$UncaughtExceptionHandler0;
            Thread.setDefaultUncaughtExceptionHandler(this);
            return true;
        }
    }

    @Override
    public final void uncaughtException(Thread thread0, Throwable throwable0) {
        synchronized(this) {
            try {
                Error error0 = new Error(String.format("FATAL EXCEPTION [%s]\n", thread0.getName()) + "Unity version     : 2021.3.36f1\n" + String.format("Device model      : %s %s\n", Build.MANUFACTURER, Build.MODEL) + "Device fingerprint: google/sunfish/sunfish:13/TQ2A.230405.003/9719927:user/release-keys\n" + "Build Type        : Release\n" + "Scripting Backend : IL2CPP\n" + "ABI               : arm64-v8a\n" + "Strip Engine Code : true\n");
                error0.setStackTrace(new StackTraceElement[0]);
                error0.initCause(throwable0);
                this.a.uncaughtException(thread0, error0);
            }
            catch(Throwable unused_ex) {
                this.a.uncaughtException(thread0, throwable0);
            }
        }
    }
}

