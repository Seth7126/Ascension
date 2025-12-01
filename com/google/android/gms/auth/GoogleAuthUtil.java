package com.google.android.gms.auth;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public final class GoogleAuthUtil extends zzd {
    public static final int CHANGE_TYPE_ACCOUNT_ADDED = 1;
    public static final int CHANGE_TYPE_ACCOUNT_REMOVED = 2;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_FROM = 3;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_TO = 4;
    public static final String GOOGLE_ACCOUNT_TYPE = "com.google";
    private static final String KEY_ANDROID_PACKAGE_NAME = null;
    private static final String KEY_CALLER_UID = null;
    public static final String KEY_SUPPRESS_PROGRESS_SCREEN = "suppressProgressScreen";
    public static final String WORK_ACCOUNT_TYPE = "com.google.work";

    static {
        GoogleAuthUtil.KEY_CALLER_UID = "callerUid";
        GoogleAuthUtil.KEY_ANDROID_PACKAGE_NAME = "androidPackageName";
    }

    @Override  // com.google.android.gms.auth.zzd
    public static void clearToken(Context context0, String s) throws GooglePlayServicesAvailabilityException, GoogleAuthException, IOException {
        zzd.clearToken(context0, s);
    }

    @Override  // com.google.android.gms.auth.zzd
    public static List getAccountChangeEvents(Context context0, int v, String s) throws GoogleAuthException, IOException {
        return zzd.getAccountChangeEvents(context0, v, s);
    }

    @Override  // com.google.android.gms.auth.zzd
    public static String getAccountId(Context context0, String s) throws GoogleAuthException, IOException {
        return zzd.getAccountId(context0, s);
    }

    @Override  // com.google.android.gms.auth.zzd
    public static String getToken(Context context0, Account account0, String s) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        return zzd.getToken(context0, account0, s);
    }

    @Override  // com.google.android.gms.auth.zzd
    public static String getToken(Context context0, Account account0, String s, Bundle bundle0) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        return zzd.getToken(context0, account0, s, bundle0);
    }

    @Override  // com.google.android.gms.auth.zzd
    @Deprecated
    public static String getToken(Context context0, String s, String s1) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        return zzd.getToken(context0, s, s1);
    }

    @Override  // com.google.android.gms.auth.zzd
    @Deprecated
    public static String getToken(Context context0, String s, String s1, Bundle bundle0) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        return zzd.getToken(context0, s, s1, bundle0);
    }

    public static String getTokenWithNotification(Context context0, Account account0, String s, Bundle bundle0) throws IOException, UserRecoverableNotifiedException, GoogleAuthException {
        if(bundle0 == null) {
            bundle0 = new Bundle();
        }
        bundle0.putBoolean("handle_notification", true);
        return GoogleAuthUtil.zza(context0, account0, s, bundle0).zzb();
    }

    public static String getTokenWithNotification(Context context0, Account account0, String s, Bundle bundle0, Intent intent0) throws IOException, UserRecoverableNotifiedException, GoogleAuthException {
        if(intent0 == null) {
            throw new IllegalArgumentException("Callback cannot be null.");
        }
        String s1 = intent0.toUri(1);
        try {
            Intent.parseUri(s1, 1);
        }
        catch(URISyntaxException unused_ex) {
            throw new IllegalArgumentException("Parameter callback contains invalid data. It must be serializable using toUri() and parseUri().");
        }
        if(bundle0 == null) {
            bundle0 = new Bundle();
        }
        bundle0.putParcelable("callback_intent", intent0);
        bundle0.putBoolean("handle_notification", true);
        return GoogleAuthUtil.zza(context0, account0, s, bundle0).zzb();
    }

    public static String getTokenWithNotification(Context context0, Account account0, String s, Bundle bundle0, String s1, Bundle bundle1) throws IOException, UserRecoverableNotifiedException, GoogleAuthException {
        Preconditions.checkNotEmpty(s1, "Authority cannot be empty or null.");
        if(bundle0 == null) {
            bundle0 = new Bundle();
        }
        if(bundle1 == null) {
            bundle1 = new Bundle();
        }
        ContentResolver.validateSyncExtrasBundle(bundle1);
        bundle0.putString("authority", s1);
        bundle0.putBundle("sync_extras", bundle1);
        bundle0.putBoolean("handle_notification", true);
        return GoogleAuthUtil.zza(context0, account0, s, bundle0).zzb();
    }

    @Deprecated
    public static String getTokenWithNotification(Context context0, String s, String s1, Bundle bundle0) throws IOException, UserRecoverableNotifiedException, GoogleAuthException {
        return GoogleAuthUtil.getTokenWithNotification(context0, new Account(s, "com.google"), s1, bundle0);
    }

    @Deprecated
    public static String getTokenWithNotification(Context context0, String s, String s1, Bundle bundle0, Intent intent0) throws IOException, UserRecoverableNotifiedException, GoogleAuthException {
        return GoogleAuthUtil.getTokenWithNotification(context0, new Account(s, "com.google"), s1, bundle0, intent0);
    }

    @Deprecated
    public static String getTokenWithNotification(Context context0, String s, String s1, Bundle bundle0, String s2, Bundle bundle1) throws IOException, UserRecoverableNotifiedException, GoogleAuthException {
        return GoogleAuthUtil.getTokenWithNotification(context0, new Account(s, "com.google"), s1, bundle0, s2, bundle1);
    }

    @Override  // com.google.android.gms.auth.zzd
    @Deprecated
    public static void invalidateToken(Context context0, String s) {
        zzd.invalidateToken(context0, s);
    }

    @Override  // com.google.android.gms.auth.zzd
    public static Bundle removeAccount(Context context0, Account account0) throws GoogleAuthException, IOException {
        return zzd.removeAccount(context0, account0);
    }

    @Override  // com.google.android.gms.auth.zzd
    public static Boolean requestGoogleAccountsAccess(Context context0) throws GoogleAuthException, IOException {
        return zzd.requestGoogleAccountsAccess(context0);
    }

    private static TokenData zza(Context context0, Account account0, String s, Bundle bundle0) throws IOException, GoogleAuthException {
        if(bundle0 == null) {
            bundle0 = new Bundle();
        }
        try {
            TokenData tokenData0 = zzd.zzb(context0, account0, s, bundle0);
            GooglePlayServicesUtil.cancelAvailabilityErrorNotifications(context0);
            return tokenData0;
        }
        catch(GooglePlayServicesAvailabilityException googlePlayServicesAvailabilityException0) {
            GooglePlayServicesUtil.showErrorNotification(googlePlayServicesAvailabilityException0.getConnectionStatusCode(), context0);
            Log.w("GoogleAuthUtil", "Error when getting token", googlePlayServicesAvailabilityException0);
            throw new UserRecoverableNotifiedException("User intervention required. Notification has been pushed.");
        }
        catch(UserRecoverableAuthException userRecoverableAuthException0) {
            GooglePlayServicesUtil.cancelAvailabilityErrorNotifications(context0);
            Log.w("GoogleAuthUtil", "Error when getting token", userRecoverableAuthException0);
            throw new UserRecoverableNotifiedException("User intervention required. Notification has been pushed.");
        }
    }
}

