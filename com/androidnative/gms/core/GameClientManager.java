package com.androidnative.gms.core;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.androidnative.gms.listeners.games.AchievementsLoadListner;
import com.androidnative.gms.listeners.games.AchievementsUpdateListner;
import com.androidnative.gms.listeners.games.LeaderBoardScoreLoaded;
import com.androidnative.gms.listeners.games.LeaderBoardsLoadedListener;
import com.androidnative.gms.listeners.games.PlayerResultListner;
import com.androidnative.gms.listeners.games.PlayerScoreUpdateListner;
import com.androidnative.gms.listeners.games.ScoreSubmitedListner;
import com.androidnative.gms.listeners.quests.AN_AcceptQuestResultListner;
import com.androidnative.gms.listeners.quests.AN_ClaimMilestoneResult;
import com.androidnative.gms.listeners.quests.AN_EventsLoadListner;
import com.androidnative.gms.listeners.quests.AN_LoadQuestsResult;
import com.androidnative.gms.listeners.quests.AN_QuestUpdateListener;
import com.androidnative.gms.listeners.requests.AN_UpdateRequestsResultListner;
import com.androidnative.gms.listeners.savedgames.OpenSnapshotListner;
import com.androidnative.gms.listeners.savedgames.SnapshotCreateListner;
import com.androidnative.gms.network.RealTimeMultiplayerController;
import com.androidnative.gms.network.TurnBasedMultiplayerController;
import com.androidnative.gms.utils.AnUtility;
import com.androidnative.gms.utils.Base64;
import com.androidnative.gms.utils.Base64DecoderException;
import com.androidnative.gms.utils.PS_Utility;
import com.google.android.gms.auth.GoogleAuthUtil;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.games.Games.GetServerAuthCodeResult;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.quest.Quest;
import com.google.android.gms.games.quest.QuestUpdateListener;
import com.google.android.gms.games.quest.Quests;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.snapshot.Snapshot;
import com.google.android.gms.games.snapshot.SnapshotContents;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult;
import com.google.android.gms.plus.Plus;
import com.unity3d.player.UnityPlayer;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;

public class GameClientManager implements ConnectionCallbacks, OnConnectionFailedListener, QuestUpdateListener {
    public static final int ACHIEVEMENTS_REQUEST = 20001;
    public static final String COMMA = ",";
    private static final String CONNECTION_LISTNER_NAME = "GooglePlayConnection";
    private String ConflictId;
    public static final int GIFT_REQUEST = 20003;
    public static final String GOOGLE_CLOUD_LISTNER_NAME = "GoogleCloudManager";
    public static final String GOOGLE_PLAY_INIVITATION_LISTENER = "GooglePlayInvitationManager";
    public static final String GOOGLE_PLAY_RTM_LISTENER = "GooglePlayRTM";
    public static final String GOOGLE_PLAY_TBM_LISTENER = "GooglePlayTBM";
    public static final String GOOGLE_PlAY_EVENTS_LISTNER_NAME = "GooglePlayEvents";
    public static final String GOOGLE_PlAY_QUESTS_LISTNER_NAME = "GooglePlayQuests";
    public static final String GOOGLE_PlAY_SAVED_GAMES_LISTNER_NAME = "GooglePlaySavedGamesManager";
    public static final int LEADER_BOARDS_REQUEST = 20002;
    public static final String PlAY_SERVICE_LISTNER_NAME = "GooglePlayManager";
    private static final String QUEST_QUERY_SEPARATOR = ",";
    public static final int RC_LIST_SAVED_GAME = 30001;
    public static final int RC_SELECT_PLAYERS = 10000;
    public static final int RC_WAITING_ROOM = 10002;
    public static final int REQUESTS_INBOX_DIALOG = 20004;
    private static int RESULT_CANCELED = 13;
    public static final int RTM_INBOX_RESULT = 10001;
    private static boolean ReconectOnStart = false;
    private static ConnectionResult SavedConnectionResult = null;
    public static final String TAG = "AndroidNative";
    public static final int TBM_INBOX_RESULT = 40001;
    public static final int TB_SELECT_PLAYERS = 40000;
    public static final String UNITY_EOF = "endofline";
    public static final String UNITY_SPLITTER = "|";
    public static final String UNITY_SPLITTER2 = "|%|";
    private static GameClientManager _instance = null;
    private String currentSaveName;
    public static HashMap gameRequestMap = null;
    private static boolean isStarted = false;
    public static ArrayList loadedPlayers = null;
    protected NewGameHelper mHelper;
    ArrayList mRequests;
    private Snapshot s1;
    private Snapshot s2;
    public static boolean showConnectingPopup = true;

    static {
        GameClientManager.loadedPlayers = new ArrayList();
        GameClientManager.gameRequestMap = new HashMap();
        GameClientManager._instance = null;
    }

    public GameClientManager() {
        this.currentSaveName = "";
    }

    public static GoogleApiClient API() {
        return GameClientManager.GetInstance().mHelper.getGoogleApiClient();
    }

    public static String ConvertCloudDataToString(byte[] arr_b) {
        String s = "";
        if(arr_b == null) {
            return "";
        }
        for(int v = 0; v < arr_b.length; ++v) {
            if(v != 0) {
                s = s + ",";
            }
            s = s + ((int)arr_b[v]);
        }
        return s;
    }

    public static byte[] ConvertStringToCloudData(String s) {
        String[] arr_s = s.split("\\,");
        ArrayList arrayList0 = new ArrayList();
        for(int v1 = 0; v1 < arr_s.length; ++v1) {
            arrayList0.add(Byte.valueOf(arr_s[v1]));
        }
        Byte[] arr_byte = (Byte[])arrayList0.toArray(new Byte[arrayList0.size()]);
        byte[] arr_b = new byte[arr_byte.length];
        for(int v = 0; v < arr_byte.length; ++v) {
            arr_b[v] = (byte)arr_byte[v];
        }
        return arr_b;
    }

    public static GameClientManager GetInstance() {
        if(GameClientManager._instance == null) {
            GameClientManager._instance = new GameClientManager();
        }
        return GameClientManager._instance;
    }

    public void GetServerAuthCode(String s) {
        Games.getGamesServerAuthCode(this.mHelper.getGoogleApiClient(), s).setResultCallback(new ResultCallback() {
            @Override  // com.google.android.gms.common.api.ResultCallback
            public void onResult(Result result0) {
                this.onResult(((GetServerAuthCodeResult)result0));
            }

            public void onResult(GetServerAuthCodeResult games$GetServerAuthCodeResult0) {
                StringBuilder stringBuilder0 = new StringBuilder();
                stringBuilder0.append(games$GetServerAuthCodeResult0.getStatus().getStatusCode());
                stringBuilder0.append("|");
                Log.d("AndroidNative", "getGamesServerAuthCode result: " + games$GetServerAuthCodeResult0.getStatus().toString());
                if(games$GetServerAuthCodeResult0.getStatus().isSuccess()) {
                    stringBuilder0.append(games$GetServerAuthCodeResult0.getCode());
                }
                UnityPlayer.UnitySendMessage("GooglePlayManager", "OnGamesServerAuthCodeLoaded", stringBuilder0.toString());
            }
        });
    }

    private void HandleSavedGamesUIResult(int v, int v1, Intent intent0) {
        Log.d("AndroidNative", "HandleSavedGamesUIResult");
        if(intent0 == null) {
            Log.d("AndroidNative", "OnSavedGamesUIClosed");
            UnityPlayer.UnitySendMessage("GooglePlaySavedGamesManager", "OnSavedGamesUIClosed", "");
        }
        else {
            if(intent0.hasExtra("com.google.android.gms.games.SNAPSHOT_METADATA")) {
                SnapshotMetadata snapshotMetadata0 = (SnapshotMetadata)intent0.getParcelableExtra("com.google.android.gms.games.SNAPSHOT_METADATA");
                this.currentSaveName = snapshotMetadata0.getUniqueName();
                this.loadFromSnapshot(snapshotMetadata0);
                Log.d("AndroidNative", "EXTRA_SNAPSHOT_METADATA");
                return;
            }
            if(intent0.hasExtra("com.google.android.gms.games.SNAPSHOT_NEW")) {
                this.printLog("OnNewGameSaveRequest");
                UnityPlayer.UnitySendMessage("GooglePlaySavedGamesManager", "OnNewGameSaveRequest", "");
            }
        }
    }

    public void InitPlayService(String s) {
        this.printLog("Creating New GC");
        if(!GameClientManager.isStarted()) {
            GameClientManager.isStarted = true;
            this.mHelper = new NewGameHelper(this, s);
            RealTimeMultiplayerController.GetInstance().SetGameHelper(this.mHelper);
        }
    }

    public static boolean IsAPIConnected() {
        return GameClientManager.GetInstance().mHelper == null ? false : GameClientManager.GetInstance().mHelper.IsConnected();
    }

    private boolean IsPlayServiceAlavliable() {
        int v = GooglePlayServicesUtil.isGooglePlayServicesAvailable(AnUtility.GetLauncherActivity());
        Log.d("AndroidNative", "IsPlayServiceAlavliable ConnectionResult:" + v);
        return v == 0;
    }

    public boolean IsWaitingForReconnect() {
        return GameClientManager.ReconectOnStart;
    }

    private static void ReportConnectioResult(int v) {
        Log.d("AndroidNative", "************** FINAL: Google Play Connection result: " + v + " ************");
        UnityPlayer.UnitySendMessage("GooglePlayConnection", "OnConnectionResult", Integer.toString(v));
    }

    public static String SerializeParticipantInfo(Participant participant0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(participant0.getParticipantId());
        stringBuilder0.append("|");
        if(participant0.getPlayer() == null) {
            stringBuilder0.append("-1");
        }
        else {
            stringBuilder0.append(participant0.getPlayer().getPlayerId());
            GameClientManager.GetInstance().loadPlayerInfo(participant0.getPlayer().getPlayerId());
        }
        stringBuilder0.append("|");
        stringBuilder0.append(String.valueOf(participant0.getStatus()));
        stringBuilder0.append("|");
        stringBuilder0.append(participant0.getHiResImageUrl());
        stringBuilder0.append("|");
        stringBuilder0.append(participant0.getIconImageUrl());
        stringBuilder0.append("|");
        stringBuilder0.append(participant0.getDisplayName());
        stringBuilder0.append("|");
        if(participant0.getResult() != null) {
            stringBuilder0.append("true|");
            stringBuilder0.append(participant0.getResult().getParticipantId());
            stringBuilder0.append("|");
            stringBuilder0.append(participant0.getResult().getPlacing());
            stringBuilder0.append("|");
            stringBuilder0.append(participant0.getResult().getResult());
            stringBuilder0.append("|0");
            return stringBuilder0.toString();
        }
        stringBuilder0.append("false|0|0|0|0");
        return stringBuilder0.toString();
    }

    public static String SerializeParticipantsInfo(ArrayList arrayList0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        for(Object object0: arrayList0) {
            stringBuilder0.append(GameClientManager.SerializeParticipantInfo(((Participant)object0)));
            stringBuilder0.append("|");
        }
        stringBuilder0.append("endofline");
        return stringBuilder0.toString();
    }

    public void acceptQuest(String s) {
        Games.Quests.accept(this.mHelper.getGoogleApiClient(), s).setResultCallback(new AN_AcceptQuestResultListner());
    }

    public void acceptRequests(String s) {
        if(s != null && s.length() > 0) {
            ArrayList arrayList0 = new ArrayList();
            String[] arr_s = s.split("|");
            for(int v = 0; v < arr_s.length; ++v) {
                String s1 = arr_s[v];
                for(Object object0: this.mRequests) {
                    GameRequest gameRequest0 = (GameRequest)object0;
                    if(gameRequest0.getRequestId().equals(s1)) {
                        arrayList0.add(gameRequest0);
                    }
                }
            }
            if(!arrayList0.isEmpty()) {
                this.acceptRequests(arrayList0);
            }
        }
    }

    public void acceptRequests(ArrayList arrayList0) {
        ArrayList arrayList1 = new ArrayList();
        GameClientManager.gameRequestMap = new HashMap();
        for(Object object0: arrayList0) {
            String s = ((GameRequest)object0).getRequestId();
            arrayList1.add(s);
            GameClientManager.gameRequestMap.put(s, ((GameRequest)object0));
        }
        Games.Requests.acceptRequests(this.mHelper.getGoogleApiClient(), arrayList1).setResultCallback(new AN_UpdateRequestsResultListner());
    }

    public static void addLoadedPlayerId(String s) {
        if(!GameClientManager.loadedPlayers.contains(s)) {
            GameClientManager.loadedPlayers.add(s);
        }
    }

    public void claimQuest(Quest quest0) {
        Games.Quests.claim(this.mHelper.getGoogleApiClient(), quest0.getQuestId(), quest0.getCurrentMilestone().getMilestoneId()).setResultCallback(new AN_ClaimMilestoneResult());
    }

    public void clearDefaultAccount() {
        Log.d("AndroidNative", "clearDefaultAccountAndReconnect");
        this.mHelper.getGoogleApiClient().clearDefaultAccountAndReconnect();
    }

    public void connect() {
        this.mHelper.connect();
    }

    public void createNewSpanshot(String s, String s1, String s2, String s3, long v) {
        Games.Snapshots.open(this.mHelper.getGoogleApiClient(), s, true).setResultCallback(new SnapshotCreateListner(s, s1, s2, s3, v));
    }

    public void disconnect() {
        Log.d("AndroidNative", "Disconnected from play service");
        this.mHelper.disconnect();
    }

    public void dismissRequest(String s) {
        if(s != null && s.length() > 0) {
            ArrayList arrayList0 = new ArrayList();
            String[] arr_s = s.split("|");
            for(int v = 0; v < arr_s.length; ++v) {
                String s1 = arr_s[v];
                for(Object object0: this.mRequests) {
                    GameRequest gameRequest0 = (GameRequest)object0;
                    if(gameRequest0.getRequestId().equals(s1)) {
                        arrayList0.add(gameRequest0);
                    }
                }
            }
            if(!arrayList0.isEmpty()) {
                this.dismissRequest(arrayList0);
            }
        }
    }

    public void dismissRequest(ArrayList arrayList0) {
        ArrayList arrayList1 = new ArrayList();
        GameClientManager.gameRequestMap = new HashMap();
        for(Object object0: arrayList0) {
            String s = ((GameRequest)object0).getRequestId();
            arrayList1.add(s);
            GameClientManager.gameRequestMap.put(s, ((GameRequest)object0));
        }
        Games.Requests.dismissRequests(this.mHelper.getGoogleApiClient(), arrayList1).setResultCallback(new AN_UpdateRequestsResultListner());
    }

    public int[] getQuestSelectors(String s) {
        int[] arr_v = new int[0];
        if(s != null && s.length() > 0) {
            String[] arr_s = s.split(",");
            arr_v = new int[arr_s.length];
            int v1 = 0;
            for(int v = 0; v < arr_s.length; ++v) {
                arr_v[v1] = (int)Integer.valueOf(arr_s[v]);
                ++v1;
            }
        }
        return arr_v;
    }

    public void getToken(String s, String s1) {
        new AsyncTask() {
            @Override  // android.os.AsyncTask
            protected Object doInBackground(Object[] arr_object) {
                return this.doInBackground(((Void[])arr_object));
            }

            protected Void doInBackground(Void[] arr_void) {
                String s;
                try {
                    s = GoogleAuthUtil.getToken(AnUtility.GetLauncherActivity(), s, s1);
                }
                catch(Exception exception0) {
                    Log.d("AndroidNative", exception0.getMessage());
                    s = "";
                }
                UnityPlayer.UnitySendMessage("GooglePlayManager", "OnTokenLoaded", s);
                return null;
            }
        }.execute(new Void[]{null});
    }

    public void incrementAchievement(String s, int v) {
        Games.Achievements.incrementImmediate(this.mHelper.getGoogleApiClient(), s, v).setResultCallback(new AchievementsUpdateListner());
    }

    public void invalidateToken(String s) {
        GoogleAuthUtil.invalidateToken(AnUtility.GetLauncherActivity(), s);
    }

    public static boolean isPlayerLoaded(String s) {
        return GameClientManager.loadedPlayers.contains(s);
    }

    public static boolean isStarted() {
        return GameClientManager.isStarted;
    }

    public void loadAchievements() {
        this.loadAchievements(true);
    }

    public void loadAchievements(boolean z) {
        Games.Achievements.load(this.mHelper.getGoogleApiClient(), z).setResultCallback(new AchievementsLoadListner());
    }

    public void loadConnectedPlayers() {
        Games.Players.loadConnectedPlayers(this.mHelper.getGoogleApiClient(), true).setResultCallback(new PlayerResultListner());
    }

    public void loadEvents() {
        Games.Events.load(this.mHelper.getGoogleApiClient(), true).setResultCallback(new AN_EventsLoadListner());
    }

    private void loadFromSnapshot(SnapshotMetadata snapshotMetadata0) {
        if(snapshotMetadata0 != null && snapshotMetadata0.getUniqueName() != null) {
            Log.i("AndroidNative", "Opening snapshot by metadata: " + snapshotMetadata0);
            Games.Snapshots.open(this.mHelper.getGoogleApiClient(), snapshotMetadata0).setResultCallback(new OpenSnapshotListner("OnSavedGamePicked"));
            return;
        }
        Log.i("AndroidNative", "Opening snapshot by name: " + this.currentSaveName);
        Games.Snapshots.open(this.mHelper.getGoogleApiClient(), this.currentSaveName, true).setResultCallback(new OpenSnapshotListner("OnSavedGamePicked"));
    }

    public void loadGoogleAccountNames() {
        AccountManager accountManager0 = AccountManager.get(AnUtility.GetLauncherActivity());
        StringBuilder stringBuilder0 = new StringBuilder();
        Account[] arr_account = accountManager0.getAccountsByType("com.google");
        for(int v = 0; v < arr_account.length; ++v) {
            stringBuilder0.append(arr_account[v].name);
            stringBuilder0.append("|");
        }
        stringBuilder0.append("endofline");
        UnityPlayer.UnitySendMessage("GooglePlayManager", "OnAccountsLoaded", stringBuilder0.toString());
    }

    public void loadLeaderBoards() {
        Games.Leaderboards.loadLeaderboardMetadata(this.mHelper.getGoogleApiClient(), true).setResultCallback(new LeaderBoardsLoadedListener());
    }

    public void loadLeaderBoardsLocal(String s, int v) {
        Log.d("AndroidNative", "loadLeaderBoardsLocal: leaderboardId " + s + " requestId " + v);
        Games.Leaderboards.loadCurrentPlayerLeaderboardScore(this.mHelper.getGoogleApiClient(), s, 2, 0).setResultCallback(new PlayerScoreUpdateListner(2, 0, s, v));
        Games.Leaderboards.loadCurrentPlayerLeaderboardScore(this.mHelper.getGoogleApiClient(), s, 2, 1).setResultCallback(new PlayerScoreUpdateListner(2, 1, s, v));
        Games.Leaderboards.loadCurrentPlayerLeaderboardScore(this.mHelper.getGoogleApiClient(), s, 1, 0).setResultCallback(new PlayerScoreUpdateListner(1, 0, s, v));
        Games.Leaderboards.loadCurrentPlayerLeaderboardScore(this.mHelper.getGoogleApiClient(), s, 1, 1).setResultCallback(new PlayerScoreUpdateListner(1, 1, s, v));
        Games.Leaderboards.loadCurrentPlayerLeaderboardScore(this.mHelper.getGoogleApiClient(), s, 0, 0).setResultCallback(new PlayerScoreUpdateListner(0, 0, s, v));
        Games.Leaderboards.loadCurrentPlayerLeaderboardScore(this.mHelper.getGoogleApiClient(), s, 0, 1).setResultCallback(new PlayerScoreUpdateListner(0, 1, s, v));
    }

    public void loadPlayerCenteredScores(String s, int v, int v1, int v2) {
        Log.d("AndroidNative", "loadPlayerCenteredScores");
        Log.d("AndroidNative", Integer.toString(v1));
        Log.d("AndroidNative", Integer.toString(v));
        Games.Leaderboards.loadPlayerCenteredScores(this.mHelper.getGoogleApiClient(), s, v, v1, v2, true).setResultCallback(new LeaderBoardScoreLoaded(v, v1, s));
    }

    public void loadPlayerInfo(String s) {
        if(!GameClientManager.isPlayerLoaded(s)) {
            GameClientManager.addLoadedPlayerId(s);
            Log.d("AndroidNative", "Start to loadPlayerInfo PlayerID:" + s);
            Games.Players.loadPlayer(this.mHelper.getGoogleApiClient(), s).setResultCallback(new PlayerResultListner());
        }
    }

    public void loadQuests(String s, int v) {
        Games.Quests.load(this.mHelper.getGoogleApiClient(), this.getQuestSelectors(s), v, true).setResultCallback(new AN_LoadQuestsResult());
    }

    public void loadTopScores(String s, int v, int v1, int v2) {
        Games.Leaderboards.loadTopScores(this.mHelper.getGoogleApiClient(), s, v, v1, v2, true).setResultCallback(new LeaderBoardScoreLoaded(v, v1, s));
    }

    public void onActivityResult(int v, int v1, Intent intent0) {
        Log.d("AndroidNative", "GCM::onActivityResult request " + v + " response " + v1 + " data " + intent0);
        if(intent0 != null) {
            Quest quest0 = (Quest)intent0.getParcelableExtra("quest");
            if(quest0 != null) {
                this.claimQuest(quest0);
            }
        }
        switch(v) {
            case 20001: {
                Log.d("AndroidNative", "ACHIEVEMENTS_REQUEST returned");
                break;
            }
            case 20003: {
                Log.d("AndroidNative", "Gift result code " + v1);
                UnityPlayer.UnitySendMessage("GooglePlayManager", "OnGiftSendResult", v1);
                break;
            }
            case 20004: {
                Log.d("AndroidNative", "GCM REQUESTS_INBOX_DIALOG");
                if(v1 == -1 && intent0 != null) {
                    Log.d("AndroidNative", "accepting requests");
                    this.acceptRequests(Games.Requests.getGameRequestsFromInboxResponse(intent0));
                }
                UnityPlayer.UnitySendMessage("GooglePlayManager", "OnRequestsInboxDialogDismissed", "");
                break;
            }
            case 30001: {
                this.HandleSavedGamesUIResult(30001, v1, intent0);
            }
        }
        RealTimeMultiplayerController.GetInstance().onActivityResult(v, v1, intent0);
        TurnBasedMultiplayerController.GetInstance().onActivityResult(v, v1, intent0);
        GameInvitationManager.GetInstance().onActivityResult(v, v1, intent0);
        AppInvitesController.onActivityResult(v, v1, intent0);
        this.mHelper.onActivityResult(v, v1, intent0);
    }

    public void onActivityResultDiconnectCheck(int v, int v1, Intent intent0) {
        Log.d("AndroidNative", "GCM::onActivityResultDiconnectCheck");
        Log.d("AndroidNative", "GamesActivityResultCodes response " + v1);
        if(v1 == 10001) {
            Log.d("AndroidNative", "GamesActivityResultCodes.RESULT_RECONNECT_REQUIRED");
            Log.d("AndroidNative", "Disconnecting from play service...");
            UnityPlayer.UnitySendMessage("GooglePlayConnection", "OnPlayServiceDisconnected", "");
            GameClientManager.ReconectOnStart = false;
            this.disconnect();
        }
    }

    @Override  // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public void onConnected(Bundle bundle0) {
        String s1;
        Log.d("AndroidNative", "GoogleApiClient connected");
        GooglePlaySupportActivity.FinishActivity();
        StringBuilder stringBuilder0 = new StringBuilder();
        Player player0 = Games.Players.getCurrentPlayer(this.mHelper.getGoogleApiClient());
        stringBuilder0.append(player0.getPlayerId());
        stringBuilder0.append("|");
        stringBuilder0.append(player0.getDisplayName());
        stringBuilder0.append("|");
        stringBuilder0.append(player0.getHiResImageUrl());
        stringBuilder0.append("|");
        stringBuilder0.append(player0.getIconImageUrl());
        stringBuilder0.append("|");
        if(player0.hasIconImage()) {
            stringBuilder0.append(1);
        }
        else {
            stringBuilder0.append(0);
        }
        stringBuilder0.append("|");
        if(player0.hasHiResImage()) {
            stringBuilder0.append(1);
        }
        else {
            stringBuilder0.append(0);
        }
        stringBuilder0.append("|");
        try {
            String s = Games.getCurrentAccountName(this.mHelper.getGoogleApiClient());
            stringBuilder0.append(s);
            Log.d("AndroidNative", "accountName " + s);
        }
        catch(Exception exception0) {
            stringBuilder0.append("");
            Log.d("AndroidNative", "failed to get accountName");
            exception0.printStackTrace();
        }
        UnityPlayer.UnitySendMessage("GooglePlayManager", "OnPlayerDataLoaded", stringBuilder0.toString());
        this.mRequests = Games.Requests.getGameRequestsFromBundle(bundle0);
        Log.d("AndroidNative", "onConnected: connection hint has " + this.mRequests.size() + " request(s)");
        if(this.mRequests.isEmpty()) {
            UnityPlayer.UnitySendMessage("GooglePlayManager", "OnGameRequestsLoaded", "");
        }
        else {
            StringBuilder stringBuilder1 = new StringBuilder();
            for(Object object0: this.mRequests) {
                GameRequest gameRequest0 = (GameRequest)object0;
                stringBuilder1.append(gameRequest0.getRequestId());
                stringBuilder1.append("|");
                try {
                    s1 = new String(gameRequest0.getData(), "UTF-8");
                }
                catch(UnsupportedEncodingException unsupportedEncodingException0) {
                    unsupportedEncodingException0.printStackTrace();
                    s1 = "";
                }
                stringBuilder1.append(s1);
                stringBuilder1.append("|");
                stringBuilder1.append(gameRequest0.getExpirationTimestamp());
                stringBuilder1.append("|");
                stringBuilder1.append(gameRequest0.getCreationTimestamp());
                stringBuilder1.append("|");
                stringBuilder1.append(gameRequest0.getSender().getPlayerId());
                stringBuilder1.append("|");
                stringBuilder1.append(gameRequest0.getType());
                stringBuilder1.append("|");
            }
            stringBuilder1.append("endofline");
            UnityPlayer.UnitySendMessage("GooglePlayManager", "OnGameRequestsLoaded", stringBuilder1.toString());
        }
        GameClientManager.ReportConnectioResult(0);
        GameInvitationManager.GetInstance().onConnected(bundle0);
        Games.Quests.registerQuestUpdateListener(this.mHelper.getGoogleApiClient(), new AN_QuestUpdateListener());
        Log.d("AndroidNative", "setViewForPopups");
        Games.setViewForPopups(GameClientManager.API(), AnUtility.GetLauncherActivity().getWindow().getDecorView());
        Log.d("AndroidNative", "AN_QuestUpdateListener registred");
        GooglePlaySupportActivity.PlayServiceReconnectFinished();
    }

    @Override  // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public void onConnectionFailed(ConnectionResult connectionResult0) {
        GooglePlaySupportActivity.FinishActivity();
        PS_Utility.PrintGooglePlayConnectionFailedResult(connectionResult0);
        if(connectionResult0.hasResolution()) {
            try {
                Handler handler0 = new Handler();
                GameClientManager.SavedConnectionResult = connectionResult0;
                handler0.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        GameClientManager.this.mHelper.resolveConnection(GameClientManager.SavedConnectionResult);
                    }
                }, 1000L);
            }
            catch(Exception exception0) {
                exception0.printStackTrace();
                Log.d("AndroidNative", "GooglePlaySupportActivity::onActivityResult Error: " + exception0.getMessage());
            }
        }
        else {
            GameClientManager.ReportConnectioResult(connectionResult0.getErrorCode());
        }
        if(connectionResult0.getErrorCode() == 2) {
            this.mHelper.reconnect();
        }
    }

    @Override  // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public void onConnectionSuspended(int v) {
        GooglePlaySupportActivity.FinishActivity();
        Log.d("AndroidNative", "onConnectionSuspended");
        Log.d("AndroidNative", "GoogleApiClient connection suspended");
    }

    public void onQuestCompleted(Quest quest0) {
        Log.d("AndroidNative", "onQuestCompleted: ");
    }

    public void onSignInFailed(int v) {
        if(v == 0) {
            v = 13;
        }
        Log.d("AndroidNative", "onSignInFailed with code: " + v);
        GooglePlaySupportActivity.FinishActivity();
        GameClientManager.ReportConnectioResult(v);
    }

    public void onStart() {
        if(GameClientManager.ReconectOnStart) {
            Log.d("AndroidNative", "Reconnection on start");
            this.connect();
            return;
        }
        Log.d("AndroidNative", "Skipping Reconnection on start");
    }

    public void onStop() {
        NewGameHelper newGameHelper0 = this.mHelper;
        if(newGameHelper0 == null) {
            return;
        }
        boolean z = newGameHelper0.IsConnected();
        GameClientManager.ReconectOnStart = z;
        if(z) {
            if(!RealTimeMultiplayerController.GetInstance().isRealTimeActive()) {
                RealTimeMultiplayerController.GetInstance().OnStop();
                this.disconnect();
                return;
            }
            GameClientManager.ReconectOnStart = false;
        }
    }

    private void printLog(String s) {
        Log.d("AndroidNative", "GameClientManager: " + s);
    }

    public void reportAchievement(String s) {
        Games.Achievements.unlockImmediate(this.mHelper.getGoogleApiClient(), s).setResultCallback(new AchievementsUpdateListner());
    }

    public void resetAchievement(String s) {
        new AsyncTask() {
            @Override  // android.os.AsyncTask
            protected Object doInBackground(Object[] arr_object) {
                return this.doInBackground(((String[])arr_object));
            }

            protected String doInBackground(String[] arr_s) {
                try {
                    String s = GoogleAuthUtil.getToken(AnUtility.GetLauncherActivity(), Games.getCurrentAccountName(GameClientManager.this.mHelper.getGoogleApiClient()), "oauth2:" + Games.SCOPE_GAMES.zzaft());
                    DefaultHttpClient defaultHttpClient0 = new DefaultHttpClient();
                    String s1 = "https://www.googleapis.com/games/v1management/achievements/" + arr_s[0] + "/reset?access_token=" + s;
                    ((HttpClient)defaultHttpClient0).execute(((HttpUriRequest)new HttpPost(s1)));
                    Log.d("AndroidNative", s1);
                }
                catch(Exception exception0) {
                    Log.d("AndroidNative", exception0.getMessage() + exception0);
                }
                GameClientManager.GetInstance().loadAchievements();
                Log.d("AndroidNative", "resetAchievement done");
                return null;
            }
        }.execute(new String[]{s});
    }

    public void resetAllAchievements() {
        new AsyncTask() {
            @Override  // android.os.AsyncTask
            protected Object doInBackground(Object[] arr_object) {
                return this.doInBackground(((String[])arr_object));
            }

            protected String doInBackground(String[] arr_s) {
                try {
                    String s = GoogleAuthUtil.getToken(AnUtility.GetLauncherActivity(), Games.getCurrentAccountName(GameClientManager.this.mHelper.getGoogleApiClient()), "oauth2:" + Games.SCOPE_GAMES.zzaft());
                    ((HttpClient)new DefaultHttpClient()).execute(((HttpUriRequest)new HttpPost("https://www.googleapis.com/games/v1management/achievements/reset?access_token=" + s)));
                    Log.d("AndroidNative", "https://www.googleapis.com/games/v1management/achievements/reset?access_token=" + s);
                }
                catch(Exception exception0) {
                    Log.d("AndroidNative", exception0.getMessage() + exception0);
                }
                GameClientManager.GetInstance().loadAchievements();
                Log.d("AndroidNative", "resetAllAchievements done");
                return null;
            }
        }.execute(new String[]{""});
    }

    public void resetLeaderBoard(String s) {
        new AsyncTask() {
            @Override  // android.os.AsyncTask
            protected Object doInBackground(Object[] arr_object) {
                return this.doInBackground(((String[])arr_object));
            }

            protected String doInBackground(String[] arr_s) {
                try {
                    String s = GoogleAuthUtil.getToken(AnUtility.GetLauncherActivity(), Games.getCurrentAccountName(GameClientManager.this.mHelper.getGoogleApiClient()), "oauth2:" + Games.SCOPE_GAMES.zzaft());
                    ((HttpClient)new DefaultHttpClient()).execute(((HttpUriRequest)new HttpPost("https://www.googleapis.com/games/v1management/leaderboards/" + arr_s[0] + "/scores/reset?access_token=" + s)));
                }
                catch(Exception exception0) {
                    Log.d("AndroidNative", exception0.getMessage() + exception0);
                }
                Log.d("AndroidNative", "resetLeaderBoard done");
                return null;
            }
        }.execute(new String[]{s});
    }

    public void resolveSnapshotsConflict(int v) {
        Games.Snapshots.resolveConflict(this.mHelper.getGoogleApiClient(), this.ConflictId, (v == 0 ? this.s1 : this.s2)).setResultCallback(new OpenSnapshotListner("OnSavedGamePicked"));
    }

    public void revealAchievement(String s) {
        Games.Achievements.revealImmediate(this.mHelper.getGoogleApiClient(), s).setResultCallback(new AchievementsUpdateListner());
    }

    public void revokeAccessAndDisconnect() {
        Plus.AccountApi.revokeAccessAndDisconnect(this.mHelper.getGoogleApiClient());
    }

    public void sendGiftRequest(String s, String s1, String s2, String s3, String s4) {
        try {
            byte[] arr_b = Base64.decode(s3);
            Bitmap bitmap0 = BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length);
            GooglePlaySupportActivity.startProxyForResult(Games.Requests.getSendIntent(this.mHelper.getGoogleApiClient(), ((int)Integer.valueOf(s)), s1.getBytes(), ((int)Integer.valueOf(s2)), bitmap0, s4), 20003);
            Log.d("AndroidNative", "20003");
        }
        catch(Base64DecoderException base64DecoderException0) {
            UnityPlayer.UnitySendMessage("GooglePlayManager", "OnGiftSendResult", "0");
            Log.d("AndroidNative", "sendGiftRequest: failed");
            base64DecoderException0.printStackTrace();
        }
    }

    public void setStepsImmediate(String s, int v) {
        Games.Achievements.setStepsImmediate(this.mHelper.getGoogleApiClient(), s, v).setResultCallback(new AchievementsUpdateListner());
    }

    public void showAchivmentsUI() {
        GooglePlaySupportActivity.startProxyForResult(Games.Achievements.getAchievementsIntent(this.mHelper.getGoogleApiClient()), 20001);
    }

    public void showAlert(String s) {
    }

    public void showAlert(String s, String s1) {
    }

    public void showLeaderBoardUI(String s) {
        GooglePlaySupportActivity.startProxyForResult(Games.Leaderboards.getLeaderboardIntent(this.mHelper.getGoogleApiClient(), s), 20002);
    }

    public void showLeaderBoardsUI() {
        GooglePlaySupportActivity.startProxyForResult(Games.Leaderboards.getAllLeaderboardsIntent(this.mHelper.getGoogleApiClient()), 20002);
    }

    public void showQuest(String s) {
        GooglePlaySupportActivity.startProxyForResult(Games.Quests.getQuestIntent(this.mHelper.getGoogleApiClient(), s), 0);
    }

    public void showQuests() {
        GooglePlaySupportActivity.startProxyForResult(Games.Quests.getQuestsIntent(this.mHelper.getGoogleApiClient(), Quests.SELECT_ALL_QUESTS), 0);
    }

    public void showRequestAccepDialog() {
        GooglePlaySupportActivity.startProxyForResult(Games.Requests.getInboxIntent(this.mHelper.getGoogleApiClient()), 20004);
    }

    public void showSavedGamesUI(String s, int v, boolean z, boolean z1) {
        GooglePlaySupportActivity.startProxyForResult(Games.Snapshots.getSelectSnapshotIntent(this.mHelper.getGoogleApiClient(), "See My Saves", z, z1, v), 30001);
    }

    public void showSelectedQuests(String s) {
        GooglePlaySupportActivity.startProxyForResult(Games.Quests.getQuestsIntent(this.mHelper.getGoogleApiClient(), this.getQuestSelectors(s)), 0);
    }

    public void sighIn() {
        if(GameClientManager.isStarted && this.mHelper != null) {
            if(!this.IsPlayServiceAlavliable()) {
                this.onSignInFailed(GameClientManager.RESULT_CANCELED);
                return;
            }
            this.mHelper.sighIn();
        }
    }

    public void sighIn(String s) {
        if(GameClientManager.isStarted && this.mHelper != null) {
            if(!this.IsPlayServiceAlavliable()) {
                this.onSignInFailed(GameClientManager.RESULT_CANCELED);
                return;
            }
            this.mHelper.sighIn(s);
        }
    }

    public void signOut() {
        Log.d("AndroidNative", "Google Play Services Sign Out");
        Games.signOut(this.mHelper.getGoogleApiClient());
        this.mHelper.getGoogleApiClient().disconnect();
    }

    public void snedConflict(OpenSnapshotResult snapshots$OpenSnapshotResult0) {
        this.s1 = snapshots$OpenSnapshotResult0.getSnapshot();
        this.s2 = snapshots$OpenSnapshotResult0.getConflictingSnapshot();
        this.ConflictId = snapshots$OpenSnapshotResult0.getConflictId();
        try {
            String s = "";
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append(this.s1.getMetadata().getTitle());
            stringBuilder0.append("|");
            stringBuilder0.append(this.s1.getMetadata().getLastModifiedTimestamp());
            stringBuilder0.append("|");
            stringBuilder0.append(this.s1.getMetadata().getDescription());
            stringBuilder0.append("|");
            stringBuilder0.append(this.s1.getMetadata().getCoverImageUrl());
            stringBuilder0.append("|");
            stringBuilder0.append(this.s1.getMetadata().getPlayedTime());
            stringBuilder0.append("|");
            SnapshotContents snapshotContents0 = this.s1.getSnapshotContents();
            stringBuilder0.append((snapshotContents0 == null ? "" : Base64.encode(snapshotContents0.readFully())));
            stringBuilder0.append("|");
            stringBuilder0.append(this.s2.getMetadata().getTitle());
            stringBuilder0.append("|");
            stringBuilder0.append(this.s2.getMetadata().getLastModifiedTimestamp());
            stringBuilder0.append("|");
            stringBuilder0.append(this.s2.getMetadata().getDescription());
            stringBuilder0.append("|");
            stringBuilder0.append(this.s2.getMetadata().getCoverImageUrl());
            stringBuilder0.append("|");
            stringBuilder0.append(this.s2.getMetadata().getPlayedTime());
            stringBuilder0.append("|");
            SnapshotContents snapshotContents1 = this.s2.getSnapshotContents();
            if(snapshotContents1 != null) {
                s = Base64.encode(snapshotContents1.readFully());
            }
            stringBuilder0.append(s);
            UnityPlayer.UnitySendMessage("GooglePlaySavedGamesManager", "OnConflict", stringBuilder0.toString());
        }
        catch(IOException iOException0) {
            Log.d("AndroidNative", "GCM: snedConflict Exception:");
            iOException0.printStackTrace();
        }
    }

    public void submitScore(String s, long v, String s1) {
        Log.d("AndroidNative", "submitScore leaderboardId: " + s + " score: " + v);
        Games.Leaderboards.submitScoreImmediate(this.mHelper.getGoogleApiClient(), s, v, s1).setResultCallback(new ScoreSubmitedListner(s));
    }

    public void sumbitEvent(String s, int v) {
        Games.Events.increment(this.mHelper.getGoogleApiClient(), s, v);
    }

    public void updateQuest(Quest quest0) {
        UnityPlayer.UnitySendMessage("GooglePlayQuests", "OnGPQuestUpdated", quest0.getQuestId() + "|" + quest0.getName() + "|" + quest0.getDescription() + "|" + quest0.getBannerImageUrl() + "|" + quest0.getIconImageUrl() + "|" + quest0.getState() + "|" + quest0.getLastUpdatedTimestamp() + "|" + quest0.getAcceptedTimestamp() + "|" + quest0.getEndTimestamp() + "|" + new String(quest0.getCurrentMilestone().getCompletionRewardData()) + "|" + quest0.getCurrentMilestone().getCurrentProgress() + "|" + quest0.getCurrentMilestone().getTargetProgress());
    }
}

