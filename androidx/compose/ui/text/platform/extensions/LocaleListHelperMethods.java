package androidx.compose.ui.text.platform.extensions;

import android.text.style.LocaleSpan;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u0005H\u0007J\u0018\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\u0004\u001A\u00020\u0005H\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/platform/extensions/LocaleListHelperMethods;", "", "()V", "localeSpan", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "setTextLocales", "", "textPaint", "Landroidx/compose/ui/text/platform/AndroidTextPaint;", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class LocaleListHelperMethods {
    public static final LocaleListHelperMethods INSTANCE;

    static {
        LocaleListHelperMethods.INSTANCE = new LocaleListHelperMethods();
    }

    public final Object localeSpan(LocaleList localeList0) {
        Intrinsics.checkNotNullParameter(localeList0, "localeList");
        ArrayList arrayList0 = new ArrayList(CollectionsKt.collectionSizeOrDefault(localeList0, 10));
        for(Object object0: localeList0) {
            arrayList0.add(LocaleExtensions_androidKt.toJavaLocale(((Locale)object0)));
        }
        Object[] arr_object = arrayList0.toArray(new java.util.Locale[0]);
        if(arr_object == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        return new LocaleSpan(new android.os.LocaleList(((java.util.Locale[])Arrays.copyOf(((java.util.Locale[])arr_object), ((java.util.Locale[])arr_object).length))));
    }

    public final void setTextLocales(AndroidTextPaint androidTextPaint0, LocaleList localeList0) {
        Intrinsics.checkNotNullParameter(androidTextPaint0, "textPaint");
        Intrinsics.checkNotNullParameter(localeList0, "localeList");
        ArrayList arrayList0 = new ArrayList(CollectionsKt.collectionSizeOrDefault(localeList0, 10));
        for(Object object0: localeList0) {
            arrayList0.add(LocaleExtensions_androidKt.toJavaLocale(((Locale)object0)));
        }
        Object[] arr_object = arrayList0.toArray(new java.util.Locale[0]);
        if(arr_object == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        androidTextPaint0.setTextLocales(new android.os.LocaleList(((java.util.Locale[])Arrays.copyOf(((java.util.Locale[])arr_object), ((java.util.Locale[])arr_object).length))));
    }
}

