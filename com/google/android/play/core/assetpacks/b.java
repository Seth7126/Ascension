package com.google.android.play.core.assetpacks;

import android.app.Notification.Builder;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.play.core.assetpacks.internal.ai;
import com.google.android.play.core.assetpacks.internal.i;
import com.google.android.play.core.assetpacks.internal.k;
import com.google.android.play.core.assetpacks.internal.o;

final class b extends i {
    final NotificationManager a;
    private final o b;
    private final Context c;
    private final bh d;
    private final l e;
    private final ci f;

    b(Context context0, bh bh0, l l0, ci ci0) {
        this.b = new o("AssetPackExtractionService");
        this.c = context0;
        this.d = bh0;
        this.e = l0;
        this.f = ci0;
        this.a = (NotificationManager)context0.getSystemService("notification");
    }

    @Override  // com.google.android.play.core.assetpacks.internal.j
    public final void b(Bundle bundle0, k k0) throws RemoteException {
        this.b.a("clearAssetPackStorage AIDL call", new Object[0]);
        if(ai.b(this.c) && ai.a(this.c)) {
            this.d.z();
            k0.c(new Bundle());
            return;
        }
        k0.d(new Bundle());
    }

    @Override  // com.google.android.play.core.assetpacks.internal.j
    public final void c(Bundle bundle0, k k0) throws RemoteException {
        this.e(bundle0, k0);
    }

    private final void d(String s) {
        synchronized(this) {
            if(s == null) {
                s = "File downloads by Play";
            }
            NotificationChannel notificationChannel0 = new NotificationChannel("playcore-assetpacks-service-notification-channel", s, 2);
            this.a.createNotificationChannel(notificationChannel0);
        }
    }

    private final void e(Bundle bundle0, k k0) throws RemoteException {
        synchronized(this) {
            this.b.a("updateServiceState AIDL call", new Object[0]);
            if(ai.b(this.c) && ai.a(this.c)) {
                int v1 = bundle0.getInt("action_type");
                this.f.c(k0);
                if(v1 == 1) {
                    if(Build.VERSION.SDK_INT >= 26) {
                        this.d(bundle0.getString("notification_channel_name"));
                    }
                    this.e.g(true);
                    ci ci0 = this.f;
                    String s = bundle0.getString("notification_title");
                    String s1 = bundle0.getString("notification_subtext");
                    long v2 = bundle0.getLong("notification_timeout", 600000L);
                    Parcelable parcelable0 = bundle0.getParcelable("notification_on_click_intent");
                    Notification.Builder notification$Builder0 = Build.VERSION.SDK_INT < 26 ? new Notification.Builder(this.c).setPriority(-2) : new Notification.Builder(this.c, "playcore-assetpacks-service-notification-channel").setTimeoutAfter(v2);
                    if(parcelable0 instanceof PendingIntent) {
                        notification$Builder0.setContentIntent(((PendingIntent)parcelable0));
                    }
                    Notification.Builder notification$Builder1 = notification$Builder0.setSmallIcon(0x1080081).setOngoing(false);
                    if(s == null) {
                        s = "Downloading additional file";
                    }
                    Notification.Builder notification$Builder2 = notification$Builder1.setContentTitle(s);
                    if(s1 == null) {
                        s1 = "Transferring";
                    }
                    notification$Builder2.setSubText(s1);
                    int v3 = bundle0.getInt("notification_color");
                    if(v3 != 0) {
                        notification$Builder0.setColor(v3).setVisibility(-1);
                    }
                    ci0.a(notification$Builder0.build());
                    Intent intent0 = new Intent(this.c, ExtractionForegroundService.class);
                    this.c.bindService(intent0, this.f, 1);
                    return;
                }
                if(v1 == 2) {
                    this.e.g(false);
                    this.f.b();
                    return;
                }
                this.b.b("Unknown action type received: %d", new Object[]{v1});
                k0.d(new Bundle());
                return;
            }
            k0.d(new Bundle());
        }
    }
}

