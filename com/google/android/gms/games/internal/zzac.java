package com.google.android.gms.games.internal;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity;

public interface zzac extends IInterface {
    Bundle getConnectionHint() throws RemoteException;

    Intent zza(PlayerEntity arg1) throws RemoteException;

    Intent zza(String arg1, String arg2, String arg3) throws RemoteException;

    Intent zza(String arg1, boolean arg2, boolean arg3, int arg4) throws RemoteException;

    void zza(long arg1) throws RemoteException;

    void zza(IBinder arg1, Bundle arg2) throws RemoteException;

    void zza(Contents arg1) throws RemoteException;

    void zza(zzaa arg1, long arg2) throws RemoteException;

    void zza(zzy arg1) throws RemoteException;

    void zza(zzy arg1, int arg2) throws RemoteException;

    void zza(zzy arg1, int arg2, boolean arg3, boolean arg4) throws RemoteException;

    void zza(zzy arg1, long arg2) throws RemoteException;

    void zza(zzy arg1, Bundle arg2, int arg3, int arg4) throws RemoteException;

    void zza(zzy arg1, String arg2) throws RemoteException;

    void zza(zzy arg1, String arg2, int arg3, int arg4, int arg5, boolean arg6) throws RemoteException;

    void zza(zzy arg1, String arg2, int arg3, IBinder arg4, Bundle arg5) throws RemoteException;

    void zza(zzy arg1, String arg2, int arg3, boolean arg4, boolean arg5) throws RemoteException;

    void zza(zzy arg1, String arg2, long arg3, String arg4) throws RemoteException;

    void zza(zzy arg1, String arg2, IBinder arg3, Bundle arg4) throws RemoteException;

    void zza(zzy arg1, String arg2, SnapshotMetadataChangeEntity arg3, Contents arg4) throws RemoteException;

    void zza(zzy arg1, String arg2, String arg3, int arg4, int arg5) throws RemoteException;

    void zza(zzy arg1, String arg2, String arg3, SnapshotMetadataChangeEntity arg4, Contents arg5) throws RemoteException;

    void zza(zzy arg1, String arg2, boolean arg3) throws RemoteException;

    void zza(zzy arg1, String arg2, boolean arg3, int arg4) throws RemoteException;

    void zza(zzy arg1, boolean arg2) throws RemoteException;

    void zza(zzy arg1, boolean arg2, String[] arg3) throws RemoteException;

    String zzai() throws RemoteException;

    Intent zzao() throws RemoteException;

    Intent zzaq() throws RemoteException;

    Intent zzar() throws RemoteException;

    int zzat() throws RemoteException;

    int zzav() throws RemoteException;

    boolean zzaz() throws RemoteException;

    Intent zzb(String arg1, int arg2, int arg3) throws RemoteException;

    void zzb(long arg1) throws RemoteException;

    void zzb(zzy arg1) throws RemoteException;

    void zzb(zzy arg1, String arg2, int arg3, int arg4, int arg5, boolean arg6) throws RemoteException;

    void zzb(zzy arg1, String arg2, int arg3, IBinder arg4, Bundle arg5) throws RemoteException;

    void zzb(zzy arg1, String arg2, IBinder arg3, Bundle arg4) throws RemoteException;

    void zzb(zzy arg1, String arg2, boolean arg3) throws RemoteException;

    void zzb(zzy arg1, boolean arg2) throws RemoteException;

    void zzb(String arg1, int arg2) throws RemoteException;

    void zzbd() throws RemoteException;

    String zzbe() throws RemoteException;

    String zzbf() throws RemoteException;

    DataHolder zzbg() throws RemoteException;

    DataHolder zzbh() throws RemoteException;

    Intent zzbi() throws RemoteException;

    Intent zzbj() throws RemoteException;

    PendingIntent zzbk() throws RemoteException;

    void zzc(zzy arg1) throws RemoteException;

    void zzc(zzy arg1, boolean arg2) throws RemoteException;

    void zzd(zzy arg1) throws RemoteException;

    void zzd(zzy arg1, boolean arg2) throws RemoteException;

    void zze(zzy arg1, boolean arg2) throws RemoteException;

    void zzf(zzy arg1, boolean arg2) throws RemoteException;
}

