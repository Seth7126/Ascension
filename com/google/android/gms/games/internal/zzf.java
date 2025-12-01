package com.google.android.gms.games.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.DataHolderResult;
import com.google.android.gms.common.api.internal.ListenerHolder.Notifier;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.AnnotatedData;
import com.google.android.gms.games.FriendsResolutionRequiredException;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameBuffer;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Games.GamesOptions;
import com.google.android.gms.games.GamesClientStatusCodes;
import com.google.android.gms.games.GamesMetadata.LoadGamesResult;
import com.google.android.gms.games.GamesStatusCodes;
import com.google.android.gms.games.LeaderboardsClient.LeaderboardScores;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerBuffer;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.Players.LoadPlayersResult;
import com.google.android.gms.games.SnapshotsClient.DataOrConflict;
import com.google.android.gms.games.SnapshotsClient.SnapshotConflict;
import com.google.android.gms.games.SnapshotsClient.SnapshotContentUnavailableApiException;
import com.google.android.gms.games.achievement.AchievementBuffer;
import com.google.android.gms.games.achievement.Achievements.LoadAchievementsResult;
import com.google.android.gms.games.achievement.Achievements.UpdateAchievementResult;
import com.google.android.gms.games.event.EventBuffer;
import com.google.android.gms.games.event.Events.LoadEventsResult;
import com.google.android.gms.games.leaderboard.Leaderboard;
import com.google.android.gms.games.leaderboard.LeaderboardBuffer;
import com.google.android.gms.games.leaderboard.LeaderboardEntity;
import com.google.android.gms.games.leaderboard.LeaderboardScore;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;
import com.google.android.gms.games.leaderboard.LeaderboardScoreEntity;
import com.google.android.gms.games.leaderboard.Leaderboards.LeaderboardMetadataResult;
import com.google.android.gms.games.leaderboard.Leaderboards.LoadPlayerScoreResult;
import com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult;
import com.google.android.gms.games.leaderboard.Leaderboards.SubmitScoreResult;
import com.google.android.gms.games.leaderboard.ScoreSubmissionData;
import com.google.android.gms.games.snapshot.Snapshot;
import com.google.android.gms.games.snapshot.SnapshotContents;
import com.google.android.gms.games.snapshot.SnapshotContentsEntity;
import com.google.android.gms.games.snapshot.SnapshotEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.SnapshotMetadataBuffer;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;
import com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadataEntity;
import com.google.android.gms.games.snapshot.Snapshots.CommitSnapshotResult;
import com.google.android.gms.games.snapshot.Snapshots.DeleteSnapshotResult;
import com.google.android.gms.games.snapshot.Snapshots.LoadSnapshotsResult;
import com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult;
import com.google.android.gms.games.stats.PlayerStats;
import com.google.android.gms.games.stats.PlayerStatsBuffer;
import com.google.android.gms.games.stats.PlayerStatsEntity;
import com.google.android.gms.games.stats.Stats.LoadPlayerStatsResult;
import com.google.android.gms.games.video.CaptureState;
import com.google.android.gms.games.video.VideoCapabilities;
import com.google.android.gms.games.video.Videos.CaptureAvailableResult;
import com.google.android.gms.games.video.Videos.CaptureCapabilitiesResult;
import com.google.android.gms.games.video.Videos.CaptureStateResult;
import com.google.android.gms.internal.games.zzfd;
import com.google.android.gms.internal.games.zzfe;
import com.google.android.gms.internal.games.zzfi;
import com.google.android.gms.internal.games.zzgh;
import com.google.android.gms.signin.internal.SignInClientImpl;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Set;
import jeb.synthetic.TWR;

public class zzf extends GmsClient {
    static final class zza extends com.google.android.gms.games.internal.zza {
        private final TaskCompletionSource zzdv;

        zza(TaskCompletionSource taskCompletionSource0) {
            this.zzdv = taskCompletionSource0;
        }

        @Override  // com.google.android.gms.games.internal.zza
        public final void zzb(int v, String s) {
            if(v != 0 && v != 3003) {
                zzf.zzb(this.zzdv, v);
                return;
            }
            this.zzdv.setResult(Boolean.valueOf(v == 3003));
        }
    }

    static final class zzaa extends zzo implements LoadGamesResult {
        private final GameBuffer zzef;

        zzaa(DataHolder dataHolder0) {
            super(dataHolder0);
            this.zzef = new GameBuffer(dataHolder0);
        }

        @Override  // com.google.android.gms.games.GamesMetadata$LoadGamesResult
        public final GameBuffer getGames() {
            return this.zzef;
        }
    }

    static final class zzab extends zzo implements LoadEventsResult {
        private final EventBuffer zzeg;

        zzab(DataHolder dataHolder0) {
            super(dataHolder0);
            this.zzeg = new EventBuffer(dataHolder0);
        }

        @Override  // com.google.android.gms.games.event.Events$LoadEventsResult
        public final EventBuffer getEvents() {
            return this.zzeg;
        }
    }

    static final class zzac extends zzo implements LoadPlayerStatsResult {
        private final PlayerStats zzeh;

        zzac(DataHolder dataHolder0) {
            super(dataHolder0);
            PlayerStatsBuffer playerStatsBuffer0 = new PlayerStatsBuffer(dataHolder0);
            try {
                this.zzeh = playerStatsBuffer0.getCount() > 0 ? new PlayerStatsEntity(((PlayerStats)playerStatsBuffer0.get(0))) : null;
            }
            finally {
                playerStatsBuffer0.release();
            }
        }

        @Override  // com.google.android.gms.games.stats.Stats$LoadPlayerStatsResult
        public final PlayerStats getPlayerStats() {
            return this.zzeh;
        }
    }

    static final class zzad extends zzo implements LoadPlayerScoreResult {
        private final LeaderboardScoreEntity zzei;

        zzad(DataHolder dataHolder0) {
            super(dataHolder0);
            LeaderboardScoreBuffer leaderboardScoreBuffer0 = new LeaderboardScoreBuffer(dataHolder0);
            try {
                this.zzei = leaderboardScoreBuffer0.getCount() > 0 ? ((LeaderboardScoreEntity)((LeaderboardScore)leaderboardScoreBuffer0.get(0)).freeze()) : null;
            }
            finally {
                leaderboardScoreBuffer0.release();
            }
        }

        @Override  // com.google.android.gms.games.leaderboard.Leaderboards$LoadPlayerScoreResult
        public final LeaderboardScore getScore() {
            return this.zzei;
        }
    }

    static final class zzae extends zzo implements LoadScoresResult {
        private final LeaderboardEntity zzej;
        private final LeaderboardScoreBuffer zzek;

        zzae(DataHolder dataHolder0, DataHolder dataHolder1) {
            super(dataHolder1);
            LeaderboardBuffer leaderboardBuffer0 = new LeaderboardBuffer(dataHolder0);
            try {
                this.zzej = leaderboardBuffer0.getCount() > 0 ? ((LeaderboardEntity)((Leaderboard)leaderboardBuffer0.get(0)).freeze()) : null;
            }
            finally {
                leaderboardBuffer0.release();
            }
            this.zzek = new LeaderboardScoreBuffer(dataHolder1);
        }

        @Override  // com.google.android.gms.games.leaderboard.Leaderboards$LoadScoresResult
        public final Leaderboard getLeaderboard() {
            return this.zzej;
        }

        @Override  // com.google.android.gms.games.leaderboard.Leaderboards$LoadScoresResult
        public final LeaderboardScoreBuffer getScores() {
            return this.zzek;
        }
    }

    static final class zzaf extends zzo implements LoadPlayersResult {
        private final PlayerBuffer zzel;

        zzaf(DataHolder dataHolder0) {
            super(dataHolder0);
            this.zzel = new PlayerBuffer(dataHolder0);
        }

        @Override  // com.google.android.gms.games.Players$LoadPlayersResult
        public final PlayerBuffer getPlayers() {
            return this.zzel;
        }
    }

    static final class zzag extends com.google.android.gms.games.internal.zza {
        private TaskCompletionSource zzdv;

        zzag(TaskCompletionSource taskCompletionSource0) {
            this.zzdv = taskCompletionSource0;
        }

        @Override  // com.google.android.gms.games.internal.zza
        public final void zze(int v, Bundle bundle0) {
            if(v == 0) {
                this.zzdv.setResult(CaptureState.zza(bundle0));
                return;
            }
            zzf.zzb(this.zzdv, v);
        }
    }

    static final class zzah extends zzo implements LoadSnapshotsResult {
        zzah(DataHolder dataHolder0) {
            super(dataHolder0);
        }

        @Override  // com.google.android.gms.games.snapshot.Snapshots$LoadSnapshotsResult
        public final SnapshotMetadataBuffer getSnapshots() {
            return new SnapshotMetadataBuffer(this.mDataHolder);
        }
    }

    static final class zzai extends com.google.android.gms.games.internal.zza {
        private TaskCompletionSource zzdv;

        zzai(TaskCompletionSource taskCompletionSource0) {
            this.zzdv = taskCompletionSource0;
        }

        @Override  // com.google.android.gms.games.internal.zza
        public final void zza(int v, boolean z) {
            if(v == 0) {
                this.zzdv.setResult(Boolean.valueOf(z));
                return;
            }
            zzf.zzb(this.zzdv, v);
        }
    }

    static final class zzaj extends com.google.android.gms.games.internal.zza {
        private final TaskCompletionSource zzdv;

        zzaj(TaskCompletionSource taskCompletionSource0) {
            this.zzdv = taskCompletionSource0;
        }

        @Override  // com.google.android.gms.games.internal.zza
        public final void zzag(DataHolder dataHolder0) {
            int v = dataHolder0.getStatusCode();
            if(v != 0 && v != 3) {
                zzf.zzb(this.zzdv, v);
                dataHolder0.close();
                return;
            }
            AnnotatedData annotatedData0 = new AnnotatedData(new SnapshotMetadataBuffer(dataHolder0), v == 3);
            this.zzdv.setResult(annotatedData0);
        }
    }

    static final class zzak extends zzo implements OpenSnapshotResult {
        private final String zzch;
        private final Snapshot zzem;
        private final Snapshot zzen;
        private final SnapshotContents zzeo;

        zzak(DataHolder dataHolder0, Contents contents0) {
            this(dataHolder0, null, contents0, null, null);
        }

        zzak(DataHolder dataHolder0, String s, Contents contents0, Contents contents1, Contents contents2) {
            boolean z = true;
            super(dataHolder0);
            SnapshotMetadataBuffer snapshotMetadataBuffer0 = new SnapshotMetadataBuffer(dataHolder0);
            try {
                switch(snapshotMetadataBuffer0.getCount()) {
                    case 0: {
                        this.zzem = null;
                        this.zzen = null;
                        break;
                    }
                    case 1: {
                        if(dataHolder0.getStatusCode() == 4004) {
                            z = false;
                        }
                        Asserts.checkState(z);
                        this.zzem = new SnapshotEntity(new SnapshotMetadataEntity(((SnapshotMetadata)snapshotMetadataBuffer0.get(0))), new SnapshotContentsEntity(contents0));
                        this.zzen = null;
                        break;
                    }
                    default: {
                        this.zzem = new SnapshotEntity(new SnapshotMetadataEntity(((SnapshotMetadata)snapshotMetadataBuffer0.get(0))), new SnapshotContentsEntity(contents0));
                        this.zzen = new SnapshotEntity(new SnapshotMetadataEntity(((SnapshotMetadata)snapshotMetadataBuffer0.get(1))), new SnapshotContentsEntity(contents1));
                    }
                }
            }
            finally {
                snapshotMetadataBuffer0.release();
            }
            this.zzch = s;
            this.zzeo = new SnapshotContentsEntity(contents2);
        }

        @Override  // com.google.android.gms.games.snapshot.Snapshots$OpenSnapshotResult
        public final String getConflictId() {
            return this.zzch;
        }

        @Override  // com.google.android.gms.games.snapshot.Snapshots$OpenSnapshotResult
        public final Snapshot getConflictingSnapshot() {
            return this.zzen;
        }

        @Override  // com.google.android.gms.games.snapshot.Snapshots$OpenSnapshotResult
        public final SnapshotContents getResolutionSnapshotContents() {
            return this.zzeo;
        }

        @Override  // com.google.android.gms.games.snapshot.Snapshots$OpenSnapshotResult
        public final Snapshot getSnapshot() {
            return this.zzem;
        }
    }

    static final class zzal extends com.google.android.gms.games.internal.zza {
        private TaskCompletionSource zzdv;

        zzal(TaskCompletionSource taskCompletionSource0) {
            this.zzdv = taskCompletionSource0;
        }

        @Override  // com.google.android.gms.games.internal.zza
        public final void zza(int v, VideoCapabilities videoCapabilities0) {
            if(v == 0) {
                this.zzdv.setResult(videoCapabilities0);
                return;
            }
            zzf.zzb(this.zzdv, v);
        }
    }

    static final class zzam extends zzaq {
        zzam(ResultHolder baseImplementation$ResultHolder0) {
            super(baseImplementation$ResultHolder0);
        }

        @Override  // com.google.android.gms.games.internal.zza
        public final void zze(DataHolder dataHolder0) {
            this.setResult(new zzaf(dataHolder0));
        }

        @Override  // com.google.android.gms.games.internal.zza
        public final void zzf(DataHolder dataHolder0) {
            this.setResult(new zzaf(dataHolder0));
        }
    }

    static final class zzan extends com.google.android.gms.games.internal.zza {
        private final TaskCompletionSource zzdv;

        zzan(TaskCompletionSource taskCompletionSource0) {
            this.zzdv = taskCompletionSource0;
        }

        @Override  // com.google.android.gms.games.internal.zza
        public final void zzao(DataHolder dataHolder0) {
            PlayerStats playerStats0;
            int v = dataHolder0.getStatusCode();
            if(v != 0 && v != 3) {
                zzf.zzb(this.zzdv, v);
                dataHolder0.close();
                return;
            }
            boolean z = false;
            PlayerStatsBuffer playerStatsBuffer0 = new PlayerStatsBuffer(dataHolder0);
            try {
                playerStats0 = playerStatsBuffer0.getCount() > 0 ? ((PlayerStats)((PlayerStats)playerStatsBuffer0.get(0)).freeze()) : null;
            }
            catch(Throwable throwable0) {
                try {
                    playerStatsBuffer0.close();
                }
                catch(Throwable throwable1) {
                    zzgh.zza(throwable0, throwable1);
                }
                throw throwable0;
            }
            playerStatsBuffer0.close();
            if(v == 3) {
                z = true;
            }
            AnnotatedData annotatedData0 = new AnnotatedData(playerStats0, z);
            this.zzdv.setResult(annotatedData0);
        }
    }

    static final class zzao extends com.google.android.gms.games.internal.zza {
        private final TaskCompletionSource zzdv;

        zzao(TaskCompletionSource taskCompletionSource0) {
            this.zzdv = taskCompletionSource0;
        }

        @Override  // com.google.android.gms.games.internal.zza
        public final void zze(DataHolder dataHolder0) {
            Player player0;
            int v = dataHolder0.getStatusCode();
            if(v != 0 && v != 3) {
                zzf.zzb(this.zzdv, v);
                dataHolder0.close();
                return;
            }
            boolean z = false;
            PlayerBuffer playerBuffer0 = new PlayerBuffer(dataHolder0);
            try {
                player0 = playerBuffer0.getCount() <= 0 ? null : ((Player)((Player)playerBuffer0.get(0)).freeze());
            }
            finally {
                playerBuffer0.release();
            }
            if(v == 3) {
                z = true;
            }
            AnnotatedData annotatedData0 = new AnnotatedData(player0, z);
            this.zzdv.setResult(annotatedData0);
        }
    }

    final class zzap extends com.google.android.gms.games.internal.zza {
        private final zzf zzdg;
        private final TaskCompletionSource zzdv;

        zzap(TaskCompletionSource taskCompletionSource0) {
            this.zzdv = taskCompletionSource0;
        }

        @Override  // com.google.android.gms.games.internal.zza
        public final void zze(DataHolder dataHolder0) {
            int v = dataHolder0.getStatusCode();
            if(v == 10003) {
                zzf.this.zza(this.zzdv);
                dataHolder0.close();
                return;
            }
            if(v != 0 && v != 3) {
                zzf.zzb(this.zzdv, v);
                dataHolder0.close();
                return;
            }
            AnnotatedData annotatedData0 = new AnnotatedData(new PlayerBuffer(dataHolder0), v == 3);
            this.zzdv.setResult(annotatedData0);
        }

        @Override  // com.google.android.gms.games.internal.zza
        public final void zzf(DataHolder dataHolder0) {
            this.zze(dataHolder0);
        }
    }

    static class zzaq extends com.google.android.gms.games.internal.zza {
        private final ResultHolder zzep;

        zzaq(ResultHolder baseImplementation$ResultHolder0) {
            this.zzep = (ResultHolder)Preconditions.checkNotNull(baseImplementation$ResultHolder0, "Holder must not be null");
        }

        final void setResult(Object object0) {
            this.zzep.setResult(object0);
        }
    }

    interface zzar {
        void accept(Object arg1);
    }

    static final class zzas extends zzaq {
        zzas(ResultHolder baseImplementation$ResultHolder0) {
            super(baseImplementation$ResultHolder0);
        }

        @Override  // com.google.android.gms.games.internal.zza
        public final void zza(DataHolder dataHolder0, Contents contents0) {
            this.setResult(new zzak(dataHolder0, contents0));
        }

        @Override  // com.google.android.gms.games.internal.zza
        public final void zza(DataHolder dataHolder0, String s, Contents contents0, Contents contents1, Contents contents2) {
            this.setResult(new zzak(dataHolder0, s, contents0, contents1, contents2));
        }
    }

    static final class zzat extends com.google.android.gms.games.internal.zza {
        private final TaskCompletionSource zzdv;

        zzat(TaskCompletionSource taskCompletionSource0) {
            this.zzdv = taskCompletionSource0;
        }

        @Override  // com.google.android.gms.games.internal.zza
        public final void zzd(DataHolder dataHolder0) {
            int v = dataHolder0.getStatusCode();
            if(v != 0 && v != 5) {
                zzf.zzb(this.zzdv, v);
                dataHolder0.close();
                return;
            }
            try {
                ScoreSubmissionData scoreSubmissionData0 = new ScoreSubmissionData(dataHolder0);
                this.zzdv.setResult(scoreSubmissionData0);
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(dataHolder0, throwable0);
                throw throwable0;
            }
            dataHolder0.close();
        }
    }

    static final class zzau extends zzaq {
        zzau(ResultHolder baseImplementation$ResultHolder0) {
            super(baseImplementation$ResultHolder0);
        }

        @Override  // com.google.android.gms.games.internal.zza
        public final void zzag(DataHolder dataHolder0) {
            this.setResult(new zzah(dataHolder0));
        }
    }

    static final class zzav extends com.google.android.gms.games.internal.zza {
        private final TaskCompletionSource zzdv;

        zzav(TaskCompletionSource taskCompletionSource0) {
            this.zzdv = taskCompletionSource0;
        }

        @Override  // com.google.android.gms.games.internal.zza
        public final void zza(DataHolder dataHolder0, Contents contents0) {
            SnapshotEntity snapshotEntity0;
            int v = dataHolder0.getStatusCode();
            SnapshotMetadataBuffer snapshotMetadataBuffer0 = new SnapshotMetadataBuffer(dataHolder0);
            try {
                snapshotEntity0 = snapshotMetadataBuffer0.getCount() > 0 ? new SnapshotEntity(((SnapshotMetadata)((SnapshotMetadata)snapshotMetadataBuffer0.get(0)).freeze()), new SnapshotContentsEntity(contents0)) : null;
            }
            catch(Throwable throwable0) {
                try {
                    snapshotMetadataBuffer0.close();
                }
                catch(Throwable throwable1) {
                    zzgh.zza(throwable0, throwable1);
                }
                throw throwable0;
            }
            snapshotMetadataBuffer0.close();
            if(v == 0) {
                DataOrConflict snapshotsClient$DataOrConflict0 = new DataOrConflict(snapshotEntity0, null);
                this.zzdv.setResult(snapshotsClient$DataOrConflict0);
                return;
            }
            if(v == 4002 && snapshotEntity0 != null && snapshotEntity0.getMetadata() != null) {
                SnapshotContentUnavailableApiException snapshotsClient$SnapshotContentUnavailableApiException0 = new SnapshotContentUnavailableApiException(GamesStatusCodes.zza(4002), snapshotEntity0.getMetadata());
                this.zzdv.setException(snapshotsClient$SnapshotContentUnavailableApiException0);
                return;
            }
            zzf.zzb(this.zzdv, v);
        }

        @Override  // com.google.android.gms.games.internal.zza
        public final void zza(DataHolder dataHolder0, String s, Contents contents0, Contents contents1, Contents contents2) {
            SnapshotEntity snapshotEntity1;
            SnapshotEntity snapshotEntity0;
            SnapshotMetadataBuffer snapshotMetadataBuffer0 = new SnapshotMetadataBuffer(dataHolder0);
            try {
                if(snapshotMetadataBuffer0.getCount() >= 2 && s != null && contents2 != null) {
                    snapshotEntity0 = new SnapshotEntity(((SnapshotMetadata)((SnapshotMetadata)snapshotMetadataBuffer0.get(0)).freeze()), new SnapshotContentsEntity(contents0));
                    snapshotEntity1 = new SnapshotEntity(((SnapshotMetadata)((SnapshotMetadata)snapshotMetadataBuffer0.get(1)).freeze()), new SnapshotContentsEntity(contents1));
                    goto label_4;
                }
                goto label_8;
            }
            catch(Throwable throwable0) {
                goto label_11;
            }
        label_4:
            snapshotMetadataBuffer0.close();
            DataOrConflict snapshotsClient$DataOrConflict0 = new DataOrConflict(null, new SnapshotConflict(snapshotEntity0, s, snapshotEntity1, new SnapshotContentsEntity(contents2)));
            this.zzdv.setResult(snapshotsClient$DataOrConflict0);
            return;
            try {
            label_8:
                this.zzdv.setResult(null);
            }
            catch(Throwable throwable0) {
                try {
                label_11:
                    snapshotMetadataBuffer0.close();
                }
                catch(Throwable throwable1) {
                    zzgh.zza(throwable0, throwable1);
                }
                throw throwable0;
            }
            snapshotMetadataBuffer0.close();
        }
    }

    static final class zzaw implements UpdateAchievementResult {
        private final String zzck;
        private final Status zzdw;

        zzaw(int v, String s) {
            this.zzdw = GamesStatusCodes.zza(v);
            this.zzck = s;
        }

        @Override  // com.google.android.gms.games.achievement.Achievements$UpdateAchievementResult
        public final String getAchievementId() {
            return this.zzck;
        }

        @Override  // com.google.android.gms.common.api.Result
        public final Status getStatus() {
            return this.zzdw;
        }
    }

    static final class zzax extends zzo implements SubmitScoreResult {
        private final ScoreSubmissionData zzeq;

        zzax(DataHolder dataHolder0) {
            super(dataHolder0);
            try {
                this.zzeq = new ScoreSubmissionData(dataHolder0);
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(dataHolder0, throwable0);
                throw throwable0;
            }
            dataHolder0.close();
        }

        @Override  // com.google.android.gms.games.leaderboard.Leaderboards$SubmitScoreResult
        public final ScoreSubmissionData getScoreData() {
            return this.zzeq;
        }
    }

    static final class zzb extends zzaq {
        zzb(ResultHolder baseImplementation$ResultHolder0) {
            super(baseImplementation$ResultHolder0);
        }

        @Override  // com.google.android.gms.games.internal.zza
        public final void zzb(int v, String s) {
            this.setResult(new zzaw(v, s));
        }
    }

    static final class zzc extends com.google.android.gms.games.internal.zza {
        private final TaskCompletionSource zzdv;

        zzc(TaskCompletionSource taskCompletionSource0) {
            this.zzdv = taskCompletionSource0;
        }

        @Override  // com.google.android.gms.games.internal.zza
        public final void zza(DataHolder dataHolder0) {
            int v = dataHolder0.getStatusCode();
            if(v != 0 && v != 3) {
                zzf.zzb(this.zzdv, v);
                dataHolder0.close();
                return;
            }
            AnnotatedData annotatedData0 = new AnnotatedData(new AchievementBuffer(dataHolder0), v == 3);
            this.zzdv.setResult(annotatedData0);
        }
    }

    static final class zzd extends com.google.android.gms.games.internal.zza {
        private final TaskCompletionSource zzdv;

        zzd(TaskCompletionSource taskCompletionSource0) {
            this.zzdv = taskCompletionSource0;
        }

        @Override  // com.google.android.gms.games.internal.zza
        public final void zzb(int v, String s) {
            if(v != 0 && v != 3003) {
                zzf.zzb(this.zzdv, v);
                return;
            }
            this.zzdv.setResult(null);
        }
    }

    static final class zze implements CaptureCapabilitiesResult {
        private final Status zzdw;
        private final VideoCapabilities zzdx;

        zze(Status status0, VideoCapabilities videoCapabilities0) {
            this.zzdw = status0;
            this.zzdx = videoCapabilities0;
        }

        @Override  // com.google.android.gms.games.video.Videos$CaptureCapabilitiesResult
        public final VideoCapabilities getCapabilities() {
            return this.zzdx;
        }

        @Override  // com.google.android.gms.common.api.Result
        public final Status getStatus() {
            return this.zzdw;
        }
    }

    static final class com.google.android.gms.games.internal.zzf.zzf implements CaptureAvailableResult {
        private final Status zzdw;
        private final boolean zzdy;

        com.google.android.gms.games.internal.zzf.zzf(Status status0, boolean z) {
            this.zzdw = status0;
            this.zzdy = z;
        }

        @Override  // com.google.android.gms.common.api.Result
        public final Status getStatus() {
            return this.zzdw;
        }

        @Override  // com.google.android.gms.games.video.Videos$CaptureAvailableResult
        public final boolean isAvailable() {
            return this.zzdy;
        }
    }

    static final class zzg extends com.google.android.gms.games.internal.zza {
        private final TaskCompletionSource zzdv;

        zzg(TaskCompletionSource taskCompletionSource0) {
            this.zzdv = taskCompletionSource0;
        }

        @Override  // com.google.android.gms.games.internal.zza
        public final void zzah(DataHolder dataHolder0) {
            SnapshotMetadata snapshotMetadata0;
            int v = dataHolder0.getStatusCode();
            if(v != 0) {
                zzf.zzb(this.zzdv, v);
                dataHolder0.close();
                return;
            }
            SnapshotMetadataBuffer snapshotMetadataBuffer0 = new SnapshotMetadataBuffer(dataHolder0);
            try {
                snapshotMetadata0 = snapshotMetadataBuffer0.getCount() > 0 ? ((SnapshotMetadata)((SnapshotMetadata)snapshotMetadataBuffer0.get(0)).freeze()) : null;
            }
            catch(Throwable throwable0) {
                try {
                    snapshotMetadataBuffer0.close();
                }
                catch(Throwable throwable1) {
                    zzgh.zza(throwable0, throwable1);
                }
                throw throwable0;
            }
            snapshotMetadataBuffer0.close();
            this.zzdv.setResult(snapshotMetadata0);
        }
    }

    static final class zzh implements CaptureStateResult {
        private final Status zzdw;
        private final CaptureState zzdz;

        zzh(Status status0, CaptureState captureState0) {
            this.zzdw = status0;
            this.zzdz = captureState0;
        }

        @Override  // com.google.android.gms.games.video.Videos$CaptureStateResult
        public final CaptureState getCaptureState() {
            return this.zzdz;
        }

        @Override  // com.google.android.gms.common.api.Result
        public final Status getStatus() {
            return this.zzdw;
        }
    }

    static final class zzi extends com.google.android.gms.games.internal.zza {
        private final TaskCompletionSource zzdv;

        zzi(TaskCompletionSource taskCompletionSource0) {
            this.zzdv = taskCompletionSource0;
        }

        @Override  // com.google.android.gms.games.internal.zza
        public final void zze(int v, String s) {
            if(v == 0) {
                this.zzdv.setResult(s);
                return;
            }
            zzf.zzb(this.zzdv, v);
        }
    }

    static final class zzj extends zzo implements CommitSnapshotResult {
        private final SnapshotMetadata zzea;

        zzj(DataHolder dataHolder0) {
            super(dataHolder0);
            SnapshotMetadataBuffer snapshotMetadataBuffer0 = new SnapshotMetadataBuffer(dataHolder0);
            try {
                this.zzea = snapshotMetadataBuffer0.getCount() > 0 ? new SnapshotMetadataEntity(((SnapshotMetadata)snapshotMetadataBuffer0.get(0))) : null;
            }
            finally {
                snapshotMetadataBuffer0.release();
            }
        }

        @Override  // com.google.android.gms.games.snapshot.Snapshots$CommitSnapshotResult
        public final SnapshotMetadata getSnapshotMetadata() {
            return this.zzea;
        }
    }

    static final class zzk extends zzaq {
        zzk(ResultHolder baseImplementation$ResultHolder0) {
            super(baseImplementation$ResultHolder0);
        }

        @Override  // com.google.android.gms.games.internal.zza
        public final void zzb(DataHolder dataHolder0) {
            this.setResult(new zzab(dataHolder0));
        }
    }

    static final class zzl implements DeleteSnapshotResult {
        private final Status zzdw;
        private final String zzeb;

        zzl(int v, String s) {
            this.zzdw = GamesStatusCodes.zza(v);
            this.zzeb = s;
        }

        @Override  // com.google.android.gms.games.snapshot.Snapshots$DeleteSnapshotResult
        public final String getSnapshotId() {
            return this.zzeb;
        }

        @Override  // com.google.android.gms.common.api.Result
        public final Status getStatus() {
            return this.zzdw;
        }
    }

    final class zzm extends zzfd {
        private final zzf zzdg;

        zzm() {
            super(zzf0.getContext().getMainLooper(), 1000);
        }

        @Override  // com.google.android.gms.internal.games.zzfd
        protected final void zzc(String s, int v) {
            try {
                if(zzf.this.isConnected()) {
                    ((com.google.android.gms.games.internal.zzac)zzf.this.getService()).zzb(s, v);
                    return;
                }
                zzz.e("GamesGmsClientImpl", "Unable to increment event " + s + " by " + v + " because the games client is no longer connected");
            }
            catch(RemoteException remoteException0) {
                zzf.zza(remoteException0);
            }
            catch(SecurityException securityException0) {
                zzf.zza(securityException0);
            }
        }
    }

    static final class zzn extends com.google.android.gms.games.internal.zza {
        private final TaskCompletionSource zzdv;

        zzn(TaskCompletionSource taskCompletionSource0) {
            this.zzdv = taskCompletionSource0;
        }

        @Override  // com.google.android.gms.games.internal.zza
        public final void zzb(DataHolder dataHolder0) {
            int v = dataHolder0.getStatusCode();
            if(v != 0 && v != 3) {
                zzf.zzb(this.zzdv, v);
                dataHolder0.close();
                return;
            }
            AnnotatedData annotatedData0 = new AnnotatedData(new EventBuffer(dataHolder0), v == 3);
            this.zzdv.setResult(annotatedData0);
        }
    }

    static class zzo extends DataHolderResult {
        zzo(DataHolder dataHolder0) {
            super(dataHolder0, GamesStatusCodes.zza(dataHolder0.getStatusCode()));
        }
    }

    static final class zzp extends com.google.android.gms.games.internal.zza {
        private final TaskCompletionSource zzdv;

        zzp(TaskCompletionSource taskCompletionSource0) {
            this.zzdv = taskCompletionSource0;
        }

        @Override  // com.google.android.gms.games.internal.zza
        public final void zzg(DataHolder dataHolder0) {
            Game game0;
            int v = dataHolder0.getStatusCode();
            if(v != 0 && v != 3) {
                zzf.zzb(this.zzdv, v);
                dataHolder0.close();
                return;
            }
            boolean z = false;
            GameBuffer gameBuffer0 = new GameBuffer(dataHolder0);
            try {
                game0 = gameBuffer0.getCount() > 0 ? ((Game)((Game)gameBuffer0.get(0)).freeze()) : null;
            }
            catch(Throwable throwable0) {
                try {
                    gameBuffer0.close();
                }
                catch(Throwable throwable1) {
                    zzgh.zza(throwable0, throwable1);
                }
                throw throwable0;
            }
            gameBuffer0.close();
            if(v == 3) {
                z = true;
            }
            AnnotatedData annotatedData0 = new AnnotatedData(game0, z);
            this.zzdv.setResult(annotatedData0);
        }
    }

    static final class zzq extends zzo implements LeaderboardMetadataResult {
        private final LeaderboardBuffer zzec;

        zzq(DataHolder dataHolder0) {
            super(dataHolder0);
            this.zzec = new LeaderboardBuffer(dataHolder0);
        }

        @Override  // com.google.android.gms.games.leaderboard.Leaderboards$LeaderboardMetadataResult
        public final LeaderboardBuffer getLeaderboards() {
            return this.zzec;
        }
    }

    static final class zzr extends com.google.android.gms.games.internal.zza {
        private final TaskCompletionSource zzdv;

        zzr(TaskCompletionSource taskCompletionSource0) {
            this.zzdv = taskCompletionSource0;
        }

        @Override  // com.google.android.gms.games.internal.zza
        public final void zzc(DataHolder dataHolder0) {
            Leaderboard leaderboard0;
            int v = dataHolder0.getStatusCode();
            if(v != 0 && v != 3) {
                zzf.zzb(this.zzdv, v);
                dataHolder0.close();
                return;
            }
            LeaderboardBuffer leaderboardBuffer0 = new LeaderboardBuffer(dataHolder0);
            try {
                leaderboard0 = leaderboardBuffer0.getCount() > 0 ? ((Leaderboard)((Leaderboard)leaderboardBuffer0.get(0)).freeze()) : null;
            }
            catch(Throwable throwable0) {
                try {
                    leaderboardBuffer0.close();
                }
                catch(Throwable throwable1) {
                    zzgh.zza(throwable0, throwable1);
                }
                throw throwable0;
            }
            leaderboardBuffer0.close();
            AnnotatedData annotatedData0 = new AnnotatedData(leaderboard0, v == 3);
            this.zzdv.setResult(annotatedData0);
        }
    }

    static final class zzs extends zzaq {
        zzs(ResultHolder baseImplementation$ResultHolder0) {
            super(baseImplementation$ResultHolder0);
        }

        @Override  // com.google.android.gms.games.internal.zza
        public final void zza(DataHolder dataHolder0, DataHolder dataHolder1) {
            this.setResult(new zzae(dataHolder0, dataHolder1));
        }
    }

    final class zzt extends com.google.android.gms.games.internal.zza {
        private final zzf zzdg;
        private final TaskCompletionSource zzdv;

        zzt(TaskCompletionSource taskCompletionSource0) {
            this.zzdv = taskCompletionSource0;
        }

        @Override  // com.google.android.gms.games.internal.zza
        public final void zzac(DataHolder dataHolder0) {
            LeaderboardScore leaderboardScore0;
            int v = dataHolder0.getStatusCode();
            switch(v) {
                case 0: {
                    break;
                }
                case 10003: {
                    zzf.this.zza(this.zzdv);
                    dataHolder0.close();
                    return;
                label_6:
                    if(v != 3) {
                        zzf.zzb(this.zzdv, v);
                        dataHolder0.close();
                        return;
                    }
                    break;
                }
                default: {
                    goto label_6;
                }
            }
            LeaderboardScoreBuffer leaderboardScoreBuffer0 = new LeaderboardScoreBuffer(dataHolder0);
            try {
                leaderboardScore0 = leaderboardScoreBuffer0.getCount() > 0 ? ((LeaderboardScore)((LeaderboardScore)leaderboardScoreBuffer0.get(0)).freeze()) : null;
            }
            catch(Throwable throwable0) {
                try {
                    leaderboardScoreBuffer0.close();
                }
                catch(Throwable throwable1) {
                    zzgh.zza(throwable0, throwable1);
                }
                throw throwable0;
            }
            leaderboardScoreBuffer0.close();
            AnnotatedData annotatedData0 = new AnnotatedData(leaderboardScore0, v == 3);
            this.zzdv.setResult(annotatedData0);
        }
    }

    static final class zzu extends zzaq {
        zzu(ResultHolder baseImplementation$ResultHolder0) {
            super(baseImplementation$ResultHolder0);
        }

        @Override  // com.google.android.gms.games.internal.zza
        public final void zzc(DataHolder dataHolder0) {
            this.setResult(new zzq(dataHolder0));
        }
    }

    final class zzv extends com.google.android.gms.games.internal.zza {
        private final zzf zzdg;
        private final TaskCompletionSource zzdv;

        zzv(TaskCompletionSource taskCompletionSource0) {
            this.zzdv = taskCompletionSource0;
        }

        @Override  // com.google.android.gms.games.internal.zza
        public final void zza(DataHolder dataHolder0, DataHolder dataHolder1) {
            Leaderboard leaderboard0;
            int v = dataHolder1.getStatusCode();
            switch(v) {
                case 0: {
                    break;
                }
                case 10003: {
                    zzf.this.zza(this.zzdv);
                    dataHolder0.close();
                    dataHolder1.close();
                    return;
                label_7:
                    if(v != 3) {
                        zzf.zzb(this.zzdv, v);
                        dataHolder0.close();
                        dataHolder1.close();
                        return;
                    }
                    break;
                }
                default: {
                    goto label_7;
                }
            }
            LeaderboardBuffer leaderboardBuffer0 = new LeaderboardBuffer(dataHolder0);
            try {
                leaderboard0 = leaderboardBuffer0.getCount() > 0 ? ((Leaderboard)((Leaderboard)leaderboardBuffer0.get(0)).freeze()) : null;
            }
            catch(Throwable throwable0) {
                try {
                    leaderboardBuffer0.close();
                }
                catch(Throwable throwable1) {
                    zzgh.zza(throwable0, throwable1);
                }
                throw throwable0;
            }
            leaderboardBuffer0.close();
            AnnotatedData annotatedData0 = new AnnotatedData(new LeaderboardScores(leaderboard0, new LeaderboardScoreBuffer(dataHolder1)), v == 3);
            this.zzdv.setResult(annotatedData0);
        }
    }

    static class zzw extends com.google.android.gms.games.internal.zza {
        private final ListenerHolder zzed;

        zzw(ListenerHolder listenerHolder0) {
            this.zzed = (ListenerHolder)Preconditions.checkNotNull(listenerHolder0, "Callback must not be null");
        }

        final void zzc(zzar zzf$zzar0) {
            Notifier listenerHolder$Notifier0 = zzf.zza(zzf$zzar0);
            this.zzed.notifyListener(listenerHolder$Notifier0);
        }
    }

    static final class zzx extends com.google.android.gms.games.internal.zza {
        private final TaskCompletionSource zzdv;

        zzx(TaskCompletionSource taskCompletionSource0) {
            this.zzdv = taskCompletionSource0;
        }

        @Override  // com.google.android.gms.games.internal.zza
        public final void zzc(DataHolder dataHolder0) {
            int v = dataHolder0.getStatusCode();
            if(v != 0 && v != 3) {
                zzf.zzb(this.zzdv, v);
                dataHolder0.close();
                return;
            }
            AnnotatedData annotatedData0 = new AnnotatedData(new LeaderboardBuffer(dataHolder0), v == 3);
            this.zzdv.setResult(annotatedData0);
        }
    }

    static final class zzy extends zzo implements LoadAchievementsResult {
        private final AchievementBuffer zzee;

        zzy(DataHolder dataHolder0) {
            super(dataHolder0);
            this.zzee = new AchievementBuffer(dataHolder0);
        }

        @Override  // com.google.android.gms.games.achievement.Achievements$LoadAchievementsResult
        public final AchievementBuffer getAchievements() {
            return this.zzee;
        }
    }

    static abstract class com.google.android.gms.games.internal.zzf.zzz implements Notifier {
        private com.google.android.gms.games.internal.zzf.zzz() {
        }

        com.google.android.gms.games.internal.zzf.zzz(com.google.android.gms.games.internal.zze zze0) {
        }

        @Override  // com.google.android.gms.common.api.internal.ListenerHolder$Notifier
        public void onNotifyListenerFailed() {
        }
    }

    private final zzfe zzdh;
    private final String zzdi;
    private PlayerEntity zzdj;
    private GameEntity zzdk;
    private final com.google.android.gms.games.internal.zzae zzdl;
    private boolean zzdm;
    private final long zzdn;
    private boolean zzdo;
    private final GamesOptions zzdp;
    private Bundle zzdq;

    public zzf(Context context0, Looper looper0, ClientSettings clientSettings0, GamesOptions games$GamesOptions0, ConnectionCallbacks connectionCallbacks0, OnConnectionFailedListener onConnectionFailedListener0) {
        super(context0, looper0, 1, clientSettings0, connectionCallbacks0, onConnectionFailedListener0);
        this.zzdh = new com.google.android.gms.games.internal.zze(this);
        this.zzdm = false;
        this.zzdo = false;
        this.zzdi = clientSettings0.getRealClientPackageName();
        this.zzdl = com.google.android.gms.games.internal.zzae.zza(this, clientSettings0.getGravityForPopups());
        this.zzdn = (long)this.hashCode();
        this.zzdp = games$GamesOptions0;
        if(!games$GamesOptions0.zzaq && (clientSettings0.getViewForPopups() != null || context0 instanceof Activity)) {
            this.zza(clientSettings0.getViewForPopups());
        }
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api$Client
    public void connect(ConnectionProgressReportCallbacks baseGmsClient$ConnectionProgressReportCallbacks0) {
        this.zzdj = null;
        this.zzdk = null;
        super.connect(baseGmsClient$ConnectionProgressReportCallbacks0);
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient
    protected IInterface createServiceInterface(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.games.internal.IGamesService");
        return iInterface0 instanceof com.google.android.gms.games.internal.zzac ? ((com.google.android.gms.games.internal.zzac)iInterface0) : new com.google.android.gms.games.internal.zzaf(iBinder0);
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api$Client
    public void disconnect() {
        this.zzdm = false;
        if(this.isConnected()) {
            try {
                this.zzdh.flush();
                ((com.google.android.gms.games.internal.zzac)this.getService()).zza(this.zzdn);
            }
            catch(RemoteException unused_ex) {
                zzz.w("GamesGmsClientImpl", "Failed to notify client disconnect.");
            }
        }
        super.disconnect();
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient
    public Bundle getConnectionHint() {
        try {
            Bundle bundle0 = ((com.google.android.gms.games.internal.zzac)this.getService()).getConnectionHint();
            if(bundle0 != null) {
                bundle0.setClassLoader(zzf.class.getClassLoader());
                this.zzdq = bundle0;
            }
            return bundle0;
        }
        catch(RemoteException remoteException0) {
            zzf.zza(remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient
    protected Bundle getGetServiceRequestExtraArgs() {
        String s = this.getContext().getResources().getConfiguration().locale.toString();
        Bundle bundle0 = this.zzdp.zzj();
        bundle0.putString("com.google.android.gms.games.key.gamePackageName", this.zzdi);
        bundle0.putString("com.google.android.gms.games.key.desiredLocale", s);
        bundle0.putParcelable("com.google.android.gms.games.key.popupWindowToken", new BinderWrapper(this.zzdl.zzbm()));
        if(!bundle0.containsKey("com.google.android.gms.games.key.API_VERSION")) {
            bundle0.putInt("com.google.android.gms.games.key.API_VERSION", 8);
        }
        bundle0.putBundle("com.google.android.gms.games.key.signInOptions", SignInClientImpl.createBundleFromClientSettings(this.getClientSettings()));
        return bundle0;
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api$Client
    public int getMinApkVersion() {
        return 12451000;
    }

    @Override  // com.google.android.gms.common.internal.GmsClient
    public Set getScopesForConnectionlessNonSignIn() {
        return this.getScopes();
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient
    protected String getServiceDescriptor() {
        return "com.google.android.gms.games.internal.IGamesService";
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient
    protected String getStartServiceAction() {
        return "com.google.android.gms.games.service.START";
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient
    public void onConnectedLocked(IInterface iInterface0) {
        com.google.android.gms.games.internal.zzac zzac0 = (com.google.android.gms.games.internal.zzac)iInterface0;
        super.onConnectedLocked(zzac0);
        if(this.zzdm) {
            this.zzdl.zzbo();
            this.zzdm = false;
        }
        if(!this.zzdp.zzaj && !this.zzdp.zzaq) {
            try {
                zzac0.zza(new com.google.android.gms.games.internal.zzr(new zzfi(this.zzdl.zzbn())), this.zzdn);
            }
            catch(RemoteException remoteException0) {
                zzf.zza(remoteException0);
            }
        }
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient
    public void onConnectionFailed(ConnectionResult connectionResult0) {
        super.onConnectionFailed(connectionResult0);
        this.zzdm = false;
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient
    protected void onPostInitHandler(int v, IBinder iBinder0, Bundle bundle0, int v1) {
        if(v == 0 && bundle0 != null) {
            bundle0.setClassLoader(zzf.class.getClassLoader());
            boolean z = bundle0.getBoolean("show_welcome_popup");
            this.zzdm = z;
            this.zzdo = z;
            this.zzdj = (PlayerEntity)bundle0.getParcelable("com.google.android.gms.games.current_player");
            this.zzdk = (GameEntity)bundle0.getParcelable("com.google.android.gms.games.current_game");
        }
        super.onPostInitHandler(v, iBinder0, bundle0, v1);
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api$Client
    public void onUserSignOut(SignOutCallbacks baseGmsClient$SignOutCallbacks0) {
        try {
            this.zzb(new com.google.android.gms.games.internal.zzx(baseGmsClient$SignOutCallbacks0));
        }
        catch(RemoteException unused_ex) {
            baseGmsClient$SignOutCallbacks0.onSignOutComplete();
        }
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api$Client
    public boolean requiresAccount() {
        return true;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api$Client
    public boolean requiresSignIn() {
        return this.zzdp.zzaw == 1 ? false : this.zzdp.zzat == null && !this.zzdp.zzaq;
    }

    public final void submitScore(String s, long v, String s1) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac)this.getService()).zza(null, s, v, s1);
        }
        catch(SecurityException unused_ex) {
        }
    }

    private static Notifier zza(zzar zzf$zzar0) {
        return new com.google.android.gms.games.internal.zzq(zzf$zzar0);
    }

    private static void zza(RemoteException remoteException0) {
        zzz.w("GamesGmsClientImpl", "service died", remoteException0);
    }

    private static void zza(ResultHolder baseImplementation$ResultHolder0, SecurityException securityException0) {
        if(baseImplementation$ResultHolder0 != null) {
            baseImplementation$ResultHolder0.setFailedResult(GamesClientStatusCodes.zza(4));
        }
    }

    private final void zza(TaskCompletionSource taskCompletionSource0) {
        try {
            taskCompletionSource0.setException(FriendsResolutionRequiredException.zza(GamesClientStatusCodes.zza(0x684F, ((com.google.android.gms.games.internal.zzac)this.getService()).zzbk())));
        }
        catch(RemoteException remoteException0) {
            taskCompletionSource0.setException(remoteException0);
        }
    }

    private static void zza(TaskCompletionSource taskCompletionSource0, SecurityException securityException0) {
        if(taskCompletionSource0 != null) {
            taskCompletionSource0.setException(new ApiException(GamesClientStatusCodes.zza(4)));
        }
    }

    private static void zza(SecurityException securityException0) {
        zzz.e("GamesGmsClientImpl", "Is player signed out?", securityException0);
    }

    public final Intent zza(PlayerEntity playerEntity0) throws RemoteException {
        return ((com.google.android.gms.games.internal.zzac)this.getService()).zza(playerEntity0);
    }

    public final Intent zza(String s, int v, int v1) {
        try {
            return ((com.google.android.gms.games.internal.zzac)this.getService()).zzb(s, v, v1);
        }
        catch(RemoteException remoteException0) {
            zzf.zza(remoteException0);
            return null;
        }
    }

    public final Intent zza(String s, boolean z, boolean z1, int v) throws RemoteException {
        return ((com.google.android.gms.games.internal.zzac)this.getService()).zza(s, z, z1, v);
    }

    final void zza(IBinder iBinder0, Bundle bundle0) {
        if(this.isConnected()) {
            try {
                ((com.google.android.gms.games.internal.zzac)this.getService()).zza(iBinder0, bundle0);
            }
            catch(RemoteException remoteException0) {
                zzf.zza(remoteException0);
            }
        }
    }

    public final void zza(View view0) {
        this.zzdl.zzb(view0);
    }

    public final void zza(ResultHolder baseImplementation$ResultHolder0) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac)this.getService()).zzb(new com.google.android.gms.games.internal.zzu(baseImplementation$ResultHolder0));
        }
        catch(SecurityException securityException0) {
            zzf.zza(baseImplementation$ResultHolder0, securityException0);
        }
    }

    public final void zza(ResultHolder baseImplementation$ResultHolder0, int v) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac)this.getService()).zza(new com.google.android.gms.games.internal.zzk(baseImplementation$ResultHolder0), v);
        }
        catch(SecurityException securityException0) {
            zzf.zza(baseImplementation$ResultHolder0, securityException0);
        }
    }

    public final void zza(ResultHolder baseImplementation$ResultHolder0, int v, boolean z, boolean z1) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac)this.getService()).zza(new zzam(baseImplementation$ResultHolder0), v, z, z1);
        }
        catch(SecurityException securityException0) {
            zzf.zza(baseImplementation$ResultHolder0, securityException0);
        }
    }

    public final void zza(ResultHolder baseImplementation$ResultHolder0, LeaderboardScoreBuffer leaderboardScoreBuffer0, int v, int v1) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac)this.getService()).zza(new zzs(baseImplementation$ResultHolder0), leaderboardScoreBuffer0.zzcf().zzcg(), v, v1);
        }
        catch(SecurityException securityException0) {
            zzf.zza(baseImplementation$ResultHolder0, securityException0);
        }
    }

    public final void zza(ResultHolder baseImplementation$ResultHolder0, Snapshot snapshot0, SnapshotMetadataChange snapshotMetadataChange0) throws RemoteException {
        SnapshotContents snapshotContents0 = snapshot0.getSnapshotContents();
        Preconditions.checkState(!snapshotContents0.isClosed(), "Snapshot already closed");
        BitmapTeleporter bitmapTeleporter0 = snapshotMetadataChange0.zzcl();
        if(bitmapTeleporter0 != null) {
            bitmapTeleporter0.setTempDir(this.getContext().getCacheDir());
        }
        Contents contents0 = snapshotContents0.zzck();
        snapshotContents0.close();
        try {
            ((com.google.android.gms.games.internal.zzac)this.getService()).zza(new com.google.android.gms.games.internal.zzg(baseImplementation$ResultHolder0), snapshot0.getMetadata().getSnapshotId(), ((SnapshotMetadataChangeEntity)snapshotMetadataChange0), contents0);
        }
        catch(SecurityException securityException0) {
            zzf.zza(baseImplementation$ResultHolder0, securityException0);
        }
    }

    public final void zza(ResultHolder baseImplementation$ResultHolder0, String s) throws RemoteException {
        zzb zzf$zzb0 = baseImplementation$ResultHolder0 == null ? null : new zzb(baseImplementation$ResultHolder0);
        try {
            com.google.android.gms.games.internal.zzac zzac0 = (com.google.android.gms.games.internal.zzac)this.getService();
            Bundle bundle0 = this.zzdl.zzbl();
            zzac0.zza(zzf$zzb0, s, this.zzdl.zzbm(), bundle0);
        }
        catch(SecurityException securityException0) {
            zzf.zza(baseImplementation$ResultHolder0, securityException0);
        }
    }

    public final void zza(ResultHolder baseImplementation$ResultHolder0, String s, int v) throws RemoteException {
        zzb zzf$zzb0 = baseImplementation$ResultHolder0 == null ? null : new zzb(baseImplementation$ResultHolder0);
        try {
            IInterface iInterface0 = this.getService();
            Bundle bundle0 = this.zzdl.zzbl();
            ((com.google.android.gms.games.internal.zzac)iInterface0).zza(zzf$zzb0, s, v, this.zzdl.zzbm(), bundle0);
        }
        catch(SecurityException securityException0) {
            zzf.zza(baseImplementation$ResultHolder0, securityException0);
        }
    }

    public final void zza(ResultHolder baseImplementation$ResultHolder0, String s, int v, int v1, int v2, boolean z) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac)this.getService()).zza(new zzs(baseImplementation$ResultHolder0), s, v, v1, v2, z);
        }
        catch(SecurityException securityException0) {
            zzf.zza(baseImplementation$ResultHolder0, securityException0);
        }
    }

    public final void zza(ResultHolder baseImplementation$ResultHolder0, String s, int v, boolean z, boolean z1) throws RemoteException {
        if(!s.equals("played_with") && !s.equals("friends_all")) {
            String s1 = String.valueOf(s);
            throw new IllegalArgumentException((s1.length() == 0 ? new String("Invalid player collection: ") : "Invalid player collection: " + s1));
        }
        try {
            ((com.google.android.gms.games.internal.zzac)this.getService()).zza(new zzam(baseImplementation$ResultHolder0), s, v, z, z1);
        }
        catch(SecurityException securityException0) {
            zzf.zza(baseImplementation$ResultHolder0, securityException0);
        }
    }

    public final void zza(ResultHolder baseImplementation$ResultHolder0, String s, long v, String s1) throws RemoteException {
        com.google.android.gms.games.internal.zzs zzs0 = baseImplementation$ResultHolder0 == null ? null : new com.google.android.gms.games.internal.zzs(baseImplementation$ResultHolder0);
        try {
            ((com.google.android.gms.games.internal.zzac)this.getService()).zza(zzs0, s, v, s1);
        }
        catch(SecurityException securityException0) {
            zzf.zza(baseImplementation$ResultHolder0, securityException0);
        }
    }

    public final void zza(ResultHolder baseImplementation$ResultHolder0, String s, String s1, int v, int v1) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac)this.getService()).zza(new com.google.android.gms.games.internal.zzt(baseImplementation$ResultHolder0), null, s1, v, v1);
        }
        catch(SecurityException securityException0) {
            zzf.zza(baseImplementation$ResultHolder0, securityException0);
        }
    }

    public final void zza(ResultHolder baseImplementation$ResultHolder0, String s, String s1, SnapshotMetadataChange snapshotMetadataChange0, SnapshotContents snapshotContents0) throws RemoteException {
        Preconditions.checkState(!snapshotContents0.isClosed(), "SnapshotContents already closed");
        BitmapTeleporter bitmapTeleporter0 = snapshotMetadataChange0.zzcl();
        if(bitmapTeleporter0 != null) {
            bitmapTeleporter0.setTempDir(this.getContext().getCacheDir());
        }
        Contents contents0 = snapshotContents0.zzck();
        snapshotContents0.close();
        try {
            ((com.google.android.gms.games.internal.zzac)this.getService()).zza(new zzas(baseImplementation$ResultHolder0), s, s1, ((SnapshotMetadataChangeEntity)snapshotMetadataChange0), contents0);
        }
        catch(SecurityException securityException0) {
            zzf.zza(baseImplementation$ResultHolder0, securityException0);
        }
    }

    public final void zza(ResultHolder baseImplementation$ResultHolder0, String s, boolean z) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac)this.getService()).zzb(new zzam(baseImplementation$ResultHolder0), s, z);
        }
        catch(SecurityException securityException0) {
            zzf.zza(baseImplementation$ResultHolder0, securityException0);
        }
    }

    public final void zza(ResultHolder baseImplementation$ResultHolder0, String s, boolean z, int v) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac)this.getService()).zza(new zzas(baseImplementation$ResultHolder0), s, z, v);
        }
        catch(SecurityException securityException0) {
            zzf.zza(baseImplementation$ResultHolder0, securityException0);
        }
    }

    public final void zza(ResultHolder baseImplementation$ResultHolder0, boolean z) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac)this.getService()).zzc(new zzam(baseImplementation$ResultHolder0), z);
        }
        catch(SecurityException securityException0) {
            zzf.zza(baseImplementation$ResultHolder0, securityException0);
        }
    }

    public final void zza(ResultHolder baseImplementation$ResultHolder0, boolean z, String[] arr_s) throws RemoteException {
        this.zzdh.flush();
        try {
            ((com.google.android.gms.games.internal.zzac)this.getService()).zza(new zzk(baseImplementation$ResultHolder0), z, arr_s);
        }
        catch(SecurityException securityException0) {
            zzf.zza(baseImplementation$ResultHolder0, securityException0);
        }
    }

    public final void zza(ListenerHolder listenerHolder0) throws RemoteException {
        ((com.google.android.gms.games.internal.zzac)this.getService()).zza(new com.google.android.gms.games.internal.zzn(listenerHolder0), this.zzdn);
    }

    public final void zza(Snapshot snapshot0) throws RemoteException {
        SnapshotContents snapshotContents0 = snapshot0.getSnapshotContents();
        Preconditions.checkState(!snapshotContents0.isClosed(), "Snapshot already closed");
        Contents contents0 = snapshotContents0.zzck();
        snapshotContents0.close();
        ((com.google.android.gms.games.internal.zzac)this.getService()).zza(contents0);
    }

    public final void zza(TaskCompletionSource taskCompletionSource0, int v) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac)this.getService()).zza(new zzai(taskCompletionSource0), v);
        }
        catch(SecurityException securityException0) {
            zzf.zza(taskCompletionSource0, securityException0);
        }
    }

    public final void zza(TaskCompletionSource taskCompletionSource0, LeaderboardScoreBuffer leaderboardScoreBuffer0, int v, int v1) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac)this.getService()).zza(new zzv(this, taskCompletionSource0), leaderboardScoreBuffer0.zzcf().zzcg(), v, v1);
        }
        catch(SecurityException securityException0) {
            zzf.zza(taskCompletionSource0, securityException0);
        }
    }

    public final void zza(TaskCompletionSource taskCompletionSource0, Snapshot snapshot0, SnapshotMetadataChange snapshotMetadataChange0) throws RemoteException {
        SnapshotContents snapshotContents0 = snapshot0.getSnapshotContents();
        Preconditions.checkState(!snapshotContents0.isClosed(), "Snapshot already closed");
        BitmapTeleporter bitmapTeleporter0 = snapshotMetadataChange0.zzcl();
        if(bitmapTeleporter0 != null) {
            bitmapTeleporter0.setTempDir(this.getContext().getCacheDir());
        }
        Contents contents0 = snapshotContents0.zzck();
        snapshotContents0.close();
        try {
            ((com.google.android.gms.games.internal.zzac)this.getService()).zza(new zzg(taskCompletionSource0), snapshot0.getMetadata().getSnapshotId(), ((SnapshotMetadataChangeEntity)snapshotMetadataChange0), contents0);
        }
        catch(SecurityException securityException0) {
            zzf.zza(taskCompletionSource0, securityException0);
        }
    }

    public final void zza(TaskCompletionSource taskCompletionSource0, String s) throws RemoteException {
        zzd zzf$zzd0 = taskCompletionSource0 == null ? null : new zzd(taskCompletionSource0);
        try {
            com.google.android.gms.games.internal.zzac zzac0 = (com.google.android.gms.games.internal.zzac)this.getService();
            Bundle bundle0 = this.zzdl.zzbl();
            zzac0.zza(zzf$zzd0, s, this.zzdl.zzbm(), bundle0);
        }
        catch(SecurityException securityException0) {
            zzf.zza(taskCompletionSource0, securityException0);
        }
    }

    public final void zza(TaskCompletionSource taskCompletionSource0, String s, int v) throws RemoteException {
        zza zzf$zza0 = taskCompletionSource0 == null ? null : new zza(taskCompletionSource0);
        try {
            IInterface iInterface0 = this.getService();
            Bundle bundle0 = this.zzdl.zzbl();
            ((com.google.android.gms.games.internal.zzac)iInterface0).zza(zzf$zza0, s, v, this.zzdl.zzbm(), bundle0);
        }
        catch(SecurityException securityException0) {
            zzf.zza(taskCompletionSource0, securityException0);
        }
    }

    public final void zza(TaskCompletionSource taskCompletionSource0, String s, int v, int v1) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac)this.getService()).zza(new zzt(this, taskCompletionSource0), null, s, v, v1);
        }
        catch(SecurityException securityException0) {
            zzf.zza(taskCompletionSource0, securityException0);
        }
    }

    public final void zza(TaskCompletionSource taskCompletionSource0, String s, int v, int v1, int v2, boolean z) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac)this.getService()).zza(new zzv(this, taskCompletionSource0), s, v, v1, v2, z);
        }
        catch(SecurityException securityException0) {
            zzf.zza(taskCompletionSource0, securityException0);
        }
    }

    public final void zza(TaskCompletionSource taskCompletionSource0, String s, int v, boolean z, boolean z1) throws RemoteException {
        if(!s.equals("played_with") && !s.equals("friends_all")) {
            String s1 = String.valueOf(s);
            throw new IllegalArgumentException((s1.length() == 0 ? new String("Invalid player collection: ") : "Invalid player collection: " + s1));
        }
        try {
            ((com.google.android.gms.games.internal.zzac)this.getService()).zza(new zzap(this, taskCompletionSource0), s, v, z, z1);
        }
        catch(SecurityException securityException0) {
            zzf.zza(taskCompletionSource0, securityException0);
        }
    }

    public final void zza(TaskCompletionSource taskCompletionSource0, String s, long v, String s1) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac)this.getService()).zza(new zzat(taskCompletionSource0), s, v, s1);
        }
        catch(SecurityException securityException0) {
            zzf.zza(taskCompletionSource0, securityException0);
        }
    }

    public final void zza(TaskCompletionSource taskCompletionSource0, String s, String s1, SnapshotMetadataChange snapshotMetadataChange0, SnapshotContents snapshotContents0) throws RemoteException {
        Preconditions.checkState(!snapshotContents0.isClosed(), "SnapshotContents already closed");
        BitmapTeleporter bitmapTeleporter0 = snapshotMetadataChange0.zzcl();
        if(bitmapTeleporter0 != null) {
            bitmapTeleporter0.setTempDir(this.getContext().getCacheDir());
        }
        Contents contents0 = snapshotContents0.zzck();
        snapshotContents0.close();
        try {
            ((com.google.android.gms.games.internal.zzac)this.getService()).zza(new zzav(taskCompletionSource0), s, s1, ((SnapshotMetadataChangeEntity)snapshotMetadataChange0), contents0);
        }
        catch(SecurityException securityException0) {
            zzf.zza(taskCompletionSource0, securityException0);
        }
    }

    public final void zza(TaskCompletionSource taskCompletionSource0, String s, boolean z) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac)this.getService()).zzb(new zzao(taskCompletionSource0), s, z);
        }
        catch(SecurityException securityException0) {
            zzf.zza(taskCompletionSource0, securityException0);
        }
    }

    public final void zza(TaskCompletionSource taskCompletionSource0, String s, boolean z, int v) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac)this.getService()).zza(new zzav(taskCompletionSource0), s, z, v);
        }
        catch(SecurityException securityException0) {
            zzf.zza(taskCompletionSource0, securityException0);
        }
    }

    public final void zza(TaskCompletionSource taskCompletionSource0, boolean z) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac)this.getService()).zzb(new zzao(taskCompletionSource0), null, z);
        }
        catch(SecurityException securityException0) {
            zzf.zza(taskCompletionSource0, securityException0);
        }
    }

    public final void zza(TaskCompletionSource taskCompletionSource0, boolean z, String[] arr_s) throws RemoteException {
        this.zzdh.flush();
        try {
            ((com.google.android.gms.games.internal.zzac)this.getService()).zza(new zzn(taskCompletionSource0), z, arr_s);
        }
        catch(SecurityException securityException0) {
            zzf.zza(taskCompletionSource0, securityException0);
        }
    }

    public final Bundle zzah() {
        Bundle bundle0 = this.getConnectionHint();
        if(bundle0 == null) {
            bundle0 = this.zzdq;
        }
        this.zzdq = null;
        return bundle0;
    }

    public final String zzai() throws RemoteException {
        return ((com.google.android.gms.games.internal.zzac)this.getService()).zzai();
    }

    public final String zzaj() {
        try {
            return this.zzai();
        }
        catch(RemoteException remoteException0) {
            zzf.zza(remoteException0);
            return null;
        }
    }

    public final Player zzak() throws RemoteException {
        this.checkConnected();
        synchronized(this) {
            if(this.zzdj == null) {
                PlayerBuffer playerBuffer0 = new PlayerBuffer(((com.google.android.gms.games.internal.zzac)this.getService()).zzbg());
                try {
                    if(playerBuffer0.getCount() > 0) {
                        this.zzdj = (PlayerEntity)((Player)playerBuffer0.get(0)).freeze();
                    }
                }
                finally {
                    playerBuffer0.release();
                }
            }
            return this.zzdj;
        }
    }

    public final Player zzal() {
        try {
            return this.zzak();
        }
        catch(RemoteException remoteException0) {
            zzf.zza(remoteException0);
            return null;
        }
    }

    public final Game zzam() throws RemoteException {
        this.checkConnected();
        synchronized(this) {
            if(this.zzdk == null) {
                GameBuffer gameBuffer0 = new GameBuffer(((com.google.android.gms.games.internal.zzac)this.getService()).zzbh());
                try {
                    if(gameBuffer0.getCount() > 0) {
                        this.zzdk = (GameEntity)((Game)gameBuffer0.get(0)).freeze();
                    }
                }
                finally {
                    gameBuffer0.release();
                }
            }
            return this.zzdk;
        }
    }

    public final Game zzan() {
        try {
            return this.zzam();
        }
        catch(RemoteException remoteException0) {
            zzf.zza(remoteException0);
            return null;
        }
    }

    public final Intent zzao() throws RemoteException {
        return ((com.google.android.gms.games.internal.zzac)this.getService()).zzao();
    }

    public final Intent zzap() {
        try {
            return this.zzao();
        }
        catch(RemoteException remoteException0) {
            zzf.zza(remoteException0);
            return null;
        }
    }

    public final Intent zzaq() {
        try {
            return ((com.google.android.gms.games.internal.zzac)this.getService()).zzaq();
        }
        catch(RemoteException remoteException0) {
            zzf.zza(remoteException0);
            return null;
        }
    }

    public final Intent zzar() throws RemoteException {
        return ((com.google.android.gms.games.internal.zzac)this.getService()).zzar();
    }

    public final Intent zzas() {
        try {
            return this.zzar();
        }
        catch(RemoteException remoteException0) {
            zzf.zza(remoteException0);
            return null;
        }
    }

    public final int zzat() throws RemoteException {
        return ((com.google.android.gms.games.internal.zzac)this.getService()).zzat();
    }

    public final int zzau() {
        try {
            return this.zzat();
        }
        catch(RemoteException remoteException0) {
            zzf.zza(remoteException0);
            return -1;
        }
    }

    public final int zzav() throws RemoteException {
        return ((com.google.android.gms.games.internal.zzac)this.getService()).zzav();
    }

    public final int zzaw() {
        try {
            return this.zzav();
        }
        catch(RemoteException remoteException0) {
            zzf.zza(remoteException0);
            return -1;
        }
    }

    public final Intent zzax() throws RemoteException {
        return ((com.google.android.gms.games.internal.zzac)this.getService()).zzbj();
    }

    public final Intent zzay() {
        try {
            return this.zzax();
        }
        catch(RemoteException remoteException0) {
            zzf.zza(remoteException0);
            return null;
        }
    }

    public final boolean zzaz() throws RemoteException {
        return ((com.google.android.gms.games.internal.zzac)this.getService()).zzaz();
    }

    private static void zzb(TaskCompletionSource taskCompletionSource0, int v) {
        int v2;
        Status status0 = GamesStatusCodes.zza(v);
        int v1 = status0.getStatusCode();
        switch(v1) {
            case 1: {
                v2 = 8;
                break;
            }
            case 2: {
                v2 = 26502;
                break;
            }
            case 3: {
                v2 = 26503;
                break;
            }
            case 4: {
                v2 = 26504;
                break;
            }
            case 5: {
                v2 = 26505;
                break;
            }
            case 6: {
                v2 = 26506;
                break;
            }
            case 7: {
                v2 = 26507;
                break;
            }
            case 8: {
                v2 = 26508;
                break;
            }
            case 9: {
                v2 = 26509;
                break;
            }
            case 500: {
                v2 = 26520;
                break;
            }
            case 1000: {
                v2 = 26530;
                break;
            }
            case 1001: {
                v2 = 0x67A3;
                break;
            }
            case 1002: {
                v2 = 0x67A4;
                break;
            }
            case 1003: {
                v2 = 0x67A5;
                break;
            }
            case 1004: {
                v2 = 0x67A6;
                break;
            }
            case 1005: {
                v2 = 0x67A7;
                break;
            }
            case 1006: {
                v2 = 0x67A8;
                break;
            }
            case 1500: {
                v2 = 26540;
                break;
            }
            case 1501: {
                v2 = 0x67AD;
                break;
            }
            case 2000: {
                v2 = 26550;
                break;
            }
            case 2001: {
                v2 = 0x67B7;
                break;
            }
            case 2002: {
                v2 = 0x67B8;
                break;
            }
            case 3000: {
                v2 = 0x67C0;
                break;
            }
            case 3001: {
                v2 = 0x67C1;
                break;
            }
            case 3002: {
                v2 = 0x67C2;
                break;
            }
            case 3003: {
                v2 = 0x67C3;
                break;
            }
            case 4000: {
                v2 = 26570;
                break;
            }
            case 4001: {
                v2 = 0x67CB;
                break;
            }
            case 4002: {
                v2 = 0x67CC;
                break;
            }
            case 4003: {
                v2 = 0x67CD;
                break;
            }
            case 4004: {
                v2 = 0x67CE;
                break;
            }
            case 4005: {
                v2 = 0x67CF;
                break;
            }
            case 4006: {
                v2 = 0x67D0;
                break;
            }
            case 6000: {
                v2 = 26580;
                break;
            }
            case 6001: {
                v2 = 0x67D5;
                break;
            }
            case 6002: {
                v2 = 0x67D6;
                break;
            }
            case 6003: {
                v2 = 0x67D7;
                break;
            }
            case 6004: {
                v2 = 0x67D8;
                break;
            }
            case 6500: {
                v2 = 26590;
                break;
            }
            case 6501: {
                v2 = 0x67DF;
                break;
            }
            case 6502: {
                v2 = 0x67E0;
                break;
            }
            case 6503: {
                v2 = 0x67E1;
                break;
            }
            case 6504: {
                v2 = 0x67E2;
                break;
            }
            case 6505: {
                v2 = 0x67E3;
                break;
            }
            case 6506: {
                v2 = 0x67E4;
                break;
            }
            case 6507: {
                v2 = 0x67E5;
                break;
            }
            case 7000: {
                v2 = 26600;
                break;
            }
            case 7001: {
                v2 = 26601;
                break;
            }
            case 7002: {
                v2 = 26602;
                break;
            }
            case 7003: {
                v2 = 26603;
                break;
            }
            case 7004: {
                v2 = 26604;
                break;
            }
            case 7005: {
                v2 = 26605;
                break;
            }
            case 7006: {
                v2 = 26606;
                break;
            }
            case 7007: {
                v2 = 0x67EF;
                break;
            }
            case 8000: {
                v2 = 0x67F2;
                break;
            }
            case 8001: {
                v2 = 0x67F3;
                break;
            }
            case 8002: {
                v2 = 0x67F4;
                break;
            }
            case 8003: {
                v2 = 0x67F5;
                break;
            }
            case 9000: {
                v2 = 0x67FC;
                break;
            }
            case 9001: {
                v2 = 0x67FD;
                break;
            }
            case 9002: {
                v2 = 0x67FE;
                break;
            }
            case 9003: {
                v2 = 0x67FF;
                break;
            }
            case 9004: {
                v2 = 0x6800;
                break;
            }
            case 9006: {
                v2 = 0x6801;
                break;
            }
            case 9009: {
                v2 = 0x6802;
                break;
            }
            case 9010: {
                v2 = 0x6803;
                break;
            }
            case 9011: {
                v2 = 0x6804;
                break;
            }
            case 9012: {
                v2 = 0x6805;
                break;
            }
            case 9016: {
                v2 = 0x6806;
                break;
            }
            case 9017: {
                v2 = 0x6807;
                break;
            }
            case 9018: {
                v2 = 0x6808;
                break;
            }
            case 9200: {
                v2 = 26650;
                break;
            }
            case 9202: {
                v2 = 0x681C;
                break;
            }
            case 10000: {
                v2 = 26700;
                break;
            }
            case 10001: {
                v2 = 26701;
                break;
            }
            case 10002: {
                v2 = 26702;
                break;
            }
            case 10003: {
                v2 = 0x684F;
                break;
            }
            case 10004: {
                v2 = 0x6850;
                break;
            }
            default: {
                v2 = v1;
            }
        }
        if(v2 != status0.getStatusCode()) {
            if(GamesStatusCodes.getStatusString(status0.getStatusCode()).equals(status0.getStatusMessage())) {
                status0 = GamesClientStatusCodes.zza(v2, status0.getResolution());
            }
            else {
                switch(v1) {
                    case 2: 
                    case 3: 
                    case 4: 
                    case 5: 
                    case 6: 
                    case 7: 
                    case 8: 
                    case 10: {
                        break;
                    }
                    default: {
                        status0 = new Status(v2, status0.getStatusMessage(), status0.getResolution());
                    }
                }
            }
        }
        taskCompletionSource0.setException(ApiExceptionUtil.fromStatus(status0));
    }

    public final Intent zzb(PlayerEntity playerEntity0) {
        try {
            return this.zza(playerEntity0);
        }
        catch(RemoteException remoteException0) {
            zzf.zza(remoteException0);
            return null;
        }
    }

    public final Intent zzb(String s, boolean z, boolean z1, int v) {
        try {
            return this.zza(s, z, z1, v);
        }
        catch(RemoteException remoteException0) {
            zzf.zza(remoteException0);
            return null;
        }
    }

    public final String zzb(boolean z) throws RemoteException {
        PlayerEntity playerEntity0 = this.zzdj;
        return playerEntity0 == null ? ((com.google.android.gms.games.internal.zzac)this.getService()).zzbf() : playerEntity0.getPlayerId();
    }

    public final void zzb(ResultHolder baseImplementation$ResultHolder0) throws RemoteException {
        this.zzdh.flush();
        try {
            ((com.google.android.gms.games.internal.zzac)this.getService()).zza(new com.google.android.gms.games.internal.zzw(baseImplementation$ResultHolder0));
        }
        catch(SecurityException securityException0) {
            zzf.zza(baseImplementation$ResultHolder0, securityException0);
        }
    }

    public final void zzb(ResultHolder baseImplementation$ResultHolder0, String s) throws RemoteException {
        zzb zzf$zzb0 = baseImplementation$ResultHolder0 == null ? null : new zzb(baseImplementation$ResultHolder0);
        try {
            com.google.android.gms.games.internal.zzac zzac0 = (com.google.android.gms.games.internal.zzac)this.getService();
            Bundle bundle0 = this.zzdl.zzbl();
            zzac0.zzb(zzf$zzb0, s, this.zzdl.zzbm(), bundle0);
        }
        catch(SecurityException securityException0) {
            zzf.zza(baseImplementation$ResultHolder0, securityException0);
        }
    }

    public final void zzb(ResultHolder baseImplementation$ResultHolder0, String s, int v) throws RemoteException {
        zzb zzf$zzb0 = baseImplementation$ResultHolder0 == null ? null : new zzb(baseImplementation$ResultHolder0);
        try {
            IInterface iInterface0 = this.getService();
            Bundle bundle0 = this.zzdl.zzbl();
            ((com.google.android.gms.games.internal.zzac)iInterface0).zzb(zzf$zzb0, s, v, this.zzdl.zzbm(), bundle0);
        }
        catch(SecurityException securityException0) {
            zzf.zza(baseImplementation$ResultHolder0, securityException0);
        }
    }

    public final void zzb(ResultHolder baseImplementation$ResultHolder0, String s, int v, int v1, int v2, boolean z) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac)this.getService()).zzb(new zzs(baseImplementation$ResultHolder0), s, v, v1, v2, z);
        }
        catch(SecurityException securityException0) {
            zzf.zza(baseImplementation$ResultHolder0, securityException0);
        }
    }

    public final void zzb(ResultHolder baseImplementation$ResultHolder0, String s, boolean z) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac)this.getService()).zza(new zzu(baseImplementation$ResultHolder0), s, z);
        }
        catch(SecurityException securityException0) {
            zzf.zza(baseImplementation$ResultHolder0, securityException0);
        }
    }

    public final void zzb(ResultHolder baseImplementation$ResultHolder0, boolean z) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac)this.getService()).zzb(new zzu(baseImplementation$ResultHolder0), z);
        }
        catch(SecurityException securityException0) {
            zzf.zza(baseImplementation$ResultHolder0, securityException0);
        }
    }

    public final void zzb(ListenerHolder listenerHolder0) {
        try {
            ((com.google.android.gms.games.internal.zzac)this.getService()).zza(new com.google.android.gms.games.internal.zzp(listenerHolder0), this.zzdn);
        }
        catch(RemoteException remoteException0) {
            zzf.zza(remoteException0);
        }
    }

    public final void zzb(Snapshot snapshot0) {
        try {
            this.zza(snapshot0);
        }
        catch(RemoteException remoteException0) {
            zzf.zza(remoteException0);
        }
    }

    public final void zzb(TaskCompletionSource taskCompletionSource0) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac)this.getService()).zzb(new zzp(taskCompletionSource0));
        }
        catch(SecurityException securityException0) {
            zzf.zza(taskCompletionSource0, securityException0);
        }
    }

    public final void zzb(TaskCompletionSource taskCompletionSource0, String s) throws RemoteException {
        zzd zzf$zzd0 = taskCompletionSource0 == null ? null : new zzd(taskCompletionSource0);
        try {
            com.google.android.gms.games.internal.zzac zzac0 = (com.google.android.gms.games.internal.zzac)this.getService();
            Bundle bundle0 = this.zzdl.zzbl();
            zzac0.zzb(zzf$zzd0, s, this.zzdl.zzbm(), bundle0);
        }
        catch(SecurityException securityException0) {
            zzf.zza(taskCompletionSource0, securityException0);
        }
    }

    public final void zzb(TaskCompletionSource taskCompletionSource0, String s, int v) throws RemoteException {
        zza zzf$zza0 = taskCompletionSource0 == null ? null : new zza(taskCompletionSource0);
        try {
            IInterface iInterface0 = this.getService();
            Bundle bundle0 = this.zzdl.zzbl();
            ((com.google.android.gms.games.internal.zzac)iInterface0).zzb(zzf$zza0, s, v, this.zzdl.zzbm(), bundle0);
        }
        catch(SecurityException securityException0) {
            zzf.zza(taskCompletionSource0, securityException0);
        }
    }

    public final void zzb(TaskCompletionSource taskCompletionSource0, String s, int v, int v1, int v2, boolean z) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac)this.getService()).zzb(new zzv(this, taskCompletionSource0), s, v, v1, v2, z);
        }
        catch(SecurityException securityException0) {
            zzf.zza(taskCompletionSource0, securityException0);
        }
    }

    public final void zzb(TaskCompletionSource taskCompletionSource0, String s, boolean z) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac)this.getService()).zza(new zzr(taskCompletionSource0), s, z);
        }
        catch(SecurityException securityException0) {
            zzf.zza(taskCompletionSource0, securityException0);
        }
    }

    public final void zzb(TaskCompletionSource taskCompletionSource0, boolean z) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac)this.getService()).zzb(new zzx(taskCompletionSource0), z);
        }
        catch(SecurityException securityException0) {
            zzf.zza(taskCompletionSource0, securityException0);
        }
    }

    public final void zzb(String s, int v) {
        this.zzdh.zzb(s, v);
    }

    public final boolean zzba() {
        try {
            return this.zzaz();
        }
        catch(RemoteException remoteException0) {
            zzf.zza(remoteException0);
            return false;
        }
    }

    public final void zzbb() throws RemoteException {
        ((com.google.android.gms.games.internal.zzac)this.getService()).zzb(this.zzdn);
    }

    public final void zzbc() {
        try {
            this.zzbb();
        }
        catch(RemoteException remoteException0) {
            zzf.zza(remoteException0);
        }
    }

    final void zzbd() {
        if(this.isConnected()) {
            try {
                ((com.google.android.gms.games.internal.zzac)this.getService()).zzbd();
            }
            catch(RemoteException remoteException0) {
                zzf.zza(remoteException0);
            }
        }
    }

    public final String zzc(boolean z) {
        try {
            return this.zzb(true);
        }
        catch(RemoteException remoteException0) {
            zzf.zza(remoteException0);
            return null;
        }
    }

    public final void zzc(ResultHolder baseImplementation$ResultHolder0) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac)this.getService()).zzc(new com.google.android.gms.games.internal.zzi(baseImplementation$ResultHolder0));
        }
        catch(SecurityException securityException0) {
            zzf.zza(baseImplementation$ResultHolder0, securityException0);
        }
    }

    public final void zzc(ResultHolder baseImplementation$ResultHolder0, String s) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac)this.getService()).zza(new com.google.android.gms.games.internal.zzj(baseImplementation$ResultHolder0), s);
        }
        catch(SecurityException securityException0) {
            zzf.zza(baseImplementation$ResultHolder0, securityException0);
        }
    }

    public final void zzc(ResultHolder baseImplementation$ResultHolder0, boolean z) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac)this.getService()).zza(new com.google.android.gms.games.internal.zzv(baseImplementation$ResultHolder0), z);
        }
        catch(SecurityException securityException0) {
            zzf.zza(baseImplementation$ResultHolder0, securityException0);
        }
    }

    public final void zzc(TaskCompletionSource taskCompletionSource0) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac)this.getService()).zzc(new zzal(taskCompletionSource0));
        }
        catch(SecurityException securityException0) {
            zzf.zza(taskCompletionSource0, securityException0);
        }
    }

    public final void zzc(TaskCompletionSource taskCompletionSource0, String s) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac)this.getService()).zza(new zzi(taskCompletionSource0), s);
        }
        catch(SecurityException securityException0) {
            zzf.zza(taskCompletionSource0, securityException0);
        }
    }

    public final void zzc(TaskCompletionSource taskCompletionSource0, boolean z) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac)this.getService()).zza(new zzc(taskCompletionSource0), z);
        }
        catch(SecurityException securityException0) {
            zzf.zza(taskCompletionSource0, securityException0);
        }
    }

    public final void zzd(ResultHolder baseImplementation$ResultHolder0) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac)this.getService()).zzd(new com.google.android.gms.games.internal.zzl(baseImplementation$ResultHolder0));
        }
        catch(SecurityException securityException0) {
            zzf.zza(baseImplementation$ResultHolder0, securityException0);
        }
    }

    public final void zzd(ResultHolder baseImplementation$ResultHolder0, boolean z) throws RemoteException {
        this.zzdh.flush();
        try {
            ((com.google.android.gms.games.internal.zzac)this.getService()).zze(new zzk(baseImplementation$ResultHolder0), z);
        }
        catch(SecurityException securityException0) {
            zzf.zza(baseImplementation$ResultHolder0, securityException0);
        }
    }

    public final void zzd(TaskCompletionSource taskCompletionSource0) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac)this.getService()).zzd(new zzag(taskCompletionSource0));
        }
        catch(SecurityException securityException0) {
            zzf.zza(taskCompletionSource0, securityException0);
        }
    }

    public final void zzd(TaskCompletionSource taskCompletionSource0, boolean z) throws RemoteException {
        this.zzdh.flush();
        try {
            ((com.google.android.gms.games.internal.zzac)this.getService()).zze(new zzn(taskCompletionSource0), z);
        }
        catch(SecurityException securityException0) {
            zzf.zza(taskCompletionSource0, securityException0);
        }
    }

    public final void zze(ResultHolder baseImplementation$ResultHolder0, boolean z) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac)this.getService()).zzf(new com.google.android.gms.games.internal.zzh(baseImplementation$ResultHolder0), z);
        }
        catch(SecurityException securityException0) {
            zzf.zza(baseImplementation$ResultHolder0, securityException0);
        }
    }

    public final void zze(TaskCompletionSource taskCompletionSource0, boolean z) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac)this.getService()).zzf(new zzan(taskCompletionSource0), z);
        }
        catch(SecurityException securityException0) {
            zzf.zza(taskCompletionSource0, securityException0);
        }
    }

    public final void zzf(ResultHolder baseImplementation$ResultHolder0, boolean z) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac)this.getService()).zzd(new zzau(baseImplementation$ResultHolder0), z);
        }
        catch(SecurityException securityException0) {
            zzf.zza(baseImplementation$ResultHolder0, securityException0);
        }
    }

    public final void zzf(TaskCompletionSource taskCompletionSource0, boolean z) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac)this.getService()).zzd(new zzaj(taskCompletionSource0), z);
        }
        catch(SecurityException securityException0) {
            zzf.zza(taskCompletionSource0, securityException0);
        }
    }

    public final void zzn(int v) {
        this.zzdl.setGravity(v);
    }
}

