package com.androidnative.gms.core;

import android.util.Log;
import com.androidnative.gms.listeners.savedgames.DeleteSnapShotListner;
import com.androidnative.gms.listeners.savedgames.LoadSnapshotsResultListner;
import com.androidnative.gms.listeners.savedgames.OpenSnapshotListner;
import com.androidnative.gms.network.RealTimeMultiplayerController;
import com.androidnative.gms.network.TurnBasedMultiplayerController;
import com.androidnative.gms.utils.AnUtility;
import com.androidnative.gms.utils.Base64;
import com.androidnative.gms.utils.Base64DecoderException;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.multiplayer.ParticipantResult;
import java.util.ArrayList;
import java.util.Arrays;

public class GameClientBridge {
    public static void CancelMatch(String s) {
        TurnBasedMultiplayerController.GetInstance().CancelMatch(s);
    }

    public static void CreateNewSpanshot_Bridge(String s, String s1, String s2, String s3, long v) {
        GameClientManager.GetInstance().createNewSpanshot(s, s1, s2, s3, v);
    }

    public static void DeleteSpanshotByName_Bridge(String s) {
        GoogleApiClient googleApiClient0 = GameClientManager.API();
        Games.Snapshots.open(googleApiClient0, s, true).setResultCallback(new DeleteSnapShotListner());
    }

    public static void DismissMatch(String s) {
        TurnBasedMultiplayerController.GetInstance().DismissMatch(s);
    }

    public static void GetGamesServerAuthCode() {
    }

    public static int GetPlayServicesStatus() {
        return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(AnUtility.GetApplicationContex());
    }

    public static void GetServerAuthCode(String s) {
        GameClientManager.GetInstance().GetServerAuthCode(s);
    }

    public static void LoadSpanshots_Bridge() {
        GoogleApiClient googleApiClient0 = GameClientManager.API();
        Games.Snapshots.load(googleApiClient0, true).setResultCallback(new LoadSnapshotsResultListner());
    }

    public static void OnApplicationPause(boolean z) {
        if(z) {
            GameClientManager.GetInstance().onStop();
            return;
        }
        GameClientManager.GetInstance().onStart();
    }

    public static void OpenSpanshotByName_Bridge(String s) {
        GoogleApiClient googleApiClient0 = GameClientManager.API();
        Games.Snapshots.open(googleApiClient0, s, true).setResultCallback(new OpenSnapshotListner("OnSavedGamePicked"));
    }

    public static void RTMFindMatch(int v, int v1, String[] arr_s) {
        try {
            RealTimeMultiplayerController.GetInstance().findMatch(v, v1, arr_s);
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            Log.d("AndroidNative", "NoClassDefFoundError RTMFindMatch: " + noClassDefFoundError0.getMessage());
        }
    }

    public static void RTMFindMatch(String[] arr_s) {
        try {
            RealTimeMultiplayerController.GetInstance().findMatch(arr_s);
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            Log.d("AndroidNative", "NoClassDefFoundError RTMFindMatch: " + noClassDefFoundError0.getMessage());
        }
    }

    public static void RTM_AcceptInvitation(String s) {
        RealTimeMultiplayerController.GetInstance().acceptInviteToRoom(s);
    }

    public static void RTM_DeclineInvitation(String s) {
        RealTimeMultiplayerController.GetInstance().DeclineInvitation(s);
    }

    public static void RTM_DismissInvitation(String s) {
        RealTimeMultiplayerController.GetInstance().DeclineInvitation(s);
    }

    public static void RTM_SetExclusiveBitMask(int v) {
        RealTimeMultiplayerController.GetInstance().SetExclusiveBitMask(v);
    }

    public static void RTM_SetVariant(int v) {
        RealTimeMultiplayerController.GetInstance().SetVariant(v);
    }

    public static void ResolveSnapshotsConflict_Bridge(int v) {
        GameClientManager.GetInstance().resolveSnapshotsConflict(v);
    }

    public static void ShowSavedGamesUI_Bridge(String s, int v, boolean z, boolean z1) {
        GameClientManager.GetInstance().showSavedGamesUI(s, v, z, z1);
    }

    public static void StartSelectOpponentsView(int v, int v1, boolean z) {
        TurnBasedMultiplayerController.GetInstance().StartSelectOpponentsView(v, v1, z);
    }

    public static void TBM_AcceptInvitation(String s) {
        TurnBasedMultiplayerController.GetInstance().AcceptInvitation(s);
    }

    public static void TBM_CreateMatch(int v, int v1, String[] arr_s) {
        Log.d("AndroidNative", "TBM_CreateMatch");
        Log.d("AndroidNative", "playersIds: " + arr_s);
        ArrayList arrayList0 = arr_s == null ? null : new ArrayList(Arrays.asList(arr_s));
        TurnBasedMultiplayerController.GetInstance().CreateMatch(v, v1, arrayList0);
    }

    public static void TBM_DeclineInvitation(String s) {
        TurnBasedMultiplayerController.GetInstance().DeclineInvitation(s);
    }

    public static void TBM_DismissInvitation(String s) {
        TurnBasedMultiplayerController.GetInstance().DeclineInvitation(s);
    }

    public static void TBM_FinishMatch(String s, String s1, String[] arr_s, int[] arr_v, int[] arr_v1, int[] arr_v2) {
        try {
            ArrayList arrayList0 = new ArrayList();
            int v1 = 0;
            for(int v = 0; v < arr_s.length; ++v) {
                arrayList0.add(new ParticipantResult(arr_s[v], arr_v[v1], arr_v1[v1]));
                ++v1;
            }
            TurnBasedMultiplayerController.GetInstance().FinishMatch(s, Base64.decode(s1), arrayList0);
        }
        catch(Base64DecoderException base64DecoderException0) {
            Log.d("AndroidNative", "TBM_FinishMatch failed: " + base64DecoderException0.getMessage());
            base64DecoderException0.printStackTrace();
        }
    }

    public static void TBM_FinishMatchWithId(String s) {
        TurnBasedMultiplayerController.GetInstance().FinishMatchWithId(s);
    }

    public static void TBM_LeaveMatch(String s) {
        TurnBasedMultiplayerController.GetInstance().LeaveMatch(s);
    }

    public static void TBM_LeaveMatchDuringTurn(String s, String s1) {
        TurnBasedMultiplayerController.GetInstance().LeaveMatchDuringTurn(s, s1);
    }

    public static void TBM_LoadAllMatchesInfo(int v) {
        TurnBasedMultiplayerController.GetInstance().LoadAllMatchesInfo(v);
    }

    public static void TBM_LoadMatchInfo(String s) {
        TurnBasedMultiplayerController.GetInstance().LoadMatch(s);
    }

    public static void TBM_LoadMatchesInfo(int v, int[] arr_v) {
        TurnBasedMultiplayerController.GetInstance().LoadMatchesInfo(v, arr_v);
    }

    public static void TBM_RegisterMatchUpdateListener() {
        TurnBasedMultiplayerController.GetInstance().RegisterMatchUpdateListener();
    }

    public static void TBM_Rematch(String s) {
        TurnBasedMultiplayerController.GetInstance().Rematch(s);
    }

    public static void TBM_SetExclusiveBitMask(int v) {
        TurnBasedMultiplayerController.GetInstance().SetExclusiveBitMask(v);
    }

    public static void TBM_SetVariant(int v) {
        TurnBasedMultiplayerController.GetInstance().SetVariant(v);
    }

    public static void TBM_ShowInbox() {
        TurnBasedMultiplayerController.GetInstance().ShowInbox();
    }

    public static void TBM_TakeTrun(String s, String s1, String s2, String[] arr_s, int[] arr_v, int[] arr_v1, int[] arr_v2) {
        try {
            ArrayList arrayList0 = new ArrayList();
            int v1 = 0;
            for(int v = 0; v < arr_s.length; ++v) {
                arrayList0.add(new ParticipantResult(arr_s[v], arr_v[v1], arr_v1[v1]));
                ++v1;
            }
            if(s2.length() == 0) {
                s2 = null;
            }
            TurnBasedMultiplayerController.GetInstance().TakeTrun(s, Base64.decode(s1), s2, arrayList0);
        }
        catch(Base64DecoderException base64DecoderException0) {
            Log.d("AndroidNative", "TBM_FinishMatch failed: " + base64DecoderException0.getMessage());
            base64DecoderException0.printStackTrace();
        }
    }

    public static void TBM_UnregisterMatchUpdateListener() {
        TurnBasedMultiplayerController.GetInstance().UnregisterMatchUpdateListener();
    }

    public static void acceptInviteToRoom(String s) {
    }

    public static void acceptQuest(String s) {
        try {
            GameClientManager.GetInstance().acceptQuest(s);
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            Log.d("AndroidNative", "NoClassDefFoundError acceptQuest: " + noClassDefFoundError0.getMessage());
        }
    }

    public static void acceptRequests(String s) {
        try {
            GameClientManager.GetInstance().acceptRequests(s);
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            Log.d("AndroidNative", "NoClassDefFoundError acceptRequests: " + noClassDefFoundError0.getMessage());
        }
    }

    public static void clearDefaultAccount() {
        try {
            GameClientManager.GetInstance().clearDefaultAccount();
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            Log.d("AndroidNative", "NoClassDefFoundError clearDefaultAccount: " + noClassDefFoundError0.getMessage());
        }
    }

    public static void dismissRequest(String s) {
        try {
            GameClientManager.GetInstance().dismissRequest(s);
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            Log.d("AndroidNative", "NoClassDefFoundError dismissRequest: " + noClassDefFoundError0.getMessage());
        }
    }

    private static String getStringResourceByName(String s) {
        return AnUtility.GetLauncherActivity().getString(AnUtility.GetLauncherActivity().getResources().getIdentifier(s, "string", "com.playdekgames.android.Ascension"));
    }

    public static void getToken(String s, String s1) {
        try {
            GameClientManager.GetInstance().getToken(s, s1);
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            Log.d("AndroidNative", "NoClassDefFoundError getToken: " + noClassDefFoundError0.getMessage());
        }
    }

    public static void incrementAchievement(String s, String s1) {
        GameClientBridge.incrementAchievementById(GameClientBridge.getStringResourceByName(s), s1);
    }

    public static void incrementAchievementById(String s, String s1) {
        try {
            GameClientManager.GetInstance().incrementAchievement(s, Integer.parseInt(s1));
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            Log.d("AndroidNative", "NoClassDefFoundError incrementAchievementById: " + noClassDefFoundError0.getMessage());
        }
    }

    public static void invalidateToken(String s) {
        try {
            GameClientManager.GetInstance().invalidateToken(s);
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            Log.d("AndroidNative", "NoClassDefFoundError invalidateToken: " + noClassDefFoundError0.getMessage());
        }
    }

    public static void invitePlayers(String s, String s1) {
        try {
            RealTimeMultiplayerController.GetInstance().invitePlayers(((int)Integer.valueOf(s)), ((int)Integer.valueOf(s1)));
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            Log.d("AndroidNative", "NoClassDefFoundError invitePlayers: " + noClassDefFoundError0.getMessage());
        }
    }

    public static void leaveRoom() {
        try {
            RealTimeMultiplayerController.GetInstance().leaveRoom();
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            Log.d("AndroidNative", "NoClassDefFoundError leaveRoom: " + noClassDefFoundError0.getMessage());
        }
    }

    public static void loadAchievements() {
        try {
            GameClientManager.GetInstance().loadAchievements();
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            Log.d("AndroidNative", "NoClassDefFoundError loadAchievements: " + noClassDefFoundError0.getMessage());
        }
    }

    public static void loadConnectedPlayers() {
        try {
            GameClientManager.GetInstance().loadConnectedPlayers();
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            Log.d("AndroidNative", "NoClassDefFoundError loadConnectedPlayers: " + noClassDefFoundError0.getMessage());
        }
    }

    public static void loadEvents() {
        try {
            GameClientManager.GetInstance().loadEvents();
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            Log.d("AndroidNative", "NoClassDefFoundError loadEvents: " + noClassDefFoundError0.getMessage());
        }
    }

    public static void loadGoogleAccountNames() {
        try {
            GameClientManager.GetInstance().loadGoogleAccountNames();
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            Log.d("AndroidNative", "NoClassDefFoundError loadGoogleAccountNames: " + noClassDefFoundError0.getMessage());
        }
    }

    public static void loadLeaderBoards() {
        try {
            GameClientManager.GetInstance().loadLeaderBoards();
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            Log.d("AndroidNative", "NoClassDefFoundError loadLeaderBoards: " + noClassDefFoundError0.getMessage());
        }
    }

    public static void loadLeaderBoardsLocal(String s, int v) {
        try {
            GameClientManager.GetInstance().loadLeaderBoardsLocal(s, v);
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            Log.d("AndroidNative", "NoClassDefFoundError loadLeaderBoards: " + noClassDefFoundError0.getMessage());
        }
    }

    public static void loadPlayerCenteredScores(String s, String s1, String s2, String s3) {
        try {
            GameClientManager.GetInstance().loadPlayerCenteredScores(s, Integer.parseInt(s1), Integer.parseInt(s2), Integer.parseInt(s3));
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            Log.d("AndroidNative", "NoClassDefFoundError loadPlayerCenteredScores: " + noClassDefFoundError0.getMessage());
        }
    }

    public static void loadPlayerInfo(String s) {
        try {
            GameClientManager.GetInstance().loadPlayerInfo(s);
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            Log.d("AndroidNative", "NoClassDefFoundError loadPlayerInfo: " + noClassDefFoundError0.getMessage());
        }
    }

    public static void loadQuests(String s, String s1) {
        try {
            GameClientManager.GetInstance().loadQuests(s, ((int)Integer.valueOf(s1)));
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            Log.d("AndroidNative", "NoClassDefFoundError loadQuests: " + noClassDefFoundError0.getMessage());
        }
    }

    public static void loadTopScores(String s, String s1, String s2, String s3) {
        try {
            GameClientManager.GetInstance().loadTopScores(s, Integer.parseInt(s1), Integer.parseInt(s2), Integer.parseInt(s3));
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            Log.d("AndroidNative", "NoClassDefFoundError loadTopScores: " + noClassDefFoundError0.getMessage());
        }
    }

    public static void playServiceConnect() {
        try {
            GameClientManager.GetInstance().sighIn();
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            Log.d("AndroidNative", "NoClassDefFoundError playServiceConnect: " + noClassDefFoundError0.getMessage());
        }
    }

    public static void playServiceConnect(String s) {
        try {
            GameClientManager.GetInstance().sighIn(s);
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            Log.d("AndroidNative", "NoClassDefFoundError playServiceConnect: " + noClassDefFoundError0.getMessage());
        }
    }

    public static void playServiceDisconnect() {
        try {
            GameClientManager.GetInstance().disconnect();
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            Log.d("AndroidNative", "NoClassDefFoundError playServiceDisconnect: " + noClassDefFoundError0.getMessage());
        }
    }

    public static void playServiceInit(String s) {
        try {
            GameClientManager.GetInstance().InitPlayService(s);
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            Log.d("AndroidNative", "NoClassDefFoundError playServiceInit: " + noClassDefFoundError0.getMessage());
        }
    }

    public static void reportAchievement(String s) {
        GameClientBridge.reportAchievementById(GameClientBridge.getStringResourceByName(s));
    }

    public static void reportAchievementById(String s) {
        try {
            GameClientManager.GetInstance().reportAchievement(s);
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            Log.d("AndroidNative", "NoClassDefFoundError reportAchievementById: " + noClassDefFoundError0.getMessage());
        }
    }

    public static void resetAchievement(String s) {
        try {
            GameClientManager.GetInstance().resetAchievement(s);
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            Log.d("AndroidNative", "NoClassDefFoundError resetAchievement: " + noClassDefFoundError0.getMessage());
        }
    }

    public static void resetAllAchievements() {
        try {
            GameClientManager.GetInstance().resetAllAchievements();
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            Log.d("AndroidNative", "NoClassDefFoundError resetAllAchievements: " + noClassDefFoundError0.getMessage());
        }
    }

    public static void resetLeaderBoard(String s) {
        try {
            GameClientManager.GetInstance().resetLeaderBoard(s);
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            Log.d("AndroidNative", "NoClassDefFoundError GameClientManager.GetInstance().resetLeaderBoard(leaderboardId);: " + noClassDefFoundError0.getMessage());
        }
    }

    public static void revealAchievement(String s) {
        Log.d("AndroidNative", "achievementName: " + s);
        String s1 = GameClientBridge.getStringResourceByName(s);
        Log.d("AndroidNative", "achievementId: " + s1);
        GameClientBridge.revealAchievementById(s1);
    }

    public static void revealAchievementById(String s) {
        try {
            GameClientManager.GetInstance().revealAchievement(s);
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            Log.d("AndroidNative", "NoClassDefFoundError \tGameClientManager.GetInstance().revealAchievement(achievementId);: " + noClassDefFoundError0.getMessage());
        }
    }

    public static void revokeAccessAndDisconnect() {
        try {
            GameClientManager.GetInstance().revokeAccessAndDisconnect();
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            Log.d("AndroidNative", "NoClassDefFoundError revokeAccessAndDisconnect: " + noClassDefFoundError0.getMessage());
        }
    }

    public static void sendDataToAll(String s, String s1, int v) {
        try {
            RealTimeMultiplayerController.GetInstance().sendDataToAll(s, ((int)Integer.valueOf(s1)), v);
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            Log.d("AndroidNative", "NoClassDefFoundError sendDataToAll: " + noClassDefFoundError0.getMessage());
        }
    }

    public static void sendDataToPlayers(String s, String s1, String s2, int v) {
        try {
            RealTimeMultiplayerController.GetInstance().sendDataToPlayers(s, s1, ((int)Integer.valueOf(s2)), v);
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            Log.d("AndroidNative", "NoClassDefFoundError sendDataToPlayers: " + noClassDefFoundError0.getMessage());
        }
    }

    public static void sendGiftRequest(String s, String s1, String s2, String s3, String s4) {
        try {
            GameClientManager.GetInstance().sendGiftRequest(s, s1, s2, s3, s4);
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            Log.d("AndroidNative", "NoClassDefFoundError sendGiftRequest: " + noClassDefFoundError0.getMessage());
        }
    }

    public static void setConnectionParams(String s) {
        GameClientManager.showConnectingPopup = Boolean.parseBoolean(s);
    }

    public static void setStepsImmediate(String s, String s1) {
        try {
            GameClientManager.GetInstance().setStepsImmediate(s, Integer.parseInt(s1));
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            Log.d("AndroidNative", "NoClassDefFoundError setStepsImmediate: " + noClassDefFoundError0.getMessage());
        }
    }

    public static void showAchievementsUI() {
        try {
            GameClientManager.GetInstance().showAchivmentsUI();
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            Log.d("AndroidNative", "NoClassDefFoundError showAchivments: " + noClassDefFoundError0.getMessage());
        }
    }

    public static void showInvitationBox() {
        try {
            RealTimeMultiplayerController.GetInstance().showInvitationBox();
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            Log.d("AndroidNative", "NoClassDefFoundError showInvitationBox: " + noClassDefFoundError0.getMessage());
        }
    }

    public static void showLeaderBoard(String s) {
        try {
            GameClientBridge.showLeaderBoardById(GameClientBridge.getStringResourceByName(s));
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            Log.d("AndroidNative", "NoClassDefFoundError showLeaderBoard" + noClassDefFoundError0.getMessage());
        }
    }

    public static void showLeaderBoardById(String s) {
        try {
            GameClientManager.GetInstance().showLeaderBoardUI(s);
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            Log.d("AndroidNative", "NoClassDefFoundError showLeaderBoardById: " + noClassDefFoundError0.getMessage());
        }
    }

    public static void showLeaderBoards() {
        try {
            GameClientManager.GetInstance().showLeaderBoardsUI();
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            Log.d("AndroidNative", "NoClassDefFoundError showLeaderBoards: " + noClassDefFoundError0.getMessage());
        }
    }

    public static void showRequestAccepDialog() {
        try {
            GameClientManager.GetInstance().showRequestAccepDialog();
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            Log.d("AndroidNative", "NoClassDefFoundError GameClientManager.GetInstance().showRequestAccepDialog();: " + noClassDefFoundError0.getMessage());
        }
    }

    public static void showSelectedQuests(String s) {
        try {
            GameClientManager.GetInstance().showSelectedQuests(s);
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            Log.d("AndroidNative", "NoClassDefFoundError showSelectedQuests: " + noClassDefFoundError0.getMessage());
        }
    }

    public static void showWaitingRoomIntent() {
        try {
            RealTimeMultiplayerController.GetInstance().showWaitingRoomIntent();
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            Log.d("AndroidNative", "NoClassDefFoundError showWaitingRoomIntent: " + noClassDefFoundError0.getMessage());
        }
    }

    public static void signOut() {
        try {
            GameClientManager.GetInstance().signOut();
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            Log.d("AndroidNative", "NoClassDefFoundError clearDefaultAccount: " + noClassDefFoundError0.getMessage());
        }
    }

    public static void submitScore(String s, String s1, String s2) {
        GameClientBridge.submitScoreById(GameClientBridge.getStringResourceByName(s), s1, s2);
    }

    public static void submitScoreById(String s, String s1, String s2) {
        try {
            GameClientManager.GetInstance().submitScore(s, Long.parseLong(s1), s2);
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            Log.d("AndroidNative", "NoClassDefFoundError submitScoreById: " + noClassDefFoundError0.getMessage());
        }
    }

    public static void sumbitEvent(String s, String s1) {
        try {
            GameClientManager.GetInstance().sumbitEvent(s, ((int)Integer.valueOf(s1)));
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            Log.d("AndroidNative", "NoClassDefFoundError sumbitEvent: " + noClassDefFoundError0.getMessage());
        }
    }
}

