package androidx.compose.ui.focus;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001A\u001E\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0012\u0010\u0000\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¨\u0006\u0005"}, d2 = {"onFocusChanged", "Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusState;", "", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class FocusChangedModifierKt {
    public static final Modifier onFocusChanged(Modifier modifier0, Function1 function10) {
        Intrinsics.checkNotNullParameter(modifier0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "onFocusChanged");
        return ComposedModifierKt.composed(modifier0, InspectableValueKt.getNoInspectorInfo(), new Function3(function10) {
            final Function1 $onFocusChanged;

            {
                this.$onFocusChanged = function10;
                super(3);
            }

            public final Modifier invoke(Modifier modifier0, Composer composer0, int v) {
                Intrinsics.checkNotNullParameter(modifier0, "$this$composed");
                composer0.startReplaceableGroup(0xDBA0F1E0);
                ComposerKt.sourceInformation(composer0, "C42@1663L33:FocusChangedModifier.kt#b42af3");
                composer0.startReplaceableGroup(0xFFC7BCB7);
                ComposerKt.sourceInformation(composer0, "C(remember):Composables.kt#9igjgp");
                MutableState mutableState0 = composer0.rememberedValue();
                if(mutableState0 == Composer.Companion.getEmpty()) {
                    mutableState0 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composer0.updateRememberedValue(mutableState0);
                }
                composer0.endReplaceableGroup();
                androidx.compose.ui.focus.FocusChangedModifierKt.onFocusChanged.2.1 focusChangedModifierKt$onFocusChanged$2$10 = new Function1(this.$onFocusChanged) {
                    final MutableState $focusState;
                    final Function1 $onFocusChanged;

                    {
                        this.$focusState = mutableState0;
                        this.$onFocusChanged = function10;
                        super(1);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.invoke(((FocusState)object0));
                        return Unit.INSTANCE;
                    }

                    public final void invoke(FocusState focusState0) {
                        Intrinsics.checkNotNullParameter(focusState0, "it");
                        if(!Intrinsics.areEqual(this.$focusState.getValue(), focusState0)) {
                            this.$focusState.setValue(focusState0);
                            this.$onFocusChanged.invoke(focusState0);
                        }
                    }
                };
                Modifier modifier1 = FocusEventModifierKt.onFocusEvent(Modifier.Companion, focusChangedModifierKt$onFocusChanged$2$10);
                composer0.endReplaceableGroup();
                return modifier1;
            }

            @Override  // kotlin.jvm.functions.Function3
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.invoke(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001A\u00020\u0001*\u00020\u0000H\n¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/InspectorInfo;", "", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public final class androidx.compose.ui.focus.FocusChangedModifierKt.onFocusChanged..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            final Function1 $onFocusChanged$inlined;

            public androidx.compose.ui.focus.FocusChangedModifierKt.onFocusChanged..inlined.debugInspectorInfo.1(Function1 function10) {
                this.$onFocusChanged$inlined = function10;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(InspectorInfo inspectorInfo0) {
                Intrinsics.checkNotNullParameter(inspectorInfo0, "$this$null");
                inspectorInfo0.setName("onFocusChanged");
                inspectorInfo0.getProperties().set("onFocusChanged", this.$onFocusChanged$inlined);
            }
        }

    }
}

