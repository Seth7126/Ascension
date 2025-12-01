package androidx.compose.ui.semantics;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
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

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\u001A#\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001A-\u0010\u0007\u001A\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\b\u001A\u00020\t2\u0017\u0010\u0002\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¨\u0006\n"}, d2 = {"clearAndSetSemantics", "Landroidx/compose/ui/Modifier;", "properties", "Lkotlin/Function1;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "", "Lkotlin/ExtensionFunctionType;", "semantics", "mergeDescendants", "", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class SemanticsModifierKt {
    public static final Modifier clearAndSetSemantics(Modifier modifier0, Function1 function10) {
        Intrinsics.checkNotNullParameter(modifier0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "properties");
        return ComposedModifierKt.composed(modifier0, InspectableValueKt.getNoInspectorInfo(), new Function3(function10) {
            final Function1 $properties;

            {
                this.$properties = function10;
                super(3);
            }

            public final Modifier invoke(Modifier modifier0, Composer composer0, int v) {
                Intrinsics.checkNotNullParameter(modifier0, "$this$composed");
                composer0.startReplaceableGroup(0xCD33B9AF);
                ComposerKt.sourceInformation(composer0, "C143@5932L56:SemanticsModifier.kt#x0n4us");
                composer0.startReplaceableGroup(0xFFC7BCB7);
                ComposerKt.sourceInformation(composer0, "C(remember):Composables.kt#9igjgp");
                Integer integer0 = composer0.rememberedValue();
                if(integer0 == Composer.Companion.getEmpty()) {
                    integer0 = SemanticsModifierCore.Companion.generateSemanticsId();
                    composer0.updateRememberedValue(integer0);
                }
                composer0.endReplaceableGroup();
                SemanticsModifierCore semanticsModifierCore0 = new SemanticsModifierCore(integer0.intValue(), false, true, this.$properties);
                composer0.endReplaceableGroup();
                return semanticsModifierCore0;
            }

            @Override  // kotlin.jvm.functions.Function3
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.invoke(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001A\u00020\u0001*\u00020\u0000H\n¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/InspectorInfo;", "", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public final class androidx.compose.ui.semantics.SemanticsModifierKt.clearAndSetSemantics..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            final Function1 $properties$inlined;

            public androidx.compose.ui.semantics.SemanticsModifierKt.clearAndSetSemantics..inlined.debugInspectorInfo.1(Function1 function10) {
                this.$properties$inlined = function10;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(InspectorInfo inspectorInfo0) {
                Intrinsics.checkNotNullParameter(inspectorInfo0, "$this$null");
                inspectorInfo0.setName("clearAndSetSemantics");
                inspectorInfo0.getProperties().set("properties", this.$properties$inlined);
            }
        }

    }

    public static final Modifier semantics(Modifier modifier0, boolean z, Function1 function10) {
        Intrinsics.checkNotNullParameter(modifier0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "properties");
        return ComposedModifierKt.composed(modifier0, InspectableValueKt.getNoInspectorInfo(), new Function3(z, function10) {
            final boolean $mergeDescendants;
            final Function1 $properties;

            {
                this.$mergeDescendants = z;
                this.$properties = function10;
                super(3);
            }

            public final Modifier invoke(Modifier modifier0, Composer composer0, int v) {
                Intrinsics.checkNotNullParameter(modifier0, "$this$composed");
                composer0.startReplaceableGroup(0x7E6ED0B6);
                ComposerKt.sourceInformation(composer0, "C116@4631L56:SemanticsModifier.kt#x0n4us");
                composer0.startReplaceableGroup(0xFFC7BCB7);
                ComposerKt.sourceInformation(composer0, "C(remember):Composables.kt#9igjgp");
                Integer integer0 = composer0.rememberedValue();
                if(integer0 == Composer.Companion.getEmpty()) {
                    integer0 = SemanticsModifierCore.Companion.generateSemanticsId();
                    composer0.updateRememberedValue(integer0);
                }
                composer0.endReplaceableGroup();
                SemanticsModifierCore semanticsModifierCore0 = new SemanticsModifierCore(integer0.intValue(), this.$mergeDescendants, false, this.$properties);
                composer0.endReplaceableGroup();
                return semanticsModifierCore0;
            }

            @Override  // kotlin.jvm.functions.Function3
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.invoke(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001A\u00020\u0001*\u00020\u0000H\n¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/InspectorInfo;", "", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public final class androidx.compose.ui.semantics.SemanticsModifierKt.semantics..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            final boolean $mergeDescendants$inlined;
            final Function1 $properties$inlined;

            public androidx.compose.ui.semantics.SemanticsModifierKt.semantics..inlined.debugInspectorInfo.1(boolean z, Function1 function10) {
                this.$mergeDescendants$inlined = z;
                this.$properties$inlined = function10;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(InspectorInfo inspectorInfo0) {
                Intrinsics.checkNotNullParameter(inspectorInfo0, "$this$null");
                inspectorInfo0.setName("semantics");
                inspectorInfo0.getProperties().set("mergeDescendants", Boolean.valueOf(this.$mergeDescendants$inlined));
                inspectorInfo0.getProperties().set("properties", this.$properties$inlined);
            }
        }

    }

    public static Modifier semantics$default(Modifier modifier0, boolean z, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        return SemanticsModifierKt.semantics(modifier0, z, function10);
    }
}

