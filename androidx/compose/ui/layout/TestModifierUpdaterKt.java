package androidx.compose.ui.layout;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A!\u0010\u0000\u001A\u00020\u00012\u0012\u0010\u0002\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"TestModifierUpdaterLayout", "", "onAttached", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/TestModifierUpdater;", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class TestModifierUpdaterKt {
    @Deprecated(level = DeprecationLevel.ERROR, message = "It is a test API, do not use it in the real applications")
    public static final void TestModifierUpdaterLayout(Function1 function10, Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(function10, "onAttached");
        Composer composer1 = composer0.startRestartGroup(0x97C609C8);
        ComposerKt.sourceInformation(composer1, "C(TestModifierUpdaterLayout)49@1621L237:TestModifierUpdater.kt#80mrfh");
        if((((v & 14) == 0 ? (composer1.changed(function10) ? 4 : 2) | v : v) & 11 ^ 2) != 0 || !composer1.getSkipping()) {
            MeasurePolicy measurePolicy0 = androidx.compose.ui.layout.TestModifierUpdaterKt.TestModifierUpdaterLayout.measurePolicy.1.INSTANCE;
            Function0 function00 = LayoutNode.Companion.getConstructor$ui_release();
            composer1.startReplaceableGroup(-2103251527);
            ComposerKt.sourceInformation(composer1, "C(ComposeNode):Composables.kt#9igjgp");
            if(!(composer1.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer1.startNode();
            if(composer1.getInserting()) {
                composer1.createNode(new Function0(function00) {
                    final Function0 $factory;

                    {
                        this.$factory = function00;
                        super(0);
                    }

                    @Override  // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return this.$factory.invoke();
                    }
                });
            }
            else {
                composer1.useNode();
            }
            Composer composer2 = Updater.constructor-impl(composer1);
            Updater.set-impl(composer2, measurePolicy0, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.init-impl(composer2, new Function1(function10) {
                final Function1 $onAttached;

                {
                    this.$onAttached = function10;
                    super(1);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.invoke(((LayoutNode)object0));
                    return Unit.INSTANCE;
                }

                public final void invoke(LayoutNode layoutNode0) {
                    Intrinsics.checkNotNullParameter(layoutNode0, "$this$init");
                    TestModifierUpdater testModifierUpdater0 = new TestModifierUpdater(layoutNode0);
                    this.$onAttached.invoke(testModifierUpdater0);
                }
            });
            composer1.endNode();
            composer1.endReplaceableGroup();
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new Function2(function10, v) {
                final int $$changed;
                final Function1 $onAttached;

                {
                    this.$onAttached = function10;
                    this.$$changed = v;
                    super(2);
                }

                @Override  // kotlin.jvm.functions.Function2
                public Object invoke(Object object0, Object object1) {
                    this.invoke(((Composer)object0), ((Number)object1).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer0, int v) {
                    TestModifierUpdaterKt.TestModifierUpdaterLayout(this.$onAttached, composer0, this.$$changed | 1);
                }
            });
        }

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
        final class androidx.compose.ui.layout.TestModifierUpdaterKt.TestModifierUpdaterLayout.measurePolicy.1 implements MeasurePolicy {
            public static final androidx.compose.ui.layout.TestModifierUpdaterKt.TestModifierUpdaterLayout.measurePolicy.1 INSTANCE;

            static {
                androidx.compose.ui.layout.TestModifierUpdaterKt.TestModifierUpdaterLayout.measurePolicy.1.INSTANCE = new androidx.compose.ui.layout.TestModifierUpdaterKt.TestModifierUpdaterLayout.measurePolicy.1();
            }

            androidx.compose.ui.layout.TestModifierUpdaterKt.TestModifierUpdaterLayout.measurePolicy.1() {
                super();
            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
                return DefaultImpls.maxIntrinsicHeight(this, intrinsicMeasureScope0, list0, v);
            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
                return DefaultImpls.maxIntrinsicWidth(this, intrinsicMeasureScope0, list0, v);
            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, List list0, long v) {
                Intrinsics.checkNotNullParameter(measureScope0, "$this$MeasurePolicy");
                Intrinsics.checkNotNullParameter(list0, "$noName_0");
                return androidx.compose.ui.layout.MeasureScope.DefaultImpls.layout$default(measureScope0, Constraints.getMaxWidth-impl(v), Constraints.getMaxHeight-impl(v), null, androidx.compose.ui.layout.TestModifierUpdaterKt.TestModifierUpdaterLayout.measurePolicy.1.measure.1.INSTANCE, 4, null);

                @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
                final class androidx.compose.ui.layout.TestModifierUpdaterKt.TestModifierUpdaterLayout.measurePolicy.1.measure.1 extends Lambda implements Function1 {
                    public static final androidx.compose.ui.layout.TestModifierUpdaterKt.TestModifierUpdaterLayout.measurePolicy.1.measure.1 INSTANCE;

                    static {
                        androidx.compose.ui.layout.TestModifierUpdaterKt.TestModifierUpdaterLayout.measurePolicy.1.measure.1.INSTANCE = new androidx.compose.ui.layout.TestModifierUpdaterKt.TestModifierUpdaterLayout.measurePolicy.1.measure.1();
                    }

                    androidx.compose.ui.layout.TestModifierUpdaterKt.TestModifierUpdaterLayout.measurePolicy.1.measure.1() {
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

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
                return DefaultImpls.minIntrinsicHeight(this, intrinsicMeasureScope0, list0, v);
            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
                return DefaultImpls.minIntrinsicWidth(this, intrinsicMeasureScope0, list0, v);
            }
        }

    }
}

