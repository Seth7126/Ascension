package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.os.Build.VERSION;

public class BlendModeColorFilterCompat {
    public static ColorFilter createBlendModeColorFilterCompat(int v, BlendModeCompat blendModeCompat0) {
        if(Build.VERSION.SDK_INT >= 29) {
            BlendMode blendMode0 = BlendModeUtils.obtainBlendModeFromCompat(blendModeCompat0);
            return blendMode0 != null ? new BlendModeColorFilter(v, blendMode0) : null;
        }
        PorterDuff.Mode porterDuff$Mode0 = BlendModeUtils.obtainPorterDuffFromCompat(blendModeCompat0);
        return porterDuff$Mode0 != null ? new PorterDuffColorFilter(v, porterDuff$Mode0) : null;
    }
}

