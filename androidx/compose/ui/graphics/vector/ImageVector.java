package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \'2\u00020\u0001:\u0002&\'BJ\b\u0000\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\u0007\u001A\u00020\b\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\n\u001A\u00020\u000B\u0012\u0006\u0010\f\u001A\u00020\r\u0012\u0006\u0010\u000E\u001A\u00020\u000Fø\u0001\u0000¢\u0006\u0002\u0010\u0010J\u0013\u0010!\u001A\u00020\"2\b\u0010#\u001A\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010$\u001A\u00020%H\u0016R\u001C\u0010\u0006\u001A\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0013\u001A\u0004\b\u0011\u0010\u0012R\u001C\u0010\u0004\u001A\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0013\u001A\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001A\u00020\u000B¢\u0006\b\n\u0000\u001A\u0004\b\u0017\u0010\u0018R\u001C\u0010\u000E\u001A\u00020\u000Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u001B\u001A\u0004\b\u0019\u0010\u001AR\u001C\u0010\f\u001A\u00020\rø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u001E\u001A\u0004\b\u001C\u0010\u001DR\u0011\u0010\t\u001A\u00020\b¢\u0006\b\n\u0000\u001A\u0004\b\u001F\u0010\u0012R\u0011\u0010\u0007\u001A\u00020\b¢\u0006\b\n\u0000\u001A\u0004\b \u0010\u0012\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", "", "name", "", "defaultWidth", "Landroidx/compose/ui/unit/Dp;", "defaultHeight", "viewportWidth", "", "viewportHeight", "root", "Landroidx/compose/ui/graphics/vector/VectorGroup;", "tintColor", "Landroidx/compose/ui/graphics/Color;", "tintBlendMode", "Landroidx/compose/ui/graphics/BlendMode;", "(Ljava/lang/String;FFFFLandroidx/compose/ui/graphics/vector/VectorGroup;JILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDefaultHeight-D9Ej5fM", "()F", "F", "getDefaultWidth-D9Ej5fM", "getName", "()Ljava/lang/String;", "getRoot", "()Landroidx/compose/ui/graphics/vector/VectorGroup;", "getTintBlendMode-0nO6VwU", "()I", "I", "getTintColor-0d7_KjU", "()J", "J", "getViewportHeight", "getViewportWidth", "equals", "", "other", "hashCode", "", "Builder", "Companion", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class ImageVector {
    @Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001BBF\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\u0007\u001A\u00020\b\u0012\u0006\u0010\t\u001A\u00020\b\u0012\b\b\u0002\u0010\n\u001A\u00020\u000B\u0012\b\b\u0002\u0010\f\u001A\u00020\r\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010\u000EJf\u0010\u001C\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u001D\u001A\u00020\b2\b\b\u0002\u0010\u001E\u001A\u00020\b2\b\b\u0002\u0010\u001F\u001A\u00020\b2\b\b\u0002\u0010 \u001A\u00020\b2\b\b\u0002\u0010!\u001A\u00020\b2\b\b\u0002\u0010\"\u001A\u00020\b2\b\b\u0002\u0010#\u001A\u00020\b2\u000E\b\u0002\u0010$\u001A\b\u0012\u0004\u0012\u00020&0%J\u00A7\u0001\u0010\'\u001A\u00020\u00002\f\u0010(\u001A\b\u0012\u0004\u0012\u00020&0%2\b\b\u0002\u0010)\u001A\u00020*2\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010+\u001A\u0004\u0018\u00010,2\b\b\u0002\u0010-\u001A\u00020\b2\n\b\u0002\u0010.\u001A\u0004\u0018\u00010,2\b\b\u0002\u0010/\u001A\u00020\b2\b\b\u0002\u00100\u001A\u00020\b2\b\b\u0002\u00101\u001A\u0002022\b\b\u0002\u00103\u001A\u0002042\b\b\u0002\u00105\u001A\u00020\b2\b\b\u0002\u00106\u001A\u00020\b2\b\b\u0002\u00107\u001A\u00020\b2\b\b\u0002\u00108\u001A\u00020\b\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b9\u0010:J\u0006\u0010;\u001A\u00020<J\u0006\u0010=\u001A\u00020\u0000J\b\u0010>\u001A\u00020?H\u0002J\f\u0010@\u001A\u00020A*\u00020\u0010H\u0002R\u0014\u0010\u000F\u001A\u00020\u00108BX\u0082\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0006\u001A\u00020\u0005X\u0082\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0004\n\u0002\u0010\u0013R\u0019\u0010\u0004\u001A\u00020\u0005X\u0082\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0004\n\u0002\u0010\u0013R\u000E\u0010\u0014\u001A\u00020\u0015X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0002\u001A\u00020\u0003X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u001F\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u00100\u0017X\u0082\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0004\n\u0002\u0010\u0018R\u000E\u0010\u0019\u001A\u00020\u0010X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0019\u0010\f\u001A\u00020\rX\u0082\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0004\n\u0002\u0010\u001AR\u0019\u0010\n\u001A\u00020\u000BX\u0082\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0004\n\u0002\u0010\u001BR\u000E\u0010\t\u001A\u00020\bX\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0007\u001A\u00020\bX\u0082\u0004\u00A2\u0006\u0002\n\u0000\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006C"}, d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "", "name", "", "defaultWidth", "Landroidx/compose/ui/unit/Dp;", "defaultHeight", "viewportWidth", "", "viewportHeight", "tintColor", "Landroidx/compose/ui/graphics/Color;", "tintBlendMode", "Landroidx/compose/ui/graphics/BlendMode;", "(Ljava/lang/String;FFFFJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "currentGroup", "Landroidx/compose/ui/graphics/vector/ImageVector$Builder$GroupParams;", "getCurrentGroup", "()Landroidx/compose/ui/graphics/vector/ImageVector$Builder$GroupParams;", "F", "isConsumed", "", "nodes", "Landroidx/compose/ui/graphics/vector/Stack;", "Ljava/util/ArrayList;", "root", "I", "J", "addGroup", "rotate", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "clipPathData", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "addPath", "pathData", "pathFillType", "Landroidx/compose/ui/graphics/PathFillType;", "fill", "Landroidx/compose/ui/graphics/Brush;", "fillAlpha", "stroke", "strokeAlpha", "strokeLineWidth", "strokeLineCap", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeLineJoin", "Landroidx/compose/ui/graphics/StrokeJoin;", "strokeLineMiter", "trimPathStart", "trimPathEnd", "trimPathOffset", "addPath-oIyEayM", "(Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFF)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "build", "Landroidx/compose/ui/graphics/vector/ImageVector;", "clearGroup", "ensureNotConsumed", "", "asVectorGroup", "Landroidx/compose/ui/graphics/vector/VectorGroup;", "GroupParams", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Builder {
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u001C\b\u0002\u0018\u00002\u00020\u0001Bu\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0005\u0012\b\b\u0002\u0010\b\u001A\u00020\u0005\u0012\b\b\u0002\u0010\t\u001A\u00020\u0005\u0012\b\b\u0002\u0010\n\u001A\u00020\u0005\u0012\b\b\u0002\u0010\u000B\u001A\u00020\u0005\u0012\u000E\b\u0002\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000E0\r\u0012\u000E\b\u0002\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\u0010\u0012R \u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000E0\rX\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001A\u0010\u0002\u001A\u00020\u0003X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0019\u0010\u001A\"\u0004\b\u001B\u0010\u001CR\u001A\u0010\u0006\u001A\u00020\u0005X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u001D\u0010\u001E\"\u0004\b\u001F\u0010 R\u001A\u0010\u0007\u001A\u00020\u0005X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b!\u0010\u001E\"\u0004\b\"\u0010 R\u001A\u0010\u0004\u001A\u00020\u0005X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b#\u0010\u001E\"\u0004\b$\u0010 R\u001A\u0010\b\u001A\u00020\u0005X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b%\u0010\u001E\"\u0004\b&\u0010 R\u001A\u0010\t\u001A\u00020\u0005X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\'\u0010\u001E\"\u0004\b(\u0010 R\u001A\u0010\n\u001A\u00020\u0005X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b)\u0010\u001E\"\u0004\b*\u0010 R\u001A\u0010\u000B\u001A\u00020\u0005X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b+\u0010\u001E\"\u0004\b,\u0010 ¨\u0006-"}, d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector$Builder$GroupParams;", "", "name", "", "rotate", "", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "clipPathData", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "children", "", "Landroidx/compose/ui/graphics/vector/VectorNode;", "(Ljava/lang/String;FFFFFFFLjava/util/List;Ljava/util/List;)V", "getChildren", "()Ljava/util/List;", "setChildren", "(Ljava/util/List;)V", "getClipPathData", "setClipPathData", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getPivotX", "()F", "setPivotX", "(F)V", "getPivotY", "setPivotY", "getRotate", "setRotate", "getScaleX", "setScaleX", "getScaleY", "setScaleY", "getTranslationX", "setTranslationX", "getTranslationY", "setTranslationY", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
        static final class GroupParams {
            private List children;
            private List clipPathData;
            private String name;
            private float pivotX;
            private float pivotY;
            private float rotate;
            private float scaleX;
            private float scaleY;
            private float translationX;
            private float translationY;

            public GroupParams() {
                this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 0x3FF, null);
            }

            public GroupParams(String s, float f, float f1, float f2, float f3, float f4, float f5, float f6, List list0, List list1) {
                Intrinsics.checkNotNullParameter(s, "name");
                Intrinsics.checkNotNullParameter(list0, "clipPathData");
                Intrinsics.checkNotNullParameter(list1, "children");
                super();
                this.name = s;
                this.rotate = f;
                this.pivotX = f1;
                this.pivotY = f2;
                this.scaleX = f3;
                this.scaleY = f4;
                this.translationX = f5;
                this.translationY = f6;
                this.clipPathData = list0;
                this.children = list1;
            }

            public GroupParams(String s, float f, float f1, float f2, float f3, float f4, float f5, float f6, List list0, List list1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
                List list2 = (v & 0x100) == 0 ? list0 : VectorKt.getEmptyPath();
                List list3 = (v & 0x200) == 0 ? list1 : new ArrayList();
                this(((v & 1) == 0 ? s : ""), ((v & 2) == 0 ? f : 0.0f), ((v & 4) == 0 ? f1 : 0.0f), ((v & 8) == 0 ? f2 : 0.0f), ((v & 16) == 0 ? f3 : 1.0f), ((v & 0x20) == 0 ? f4 : 1.0f), ((v & 0x40) == 0 ? f5 : 0.0f), ((v & 0x80) == 0 ? f6 : 0.0f), list2, list3);
            }

            public final List getChildren() {
                return this.children;
            }

            public final List getClipPathData() {
                return this.clipPathData;
            }

            public final String getName() [...] // 潜在的解密器

            public final float getPivotX() {
                return this.pivotX;
            }

            public final float getPivotY() {
                return this.pivotY;
            }

            public final float getRotate() {
                return this.rotate;
            }

            public final float getScaleX() {
                return this.scaleX;
            }

            public final float getScaleY() {
                return this.scaleY;
            }

            public final float getTranslationX() {
                return this.translationX;
            }

            public final float getTranslationY() {
                return this.translationY;
            }

            public final void setChildren(List list0) {
                Intrinsics.checkNotNullParameter(list0, "<set-?>");
                this.children = list0;
            }

            public final void setClipPathData(List list0) {
                Intrinsics.checkNotNullParameter(list0, "<set-?>");
                this.clipPathData = list0;
            }

            public final void setName(String s) {
                Intrinsics.checkNotNullParameter(s, "<set-?>");
                this.name = s;
            }

            public final void setPivotX(float f) {
                this.pivotX = f;
            }

            public final void setPivotY(float f) {
                this.pivotY = f;
            }

            public final void setRotate(float f) {
                this.rotate = f;
            }

            public final void setScaleX(float f) {
                this.scaleX = f;
            }

            public final void setScaleY(float f) {
                this.scaleY = f;
            }

            public final void setTranslationX(float f) {
                this.translationX = f;
            }

            public final void setTranslationY(float f) {
                this.translationY = f;
            }
        }

        public static final int $stable = 8;
        private final float defaultHeight;
        private final float defaultWidth;
        private boolean isConsumed;
        private final String name;
        private final ArrayList nodes;
        private GroupParams root;
        private final int tintBlendMode;
        private final long tintColor;
        private final float viewportHeight;
        private final float viewportWidth;

        static {
        }

        private Builder(String s, float f, float f1, float f2, float f3, long v, int v1) {
            this.name = s;
            this.defaultWidth = f;
            this.defaultHeight = f1;
            this.viewportWidth = f2;
            this.viewportHeight = f3;
            this.tintColor = v;
            this.tintBlendMode = v1;
            ArrayList arrayList0 = Stack.constructor-impl$default(null, 1, null);
            this.nodes = arrayList0;
            GroupParams imageVector$Builder$GroupParams0 = new GroupParams(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 0x3FF, null);
            this.root = imageVector$Builder$GroupParams0;
            Stack.push-impl(arrayList0, imageVector$Builder$GroupParams0);
        }

        // 去混淆评级： 低(20)
        public Builder(String s, float f, float f1, float f2, float f3, long v, int v1, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
            this(((v2 & 1) == 0 ? s : ""), f, f1, f2, f3, ((v2 & 0x20) == 0 ? v : 16L), ((v2 & 0x40) == 0 ? v1 : 5), null);
        }

        public Builder(String s, float f, float f1, float f2, float f3, long v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
            this(s, f, f1, f2, f3, v, v1);
        }

        public final Builder addGroup(String s, float f, float f1, float f2, float f3, float f4, float f5, float f6, List list0) {
            Intrinsics.checkNotNullParameter(s, "name");
            Intrinsics.checkNotNullParameter(list0, "clipPathData");
            this.ensureNotConsumed();
            GroupParams imageVector$Builder$GroupParams0 = new GroupParams(s, f, f1, f2, f3, f4, f5, f6, list0, null, 0x200, null);
            Stack.push-impl(this.nodes, imageVector$Builder$GroupParams0);
            return this;
        }

        public static Builder addGroup$default(Builder imageVector$Builder0, String s, float f, float f1, float f2, float f3, float f4, float f5, float f6, List list0, int v, Object object0) {
            String s1 = (v & 1) == 0 ? s : "";
            float f7 = 0.0f;
            float f8 = (v & 2) == 0 ? f : 0.0f;
            float f9 = (v & 4) == 0 ? f1 : 0.0f;
            float f10 = (v & 8) == 0 ? f2 : 0.0f;
            float f11 = 1.0f;
            float f12 = (v & 16) == 0 ? f3 : 1.0f;
            if((v & 0x20) == 0) {
                f11 = f4;
            }
            float f13 = (v & 0x40) == 0 ? f5 : 0.0f;
            if((v & 0x80) == 0) {
                f7 = f6;
            }
            return (v & 0x100) == 0 ? imageVector$Builder0.addGroup(s1, f8, f9, f10, f12, f11, f13, f7, list0) : imageVector$Builder0.addGroup(s1, f8, f9, f10, f12, f11, f13, f7, VectorKt.getEmptyPath());
        }

        public final Builder addPath-oIyEayM(List list0, int v, String s, Brush brush0, float f, Brush brush1, float f1, float f2, int v1, int v2, float f3, float f4, float f5, float f6) {
            Intrinsics.checkNotNullParameter(list0, "pathData");
            Intrinsics.checkNotNullParameter(s, "name");
            this.ensureNotConsumed();
            this.getCurrentGroup().getChildren().add(new VectorPath(s, list0, v, brush0, f, brush1, f1, f2, v1, v2, f3, f4, f5, f6, null));
            return this;
        }

        public static Builder addPath-oIyEayM$default(Builder imageVector$Builder0, List list0, int v, String s, Brush brush0, float f, Brush brush1, float f1, float f2, int v1, int v2, float f3, float f4, float f5, float f6, int v3, Object object0) {
            Brush brush2 = null;
            float f7 = 1.0f;
            if((v3 & 0x20) == 0) {
                brush2 = brush1;
            }
            float f8 = 0.0f;
            if((v3 & 0x1000) == 0) {
                f7 = f5;
            }
            if((v3 & 0x2000) == 0) {
                f8 = f6;
            }
            return imageVector$Builder0.addPath-oIyEayM(list0, ((v3 & 2) == 0 ? v : 0), ((v3 & 4) == 0 ? s : ""), ((v3 & 8) == 0 ? brush0 : null), ((v3 & 16) == 0 ? f : 1.0f), brush2, ((v3 & 0x40) == 0 ? f1 : 1.0f), ((v3 & 0x80) == 0 ? f2 : 0.0f), ((v3 & 0x100) == 0 ? v1 : 0), ((v3 & 0x200) == 0 ? v2 : 0), ((v3 & 0x400) == 0 ? f3 : 4.0f), ((v3 & 0x800) == 0 ? f4 : 0.0f), f7, f8);
        }

        // 去混淆评级： 低(20)
        private final VectorGroup asVectorGroup(GroupParams imageVector$Builder$GroupParams0) {
            return new VectorGroup("", imageVector$Builder$GroupParams0.getRotate(), imageVector$Builder$GroupParams0.getPivotX(), imageVector$Builder$GroupParams0.getPivotY(), imageVector$Builder$GroupParams0.getScaleX(), imageVector$Builder$GroupParams0.getScaleY(), imageVector$Builder$GroupParams0.getTranslationX(), imageVector$Builder$GroupParams0.getTranslationY(), imageVector$Builder$GroupParams0.getClipPathData(), imageVector$Builder$GroupParams0.getChildren());
        }

        public final ImageVector build() {
            this.ensureNotConsumed();
            while(Stack.getSize-impl(this.nodes) > 1) {
                this.clearGroup();
            }
            VectorGroup vectorGroup0 = this.asVectorGroup(this.root);
            ImageVector imageVector0 = new ImageVector(this.name, this.defaultWidth, this.defaultHeight, this.viewportWidth, this.viewportHeight, vectorGroup0, this.tintColor, this.tintBlendMode, null);
            this.isConsumed = true;
            return imageVector0;
        }

        public final Builder clearGroup() {
            this.ensureNotConsumed();
            GroupParams imageVector$Builder$GroupParams0 = (GroupParams)Stack.pop-impl(this.nodes);
            this.getCurrentGroup().getChildren().add(this.asVectorGroup(imageVector$Builder$GroupParams0));
            return this;
        }

        private final void ensureNotConsumed() {
            if(!this.isConsumed == 0) {
                throw new IllegalStateException("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
        }

        private final GroupParams getCurrentGroup() {
            return (GroupParams)Stack.peek-impl(this.nodes);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector$Companion;", "", "()V", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final Companion Companion;
    private final float defaultHeight;
    private final float defaultWidth;
    private final String name;
    private final VectorGroup root;
    private final int tintBlendMode;
    private final long tintColor;
    private final float viewportHeight;
    private final float viewportWidth;

    static {
        ImageVector.Companion = new Companion(null);
    }

    private ImageVector(String s, float f, float f1, float f2, float f3, VectorGroup vectorGroup0, long v, int v1) {
        this.name = s;
        this.defaultWidth = f;
        this.defaultHeight = f1;
        this.viewportWidth = f2;
        this.viewportHeight = f3;
        this.root = vectorGroup0;
        this.tintColor = v;
        this.tintBlendMode = v1;
    }

    public ImageVector(String s, float f, float f1, float f2, float f3, VectorGroup vectorGroup0, long v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        this(s, f, f1, f2, f3, vectorGroup0, v, v1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ImageVector)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.name, ((ImageVector)object0).name)) {
            return false;
        }
        if(!Dp.equals-impl0(this.getDefaultWidth-D9Ej5fM(), ((ImageVector)object0).getDefaultWidth-D9Ej5fM())) {
            return false;
        }
        if(!Dp.equals-impl0(this.getDefaultHeight-D9Ej5fM(), ((ImageVector)object0).getDefaultHeight-D9Ej5fM())) {
            return false;
        }
        if(this.viewportWidth != ((ImageVector)object0).viewportWidth) {
            return false;
        }
        if(this.viewportHeight != ((ImageVector)object0).viewportHeight) {
            return false;
        }
        if(!Intrinsics.areEqual(this.root, ((ImageVector)object0).root)) {
            return false;
        }
        return Color.equals-impl0(this.getTintColor-0d7_KjU(), ((ImageVector)object0).getTintColor-0d7_KjU()) ? BlendMode.equals-impl0(this.getTintBlendMode-0nO6VwU(), ((ImageVector)object0).getTintBlendMode-0nO6VwU()) : false;
    }

    public final float getDefaultHeight-D9Ej5fM() {
        return this.defaultHeight;
    }

    public final float getDefaultWidth-D9Ej5fM() {
        return this.defaultWidth;
    }

    public final String getName() {
        return this.name;
    }

    public final VectorGroup getRoot() {
        return this.root;
    }

    public final int getTintBlendMode-0nO6VwU() {
        return this.tintBlendMode;
    }

    public final long getTintColor-0d7_KjU() {
        return this.tintColor;
    }

    public final float getViewportHeight() {
        return this.viewportHeight;
    }

    public final float getViewportWidth() {
        return this.viewportWidth;
    }

    @Override
    public int hashCode() {
        return ((((((this.name.hashCode() * 0x1F + Dp.hashCode-impl(this.getDefaultWidth-D9Ej5fM())) * 0x1F + Dp.hashCode-impl(this.getDefaultHeight-D9Ej5fM())) * 0x1F + Float.floatToIntBits(this.viewportWidth)) * 0x1F + Float.floatToIntBits(this.viewportHeight)) * 0x1F + this.root.hashCode()) * 0x1F + Color.hashCode-impl(this.getTintColor-0d7_KjU())) * 0x1F + this.getTintBlendMode-0nO6VwU();
    }
}

