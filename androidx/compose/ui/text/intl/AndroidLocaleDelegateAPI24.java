package androidx.compose.ui.text.intl;

import android.os.LocaleList;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001A\u00020\u00052\u0006\u0010\t\u001A\u00020\nH\u0016R\u001A\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00050\u00048VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0006\u0010\u0007¨\u0006\u000B"}, d2 = {"Landroidx/compose/ui/text/intl/AndroidLocaleDelegateAPI24;", "Landroidx/compose/ui/text/intl/PlatformLocaleDelegate;", "()V", "current", "", "Landroidx/compose/ui/text/intl/PlatformLocale;", "getCurrent", "()Ljava/util/List;", "parseLanguageTag", "languageTag", "", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class AndroidLocaleDelegateAPI24 implements PlatformLocaleDelegate {
    @Override  // androidx.compose.ui.text.intl.PlatformLocaleDelegate
    public List getCurrent() {
        LocaleList localeList0 = LocaleList.getDefault();
        Intrinsics.checkNotNullExpressionValue(localeList0, "getDefault()");
        List list0 = new ArrayList();
        int v = localeList0.size();
        if(v > 0) {
            for(int v1 = 0; true; ++v1) {
                Locale locale0 = localeList0.get(v1);
                Intrinsics.checkNotNullExpressionValue(locale0, "localeList[i]");
                list0.add(new AndroidLocale(locale0));
                if(v1 + 1 >= v) {
                    break;
                }
            }
        }
        return list0;
    }

    @Override  // androidx.compose.ui.text.intl.PlatformLocaleDelegate
    public PlatformLocale parseLanguageTag(String s) {
        Intrinsics.checkNotNullParameter(s, "languageTag");
        Locale locale0 = Locale.forLanguageTag(s);
        Intrinsics.checkNotNullExpressionValue(locale0, "forLanguageTag(languageTag)");
        return new AndroidLocale(locale0);
    }
}

