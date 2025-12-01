package com.google.android.gms.internal.games;

import androidx.compose.ui.draw.PainterModifier..ExternalSyntheticBackport0;
import java.util.concurrent.atomic.AtomicReference;

public abstract class zzfe {
    private final AtomicReference zzha;

    public zzfe() {
        this.zzha = new AtomicReference();
    }

    public final void flush() {
        zzfd zzfd0 = (zzfd)this.zzha.get();
        if(zzfd0 != null) {
            zzfd0.flush();
        }
    }

    protected abstract zzfd zzag();

    public final void zzb(String s, int v) {
        zzfd zzfd0 = (zzfd)this.zzha.get();
        if(zzfd0 == null) {
            zzfd0 = this.zzag();
            if(!PainterModifier..ExternalSyntheticBackport0.m(this.zzha, null, zzfd0)) {
                zzfd0 = (zzfd)this.zzha.get();
            }
        }
        zzfd0.zze(s, v);
    }
}

