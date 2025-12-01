package androidx.compose.ui.draw;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A#\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001A#\u0010\u0007\u001A\u00020\u0001*\u00020\u00012\u0017\u0010\b\u001A\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\u0002\b\u0006\u001A#\u0010\u000B\u001A\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001A\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¨\u0006\r"}, d2 = {"drawBehind", "Landroidx/compose/ui/Modifier;", "onDraw", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "Lkotlin/ExtensionFunctionType;", "drawWithCache", "onBuildDrawCache", "Landroidx/compose/ui/draw/CacheDrawScope;", "Landroidx/compose/ui/draw/DrawResult;", "drawWithContent", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class DrawModifierKt {
    public static final Modifier drawBehind(Modifier modifier0, Function1 function10) {
        Intrinsics.checkNotNullParameter(modifier0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "onDraw");
        return modifier0.then(new DrawBackgroundModifier(function10, InspectableValueKt.getNoInspectorInfo()));

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001A\u00020\u0001*\u00020\u0000H\n¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/InspectorInfo;", "", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public final class androidx.compose.ui.draw.DrawModifierKt.drawBehind..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            final Function1 $onDraw$inlined;

            public androidx.compose.ui.draw.DrawModifierKt.drawBehind..inlined.debugInspectorInfo.1(Function1 function10) {
                this.$onDraw$inlined = function10;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(InspectorInfo inspectorInfo0) {
                Intrinsics.checkNotNullParameter(inspectorInfo0, "$this$null");
                inspectorInfo0.setName("drawBehind");
                inspectorInfo0.getProperties().set("onDraw", this.$onDraw$inlined);
            }
        }

    }

    public static final Modifier drawWithCache(Modifier modifier0, Function1 function10) {
        Intrinsics.checkNotNullParameter(modifier0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "onBuildDrawCache");
        return ComposedModifierKt.composed(modifier0, InspectableValueKt.getNoInspectorInfo(), new Function3(function10) {
            final Function1 $onBuildDrawCache;

            {
                this.$onBuildDrawCache = function10;
                super(3);
            }

            public final Modifier invoke(Modifier modifier0, Composer composer0, int v) {
                Intrinsics.checkNotNullParameter(modifier0, "$this$composed");
                composer0.startReplaceableGroup(514408810);
                ComposerKt.sourceInformation(composer0, "C139@4427L29:DrawModifier.kt#rupz3x");
                composer0.startReplaceableGroup(0xFFC7BCB7);
                ComposerKt.sourceInformation(composer0, "C(remember):Composables.kt#9igjgp");
                CacheDrawScope cacheDrawScope0 = composer0.rememberedValue();
                if(cacheDrawScope0 == Composer.Companion.getEmpty()) {
                    cacheDrawScope0 = new CacheDrawScope();
                    composer0.updateRememberedValue(cacheDrawScope0);
                }
                composer0.endReplaceableGroup();
                Modifier modifier1 = modifier0.then(new DrawContentCacheModifier(cacheDrawScope0, this.$onBuildDrawCache));
                composer0.endReplaceableGroup();
                return modifier1;
            }

            @Override  // kotlin.jvm.functions.Function3
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.invoke(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001A\u00020\u0001*\u00020\u0000H\n¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/InspectorInfo;", "", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public final class androidx.compose.ui.draw.DrawModifierKt.drawWithCache..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            final Function1 $onBuildDrawCache$inlined;

            public androidx.compose.ui.draw.DrawModifierKt.drawWithCache..inlined.debugInspectorInfo.1(Function1 function10) {
                this.$onBuildDrawCache$inlined = function10;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(InspectorInfo inspectorInfo0) {
                Intrinsics.checkNotNullParameter(inspectorInfo0, "$this$null");
                inspectorInfo0.setName("drawWithCache");
                inspectorInfo0.getProperties().set("onBuildDrawCache", this.$onBuildDrawCache$inlined);
            }
        }

    }

    public static final Modifier drawWithContent(Modifier modifier0, Function1 function10) {
        Intrinsics.checkNotNullParameter(modifier0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "onDraw");
        return modifier0.then(new DrawWithContentModifier(function10, InspectableValueKt.getNoInspectorInfo()));

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001A\u00020\u0001*\u00020\u0000H\n¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/InspectorInfo;", "", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public final class androidx.compose.ui.draw.DrawModifierKt.drawWithContent..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            final Function1 $onDraw$inlined;

            public androidx.compose.ui.draw.DrawModifierKt.drawWithContent..inlined.debugInspectorInfo.1(Function1 function10) {
                this.$onDraw$inlined = function10;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(InspectorInfo inspectorInfo0) {
                Intrinsics.checkNotNullParameter(inspectorInfo0, "$this$null");
                inspectorInfo0.setName("drawWithContent");
                inspectorInfo0.getProperties().set("onDraw", this.$onDraw$inlined);
            }
        }

    }
}

