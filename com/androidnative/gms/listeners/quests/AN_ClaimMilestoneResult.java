package com.androidnative.gms.listeners.quests;

import android.util.Log;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.games.quest.Quests.ClaimMilestoneResult;
import com.unity3d.player.UnityPlayer;

public class AN_ClaimMilestoneResult implements ResultCallback {
    @Override  // com.google.android.gms.common.api.ResultCallback
    public void onResult(Result result0) {
        this.onResult(((Quests.ClaimMilestoneResult)result0));
    }

    public void onResult(Quests.ClaimMilestoneResult quests$ClaimMilestoneResult0) {
        String s1;
        Log.d("AndroidNative", "AN_ClaimMilestoneResult+");
        int v = quests$ClaimMilestoneResult0.getStatus().getStatusCode();
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(v);
        stringBuilder0.append("|");
        String s = quests$ClaimMilestoneResult0.getQuest() == null ? "0" : quests$ClaimMilestoneResult0.getQuest().getQuestId();
        if(v == 0) {
            try {
                s1 = new String(quests$ClaimMilestoneResult0.getQuest().getCurrentMilestone().getCompletionRewardData(), "UTF-8");
            }
            catch(Exception exception0) {
                Log.d("AndroidNative", "AN_ClaimMilestoneResult failed: " + exception0.getMessage());
                s1 = "";
            }
        }
        else {
            s1 = "";
        }
        stringBuilder0.append(s);
        stringBuilder0.append("|");
        stringBuilder0.append(s1);
        UnityPlayer.UnitySendMessage("GooglePlayQuests", "OnGPQuestCompleted", stringBuilder0.toString());
    }
}

