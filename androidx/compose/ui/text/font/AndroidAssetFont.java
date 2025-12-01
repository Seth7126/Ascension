package androidx.compose.ui.text.font;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B,\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0007\u0012\b\b\u0002\u0010\b\u001A\u00020\tø\u0001\u0000¢\u0006\u0002\u0010\nR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u001F\u0010\b\u001A\u00020\tX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0011\u001A\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0012\u001A\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001A\n \u0017*\u0004\u0018\u00010\u00130\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001A\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0018\u0010\u0019\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u001A"}, d2 = {"Landroidx/compose/ui/text/font/AndroidAssetFont;", "Landroidx/compose/ui/text/font/AndroidFont;", "assetManager", "Landroid/content/res/AssetManager;", "path", "", "weight", "Landroidx/compose/ui/text/font/FontWeight;", "style", "Landroidx/compose/ui/text/font/FontStyle;", "(Landroid/content/res/AssetManager;Ljava/lang/String;Landroidx/compose/ui/text/font/FontWeight;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAssetManager", "()Landroid/content/res/AssetManager;", "getPath", "()Ljava/lang/String;", "getStyle-_-LCdwA", "()I", "I", "typeface", "Landroid/graphics/Typeface;", "getTypeface", "()Landroid/graphics/Typeface;", "typefaceInternal", "kotlin.jvm.PlatformType", "getWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class AndroidAssetFont implements AndroidFont {
    private final AssetManager assetManager;
    private final String path;
    private final int style;
    private final Typeface typefaceInternal;
    private final FontWeight weight;

    private AndroidAssetFont(AssetManager assetManager0, String s, FontWeight fontWeight0, int v) {
        this.assetManager = assetManager0;
        this.path = s;
        this.weight = fontWeight0;
        this.style = v;
        this.typefaceInternal = Typeface.createFromAsset(assetManager0, s);
    }

    public AndroidAssetFont(AssetManager assetManager0, String s, FontWeight fontWeight0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 4) != 0) {
            fontWeight0 = FontWeight.Companion.getNormal();
        }
        if((v1 & 8) != 0) {
            v = 0;
        }
        this(assetManager0, s, fontWeight0, v, null);
    }

    public AndroidAssetFont(AssetManager assetManager0, String s, FontWeight fontWeight0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        this(assetManager0, s, fontWeight0, v);
    }

    public final AssetManager getAssetManager() {
        return this.assetManager;
    }

    public final String getPath() {
        return this.path;
    }

    @Override  // androidx.compose.ui.text.font.Font
    public int getStyle-_-LCdwA() {
        return this.style;
    }

    @Override  // androidx.compose.ui.text.font.AndroidFont
    public Typeface getTypeface() {
        Intrinsics.checkNotNullExpressionValue(this.typefaceInternal, "typefaceInternal");
        return this.typefaceInternal;
    }

    @Override  // androidx.compose.ui.text.font.Font
    public FontWeight getWeight() {
        return this.weight;
    }
}

