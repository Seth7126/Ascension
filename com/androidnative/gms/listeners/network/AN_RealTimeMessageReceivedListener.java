package com.androidnative.gms.listeners.network;

import android.util.Base64;
import android.util.Log;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessage;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessageReceivedListener;
import com.unity3d.player.UnityPlayer;

public class AN_RealTimeMessageReceivedListener implements RealTimeMessageReceivedListener {
    public void onRealTimeMessageReceived(RealTimeMessage realTimeMessage0) {
        Log.d("AndroidNative", "onRealTimeMessageReceived+");
        String s = Base64.encodeToString(realTimeMessage0.getMessageData(), 0);
        UnityPlayer.UnitySendMessage("GooglePlayRTM", "OnMatchDataRecieved", realTimeMessage0.getSenderParticipantId() + "|" + s);
    }
}

