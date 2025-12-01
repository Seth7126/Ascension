package com.voxelbusters.android.essentialkit.features.socialauth;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.GamesClient;
import com.google.android.gms.games.Player;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.voxelbusters.android.essentialkit.common.ConnectorFragment;
import com.voxelbusters.android.essentialkit.common.interfaces.IFragmentResultListener;
import com.voxelbusters.android.essentialkit.utilities.Logger;
import com.voxelbusters.android.essentialkit.utilities.ResourcesUtil;
import com.voxelbusters.android.essentialkit.utilities.StringUtil;
import java.util.Arrays;

public class GoogleAuth {
    interface IInternalAuthenticationListener {
        void onFailure(String arg1, int arg2);

        void onSuccess(GoogleSignInAccount arg1);
    }

    public static final String SAVED_INFO_KEYS_FILE = "np-saved-game-services-keys-data";
    public static final String SERVER_AUTH_CODE_SAVE_KEY = "server-auth-code";
    private final String TAG;
    private IAuthenticationListener authenticationListener;
    private Context context;
    private Player currentPlayer;
    private String idToken;
    private String serverAuthCode;
    private static GoogleAuth sharedInstance;
    private GoogleSignInClient signInClient;
    private boolean signedIn;

    static {
    }

    private GoogleAuth(Context context0) {
        this.TAG = "GoogleSignIn";
        this.context = context0;
    }

    public void Authenticate(IAuthenticationListener iAuthenticationListener0, boolean z) {
        this.currentPlayer = null;
        this.signedIn = false;
        this.authenticationListener = iAuthenticationListener0;
        this.authenticateInternal(this.createSigninOptions(false), z, new IInternalAuthenticationListener() {
            @Override  // com.voxelbusters.android.essentialkit.features.socialauth.GoogleAuth$IInternalAuthenticationListener
            public void onFailure(String s, int v) {
                ResourcesUtil.getBoolean(GoogleAuth.this.context, "GAME_SERVICES_SHOW_ERROR_DIALOGS");
                GoogleAuth.this.onConnectionFailure(s, v);

                class com.voxelbusters.android.essentialkit.features.socialauth.GoogleAuth.1.1 implements DialogInterface.OnClickListener {
                    com.voxelbusters.android.essentialkit.features.socialauth.GoogleAuth.1.1(String s, int v) {
                    }

                    @Override  // android.content.DialogInterface$OnClickListener
                    public void onClick(DialogInterface dialogInterface0, int v) {
                        dialogInterface0.dismiss();
                        GoogleAuth.this.onConnectionFailure(this.val$error, this.val$errorCode);
                    }
                }

            }

            @Override  // com.voxelbusters.android.essentialkit.features.socialauth.GoogleAuth$IInternalAuthenticationListener
            public void onSuccess(GoogleSignInAccount googleSignInAccount0) {
                GoogleAuth.this.onConnectionSuccess(googleSignInAccount0);
            }
        });
    }

    private void authenticateInternal(GoogleSignInOptions googleSignInOptions0, boolean z, IInternalAuthenticationListener googleAuth$IInternalAuthenticationListener0) {
        this.signInClient = this.createSignInClient(googleSignInOptions0);
        if(StringUtil.isNullOrEmpty(googleSignInOptions0.getServerClientId())) {
            GoogleSignInAccount googleSignInAccount0 = GoogleSignIn.getLastSignedInAccount(this.context);
            Logger.debug(("Signin options scopes : " + Arrays.toString(googleSignInOptions0.getScopeArray())));
            if(GoogleSignIn.hasPermissions(googleSignInAccount0, googleSignInOptions0.getScopeArray())) {
                Logger.debug("Already have required details from last signin. Logging in with same details...");
                googleAuth$IInternalAuthenticationListener0.onSuccess(googleSignInAccount0);
                return;
            }
        }
        Task task0 = this.signInClient.silentSignIn();
        if(task0.isSuccessful()) {
            Logger.debug("Silent login successful instantly!");
            googleAuth$IInternalAuthenticationListener0.onSuccess(((GoogleSignInAccount)task0.getResult()));
            return;
        }
        task0.addOnSuccessListener(new OnSuccessListener() {
            public void onSuccess(GoogleSignInAccount googleSignInAccount0) {
                Logger.debug("Silent login successful!");
                googleAuth$IInternalAuthenticationListener0.onSuccess(googleSignInAccount0);
            }

            @Override  // com.google.android.gms.tasks.OnSuccessListener
            public void onSuccess(Object object0) {
                this.onSuccess(((GoogleSignInAccount)object0));
            }
        });
        task0.addOnFailureListener(new OnFailureListener() {
            @Override  // com.google.android.gms.tasks.OnFailureListener
            public void onFailure(Exception exception0) {
                if(z) {
                    Logger.warning("Silent login failed. Halting sign-in as force silent mode only");
                    googleAuth$IInternalAuthenticationListener0.onFailure("", -1);
                    return;
                }
                Logger.warning("Silent login failed. Attempting interactive signin...");
                ConnectorFragment.launchIntent(GoogleAuth.this.signInClient.getSignInIntent(), ((Activity)GoogleAuth.this.context), new IFragmentResultListener() {
                    @Override  // com.voxelbusters.android.essentialkit.common.interfaces.IFragmentResultListener
                    public void onResult(int v, Intent intent0, boolean z) {
                        GoogleSignInResult googleSignInResult0 = Auth.GoogleSignInApi.getSignInResultFromIntent(intent0);
                        if(googleSignInResult0.isSuccess()) {
                            com.voxelbusters.android.essentialkit.features.socialauth.GoogleAuth.3.this.val$listener.onSuccess(googleSignInResult0.getSignInAccount());
                            return;
                        }
                        String s = googleSignInResult0.getStatus().getStatusMessage();
                        int v1 = googleSignInResult0.getStatus().getStatusCode();
                        if(StringUtil.isNullOrEmpty(s)) {
                            s = ResourcesUtil.getString(GoogleAuth.this.context, "GAME_SERVICES_SIGN_IN_FAILED");
                        }
                        com.voxelbusters.android.essentialkit.features.socialauth.GoogleAuth.3.this.val$listener.onFailure(s, v1);
                    }
                });
            }
        });
    }

    private void cacheServerAuthCodeIfExists(String s) {
        this.serverAuthCode = s;
    }

    private void cleanupAuthentication() {
        this.signInClient = null;
        this.signedIn = false;
        this.currentPlayer = null;
        this.clearServerAuthCode();
    }

    private void clearServerAuthCode() {
        SharedPreferences.Editor sharedPreferences$Editor0 = this.context.getSharedPreferences("np-saved-game-services-keys-data", 0).edit();
        sharedPreferences$Editor0.remove("server-auth-code");
        sharedPreferences$Editor0.commit();
    }

    public GoogleSignInClient createSignInClient(GoogleSignInOptions googleSignInOptions0) {
        GoogleSignInClient googleSignInClient0 = GoogleSignIn.getClient(this.context, googleSignInOptions0);
        this.signInClient = googleSignInClient0;
        return googleSignInClient0;
    }

    public GoogleSignInOptions createSigninOptions(boolean z) {
        Builder googleSignInOptions$Builder0 = new Builder(GoogleSignInOptions.DEFAULT_GAMES_SIGN_IN);
        String s = ResourcesUtil.getString(this.context, "GAME_SERVICES_SERVER_CLIENT_ID");
        Boolean boolean0 = Boolean.valueOf(ResourcesUtil.getBoolean(this.context, "GAME_SERVICES_NEEDS_PROFILE_SCOPE"));
        Boolean boolean1 = Boolean.valueOf(ResourcesUtil.getBoolean(this.context, "GAME_SERVICES_NEEDS_EMAIL_SCOPE"));
        Boolean boolean2 = Boolean.valueOf(ResourcesUtil.getBoolean(this.context, "USES_CLOUD_SERVICES"));
        if(!StringUtil.isNullOrEmpty(s)) {
            googleSignInOptions$Builder0 = googleSignInOptions$Builder0.requestServerAuthCode(s, z).requestIdToken(s);
        }
        if(boolean0.booleanValue()) {
            googleSignInOptions$Builder0 = googleSignInOptions$Builder0.requestProfile();
        }
        if(boolean1.booleanValue()) {
            googleSignInOptions$Builder0 = googleSignInOptions$Builder0.requestEmail();
        }
        if(boolean2.booleanValue()) {
            googleSignInOptions$Builder0 = googleSignInOptions$Builder0.requestScopes(new Scope("https://www.googleapis.com/auth/drive.appdata"), new Scope[0]);
        }
        return googleSignInOptions$Builder0.build();
    }

    public void fetchServerAuthCode(IFetchServerCredentials iSocialAuth$IFetchServerCredentials0) {
        GoogleSignInAccount googleSignInAccount0 = GoogleSignIn.getLastSignedInAccount(this.context);
        if(this.isSignedIn() && googleSignInAccount0 != null) {
            String s = googleSignInAccount0.getServerAuthCode();
            String s1 = googleSignInAccount0.getIdToken();
            String s2 = googleSignInAccount0.getEmail();
            if(!StringUtil.isNullOrEmpty(s) || StringUtil.isNullOrEmpty(ResourcesUtil.getString(this.context, "GAME_SERVICES_SERVER_CLIENT_ID"))) {
                if(iSocialAuth$IFetchServerCredentials0 != null) {
                    iSocialAuth$IFetchServerCredentials0.onSuccess(s, s1, s2);
                }
                return;
            }
        }
        this.authenticateInternal(this.createSigninOptions(false), true, new IInternalAuthenticationListener() {
            @Override  // com.voxelbusters.android.essentialkit.features.socialauth.GoogleAuth$IInternalAuthenticationListener
            public void onFailure(String s, int v) {
                iSocialAuth$IFetchServerCredentials0.onFailure(s);
            }

            @Override  // com.voxelbusters.android.essentialkit.features.socialauth.GoogleAuth$IInternalAuthenticationListener
            public void onSuccess(GoogleSignInAccount googleSignInAccount0) {
                iSocialAuth$IFetchServerCredentials0.onSuccess(googleSignInAccount0.getServerAuthCode(), googleSignInAccount0.getIdToken(), googleSignInAccount0.getEmail());
            }
        });
    }

    private String getCachedServerCode() {
        return this.serverAuthCode;
    }

    public Player getCurrentPlayer() {
        return this.currentPlayer;
    }

    public String getIdToken() {
        Logger.debug(("Get Id Token : " + GoogleSignIn.getLastSignedInAccount(this.context).getIdToken()));
        return StringUtil.getNonNull(this.idToken);
    }

    public static GoogleAuth getInstance(Context context0) {
        if(GoogleAuth.sharedInstance == null) {
            GoogleAuth.sharedInstance = new GoogleAuth(context0);
        }
        return GoogleAuth.sharedInstance;
    }

    public String getPlayerEmail() {
        GoogleSignInAccount googleSignInAccount0 = GoogleSignIn.getLastSignedInAccount(this.context);
        return googleSignInAccount0 == null || !this.isSignedIn() ? "" : StringUtil.getNonNull(googleSignInAccount0.getEmail());
    }

    public String getPlayerId() {
        return this.currentPlayer == null ? null : this.currentPlayer.getPlayerId();
    }

    public boolean hasLastSignedInAccount() {
        return GoogleSignIn.getLastSignedInAccount(this.context) != null && this.currentPlayer != null;
    }

    public boolean isSignedIn() {
        return this.signedIn;
    }

    private void onConnectionFailure(String s, int v) {
        this.signedIn = false;
        IAuthenticationListener iAuthenticationListener0 = this.authenticationListener;
        if(iAuthenticationListener0 != null) {
            iAuthenticationListener0.onFailure(s);
        }
    }

    private void onConnectionSuccess(GoogleSignInAccount googleSignInAccount0) {
        this.signedIn = true;
        String s = googleSignInAccount0.getServerAuthCode();
        this.idToken = googleSignInAccount0.getIdToken();
        this.cacheServerAuthCodeIfExists(s);
        Logger.debug(("Server Auth Code : " + s));
        Logger.debug(("Id Token : " + this.idToken));
        GamesClient gamesClient0 = Games.getGamesClient(this.context, googleSignInAccount0);
        if(ResourcesUtil.getBoolean(this.context, "GAME_SERVICES_NEEDS_POPUPS_AT_TOP")) {
            gamesClient0.setGravityForPopups(49);
        }
        else {
            gamesClient0.setGravityForPopups(81);
        }
        gamesClient0.setViewForPopups(((Activity)this.context).getWindow().getDecorView().getRootView());
        Games.getPlayersClient(this.context, googleSignInAccount0).getCurrentPlayer().addOnCompleteListener(((Activity)this.context), new OnCompleteListener() {
            @Override  // com.google.android.gms.tasks.OnCompleteListener
            public void onComplete(Task task0) {
                if(task0.isSuccessful()) {
                    Player player0 = (Player)task0.getResult();
                    GoogleAuth.this.currentPlayer = player0;
                    Logger.debug(("Player Id : " + GoogleAuth.this.currentPlayer.getPlayerId() + " Player Name : " + GoogleAuth.this.currentPlayer.getDisplayName()));
                    if(GoogleAuth.this.authenticationListener != null) {
                        GoogleAuth.this.authenticationListener.onSuccess(GoogleAuth.this.currentPlayer);
                    }
                }
                else {
                    Logger.error(task0.getException().getMessage());
                    if(GoogleAuth.this.authenticationListener != null) {
                        GoogleAuth.this.authenticationListener.onSuccess(null);
                    }
                }
            }
        });
    }

    public void signOut() {
        Logger.debug(("Trying signout : " + this.signInClient));
        if(this.isSignedIn()) {
            GoogleSignInClient googleSignInClient0 = this.signInClient;
            if(googleSignInClient0 != null) {
                googleSignInClient0.signOut().addOnCompleteListener(((Activity)this.context), new OnCompleteListener() {
                    @Override  // com.google.android.gms.tasks.OnCompleteListener
                    public void onComplete(Task task0) {
                        Logger.debug("Signout successful");
                        if(task0.isSuccessful()) {
                            GoogleAuth.this.cleanupAuthentication();
                            if(GoogleAuth.this.authenticationListener != null) {
                                GoogleAuth.this.authenticationListener.onSuccess(null);
                            }
                        }
                        else {
                            Exception exception0 = task0.getException();
                            if(GoogleAuth.this.authenticationListener != null) {
                                if(exception0 != null) {
                                    String s = task0.getException().getMessage();
                                    GoogleAuth.this.authenticationListener.onFailure(s);
                                    return;
                                }
                                GoogleAuth.this.authenticationListener.onFailure("Unknown error");
                            }
                        }
                    }
                });
            }
        }
        else {
            this.cleanupAuthentication();
            IAuthenticationListener iAuthenticationListener0 = this.authenticationListener;
            if(iAuthenticationListener0 != null) {
                iAuthenticationListener0.onSuccess(null);
            }
        }
    }
}

