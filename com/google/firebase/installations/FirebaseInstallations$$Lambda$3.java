package com.google.firebase.installations;

import java.util.concurrent.Callable;

final class FirebaseInstallations..Lambda.3 implements Callable {
    private final FirebaseInstallations arg$1;

    private FirebaseInstallations..Lambda.3(FirebaseInstallations firebaseInstallations0) {
        this.arg$1 = firebaseInstallations0;
    }

    @Override
    public Object call() {
        return FirebaseInstallations.access$lambda$0(this.arg$1);
    }

    public static Callable lambdaFactory$(FirebaseInstallations firebaseInstallations0) {
        return new FirebaseInstallations..Lambda.3(firebaseInstallations0);
    }
}

