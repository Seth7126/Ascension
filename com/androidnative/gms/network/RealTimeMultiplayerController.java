package com.androidnative.gms.network;

import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import com.androidnative.gms.core.GameClientManager;
import com.androidnative.gms.core.GooglePlaySupportActivity;
import com.androidnative.gms.core.NewGameHelper;
import com.androidnative.gms.listeners.network.AN_RealTimeMessageReceivedListener;
import com.androidnative.gms.listeners.network.AN_ReliableMessageSentCallback;
import com.androidnative.gms.listeners.network.AN_RoomStatusUpdateListener;
import com.androidnative.gms.listeners.network.AN_RoomUpdateListener;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomConfig.Builder;
import com.google.android.gms.games.multiplayer.realtime.RoomConfig;
import com.unity3d.player.UnityPlayer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class RealTimeMultiplayerController {
    private static int ExclusiveBitMask = 0;
    private static int MatchVeriant = -1;
    private static RealTimeMultiplayerController _instance;
    private boolean _isRealTimeActive;
    public Room currentRoom;
    protected NewGameHelper mHelper;

    static {
    }

    public RealTimeMultiplayerController() {
        this._isRealTimeActive = false;
    }

    public void DeclineInvitation(String s) {
        Games.RealTimeMultiplayer.declineInvitation(GameClientManager.API(), s);
    }

    public void DismissInvitation(String s) {
        Games.TurnBasedMultiplayer.dismissInvitation(GameClientManager.API(), s);
    }

    public static RealTimeMultiplayerController GetInstance() {
        if(RealTimeMultiplayerController._instance == null) {
            RealTimeMultiplayerController._instance = new RealTimeMultiplayerController();
        }
        return RealTimeMultiplayerController._instance;
    }

    public void OnRoomUpdated(Room room0) {
        Log.d("AndroidNative", "OnRoomUpdated total players:" + room0.getParticipantIds().size());
        this.currentRoom = room0;
        this._isRealTimeActive = true;
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(room0.getRoomId());
        stringBuilder0.append("|");
        stringBuilder0.append(room0.getCreatorId());
        stringBuilder0.append("|");
        for(Object object0: room0.getParticipants()) {
            stringBuilder0.append(((Participant)object0).getParticipantId());
            stringBuilder0.append(",");
            Player player0 = ((Participant)object0).getPlayer();
            if(player0 == null) {
                stringBuilder0.append("-1,");
            }
            else {
                stringBuilder0.append(player0.getPlayerId());
                stringBuilder0.append(",");
                GameClientManager.GetInstance().loadPlayerInfo(player0.getPlayerId());
            }
            stringBuilder0.append(String.valueOf(((Participant)object0).getStatus()));
            stringBuilder0.append(",");
            stringBuilder0.append(((Participant)object0).getHiResImageUrl());
            stringBuilder0.append(",");
            stringBuilder0.append(((Participant)object0).getIconImageUrl());
            stringBuilder0.append(",");
            stringBuilder0.append(((Participant)object0).getDisplayName());
            stringBuilder0.append(",");
        }
        stringBuilder0.append("endofline|");
        stringBuilder0.append(room0.getStatus());
        stringBuilder0.append("|");
        stringBuilder0.append(room0.getCreationTimestamp());
        stringBuilder0.append("|");
        UnityPlayer.UnitySendMessage("GooglePlayRTM", "OnRoomUpdate", stringBuilder0.toString());
    }

    public void OnStop() {
    }

    public void SetExclusiveBitMask(int v) {
        RealTimeMultiplayerController.ExclusiveBitMask = v;
    }

    public void SetGameHelper(NewGameHelper newGameHelper0) {
        this.mHelper = newGameHelper0;
    }

    public void SetVariant(int v) {
        RealTimeMultiplayerController.MatchVeriant = v;
    }

    public void acceptInviteToRoom(String s) {
        Log.d("AndroidNative", "acceptInviteToRoom+");
        RoomConfig.Builder roomConfig$Builder0 = this.makeBasicRoomConfigBuilder();
        roomConfig$Builder0.setInvitationIdToAccept(s);
        Games.RealTimeMultiplayer.join(this.mHelper.getGoogleApiClient(), roomConfig$Builder0.build());
    }

    public void findMatch(int v, int v1, String[] arr_s) {
        Log.d("AndroidNative", "GAME_CLIENT_MANAGER findMatch!!!");
        Bundle bundle0 = RoomConfig.createAutoMatchCriteria(v, v1, ((long)RealTimeMultiplayerController.ExclusiveBitMask));
        RoomConfig.Builder roomConfig$Builder0 = this.makeBasicRoomConfigBuilder();
        roomConfig$Builder0.setAutoMatchCriteria(bundle0);
        roomConfig$Builder0.setVariant(RealTimeMultiplayerController.MatchVeriant);
        roomConfig$Builder0.addPlayersToInvite(new ArrayList(Arrays.asList(arr_s)));
        Games.RealTimeMultiplayer.create(this.mHelper.getGoogleApiClient(), roomConfig$Builder0.build());
    }

    public void findMatch(String[] arr_s) {
        Log.d("AndroidNative", "GAME_CLIENT_MANAGER findMatch!!!");
        RoomConfig.Builder roomConfig$Builder0 = this.makeBasicRoomConfigBuilder();
        roomConfig$Builder0.setAutoMatchCriteria(null);
        roomConfig$Builder0.setVariant(RealTimeMultiplayerController.MatchVeriant);
        roomConfig$Builder0.addPlayersToInvite(new ArrayList(Arrays.asList(arr_s)));
        Games.RealTimeMultiplayer.create(this.mHelper.getGoogleApiClient(), roomConfig$Builder0.build());
    }

    private void handleSelectPlayersResult(int v, Intent intent0) {
        if(v == -1) {
            Log.d("AndroidNative", "handleSelectPlayersResult+");
            ArrayList arrayList0 = intent0.getStringArrayListExtra("players");
            Log.d("AndroidNative", "invitees: " + arrayList0.size());
            int v1 = intent0.getIntExtra("min_automatch_players", 0);
            int v2 = intent0.getIntExtra("max_automatch_players", 0);
            Bundle bundle0 = v1 > 0 || v2 > 0 ? RoomConfig.createAutoMatchCriteria(v1, v2, ((long)RealTimeMultiplayerController.ExclusiveBitMask)) : null;
            RoomConfig.Builder roomConfig$Builder0 = this.makeBasicRoomConfigBuilder();
            roomConfig$Builder0.setVariant(RealTimeMultiplayerController.MatchVeriant);
            roomConfig$Builder0.addPlayersToInvite(arrayList0);
            if(bundle0 != null) {
                roomConfig$Builder0.setAutoMatchCriteria(bundle0);
            }
            Log.d("AndroidNative", "create room");
            Games.RealTimeMultiplayer.create(this.mHelper.getGoogleApiClient(), roomConfig$Builder0.build());
        }
        UnityPlayer.UnitySendMessage("GooglePlayRTM", "OnInvitationBoxUiClosed", "10001|" + v);
    }

    public void invitePlayers(int v, int v1) {
        GooglePlaySupportActivity.startProxyForResult(Games.RealTimeMultiplayer.getSelectOpponentsIntent(this.mHelper.getGoogleApiClient(), v, v1), 10000);
    }

    public boolean isRealTimeActive() {
        return this._isRealTimeActive;
    }

    public void leaveRoom() {
        if(this.currentRoom != null) {
            Games.RealTimeMultiplayer.leave(this.mHelper.getGoogleApiClient(), new AN_RoomUpdateListener(), this.currentRoom.getRoomId());
            this.currentRoom = null;
            this._isRealTimeActive = false;
        }
    }

    private RoomConfig.Builder makeBasicRoomConfigBuilder() {
        return RoomConfig.builder(new AN_RoomUpdateListener()).setMessageReceivedListener(new AN_RealTimeMessageReceivedListener()).setRoomStatusUpdateListener(new AN_RoomStatusUpdateListener());
    }

    public void onActivityResult(int v, int v1, Intent intent0) {
        switch(v) {
            case 10000: {
                this.handleSelectPlayersResult(v1, intent0);
                return;
            }
            case 10002: {
                if(v1 != -1 && v1 != 0) {
                    if(v1 == 10005) {
                        this.leaveRoom();
                        return;
                    }
                    return;
                }
                UnityPlayer.UnitySendMessage("GooglePlayRTM", "OnWatingRoomIntentClosed", "10002|" + v1);
            }
        }
    }

    public void sendDataToAll(String s, int v, int v1) {
        this.sendMessage(Base64.decode(s, 0), this.currentRoom.getParticipants(), v, v1);
    }

    public void sendDataToPlayers(String s, String s1, int v, int v1) {
        byte[] arr_b = Base64.decode(s, 0);
        ArrayList arrayList0 = new ArrayList();
        if(s1 != null) {
            StringTokenizer stringTokenizer0 = new StringTokenizer(s1, "|");
            while(stringTokenizer0.hasMoreTokens()) {
                String s2 = stringTokenizer0.nextToken();
                for(Object object0: this.currentRoom.getParticipants()) {
                    Participant participant0 = (Participant)object0;
                    if(participant0.getParticipantId().equals(s2)) {
                        arrayList0.add(participant0);
                    }
                }
            }
        }
        this.sendMessage(arr_b, arrayList0, v, v1);
    }

    private void sendMessage(byte[] arr_b, ArrayList arrayList0, int v, int v1) {
        if(this.currentRoom == null) {
            return;
        }
        String s = Games.Players.getCurrentPlayer(this.mHelper.getGoogleApiClient()).getPlayerId();
        for(Object object0: arrayList0) {
            Participant participant0 = (Participant)object0;
            Player player0 = participant0.getPlayer();
            if(player0 != null && player0.getPlayerId().equals(s) || participant0.getStatus() != 2) {
            }
            else if(v == 0) {
                int v2 = Games.RealTimeMultiplayer.sendReliableMessage(this.mHelper.getGoogleApiClient(), new AN_ReliableMessageSentCallback(this.currentRoom.getRoomId(), v1), arr_b, this.currentRoom.getRoomId(), participant0.getParticipantId());
                UnityPlayer.UnitySendMessage("GooglePlayRTM", "OnReliableMessageSent", "0|" + this.currentRoom.getRoomId() + "|" + Integer.toString(v2) + "|" + Integer.toString(v1));
            }
            else {
                Games.RealTimeMultiplayer.sendUnreliableMessage(this.mHelper.getGoogleApiClient(), arr_b, this.currentRoom.getRoomId(), participant0.getParticipantId());
            }
        }
    }

    public void showInvitationBox() {
        GooglePlaySupportActivity.startProxyForResult(Games.Invitations.getInvitationInboxIntent(this.mHelper.getGoogleApiClient()), 10001);
    }

    public void showWaitingRoomIntent() {
        GooglePlaySupportActivity.startProxyForResult(Games.RealTimeMultiplayer.getWaitingRoomIntent(this.mHelper.getGoogleApiClient(), this.currentRoom, 0x7FFFFFFF), 10002);
    }
}

