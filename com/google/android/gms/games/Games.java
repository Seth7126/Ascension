package com.google.android.gms.games;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions;
import com.google.android.gms.common.api.Api.ApiOptions.Optional;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.achievement.Achievements;
import com.google.android.gms.games.event.Events;
import com.google.android.gms.games.internal.zzf;
import com.google.android.gms.games.leaderboard.Leaderboards;
import com.google.android.gms.games.snapshot.Snapshots;
import com.google.android.gms.games.stats.Stats;
import com.google.android.gms.games.video.Videos;
import com.google.android.gms.internal.games.zzae;
import com.google.android.gms.internal.games.zzai;
import com.google.android.gms.internal.games.zzaq;
import com.google.android.gms.internal.games.zzaz;
import com.google.android.gms.internal.games.zzba;
import com.google.android.gms.internal.games.zzbj;
import com.google.android.gms.internal.games.zzbu;
import com.google.android.gms.internal.games.zzck;
import com.google.android.gms.internal.games.zzcm;
import com.google.android.gms.internal.games.zzcw;
import com.google.android.gms.internal.games.zzdg;
import com.google.android.gms.internal.games.zzdq;
import com.google.android.gms.internal.games.zzee;
import com.google.android.gms.internal.games.zzei;
import com.google.android.gms.internal.games.zzeq;
import com.google.android.gms.internal.games.zzo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public final class Games {
    public static final class GamesOptions implements GoogleSignInOptionsExtension, HasGoogleSignInAccountOptions, Optional {
        public static final class Builder {
            private boolean zzaj;
            private boolean zzak;
            private int zzal;
            private boolean zzam;
            private int zzan;
            private String zzao;
            private ArrayList zzap;
            private boolean zzaq;
            private boolean zzar;
            GoogleSignInAccount zzas;
            private String zzat;
            private int zzau;
            private int zzav;
            private int zzaw;
            private static final AtomicInteger zzax;

            static {
                Builder.zzax = new AtomicInteger(0);
            }

            private Builder() {
                this.zzaj = false;
                this.zzak = true;
                this.zzal = 17;
                this.zzam = false;
                this.zzan = 0x1110;
                this.zzao = null;
                this.zzap = new ArrayList();
                this.zzaq = false;
                this.zzar = false;
                this.zzas = null;
                this.zzat = null;
                this.zzau = 0;
                this.zzav = 8;
                this.zzaw = 0;
            }

            private Builder(GamesOptions games$GamesOptions0) {
                this.zzaj = false;
                this.zzak = true;
                this.zzal = 17;
                this.zzam = false;
                this.zzan = 0x1110;
                this.zzao = null;
                this.zzap = new ArrayList();
                this.zzaq = false;
                this.zzar = false;
                this.zzas = null;
                this.zzat = null;
                this.zzau = 0;
                this.zzav = 8;
                this.zzaw = 0;
                if(games$GamesOptions0 != null) {
                    this.zzaj = games$GamesOptions0.zzaj;
                    this.zzak = games$GamesOptions0.zzak;
                    this.zzal = games$GamesOptions0.zzal;
                    this.zzam = games$GamesOptions0.zzam;
                    this.zzan = games$GamesOptions0.zzan;
                    this.zzao = games$GamesOptions0.zzao;
                    this.zzap = games$GamesOptions0.zzap;
                    this.zzaq = games$GamesOptions0.zzaq;
                    this.zzar = games$GamesOptions0.zzar;
                    this.zzas = games$GamesOptions0.zzas;
                    this.zzat = games$GamesOptions0.zzat;
                    this.zzau = games$GamesOptions0.zzau;
                    this.zzav = games$GamesOptions0.zzav;
                    this.zzaw = games$GamesOptions0.zzaw;
                }
            }

            Builder(GamesOptions games$GamesOptions0, zze zze0) {
                this(games$GamesOptions0);
            }

            Builder(zze zze0) {
            }

            public final GamesOptions build() {
                return new GamesOptions(this.zzaj, this.zzak, this.zzal, this.zzam, this.zzan, this.zzao, this.zzap, this.zzaq, this.zzar, this.zzas, this.zzat, this.zzau, this.zzav, this.zzaw, null);
            }

            public final Builder setSdkVariant(int v) {
                this.zzan = v;
                return this;
            }

            public final Builder setShowConnectingPopup(boolean z) {
                this.zzak = z;
                this.zzal = 17;
                return this;
            }

            public final Builder setShowConnectingPopup(boolean z, int v) {
                this.zzak = z;
                this.zzal = v;
                return this;
            }
        }

        public final boolean zzaj;
        public final boolean zzak;
        public final int zzal;
        public final boolean zzam;
        public final int zzan;
        public final String zzao;
        public final ArrayList zzap;
        public final boolean zzaq;
        public final boolean zzar;
        public final GoogleSignInAccount zzas;
        public final String zzat;
        private final int zzau;
        public final int zzav;
        public final int zzaw;

        private GamesOptions(boolean z, boolean z1, int v, boolean z2, int v1, String s, ArrayList arrayList0, boolean z3, boolean z4, GoogleSignInAccount googleSignInAccount0, String s1, int v2, int v3, int v4) {
            this.zzaj = z;
            this.zzak = z1;
            this.zzal = v;
            this.zzam = z2;
            this.zzan = v1;
            this.zzao = s;
            this.zzap = arrayList0;
            this.zzaq = z3;
            this.zzar = z4;
            this.zzas = googleSignInAccount0;
            this.zzat = s1;
            this.zzau = v2;
            this.zzav = v3;
            this.zzaw = v4;
        }

        GamesOptions(boolean z, boolean z1, int v, boolean z2, int v1, String s, ArrayList arrayList0, boolean z3, boolean z4, GoogleSignInAccount googleSignInAccount0, String s1, int v2, int v3, int v4, zze zze0) {
            this(z, z1, v, z2, v1, s, arrayList0, z3, z4, googleSignInAccount0, s1, v2, v3, v4);
        }

        public static Builder builder() {
            return new Builder(null);
        }

        @Override
        public final boolean equals(Object object0) {
            if(object0 == this) {
                return true;
            }
            if(!(object0 instanceof GamesOptions)) {
                return false;
            }
            if(this.zzaj == ((GamesOptions)object0).zzaj && this.zzak == ((GamesOptions)object0).zzak && this.zzal == ((GamesOptions)object0).zzal && this.zzam == ((GamesOptions)object0).zzam && this.zzan == ((GamesOptions)object0).zzan) {
                String s = this.zzao;
                if(s != null) {
                    if(s.equals(((GamesOptions)object0).zzao)) {
                    label_10:
                        if(this.zzap.equals(((GamesOptions)object0).zzap) && this.zzaq == ((GamesOptions)object0).zzaq && this.zzar == ((GamesOptions)object0).zzar) {
                            GoogleSignInAccount googleSignInAccount0 = this.zzas;
                            if(googleSignInAccount0 == null) {
                                return ((GamesOptions)object0).zzas == null ? TextUtils.equals(this.zzat, ((GamesOptions)object0).zzat) && this.zzau == ((GamesOptions)object0).zzau && this.zzav == ((GamesOptions)object0).zzav && this.zzaw == ((GamesOptions)object0).zzaw : false;
                            }
                            return googleSignInAccount0.equals(((GamesOptions)object0).zzas) ? TextUtils.equals(this.zzat, ((GamesOptions)object0).zzat) && this.zzau == ((GamesOptions)object0).zzau && this.zzav == ((GamesOptions)object0).zzav && this.zzaw == ((GamesOptions)object0).zzaw : false;
                        }
                    }
                }
                else if(((GamesOptions)object0).zzao == null) {
                    goto label_10;
                }
            }
            return false;
        }

        @Override  // com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension
        public final int getExtensionType() {
            return 1;
        }

        @Override  // com.google.android.gms.common.api.Api$ApiOptions$HasGoogleSignInAccountOptions
        public final GoogleSignInAccount getGoogleSignInAccount() {
            return this.zzas;
        }

        @Override  // com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension
        public final List getImpliedScopes() {
            return Collections.singletonList(Games.SCOPE_GAMES_LITE);
        }

        @Override
        public final int hashCode() {
            int v = 0;
            int v1 = (((((((((this.zzaj + 0x20F) * 0x1F + this.zzak) * 0x1F + this.zzal) * 0x1F + this.zzam) * 0x1F + this.zzan) * 0x1F + (this.zzao == null ? 0 : this.zzao.hashCode())) * 0x1F + this.zzap.hashCode()) * 0x1F + this.zzaq) * 0x1F + this.zzar) * 0x1F;
            int v2 = this.zzas == null ? 0 : this.zzas.hashCode();
            String s = this.zzat;
            if(s != null) {
                v = s.hashCode();
            }
            return ((((v1 + v2) * 0x1F + v) * 0x1F + this.zzau) * 0x1F + this.zzav) * 0x1F + this.zzaw;
        }

        @Override  // com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension
        public final Bundle toBundle() {
            return this.zzj();
        }

        public static Builder zza(GoogleSignInAccount googleSignInAccount0, GamesOptions games$GamesOptions0) {
            Builder games$GamesOptions$Builder0 = new Builder(null, null);
            games$GamesOptions$Builder0.zzas = googleSignInAccount0;
            return games$GamesOptions$Builder0;
        }

        public static Builder zza(GamesOptions games$GamesOptions0) {
            return new Builder(games$GamesOptions0, null);
        }

        public final Bundle zzj() {
            Bundle bundle0 = new Bundle();
            bundle0.putBoolean("com.google.android.gms.games.key.isHeadless", this.zzaj);
            bundle0.putBoolean("com.google.android.gms.games.key.showConnectingPopup", this.zzak);
            bundle0.putInt("com.google.android.gms.games.key.connectingPopupGravity", this.zzal);
            bundle0.putBoolean("com.google.android.gms.games.key.retryingSignIn", this.zzam);
            bundle0.putInt("com.google.android.gms.games.key.sdkVariant", this.zzan);
            bundle0.putString("com.google.android.gms.games.key.forceResolveAccountKey", this.zzao);
            bundle0.putStringArrayList("com.google.android.gms.games.key.proxyApis", this.zzap);
            bundle0.putBoolean("com.google.android.gms.games.key.unauthenticated", this.zzaq);
            bundle0.putBoolean("com.google.android.gms.games.key.skipWelcomePopup", this.zzar);
            bundle0.putParcelable("com.google.android.gms.games.key.googleSignInAccount", this.zzas);
            bundle0.putString("com.google.android.gms.games.key.realClientPackageName", this.zzat);
            bundle0.putInt("com.google.android.gms.games.key.API_VERSION", this.zzav);
            bundle0.putInt("com.google.android.gms.games.key.authenticationStrategy", this.zzaw);
            return bundle0;
        }
    }

    @Deprecated
    public interface GetServerAuthCodeResult extends Result {
        String getCode();
    }

    static class zza extends AbstractClientBuilder {
        private zza() {
        }

        zza(zze zze0) {
        }

        @Override  // com.google.android.gms.common.api.Api$AbstractClientBuilder
        public Client buildClient(Context context0, Looper looper0, ClientSettings clientSettings0, Object object0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
            GamesOptions games$GamesOptions0 = (GamesOptions)object0;
            if(games$GamesOptions0 == null) {
                games$GamesOptions0 = new Builder(null).build();
            }
            return new zzf(context0, looper0, clientSettings0, games$GamesOptions0, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0);
        }

        @Override  // com.google.android.gms.common.api.Api$BaseClientBuilder
        public int getPriority() {
            return 1;
        }
    }

    public static abstract class zzb extends ApiMethodImpl {
        public zzb(GoogleApiClient googleApiClient0) {
            super(Games.CLIENT_KEY, googleApiClient0);
        }

        @Override  // com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl
        public void setResult(Object object0) {
            super.setResult(((Result)object0));
        }
    }

    static abstract class zzc extends zzb {
        private zzc(GoogleApiClient googleApiClient0) {
            super(googleApiClient0);
        }

        zzc(GoogleApiClient googleApiClient0, zze zze0) {
            this(googleApiClient0);
        }

        @Override  // com.google.android.gms.common.api.internal.BasePendingResult
        public Result createFailedResult(Status status0) {
            return status0;
        }
    }

    @Deprecated
    public static final Api API = null;
    @Deprecated
    public static final Achievements Achievements = null;
    static final ClientKey CLIENT_KEY = null;
    public static final String EXTRA_PLAYER_IDS = "players";
    public static final String EXTRA_STATUS = "status";
    @Deprecated
    public static final Events Events;
    @Deprecated
    public static final GamesMetadata GamesMetadata;
    @Deprecated
    public static final Leaderboards Leaderboards;
    @Deprecated
    public static final Players Players;
    public static final Scope SCOPE_GAMES;
    public static final Scope SCOPE_GAMES_LITE;
    public static final Scope SCOPE_GAMES_SNAPSHOTS;
    @Deprecated
    public static final Snapshots Snapshots;
    @Deprecated
    public static final Stats Stats;
    @Deprecated
    public static final Videos Videos;
    private static final AbstractClientBuilder zzaf;
    private static final AbstractClientBuilder zzag;
    public static final Scope zzah;
    private static final Api zzai;

    static {
        ClientKey api$ClientKey0 = new ClientKey();
        Games.CLIENT_KEY = api$ClientKey0;
        zze zze0 = new zze();
        Games.zzaf = zze0;
        zzg zzg0 = new zzg();
        Games.zzag = zzg0;
        Games.SCOPE_GAMES = new Scope("https://www.googleapis.com/auth/games");
        Games.SCOPE_GAMES_LITE = new Scope("https://www.googleapis.com/auth/games_lite");
        Games.SCOPE_GAMES_SNAPSHOTS = new Scope("https://www.googleapis.com/auth/drive.appdata");
        Games.API = new Api("Games.API", zze0, api$ClientKey0);
        Games.zzah = new Scope("https://www.googleapis.com/auth/games.firstparty");
        Games.zzai = new Api("Games.API_1P", zzg0, api$ClientKey0);
        Games.GamesMetadata = new zzba();
        Games.Achievements = new zzo();
        Games.Events = new zzai();
        Games.Leaderboards = new zzbu();
        Games.Players = new zzcw();
        Games.Snapshots = new zzdq();
        Games.Stats = new zzee();
        Games.Videos = new zzeq();
    }

    public static AchievementsClient getAchievementsClient(Activity activity0, GoogleSignInAccount googleSignInAccount0) {
        Preconditions.checkNotNull(googleSignInAccount0, "GoogleSignInAccount must not be null");
        return new com.google.android.gms.internal.games.zzf(activity0, Games.zza(googleSignInAccount0));
    }

    public static AchievementsClient getAchievementsClient(Activity activity0, GoogleSignInAccount googleSignInAccount0, GamesOptions games$GamesOptions0) {
        Preconditions.checkNotNull(googleSignInAccount0, "GoogleSignInAccount must not be null");
        return new com.google.android.gms.internal.games.zzf(activity0, Games.zza(games$GamesOptions0, googleSignInAccount0));
    }

    public static AchievementsClient getAchievementsClient(Context context0, GoogleSignInAccount googleSignInAccount0) {
        Preconditions.checkNotNull(googleSignInAccount0, "GoogleSignInAccount must not be null");
        return new com.google.android.gms.internal.games.zzf(context0, Games.zza(googleSignInAccount0));
    }

    public static AchievementsClient getAchievementsClient(Context context0, GoogleSignInAccount googleSignInAccount0, GamesOptions games$GamesOptions0) {
        Preconditions.checkNotNull(googleSignInAccount0, "GoogleSignInAccount must not be null");
        return new com.google.android.gms.internal.games.zzf(context0, Games.zza(games$GamesOptions0, googleSignInAccount0));
    }

    @Deprecated
    public static String getCurrentAccountName(GoogleApiClient googleApiClient0) {
        return Games.zza(googleApiClient0, true).zzaj();
    }

    public static EventsClient getEventsClient(Activity activity0, GoogleSignInAccount googleSignInAccount0) {
        Preconditions.checkNotNull(googleSignInAccount0, "GoogleSignInAccount must not be null");
        return new zzae(activity0, Games.zza(googleSignInAccount0));
    }

    public static EventsClient getEventsClient(Activity activity0, GoogleSignInAccount googleSignInAccount0, GamesOptions games$GamesOptions0) {
        Preconditions.checkNotNull(googleSignInAccount0, "GoogleSignInAccount must not be null");
        return new zzae(activity0, Games.zza(games$GamesOptions0, googleSignInAccount0));
    }

    public static EventsClient getEventsClient(Context context0, GoogleSignInAccount googleSignInAccount0) {
        Preconditions.checkNotNull(googleSignInAccount0, "GoogleSignInAccount must not be null");
        return new zzae(context0, Games.zza(googleSignInAccount0));
    }

    public static EventsClient getEventsClient(Context context0, GoogleSignInAccount googleSignInAccount0, GamesOptions games$GamesOptions0) {
        Preconditions.checkNotNull(googleSignInAccount0, "GoogleSignInAccount must not be null");
        return new zzae(context0, Games.zza(games$GamesOptions0, googleSignInAccount0));
    }

    public static GamesClient getGamesClient(Activity activity0, GoogleSignInAccount googleSignInAccount0) {
        Preconditions.checkNotNull(googleSignInAccount0, "GoogleSignInAccount must not be null");
        return new zzaq(activity0, Games.zza(googleSignInAccount0));
    }

    public static GamesClient getGamesClient(Activity activity0, GoogleSignInAccount googleSignInAccount0, GamesOptions games$GamesOptions0) {
        Preconditions.checkNotNull(googleSignInAccount0, "GoogleSignInAccount must not be null");
        return new zzaq(activity0, Games.zza(games$GamesOptions0, googleSignInAccount0));
    }

    public static GamesClient getGamesClient(Context context0, GoogleSignInAccount googleSignInAccount0) {
        Preconditions.checkNotNull(googleSignInAccount0, "GoogleSignInAccount must not be null");
        return new zzaq(context0, Games.zza(googleSignInAccount0));
    }

    public static GamesClient getGamesClient(Context context0, GoogleSignInAccount googleSignInAccount0, GamesOptions games$GamesOptions0) {
        Preconditions.checkNotNull(googleSignInAccount0, "GoogleSignInAccount must not be null");
        return new zzaq(context0, Games.zza(games$GamesOptions0, googleSignInAccount0));
    }

    public static GamesMetadataClient getGamesMetadataClient(Activity activity0, GoogleSignInAccount googleSignInAccount0) {
        Preconditions.checkNotNull(googleSignInAccount0, "GoogleSignInAccount must not be null");
        return new zzaz(activity0, Games.zza(googleSignInAccount0));
    }

    public static GamesMetadataClient getGamesMetadataClient(Activity activity0, GoogleSignInAccount googleSignInAccount0, GamesOptions games$GamesOptions0) {
        Preconditions.checkNotNull(googleSignInAccount0, "GoogleSignInAccount must not be null");
        return new zzaz(activity0, Games.zza(games$GamesOptions0, googleSignInAccount0));
    }

    public static GamesMetadataClient getGamesMetadataClient(Context context0, GoogleSignInAccount googleSignInAccount0) {
        Preconditions.checkNotNull(googleSignInAccount0, "GoogleSignInAccount must not be null");
        return new zzaz(context0, Games.zza(googleSignInAccount0));
    }

    public static GamesMetadataClient getGamesMetadataClient(Context context0, GoogleSignInAccount googleSignInAccount0, GamesOptions games$GamesOptions0) {
        Preconditions.checkNotNull(googleSignInAccount0, "GoogleSignInAccount must not be null");
        return new zzaz(context0, Games.zza(games$GamesOptions0, googleSignInAccount0));
    }

    public static LeaderboardsClient getLeaderboardsClient(Activity activity0, GoogleSignInAccount googleSignInAccount0) {
        Preconditions.checkNotNull(googleSignInAccount0, "GoogleSignInAccount must not be null");
        return new zzbj(activity0, Games.zza(googleSignInAccount0));
    }

    public static LeaderboardsClient getLeaderboardsClient(Activity activity0, GoogleSignInAccount googleSignInAccount0, GamesOptions games$GamesOptions0) {
        Preconditions.checkNotNull(googleSignInAccount0, "GoogleSignInAccount must not be null");
        return new zzbj(activity0, Games.zza(games$GamesOptions0, googleSignInAccount0));
    }

    public static LeaderboardsClient getLeaderboardsClient(Context context0, GoogleSignInAccount googleSignInAccount0) {
        Preconditions.checkNotNull(googleSignInAccount0, "GoogleSignInAccount must not be null");
        return new zzbj(context0, Games.zza(googleSignInAccount0));
    }

    public static LeaderboardsClient getLeaderboardsClient(Context context0, GoogleSignInAccount googleSignInAccount0, GamesOptions games$GamesOptions0) {
        Preconditions.checkNotNull(googleSignInAccount0, "GoogleSignInAccount must not be null");
        return new zzbj(context0, Games.zza(games$GamesOptions0, googleSignInAccount0));
    }

    public static PlayerStatsClient getPlayerStatsClient(Activity activity0, GoogleSignInAccount googleSignInAccount0) {
        Preconditions.checkNotNull(googleSignInAccount0, "GoogleSignInAccount must not be null");
        return new zzck(activity0, Games.zza(googleSignInAccount0));
    }

    public static PlayerStatsClient getPlayerStatsClient(Activity activity0, GoogleSignInAccount googleSignInAccount0, GamesOptions games$GamesOptions0) {
        Preconditions.checkNotNull(googleSignInAccount0, "GoogleSignInAccount must not be null");
        return new zzck(activity0, Games.zza(games$GamesOptions0, googleSignInAccount0));
    }

    public static PlayerStatsClient getPlayerStatsClient(Context context0, GoogleSignInAccount googleSignInAccount0) {
        Preconditions.checkNotNull(googleSignInAccount0, "GoogleSignInAccount must not be null");
        return new zzck(context0, Games.zza(googleSignInAccount0));
    }

    public static PlayerStatsClient getPlayerStatsClient(Context context0, GoogleSignInAccount googleSignInAccount0, GamesOptions games$GamesOptions0) {
        Preconditions.checkNotNull(googleSignInAccount0, "GoogleSignInAccount must not be null");
        return new zzck(context0, Games.zza(games$GamesOptions0, googleSignInAccount0));
    }

    public static PlayersClient getPlayersClient(Activity activity0, GoogleSignInAccount googleSignInAccount0) {
        Preconditions.checkNotNull(googleSignInAccount0, "GoogleSignInAccount must not be null");
        return new zzcm(activity0, Games.zza(googleSignInAccount0));
    }

    public static PlayersClient getPlayersClient(Activity activity0, GoogleSignInAccount googleSignInAccount0, GamesOptions games$GamesOptions0) {
        Preconditions.checkNotNull(googleSignInAccount0, "GoogleSignInAccount must not be null");
        return new zzcm(activity0, Games.zza(games$GamesOptions0, googleSignInAccount0));
    }

    public static PlayersClient getPlayersClient(Context context0, GoogleSignInAccount googleSignInAccount0) {
        Preconditions.checkNotNull(googleSignInAccount0, "GoogleSignInAccount must not be null");
        return new zzcm(context0, Games.zza(googleSignInAccount0));
    }

    public static PlayersClient getPlayersClient(Context context0, GoogleSignInAccount googleSignInAccount0, GamesOptions games$GamesOptions0) {
        Preconditions.checkNotNull(googleSignInAccount0, "GoogleSignInAccount must not be null");
        return new zzcm(context0, Games.zza(games$GamesOptions0, googleSignInAccount0));
    }

    public static SnapshotsClient getSnapshotsClient(Activity activity0, GoogleSignInAccount googleSignInAccount0) {
        Preconditions.checkNotNull(googleSignInAccount0, "GoogleSignInAccount must not be null");
        return new zzdg(activity0, Games.zza(googleSignInAccount0));
    }

    public static SnapshotsClient getSnapshotsClient(Activity activity0, GoogleSignInAccount googleSignInAccount0, GamesOptions games$GamesOptions0) {
        Preconditions.checkNotNull(googleSignInAccount0, "GoogleSignInAccount must not be null");
        return new zzdg(activity0, Games.zza(games$GamesOptions0, googleSignInAccount0));
    }

    public static SnapshotsClient getSnapshotsClient(Context context0, GoogleSignInAccount googleSignInAccount0) {
        Preconditions.checkNotNull(googleSignInAccount0, "GoogleSignInAccount must not be null");
        return new zzdg(context0, Games.zza(googleSignInAccount0));
    }

    public static SnapshotsClient getSnapshotsClient(Context context0, GoogleSignInAccount googleSignInAccount0, GamesOptions games$GamesOptions0) {
        Preconditions.checkNotNull(googleSignInAccount0, "GoogleSignInAccount must not be null");
        return new zzdg(context0, Games.zza(games$GamesOptions0, googleSignInAccount0));
    }

    public static VideosClient getVideosClient(Activity activity0, GoogleSignInAccount googleSignInAccount0) {
        Preconditions.checkNotNull(googleSignInAccount0, "GoogleSignInAccount must not be null");
        return new zzei(activity0, Games.zza(googleSignInAccount0));
    }

    public static VideosClient getVideosClient(Activity activity0, GoogleSignInAccount googleSignInAccount0, GamesOptions games$GamesOptions0) {
        Preconditions.checkNotNull(googleSignInAccount0, "GoogleSignInAccount must not be null");
        return new zzei(activity0, Games.zza(games$GamesOptions0, googleSignInAccount0));
    }

    public static VideosClient getVideosClient(Context context0, GoogleSignInAccount googleSignInAccount0) {
        Preconditions.checkNotNull(googleSignInAccount0, "GoogleSignInAccount must not be null");
        return new zzei(context0, Games.zza(googleSignInAccount0));
    }

    public static VideosClient getVideosClient(Context context0, GoogleSignInAccount googleSignInAccount0, GamesOptions games$GamesOptions0) {
        Preconditions.checkNotNull(googleSignInAccount0, "GoogleSignInAccount must not be null");
        return new zzei(context0, Games.zza(games$GamesOptions0, googleSignInAccount0));
    }

    @Deprecated
    public static PendingResult signOut(GoogleApiClient googleApiClient0) {
        return googleApiClient0.execute(new com.google.android.gms.games.zzf(googleApiClient0));
    }

    private static GamesOptions zza(GoogleSignInAccount googleSignInAccount0) {
        return GamesOptions.zza(googleSignInAccount0, null).setSdkVariant(0x101113).build();
    }

    private static GamesOptions zza(GamesOptions games$GamesOptions0, GoogleSignInAccount googleSignInAccount0) {
        Builder games$GamesOptions$Builder0 = GamesOptions.zza(games$GamesOptions0);
        games$GamesOptions$Builder0.zzas = googleSignInAccount0;
        return games$GamesOptions$Builder0.setSdkVariant(0x101113).build();
    }

    public static zzf zza(GoogleApiClient googleApiClient0) {
        return Games.zza(googleApiClient0, true);
    }

    public static zzf zza(GoogleApiClient googleApiClient0, boolean z) {
        Preconditions.checkArgument(googleApiClient0 != null, "GoogleApiClient parameter is required.");
        Preconditions.checkState(googleApiClient0.isConnected(), "GoogleApiClient must be connected.");
        return Games.zzb(googleApiClient0, z);
    }

    public static zzf zzb(GoogleApiClient googleApiClient0, boolean z) {
        Preconditions.checkState(googleApiClient0.hasApi(Games.API), "GoogleApiClient is not configured to use the Games Api. Pass Games.API into GoogleApiClient.Builder#addApi() to use this feature.");
        boolean z1 = googleApiClient0.hasConnectedApi(Games.API);
        if(z && !z1) {
            throw new IllegalStateException("GoogleApiClient has an optional Games.API and is not connected to Games. Use GoogleApiClient.hasConnectedApi(Games.API) to guard this call.");
        }
        return z1 ? ((zzf)googleApiClient0.getClient(Games.CLIENT_KEY)) : null;
    }
}

