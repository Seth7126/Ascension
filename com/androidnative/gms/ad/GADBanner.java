package com.androidnative.gms.ad;

import android.content.res.Resources;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.PopupWindow;
import com.androidnative.gms.utils.AnUtility;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.unity3d.player.UnityPlayer;

class GADBanner {
    private static final int POSITION_CUSTOM = -1;
    private int _id;
    private AdView adView;
    private boolean mHidden;
    private int mHorizontalOffset;
    private PopupWindow mPopupWindow;
    private int mPositionCode;
    private int mVerticalOffset;

    GADBanner(int v, int v1, int v2) {
        this.adView = null;
        this.createAdView(ANMobileAd.GetInstance().GetAdUnitID(), GADBanner.intSizeToAdSize(v1));
        this.createPopupWindow();
        this.mHorizontalOffset = 0;
        this.mVerticalOffset = 0;
        this.mPositionCode = v;
        this.mHidden = false;
        this.adView.loadAd(ANMobileAd.GetInstance().GetAdRequestBuilder().build());
        this._id = v2;
    }

    GADBanner(int v, int v1, int v2, int v3) {
        this.adView = null;
        this.createAdView(ANMobileAd.GetInstance().GetAdUnitID(), GADBanner.intSizeToAdSize(v2));
        this.createPopupWindow();
        this.mPositionCode = -1;
        this.mHorizontalOffset = v;
        this.mVerticalOffset = v1;
        this.mHidden = false;
        this.adView.loadAd(ANMobileAd.GetInstance().GetAdRequestBuilder().build());
        this._id = v3;
    }

    void Destroy() {
        this.adView.destroy();
        this.mPopupWindow.dismiss();
        ViewParent viewParent0 = this.adView.getParent();
        if(viewParent0 != null && viewParent0 instanceof ViewGroup) {
            ((ViewGroup)viewParent0).removeView(((View)this.adView));
        }
        this.adView = null;
    }

    void HideAd() {
        this.mHidden = true;
        this.adView.setVisibility(8);
        this.mPopupWindow.dismiss();
        this.adView.pause();
    }

    void Pause() {
        AdView adView0 = this.adView;
        if(adView0 != null) {
            adView0.pause();
        }
    }

    void Refresh() {
        AdRequest adRequest0 = ANMobileAd.GetInstance().GetAdRequestBuilder().build();
        Log.d("AndroidNative", "Banner Ad Is Test Device: " + adRequest0.isTestDevice(AnUtility.GetLauncherActivity()));
        this.adView.loadAd(adRequest0);
    }

    void Resume() {
        AdView adView0 = this.adView;
        if(adView0 != null) {
            adView0.resume();
        }
    }

    void SetPosition(int v) {
        PopupWindow popupWindow0 = this.mPopupWindow;
        if(popupWindow0 != null) {
            this.mPositionCode = v;
            popupWindow0.showAtLocation(ANMobileAd.GetInstance().GetCurrentActivity().getWindow().getDecorView().getRootView(), this.mPositionCode, 0, 0);
        }
    }

    void SetPosition(int v, int v1) {
        PopupWindow popupWindow0 = this.mPopupWindow;
        if(popupWindow0 != null) {
            this.mPositionCode = -1;
            popupWindow0.showAtLocation(ANMobileAd.GetInstance().GetCurrentActivity().getWindow().getDecorView().getRootView(), 0, ((int)GADBanner.convertDpToPixel(this.mHorizontalOffset)), ((int)GADBanner.convertDpToPixel(this.mVerticalOffset)));
        }
    }

    void ShowAd() {
        this.mHidden = false;
        this.adView.setVisibility(0);
        if(!this.mPopupWindow.isShowing()) {
            this.showPopUpWindow();
        }
        this.adView.resume();
    }

    private static float convertDpToPixel(float f) {
        return f * Resources.getSystem().getDisplayMetrics().density;
    }

    public static float convertPixelsToDp(float f) {
        return f / Resources.getSystem().getDisplayMetrics().density;
    }

    private void createAdView(String s, AdSize adSize0) {
        AdView adView0 = new AdView(ANMobileAd.GetInstance().GetCurrentActivity());
        this.adView = adView0;
        adView0.setBackgroundColor(0);
        this.adView.setAdUnitId(s);
        this.adView.setAdSize(adSize0);
        this.adView.setAdListener(new AdListener() {
            public void onAdClosed() {
                super.onAdClosed();
                Log.d("AndroidNative", "OnBannerAdClosed: ");
                UnityPlayer.UnitySendMessage(ANMobileAd.AD_MOB_LISTNER_NAME, "OnBannerAdClosed", Integer.toString(GADBanner.this._id));
            }

            public void onAdFailedToLoad(int v) {
                super.onAdFailedToLoad(v);
                Log.d("AndroidNative", "OnBannerAdFailedToLoad: ");
                UnityPlayer.UnitySendMessage(ANMobileAd.AD_MOB_LISTNER_NAME, "OnBannerAdFailedToLoad", Integer.toString(GADBanner.this._id));
            }

            public void onAdLeftApplication() {
                super.onAdLeftApplication();
                Log.d("AndroidNative", "OnBannerAdLeftApplication: ");
                UnityPlayer.UnitySendMessage(ANMobileAd.AD_MOB_LISTNER_NAME, "OnBannerAdLeftApplication", Integer.toString(GADBanner.this._id));
            }

            public void onAdLoaded() {
                super.onAdLoaded();
                Log.d("AndroidNative", "OnBannerAdLoaded: ");
                UnityPlayer.UnitySendMessage(ANMobileAd.AD_MOB_LISTNER_NAME, "OnBannerAdLoaded", GADBanner.this._id + "|" + GADBanner.this.adView.getAdSize().getWidthInPixels(AnUtility.GetLauncherActivity()) + "|" + GADBanner.this.adView.getAdSize().getHeightInPixels(AnUtility.GetLauncherActivity()));
            }

            public void onAdOpened() {
                super.onAdOpened();
                Log.d("AndroidNative", "OnBannerAdOpened: ");
                UnityPlayer.UnitySendMessage(ANMobileAd.AD_MOB_LISTNER_NAME, "OnBannerAdOpened", Integer.toString(GADBanner.this._id));
            }
        });
    }

    private void createPopupWindow() {
        int v = this.adView.getAdSize().equals(AdSize.SMART_BANNER) ? -1 : this.adView.getAdSize().getWidthInPixels(ANMobileAd.GetInstance().GetCurrentActivity());
        int v1 = this.adView.getAdSize().getHeightInPixels(ANMobileAd.GetInstance().GetCurrentActivity());
        this.mPopupWindow = new PopupWindow(((View)this.adView), v, v1);
        int v2 = ANMobileAd.GetInstance().GetCurrentActivity().getWindow().getAttributes().flags;
        this.mPopupWindow.getContentView().setSystemUiVisibility(v2);
        GADBanner.setPopUpWindowLayoutType(this.mPopupWindow, 1002);
    }

    private static AdSize intSizeToAdSize(int v) {
        switch(v) {
            case 1: {
                return AdSize.BANNER;
            }
            case 2: {
                return AdSize.SMART_BANNER;
            }
            case 3: {
                return AdSize.FULL_BANNER;
            }
            case 4: {
                return AdSize.LEADERBOARD;
            }
            case 5: {
                return AdSize.MEDIUM_RECTANGLE;
            }
            default: {
                return AdSize.BANNER;
            }
        }
    }

    private static void setPopUpWindowLayoutType(PopupWindow popupWindow0, int v) {
        PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE).setAccessible(true);
        popupWindow0.setWindowLayoutType(v);
    }

    private void showPopUpWindow() {
        if(this.mPositionCode == -1) {
            this.mPopupWindow.showAtLocation(ANMobileAd.GetInstance().GetCurrentActivity().getWindow().getDecorView().getRootView(), 0, ((int)GADBanner.convertDpToPixel(this.mHorizontalOffset)), ((int)GADBanner.convertDpToPixel(this.mVerticalOffset)));
            return;
        }
        this.mPopupWindow.showAtLocation(ANMobileAd.GetInstance().GetCurrentActivity().getWindow().getDecorView().getRootView(), this.mPositionCode, 0, 0);
    }
}

