package androidx.compose.ui.semantics;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012\u001E\b\u0002\u0010\u0005\u001A\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0006¢\u0006\u0002\u0010\u0007J\"\u0010\f\u001A\u00028\u00002\u0006\u0010\r\u001A\u00020\u000E2\n\u0010\u000F\u001A\u0006\u0012\u0002\b\u00030\u0010H\u0086\u0002¢\u0006\u0002\u0010\u0011J\u001F\u0010\u0012\u001A\u0004\u0018\u00018\u00002\b\u0010\u0013\u001A\u0004\u0018\u00018\u00002\u0006\u0010\u0014\u001A\u00028\u0000¢\u0006\u0002\u0010\u0015J*\u0010\u0016\u001A\u00020\u00172\u0006\u0010\r\u001A\u00020\u000E2\n\u0010\u000F\u001A\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u0018\u001A\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010\u0019J\b\u0010\u001A\u001A\u00020\u0004H\u0016R*\u0010\u0005\u001A\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001A\u00020\u0004¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000B¨\u0006\u001B"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "T", "", "name", "", "mergePolicy", "Lkotlin/Function2;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "getMergePolicy$ui_release", "()Lkotlin/jvm/functions/Function2;", "getName", "()Ljava/lang/String;", "getValue", "thisRef", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "property", "Lkotlin/reflect/KProperty;", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "merge", "parentValue", "childValue", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "setValue", "", "value", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "toString", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class SemanticsPropertyKey {
    public static final int $stable;
    private final Function2 mergePolicy;
    private final String name;

    static {
    }

    public SemanticsPropertyKey(String s, Function2 function20) {
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(function20, "mergePolicy");
        super();
        this.name = s;
        this.mergePolicy = function20;
    }

    public SemanticsPropertyKey(String s, Function2 function20, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            function20 = androidx.compose.ui.semantics.SemanticsPropertyKey.1.INSTANCE;
        }
        this(s, function20);

        @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0003\u001A\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00002\b\u0010\u0001\u001A\u0004\u0018\u00018\u00002\u0006\u0010\u0002\u001A\u00028\u0000H\n"}, d2 = {"T", "parentValue", "childValue", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        final class androidx.compose.ui.semantics.SemanticsPropertyKey.1 extends Lambda implements Function2 {
            public static final androidx.compose.ui.semantics.SemanticsPropertyKey.1 INSTANCE;

            static {
                androidx.compose.ui.semantics.SemanticsPropertyKey.1.INSTANCE = new androidx.compose.ui.semantics.SemanticsPropertyKey.1();
            }

            androidx.compose.ui.semantics.SemanticsPropertyKey.1() {
                super(2);
            }

            @Override  // kotlin.jvm.functions.Function2
            public final Object invoke(Object object0, Object object1) {
                return object0 == null ? object1 : object0;
            }
        }

    }

    public final Function2 getMergePolicy$ui_release() {
        return this.mergePolicy;
    }

    public final String getName() {
        return this.name;
    }

    public final Object getValue(SemanticsPropertyReceiver semanticsPropertyReceiver0, KProperty kProperty0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "thisRef");
        Intrinsics.checkNotNullParameter(kProperty0, "property");
        return SemanticsPropertiesKt.throwSemanticsGetNotSupported();
    }

    public final Object merge(Object object0, Object object1) {
        return this.mergePolicy.invoke(object0, object1);
    }

    public final void setValue(SemanticsPropertyReceiver semanticsPropertyReceiver0, KProperty kProperty0, Object object0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "thisRef");
        Intrinsics.checkNotNullParameter(kProperty0, "property");
        semanticsPropertyReceiver0.set(this, object0);
    }

    @Override
    public String toString() {
        return "SemanticsPropertyKey: " + this.name;
    }
}

