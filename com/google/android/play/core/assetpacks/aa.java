package com.google.android.play.core.assetpacks;

import com.google.android.gms.tasks.OnSuccessListener;

public final class aa implements OnSuccessListener {
    public final aw a;

    public aa(aw aw0) {
        this.a = aw0;
    }

    @Override  // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object object0) {
        AssetPackStates assetPackStates0 = (AssetPackStates)object0;
        this.a.f();
    }
}

