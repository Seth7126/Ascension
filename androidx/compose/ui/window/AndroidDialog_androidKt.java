package androidx.compose.ui.window;

import android.view.View;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy.DefaultImpls;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A8\u0010\u0000\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\u0011\u0010\u0006\u001A\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0002\u0010\b\u001A*\u0010\t\u001A\u00020\u00012\b\b\u0002\u0010\n\u001A\u00020\u000B2\u0011\u0010\u0006\u001A\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0007H\u0003¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Dialog", "", "onDismissRequest", "Lkotlin/Function0;", "properties", "Landroidx/compose/ui/window/DialogProperties;", "content", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/DialogProperties;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "DialogLayout", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class AndroidDialog_androidKt {
    static {
    }

    public static final void Dialog(Function0 function00, DialogProperties dialogProperties0, Function2 function20, Composer composer0, int v, int v1) {
        DialogProperties dialogProperties2;
        DialogProperties dialogProperties3;
        LayoutDirection layoutDirection0;
        int v3;
        DialogProperties dialogProperties1;
        int v2;
        Intrinsics.checkNotNullParameter(function00, "onDismissRequest");
        Intrinsics.checkNotNullParameter(function20, "content");
        Composer composer1 = composer0.startRestartGroup(0x28657C4E);
        ComposerKt.sourceInformation(composer1, "C(Dialog)P(1,2)139@5601L7,140@5640L7,141@5695L7,142@5725L28,143@5780L29,144@5829L38,145@5885L616,166@6507L154,175@6667L193:AndroidDialog.android.kt#2oxthz");
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(function00) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v & 0x70) == 0) {
            if((v1 & 2) == 0) {
                dialogProperties1 = dialogProperties0;
                v3 = composer1.changed(dialogProperties1) ? 0x20 : 16;
            }
            else {
                dialogProperties1 = dialogProperties0;
                v3 = 16;
            }
            v2 |= v3;
        }
        else {
            dialogProperties1 = dialogProperties0;
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(function20) ? 0x100 : 0x80);
        }
        if((v2 & 731 ^ 0x92) != 0 || !composer1.getSkipping()) {
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                composer1.startDefaults();
                if((v1 & 2) != 0) {
                    dialogProperties1 = new DialogProperties(false, false, null, 7, null);
                    v2 &= 0xFFFFFF8F;
                }
                composer1.endDefaults();
            }
            else {
                composer1.skipCurrentGroup();
                if((v1 & 2) != 0) {
                    v2 &= 0xFFFFFF8F;
                }
            }
            ComposerKt.sourceInformationMarkerStart(composer1, 103361330, "C:CompositionLocal.kt#9igjgp");
            Object object0 = composer1.consume(AndroidCompositionLocals_androidKt.getLocalView());
            ComposerKt.sourceInformationMarkerEnd(composer1);
            ComposerKt.sourceInformationMarkerStart(composer1, 103361330, "C:CompositionLocal.kt#9igjgp");
            Object object1 = composer1.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(composer1);
            ComposerKt.sourceInformationMarkerStart(composer1, 103361330, "C:CompositionLocal.kt#9igjgp");
            Object object2 = composer1.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(composer1);
            CompositionContext compositionContext0 = ComposablesKt.rememberCompositionContext(composer1, 0);
            State state0 = SnapshotStateKt.rememberUpdatedState(function20, composer1, v2 >> 6 & 14);
            UUID uUID0 = (UUID)RememberSaveableKt.rememberSaveable(new Object[0], null, null, androidx.compose.ui.window.AndroidDialog_androidKt.Dialog.dialogId.1.INSTANCE, composer1, 8, 6);
            composer1.startReplaceableGroup(0xFFC7BF68);
            ComposerKt.sourceInformation(composer1, "C(remember)P(1,2):Composables.kt#9igjgp");
            boolean z = composer1.changed(((View)object0));
            boolean z1 = composer1.changed(((Density)object1));
            DialogWrapper dialogWrapper0 = composer1.rememberedValue();
            if(z || z1 || dialogWrapper0 == Composer.Companion.getEmpty()) {
                Intrinsics.checkNotNullExpressionValue(uUID0, "dialogId");
                layoutDirection0 = (LayoutDirection)object2;
                dialogProperties3 = dialogProperties1;
                dialogWrapper0 = new DialogWrapper(function00, dialogProperties1, ((View)object0), layoutDirection0, ((Density)object1), uUID0);
                dialogWrapper0.setContent(compositionContext0, ComposableLambdaKt.composableLambdaInstance(0xC541E6B0, true, new Function2(state0) {
                    final State $currentContent$delegate;

                    {
                        this.$currentContent$delegate = state0;
                        super(2);
                    }

                    @Override  // kotlin.jvm.functions.Function2
                    public Object invoke(Object object0, Object object1) {
                        this.invoke(((Composer)object0), ((Number)object1).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer0, int v) {
                        ComposerKt.sourceInformation(composer0, "C157@6330L141:AndroidDialog.android.kt#2oxthz");
                        if((v & 11 ^ 2) == 0 && composer0.getSkipping()) {
                            composer0.skipToGroupEnd();
                            return;
                        }
                        AndroidDialog_androidKt.DialogLayout(SemanticsModifierKt.semantics$default(Modifier.Companion, false, androidx.compose.ui.window.AndroidDialog_androidKt.Dialog.dialog.1.1.1.1.INSTANCE, 1, null), ComposableLambdaKt.composableLambda(composer0, 0xCF217F81, true, new Function2() {
                            final State $currentContent$delegate;

                            {
                                this.$currentContent$delegate = state0;
                                super(2);
                            }

                            @Override  // kotlin.jvm.functions.Function2
                            public Object invoke(Object object0, Object object1) {
                                this.invoke(((Composer)object0), ((Number)object1).intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer0, int v) {
                                ComposerKt.sourceInformation(composer0, "C160@6437L16:AndroidDialog.android.kt#2oxthz");
                                if((v & 11 ^ 2) == 0 && composer0.getSkipping()) {
                                    composer0.skipToGroupEnd();
                                    return;
                                }
                                AndroidDialog_androidKt.Dialog$lambda-0(this.$currentContent$delegate).invoke(composer0, 0);
                            }
                        }), composer0, 0x30, 0);

                        @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
                        final class androidx.compose.ui.window.AndroidDialog_androidKt.Dialog.dialog.1.1.1.1 extends Lambda implements Function1 {
                            public static final androidx.compose.ui.window.AndroidDialog_androidKt.Dialog.dialog.1.1.1.1 INSTANCE;

                            static {
                                androidx.compose.ui.window.AndroidDialog_androidKt.Dialog.dialog.1.1.1.1.INSTANCE = new androidx.compose.ui.window.AndroidDialog_androidKt.Dialog.dialog.1.1.1.1();
                            }

                            androidx.compose.ui.window.AndroidDialog_androidKt.Dialog.dialog.1.1.1.1() {
                                super(1);
                            }

                            @Override  // kotlin.jvm.functions.Function1
                            public Object invoke(Object object0) {
                                this.invoke(((SemanticsPropertyReceiver)object0));
                                return Unit.INSTANCE;
                            }

                            public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
                                Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "$this$semantics");
                                SemanticsPropertiesKt.dialog(semanticsPropertyReceiver0);
                            }
                        }

                    }
                }));
                composer1.updateRememberedValue(dialogWrapper0);
            }
            else {
                layoutDirection0 = (LayoutDirection)object2;
                dialogProperties3 = dialogProperties1;
            }
            composer1.endReplaceableGroup();
            EffectsKt.DisposableEffect(dialogWrapper0, new Function1(dialogWrapper0) {
                final DialogWrapper $dialog;

                {
                    this.$dialog = dialogWrapper0;
                    super(1);
                }

                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope0) {
                    Intrinsics.checkNotNullParameter(disposableEffectScope0, "$this$DisposableEffect");
                    this.$dialog.show();
                    return new DisposableEffectResult() {
                        @Override  // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            this.$dialog$inlined.dismiss();
                            this.$dialog$inlined.disposeComposition();
                        }
                    };
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.invoke(((DisposableEffectScope)object0));
                }
            }, composer1, 8);
            EffectsKt.SideEffect(new Function0(dialogWrapper0, function00, dialogProperties3, layoutDirection0) {
                final DialogWrapper $dialog;
                final LayoutDirection $layoutDirection;
                final Function0 $onDismissRequest;
                final DialogProperties $properties;

                {
                    this.$dialog = dialogWrapper0;
                    this.$onDismissRequest = function00;
                    this.$properties = dialogProperties0;
                    this.$layoutDirection = layoutDirection0;
                    super(0);
                }

                @Override  // kotlin.jvm.functions.Function0
                public Object invoke() {
                    this.invoke();
                    return Unit.INSTANCE;
                }

                public final void invoke() {
                    this.$dialog.updateParameters(this.$onDismissRequest, this.$properties, this.$layoutDirection);
                }
            }, composer1, 0);
            dialogProperties2 = dialogProperties3;
        }
        else {
            composer1.skipToGroupEnd();
            dialogProperties2 = dialogProperties1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new Function2(function00, dialogProperties2, function20, v, v1) {
                final int $$changed;
                final int $$default;
                final Function2 $content;
                final Function0 $onDismissRequest;
                final DialogProperties $properties;

                {
                    this.$onDismissRequest = function00;
                    this.$properties = dialogProperties0;
                    this.$content = function20;
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
                    AndroidDialog_androidKt.Dialog(this.$onDismissRequest, this.$properties, this.$content, composer0, this.$$changed | 1, this.$$default);
                }
            });
        }

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
        final class androidx.compose.ui.window.AndroidDialog_androidKt.Dialog.dialogId.1 extends Lambda implements Function0 {
            public static final androidx.compose.ui.window.AndroidDialog_androidKt.Dialog.dialogId.1 INSTANCE;

            static {
                androidx.compose.ui.window.AndroidDialog_androidKt.Dialog.dialogId.1.INSTANCE = new androidx.compose.ui.window.AndroidDialog_androidKt.Dialog.dialogId.1();
            }

            androidx.compose.ui.window.AndroidDialog_androidKt.Dialog.dialogId.1() {
                super(0);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }

            public final UUID invoke() {
                return UUID.randomUUID();
            }
        }

    }

    private static final Function2 Dialog$lambda-0(State state0) {
        return (Function2)state0.getValue();
    }

    private static final void DialogLayout(Modifier modifier0, Function2 function20, Composer composer0, int v, int v1) {
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x784FC8CC);
        ComposerKt.sourceInformation(composer1, "C(DialogLayout)P(1)399@14948L455:AndroidDialog.android.kt#2oxthz");
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(function20) ? 0x20 : 16);
        }
        if((v2 & 91 ^ 18) != 0 || !composer1.getSkipping()) {
            if((v1 & 1) != 0) {
                modifier0 = Modifier.Companion;
            }
            MeasurePolicy measurePolicy0 = androidx.compose.ui.window.AndroidDialog_androidKt.DialogLayout.1.INSTANCE;
            composer1.startReplaceableGroup(0x520574F7);
            ComposerKt.sourceInformation(composer1, "C(Layout)P(!1,2)71@2788L7,72@2843L7,73@2855L389:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(composer1, 103361330, "C:CompositionLocal.kt#9igjgp");
            Object object0 = composer1.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(composer1);
            ComposerKt.sourceInformationMarkerStart(composer1, 103361330, "C:CompositionLocal.kt#9igjgp");
            Object object1 = composer1.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(composer1);
            Function0 function00 = ComposeUiNode.Companion.getConstructor();
            Function3 function30 = LayoutKt.materializerOf(modifier0);
            int v3 = (v2 << 3 & 0x70 | v2 >> 3 & 14) << 9 & 0x1C00;
            if(!(composer1.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function00);
            }
            else {
                composer1.useNode();
            }
            composer1.disableReusing();
            Composer composer2 = Updater.constructor-impl(composer1);
            Updater.set-impl(composer2, measurePolicy0, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer2, ((Density)object0), ComposeUiNode.Companion.getSetDensity());
            Updater.set-impl(composer2, ((LayoutDirection)object1), ComposeUiNode.Companion.getSetLayoutDirection());
            composer1.enableReusing();
            function30.invoke(SkippableUpdater.box-impl(SkippableUpdater.constructor-impl(composer1)), composer1, ((int)(v3 >> 3 & 0x70)));
            composer1.startReplaceableGroup(2058660585);
            function20.invoke(composer1, ((int)(v3 >> 9 & 14)));
            composer1.endReplaceableGroup();
            composer1.endNode();
            composer1.endReplaceableGroup();
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new Function2(modifier0, function20, v, v1) {
                final int $$changed;
                final int $$default;
                final Function2 $content;
                final Modifier $modifier;

                {
                    this.$modifier = modifier0;
                    this.$content = function20;
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
                    AndroidDialog_androidKt.DialogLayout(this.$modifier, this.$content, composer0, this.$$changed | 1, this.$$default);
                }
            });
        }

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
        final class androidx.compose.ui.window.AndroidDialog_androidKt.DialogLayout.1 implements MeasurePolicy {
            public static final androidx.compose.ui.window.AndroidDialog_androidKt.DialogLayout.1 INSTANCE;

            static {
                androidx.compose.ui.window.AndroidDialog_androidKt.DialogLayout.1.INSTANCE = new androidx.compose.ui.window.AndroidDialog_androidKt.DialogLayout.1();
            }

            androidx.compose.ui.window.AndroidDialog_androidKt.DialogLayout.1() {
                super();
            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
                return DefaultImpls.maxIntrinsicHeight(this, intrinsicMeasureScope0, list0, v);
            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
                return DefaultImpls.maxIntrinsicWidth(this, intrinsicMeasureScope0, list0, v);
            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, List list0, long v) {
                Object object2;
                Object object0;
                Intrinsics.checkNotNullParameter(measureScope0, "$this$Layout");
                Intrinsics.checkNotNullParameter(list0, "measurables");
                ArrayList arrayList0 = new ArrayList(list0.size());
                int v1 = list0.size();
                if(v1 - 1 >= 0) {
                    for(int v2 = 0; true; ++v2) {
                        arrayList0.add(((Measurable)list0.get(v2)).measure-BRTryo0(v));
                        if(v2 + 1 > v1 - 1) {
                            break;
                        }
                    }
                }
                Integer integer0 = null;
                if(arrayList0.isEmpty()) {
                    object0 = null;
                }
                else {
                    object0 = arrayList0.get(0);
                    int v4 = ((Placeable)object0).getWidth();
                    int v5 = CollectionsKt.getLastIndex(arrayList0);
                    if(1 <= v5) {
                        for(int v6 = 1; true; ++v6) {
                            Object object1 = arrayList0.get(v6);
                            int v7 = ((Placeable)object1).getWidth();
                            if(v4 < v7) {
                                object0 = object1;
                                v4 = v7;
                            }
                            if(v6 == v5) {
                                break;
                            }
                        }
                    }
                }
                Integer integer1 = ((Placeable)object0) == null ? null : ((Placeable)object0).getWidth();
                int v8 = integer1 == null ? Constraints.getMinWidth-impl(v) : ((int)integer1);
                if(arrayList0.isEmpty()) {
                    object2 = null;
                }
                else {
                    object2 = arrayList0.get(0);
                    int v9 = ((Placeable)object2).getHeight();
                    int v10 = CollectionsKt.getLastIndex(arrayList0);
                    if(1 <= v10) {
                        for(int v3 = 1; true; ++v3) {
                            Object object3 = arrayList0.get(v3);
                            int v11 = ((Placeable)object3).getHeight();
                            if(v9 < v11) {
                                object2 = object3;
                                v9 = v11;
                            }
                            if(v3 == v10) {
                                break;
                            }
                        }
                    }
                }
                if(((Placeable)object2) != null) {
                    integer0 = ((Placeable)object2).getHeight();
                }
                return integer0 == null ? androidx.compose.ui.layout.MeasureScope.DefaultImpls.layout$default(measureScope0, v8, Constraints.getMinHeight-impl(v), null, new Function1() {
                    final List $placeables;

                    {
                        this.$placeables = list0;
                        super(1);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.invoke(((PlacementScope)object0));
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PlacementScope placeable$PlacementScope0) {
                        Intrinsics.checkNotNullParameter(placeable$PlacementScope0, "$this$layout");
                        List list0 = this.$placeables;
                        int v = list0.size();
                        if(v - 1 >= 0) {
                            for(int v1 = 0; true; ++v1) {
                                PlacementScope.placeRelative$default(placeable$PlacementScope0, ((Placeable)list0.get(v1)), 0, 0, 0.0f, 4, null);
                                if(v1 + 1 > v - 1) {
                                    break;
                                }
                            }
                        }
                    }
                }, 4, null) : androidx.compose.ui.layout.MeasureScope.DefaultImpls.layout$default(measureScope0, v8, ((int)integer0), null, new Function1() {
                    final List $placeables;

                    {
                        this.$placeables = list0;
                        super(1);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.invoke(((PlacementScope)object0));
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PlacementScope placeable$PlacementScope0) {
                        Intrinsics.checkNotNullParameter(placeable$PlacementScope0, "$this$layout");
                        List list0 = this.$placeables;
                        int v = list0.size();
                        if(v - 1 >= 0) {
                            for(int v1 = 0; true; ++v1) {
                                PlacementScope.placeRelative$default(placeable$PlacementScope0, ((Placeable)list0.get(v1)), 0, 0, 0.0f, 4, null);
                                if(v1 + 1 > v - 1) {
                                    break;
                                }
                            }
                        }
                    }
                }, 4, null);
            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
                return DefaultImpls.minIntrinsicHeight(this, intrinsicMeasureScope0, list0, v);
            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
                return DefaultImpls.minIntrinsicWidth(this, intrinsicMeasureScope0, list0, v);
            }
        }

    }
}

