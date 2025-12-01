package com.voxelbusters.android.essentialkit.features.gameservices;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.games.AnnotatedData;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.LeaderboardsClient.LeaderboardScores;
import com.google.android.gms.games.LeaderboardsClient;
import com.google.android.gms.games.leaderboard.Leaderboard;
import com.google.android.gms.games.leaderboard.LeaderboardScore;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.voxelbusters.android.essentialkit.common.ConnectorFragment;
import com.voxelbusters.android.essentialkit.common.annotations.RunOnUiThread;
import com.voxelbusters.android.essentialkit.common.interfaces.IFragmentResultListener;
import com.voxelbusters.android.essentialkit.common.interfaces.ILoadAssetListener;
import com.voxelbusters.android.essentialkit.features.socialauth.GoogleAuth;
import com.voxelbusters.android.essentialkit.utilities.Logger;
import java.util.ArrayList;

public class GameLeaderboard {
    public static class Builder {
        private Context context;
        private Leaderboard leaderboard;
        private String leaderboardId;

        public Builder(Context context0) {
            this.context = context0;
        }

        GameLeaderboard build() {
            Leaderboard leaderboard0 = this.leaderboard;
            return leaderboard0 == null ? new GameLeaderboard(this.context, this.leaderboardId, null) : new GameLeaderboard(this.context, leaderboard0, null);
        }

        Builder withLeaderboard(Leaderboard leaderboard0) {
            this.leaderboard = leaderboard0;
            return this;
        }

        Builder withLeaderboardId(String s) {
            this.leaderboardId = s;
            return this;
        }
    }

    private LeaderboardsClient client;
    private Context context;
    private Leaderboard leaderboard;
    private String leaderboardId;
    LeaderboardScoreBuffer leaderboardScoreBufferCache;
    GameLeaderboardScore localPlayerScore;

    private GameLeaderboard(Context context0, Leaderboard leaderboard0) {
        this.context = context0;
        this.leaderboard = leaderboard0;
        this.client = Games.getLeaderboardsClient(context0, GoogleSignIn.getLastSignedInAccount(context0));
    }

    GameLeaderboard(Context context0, Leaderboard leaderboard0, com.voxelbusters.android.essentialkit.features.gameservices.GameLeaderboard.1 gameLeaderboard$10) {
        this(context0, leaderboard0);
    }

    private GameLeaderboard(Context context0, String s) {
        this.context = context0;
        this.leaderboardId = s;
        this.client = Games.getLeaderboardsClient(context0, GoogleSignIn.getLastSignedInAccount(context0));
    }

    GameLeaderboard(Context context0, String s, com.voxelbusters.android.essentialkit.features.gameservices.GameLeaderboard.1 gameLeaderboard$10) {
        this(context0, s);
    }

    private int getCollectionVariant(LeaderboardCollectionVariant leaderboardCollectionVariant0) {
        switch(com.voxelbusters.android.essentialkit.features.gameservices.GameLeaderboard.4.$SwitchMap$com$voxelbusters$android$essentialkit$features$gameservices$LeaderboardCollectionVariant[leaderboardCollectionVariant0.ordinal()]) {
            case 1: {
                return 0;
            }
            case 2: {
                return 3;
            }
            default: {
                return 2;
            }
        }
    }

    public String getId() {
        return this.leaderboard == null ? this.leaderboardId : this.leaderboard.getLeaderboardId();
    }

    public GameLeaderboardScore getLocalPlayerScore() {
        return this.localPlayerScore;
    }

    public String getName() {
        return this.leaderboard == null ? null : this.leaderboard.getDisplayName();
    }

    private int getTimeVariant(LeaderboardTimeVariant leaderboardTimeVariant0) {
        switch(com.voxelbusters.android.essentialkit.features.gameservices.GameLeaderboard.4.$SwitchMap$com$voxelbusters$android$essentialkit$features$gameservices$LeaderboardTimeVariant[leaderboardTimeVariant0.ordinal()]) {
            case 1: {
                return 0;
            }
            case 2: {
                return 1;
            }
            default: {
                return 2;
            }
        }
    }

    public void loadImage(ILoadAssetListener iLoadAssetListener0) {
        Leaderboard leaderboard0 = this.leaderboard;
        if(leaderboard0 != null) {
            ImageManagerUtility.loadImage(((Activity)this.context), leaderboard0.getIconImageUri(), iLoadAssetListener0);
            return;
        }
        iLoadAssetListener0.onFailure("Unable to load as no leaderboard instance available");
    }

    public void loadLocalPlayerScore(LeaderboardTimeVariant leaderboardTimeVariant0, LeaderboardCollectionVariant leaderboardCollectionVariant0, ILoadLocalPlayerScoreListener iGameServices$ILoadLocalPlayerScoreListener0) {
        this.client.loadCurrentPlayerLeaderboardScore(this.getId(), this.getTimeVariant(leaderboardTimeVariant0), this.getCollectionVariant(leaderboardCollectionVariant0)).addOnCompleteListener(new OnCompleteListener() {
            @Override  // com.google.android.gms.tasks.OnCompleteListener
            public void onComplete(Task task0) {
                if(task0.isSuccessful()) {
                    LeaderboardScore leaderboardScore0 = (LeaderboardScore)((AnnotatedData)task0.getResult()).get();
                    Logger.debug(("Loaded local player score : " + leaderboardScore0));
                    ILoadLocalPlayerScoreListener iGameServices$ILoadLocalPlayerScoreListener0 = iGameServices$ILoadLocalPlayerScoreListener0;
                    if(iGameServices$ILoadLocalPlayerScoreListener0 != null) {
                        if(leaderboardScore0 != null) {
                            String s = GameLeaderboard.this.getId();
                            GameLeaderboardScore gameLeaderboardScore0 = new com.voxelbusters.android.essentialkit.features.gameservices.GameLeaderboardScore.Builder(GameLeaderboard.this.context, s).withScore(leaderboardScore0).build();
                            iGameServices$ILoadLocalPlayerScoreListener0.onSuccess(gameLeaderboardScore0);
                            return;
                        }
                        iGameServices$ILoadLocalPlayerScoreListener0.onSuccess(null);
                    }
                }
                else {
                    String s1 = task0.getException().getMessage();
                    ILoadLocalPlayerScoreListener iGameServices$ILoadLocalPlayerScoreListener1 = iGameServices$ILoadLocalPlayerScoreListener0;
                    if(iGameServices$ILoadLocalPlayerScoreListener1 != null) {
                        iGameServices$ILoadLocalPlayerScoreListener1.onFailure(s1);
                    }
                }
            }
        });
    }

    public void loadMoreScores(int v, int v1, ILoadScoresListener iGameServices$ILoadScoresListener0) {
        LeaderboardScoreBuffer leaderboardScoreBuffer0 = this.leaderboardScoreBufferCache;
        if(leaderboardScoreBuffer0 == null) {
            Logger.warning("No previous scores buffer found. So loading top scores by default. Make sure you call either loadTopScores or loadPlayerCenteredScores before calling this method.");
            this.loadTopScores(LeaderboardTimeVariant.AllTime, LeaderboardCollectionVariant.Public, v, true, iGameServices$ILoadScoresListener0);
            return;
        }
        this.processScoresTask(this.client.loadMoreScores(leaderboardScoreBuffer0, v, (v1 == 1 ? 0 : 1)), iGameServices$ILoadScoresListener0);
    }

    public void loadPlayerCenteredScores(LeaderboardTimeVariant leaderboardTimeVariant0, LeaderboardCollectionVariant leaderboardCollectionVariant0, int v, boolean z, ILoadScoresListener iGameServices$ILoadScoresListener0) {
        this.processScoresTask(this.client.loadPlayerCenteredScores(this.getId(), this.getTimeVariant(leaderboardTimeVariant0), this.getCollectionVariant(leaderboardCollectionVariant0), v, z), iGameServices$ILoadScoresListener0);
    }

    public void loadTopScores(LeaderboardTimeVariant leaderboardTimeVariant0, LeaderboardCollectionVariant leaderboardCollectionVariant0, int v, boolean z, ILoadScoresListener iGameServices$ILoadScoresListener0) {
        this.processScoresTask(this.client.loadTopScores(this.getId(), this.getTimeVariant(leaderboardTimeVariant0), this.getCollectionVariant(leaderboardCollectionVariant0), v, z), iGameServices$ILoadScoresListener0);
    }

    private void processScoresTask(Task task0, ILoadScoresListener iGameServices$ILoadScoresListener0) {
        task0.addOnCompleteListener(new OnCompleteListener() {
            @Override  // com.google.android.gms.tasks.OnCompleteListener
            public void onComplete(Task task0) {
                if(task0.isSuccessful()) {
                    LeaderboardScoreBuffer leaderboardScoreBuffer0 = ((LeaderboardScores)((AnnotatedData)task0.getResult()).get()).getScores();
                    if(GameLeaderboard.this.leaderboardScoreBufferCache != null) {
                        GameLeaderboard.this.leaderboardScoreBufferCache.release();
                    }
                    GameLeaderboard.this.leaderboardScoreBufferCache = leaderboardScoreBuffer0;
                    ArrayList arrayList0 = new ArrayList();
                    for(Object object0: leaderboardScoreBuffer0) {
                        arrayList0.add(new com.voxelbusters.android.essentialkit.features.gameservices.GameLeaderboardScore.Builder(GameLeaderboard.this.context, GameLeaderboard.this.getId()).withScore(((LeaderboardScore)((LeaderboardScore)object0).freeze())).build());
                    }
                    ILoadScoresListener iGameServices$ILoadScoresListener0 = iGameServices$ILoadScoresListener0;
                    if(iGameServices$ILoadScoresListener0 != null) {
                        iGameServices$ILoadScoresListener0.onSuccess(arrayList0);
                    }
                }
                else {
                    String s = task0.getException().getMessage();
                    ILoadScoresListener iGameServices$ILoadScoresListener1 = iGameServices$ILoadScoresListener0;
                    if(iGameServices$ILoadScoresListener1 != null) {
                        iGameServices$ILoadScoresListener1.onFailure(s);
                    }
                }
            }
        });
    }

    @RunOnUiThread
    public void show(LeaderboardTimeVariant leaderboardTimeVariant0, IViewListener iGameServices$IViewListener0) {
        String s = this.getId();
        this.client.getLeaderboardIntent(s, this.getTimeVariant(leaderboardTimeVariant0)).addOnCompleteListener(new OnCompleteListener() {
            @Override  // com.google.android.gms.tasks.OnCompleteListener
            public void onComplete(Task task0) {
                if(task0.isSuccessful()) {
                    Intent intent0 = (Intent)task0.getResult();
                    com.voxelbusters.android.essentialkit.features.gameservices.GameLeaderboard.1.1 gameLeaderboard$1$10 = new IFragmentResultListener() {
                        @Override  // com.voxelbusters.android.essentialkit.common.interfaces.IFragmentResultListener
                        public void onResult(int v, Intent intent0, boolean z) {
                            com.voxelbusters.android.essentialkit.features.gameservices.GameLeaderboard.1.this.val$listener.onClose((z ? "" : "Failed to launch view"));
                            if(v == 10001) {
                                GoogleAuth.getInstance(GameLeaderboard.this.context).signOut();
                            }
                        }
                    };
                    ConnectorFragment.launchIntent(intent0, ((Activity)GameLeaderboard.this.context), gameLeaderboard$1$10);
                    return;
                }
                IViewListener iGameServices$IViewListener0 = iGameServices$IViewListener0;
                if(iGameServices$IViewListener0 != null) {
                    iGameServices$IViewListener0.onClose("Failed to launch view");
                }
            }
        });
    }

    class com.voxelbusters.android.essentialkit.features.gameservices.GameLeaderboard.4 {
        static final int[] $SwitchMap$com$voxelbusters$android$essentialkit$features$gameservices$LeaderboardCollectionVariant;
        static final int[] $SwitchMap$com$voxelbusters$android$essentialkit$features$gameservices$LeaderboardTimeVariant;

        static {
            int[] arr_v = new int[LeaderboardCollectionVariant.values().length];
            com.voxelbusters.android.essentialkit.features.gameservices.GameLeaderboard.4.$SwitchMap$com$voxelbusters$android$essentialkit$features$gameservices$LeaderboardCollectionVariant = arr_v;
            try {
                arr_v[LeaderboardCollectionVariant.Public.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.voxelbusters.android.essentialkit.features.gameservices.GameLeaderboard.4.$SwitchMap$com$voxelbusters$android$essentialkit$features$gameservices$LeaderboardCollectionVariant[LeaderboardCollectionVariant.Friends.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            int[] arr_v1 = new int[LeaderboardTimeVariant.values().length];
            com.voxelbusters.android.essentialkit.features.gameservices.GameLeaderboard.4.$SwitchMap$com$voxelbusters$android$essentialkit$features$gameservices$LeaderboardTimeVariant = arr_v1;
            try {
                arr_v1[LeaderboardTimeVariant.Daily.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.voxelbusters.android.essentialkit.features.gameservices.GameLeaderboard.4.$SwitchMap$com$voxelbusters$android$essentialkit$features$gameservices$LeaderboardTimeVariant[LeaderboardTimeVariant.Weekly.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.voxelbusters.android.essentialkit.features.gameservices.GameLeaderboard.4.$SwitchMap$com$voxelbusters$android$essentialkit$features$gameservices$LeaderboardTimeVariant[LeaderboardTimeVariant.AllTime.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

}

