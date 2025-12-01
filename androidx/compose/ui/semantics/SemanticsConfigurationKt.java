package androidx.compose.ui.semantics;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A%\u0010\u0000\u001A\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u0002H\u00010\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"getOrNull", "T", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "key", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "(Landroidx/compose/ui/semantics/SemanticsConfiguration;Landroidx/compose/ui/semantics/SemanticsPropertyKey;)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class SemanticsConfigurationKt {
    public static final Object getOrNull(SemanticsConfiguration semanticsConfiguration0, SemanticsPropertyKey semanticsPropertyKey0) {
        Intrinsics.checkNotNullParameter(semanticsConfiguration0, "<this>");
        Intrinsics.checkNotNullParameter(semanticsPropertyKey0, "key");
        return semanticsConfiguration0.getOrElseNullable(semanticsPropertyKey0, androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull.1.INSTANCE);

        @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0001\u001A\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {"T", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        final class androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull.1 extends Lambda implements Function0 {
            public static final androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull.1 INSTANCE;

            static {
                androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull.1.INSTANCE = new androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull.1();
            }

            androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull.1() {
                super(0);
            }

            @Override  // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return null;
            }
        }

    }
}

