package com.unity3d.player;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;

public class HFPStatus {
    static final class a extends Enum {
        public static final enum int a = 1;
        public static final enum int b = 2;
        private static final int[] c;

        static {
            a.c = new int[]{1, 2};
        }
    }

    private Context a;
    private BroadcastReceiver b;
    private Intent c;
    private boolean d;
    private AudioManager e;
    private boolean f;
    private int g;

    public HFPStatus(Context context0) {
        this.b = null;
        this.c = null;
        this.d = false;
        this.f = false;
        this.g = a.a;
        this.a = context0;
        this.e = (AudioManager)context0.getSystemService("audio");
        this.initHFPStatusJni();
    }

    public final void a() {
        this.clearHFPStat();
        this.deinitHFPStatusJni();
    }

    private void b() {
        BroadcastReceiver broadcastReceiver0 = this.b;
        if(broadcastReceiver0 != null) {
            this.a.unregisterReceiver(broadcastReceiver0);
            this.b = null;
            this.c = null;
        }
        this.g = a.a;
    }

    private void c() {
        if(this.f) {
            this.f = false;
            this.e.stopBluetoothSco();
        }
    }

    protected void clearHFPStat() {
        this.b();
        this.c();
    }

    private final native void deinitHFPStatusJni() {
    }

    protected boolean getHFPStat() {
        return this.g == a.b;
    }

    private final native void initHFPStatusJni() {
    }

    protected void requestHFPStat() {
        this.clearHFPStat();
        com.unity3d.player.HFPStatus.1 hFPStatus$10 = new BroadcastReceiver() {
            final HFPStatus a;

            @Override  // android.content.BroadcastReceiver
            public void onReceive(Context context0, Intent intent0) {
                if(intent0.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1) == 1) {
                    HFPStatus.this.g = a.b;
                    HFPStatus.this.c();
                    if(HFPStatus.this.d) {
                        HFPStatus.this.e.setMode(3);
                    }
                }
            }
        };
        this.b = hFPStatus$10;
        this.c = this.a.registerReceiver(hFPStatus$10, new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"));
        try {
            this.f = true;
            this.e.startBluetoothSco();
        }
        catch(NullPointerException unused_ex) {
            f.Log(5, "startBluetoothSco() failed. no bluetooth device connected.");
        }
    }

    protected void setHFPRecordingStat(boolean z) {
        this.d = z;
        if(!z) {
            this.e.setMode(0);
        }
    }
}

