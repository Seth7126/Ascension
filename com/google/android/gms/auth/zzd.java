package com.google.android.gms.auth;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.common.BlockingServiceConnection;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import java.io.IOException;
import java.util.List;

public class zzd {
    private static final String[] ACCEPTABLE_ACCOUNT_TYPES = null;
    public static final int CHANGE_TYPE_ACCOUNT_ADDED = 1;
    public static final int CHANGE_TYPE_ACCOUNT_REMOVED = 2;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_FROM = 3;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_TO = 4;
    public static final String GOOGLE_ACCOUNT_TYPE = "com.google";
    public static final String KEY_ANDROID_PACKAGE_NAME = null;
    public static final String KEY_CALLER_UID = null;
    public static final String KEY_SUPPRESS_PROGRESS_SCREEN = "suppressProgressScreen";
    public static final String WORK_ACCOUNT_TYPE = "com.google.work";
    private static final ComponentName zzm;
    private static final Logger zzn;

    static {
        zzd.ACCEPTABLE_ACCOUNT_TYPES = new String[]{"com.google", "com.google.work", "cn.google"};
        zzd.KEY_CALLER_UID = "callerUid";
        zzd.KEY_ANDROID_PACKAGE_NAME = "androidPackageName";
        zzd.zzm = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
        zzd.zzn = new Logger("Auth", new String[]{"GoogleAuthUtil"});
    }

    public static void clearToken(Context context0, String s) throws GooglePlayServicesAvailabilityException, GoogleAuthException, IOException {
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        zzd.ensurePlayServicesAvailable(context0, 8400000);
        Bundle bundle0 = new Bundle();
        String s1 = context0.getApplicationInfo().packageName;
        bundle0.putString("clientPackageName", s1);
        if(!bundle0.containsKey("androidPackageName")) {
            bundle0.putString("androidPackageName", s1);
        }
        zzf zzf0 = new zzf(s, bundle0);
        zzd.zza(context0, zzd.zzm, zzf0);
    }

    private static void ensurePlayServicesAvailable(Context context0, int v) throws GoogleAuthException {
        try {
            GooglePlayServicesUtilLight.ensurePlayServicesAvailable(context0.getApplicationContext(), v);
        }
        catch(GooglePlayServicesRepairableException googlePlayServicesRepairableException0) {
            throw new GooglePlayServicesAvailabilityException(googlePlayServicesRepairableException0.getConnectionStatusCode(), googlePlayServicesRepairableException0.getMessage(), googlePlayServicesRepairableException0.getIntent());
        }
        catch(GooglePlayServicesNotAvailableException googlePlayServicesNotAvailableException0) {
            throw new GoogleAuthException(googlePlayServicesNotAvailableException0.getMessage());
        }
    }

    public static List getAccountChangeEvents(Context context0, int v, String s) throws GoogleAuthException, IOException {
        Preconditions.checkNotEmpty(s, "accountName must be provided");
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        zzd.ensurePlayServicesAvailable(context0, 8400000);
        zzg zzg0 = new zzg(s, v);
        return (List)zzd.zza(context0, zzd.zzm, zzg0);
    }

    public static String getAccountId(Context context0, String s) throws GoogleAuthException, IOException {
        Preconditions.checkNotEmpty(s, "accountName must be provided");
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        zzd.ensurePlayServicesAvailable(context0, 8400000);
        return zzd.getToken(context0, s, "^^_account_id_^^", new Bundle());
    }

    public static String getToken(Context context0, Account account0, String s) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        return zzd.getToken(context0, account0, s, new Bundle());
    }

    public static String getToken(Context context0, Account account0, String s, Bundle bundle0) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        zzd.zzb(account0);
        return zzd.zzb(context0, account0, s, bundle0).zzb();
    }

    @Deprecated
    public static String getToken(Context context0, String s, String s1) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        return zzd.getToken(context0, new Account(s, "com.google"), s1);
    }

    @Deprecated
    public static String getToken(Context context0, String s, String s1, Bundle bundle0) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        return zzd.getToken(context0, new Account(s, "com.google"), s1, bundle0);
    }

    @Deprecated
    public static void invalidateToken(Context context0, String s) {
        AccountManager.get(context0).invalidateAuthToken("com.google", s);
    }

    public static Bundle removeAccount(Context context0, Account account0) throws GoogleAuthException, IOException {
        Preconditions.checkNotNull(context0);
        zzd.zzb(account0);
        zzd.ensurePlayServicesAvailable(context0, 8400000);
        zzh zzh0 = new zzh(account0);
        return (Bundle)zzd.zza(context0, zzd.zzm, zzh0);
    }

    public static Boolean requestGoogleAccountsAccess(Context context0) throws GoogleAuthException, IOException {
        Preconditions.checkNotNull(context0);
        zzd.ensurePlayServicesAvailable(context0, 11400000);
        zzi zzi0 = new zzi(context0.getApplicationInfo().packageName);
        return (Boolean)zzd.zza(context0, zzd.zzm, zzi0);
    }

    private static Object zza(Context context0, ComponentName componentName0, zzj zzj0) throws IOException, GoogleAuthException {
        BlockingServiceConnection blockingServiceConnection0 = new BlockingServiceConnection();
        GmsClientSupervisor gmsClientSupervisor0 = GmsClientSupervisor.getInstance(context0);
        if(gmsClientSupervisor0.bindService(componentName0, blockingServiceConnection0, "GoogleAuthUtil")) {
            try {
                return zzj0.zzb(blockingServiceConnection0.getService());
            }
            catch(RemoteException | InterruptedException remoteException0) {
                zzd.zzn.i("GoogleAuthUtil", new Object[]{"Error on service connection.", remoteException0});
                throw new IOException("Error on service connection.", remoteException0);
            }
            finally {
                gmsClientSupervisor0.unbindService(componentName0, blockingServiceConnection0, "GoogleAuthUtil");
            }
        }
        throw new IOException("Could not bind to service.");
    }

    private static Object zza(Object object0) throws IOException {
        if(object0 != null) {
            return object0;
        }
        zzd.zzn.w("GoogleAuthUtil", new Object[]{"Binder call returned null."});
        throw new IOException("Service unavailable.");
    }

    public static TokenData zzb(Context context0, Account account0, String s, Bundle bundle0) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        Preconditions.checkNotEmpty(s, "Scope cannot be empty or null.");
        zzd.zzb(account0);
        zzd.ensurePlayServicesAvailable(context0, 8400000);
        Bundle bundle1 = bundle0 == null ? new Bundle() : new Bundle(bundle0);
        String s1 = context0.getApplicationInfo().packageName;
        bundle1.putString("clientPackageName", s1);
        if(TextUtils.isEmpty(bundle1.getString("androidPackageName"))) {
            bundle1.putString("androidPackageName", s1);
        }
        bundle1.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
        zze zze0 = new zze(account0, s, bundle1);
        return (TokenData)zzd.zza(context0, zzd.zzm, zze0);
    }

    private static void zzb(Account account0) {
        if(account0 == null) {
            throw new IllegalArgumentException("Account cannot be null");
        }
        if(TextUtils.isEmpty(account0.name)) {
            throw new IllegalArgumentException("Account name cannot be empty!");
        }
        String[] arr_s = zzd.ACCEPTABLE_ACCOUNT_TYPES;
        for(int v = 0; v < arr_s.length; ++v) {
            if(arr_s[v].equals(account0.type)) {
                return;
            }
        }
        throw new IllegalArgumentException("Account type not supported");
    }
}

