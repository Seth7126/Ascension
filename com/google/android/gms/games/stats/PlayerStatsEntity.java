package com.google.android.gms.games.stats;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.games.internal.zzb;

public class PlayerStatsEntity extends zzb implements PlayerStats {
    public static final Parcelable.Creator CREATOR;
    private final float zzlp;
    private final float zzlq;
    private final int zzlr;
    private final int zzls;
    private final int zzlt;
    private final float zzlu;
    private final float zzlv;
    private final Bundle zzlw;
    private final float zzlx;
    private final float zzly;
    private final float zzlz;

    static {
        PlayerStatsEntity.CREATOR = new com.google.android.gms.games.stats.zzb();
    }

    PlayerStatsEntity(float f, float f1, int v, int v1, int v2, float f2, float f3, Bundle bundle0, float f4, float f5, float f6) {
        this.zzlp = f;
        this.zzlq = f1;
        this.zzlr = v;
        this.zzls = v1;
        this.zzlt = v2;
        this.zzlu = f2;
        this.zzlv = f3;
        this.zzlw = bundle0;
        this.zzlx = f4;
        this.zzly = f5;
        this.zzlz = f6;
    }

    public PlayerStatsEntity(PlayerStats playerStats0) {
        this.zzlp = playerStats0.getAverageSessionLength();
        this.zzlq = playerStats0.getChurnProbability();
        this.zzlr = playerStats0.getDaysSinceLastPlayed();
        this.zzls = playerStats0.getNumberOfPurchases();
        this.zzlt = playerStats0.getNumberOfSessions();
        this.zzlu = playerStats0.getSessionPercentile();
        this.zzlv = playerStats0.getSpendPercentile();
        this.zzlx = playerStats0.getSpendProbability();
        this.zzly = playerStats0.getHighSpenderProbability();
        this.zzlz = playerStats0.getTotalSpendNext28Days();
        this.zzlw = playerStats0.zzcm();
    }

    @Override
    public boolean equals(Object object0) {
        return PlayerStatsEntity.zza(this, object0);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this;
    }

    @Override  // com.google.android.gms.games.stats.PlayerStats
    public float getAverageSessionLength() {
        return this.zzlp;
    }

    @Override  // com.google.android.gms.games.stats.PlayerStats
    public float getChurnProbability() {
        return this.zzlq;
    }

    @Override  // com.google.android.gms.games.stats.PlayerStats
    public int getDaysSinceLastPlayed() {
        return this.zzlr;
    }

    @Override  // com.google.android.gms.games.stats.PlayerStats
    public float getHighSpenderProbability() {
        return this.zzly;
    }

    @Override  // com.google.android.gms.games.stats.PlayerStats
    public int getNumberOfPurchases() {
        return this.zzls;
    }

    @Override  // com.google.android.gms.games.stats.PlayerStats
    public int getNumberOfSessions() {
        return this.zzlt;
    }

    @Override  // com.google.android.gms.games.stats.PlayerStats
    public float getSessionPercentile() {
        return this.zzlu;
    }

    @Override  // com.google.android.gms.games.stats.PlayerStats
    public float getSpendPercentile() {
        return this.zzlv;
    }

    @Override  // com.google.android.gms.games.stats.PlayerStats
    public float getSpendProbability() {
        return this.zzlx;
    }

    @Override  // com.google.android.gms.games.stats.PlayerStats
    public float getTotalSpendNext28Days() {
        return this.zzlz;
    }

    @Override
    public int hashCode() {
        return PlayerStatsEntity.zza(this);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
        return true;
    }

    @Override
    public String toString() {
        return PlayerStatsEntity.zzb(this);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeFloat(parcel0, 1, this.getAverageSessionLength());
        SafeParcelWriter.writeFloat(parcel0, 2, this.getChurnProbability());
        SafeParcelWriter.writeInt(parcel0, 3, this.getDaysSinceLastPlayed());
        SafeParcelWriter.writeInt(parcel0, 4, this.getNumberOfPurchases());
        SafeParcelWriter.writeInt(parcel0, 5, this.getNumberOfSessions());
        SafeParcelWriter.writeFloat(parcel0, 6, this.getSessionPercentile());
        SafeParcelWriter.writeFloat(parcel0, 7, this.getSpendPercentile());
        SafeParcelWriter.writeBundle(parcel0, 8, this.zzlw, false);
        SafeParcelWriter.writeFloat(parcel0, 9, this.getSpendProbability());
        SafeParcelWriter.writeFloat(parcel0, 10, this.getHighSpenderProbability());
        SafeParcelWriter.writeFloat(parcel0, 11, this.getTotalSpendNext28Days());
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    static int zza(PlayerStats playerStats0) {
        return Objects.hashCode(new Object[]{playerStats0.getAverageSessionLength(), playerStats0.getChurnProbability(), playerStats0.getDaysSinceLastPlayed(), playerStats0.getNumberOfPurchases(), playerStats0.getNumberOfSessions(), playerStats0.getSessionPercentile(), playerStats0.getSpendPercentile(), playerStats0.getSpendProbability(), playerStats0.getHighSpenderProbability(), playerStats0.getTotalSpendNext28Days()});
    }

    // 去混淆评级： 低(40)
    static boolean zza(PlayerStats playerStats0, Object object0) {
        if(!(object0 instanceof PlayerStats)) {
            return false;
        }
        return playerStats0 == object0 ? true : Objects.equal(((PlayerStats)object0).getAverageSessionLength(), playerStats0.getAverageSessionLength()) && Objects.equal(((PlayerStats)object0).getChurnProbability(), playerStats0.getChurnProbability()) && Objects.equal(((PlayerStats)object0).getDaysSinceLastPlayed(), playerStats0.getDaysSinceLastPlayed()) && Objects.equal(((PlayerStats)object0).getNumberOfPurchases(), playerStats0.getNumberOfPurchases()) && Objects.equal(((PlayerStats)object0).getNumberOfSessions(), playerStats0.getNumberOfSessions()) && Objects.equal(((PlayerStats)object0).getSessionPercentile(), playerStats0.getSessionPercentile()) && Objects.equal(((PlayerStats)object0).getSpendPercentile(), playerStats0.getSpendPercentile()) && Objects.equal(((PlayerStats)object0).getSpendProbability(), playerStats0.getSpendProbability()) && Objects.equal(((PlayerStats)object0).getHighSpenderProbability(), playerStats0.getHighSpenderProbability()) && Objects.equal(((PlayerStats)object0).getTotalSpendNext28Days(), playerStats0.getTotalSpendNext28Days());
    }

    static String zzb(PlayerStats playerStats0) {
        return Objects.toStringHelper(playerStats0).add("AverageSessionLength", playerStats0.getAverageSessionLength()).add("ChurnProbability", playerStats0.getChurnProbability()).add("DaysSinceLastPlayed", playerStats0.getDaysSinceLastPlayed()).add("NumberOfPurchases", playerStats0.getNumberOfPurchases()).add("NumberOfSessions", playerStats0.getNumberOfSessions()).add("SessionPercentile", playerStats0.getSessionPercentile()).add("SpendPercentile", playerStats0.getSpendPercentile()).add("SpendProbability", playerStats0.getSpendProbability()).add("HighSpenderProbability", playerStats0.getHighSpenderProbability()).add("TotalSpendNext28Days", playerStats0.getTotalSpendNext28Days()).toString();
    }

    @Override  // com.google.android.gms.games.stats.PlayerStats
    public final Bundle zzcm() {
        return this.zzlw;
    }
}

