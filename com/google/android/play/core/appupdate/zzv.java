package com.google.android.play.core.appupdate;

final class zzv extends Builder {
    private int zza;
    private boolean zzb;
    private byte zzc;

    @Override  // com.google.android.play.core.appupdate.AppUpdateOptions$Builder
    public final AppUpdateOptions build() {
        if(this.zzc != 3) {
            StringBuilder stringBuilder0 = new StringBuilder();
            if((this.zzc & 1) == 0) {
                stringBuilder0.append(" appUpdateType");
            }
            if((this.zzc & 2) == 0) {
                stringBuilder0.append(" allowAssetPackDeletion");
            }
            throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
        }
        return new zzx(this.zza, this.zzb, null);
    }

    @Override  // com.google.android.play.core.appupdate.AppUpdateOptions$Builder
    public final Builder setAllowAssetPackDeletion(boolean z) {
        this.zzb = z;
        this.zzc = (byte)(this.zzc | 2);
        return this;
    }

    @Override  // com.google.android.play.core.appupdate.AppUpdateOptions$Builder
    public final Builder setAppUpdateType(int v) {
        this.zza = v;
        this.zzc = (byte)(this.zzc | 1);
        return this;
    }
}

