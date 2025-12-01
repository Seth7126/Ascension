package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.internal.ar;
import com.google.android.play.core.assetpacks.internal.as;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class r implements as {
    @Override  // com.google.android.play.core.assetpacks.internal.as
    public final Object a() {
        ExecutorService executorService0 = Executors.newSingleThreadExecutor((Runnable runnable0) -> new Thread(runnable0, "AssetPackBackgroundExecutor"));
        ar.a(executorService0);
        return executorService0;
    }
}

