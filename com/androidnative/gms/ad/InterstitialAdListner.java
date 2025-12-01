package com.androidnative.gms.ad;

import android.util.Log;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.InterstitialAd;
import com.unity3d.player.UnityPlayer;

public class InterstitialAdListner extends AdListener {
    public boolean IsShowAdOnLoad;
    private InterstitialAd _ad;

    public InterstitialAdListner(InterstitialAd interstitialAd0) {
        this.IsShowAdOnLoad = true;
        this._ad = interstitialAd0;
    }

    public void onAdClosed() {
        Log.d("AndroidNative", "OnInterstitialAdClosed: ");
        UnityPlayer.UnitySendMessage(ANMobileAd.AD_MOB_LISTNER_NAME, "OnInterstitialAdClosed", "");
    }

    public void onAdFailedToLoad(int v) {
        Log.d("AndroidNative", "onAdFailedToLoad: ");
        UnityPlayer.UnitySendMessage(ANMobileAd.AD_MOB_LISTNER_NAME, "OnInterstitialAdFailedToLoad", Integer.toString(v));
    }

    public void onAdLeftApplication() {
        Log.d("AndroidNative", "OnInterstitialAdLeftApplication: ");
        UnityPlayer.UnitySendMessage(ANMobileAd.AD_MOB_LISTNER_NAME, "OnInterstitialAdLeftApplication", "");
    }

    public void onAdLoaded() {
        if(this.IsShowAdOnLoad) {
            this._ad.show();
        }
        Log.d("AndroidNative", "OnInterstitialAdLoaded: ");
        UnityPlayer.UnitySendMessage(ANMobileAd.AD_MOB_LISTNER_NAME, "OnInterstitialAdLoaded", "");
    }

    public void onAdOpened() {
        Log.d("AndroidNative", "OnInterstitialAdOpened: ");
        UnityPlayer.UnitySendMessage(ANMobileAd.AD_MOB_LISTNER_NAME, "OnInterstitialAdOpened", "");
    }
}

