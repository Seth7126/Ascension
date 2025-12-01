package com.google.firebase;

import android.content.Context;
import com.google.firebase.inject.Provider;

final class FirebaseApp..Lambda.1 implements Provider {
    private final FirebaseApp arg$1;
    private final Context arg$2;

    private FirebaseApp..Lambda.1(FirebaseApp firebaseApp0, Context context0) {
        this.arg$1 = firebaseApp0;
        this.arg$2 = context0;
    }

    @Override  // com.google.firebase.inject.Provider
    public Object get() {
        return FirebaseApp.lambda$new$0(this.arg$1, this.arg$2);
    }

    public static Provider lambdaFactory$(FirebaseApp firebaseApp0, Context context0) {
        return new FirebaseApp..Lambda.1(firebaseApp0, context0);
    }
}

