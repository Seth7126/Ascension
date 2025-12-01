package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.internal.Objects.ToStringHelper;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DataUtils;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;

public final class LeaderboardScoreEntity implements LeaderboardScore {
    private final long rawScore;
    private final String scoreTag;
    private final long zzjw;
    private final String zzjx;
    private final String zzjy;
    private final long zzjz;
    private final String zzka;
    private final Uri zzkb;
    private final Uri zzkc;
    private final PlayerEntity zzkd;
    private final String zzke;
    private final String zzkf;

    public LeaderboardScoreEntity(LeaderboardScore leaderboardScore0) {
        this.zzjw = leaderboardScore0.getRank();
        this.zzjx = (String)Preconditions.checkNotNull(leaderboardScore0.getDisplayRank());
        this.zzjy = (String)Preconditions.checkNotNull(leaderboardScore0.getDisplayScore());
        this.rawScore = leaderboardScore0.getRawScore();
        this.zzjz = leaderboardScore0.getTimestampMillis();
        this.zzka = leaderboardScore0.getScoreHolderDisplayName();
        this.zzkb = leaderboardScore0.getScoreHolderIconImageUri();
        this.zzkc = leaderboardScore0.getScoreHolderHiResImageUri();
        Player player0 = leaderboardScore0.getScoreHolder();
        this.zzkd = player0 == null ? null : ((PlayerEntity)player0.freeze());
        this.scoreTag = leaderboardScore0.getScoreTag();
        this.zzke = leaderboardScore0.getScoreHolderIconImageUrl();
        this.zzkf = leaderboardScore0.getScoreHolderHiResImageUrl();
    }

    @Override
    public final boolean equals(Object object0) {
        return LeaderboardScoreEntity.zza(this, object0);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public final Object freeze() {
        return this;
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final String getDisplayRank() {
        return this.zzjx;
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final void getDisplayRank(CharArrayBuffer charArrayBuffer0) {
        DataUtils.copyStringToBuffer(this.zzjx, charArrayBuffer0);
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final String getDisplayScore() {
        return this.zzjy;
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final void getDisplayScore(CharArrayBuffer charArrayBuffer0) {
        DataUtils.copyStringToBuffer(this.zzjy, charArrayBuffer0);
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final long getRank() {
        return this.zzjw;
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final long getRawScore() {
        return this.rawScore;
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final Player getScoreHolder() {
        return this.zzkd;
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final String getScoreHolderDisplayName() {
        return this.zzkd == null ? this.zzka : this.zzkd.getDisplayName();
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final void getScoreHolderDisplayName(CharArrayBuffer charArrayBuffer0) {
        PlayerEntity playerEntity0 = this.zzkd;
        if(playerEntity0 == null) {
            DataUtils.copyStringToBuffer(this.zzka, charArrayBuffer0);
            return;
        }
        playerEntity0.getDisplayName(charArrayBuffer0);
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final Uri getScoreHolderHiResImageUri() {
        return this.zzkd == null ? this.zzkc : this.zzkd.getHiResImageUri();
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final String getScoreHolderHiResImageUrl() {
        return this.zzkd == null ? this.zzkf : this.zzkd.getHiResImageUrl();
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final Uri getScoreHolderIconImageUri() {
        return this.zzkd == null ? this.zzkb : this.zzkd.getIconImageUri();
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final String getScoreHolderIconImageUrl() {
        return this.zzkd == null ? this.zzke : this.zzkd.getIconImageUrl();
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final String getScoreTag() {
        return this.scoreTag;
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final long getTimestampMillis() {
        return this.zzjz;
    }

    @Override
    public final int hashCode() {
        return LeaderboardScoreEntity.zza(this);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    @Override
    public final String toString() {
        return LeaderboardScoreEntity.zzb(this);
    }

    static int zza(LeaderboardScore leaderboardScore0) {
        return Objects.hashCode(new Object[]{leaderboardScore0.getRank(), leaderboardScore0.getDisplayRank(), leaderboardScore0.getRawScore(), leaderboardScore0.getDisplayScore(), leaderboardScore0.getTimestampMillis(), leaderboardScore0.getScoreHolderDisplayName(), leaderboardScore0.getScoreHolderIconImageUri(), leaderboardScore0.getScoreHolderHiResImageUri(), leaderboardScore0.getScoreHolder()});
    }

    // 去混淆评级： 低(40)
    static boolean zza(LeaderboardScore leaderboardScore0, Object object0) {
        if(!(object0 instanceof LeaderboardScore)) {
            return false;
        }
        return leaderboardScore0 == object0 ? true : Objects.equal(((LeaderboardScore)object0).getRank(), leaderboardScore0.getRank()) && Objects.equal(((LeaderboardScore)object0).getDisplayRank(), leaderboardScore0.getDisplayRank()) && Objects.equal(((LeaderboardScore)object0).getRawScore(), leaderboardScore0.getRawScore()) && Objects.equal(((LeaderboardScore)object0).getDisplayScore(), leaderboardScore0.getDisplayScore()) && Objects.equal(((LeaderboardScore)object0).getTimestampMillis(), leaderboardScore0.getTimestampMillis()) && Objects.equal(((LeaderboardScore)object0).getScoreHolderDisplayName(), leaderboardScore0.getScoreHolderDisplayName()) && Objects.equal(((LeaderboardScore)object0).getScoreHolderIconImageUri(), leaderboardScore0.getScoreHolderIconImageUri()) && Objects.equal(((LeaderboardScore)object0).getScoreHolderHiResImageUri(), leaderboardScore0.getScoreHolderHiResImageUri()) && Objects.equal(((LeaderboardScore)object0).getScoreHolder(), leaderboardScore0.getScoreHolder()) && Objects.equal(((LeaderboardScore)object0).getScoreTag(), leaderboardScore0.getScoreTag());
    }

    static String zzb(LeaderboardScore leaderboardScore0) {
        ToStringHelper objects$ToStringHelper0 = Objects.toStringHelper(leaderboardScore0).add("Rank", leaderboardScore0.getRank()).add("DisplayRank", leaderboardScore0.getDisplayRank()).add("Score", leaderboardScore0.getRawScore()).add("DisplayScore", leaderboardScore0.getDisplayScore()).add("Timestamp", leaderboardScore0.getTimestampMillis()).add("DisplayName", leaderboardScore0.getScoreHolderDisplayName()).add("IconImageUri", leaderboardScore0.getScoreHolderIconImageUri()).add("IconImageUrl", leaderboardScore0.getScoreHolderIconImageUrl()).add("HiResImageUri", leaderboardScore0.getScoreHolderHiResImageUri()).add("HiResImageUrl", leaderboardScore0.getScoreHolderHiResImageUrl());
        return leaderboardScore0.getScoreHolder() == null ? objects$ToStringHelper0.add("Player", null).add("ScoreTag", leaderboardScore0.getScoreTag()).toString() : objects$ToStringHelper0.add("Player", leaderboardScore0.getScoreHolder()).add("ScoreTag", leaderboardScore0.getScoreTag()).toString();
    }
}

