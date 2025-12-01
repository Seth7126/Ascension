package com.androidnative.gms.listeners.network;

import android.util.Log;
import com.androidnative.gms.network.RealTimeMultiplayerController;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomStatusUpdateListener;
import com.unity3d.player.UnityPlayer;
import java.util.List;

public class AN_RoomStatusUpdateListener implements RoomStatusUpdateListener {
    private String PartisipantsIdsToString(List list0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        if(list0.size() > 0) {
            stringBuilder0.append(((String)list0.get(0)));
        }
        for(int v = 1; v < list0.size(); ++v) {
            stringBuilder0.append(",");
            stringBuilder0.append(((String)list0.get(v)));
        }
        return stringBuilder0.toString();
    }

    public void onConnectedToRoom(Room room0) {
        Log.d("AndroidNative", "onConnectedToRoom+");
        RealTimeMultiplayerController.GetInstance().OnRoomUpdated(room0);
        UnityPlayer.UnitySendMessage("GooglePlayRTM", "OnConnectedToRoom", "");
    }

    public void onDisconnectedFromRoom(Room room0) {
        Log.d("AndroidNative", "onDisconnectedFromRoom+");
        RealTimeMultiplayerController.GetInstance().OnRoomUpdated(room0);
        UnityPlayer.UnitySendMessage("GooglePlayRTM", "OnDisconnectedFromRoom", "");
    }

    public void onP2PConnected(String s) {
        Log.d("AndroidNative", "onP2PConnected+");
        UnityPlayer.UnitySendMessage("GooglePlayRTM", "OnP2PConnected", s);
    }

    public void onP2PDisconnected(String s) {
        Log.d("AndroidNative", "onP2PDisconnected+");
        UnityPlayer.UnitySendMessage("GooglePlayRTM", "OnP2PDisconnected", s);
    }

    public void onPeerDeclined(Room room0, List list0) {
        Log.d("AndroidNative", "onPeerDeclined+");
        RealTimeMultiplayerController.GetInstance().OnRoomUpdated(room0);
        UnityPlayer.UnitySendMessage("GooglePlayRTM", "OnPeerDeclined", this.PartisipantsIdsToString(list0));
    }

    public void onPeerInvitedToRoom(Room room0, List list0) {
        Log.d("AndroidNative", "onPeerInvitedToRoom+");
        RealTimeMultiplayerController.GetInstance().OnRoomUpdated(room0);
        UnityPlayer.UnitySendMessage("GooglePlayRTM", "OnPeerInvitedToRoom", this.PartisipantsIdsToString(list0));
    }

    public void onPeerJoined(Room room0, List list0) {
        Log.d("AndroidNative", "onPeerJoined+");
        RealTimeMultiplayerController.GetInstance().OnRoomUpdated(room0);
        UnityPlayer.UnitySendMessage("GooglePlayRTM", "OnPeerJoined", this.PartisipantsIdsToString(list0));
    }

    public void onPeerLeft(Room room0, List list0) {
        Log.d("AndroidNative", "onPeerLeft+");
        RealTimeMultiplayerController.GetInstance().OnRoomUpdated(room0);
        UnityPlayer.UnitySendMessage("GooglePlayRTM", "OnPeerLeft", this.PartisipantsIdsToString(list0));
    }

    public void onPeersConnected(Room room0, List list0) {
        Log.d("AndroidNative", "onPeersConnected+");
        RealTimeMultiplayerController.GetInstance().OnRoomUpdated(room0);
        UnityPlayer.UnitySendMessage("GooglePlayRTM", "OnPeersConnected", this.PartisipantsIdsToString(list0));
    }

    public void onPeersDisconnected(Room room0, List list0) {
        Log.d("AndroidNative", "onPeersDisconnected+");
        RealTimeMultiplayerController.GetInstance().OnRoomUpdated(room0);
        UnityPlayer.UnitySendMessage("GooglePlayRTM", "OnPeersDisconnected", this.PartisipantsIdsToString(list0));
    }

    public void onRoomAutoMatching(Room room0) {
        Log.d("AndroidNative", "onRoomAutoMatching+");
        RealTimeMultiplayerController.GetInstance().OnRoomUpdated(room0);
        UnityPlayer.UnitySendMessage("GooglePlayRTM", "OnRoomAutoMatching", "");
    }

    public void onRoomConnecting(Room room0) {
        Log.d("AndroidNative", "onRoomConnecting+");
        RealTimeMultiplayerController.GetInstance().OnRoomUpdated(room0);
        UnityPlayer.UnitySendMessage("GooglePlayRTM", "OnRoomConnecting", "");
    }
}

