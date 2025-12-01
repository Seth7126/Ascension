package com.google.android.gms.internal.games;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.games.AchievementsClient;
import com.google.android.gms.games.Games.GamesOptions;
import com.google.android.gms.tasks.Task;

public final class zzf extends zzac implements AchievementsClient {
    public zzf(Activity activity0, GamesOptions games$GamesOptions0) {
        super(activity0, games$GamesOptions0);
    }

    public zzf(Context context0, GamesOptions games$GamesOptions0) {
        super(context0, games$GamesOptions0);
    }

    @Override  // com.google.android.gms.games.AchievementsClient
    public final Task getAchievementsIntent() {
        return this.doRead(zzbh.zzd(zze.zzev));
    }

    @Override  // com.google.android.gms.games.AchievementsClient
    public final void increment(String s, int v) {
        this.doWrite(zzbh.zzd(new zzk(s, v)));
    }

    @Override  // com.google.android.gms.games.AchievementsClient
    public final Task incrementImmediate(String s, int v) {
        return this.doWrite(zzbh.zzd(new zzn(s, v)));
    }

    @Override  // com.google.android.gms.games.AchievementsClient
    public final Task load(boolean z) {
        return this.doRead(zzbh.zzd(new zzh(z)));
    }

    @Override  // com.google.android.gms.games.AchievementsClient
    public final void reveal(String s) {
        this.doWrite(zzbh.zzd(new zzg(s)));
    }

    @Override  // com.google.android.gms.games.AchievementsClient
    public final Task revealImmediate(String s) {
        return this.doWrite(zzbh.zzd(new zzj(s)));
    }

    @Override  // com.google.android.gms.games.AchievementsClient
    public final void setSteps(String s, int v) {
        this.doWrite(zzbh.zzd(new zzm(s, v)));
    }

    @Override  // com.google.android.gms.games.AchievementsClient
    public final Task setStepsImmediate(String s, int v) {
        return this.doWrite(zzbh.zzd(new zzp(s, v)));
    }

    @Override  // com.google.android.gms.games.AchievementsClient
    public final void unlock(String s) {
        this.doWrite(zzbh.zzd(new zzi(s)));
    }

    @Override  // com.google.android.gms.games.AchievementsClient
    public final Task unlockImmediate(String s) {
        return this.doWrite(zzbh.zzd(new zzl(s)));
    }
}

