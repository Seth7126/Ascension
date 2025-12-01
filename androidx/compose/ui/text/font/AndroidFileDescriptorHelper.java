package androidx.compose.ui.text.font;

import android.graphics.Typeface.Builder;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/font/AndroidFileDescriptorHelper;", "", "()V", "create", "Landroid/graphics/Typeface;", "fileDescriptor", "Landroid/os/ParcelFileDescriptor;", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
final class AndroidFileDescriptorHelper {
    public static final AndroidFileDescriptorHelper INSTANCE;

    static {
        AndroidFileDescriptorHelper.INSTANCE = new AndroidFileDescriptorHelper();
    }

    public final Typeface create(ParcelFileDescriptor parcelFileDescriptor0) {
        Intrinsics.checkNotNullParameter(parcelFileDescriptor0, "fileDescriptor");
        Typeface typeface0 = new Typeface.Builder(parcelFileDescriptor0.getFileDescriptor()).build();
        Intrinsics.checkNotNullExpressionValue(typeface0, "Builder(fileDescriptor.fileDescriptor).build()");
        return typeface0;
    }
}

