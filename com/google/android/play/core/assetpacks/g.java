package com.google.android.play.core.assetpacks;

import com.google.android.gms.tasks.OnSuccessListener;
import java.util.List;

public final class g implements OnSuccessListener {
    public final bh a;

    public g(bh bh0) {
        this.a = bh0;
    }

    @Override  // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object object0) {
        this.a.C(((List)object0));
    }
}

