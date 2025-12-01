package com.androidnative.gms.listeners.games;

import android.util.Log;
import com.androidnative.gms.core.GameClientManager;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.games.achievement.Achievements.UpdateAchievementResult;
import com.unity3d.player.UnityPlayer;

public class AchievementsUpdateListner implements ResultCallback {
    @Override  // com.google.android.gms.common.api.ResultCallback
    public void onResult(Result result0) {
        this.onResult(((UpdateAchievementResult)result0));
    }

    public void onResult(UpdateAchievementResult achievements$UpdateAchievementResult0) {
        Log.d("AndroidNative", "Status: " + achievements$UpdateAchievementResult0.getStatus().getStatusCode() + " achivment: " + achievements$UpdateAchievementResult0.getAchievementId());
        GameClientManager.GetInstance().loadAchievements(false);
        UnityPlayer.UnitySendMessage("GooglePlayManager", "OnAchievementUpdated", achievements$UpdateAchievementResult0.getStatus().getStatusCode() + "|" + achievements$UpdateAchievementResult0.getAchievementId());
    }
}

