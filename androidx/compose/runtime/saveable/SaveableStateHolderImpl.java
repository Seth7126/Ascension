package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000 \u001A2\u00020\u0001:\u0002\u001A\u001BB/\u0012(\b\u0002\u0010\u0002\u001A\"\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00070\u00050\u0003¢\u0006\u0002\u0010\bJ(\u0010\u0011\u001A\u00020\u00122\u0006\u0010\u0013\u001A\u00020\u00042\u0011\u0010\u0014\u001A\r\u0012\u0004\u0012\u00020\u00120\u0015¢\u0006\u0002\b\u0016H\u0017¢\u0006\u0002\u0010\u0017J\u0010\u0010\u0018\u001A\u00020\u00122\u0006\u0010\u0013\u001A\u00020\u0004H\u0016J(\u0010\u0019\u001A\"\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00070\u00050\u0003H\u0002R\u001C\u0010\t\u001A\u0004\u0018\u00010\nX\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u000B\u0010\f\"\u0004\b\r\u0010\u000ER\u001E\u0010\u000F\u001A\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u00060\u0010R\u00020\u00000\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010\u0002\u001A\"\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00070\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001C"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "savedStates", "", "", "", "", "", "(Ljava/util/Map;)V", "parentSaveableStateRegistry", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "getParentSaveableStateRegistry", "()Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "setParentSaveableStateRegistry", "(Landroidx/compose/runtime/saveable/SaveableStateRegistry;)V", "registryHolders", "Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$RegistryHolder;", "SaveableStateProvider", "", "key", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "removeState", "saveAll", "Companion", "RegistryHolder", "runtime-saveable_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
final class SaveableStateHolderImpl implements SaveableStateHolder {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001B\u0010\u0003\u001A\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "runtime-saveable_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final Saver getSaver() {
            return SaveableStateHolderImpl.Saver;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0002\u0010 \n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0001¢\u0006\u0002\u0010\u0003J.\u0010\u0010\u001A\u00020\u00112&\u0010\u0012\u001A\"\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0015\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00160\u00140\u0013R\u0011\u0010\u0002\u001A\u00020\u0001¢\u0006\b\n\u0000\u001A\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u001A\u0010\n\u001A\u00020\u000BX\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\f\u0010\r\"\u0004\b\u000E\u0010\u000F¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$RegistryHolder;", "", "key", "(Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;Ljava/lang/Object;)V", "getKey", "()Ljava/lang/Object;", "registry", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "getRegistry", "()Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "shouldSave", "", "getShouldSave", "()Z", "setShouldSave", "(Z)V", "saveTo", "", "map", "", "", "", "", "runtime-saveable_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public final class RegistryHolder {
        private final Object key;
        private final SaveableStateRegistry registry;
        private boolean shouldSave;

        public RegistryHolder(Object object0) {
            Intrinsics.checkNotNullParameter(saveableStateHolderImpl0, "this$0");
            Intrinsics.checkNotNullParameter(object0, "key");
            SaveableStateHolderImpl.this = saveableStateHolderImpl0;
            super();
            this.key = object0;
            this.shouldSave = true;
            this.registry = SaveableStateRegistryKt.SaveableStateRegistry(((Map)saveableStateHolderImpl0.savedStates.get(object0)), new Function1() {
                {
                    SaveableStateHolderImpl.this = saveableStateHolderImpl0;
                    super(1);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return Boolean.valueOf(this.invoke(object0));
                }

                public final boolean invoke(Object object0) {
                    Intrinsics.checkNotNullParameter(object0, "it");
                    SaveableStateRegistry saveableStateRegistry0 = SaveableStateHolderImpl.this.getParentSaveableStateRegistry();
                    return saveableStateRegistry0 == null ? true : saveableStateRegistry0.canBeSaved(object0);
                }
            });
        }

        public final Object getKey() {
            return this.key;
        }

        public final SaveableStateRegistry getRegistry() {
            return this.registry;
        }

        public final boolean getShouldSave() {
            return this.shouldSave;
        }

        public final void saveTo(Map map0) {
            Intrinsics.checkNotNullParameter(map0, "map");
            if(this.shouldSave) {
                Map map1 = this.registry.performSave();
                map0.put(this.key, map1);
            }
        }

        public final void setShouldSave(boolean z) {
            this.shouldSave = z;
        }
    }

    public static final Companion Companion;
    private static final Saver Saver;
    private SaveableStateRegistry parentSaveableStateRegistry;
    private final Map registryHolders;
    private final Map savedStates;

    static {
        SaveableStateHolderImpl.Companion = new Companion(null);
        SaveableStateHolderImpl.Saver = SaverKt.Saver(SaveableStateHolderImpl.Companion.Saver.1.INSTANCE, SaveableStateHolderImpl.Companion.Saver.2.INSTANCE);
    }

    public SaveableStateHolderImpl() {
        this(null, 1, null);
    }

    public SaveableStateHolderImpl(Map map0) {
        Intrinsics.checkNotNullParameter(map0, "savedStates");
        super();
        this.savedStates = map0;
        this.registryHolders = new LinkedHashMap();
    }

    public SaveableStateHolderImpl(Map map0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            map0 = new LinkedHashMap();
        }
        this(map0);
    }

    @Override  // androidx.compose.runtime.saveable.SaveableStateHolder
    public void SaveableStateProvider(Object object0, Function2 function20, Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(object0, "key");
        Intrinsics.checkNotNullParameter(function20, "content");
        Composer composer1 = composer0.startRestartGroup(-111644091);
        ComposerKt.sourceInformation(composer1, "C(SaveableStateProvider)P(1)75@2967L923:SaveableStateHolder.kt#r2ddri");
        composer1.startReplaceableGroup(-1530021272);
        ComposerKt.sourceInformation(composer1, "C(ReusableContent)P(1)145@5253L9:Composables.kt#9igjgp");
        composer1.startReusableGroup(0xCF, object0);
        composer1.startReplaceableGroup(0x5A63E158);
        ComposerKt.sourceInformation(composer1, "C76@3023L321,83@3357L150,87@3520L360:SaveableStateHolder.kt#r2ddri");
        composer1.startReplaceableGroup(0xFFC7BCB7);
        ComposerKt.sourceInformation(composer1, "C(remember):Composables.kt#9igjgp");
        RegistryHolder saveableStateHolderImpl$RegistryHolder0 = composer1.rememberedValue();
        if(saveableStateHolderImpl$RegistryHolder0 == Composer.Companion.getEmpty()) {
            SaveableStateRegistry saveableStateRegistry0 = this.getParentSaveableStateRegistry();
            if(!(saveableStateRegistry0 == null ? true : saveableStateRegistry0.canBeSaved(object0))) {
                throw new IllegalArgumentException(("Type of the key " + object0 + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
            }
            saveableStateHolderImpl$RegistryHolder0 = new RegistryHolder(this, object0);
            composer1.updateRememberedValue(saveableStateHolderImpl$RegistryHolder0);
        }
        composer1.endReplaceableGroup();
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{SaveableStateRegistryKt.getLocalSaveableStateRegistry().provides(saveableStateHolderImpl$RegistryHolder0.getRegistry())}, function20, composer1, v & 0x70 | 8);
        Function1 function10 = new Function1(object0, saveableStateHolderImpl$RegistryHolder0) {
            final Object $key;
            final RegistryHolder $registryHolder;

            {
                SaveableStateHolderImpl.this = saveableStateHolderImpl0;
                this.$key = object0;
                this.$registryHolder = saveableStateHolderImpl$RegistryHolder0;
                super(1);
            }

            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope0) {
                Intrinsics.checkNotNullParameter(disposableEffectScope0, "$this$DisposableEffect");
                boolean z = SaveableStateHolderImpl.this.registryHolders.containsKey(this.$key);
                Object object0 = this.$key;
                if(!z == 0) {
                    throw new IllegalArgumentException(("Key " + object0 + " was used multiple times ").toString());
                }
                SaveableStateHolderImpl.this.savedStates.remove(this.$key);
                SaveableStateHolderImpl.this.registryHolders.put(this.$key, this.$registryHolder);
                return new DisposableEffectResult() {
                    @Override  // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        Map map0 = this.$key.savedStates;
                        SaveableStateHolderImpl.this.saveTo(map0);
                        this.$key.registryHolders.remove(this.$key$inlined);
                    }
                };
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((DisposableEffectScope)object0));
            }
        };
        EffectsKt.DisposableEffect(Unit.INSTANCE, function10, composer1, 0);
        composer1.endReplaceableGroup();
        composer1.endReusableGroup();
        composer1.endReplaceableGroup();
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new Function2(object0, function20, v) {
                final int $$changed;
                final Function2 $content;
                final Object $key;
                final SaveableStateHolderImpl $tmp0_rcvr;

                {
                    this.$tmp0_rcvr = saveableStateHolderImpl0;
                    this.$key = object0;
                    this.$content = function20;
                    this.$$changed = v;
                    super(2);
                }

                @Override  // kotlin.jvm.functions.Function2
                public Object invoke(Object object0, Object object1) {
                    this.invoke(((Composer)object0), ((Number)object1).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer0, int v) {
                    this.$tmp0_rcvr.SaveableStateProvider(this.$key, this.$content, composer0, this.$$changed | 1);
                }
            });
        }
    }

    public final SaveableStateRegistry getParentSaveableStateRegistry() {
        return this.parentSaveableStateRegistry;
    }

    @Override  // androidx.compose.runtime.saveable.SaveableStateHolder
    public void removeState(Object object0) {
        Intrinsics.checkNotNullParameter(object0, "key");
        RegistryHolder saveableStateHolderImpl$RegistryHolder0 = (RegistryHolder)this.registryHolders.get(object0);
        if(saveableStateHolderImpl$RegistryHolder0 != null) {
            saveableStateHolderImpl$RegistryHolder0.setShouldSave(false);
            return;
        }
        this.savedStates.remove(object0);
    }

    private final Map saveAll() {
        Map map0 = MapsKt.toMutableMap(this.savedStates);
        for(Object object0: this.registryHolders.values()) {
            ((RegistryHolder)object0).saveTo(map0);
        }
        return map0;
    }

    public final void setParentSaveableStateRegistry(SaveableStateRegistry saveableStateRegistry0) {
        this.parentSaveableStateRegistry = saveableStateRegistry0;
    }
}

