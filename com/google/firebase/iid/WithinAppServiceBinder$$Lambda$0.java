package com.google.firebase.iid;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

final class WithinAppServiceBinder..Lambda.0 implements OnCompleteListener {
    private final BindRequest arg$1;

    WithinAppServiceBinder..Lambda.0(BindRequest withinAppServiceConnection$BindRequest0) {
        this.arg$1 = withinAppServiceConnection$BindRequest0;
    }

    @Override  // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task0) {
        WithinAppServiceBinder.lambda$send$0$WithinAppServiceBinder(this.arg$1, task0);
    }
}

