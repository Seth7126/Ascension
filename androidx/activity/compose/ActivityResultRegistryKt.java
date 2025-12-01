package androidx.activity.compose;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u001C\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001AM\u0010\u0000\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"rememberLauncherForActivityResult", "Landroidx/activity/compose/ManagedActivityResultLauncher;", "I", "O", "contract", "Landroidx/activity/result/contract/ActivityResultContract;", "onResult", "Lkotlin/Function1;", "", "(Landroidx/activity/result/contract/ActivityResultContract;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/activity/compose/ManagedActivityResultLauncher;", "activity-compose_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class ActivityResultRegistryKt {
    public static final ManagedActivityResultLauncher rememberLauncherForActivityResult(ActivityResultContract activityResultContract0, Function1 function10, Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(activityResultContract0, "contract");
        Intrinsics.checkNotNullParameter(function10, "onResult");
        composer0.startReplaceableGroup(0x9C4B9AF2);
        ComposerKt.sourceInformation(composer0, "C(rememberLauncherForActivityResult)85@3515L30,86@3572L30,90@3741L49,*92@3871L7,95@4025L46,96@4099L85,102@4311L260:ActivityResultRegistry.kt#q1dkbc");
        State state0 = SnapshotStateKt.rememberUpdatedState(activityResultContract0, composer0, 8);
        State state1 = SnapshotStateKt.rememberUpdatedState(function10, composer0, v >> 3 & 14);
        Object object0 = RememberSaveableKt.rememberSaveable(new Object[0], null, null, androidx.activity.compose.ActivityResultRegistryKt.rememberLauncherForActivityResult.key.1.INSTANCE, composer0, 8, 6);
        Intrinsics.checkNotNullExpressionValue(object0, "rememberSaveable { UUID.randomUUID().toString() }");
        ActivityResultRegistryOwner activityResultRegistryOwner0 = LocalActivityResultRegistryOwner.INSTANCE.getCurrent(composer0, 0);
        if(activityResultRegistryOwner0 == null) {
            throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
        }
        ActivityResultRegistry activityResultRegistry0 = activityResultRegistryOwner0.getActivityResultRegistry();
        Intrinsics.checkNotNullExpressionValue(activityResultRegistry0, "checkNotNull(LocalActivityResultRegistryOwner.current) {\n        \"No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner\"\n    }.activityResultRegistry");
        composer0.startReplaceableGroup(0xFFC7BCB7);
        ComposerKt.sourceInformation(composer0, "C(remember):Composables.kt#9igjgp");
        ActivityResultLauncherHolder activityResultLauncherHolder0 = composer0.rememberedValue();
        if(activityResultLauncherHolder0 == Composer.Companion.getEmpty()) {
            activityResultLauncherHolder0 = new ActivityResultLauncherHolder();
            composer0.updateRememberedValue(activityResultLauncherHolder0);
        }
        composer0.endReplaceableGroup();
        composer0.startReplaceableGroup(0xFFC7BCB7);
        ComposerKt.sourceInformation(composer0, "C(remember):Composables.kt#9igjgp");
        ManagedActivityResultLauncher managedActivityResultLauncher0 = composer0.rememberedValue();
        if(managedActivityResultLauncher0 == Composer.Companion.getEmpty()) {
            managedActivityResultLauncher0 = new ManagedActivityResultLauncher(activityResultLauncherHolder0, state0);
            composer0.updateRememberedValue(managedActivityResultLauncher0);
        }
        composer0.endReplaceableGroup();
        EffectsKt.DisposableEffect(activityResultRegistry0, ((String)object0), activityResultContract0, new Function1(activityResultLauncherHolder0, activityResultRegistry0, ((String)object0), activityResultContract0, state1) {
            final ActivityResultRegistry $activityResultRegistry;
            final ActivityResultContract $contract;
            final State $currentOnResult;
            final String $key;
            final ActivityResultLauncherHolder $realLauncher;

            {
                this.$realLauncher = activityResultLauncherHolder0;
                this.$activityResultRegistry = activityResultRegistry0;
                this.$key = s;
                this.$contract = activityResultContract0;
                this.$currentOnResult = state0;
                super(1);
            }

            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope0) {
                Intrinsics.checkNotNullParameter(disposableEffectScope0, "$this$DisposableEffect");
                androidx.activity.compose.ActivityResultRegistryKt.rememberLauncherForActivityResult.1.1 activityResultRegistryKt$rememberLauncherForActivityResult$1$10 = new ActivityResultCallback() {
                    @Override  // androidx.activity.result.ActivityResultCallback
                    public final void onActivityResult(Object object0) {
                        ((Function1)this.$currentOnResult.getValue()).invoke(object0);
                    }
                };
                ActivityResultLauncher activityResultLauncher0 = this.$activityResultRegistry.register(this.$key, this.$contract, activityResultRegistryKt$rememberLauncherForActivityResult$1$10);
                this.$realLauncher.setLauncher(activityResultLauncher0);
                return new DisposableEffectResult() {
                    @Override  // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        this.$realLauncher$inlined.unregister();
                    }
                };
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((DisposableEffectScope)object0));
            }
        }, composer0, 520);
        composer0.endReplaceableGroup();
        return managedActivityResultLauncher0;

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
        final class androidx.activity.compose.ActivityResultRegistryKt.rememberLauncherForActivityResult.key.1 extends Lambda implements Function0 {
            public static final androidx.activity.compose.ActivityResultRegistryKt.rememberLauncherForActivityResult.key.1 INSTANCE;

            static {
                androidx.activity.compose.ActivityResultRegistryKt.rememberLauncherForActivityResult.key.1.INSTANCE = new androidx.activity.compose.ActivityResultRegistryKt.rememberLauncherForActivityResult.key.1();
            }

            androidx.activity.compose.ActivityResultRegistryKt.rememberLauncherForActivityResult.key.1() {
                super(0);
            }

            // 去混淆评级： 低(20)
            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return "231acadc-d48f-4ca6-b003-7426f264280b";
            }

            // 去混淆评级： 低(20)
            public final String invoke() [...] // 潜在的解密器
        }

    }
}

