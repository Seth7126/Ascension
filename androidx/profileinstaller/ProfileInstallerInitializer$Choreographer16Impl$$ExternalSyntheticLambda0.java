package androidx.profileinstaller;

import android.view.Choreographer.FrameCallback;

public final class ProfileInstallerInitializer.Choreographer16Impl..ExternalSyntheticLambda0 implements Choreographer.FrameCallback {
    public final Runnable f$0;

    public ProfileInstallerInitializer.Choreographer16Impl..ExternalSyntheticLambda0(Runnable runnable0) {
        this.f$0 = runnable0;
    }

    @Override  // android.view.Choreographer$FrameCallback
    public final void doFrame(long v) {
        Choreographer16Impl.lambda$postFrameCallback$0(this.f$0, v);
    }
}

