package com.google.android.play.core.install;

final class zza extends InstallState {
    private final int zza;
    private final long zzb;
    private final long zzc;
    private final int zzd;
    private final String zze;

    zza(int v, long v1, long v2, int v3, String s) {
        this.zza = v;
        this.zzb = v1;
        this.zzc = v2;
        this.zzd = v3;
        if(s == null) {
            throw new NullPointerException("Null packageName");
        }
        this.zze = s;
    }

    @Override  // com.google.android.play.core.install.InstallState
    public final long bytesDownloaded() {
        return this.zzb;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof InstallState) {
            int v = ((InstallState)object0).installStatus();
            if(this.zza == v) {
                long v1 = ((InstallState)object0).bytesDownloaded();
                if(this.zzb == v1) {
                    long v2 = ((InstallState)object0).totalBytesToDownload();
                    if(this.zzc == v2) {
                        int v3 = ((InstallState)object0).installErrorCode();
                        if(this.zzd == v3) {
                            String s = ((InstallState)object0).packageName();
                            return this.zze.equals(s);
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return ((((this.zza ^ 1000003) * 1000003 ^ ((int)(this.zzb ^ this.zzb >>> 0x20))) * 1000003 ^ ((int)(this.zzc >>> 0x20 ^ this.zzc))) * 1000003 ^ this.zzd) * 1000003 ^ this.zze.hashCode();
    }

    @Override  // com.google.android.play.core.install.InstallState
    public final int installErrorCode() {
        return this.zzd;
    }

    @Override  // com.google.android.play.core.install.InstallState
    public final int installStatus() {
        return this.zza;
    }

    @Override  // com.google.android.play.core.install.InstallState
    public final String packageName() {
        return this.zze;
    }

    @Override
    public final String toString() {
        return "InstallState{installStatus=" + this.zza + ", bytesDownloaded=" + this.zzb + ", totalBytesToDownload=" + this.zzc + ", installErrorCode=" + this.zzd + ", packageName=" + this.zze + "}";
    }

    @Override  // com.google.android.play.core.install.InstallState
    public final long totalBytesToDownload() {
        return this.zzc;
    }
}

