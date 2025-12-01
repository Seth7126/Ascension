package androidx.compose.ui.text.font;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import androidx.compose.ui.text.ExperimentalTextApi;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A9\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000B\u001A1\u0010\u0000\u001A\u00020\u00012\u0006\u0010\f\u001A\u00020\r2\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000E\u0010\u000F\u001A1\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0010\u001A\u00020\u00112\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000E\u0010\u0012\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\u0013"}, d2 = {"Font", "Landroidx/compose/ui/text/font/Font;", "assetManager", "Landroid/content/res/AssetManager;", "path", "", "weight", "Landroidx/compose/ui/text/font/FontWeight;", "style", "Landroidx/compose/ui/text/font/FontStyle;", "Font-wCLgNak", "(Landroid/content/res/AssetManager;Ljava/lang/String;Landroidx/compose/ui/text/font/FontWeight;I)Landroidx/compose/ui/text/font/Font;", "fileDescriptor", "Landroid/os/ParcelFileDescriptor;", "Font-RetOiIg", "(Landroid/os/ParcelFileDescriptor;Landroidx/compose/ui/text/font/FontWeight;I)Landroidx/compose/ui/text/font/Font;", "file", "Ljava/io/File;", "(Ljava/io/File;Landroidx/compose/ui/text/font/FontWeight;I)Landroidx/compose/ui/text/font/Font;", "ui-text_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class AndroidFontKt {
    @ExperimentalTextApi
    public static final Font Font-RetOiIg(ParcelFileDescriptor parcelFileDescriptor0, FontWeight fontWeight0, int v) {
        Intrinsics.checkNotNullParameter(parcelFileDescriptor0, "fileDescriptor");
        Intrinsics.checkNotNullParameter(fontWeight0, "weight");
        return new AndroidFileDescriptorFont(parcelFileDescriptor0, fontWeight0, v, null);
    }

    @ExperimentalTextApi
    public static final Font Font-RetOiIg(File file0, FontWeight fontWeight0, int v) {
        Intrinsics.checkNotNullParameter(file0, "file");
        Intrinsics.checkNotNullParameter(fontWeight0, "weight");
        return new AndroidFileFont(file0, fontWeight0, v, null);
    }

    public static Font Font-RetOiIg$default(ParcelFileDescriptor parcelFileDescriptor0, FontWeight fontWeight0, int v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            fontWeight0 = FontWeight.Companion.getNormal();
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        return AndroidFontKt.Font-RetOiIg(parcelFileDescriptor0, fontWeight0, v);
    }

    public static Font Font-RetOiIg$default(File file0, FontWeight fontWeight0, int v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            fontWeight0 = FontWeight.Companion.getNormal();
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        return AndroidFontKt.Font-RetOiIg(file0, fontWeight0, v);
    }

    @ExperimentalTextApi
    public static final Font Font-wCLgNak(AssetManager assetManager0, String s, FontWeight fontWeight0, int v) {
        Intrinsics.checkNotNullParameter(assetManager0, "assetManager");
        Intrinsics.checkNotNullParameter(s, "path");
        Intrinsics.checkNotNullParameter(fontWeight0, "weight");
        return new AndroidAssetFont(assetManager0, s, fontWeight0, v, null);
    }

    public static Font Font-wCLgNak$default(AssetManager assetManager0, String s, FontWeight fontWeight0, int v, int v1, Object object0) {
        if((v1 & 4) != 0) {
            fontWeight0 = FontWeight.Companion.getNormal();
        }
        if((v1 & 8) != 0) {
            v = 0;
        }
        return AndroidFontKt.Font-wCLgNak(assetManager0, s, fontWeight0, v);
    }
}

