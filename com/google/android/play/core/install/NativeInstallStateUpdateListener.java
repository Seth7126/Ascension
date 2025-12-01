package com.google.android.play.core.install;

final class NativeInstallStateUpdateListener implements InstallStateUpdatedListener {
    public native void onStateUpdate(InstallState arg1) {
    }

    @Override  // com.google.android.play.core.listener.StateUpdatedListener
    public final void onStateUpdate(Object object0) {
        this.onStateUpdate(((InstallState)object0));
    }
}

