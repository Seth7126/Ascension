package com.google.android.play.core.assetpacks;

final class ck extends RuntimeException {
    final int a;

    ck(String s) {
        super(s);
        this.a = -1;
    }

    ck(String s, int v) {
        super(s);
        this.a = v;
    }

    ck(String s, Exception exception0) {
        super(s, exception0);
        this.a = -1;
    }

    ck(String s, Exception exception0, int v) {
        super(s, exception0);
        this.a = v;
    }
}

