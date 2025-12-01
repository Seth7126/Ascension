package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A+\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0014\b\u0002\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0\u0007H\u0001¢\u0006\u0002\u0010\t\u001A\u0015\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\rH\u0007¢\u0006\u0002\u0010\u000E\u001A\u0094\u0001\u0010\n\u001A\u00020\u000B2\u0006\u0010\u000F\u001A\u00020\u00102\u0006\u0010\u0011\u001A\u00020\u00102\b\b\u0002\u0010\u0012\u001A\u00020\u00132\b\b\u0002\u0010\u0014\u001A\u00020\u00132\b\b\u0002\u0010\u0015\u001A\u00020\u00012\b\b\u0002\u0010\u0016\u001A\u00020\u00172\b\b\u0002\u0010\u0018\u001A\u00020\u00192;\u0010\u001A\u001A7\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u001C\u0012\b\b\u0015\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u001C\u0012\b\b\u0015\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00030\u001B¢\u0006\u0002\b\u001DH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001E\u0010\u001F\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006 "}, d2 = {"RootGroupName", "", "RenderVectorGroup", "", "group", "Landroidx/compose/ui/graphics/vector/VectorGroup;", "overrides", "", "Landroidx/compose/ui/graphics/vector/VectorOverride;", "(Landroidx/compose/ui/graphics/vector/VectorGroup;Ljava/util/Map;Landroidx/compose/runtime/Composer;II)V", "rememberVectorPainter", "Landroidx/compose/ui/graphics/vector/VectorPainter;", "image", "Landroidx/compose/ui/graphics/vector/ImageVector;", "(Landroidx/compose/ui/graphics/vector/ImageVector;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/vector/VectorPainter;", "defaultWidth", "Landroidx/compose/ui/unit/Dp;", "defaultHeight", "viewportWidth", "", "viewportHeight", "name", "tintColor", "Landroidx/compose/ui/graphics/Color;", "tintBlendMode", "Landroidx/compose/ui/graphics/BlendMode;", "content", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "Landroidx/compose/runtime/Composable;", "rememberVectorPainter-mlNsNFs", "(FFFFLjava/lang/String;JILkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/graphics/vector/VectorPainter;", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class VectorPainterKt {
    public static final String RootGroupName = "VectorRootGroup";

    public static final void RenderVectorGroup(VectorGroup vectorGroup0, Map map0, Composer composer0, int v, int v1) {
        Map map1;
        Map map4;
        Map map2;
        int v2;
        Intrinsics.checkNotNullParameter(vectorGroup0, "group");
        Composer composer1 = composer0.startRestartGroup(0xEC8D3F4C);
        ComposerKt.sourceInformation(composer1, "C(RenderVectorGroup):VectorPainter.kt#huu6hf");
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(vectorGroup0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 16;
        }
        if((2 & ~v1) != 0 || (v2 & 91 ^ 18) != 0 || !composer1.getSkipping()) {
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                composer1.startDefaults();
                Map map3 = (v1 & 2) == 0 ? map0 : MapsKt.emptyMap();
                composer1.endDefaults();
                map2 = map3;
            }
            else {
                composer1.skipCurrentGroup();
                map2 = map0;
            }
            for(Object object0: vectorGroup0) {
                VectorNode vectorNode0 = (VectorNode)object0;
                if(vectorNode0 instanceof VectorPath) {
                    composer1.startReplaceableGroup(0xEC8D3FFD);
                    ComposerKt.sourceInformation(composer1, "318@10527L1004");
                    VectorOverride vectorOverride0 = (VectorOverride)map2.get(((VectorPath)vectorNode0).getName());
                    if(vectorOverride0 == null) {
                        vectorOverride0 = DefaultVectorOverride.INSTANCE;
                    }
                    map4 = map2;
                    VectorComposeKt.Path-9cdaXJ4(vectorOverride0.obtainPathData(((VectorPath)vectorNode0).getPathData()), ((VectorPath)vectorNode0).getPathFillType-Rg-k1Os(), ((VectorPath)vectorNode0).getName(), vectorOverride0.obtainFill(((VectorPath)vectorNode0).getFill()), vectorOverride0.obtainFillAlpha(((VectorPath)vectorNode0).getFillAlpha()), vectorOverride0.obtainStroke(((VectorPath)vectorNode0).getStroke()), vectorOverride0.obtainStrokeAlpha(((VectorPath)vectorNode0).getStrokeAlpha()), vectorOverride0.obtainStrokeWidth(((VectorPath)vectorNode0).getStrokeLineWidth()), ((VectorPath)vectorNode0).getStrokeLineCap-KaPHkGw(), ((VectorPath)vectorNode0).getStrokeLineJoin-LxFBmk8(), ((VectorPath)vectorNode0).getStrokeLineMiter(), vectorOverride0.obtainTrimPathStart(((VectorPath)vectorNode0).getTrimPathStart()), vectorOverride0.obtainTrimPathEnd(((VectorPath)vectorNode0).getTrimPathEnd()), vectorOverride0.obtainTrimPathOffset(((VectorPath)vectorNode0).getTrimPathOffset()), composer1, 8, 0, 0);
                }
                else {
                    map4 = map2;
                    if(vectorNode0 instanceof VectorGroup) {
                        composer1.startReplaceableGroup(0xEC8D4475);
                        ComposerKt.sourceInformation(composer1, "336@11671L740");
                        VectorOverride vectorOverride1 = (VectorOverride)map4.get("");
                        if(vectorOverride1 == null) {
                            vectorOverride1 = DefaultVectorOverride.INSTANCE;
                        }
                        float f = vectorOverride1.obtainRotation(((VectorGroup)vectorNode0).getRotation());
                        float f1 = vectorOverride1.obtainScaleX(((VectorGroup)vectorNode0).getScaleX());
                        float f2 = vectorOverride1.obtainScaleY(((VectorGroup)vectorNode0).getScaleY());
                        float f3 = vectorOverride1.obtainTranslateX(((VectorGroup)vectorNode0).getTranslationX());
                        float f4 = vectorOverride1.obtainTranslateY(((VectorGroup)vectorNode0).getTranslationY());
                        VectorComposeKt.Group("", f, vectorOverride1.obtainPivotX(((VectorGroup)vectorNode0).getPivotX()), vectorOverride1.obtainPivotY(((VectorGroup)vectorNode0).getPivotY()), f1, f2, f3, f4, vectorOverride1.obtainPathData(((VectorGroup)vectorNode0).getClipPathData()), ComposableLambdaKt.composableLambda(composer1, 0xCF215691, true, new Function2(vectorNode0, map4) {
                            final Map $overrides;
                            final VectorNode $vectorNode;

                            {
                                this.$vectorNode = vectorNode0;
                                this.$overrides = map0;
                                super(2);
                            }

                            @Override  // kotlin.jvm.functions.Function2
                            public Object invoke(Object object0, Object object1) {
                                this.invoke(((Composer)object0), ((Number)object1).intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer0, int v) {
                                ComposerKt.sourceInformation(composer0, "C347@12337L60:VectorPainter.kt#huu6hf");
                                if((v & 11 ^ 2) == 0 && composer0.getSkipping()) {
                                    composer0.skipToGroupEnd();
                                    return;
                                }
                                VectorPainterKt.RenderVectorGroup(((VectorGroup)this.$vectorNode), this.$overrides, composer0, 0x40, 0);
                            }
                        }), composer1, 0x38000000, 0);
                    }
                    else {
                        composer1.startReplaceableGroup(0xEC8D47C0);
                    }
                }
                composer1.endReplaceableGroup();
                map2 = map4;
            }
            map1 = map2;
        }
        else {
            composer1.skipToGroupEnd();
            map1 = map0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new Function2(vectorGroup0, map1, v, v1) {
                final int $$changed;
                final int $$default;
                final VectorGroup $group;
                final Map $overrides;

                {
                    this.$group = vectorGroup0;
                    this.$overrides = map0;
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
                    VectorPainterKt.RenderVectorGroup(this.$group, this.$overrides, composer0, this.$$changed | 1, this.$$default);
                }
            });
        }
    }

    public static final VectorPainter rememberVectorPainter(ImageVector imageVector0, Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(imageVector0, "image");
        composer0.startReplaceableGroup(-1998939043);
        ComposerKt.sourceInformation(composer0, "C(rememberVectorPainter)105@4363L385:VectorPainter.kt#huu6hf");
        VectorPainter vectorPainter0 = VectorPainterKt.rememberVectorPainter-mlNsNFs(imageVector0.getDefaultWidth-D9Ej5fM(), imageVector0.getDefaultHeight-D9Ej5fM(), imageVector0.getViewportWidth(), imageVector0.getViewportHeight(), imageVector0.getName(), imageVector0.getTintColor-0d7_KjU(), imageVector0.getTintBlendMode-0nO6VwU(), ComposableLambdaKt.composableLambda(composer0, 0xCF2174DB, true, new Function4(imageVector0) {
            final ImageVector $image;

            {
                this.$image = imageVector0;
                super(4);
            }

            @Override  // kotlin.jvm.functions.Function4
            public Object invoke(Object object0, Object object1, Object object2, Object object3) {
                this.invoke(((Number)object0).floatValue(), ((Number)object1).floatValue(), ((Composer)object2), ((Number)object3).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(float f, float f1, Composer composer0, int v) {
                ComposerKt.sourceInformation(composer0, "C113@4703L37:VectorPainter.kt#huu6hf");
                if((v & 11 ^ 2) == 0 && composer0.getSkipping()) {
                    composer0.skipToGroupEnd();
                    return;
                }
                VectorPainterKt.RenderVectorGroup(this.$image.getRoot(), null, composer0, 0, 2);
            }
        }), composer0, 0xC00000, 0);
        composer0.endReplaceableGroup();
        return vectorPainter0;
    }

    public static final VectorPainter rememberVectorPainter-mlNsNFs(float f, float f1, float f2, float f3, String s, long v, int v1, Function4 function40, Composer composer0, int v2, int v3) {
        Intrinsics.checkNotNullParameter(function40, "content");
        composer0.startReplaceableGroup(-1998940692);
        ComposerKt.sourceInformation(composer0, "C(rememberVectorPainter)P(2:c#ui.unit.Dp,1:c#ui.unit.Dp,7,6,3,5:c#ui.graphics.Color,4:c#ui.graphics.BlendMode)71@3064L7,84@3614L411:VectorPainter.kt#huu6hf");
        float f4 = NaNf;
        float f5 = (v3 & 4) == 0 ? f2 : NaNf;
        if((v3 & 8) == 0) {
            f4 = f3;
        }
        ComposerKt.sourceInformationMarkerStart(composer0, 103361330, "C:CompositionLocal.kt#9igjgp");
        Object object0 = composer0.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(composer0);
        float f6 = ((Density)object0).toPx-0680j_4(f);
        float f7 = ((Density)object0).toPx-0680j_4(f1);
        if(Float.isNaN(f5)) {
            f5 = f6;
        }
        if(Float.isNaN(f4)) {
            f4 = f7;
        }
        composer0.startReplaceableGroup(0x88DA98BD);
        ComposerKt.sourceInformation(composer0, "*78@3354L28,82@3557L46");
        composer0.startReplaceableGroup(0xFFC7BCB7);
        ComposerKt.sourceInformation(composer0, "C(remember):Composables.kt#9igjgp");
        VectorPainter vectorPainter0 = composer0.rememberedValue();
        if(vectorPainter0 == Composer.Companion.getEmpty()) {
            vectorPainter0 = new VectorPainter();
            composer0.updateRememberedValue(vectorPainter0);
        }
        composer0.endReplaceableGroup();
        vectorPainter0.setSize-uvyYCjk$ui_release(SizeKt.Size(f6, f7));
        vectorPainter0.RenderVector$ui_release(((v3 & 16) == 0 ? s : "VectorRootGroup"), f5, f4, function40, composer0, v2 >> 12 & 0x1C00 | (v2 >> 12 & 14 | 0x8000));
        composer0.endReplaceableGroup();
        EffectsKt.SideEffect(new Function0(vectorPainter0, ((v3 & 0x20) == 0 ? v : 16L), ((v3 & 0x40) == 0 ? v1 : 5)) {
            final VectorPainter $painter;
            final int $tintBlendMode;
            final long $tintColor;

            {
                this.$painter = vectorPainter0;
                this.$tintColor = v;
                this.$tintBlendMode = v1;
                super(0);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                this.invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                ColorFilter colorFilter0 = Color.equals-impl0(this.$tintColor, 16L) ? null : ColorFilter.Companion.tint-xETnrds(this.$tintColor, this.$tintBlendMode);
                this.$painter.setIntrinsicColorFilter$ui_release(colorFilter0);
            }
        }, composer0, 0);
        composer0.endReplaceableGroup();
        return vectorPainter0;
    }
}

