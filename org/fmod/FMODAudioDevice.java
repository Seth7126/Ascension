package org.fmod;

import android.media.AudioTrack;
import android.util.Log;
import java.nio.ByteBuffer;

public class FMODAudioDevice implements Runnable {
    private volatile Thread a;
    private volatile boolean b;
    private AudioTrack c;
    private boolean d;
    private ByteBuffer e;
    private byte[] f;
    private volatile a g;
    private static int h = 0;
    private static int i = 1;
    private static int j = 2;
    private static int k = 3;
    private static int l = 4;

    static {
    }

    public FMODAudioDevice() {
        this.a = null;
        this.b = false;
        this.c = null;
        this.d = false;
        this.e = null;
        this.f = null;
    }

    public void close() {
        synchronized(this) {
            this.stop();
        }
    }

    private native int fmodGetInfo(int arg1) {
    }

    private native int fmodProcess(ByteBuffer arg1) {
    }

    native int fmodProcessMicData(ByteBuffer arg1, int arg2) {
    }

    public boolean isRunning() {
        return this.a != null && this.a.isAlive();
    }

    private void releaseAudioTrack() {
        AudioTrack audioTrack0 = this.c;
        if(audioTrack0 != null) {
            if(audioTrack0.getState() == 1) {
                this.c.stop();
            }
            this.c.release();
            this.c = null;
        }
        this.e = null;
        this.f = null;
        this.d = false;
    }

    @Override
    public void run() {
        int v = 3;
        while(this.b) {
            if(!this.d && v > 0) {
                this.releaseAudioTrack();
                int v1 = this.fmodGetInfo(FMODAudioDevice.h);
                int v2 = this.fmodGetInfo(FMODAudioDevice.l) == 1 ? 4 : 12;
                int v3 = AudioTrack.getMinBufferSize(v1, v2, 2);
                int v4 = this.fmodGetInfo(FMODAudioDevice.l) * 2;
                int v5 = Math.round(((float)v3) * 1.1f) & ~(v4 - 1);
                int v6 = this.fmodGetInfo(FMODAudioDevice.i);
                int v7 = this.fmodGetInfo(FMODAudioDevice.j) * v6 * v4;
                AudioTrack audioTrack0 = new AudioTrack(3, v1, v2, 2, (v7 <= v5 ? v5 : v7), 1);
                this.c = audioTrack0;
                boolean z = audioTrack0.getState() == 1;
                this.d = z;
                if(z) {
                    ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(v6 * v4);
                    this.e = byteBuffer0;
                    this.f = new byte[byteBuffer0.capacity()];
                    this.c.play();
                    v = 3;
                }
                else {
                    Log.e("FMOD", "AudioTrack failed to initialize (status " + this.c.getState() + ")");
                    this.releaseAudioTrack();
                    --v;
                }
            }
            if(!this.d) {
            }
            else if(this.fmodGetInfo(FMODAudioDevice.k) == 1) {
                this.fmodProcess(this.e);
                this.e.get(this.f, 0, this.e.capacity());
                this.c.write(this.f, 0, this.e.capacity());
                this.e.position(0);
            }
            else {
                this.releaseAudioTrack();
            }
        }
        this.releaseAudioTrack();
    }

    public void start() {
        synchronized(this) {
            if(this.a != null) {
                this.stop();
            }
            this.a = new Thread(this, "FMODAudioDevice");
            this.a.setPriority(10);
            this.b = true;
            this.a.start();
            if(this.g != null) {
                this.g.b();
            }
        }
    }

    public int startAudioRecord(int v, int v1, int v2) {
        synchronized(this) {
            if(this.g == null) {
                this.g = new a(this, v, v1);
                this.g.b();
            }
            return this.g.a();
        }
    }

    public void stop() {
        synchronized(this) {
            while(this.a != null) {
                try {
                    this.b = false;
                    this.a.join();
                    this.a = null;
                }
                catch(InterruptedException unused_ex) {
                }
            }
            if(this.g != null) {
                this.g.c();
            }
        }
    }

    public void stopAudioRecord() {
        synchronized(this) {
            if(this.g != null) {
                this.g.c();
                this.g = null;
            }
        }
    }
}

