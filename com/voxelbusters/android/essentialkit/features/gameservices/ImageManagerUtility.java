package com.voxelbusters.android.essentialkit.features.gameservices;

import android.app.Activity;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.common.images.ImageManager.OnImageLoadedListener;
import com.google.android.gms.common.images.ImageManager;
import com.voxelbusters.android.essentialkit.common.ByteBuffer;
import com.voxelbusters.android.essentialkit.common.interfaces.ILoadAssetListener;
import java.io.ByteArrayOutputStream;

public class ImageManagerUtility {
    // 检测为 Lambda 实现
    static void lambda$loadImage$0(Activity activity0, ILoadAssetListener iLoadAssetListener0, Uri uri0) [...]

    public static void loadImage(Activity activity0, Uri uri0, ILoadAssetListener iLoadAssetListener0) {
        activity0.runOnUiThread(() -> {
            ImageManager.create(activity0).loadImage(new OnImageLoadedListener() {
                @Override  // com.google.android.gms.common.images.ImageManager$OnImageLoadedListener
                public void onImageLoaded(Uri uri0, Drawable drawable0, boolean z) {
                    if(z) {
                        Bitmap bitmap0 = ((BitmapDrawable)drawable0).getBitmap();
                        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                        bitmap0.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream0);
                        ByteBuffer byteBuffer0 = new ByteBuffer(byteArrayOutputStream0.toByteArray());
                        iLoadAssetListener0.onSuccess(byteBuffer0);
                        return;
                    }
                    iLoadAssetListener0.onFailure("Unable to load image");
                }
            }, uri0);
        });
    }
}

