package com.androidnative.gms.core;

import android.content.Intent;
import android.net.Uri;
import com.androidnative.gms.listeners.appInvite.AppInviteListner;
import com.androidnative.gms.utils.PS_Utility;
import com.google.android.gms.appinvite.AppInvite;
import com.google.android.gms.appinvite.AppInviteInvitation.IntentBuilder;
import com.google.android.gms.appinvite.AppInviteInvitation;
import com.unity3d.player.UnityPlayer;
import java.util.HashMap;

public class AppInvitesController {
    public static final String INVITATION_CONTROLLER_NAME = "GP_AppInvitesController";
    public static final int REQUEST_INVITE = 0x33C8;
    private static HashMap builders;

    static {
        AppInvitesController.builders = new HashMap();
    }

    public static void createBuilder(int v, String s) {
        AppInviteInvitation.IntentBuilder appInviteInvitation$IntentBuilder0 = new AppInviteInvitation.IntentBuilder(s);
        AppInvitesController.builders.put(v, appInviteInvitation$IntentBuilder0);
    }

    public static void getInvitation(boolean z) {
        AppInvite.AppInviteApi.getInvitation(GameClientManager.API(), UnityPlayer.currentActivity, z).setResultCallback(new AppInviteListner());
    }

    public static void onActivityResult(int v, int v1, Intent intent0) {
        if(v == 0x33C8) {
            if(v1 == -1) {
                UnityPlayer.UnitySendMessage("GP_AppInvitesController", "OnInvitationDialogComplete", PS_Utility.ArrayToString(AppInviteInvitation.getInvitationIds(-1, intent0)));
                return;
            }
            UnityPlayer.UnitySendMessage("GP_AppInvitesController", "OnInvitationDialogFailed", Integer.toString(v1));
        }
    }

    public static void setAdditionalReferralParameters(int v, String s, String s1) {
        AppInviteInvitation.IntentBuilder appInviteInvitation$IntentBuilder0 = (AppInviteInvitation.IntentBuilder)AppInvitesController.builders.get(v);
        HashMap hashMap0 = new HashMap();
        String[] arr_s = s.split("\\|");
        String[] arr_s1 = s1.split("\\|");
        int v2 = 0;
        for(int v1 = 0; v1 < arr_s.length; ++v1) {
            hashMap0.put(arr_s[v1], arr_s1[v2]);
            ++v2;
        }
        appInviteInvitation$IntentBuilder0.setAdditionalReferralParameters(hashMap0);
    }

    public static void setAndroidMinimumVersionCode(int v, int v1) {
        ((AppInviteInvitation.IntentBuilder)AppInvitesController.builders.get(v)).setAndroidMinimumVersionCode(v1);
    }

    public static void setCallToActionText(int v, String s) {
        ((AppInviteInvitation.IntentBuilder)AppInvitesController.builders.get(v)).setCallToActionText(s);
    }

    public static void setDeepLink(int v, String s) {
        ((AppInviteInvitation.IntentBuilder)AppInvitesController.builders.get(v)).setDeepLink(Uri.parse(s));
    }

    public static void setGoogleAnalyticsTrackingId(int v, String s) {
        ((AppInviteInvitation.IntentBuilder)AppInvitesController.builders.get(v)).setGoogleAnalyticsTrackingId(s);
    }

    public static void setMessage(int v, String s) {
        ((AppInviteInvitation.IntentBuilder)AppInvitesController.builders.get(v)).setMessage(s);
    }

    public static void startInvitationDialog(int v) {
        GooglePlaySupportActivity.startProxyForResult(((AppInviteInvitation.IntentBuilder)AppInvitesController.builders.get(v)).build(), 0x33C8);
    }
}

