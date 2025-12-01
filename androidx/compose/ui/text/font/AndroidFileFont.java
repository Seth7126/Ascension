package androidx.compose.ui.text.font;

import android.graphics.Typeface;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B$\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u001F\u0010\u0006\u001A\u00020\u0007X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\r\u001A\u0004\b\u000B\u0010\fR\u0014\u0010\u000E\u001A\u00020\u000F8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001A\n \u0013*\u0004\u0018\u00010\u000F0\u000FX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001A\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0014\u0010\u0015\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/text/font/AndroidFileFont;", "Landroidx/compose/ui/text/font/AndroidFont;", "file", "Ljava/io/File;", "weight", "Landroidx/compose/ui/text/font/FontWeight;", "style", "Landroidx/compose/ui/text/font/FontStyle;", "(Ljava/io/File;Landroidx/compose/ui/text/font/FontWeight;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getFile", "()Ljava/io/File;", "getStyle-_-LCdwA", "()I", "I", "typeface", "Landroid/graphics/Typeface;", "getTypeface", "()Landroid/graphics/Typeface;", "typefaceInternal", "kotlin.jvm.PlatformType", "getWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class AndroidFileFont implements AndroidFont {
    private final File file;
    private final int style;
    private final Typeface typefaceInternal;
    private final FontWeight weight;

    private AndroidFileFont(File file0, FontWeight fontWeight0, int v) {
        this.file = file0;
        this.weight = fontWeight0;
        this.style = v;
        this.typefaceInternal = Typeface.createFromFile(file0);
    }

    public AndroidFileFont(File file0, FontWeight fontWeight0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            fontWeight0 = FontWeight.Companion.getNormal();
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(file0, fontWeight0, v, null);
    }

    public AndroidFileFont(File file0, FontWeight fontWeight0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        this(file0, fontWeight0, v);
    }

    public final File getFile() {
        return this.file;
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

