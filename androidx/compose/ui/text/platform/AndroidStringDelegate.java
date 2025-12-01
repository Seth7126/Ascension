package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.PlatformStringDelegate;
import androidx.compose.ui.text.intl.AndroidLocale;
import androidx.compose.ui.text.intl.PlatformLocale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u0007H\u0016J\u0018\u0010\b\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u0007H\u0016J\u0018\u0010\t\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u0007H\u0016J\u0018\u0010\n\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u0007H\u0016¨\u0006\u000B"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidStringDelegate;", "Landroidx/compose/ui/text/PlatformStringDelegate;", "()V", "capitalize", "", "string", "locale", "Landroidx/compose/ui/text/intl/PlatformLocale;", "decapitalize", "toLowerCase", "toUpperCase", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class AndroidStringDelegate implements PlatformStringDelegate {
    @Override  // androidx.compose.ui.text.PlatformStringDelegate
    public String capitalize(String s, PlatformLocale platformLocale0) {
        Intrinsics.checkNotNullParameter(s, "string");
        Intrinsics.checkNotNullParameter(platformLocale0, "locale");
        if(s.length() > 0) {
            int v = s.charAt(0);
            String s1 = s.substring(1);
            Intrinsics.checkNotNullExpressionValue(s1, "(this as java.lang.String).substring(startIndex)");
            return (Character.isLowerCase(((char)v)) ? CharsKt.titlecase(((char)v), ((AndroidLocale)platformLocale0).getJavaLocale()) : String.valueOf(((char)v))).toString() + s1;
        }
        return s;
    }

    @Override  // androidx.compose.ui.text.PlatformStringDelegate
    public String decapitalize(String s, PlatformLocale platformLocale0) {
        Intrinsics.checkNotNullParameter(s, "string");
        Intrinsics.checkNotNullParameter(platformLocale0, "locale");
        if(s.length() > 0) {
            String s1 = s.substring(1);
            Intrinsics.checkNotNullExpressionValue(s1, "(this as java.lang.String).substring(startIndex)");
            return CharsKt.lowercase(s.charAt(0), ((AndroidLocale)platformLocale0).getJavaLocale()).toString() + s1;
        }
        return s;
    }

    @Override  // androidx.compose.ui.text.PlatformStringDelegate
    public String toLowerCase(String s, PlatformLocale platformLocale0) {
        Intrinsics.checkNotNullParameter(s, "string");
        Intrinsics.checkNotNullParameter(platformLocale0, "locale");
        String s1 = s.toLowerCase(((AndroidLocale)platformLocale0).getJavaLocale());
        Intrinsics.checkNotNullExpressionValue(s1, "(this as java.lang.String).toLowerCase(locale)");
        return s1;
    }

    @Override  // androidx.compose.ui.text.PlatformStringDelegate
    public String toUpperCase(String s, PlatformLocale platformLocale0) {
        Intrinsics.checkNotNullParameter(s, "string");
        Intrinsics.checkNotNullParameter(platformLocale0, "locale");
        String s1 = s.toUpperCase(((AndroidLocale)platformLocale0).getJavaLocale());
        Intrinsics.checkNotNullExpressionValue(s1, "(this as java.lang.String).toUpperCase(locale)");
        return s1;
    }
}

