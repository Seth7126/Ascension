package com.voxelbusters.android.essentialkit.features.gameservices;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.games.Player;
import com.voxelbusters.android.essentialkit.common.interfaces.ILoadAssetListener;

public class GamePlayer {
    public static class Builder {
        private Context context;
        private Player player;

        public Builder(Context context0) {
            this.context = context0;
        }

        GamePlayer build() {
            return new GamePlayer(this.context, this.player, null);
        }

        Builder withPlayer(Player player0) {
            this.player = player0;
            return this;
        }
    }

    Context context;
    Player player;

    private GamePlayer(Context context0, Player player0) {
        this.context = context0;
        this.player = player0;
    }

    GamePlayer(Context context0, Player player0, com.voxelbusters.android.essentialkit.features.gameservices.GamePlayer.1 gamePlayer$10) {
        this(context0, player0);
    }

    public void LoadProfileImage(boolean z, ILoadAssetListener iLoadAssetListener0) {
        Uri uri0 = z ? this.player.getHiResImageUri() : this.player.getIconImageUri();
        ImageManagerUtility.loadImage(((Activity)this.context), uri0, iLoadAssetListener0);
    }

    public String getDisplayName() {
        return this.player.getDisplayName();
    }

    public String getId() {
        return this.player.getPlayerId();
    }

    public String getName() {
        return this.getDisplayName();
    }

    public String getTitle() {
        return this.player.getTitle();
    }

    class com.voxelbusters.android.essentialkit.features.gameservices.GamePlayer.1 {
    }

}

