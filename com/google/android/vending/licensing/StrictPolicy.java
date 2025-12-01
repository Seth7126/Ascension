package com.google.android.vending.licensing;

public class StrictPolicy implements Policy {
    private int mLastResponse;

    public StrictPolicy() {
        this.mLastResponse = 291;
    }

    @Override  // com.google.android.vending.licensing.Policy
    public boolean allowAccess() {
        return this.mLastResponse == 0x100;
    }

    @Override  // com.google.android.vending.licensing.Policy
    public void processServerResponse(int v, ResponseData responseData0) {
        this.mLastResponse = v;
    }
}

