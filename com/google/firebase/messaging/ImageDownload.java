package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_messaging.zzh;
import com.google.android.gms.internal.firebase_messaging.zzi;
import com.google.android.gms.internal.firebase_messaging.zzk;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Executor;

class ImageDownload implements Closeable {
    private volatile InputStream connectionInputStream;
    private Task task;
    private final URL url;

    private ImageDownload(URL uRL0) {
        this.url = uRL0;
    }

    // 检测为 Lambda 实现
    public Bitmap blockingDownload() throws IOException [...]

    private byte[] blockingDownloadBytes() throws IOException {
        byte[] arr_b;
        URLConnection uRLConnection0 = this.url.openConnection();
        if(uRLConnection0.getContentLength() > 0x100000) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream0 = uRLConnection0.getInputStream();
        try {
            this.connectionInputStream = inputStream0;
            arr_b = zzh.zza(zzh.zza(inputStream0, 0x100001L));
        }
        catch(Throwable throwable0) {
            if(inputStream0 != null) {
                try {
                    inputStream0.close();
                }
                catch(Throwable throwable1) {
                    zzk.zza(throwable0, throwable1);
                }
            }
            throw throwable0;
        }
        if(inputStream0 != null) {
            inputStream0.close();
        }
        if(Log.isLoggable("FirebaseMessaging", 2)) {
            Log.v("FirebaseMessaging", "Downloaded " + arr_b.length + " bytes from " + this.url);
        }
        if(arr_b.length > 0x100000) {
            throw new IOException("Image exceeds max size of 1048576");
        }
        return arr_b;
    }

    @Override
    public void close() {
        try {
            zzi.zza(this.connectionInputStream);
        }
        catch(NullPointerException nullPointerException0) {
            Log.e("FirebaseMessaging", "Failed to close the image download stream.", nullPointerException0);
        }
    }

    public static ImageDownload create(String s) {
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        try {
            return new ImageDownload(new URL(s));
        }
        catch(MalformedURLException unused_ex) {
            String s1 = String.valueOf(s);
            Log.w("FirebaseMessaging", (s1.length() == 0 ? new String("Not downloading image, bad URL: ") : "Not downloading image, bad URL: " + s1));
            return null;
        }
    }

    public Task getTask() {
        return (Task)Preconditions.checkNotNull(this.task);
    }

    public void start(Executor executor0) {
        this.task = Tasks.call(executor0, () -> {
            Log.i("FirebaseMessaging", "Starting download of: " + this.url);
            byte[] arr_b = this.blockingDownloadBytes();
            Bitmap bitmap0 = BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length);
            if(bitmap0 == null) {
                throw new IOException("Failed to decode image: " + this.url);
            }
            if(Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Successfully downloaded image: " + this.url);
            }
            return bitmap0;
        });
    }
}

