package androidx.profileinstaller;

import java.util.concurrent.Executor;

public final class ProfileInstaller..ExternalSyntheticLambda1 implements SkipStrategy {
    public final Executor f$0;
    public final DiagnosticsCallback f$1;

    public ProfileInstaller..ExternalSyntheticLambda1(Executor executor0, DiagnosticsCallback profileInstaller$DiagnosticsCallback0) {
        this.f$0 = executor0;
        this.f$1 = profileInstaller$DiagnosticsCallback0;
    }

    @Override  // androidx.profileinstaller.DeviceProfileWriter$SkipStrategy
    public final boolean shouldSkip(long v, ExistingProfileState deviceProfileWriter$ExistingProfileState0) {
        return ProfileInstaller.lambda$transcodeAndWrite$2(this.f$0, this.f$1, v, deviceProfileWriter$ExistingProfileState0);
    }
}

