package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback.OnSharedElementsReadyListener;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.DragEvent;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.content.LocusIdCompat;
import androidx.core.view.DragAndDropPermissionsCompat;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ActivityCompat extends ContextCompat {
    static class Api30Impl {
        static void setLocusContext(Activity activity0, LocusIdCompat locusIdCompat0, Bundle bundle0) {
            activity0.setLocusContext((locusIdCompat0 == null ? null : locusIdCompat0.toLocusId()), bundle0);
        }
    }

    public interface OnRequestPermissionsResultCallback {
        void onRequestPermissionsResult(int arg1, String[] arg2, int[] arg3);
    }

    public interface PermissionCompatDelegate {
        boolean onActivityResult(Activity arg1, int arg2, int arg3, Intent arg4);

        boolean requestPermissions(Activity arg1, String[] arg2, int arg3);
    }

    public interface RequestPermissionsRequestCodeValidator {
        void validateRequestPermissionsRequestCode(int arg1);
    }

    static class SharedElementCallback21Impl extends SharedElementCallback {
        private final androidx.core.app.SharedElementCallback mCallback;

        SharedElementCallback21Impl(androidx.core.app.SharedElementCallback sharedElementCallback0) {
            this.mCallback = sharedElementCallback0;
        }

        @Override  // android.app.SharedElementCallback
        public Parcelable onCaptureSharedElementSnapshot(View view0, Matrix matrix0, RectF rectF0) {
            return this.mCallback.onCaptureSharedElementSnapshot(view0, matrix0, rectF0);
        }

        @Override  // android.app.SharedElementCallback
        public View onCreateSnapshotView(Context context0, Parcelable parcelable0) {
            return this.mCallback.onCreateSnapshotView(context0, parcelable0);
        }

        @Override  // android.app.SharedElementCallback
        public void onMapSharedElements(List list0, Map map0) {
        }

        @Override  // android.app.SharedElementCallback
        public void onRejectSharedElements(List list0) {
        }

        @Override  // android.app.SharedElementCallback
        public void onSharedElementEnd(List list0, List list1, List list2) {
        }

        @Override  // android.app.SharedElementCallback
        public void onSharedElementStart(List list0, List list1, List list2) {
        }

        @Override  // android.app.SharedElementCallback
        public void onSharedElementsArrived(List list0, List list1, SharedElementCallback.OnSharedElementsReadyListener sharedElementCallback$OnSharedElementsReadyListener0) {
            androidx.core.app.ActivityCompat.SharedElementCallback21Impl.1 activityCompat$SharedElementCallback21Impl$10 = new OnSharedElementsReadyListener() {
                @Override  // androidx.core.app.SharedElementCallback$OnSharedElementsReadyListener
                public void onSharedElementsReady() {
                    sharedElementCallback$OnSharedElementsReadyListener0.onSharedElementsReady();
                }
            };
            this.mCallback.onSharedElementsArrived(list0, list1, activityCompat$SharedElementCallback21Impl$10);
        }
    }

    private static PermissionCompatDelegate sDelegate;

    public static void finishAffinity(Activity activity0) {
        activity0.finishAffinity();
    }

    public static void finishAfterTransition(Activity activity0) {
        activity0.finishAfterTransition();
    }

    public static PermissionCompatDelegate getPermissionCompatDelegate() {
        return ActivityCompat.sDelegate;
    }

    public static Uri getReferrer(Activity activity0) {
        return activity0.getReferrer();
    }

    @Deprecated
    public static boolean invalidateOptionsMenu(Activity activity0) {
        activity0.invalidateOptionsMenu();
        return true;
    }

    public static void postponeEnterTransition(Activity activity0) {
        activity0.postponeEnterTransition();
    }

    public static void recreate(Activity activity0) {
        if(Build.VERSION.SDK_INT >= 28) {
            activity0.recreate();
            return;
        }
        if(Build.VERSION.SDK_INT <= 23) {
            new Handler(activity0.getMainLooper()).post(new Runnable() {
                @Override
                public void run() {
                    if(!activity0.isFinishing() && !ActivityRecreator.recreate(activity0)) {
                        activity0.recreate();
                    }
                }
            });
            return;
        }
        if(!ActivityRecreator.recreate(activity0)) {
            activity0.recreate();
        }
    }

    public static DragAndDropPermissionsCompat requestDragAndDropPermissions(Activity activity0, DragEvent dragEvent0) {
        return DragAndDropPermissionsCompat.request(activity0, dragEvent0);
    }

    public static void requestPermissions(Activity activity0, String[] arr_s, int v) {
        if(ActivityCompat.sDelegate != null && ActivityCompat.sDelegate.requestPermissions(activity0, arr_s, v)) {
            return;
        }
        for(int v1 = 0; v1 < arr_s.length; ++v1) {
            if(TextUtils.isEmpty(arr_s[v1])) {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(arr_s) + " must not contain null or empty values");
            }
        }
        if(Build.VERSION.SDK_INT >= 23) {
            if(activity0 instanceof RequestPermissionsRequestCodeValidator) {
                ((RequestPermissionsRequestCodeValidator)activity0).validateRequestPermissionsRequestCode(v);
            }
            activity0.requestPermissions(arr_s, v);
            return;
        }
        if(activity0 instanceof OnRequestPermissionsResultCallback) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                @Override
                public void run() {
                    int[] arr_v = new int[arr_s.length];
                    PackageManager packageManager0 = activity0.getPackageManager();
                    for(int v = 0; v < arr_s.length; ++v) {
                        arr_v[v] = packageManager0.checkPermission(arr_s[v], "com.playdekgames.android.Ascension");
                    }
                    ((OnRequestPermissionsResultCallback)activity0).onRequestPermissionsResult(v, arr_s, arr_v);
                }
            });
        }
    }

    public static View requireViewById(Activity activity0, int v) {
        if(Build.VERSION.SDK_INT >= 28) {
            return activity0.requireViewById(v);
        }
        View view0 = activity0.findViewById(v);
        if(view0 == null) {
            throw new IllegalArgumentException("ID does not reference a View inside this Activity");
        }
        return view0;
    }

    public static void setEnterSharedElementCallback(Activity activity0, androidx.core.app.SharedElementCallback sharedElementCallback0) {
        activity0.setEnterSharedElementCallback((sharedElementCallback0 == null ? null : new SharedElementCallback21Impl(sharedElementCallback0)));
    }

    public static void setExitSharedElementCallback(Activity activity0, androidx.core.app.SharedElementCallback sharedElementCallback0) {
        activity0.setExitSharedElementCallback((sharedElementCallback0 == null ? null : new SharedElementCallback21Impl(sharedElementCallback0)));
    }

    public static void setLocusContext(Activity activity0, LocusIdCompat locusIdCompat0, Bundle bundle0) {
        if(Build.VERSION.SDK_INT >= 30) {
            Api30Impl.setLocusContext(activity0, locusIdCompat0, bundle0);
        }
    }

    public static void setPermissionCompatDelegate(PermissionCompatDelegate activityCompat$PermissionCompatDelegate0) {
        ActivityCompat.sDelegate = activityCompat$PermissionCompatDelegate0;
    }

    public static boolean shouldShowRequestPermissionRationale(Activity activity0, String s) {
        return Build.VERSION.SDK_INT < 23 ? false : activity0.shouldShowRequestPermissionRationale(s);
    }

    public static void startActivityForResult(Activity activity0, Intent intent0, int v, Bundle bundle0) {
        activity0.startActivityForResult(intent0, v, bundle0);
    }

    public static void startIntentSenderForResult(Activity activity0, IntentSender intentSender0, int v, Intent intent0, int v1, int v2, int v3, Bundle bundle0) throws IntentSender.SendIntentException {
        activity0.startIntentSenderForResult(intentSender0, v, intent0, v1, v2, v3, bundle0);
    }

    public static void startPostponedEnterTransition(Activity activity0) {
        activity0.startPostponedEnterTransition();
    }
}

