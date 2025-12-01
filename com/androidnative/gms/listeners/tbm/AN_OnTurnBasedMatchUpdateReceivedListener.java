package com.androidnative.gms.listeners.tbm;

import android.util.Log;
import com.androidnative.gms.network.TurnBasedMultiplayerController;
import com.google.android.gms.games.multiplayer.turnbased.OnTurnBasedMatchUpdateReceivedListener;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch;
import com.unity3d.player.UnityPlayer;

public class AN_OnTurnBasedMatchUpdateReceivedListener implements OnTurnBasedMatchUpdateReceivedListener {
    public void onTurnBasedMatchReceived(TurnBasedMatch turnBasedMatch0) {
        Log.d("AndroidNative", "AN_OnTurnBasedMatchUpdateReceivedListener onTurnBasedMatchReceived__ " + turnBasedMatch0.getStatus() + " / " + turnBasedMatch0.getTurnStatus());
        UnityPlayer.UnitySendMessage("GooglePlayTBM", "OnTurnBasedMatchReceived", TurnBasedMultiplayerController.GetMatchString(turnBasedMatch0));
    }

    public void onTurnBasedMatchRemoved(String s) {
        Log.d("AndroidNative", "AN_OnTurnBasedMatchUpdateReceivedListener onTurnBasedMatchRemoved " + s);
        UnityPlayer.UnitySendMessage("GooglePlayTBM", "OnTurnBasedMatchRemoved", s);
    }
}

