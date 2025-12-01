package androidx.compose.runtime.saveable;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A>\u0010\u0000\u001A\u001C\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00020\u0001\"\u0004\b\u0000\u0010\u00032\u0014\u0010\u0005\u001A\u0010\u0012\u0004\u0012\u0002H\u0003\u0012\u0006\b\u0001\u0012\u00020\u00040\u0001H\u0002\u001Aa\u0010\u0006\u001A\u0002H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u00042\u0016\u0010\u0007\u001A\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\b\"\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\t\u001A\u0010\u0012\u0004\u0012\u0002H\u0003\u0012\u0006\b\u0001\u0012\u00020\u00040\u00012\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u000B2\f\u0010\f\u001A\b\u0012\u0004\u0012\u0002H\u00030\rH\u0007¢\u0006\u0002\u0010\u000E\u001Ag\u0010\u0006\u001A\b\u0012\u0004\u0012\u0002H\u00030\u0002\"\u0004\b\u0000\u0010\u00032\u0016\u0010\u0007\u001A\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\b\"\u0004\u0018\u00010\u00042\u0014\u0010\u000F\u001A\u0010\u0012\u0004\u0012\u0002H\u0003\u0012\u0006\b\u0001\u0012\u00020\u00040\u00012\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u000B2\u0012\u0010\f\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\rH\u0007¢\u0006\u0002\u0010\u0010\u001A\u0016\u0010\u0011\u001A\u00020\u0012*\u00020\u00132\b\u0010\u0014\u001A\u0004\u0018\u00010\u0004H\u0002¨\u0006\u0015"}, d2 = {"mutableStateSaver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/runtime/MutableState;", "T", "", "inner", "rememberSaveable", "inputs", "", "saver", "key", "", "init", "Lkotlin/Function0;", "([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;", "stateSaver", "([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/MutableState;", "requireCanBeSaved", "", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "value", "runtime-saveable_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class RememberSaveableKt {
    private static final Saver mutableStateSaver(Saver saver0) {
        return SaverKt.Saver(new Function2(saver0) {
            final Saver $this_with;

            {
                this.$this_with = saver0;
                super(2);
            }

            public final MutableState invoke(SaverScope saverScope0, MutableState mutableState0) {
                Intrinsics.checkNotNullParameter(saverScope0, "$this$Saver");
                Intrinsics.checkNotNullParameter(mutableState0, "state");
                if(!(mutableState0 instanceof SnapshotMutableState)) {
                    throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
                }
                Object object0 = mutableState0.getValue();
                return SnapshotStateKt.mutableStateOf(this.$this_with.save(saverScope0, object0), ((SnapshotMutableState)mutableState0).getPolicy());
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((SaverScope)object0), ((MutableState)object1));
            }
        }, new Function1(saver0) {
            final Saver $this_with;

            {
                this.$this_with = saver0;
                super(1);
            }

            public final MutableState invoke(MutableState mutableState0) {
                Intrinsics.checkNotNullParameter(mutableState0, "it");
                if(!(mutableState0 instanceof SnapshotMutableState)) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                if(mutableState0.getValue() != null) {
                    Object object0 = mutableState0.getValue();
                    Intrinsics.checkNotNull(object0);
                    return SnapshotStateKt.mutableStateOf(this.$this_with.restore(object0), ((SnapshotMutableState)mutableState0).getPolicy());
                }
                return SnapshotStateKt.mutableStateOf(null, ((SnapshotMutableState)mutableState0).getPolicy());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((MutableState)object0));
            }
        });
    }

    public static final MutableState rememberSaveable(Object[] arr_object, Saver saver0, String s, Function0 function00, Composer composer0, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_object, "inputs");
        Intrinsics.checkNotNullParameter(saver0, "stateSaver");
        Intrinsics.checkNotNullParameter(function00, "init");
        composer0.startReplaceableGroup(0x3F24AFE1);
        ComposerKt.sourceInformation(composer0, "C(rememberSaveable)P(1,3,2)138@5897L106:RememberSaveable.kt#r2ddri");
        if((v1 & 4) != 0) {
            s = null;
        }
        MutableState mutableState0 = (MutableState)RememberSaveableKt.rememberSaveable(Arrays.copyOf(arr_object, arr_object.length), RememberSaveableKt.mutableStateSaver(saver0), s, function00, composer0, v & 0x380 | 8 | v & 0x1C00, 0);
        composer0.endReplaceableGroup();
        return mutableState0;
    }

    public static final Object rememberSaveable(Object[] arr_object, Saver saver0, String s, Function0 function00, Composer composer0, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_object, "inputs");
        Intrinsics.checkNotNullParameter(function00, "init");
        composer0.startReplaceableGroup(0x3F24A50F);
        ComposerKt.sourceInformation(composer0, "C(rememberSaveable)P(1,3,2)79@3430L7,81@3527L244,92@4034L34:RememberSaveable.kt#r2ddri");
        if((v1 & 2) != 0) {
            saver0 = SaverKt.autoSaver();
        }
        if((v1 & 4) != 0) {
            s = null;
        }
        int v2 = 0;
        if(s == null || s.length() == 0) {
            composer0.startReplaceableGroup(0x3F24A643);
            ComposerKt.sourceInformation(composer0, "74@3281L23");
            s = String.valueOf(ComposablesKt.getCurrentCompositeKeyHash(composer0, 0));
        }
        else {
            composer0.startReplaceableGroup(0x3F24A62A);
        }
        composer0.endReplaceableGroup();
        if(saver0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        }
        ComposerKt.sourceInformationMarkerStart(composer0, 103361330, "C:CompositionLocal.kt#9igjgp");
        Object object0 = composer0.consume(SaveableStateRegistryKt.getLocalSaveableStateRegistry());
        ComposerKt.sourceInformationMarkerEnd(composer0);
        Object[] arr_object1 = Arrays.copyOf(arr_object, arr_object.length);
        composer0.startReplaceableGroup(-3685570);
        ComposerKt.sourceInformation(composer0, "C(remember)P(1):Composables.kt#9igjgp");
        boolean z;
        for(z = false; v2 < arr_object1.length; z |= composer0.changed(object1)) {
            Object object1 = arr_object1[v2];
            ++v2;
        }
        Object object2 = composer0.rememberedValue();
        if(z || object2 == Composer.Companion.getEmpty()) {
            if(((SaveableStateRegistry)object0) == null) {
                object2 = null;
            }
            else {
                Object object3 = ((SaveableStateRegistry)object0).consumeRestored(s);
                object2 = object3 == null ? null : saver0.restore(object3);
            }
            if(object2 == null) {
                object2 = function00.invoke();
            }
            composer0.updateRememberedValue(object2);
        }
        composer0.endReplaceableGroup();
        composer0.startReplaceableGroup(0xFFC7BCB7);
        ComposerKt.sourceInformation(composer0, "C(remember):Composables.kt#9igjgp");
        MutableState mutableState0 = composer0.rememberedValue();
        if(mutableState0 == Composer.Companion.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(saver0, null, 2, null);
            composer0.updateRememberedValue(mutableState0);
        }
        composer0.endReplaceableGroup();
        mutableState0.setValue(saver0);
        if(((SaveableStateRegistry)object0) == null) {
            composer0.startReplaceableGroup(0x3F24AB77);
        }
        else {
            composer0.startReplaceableGroup(0x3F24A9D5);
            ComposerKt.sourceInformation(composer0, "97@4195L402");
            EffectsKt.DisposableEffect(((SaveableStateRegistry)object0), s, object2, new Function1(((SaveableStateRegistry)object0), s, mutableState0, object2) {
                final String $finalKey;
                final SaveableStateRegistry $registry;
                final MutableState $saverHolder;
                final Object $value;

                {
                    this.$registry = saveableStateRegistry0;
                    this.$finalKey = s;
                    this.$saverHolder = mutableState0;
                    this.$value = object0;
                    super(1);
                }

                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope0) {
                    Intrinsics.checkNotNullParameter(disposableEffectScope0, "$this$DisposableEffect");
                    androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable.1.valueProvider.1 rememberSaveableKt$rememberSaveable$1$valueProvider$10 = new Function0(this.$value, this.$registry) {
                        final SaveableStateRegistry $registry;
                        final MutableState $saverHolder;
                        final Object $value;

                        {
                            this.$saverHolder = mutableState0;
                            this.$value = object0;
                            this.$registry = saveableStateRegistry0;
                            super(0);
                        }

                        @Override  // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ((Saver)this.$saverHolder.getValue()).save(new SaverScope() {
                                @Override  // androidx.compose.runtime.saveable.SaverScope
                                public final boolean canBeSaved(Object object0) {
                                    Intrinsics.checkNotNullParameter(object0, "it");
                                    return this.$registry.canBeSaved(object0);
                                }
                            }, this.$value);
                        }
                    };
                    Object object0 = rememberSaveableKt$rememberSaveable$1$valueProvider$10.invoke();
                    RememberSaveableKt.requireCanBeSaved(this.$registry, object0);
                    return new DisposableEffectResult() {
                        @Override  // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            this.$entry$inlined.unregister();
                        }
                    };
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.invoke(((DisposableEffectScope)object0));
                }
            }, composer0, 0);
        }
        composer0.endReplaceableGroup();
        composer0.endReplaceableGroup();
        return object2;
    }

    private static final void requireCanBeSaved(SaveableStateRegistry saveableStateRegistry0, Object object0) {
        String s;
        if(object0 != null && !saveableStateRegistry0.canBeSaved(object0)) {
            if(!(object0 instanceof SnapshotMutableState)) {
                s = object0 + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
            }
            else if(((SnapshotMutableState)object0).getPolicy() != SnapshotStateKt.neverEqualPolicy() && ((SnapshotMutableState)object0).getPolicy() != SnapshotStateKt.structuralEqualityPolicy() && ((SnapshotMutableState)object0).getPolicy() != SnapshotStateKt.referentialEqualityPolicy()) {
                s = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
            }
            else {
                s = "MutableState containing " + ((SnapshotMutableState)object0).getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
            }
            throw new IllegalArgumentException(s);
        }
    }
}

