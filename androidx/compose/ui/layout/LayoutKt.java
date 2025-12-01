package androidx.compose.ui.layout;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.MeasureBlocks;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.JvmActuals_jvmKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001A6\u0010\u0000\u001A\u00020\u00012\u0011\u0010\u0002\u001A\r\u0012\u0004\u0012\u00020\u00010\u0003\u00A2\u0006\u0002\b\u00042\b\b\u0002\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\bH\u0087\b\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010\t\u001A\u0098\u0002\u0010\u0000\u001A\u00020\u00012\u0011\u0010\u0002\u001A\r\u0012\u0004\u0012\u00020\u00010\u0003\u00A2\u0006\u0002\b\u00042-\u0010\n\u001A)\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000E0\r\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u00020\u000F0\u000Bj\u0002`\u0010\u00A2\u0006\u0002\b\u00112-\u0010\u0012\u001A)\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000E0\r\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u00020\u000F0\u000Bj\u0002`\u0010\u00A2\u0006\u0002\b\u00112-\u0010\u0013\u001A)\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000E0\r\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u00020\u000F0\u000Bj\u0002`\u0010\u00A2\u0006\u0002\b\u00112-\u0010\u0014\u001A)\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000E0\r\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u00020\u000F0\u000Bj\u0002`\u0010\u00A2\u0006\u0002\b\u00112\b\b\u0002\u0010\u0005\u001A\u00020\u00062-\u0010\u0015\u001A)\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\r\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u000Bj\u0002`\u001A\u00A2\u0006\u0002\b\u0011H\u0001\u00F8\u0001\u0001\u00A2\u0006\u0002\u0010\u001B\u001A:\u0010\u001C\u001A\u00020\u001D2-\u0010\u0015\u001A)\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\r\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u000Bj\u0002`\u001A\u00A2\u0006\u0002\b\u0011H\u0001\u00F8\u0001\u0001\u001A2\u0010\u001E\u001A\u00020\u00012\b\b\u0002\u0010\u0005\u001A\u00020\u00062\u0011\u0010\u0002\u001A\r\u0012\u0004\u0012\u00020\u00010\u0003\u00A2\u0006\u0002\b\u00042\u0006\u0010\u0007\u001A\u00020\bH\u0007\u00A2\u0006\u0002\u0010\u001F\u001A4\u0010 \u001A\u001E\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"\u0012\u0004\u0012\u00020\u00010!\u00A2\u0006\u0002\b\u0004\u00A2\u0006\u0002\b\u00112\u0006\u0010\u0005\u001A\u00020\u0006H\u0001\u00F8\u0001\u0001\u00A2\u0006\u0002\u0010$\u001A\u00F6\u0001\u0010%\u001A\u00020\u001D2-\u0010\n\u001A)\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000E0\r\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u00020\u000F0\u000Bj\u0002`\u0010\u00A2\u0006\u0002\b\u00112-\u0010\u0012\u001A)\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000E0\r\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u00020\u000F0\u000Bj\u0002`\u0010\u00A2\u0006\u0002\b\u00112-\u0010\u0013\u001A)\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000E0\r\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u00020\u000F0\u000Bj\u0002`\u0010\u00A2\u0006\u0002\b\u00112-\u0010\u0014\u001A)\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000E0\r\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u00020\u000F0\u000Bj\u0002`\u0010\u00A2\u0006\u0002\b\u00112-\u0010\u0015\u001A)\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\r\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u000Bj\u0002`\u001A\u00A2\u0006\u0002\b\u0011H\u0001\u00F8\u0001\u0001\u001AX\u0010&\u001A\u00020\u000F*\u00020\'2)\u0010\u0015\u001A%\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\r\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u000B\u00A2\u0006\u0002\b\u00112\f\u0010(\u001A\b\u0012\u0004\u0012\u00020\u000E0\r2\u0006\u0010)\u001A\u00020\u000F2\u0006\u0010*\u001A\u00020+H\u0002\u00F8\u0001\u0001\u001AX\u0010,\u001A\u00020\u000F*\u00020\'2)\u0010\u0015\u001A%\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\r\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u000B\u00A2\u0006\u0002\b\u00112\f\u0010(\u001A\b\u0012\u0004\u0012\u00020\u000E0\r2\u0006\u0010-\u001A\u00020\u000F2\u0006\u0010*\u001A\u00020+H\u0002\u00F8\u0001\u0001\u001AX\u0010.\u001A\u00020\u000F*\u00020\'2)\u0010\u0015\u001A%\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\r\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u000B\u00A2\u0006\u0002\b\u00112\f\u0010(\u001A\b\u0012\u0004\u0012\u00020\u000E0\r2\u0006\u0010)\u001A\u00020\u000F2\u0006\u0010*\u001A\u00020+H\u0002\u00F8\u0001\u0001\u001AX\u0010/\u001A\u00020\u000F*\u00020\'2)\u0010\u0015\u001A%\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\r\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u000B\u00A2\u0006\u0002\b\u00112\f\u0010(\u001A\b\u0012\u0004\u0012\u00020\u000E0\r2\u0006\u0010-\u001A\u00020\u000F2\u0006\u0010*\u001A\u00020+H\u0002\u00F8\u0001\u0001\u0082\u0002\u000B\n\u0005\b\u009920\u0001\n\u0002\b\u0019\u00A8\u00060"}, d2 = {"Layout", "", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", "measurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;II)V", "minIntrinsicWidthMeasureBlock", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "Landroidx/compose/ui/layout/IntrinsicMeasureBlock;", "Lkotlin/ExtensionFunctionType;", "minIntrinsicHeightMeasureBlock", "maxIntrinsicWidthMeasureBlock", "maxIntrinsicHeightMeasureBlock", "measureBlock", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureBlock;", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "MeasuringIntrinsicsMeasureBlocks", "Landroidx/compose/ui/node/MeasureBlocks;", "MultiMeasureLayout", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;II)V", "materializerOf", "Lkotlin/Function1;", "Landroidx/compose/runtime/SkippableUpdater;", "Landroidx/compose/ui/node/ComposeUiNode;", "(Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function3;", "measureBlocksOf", "MeasuringMaxIntrinsicHeight", "Landroidx/compose/ui/unit/Density;", "measurables", "w", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "MeasuringMaxIntrinsicWidth", "h", "MeasuringMinIntrinsicHeight", "MeasuringMinIntrinsicWidth", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class LayoutKt {
    public static final void Layout(Function2 function20, Modifier modifier0, MeasurePolicy measurePolicy0, Composer composer0, int v, int v1) {
        Intrinsics.checkNotNullParameter(function20, "content");
        Intrinsics.checkNotNullParameter(measurePolicy0, "measurePolicy");
        composer0.startReplaceableGroup(0x520574F7);
        ComposerKt.sourceInformation(composer0, "C(Layout)P(!1,2)71@2788L7,72@2843L7,73@2855L389:Layout.kt#80mrfh");
        if((v1 & 2) != 0) {
            modifier0 = Modifier.Companion;
        }
        ComposerKt.sourceInformationMarkerStart(composer0, 103361330, "C:CompositionLocal.kt#9igjgp");
        Object object0 = composer0.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(composer0);
        ComposerKt.sourceInformationMarkerStart(composer0, 103361330, "C:CompositionLocal.kt#9igjgp");
        Object object1 = composer0.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ComposerKt.sourceInformationMarkerEnd(composer0);
        Function0 function00 = ComposeUiNode.Companion.getConstructor();
        Function3 function30 = LayoutKt.materializerOf(modifier0);
        int v2 = v << 9 & 0x1C00;
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
        function30.invoke(SkippableUpdater.box-impl(SkippableUpdater.constructor-impl(composer0)), composer0, ((int)(v2 >> 3 & 0x70)));
        composer0.startReplaceableGroup(2058660585);
        function20.invoke(composer0, ((int)(v2 >> 9 & 14)));
        composer0.endReplaceableGroup();
        composer0.endNode();
        composer0.endReplaceableGroup();
    }

    @Deprecated(message = "This composable was deprecated. Please use the alternative Layout overloads instead.")
    public static final void Layout(Function2 function20, Function3 function30, Function3 function31, Function3 function32, Function3 function33, Modifier modifier0, Function3 function34, Composer composer0, int v, int v1) {
        Modifier modifier1;
        int v2;
        Intrinsics.checkNotNullParameter(function20, "content");
        Intrinsics.checkNotNullParameter(function30, "minIntrinsicWidthMeasureBlock");
        Intrinsics.checkNotNullParameter(function31, "minIntrinsicHeightMeasureBlock");
        Intrinsics.checkNotNullParameter(function32, "maxIntrinsicWidthMeasureBlock");
        Intrinsics.checkNotNullParameter(function33, "maxIntrinsicHeightMeasureBlock");
        Intrinsics.checkNotNullParameter(function34, "measureBlock");
        Composer composer1 = composer0.startRestartGroup(0x52057809);
        ComposerKt.sourceInformation(composer1, "C(Layout)P(!1,5,4,2!1,6)126@4847L40:Layout.kt#80mrfh");
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(function20) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(function30) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(function31) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changed(function32) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((0xE000 & v) == 0) {
            v2 |= (composer1.changed(function33) ? 0x4000 : 0x2000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((0x70000 & v) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x20000 : 0x10000);
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((0x380000 & v) == 0) {
            v2 |= (composer1.changed(function34) ? 0x100000 : 0x80000);
        }
        if((0x2DB6DB & v2 ^ 0x92492) != 0 || !composer1.getSkipping()) {
            Modifier modifier2 = (v1 & 0x20) == 0 ? modifier0 : Modifier.Companion;
            androidx.compose.ui.layout.LayoutKt.Layout.measurePolicy.1 layoutKt$Layout$measurePolicy$10 = new MeasurePolicy() {
                @Override  // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
                    Intrinsics.checkNotNullParameter(intrinsicMeasureScope0, "<this>");
                    Intrinsics.checkNotNullParameter(list0, "measurables");
                    return ((Number)function33.invoke(intrinsicMeasureScope0, list0, v)).intValue();
                }

                @Override  // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
                    Intrinsics.checkNotNullParameter(intrinsicMeasureScope0, "<this>");
                    Intrinsics.checkNotNullParameter(list0, "measurables");
                    return ((Number)function32.invoke(intrinsicMeasureScope0, list0, v)).intValue();
                }

                @Override  // androidx.compose.ui.layout.MeasurePolicy
                public MeasureResult measure-3p2s80s(MeasureScope measureScope0, List list0, long v) {
                    Intrinsics.checkNotNullParameter(measureScope0, "$receiver");
                    Intrinsics.checkNotNullParameter(list0, "measurables");
                    Constraints constraints0 = Constraints.box-impl(v);
                    return (MeasureResult)function34.invoke(measureScope0, list0, constraints0);
                }

                @Override  // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
                    Intrinsics.checkNotNullParameter(intrinsicMeasureScope0, "<this>");
                    Intrinsics.checkNotNullParameter(list0, "measurables");
                    return ((Number)function31.invoke(intrinsicMeasureScope0, list0, v)).intValue();
                }

                @Override  // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
                    Intrinsics.checkNotNullParameter(intrinsicMeasureScope0, "<this>");
                    Intrinsics.checkNotNullParameter(list0, "measurables");
                    return ((Number)function30.invoke(intrinsicMeasureScope0, list0, v)).intValue();
                }
            };
            composer1.startReplaceableGroup(0x520574F7);
            ComposerKt.sourceInformation(composer1, "C(Layout)P(!1,2)71@2788L7,72@2843L7,73@2855L389:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(composer1, 103361330, "C:CompositionLocal.kt#9igjgp");
            Object object0 = composer1.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(composer1);
            ComposerKt.sourceInformationMarkerStart(composer1, 103361330, "C:CompositionLocal.kt#9igjgp");
            Object object1 = composer1.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(composer1);
            Function0 function00 = ComposeUiNode.Companion.getConstructor();
            Function3 function35 = LayoutKt.materializerOf(modifier2);
            int v3 = (v2 & 14 | v2 >> 12 & 0x70) << 9 & 0x1C00;
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
            Updater.set-impl(composer2, layoutKt$Layout$measurePolicy$10, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer2, ((Density)object0), ComposeUiNode.Companion.getSetDensity());
            Updater.set-impl(composer2, ((LayoutDirection)object1), ComposeUiNode.Companion.getSetLayoutDirection());
            composer1.enableReusing();
            function35.invoke(SkippableUpdater.box-impl(SkippableUpdater.constructor-impl(composer1)), composer1, ((int)(v3 >> 3 & 0x70)));
            composer1.startReplaceableGroup(2058660585);
            function20.invoke(composer1, ((int)(v3 >> 9 & 14)));
            composer1.endReplaceableGroup();
            composer1.endNode();
            composer1.endReplaceableGroup();
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new Function2(function20, function30, function31, function32, function33, modifier1, function34, v, v1) {
                final int $$changed;
                final int $$default;
                final Function2 $content;
                final Function3 $maxIntrinsicHeightMeasureBlock;
                final Function3 $maxIntrinsicWidthMeasureBlock;
                final Function3 $measureBlock;
                final Function3 $minIntrinsicHeightMeasureBlock;
                final Function3 $minIntrinsicWidthMeasureBlock;
                final Modifier $modifier;

                {
                    this.$content = function20;
                    this.$minIntrinsicWidthMeasureBlock = function30;
                    this.$minIntrinsicHeightMeasureBlock = function31;
                    this.$maxIntrinsicWidthMeasureBlock = function32;
                    this.$maxIntrinsicHeightMeasureBlock = function33;
                    this.$modifier = modifier0;
                    this.$measureBlock = function34;
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
                    LayoutKt.Layout(this.$content, this.$minIntrinsicWidthMeasureBlock, this.$minIntrinsicHeightMeasureBlock, this.$maxIntrinsicWidthMeasureBlock, this.$maxIntrinsicHeightMeasureBlock, this.$modifier, this.$measureBlock, composer0, this.$$changed | 1, this.$$default);
                }
            });
        }
    }

    @Deprecated(message = "MeasuringIntrinsicsMeasureBlocks was deprecated. Please use MeasurePolicy instead.")
    public static final MeasureBlocks MeasuringIntrinsicsMeasureBlocks(Function3 function30) {
        Intrinsics.checkNotNullParameter(function30, "measureBlock");
        return new MeasureBlocks() {
            @Override  // androidx.compose.ui.node.MeasureBlocks
            public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope0, "intrinsicMeasureScope");
                Intrinsics.checkNotNullParameter(list0, "measurables");
                LayoutDirection layoutDirection0 = intrinsicMeasureScope0.getLayoutDirection();
                return LayoutKt.MeasuringMaxIntrinsicHeight(intrinsicMeasureScope0, function30, list0, v, layoutDirection0);
            }

            @Override  // androidx.compose.ui.node.MeasureBlocks
            public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope0, "intrinsicMeasureScope");
                Intrinsics.checkNotNullParameter(list0, "measurables");
                LayoutDirection layoutDirection0 = intrinsicMeasureScope0.getLayoutDirection();
                return LayoutKt.MeasuringMaxIntrinsicWidth(intrinsicMeasureScope0, function30, list0, v, layoutDirection0);
            }

            @Override  // androidx.compose.ui.node.MeasureBlocks
            public MeasureResult measure-3p2s80s(MeasureScope measureScope0, List list0, long v) {
                Intrinsics.checkNotNullParameter(measureScope0, "measureScope");
                Intrinsics.checkNotNullParameter(list0, "measurables");
                Constraints constraints0 = Constraints.box-impl(v);
                return (MeasureResult)function30.invoke(measureScope0, list0, constraints0);
            }

            @Override  // androidx.compose.ui.node.MeasureBlocks
            public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope0, "intrinsicMeasureScope");
                Intrinsics.checkNotNullParameter(list0, "measurables");
                LayoutDirection layoutDirection0 = intrinsicMeasureScope0.getLayoutDirection();
                return LayoutKt.MeasuringMinIntrinsicHeight(intrinsicMeasureScope0, function30, list0, v, layoutDirection0);
            }

            @Override  // androidx.compose.ui.node.MeasureBlocks
            public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope0, "intrinsicMeasureScope");
                Intrinsics.checkNotNullParameter(list0, "measurables");
                LayoutDirection layoutDirection0 = intrinsicMeasureScope0.getLayoutDirection();
                return LayoutKt.MeasuringMinIntrinsicWidth(intrinsicMeasureScope0, function30, list0, v, layoutDirection0);
            }

            @Override
            public String toString() {
                return JvmActuals_jvmKt.simpleIdentityToString(this, "MeasuringIntrinsicsMeasureBlocks") + "{ measureBlock=" + JvmActuals_jvmKt.simpleIdentityToString(function30, null) + " }";
            }
        };
    }

    private static final int MeasuringMaxIntrinsicHeight(Density density0, Function3 function30, List list0, int v, LayoutDirection layoutDirection0) {
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v1 = list0.size();
        if(v1 - 1 >= 0) {
            for(int v2 = 0; true; ++v2) {
                arrayList0.add(new DefaultIntrinsicMeasurable(((IntrinsicMeasurable)list0.get(v2)), IntrinsicMinMax.Max, IntrinsicWidthHeight.Height));
                if(v2 + 1 > v1 - 1) {
                    break;
                }
            }
        }
        long v3 = ConstraintsKt.Constraints$default(0, v, 0, 0, 13, null);
        return ((MeasureResult)function30.invoke(new IntrinsicsMeasureScope(density0, layoutDirection0), arrayList0, Constraints.box-impl(v3))).getHeight();
    }

    private static final int MeasuringMaxIntrinsicWidth(Density density0, Function3 function30, List list0, int v, LayoutDirection layoutDirection0) {
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v1 = list0.size();
        if(v1 - 1 >= 0) {
            for(int v2 = 0; true; ++v2) {
                arrayList0.add(new DefaultIntrinsicMeasurable(((IntrinsicMeasurable)list0.get(v2)), IntrinsicMinMax.Max, IntrinsicWidthHeight.Width));
                if(v2 + 1 > v1 - 1) {
                    break;
                }
            }
        }
        long v3 = ConstraintsKt.Constraints$default(0, 0, 0, v, 7, null);
        return ((MeasureResult)function30.invoke(new IntrinsicsMeasureScope(density0, layoutDirection0), arrayList0, Constraints.box-impl(v3))).getWidth();
    }

    private static final int MeasuringMinIntrinsicHeight(Density density0, Function3 function30, List list0, int v, LayoutDirection layoutDirection0) {
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v1 = list0.size();
        if(v1 - 1 >= 0) {
            for(int v2 = 0; true; ++v2) {
                arrayList0.add(new DefaultIntrinsicMeasurable(((IntrinsicMeasurable)list0.get(v2)), IntrinsicMinMax.Min, IntrinsicWidthHeight.Height));
                if(v2 + 1 > v1 - 1) {
                    break;
                }
            }
        }
        long v3 = ConstraintsKt.Constraints$default(0, v, 0, 0, 13, null);
        return ((MeasureResult)function30.invoke(new IntrinsicsMeasureScope(density0, layoutDirection0), arrayList0, Constraints.box-impl(v3))).getHeight();
    }

    private static final int MeasuringMinIntrinsicWidth(Density density0, Function3 function30, List list0, int v, LayoutDirection layoutDirection0) {
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v1 = list0.size();
        if(v1 - 1 >= 0) {
            for(int v2 = 0; true; ++v2) {
                arrayList0.add(new DefaultIntrinsicMeasurable(((IntrinsicMeasurable)list0.get(v2)), IntrinsicMinMax.Min, IntrinsicWidthHeight.Width));
                if(v2 + 1 > v1 - 1) {
                    break;
                }
            }
        }
        long v3 = ConstraintsKt.Constraints$default(0, 0, 0, v, 7, null);
        return ((MeasureResult)function30.invoke(new IntrinsicsMeasureScope(density0, layoutDirection0), arrayList0, Constraints.box-impl(v3))).getWidth();
    }

    @Deprecated(message = "This API is unsafe for UI performance at scale - using it incorrectly will lead to exponential performance issues. This API should be avoided whenever possible.")
    public static final void MultiMeasureLayout(Modifier modifier0, Function2 function20, MeasurePolicy measurePolicy0, Composer composer0, int v, int v1) {
        int v2;
        Intrinsics.checkNotNullParameter(function20, "content");
        Intrinsics.checkNotNullParameter(measurePolicy0, "measurePolicy");
        Composer composer1 = composer0.startRestartGroup(0xCD4DA550);
        ComposerKt.sourceInformation(composer1, "C(MultiMeasureLayout)P(2)191@7339L7,192@7394L7,194@7407L474:Layout.kt#80mrfh");
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
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(measurePolicy0) ? 0x100 : 0x80);
        }
        if((v2 & 731 ^ 0x92) != 0 || !composer1.getSkipping()) {
            if((v1 & 1) != 0) {
                modifier0 = Modifier.Companion;
            }
            Modifier modifier1 = ComposedModifierKt.materialize(composer1, modifier0);
            ComposerKt.sourceInformationMarkerStart(composer1, 103361330, "C:CompositionLocal.kt#9igjgp");
            Object object0 = composer1.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(composer1);
            ComposerKt.sourceInformationMarkerStart(composer1, 103361330, "C:CompositionLocal.kt#9igjgp");
            Object object1 = composer1.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(composer1);
            Function0 function00 = LayoutNode.Companion.getConstructor$ui_release();
            composer1.startReplaceableGroup(0x5C28A3AB);
            ComposerKt.sourceInformation(composer1, "C(ReusableComposeNode)P(1,2)334@12088L9:Composables.kt#9igjgp");
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
            Updater.set-impl(composer2, modifier1, ComposeUiNode.Companion.getSetModifier());
            Updater.set-impl(composer2, measurePolicy0, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer2, ((Density)object0), ComposeUiNode.Companion.getSetDensity());
            Updater.set-impl(composer2, ((LayoutDirection)object1), ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.init-impl(composer2, androidx.compose.ui.layout.LayoutKt.MultiMeasureLayout.1.1.INSTANCE);
            composer1.enableReusing();
            function20.invoke(composer1, ((int)((v2 << 3 & 0x380) >> 6 & 14)));
            composer1.endNode();
            composer1.endReplaceableGroup();
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new Function2(modifier0, function20, measurePolicy0, v, v1) {
                final int $$changed;
                final int $$default;
                final Function2 $content;
                final MeasurePolicy $measurePolicy;
                final Modifier $modifier;

                {
                    this.$modifier = modifier0;
                    this.$content = function20;
                    this.$measurePolicy = measurePolicy0;
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
                    LayoutKt.MultiMeasureLayout(this.$modifier, this.$content, this.$measurePolicy, composer0, this.$$changed | 1, this.$$default);
                }
            });
        }

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
        final class androidx.compose.ui.layout.LayoutKt.MultiMeasureLayout.1.1 extends Lambda implements Function1 {
            public static final androidx.compose.ui.layout.LayoutKt.MultiMeasureLayout.1.1 INSTANCE;

            static {
                androidx.compose.ui.layout.LayoutKt.MultiMeasureLayout.1.1.INSTANCE = new androidx.compose.ui.layout.LayoutKt.MultiMeasureLayout.1.1();
            }

            androidx.compose.ui.layout.LayoutKt.MultiMeasureLayout.1.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((LayoutNode)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(LayoutNode layoutNode0) {
                Intrinsics.checkNotNullParameter(layoutNode0, "$this$init");
                layoutNode0.setCanMultiMeasure$ui_release(true);
            }
        }

    }

    public static final Function3 materializerOf(Modifier modifier0) {
        Intrinsics.checkNotNullParameter(modifier0, "modifier");
        return ComposableLambdaKt.composableLambdaInstance(0xC541EB01, true, new Function3(modifier0) {
            final Modifier $modifier;

            {
                this.$modifier = modifier0;
                super(3);
            }

            @Override  // kotlin.jvm.functions.Function3
            public Object invoke(Object object0, Object object1, Object object2) {
                this.invoke-Deg8D_g(((SkippableUpdater)object0).unbox-impl(), ((Composer)object1), ((Number)object2).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke-Deg8D_g(Composer composer0, Composer composer1, int v) {
                Intrinsics.checkNotNullParameter(composer0, "$this$null");
                ComposerKt.sourceInformation(composer1, "C:Layout.kt#80mrfh");
                Modifier modifier0 = ComposedModifierKt.materialize(composer1, this.$modifier);
                composer0.startReplaceableGroup(509942095);
                Updater.set-impl(Updater.constructor-impl(composer0), modifier0, ComposeUiNode.Companion.getSetModifier());
                composer0.endReplaceableGroup();
            }
        });
    }

    @Deprecated(message = "MeasureBlocks was deprecated. Please use MeasurePolicy and the Layout overloads using it instead.")
    public static final MeasureBlocks measureBlocksOf(Function3 function30, Function3 function31, Function3 function32, Function3 function33, Function3 function34) {
        Intrinsics.checkNotNullParameter(function30, "minIntrinsicWidthMeasureBlock");
        Intrinsics.checkNotNullParameter(function31, "minIntrinsicHeightMeasureBlock");
        Intrinsics.checkNotNullParameter(function32, "maxIntrinsicWidthMeasureBlock");
        Intrinsics.checkNotNullParameter(function33, "maxIntrinsicHeightMeasureBlock");
        Intrinsics.checkNotNullParameter(function34, "measureBlock");
        return new MeasureBlocks() {
            @Override  // androidx.compose.ui.node.MeasureBlocks
            public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope0, "intrinsicMeasureScope");
                Intrinsics.checkNotNullParameter(list0, "measurables");
                return ((Number)function33.invoke(intrinsicMeasureScope0, list0, v)).intValue();
            }

            @Override  // androidx.compose.ui.node.MeasureBlocks
            public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope0, "intrinsicMeasureScope");
                Intrinsics.checkNotNullParameter(list0, "measurables");
                return ((Number)function32.invoke(intrinsicMeasureScope0, list0, v)).intValue();
            }

            @Override  // androidx.compose.ui.node.MeasureBlocks
            public MeasureResult measure-3p2s80s(MeasureScope measureScope0, List list0, long v) {
                Intrinsics.checkNotNullParameter(measureScope0, "measureScope");
                Intrinsics.checkNotNullParameter(list0, "measurables");
                Constraints constraints0 = Constraints.box-impl(v);
                return (MeasureResult)function34.invoke(measureScope0, list0, constraints0);
            }

            @Override  // androidx.compose.ui.node.MeasureBlocks
            public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope0, "intrinsicMeasureScope");
                Intrinsics.checkNotNullParameter(list0, "measurables");
                return ((Number)function31.invoke(intrinsicMeasureScope0, list0, v)).intValue();
            }

            @Override  // androidx.compose.ui.node.MeasureBlocks
            public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope0, "intrinsicMeasureScope");
                Intrinsics.checkNotNullParameter(list0, "measurables");
                return ((Number)function30.invoke(intrinsicMeasureScope0, list0, v)).intValue();
            }
        };
    }
}

