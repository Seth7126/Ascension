package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\u0010\u0000\u001A\u00020\u0001\"\u0014\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u000E\u0010\u0005\u001A\n \u0006*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"<anonymous>", "", "T", "Lkotlin/text/FlagEnum;", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Enum;)Z", "kotlin/text/RegexKt$fromInt$1$1"}, k = 3, mv = {1, 5, 1})
public final class Regex.fromInt..inlined.apply.lambda.1 extends Lambda implements Function1 {
    final int $value$inlined;

    public Regex.fromInt..inlined.apply.lambda.1(int v) {
        this.$value$inlined = v;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return Boolean.valueOf(this.invoke(((Enum)object0)));
    }

    public final boolean invoke(Enum enum0) {
        int v = ((FlagEnum)enum0).getMask();
        int v1 = ((FlagEnum)enum0).getValue();
        return (this.$value$inlined & v) == v1;
    }
}

