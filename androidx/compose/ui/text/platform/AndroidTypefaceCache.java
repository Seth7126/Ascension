package androidx.compose.ui.text.platform;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.util.TypedValue;
import androidx.collection.LruCache;
import androidx.compose.ui.text.font.AndroidAssetFont;
import androidx.compose.ui.text.font.AndroidFileDescriptorFont;
import androidx.compose.ui.text.font.AndroidFileFont;
import androidx.compose.ui.text.font.AndroidFont;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.ResourceFont;
import androidx.core.content.res.ResourcesCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001A\u0004\u0018\u00010\u00052\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000BJ\u0016\u0010\f\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000BR\u001A\u0010\u0003\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidTypefaceCache;", "", "()V", "cache", "Landroidx/collection/LruCache;", "", "Landroid/graphics/Typeface;", "getKey", "context", "Landroid/content/Context;", "font", "Landroidx/compose/ui/text/font/Font;", "getOrCreate", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class AndroidTypefaceCache {
    public static final AndroidTypefaceCache INSTANCE;
    private static final LruCache cache;

    static {
        AndroidTypefaceCache.INSTANCE = new AndroidTypefaceCache();
        AndroidTypefaceCache.cache = new LruCache(16);
    }

    public final String getKey(Context context0, Font font0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(font0, "font");
        String s = null;
        if(font0 instanceof ResourceFont) {
            TypedValue typedValue0 = new TypedValue();
            context0.getResources().getValue(((ResourceFont)font0).getResId(), typedValue0, true);
            CharSequence charSequence0 = typedValue0.string;
            if(charSequence0 != null) {
                s = charSequence0.toString();
            }
            Intrinsics.checkNotNull(s);
            return "res:" + s;
        }
        if(font0 instanceof AndroidAssetFont) {
            return Intrinsics.stringPlus("asset:", ((AndroidAssetFont)font0).getPath());
        }
        if(!(font0 instanceof AndroidFileFont) && !(font0 instanceof AndroidFileDescriptorFont)) {
            throw new IllegalArgumentException("Unknown font type: " + font0);
        }
        return null;
    }

    public final Typeface getOrCreate(Context context0, Font font0) {
        Typeface typeface1;
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(font0, "font");
        String s = this.getKey(context0, font0);
        if(s != null) {
            Typeface typeface0 = (Typeface)AndroidTypefaceCache.cache.get(s);
            if(typeface0 != null) {
                return typeface0;
            }
        }
        if(font0 instanceof ResourceFont) {
            if(Build.VERSION.SDK_INT >= 26) {
                int v = ((ResourceFont)font0).getResId();
                typeface1 = AndroidResourceFontLoaderHelper.INSTANCE.create(context0, v);
                goto label_18;
            }
            typeface1 = ResourcesCompat.getFont(context0, ((ResourceFont)font0).getResId());
            Intrinsics.checkNotNull(typeface1);
            Intrinsics.checkNotNullExpressionValue(typeface1, "{\n                    ResourcesCompat.getFont(context, font.resId)!!\n                }");
        }
        else if(font0 instanceof AndroidFont) {
            typeface1 = ((AndroidFont)font0).getTypeface();
        }
        else {
            throw new IllegalArgumentException("Unknown font type: " + font0);
        }
    label_18:
        if(s != null) {
            Typeface typeface2 = (Typeface)AndroidTypefaceCache.cache.put(s, typeface1);
        }
        return typeface1;
    }
}

