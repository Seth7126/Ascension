package androidx.compose.ui.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.nestedscroll.NestedScrollDelegatingWrapper;
import androidx.compose.ui.node.LayoutNodeWrapper;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001A \u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0003\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u0001H\u0002\u001A\u0014\u0010\u0005\u001A\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001A\u00020\tH\u0002\u001A\u0014\u0010\n\u001A\u00020\u000B*\u00020\u000B2\u0006\u0010\n\u001A\u00020\fH\u0007¨\u0006\r"}, d2 = {"calculateOffset", "", "leadingEdge", "trailingEdge", "parentSize", "bringIntoView", "", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;", "child", "Landroidx/compose/ui/layout/LayoutCoordinates;", "relocationRequester", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/RelocationRequester;", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class RelocationRequesterModifierKt {
    private static final void bringIntoView(NestedScrollDelegatingWrapper nestedScrollDelegatingWrapper0, LayoutCoordinates layoutCoordinates0) {
        Rect rect0 = nestedScrollDelegatingWrapper0.localBoundingBoxOf(layoutCoordinates0, false);
        long v = OffsetKt.Offset(RelocationRequesterModifierKt.calculateOffset(rect0.getLeft(), rect0.getRight(), IntSize.getWidth-impl(nestedScrollDelegatingWrapper0.getSize-YbymL2g())), RelocationRequesterModifierKt.calculateOffset(rect0.getTop(), rect0.getBottom(), IntSize.getHeight-impl(nestedScrollDelegatingWrapper0.getSize-YbymL2g())));
        nestedScrollDelegatingWrapper0.getModifier().getConnection().onPostScroll-DzOQY0M(0L, v, 3);
        LayoutNodeWrapper layoutNodeWrapper0 = nestedScrollDelegatingWrapper0.getWrappedBy$ui_release();
        if(layoutNodeWrapper0 != null) {
            NestedScrollDelegatingWrapper nestedScrollDelegatingWrapper1 = layoutNodeWrapper0.findPreviousNestedScrollWrapper();
            if(nestedScrollDelegatingWrapper1 != null) {
                RelocationRequesterModifierKt.bringIntoView(nestedScrollDelegatingWrapper1, layoutCoordinates0);
            }
        }
    }

    private static final float calculateOffset(float f, float f1, float f2) {
        if((f < 0.0f || f1 > f2) && (f >= 0.0f || f1 <= f2)) {
            return Math.abs(f) < Math.abs(f1 - f2) ? -f : f2 - f1;
        }
        return 0.0f;
    }

    @ExperimentalComposeUiApi
    public static final Modifier relocationRequester(Modifier modifier0, RelocationRequester relocationRequester0) {
        Intrinsics.checkNotNullParameter(modifier0, "<this>");
        Intrinsics.checkNotNullParameter(relocationRequester0, "relocationRequester");
        return ComposedModifierKt.composed(modifier0, InspectableValueKt.getNoInspectorInfo(), new Function3(relocationRequester0) {
            final RelocationRequester $relocationRequester;

            {
                this.$relocationRequester = relocationRequester0;
                super(3);
            }

            public final Modifier invoke(Modifier modifier0, Composer composer0, int v) {
                Intrinsics.checkNotNullParameter(modifier0, "$this$composed");
                composer0.startReplaceableGroup(0x5A85B5D6);
                ComposerKt.sourceInformation(composer0, "C70@3027L42,71@3074L159:RelocationRequesterModifier.kt#80mrfh");
                composer0.startReplaceableGroup(0xFFC7BCB7);
                ComposerKt.sourceInformation(composer0, "C(remember):Composables.kt#9igjgp");
                RelocationRequesterModifier relocationRequesterModifier0 = composer0.rememberedValue();
                if(relocationRequesterModifier0 == Composer.Companion.getEmpty()) {
                    relocationRequesterModifier0 = new RelocationRequesterModifier();
                    composer0.updateRememberedValue(relocationRequesterModifier0);
                }
                composer0.endReplaceableGroup();
                androidx.compose.ui.layout.RelocationRequesterModifierKt.relocationRequester.2.1 relocationRequesterModifierKt$relocationRequester$2$10 = new Function1(relocationRequesterModifier0) {
                    final RelocationRequesterModifier $modifier;
                    final RelocationRequester $relocationRequester;

                    {
                        this.$relocationRequester = relocationRequester0;
                        this.$modifier = relocationRequesterModifier0;
                        super(1);
                    }

                    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope0) {
                        Intrinsics.checkNotNullParameter(disposableEffectScope0, "$this$DisposableEffect");
                        this.$relocationRequester.getModifiers$ui_release().add(this.$modifier);
                        return new DisposableEffectResult() {
                            @Override  // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                this.$modifier.getModifiers$ui_release().remove(this.$modifier$inlined);
                            }
                        };
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        return this.invoke(((DisposableEffectScope)object0));
                    }
                };
                EffectsKt.DisposableEffect(this.$relocationRequester, relocationRequesterModifierKt$relocationRequester$2$10, composer0, MutableVector.$stable);
                composer0.endReplaceableGroup();
                return relocationRequesterModifier0;
            }

            @Override  // kotlin.jvm.functions.Function3
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.invoke(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001A\u00020\u0001*\u00020\u0000H\n¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/InspectorInfo;", "", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public final class androidx.compose.ui.layout.RelocationRequesterModifierKt.relocationRequester..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            final RelocationRequester $relocationRequester$inlined;

            public androidx.compose.ui.layout.RelocationRequesterModifierKt.relocationRequester..inlined.debugInspectorInfo.1(RelocationRequester relocationRequester0) {
                this.$relocationRequester$inlined = relocationRequester0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(InspectorInfo inspectorInfo0) {
                Intrinsics.checkNotNullParameter(inspectorInfo0, "$this$null");
                inspectorInfo0.setName("relocationRequester");
                inspectorInfo0.getProperties().set("relocationRequester", this.$relocationRequester$inlined);
            }
        }

    }
}

