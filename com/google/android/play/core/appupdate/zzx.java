package com.google.android.play.core.appupdate;

final class zzx extends AppUpdateOptions {
    private final int zza;
    private final boolean zzb;

    zzx(int v, boolean z, zzw zzw0) {
        this.zza = v;
        this.zzb = z;
    }

    @Override  // com.google.android.play.core.appupdate.AppUpdateOptions
    public final boolean allowAssetPackDeletion() {
        return this.zzb;
    }

    @Override  // com.google.android.play.core.appupdate.AppUpdateOptions
    public final int appUpdateType() {
        return this.zza;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof AppUpdateOptions) {
            int v = ((AppUpdateOptions)object0).appUpdateType();
            if(this.zza == v) {
                boolean z = ((AppUpdateOptions)object0).allowAssetPackDeletion();
                return this.zzb == z;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.zza ^ 1000003;
        return this.zzb ? v * 1000003 ^ 0x4CF : v * 1000003 ^ 0x4D5;
    }

    @Override
    public final String toString() {
        return "AppUpdateOptions{appUpdateType=" + this.zza + ", allowAssetPackDeletion=" + this.zzb + "}";
    }
}

