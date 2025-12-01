package com.androidnative.gms.analytics;

import android.app.Activity;
import android.util.Log;
import com.androidnative.gms.utils.AnUtility;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.HitBuilders.AppViewBuilder;
import com.google.android.gms.analytics.HitBuilders.EventBuilder;
import com.google.android.gms.analytics.HitBuilders.ScreenViewBuilder;
import com.google.android.gms.analytics.HitBuilders.TimingBuilder;
import com.google.android.gms.analytics.Tracker;
import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;

public class V4GoogleAnalytics {
    private Tracker AppTracker;
    private static V4GoogleAnalytics _instance;
    private boolean isTrackingStarted;
    private Activity mainActivity;

    static {
    }

    public V4GoogleAnalytics() {
        this.mainActivity = null;
        this.isTrackingStarted = false;
        this.AppTracker = null;
    }

    public void CreateItem(String s, String s1, String s2, String s3, String s4, String s5, String s6) {
        Product product0 = new Product().setId(s2).setName(s1).setCategory(s3);
        HitBuilders.ScreenViewBuilder hitBuilders$ScreenViewBuilder0 = (HitBuilders.ScreenViewBuilder)new HitBuilders.ScreenViewBuilder().addProduct(product0);
        this.getTracker().send(hitBuilders$ScreenViewBuilder0.build());
    }

    public void CreateTransaction(String s, String s1, String s2, String s3, String s4, String s5) {
        ProductAction productAction0 = new ProductAction("purchase").setTransactionId(s).setTransactionAffiliation(s1).setTransactionRevenue(Double.parseDouble(s2)).setTransactionTax(Double.parseDouble(s3)).setTransactionShipping(Double.parseDouble(s4)).setTransactionCouponCode(s5);
        HitBuilders.ScreenViewBuilder hitBuilders$ScreenViewBuilder0 = (HitBuilders.ScreenViewBuilder)new HitBuilders.ScreenViewBuilder().setProductAction(productAction0);
        this.getTracker().send(hitBuilders$ScreenViewBuilder0.build());
    }

    public static V4GoogleAnalytics GetInstance() {
        if(V4GoogleAnalytics._instance == null) {
            V4GoogleAnalytics._instance = new V4GoogleAnalytics();
        }
        return V4GoogleAnalytics._instance;
    }

    public void SendView() {
        this.getTracker().send(new HitBuilders.AppViewBuilder().build());
    }

    public void SendView(String s) {
        Tracker tracker0 = this.getTracker();
        tracker0.setScreenName(s);
        tracker0.send(new HitBuilders.AppViewBuilder().build());
        Log.d("AndroidNative", "GA: SendView " + s);
    }

    public void SetLogLevel(int v) {
        switch(v) {
            case 0: {
                GoogleAnalytics.getInstance(this.mainActivity).getLogger().setLogLevel(0);
                return;
            }
            case 1: {
                GoogleAnalytics.getInstance(this.mainActivity).getLogger().setLogLevel(1);
                return;
            }
            case 2: {
                GoogleAnalytics.getInstance(this.mainActivity).getLogger().setLogLevel(2);
                return;
            }
            case 3: {
                GoogleAnalytics.getInstance(this.mainActivity).getLogger().setLogLevel(3);
            }
        }
    }

    public void SetTracker(String s) {
        this.AppTracker = GoogleAnalytics.getInstance(this.mainActivity).newTracker(s);
    }

    public void clearKey(String s) {
        this.getTracker().set(s, null);
    }

    public void enableAdvertisingIdCollection(boolean z) {
        this.getTracker().enableAdvertisingIdCollection(z);
    }

    private String getStringResourceByName(String s) {
        return AnUtility.GetLauncherActivity().getString(AnUtility.GetLauncherActivity().getResources().getIdentifier(s, "string", "com.playdekgames.android.Ascension"));
    }

    public Tracker getTracker() {
        if(this.AppTracker == null) {
            String s = this.getStringResourceByName("ga_trackingId");
            Log.d("AndroidNative", "ga_trackingId: " + s);
            this.AppTracker = GoogleAnalytics.getInstance(this.mainActivity).newTracker(s);
        }
        return this.AppTracker;
    }

    public void sendEvent(String s, String s1, String s2, String s3) {
        Tracker tracker0 = this.getTracker();
        HitBuilders.EventBuilder hitBuilders$EventBuilder0 = new HitBuilders.EventBuilder();
        hitBuilders$EventBuilder0.setCategory(s).setAction(s1).setLabel(s2);
        if(!s3.equals("null")) {
            hitBuilders$EventBuilder0.setValue(Long.parseLong(s3));
        }
        Log.d("AndroidNative", "GA: sendEvent");
        tracker0.send(hitBuilders$EventBuilder0.build());
    }

    public void sendEvent(String s, String s1, String s2, String s3, String s4, String s5) {
        Tracker tracker0 = this.getTracker();
        HitBuilders.EventBuilder hitBuilders$EventBuilder0 = new HitBuilders.EventBuilder();
        hitBuilders$EventBuilder0.setCategory(s).setAction(s1).setLabel(s2);
        if(!s3.equals("null")) {
            hitBuilders$EventBuilder0.setValue(Long.parseLong(s3));
        }
        hitBuilders$EventBuilder0.set(s4, s5);
        tracker0.send(hitBuilders$EventBuilder0.build());
    }

    public void sendTiming(String s, String s1, String s2, String s3) {
        Long long0 = Long.parseLong(s1);
        Tracker tracker0 = this.getTracker();
        HitBuilders.TimingBuilder hitBuilders$TimingBuilder0 = new HitBuilders.TimingBuilder();
        hitBuilders$TimingBuilder0.setCategory(s).setValue(((long)long0));
        if(!s2.equals("null")) {
            hitBuilders$TimingBuilder0.setVariable(s2);
        }
        if(!s3.equals("null")) {
            hitBuilders$TimingBuilder0.setLabel(s3);
        }
        tracker0.send(hitBuilders$TimingBuilder0.build());
    }

    public void setDryRun(boolean z) {
        GoogleAnalytics.getInstance(this.mainActivity).setDryRun(z);
    }

    public void setKey(String s, String s1) {
        this.getTracker().set(s, s1);
    }

    public void startAnalyticsTracking(Activity activity0) {
        if(this.isTrackingStarted) {
            return;
        }
        this.mainActivity = activity0;
        this.isTrackingStarted = true;
        Log.d("AndroidNative", "Analytics Tracking Sarted");
        this.getTracker();
    }
}

