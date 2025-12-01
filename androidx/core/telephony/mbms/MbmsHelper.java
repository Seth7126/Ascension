package androidx.core.telephony.mbms;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.LocaleList;
import android.telephony.mbms.ServiceInfo;
import java.util.Locale;

public final class MbmsHelper {
    public static CharSequence getBestNameForService(Context context0, ServiceInfo serviceInfo0) {
        if(Build.VERSION.SDK_INT < 28) {
            return null;
        }
        LocaleList localeList0 = context0.getResources().getConfiguration().getLocales();
        int v = serviceInfo0.getNamedContentLocales().size();
        if(v == 0) {
            return null;
        }
        String[] arr_s = new String[v];
        int v1 = 0;
        for(Object object0: serviceInfo0.getNamedContentLocales()) {
            arr_s[v1] = ((Locale)object0).toLanguageTag();
            ++v1;
        }
        Locale locale0 = localeList0.getFirstMatch(arr_s);
        return locale0 == null ? null : serviceInfo0.getNameForLocale(locale0);
    }
}

