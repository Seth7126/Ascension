package com.androidnative.gms.listeners.games;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.games.achievement.Achievement;
import com.google.android.gms.games.achievement.Achievements.LoadAchievementsResult;
import com.unity3d.player.UnityPlayer;

public class AchievementsLoadListner implements ResultCallback {
    @Override  // com.google.android.gms.common.api.ResultCallback
    public void onResult(Result result0) {
        this.onResult(((LoadAchievementsResult)result0));
    }

    public void onResult(LoadAchievementsResult achievements$LoadAchievementsResult0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(achievements$LoadAchievementsResult0.getStatus().getStatusCode());
        stringBuilder0.append("|");
        for(Object object0: achievements$LoadAchievementsResult0.getAchievements()) {
            Achievement achievement0 = (Achievement)object0;
            stringBuilder0.append(achievement0.getAchievementId());
            stringBuilder0.append("|");
            stringBuilder0.append(achievement0.getName());
            stringBuilder0.append("|");
            stringBuilder0.append(achievement0.getDescription());
            stringBuilder0.append("|");
            if(achievement0.getType() == 1) {
                stringBuilder0.append(Integer.toString(achievement0.getCurrentSteps()));
                stringBuilder0.append("|");
                stringBuilder0.append(Integer.toString(achievement0.getTotalSteps()));
                stringBuilder0.append("|");
            }
            else {
                stringBuilder0.append("-1|-1|");
            }
            stringBuilder0.append(Integer.toString(achievement0.getState()));
            stringBuilder0.append("|");
            stringBuilder0.append(Integer.toString(achievement0.getType()));
            stringBuilder0.append("|");
        }
        stringBuilder0.append("endofline");
        UnityPlayer.UnitySendMessage("GooglePlayManager", "OnAchievementsLoaded", stringBuilder0.toString());
        achievements$LoadAchievementsResult0.getAchievements().release();
    }
}

