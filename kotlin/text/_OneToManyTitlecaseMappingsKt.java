package kotlin.text;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000E\n\u0002\u0010\f\n\u0000\u001A\f\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"titlecaseImpl", "", "", "kotlin-stdlib"}, k = 2, mv = {1, 5, 1})
public final class _OneToManyTitlecaseMappingsKt {
    public static final String titlecaseImpl(char c) {
        String s = String.valueOf(c);
        if(s == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String s1 = s.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(s1, "(this as java.lang.Strin….toUpperCase(Locale.ROOT)");
        if(s1.length() > 1) {
            if(c != 329) {
                int v = s1.charAt(0);
                String s2 = s1.substring(1);
                Intrinsics.checkNotNullExpressionValue(s2, "(this as java.lang.String).substring(startIndex)");
                if(s2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String s3 = s2.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(s3, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                return ((char)v) + s3;
            }
            return s1;
        }
        return String.valueOf(Character.toTitleCase(c));
    }
}

