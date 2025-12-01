package com.google.firebase.installations;

final class FirebaseInstallations..Lambda.2 implements Runnable {
    private final FirebaseInstallations arg$1;
    private final boolean arg$2;

    private FirebaseInstallations..Lambda.2(FirebaseInstallations firebaseInstallations0, boolean z) {
        this.arg$1 = firebaseInstallations0;
        this.arg$2 = z;
    }

    public static Runnable lambdaFactory$(FirebaseInstallations firebaseInstallations0, boolean z) {
        return new FirebaseInstallations..Lambda.2(firebaseInstallations0, z);
    }

    @Override
    public void run() {
        FirebaseInstallations.lambda$getToken$1(this.arg$1, this.arg$2);
    }
}

