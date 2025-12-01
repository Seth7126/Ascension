package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode.NoIntrinsicsMeasurePolicy;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J/\u0010\u0003\u001A\u00020\u0004*\u00020\u00052\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001A\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000B\u0010\f\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\r"}, d2 = {"Landroidx/compose/ui/layout/RootMeasurePolicy;", "Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "()V", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class RootMeasurePolicy extends NoIntrinsicsMeasurePolicy {
    public static final RootMeasurePolicy INSTANCE;

    static {
        RootMeasurePolicy.INSTANCE = new RootMeasurePolicy();
    }

    private RootMeasurePolicy() {
        super("Undefined intrinsics block and it is required");
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public MeasureResult measure-3p2s80s(MeasureScope measureScope0, List list0, long v) {
        Intrinsics.checkNotNullParameter(measureScope0, "$receiver");
        Intrinsics.checkNotNullParameter(list0, "measurables");
        if(list0.isEmpty()) {
            return DefaultImpls.layout$default(measureScope0, Constraints.getMinWidth-impl(v), Constraints.getMinHeight-impl(v), null, androidx.compose.ui.layout.RootMeasurePolicy.measure.1.INSTANCE, 4, null);
        }
        if(list0.size() == 1) {
            Placeable placeable0 = ((Measurable)list0.get(0)).measure-BRTryo0(v);
            return DefaultImpls.layout$default(measureScope0, ConstraintsKt.constrainWidth-K40F9xA(v, placeable0.getWidth()), ConstraintsKt.constrainHeight-K40F9xA(v, placeable0.getHeight()), null, new Function1() {
                final Placeable $placeable;

                {
                    this.$placeable = placeable0;
                    super(1);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.invoke(((PlacementScope)object0));
                    return Unit.INSTANCE;
                }

                public final void invoke(PlacementScope placeable$PlacementScope0) {
                    Intrinsics.checkNotNullParameter(placeable$PlacementScope0, "$this$layout");
                    PlacementScope.placeRelativeWithLayer$default(placeable$PlacementScope0, this.$placeable, 0, 0, 0.0f, null, 12, null);
                }
            }, 4, null);
        }
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v2 = list0.size();
        if(v2 - 1 >= 0) {
            for(int v3 = 0; true; ++v3) {
                arrayList0.add(((Measurable)list0.get(v3)).measure-BRTryo0(v));
                if(v3 + 1 > v2 - 1) {
                    break;
                }
            }
        }
        int v4 = arrayList0.size();
        if(v4 - 1 >= 0) {
            int v5 = 0;
            int v6 = 0;
            for(int v1 = 0; true; ++v1) {
                Placeable placeable1 = (Placeable)arrayList0.get(v1);
                v5 = Math.max(placeable1.getWidth(), v5);
                v6 = Math.max(placeable1.getHeight(), v6);
                if(v1 + 1 > v4 - 1) {
                    break;
                }
            }
            return DefaultImpls.layout$default(measureScope0, ConstraintsKt.constrainWidth-K40F9xA(v, v5), ConstraintsKt.constrainHeight-K40F9xA(v, v6), null, new Function1() {
                final List $placeables;

                {
                    this.$placeables = list0;
                    super(1);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.invoke(((PlacementScope)object0));
                    return Unit.INSTANCE;
                }

                public final void invoke(PlacementScope placeable$PlacementScope0) {
                    Intrinsics.checkNotNullParameter(placeable$PlacementScope0, "$this$layout");
                    List list0 = this.$placeables;
                    int v = list0.size();
                    if(v - 1 >= 0) {
                        for(int v1 = 0; true; ++v1) {
                            PlacementScope.placeRelativeWithLayer$default(placeable$PlacementScope0, ((Placeable)list0.get(v1)), 0, 0, 0.0f, null, 12, null);
                            if(v1 + 1 > v - 1) {
                                break;
                            }
                        }
                    }
                }
            }, 4, null);
        }
        return DefaultImpls.layout$default(measureScope0, ConstraintsKt.constrainWidth-K40F9xA(v, 0), ConstraintsKt.constrainHeight-K40F9xA(v, 0), null, new Function1() {
            final List $placeables;

            {
                this.$placeables = list0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((PlacementScope)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(PlacementScope placeable$PlacementScope0) {
                Intrinsics.checkNotNullParameter(placeable$PlacementScope0, "$this$layout");
                List list0 = this.$placeables;
                int v = list0.size();
                if(v - 1 >= 0) {
                    for(int v1 = 0; true; ++v1) {
                        PlacementScope.placeRelativeWithLayer$default(placeable$PlacementScope0, ((Placeable)list0.get(v1)), 0, 0, 0.0f, null, 12, null);
                        if(v1 + 1 > v - 1) {
                            break;
                        }
                    }
                }
            }
        }, 4, null);

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001A\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        final class androidx.compose.ui.layout.RootMeasurePolicy.measure.1 extends Lambda implements Function1 {
            public static final androidx.compose.ui.layout.RootMeasurePolicy.measure.1 INSTANCE;

            static {
                androidx.compose.ui.layout.RootMeasurePolicy.measure.1.INSTANCE = new androidx.compose.ui.layout.RootMeasurePolicy.measure.1();
            }

            androidx.compose.ui.layout.RootMeasurePolicy.measure.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((PlacementScope)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(PlacementScope placeable$PlacementScope0) {
                Intrinsics.checkNotNullParameter(placeable$PlacementScope0, "$this$layout");
            }
        }

    }
}

