package com.androidnative.gms.core;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.appinvite.AppInvite;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.Builder;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.drive.Drive;
import com.google.android.gms.games.Games.GamesOptions;
import com.google.android.gms.games.Games;
import com.google.android.gms.plus.Plus;

public class NewGameHelper {
    public static final String EXISTING_FILE_ID = "0ByfSjdPVs9MZTHBmMVdSeWxaNTg";
    public static final String EXISTING_FOLDER_ID = "0B2EEtIjPUdX6MERsWlYxN3J6RU0";
    protected static final String EXTRA_ACCOUNT_NAME = "account_name";
    protected static final int REQUEST_CODE_RESOLUTION = 9001;
    private String _scopes;
    public ConnectionResult connectionToResolve;
    private GameClientManager listner;
    private GoogleApiClient mGoogleApiClient;

    public NewGameHelper(GameClientManager gameClientManager0, String s) {
        this.listner = gameClientManager0;
        this._scopes = s;
    }

    public boolean IsConnected() {
        return this.mGoogleApiClient == null ? false : this.mGoogleApiClient.isConnected();
    }

    public void StartSignRequest(String s, Activity activity0) {
        Log.d("AndroidNative", "GP::StartSignRequest accountName:" + s);
        if(this.mGoogleApiClient == null) {
            Builder googleApiClient$Builder0 = new Builder(activity0);
            Log.d("AndroidNative", "Google Play Scopes:" + this._scopes);
            if(this._scopes.contains("GamesAPI")) {
                Log.d("AndroidNative", "Games.API scope added");
                Log.d("AndroidNative", "Show Connecting Popup: " + GameClientManager.showConnectingPopup);
                com.google.android.gms.games.Games.GamesOptions.Builder games$GamesOptions$Builder0 = GamesOptions.builder();
                games$GamesOptions$Builder0.setShowConnectingPopup(GameClientManager.showConnectingPopup);
                GamesOptions games$GamesOptions0 = games$GamesOptions$Builder0.build();
                googleApiClient$Builder0.addApi(Games.API, games$GamesOptions0);
                googleApiClient$Builder0.addScope(new Scope("profile"));
            }
            if(this._scopes.contains("PlusAPI")) {
                Log.d("AndroidNative", "Plus.API scope added");
                googleApiClient$Builder0.addApi(Plus.API);
            }
            if(this._scopes.contains("AppInvite")) {
                Log.d("AndroidNative", "AppInvite.API scope added");
                googleApiClient$Builder0.addApi(AppInvite.API);
            }
            if(this._scopes.contains("DriveAPI")) {
                Log.d("AndroidNative", "Drive.API scope added, SCOPE_APPFOLDER");
                googleApiClient$Builder0.addApi(Drive.API).addScope(Drive.SCOPE_APPFOLDER);
            }
            if(s != null) {
                googleApiClient$Builder0.setAccountName(s);
            }
            googleApiClient$Builder0.addConnectionCallbacks(this.listner);
            googleApiClient$Builder0.addOnConnectionFailedListener(this.listner);
            this.mGoogleApiClient = googleApiClient$Builder0.build();
        }
        this.mGoogleApiClient.connect();
        Log.d("AndroidNative", "Google Play sighIn started");
    }

    public void connect() {
        GoogleApiClient googleApiClient0 = this.mGoogleApiClient;
        if(googleApiClient0 != null) {
            googleApiClient0.connect();
        }
    }

    public void disconnect() {
        GoogleApiClient googleApiClient0 = this.mGoogleApiClient;
        if(googleApiClient0 != null) {
            googleApiClient0.disconnect();
        }
    }

    public GoogleApiClient getGoogleApiClient() {
        return this.mGoogleApiClient;
    }

    public void onActivityResult(int v, int v1, Intent intent0) {
        if(v == 9001) {
            Log.d("AndroidNative", "result: REQUEST_CODE_RESOLUTION resultCode:" + v1 + " Intent data: " + intent0);
            if(v1 == -1) {
                this.mGoogleApiClient.connect();
                return;
            }
            this.listner.onSignInFailed(v1);
        }
    }

    public void onPause() {
        GoogleApiClient googleApiClient0 = this.mGoogleApiClient;
        if(googleApiClient0 != null) {
            googleApiClient0.disconnect();
        }
    }

    public void reconnect() {
        this.mGoogleApiClient.reconnect();
    }

    public void resolveConnection(ConnectionResult connectionResult0) {
        if(connectionResult0.hasResolution()) {
            this.connectionToResolve = connectionResult0;
            GooglePlaySupportActivity.startProxyForGPReolution(9001);
        }
    }

    public void sighIn() {
        this.sighIn(null);
    }

    public void sighIn(String s) {
        Log.d("AndroidNative", "GP::sighIn accountName:" + s);
        GooglePlaySupportActivity.startProxyForGPConnection(s);
    }
}

