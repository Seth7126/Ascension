package com.google.android.gms.games;

import com.google.android.gms.games.video.Videos.CaptureOverlayStateListener;
import com.google.android.gms.tasks.Task;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface VideosClient {
    @Retention(RetentionPolicy.SOURCE)
    public @interface CaptureOverlayState {
    }

    public interface OnCaptureOverlayStateListener extends CaptureOverlayStateListener {
        @Override  // com.google.android.gms.games.video.Videos$CaptureOverlayStateListener
        void onCaptureOverlayStateChanged(int arg1);
    }

    public static final int CAPTURE_OVERLAY_STATE_CAPTURE_STARTED = 2;
    public static final int CAPTURE_OVERLAY_STATE_CAPTURE_STOPPED = 3;
    public static final int CAPTURE_OVERLAY_STATE_DISMISSED = 4;
    public static final int CAPTURE_OVERLAY_STATE_SHOWN = 1;

    Task getCaptureCapabilities();

    Task getCaptureOverlayIntent();

    Task getCaptureState();

    Task isCaptureAvailable(int arg1);

    Task isCaptureSupported();

    Task registerOnCaptureOverlayStateChangedListener(OnCaptureOverlayStateListener arg1);

    Task unregisterOnCaptureOverlayStateChangedListener(OnCaptureOverlayStateListener arg1);
}

