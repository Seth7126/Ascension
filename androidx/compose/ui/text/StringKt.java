package androidx.compose.ui.text;

import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.intl.PlatformLocale;
import androidx.compose.ui.text.platform.AndroidStringDelegate_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001C\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A\u0012\u0010\u0002\u001A\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005\u001A\u0012\u0010\u0002\u001A\u00020\u0003*\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u0007\u001A\u0012\u0010\b\u001A\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005\u001A\u0012\u0010\b\u001A\u00020\u0003*\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u0007\u001A\u0012\u0010\t\u001A\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005\u001A\u0012\u0010\t\u001A\u00020\u0003*\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u0007\u001A\u0012\u0010\n\u001A\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005\u001A\u0012\u0010\n\u001A\u00020\u0003*\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u0007\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000B"}, d2 = {"stringDelegate", "Landroidx/compose/ui/text/PlatformStringDelegate;", "capitalize", "", "locale", "Landroidx/compose/ui/text/intl/Locale;", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "decapitalize", "toLowerCase", "toUpperCase", "ui-text_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class StringKt {
    private static final PlatformStringDelegate stringDelegate;

    static {
        StringKt.stringDelegate = AndroidStringDelegate_androidKt.ActualStringDelegate();
    }

    public static final String capitalize(String s, Locale locale0) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(locale0, "locale");
        return StringKt.stringDelegate.capitalize(s, locale0.getPlatformLocale$ui_text_release());
    }

    public static final String capitalize(String s, LocaleList localeList0) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(localeList0, "localeList");
        return localeList0.isEmpty() ? StringKt.capitalize(s, Locale.Companion.getCurrent()) : StringKt.capitalize(s, localeList0.get(0));
    }

    public static final String decapitalize(String s, Locale locale0) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(locale0, "locale");
        PlatformLocale platformLocale0 = locale0.getPlatformLocale$ui_text_release();
        return StringKt.stringDelegate.decapitalize(s, platformLocale0);
    }

    public static final String decapitalize(String s, LocaleList localeList0) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(localeList0, "localeList");
        return localeList0.isEmpty() ? StringKt.decapitalize(s, Locale.Companion.getCurrent()) : StringKt.decapitalize(s, localeList0.get(0));
    }

    public static final String toLowerCase(String s, Locale locale0) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(locale0, "locale");
        return StringKt.stringDelegate.toLowerCase(s, locale0.getPlatformLocale$ui_text_release());
    }

    public static final String toLowerCase(String s, LocaleList localeList0) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(localeList0, "localeList");
        return localeList0.isEmpty() ? StringKt.toLowerCase(s, Locale.Companion.getCurrent()) : StringKt.toLowerCase(s, localeList0.get(0));
    }

    public static final String toUpperCase(String s, Locale locale0) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(locale0, "locale");
        return StringKt.stringDelegate.toUpperCase(s, locale0.getPlatformLocale$ui_text_release());
    }

    public static final String toUpperCase(String s, LocaleList localeList0) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(localeList0, "localeList");
        return localeList0.isEmpty() ? StringKt.toUpperCase(s, Locale.Companion.getCurrent()) : StringKt.toUpperCase(s, localeList0.get(0));
    }
}

