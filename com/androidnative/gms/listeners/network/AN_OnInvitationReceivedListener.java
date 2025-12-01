package com.androidnative.gms.listeners.network;

import android.util.Log;
import com.androidnative.gms.core.GameInvitationManager;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.OnInvitationReceivedListener;
import com.unity3d.player.UnityPlayer;

public class AN_OnInvitationReceivedListener implements OnInvitationReceivedListener {
    public void onInvitationReceived(Invitation invitation0) {
        Log.d("AndroidNative", "onInvitationReceived+");
        UnityPlayer.UnitySendMessage("GooglePlayInvitationManager", "OnInvitationReceived", GameInvitationManager.GetInviteString(invitation0));
    }

    public void onInvitationRemoved(String s) {
        Log.d("AndroidNative", "onInvitationRemoved- " + s);
        UnityPlayer.UnitySendMessage("GooglePlayInvitationManager", "OnInvitationRemoved", s);
    }
}

