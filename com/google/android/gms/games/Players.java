package com.google.android.gms.games;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.games.internal.player.StockProfileImage;

@Deprecated
public interface Players {
    @Deprecated
    public interface LoadPlayersResult extends Releasable, Result {
        PlayerBuffer getPlayers();
    }

    public interface zza extends Result {
        int zzaa();

        int zzab();

        int zzac();

        String zzk();

        boolean zzn();

        boolean zzt();

        StockProfileImage zzu();

        boolean zzv();

        boolean zzw();

        boolean zzx();

        boolean zzy();

        boolean zzz();
    }

    public static final String EXTRA_PLAYER_SEARCH_RESULTS = "player_search_results";

    Intent getCompareProfileIntent(GoogleApiClient arg1, Player arg2);

    Player getCurrentPlayer(GoogleApiClient arg1);

    String getCurrentPlayerId(GoogleApiClient arg1);

    Intent getPlayerSearchIntent(GoogleApiClient arg1);

    @Deprecated
    PendingResult loadConnectedPlayers(GoogleApiClient arg1, boolean arg2);

    @Deprecated
    PendingResult loadInvitablePlayers(GoogleApiClient arg1, int arg2, boolean arg3);

    @Deprecated
    PendingResult loadMoreInvitablePlayers(GoogleApiClient arg1, int arg2);

    PendingResult loadMoreRecentlyPlayedWithPlayers(GoogleApiClient arg1, int arg2);

    PendingResult loadPlayer(GoogleApiClient arg1, String arg2);

    PendingResult loadPlayer(GoogleApiClient arg1, String arg2, boolean arg3);

    PendingResult loadRecentlyPlayedWithPlayers(GoogleApiClient arg1, int arg2, boolean arg3);
}

