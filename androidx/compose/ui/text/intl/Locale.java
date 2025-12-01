package androidx.compose.ui.text.intl;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000F\b\u0016\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000F\b\u0000\u0012\u0006\u0010\u0005\u001A\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\u0011\u001A\u00020\u00122\b\u0010\u0013\u001A\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0014\u001A\u00020\u0015H\u0016J\u0006\u0010\u0016\u001A\u00020\u0003J\b\u0010\u0017\u001A\u00020\u0003H\u0016R\u0011\u0010\b\u001A\u00020\u00038F¢\u0006\u0006\u001A\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001A\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\r\u001A\u00020\u00038F¢\u0006\u0006\u001A\u0004\b\u000E\u0010\nR\u0011\u0010\u000F\u001A\u00020\u00038F¢\u0006\u0006\u001A\u0004\b\u0010\u0010\n¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/text/intl/Locale;", "", "languageTag", "", "(Ljava/lang/String;)V", "platformLocale", "Landroidx/compose/ui/text/intl/PlatformLocale;", "(Landroidx/compose/ui/text/intl/PlatformLocale;)V", "language", "getLanguage", "()Ljava/lang/String;", "getPlatformLocale$ui_text_release", "()Landroidx/compose/ui/text/intl/PlatformLocale;", "region", "getRegion", "script", "getScript", "equals", "", "other", "hashCode", "", "toLanguageTag", "toString", "Companion", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class Locale {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001A\u00020\u00048F¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/intl/Locale$Companion;", "", "()V", "current", "Landroidx/compose/ui/text/intl/Locale;", "getCurrent", "()Landroidx/compose/ui/text/intl/Locale;", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final Locale getCurrent() {
            return new Locale(((PlatformLocale)PlatformLocaleKt.getPlatformLocaleDelegate().getCurrent().get(0)));
        }
    }

    public static final Companion Companion;
    private final PlatformLocale platformLocale;

    static {
        Locale.Companion = new Companion(null);
    }

    public Locale(PlatformLocale platformLocale0) {
        Intrinsics.checkNotNullParameter(platformLocale0, "platformLocale");
        super();
        this.platformLocale = platformLocale0;
    }

    public Locale(String s) {
        Intrinsics.checkNotNullParameter(s, "languageTag");
        this(PlatformLocaleKt.getPlatformLocaleDelegate().parseLanguageTag(s));
    }

    @Override
    public boolean equals(Object object0) {
        if(!(object0 instanceof Locale)) {
            return false;
        }
        return this == object0 ? true : Intrinsics.areEqual(this.toLanguageTag(), ((Locale)object0).toLanguageTag());
    }

    public final String getLanguage() {
        return this.platformLocale.getLanguage();
    }

    public final PlatformLocale getPlatformLocale$ui_text_release() {
        return this.platformLocale;
    }

    public final String getRegion() {
        return this.platformLocale.getRegion();
    }

    public final String getScript() {
        return this.platformLocale.getScript();
    }

    @Override
    public int hashCode() {
        return this.toLanguageTag().hashCode();
    }

    public final String toLanguageTag() {
        return this.platformLocale.toLanguageTag();
    }

    @Override
    public String toString() {
        return this.toLanguageTag();
    }
}

