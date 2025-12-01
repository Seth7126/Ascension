package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\tH\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/platform/TypefaceAdapterHelperMethods;", "", "()V", "create", "Landroid/graphics/Typeface;", "typeface", "finalFontWeight", "", "finalFontStyle", "", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class TypefaceAdapterHelperMethods {
    public static final TypefaceAdapterHelperMethods INSTANCE;

    static {
        TypefaceAdapterHelperMethods.INSTANCE = new TypefaceAdapterHelperMethods();
    }

    public final Typeface create(Typeface typeface0, int v, boolean z) {
        Intrinsics.checkNotNullParameter(typeface0, "typeface");
        Typeface typeface1 = Typeface.create(typeface0, v, z);
        Intrinsics.checkNotNullExpressionValue(typeface1, "create(typeface, finalFontWeight, finalFontStyle)");
        return typeface1;
    }
}

