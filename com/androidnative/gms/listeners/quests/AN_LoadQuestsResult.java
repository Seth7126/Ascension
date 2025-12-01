package com.androidnative.gms.listeners.quests;

import android.util.Log;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.games.quest.Quest;
import com.google.android.gms.games.quest.Quests.LoadQuestsResult;
import com.unity3d.player.UnityPlayer;

public class AN_LoadQuestsResult implements ResultCallback {
    @Override  // com.google.android.gms.common.api.ResultCallback
    public void onResult(Result result0) {
        this.onResult(((Quests.LoadQuestsResult)result0));
    }

    public void onResult(Quests.LoadQuestsResult quests$LoadQuestsResult0) {
        Log.d("AndroidNative", "AN_LoadQuestsResult+");
        int v = quests$LoadQuestsResult0.getStatus().getStatusCode();
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(v);
        if(v == 0) {
            stringBuilder0.append("|");
            for(Object object0: quests$LoadQuestsResult0.getQuests()) {
                stringBuilder0.append(((Quest)object0).getQuestId());
                stringBuilder0.append("|");
                stringBuilder0.append(((Quest)object0).getName());
                stringBuilder0.append("|");
                stringBuilder0.append(((Quest)object0).getDescription());
                stringBuilder0.append("|");
                stringBuilder0.append(((Quest)object0).getBannerImageUrl());
                stringBuilder0.append("|");
                stringBuilder0.append(((Quest)object0).getIconImageUrl());
                stringBuilder0.append("|");
                stringBuilder0.append(((Quest)object0).getState());
                stringBuilder0.append("|");
                stringBuilder0.append(((Quest)object0).getLastUpdatedTimestamp());
                stringBuilder0.append("|");
                stringBuilder0.append(((Quest)object0).getAcceptedTimestamp());
                stringBuilder0.append("|");
                stringBuilder0.append(((Quest)object0).getEndTimestamp());
                stringBuilder0.append("|");
                stringBuilder0.append(new String(((Quest)object0).getCurrentMilestone().getCompletionRewardData()));
                stringBuilder0.append("|");
                stringBuilder0.append(((Quest)object0).getCurrentMilestone().getCurrentProgress());
                stringBuilder0.append("|");
                stringBuilder0.append(((Quest)object0).getCurrentMilestone().getTargetProgress());
                stringBuilder0.append("|");
            }
            quests$LoadQuestsResult0.getQuests().close();
            stringBuilder0.append("endofline");
        }
        UnityPlayer.UnitySendMessage("GooglePlayQuests", "OnGPQuestsLoaded", stringBuilder0.toString());
    }
}

