package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import androidx.compose.ui.text.font.Font.ResourceLoader;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.ResourceFont;
import androidx.core.content.res.ResourcesCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\bH\u0016R\u000E\u0010\u0002\u001A\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AndroidFontResourceLoader;", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "load", "Landroid/graphics/Typeface;", "font", "Landroidx/compose/ui/text/font/Font;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class AndroidFontResourceLoader implements ResourceLoader {
    private final Context context;

    public AndroidFontResourceLoader(Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super();
        this.context = context0;
    }

    public Typeface load(Font font0) {
        Intrinsics.checkNotNullParameter(font0, "font");
        if(!(font0 instanceof ResourceFont)) {
            throw new IllegalArgumentException("Unknown font type: " + font0);
        }
        if(Build.VERSION.SDK_INT >= 26) {
            int v = ((ResourceFont)font0).getResId();
            return AndroidFontResourceLoaderHelper.INSTANCE.create(this.context, v);
        }
        int v1 = ((ResourceFont)font0).getResId();
        Typeface typeface0 = ResourcesCompat.getFont(this.context, v1);
        Intrinsics.checkNotNull(typeface0);
        Intrinsics.checkNotNullExpressionValue(typeface0, "{\n                    ResourcesCompat.getFont(context, font.resId)!!\n                }");
        return typeface0;
    }

    @Override  // androidx.compose.ui.text.font.Font$ResourceLoader
    public Object load(Font font0) {
        return this.load(font0);
    }
}

