package androidx.profileinstaller;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.startup.Initializer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ProfileInstallerInitializer implements Initializer {
    static class Choreographer16Impl {
        // 检测为 Lambda 实现
        static void lambda$postFrameCallback$0(Runnable runnable0, long v) [...]

        public static void postFrameCallback(Runnable runnable0) {
            Choreographer.getInstance().postFrameCallback((long v) -> runnable0.run());
        }
    }

    static class Handler28Impl {
        public static Handler createAsync(Looper looper0) {
            return Handler.createAsync(looper0);
        }
    }

    public static class Result {
    }

    private static final int DELAY_MS = 5000;

    public Result create(Context context0) {
        if(Build.VERSION.SDK_INT < 24) {
            return new Result();
        }
        this.delayAfterFirstFrame(context0.getApplicationContext());
        return new Result();
    }

    @Override  // androidx.startup.Initializer
    public Object create(Context context0) {
        return this.create(context0);
    }

    void delayAfterFirstFrame(Context context0) {
        Choreographer16Impl.postFrameCallback(() -> this.installAfterDelay(context0));
    }

    @Override  // androidx.startup.Initializer
    public List dependencies() {
        return Collections.emptyList();
    }

    void installAfterDelay(Context context0) {
        Handler handler0 = Build.VERSION.SDK_INT < 28 ? new Handler(Looper.getMainLooper()) : Handler28Impl.createAsync(Looper.getMainLooper());
        int v = new Random().nextInt(1000);
        handler0.postDelayed(() -> new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new ProfileInstallerInitializer..ExternalSyntheticLambda2(context0)), ((long)(v + 5000)));
    }

    // 检测为 Lambda 实现
    void lambda$delayAfterFirstFrame$0$androidx-profileinstaller-ProfileInstallerInitializer(Context context0) [...]

    // 检测为 Lambda 实现
    private static void writeInBackground(Context context0) [...]
}

