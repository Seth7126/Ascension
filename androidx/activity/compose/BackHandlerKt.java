package androidx.activity.compose;

import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A%\u0010\u0000\u001A\u00020\u00012\b\b\u0002\u0010\u0002\u001A\u00020\u00032\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"BackHandler", "", "enabled", "", "onBack", "Lkotlin/Function0;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "activity-compose_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class BackHandlerKt {
    static {
    }

    public static final void BackHandler(boolean z, Function0 function00, Composer composer0, int v, int v1) {
        int v2;
        Intrinsics.checkNotNullParameter(function00, "onBack");
        Composer composer1 = composer0.startRestartGroup(0xC61D44F0);
        ComposerKt.sourceInformation(composer1, "C(BackHandler)78@3169L28,80@3299L171,88@3571L48,88@3560L59,*91@3692L7,94@3871L7,95@3883L302:BackHandler.kt#q1dkbc");
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(z) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(function00) ? 0x20 : 16);
        }
        if((v2 & 91 ^ 18) == 0 && composer1.getSkipping()) {
            composer1.skipToGroupEnd();
        }
        else {
            if((v1 & 1) != 0) {
                z = true;
            }
            State state0 = SnapshotStateKt.rememberUpdatedState(function00, composer1, v2 >> 3 & 14);
            composer1.startReplaceableGroup(0xFFC7BCB7);
            ComposerKt.sourceInformation(composer1, "C(remember):Composables.kt#9igjgp");
            androidx.activity.compose.BackHandlerKt.BackHandler.backCallback.1.1 backHandlerKt$BackHandler$backCallback$1$10 = composer1.rememberedValue();
            if(backHandlerKt$BackHandler$backCallback$1$10 == Composer.Companion.getEmpty()) {
                backHandlerKt$BackHandler$backCallback$1$10 = new OnBackPressedCallback(z) {
                    @Override  // androidx.activity.OnBackPressedCallback
                    public void handleOnBackPressed() {
                        BackHandlerKt.BackHandler$lambda-0(state0).invoke();
                    }
                };
                composer1.updateRememberedValue(backHandlerKt$BackHandler$backCallback$1$10);
            }
            composer1.endReplaceableGroup();
            composer1.startReplaceableGroup(0xFFC7BF68);
            ComposerKt.sourceInformation(composer1, "C(remember)P(1,2):Composables.kt#9igjgp");
            boolean z1 = composer1.changed(backHandlerKt$BackHandler$backCallback$1$10);
            boolean z2 = composer1.changed(Boolean.valueOf(z));
            androidx.activity.compose.BackHandlerKt.BackHandler.1.1 backHandlerKt$BackHandler$1$10 = composer1.rememberedValue();
            if(z2 || z1 || backHandlerKt$BackHandler$1$10 == Composer.Companion.getEmpty()) {
                backHandlerKt$BackHandler$1$10 = new Function0(backHandlerKt$BackHandler$backCallback$1$10, z) {
                    final androidx.activity.compose.BackHandlerKt.BackHandler.backCallback.1.1 $backCallback;
                    final boolean $enabled;

                    {
                        this.$backCallback = backHandlerKt$BackHandler$backCallback$1$10;
                        this.$enabled = z;
                        super(0);
                    }

                    @Override  // kotlin.jvm.functions.Function0
                    public Object invoke() {
                        this.invoke();
                        return Unit.INSTANCE;
                    }

                    public final void invoke() {
                        this.$backCallback.setEnabled(this.$enabled);
                    }
                };
                composer1.updateRememberedValue(backHandlerKt$BackHandler$1$10);
            }
            composer1.endReplaceableGroup();
            EffectsKt.SideEffect(backHandlerKt$BackHandler$1$10, composer1, 0);
            OnBackPressedDispatcherOwner onBackPressedDispatcherOwner0 = LocalOnBackPressedDispatcherOwner.INSTANCE.getCurrent(composer1, 0);
            if(onBackPressedDispatcherOwner0 == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            OnBackPressedDispatcher onBackPressedDispatcher0 = onBackPressedDispatcherOwner0.getOnBackPressedDispatcher();
            Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher0, "checkNotNull(LocalOnBackPressedDispatcherOwner.current) {\n        \"No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner\"\n    }.onBackPressedDispatcher");
            ComposerKt.sourceInformationMarkerStart(composer1, 103361330, "C:CompositionLocal.kt#9igjgp");
            Object object0 = composer1.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            ComposerKt.sourceInformationMarkerEnd(composer1);
            EffectsKt.DisposableEffect(((LifecycleOwner)object0), onBackPressedDispatcher0, new Function1(onBackPressedDispatcher0, ((LifecycleOwner)object0), backHandlerKt$BackHandler$backCallback$1$10) {
                final androidx.activity.compose.BackHandlerKt.BackHandler.backCallback.1.1 $backCallback;
                final OnBackPressedDispatcher $backDispatcher;
                final LifecycleOwner $lifecycleOwner;

                {
                    this.$backDispatcher = onBackPressedDispatcher0;
                    this.$lifecycleOwner = lifecycleOwner0;
                    this.$backCallback = backHandlerKt$BackHandler$backCallback$1$10;
                    super(1);
                }

                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope0) {
                    Intrinsics.checkNotNullParameter(disposableEffectScope0, "$this$DisposableEffect");
                    this.$backDispatcher.addCallback(this.$lifecycleOwner, this.$backCallback);
                    return new DisposableEffectResult() {
                        @Override  // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            this.$backCallback$inlined.remove();
                        }
                    };
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.invoke(((DisposableEffectScope)object0));
                }
            }, composer1, 72);
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new Function2(z, function00, v, v1) {
                final int $$changed;
                final int $$default;
                final boolean $enabled;
                final Function0 $onBack;

                {
                    this.$enabled = z;
                    this.$onBack = function00;
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
                    BackHandlerKt.BackHandler(this.$enabled, this.$onBack, composer0, this.$$changed | 1, this.$$default);
                }
            });
        }
    }

    private static final Function0 BackHandler$lambda-0(State state0) {
        return (Function0)state0.getValue();
    }
}

