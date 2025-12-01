package androidx.compose.ui.text.intl;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000F\u001A\u00020\bH\u0016R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001A\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\t\u0010\nR\u0014\u0010\u000B\u001A\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\f\u0010\nR\u0014\u0010\r\u001A\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u000E\u0010\n¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/intl/AndroidLocale;", "Landroidx/compose/ui/text/intl/PlatformLocale;", "javaLocale", "Ljava/util/Locale;", "(Ljava/util/Locale;)V", "getJavaLocale", "()Ljava/util/Locale;", "language", "", "getLanguage", "()Ljava/lang/String;", "region", "getRegion", "script", "getScript", "toLanguageTag", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class AndroidLocale implements PlatformLocale {
    private final Locale javaLocale;

    public AndroidLocale(Locale locale0) {
        Intrinsics.checkNotNullParameter(locale0, "javaLocale");
        super();
        this.javaLocale = locale0;
    }

    public final Locale getJavaLocale() {
        return this.javaLocale;
    }

    @Override  // androidx.compose.ui.text.intl.PlatformLocale
    public String getLanguage() {
        String s = this.javaLocale.getLanguage();
        Intrinsics.checkNotNullExpressionValue(s, "javaLocale.language");
        return s;
    }

    @Override  // androidx.compose.ui.text.intl.PlatformLocale
    public String getRegion() {
        String s = this.javaLocale.getCountry();
        Intrinsics.checkNotNullExpressionValue(s, "javaLocale.country");
        return s;
    }

    @Override  // androidx.compose.ui.text.intl.PlatformLocale
    public String getScript() {
        String s = this.javaLocale.getScript();
        Intrinsics.checkNotNullExpressionValue(s, "javaLocale.script");
        return s;
    }

    @Override  // androidx.compose.ui.text.intl.PlatformLocale
    public String toLanguageTag() {
        String s = this.javaLocale.toLanguageTag();
        Intrinsics.checkNotNullExpressionValue(s, "javaLocale.toLanguageTag()");
        return s;
    }
}

