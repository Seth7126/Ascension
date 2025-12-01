package org.fmod;

import android.media.AudioRecord;
import android.util.Log;
import java.nio.ByteBuffer;

final class a implements Runnable {
    private final FMODAudioDevice a;
    private final ByteBuffer b;
    private final int c;
    private final int d;
    private final int e;
    private volatile Thread f;
    private volatile boolean g;
    private AudioRecord h;
    private boolean i;

    a(FMODAudioDevice fMODAudioDevice0, int v, int v1) {
        this.a = fMODAudioDevice0;
        this.c = v;
        this.d = v1;
        this.e = 2;
        this.b = ByteBuffer.allocateDirect(AudioRecord.getMinBufferSize(v, v1, 2));
    }

    public final int a() {
        return this.b.capacity();
    }

    public final void b() {
        if(this.f != null) {
            this.c();
        }
        this.g = true;
        this.f = new Thread(this);
        this.f.start();
    }

    public final void c() {
        while(this.f != null) {
            try {
                this.g = false;
                this.f.join();
                this.f = null;
            }
            catch(InterruptedException unused_ex) {
            }
        }
    }

    private void d() {
        AudioRecord audioRecord0 = this.h;
        if(audioRecord0 != null) {
            if(audioRecord0.getState() == 1) {
                this.h.stop();
            }
            this.h.release();
            this.h = null;
        }
        this.b.position(0);
        this.i = false;
    }

    @Override
    public final void run() {
        int v = 3;
        while(this.g) {
            if(!this.i && v > 0) {
                this.d();
                AudioRecord audioRecord0 = new AudioRecord(1, this.c, this.d, this.e, this.b.capacity());
                this.h = audioRecord0;
                boolean z = audioRecord0.getState() == 1;
                this.i = z;
                if(z) {
                    this.b.position(0);
                    this.h.startRecording();
                    v = 3;
                }
                else {
                    Log.e("FMOD", "AudioRecord failed to initialize (status " + this.h.getState() + ")");
                    --v;
                    this.d();
                }
            }
            if(this.i && this.h.getRecordingState() == 3) {
                int v1 = this.h.read(this.b, this.b.capacity());
                this.a.fmodProcessMicData(this.b, v1);
                this.b.position(0);
            }
        }
        this.d();
    }
}

