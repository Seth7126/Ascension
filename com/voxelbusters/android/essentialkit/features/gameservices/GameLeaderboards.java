package com.voxelbusters.android.essentialkit.features.gameservices;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.games.AnnotatedData;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.LeaderboardsClient;
import com.google.android.gms.games.leaderboard.Leaderboard;
import com.google.android.gms.games.leaderboard.LeaderboardBuffer;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.voxelbusters.android.essentialkit.common.ConnectorFragment;
import com.voxelbusters.android.essentialkit.common.interfaces.IFragmentResultListener;
import com.voxelbusters.android.essentialkit.features.socialauth.GoogleAuth;
import com.voxelbusters.android.essentialkit.utilities.Logger;
import java.util.ArrayList;

public class GameLeaderboards {
    LeaderboardsClient client;
    Context context;
    private ArrayList leaderboards;

    public GameLeaderboards(Context context0) {
        this.leaderboards = null;
        this.context = context0;
        this.client = Games.getLeaderboardsClient(context0, GoogleSignIn.getLastSignedInAccount(context0));
        this.load(null);
    }

    public GameLeaderboard get(String s) {
        String s1 = s.trim();
        ArrayList arrayList0 = this.leaderboards;
        if(arrayList0 != null) {
            for(Object object0: arrayList0) {
                GameLeaderboard gameLeaderboard0 = (GameLeaderboard)object0;
                if(gameLeaderboard0.getId().equals(s1)) {
                    return gameLeaderboard0;
                }
                if(false) {
                    break;
                }
            }
        }
        return new Builder(this.context).withLeaderboardId(s1).build();
    }

    public void load(ILoadLeaderboardsListener iGameServices$ILoadLeaderboardsListener0) {
        this.client.loadLeaderboardMetadata(iGameServices$ILoadLeaderboardsListener0 != null).addOnCompleteListener(((Activity)this.context), new OnCompleteListener() {
            @Override  // com.google.android.gms.tasks.OnCompleteListener
            public void onComplete(Task task0) {
                if(task0.isSuccessful()) {
                    ArrayList arrayList0 = new ArrayList();
                    LeaderboardBuffer leaderboardBuffer0 = (LeaderboardBuffer)((AnnotatedData)task0.getResult()).get();
                    for(int v = 0; v < leaderboardBuffer0.getCount(); ++v) {
                        Leaderboard leaderboard0 = (Leaderboard)leaderboardBuffer0.get(v);
                        arrayList0.add(new Builder(GameLeaderboards.this.context).withLeaderboard(((Leaderboard)leaderboard0.freeze())).build());
                    }
                    leaderboardBuffer0.release();
                    GameLeaderboards.this.leaderboards = arrayList0;
                    ILoadLeaderboardsListener iGameServices$ILoadLeaderboardsListener0 = iGameServices$ILoadLeaderboardsListener0;
                    if(iGameServices$ILoadLeaderboardsListener0 != null) {
                        iGameServices$ILoadLeaderboardsListener0.onSuccess(GameLeaderboards.this.leaderboards);
                    }
                }
                else {
                    String s = task0.getException().getMessage();
                    Logger.error(("Error loading leaderboards info " + s));
                    ILoadLeaderboardsListener iGameServices$ILoadLeaderboardsListener1 = iGameServices$ILoadLeaderboardsListener0;
                    if(iGameServices$ILoadLeaderboardsListener1 != null) {
                        iGameServices$ILoadLeaderboardsListener1.onFailure(s);
                    }
                }
            }
        });
    }

    public void show(IViewListener iGameServices$IViewListener0) {
        this.client.getAllLeaderboardsIntent().addOnCompleteListener(new OnCompleteListener() {
            @Override  // com.google.android.gms.tasks.OnCompleteListener
            public void onComplete(Task task0) {
                if(task0.isSuccessful()) {
                    ConnectorFragment.launchIntent(((Intent)task0.getResult()), ((Activity)GameLeaderboards.this.context), new IFragmentResultListener() {
                        @Override  // com.voxelbusters.android.essentialkit.common.interfaces.IFragmentResultListener
                        public void onResult(int v, Intent intent0, boolean z) {
                            com.voxelbusters.android.essentialkit.features.gameservices.GameLeaderboards.2.this.val$listener.onClose((z ? "" : "Failed to launch view"));
                            if(v == 10001) {
                                GoogleAuth.getInstance(GameLeaderboards.this.context).signOut();
                            }
                        }
                    });
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

