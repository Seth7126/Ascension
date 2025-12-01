package com.google.android.play.core.assetpacks;

import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.assetpacks.internal.aq;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;

final class bu {
    private final aq a;

    bu(aq aq0) {
        this.a = aq0;
    }

    final InputStream a(int v, String s, String s1, int v1) {
        Task task0 = ((y)this.a.a()).a(v, s, s1, v1);
        try {
            ParcelFileDescriptor parcelFileDescriptor0 = (ParcelFileDescriptor)Tasks.await(task0);
            if(parcelFileDescriptor0 == null || parcelFileDescriptor0.getFileDescriptor() == null) {
                throw new ck(String.format("Corrupted ParcelFileDescriptor, session %s packName %s sliceId %s, chunkNumber %s", v, s, s1, v1), v);
            }
            return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor0);
        }
        catch(ExecutionException executionException0) {
            throw new ck(String.format("Error opening chunk file, session %s packName %s sliceId %s, chunkNumber %s", v, s, s1, v1), executionException0, v);
        }
        catch(InterruptedException interruptedException0) {
            throw new ck("Extractor was interrupted while waiting for chunk file.", interruptedException0, v);
        }
    }
}

