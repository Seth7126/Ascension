package androidx.compose.ui.window;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager.LayoutParams;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy.DefaultImpls;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.IntSize;
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
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001AX\u0010\u0005\u001A\u00020\u00062\b\b\u0002\u0010\u0007\u001A\u00020\b2\b\b\u0002\u0010\t\u001A\u00020\n2\u0010\b\u0002\u0010\u000B\u001A\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f2\b\b\u0002\u0010\r\u001A\u00020\u000E2\u0011\u0010\u000F\u001A\r\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0002\b\u0010H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001AD\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0013\u001A\u00020\u00142\u0010\b\u0002\u0010\u000B\u001A\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f2\b\b\u0002\u0010\r\u001A\u00020\u000E2\u0011\u0010\u000F\u001A\r\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u0015\u001A(\u0010\u0016\u001A\u00020\u00062\u0006\u0010\u0017\u001A\u00020\u00022\u0011\u0010\u000F\u001A\r\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0002\b\u0010H\u0001¢\u0006\u0002\u0010\u0018\u001A+\u0010\u0019\u001A\u00020\u00062\u0006\u0010\u001A\u001A\u00020\u001B2\u0013\b\b\u0010\u000F\u001A\r\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0002\b\u0010H\u0083\b¢\u0006\u0002\u0010\u001C\u001A\u001A\u0010\u001D\u001A\u00020\u001E2\u0006\u0010\u001F\u001A\u00020 2\n\b\u0002\u0010!\u001A\u0004\u0018\u00010\u0002\u001A\f\u0010\"\u001A\u00020\u001E*\u00020 H\u0000\"\u001A\u0010\u0000\u001A\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0003\u0010\u0004\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006#"}, d2 = {"LocalPopupTestTag", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "getLocalPopupTestTag", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "Popup", "", "alignment", "Landroidx/compose/ui/Alignment;", "offset", "Landroidx/compose/ui/unit/IntOffset;", "onDismissRequest", "Lkotlin/Function0;", "properties", "Landroidx/compose/ui/window/PopupProperties;", "content", "Landroidx/compose/runtime/Composable;", "Popup-K5zGePQ", "(Landroidx/compose/ui/Alignment;JLkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "popupPositionProvider", "Landroidx/compose/ui/window/PopupPositionProvider;", "(Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "PopupTestTag", "tag", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "SimpleStack", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "isPopupLayout", "", "view", "Landroid/view/View;", "testTag", "isFlagSecureEnabled", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class AndroidPopup_androidKt {
    private static final ProvidableCompositionLocal LocalPopupTestTag;

    static {
        AndroidPopup_androidKt.LocalPopupTestTag = CompositionLocalKt.compositionLocalOf$default(null, AndroidPopup_androidKt.LocalPopupTestTag.1.INSTANCE, 1, null);
    }

    public static final void Popup(PopupPositionProvider popupPositionProvider0, Function0 function00, PopupProperties popupProperties0, Function2 function20, Composer composer0, int v, int v1) {
        LayoutDirection layoutDirection0;
        PopupProperties popupProperties2;
        Function0 function02;
        int v4;
        PopupProperties popupProperties3;
        int v3;
        PopupProperties popupProperties1;
        Function0 function01;
        int v2;
        Intrinsics.checkNotNullParameter(popupPositionProvider0, "popupPositionProvider");
        Intrinsics.checkNotNullParameter(function20, "content");
        Composer composer1 = composer0.startRestartGroup(0x3F6DB497);
        ComposerKt.sourceInformation(composer1, "C(Popup)P(2,1,3)216@9053L7,217@9092L7,218@9136L7,219@9191L7,220@9227L28,221@9282L29,222@9330L38,223@9391L944,251@10341L417,266@10764L229,275@10999L166,284@11343L647:AndroidPopup.android.kt#2oxthz");
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(popupPositionProvider0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
            function01 = function00;
        }
        else if((v & 0x70) == 0) {
            function01 = function00;
            v2 |= (composer1.changed(function01) ? 0x20 : 16);
        }
        else {
            function01 = function00;
        }
        if((v & 0x380) == 0) {
            if((v1 & 4) == 0) {
                popupProperties1 = popupProperties0;
                v3 = composer1.changed(popupProperties1) ? 0x100 : 0x80;
            }
            else {
                popupProperties1 = popupProperties0;
                v3 = 0x80;
            }
            v2 |= v3;
        }
        else {
            popupProperties1 = popupProperties0;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changed(function20) ? 0x800 : 0x400);
        }
        if((v2 & 5851 ^ 1170) != 0 || !composer1.getSkipping()) {
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                composer1.startDefaults();
                if((v1 & 4) == 0) {
                    popupProperties3 = popupProperties1;
                }
                else {
                    popupProperties3 = new PopupProperties(false, false, false, null, false, false, 0x3F, null);
                    v2 &= -897;
                }
                composer1.endDefaults();
                v4 = v2;
                function02 = (v1 & 2) == 0 ? function01 : null;
                popupProperties2 = popupProperties3;
            }
            else {
                composer1.skipCurrentGroup();
                if((v1 & 4) != 0) {
                    v2 &= -897;
                }
                v4 = v2;
                function02 = function01;
                popupProperties2 = popupProperties1;
            }
            ComposerKt.sourceInformationMarkerStart(composer1, 103361330, "C:CompositionLocal.kt#9igjgp");
            Object object0 = composer1.consume(AndroidCompositionLocals_androidKt.getLocalView());
            ComposerKt.sourceInformationMarkerEnd(composer1);
            ComposerKt.sourceInformationMarkerStart(composer1, 103361330, "C:CompositionLocal.kt#9igjgp");
            Object object1 = composer1.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(composer1);
            ComposerKt.sourceInformationMarkerStart(composer1, 103361330, "C:CompositionLocal.kt#9igjgp");
            Object object2 = composer1.consume(AndroidPopup_androidKt.LocalPopupTestTag);
            ComposerKt.sourceInformationMarkerEnd(composer1);
            ComposerKt.sourceInformationMarkerStart(composer1, 103361330, "C:CompositionLocal.kt#9igjgp");
            Object object3 = composer1.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(composer1);
            CompositionContext compositionContext0 = ComposablesKt.rememberCompositionContext(composer1, 0);
            State state0 = SnapshotStateKt.rememberUpdatedState(function20, composer1, v4 >> 9 & 14);
            Object object4 = RememberSaveableKt.rememberSaveable(new Object[0], null, null, androidx.compose.ui.window.AndroidPopup_androidKt.Popup.popupId.1.INSTANCE, composer1, 8, 6);
            composer1.startReplaceableGroup(0xFFC7BCB7);
            ComposerKt.sourceInformation(composer1, "C(remember):Composables.kt#9igjgp");
            PopupLayout popupLayout0 = composer1.rememberedValue();
            if(popupLayout0 == Composer.Companion.getEmpty()) {
                Intrinsics.checkNotNullExpressionValue(((UUID)object4), "popupId");
                layoutDirection0 = (LayoutDirection)object3;
                PopupLayout popupLayout1 = new PopupLayout(function02, popupProperties2, ((String)object2), ((View)object0), ((Density)object1), popupPositionProvider0, ((UUID)object4));
                popupLayout1.setContent(compositionContext0, ComposableLambdaKt.composableLambdaInstance(-985540775, true, new Function2(popupLayout1, state0) {
                    final State $currentContent$delegate;
                    final PopupLayout $this_apply;

                    {
                        this.$this_apply = popupLayout0;
                        this.$currentContent$delegate = state0;
                        super(2);
                    }

                    @Override  // kotlin.jvm.functions.Function2
                    public Object invoke(Object object0, Object object1) {
                        this.invoke(((Composer)object0), ((Number)object1).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer0, int v) {
                        ComposerKt.sourceInformation(composer0, "C234@9772L533:AndroidPopup.android.kt#2oxthz");
                        if((v & 11 ^ 2) == 0 && composer0.getSkipping()) {
                            composer0.skipToGroupEnd();
                            return;
                        }
                        Modifier modifier0 = AlphaKt.alpha(OnRemeasuredModifierKt.onSizeChanged(SemanticsModifierKt.semantics$default(Modifier.Companion, false, androidx.compose.ui.window.AndroidPopup_androidKt.Popup.popupLayout.1.1.1.1.INSTANCE, 1, null), new Function1() {
                            final PopupLayout $this_apply;

                            {
                                this.$this_apply = popupLayout0;
                                super(1);
                            }

                            @Override  // kotlin.jvm.functions.Function1
                            public Object invoke(Object object0) {
                                this.invoke-ozmzZPI(((IntSize)object0).unbox-impl());
                                return Unit.INSTANCE;
                            }

                            public final void invoke-ozmzZPI(long v) {
                                IntSize intSize0 = IntSize.box-impl(v);
                                this.$this_apply.setPopupContentSize-fhxjrPA(intSize0);
                                this.$this_apply.updatePosition();
                            }
                        }), (this.$this_apply.getCanCalculatePosition() ? 1.0f : 0.0f));
                        Function2 function20 = ComposableLambdaKt.composableLambda(composer0, -819900793, true, new Function2() {
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
                                ComposerKt.sourceInformation(composer0, "C245@10271L16:AndroidPopup.android.kt#2oxthz");
                                if((v & 11 ^ 2) == 0 && composer0.getSkipping()) {
                                    composer0.skipToGroupEnd();
                                    return;
                                }
                                AndroidPopup_androidKt.Popup$lambda-1(this.$currentContent$delegate).invoke(composer0, 0);
                            }
                        });
                        composer0.startReplaceableGroup(0x5CFD759A);
                        ComposerKt.sourceInformation(composer0, "C(SimpleStack)P(1)318@12703L979:AndroidPopup.android.kt#2oxthz");
                        MeasurePolicy measurePolicy0 = androidx.compose.ui.window.AndroidPopup_androidKt.SimpleStack.1.INSTANCE;
                        composer0.startReplaceableGroup(0x520574F7);
                        ComposerKt.sourceInformation(composer0, "C(Layout)P(!1,2)71@2788L7,72@2843L7,73@2855L389:Layout.kt#80mrfh");
                        ComposerKt.sourceInformationMarkerStart(composer0, 103361330, "C:CompositionLocal.kt#9igjgp");
                        Object object0 = composer0.consume(CompositionLocalsKt.getLocalDensity());
                        ComposerKt.sourceInformationMarkerEnd(composer0);
                        ComposerKt.sourceInformationMarkerStart(composer0, 103361330, "C:CompositionLocal.kt#9igjgp");
                        Object object1 = composer0.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposerKt.sourceInformationMarkerEnd(composer0);
                        Function0 function00 = ComposeUiNode.Companion.getConstructor();
                        Function3 function30 = LayoutKt.materializerOf(modifier0);
                        if(!(composer0.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer0.startReusableNode();
                        if(composer0.getInserting()) {
                            composer0.createNode(function00);
                        }
                        else {
                            composer0.useNode();
                        }
                        composer0.disableReusing();
                        Composer composer1 = Updater.constructor-impl(composer0);
                        Updater.set-impl(composer1, measurePolicy0, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.set-impl(composer1, ((Density)object0), ComposeUiNode.Companion.getSetDensity());
                        Updater.set-impl(composer1, ((LayoutDirection)object1), ComposeUiNode.Companion.getSetLayoutDirection());
                        composer0.enableReusing();
                        function30.invoke(SkippableUpdater.box-impl(SkippableUpdater.constructor-impl(composer0)), composer0, 0);
                        composer0.startReplaceableGroup(2058660585);
                        function20.invoke(composer0, 6);
                        composer0.endReplaceableGroup();
                        composer0.endNode();
                        composer0.endReplaceableGroup();
                        composer0.endReplaceableGroup();

                        @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
                        final class androidx.compose.ui.window.AndroidPopup_androidKt.Popup.popupLayout.1.1.1.1 extends Lambda implements Function1 {
                            public static final androidx.compose.ui.window.AndroidPopup_androidKt.Popup.popupLayout.1.1.1.1 INSTANCE;

                            static {
                                androidx.compose.ui.window.AndroidPopup_androidKt.Popup.popupLayout.1.1.1.1.INSTANCE = new androidx.compose.ui.window.AndroidPopup_androidKt.Popup.popupLayout.1.1.1.1();
                            }

                            androidx.compose.ui.window.AndroidPopup_androidKt.Popup.popupLayout.1.1.1.1() {
                                super(1);
                            }

                            @Override  // kotlin.jvm.functions.Function1
                            public Object invoke(Object object0) {
                                this.invoke(((SemanticsPropertyReceiver)object0));
                                return Unit.INSTANCE;
                            }

                            public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
                                Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "$this$semantics");
                                SemanticsPropertiesKt.popup(semanticsPropertyReceiver0);
                            }
                        }

                    }
                }));
                composer1.updateRememberedValue(popupLayout1);
                popupLayout0 = popupLayout1;
            }
            else {
                layoutDirection0 = (LayoutDirection)object3;
            }
            composer1.endReplaceableGroup();
            EffectsKt.DisposableEffect(popupLayout0, new Function1(popupLayout0, function02, popupProperties2, ((String)object2), layoutDirection0) {
                final LayoutDirection $layoutDirection;
                final Function0 $onDismissRequest;
                final PopupLayout $popupLayout;
                final PopupProperties $properties;
                final String $testTag;

                {
                    this.$popupLayout = popupLayout0;
                    this.$onDismissRequest = function00;
                    this.$properties = popupProperties0;
                    this.$testTag = s;
                    this.$layoutDirection = layoutDirection0;
                    super(1);
                }

                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope0) {
                    Intrinsics.checkNotNullParameter(disposableEffectScope0, "$this$DisposableEffect");
                    this.$popupLayout.show();
                    this.$popupLayout.updateParameters(this.$onDismissRequest, this.$properties, this.$testTag, this.$layoutDirection);
                    return new DisposableEffectResult() {
                        @Override  // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            this.$popupLayout$inlined.disposeComposition();
                            this.$popupLayout$inlined.dismiss();
                        }
                    };
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.invoke(((DisposableEffectScope)object0));
                }
            }, composer1, 8);
            EffectsKt.SideEffect(new Function0(popupLayout0, function02, popupProperties2, ((String)object2), layoutDirection0) {
                final LayoutDirection $layoutDirection;
                final Function0 $onDismissRequest;
                final PopupLayout $popupLayout;
                final PopupProperties $properties;
                final String $testTag;

                {
                    this.$popupLayout = popupLayout0;
                    this.$onDismissRequest = function00;
                    this.$properties = popupProperties0;
                    this.$testTag = s;
                    this.$layoutDirection = layoutDirection0;
                    super(0);
                }

                @Override  // kotlin.jvm.functions.Function0
                public Object invoke() {
                    this.invoke();
                    return Unit.INSTANCE;
                }

                public final void invoke() {
                    this.$popupLayout.updateParameters(this.$onDismissRequest, this.$properties, this.$testTag, this.$layoutDirection);
                }
            }, composer1, 0);
            EffectsKt.DisposableEffect(popupPositionProvider0, new Function1(popupLayout0, popupPositionProvider0) {
                final PopupLayout $popupLayout;
                final PopupPositionProvider $popupPositionProvider;

                {
                    this.$popupLayout = popupLayout0;
                    this.$popupPositionProvider = popupPositionProvider0;
                    super(1);
                }

                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope0) {
                    Intrinsics.checkNotNullParameter(disposableEffectScope0, "$this$DisposableEffect");
                    this.$popupLayout.setPositionProvider(this.$popupPositionProvider);
                    this.$popupLayout.updatePosition();
                    return new androidx.compose.ui.window.AndroidPopup_androidKt.Popup.4.invoke..inlined.onDispose.1();

                    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001A\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/DisposableEffectScope$onDispose$1", "Landroidx/compose/runtime/DisposableEffectResult;", "dispose", "", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
                    public final class androidx.compose.ui.window.AndroidPopup_androidKt.Popup.4.invoke..inlined.onDispose.1 implements DisposableEffectResult {
                        @Override  // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                        }
                    }

                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.invoke(((DisposableEffectScope)object0));
                }
            }, composer1, v4 & 14);
            Function1 function10 = new Function1(popupLayout0) {
                final PopupLayout $popupLayout;

                {
                    this.$popupLayout = popupLayout0;
                    super(1);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.invoke(((LayoutCoordinates)object0));
                    return Unit.INSTANCE;
                }

                public final void invoke(LayoutCoordinates layoutCoordinates0) {
                    Intrinsics.checkNotNullParameter(layoutCoordinates0, "childCoordinates");
                    LayoutCoordinates layoutCoordinates1 = layoutCoordinates0.getParentLayoutCoordinates();
                    Intrinsics.checkNotNull(layoutCoordinates1);
                    long v = layoutCoordinates1.getSize-YbymL2g();
                    long v1 = LayoutCoordinatesKt.positionInWindow(layoutCoordinates1);
                    IntRect intRect0 = IntRectKt.IntRect-VbeCjmY(IntOffsetKt.IntOffset(MathKt.roundToInt(Offset.getX-impl(v1)), MathKt.roundToInt(Offset.getY-impl(v1))), v);
                    this.$popupLayout.setParentBounds(intRect0);
                    this.$popupLayout.updatePosition();
                }
            };
            Modifier modifier0 = OnGloballyPositionedModifierKt.onGloballyPositioned(Modifier.Companion, function10);
            MeasurePolicy measurePolicy0 = new MeasurePolicy() {
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
                    Intrinsics.checkNotNullParameter(measureScope0, "$this$Layout");
                    Intrinsics.checkNotNullParameter(list0, "$noName_0");
                    popupLayout0.setParentLayoutDirection(layoutDirection0);
                    return androidx.compose.ui.layout.MeasureScope.DefaultImpls.layout$default(measureScope0, 0, 0, null, androidx.compose.ui.window.AndroidPopup_androidKt.Popup.7.measure.1.INSTANCE, 4, null);

                    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
                    final class androidx.compose.ui.window.AndroidPopup_androidKt.Popup.7.measure.1 extends Lambda implements Function1 {
                        public static final androidx.compose.ui.window.AndroidPopup_androidKt.Popup.7.measure.1 INSTANCE;

                        static {
                            androidx.compose.ui.window.AndroidPopup_androidKt.Popup.7.measure.1.INSTANCE = new androidx.compose.ui.window.AndroidPopup_androidKt.Popup.7.measure.1();
                        }

                        androidx.compose.ui.window.AndroidPopup_androidKt.Popup.7.measure.1() {
                            super(1);
                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            this.invoke(((PlacementScope)object0));
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PlacementScope placeable$PlacementScope0) {
                            Intrinsics.checkNotNullParameter(placeable$PlacementScope0, "$this$layout");
                        }
                    }

                }

                @Override  // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
                    return DefaultImpls.minIntrinsicHeight(this, intrinsicMeasureScope0, list0, v);
                }

                @Override  // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
                    return DefaultImpls.minIntrinsicWidth(this, intrinsicMeasureScope0, list0, v);
                }
            };
            composer1.startReplaceableGroup(0x520574F7);
            ComposerKt.sourceInformation(composer1, "C(Layout)P(!1,2)71@2788L7,72@2843L7,73@2855L389:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(composer1, 103361330, "C:CompositionLocal.kt#9igjgp");
            Object object5 = composer1.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(composer1);
            ComposerKt.sourceInformationMarkerStart(composer1, 103361330, "C:CompositionLocal.kt#9igjgp");
            Object object6 = composer1.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(composer1);
            Function0 function03 = ComposeUiNode.Companion.getConstructor();
            Function3 function30 = LayoutKt.materializerOf(modifier0);
            if(!(composer1.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function03);
            }
            else {
                composer1.useNode();
            }
            composer1.disableReusing();
            Composer composer2 = Updater.constructor-impl(composer1);
            Updater.set-impl(composer2, measurePolicy0, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer2, ((Density)object5), ComposeUiNode.Companion.getSetDensity());
            Updater.set-impl(composer2, ((LayoutDirection)object6), ComposeUiNode.Companion.getSetLayoutDirection());
            composer1.enableReusing();
            function30.invoke(SkippableUpdater.box-impl(SkippableUpdater.constructor-impl(composer1)), composer1, 0);
            composer1.startReplaceableGroup(2058660585);
            composer1.startReplaceableGroup(1097163556);
            ComposerKt.sourceInformation(composer1, "C:AndroidPopup.android.kt#2oxthz");
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            composer1.endNode();
            composer1.endReplaceableGroup();
            function01 = function02;
            popupProperties1 = popupProperties2;
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new Function2(popupPositionProvider0, function01, popupProperties1, function20, v, v1) {
                final int $$changed;
                final int $$default;
                final Function2 $content;
                final Function0 $onDismissRequest;
                final PopupPositionProvider $popupPositionProvider;
                final PopupProperties $properties;

                {
                    this.$popupPositionProvider = popupPositionProvider0;
                    this.$onDismissRequest = function00;
                    this.$properties = popupProperties0;
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
                    AndroidPopup_androidKt.Popup(this.$popupPositionProvider, this.$onDismissRequest, this.$properties, this.$content, composer0, this.$$changed | 1, this.$$default);
                }
            });
        }

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
        final class androidx.compose.ui.window.AndroidPopup_androidKt.Popup.popupId.1 extends Lambda implements Function0 {
            public static final androidx.compose.ui.window.AndroidPopup_androidKt.Popup.popupId.1 INSTANCE;

            static {
                androidx.compose.ui.window.AndroidPopup_androidKt.Popup.popupId.1.INSTANCE = new androidx.compose.ui.window.AndroidPopup_androidKt.Popup.popupId.1();
            }

            androidx.compose.ui.window.AndroidPopup_androidKt.Popup.popupId.1() {
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

    private static final Function2 Popup$lambda-1(State state0) {
        return (Function2)state0.getValue();
    }

    public static final void Popup-K5zGePQ(Alignment alignment0, long v, Function0 function00, PopupProperties popupProperties0, Function2 function20, Composer composer0, int v1, int v2) {
        PopupProperties popupProperties2;
        Function0 function02;
        long v6;
        Alignment alignment2;
        long v7;
        int v5;
        PopupProperties popupProperties1;
        Function0 function01;
        int v4;
        int v3;
        Alignment alignment1;
        Intrinsics.checkNotNullParameter(function20, "content");
        Composer composer1 = composer0.startRestartGroup(0x3F6DB071);
        ComposerKt.sourceInformation(composer1, "C(Popup)P(!1,2:c#ui.unit.IntOffset,3,4)182@8030L128,189@8164L165:AndroidPopup.android.kt#2oxthz");
        if((v1 & 14) == 0) {
            if((v2 & 1) == 0) {
                alignment1 = alignment0;
                v3 = composer1.changed(alignment1) ? 4 : 2;
            }
            else {
                alignment1 = alignment0;
                v3 = 2;
            }
            v4 = v3 | v1;
        }
        else {
            alignment1 = alignment0;
            v4 = v1;
        }
        if((v2 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v1 & 0x70) == 0) {
            v4 |= (composer1.changed(v) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v4 |= 0x180;
            function01 = function00;
        }
        else if((v1 & 0x380) == 0) {
            function01 = function00;
            v4 |= (composer1.changed(function01) ? 0x100 : 0x80);
        }
        else {
            function01 = function00;
        }
        if((v1 & 0x1C00) == 0) {
            if((v2 & 8) == 0) {
                popupProperties1 = popupProperties0;
                v5 = composer1.changed(popupProperties1) ? 0x800 : 0x400;
            }
            else {
                popupProperties1 = popupProperties0;
                v5 = 0x400;
            }
            v4 |= v5;
        }
        else {
            popupProperties1 = popupProperties0;
        }
        if((v2 & 16) != 0) {
            v4 |= 0x6000;
        }
        else if((0xE000 & v1) == 0) {
            v4 |= (composer1.changed(function20) ? 0x4000 : 0x2000);
        }
        if((0xB6DB & v4 ^ 9362) != 0 || !composer1.getSkipping()) {
            if((v1 & 1) == 0 || composer1.getDefaultsInvalid()) {
                composer1.startDefaults();
                if((v2 & 1) != 0) {
                    alignment1 = Alignment.Companion.getTopStart();
                    v4 &= -15;
                }
                long v8 = (v2 & 2) == 0 ? v : IntOffsetKt.IntOffset(0, 0);
                if((v2 & 4) != 0) {
                    function01 = null;
                }
                if((v2 & 8) != 0) {
                    v4 &= 0xFFFFE3FF;
                    popupProperties1 = new PopupProperties(false, false, false, null, false, false, 0x3F, null);
                }
                composer1.endDefaults();
                v7 = v8;
            }
            else {
                composer1.skipCurrentGroup();
                if((v2 & 1) != 0) {
                    v4 &= -15;
                }
                if((v2 & 8) != 0) {
                    v4 &= 0xFFFFE3FF;
                }
                v7 = v;
            }
            IntOffset intOffset0 = IntOffset.box-impl(v7);
            composer1.startReplaceableGroup(0xFFC7BF68);
            ComposerKt.sourceInformation(composer1, "C(remember)P(1,2):Composables.kt#9igjgp");
            boolean z = composer1.changed(alignment1);
            boolean z1 = composer1.changed(intOffset0);
            AlignmentOffsetPositionProvider alignmentOffsetPositionProvider0 = composer1.rememberedValue();
            if(z1 || z || alignmentOffsetPositionProvider0 == Composer.Companion.getEmpty()) {
                alignmentOffsetPositionProvider0 = new AlignmentOffsetPositionProvider(alignment1, v7, null);
                composer1.updateRememberedValue(alignmentOffsetPositionProvider0);
            }
            composer1.endReplaceableGroup();
            AndroidPopup_androidKt.Popup(alignmentOffsetPositionProvider0, function01, popupProperties1, function20, composer1, v4 >> 3 & 0x70 | v4 >> 3 & 0x380 | v4 >> 3 & 0x1C00, 0);
            alignment2 = alignment1;
            function02 = function01;
            v6 = v7;
        }
        else {
            composer1.skipToGroupEnd();
            alignment2 = alignment1;
            v6 = v;
            function02 = function01;
        }
        popupProperties2 = popupProperties1;
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new Function2(alignment2, v6, function02, popupProperties2, function20, v1, v2) {
                final int $$changed;
                final int $$default;
                final Alignment $alignment;
                final Function2 $content;
                final long $offset;
                final Function0 $onDismissRequest;
                final PopupProperties $properties;

                {
                    this.$alignment = alignment0;
                    this.$offset = v;
                    this.$onDismissRequest = function00;
                    this.$properties = popupProperties0;
                    this.$content = function20;
                    this.$$changed = v1;
                    this.$$default = v2;
                    super(2);
                }

                @Override  // kotlin.jvm.functions.Function2
                public Object invoke(Object object0, Object object1) {
                    this.invoke(((Composer)object0), ((Number)object1).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer0, int v) {
                    AndroidPopup_androidKt.Popup-K5zGePQ(this.$alignment, this.$offset, this.$onDismissRequest, this.$properties, this.$content, composer0, this.$$changed | 1, this.$$default);
                }
            });
        }
    }

    public static final void PopupTestTag(String s, Function2 function20, Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(s, "tag");
        Intrinsics.checkNotNullParameter(function20, "content");
        Composer composer1 = composer0.startRestartGroup(0x4C077747);
        ComposerKt.sourceInformation(composer1, "C(PopupTestTag)P(1)310@12365L75:AndroidPopup.android.kt#2oxthz");
        int v1 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(function20) ? 0x20 : 16);
        }
        if((v1 & 91 ^ 18) != 0 || !composer1.getSkipping()) {
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{AndroidPopup_androidKt.LocalPopupTestTag.provides(s)}, function20, composer1, v1 & 0x70 | 8);
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new Function2(s, function20, v) {
                final int $$changed;
                final Function2 $content;
                final String $tag;

                {
                    this.$tag = s;
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
                    AndroidPopup_androidKt.PopupTestTag(this.$tag, this.$content, composer0, this.$$changed | 1);
                }
            });
        }
    }

    private static final void SimpleStack(Modifier modifier0, Function2 function20, Composer composer0, int v) {
        composer0.startReplaceableGroup(0x5CFD759A);
        ComposerKt.sourceInformation(composer0, "C(SimpleStack)P(1)318@12703L979:AndroidPopup.android.kt#2oxthz");
        MeasurePolicy measurePolicy0 = androidx.compose.ui.window.AndroidPopup_androidKt.SimpleStack.1.INSTANCE;
        composer0.startReplaceableGroup(0x520574F7);
        ComposerKt.sourceInformation(composer0, "C(Layout)P(!1,2)71@2788L7,72@2843L7,73@2855L389:Layout.kt#80mrfh");
        ComposerKt.sourceInformationMarkerStart(composer0, 103361330, "C:CompositionLocal.kt#9igjgp");
        Object object0 = composer0.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(composer0);
        ComposerKt.sourceInformationMarkerStart(composer0, 103361330, "C:CompositionLocal.kt#9igjgp");
        Object object1 = composer0.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ComposerKt.sourceInformationMarkerEnd(composer0);
        Function0 function00 = ComposeUiNode.Companion.getConstructor();
        Function3 function30 = LayoutKt.materializerOf(modifier0);
        int v1 = (v << 3 & 0x70 | v >> 3 & 14) << 9 & 0x1C00;
        if(!(composer0.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer0.startReusableNode();
        if(composer0.getInserting()) {
            composer0.createNode(function00);
        }
        else {
            composer0.useNode();
        }
        composer0.disableReusing();
        Composer composer1 = Updater.constructor-impl(composer0);
        Updater.set-impl(composer1, measurePolicy0, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.set-impl(composer1, ((Density)object0), ComposeUiNode.Companion.getSetDensity());
        Updater.set-impl(composer1, ((LayoutDirection)object1), ComposeUiNode.Companion.getSetLayoutDirection());
        composer0.enableReusing();
        function30.invoke(SkippableUpdater.box-impl(SkippableUpdater.constructor-impl(composer0)), composer0, ((int)(v1 >> 3 & 0x70)));
        composer0.startReplaceableGroup(2058660585);
        function20.invoke(composer0, ((int)(v1 >> 9 & 14)));
        composer0.endReplaceableGroup();
        composer0.endNode();
        composer0.endReplaceableGroup();
        composer0.endReplaceableGroup();

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
        public final class androidx.compose.ui.window.AndroidPopup_androidKt.SimpleStack.1 implements MeasurePolicy {
            public static final androidx.compose.ui.window.AndroidPopup_androidKt.SimpleStack.1 INSTANCE;

            static {
                androidx.compose.ui.window.AndroidPopup_androidKt.SimpleStack.1.INSTANCE = new androidx.compose.ui.window.AndroidPopup_androidKt.SimpleStack.1();
            }

            public androidx.compose.ui.window.AndroidPopup_androidKt.SimpleStack.1() {
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
                Intrinsics.checkNotNullParameter(measureScope0, "$this$Layout");
                Intrinsics.checkNotNullParameter(list0, "measurables");
                switch(list0.size()) {
                    case 0: {
                        return androidx.compose.ui.layout.MeasureScope.DefaultImpls.layout$default(measureScope0, 0, 0, null, androidx.compose.ui.window.AndroidPopup_androidKt.SimpleStack.1.measure.1.INSTANCE, 4, null);
                    }
                    case 1: {
                        Placeable placeable1 = ((Measurable)list0.get(0)).measure-BRTryo0(v);
                        return androidx.compose.ui.layout.MeasureScope.DefaultImpls.layout$default(measureScope0, placeable1.getWidth(), placeable1.getHeight(), null, new Function1() {
                            final Placeable $p;

                            {
                                this.$p = placeable0;
                                super(1);
                            }

                            @Override  // kotlin.jvm.functions.Function1
                            public Object invoke(Object object0) {
                                this.invoke(((PlacementScope)object0));
                                return Unit.INSTANCE;
                            }

                            public final void invoke(PlacementScope placeable$PlacementScope0) {
                                Intrinsics.checkNotNullParameter(placeable$PlacementScope0, "$this$layout");
                                PlacementScope.placeRelative$default(placeable$PlacementScope0, this.$p, 0, 0, 0.0f, 4, null);
                            }
                        }, 4, null);
                    }
                    default: {
                        ArrayList arrayList0 = new ArrayList(list0.size());
                        int v2 = list0.size();
                        if(v2 - 1 >= 0) {
                            for(int v3 = 0; true; ++v3) {
                                arrayList0.add(((Measurable)list0.get(v3)).measure-BRTryo0(v));
                                if(v3 + 1 > v2 - 1) {
                                    break;
                                }
                            }
                        }
                        int v4 = CollectionsKt.getLastIndex(arrayList0);
                        if(v4 >= 0) {
                            int v5 = 0;
                            int v6 = 0;
                            for(int v1 = 0; true; ++v1) {
                                Placeable placeable0 = (Placeable)arrayList0.get(v1);
                                v5 = Math.max(v5, placeable0.getWidth());
                                v6 = Math.max(v6, placeable0.getHeight());
                                if(v1 == v4) {
                                    break;
                                }
                            }
                            return androidx.compose.ui.layout.MeasureScope.DefaultImpls.layout$default(measureScope0, v5, v6, null, new Function1() {
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
                                    int v = CollectionsKt.getLastIndex(this.$placeables);
                                    if(v >= 0) {
                                        for(int v1 = 0; true; ++v1) {
                                            PlacementScope.placeRelative$default(placeable$PlacementScope0, ((Placeable)this.$placeables.get(v1)), 0, 0, 0.0f, 4, null);
                                            if(v1 == v) {
                                                break;
                                            }
                                        }
                                    }
                                }
                            }, 4, null);
                        }
                        return androidx.compose.ui.layout.MeasureScope.DefaultImpls.layout$default(measureScope0, 0, 0, null, new Function1() {
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
                                int v = CollectionsKt.getLastIndex(this.$placeables);
                                if(v >= 0) {
                                    for(int v1 = 0; true; ++v1) {
                                        PlacementScope.placeRelative$default(placeable$PlacementScope0, ((Placeable)this.$placeables.get(v1)), 0, 0, 0.0f, 4, null);
                                        if(v1 == v) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }, 4, null);
                    }
                }

                @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
                public final class androidx.compose.ui.window.AndroidPopup_androidKt.SimpleStack.1.measure.1 extends Lambda implements Function1 {
                    public static final androidx.compose.ui.window.AndroidPopup_androidKt.SimpleStack.1.measure.1 INSTANCE;

                    static {
                        androidx.compose.ui.window.AndroidPopup_androidKt.SimpleStack.1.measure.1.INSTANCE = new androidx.compose.ui.window.AndroidPopup_androidKt.SimpleStack.1.measure.1();
                    }

                    public androidx.compose.ui.window.AndroidPopup_androidKt.SimpleStack.1.measure.1() {
                        super(1);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.invoke(((PlacementScope)object0));
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PlacementScope placeable$PlacementScope0) {
                        Intrinsics.checkNotNullParameter(placeable$PlacementScope0, "$this$layout");
                    }
                }

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

    public static final ProvidableCompositionLocal getLocalPopupTestTag() {
        return AndroidPopup_androidKt.LocalPopupTestTag;
    }

    public static final boolean isFlagSecureEnabled(View view0) {
        Intrinsics.checkNotNullParameter(view0, "<this>");
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getRootView().getLayoutParams();
        WindowManager.LayoutParams windowManager$LayoutParams0 = viewGroup$LayoutParams0 instanceof WindowManager.LayoutParams ? ((WindowManager.LayoutParams)viewGroup$LayoutParams0) : null;
        return windowManager$LayoutParams0 != null && (windowManager$LayoutParams0.flags & 0x2000) != 0;
    }

    public static final boolean isPopupLayout(View view0, String s) {
        Intrinsics.checkNotNullParameter(view0, "view");
        return view0 instanceof PopupLayout && (s == null || Intrinsics.areEqual(s, ((PopupLayout)view0).getTestTag()));
    }

    public static boolean isPopupLayout$default(View view0, String s, int v, Object object0) {
        if((v & 2) != 0) {
            s = null;
        }
        return AndroidPopup_androidKt.isPopupLayout(view0, s);
    }
}

