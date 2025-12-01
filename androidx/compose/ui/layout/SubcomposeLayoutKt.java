package androidx.compose.ui.layout;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A9\u0010\u0000\u001A\u00020\u00012\b\b\u0002\u0010\u0002\u001A\u00020\u00032\u001D\u0010\u0004\u001A\u0019\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\b\tH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\n\u001AA\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u000B\u001A\u00020\f2\b\b\u0002\u0010\u0002\u001A\u00020\u00032\u001D\u0010\u0004\u001A\u0019\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\b\tH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000E"}, d2 = {"SubcomposeLayout", "", "modifier", "Landroidx/compose/ui/Modifier;", "measurePolicy", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "state", "Landroidx/compose/ui/layout/SubcomposeLayoutState;", "(Landroidx/compose/ui/layout/SubcomposeLayoutState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class SubcomposeLayoutKt {
    public static final void SubcomposeLayout(Modifier modifier0, Function2 function20, Composer composer0, int v, int v1) {
        int v2;
        Intrinsics.checkNotNullParameter(function20, "measurePolicy");
        Composer composer1 = composer0.startRestartGroup(0xDBC4EAF6);
        ComposerKt.sourceInformation(composer1, "C(SubcomposeLayout)P(1)63@2793L36,62@2759L144:SubcomposeLayout.kt#80mrfh");
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(function20) ? 0x20 : 16);
        }
        if((v2 & 91 ^ 18) != 0 || !composer1.getSkipping()) {
            if((v1 & 1) != 0) {
                modifier0 = Modifier.Companion;
            }
            composer1.startReplaceableGroup(0xFFC7BCB7);
            ComposerKt.sourceInformation(composer1, "C(remember):Composables.kt#9igjgp");
            SubcomposeLayoutState subcomposeLayoutState0 = composer1.rememberedValue();
            if(subcomposeLayoutState0 == Composer.Companion.getEmpty()) {
                subcomposeLayoutState0 = new SubcomposeLayoutState();
                composer1.updateRememberedValue(subcomposeLayoutState0);
            }
            composer1.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(subcomposeLayoutState0, modifier0, function20, composer1, v2 << 3 & 0x70 | 8 | v2 << 3 & 0x380, 0);
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new Function2(modifier0, function20, v, v1) {
                final int $$changed;
                final int $$default;
                final Function2 $measurePolicy;
                final Modifier $modifier;

                {
                    this.$modifier = modifier0;
                    this.$measurePolicy = function20;
                    this.$$changed = v;
                    this.$$default = v1;
                    super(2);
                }

                @Override  // kotlin.jvm.functions.Function2
                public Object invoke(Object object0, Object object1) {
                    this.invoke(((Composer)object0), ((Number)object1).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer0, int v) {
                    SubcomposeLayoutKt.SubcomposeLayout(this.$modifier, this.$measurePolicy, composer0, this.$$changed | 1, this.$$default);
                }
            });
        }
    }

    public static final void SubcomposeLayout(SubcomposeLayoutState subcomposeLayoutState0, Modifier modifier0, Function2 function20, Composer composer0, int v, int v1) {
        Intrinsics.checkNotNullParameter(subcomposeLayoutState0, "state");
        Intrinsics.checkNotNullParameter(function20, "measurePolicy");
        Composer composer1 = composer0.startRestartGroup(0xDBC4F081);
        ComposerKt.sourceInformation(composer1, "C(SubcomposeLayout)P(2,1)95@4239L28,96@4272L101,103@4467L7,104@4522L7,105@4534L377:SubcomposeLayout.kt#80mrfh");
        if((v1 & 2) != 0) {
            modifier0 = Modifier.Companion;
        }
        subcomposeLayoutState0.setCompositionContext$ui_release(ComposablesKt.rememberCompositionContext(composer1, 0));
        EffectsKt.DisposableEffect(subcomposeLayoutState0, new Function1(subcomposeLayoutState0) {
            final SubcomposeLayoutState $state;

            {
                this.$state = subcomposeLayoutState0;
                super(1);
            }

            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope0) {
                Intrinsics.checkNotNullParameter(disposableEffectScope0, "$this$DisposableEffect");
                return new DisposableEffectResult() {
                    @Override  // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        this.$state$inlined.disposeCurrentNodes$ui_release();
                    }
                };
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((DisposableEffectScope)object0));
            }
        }, composer1, 8);
        Modifier modifier1 = ComposedModifierKt.materialize(composer1, modifier0);
        ComposerKt.sourceInformationMarkerStart(composer1, 103361330, "C:CompositionLocal.kt#9igjgp");
        Object object0 = composer1.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(composer1);
        ComposerKt.sourceInformationMarkerStart(composer1, 103361330, "C:CompositionLocal.kt#9igjgp");
        Object object1 = composer1.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ComposerKt.sourceInformationMarkerEnd(composer1);
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
        Updater.init-impl(composer2, subcomposeLayoutState0.getSetRoot$ui_release());
        Updater.set-impl(composer2, modifier1, ComposeUiNode.Companion.getSetModifier());
        Updater.set-impl(composer2, function20, subcomposeLayoutState0.getSetMeasurePolicy$ui_release());
        Updater.set-impl(composer2, ((Density)object0), ComposeUiNode.Companion.getSetDensity());
        Updater.set-impl(composer2, ((LayoutDirection)object1), ComposeUiNode.Companion.getSetLayoutDirection());
        composer1.endNode();
        composer1.endReplaceableGroup();
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new Function2(subcomposeLayoutState0, modifier0, function20, v, v1) {
                final int $$changed;
                final int $$default;
                final Function2 $measurePolicy;
                final Modifier $modifier;
                final SubcomposeLayoutState $state;

                {
                    this.$state = subcomposeLayoutState0;
                    this.$modifier = modifier0;
                    this.$measurePolicy = function20;
                    this.$$changed = v;
                    this.$$default = v1;
                    super(2);
                }

                @Override  // kotlin.jvm.functions.Function2
                public Object invoke(Object object0, Object object1) {
                    this.invoke(((Composer)object0), ((Number)object1).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer0, int v) {
                    SubcomposeLayoutKt.SubcomposeLayout(this.$state, this.$modifier, this.$measurePolicy, composer0, this.$$changed | 1, this.$$default);
                }
            });
        }
    }
}

