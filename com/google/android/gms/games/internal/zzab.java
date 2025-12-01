package com.google.android.gms.games.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.multiplayer.realtime.zzb;
import com.google.android.gms.games.video.VideoCapabilities;
import com.google.android.gms.internal.games.zza;
import com.google.android.gms.internal.games.zzd;

public abstract class zzab extends zza implements zzy {
    public zzab() {
        super("com.google.android.gms.games.internal.IGamesCallbacks");
    }

    @Override  // com.google.android.gms.internal.games.zza
    protected final boolean zza(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        switch(v) {
            case 5001: {
                this.zza(parcel0.readInt(), parcel0.readString());
                break;
            }
            case 5002: {
                this.zza(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)));
                break;
            }
            case 5003: {
                this.zzb(parcel0.readInt(), parcel0.readString());
                break;
            }
            case 5004: {
                this.zzc(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)));
                break;
            }
            case 5005: {
                this.zza(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)), ((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)));
                break;
            }
            case 5006: {
                this.zzd(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)));
                break;
            }
            case 5007: {
                this.zze(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)));
                break;
            }
            case 5008: {
                this.zzf(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)));
                break;
            }
            case 5009: {
                this.zzg(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)));
                break;
            }
            case 5010: {
                this.zzh(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)));
                break;
            }
            case 5011: {
                this.zzi(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)));
                break;
            }
            case 5016: {
                this.onSignOutComplete();
                break;
            }
            case 5017: {
                this.zzk(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)));
                break;
            }
            case 5018: {
                this.zzs(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)));
                break;
            }
            case 5019: {
                this.zzt(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)));
                break;
            }
            case 5020: {
                this.zzd(parcel0.readInt(), parcel0.readString());
                break;
            }
            case 5021: {
                this.zzu(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)));
                break;
            }
            case 5022: {
                this.zzv(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)));
                break;
            }
            case 5023: {
                this.zzw(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)));
                break;
            }
            case 5024: {
                this.zzx(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)));
                break;
            }
            case 5025: {
                this.zzy(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)));
                break;
            }
            case 5026: {
                this.zza(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)), parcel0.createStringArray());
                break;
            }
            case 5027: {
                this.zzb(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)), parcel0.createStringArray());
                break;
            }
            case 5028: {
                this.zzc(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)), parcel0.createStringArray());
                break;
            }
            case 5029: {
                this.zzd(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)), parcel0.createStringArray());
                break;
            }
            case 5030: {
                this.zze(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)), parcel0.createStringArray());
                break;
            }
            case 5031: {
                this.zzf(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)), parcel0.createStringArray());
                break;
            }
            case 5032: {
                this.zza(((zzb)zzd.zza(parcel0, zzb.CREATOR)));
                break;
            }
            case 5033: {
                this.zza(parcel0.readInt(), parcel0.readInt(), parcel0.readString());
                break;
            }
            case 5034: {
                this.zza(parcel0.readInt(), parcel0.readString(), zzd.zza(parcel0));
                break;
            }
            case 5035: {
                this.zzaa(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)));
                break;
            }
            case 5036: {
                this.zzb(parcel0.readInt());
                break;
            }
            case 5037: {
                this.zzl(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)));
                break;
            }
            case 5038: {
                this.zzz(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)));
                break;
            }
            case 5039: {
                this.zzab(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)));
                break;
            }
            case 5040: {
                this.zzc(parcel0.readInt());
                break;
            }
            case 6001: {
                this.zze(parcel0.readString());
                break;
            }
            case 6002: {
                this.zzf(parcel0.readString());
                break;
            }
            case 8001: {
                this.zzac(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)));
                break;
            }
            case 8002: {
                this.zza(parcel0.readInt(), ((Bundle)zzd.zza(parcel0, Bundle.CREATOR)));
                break;
            }
            case 8003: {
                this.zzn(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)));
                break;
            }
            case 8004: {
                this.zzo(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)));
                break;
            }
            case 8005: {
                this.zzp(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)));
                break;
            }
            case 8006: {
                this.zzq(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)));
                break;
            }
            case 8007: {
                this.zzc(parcel0.readInt(), parcel0.readString());
                break;
            }
            case 8008: {
                this.zzr(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)));
                break;
            }
            case 8009: {
                this.zzd(parcel0.readString());
                break;
            }
            case 8010: {
                this.zzb(parcel0.readString());
                break;
            }
            case 9001: {
                this.zzj(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)));
                break;
            }
            case 10001: {
                this.zzm(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)));
                break;
            }
            case 10002: {
                this.zzc(parcel0.readString());
                break;
            }
            case 10003: {
                this.zzad(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)));
                break;
            }
            case 10004: {
                this.zzae(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)));
                break;
            }
            case 10005: {
                this.zzb(parcel0.readInt(), ((Bundle)zzd.zza(parcel0, Bundle.CREATOR)));
                break;
            }
            case 10006: {
                this.zzaf(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)));
                break;
            }
            case 11001: {
                this.zzc(parcel0.readInt(), ((Bundle)zzd.zza(parcel0, Bundle.CREATOR)));
                break;
            }
            case 12001: {
                this.zzag(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)));
                break;
            }
            case 12004: {
                this.zza(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)), ((Contents)zzd.zza(parcel0, Contents.CREATOR)));
                break;
            }
            case 12005: {
                this.zzah(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)));
                break;
            }
            case 12006: {
                this.zzai(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)));
                break;
            }
            case 12007: {
                this.zzaj(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)));
                break;
            }
            case 12008: {
                this.zzam(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)));
                break;
            }
            case 12011: {
                this.zzb(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)));
                break;
            }
            case 12012: {
                this.zze(parcel0.readInt(), parcel0.readString());
                break;
            }
            case 12014: {
                this.zzak(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)));
                break;
            }
            case 0x2EEF: {
                this.zzd(parcel0.readInt(), ((Bundle)zzd.zza(parcel0, Bundle.CREATOR)));
                break;
            }
            case 0x2EF0: {
                this.zzal(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)));
                break;
            }
            case 0x2EF1: {
                this.zza(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)), parcel0.readString(), ((Contents)zzd.zza(parcel0, Contents.CREATOR)), ((Contents)zzd.zza(parcel0, Contents.CREATOR)), ((Contents)zzd.zza(parcel0, Contents.CREATOR)));
                break;
            }
            case 13001: {
                this.zzan(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)));
                break;
            }
            case 13002: {
                this.zzd(parcel0.readInt());
                break;
            }
            case 14001: {
                this.zza(((DataHolder[])parcel0.createTypedArray(DataHolder.CREATOR)));
                break;
            }
            case 15001: {
                this.zzao(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)));
                break;
            }
            case 17002: {
                this.zze(parcel0.readInt());
                break;
            }
            case 19001: {
                this.zza(parcel0.readInt(), ((VideoCapabilities)zzd.zza(parcel0, VideoCapabilities.CREATOR)));
                break;
            }
            case 19002: {
                this.zza(parcel0.readInt(), zzd.zza(parcel0));
                break;
            }
            case 19008: {
                this.zzf(parcel0.readInt());
                break;
            }
            case 19009: {
                this.zzg(parcel0.readInt());
                break;
            }
            case 19010: {
                this.zzh(parcel0.readInt());
                break;
            }
            case 20001: {
                this.zzap(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)));
                break;
            }
            case 20002: {
                this.zzaq(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)));
                break;
            }
            case 20003: {
                this.zzar(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)));
                break;
            }
            case 20004: {
                this.zzas(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)));
                break;
            }
            case 20005: {
                this.zzat(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)));
                break;
            }
            case 20006: {
                this.zzau(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)));
                break;
            }
            case 20007: {
                this.zzav(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)));
                break;
            }
            case 20008: {
                this.zzaw(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)));
                break;
            }
            case 20009: {
                this.zzax(((DataHolder)zzd.zza(parcel0, DataHolder.CREATOR)));
                break;
            }
            case 20012: {
                this.zzb(((Status)zzd.zza(parcel0, Status.CREATOR)));
                break;
            }
            case 20019: {
                this.onCaptureOverlayStateChanged(parcel0.readInt());
                break;
            }
            case 20020: {
                this.zze(parcel0.readInt(), ((Bundle)zzd.zza(parcel0, Bundle.CREATOR)));
                break;
            }
            case 23001: {
                this.zzm(parcel0.readInt());
                break;
            }
            case 23002: {
                this.zzi(parcel0.readInt());
                break;
            }
            case 23003: {
                this.zzj(parcel0.readInt());
                break;
            }
            case 23004: {
                this.zzk(parcel0.readInt());
                break;
            }
            case 23005: {
                this.zzl(parcel0.readInt());
                break;
            }
            case 24002: {
                this.zza(zzd.zza(parcel0));
                break;
            }
            case 25002: {
                this.zzg(parcel0.readString());
                break;
            }
            case 25003: {
                this.zza(((Status)zzd.zza(parcel0, Status.CREATOR)), parcel0.readString());
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }
}

