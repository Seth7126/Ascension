package com.androidnative.gms.listeners.appInvite;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.appinvite.AppInviteInvitationResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.unity3d.player.UnityPlayer;

public class AppInviteListner implements ResultCallback {
    public void onResult(AppInviteInvitationResult appInviteInvitationResult0) {
        Log.d("AndroidNative", "AppInviteListner result status: " + appInviteInvitationResult0.getStatus());
        if(appInviteInvitationResult0.getStatus().isSuccess()) {
            Bundle bundle0 = appInviteInvitationResult0.getInvitationIntent().getExtras().getBundle("com.google.android.gms.appinvite.REFERRAL_BUNDLE");
            if(bundle0 != null) {
                UnityPlayer.UnitySendMessage("GP_AppInvitesController", "OnInvitationLoaded", bundle0.getString("com.google.android.gms.appinvite.DEEP_LINK", "") + "|" + bundle0.getString("com.google.android.gms.appinvite.INVITATION_ID", "") + "|" + Boolean.valueOf(bundle0.getBoolean("com.google.android.gms.appinvite.OPENED_FROM_PLAY_STORE", false)));
                return;
            }
            UnityPlayer.UnitySendMessage("GP_AppInvitesController", "OnInvitationLoadFailed", "1");
            return;
        }
        UnityPlayer.UnitySendMessage("GP_AppInvitesController", "OnInvitationLoadFailed", Integer.toString(appInviteInvitationResult0.getStatus().getStatusCode()));
        Log.d("AndroidNative", "No Inivitations");
    }

    @Override  // com.google.android.gms.common.api.ResultCallback
    public void onResult(Result result0) {
        this.onResult(((AppInviteInvitationResult)result0));
    }
}

