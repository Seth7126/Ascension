package com.androidnative.gms.network;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.androidnative.gms.core.GameClientManager;
import com.androidnative.gms.core.GooglePlaySupportActivity;
import com.androidnative.gms.listeners.tbm.AN_OnCancelMatchResult;
import com.androidnative.gms.listeners.tbm.AN_OnInvitationAcceptedCallback;
import com.androidnative.gms.listeners.tbm.AN_OnLeaveMatchResult;
import com.androidnative.gms.listeners.tbm.AN_OnLoadMatchResult;
import com.androidnative.gms.listeners.tbm.AN_OnLoadMatchesResult;
import com.androidnative.gms.listeners.tbm.AN_OnMatchInitiatedCallback;
import com.androidnative.gms.listeners.tbm.AN_OnTurnBasedMatchUpdateReceivedListener;
import com.androidnative.gms.listeners.tbm.AN_OnTurnResult;
import com.androidnative.gms.listeners.tbm.AN_OnUpdateMatchResult;
import com.androidnative.gms.utils.Base64;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.multiplayer.ParticipantResult;
import com.google.android.gms.games.multiplayer.realtime.RoomConfig;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchConfig.Builder;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchConfig;
import com.unity3d.player.UnityPlayer;
import java.util.ArrayList;
import java.util.List;

public class TurnBasedMultiplayerController {
    private static int ExclusiveBitMask = 0;
    private static int MatchVeriant = -1;
    private static TurnBasedMultiplayerController _instance;

    static {
    }

    public void AcceptInvitation(String s) {
        Log.d("AndroidNative", "AcceptInvitation " + s);
        Games.TurnBasedMultiplayer.acceptInvitation(GameClientManager.API(), s).setResultCallback(new AN_OnInvitationAcceptedCallback(s));
    }

    public void CancelMatch(String s) {
        Log.d("AndroidNative", "CancelMatch " + s);
        Games.TurnBasedMultiplayer.cancelMatch(GameClientManager.API(), s).setResultCallback(new AN_OnCancelMatchResult());
    }

    public void CreateMatch(int v, int v1, ArrayList arrayList0) {
        Log.d("AndroidNative", "Create Turn-Based Match: min players " + v + " maxPlayers " + v1);
        if(arrayList0 != null) {
            for(Object object0: arrayList0) {
                Log.d("AndroidNative", "Invited Player ID: " + ((String)object0));
            }
        }
        Bundle bundle0 = RoomConfig.createAutoMatchCriteria(v, v1, ((long)TurnBasedMultiplayerController.ExclusiveBitMask));
        TurnBasedMatchConfig.Builder turnBasedMatchConfig$Builder0 = TurnBasedMatchConfig.builder();
        if(v != 0 && v1 != 0) {
            turnBasedMatchConfig$Builder0.setAutoMatchCriteria(bundle0);
        }
        turnBasedMatchConfig$Builder0.setVariant(TurnBasedMultiplayerController.MatchVeriant);
        if(arrayList0 != null) {
            turnBasedMatchConfig$Builder0.addInvitedPlayers(arrayList0);
        }
        TurnBasedMatchConfig turnBasedMatchConfig0 = turnBasedMatchConfig$Builder0.build();
        Games.TurnBasedMultiplayer.createMatch(GameClientManager.API(), turnBasedMatchConfig0).setResultCallback(new AN_OnMatchInitiatedCallback());
    }

    public void DeclineInvitation(String s) {
        Log.d("AndroidNative", "DeclineInvitation " + s);
        Games.TurnBasedMultiplayer.declineInvitation(GameClientManager.API(), s);
    }

    public void DismissInvitation(String s) {
        Log.d("AndroidNative", "DismissInvitation " + s);
        Games.TurnBasedMultiplayer.dismissInvitation(GameClientManager.API(), s);
    }

    public void DismissMatch(String s) {
        Log.d("AndroidNative", "DismissMatch " + s);
        Games.TurnBasedMultiplayer.dismissMatch(GameClientManager.API(), s);
    }

    public void FinishMatch(String s, byte[] arr_b, List list0) {
        Log.d("AndroidNative", "FinishMatch hard code" + s);
        for(Object object0: list0) {
            Log.d("AndroidNative", "getParticipantId " + ((ParticipantResult)object0).getParticipantId() + " getResult " + ((ParticipantResult)object0).getResult() + " getPlacing " + ((ParticipantResult)object0).getPlacing());
        }
        Games.TurnBasedMultiplayer.finishMatch(GameClientManager.API(), s, arr_b, list0).setResultCallback(new AN_OnUpdateMatchResult());
    }

    public void FinishMatchWithId(String s) {
        Games.TurnBasedMultiplayer.finishMatch(GameClientManager.API(), s).setResultCallback(new AN_OnUpdateMatchResult());
    }

    public static TurnBasedMultiplayerController GetInstance() {
        if(TurnBasedMultiplayerController._instance == null) {
            TurnBasedMultiplayerController._instance = new TurnBasedMultiplayerController();
        }
        return TurnBasedMultiplayerController._instance;
    }

    public static String GetMatchString(TurnBasedMatch turnBasedMatch0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(turnBasedMatch0.getMatchId());
        stringBuilder0.append("|");
        stringBuilder0.append(turnBasedMatch0.getRematchId());
        stringBuilder0.append("|");
        stringBuilder0.append(turnBasedMatch0.getDescription());
        stringBuilder0.append("|");
        stringBuilder0.append(turnBasedMatch0.getAvailableAutoMatchSlots());
        stringBuilder0.append("|");
        stringBuilder0.append(turnBasedMatch0.getCreationTimestamp());
        stringBuilder0.append("|");
        stringBuilder0.append(turnBasedMatch0.getCreatorId());
        stringBuilder0.append("|");
        stringBuilder0.append(turnBasedMatch0.getLastUpdatedTimestamp());
        stringBuilder0.append("|");
        stringBuilder0.append(turnBasedMatch0.getLastUpdaterId());
        stringBuilder0.append("|");
        stringBuilder0.append(turnBasedMatch0.getMatchNumber());
        stringBuilder0.append("|");
        stringBuilder0.append(turnBasedMatch0.getStatus());
        stringBuilder0.append("|");
        stringBuilder0.append(turnBasedMatch0.getTurnStatus());
        stringBuilder0.append("|");
        stringBuilder0.append(turnBasedMatch0.canRematch());
        stringBuilder0.append("|");
        stringBuilder0.append(turnBasedMatch0.getVariant());
        stringBuilder0.append("|");
        stringBuilder0.append(turnBasedMatch0.getVersion());
        stringBuilder0.append("|");
        byte[] arr_b = turnBasedMatch0.getData();
        String s = "";
        stringBuilder0.append((arr_b == null ? "" : Base64.encode(arr_b)));
        stringBuilder0.append("|");
        byte[] arr_b1 = turnBasedMatch0.getPreviousMatchData();
        if(arr_b1 != null) {
            s = Base64.encode(arr_b1);
        }
        stringBuilder0.append(s);
        stringBuilder0.append("|");
        stringBuilder0.append(turnBasedMatch0.getPendingParticipantId());
        ArrayList arrayList0 = turnBasedMatch0.getParticipants();
        if(arrayList0.size() > 0) {
            stringBuilder0.append("|");
            stringBuilder0.append(GameClientManager.SerializeParticipantsInfo(arrayList0));
        }
        return stringBuilder0.toString();
    }

    public void LeaveMatch(String s) {
        Log.d("AndroidNative", "LeaveMatch " + s);
        Games.TurnBasedMultiplayer.leaveMatch(GameClientManager.API(), s).setResultCallback(new AN_OnLeaveMatchResult(s));
    }

    public void LeaveMatchDuringTurn(String s, String s1) {
        Log.d("AndroidNative", "LeaveMatchDuringTurn " + s);
        Games.TurnBasedMultiplayer.leaveMatchDuringTurn(GameClientManager.API(), s, s1).setResultCallback(new AN_OnLeaveMatchResult(s));
    }

    public void LoadAllMatchesInfo(int v) {
        Log.d("AndroidNative", "LoadAllMatchesInfo ");
        Games.TurnBasedMultiplayer.loadMatchesByStatus(GameClientManager.API(), v, TurnBasedMatch.MATCH_TURN_STATUS_ALL).setResultCallback(new AN_OnLoadMatchesResult());
    }

    public void LoadMatch(String s) {
        Log.d("AndroidNative", "LoadMatch " + s);
        Games.TurnBasedMultiplayer.loadMatch(GameClientManager.API(), s).setResultCallback(new AN_OnLoadMatchResult());
    }

    public void LoadMatchesInfo(int v, int[] arr_v) {
        Log.d("AndroidNative", "LoadMatchesInfo matchTurnStatuses count: " + arr_v.length);
        Games.TurnBasedMultiplayer.loadMatchesByStatus(GameClientManager.API(), v, arr_v).setResultCallback(new AN_OnLoadMatchesResult());
    }

    private void ParceTrunBasedResult(int v, Intent intent0) {
        if(v != -1) {
            UnityPlayer.UnitySendMessage("GooglePlayTBM", "OnMatchCreationCanceled", "40000|" + v);
            return;
        }
        ArrayList arrayList0 = intent0.getStringArrayListExtra("players");
        this.CreateMatch(intent0.getIntExtra("min_automatch_players", 0), intent0.getIntExtra("max_automatch_players", 0), arrayList0);
    }

    public void RegisterMatchUpdateListener() {
        Log.d("AndroidNative", "RegisterMatchUpdateListener!!! ");
        Games.TurnBasedMultiplayer.registerMatchUpdateListener(GameClientManager.API(), new AN_OnTurnBasedMatchUpdateReceivedListener());
    }

    public void Rematch(String s) {
        Log.d("AndroidNative", "Rematch " + s);
        Games.TurnBasedMultiplayer.rematch(GameClientManager.API(), s).setResultCallback(new AN_OnMatchInitiatedCallback());
    }

    public void SetExclusiveBitMask(int v) {
        TurnBasedMultiplayerController.ExclusiveBitMask = v;
    }

    public void SetVariant(int v) {
        TurnBasedMultiplayerController.MatchVeriant = v;
    }

    public void ShowInbox() {
        GooglePlaySupportActivity.startProxyForResult(Games.TurnBasedMultiplayer.getInboxIntent(GameClientManager.API()), 40001);
    }

    public void StartSelectOpponentsView(int v, int v1, boolean z) {
        GooglePlaySupportActivity.startProxyForResult(Games.TurnBasedMultiplayer.getSelectOpponentsIntent(GameClientManager.API(), v, v1, z), 40000);
    }

    public void TakeTrun(String s, byte[] arr_b, String s1, List list0) {
        Log.d("AndroidNative", "TakeTrun " + s);
        Games.TurnBasedMultiplayer.takeTurn(GameClientManager.API(), s, arr_b, s1, list0).setResultCallback(new AN_OnTurnResult());
    }

    public void UnregisterMatchUpdateListener() {
        Log.d("AndroidNative", "UnregisterMatchUpdateListener!!! ");
        Games.TurnBasedMultiplayer.unregisterMatchUpdateListener(GameClientManager.API());
    }

    public void onActivityResult(int v, int v1, Intent intent0) {
        if(v == 40000) {
            this.ParceTrunBasedResult(v1, intent0);
        }
    }
}

