package com.unity3d.player;

import android.app.Activity;
import android.content.Context;

class PlayAssetDeliveryUnityWrapper {
    private static PlayAssetDeliveryUnityWrapper a;
    private d b;

    private PlayAssetDeliveryUnityWrapper(Context context0) {
        if(PlayAssetDeliveryUnityWrapper.a != null) {
            throw new RuntimeException("PlayAssetDeliveryUnityWrapper should be created only once. Use getInstance() instead.");
        }
        try {
            Class.forName("com.google.android.play.core.assetpacks.AssetPackManager");
            this.b = PlayAssetDeliveryUnityWrapper.a(context0);
        }
        catch(ClassNotFoundException unused_ex) {
            this.b = null;
        }
    }

    private static d a(Context context0) {
        return a.a(context0);
    }

    private void a() {
        if(this.playCoreApiMissing()) {
            throw new RuntimeException("AssetPackManager API is not available! Make sure your gradle project includes \'com.google.android.play:asset-delivery\' dependency.");
        }
    }

    public void cancelAssetPackDownload(String s) {
        this.cancelAssetPackDownloads(new String[]{s});
    }

    public void cancelAssetPackDownloads(String[] arr_s) {
        this.a();
        this.b.a(arr_s);
    }

    public void downloadAssetPack(String s, IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback0) {
        this.downloadAssetPacks(new String[]{s}, iAssetPackManagerDownloadStatusCallback0);
    }

    public void downloadAssetPacks(String[] arr_s, IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback0) {
        this.a();
        this.b.a(arr_s, iAssetPackManagerDownloadStatusCallback0);
    }

    public String getAssetPackPath(String s) {
        this.a();
        return this.b.a(s);
    }

    public void getAssetPackState(String s, IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback0) {
        this.getAssetPackStates(new String[]{s}, iAssetPackManagerStatusQueryCallback0);
    }

    public void getAssetPackStates(String[] arr_s, IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback0) {
        this.a();
        this.b.a(arr_s, iAssetPackManagerStatusQueryCallback0);
    }

    public static PlayAssetDeliveryUnityWrapper getInstance() {
        synchronized(PlayAssetDeliveryUnityWrapper.class) {
            PlayAssetDeliveryUnityWrapper playAssetDeliveryUnityWrapper0;
            while((playAssetDeliveryUnityWrapper0 = PlayAssetDeliveryUnityWrapper.a) == null) {
                try {
                    PlayAssetDeliveryUnityWrapper.class.wait(3000L);
                }
                catch(InterruptedException interruptedException0) {
                    f.Log(6, interruptedException0.getMessage());
                }
            }
            if(playAssetDeliveryUnityWrapper0 != null) {
                return playAssetDeliveryUnityWrapper0;
            }
        }
        throw new RuntimeException("PlayAssetDeliveryUnityWrapper is not yet initialised.");
    }

    public static PlayAssetDeliveryUnityWrapper init(Context context0) {
        synchronized(PlayAssetDeliveryUnityWrapper.class) {
            if(PlayAssetDeliveryUnityWrapper.a == null) {
                PlayAssetDeliveryUnityWrapper.a = new PlayAssetDeliveryUnityWrapper(context0);
                PlayAssetDeliveryUnityWrapper.class.notifyAll();
                return PlayAssetDeliveryUnityWrapper.a;
            }
        }
        throw new RuntimeException("PlayAssetDeliveryUnityWrapper.init() should be called only once. Use getInstance() instead.");
    }

    public boolean playCoreApiMissing() {
        return this.b == null;
    }

    public Object registerDownloadStatusListener(IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback0) {
        this.a();
        return this.b.a(iAssetPackManagerDownloadStatusCallback0);
    }

    public void removeAssetPack(String s) {
        this.a();
        this.b.b(s);
    }

    public void requestToUseMobileData(Activity activity0, IAssetPackManagerMobileDataConfirmationCallback iAssetPackManagerMobileDataConfirmationCallback0) {
        this.a();
        this.b.a(activity0, iAssetPackManagerMobileDataConfirmationCallback0);
    }

    public void unregisterDownloadStatusListener(Object object0) {
        this.a();
        this.b.a(object0);
    }
}

