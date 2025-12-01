package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.util.DataUtils;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import java.util.ArrayList;

public final class LeaderboardEntity implements Leaderboard {
    private final String zzi;
    private final Game zzjr;
    private final String zzjs;
    private final int zzjt;
    private final ArrayList zzju;
    private final Uri zzm;
    private final String zzx;

    public LeaderboardEntity(Leaderboard leaderboard0) {
        this.zzjs = leaderboard0.getLeaderboardId();
        this.zzi = leaderboard0.getDisplayName();
        this.zzm = leaderboard0.getIconImageUri();
        this.zzx = leaderboard0.getIconImageUrl();
        this.zzjt = leaderboard0.getScoreOrder();
        Game game0 = leaderboard0.getGame();
        this.zzjr = game0 == null ? null : new GameEntity(game0);
        ArrayList arrayList0 = leaderboard0.getVariants();
        int v = arrayList0.size();
        this.zzju = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            LeaderboardVariantEntity leaderboardVariantEntity0 = (LeaderboardVariantEntity)((LeaderboardVariant)arrayList0.get(v1)).freeze();
            this.zzju.add(leaderboardVariantEntity0);
        }
    }

    @Override
    public final boolean equals(Object object0) {
        return LeaderboardEntity.zza(this, object0);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public final Object freeze() {
        return this;
    }

    @Override  // com.google.android.gms.games.leaderboard.Leaderboard
    public final String getDisplayName() {
        return this.zzi;
    }

    @Override  // com.google.android.gms.games.leaderboard.Leaderboard
    public final void getDisplayName(CharArrayBuffer charArrayBuffer0) {
        DataUtils.copyStringToBuffer(this.zzi, charArrayBuffer0);
    }

    @Override  // com.google.android.gms.games.leaderboard.Leaderboard
    public final Game getGame() {
        return this.zzjr;
    }

    @Override  // com.google.android.gms.games.leaderboard.Leaderboard
    public final Uri getIconImageUri() {
        return this.zzm;
    }

    @Override  // com.google.android.gms.games.leaderboard.Leaderboard
    public final String getIconImageUrl() {
        return this.zzx;
    }

    @Override  // com.google.android.gms.games.leaderboard.Leaderboard
    public final String getLeaderboardId() {
        return this.zzjs;
    }

    @Override  // com.google.android.gms.games.leaderboard.Leaderboard
    public final int getScoreOrder() {
        return this.zzjt;
    }

    @Override  // com.google.android.gms.games.leaderboard.Leaderboard
    public final ArrayList getVariants() {
        return new ArrayList(this.zzju);
    }

    @Override
    public final int hashCode() {
        return LeaderboardEntity.zza(this);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    @Override
    public final String toString() {
        return LeaderboardEntity.zzb(this);
    }

    static int zza(Leaderboard leaderboard0) {
        return Objects.hashCode(new Object[]{leaderboard0.getLeaderboardId(), leaderboard0.getDisplayName(), leaderboard0.getIconImageUri(), leaderboard0.getScoreOrder(), leaderboard0.getVariants()});
    }

    // 去混淆评级： 低(23)
    static boolean zza(Leaderboard leaderboard0, Object object0) {
        if(!(object0 instanceof Leaderboard)) {
            return false;
        }
        return leaderboard0 == object0 ? true : Objects.equal(((Leaderboard)object0).getLeaderboardId(), leaderboard0.getLeaderboardId()) && Objects.equal(((Leaderboard)object0).getDisplayName(), leaderboard0.getDisplayName()) && Objects.equal(((Leaderboard)object0).getIconImageUri(), leaderboard0.getIconImageUri()) && Objects.equal(((Leaderboard)object0).getScoreOrder(), leaderboard0.getScoreOrder()) && Objects.equal(((Leaderboard)object0).getVariants(), leaderboard0.getVariants());
    }

    static String zzb(Leaderboard leaderboard0) {
        return Objects.toStringHelper(leaderboard0).add("LeaderboardId", leaderboard0.getLeaderboardId()).add("DisplayName", leaderboard0.getDisplayName()).add("IconImageUri", leaderboard0.getIconImageUri()).add("IconImageUrl", leaderboard0.getIconImageUrl()).add("ScoreOrder", leaderboard0.getScoreOrder()).add("Variants", leaderboard0.getVariants()).toString();
    }
}

