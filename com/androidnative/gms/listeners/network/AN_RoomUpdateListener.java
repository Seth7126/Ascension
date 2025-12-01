package com.androidnative.gms.listeners.network;

import android.util.Log;
import com.androidnative.gms.network.RealTimeMultiplayerController;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomUpdateListener;
import com.unity3d.player.UnityPlayer;

public class AN_RoomUpdateListener implements RoomUpdateListener {
    public void onJoinedRoom(int v, Room room0) {
        if(v == 0) {
            RealTimeMultiplayerController.GetInstance().OnRoomUpdated(room0);
        }
        if(room0 != null) {
            Log.d("AndroidNative", "onJoinedRoom size: " + room0.getParticipants().size());
        }
        UnityPlayer.UnitySendMessage("GooglePlayRTM", "OnJoinedRoom", String.valueOf(v));
    }

    public void onLeftRoom(int v, String s) {
        Log.d("AndroidNative", "onLeftRoom");
        UnityPlayer.UnitySendMessage("GooglePlayRTM", "OnLeftRoom", v + "|" + s);
    }

    public void onRoomConnected(int v, Room room0) {
        Log.d("AndroidNative", "onRoomConnected");
        if(v == 0) {
            RealTimeMultiplayerController.GetInstance().OnRoomUpdated(room0);
        }
        UnityPlayer.UnitySendMessage("GooglePlayRTM", "OnRoomConnected", String.valueOf(v));
    }

    public void onRoomCreated(int v, Room room0) {
        Log.d("AndroidNative", "onRoomCreated: " + v);
        if(v == 0) {
            RealTimeMultiplayerController.GetInstance().OnRoomUpdated(room0);
        }
        UnityPlayer.UnitySendMessage("GooglePlayRTM", "OnRoomCreated", String.valueOf(v));
    }
}

