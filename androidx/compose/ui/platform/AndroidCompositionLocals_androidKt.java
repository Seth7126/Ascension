package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000E\n\u0000\u001A(\u0010\u0011\u001A\u00020\u00122\u0006\u0010\u0013\u001A\u00020\u00142\u0011\u0010\u0015\u001A\r\u0012\u0004\u0012\u00020\u00120\u0016¢\u0006\u0002\b\u0017H\u0001¢\u0006\u0002\u0010\u0018\u001A\u0010\u0010\u0019\u001A\u00020\u001A2\u0006\u0010\u001B\u001A\u00020\u001CH\u0002\"\u0017\u0010\u0000\u001A\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001A\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00060\u0001¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\u0004\"\u0017\u0010\b\u001A\b\u0012\u0004\u0012\u00020\t0\u0001¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u0004\"\u0017\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\f0\u0001¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u0004\"\u0017\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\u000F0\u0001¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u0004¨\u0006\u001D"}, d2 = {"LocalConfiguration", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroid/content/res/Configuration;", "getLocalConfiguration", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalContext", "Landroid/content/Context;", "getLocalContext", "LocalLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "getLocalLifecycleOwner", "LocalSavedStateRegistryOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "getLocalSavedStateRegistryOwner", "LocalView", "Landroid/view/View;", "getLocalView", "ProvideAndroidCompositionLocals", "", "owner", "Landroidx/compose/ui/platform/AndroidComposeView;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/platform/AndroidComposeView;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "noLocalProvidedFor", "", "name", "", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class AndroidCompositionLocals_androidKt {
    private static final ProvidableCompositionLocal LocalConfiguration;
    private static final ProvidableCompositionLocal LocalContext;
    private static final ProvidableCompositionLocal LocalLifecycleOwner;
    private static final ProvidableCompositionLocal LocalSavedStateRegistryOwner;
    private static final ProvidableCompositionLocal LocalView;

    static {
        AndroidCompositionLocals_androidKt.LocalConfiguration = CompositionLocalKt.compositionLocalOf(SnapshotStateKt.neverEqualPolicy(), AndroidCompositionLocals_androidKt.LocalConfiguration.1.INSTANCE);
        AndroidCompositionLocals_androidKt.LocalContext = CompositionLocalKt.staticCompositionLocalOf(AndroidCompositionLocals_androidKt.LocalContext.1.INSTANCE);
        AndroidCompositionLocals_androidKt.LocalLifecycleOwner = CompositionLocalKt.staticCompositionLocalOf(AndroidCompositionLocals_androidKt.LocalLifecycleOwner.1.INSTANCE);
        AndroidCompositionLocals_androidKt.LocalSavedStateRegistryOwner = CompositionLocalKt.staticCompositionLocalOf(AndroidCompositionLocals_androidKt.LocalSavedStateRegistryOwner.1.INSTANCE);
        AndroidCompositionLocals_androidKt.LocalView = CompositionLocalKt.staticCompositionLocalOf(AndroidCompositionLocals_androidKt.LocalView.1.INSTANCE);
    }

    public static final void ProvideAndroidCompositionLocals(AndroidComposeView androidComposeView0, Function2 function20, Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(androidComposeView0, "owner");
        Intrinsics.checkNotNullParameter(function20, "content");
        Composer composer1 = composer0.startRestartGroup(0xEBB1E3A0);
        ComposerKt.sourceInformation(composer1, "C(ProvideAndroidCompositionLocals)P(1)82@2683L126,89@2851L22,91@2896L39,96@3136L102,99@3243L104,105@3353L532:AndroidCompositionLocals.android.kt#itgzvw");
        Context context0 = androidComposeView0.getContext();
        composer1.startReplaceableGroup(0xFFC7BCB7);
        ComposerKt.sourceInformation(composer1, "C(remember):Composables.kt#9igjgp");
        MutableState mutableState0 = composer1.rememberedValue();
        if(mutableState0 == Composer.Companion.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf(context0.getResources().getConfiguration(), SnapshotStateKt.neverEqualPolicy());
            composer1.updateRememberedValue(mutableState0);
        }
        composer1.endReplaceableGroup();
        composer1.startReplaceableGroup(-3686930);
        ComposerKt.sourceInformation(composer1, "C(remember)P(1):Composables.kt#9igjgp");
        boolean z = composer1.changed(mutableState0);
        androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.ProvideAndroidCompositionLocals.1.1 androidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$1$10 = composer1.rememberedValue();
        if(z || androidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$1$10 == Composer.Companion.getEmpty()) {
            androidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$1$10 = new Function1(mutableState0) {
                final MutableState $configuration$delegate;

                {
                    this.$configuration$delegate = mutableState0;
                    super(1);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.invoke(((Configuration)object0));
                    return Unit.INSTANCE;
                }

                public final void invoke(Configuration configuration0) {
                    Intrinsics.checkNotNullParameter(configuration0, "it");
                    AndroidCompositionLocals_androidKt.ProvideAndroidCompositionLocals$lambda-2(this.$configuration$delegate, configuration0);
                }
            };
            composer1.updateRememberedValue(androidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$1$10);
        }
        composer1.endReplaceableGroup();
        androidComposeView0.setConfigurationChangeObserver(androidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$1$10);
        composer1.startReplaceableGroup(0xFFC7BCB7);
        ComposerKt.sourceInformation(composer1, "C(remember):Composables.kt#9igjgp");
        AndroidUriHandler androidUriHandler0 = composer1.rememberedValue();
        if(androidUriHandler0 == Composer.Companion.getEmpty()) {
            Intrinsics.checkNotNullExpressionValue(context0, "context");
            androidUriHandler0 = new AndroidUriHandler(context0);
            composer1.updateRememberedValue(androidUriHandler0);
        }
        composer1.endReplaceableGroup();
        ViewTreeOwners androidComposeView$ViewTreeOwners0 = androidComposeView0.getViewTreeOwners();
        if(androidComposeView$ViewTreeOwners0 == null) {
            throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
        }
        composer1.startReplaceableGroup(0xFFC7BCB7);
        ComposerKt.sourceInformation(composer1, "C(remember):Composables.kt#9igjgp");
        DisposableSaveableStateRegistry disposableSaveableStateRegistry0 = composer1.rememberedValue();
        if(disposableSaveableStateRegistry0 == Composer.Companion.getEmpty()) {
            disposableSaveableStateRegistry0 = DisposableSaveableStateRegistry_androidKt.DisposableSaveableStateRegistry(androidComposeView0, androidComposeView$ViewTreeOwners0.getSavedStateRegistryOwner());
            composer1.updateRememberedValue(disposableSaveableStateRegistry0);
        }
        composer1.endReplaceableGroup();
        Function1 function10 = new Function1(disposableSaveableStateRegistry0) {
            final DisposableSaveableStateRegistry $saveableStateRegistry;

            {
                this.$saveableStateRegistry = disposableSaveableStateRegistry0;
                super(1);
            }

            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope0) {
                Intrinsics.checkNotNullParameter(disposableEffectScope0, "$this$DisposableEffect");
                return new DisposableEffectResult() {
                    @Override  // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        this.$saveableStateRegistry$inlined.dispose();
                    }
                };
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((DisposableEffectScope)object0));
            }
        };
        EffectsKt.DisposableEffect(Unit.INSTANCE, function10, composer1, 0);
        ProvidedValue[] arr_providedValue = new ProvidedValue[6];
        Configuration configuration0 = AndroidCompositionLocals_androidKt.ProvideAndroidCompositionLocals$lambda-1(mutableState0);
        Intrinsics.checkNotNullExpressionValue(configuration0, "configuration");
        arr_providedValue[0] = AndroidCompositionLocals_androidKt.LocalConfiguration.provides(configuration0);
        Intrinsics.checkNotNullExpressionValue(context0, "context");
        arr_providedValue[1] = AndroidCompositionLocals_androidKt.LocalContext.provides(context0);
        arr_providedValue[2] = AndroidCompositionLocals_androidKt.LocalLifecycleOwner.provides(androidComposeView$ViewTreeOwners0.getLifecycleOwner());
        arr_providedValue[3] = AndroidCompositionLocals_androidKt.LocalSavedStateRegistryOwner.provides(androidComposeView$ViewTreeOwners0.getSavedStateRegistryOwner());
        arr_providedValue[4] = SaveableStateRegistryKt.getLocalSaveableStateRegistry().provides(disposableSaveableStateRegistry0);
        arr_providedValue[5] = AndroidCompositionLocals_androidKt.LocalView.provides(androidComposeView0);
        CompositionLocalKt.CompositionLocalProvider(arr_providedValue, ComposableLambdaKt.composableLambda(composer1, 0xCF216818, true, new Function2(androidComposeView0, androidUriHandler0, function20, v) {
            final int $$dirty;
            final Function2 $content;
            final AndroidComposeView $owner;
            final AndroidUriHandler $uriHandler;

            {
                this.$owner = androidComposeView0;
                this.$uriHandler = androidUriHandler0;
                this.$content = function20;
                this.$$dirty = v;
                super(2);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                this.invoke(((Composer)object0), ((Number)object1).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer0, int v) {
                ComposerKt.sourceInformation(composer0, "C113@3744L135:AndroidCompositionLocals.android.kt#itgzvw");
                if((v & 11 ^ 2) == 0 && composer0.getSkipping()) {
                    composer0.skipToGroupEnd();
                    return;
                }
                CompositionLocalsKt.ProvideCommonCompositionLocals(this.$owner, this.$uriHandler, this.$content, composer0, this.$$dirty << 3 & 0x380 | 72);
            }
        }), composer1, 56);
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new Function2(androidComposeView0, function20, v) {
                final int $$changed;
                final Function2 $content;
                final AndroidComposeView $owner;

                {
                    this.$owner = androidComposeView0;
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
                    AndroidCompositionLocals_androidKt.ProvideAndroidCompositionLocals(this.$owner, this.$content, composer0, this.$$changed | 1);
                }
            });
        }
    }

    private static final Configuration ProvideAndroidCompositionLocals$lambda-1(MutableState mutableState0) {
        return (Configuration)mutableState0.getValue();
    }

    private static final void ProvideAndroidCompositionLocals$lambda-2(MutableState mutableState0, Configuration configuration0) {
        mutableState0.setValue(configuration0);
    }

    public static final ProvidableCompositionLocal getLocalConfiguration() {
        return AndroidCompositionLocals_androidKt.LocalConfiguration;
    }

    public static final ProvidableCompositionLocal getLocalContext() {
        return AndroidCompositionLocals_androidKt.LocalContext;
    }

    public static final ProvidableCompositionLocal getLocalLifecycleOwner() {
        return AndroidCompositionLocals_androidKt.LocalLifecycleOwner;
    }

    public static final ProvidableCompositionLocal getLocalSavedStateRegistryOwner() {
        return AndroidCompositionLocals_androidKt.LocalSavedStateRegistryOwner;
    }

    public static final ProvidableCompositionLocal getLocalView() {
        return AndroidCompositionLocals_androidKt.LocalView;
    }

    private static final Void noLocalProvidedFor(String s) {
        throw new IllegalStateException(("CompositionLocal " + s + " not present").toString());
    }
}

