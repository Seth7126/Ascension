package com.google.android.play.core.assetpacks;

import com.google.android.gms.tasks.OnFailureListener;

public final class h implements OnFailureListener {
    public static final h a;

    static {
        h.a = new h();
    }

    @Override  // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exception0) {
        l.e(exception0);
    }
}

