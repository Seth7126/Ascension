package com.google.firebase.messaging;

import java.util.concurrent.Callable;

final class ImageDownload..Lambda.0 implements Callable {
    private final ImageDownload arg$1;

    ImageDownload..Lambda.0(ImageDownload imageDownload0) {
        this.arg$1 = imageDownload0;
    }

    @Override
    public final Object call() {
        return this.arg$1.blockingDownload();
    }
}

