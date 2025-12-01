package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001A\u0080\u0001\u0010\u0000\u001A\u00020\u00012\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\u00052\b\b\u0002\u0010\n\u001A\u00020\u00052\b\b\u0002\u0010\u000B\u001A\u00020\u00052\u000E\b\u0002\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000E0\r2\u0011\u0010\u000F\u001A\r\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010\u0012\u001A©\u0001\u0010\u0013\u001A\u00020\u00012\f\u0010\u0014\u001A\b\u0012\u0004\u0012\u00020\u000E0\r2\b\b\u0002\u0010\u0015\u001A\u00020\u00162\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0017\u001A\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u0019\u001A\u00020\u00052\n\b\u0002\u0010\u001A\u001A\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001B\u001A\u00020\u00052\b\b\u0002\u0010\u001C\u001A\u00020\u00052\b\b\u0002\u0010\u001D\u001A\u00020\u001E2\b\b\u0002\u0010\u001F\u001A\u00020 2\b\b\u0002\u0010!\u001A\u00020\u00052\b\b\u0002\u0010\"\u001A\u00020\u00052\b\b\u0002\u0010#\u001A\u00020\u00052\b\b\u0002\u0010$\u001A\u00020\u0005H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\'"}, d2 = {"Group", "", "name", "", "rotation", "", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "clipPathData", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/String;FFFFFFFLjava/util/List;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Path", "pathData", "pathFillType", "Landroidx/compose/ui/graphics/PathFillType;", "fill", "Landroidx/compose/ui/graphics/Brush;", "fillAlpha", "stroke", "strokeAlpha", "strokeLineWidth", "strokeLineCap", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeLineJoin", "Landroidx/compose/ui/graphics/StrokeJoin;", "strokeLineMiter", "trimPathStart", "trimPathEnd", "trimPathOffset", "Path-9cdaXJ4", "(Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFLandroidx/compose/runtime/Composer;III)V", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class VectorComposeKt {
    public static final void Group(String s, float f, float f1, float f2, float f3, float f4, float f5, float f6, List list0, Function2 function20, Composer composer0, int v, int v1) {
        float f15;
        float f14;
        List list1;
        float f13;
        float f12;
        float f11;
        float f10;
        float f9;
        String s1;
        List list2;
        float f20;
        float f19;
        float f18;
        float f17;
        float f16;
        String s2;
        float f8;
        float f7;
        int v2;
        Intrinsics.checkNotNullParameter(function20, "content");
        Composer composer1 = composer0.startRestartGroup(0x16DCE0C4);
        ComposerKt.sourceInformation(composer1, "C(Group)P(2,5,3,4,6,7,8,9)39@1405L585:VectorCompose.kt#huu6hf");
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(f) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(f1) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            f7 = f2;
        }
        else if((v & 0x1C00) == 0) {
            f7 = f2;
            v2 |= (composer1.changed(f7) ? 0x800 : 0x400);
        }
        else {
            f7 = f2;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
            f8 = f3;
        }
        else if((0xE000 & v) == 0) {
            f8 = f3;
            v2 |= (composer1.changed(f8) ? 0x4000 : 0x2000);
        }
        else {
            f8 = f3;
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((v & 0x70000) == 0) {
            v2 |= (composer1.changed(f4) ? 0x20000 : 0x10000);
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((v & 0x380000) == 0) {
            v2 |= (composer1.changed(f5) ? 0x100000 : 0x80000);
        }
        if((v1 & 0x80) != 0) {
            v2 |= 0xC00000;
        }
        else if((v & 0x1C00000) == 0) {
            v2 |= (composer1.changed(f6) ? 0x800000 : 0x400000);
        }
        if((v1 & 0x100) != 0) {
            v2 |= 0x2000000;
        }
        if((v1 & 0x200) != 0) {
            v2 |= 0x30000000;
        }
        else if((0x70000000 & v) == 0) {
            v2 |= (composer1.changed(function20) ? 0x20000000 : 0x10000000);
        }
        if((~v1 & 0x100) != 0 || (0x5B6DB6DB & v2 ^ 306783378) != 0 || !composer1.getSkipping()) {
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                composer1.startDefaults();
                s2 = (v1 & 1) == 0 ? s : "";
                f20 = 0.0f;
                f16 = (v1 & 2) == 0 ? f : 0.0f;
                f17 = (v1 & 4) == 0 ? f1 : 0.0f;
                if((v1 & 8) != 0) {
                    f7 = 0.0f;
                }
                f18 = 1.0f;
                if((v1 & 16) != 0) {
                    f8 = 1.0f;
                }
                if((v1 & 0x20) == 0) {
                    f18 = f4;
                }
                f19 = (v1 & 0x40) == 0 ? f5 : 0.0f;
                if((v1 & 0x80) == 0) {
                    f20 = f6;
                }
                if((v1 & 0x100) == 0) {
                    list2 = list0;
                }
                else {
                    list2 = VectorKt.getEmptyPath();
                    v2 &= 0xF1FFFFFF;
                }
                composer1.endDefaults();
            }
            else {
                composer1.skipCurrentGroup();
                if((v1 & 0x100) != 0) {
                    v2 &= 0xF1FFFFFF;
                }
                s2 = s;
                f16 = f;
                f17 = f1;
                f18 = f4;
                f19 = f5;
                f20 = f6;
                list2 = list0;
            }
            Function0 function00 = androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1.INSTANCE;
            composer1.startReplaceableGroup(0x82A2F876);
            ComposerKt.sourceInformation(composer1, "C(ComposeNode)P(1,2)292@10549L9:Composables.kt#9igjgp");
            if(!(composer1.getApplier() instanceof VectorApplier)) {
                ComposablesKt.invalidApplier();
            }
            composer1.startNode();
            if(composer1.getInserting()) {
                composer1.createNode(function00);
            }
            else {
                composer1.useNode();
            }
            Composer composer2 = Updater.constructor-impl(composer1);
            Updater.set-impl(composer2, s2, androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.1.INSTANCE);
            Updater.set-impl(composer2, f16, androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.2.INSTANCE);
            Updater.set-impl(composer2, f17, androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.3.INSTANCE);
            Updater.set-impl(composer2, f7, androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.4.INSTANCE);
            Updater.set-impl(composer2, f8, androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.5.INSTANCE);
            Updater.set-impl(composer2, f18, androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.6.INSTANCE);
            Updater.set-impl(composer2, f19, androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.7.INSTANCE);
            Updater.set-impl(composer2, f20, androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.8.INSTANCE);
            Updater.set-impl(composer2, list2, androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.9.INSTANCE);
            composer1.startReplaceableGroup(0x8F15A3BA);
            ComposerKt.sourceInformation(composer1, "C53@1975L9:VectorCompose.kt#huu6hf");
            function20.invoke(composer1, ((int)(v2 >> 27 & 14)));
            composer1.endReplaceableGroup();
            composer1.endNode();
            composer1.endReplaceableGroup();
            f10 = f17;
            f13 = f20;
            f11 = f18;
            f12 = f19;
            f15 = f8;
            s1 = s2;
            list1 = list2;
            f9 = f16;
            f14 = f7;
        }
        else {
            composer1.skipToGroupEnd();
            s1 = s;
            f9 = f;
            f10 = f1;
            f11 = f4;
            f12 = f5;
            f13 = f6;
            list1 = list0;
            f14 = f7;
            f15 = f8;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new Function2(s1, f9, f10, f14, f15, f11, f12, f13, list1, function20, v, v1) {
                final int $$changed;
                final int $$default;
                final List $clipPathData;
                final Function2 $content;
                final String $name;
                final float $pivotX;
                final float $pivotY;
                final float $rotation;
                final float $scaleX;
                final float $scaleY;
                final float $translationX;
                final float $translationY;

                {
                    this.$name = s;
                    this.$rotation = f;
                    this.$pivotX = f1;
                    this.$pivotY = f2;
                    this.$scaleX = f3;
                    this.$scaleY = f4;
                    this.$translationX = f5;
                    this.$translationY = f6;
                    this.$clipPathData = list0;
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
                    VectorComposeKt.Group(this.$name, this.$rotation, this.$pivotX, this.$pivotY, this.$scaleX, this.$scaleY, this.$translationX, this.$translationY, this.$clipPathData, this.$content, composer0, this.$$changed | 1, this.$$default);
                }
            });
        }

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
        final class androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1 extends Lambda implements Function0 {
            public static final androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1 INSTANCE;

            static {
                androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1.INSTANCE = new androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1();
            }

            androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1() {
                super(0);
            }

            public final GroupComponent invoke() {
                return new GroupComponent();
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        }


        @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
        final class androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.1 extends Lambda implements Function2 {
            public static final androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.1 INSTANCE;

            static {
                androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.1.INSTANCE = new androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.1();
            }

            androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.1() {
                super(2);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                this.invoke(((GroupComponent)object0), ((String)object1));
                return Unit.INSTANCE;
            }

            public final void invoke(GroupComponent groupComponent0, String s) {
                Intrinsics.checkNotNullParameter(groupComponent0, "$this$set");
                Intrinsics.checkNotNullParameter(s, "it");
                groupComponent0.setName(s);
            }
        }


        @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
        final class androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.2 extends Lambda implements Function2 {
            public static final androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.2 INSTANCE;

            static {
                androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.2.INSTANCE = new androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.2();
            }

            androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.2() {
                super(2);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                this.invoke(((GroupComponent)object0), ((Number)object1).floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(GroupComponent groupComponent0, float f) {
                Intrinsics.checkNotNullParameter(groupComponent0, "$this$set");
                groupComponent0.setRotation(f);
            }
        }


        @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
        final class androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.3 extends Lambda implements Function2 {
            public static final androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.3 INSTANCE;

            static {
                androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.3.INSTANCE = new androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.3();
            }

            androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.3() {
                super(2);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                this.invoke(((GroupComponent)object0), ((Number)object1).floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(GroupComponent groupComponent0, float f) {
                Intrinsics.checkNotNullParameter(groupComponent0, "$this$set");
                groupComponent0.setPivotX(f);
            }
        }


        @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
        final class androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.4 extends Lambda implements Function2 {
            public static final androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.4 INSTANCE;

            static {
                androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.4.INSTANCE = new androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.4();
            }

            androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.4() {
                super(2);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                this.invoke(((GroupComponent)object0), ((Number)object1).floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(GroupComponent groupComponent0, float f) {
                Intrinsics.checkNotNullParameter(groupComponent0, "$this$set");
                groupComponent0.setPivotY(f);
            }
        }


        @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
        final class androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.5 extends Lambda implements Function2 {
            public static final androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.5 INSTANCE;

            static {
                androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.5.INSTANCE = new androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.5();
            }

            androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.5() {
                super(2);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                this.invoke(((GroupComponent)object0), ((Number)object1).floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(GroupComponent groupComponent0, float f) {
                Intrinsics.checkNotNullParameter(groupComponent0, "$this$set");
                groupComponent0.setScaleX(f);
            }
        }


        @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
        final class androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.6 extends Lambda implements Function2 {
            public static final androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.6 INSTANCE;

            static {
                androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.6.INSTANCE = new androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.6();
            }

            androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.6() {
                super(2);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                this.invoke(((GroupComponent)object0), ((Number)object1).floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(GroupComponent groupComponent0, float f) {
                Intrinsics.checkNotNullParameter(groupComponent0, "$this$set");
                groupComponent0.setScaleY(f);
            }
        }


        @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
        final class androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.7 extends Lambda implements Function2 {
            public static final androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.7 INSTANCE;

            static {
                androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.7.INSTANCE = new androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.7();
            }

            androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.7() {
                super(2);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                this.invoke(((GroupComponent)object0), ((Number)object1).floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(GroupComponent groupComponent0, float f) {
                Intrinsics.checkNotNullParameter(groupComponent0, "$this$set");
                groupComponent0.setTranslationX(f);
            }
        }


        @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
        final class androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.8 extends Lambda implements Function2 {
            public static final androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.8 INSTANCE;

            static {
                androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.8.INSTANCE = new androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.8();
            }

            androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.8() {
                super(2);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                this.invoke(((GroupComponent)object0), ((Number)object1).floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(GroupComponent groupComponent0, float f) {
                Intrinsics.checkNotNullParameter(groupComponent0, "$this$set");
                groupComponent0.setTranslationY(f);
            }
        }


        @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
        final class androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.9 extends Lambda implements Function2 {
            public static final androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.9 INSTANCE;

            static {
                androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.9.INSTANCE = new androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.9();
            }

            androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.9() {
                super(2);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                this.invoke(((GroupComponent)object0), ((List)object1));
                return Unit.INSTANCE;
            }

            public final void invoke(GroupComponent groupComponent0, List list0) {
                Intrinsics.checkNotNullParameter(groupComponent0, "$this$set");
                Intrinsics.checkNotNullParameter(list0, "it");
                groupComponent0.setClipPathData(list0);
            }
        }

    }

    public static final void Path-9cdaXJ4(List list0, int v, String s, Brush brush0, float f, Brush brush1, float f1, float f2, int v1, int v2, float f3, float f4, float f5, float f6, Composer composer0, int v3, int v4, int v5) {
        Intrinsics.checkNotNullParameter(list0, "pathData");
        Composer composer1 = composer0.startRestartGroup(0x19FA30B0);
        ComposerKt.sourceInformation(composer1, "C(Path)P(3,4:c#ui.graphics.PathFillType,2!4,10,7:c#ui.graphics.StrokeCap,8:c#ui.graphics.StrokeJoin!1,13)74@2611L876:VectorCompose.kt#huu6hf");
        int v6 = (v5 & 2) == 0 ? v : 0;
        String s1 = (v5 & 4) == 0 ? s : "";
        Brush brush2 = (v5 & 8) == 0 ? brush0 : null;
        float f7 = (v5 & 16) == 0 ? f : 1.0f;
        Brush brush3 = (v5 & 0x20) == 0 ? brush1 : null;
        float f8 = (v5 & 0x40) == 0 ? f1 : 1.0f;
        float f9 = (v5 & 0x80) == 0 ? f2 : 0.0f;
        int v7 = (v5 & 0x100) == 0 ? v1 : 0;
        int v8 = (v5 & 0x200) == 0 ? v2 : 0;
        float f10 = (v5 & 0x400) == 0 ? f3 : 4.0f;
        float f11 = (v5 & 0x800) == 0 ? f4 : 0.0f;
        float f12 = (v5 & 0x1000) == 0 ? f5 : 1.0f;
        float f13 = (v5 & 0x2000) == 0 ? f6 : 0.0f;
        Function0 function00 = androidx.compose.ui.graphics.vector.VectorComposeKt.Path.1.INSTANCE;
        composer1.startReplaceableGroup(-2103251527);
        ComposerKt.sourceInformation(composer1, "C(ComposeNode):Composables.kt#9igjgp");
        if(!(composer1.getApplier() instanceof VectorApplier)) {
            ComposablesKt.invalidApplier();
        }
        composer1.startNode();
        if(composer1.getInserting()) {
            composer1.createNode(new Function0(function00) {
                final Function0 $factory;

                {
                    this.$factory = function00;
                    super(0);
                }

                @Override  // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.$factory.invoke();
                }
            });
        }
        else {
            composer1.useNode();
        }
        Composer composer2 = Updater.constructor-impl(composer1);
        Updater.set-impl(composer2, s1, androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.1.INSTANCE);
        Updater.set-impl(composer2, list0, androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.2.INSTANCE);
        Updater.set-impl(composer2, PathFillType.box-impl(v6), androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.3.INSTANCE);
        Updater.set-impl(composer2, brush2, androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.4.INSTANCE);
        Updater.set-impl(composer2, f7, androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.5.INSTANCE);
        Updater.set-impl(composer2, brush3, androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.6.INSTANCE);
        Updater.set-impl(composer2, f8, androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.7.INSTANCE);
        Updater.set-impl(composer2, f9, androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.8.INSTANCE);
        Updater.set-impl(composer2, StrokeJoin.box-impl(v8), androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.9.INSTANCE);
        Updater.set-impl(composer2, StrokeCap.box-impl(v7), androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.10.INSTANCE);
        Updater.set-impl(composer2, f10, androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.11.INSTANCE);
        Updater.set-impl(composer2, f11, androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.12.INSTANCE);
        Updater.set-impl(composer2, f12, androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.13.INSTANCE);
        Updater.set-impl(composer2, f13, androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.14.INSTANCE);
        composer1.endNode();
        composer1.endReplaceableGroup();
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new Function2(list0, v6, s1, brush2, f7, brush3, f8, f9, v7, v8, f10, f11, f12, f13, v3, v4, v5) {
                final int $$changed;
                final int $$changed1;
                final int $$default;
                final Brush $fill;
                final float $fillAlpha;
                final String $name;
                final List $pathData;
                final int $pathFillType;
                final Brush $stroke;
                final float $strokeAlpha;
                final int $strokeLineCap;
                final int $strokeLineJoin;
                final float $strokeLineMiter;
                final float $strokeLineWidth;
                final float $trimPathEnd;
                final float $trimPathOffset;
                final float $trimPathStart;

                {
                    this.$pathData = list0;
                    this.$pathFillType = v;
                    this.$name = s;
                    this.$fill = brush0;
                    this.$fillAlpha = f;
                    this.$stroke = brush1;
                    this.$strokeAlpha = f1;
                    this.$strokeLineWidth = f2;
                    this.$strokeLineCap = v1;
                    this.$strokeLineJoin = v2;
                    this.$strokeLineMiter = f3;
                    this.$trimPathStart = f4;
                    this.$trimPathEnd = f5;
                    this.$trimPathOffset = f6;
                    this.$$changed = v3;
                    this.$$changed1 = v4;
                    this.$$default = v5;
                    super(2);
                }

                @Override  // kotlin.jvm.functions.Function2
                public Object invoke(Object object0, Object object1) {
                    this.invoke(((Composer)object0), ((Number)object1).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer0, int v) {
                    VectorComposeKt.Path-9cdaXJ4(this.$pathData, this.$pathFillType, this.$name, this.$fill, this.$fillAlpha, this.$stroke, this.$strokeAlpha, this.$strokeLineWidth, this.$strokeLineCap, this.$strokeLineJoin, this.$strokeLineMiter, this.$trimPathStart, this.$trimPathEnd, this.$trimPathOffset, composer0, this.$$changed | 1, this.$$changed1, this.$$default);
                }
            });
        }

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
        final class androidx.compose.ui.graphics.vector.VectorComposeKt.Path.1 extends Lambda implements Function0 {
            public static final androidx.compose.ui.graphics.vector.VectorComposeKt.Path.1 INSTANCE;

            static {
                androidx.compose.ui.graphics.vector.VectorComposeKt.Path.1.INSTANCE = new androidx.compose.ui.graphics.vector.VectorComposeKt.Path.1();
            }

            androidx.compose.ui.graphics.vector.VectorComposeKt.Path.1() {
                super(0);
            }

            public final PathComponent invoke() {
                return new PathComponent();
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        }


        @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
        final class androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.10 extends Lambda implements Function2 {
            public static final androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.10 INSTANCE;

            static {
                androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.10.INSTANCE = new androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.10();
            }

            androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.10() {
                super(2);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                this.invoke-CSYIeUk(((PathComponent)object0), ((StrokeCap)object1).unbox-impl());
                return Unit.INSTANCE;
            }

            public final void invoke-CSYIeUk(PathComponent pathComponent0, int v) {
                Intrinsics.checkNotNullParameter(pathComponent0, "$this$set");
                pathComponent0.setStrokeLineCap-BeK7IIE(v);
            }
        }


        @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
        final class androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.11 extends Lambda implements Function2 {
            public static final androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.11 INSTANCE;

            static {
                androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.11.INSTANCE = new androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.11();
            }

            androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.11() {
                super(2);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                this.invoke(((PathComponent)object0), ((Number)object1).floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(PathComponent pathComponent0, float f) {
                Intrinsics.checkNotNullParameter(pathComponent0, "$this$set");
                pathComponent0.setStrokeLineMiter(f);
            }
        }


        @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
        final class androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.12 extends Lambda implements Function2 {
            public static final androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.12 INSTANCE;

            static {
                androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.12.INSTANCE = new androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.12();
            }

            androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.12() {
                super(2);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                this.invoke(((PathComponent)object0), ((Number)object1).floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(PathComponent pathComponent0, float f) {
                Intrinsics.checkNotNullParameter(pathComponent0, "$this$set");
                pathComponent0.setTrimPathStart(f);
            }
        }


        @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
        final class androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.13 extends Lambda implements Function2 {
            public static final androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.13 INSTANCE;

            static {
                androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.13.INSTANCE = new androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.13();
            }

            androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.13() {
                super(2);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                this.invoke(((PathComponent)object0), ((Number)object1).floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(PathComponent pathComponent0, float f) {
                Intrinsics.checkNotNullParameter(pathComponent0, "$this$set");
                pathComponent0.setTrimPathEnd(f);
            }
        }


        @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
        final class androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.14 extends Lambda implements Function2 {
            public static final androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.14 INSTANCE;

            static {
                androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.14.INSTANCE = new androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.14();
            }

            androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.14() {
                super(2);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                this.invoke(((PathComponent)object0), ((Number)object1).floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(PathComponent pathComponent0, float f) {
                Intrinsics.checkNotNullParameter(pathComponent0, "$this$set");
                pathComponent0.setTrimPathOffset(f);
            }
        }


        @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
        final class androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.1 extends Lambda implements Function2 {
            public static final androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.1 INSTANCE;

            static {
                androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.1.INSTANCE = new androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.1();
            }

            androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.1() {
                super(2);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                this.invoke(((PathComponent)object0), ((String)object1));
                return Unit.INSTANCE;
            }

            public final void invoke(PathComponent pathComponent0, String s) {
                Intrinsics.checkNotNullParameter(pathComponent0, "$this$set");
                Intrinsics.checkNotNullParameter(s, "it");
                pathComponent0.setName(s);
            }
        }


        @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
        final class androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.2 extends Lambda implements Function2 {
            public static final androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.2 INSTANCE;

            static {
                androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.2.INSTANCE = new androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.2();
            }

            androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.2() {
                super(2);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                this.invoke(((PathComponent)object0), ((List)object1));
                return Unit.INSTANCE;
            }

            public final void invoke(PathComponent pathComponent0, List list0) {
                Intrinsics.checkNotNullParameter(pathComponent0, "$this$set");
                Intrinsics.checkNotNullParameter(list0, "it");
                pathComponent0.setPathData(list0);
            }
        }


        @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
        final class androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.3 extends Lambda implements Function2 {
            public static final androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.3 INSTANCE;

            static {
                androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.3.INSTANCE = new androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.3();
            }

            androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.3() {
                super(2);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                this.invoke-pweu1eQ(((PathComponent)object0), ((PathFillType)object1).unbox-impl());
                return Unit.INSTANCE;
            }

            public final void invoke-pweu1eQ(PathComponent pathComponent0, int v) {
                Intrinsics.checkNotNullParameter(pathComponent0, "$this$set");
                pathComponent0.setPathFillType-oQ8Xj4U(v);
            }
        }


        @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
        final class androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.4 extends Lambda implements Function2 {
            public static final androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.4 INSTANCE;

            static {
                androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.4.INSTANCE = new androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.4();
            }

            androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.4() {
                super(2);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                this.invoke(((PathComponent)object0), ((Brush)object1));
                return Unit.INSTANCE;
            }

            public final void invoke(PathComponent pathComponent0, Brush brush0) {
                Intrinsics.checkNotNullParameter(pathComponent0, "$this$set");
                pathComponent0.setFill(brush0);
            }
        }


        @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
        final class androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.5 extends Lambda implements Function2 {
            public static final androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.5 INSTANCE;

            static {
                androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.5.INSTANCE = new androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.5();
            }

            androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.5() {
                super(2);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                this.invoke(((PathComponent)object0), ((Number)object1).floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(PathComponent pathComponent0, float f) {
                Intrinsics.checkNotNullParameter(pathComponent0, "$this$set");
                pathComponent0.setFillAlpha(f);
            }
        }


        @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
        final class androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.6 extends Lambda implements Function2 {
            public static final androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.6 INSTANCE;

            static {
                androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.6.INSTANCE = new androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.6();
            }

            androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.6() {
                super(2);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                this.invoke(((PathComponent)object0), ((Brush)object1));
                return Unit.INSTANCE;
            }

            public final void invoke(PathComponent pathComponent0, Brush brush0) {
                Intrinsics.checkNotNullParameter(pathComponent0, "$this$set");
                pathComponent0.setStroke(brush0);
            }
        }


        @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
        final class androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.7 extends Lambda implements Function2 {
            public static final androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.7 INSTANCE;

            static {
                androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.7.INSTANCE = new androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.7();
            }

            androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.7() {
                super(2);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                this.invoke(((PathComponent)object0), ((Number)object1).floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(PathComponent pathComponent0, float f) {
                Intrinsics.checkNotNullParameter(pathComponent0, "$this$set");
                pathComponent0.setStrokeAlpha(f);
            }
        }


        @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
        final class androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.8 extends Lambda implements Function2 {
            public static final androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.8 INSTANCE;

            static {
                androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.8.INSTANCE = new androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.8();
            }

            androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.8() {
                super(2);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                this.invoke(((PathComponent)object0), ((Number)object1).floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(PathComponent pathComponent0, float f) {
                Intrinsics.checkNotNullParameter(pathComponent0, "$this$set");
                pathComponent0.setStrokeLineWidth(f);
            }
        }


        @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
        final class androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.9 extends Lambda implements Function2 {
            public static final androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.9 INSTANCE;

            static {
                androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.9.INSTANCE = new androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.9();
            }

            androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.9() {
                super(2);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                this.invoke-kLtJ_vA(((PathComponent)object0), ((StrokeJoin)object1).unbox-impl());
                return Unit.INSTANCE;
            }

            public final void invoke-kLtJ_vA(PathComponent pathComponent0, int v) {
                Intrinsics.checkNotNullParameter(pathComponent0, "$this$set");
                pathComponent0.setStrokeLineJoin-Ww9F2mQ(v);
            }
        }

    }
}

