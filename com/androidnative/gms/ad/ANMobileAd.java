package com.androidnative.gms.ad;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import com.androidnative.gms.utils.AnUtility;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class ANMobileAd extends AdListener {
    public static String AD_MOB_LISTNER_NAME = "AndroidAdMobController";
    private String AD_UNIT_ID;
    private static final String DEVICES_SEPARATOR = ",";
    private String INTERSTISIALS_AD_UNIT_ID;
    private boolean IsInited;
    private String REWARDED_AD_UNIT_ID;
    private static ANMobileAd _instance;
    private static AdRequest.Builder adRequestBuilder;
    private static HashMap banners;
    private InterstitialAdListner intListner;
    private InterstitialAd interstitial;
    private static Activity mainActivity;
    private RewardedVideoAd rewardedVideoAd;
    private RewardedVideoAdListener rewardedVideoListener;

    static {
    }

    public ANMobileAd() {
        this.AD_UNIT_ID = "";
        this.INTERSTISIALS_AD_UNIT_ID = "";
        this.REWARDED_AD_UNIT_ID = "";
        this.rewardedVideoAd = null;
        this.rewardedVideoListener = null;
        this.interstitial = null;
        this.intListner = null;
        this.IsInited = false;
    }

    public void AddKeyword(String s) {
        if(!this.IsInited) {
            return;
        }
        ANMobileAd.adRequestBuilder.addKeyword(s);
    }

    public void AddTestDevice(String s) {
        if(!this.IsInited) {
            return;
        }
        Log.d("AndroidNative", "AddTestDevice ");
        Log.d("AndroidNative", s);
        ANMobileAd.adRequestBuilder.addTestDevice(s);
    }

    public void AddTestDevices(String s) {
        if(s != null && s.length() > 0) {
            String[] arr_s = s.split(",");
            for(int v = 0; v < arr_s.length; ++v) {
                this.AddTestDevice(arr_s[v]);
            }
        }
    }

    public static void Bridge_AddKeyword(String s) {
        ANMobileAd.GetInstance().AddKeyword(s);
    }

    public static void Bridge_AddTestDevice(String s) {
        ANMobileAd.GetInstance().AddTestDevice(s);
    }

    public static void Bridge_AddTestDevices(String s) {
        ANMobileAd.GetInstance().AddTestDevices(s);
    }

    public static void Bridge_ChangeBannersUnitID(String s) {
        ANMobileAd.GetInstance().ChangeBannersUnitID(s);
    }

    public static void Bridge_ChangeInterstisialsUnitID(String s) {
        ANMobileAd.GetInstance().ChangeInterstisialsUnitID(s);
    }

    public static void Bridge_ChangeRewardedVideoUnitID(String s) {
        ANMobileAd.GetInstance().ChangeRewardedVideoUnitID(s);
    }

    public static void Bridge_CreateBannerAd(String s, String s1, String s2) {
        ANMobileAd.GetInstance().CreateBannerAd(Integer.parseInt(s), Integer.parseInt(s1), Integer.parseInt(s2));
    }

    public static void Bridge_CreateBannerAdPos(String s, String s1, String s2, String s3) {
        ANMobileAd.GetInstance().CreateBannerAd(Integer.parseInt(s), Integer.parseInt(s1), Integer.parseInt(s2), Integer.parseInt(s3));
    }

    public static void Bridge_DestroyBanner(String s) {
        ANMobileAd.GetInstance().DestroyBanner(Integer.parseInt(s));
    }

    public static void Bridge_HideAd(String s) {
        ANMobileAd.GetInstance().HideAd(Integer.parseInt(s));
    }

    public static void Bridge_Init(String s) {
        ANMobileAd.GetInstance().Init(s);
    }

    public static void Bridge_LoadInterstitialAd() {
        ANMobileAd.GetInstance().LoadInterstitialAd();
    }

    public static void Bridge_LoadRewardedVideo() {
        ANMobileAd.GetInstance().LoadRewardedVideo();
    }

    public static void Bridge_PauseBanner(String s) {
        ANMobileAd.GetInstance().PauseBanner(Integer.parseInt(s));
    }

    public static void Bridge_RecordAdInAppPurchasResolution(String s) {
    }

    public static void Bridge_RefreshAd(String s) {
        ANMobileAd.GetInstance().Refresh(Integer.parseInt(s));
    }

    public static void Bridge_ResumeBanner(String s) {
        ANMobileAd.GetInstance().ResumeBanner(Integer.parseInt(s));
    }

    public static void Bridge_SetBannerPosition(String s, String s1) {
        ANMobileAd.GetInstance().SetPosition(Integer.parseInt(s), Integer.parseInt(s1));
    }

    public static void Bridge_SetBannerPosition(String s, String s1, String s2) {
        ANMobileAd.GetInstance().SetPosition(Integer.parseInt(s), Integer.parseInt(s1), Integer.parseInt(s2));
    }

    public static void Bridge_SetBirthday(String s, String s1, String s2) {
        ANMobileAd.GetInstance().SetBirthday(Integer.parseInt(s), Integer.parseInt(s1), Integer.parseInt(s2));
    }

    public static void Bridge_SetGender(String s) {
        ANMobileAd.GetInstance().SetGender(Integer.parseInt(s));
    }

    public static void Bridge_ShowAd(String s) {
        ANMobileAd.GetInstance().ShowAd(Integer.parseInt(s));
    }

    public static void Bridge_ShowInterstitialAd() {
        ANMobileAd.GetInstance().ShowInterstitialAd();
    }

    public static void Bridge_ShowRewardedVideo() {
        ANMobileAd.GetInstance().ShowRewardedVideo();
    }

    public static void Bridge_StartInterstitialAd() {
        ANMobileAd.GetInstance().StartInterstitialAd();
    }

    public static void Bridge_TagForChildDirectedTreatment(String s) {
        if(Integer.parseInt(s) == 1) {
            ANMobileAd.GetInstance().TagForChildDirectedTreatment(true);
            return;
        }
        ANMobileAd.GetInstance().TagForChildDirectedTreatment(false);
    }

    public void ChangeBannersUnitID(String s) {
        this.AD_UNIT_ID = s;
    }

    public void ChangeInterstisialsUnitID(String s) {
        this.INTERSTISIALS_AD_UNIT_ID = s;
        InterstitialAd interstitialAd0 = new InterstitialAd(ANMobileAd.mainActivity);
        this.interstitial = interstitialAd0;
        interstitialAd0.setAdUnitId(this.INTERSTISIALS_AD_UNIT_ID);
        InterstitialAdListner interstitialAdListner0 = new InterstitialAdListner(this.interstitial);
        this.intListner = interstitialAdListner0;
        this.interstitial.setAdListener(interstitialAdListner0);
        Log.d("AndroidNative", "New interstitial unit id:  " + this.INTERSTISIALS_AD_UNIT_ID);
    }

    public void ChangeRewardedVideoUnitID(String s) {
        this.REWARDED_AD_UNIT_ID = s;
        Log.d("AndroidNative", "New Rewarded Video Unit ID:  " + this.REWARDED_AD_UNIT_ID);
    }

    public void CreateBannerAd(int v, int v1, int v2) {
        if(!this.IsInited) {
            return;
        }
        Log.d("AndroidNative", "CreateBannerAd ");
        GADBanner gADBanner0 = new GADBanner(v, v1, v2);
        ANMobileAd.banners.put(v2, gADBanner0);
    }

    public void CreateBannerAd(int v, int v1, int v2, int v3) {
        if(!this.IsInited) {
            return;
        }
        Log.d("AndroidNative", "CreateBannerAd ");
        GADBanner gADBanner0 = new GADBanner(v, v1, v2, v3);
        ANMobileAd.banners.put(v3, gADBanner0);
    }

    public void DestroyBanner(int v) {
        if(ANMobileAd.banners.containsKey(v)) {
            ((GADBanner)ANMobileAd.banners.get(v)).Destroy();
            ANMobileAd.banners.remove(v);
            return;
        }
        Log.d("AndroidNative", "Banner with id: " + v + " not found");
    }

    public AdRequest.Builder GetAdRequestBuilder() {
        return ANMobileAd.adRequestBuilder;
    }

    public String GetAdUnitID() {
        return this.AD_UNIT_ID;
    }

    public Activity GetCurrentActivity() {
        return ANMobileAd.mainActivity;
    }

    public static ANMobileAd GetInstance() {
        if(ANMobileAd._instance == null) {
            ANMobileAd._instance = new ANMobileAd();
            ANMobileAd.banners = new HashMap();
        }
        return ANMobileAd._instance;
    }

    public void HideAd(int v) {
        if(ANMobileAd.banners.containsKey(v)) {
            ((GADBanner)ANMobileAd.banners.get(v)).HideAd();
            return;
        }
        Log.d("AndroidNative", "Banner with id: " + v + " not found");
    }

    public void Init(String s) {
        if(this.IsInited) {
            return;
        }
        this.IsInited = true;
        this.AD_UNIT_ID = s;
        this.INTERSTISIALS_AD_UNIT_ID = s;
        this.REWARDED_AD_UNIT_ID = s;
        ANMobileAd.mainActivity = AnUtility.GetLauncherActivity();
        ANMobileAd.adRequestBuilder = new AdRequest.Builder();
        Log.d("AndroidNative", "Inited with id: " + s);
    }

    private void InitInterstitialAd(Activity activity0, String s) {
        if(this.interstitial == null) {
            Log.d("AndroidNative", "InitInterstitialAd: ");
            InterstitialAd interstitialAd0 = new InterstitialAd(activity0);
            this.interstitial = interstitialAd0;
            interstitialAd0.setAdUnitId(s);
            InterstitialAdListner interstitialAdListner0 = new InterstitialAdListner(this.interstitial);
            this.intListner = interstitialAdListner0;
            this.interstitial.setAdListener(interstitialAdListner0);
        }
    }

    public void LoadInterstitialAd() {
        this.InitInterstitialAd(ANMobileAd.mainActivity, this.INTERSTISIALS_AD_UNIT_ID);
        this.intListner.IsShowAdOnLoad = false;
        AdRequest adRequest0 = ANMobileAd.GetInstance().GetAdRequestBuilder().build();
        Log.d("AndroidNative", "InterstitialAd Is Test Device: " + adRequest0.isTestDevice(AnUtility.GetLauncherActivity()));
        this.interstitial.loadAd(adRequest0);
    }

    public void LoadRewardedVideo() {
        this.rewardedVideoAd = MobileAds.getRewardedVideoAdInstance(ANMobileAd.mainActivity);
        RewardedAdListener rewardedAdListener0 = new RewardedAdListener();
        this.rewardedVideoListener = rewardedAdListener0;
        this.rewardedVideoAd.setRewardedVideoAdListener(rewardedAdListener0);
        AdRequest adRequest0 = ANMobileAd.GetInstance().GetAdRequestBuilder().build();
        this.rewardedVideoAd.loadAd(this.REWARDED_AD_UNIT_ID, adRequest0);
    }

    public void PauseBanner(int v) {
        if(ANMobileAd.banners.containsKey(v)) {
            ((GADBanner)ANMobileAd.banners.get(v)).Pause();
            Log.d("AndroidNative", "Banner with id: " + v + " was paused");
            return;
        }
        Log.d("AndroidNative", "Banner with id: " + v + " not found");
    }

    public void Refresh(int v) {
        if(ANMobileAd.banners.containsKey(v)) {
            ((GADBanner)ANMobileAd.banners.get(v)).Refresh();
            return;
        }
        Log.d("AndroidNative", "Banner with id: " + v + " not found");
    }

    public void ResumeBanner(int v) {
        if(ANMobileAd.banners.containsKey(v)) {
            ((GADBanner)ANMobileAd.banners.get(v)).Resume();
            Log.d("AndroidNative", "Banner with id: " + v + " was resumed");
            return;
        }
        Log.d("AndroidNative", "Banner with id: " + v + " not found");
    }

    public void SetBirthday(int v, int v1, int v2) {
        if(!this.IsInited) {
            return;
        }
        Calendar calendar0 = Calendar.getInstance();
        calendar0.set(v, v1, v2);
        Date date0 = calendar0.getTime();
        ANMobileAd.adRequestBuilder.setBirthday(date0);
    }

    public void SetGender(int v) {
        if(!this.IsInited) {
            return;
        }
        ANMobileAd.adRequestBuilder.setGender(v);
    }

    public void SetPosition(int v, int v1) {
        if(ANMobileAd.banners.containsKey(v1)) {
            ((GADBanner)ANMobileAd.banners.get(v1)).SetPosition(v);
            return;
        }
        Log.d("AndroidNative", "Banner with id: " + v1 + " not found");
    }

    public void SetPosition(int v, int v1, int v2) {
        if(ANMobileAd.banners.containsKey(v2)) {
            ((GADBanner)ANMobileAd.banners.get(v2)).SetPosition(v, v1);
            return;
        }
        Log.d("AndroidNative", "Banner with id: " + v2 + " not found");
    }

    public void ShowAd(int v) {
        if(ANMobileAd.banners.containsKey(v)) {
            ((GADBanner)ANMobileAd.banners.get(v)).ShowAd();
            return;
        }
        Log.d("AndroidNative", "Banner with id: " + v + " not found");
    }

    public void ShowInterstitialAd() {
        InterstitialAd interstitialAd0 = this.interstitial;
        if(interstitialAd0 != null) {
            interstitialAd0.show();
        }
    }

    public void ShowRewardedVideo() {
        RewardedVideoAd rewardedVideoAd0 = this.rewardedVideoAd;
        if(rewardedVideoAd0 != null) {
            rewardedVideoAd0.show();
        }
    }

    public void StartInterstitialAd() {
        this.InitInterstitialAd(ANMobileAd.mainActivity, this.INTERSTISIALS_AD_UNIT_ID);
        this.intListner.IsShowAdOnLoad = true;
        AdRequest adRequest0 = ANMobileAd.GetInstance().GetAdRequestBuilder().build();
        Log.d("AndroidNative", "InterstitialAd Is Test Device: " + adRequest0.isTestDevice(AnUtility.GetLauncherActivity()));
        this.interstitial.loadAd(adRequest0);
    }

    public void TagForChildDirectedTreatment(boolean z) {
        if(!this.IsInited) {
            return;
        }
        Bundle bundle0 = new Bundle();
        bundle0.putBoolean("is_designed_for_families", z);
        ANMobileAd.adRequestBuilder.addNetworkExtrasBundle(AdMobAdapter.class, bundle0);
        Log.d("AndroidNative", "is_designed_for_families: " + z);
        ANMobileAd.adRequestBuilder.tagForChildDirectedTreatment(z);
    }

    public float getDensity() {
        DisplayMetrics displayMetrics0 = new DisplayMetrics();
        AnUtility.GetLauncherActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics0);
        return displayMetrics0.density;
    }
}

