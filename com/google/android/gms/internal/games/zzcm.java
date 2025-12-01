package com.google.android.gms.internal.games;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.games.Games.GamesOptions;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayersClient;
import com.google.android.gms.tasks.Task;

public final class zzcm extends zzac implements PlayersClient {
    public zzcm(Activity activity0, GamesOptions games$GamesOptions0) {
        super(activity0, games$GamesOptions0);
    }

    public zzcm(Context context0, GamesOptions games$GamesOptions0) {
        super(context0, games$GamesOptions0);
    }

    @Override  // com.google.android.gms.games.PlayersClient
    public final Task getCompareProfileIntent(Player player0) {
        return this.doRead(zzbh.zzd(new zzct(player0)));
    }

    @Override  // com.google.android.gms.games.PlayersClient
    public final Task getCompareProfileIntent(String s) {
        return this.getCompareProfileIntentWithAlternativeNameHints(s, null, null);
    }

    @Override  // com.google.android.gms.games.PlayersClient
    public final Task getCompareProfileIntentWithAlternativeNameHints(String s, String s1, String s2) {
        return this.zza(new zzcs(s, s1, s2));
    }

    @Override  // com.google.android.gms.games.PlayersClient
    public final Task getCurrentPlayer() {
        return this.doRead(zzbh.zzd(zzco.zzev));
    }

    @Override  // com.google.android.gms.games.PlayersClient
    public final Task getCurrentPlayer(boolean z) {
        return this.doRead(zzbh.zzd(new zzcr(z)));
    }

    @Override  // com.google.android.gms.games.PlayersClient
    public final Task getCurrentPlayerId() {
        return this.doRead(zzbh.zzd(zzcp.zzev));
    }

    @Override  // com.google.android.gms.games.PlayersClient
    public final Task getPlayerSearchIntent() {
        return this.doRead(zzbh.zzd(zzcv.zzev));
    }

    @Override  // com.google.android.gms.games.PlayersClient
    public final Task loadFriends(int v, boolean z) {
        return this.zza("friends_all", v, z);
    }

    @Override  // com.google.android.gms.games.PlayersClient
    public final Task loadMoreFriends(int v) {
        return this.zzd("friends_all", v);
    }

    @Override  // com.google.android.gms.games.PlayersClient
    public final Task loadMoreRecentlyPlayedWithPlayers(int v) {
        return this.zzd("played_with", v);
    }

    @Override  // com.google.android.gms.games.PlayersClient
    public final Task loadPlayer(String s) {
        return this.loadPlayer(s, false);
    }

    @Override  // com.google.android.gms.games.PlayersClient
    public final Task loadPlayer(String s, boolean z) {
        return this.doRead(zzbh.zzd(new zzcq(s, z)));
    }

    @Override  // com.google.android.gms.games.PlayersClient
    public final Task loadRecentlyPlayedWithPlayers(int v, boolean z) {
        return this.zza("played_with", v, z);
    }

    private final Task zza(String s, int v, boolean z) {
        return this.doRead(zzbh.zzd(new zzcu(s, v, z)));
    }

    private final Task zzd(String s, int v) {
        return this.doRead(zzbh.zzd(new zzcx(s, v)));
    }
}

