package androidx.compose.ui.platform;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.text.input.TextInputService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@ExperimentalComposeUiApi
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000F\u0010\n\u001A\u0004\u0018\u00010\u0005H\u0003¢\u0006\u0002\u0010\tJ\u0019\u0010\u000B\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\f2\u0006\u0010\r\u001A\u00020\u0005H\u0086\u0004R\u0016\u0010\u0003\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001C\u0010\u0006\u001A\u0004\u0018\u00010\u00058GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\u0002\u001A\u0004\b\b\u0010\t¨\u0006\u000E"}, d2 = {"Landroidx/compose/ui/platform/LocalSoftwareKeyboardController;", "", "()V", "LocalSoftwareKeyboardController", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "current", "getCurrent$annotations", "getCurrent", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/platform/SoftwareKeyboardController;", "delegatingController", "provides", "Landroidx/compose/runtime/ProvidedValue;", "softwareKeyboardController", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class LocalSoftwareKeyboardController {
    public static final int $stable;
    public static final LocalSoftwareKeyboardController INSTANCE;
    private static final ProvidableCompositionLocal LocalSoftwareKeyboardController;

    static {
        LocalSoftwareKeyboardController.INSTANCE = new LocalSoftwareKeyboardController();
        LocalSoftwareKeyboardController.LocalSoftwareKeyboardController = CompositionLocalKt.compositionLocalOf$default(null, LocalSoftwareKeyboardController.LocalSoftwareKeyboardController.1.INSTANCE, 1, null);
    }

    private final SoftwareKeyboardController delegatingController(Composer composer0, int v) {
        composer0.startReplaceableGroup(0x4AD3F1A1);
        ComposerKt.sourceInformation(composer0, "C(delegatingController)46@1769L7,47@1807L105:LocalSoftwareKeyboardController.kt#itgzvw");
        ComposerKt.sourceInformationMarkerStart(composer0, 103361330, "C:CompositionLocal.kt#9igjgp");
        Object object0 = composer0.consume(CompositionLocalsKt.getLocalTextInputService());
        ComposerKt.sourceInformationMarkerEnd(composer0);
        if(((TextInputService)object0) == null) {
            composer0.endReplaceableGroup();
            return null;
        }
        composer0.startReplaceableGroup(-3686930);
        ComposerKt.sourceInformation(composer0, "C(remember)P(1):Composables.kt#9igjgp");
        boolean z = composer0.changed(((TextInputService)object0));
        DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController0 = composer0.rememberedValue();
        if(z || delegatingSoftwareKeyboardController0 == Composer.Companion.getEmpty()) {
            delegatingSoftwareKeyboardController0 = new DelegatingSoftwareKeyboardController(((TextInputService)object0));
            composer0.updateRememberedValue(delegatingSoftwareKeyboardController0);
        }
        composer0.endReplaceableGroup();
        composer0.endReplaceableGroup();
        return delegatingSoftwareKeyboardController0;
    }

    public final SoftwareKeyboardController getCurrent(Composer composer0, int v) {
        composer0.startReplaceableGroup(0x6E507A39);
        ComposerKt.sourceInformation(composer0, "C41@1585L7:LocalSoftwareKeyboardController.kt#itgzvw");
        ComposerKt.sourceInformationMarkerStart(composer0, 103361330, "C:CompositionLocal.kt#9igjgp");
        Object object0 = composer0.consume(LocalSoftwareKeyboardController.LocalSoftwareKeyboardController);
        ComposerKt.sourceInformationMarkerEnd(composer0);
        SoftwareKeyboardController softwareKeyboardController0 = (SoftwareKeyboardController)object0;
        if(softwareKeyboardController0 == null) {
            composer0.startReplaceableGroup(0x6E507A7F);
            ComposerKt.sourceInformation(composer0, "41@1596L22");
            softwareKeyboardController0 = this.delegatingController(composer0, v & 14);
        }
        else {
            composer0.startReplaceableGroup(0x6E507A54);
        }
        composer0.endReplaceableGroup();
        composer0.endReplaceableGroup();
        return softwareKeyboardController0;
    }

    @ExperimentalComposeUiApi
    public static void getCurrent$annotations() {
    }

    public final ProvidedValue provides(SoftwareKeyboardController softwareKeyboardController0) {
        Intrinsics.checkNotNullParameter(softwareKeyboardController0, "softwareKeyboardController");
        return LocalSoftwareKeyboardController.LocalSoftwareKeyboardController.provides(softwareKeyboardController0);
    }
}

