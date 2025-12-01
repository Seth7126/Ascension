package com.google.android.vending.licensing;

public interface Policy {
    public static final int LICENSED = 0x100;
    public static final int NOT_LICENSED = 561;
    public static final int RETRY = 291;

    boolean allowAccess();

    void processServerResponse(int arg1, ResponseData arg2);
}

