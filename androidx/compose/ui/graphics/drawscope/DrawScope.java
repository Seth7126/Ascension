package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@DrawScopeMarker
@Metadata(d1 = {"\u0000\u00A4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u0000 h2\u00020\u0001:\u0001hJs\u0010\u0011\u001A\u00020\u00122\u0006\u0010\u0013\u001A\u00020\u00142\u0006\u0010\u0015\u001A\u00020\u00162\u0006\u0010\u0017\u001A\u00020\u00162\u0006\u0010\u0018\u001A\u00020\u00192\b\b\u0002\u0010\u001A\u001A\u00020\u00032\b\b\u0002\u0010\u000E\u001A\u00020\u000F2\b\b\u0002\u0010\u001B\u001A\u00020\u00162\b\b\u0002\u0010\u001C\u001A\u00020\u001D2\n\b\u0002\u0010\u001E\u001A\u0004\u0018\u00010\u001F2\b\b\u0002\u0010 \u001A\u00020!H&\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\"\u0010#Js\u0010\u0011\u001A\u00020\u00122\u0006\u0010$\u001A\u00020%2\u0006\u0010\u0015\u001A\u00020\u00162\u0006\u0010\u0017\u001A\u00020\u00162\u0006\u0010\u0018\u001A\u00020\u00192\b\b\u0002\u0010\u001A\u001A\u00020\u00032\b\b\u0002\u0010\u000E\u001A\u00020\u000F2\b\b\u0002\u0010\u001B\u001A\u00020\u00162\b\b\u0002\u0010\u001C\u001A\u00020\u001D2\n\b\u0002\u0010\u001E\u001A\u0004\u0018\u00010\u001F2\b\b\u0002\u0010 \u001A\u00020!H&\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b&\u0010\'J[\u0010(\u001A\u00020\u00122\u0006\u0010\u0013\u001A\u00020\u00142\b\b\u0002\u0010)\u001A\u00020\u00162\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u001B\u001A\u00020\u00162\b\b\u0002\u0010\u001C\u001A\u00020\u001D2\n\b\u0002\u0010\u001E\u001A\u0004\u0018\u00010\u001F2\b\b\u0002\u0010 \u001A\u00020!H&\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b*\u0010+J[\u0010(\u001A\u00020\u00122\u0006\u0010$\u001A\u00020%2\b\b\u0002\u0010)\u001A\u00020\u00162\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u001B\u001A\u00020\u00162\b\b\u0002\u0010\u001C\u001A\u00020\u001D2\n\b\u0002\u0010\u001E\u001A\u0004\u0018\u00010\u001F2\b\b\u0002\u0010 \u001A\u00020!H&\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b,\u0010-JQ\u0010.\u001A\u00020\u00122\u0006\u0010/\u001A\u0002002\b\b\u0002\u0010\u001A\u001A\u00020\u00032\b\b\u0002\u0010\u001B\u001A\u00020\u00162\b\b\u0002\u0010\u001C\u001A\u00020\u001D2\n\b\u0002\u0010\u001E\u001A\u0004\u0018\u00010\u001F2\b\b\u0002\u0010 \u001A\u00020!H&\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b1\u00102Jo\u0010.\u001A\u00020\u00122\u0006\u0010/\u001A\u0002002\b\b\u0002\u00103\u001A\u0002042\b\b\u0002\u00105\u001A\u0002062\b\b\u0002\u00107\u001A\u0002042\b\b\u0002\u00108\u001A\u0002062\b\b\u0002\u0010\u001B\u001A\u00020\u00162\b\b\u0002\u0010\u001C\u001A\u00020\u001D2\n\b\u0002\u0010\u001E\u001A\u0004\u0018\u00010\u001F2\b\b\u0002\u0010 \u001A\u00020!H&\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b9\u0010:Jm\u0010;\u001A\u00020\u00122\u0006\u0010\u0013\u001A\u00020\u00142\u0006\u0010<\u001A\u00020\u00032\u0006\u0010=\u001A\u00020\u00032\b\b\u0002\u0010>\u001A\u00020\u00162\b\b\u0002\u0010?\u001A\u00020@2\n\b\u0002\u0010A\u001A\u0004\u0018\u00010B2\b\b\u0002\u0010\u001B\u001A\u00020\u00162\n\b\u0002\u0010\u001E\u001A\u0004\u0018\u00010\u001F2\b\b\u0002\u0010 \u001A\u00020!H&\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bC\u0010DJm\u0010;\u001A\u00020\u00122\u0006\u0010$\u001A\u00020%2\u0006\u0010<\u001A\u00020\u00032\u0006\u0010=\u001A\u00020\u00032\b\b\u0002\u0010>\u001A\u00020\u00162\b\b\u0002\u0010?\u001A\u00020@2\n\b\u0002\u0010A\u001A\u0004\u0018\u00010B2\b\b\u0002\u0010\u001B\u001A\u00020\u00162\n\b\u0002\u0010\u001E\u001A\u0004\u0018\u00010\u001F2\b\b\u0002\u0010 \u001A\u00020!H&\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bE\u0010FJ[\u0010G\u001A\u00020\u00122\u0006\u0010\u0013\u001A\u00020\u00142\b\b\u0002\u0010\u001A\u001A\u00020\u00032\b\b\u0002\u0010\u000E\u001A\u00020\u000F2\b\b\u0002\u0010\u001B\u001A\u00020\u00162\b\b\u0002\u0010\u001C\u001A\u00020\u001D2\n\b\u0002\u0010\u001E\u001A\u0004\u0018\u00010\u001F2\b\b\u0002\u0010 \u001A\u00020!H&\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bH\u0010IJ[\u0010G\u001A\u00020\u00122\u0006\u0010$\u001A\u00020%2\b\b\u0002\u0010\u001A\u001A\u00020\u00032\b\b\u0002\u0010\u000E\u001A\u00020\u000F2\b\b\u0002\u0010\u001B\u001A\u00020\u00162\b\b\u0002\u0010\u001C\u001A\u00020\u001D2\n\b\u0002\u0010\u001E\u001A\u0004\u0018\u00010\u001F2\b\b\u0002\u0010 \u001A\u00020!H&\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bJ\u0010KJO\u0010L\u001A\u00020\u00122\u0006\u0010M\u001A\u00020N2\u0006\u0010\u0013\u001A\u00020\u00142\b\b\u0002\u0010\u001B\u001A\u00020\u00162\b\b\u0002\u0010\u001C\u001A\u00020\u001D2\n\b\u0002\u0010\u001E\u001A\u0004\u0018\u00010\u001F2\b\b\u0002\u0010 \u001A\u00020!H&\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bO\u0010PJO\u0010L\u001A\u00020\u00122\u0006\u0010M\u001A\u00020N2\u0006\u0010$\u001A\u00020%2\b\b\u0002\u0010\u001B\u001A\u00020\u00162\b\b\u0002\u0010\u001C\u001A\u00020\u001D2\n\b\u0002\u0010\u001E\u001A\u0004\u0018\u00010\u001F2\b\b\u0002\u0010 \u001A\u00020!H&\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bQ\u0010RJs\u0010S\u001A\u00020\u00122\f\u0010T\u001A\b\u0012\u0004\u0012\u00020\u00030U2\u0006\u0010V\u001A\u00020W2\u0006\u0010\u0013\u001A\u00020\u00142\b\b\u0002\u0010>\u001A\u00020\u00162\b\b\u0002\u0010?\u001A\u00020@2\n\b\u0002\u0010A\u001A\u0004\u0018\u00010B2\b\b\u0002\u0010\u001B\u001A\u00020\u00162\n\b\u0002\u0010\u001E\u001A\u0004\u0018\u00010\u001F2\b\b\u0002\u0010 \u001A\u00020!H&\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bX\u0010YJs\u0010S\u001A\u00020\u00122\f\u0010T\u001A\b\u0012\u0004\u0012\u00020\u00030U2\u0006\u0010V\u001A\u00020W2\u0006\u0010$\u001A\u00020%2\b\b\u0002\u0010>\u001A\u00020\u00162\b\b\u0002\u0010?\u001A\u00020@2\n\b\u0002\u0010A\u001A\u0004\u0018\u00010B2\b\b\u0002\u0010\u001B\u001A\u00020\u00162\n\b\u0002\u0010\u001E\u001A\u0004\u0018\u00010\u001F2\b\b\u0002\u0010 \u001A\u00020!H&\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bZ\u0010[J[\u0010\\\u001A\u00020\u00122\u0006\u0010\u0013\u001A\u00020\u00142\b\b\u0002\u0010\u001A\u001A\u00020\u00032\b\b\u0002\u0010\u000E\u001A\u00020\u000F2\b\b\u0002\u0010\u001B\u001A\u00020\u00162\b\b\u0002\u0010\u001C\u001A\u00020\u001D2\n\b\u0002\u0010\u001E\u001A\u0004\u0018\u00010\u001F2\b\b\u0002\u0010 \u001A\u00020!H&\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b]\u0010IJ[\u0010\\\u001A\u00020\u00122\u0006\u0010$\u001A\u00020%2\b\b\u0002\u0010\u001A\u001A\u00020\u00032\b\b\u0002\u0010\u000E\u001A\u00020\u000F2\b\b\u0002\u0010\u001B\u001A\u00020\u00162\b\b\u0002\u0010\u001C\u001A\u00020\u001D2\n\b\u0002\u0010\u001E\u001A\u0004\u0018\u00010\u001F2\b\b\u0002\u0010 \u001A\u00020!H&\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b^\u0010KJe\u0010_\u001A\u00020\u00122\u0006\u0010\u0013\u001A\u00020\u00142\b\b\u0002\u0010\u001A\u001A\u00020\u00032\b\b\u0002\u0010\u000E\u001A\u00020\u000F2\b\b\u0002\u0010`\u001A\u00020a2\b\b\u0002\u0010\u001B\u001A\u00020\u00162\b\b\u0002\u0010\u001C\u001A\u00020\u001D2\n\b\u0002\u0010\u001E\u001A\u0004\u0018\u00010\u001F2\b\b\u0002\u0010 \u001A\u00020!H&\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bb\u0010cJe\u0010_\u001A\u00020\u00122\u0006\u0010$\u001A\u00020%2\b\b\u0002\u0010\u001A\u001A\u00020\u00032\b\b\u0002\u0010\u000E\u001A\u00020\u000F2\b\b\u0002\u0010`\u001A\u00020a2\b\b\u0002\u0010\u001C\u001A\u00020\u001D2\b\b\u0002\u0010\u001B\u001A\u00020\u00162\n\b\u0002\u0010\u001E\u001A\u0004\u0018\u00010\u001F2\b\b\u0002\u0010 \u001A\u00020!H&\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bd\u0010eJ\u001A\u0010f\u001A\u00020\u000F*\u00020\u000F2\u0006\u0010g\u001A\u00020\u0003H\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001R\u001D\u0010\u0002\u001A\u00020\u00038VX\u0096\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001A\u00020\u0007X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\b\u0010\tR\u0012\u0010\n\u001A\u00020\u000BX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\f\u0010\rR\u001D\u0010\u000E\u001A\u00020\u000F8VX\u0096\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0006\u001A\u0004\b\u0010\u0010\u0005\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006i"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/unit/Density;", "center", "Landroidx/compose/ui/geometry/Offset;", "getCenter-F1C5BW0", "()J", "drawContext", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "getDrawContext", "()Landroidx/compose/ui/graphics/drawscope/DrawContext;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "size", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "drawArc", "", "brush", "Landroidx/compose/ui/graphics/Brush;", "startAngle", "", "sweepAngle", "useCenter", "", "topLeft", "alpha", "style", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "drawArc-illE91I", "(Landroidx/compose/ui/graphics/Brush;FFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "color", "Landroidx/compose/ui/graphics/Color;", "drawArc-yD3GUKo", "(JFFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle", "radius", "drawCircle-V9BoPsw", "(Landroidx/compose/ui/graphics/Brush;FJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle-VaOC9Bg", "(JFJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawImage", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "drawImage-gbVJVH8", "(Landroidx/compose/ui/graphics/ImageBitmap;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "srcOffset", "Landroidx/compose/ui/unit/IntOffset;", "srcSize", "Landroidx/compose/ui/unit/IntSize;", "dstOffset", "dstSize", "drawImage-9jGpkUE", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawLine", "start", "end", "strokeWidth", "cap", "Landroidx/compose/ui/graphics/StrokeCap;", "pathEffect", "Landroidx/compose/ui/graphics/PathEffect;", "drawLine-1RTmtNc", "(Landroidx/compose/ui/graphics/Brush;JJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawLine-NGM6Ib0", "(JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval", "drawOval-AsUm42w", "(Landroidx/compose/ui/graphics/Brush;JJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval-n-J9OG0", "(JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath", "path", "Landroidx/compose/ui/graphics/Path;", "drawPath-GBMwjPU", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath-LG529CI", "(Landroidx/compose/ui/graphics/Path;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints", "points", "", "pointMode", "Landroidx/compose/ui/graphics/PointMode;", "drawPoints-Gsft0Ws", "(Ljava/util/List;ILandroidx/compose/ui/graphics/Brush;FILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints-F8ZwMP8", "(Ljava/util/List;IJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawRect", "drawRect-AsUm42w", "drawRect-n-J9OG0", "drawRoundRect", "cornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "drawRoundRect-ZuiqVtQ", "(Landroidx/compose/ui/graphics/Brush;JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawRoundRect-u-Aw5IA", "(JJJJLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "offsetSize", "offset", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface DrawScope extends Density {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001C\u0010\u0003\u001A\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\u0005\u0010\u0006\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\b"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope$Companion;", "", "()V", "DefaultBlendMode", "Landroidx/compose/ui/graphics/BlendMode;", "getDefaultBlendMode-0nO6VwU", "()I", "I", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        static final Companion $$INSTANCE;
        private static final int DefaultBlendMode;

        static {
            Companion.$$INSTANCE = new Companion();
            Companion.DefaultBlendMode = 3;
        }

        public final int getDefaultBlendMode-0nO6VwU() [...] // 潜在的解密器
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public static final class DefaultImpls {
        public static void drawArc-illE91I$default(DrawScope drawScope0, Brush brush0, float f, float f1, boolean z, long v, long v1, float f2, DrawStyle drawStyle0, ColorFilter colorFilter0, int v2, int v3, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-illE91I");
            }
            long v4 = (v3 & 16) == 0 ? v : 0L;
            long v5 = (v3 & 0x20) == 0 ? v1 : DefaultImpls.offsetSize-PENXr5M(drawScope0, drawScope0.getSize-NH-jbRc(), v4);
            DrawStyle drawStyle1 = (v3 & 0x80) == 0 ? drawStyle0 : Fill.INSTANCE;
            drawScope0.drawArc-illE91I(brush0, f, f1, z, v4, v5, ((v3 & 0x40) == 0 ? f2 : 1.0f), drawStyle1, ((v3 & 0x100) == 0 ? colorFilter0 : null), ((v3 & 0x200) == 0 ? v2 : 3));
        }

        public static void drawArc-yD3GUKo$default(DrawScope drawScope0, long v, float f, float f1, boolean z, long v1, long v2, float f2, DrawStyle drawStyle0, ColorFilter colorFilter0, int v3, int v4, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-yD3GUKo");
            }
            long v5 = (v4 & 16) == 0 ? v1 : 0L;
            long v6 = (v4 & 0x20) == 0 ? v2 : DefaultImpls.offsetSize-PENXr5M(drawScope0, drawScope0.getSize-NH-jbRc(), v5);
            DrawStyle drawStyle1 = (v4 & 0x80) == 0 ? drawStyle0 : Fill.INSTANCE;
            drawScope0.drawArc-yD3GUKo(v, f, f1, z, v5, v6, ((v4 & 0x40) == 0 ? f2 : 1.0f), drawStyle1, ((v4 & 0x100) == 0 ? colorFilter0 : null), ((v4 & 0x200) == 0 ? v3 : 3));
        }

        public static void drawCircle-V9BoPsw$default(DrawScope drawScope0, Brush brush0, float f, long v, float f1, DrawStyle drawStyle0, ColorFilter colorFilter0, int v1, int v2, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-V9BoPsw");
            }
            float f2 = (v2 & 2) == 0 ? f : Size.getMinDimension-impl(drawScope0.getSize-NH-jbRc()) / 2.0f;
            long v3 = (v2 & 4) == 0 ? v : drawScope0.getCenter-F1C5BW0();
            DrawStyle drawStyle1 = (v2 & 16) == 0 ? drawStyle0 : Fill.INSTANCE;
            drawScope0.drawCircle-V9BoPsw(brush0, f2, v3, ((v2 & 8) == 0 ? f1 : 1.0f), drawStyle1, ((v2 & 0x20) == 0 ? colorFilter0 : null), ((v2 & 0x40) == 0 ? v1 : 3));
        }

        public static void drawCircle-VaOC9Bg$default(DrawScope drawScope0, long v, float f, long v1, float f1, DrawStyle drawStyle0, ColorFilter colorFilter0, int v2, int v3, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-VaOC9Bg");
            }
            float f2 = (v3 & 2) == 0 ? f : Size.getMinDimension-impl(drawScope0.getSize-NH-jbRc()) / 2.0f;
            long v4 = (v3 & 4) == 0 ? v1 : drawScope0.getCenter-F1C5BW0();
            DrawStyle drawStyle1 = (v3 & 16) == 0 ? drawStyle0 : Fill.INSTANCE;
            drawScope0.drawCircle-VaOC9Bg(v, f2, v4, ((v3 & 8) == 0 ? f1 : 1.0f), drawStyle1, ((v3 & 0x20) == 0 ? colorFilter0 : null), ((v3 & 0x40) == 0 ? v2 : 3));
        }

        public static void drawImage-9jGpkUE$default(DrawScope drawScope0, ImageBitmap imageBitmap0, long v, long v1, long v2, long v3, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v4, int v5, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-9jGpkUE");
            }
            long v6 = (v5 & 4) == 0 ? v1 : IntSizeKt.IntSize(imageBitmap0.getWidth(), imageBitmap0.getHeight());
            DrawStyle drawStyle1 = (v5 & 0x40) == 0 ? drawStyle0 : Fill.INSTANCE;
            drawScope0.drawImage-9jGpkUE(imageBitmap0, ((v5 & 2) == 0 ? v : 0L), v6, ((v5 & 8) == 0 ? v2 : 0L), ((v5 & 16) == 0 ? v3 : v6), ((v5 & 0x20) == 0 ? f : 1.0f), drawStyle1, ((v5 & 0x80) == 0 ? colorFilter0 : null), ((v5 & 0x100) == 0 ? v4 : 3));
        }

        public static void drawImage-gbVJVH8$default(DrawScope drawScope0, ImageBitmap imageBitmap0, long v, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v1, int v2, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-gbVJVH8");
            }
            DrawStyle drawStyle1 = (v2 & 8) == 0 ? drawStyle0 : Fill.INSTANCE;
            drawScope0.drawImage-gbVJVH8(imageBitmap0, ((v2 & 2) == 0 ? v : 0L), ((v2 & 4) == 0 ? f : 1.0f), drawStyle1, ((v2 & 16) == 0 ? colorFilter0 : null), ((v2 & 0x20) == 0 ? v1 : 3));
        }

        public static void drawLine-1RTmtNc$default(DrawScope drawScope0, Brush brush0, long v, long v1, float f, int v2, PathEffect pathEffect0, float f1, ColorFilter colorFilter0, int v3, int v4, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-1RTmtNc");
            }
            drawScope0.drawLine-1RTmtNc(brush0, v, v1, ((v4 & 8) == 0 ? f : 0.0f), ((v4 & 16) == 0 ? v2 : 0), ((v4 & 0x20) == 0 ? pathEffect0 : null), ((v4 & 0x40) == 0 ? f1 : 1.0f), ((v4 & 0x80) == 0 ? colorFilter0 : null), ((v4 & 0x100) == 0 ? v3 : 3));
        }

        public static void drawLine-NGM6Ib0$default(DrawScope drawScope0, long v, long v1, long v2, float f, int v3, PathEffect pathEffect0, float f1, ColorFilter colorFilter0, int v4, int v5, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-NGM6Ib0");
            }
            drawScope0.drawLine-NGM6Ib0(v, v1, v2, ((v5 & 8) == 0 ? f : 0.0f), ((v5 & 16) == 0 ? v3 : 0), ((v5 & 0x20) == 0 ? pathEffect0 : null), ((v5 & 0x40) == 0 ? f1 : 1.0f), ((v5 & 0x80) == 0 ? colorFilter0 : null), ((v5 & 0x100) == 0 ? v4 : 3));
        }

        public static void drawOval-AsUm42w$default(DrawScope drawScope0, Brush brush0, long v, long v1, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v2, int v3, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-AsUm42w");
            }
            long v4 = (v3 & 2) == 0 ? v : 0L;
            long v5 = (v3 & 4) == 0 ? v1 : DefaultImpls.offsetSize-PENXr5M(drawScope0, drawScope0.getSize-NH-jbRc(), v4);
            DrawStyle drawStyle1 = (v3 & 16) == 0 ? drawStyle0 : Fill.INSTANCE;
            drawScope0.drawOval-AsUm42w(brush0, v4, v5, ((v3 & 8) == 0 ? f : 1.0f), drawStyle1, ((v3 & 0x20) == 0 ? colorFilter0 : null), ((v3 & 0x40) == 0 ? v2 : 3));
        }

        public static void drawOval-n-J9OG0$default(DrawScope drawScope0, long v, long v1, long v2, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v3, int v4, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-n-J9OG0");
            }
            long v5 = (v4 & 2) == 0 ? v1 : 0L;
            long v6 = (v4 & 4) == 0 ? v2 : DefaultImpls.offsetSize-PENXr5M(drawScope0, drawScope0.getSize-NH-jbRc(), v5);
            DrawStyle drawStyle1 = (v4 & 16) == 0 ? drawStyle0 : Fill.INSTANCE;
            drawScope0.drawOval-n-J9OG0(v, v5, v6, ((v4 & 8) == 0 ? f : 1.0f), drawStyle1, ((v4 & 0x20) == 0 ? colorFilter0 : null), ((v4 & 0x40) == 0 ? v3 : 3));
        }

        public static void drawPath-GBMwjPU$default(DrawScope drawScope0, Path path0, Brush brush0, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v, int v1, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-GBMwjPU");
            }
            if((v1 & 8) != 0) {
                drawStyle0 = Fill.INSTANCE;
            }
            if((v1 & 16) != 0) {
                colorFilter0 = null;
            }
            if((v1 & 0x20) != 0) {
                v = 3;
            }
            drawScope0.drawPath-GBMwjPU(path0, brush0, ((v1 & 4) == 0 ? f : 1.0f), drawStyle0, colorFilter0, v);
        }

        public static void drawPath-LG529CI$default(DrawScope drawScope0, Path path0, long v, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v1, int v2, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-LG529CI");
            }
            DrawStyle drawStyle1 = (v2 & 8) == 0 ? drawStyle0 : Fill.INSTANCE;
            drawScope0.drawPath-LG529CI(path0, v, ((v2 & 4) == 0 ? f : 1.0f), drawStyle1, ((v2 & 16) == 0 ? colorFilter0 : null), ((v2 & 0x20) == 0 ? v1 : 3));
        }

        public static void drawPoints-F8ZwMP8$default(DrawScope drawScope0, List list0, int v, long v1, float f, int v2, PathEffect pathEffect0, float f1, ColorFilter colorFilter0, int v3, int v4, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-F8ZwMP8");
            }
            drawScope0.drawPoints-F8ZwMP8(list0, v, v1, ((v4 & 8) == 0 ? f : 0.0f), ((v4 & 16) == 0 ? v2 : 0), ((v4 & 0x20) == 0 ? pathEffect0 : null), ((v4 & 0x40) == 0 ? f1 : 1.0f), ((v4 & 0x80) == 0 ? colorFilter0 : null), ((v4 & 0x100) == 0 ? v3 : 3));
        }

        public static void drawPoints-Gsft0Ws$default(DrawScope drawScope0, List list0, int v, Brush brush0, float f, int v1, PathEffect pathEffect0, float f1, ColorFilter colorFilter0, int v2, int v3, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-Gsft0Ws");
            }
            drawScope0.drawPoints-Gsft0Ws(list0, v, brush0, ((v3 & 8) == 0 ? f : 0.0f), ((v3 & 16) == 0 ? v1 : 0), ((v3 & 0x20) == 0 ? pathEffect0 : null), ((v3 & 0x40) == 0 ? f1 : 1.0f), ((v3 & 0x80) == 0 ? colorFilter0 : null), ((v3 & 0x100) == 0 ? v2 : 3));
        }

        public static void drawRect-AsUm42w$default(DrawScope drawScope0, Brush brush0, long v, long v1, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v2, int v3, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-AsUm42w");
            }
            long v4 = (v3 & 2) == 0 ? v : 0L;
            long v5 = (v3 & 4) == 0 ? v1 : DefaultImpls.offsetSize-PENXr5M(drawScope0, drawScope0.getSize-NH-jbRc(), v4);
            DrawStyle drawStyle1 = (v3 & 16) == 0 ? drawStyle0 : Fill.INSTANCE;
            drawScope0.drawRect-AsUm42w(brush0, v4, v5, ((v3 & 8) == 0 ? f : 1.0f), drawStyle1, ((v3 & 0x20) == 0 ? colorFilter0 : null), ((v3 & 0x40) == 0 ? v2 : 3));
        }

        public static void drawRect-n-J9OG0$default(DrawScope drawScope0, long v, long v1, long v2, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v3, int v4, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-n-J9OG0");
            }
            long v5 = (v4 & 2) == 0 ? v1 : 0L;
            long v6 = (v4 & 4) == 0 ? v2 : DefaultImpls.offsetSize-PENXr5M(drawScope0, drawScope0.getSize-NH-jbRc(), v5);
            DrawStyle drawStyle1 = (v4 & 16) == 0 ? drawStyle0 : Fill.INSTANCE;
            drawScope0.drawRect-n-J9OG0(v, v5, v6, ((v4 & 8) == 0 ? f : 1.0f), drawStyle1, ((v4 & 0x20) == 0 ? colorFilter0 : null), ((v4 & 0x40) == 0 ? v3 : 3));
        }

        public static void drawRoundRect-ZuiqVtQ$default(DrawScope drawScope0, Brush brush0, long v, long v1, long v2, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v3, int v4, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-ZuiqVtQ");
            }
            long v5 = (v4 & 2) == 0 ? v : 0L;
            long v6 = (v4 & 4) == 0 ? v1 : DefaultImpls.offsetSize-PENXr5M(drawScope0, drawScope0.getSize-NH-jbRc(), v5);
            DrawStyle drawStyle1 = (v4 & 0x20) == 0 ? drawStyle0 : Fill.INSTANCE;
            drawScope0.drawRoundRect-ZuiqVtQ(brush0, v5, v6, ((v4 & 8) == 0 ? v2 : 0L), ((v4 & 16) == 0 ? f : 1.0f), drawStyle1, ((v4 & 0x40) == 0 ? colorFilter0 : null), ((v4 & 0x80) == 0 ? v3 : 3));
        }

        public static void drawRoundRect-u-Aw5IA$default(DrawScope drawScope0, long v, long v1, long v2, long v3, DrawStyle drawStyle0, float f, ColorFilter colorFilter0, int v4, int v5, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-u-Aw5IA");
            }
            long v6 = (v5 & 2) == 0 ? v1 : 0L;
            long v7 = (v5 & 4) == 0 ? v2 : DefaultImpls.offsetSize-PENXr5M(drawScope0, drawScope0.getSize-NH-jbRc(), v6);
            DrawStyle drawStyle1 = (v5 & 16) == 0 ? drawStyle0 : Fill.INSTANCE;
            drawScope0.drawRoundRect-u-Aw5IA(v, v6, v7, ((v5 & 8) == 0 ? v3 : 0L), drawStyle1, ((v5 & 0x20) == 0 ? f : 1.0f), ((v5 & 0x40) == 0 ? colorFilter0 : null), ((v5 & 0x80) == 0 ? v4 : 3));
        }

        public static long getCenter-F1C5BW0(DrawScope drawScope0) {
            Intrinsics.checkNotNullParameter(drawScope0, "this");
            return SizeKt.getCenter-uvyYCjk(drawScope0.getDrawContext().getSize-NH-jbRc());
        }

        public static long getSize-NH-jbRc(DrawScope drawScope0) {
            Intrinsics.checkNotNullParameter(drawScope0, "this");
            return drawScope0.getDrawContext().getSize-NH-jbRc();
        }

        private static long offsetSize-PENXr5M(DrawScope drawScope0, long v, long v1) {
            return SizeKt.Size(Size.getWidth-impl(v) - Offset.getX-impl(v1), Size.getHeight-impl(v) - Offset.getY-impl(v1));
        }

        public static int roundToPx--R2X_6o(DrawScope drawScope0, long v) {
            Intrinsics.checkNotNullParameter(drawScope0, "this");
            return androidx.compose.ui.unit.Density.DefaultImpls.roundToPx--R2X_6o(drawScope0, v);
        }

        public static int roundToPx-0680j_4(DrawScope drawScope0, float f) {
            Intrinsics.checkNotNullParameter(drawScope0, "this");
            return androidx.compose.ui.unit.Density.DefaultImpls.roundToPx-0680j_4(drawScope0, f);
        }

        public static float toDp-GaN1DYA(DrawScope drawScope0, long v) {
            Intrinsics.checkNotNullParameter(drawScope0, "this");
            return androidx.compose.ui.unit.Density.DefaultImpls.toDp-GaN1DYA(drawScope0, v);
        }

        public static float toDp-u2uoSUM(DrawScope drawScope0, float f) {
            Intrinsics.checkNotNullParameter(drawScope0, "this");
            return androidx.compose.ui.unit.Density.DefaultImpls.toDp-u2uoSUM(drawScope0, f);
        }

        public static float toDp-u2uoSUM(DrawScope drawScope0, int v) {
            Intrinsics.checkNotNullParameter(drawScope0, "this");
            return androidx.compose.ui.unit.Density.DefaultImpls.toDp-u2uoSUM(drawScope0, v);
        }

        public static float toPx--R2X_6o(DrawScope drawScope0, long v) {
            Intrinsics.checkNotNullParameter(drawScope0, "this");
            return androidx.compose.ui.unit.Density.DefaultImpls.toPx--R2X_6o(drawScope0, v);
        }

        public static float toPx-0680j_4(DrawScope drawScope0, float f) {
            Intrinsics.checkNotNullParameter(drawScope0, "this");
            return androidx.compose.ui.unit.Density.DefaultImpls.toPx-0680j_4(drawScope0, f);
        }

        public static Rect toRect(DrawScope drawScope0, DpRect dpRect0) {
            Intrinsics.checkNotNullParameter(drawScope0, "this");
            Intrinsics.checkNotNullParameter(dpRect0, "receiver");
            return androidx.compose.ui.unit.Density.DefaultImpls.toRect(drawScope0, dpRect0);
        }

        public static long toSp-0xMU5do(DrawScope drawScope0, float f) {
            Intrinsics.checkNotNullParameter(drawScope0, "this");
            return androidx.compose.ui.unit.Density.DefaultImpls.toSp-0xMU5do(drawScope0, f);
        }

        public static long toSp-kPz2Gy4(DrawScope drawScope0, float f) {
            Intrinsics.checkNotNullParameter(drawScope0, "this");
            return androidx.compose.ui.unit.Density.DefaultImpls.toSp-kPz2Gy4(drawScope0, f);
        }

        public static long toSp-kPz2Gy4(DrawScope drawScope0, int v) {
            Intrinsics.checkNotNullParameter(drawScope0, "this");
            return androidx.compose.ui.unit.Density.DefaultImpls.toSp-kPz2Gy4(drawScope0, v);
        }
    }

    public static final Companion Companion;

    static {
        DrawScope.Companion = Companion.$$INSTANCE;
    }

    void drawArc-illE91I(Brush arg1, float arg2, float arg3, boolean arg4, long arg5, long arg6, float arg7, DrawStyle arg8, ColorFilter arg9, int arg10);

    void drawArc-yD3GUKo(long arg1, float arg2, float arg3, boolean arg4, long arg5, long arg6, float arg7, DrawStyle arg8, ColorFilter arg9, int arg10);

    void drawCircle-V9BoPsw(Brush arg1, float arg2, long arg3, float arg4, DrawStyle arg5, ColorFilter arg6, int arg7);

    void drawCircle-VaOC9Bg(long arg1, float arg2, long arg3, float arg4, DrawStyle arg5, ColorFilter arg6, int arg7);

    void drawImage-9jGpkUE(ImageBitmap arg1, long arg2, long arg3, long arg4, long arg5, float arg6, DrawStyle arg7, ColorFilter arg8, int arg9);

    void drawImage-gbVJVH8(ImageBitmap arg1, long arg2, float arg3, DrawStyle arg4, ColorFilter arg5, int arg6);

    void drawLine-1RTmtNc(Brush arg1, long arg2, long arg3, float arg4, int arg5, PathEffect arg6, float arg7, ColorFilter arg8, int arg9);

    void drawLine-NGM6Ib0(long arg1, long arg2, long arg3, float arg4, int arg5, PathEffect arg6, float arg7, ColorFilter arg8, int arg9);

    void drawOval-AsUm42w(Brush arg1, long arg2, long arg3, float arg4, DrawStyle arg5, ColorFilter arg6, int arg7);

    void drawOval-n-J9OG0(long arg1, long arg2, long arg3, float arg4, DrawStyle arg5, ColorFilter arg6, int arg7);

    void drawPath-GBMwjPU(Path arg1, Brush arg2, float arg3, DrawStyle arg4, ColorFilter arg5, int arg6);

    void drawPath-LG529CI(Path arg1, long arg2, float arg3, DrawStyle arg4, ColorFilter arg5, int arg6);

    void drawPoints-F8ZwMP8(List arg1, int arg2, long arg3, float arg4, int arg5, PathEffect arg6, float arg7, ColorFilter arg8, int arg9);

    void drawPoints-Gsft0Ws(List arg1, int arg2, Brush arg3, float arg4, int arg5, PathEffect arg6, float arg7, ColorFilter arg8, int arg9);

    void drawRect-AsUm42w(Brush arg1, long arg2, long arg3, float arg4, DrawStyle arg5, ColorFilter arg6, int arg7);

    void drawRect-n-J9OG0(long arg1, long arg2, long arg3, float arg4, DrawStyle arg5, ColorFilter arg6, int arg7);

    void drawRoundRect-ZuiqVtQ(Brush arg1, long arg2, long arg3, long arg4, float arg5, DrawStyle arg6, ColorFilter arg7, int arg8);

    void drawRoundRect-u-Aw5IA(long arg1, long arg2, long arg3, long arg4, DrawStyle arg5, float arg6, ColorFilter arg7, int arg8);

    long getCenter-F1C5BW0();

    DrawContext getDrawContext();

    LayoutDirection getLayoutDirection();

    long getSize-NH-jbRc();
}

