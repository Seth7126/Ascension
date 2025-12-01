package androidx.compose.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001AH\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0019\b\u0002\u0010\u0002\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00062\u001C\u0010\u0007\u001A\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\b¢\u0006\u0002\b\u0006¢\u0006\u0002\u0010\t\u001A\u0012\u0010\n\u001A\u00020\u0001*\u00020\u000B2\u0006\u0010\f\u001A\u00020\u0001¨\u0006\r"}, d2 = {"composed", "Landroidx/compose/ui/Modifier;", "inspectorInfo", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "factory", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;", "materialize", "Landroidx/compose/runtime/Composer;", "modifier", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class ComposedModifierKt {
    public static final Modifier composed(Modifier modifier0, Function1 function10, Function3 function30) {
        Intrinsics.checkNotNullParameter(modifier0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "inspectorInfo");
        Intrinsics.checkNotNullParameter(function30, "factory");
        return modifier0.then(new ComposedModifier(function10, function30));
    }

    public static Modifier composed$default(Modifier modifier0, Function1 function10, Function3 function30, int v, Object object0) {
        if((v & 1) != 0) {
            function10 = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier0, function10, function30);
    }

    public static final Modifier materialize(Composer composer0, Modifier modifier0) {
        Intrinsics.checkNotNullParameter(composer0, "<this>");
        Intrinsics.checkNotNullParameter(modifier0, "modifier");
        if(modifier0.all(androidx.compose.ui.ComposedModifierKt.materialize.1.INSTANCE)) {
            return modifier0;
        }
        composer0.startReplaceableGroup(1219399079);
        Function2 function20 = new Function2(composer0) {
            final Composer $this_materialize;

            {
                this.$this_materialize = composer0;
                super(2);
            }

            public final Modifier invoke(Modifier modifier0, Element modifier$Element0) {
                Intrinsics.checkNotNullParameter(modifier0, "acc");
                Intrinsics.checkNotNullParameter(modifier$Element0, "element");
                if(modifier$Element0 instanceof ComposedModifier) {
                    Modifier modifier1 = (Modifier)((ComposedModifier)modifier$Element0).getFactory().invoke(Modifier.Companion, this.$this_materialize, 0);
                    return modifier0.then(ComposedModifierKt.materialize(this.$this_materialize, modifier1));
                }
                return modifier0.then(modifier$Element0);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((Modifier)object0), ((Element)object1));
            }
        };
        Modifier modifier1 = (Modifier)modifier0.foldIn(Modifier.Companion, function20);
        composer0.endReplaceableGroup();
        return modifier1;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\n"}, d2 = {"Landroidx/compose/ui/Modifier$Element;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        final class androidx.compose.ui.ComposedModifierKt.materialize.1 extends Lambda implements Function1 {
            public static final androidx.compose.ui.ComposedModifierKt.materialize.1 INSTANCE;

            static {
                androidx.compose.ui.ComposedModifierKt.materialize.1.INSTANCE = new androidx.compose.ui.ComposedModifierKt.materialize.1();
            }

            androidx.compose.ui.ComposedModifierKt.materialize.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return Boolean.valueOf(this.invoke(((Element)object0)));
            }

            public final boolean invoke(Element modifier$Element0) {
                Intrinsics.checkNotNullParameter(modifier$Element0, "it");
                return !(modifier$Element0 instanceof ComposedModifier);
            }
        }

    }
}

