package androidx.compose.ui.focus;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\f\u0010\u0000\u001A\u00020\u0001*\u00020\u0001H\u0007\u001A\n\u0010\u0002\u001A\u00020\u0001*\u00020\u0001¨\u0006\u0003"}, d2 = {"focusModifier", "Landroidx/compose/ui/Modifier;", "focusTarget", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class FocusModifierKt {
    @Deprecated(message = "Replaced by focusTarget", replaceWith = @ReplaceWith(expression = "focusTarget()", imports = {"androidx.compose.ui.focus.focusTarget"}))
    public static final Modifier focusModifier(Modifier modifier0) {
        Intrinsics.checkNotNullParameter(modifier0, "<this>");
        return ComposedModifierKt.composed(modifier0, InspectableValueKt.getNoInspectorInfo(), androidx.compose.ui.focus.FocusModifierKt.focusModifier.2.INSTANCE);

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001A\u00020\u0001*\u00020\u0000H\n¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/InspectorInfo;", "", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public final class androidx.compose.ui.focus.FocusModifierKt.focusModifier..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public androidx.compose.ui.focus.FocusModifierKt.focusModifier..inlined.debugInspectorInfo.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(InspectorInfo inspectorInfo0) {
                Intrinsics.checkNotNullParameter(inspectorInfo0, "$this$null");
                inspectorInfo0.setName("focusModifier");
            }
        }


        @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001A\u00020\u0000*\u00020\u0000H\u000B"}, d2 = {"Landroidx/compose/ui/Modifier;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        final class androidx.compose.ui.focus.FocusModifierKt.focusModifier.2 extends Lambda implements Function3 {
            public static final androidx.compose.ui.focus.FocusModifierKt.focusModifier.2 INSTANCE;

            static {
                androidx.compose.ui.focus.FocusModifierKt.focusModifier.2.INSTANCE = new androidx.compose.ui.focus.FocusModifierKt.focusModifier.2();
            }

            androidx.compose.ui.focus.FocusModifierKt.focusModifier.2() {
                super(3);
            }

            public final Modifier invoke(Modifier modifier0, Composer composer0, int v) {
                Intrinsics.checkNotNullParameter(modifier0, "$this$composed");
                composer0.startReplaceableGroup(1014928436);
                ComposerKt.sourceInformation(composer0, "C75@2937L36:FocusModifier.kt#b42af3");
                composer0.startReplaceableGroup(0xFFC7BCB7);
                ComposerKt.sourceInformation(composer0, "C(remember):Composables.kt#9igjgp");
                FocusModifier focusModifier0 = composer0.rememberedValue();
                if(focusModifier0 == Composer.Companion.getEmpty()) {
                    focusModifier0 = new FocusModifier(FocusStateImpl.Inactive, null, 2, null);
                    composer0.updateRememberedValue(focusModifier0);
                }
                composer0.endReplaceableGroup();
                composer0.endReplaceableGroup();
                return focusModifier0;
            }

            @Override  // kotlin.jvm.functions.Function3
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.invoke(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        }

    }

    public static final Modifier focusTarget(Modifier modifier0) {
        Intrinsics.checkNotNullParameter(modifier0, "<this>");
        return ComposedModifierKt.composed(modifier0, InspectableValueKt.getNoInspectorInfo(), androidx.compose.ui.focus.FocusModifierKt.focusTarget.2.INSTANCE);

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001A\u00020\u0001*\u00020\u0000H\n¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/InspectorInfo;", "", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public final class androidx.compose.ui.focus.FocusModifierKt.focusTarget..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public androidx.compose.ui.focus.FocusModifierKt.focusTarget..inlined.debugInspectorInfo.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(InspectorInfo inspectorInfo0) {
                Intrinsics.checkNotNullParameter(inspectorInfo0, "$this$null");
                inspectorInfo0.setName("focusTarget");
            }
        }


        @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001A\u00020\u0000*\u00020\u0000H\u000B"}, d2 = {"Landroidx/compose/ui/Modifier;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        final class androidx.compose.ui.focus.FocusModifierKt.focusTarget.2 extends Lambda implements Function3 {
            public static final androidx.compose.ui.focus.FocusModifierKt.focusTarget.2 INSTANCE;

            static {
                androidx.compose.ui.focus.FocusModifierKt.focusTarget.2.INSTANCE = new androidx.compose.ui.focus.FocusModifierKt.focusTarget.2();
            }

            androidx.compose.ui.focus.FocusModifierKt.focusTarget.2() {
                super(3);
            }

            public final Modifier invoke(Modifier modifier0, Composer composer0, int v) {
                Intrinsics.checkNotNullParameter(modifier0, "$this$composed");
                composer0.startReplaceableGroup(1906539569);
                ComposerKt.sourceInformation(composer0, "C64@2608L36:FocusModifier.kt#b42af3");
                composer0.startReplaceableGroup(0xFFC7BCB7);
                ComposerKt.sourceInformation(composer0, "C(remember):Composables.kt#9igjgp");
                FocusModifier focusModifier0 = composer0.rememberedValue();
                if(focusModifier0 == Composer.Companion.getEmpty()) {
                    focusModifier0 = new FocusModifier(FocusStateImpl.Inactive, null, 2, null);
                    composer0.updateRememberedValue(focusModifier0);
                }
                composer0.endReplaceableGroup();
                composer0.endReplaceableGroup();
                return focusModifier0;
            }

            @Override  // kotlin.jvm.functions.Function3
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.invoke(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        }

    }
}

