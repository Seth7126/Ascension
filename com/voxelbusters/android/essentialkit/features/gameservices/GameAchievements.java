package com.voxelbusters.android.essentialkit.features.gameservices;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.games.AchievementsClient;
import com.google.android.gms.games.AnnotatedData;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.achievement.Achievement;
import com.google.android.gms.games.achievement.AchievementBuffer;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.voxelbusters.android.essentialkit.common.ArrayBuffer;
import com.voxelbusters.android.essentialkit.common.ConnectorFragment;
import com.voxelbusters.android.essentialkit.common.interfaces.IFragmentResultListener;
import com.voxelbusters.android.essentialkit.features.socialauth.GoogleAuth;
import com.voxelbusters.android.essentialkit.utilities.Logger;

public class GameAchievements {
    private GameAchievement[] achievements;
    private AchievementsClient client;
    private Context context;

    public GameAchievements(Context context0) {
        this.achievements = null;
        this.context = context0;
        this.client = Games.getAchievementsClient(context0, GoogleSignIn.getLastSignedInAccount(context0));
        Logger.debug("Loading achievements initially");
        this.loadAchievements(null);
    }

    public GameAchievement get(String s) {
        String s1 = s.trim();
        GameAchievement[] arr_gameAchievement = this.achievements;
        for(int v = 0; v < arr_gameAchievement.length; ++v) {
            GameAchievement gameAchievement0 = arr_gameAchievement[v];
            if(gameAchievement0.getId().trim().equals(s1)) {
                Logger.debug(("Achievement details of " + s1 + " : " + gameAchievement0));
                return gameAchievement0;
            }
        }
        Logger.error(("Failed fetching achievement info for ID : " + s1));
        return null;
    }

    public void loadAchievements(ILoadAchievementsListener iGameServices$ILoadAchievementsListener0) {
        this.client.load(iGameServices$ILoadAchievementsListener0 != null).addOnCompleteListener(((Activity)this.context), new OnCompleteListener() {
            @Override  // com.google.android.gms.tasks.OnCompleteListener
            public void onComplete(Task task0) {
                Logger.debug("loadAchievements finished loading...");
                if(task0.isSuccessful()) {
                    AchievementBuffer achievementBuffer0 = (AchievementBuffer)((AnnotatedData)task0.getResult()).get();
                    int v = achievementBuffer0.getCount();
                    GameAchievement[] arr_gameAchievement = new GameAchievement[v];
                    for(int v1 = 0; v1 < v; ++v1) {
                        Achievement achievement0 = achievementBuffer0.get(v1);
                        arr_gameAchievement[v1] = new Builder().withAchievement(GameAchievements.this.context, ((Achievement)achievement0.freeze())).build();
                    }
                    achievementBuffer0.release();
                    Logger.debug("Deallocating old achievements...");
                    GameAchievements.this.achievements = arr_gameAchievement;
                    ILoadAchievementsListener iGameServices$ILoadAchievementsListener0 = iGameServices$ILoadAchievementsListener0;
                    if(iGameServices$ILoadAchievementsListener0 != null) {
                        iGameServices$ILoadAchievementsListener0.onSuccess(new ArrayBuffer(GameAchievements.this.achievements));
                    }
                }
                else {
                    String s = task0.getException().getMessage();
                    Logger.error(("Error loading achievements info " + s));
                    ILoadAchievementsListener iGameServices$ILoadAchievementsListener1 = iGameServices$ILoadAchievementsListener0;
                    if(iGameServices$ILoadAchievementsListener1 != null) {
                        iGameServices$ILoadAchievementsListener1.onFailure(s);
                    }
                }
            }
        });
    }

    public void show(IViewListener iGameServices$IViewListener0) {
        this.client.getAchievementsIntent().addOnCompleteListener(new OnCompleteListener() {
            @Override  // com.google.android.gms.tasks.OnCompleteListener
            public void onComplete(Task task0) {
                if(task0.isSuccessful()) {
                    Intent intent0 = (Intent)task0.getResult();
                    com.voxelbusters.android.essentialkit.features.gameservices.GameAchievements.2.1 gameAchievements$2$10 = new IFragmentResultListener() {
                        @Override  // com.voxelbusters.android.essentialkit.common.interfaces.IFragmentResultListener
                        public void onResult(int v, Intent intent0, boolean z) {
                            if(com.voxelbusters.android.essentialkit.features.gameservices.GameAchievements.2.this.val$listener != null) {
                                com.voxelbusters.android.essentialkit.features.gameservices.GameAchievements.2.this.val$listener.onClose((z ? "" : "Failed to launch view"));
                            }
                            if(v == 10001) {
                                GoogleAuth.getInstance(GameAchievements.this.context).signOut();
                            }
                        }
                    };
                    ConnectorFragment.launchIntent(intent0, ((Activity)GameAchievements.this.context), gameAchievements$2$10);
                    return;
                }
                IViewListener iGameServices$IViewListener0 = iGameServices$IViewListener0;
                if(iGameServices$IViewListener0 != null) {
                    iGameServices$IViewListener0.onClose("Failed to launch view");
                }
            }
        });
    }
}

