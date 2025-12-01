package androidx.compose.ui.graphics;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\"!\u0010\u0000\u001A\u00020\u0001*\u00020\u00028FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006\"!\u0010\u0007\u001A\u00020\u0001*\u00020\u00028FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\b\u0010\u0004\u001A\u0004\b\t\u0010\u0006\"!\u0010\n\u001A\u00020\u0001*\u00020\u00028FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u000B\u0010\u0004\u001A\u0004\b\f\u0010\u0006\"!\u0010\r\u001A\u00020\u0001*\u00020\u00028FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u000E\u0010\u0004\u001A\u0004\b\u000F\u0010\u0006\"!\u0010\u0010\u001A\u00020\u0001*\u00020\u00028FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0011\u0010\u0004\u001A\u0004\b\u0012\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"difference", "Landroidx/compose/ui/graphics/PathOperation;", "Landroidx/compose/ui/graphics/PathOperation$Companion;", "getDifference$annotations", "(Landroidx/compose/ui/graphics/PathOperation$Companion;)V", "getDifference", "(Landroidx/compose/ui/graphics/PathOperation$Companion;)I", "intersect", "getIntersect$annotations", "getIntersect", "reverseDifference", "getReverseDifference$annotations", "getReverseDifference", "union", "getUnion$annotations", "getUnion", "xor", "getXor$annotations", "getXor", "ui-graphics_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class PathOperationKt {
    public static final int getDifference(Companion pathOperation$Companion0) {
        Intrinsics.checkNotNullParameter(pathOperation$Companion0, "<this>");
        return 0;
    }

    @Deprecated(message = "Use PathOperation.Difference instead", replaceWith = @ReplaceWith(expression = "PathOperation.Difference", imports = {"androidx.compose.ui.graphics.PathOperation.Difference"}))
    public static void getDifference$annotations(Companion pathOperation$Companion0) {
    }

    public static final int getIntersect(Companion pathOperation$Companion0) {
        Intrinsics.checkNotNullParameter(pathOperation$Companion0, "<this>");
        return 1;
    }

    @Deprecated(message = "Use PathOperation.Intersect instead", replaceWith = @ReplaceWith(expression = "PathOperation.Intersect", imports = {"androidx.compose.ui.graphics.PathOperation.Intersect"}))
    public static void getIntersect$annotations(Companion pathOperation$Companion0) {
    }

    public static final int getReverseDifference(Companion pathOperation$Companion0) {
        Intrinsics.checkNotNullParameter(pathOperation$Companion0, "<this>");
        return 4;
    }

    @Deprecated(message = "Use PathOperation.ReverseDifference instead", replaceWith = @ReplaceWith(expression = "PathOperation.ReverseDifference", imports = {"androidx.compose.ui.graphics.PathOperation.ReverseDifference"}))
    public static void getReverseDifference$annotations(Companion pathOperation$Companion0) {
    }

    public static final int getUnion(Companion pathOperation$Companion0) {
        Intrinsics.checkNotNullParameter(pathOperation$Companion0, "<this>");
        return 2;
    }

    @Deprecated(message = "Use PathOperation.Union instead", replaceWith = @ReplaceWith(expression = "PathOperation.Union", imports = {"androidx.compose.ui.graphics.PathOperation.Union"}))
    public static void getUnion$annotations(Companion pathOperation$Companion0) {
    }

    public static final int getXor(Companion pathOperation$Companion0) {
        Intrinsics.checkNotNullParameter(pathOperation$Companion0, "<this>");
        return 3;
    }

    @Deprecated(message = "Use PathOperation.Xor instead", replaceWith = @ReplaceWith(expression = "PathOperation.Xor", imports = {"androidx.compose.ui.graphics.PathOperation.Xor"}))
    public static void getXor$annotations(Companion pathOperation$Companion0) {
    }
}

