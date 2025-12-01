package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

public class NetworkConnectivity extends Activity {
    private final int a;
    private final int b;
    private final int c;
    private int d;
    private ConnectivityManager e;
    private final ConnectivityManager.NetworkCallback f;

    public NetworkConnectivity(Context context0) {
        this.a = 0;
        int v = 1;
        this.b = 1;
        this.c = 2;
        this.d = 0;
        com.unity3d.player.NetworkConnectivity.1 networkConnectivity$10 = new ConnectivityManager.NetworkCallback() {
            final NetworkConnectivity a;

            @Override  // android.net.ConnectivityManager$NetworkCallback
            public final void onAvailable(Network network0) {
                super.onAvailable(network0);
            }

            @Override  // android.net.ConnectivityManager$NetworkCallback
            public final void onCapabilitiesChanged(Network network0, NetworkCapabilities networkCapabilities0) {
                int v;
                NetworkConnectivity networkConnectivity0;
                super.onCapabilitiesChanged(network0, networkCapabilities0);
                if(networkCapabilities0.hasTransport(0)) {
                    networkConnectivity0 = NetworkConnectivity.this;
                    v = 1;
                }
                else {
                    networkConnectivity0 = NetworkConnectivity.this;
                    v = 2;
                }
                networkConnectivity0.d = v;
            }

            @Override  // android.net.ConnectivityManager$NetworkCallback
            public final void onLost(Network network0) {
                super.onLost(network0);
                NetworkConnectivity.this.d = 0;
            }

            @Override  // android.net.ConnectivityManager$NetworkCallback
            public final void onUnavailable() {
                super.onUnavailable();
                NetworkConnectivity.this.d = 0;
            }
        };
        this.f = networkConnectivity$10;
        ConnectivityManager connectivityManager0 = (ConnectivityManager)context0.getSystemService("connectivity");
        this.e = connectivityManager0;
        connectivityManager0.registerDefaultNetworkCallback(networkConnectivity$10);
        NetworkInfo networkInfo0 = this.e.getActiveNetworkInfo();
        if(networkInfo0 != null && networkInfo0.isConnected()) {
            if(networkInfo0.getType() != 0) {
                v = 2;
            }
            this.d = v;
        }
    }

    public final int a() {
        return this.d;
    }

    public final void b() {
        this.e.unregisterNetworkCallback(this.f);
    }
}

