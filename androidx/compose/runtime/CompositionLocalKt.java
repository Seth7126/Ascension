package androidx.compose.runtime;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A<\u0010\u0000\u001A\u00020\u00012\u001A\u0010\u0002\u001A\u000E\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003\"\u0006\u0012\u0002\b\u00030\u00042\u0011\u0010\u0005\u001A\r\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0002\u0010\b\u001A0\u0010\t\u001A\b\u0012\u0004\u0012\u0002H\u000B0\n\"\u0004\b\u0000\u0010\u000B2\u000E\b\u0002\u0010\f\u001A\b\u0012\u0004\u0012\u0002H\u000B0\r2\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u0002H\u000B0\u0006\u001A \u0010\u000F\u001A\b\u0012\u0004\u0012\u0002H\u000B0\n\"\u0004\b\u0000\u0010\u000B2\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u0002H\u000B0\u0006¨\u0006\u0010"}, d2 = {"CompositionLocalProvider", "", "values", "", "Landroidx/compose/runtime/ProvidedValue;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "([Landroidx/compose/runtime/ProvidedValue;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "compositionLocalOf", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "T", "policy", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "defaultFactory", "staticCompositionLocalOf", "runtime_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class CompositionLocalKt {
    public static final void CompositionLocalProvider(ProvidedValue[] arr_providedValue, Function2 function20, Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(arr_providedValue, "values");
        Intrinsics.checkNotNullParameter(function20, "content");
        Composer composer1 = composer0.startRestartGroup(0xA8F06668);
        ComposerKt.sourceInformation(composer1, "C(CompositionLocalProvider)P(1)214@9601L9:CompositionLocal.kt#9igjgp");
        composer1.startProviders(arr_providedValue);
        function20.invoke(composer1, ((int)(v >> 3 & 14)));
        composer1.endProviders();
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new Function2(arr_providedValue, function20, v) {
                final int $$changed;
                final Function2 $content;
                final ProvidedValue[] $values;

                {
                    this.$values = arr_providedValue;
                    this.$content = function20;
                    this.$$changed = v;
                    super(2);
                }

                @Override  // kotlin.jvm.functions.Function2
                public Object invoke(Object object0, Object object1) {
                    this.invoke(((Composer)object0), ((Number)object1).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer0, int v) {
                    CompositionLocalKt.CompositionLocalProvider(((ProvidedValue[])Arrays.copyOf(this.$values, this.$values.length)), this.$content, composer0, this.$$changed | 1);
                }
            });
        }
    }

    public static final ProvidableCompositionLocal compositionLocalOf(SnapshotMutationPolicy snapshotMutationPolicy0, Function0 function00) {
        Intrinsics.checkNotNullParameter(snapshotMutationPolicy0, "policy");
        Intrinsics.checkNotNullParameter(function00, "defaultFactory");
        return new DynamicProvidableCompositionLocal(snapshotMutationPolicy0, function00);
    }

    public static ProvidableCompositionLocal compositionLocalOf$default(SnapshotMutationPolicy snapshotMutationPolicy0, Function0 function00, int v, Object object0) {
        if((v & 1) != 0) {
            snapshotMutationPolicy0 = SnapshotStateKt.structuralEqualityPolicy();
        }
        return CompositionLocalKt.compositionLocalOf(snapshotMutationPolicy0, function00);
    }

    public static final ProvidableCompositionLocal staticCompositionLocalOf(Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "defaultFactory");
        return new StaticProvidableCompositionLocal(function00);
    }
}

