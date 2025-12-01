package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\r\u0010\u0000\u001A\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"rememberSaveableStateHolder", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/saveable/SaveableStateHolder;", "runtime-saveable_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class SaveableStateHolderKt {
    public static final SaveableStateHolder rememberSaveableStateHolder(Composer composer0, int v) {
        composer0.startReplaceableGroup(0xDD6FE42B);
        ComposerKt.sourceInformation(composer0, "C(rememberSaveableStateHolder)*59@2369L111,64@2554L7:SaveableStateHolder.kt#r2ddri");
        Saver saver0 = SaveableStateHolderImpl.Companion.getSaver();
        SaveableStateHolderImpl saveableStateHolderImpl0 = (SaveableStateHolderImpl)RememberSaveableKt.rememberSaveable(new Object[0], saver0, null, androidx.compose.runtime.saveable.SaveableStateHolderKt.rememberSaveableStateHolder.1.INSTANCE, composer0, 8, 4);
        ComposerKt.sourceInformationMarkerStart(composer0, 103361330, "C:CompositionLocal.kt#9igjgp");
        Object object0 = composer0.consume(SaveableStateRegistryKt.getLocalSaveableStateRegistry());
        ComposerKt.sourceInformationMarkerEnd(composer0);
        saveableStateHolderImpl0.setParentSaveableStateRegistry(((SaveableStateRegistry)object0));
        composer0.endReplaceableGroup();
        return saveableStateHolderImpl0;

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
        final class androidx.compose.runtime.saveable.SaveableStateHolderKt.rememberSaveableStateHolder.1 extends Lambda implements Function0 {
            public static final androidx.compose.runtime.saveable.SaveableStateHolderKt.rememberSaveableStateHolder.1 INSTANCE;

            static {
                androidx.compose.runtime.saveable.SaveableStateHolderKt.rememberSaveableStateHolder.1.INSTANCE = new androidx.compose.runtime.saveable.SaveableStateHolderKt.rememberSaveableStateHolder.1();
            }

            androidx.compose.runtime.saveable.SaveableStateHolderKt.rememberSaveableStateHolder.1() {
                super(0);
            }

            public final SaveableStateHolderImpl invoke() {
                return new SaveableStateHolderImpl(null, 1, null);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        }

    }
}

