package com.google.android.play.core.appupdate;

public abstract class AppUpdateOptions {
    public static abstract class Builder {
        public abstract AppUpdateOptions build();

        public abstract Builder setAllowAssetPackDeletion(boolean arg1);

        public abstract Builder setAppUpdateType(int arg1);
    }

    public abstract boolean allowAssetPackDeletion();

    public abstract int appUpdateType();

    public static AppUpdateOptions defaultOptions(int v) {
        return AppUpdateOptions.newBuilder(v).build();
    }

    public static Builder newBuilder(int v) {
        Builder appUpdateOptions$Builder0 = new zzv();
        ((zzv)appUpdateOptions$Builder0).setAppUpdateType(v);
        appUpdateOptions$Builder0.setAllowAssetPackDeletion(false);
        return appUpdateOptions$Builder0;
    }
}

