package androidx.compose.ui.input.nestedscroll;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A\u001E\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0005¨\u0006\u0006"}, d2 = {"nestedScroll", "Landroidx/compose/ui/Modifier;", "connection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "dispatcher", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class NestedScrollModifierKt {
    public static final Modifier nestedScroll(Modifier modifier0, NestedScrollConnection nestedScrollConnection0, NestedScrollDispatcher nestedScrollDispatcher0) {
        Intrinsics.checkNotNullParameter(modifier0, "<this>");
        Intrinsics.checkNotNullParameter(nestedScrollConnection0, "connection");
        return ComposedModifierKt.composed(modifier0, InspectableValueKt.getNoInspectorInfo(), new Function3(nestedScrollDispatcher0, nestedScrollConnection0) {
            final NestedScrollConnection $connection;
            final NestedScrollDispatcher $dispatcher;

            {
                this.$dispatcher = nestedScrollDispatcher0;
                this.$connection = nestedScrollConnection0;
                super(3);
            }

            public final Modifier invoke(Modifier modifier0, Composer composer0, int v) {
                Intrinsics.checkNotNullParameter(modifier0, "$this$composed");
                composer0.startReplaceableGroup(100476458);
                ComposerKt.sourceInformation(composer0, "C354@16076L24,357@16227L331:NestedScrollModifier.kt#kpqmsf");
                composer0.startReplaceableGroup(0xD4DFE628);
                ComposerKt.sourceInformation(composer0, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                composer0.startReplaceableGroup(0xFFC7BCB7);
                ComposerKt.sourceInformation(composer0, "C(remember):Composables.kt#9igjgp");
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer0.rememberedValue();
                if(compositionScopedCoroutineScopeCanceller0 == Composer.Companion.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller1 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer0));
                    composer0.updateRememberedValue(compositionScopedCoroutineScopeCanceller1);
                    compositionScopedCoroutineScopeCanceller0 = compositionScopedCoroutineScopeCanceller1;
                }
                composer0.endReplaceableGroup();
                CoroutineScope coroutineScope0 = compositionScopedCoroutineScopeCanceller0.getCoroutineScope();
                composer0.endReplaceableGroup();
                NestedScrollDispatcher nestedScrollDispatcher0 = this.$dispatcher;
                if(nestedScrollDispatcher0 == null) {
                    composer0.startReplaceableGroup(100476585);
                    ComposerKt.sourceInformation(composer0, "356@16185L37");
                    composer0.startReplaceableGroup(0xFFC7BCB7);
                    ComposerKt.sourceInformation(composer0, "C(remember):Composables.kt#9igjgp");
                    NestedScrollDispatcher nestedScrollDispatcher1 = composer0.rememberedValue();
                    if(nestedScrollDispatcher1 == Composer.Companion.getEmpty()) {
                        nestedScrollDispatcher1 = new NestedScrollDispatcher();
                        composer0.updateRememberedValue(nestedScrollDispatcher1);
                    }
                    composer0.endReplaceableGroup();
                    nestedScrollDispatcher0 = nestedScrollDispatcher1;
                }
                else {
                    composer0.startReplaceableGroup(100476571);
                }
                composer0.endReplaceableGroup();
                NestedScrollConnection nestedScrollConnection0 = this.$connection;
                composer0.startReplaceableGroup(0xFFC7C131);
                ComposerKt.sourceInformation(composer0, "C(remember)P(1,2,3):Composables.kt#9igjgp");
                boolean z = composer0.changed(nestedScrollConnection0);
                boolean z1 = composer0.changed(nestedScrollDispatcher0);
                boolean z2 = composer0.changed(coroutineScope0);
                androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt.nestedScroll.2.1.1 nestedScrollModifierKt$nestedScroll$2$1$10 = composer0.rememberedValue();
                if((z | z1 | z2) != 0 || nestedScrollModifierKt$nestedScroll$2$1$10 == Composer.Companion.getEmpty()) {
                    nestedScrollModifierKt$nestedScroll$2$1$10 = new NestedScrollModifier() {
                        private final NestedScrollConnection connection;
                        private final NestedScrollDispatcher dispatcher;

                        {
                            NestedScrollDispatcher nestedScrollDispatcher0 = nestedScrollConnection0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                            NestedScrollConnection nestedScrollConnection0 = coroutineScope0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                            nestedScrollDispatcher0.setOriginNestedScrollScope$ui_release(coroutineScope0);
                            this.dispatcher = nestedScrollDispatcher0;
                            this.connection = nestedScrollConnection0;
                        }

                        @Override  // androidx.compose.ui.Modifier$Element
                        public boolean all(Function1 function10) {
                            return DefaultImpls.all(this, function10);
                        }

                        @Override  // androidx.compose.ui.Modifier$Element
                        public boolean any(Function1 function10) {
                            return DefaultImpls.any(this, function10);
                        }

                        @Override  // androidx.compose.ui.Modifier$Element
                        public Object foldIn(Object object0, Function2 function20) {
                            return DefaultImpls.foldIn(this, object0, function20);
                        }

                        @Override  // androidx.compose.ui.Modifier$Element
                        public Object foldOut(Object object0, Function2 function20) {
                            return DefaultImpls.foldOut(this, object0, function20);
                        }

                        @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollModifier
                        public NestedScrollConnection getConnection() {
                            return this.connection;
                        }

                        @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollModifier
                        public NestedScrollDispatcher getDispatcher() {
                            return this.dispatcher;
                        }

                        @Override  // androidx.compose.ui.Modifier
                        public Modifier then(Modifier modifier0) {
                            return DefaultImpls.then(this, modifier0);
                        }
                    };
                    composer0.updateRememberedValue(nestedScrollModifierKt$nestedScroll$2$1$10);
                }
                composer0.endReplaceableGroup();
                composer0.endReplaceableGroup();
                return nestedScrollModifierKt$nestedScroll$2$1$10;
            }

            @Override  // kotlin.jvm.functions.Function3
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.invoke(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001A\u00020\u0001*\u00020\u0000H\n¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/InspectorInfo;", "", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public final class androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt.nestedScroll..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            final NestedScrollConnection $connection$inlined;
            final NestedScrollDispatcher $dispatcher$inlined;

            public androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt.nestedScroll..inlined.debugInspectorInfo.1(NestedScrollConnection nestedScrollConnection0, NestedScrollDispatcher nestedScrollDispatcher0) {
                this.$connection$inlined = nestedScrollConnection0;
                this.$dispatcher$inlined = nestedScrollDispatcher0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(InspectorInfo inspectorInfo0) {
                Intrinsics.checkNotNullParameter(inspectorInfo0, "$this$null");
                inspectorInfo0.setName("nestedScroll");
                inspectorInfo0.getProperties().set("connection", this.$connection$inlined);
                inspectorInfo0.getProperties().set("dispatcher", this.$dispatcher$inlined);
            }
        }

    }

    public static Modifier nestedScroll$default(Modifier modifier0, NestedScrollConnection nestedScrollConnection0, NestedScrollDispatcher nestedScrollDispatcher0, int v, Object object0) {
        if((v & 2) != 0) {
            nestedScrollDispatcher0 = null;
        }
        return NestedScrollModifierKt.nestedScroll(modifier0, nestedScrollConnection0, nestedScrollDispatcher0);
    }
}

