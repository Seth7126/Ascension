package androidx.compose.ui.graphics.vector;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A+\u0010(\u001A\b\u0012\u0004\u0012\u00020%0$2\u0017\u0010)\u001A\u0013\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0*\u00A2\u0006\u0002\b-H\u0086\b\u00F8\u0001\u0001\u001A\u0016\u0010.\u001A\b\u0012\u0004\u0012\u00020%0$2\b\u0010/\u001A\u0004\u0018\u00010\u0006\"\u0016\u0010\u0000\u001A\u00020\u0001\u00F8\u0001\u0000\u00A2\u0006\n\n\u0002\u0010\u0004\u001A\u0004\b\u0002\u0010\u0003\"\u000E\u0010\u0005\u001A\u00020\u0006X\u0086T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u0007\u001A\u00020\u0006X\u0086T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\b\u001A\u00020\tX\u0086T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\n\u001A\u00020\tX\u0086T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u000B\u001A\u00020\tX\u0086T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\f\u001A\u00020\tX\u0086T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\r\u001A\u00020\tX\u0086T\u00A2\u0006\u0002\n\u0000\"\u0016\u0010\u000E\u001A\u00020\u000F\u00F8\u0001\u0000\u00A2\u0006\n\n\u0002\u0010\u0004\u001A\u0004\b\u0010\u0010\u0003\"\u0016\u0010\u0011\u001A\u00020\u0012\u00F8\u0001\u0000\u00A2\u0006\n\n\u0002\u0010\u0004\u001A\u0004\b\u0013\u0010\u0003\"\u000E\u0010\u0014\u001A\u00020\tX\u0086T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u0015\u001A\u00020\tX\u0086T\u00A2\u0006\u0002\n\u0000\"\u0016\u0010\u0016\u001A\u00020\u0017\u00F8\u0001\u0000\u00A2\u0006\n\n\u0002\u0010\u0004\u001A\u0004\b\u0018\u0010\u0003\"\u0016\u0010\u0019\u001A\u00020\u001A\u00F8\u0001\u0000\u00A2\u0006\n\n\u0002\u0010\u001D\u001A\u0004\b\u001B\u0010\u001C\"\u000E\u0010\u001E\u001A\u00020\tX\u0086T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u001F\u001A\u00020\tX\u0086T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010 \u001A\u00020\tX\u0086T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010!\u001A\u00020\tX\u0086T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\"\u001A\u00020\tX\u0086T\u00A2\u0006\u0002\n\u0000\"\u0017\u0010#\u001A\b\u0012\u0004\u0012\u00020%0$\u00A2\u0006\b\n\u0000\u001A\u0004\b&\u0010\'\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b\u009920\u0001\u00A8\u00060"}, d2 = {"DefaultFillType", "Landroidx/compose/ui/graphics/PathFillType;", "getDefaultFillType", "()I", "I", "DefaultGroupName", "", "DefaultPathName", "DefaultPivotX", "", "DefaultPivotY", "DefaultRotation", "DefaultScaleX", "DefaultScaleY", "DefaultStrokeLineCap", "Landroidx/compose/ui/graphics/StrokeCap;", "getDefaultStrokeLineCap", "DefaultStrokeLineJoin", "Landroidx/compose/ui/graphics/StrokeJoin;", "getDefaultStrokeLineJoin", "DefaultStrokeLineMiter", "DefaultStrokeLineWidth", "DefaultTintBlendMode", "Landroidx/compose/ui/graphics/BlendMode;", "getDefaultTintBlendMode", "DefaultTintColor", "Landroidx/compose/ui/graphics/Color;", "getDefaultTintColor", "()J", "J", "DefaultTranslationX", "DefaultTranslationY", "DefaultTrimPathEnd", "DefaultTrimPathOffset", "DefaultTrimPathStart", "EmptyPath", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "getEmptyPath", "()Ljava/util/List;", "PathData", "block", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/vector/PathBuilder;", "", "Lkotlin/ExtensionFunctionType;", "addPathNodes", "pathStr", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class VectorKt {
    private static final int DefaultFillType = 0;
    public static final String DefaultGroupName = "";
    public static final String DefaultPathName = "";
    public static final float DefaultPivotX = 0.0f;
    public static final float DefaultPivotY = 0.0f;
    public static final float DefaultRotation = 0.0f;
    public static final float DefaultScaleX = 1.0f;
    public static final float DefaultScaleY = 1.0f;
    private static final int DefaultStrokeLineCap = 0;
    private static final int DefaultStrokeLineJoin = 0;
    public static final float DefaultStrokeLineMiter = 4.0f;
    public static final float DefaultStrokeLineWidth = 0.0f;
    private static final int DefaultTintBlendMode = 0;
    private static final long DefaultTintColor = 0L;
    public static final float DefaultTranslationX = 0.0f;
    public static final float DefaultTranslationY = 0.0f;
    public static final float DefaultTrimPathEnd = 1.0f;
    public static final float DefaultTrimPathOffset;
    public static final float DefaultTrimPathStart;
    private static final List EmptyPath;

    static {
        VectorKt.EmptyPath = CollectionsKt.emptyList();
        VectorKt.DefaultStrokeLineCap = 0;
        VectorKt.DefaultStrokeLineJoin = 0;
        VectorKt.DefaultTintBlendMode = 5;
        VectorKt.DefaultTintColor = 0L;
        VectorKt.DefaultFillType = 0;
    }

    public static final List PathData(Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "block");
        PathBuilder pathBuilder0 = new PathBuilder();
        function10.invoke(pathBuilder0);
        return pathBuilder0.getNodes();
    }

    public static final List addPathNodes(String s) {
        return s == null ? VectorKt.EmptyPath : new PathParser().parsePathString(s).toNodes();
    }

    public static final int getDefaultFillType() [...] // 潜在的解密器

    public static final int getDefaultStrokeLineCap() [...] // 潜在的解密器

    public static final int getDefaultStrokeLineJoin() [...] // 潜在的解密器

    public static final int getDefaultTintBlendMode() {
        return VectorKt.DefaultTintBlendMode;
    }

    public static final long getDefaultTintColor() {
        return VectorKt.DefaultTintColor;
    }

    public static final List getEmptyPath() {
        return VectorKt.EmptyPath;
    }
}

