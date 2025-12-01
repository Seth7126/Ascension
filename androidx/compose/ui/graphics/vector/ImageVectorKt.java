package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.Brush;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\u0089\u0001\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\u00052\b\b\u0002\u0010\n\u001A\u00020\u00052\b\b\u0002\u0010\u000B\u001A\u00020\u00052\u000E\b\u0002\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000E0\r2\u0017\u0010\u000F\u001A\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\b\u0012H\u0086\bø\u0001\u0000\u001A\u009E\u0001\u0010\u0013\u001A\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001A\u00020\u00052\n\b\u0002\u0010\u0017\u001A\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001A\u00020\u00052\b\b\u0002\u0010\u0019\u001A\u00020\u00052\b\b\u0002\u0010\u001A\u001A\u00020\u001B2\b\b\u0002\u0010\u001C\u001A\u00020\u001D2\b\b\u0002\u0010\u001E\u001A\u00020\u00052\b\b\u0002\u0010\u001F\u001A\u00020 2\u0017\u0010!\u001A\u0013\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\b\u0012H\u0086\bø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b#\u0010$\u0082\u0002\u0012\n\u0005\b\u009920\u0001\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006%"}, d2 = {"group", "Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "name", "", "rotate", "", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "clipPathData", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "block", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "path", "fill", "Landroidx/compose/ui/graphics/Brush;", "fillAlpha", "stroke", "strokeAlpha", "strokeLineWidth", "strokeLineCap", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeLineJoin", "Landroidx/compose/ui/graphics/StrokeJoin;", "strokeLineMiter", "pathFillType", "Landroidx/compose/ui/graphics/PathFillType;", "pathBuilder", "Landroidx/compose/ui/graphics/vector/PathBuilder;", "path-R_LF-3I", "(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFILkotlin/jvm/functions/Function1;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class ImageVectorKt {
    public static final Builder group(Builder imageVector$Builder0, String s, float f, float f1, float f2, float f3, float f4, float f5, float f6, List list0, Function1 function10) {
        Intrinsics.checkNotNullParameter(imageVector$Builder0, "<this>");
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(list0, "clipPathData");
        Intrinsics.checkNotNullParameter(function10, "block");
        imageVector$Builder0.addGroup(s, f, f1, f2, f3, f4, f5, f6, list0);
        function10.invoke(imageVector$Builder0);
        imageVector$Builder0.clearGroup();
        return imageVector$Builder0;
    }

    public static Builder group$default(Builder imageVector$Builder0, String s, float f, float f1, float f2, float f3, float f4, float f5, float f6, List list0, Function1 function10, int v, Object object0) {
        String s1 = (v & 1) == 0 ? s : "";
        List list1 = (v & 0x100) == 0 ? list0 : VectorKt.getEmptyPath();
        Intrinsics.checkNotNullParameter(imageVector$Builder0, "<this>");
        Intrinsics.checkNotNullParameter(s1, "name");
        Intrinsics.checkNotNullParameter(list1, "clipPathData");
        Intrinsics.checkNotNullParameter(function10, "block");
        imageVector$Builder0.addGroup(s1, ((v & 2) == 0 ? f : 0.0f), ((v & 4) == 0 ? f1 : 0.0f), ((v & 8) == 0 ? f2 : 0.0f), ((v & 16) == 0 ? f3 : 1.0f), ((v & 0x20) == 0 ? f4 : 1.0f), ((v & 0x40) == 0 ? f5 : 0.0f), ((v & 0x80) == 0 ? f6 : 0.0f), list1);
        function10.invoke(imageVector$Builder0);
        imageVector$Builder0.clearGroup();
        return imageVector$Builder0;
    }

    public static final Builder path-R_LF-3I(Builder imageVector$Builder0, String s, Brush brush0, float f, Brush brush1, float f1, float f2, int v, int v1, float f3, int v2, Function1 function10) {
        Intrinsics.checkNotNullParameter(imageVector$Builder0, "$this$path");
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(function10, "pathBuilder");
        PathBuilder pathBuilder0 = new PathBuilder();
        function10.invoke(pathBuilder0);
        return Builder.addPath-oIyEayM$default(imageVector$Builder0, pathBuilder0.getNodes(), v2, s, brush0, f, brush1, f1, f2, v, v1, f3, 0.0f, 0.0f, 0.0f, 0x3800, null);
    }

    public static Builder path-R_LF-3I$default(Builder imageVector$Builder0, String s, Brush brush0, float f, Brush brush1, float f1, float f2, int v, int v1, float f3, int v2, Function1 function10, int v3, Object object0) {
        String s1 = (v3 & 1) == 0 ? s : "";
        Intrinsics.checkNotNullParameter(imageVector$Builder0, "$this$path");
        Intrinsics.checkNotNullParameter(s1, "name");
        Intrinsics.checkNotNullParameter(function10, "pathBuilder");
        PathBuilder pathBuilder0 = new PathBuilder();
        function10.invoke(pathBuilder0);
        return Builder.addPath-oIyEayM$default(imageVector$Builder0, pathBuilder0.getNodes(), ((v3 & 0x200) == 0 ? v2 : 0), s1, ((v3 & 2) == 0 ? brush0 : null), ((v3 & 4) == 0 ? f : 1.0f), ((v3 & 8) == 0 ? brush1 : null), ((v3 & 16) == 0 ? f1 : 1.0f), ((v3 & 0x20) == 0 ? f2 : 0.0f), ((v3 & 0x40) == 0 ? v : 0), ((v3 & 0x80) == 0 ? v1 : 0), ((v3 & 0x100) == 0 ? f3 : 4.0f), 0.0f, 0.0f, 0.0f, 0x3800, null);
    }
}

