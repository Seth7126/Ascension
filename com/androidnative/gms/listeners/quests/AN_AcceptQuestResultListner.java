package com.androidnative.gms.listeners.quests;

import android.util.Log;
import com.androidnative.gms.core.GameClientManager;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.games.quest.Quests.AcceptQuestResult;
import com.unity3d.player.UnityPlayer;

public class AN_AcceptQuestResultListner implements ResultCallback {
    @Override  // com.google.android.gms.common.api.ResultCallback
    public void onResult(Result result0) {
        this.onResult(((Quests.AcceptQuestResult)result0));
    }

    public void onResult(Quests.AcceptQuestResult quests$AcceptQuestResult0) {
        Log.d("AndroidNative", "AN_AcceptQuestResultListner+");
        int v = quests$AcceptQuestResult0.getStatus().getStatusCode();
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(v);
        stringBuilder0.append("|");
        if(v == 0) {
            GameClientManager.GetInstance().updateQuest(quests$AcceptQuestResult0.getQuest());
        }
        if(quests$AcceptQuestResult0.getQuest() == null) {
            stringBuilder0.append("0");
        }
        else {
            stringBuilder0.append(quests$AcceptQuestResult0.getQuest().getQuestId());
            stringBuilder0.append("|");
            stringBuilder0.append(quests$AcceptQuestResult0.getQuest().getName());
            stringBuilder0.append("|");
            stringBuilder0.append(quests$AcceptQuestResult0.getQuest().getDescription());
            stringBuilder0.append("|");
            stringBuilder0.append(quests$AcceptQuestResult0.getQuest().getBannerImageUrl());
            stringBuilder0.append("|");
            stringBuilder0.append(quests$AcceptQuestResult0.getQuest().getIconImageUrl());
            stringBuilder0.append("|");
            stringBuilder0.append(quests$AcceptQuestResult0.getQuest().getState());
            stringBuilder0.append("|");
            stringBuilder0.append(quests$AcceptQuestResult0.getQuest().getLastUpdatedTimestamp());
            stringBuilder0.append("|");
            stringBuilder0.append(quests$AcceptQuestResult0.getQuest().getAcceptedTimestamp());
            stringBuilder0.append("|");
            stringBuilder0.append(quests$AcceptQuestResult0.getQuest().getEndTimestamp());
            stringBuilder0.append("|");
        }
        UnityPlayer.UnitySendMessage("GooglePlayQuests", "OnGPQuestAccepted", stringBuilder0.toString());
    }
}

