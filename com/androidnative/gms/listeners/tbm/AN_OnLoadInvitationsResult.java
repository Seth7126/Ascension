package com.androidnative.gms.listeners.tbm;

import android.util.Log;
import com.androidnative.gms.core.GameInvitationManager;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.InvitationBuffer;
import com.google.android.gms.games.multiplayer.Invitations.LoadInvitationsResult;
import com.unity3d.player.UnityPlayer;

public class AN_OnLoadInvitationsResult implements ResultCallback {
    private final String TAG;

    public AN_OnLoadInvitationsResult() {
        this.TAG = "AndroidNative";
    }

    @Override  // com.google.android.gms.common.api.ResultCallback
    public void onResult(Result result0) {
        this.onResult(((Invitations.LoadInvitationsResult)result0));
    }

    public void onResult(Invitations.LoadInvitationsResult invitations$LoadInvitationsResult0) {
        int v = invitations$LoadInvitationsResult0.getStatus().getStatusCode();
        Log.d("AndroidNative", "LoadInvitationsResult statusCode: " + v);
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(v);
        if(v == 0) {
            stringBuilder0.append("|%|");
            InvitationBuffer invitationBuffer0 = invitations$LoadInvitationsResult0.getInvitations();
            if(invitationBuffer0 != null) {
                for(Object object0: invitationBuffer0) {
                    stringBuilder0.append(GameInvitationManager.GetInviteString(((Invitation)object0)));
                    stringBuilder0.append("|%|");
                }
            }
            stringBuilder0.append("endofline");
        }
        UnityPlayer.UnitySendMessage("GooglePlayInvitationManager", "OnLoadInvitationsResult", stringBuilder0.toString());
    }
}

