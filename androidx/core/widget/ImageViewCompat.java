package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.widget.ImageView;

public class ImageViewCompat {
    public static ColorStateList getImageTintList(ImageView imageView0) {
        return imageView0.getImageTintList();
    }

    public static PorterDuff.Mode getImageTintMode(ImageView imageView0) {
        return imageView0.getImageTintMode();
    }

    public static void setImageTintList(ImageView imageView0, ColorStateList colorStateList0) {
        imageView0.setImageTintList(colorStateList0);
    }

    public static void setImageTintMode(ImageView imageView0, PorterDuff.Mode porterDuff$Mode0) {
        imageView0.setImageTintMode(porterDuff$Mode0);
    }
}

