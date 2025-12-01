package com.voxelbusters.android.essentialkit.features.gameservices;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.games.AchievementsClient;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.achievement.Achievement;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.voxelbusters.android.essentialkit.common.annotations.SkipInCodeGenerator;
import com.voxelbusters.android.essentialkit.common.interfaces.ILoadAssetListener;
import com.voxelbusters.android.essentialkit.utilities.Logger;
import java.util.Date;

public class GameAchievement {
    public static class Builder {
        private Achievement achievement;
        private Context context;

        GameAchievement build() {
            return new GameAchievement(this.context, this.achievement, null);
        }

        Builder withAchievement(Context context0, Achievement achievement0) {
            this.context = context0;
            this.achievement = achievement0;
            return this;
        }
    }

    private Achievement achievement;
    private AchievementsClient client;
    private Context context;

    private GameAchievement(Context context0, Achievement achievement0) {
        this.context = context0;
        this.achievement = achievement0;
        this.client = Games.getAchievementsClient(context0, GoogleSignIn.getLastSignedInAccount(context0));
    }

    GameAchievement(Context context0, Achievement achievement0, com.voxelbusters.android.essentialkit.features.gameservices.GameAchievement.1 gameAchievement$10) {
        this(context0, achievement0);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Deallocating native : " + this.hashCode());
        super.finalize();
    }

    public int getCurrentSteps() {
        if(this.achievement.getType() == 1) {
            return this.achievement.getCurrentSteps();
        }
        return this.achievement.getState() == 0 ? 1 : 0;
    }

    public String getDescription() {
        return this.achievement.getDescription();
    }

    public String getId() {
        return this.achievement.getAchievementId();
    }

    public Date getLastReportedDate() {
        return this.achievement.getLastUpdatedTimestamp() == -1L ? null : new Date(this.achievement.getLastUpdatedTimestamp());
    }

    public String getName() {
        return this.achievement.getName();
    }

    public int getTotalSteps() {
        return this.achievement.getType() == 1 ? this.achievement.getTotalSteps() : 1;
    }

    @SkipInCodeGenerator
    public int getType() {
        return this.achievement.getType();
    }

    public boolean isHidden() {
        return this.achievement.getState() == 2;
    }

    public boolean isRevealed() {
        return this.achievement.getState() == 1;
    }

    public boolean isUnlocked() {
        return this.achievement.getState() == 0;
    }

    public void loadRevealedImage(ILoadAssetListener iLoadAssetListener0) {
        ImageManagerUtility.loadImage(((Activity)this.context), this.achievement.getRevealedImageUri(), iLoadAssetListener0);
    }

    public void loadUnlockedImage(ILoadAssetListener iLoadAssetListener0) {
        ImageManagerUtility.loadImage(((Activity)this.context), this.achievement.getUnlockedImageUri(), iLoadAssetListener0);
    }

    public void reportProgress(int v, IReportProgressListener iGameServices$IReportProgressListener0) {
        if(this.achievement.getType() == 1) {
            if(v >= 0 && this.achievement.getState() == 2) {
                Logger.debug("Reveal the achievement now!");
                this.client.reveal(this.achievement.getAchievementId());
            }
            Logger.debug(("totalSteps : " + this.achievement.getTotalSteps() + " Steps to set : " + v));
            if(v == 0) {
                if(iGameServices$IReportProgressListener0 != null) {
                    iGameServices$IReportProgressListener0.onSuccess();
                }
                Logger.debug("Reported 0 steps. So, returning success instantly!");
                return;
            }
            if(iGameServices$IReportProgressListener0 != null) {
                Task task0 = this.client.setStepsImmediate(this.achievement.getAchievementId(), v);
                task0.addOnCompleteListener(new OnCompleteListener() {
                    @Override  // com.google.android.gms.tasks.OnCompleteListener
                    public void onComplete(Task task0) {
                        iGameServices$IReportProgressListener0.onSuccess();
                    }
                });
                task0.addOnFailureListener(new OnFailureListener() {
                    @Override  // com.google.android.gms.tasks.OnFailureListener
                    public void onFailure(Exception exception0) {
                        Logger.error(exception0.getMessage());
                        iGameServices$IReportProgressListener0.onFailure("Unable to report progress! Try again later.");
                    }
                });
                return;
            }
            this.client.setSteps(this.achievement.getAchievementId(), v);
            return;
        }
        if(v >= 0) {
            if(v == 0) {
                Logger.debug("This is not an incremental achievement. So just trying to reveal it as 100% progress was not sent as progress.");
                this.client.reveal(this.achievement.getAchievementId());
                return;
            }
            Logger.debug("Unlocking Achievement");
            this.client.unlockImmediate(this.achievement.getAchievementId());
            if(iGameServices$IReportProgressListener0 != null) {
                Task task1 = this.client.unlockImmediate(this.achievement.getAchievementId());
                task1.addOnCompleteListener(new OnCompleteListener() {
                    @Override  // com.google.android.gms.tasks.OnCompleteListener
                    public void onComplete(Task task0) {
                        iGameServices$IReportProgressListener0.onSuccess();
                    }
                });
                task1.addOnFailureListener(new OnFailureListener() {
                    @Override  // com.google.android.gms.tasks.OnFailureListener
                    public void onFailure(Exception exception0) {
                        Logger.error(exception0.getMessage());
                        iGameServices$IReportProgressListener0.onFailure("Failed unlocking achievement. Try again later.");
                    }
                });
                return;
            }
            this.client.unlock(this.achievement.getAchievementId());
        }
        else if(iGameServices$IReportProgressListener0 != null) {
            iGameServices$IReportProgressListener0.onFailure("Reported wrong progress value. Cannot be negative!");
        }
    }

    @Override
    @SkipInCodeGenerator
    public String toString() {
        return "[" + ("Name : " + this.getName()) + "][" + ("Type : " + this.getType()) + "][" + ("Description : " + this.getDescription()) + "][" + ("Total Steps : " + this.getTotalSteps()) + "][" + ("Current Steps : " + this.getCurrentSteps()) + "][" + ("Last Reported Date : " + this.getLastReportedDate()) + "][" + ("Is Hidden : " + this.isHidden()) + "][" + ("Is Revealed : " + this.isRevealed()) + "][" + ("Is Unlocked : " + this.isUnlocked()) + "]";
    }
}

