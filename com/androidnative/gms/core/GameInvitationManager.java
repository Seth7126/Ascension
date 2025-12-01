package com.androidnative.gms.core;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.androidnative.gms.listeners.network.AN_OnInvitationReceivedListener;
import com.androidnative.gms.listeners.tbm.AN_OnLoadInvitationsResult;
import com.androidnative.gms.network.TurnBasedMultiplayerController;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch;
import com.unity3d.player.UnityPlayer;

public class GameInvitationManager {
    private static GameInvitationManager _instance;

    static {
    }

    public static GameInvitationManager GetInstance() {
        if(GameInvitationManager._instance == null) {
            GameInvitationManager._instance = new GameInvitationManager();
        }
        return GameInvitationManager._instance;
    }

    public static String GetInviteString(Invitation invitation0) {
        return invitation0.getInvitationId() + "|" + invitation0.getCreationTimestamp() + "|" + invitation0.getInvitationType() + "|" + invitation0.getVariant() + "|" + GameClientManager.SerializeParticipantInfo(invitation0.getInviter());
    }

    private void SendAcceptedInvite(Invitation invitation0) {
        UnityPlayer.UnitySendMessage("GooglePlayInvitationManager", "OnInvitationAccepted", GameInvitationManager.GetInviteString(invitation0));
        Log.d("AndroidNative", "inv sent");
    }

    private void SendInitiatedMatch(TurnBasedMatch turnBasedMatch0) {
        Log.d("AndroidNative", "We got invitation for Turn-Based Match. So, start match with accepted invitation");
        UnityPlayer.UnitySendMessage("GooglePlayTBM", "OnMatchInitiatedCallback", "0|" + TurnBasedMultiplayerController.GetMatchString(turnBasedMatch0));
    }

    private void handleInvitationInboxResult(int v, Intent intent0) {
        Log.d("AndroidNative", "GameInvitationManager::handleInvitationInboxResult. Response code: " + v);
        if(intent0 != null) {
            Invitation invitation0 = (Invitation)intent0.getExtras().getParcelable("invitation");
            if(invitation0 != null) {
                Log.d("AndroidNative", "GameInvitationManager has Multiplayer.EXTRA_INVITATION");
                this.SendAcceptedInvite(invitation0);
                return;
            }
            TurnBasedMatch turnBasedMatch0 = (TurnBasedMatch)intent0.getExtras().getParcelable("turn_based_match");
            if(turnBasedMatch0 != null) {
                this.SendInitiatedMatch(turnBasedMatch0);
            }
        }
        UnityPlayer.UnitySendMessage("GooglePlayInvitationManager", "OnInvitationBoxUiClosed", Integer.toString(v));
    }

    public static void loadInvitations() {
        Games.Invitations.loadInvitations(GameClientManager.API(), 0).setResultCallback(new AN_OnLoadInvitationsResult());
    }

    public void onActivityResult(int v, int v1, Intent intent0) {
        if(v == 10001 || v == 40001) {
            this.handleInvitationInboxResult(v1, intent0);
        }
    }

    public void onConnected(Bundle bundle0) {
        Log.d("AndroidNative", "GameInvitationManager onConnected");
        if(bundle0 != null) {
            Invitation invitation0 = (Invitation)bundle0.getParcelable("invitation");
            if(invitation0 != null) {
                Log.d("AndroidNative", "We got Invitation for Real-Time Match, So, send invitation for futher decisions");
                this.SendAcceptedInvite(invitation0);
                return;
            }
            TurnBasedMatch turnBasedMatch0 = (TurnBasedMatch)bundle0.getParcelable("turn_based_match");
            if(turnBasedMatch0 != null) {
                this.SendInitiatedMatch(turnBasedMatch0);
            }
        }
    }

    public static void registerInvitationListener() {
        Log.d("AndroidNative", "registerInvitationListener");
        Games.Invitations.registerInvitationListener(GameClientManager.API(), new AN_OnInvitationReceivedListener());
    }

    public static void unregisterInvitationListener() {
        Games.Invitations.unregisterInvitationListener(GameClientManager.API());
    }
}

