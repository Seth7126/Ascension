package com.androidnative.gms.listeners.quests;

import android.util.Log;
import com.androidnative.gms.core.GameClientManager;
import com.google.android.gms.games.quest.Quest;
import com.google.android.gms.games.quest.QuestUpdateListener;

public class AN_QuestUpdateListener implements QuestUpdateListener {
    public void onQuestCompleted(Quest quest0) {
        Log.d("AndroidNative", "AN_QuestUpdateListener+");
        if(quest0 != null) {
            GameClientManager.GetInstance().updateQuest(quest0);
            GameClientManager.GetInstance().claimQuest(quest0);
        }
    }
}

