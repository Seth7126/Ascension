package com.google.android.vending.licensing;

public class NullDeviceLimiter implements DeviceLimiter {
    @Override  // com.google.android.vending.licensing.DeviceLimiter
    public int isDeviceAllowed(String s) {
        return 0x100;
    }
}

