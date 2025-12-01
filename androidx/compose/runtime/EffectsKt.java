package androidx.compose.runtime;

import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.JobKt__JobKt;

@Metadata(d1 = {"\u0000d\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A&\u0010\u0005\u001A\u00020\u00062\u0017\u0010\u0007\u001A\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b\u00A2\u0006\u0002\b\nH\u0007\u00A2\u0006\u0002\u0010\u000B\u001A0\u0010\u0005\u001A\u00020\u00062\b\u0010\f\u001A\u0004\u0018\u00010\r2\u0017\u0010\u0007\u001A\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b\u00A2\u0006\u0002\b\nH\u0007\u00A2\u0006\u0002\u0010\u000E\u001A:\u0010\u0005\u001A\u00020\u00062\b\u0010\f\u001A\u0004\u0018\u00010\r2\b\u0010\u000F\u001A\u0004\u0018\u00010\r2\u0017\u0010\u0007\u001A\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b\u00A2\u0006\u0002\b\nH\u0007\u00A2\u0006\u0002\u0010\u0010\u001AD\u0010\u0005\u001A\u00020\u00062\b\u0010\f\u001A\u0004\u0018\u00010\r2\b\u0010\u000F\u001A\u0004\u0018\u00010\r2\b\u0010\u0011\u001A\u0004\u0018\u00010\r2\u0017\u0010\u0007\u001A\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b\u00A2\u0006\u0002\b\nH\u0007\u00A2\u0006\u0002\u0010\u0012\u001A>\u0010\u0005\u001A\u00020\u00062\u0016\u0010\u0013\u001A\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\r0\u0014\"\u0004\u0018\u00010\r2\u0017\u0010\u0007\u001A\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b\u00A2\u0006\u0002\b\nH\u0007\u00A2\u0006\u0002\u0010\u0015\u001AW\u0010\u0016\u001A\u00020\u00062\b\u0010\f\u001A\u0004\u0018\u00010\r2\b\u0010\u000F\u001A\u0004\u0018\u00010\r2\b\u0010\u0011\u001A\u0004\u0018\u00010\r2\'\u0010\u0017\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001A\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0018\u00A2\u0006\u0002\b\nH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010\u001B\u001AM\u0010\u0016\u001A\u00020\u00062\b\u0010\f\u001A\u0004\u0018\u00010\r2\b\u0010\u000F\u001A\u0004\u0018\u00010\r2\'\u0010\u0017\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001A\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0018\u00A2\u0006\u0002\b\nH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010\u001C\u001AC\u0010\u0016\u001A\u00020\u00062\b\u0010\f\u001A\u0004\u0018\u00010\r2\'\u0010\u0017\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001A\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0018\u00A2\u0006\u0002\b\nH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010\u001D\u001AQ\u0010\u0016\u001A\u00020\u00062\u0016\u0010\u0013\u001A\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\r0\u0014\"\u0004\u0018\u00010\r2\'\u0010\u0017\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001A\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0018\u00A2\u0006\u0002\b\nH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010\u001E\u001A9\u0010\u0016\u001A\u00020\u00062\'\u0010\u0017\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001A\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0018\u00A2\u0006\u0002\b\nH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010\u001F\u001A\u001B\u0010 \u001A\u00020\u00062\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060!H\u0007\u00A2\u0006\u0002\u0010\"\u001A\u0018\u0010#\u001A\u00020\u00192\u0006\u0010$\u001A\u00020%2\u0006\u0010&\u001A\u00020\'H\u0001\u001A&\u0010(\u001A\u00020\u00192\u0013\b\u0002\u0010)\u001A\r\u0012\u0004\u0012\u00020%0!\u00A2\u0006\u0002\b*H\u0087\b\u00F8\u0001\u0001\u00A2\u0006\u0002\u0010+\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u0002\u001A\u00020\u0003X\u0082\u0004\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u0004\u001A\u00020\u0001X\u0082T\u00A2\u0006\u0002\n\u0000\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b\u009920\u0001\u00A8\u0006,"}, d2 = {"DisposableEffectNoParamError", "", "InternalDisposableEffectScope", "Landroidx/compose/runtime/DisposableEffectScope;", "LaunchedEffectNoParamError", "DisposableEffect", "", "effect", "Lkotlin/Function1;", "Landroidx/compose/runtime/DisposableEffectResult;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "key1", "", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "key2", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "key3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "keys", "", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "LaunchedEffect", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "SideEffect", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "createCompositionCoroutineScope", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "composer", "Landroidx/compose/runtime/Composer;", "rememberCoroutineScope", "getContext", "Landroidx/compose/runtime/DisallowComposableCalls;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Lkotlinx/coroutines/CoroutineScope;", "runtime_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class EffectsKt {
    private static final String DisposableEffectNoParamError = "DisposableEffect must provide one or more \'key\' parameters that define the identity of the DisposableEffect and determine when its previous effect should be disposed and a new effect started for the new key.";
    private static final DisposableEffectScope InternalDisposableEffectScope = null;
    private static final String LaunchedEffectNoParamError = "LaunchedEffect must provide one or more \'key\' parameters that define the identity of the LaunchedEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.";

    static {
        EffectsKt.InternalDisposableEffectScope = new DisposableEffectScope();
    }

    public static final void DisposableEffect(Object object0, Object object1, Object object2, Function1 function10, Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(function10, "effect");
        composer0.startReplaceableGroup(0x234B42A8);
        ComposerKt.sourceInformation(composer0, "C(DisposableEffect)P(1,2,3)235@9981L59:Effects.kt#9igjgp");
        composer0.startReplaceableGroup(0xFFC7C131);
        ComposerKt.sourceInformation(composer0, "C(remember)P(1,2,3):Composables.kt#9igjgp");
        if((composer0.changed(object0) | composer0.changed(object1) | composer0.changed(object2)) != 0 || composer0.rememberedValue() == Composer.Companion.getEmpty()) {
            composer0.updateRememberedValue(new DisposableEffectImpl(function10));
        }
        composer0.endReplaceableGroup();
        composer0.endReplaceableGroup();
    }

    public static final void DisposableEffect(Object object0, Object object1, Function1 function10, Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(function10, "effect");
        composer0.startReplaceableGroup(0x234B3B34);
        ComposerKt.sourceInformation(composer0, "C(DisposableEffect)P(1,2)194@8057L53:Effects.kt#9igjgp");
        composer0.startReplaceableGroup(0xFFC7BF68);
        ComposerKt.sourceInformation(composer0, "C(remember)P(1,2):Composables.kt#9igjgp");
        if((composer0.changed(object0) | composer0.changed(object1)) != 0 || composer0.rememberedValue() == Composer.Companion.getEmpty()) {
            composer0.updateRememberedValue(new DisposableEffectImpl(function10));
        }
        composer0.endReplaceableGroup();
        composer0.endReplaceableGroup();
    }

    public static final void DisposableEffect(Object object0, Function1 function10, Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(function10, "effect");
        composer0.startReplaceableGroup(592131046);
        ComposerKt.sourceInformation(composer0, "C(DisposableEffect)P(1)154@6171L47:Effects.kt#9igjgp");
        composer0.startReplaceableGroup(-3686930);
        ComposerKt.sourceInformation(composer0, "C(remember)P(1):Composables.kt#9igjgp");
        if(composer0.changed(object0) || composer0.rememberedValue() == Composer.Companion.getEmpty()) {
            composer0.updateRememberedValue(new DisposableEffectImpl(function10));
        }
        composer0.endReplaceableGroup();
        composer0.endReplaceableGroup();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "DisposableEffect must provide one or more \'key\' parameters that define the identity of the DisposableEffect and determine when its previous effect should be disposed and a new effect started for the new key.")
    public static final void DisposableEffect(Function1 function10, Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(function10, "effect");
        composer0.startReplaceableGroup(0x234B2CCC);
        ComposerKt.sourceInformation(composer0, "C(DisposableEffect):Effects.kt#9igjgp");
        throw new IllegalStateException("DisposableEffect must provide one or more \'key\' parameters that define the identity of the DisposableEffect and determine when its previous effect should be disposed and a new effect started for the new key.");
    }

    public static final void DisposableEffect(Object[] arr_object, Function1 function10, Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(arr_object, "keys");
        Intrinsics.checkNotNullParameter(function10, "effect");
        composer0.startReplaceableGroup(0x234B4A29);
        ComposerKt.sourceInformation(composer0, "C(DisposableEffect)P(1)275@11877L48:Effects.kt#9igjgp");
        Object[] arr_object1 = Arrays.copyOf(arr_object, arr_object.length);
        composer0.startReplaceableGroup(-3685570);
        ComposerKt.sourceInformation(composer0, "C(remember)P(1):Composables.kt#9igjgp");
        int v1 = 0;
        boolean z;
        for(z = false; v1 < arr_object1.length; z |= composer0.changed(object0)) {
            Object object0 = arr_object1[v1];
            ++v1;
        }
        if(z || composer0.rememberedValue() == Composer.Companion.getEmpty()) {
            composer0.updateRememberedValue(new DisposableEffectImpl(function10));
        }
        composer0.endReplaceableGroup();
        composer0.endReplaceableGroup();
    }

    public static final void LaunchedEffect(Object object0, Object object1, Object object2, Function2 function20, Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(function20, "block");
        composer0.startReplaceableGroup(1036444259);
        ComposerKt.sourceInformation(composer0, "C(LaunchedEffect)P(1,2,3)383@16147L70:Effects.kt#9igjgp");
        CoroutineContext coroutineContext0 = composer0.getApplyCoroutineContext();
        composer0.startReplaceableGroup(0xFFC7C131);
        ComposerKt.sourceInformation(composer0, "C(remember)P(1,2,3):Composables.kt#9igjgp");
        if((composer0.changed(object0) | composer0.changed(object1) | composer0.changed(object2)) != 0 || composer0.rememberedValue() == Composer.Companion.getEmpty()) {
            composer0.updateRememberedValue(new LaunchedEffectImpl(coroutineContext0, function20));
        }
        composer0.endReplaceableGroup();
        composer0.endReplaceableGroup();
    }

    public static final void LaunchedEffect(Object object0, Object object1, Function2 function20, Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(function20, "block");
        composer0.startReplaceableGroup(1036443237);
        ComposerKt.sourceInformation(composer0, "C(LaunchedEffect)P(1,2)359@15109L64:Effects.kt#9igjgp");
        CoroutineContext coroutineContext0 = composer0.getApplyCoroutineContext();
        composer0.startReplaceableGroup(0xFFC7BF68);
        ComposerKt.sourceInformation(composer0, "C(remember)P(1,2):Composables.kt#9igjgp");
        if((composer0.changed(object0) | composer0.changed(object1)) != 0 || composer0.rememberedValue() == Composer.Companion.getEmpty()) {
            composer0.updateRememberedValue(new LaunchedEffectImpl(coroutineContext0, function20));
        }
        composer0.endReplaceableGroup();
        composer0.endReplaceableGroup();
    }

    public static final void LaunchedEffect(Object object0, Function2 function20, Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(function20, "block");
        composer0.startReplaceableGroup(1036442245);
        ComposerKt.sourceInformation(composer0, "C(LaunchedEffect)P(1)336@14101L58:Effects.kt#9igjgp");
        CoroutineContext coroutineContext0 = composer0.getApplyCoroutineContext();
        composer0.startReplaceableGroup(-3686930);
        ComposerKt.sourceInformation(composer0, "C(remember)P(1):Composables.kt#9igjgp");
        if(composer0.changed(object0) || composer0.rememberedValue() == Composer.Companion.getEmpty()) {
            composer0.updateRememberedValue(new LaunchedEffectImpl(coroutineContext0, function20));
        }
        composer0.endReplaceableGroup();
        composer0.endReplaceableGroup();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "LaunchedEffect must provide one or more \'key\' parameters that define the identity of the LaunchedEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.")
    public static final void LaunchedEffect(Function2 function20, Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(function20, "block");
        Composer composer1 = composer0.startRestartGroup(1036441364);
        ComposerKt.sourceInformation(composer1, "C(LaunchedEffect):Effects.kt#9igjgp");
        if((v & 1) != 0 || !composer1.getSkipping()) {
            throw new IllegalStateException("LaunchedEffect must provide one or more \'key\' parameters that define the identity of the LaunchedEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.");
        }
        composer1.skipToGroupEnd();
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new Function2(function20, v) {
                final int $$changed;
                final Function2 $block;

                {
                    this.$block = function20;
                    this.$$changed = v;
                    super(2);
                }

                @Override  // kotlin.jvm.functions.Function2
                public Object invoke(Object object0, Object object1) {
                    this.invoke(((Composer)object0), ((Number)object1).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer0, int v) {
                    EffectsKt.LaunchedEffect(this.$block, composer0, this.$$changed | 1);
                }
            });
        }
    }

    public static final void LaunchedEffect(Object[] arr_object, Function2 function20, Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(arr_object, "keys");
        Intrinsics.checkNotNullParameter(function20, "block");
        composer0.startReplaceableGroup(0x3DC6E680);
        ComposerKt.sourceInformation(composer0, "C(LaunchedEffect)P(1)406@17175L59:Effects.kt#9igjgp");
        CoroutineContext coroutineContext0 = composer0.getApplyCoroutineContext();
        Object[] arr_object1 = Arrays.copyOf(arr_object, arr_object.length);
        composer0.startReplaceableGroup(-3685570);
        ComposerKt.sourceInformation(composer0, "C(remember)P(1):Composables.kt#9igjgp");
        int v1 = 0;
        boolean z;
        for(z = false; v1 < arr_object1.length; z |= composer0.changed(object0)) {
            Object object0 = arr_object1[v1];
            ++v1;
        }
        if(z || composer0.rememberedValue() == Composer.Companion.getEmpty()) {
            composer0.updateRememberedValue(new LaunchedEffectImpl(coroutineContext0, function20));
        }
        composer0.endReplaceableGroup();
        composer0.endReplaceableGroup();
    }

    public static final void SideEffect(Function0 function00, Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(function00, "effect");
        composer0.startReplaceableGroup(-2102467972);
        ComposerKt.sourceInformation(composer0, "C(SideEffect):Effects.kt#9igjgp");
        composer0.recordSideEffect(function00);
        composer0.endReplaceableGroup();
    }

    public static final CoroutineScope createCompositionCoroutineScope(CoroutineContext coroutineContext0, Composer composer0) {
        Intrinsics.checkNotNullParameter(coroutineContext0, "coroutineContext");
        Intrinsics.checkNotNullParameter(composer0, "composer");
        if(coroutineContext0.get(Job.Key) != null) {
            CompletableJob completableJob0 = JobKt__JobKt.Job$default(null, 1, null);
            completableJob0.completeExceptionally(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
            return CoroutineScopeKt.CoroutineScope(completableJob0);
        }
        CoroutineContext coroutineContext1 = composer0.getApplyCoroutineContext();
        return CoroutineScopeKt.CoroutineScope(coroutineContext1.plus(JobKt.Job(((Job)coroutineContext1.get(Job.Key)))).plus(coroutineContext0));
    }

    public static final CoroutineScope rememberCoroutineScope(Function0 function00, Composer composer0, int v, int v1) {
        composer0.startReplaceableGroup(0xD4DFE628);
        ComposerKt.sourceInformation(composer0, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
        if((v1 & 1) != 0) {
            function00 = androidx.compose.runtime.EffectsKt.rememberCoroutineScope.1.INSTANCE;
        }
        composer0.startReplaceableGroup(0xFFC7BCB7);
        ComposerKt.sourceInformation(composer0, "C(remember):Composables.kt#9igjgp");
        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer0.rememberedValue();
        if(compositionScopedCoroutineScopeCanceller0 == Composer.Companion.getEmpty()) {
            compositionScopedCoroutineScopeCanceller0 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(((CoroutineContext)function00.invoke()), composer0));
            composer0.updateRememberedValue(compositionScopedCoroutineScopeCanceller0);
        }
        composer0.endReplaceableGroup();
        composer0.endReplaceableGroup();
        return compositionScopedCoroutineScopeCanceller0.getCoroutineScope();

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
        public final class androidx.compose.runtime.EffectsKt.rememberCoroutineScope.1 extends Lambda implements Function0 {
            public static final androidx.compose.runtime.EffectsKt.rememberCoroutineScope.1 INSTANCE;

            static {
                androidx.compose.runtime.EffectsKt.rememberCoroutineScope.1.INSTANCE = new androidx.compose.runtime.EffectsKt.rememberCoroutineScope.1();
            }

            public androidx.compose.runtime.EffectsKt.rememberCoroutineScope.1() {
                super(0);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }

            public final EmptyCoroutineContext invoke() {
                return EmptyCoroutineContext.INSTANCE;
            }
        }

    }
}

