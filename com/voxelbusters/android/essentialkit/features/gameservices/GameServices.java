package com.voxelbusters.android.essentialkit.features.gameservices;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.games.AnnotatedData;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayersClient;
import com.google.android.gms.tasks.Task;
import com.voxelbusters.android.essentialkit.common.annotations.RunOnUiThread;
import com.voxelbusters.android.essentialkit.common.interfaces.IFeature;
import com.voxelbusters.android.essentialkit.features.socialauth.GoogleAuth;
import com.voxelbusters.android.essentialkit.features.socialauth.IAuthenticationListener;
import com.voxelbusters.android.essentialkit.features.socialauth.ISocialAuth.IFetchServerCredentials;
import com.voxelbusters.android.essentialkit.utilities.Logger;
import com.voxelbusters.android.essentialkit.utilities.StringUtil;
import java.util.ArrayList;

public class GameServices implements IFeature {
    private final String TAG;
    private GameAchievements achievements;
    private GamePlayer cachedGamePlayer;
    private Context context;
    private GameLeaderboards leaderboards;

    public GameServices(Context context0) {
        this.TAG = "GameServices";
        this.context = context0;
    }

    @RunOnUiThread
    public void authenticate(IPlayerAuthenticationListener iGameServices$IPlayerAuthenticationListener0, boolean z) {
        GoogleAuth.getInstance(this.context).Authenticate(new IAuthenticationListener() {
            @Override  // com.voxelbusters.android.essentialkit.features.socialauth.IAuthenticationListener
            public void onFailure(String s) {
                IPlayerAuthenticationListener iGameServices$IPlayerAuthenticationListener0 = iGameServices$IPlayerAuthenticationListener0;
                if(iGameServices$IPlayerAuthenticationListener0 != null) {
                    iGameServices$IPlayerAuthenticationListener0.onFailure(s);
                }
            }

            @Override  // com.voxelbusters.android.essentialkit.features.socialauth.IAuthenticationListener
            public void onSuccess(Player player0) {
                if(player0 != null) {
                    GameAchievements gameAchievements0 = new GameAchievements(GameServices.this.context);
                    GameServices.this.achievements = gameAchievements0;
                    GameLeaderboards gameLeaderboards0 = new GameLeaderboards(GameServices.this.context);
                    GameServices.this.leaderboards = gameLeaderboards0;
                    GamePlayer gamePlayer0 = new Builder(GameServices.this.context).withPlayer(player0).build();
                    GameServices.this.cachedGamePlayer = gamePlayer0;
                    iGameServices$IPlayerAuthenticationListener0.onSuccess(gamePlayer0);
                    return;
                }
                GameServices.this.cachedGamePlayer = null;
                IPlayerAuthenticationListener iGameServices$IPlayerAuthenticationListener0 = iGameServices$IPlayerAuthenticationListener0;
                if(iGameServices$IPlayerAuthenticationListener0 != null) {
                    iGameServices$IPlayerAuthenticationListener0.onSuccess(null);
                }
            }
        }, z);
    }

    public GameAchievement createAchievement(String s) {
        return this.achievements.get(s);
    }

    public GameLeaderboard createLeaderboard(String s) {
        return this.leaderboards.get(s);
    }

    public GameLeaderboardScore createScore(String s) {
        return new com.voxelbusters.android.essentialkit.features.gameservices.GameLeaderboardScore.Builder(this.context, s).build();
    }

    public GameAchievement getAchievement(String s) {
        return this.achievements.get(s);
    }

    @Override  // com.voxelbusters.android.essentialkit.common.interfaces.IFeature
    public String getFeatureName() {
        return "Game Services";
    }

    public GamePlayer getLocalPlayer() {
        Player player0 = GoogleAuth.getInstance(this.context).getCurrentPlayer();
        if(this.cachedGamePlayer != null && this.cachedGamePlayer.player != player0 || this.cachedGamePlayer == null) {
            this.cachedGamePlayer = player0 == null ? null : new Builder(this.context).withPlayer(player0).build();
        }
        return this.cachedGamePlayer;
    }

    public void loadAchievements(ILoadAchievementsListener iGameServices$ILoadAchievementsListener0) {
        this.achievements.loadAchievements(iGameServices$ILoadAchievementsListener0);
    }

    public void loadLeaderboards(ILoadLeaderboardsListener iGameServices$ILoadLeaderboardsListener0) {
        this.leaderboards.load(iGameServices$ILoadLeaderboardsListener0);
    }

    public void loadPlayer(String s, ILoadPlayersListener iGameServices$ILoadPlayersListener0) {
        this.loadPlayers(new String[]{s}, iGameServices$ILoadPlayersListener0);
    }

    public void loadPlayers(String[] arr_s, ILoadPlayersListener iGameServices$ILoadPlayersListener0) {
        if(GoogleAuth.getInstance(this.context).isSignedIn()) {
            new AsyncTask() {
                @Override  // android.os.AsyncTask
                protected Object doInBackground(Object[] arr_object) {
                    return this.doInBackground(((String[][])arr_object));
                }

                protected ArrayList doInBackground(String[][] arr2_s) {
                    String[] arr_s = arr2_s[0];
                    ArrayList arrayList0 = new ArrayList();
                    GoogleSignInAccount googleSignInAccount0 = GoogleSignIn.getLastSignedInAccount(GameServices.this.context);
                    PlayersClient playersClient0 = Games.getPlayersClient(GameServices.this.context, googleSignInAccount0);
                    for(int v = 0; v < arr_s.length; ++v) {
                        Task task0 = playersClient0.loadPlayer(arr_s[v]);
                        while(!task0.isComplete()) {
                            try {
                                Thread.sleep(1L);
                            }
                            catch(InterruptedException interruptedException0) {
                                interruptedException0.printStackTrace();
                            }
                        }
                        if(task0.isSuccessful()) {
                            Player player0 = (Player)((AnnotatedData)task0.getResult()).get();
                            arrayList0.add(new Builder(GameServices.this.context).withPlayer(player0).build());
                        }
                    }
                    return arrayList0;
                }

                @Override  // android.os.AsyncTask
                protected void onPostExecute(Object object0) {
                    this.onPostExecute(((ArrayList)object0));
                }

                protected void onPostExecute(ArrayList arrayList0) {
                    if(arrayList0 == null) {
                        throw new NullPointerException();
                    }
                    Logger.warning("Error loading user friend details.");
                    ILoadPlayersListener iGameServices$ILoadPlayersListener0 = iGameServices$ILoadPlayersListener0;
                    if(iGameServices$ILoadPlayersListener0 != null) {
                        iGameServices$ILoadPlayersListener0.onSuccess(arrayList0);
                    }
                }
            }.execute(new String[][]{arr_s});
            return;
        }
        if(iGameServices$ILoadPlayersListener0 != null) {
            iGameServices$ILoadPlayersListener0.onFailure("SIGN_IN_REQUIRED");
        }
    }

    @RunOnUiThread
    public void loadServerCredentials(ILoadServerCredentials iGameServices$ILoadServerCredentials0) {
        GoogleAuth.getInstance(this.context).fetchServerAuthCode(new IFetchServerCredentials() {
            @Override  // com.voxelbusters.android.essentialkit.features.socialauth.ISocialAuth$IFetchServerCredentials
            public void onFailure(String s) {
                iGameServices$ILoadServerCredentials0.onFailure(s);
            }

            @Override  // com.voxelbusters.android.essentialkit.features.socialauth.ISocialAuth$IFetchServerCredentials
            public void onSuccess(String s, String s1, String s2) {
                iGameServices$ILoadServerCredentials0.onSuccess(StringUtil.getNonNull(s), StringUtil.getNonNull(s1), StringUtil.getNonNull(s2));
            }
        });
    }

    @RunOnUiThread
    public void showAchievements(IViewListener iGameServices$IViewListener0) {
        this.achievements.show(iGameServices$IViewListener0);
    }

    @RunOnUiThread
    public void showLeaderboards(String s, LeaderboardTimeVariant leaderboardTimeVariant0, IViewListener iGameServices$IViewListener0) {
        if(s == null) {
            this.leaderboards.show(iGameServices$IViewListener0);
            return;
        }
        this.leaderboards.get(s).show(leaderboardTimeVariant0, iGameServices$IViewListener0);
    }

    @RunOnUiThread
    public void signout() {
        GoogleAuth.getInstance(this.context).signOut();
    }
}

