package androidx.profileinstaller;

import android.content.Context;

public final class ProfileInstallerInitializer..ExternalSyntheticLambda0 implements Runnable {
    public final Context f$0;

    public ProfileInstallerInitializer..ExternalSyntheticLambda0(Context context0) {
        this.f$0 = context0;
    }

    @Override
    public final void run() {
        ProfileInstallerInitializer.writeInBackground(this.f$0);
    }
}

