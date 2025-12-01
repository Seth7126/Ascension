package androidx.profileinstaller;

public final class ProfileInstaller..ExternalSyntheticLambda2 implements Runnable {
    public final DiagnosticsCallback f$0;
    public final int f$1;
    public final Object f$2;

    public ProfileInstaller..ExternalSyntheticLambda2(DiagnosticsCallback profileInstaller$DiagnosticsCallback0, int v, Object object0) {
        this.f$0 = profileInstaller$DiagnosticsCallback0;
        this.f$1 = v;
        this.f$2 = object0;
    }

    @Override
    public final void run() {
        this.f$0.onDiagnosticReceived(this.f$1, this.f$2);
    }
}

