package com.androidnative.gms.ad;

import android.util.Log;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.unity3d.player.UnityPlayer;

public class RewardedAdListener implements RewardedVideoAdListener {
    public void onRewarded(RewardItem rewardItem0) {
        Log.d("AndroidNative", "[onRewarded] RewardType:" + rewardItem0.getType() + " Amount:" + rewardItem0.getAmount());
        UnityPlayer.UnitySendMessage(ANMobileAd.AD_MOB_LISTNER_NAME, "RewardedCallback", rewardItem0.getType() + "|" + rewardItem0.getAmount());
    }

    public void onRewardedVideoAdClosed() {
        Log.d("AndroidNative", "[onRewardedVideoAdClosed]");
        UnityPlayer.UnitySendMessage(ANMobileAd.AD_MOB_LISTNER_NAME, "RewardedVideoAdClosed", "");
    }

    public void onRewardedVideoAdFailedToLoad(int v) {
        Log.d("AndroidNative", "[onRewardedVideoAdFailedToLoad] ErrorCode:" + v);
        UnityPlayer.UnitySendMessage(ANMobileAd.AD_MOB_LISTNER_NAME, "RewardedVideoAdFailedToLoad", Integer.toString(v));
    }

    public void onRewardedVideoAdLeftApplication() {
        Log.d("AndroidNative", "[onRewardedVideoAdLeftApplication]");
        UnityPlayer.UnitySendMessage(ANMobileAd.AD_MOB_LISTNER_NAME, "RewardedVideoAdLeftApplication", "");
    }

    public void onRewardedVideoAdLoaded() {
        Log.d("AndroidNative", "[onRewardedVideoAdLoaded]");
        UnityPlayer.UnitySendMessage(ANMobileAd.AD_MOB_LISTNER_NAME, "RewardedVideoLoaded", "");
    }

    public void onRewardedVideoAdOpened() {
        Log.d("AndroidNative", "[onRewardedVideoAdOpened]");
        UnityPlayer.UnitySendMessage(ANMobileAd.AD_MOB_LISTNER_NAME, "RewardedVideoAdOpened", "");
    }

    public void onRewardedVideoStarted() {
        Log.d("AndroidNative", "[onRewardedVideoStarted]");
        UnityPlayer.UnitySendMessage(ANMobileAd.AD_MOB_LISTNER_NAME, "RewardedVideoStarted", "");
    }
}

