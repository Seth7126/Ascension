package com.androidnative.gms.listeners.network;

import com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer.ReliableMessageSentCallback;
import com.unity3d.player.UnityPlayer;

public class AN_ReliableMessageSentCallback implements RealTimeMultiplayer.ReliableMessageSentCallback {
    private int _DataTokenId;
    private String _RoomId;

    public AN_ReliableMessageSentCallback(String s, int v) {
        this._RoomId = s;
        this._DataTokenId = v;
    }

    public void onRealTimeMessageSent(int v, int v1, String s) {
        UnityPlayer.UnitySendMessage("GooglePlayRTM", "OnReliableMessageDelivered", Integer.toString(v) + "|" + this._RoomId + "|" + Integer.toString(v1) + "|" + Integer.toString(this._DataTokenId));
    }
}

