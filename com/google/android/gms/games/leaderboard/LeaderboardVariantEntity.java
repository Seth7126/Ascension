package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.internal.Objects.ToStringHelper;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.games.zzfa;

public final class LeaderboardVariantEntity implements LeaderboardVariant {
    private final int zzki;
    private final int zzkj;
    private final boolean zzkk;
    private final long zzkl;
    private final String zzkm;
    private final long zzkn;
    private final String zzko;
    private final String zzkp;
    private final long zzkq;
    private final String zzkr;
    private final String zzks;
    private final String zzkt;

    public LeaderboardVariantEntity(LeaderboardVariant leaderboardVariant0) {
        this.zzki = leaderboardVariant0.getTimeSpan();
        this.zzkj = leaderboardVariant0.getCollection();
        this.zzkk = leaderboardVariant0.hasPlayerInfo();
        this.zzkl = leaderboardVariant0.getRawPlayerScore();
        this.zzkm = leaderboardVariant0.getDisplayPlayerScore();
        this.zzkn = leaderboardVariant0.getPlayerRank();
        this.zzko = leaderboardVariant0.getDisplayPlayerRank();
        this.zzkp = leaderboardVariant0.getPlayerScoreTag();
        this.zzkq = leaderboardVariant0.getNumScores();
        this.zzkr = leaderboardVariant0.zzch();
        this.zzks = leaderboardVariant0.zzci();
        this.zzkt = leaderboardVariant0.zzcj();
    }

    @Override
    public final boolean equals(Object object0) {
        return LeaderboardVariantEntity.zza(this, object0);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public final Object freeze() {
        return this;
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final int getCollection() {
        return this.zzkj;
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final String getDisplayPlayerRank() {
        return this.zzko;
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final String getDisplayPlayerScore() {
        return this.zzkm;
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final long getNumScores() {
        return this.zzkq;
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final long getPlayerRank() {
        return this.zzkn;
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final String getPlayerScoreTag() {
        return this.zzkp;
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final long getRawPlayerScore() {
        return this.zzkl;
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final int getTimeSpan() {
        return this.zzki;
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final boolean hasPlayerInfo() {
        return this.zzkk;
    }

    @Override
    public final int hashCode() {
        return LeaderboardVariantEntity.zza(this);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    @Override
    public final String toString() {
        return LeaderboardVariantEntity.zzb(this);
    }

    static int zza(LeaderboardVariant leaderboardVariant0) {
        return Objects.hashCode(new Object[]{leaderboardVariant0.getTimeSpan(), leaderboardVariant0.getCollection(), Boolean.valueOf(leaderboardVariant0.hasPlayerInfo()), leaderboardVariant0.getRawPlayerScore(), leaderboardVariant0.getDisplayPlayerScore(), leaderboardVariant0.getPlayerRank(), leaderboardVariant0.getDisplayPlayerRank(), leaderboardVariant0.getNumScores(), leaderboardVariant0.zzch(), leaderboardVariant0.zzcj(), leaderboardVariant0.zzci()});
    }

    // 去混淆评级： 低(43)
    static boolean zza(LeaderboardVariant leaderboardVariant0, Object object0) {
        if(!(object0 instanceof LeaderboardVariant)) {
            return false;
        }
        return leaderboardVariant0 == object0 ? true : Objects.equal(((LeaderboardVariant)object0).getTimeSpan(), leaderboardVariant0.getTimeSpan()) && Objects.equal(((LeaderboardVariant)object0).getCollection(), leaderboardVariant0.getCollection()) && Objects.equal(Boolean.valueOf(((LeaderboardVariant)object0).hasPlayerInfo()), Boolean.valueOf(leaderboardVariant0.hasPlayerInfo())) && Objects.equal(((LeaderboardVariant)object0).getRawPlayerScore(), leaderboardVariant0.getRawPlayerScore()) && Objects.equal(((LeaderboardVariant)object0).getDisplayPlayerScore(), leaderboardVariant0.getDisplayPlayerScore()) && Objects.equal(((LeaderboardVariant)object0).getPlayerRank(), leaderboardVariant0.getPlayerRank()) && Objects.equal(((LeaderboardVariant)object0).getDisplayPlayerRank(), leaderboardVariant0.getDisplayPlayerRank()) && Objects.equal(((LeaderboardVariant)object0).getNumScores(), leaderboardVariant0.getNumScores()) && Objects.equal(((LeaderboardVariant)object0).zzch(), leaderboardVariant0.zzch()) && Objects.equal(((LeaderboardVariant)object0).zzcj(), leaderboardVariant0.zzcj()) && Objects.equal(((LeaderboardVariant)object0).zzci(), leaderboardVariant0.zzci());
    }

    static String zzb(LeaderboardVariant leaderboardVariant0) {
        String s = "SOCIAL_1P";
        ToStringHelper objects$ToStringHelper0 = Objects.toStringHelper(leaderboardVariant0).add("TimeSpan", zzfa.zzo(leaderboardVariant0.getTimeSpan()));
        int v = leaderboardVariant0.getCollection();
        switch(v) {
            case -1: {
                s = "UNKNOWN";
                break;
            }
            case 0: {
                s = "PUBLIC";
                break;
            }
            default: {
                if(v == 1) {
                    s = "SOCIAL";
                }
                else {
                    switch(v) {
                        case 3: {
                            s = "FRIENDS";
                            break;
                        }
                        case 2: 
                        case 4: {
                            break;
                        }
                        default: {
                            throw new IllegalArgumentException("Unknown leaderboard collection: " + v);
                        }
                    }
                }
            }
        }
        ToStringHelper objects$ToStringHelper1 = objects$ToStringHelper0.add("Collection", s);
        String s1 = "none";
        Long long0 = leaderboardVariant0.hasPlayerInfo() ? leaderboardVariant0.getRawPlayerScore() : "none";
        ToStringHelper objects$ToStringHelper2 = objects$ToStringHelper1.add("RawPlayerScore", long0).add("DisplayPlayerScore", (leaderboardVariant0.hasPlayerInfo() ? leaderboardVariant0.getDisplayPlayerScore() : "none"));
        Long long1 = leaderboardVariant0.hasPlayerInfo() ? leaderboardVariant0.getPlayerRank() : "none";
        ToStringHelper objects$ToStringHelper3 = objects$ToStringHelper2.add("PlayerRank", long1);
        if(leaderboardVariant0.hasPlayerInfo()) {
            s1 = leaderboardVariant0.getDisplayPlayerRank();
        }
        return objects$ToStringHelper3.add("DisplayPlayerRank", s1).add("NumScores", leaderboardVariant0.getNumScores()).add("TopPageNextToken", leaderboardVariant0.zzch()).add("WindowPageNextToken", leaderboardVariant0.zzcj()).add("WindowPagePrevToken", leaderboardVariant0.zzci()).toString();
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final String zzch() {
        return this.zzkr;
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final String zzci() {
        return this.zzks;
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final String zzcj() {
        return this.zzkt;
    }
}

