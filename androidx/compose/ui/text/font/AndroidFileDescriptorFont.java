package androidx.compose.ui.text.font;

import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.ParcelFileDescriptor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B$\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u001F\u0010\u0006\u001A\u00020\u0007X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\r\u001A\u0004\b\u000B\u0010\fR\u0014\u0010\u000E\u001A\u00020\u000F8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0010\u0010\u0011R\u000E\u0010\u0012\u001A\u00020\u000FX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001A\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u0014\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/text/font/AndroidFileDescriptorFont;", "Landroidx/compose/ui/text/font/AndroidFont;", "fileDescriptor", "Landroid/os/ParcelFileDescriptor;", "weight", "Landroidx/compose/ui/text/font/FontWeight;", "style", "Landroidx/compose/ui/text/font/FontStyle;", "(Landroid/os/ParcelFileDescriptor;Landroidx/compose/ui/text/font/FontWeight;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getFileDescriptor", "()Landroid/os/ParcelFileDescriptor;", "getStyle-_-LCdwA", "()I", "I", "typeface", "Landroid/graphics/Typeface;", "getTypeface", "()Landroid/graphics/Typeface;", "typefaceInternal", "getWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class AndroidFileDescriptorFont implements AndroidFont {
    private final ParcelFileDescriptor fileDescriptor;
    private final int style;
    private final Typeface typefaceInternal;
    private final FontWeight weight;

    private AndroidFileDescriptorFont(ParcelFileDescriptor parcelFileDescriptor0, FontWeight fontWeight0, int v) {
        this.fileDescriptor = parcelFileDescriptor0;
        this.weight = fontWeight0;
        this.style = v;
        if(Build.VERSION.SDK_INT < 26) {
            throw new IllegalArgumentException("Cannot create font from file descriptor for SDK < 26");
        }
        this.typefaceInternal = AndroidFileDescriptorHelper.INSTANCE.create(parcelFileDescriptor0);
    }

    public AndroidFileDescriptorFont(ParcelFileDescriptor parcelFileDescriptor0, FontWeight fontWeight0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            fontWeight0 = FontWeight.Companion.getNormal();
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(parcelFileDescriptor0, fontWeight0, v, null);
    }

    public AndroidFileDescriptorFont(ParcelFileDescriptor parcelFileDescriptor0, FontWeight fontWeight0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        this(parcelFileDescriptor0, fontWeight0, v);
    }

    public final ParcelFileDescriptor getFileDescriptor() {
        return this.fileDescriptor;
    }

    @Override  // androidx.compose.ui.text.font.Font
    public int getStyle-_-LCdwA() {
        return this.style;
    }

    @Override  // androidx.compose.ui.text.font.AndroidFont
    public Typeface getTypeface() {
        return this.typefaceInternal;
    }

    @Override  // androidx.compose.ui.text.font.Font
    public FontWeight getWeight() {
        return this.weight;
    }
}

