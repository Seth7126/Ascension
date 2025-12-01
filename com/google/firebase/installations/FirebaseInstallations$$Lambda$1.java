package com.google.firebase.installations;

final class FirebaseInstallations..Lambda.1 implements Runnable {
    private final FirebaseInstallations arg$1;

    private FirebaseInstallations..Lambda.1(FirebaseInstallations firebaseInstallations0) {
        this.arg$1 = firebaseInstallations0;
    }

    public static Runnable lambdaFactory$(FirebaseInstallations firebaseInstallations0) {
        return new FirebaseInstallations..Lambda.1(firebaseInstallations0);
    }

    @Override
    public void run() {
        FirebaseInstallations.lambda$getId$0(this.arg$1);
    }
}

