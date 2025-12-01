package com.androidnative.gcm;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.core.app.NotificationCompat.BigPictureStyle;
import androidx.core.app.NotificationCompat.Builder;
import com.unity3d.player.UnityPlayer;

public class PictureLoadingListener implements PictureLoadingTaskListener {
    private Builder _builder;
    private String _data;
    private PendingIntent _intent;
    private NotificationManager _manager;
    private String _message;
    private int _requestId;
    private String _title;

    private PictureLoadingListener() {
        this._requestId = 0;
        this._builder = null;
        this._manager = null;
        this._intent = null;
        this._title = "";
        this._message = "";
        this._data = "";
    }

    public PictureLoadingListener(int v, Builder notificationCompat$Builder0, NotificationManager notificationManager0, PendingIntent pendingIntent0, String s, String s1, String s2) {
        this._requestId = v;
        this._builder = notificationCompat$Builder0;
        this._manager = notificationManager0;
        this._intent = pendingIntent0;
        this._title = s;
        this._message = s1;
        this._data = s2;
    }

    @Override  // com.androidnative.gcm.PictureLoadingTaskListener
    public void onPictureLoaded(Bitmap bitmap0) {
        this._builder.setStyle(new BigPictureStyle().bigPicture(bitmap0).setBigContentTitle(this._title).setSummaryText(this._message));
        this._builder.setContentIntent(this._intent).setAutoCancel(true);
        this._manager.notify(this._requestId, this._builder.build());
        try {
            UnityPlayer.UnitySendMessage("GoogleCloudMessageService", "GCMNotificationCallback", this._message + "|" + this._data);
            Log.d("AndroidNative", "[sendPushCallback] data: " + stringBuilder0.toString());
        }
        catch(UnsatisfiedLinkError unused_ex) {
            Log.d("AndroidNative", "Trying to call GCM push received callback, but the App closed!");
        }
    }
}

