package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u00D0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0002\u008E\u0001B\u0005\u00A2\u0006\u0002\u0010\u0002JA\u0010\u0019\u001A\u00020\u00112\b\u0010\u001A\u001A\u0004\u0018\u00010\u001B2\u0006\u0010\u001C\u001A\u00020\u001D2\u0006\u0010\u001E\u001A\u00020\u00042\b\u0010\u001F\u001A\u0004\u0018\u00010 2\u0006\u0010!\u001A\u00020\"H\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b#\u0010$J?\u0010\u0019\u001A\u00020\u00112\u0006\u0010%\u001A\u00020&2\u0006\u0010\u001C\u001A\u00020\u001D2\u0006\u0010\u001E\u001A\u00020\u00042\b\u0010\u001F\u001A\u0004\u0018\u00010 2\u0006\u0010!\u001A\u00020\"H\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\'\u0010(Jc\u0010)\u001A\u00020\u00112\b\u0010\u001A\u001A\u0004\u0018\u00010\u001B2\u0006\u0010*\u001A\u00020\u00042\u0006\u0010+\u001A\u00020\u00042\u0006\u0010,\u001A\u00020-2\u0006\u0010.\u001A\u00020/2\b\u00100\u001A\u0004\u0018\u0001012\u0006\u0010\u001E\u001A\u00020\u00042\b\u0010\u001F\u001A\u0004\u0018\u00010 2\u0006\u0010!\u001A\u00020\"H\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b2\u00103Ja\u0010)\u001A\u00020\u00112\u0006\u0010%\u001A\u00020&2\u0006\u0010*\u001A\u00020\u00042\u0006\u0010+\u001A\u00020\u00042\u0006\u0010,\u001A\u00020-2\u0006\u0010.\u001A\u00020/2\b\u00100\u001A\u0004\u0018\u0001012\u0006\u0010\u001E\u001A\u00020\u00042\b\u0010\u001F\u001A\u0004\u0018\u00010 2\u0006\u0010!\u001A\u00020\"H\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b4\u00105JR\u00106\u001A\u0002072\u0006\u0010\u0003\u001A\u0002082\u0006\u0010\u0014\u001A\u00020\u00152\u0006\u00109\u001A\u00020:2\u0006\u0010;\u001A\u00020<2\u0017\u0010=\u001A\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002070>\u00A2\u0006\u0002\b?H\u0086\b\u00F8\u0001\u0000\u00F8\u0001\u0002\u00F8\u0001\u0001\u00A2\u0006\u0004\b@\u0010AJg\u0010B\u001A\u0002072\u0006\u0010\u001A\u001A\u00020\u001B2\u0006\u0010C\u001A\u00020\u00042\u0006\u0010D\u001A\u00020\u00042\u0006\u0010E\u001A\u00020F2\u0006\u0010G\u001A\u00020H2\u0006\u0010;\u001A\u00020<2\u0006\u0010\u001E\u001A\u00020\u00042\u0006\u0010\u001C\u001A\u00020\u001D2\b\u0010\u001F\u001A\u0004\u0018\u00010 2\u0006\u0010!\u001A\u00020\"H\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bI\u0010JJg\u0010B\u001A\u0002072\u0006\u0010%\u001A\u00020&2\u0006\u0010C\u001A\u00020\u00042\u0006\u0010D\u001A\u00020\u00042\u0006\u0010E\u001A\u00020F2\u0006\u0010G\u001A\u00020H2\u0006\u0010;\u001A\u00020<2\u0006\u0010\u001E\u001A\u00020\u00042\u0006\u0010\u001C\u001A\u00020\u001D2\b\u0010\u001F\u001A\u0004\u0018\u00010 2\u0006\u0010!\u001A\u00020\"H\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bK\u0010LJO\u0010M\u001A\u0002072\u0006\u0010\u001A\u001A\u00020\u001B2\u0006\u0010N\u001A\u00020\u00042\u0006\u0010O\u001A\u00020H2\u0006\u0010\u001E\u001A\u00020\u00042\u0006\u0010\u001C\u001A\u00020\u001D2\b\u0010\u001F\u001A\u0004\u0018\u00010 2\u0006\u0010!\u001A\u00020\"H\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bP\u0010QJO\u0010M\u001A\u0002072\u0006\u0010%\u001A\u00020&2\u0006\u0010N\u001A\u00020\u00042\u0006\u0010O\u001A\u00020H2\u0006\u0010\u001E\u001A\u00020\u00042\u0006\u0010\u001C\u001A\u00020\u001D2\b\u0010\u001F\u001A\u0004\u0018\u00010 2\u0006\u0010!\u001A\u00020\"H\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bR\u0010SJG\u0010T\u001A\u0002072\u0006\u0010U\u001A\u00020V2\u0006\u0010G\u001A\u00020H2\u0006\u0010\u001E\u001A\u00020\u00042\u0006\u0010\u001C\u001A\u00020\u001D2\b\u0010\u001F\u001A\u0004\u0018\u00010 2\u0006\u0010!\u001A\u00020\"H\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bW\u0010XJ_\u0010T\u001A\u0002072\u0006\u0010U\u001A\u00020V2\u0006\u0010Y\u001A\u00020Z2\u0006\u0010[\u001A\u00020\\2\u0006\u0010]\u001A\u00020Z2\u0006\u0010^\u001A\u00020\\2\u0006\u0010\u001E\u001A\u00020\u00042\u0006\u0010\u001C\u001A\u00020\u001D2\b\u0010\u001F\u001A\u0004\u0018\u00010 2\u0006\u0010!\u001A\u00020\"H\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b_\u0010`Ja\u0010a\u001A\u0002072\u0006\u0010\u001A\u001A\u00020\u001B2\u0006\u0010b\u001A\u00020H2\u0006\u0010c\u001A\u00020H2\u0006\u0010*\u001A\u00020\u00042\u0006\u0010,\u001A\u00020-2\b\u00100\u001A\u0004\u0018\u0001012\u0006\u0010\u001E\u001A\u00020\u00042\b\u0010\u001F\u001A\u0004\u0018\u00010 2\u0006\u0010!\u001A\u00020\"H\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bd\u0010eJa\u0010a\u001A\u0002072\u0006\u0010%\u001A\u00020&2\u0006\u0010b\u001A\u00020H2\u0006\u0010c\u001A\u00020H2\u0006\u0010*\u001A\u00020\u00042\u0006\u0010,\u001A\u00020-2\b\u00100\u001A\u0004\u0018\u0001012\u0006\u0010\u001E\u001A\u00020\u00042\b\u0010\u001F\u001A\u0004\u0018\u00010 2\u0006\u0010!\u001A\u00020\"H\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bf\u0010gJO\u0010h\u001A\u0002072\u0006\u0010\u001A\u001A\u00020\u001B2\u0006\u0010G\u001A\u00020H2\u0006\u0010;\u001A\u00020<2\u0006\u0010\u001E\u001A\u00020\u00042\u0006\u0010\u001C\u001A\u00020\u001D2\b\u0010\u001F\u001A\u0004\u0018\u00010 2\u0006\u0010!\u001A\u00020\"H\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bi\u0010jJO\u0010h\u001A\u0002072\u0006\u0010%\u001A\u00020&2\u0006\u0010G\u001A\u00020H2\u0006\u0010;\u001A\u00020<2\u0006\u0010\u001E\u001A\u00020\u00042\u0006\u0010\u001C\u001A\u00020\u001D2\b\u0010\u001F\u001A\u0004\u0018\u00010 2\u0006\u0010!\u001A\u00020\"H\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bk\u0010lJG\u0010m\u001A\u0002072\u0006\u0010n\u001A\u00020o2\u0006\u0010\u001A\u001A\u00020\u001B2\u0006\u0010\u001E\u001A\u00020\u00042\u0006\u0010\u001C\u001A\u00020\u001D2\b\u0010\u001F\u001A\u0004\u0018\u00010 2\u0006\u0010!\u001A\u00020\"H\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bp\u0010qJG\u0010m\u001A\u0002072\u0006\u0010n\u001A\u00020o2\u0006\u0010%\u001A\u00020&2\u0006\u0010\u001E\u001A\u00020\u00042\u0006\u0010\u001C\u001A\u00020\u001D2\b\u0010\u001F\u001A\u0004\u0018\u00010 2\u0006\u0010!\u001A\u00020\"H\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\br\u0010sJg\u0010t\u001A\u0002072\f\u0010u\u001A\b\u0012\u0004\u0012\u00020H0v2\u0006\u0010w\u001A\u00020x2\u0006\u0010\u001A\u001A\u00020\u001B2\u0006\u0010*\u001A\u00020\u00042\u0006\u0010,\u001A\u00020-2\b\u00100\u001A\u0004\u0018\u0001012\u0006\u0010\u001E\u001A\u00020\u00042\b\u0010\u001F\u001A\u0004\u0018\u00010 2\u0006\u0010!\u001A\u00020\"H\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\by\u0010zJg\u0010t\u001A\u0002072\f\u0010u\u001A\b\u0012\u0004\u0012\u00020H0v2\u0006\u0010w\u001A\u00020x2\u0006\u0010%\u001A\u00020&2\u0006\u0010*\u001A\u00020\u00042\u0006\u0010,\u001A\u00020-2\b\u00100\u001A\u0004\u0018\u0001012\u0006\u0010\u001E\u001A\u00020\u00042\b\u0010\u001F\u001A\u0004\u0018\u00010 2\u0006\u0010!\u001A\u00020\"H\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b{\u0010|JO\u0010}\u001A\u0002072\u0006\u0010\u001A\u001A\u00020\u001B2\u0006\u0010G\u001A\u00020H2\u0006\u0010;\u001A\u00020<2\u0006\u0010\u001E\u001A\u00020\u00042\u0006\u0010\u001C\u001A\u00020\u001D2\b\u0010\u001F\u001A\u0004\u0018\u00010 2\u0006\u0010!\u001A\u00020\"H\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b~\u0010jJO\u0010}\u001A\u0002072\u0006\u0010%\u001A\u00020&2\u0006\u0010G\u001A\u00020H2\u0006\u0010;\u001A\u00020<2\u0006\u0010\u001E\u001A\u00020\u00042\u0006\u0010\u001C\u001A\u00020\u001D2\b\u0010\u001F\u001A\u0004\u0018\u00010 2\u0006\u0010!\u001A\u00020\"H\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u007F\u0010lJ\\\u0010\u0080\u0001\u001A\u0002072\u0006\u0010\u001A\u001A\u00020\u001B2\u0006\u0010G\u001A\u00020H2\u0006\u0010;\u001A\u00020<2\b\u0010\u0081\u0001\u001A\u00030\u0082\u00012\u0006\u0010\u001E\u001A\u00020\u00042\u0006\u0010\u001C\u001A\u00020\u001D2\b\u0010\u001F\u001A\u0004\u0018\u00010 2\u0006\u0010!\u001A\u00020\"H\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\\\u0010\u0080\u0001\u001A\u0002072\u0006\u0010%\u001A\u00020&2\u0006\u0010G\u001A\u00020H2\u0006\u0010;\u001A\u00020<2\b\u0010\u0081\u0001\u001A\u00030\u0082\u00012\u0006\u0010\u001C\u001A\u00020\u001D2\u0006\u0010\u001E\u001A\u00020\u00042\b\u0010\u001F\u001A\u0004\u0018\u00010 2\u0006\u0010!\u001A\u00020\"H\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\t\u0010\u0087\u0001\u001A\u00020\u0011H\u0002J\t\u0010\u0088\u0001\u001A\u00020\u0011H\u0002J\u0012\u0010\u0089\u0001\u001A\u00020\u00112\u0007\u0010\u008A\u0001\u001A\u00020\u001DH\u0002J$\u0010\u008B\u0001\u001A\u00020&*\u00020&2\u0006\u0010\u001E\u001A\u00020\u0004H\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\b\u008C\u0001\u0010\u008D\u0001R\u0014\u0010\u0003\u001A\u00020\u00048VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001A\u00020\bX\u0096\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u001C\u0010\u000B\u001A\u00020\f8\u0000X\u0081\u0004\u00A2\u0006\u000E\n\u0000\u0012\u0004\b\r\u0010\u0002\u001A\u0004\b\u000E\u0010\u000FR\u0010\u0010\u0010\u001A\u0004\u0018\u00010\u0011X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001A\u00020\u00048VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001A\u00020\u00158VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001A\u0004\u0018\u00010\u0011X\u0082\u000E\u00A2\u0006\u0002\n\u0000\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\n\u0005\b\u009920\u0001\u00A8\u0006\u008F\u0001"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "()V", "density", "", "getDensity", "()F", "drawContext", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "getDrawContext", "()Landroidx/compose/ui/graphics/drawscope/DrawContext;", "drawParams", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "getDrawParams$annotations", "getDrawParams", "()Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "fillPaint", "Landroidx/compose/ui/graphics/Paint;", "fontScale", "getFontScale", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "strokePaint", "configurePaint", "brush", "Landroidx/compose/ui/graphics/Brush;", "style", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "alpha", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "configurePaint-UXdrQoc", "(Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;I)Landroidx/compose/ui/graphics/Paint;", "color", "Landroidx/compose/ui/graphics/Color;", "configurePaint-46ZPVWY", "(JLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;I)Landroidx/compose/ui/graphics/Paint;", "configureStrokePaint", "strokeWidth", "miter", "cap", "Landroidx/compose/ui/graphics/StrokeCap;", "join", "Landroidx/compose/ui/graphics/StrokeJoin;", "pathEffect", "Landroidx/compose/ui/graphics/PathEffect;", "configureStrokePaint-ApHOwBQ", "(Landroidx/compose/ui/graphics/Brush;FFIILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)Landroidx/compose/ui/graphics/Paint;", "configureStrokePaint-TuZ1BDo", "(JFFIILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)Landroidx/compose/ui/graphics/Paint;", "draw", "", "Landroidx/compose/ui/unit/Density;", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "size", "Landroidx/compose/ui/geometry/Size;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "draw-yzxVdVo", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/Canvas;JLkotlin/jvm/functions/Function1;)V", "drawArc", "startAngle", "sweepAngle", "useCenter", "", "topLeft", "Landroidx/compose/ui/geometry/Offset;", "drawArc-illE91I", "(Landroidx/compose/ui/graphics/Brush;FFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawArc-yD3GUKo", "(JFFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle", "radius", "center", "drawCircle-V9BoPsw", "(Landroidx/compose/ui/graphics/Brush;FJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle-VaOC9Bg", "(JFJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawImage", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "drawImage-gbVJVH8", "(Landroidx/compose/ui/graphics/ImageBitmap;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "srcOffset", "Landroidx/compose/ui/unit/IntOffset;", "srcSize", "Landroidx/compose/ui/unit/IntSize;", "dstOffset", "dstSize", "drawImage-9jGpkUE", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawLine", "start", "end", "drawLine-1RTmtNc", "(Landroidx/compose/ui/graphics/Brush;JJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawLine-NGM6Ib0", "(JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval", "drawOval-AsUm42w", "(Landroidx/compose/ui/graphics/Brush;JJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval-n-J9OG0", "(JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath", "path", "Landroidx/compose/ui/graphics/Path;", "drawPath-GBMwjPU", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath-LG529CI", "(Landroidx/compose/ui/graphics/Path;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints", "points", "", "pointMode", "Landroidx/compose/ui/graphics/PointMode;", "drawPoints-Gsft0Ws", "(Ljava/util/List;ILandroidx/compose/ui/graphics/Brush;FILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints-F8ZwMP8", "(Ljava/util/List;IJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawRect", "drawRect-AsUm42w", "drawRect-n-J9OG0", "drawRoundRect", "cornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "drawRoundRect-ZuiqVtQ", "(Landroidx/compose/ui/graphics/Brush;JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawRoundRect-u-Aw5IA", "(JJJJLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "obtainFillPaint", "obtainStrokePaint", "selectPaint", "drawStyle", "modulate", "modulate-5vOe2sY", "(JF)J", "DrawParams", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class CanvasDrawScope implements DrawScope {
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001B\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B0\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0007\u0012\b\b\u0002\u0010\b\u001A\u00020\tø\u0001\u0000¢\u0006\u0002\u0010\nJ\t\u0010\u001C\u001A\u00020\u0003HÆ\u0003J\t\u0010\u001D\u001A\u00020\u0005HÆ\u0003J\t\u0010\u001E\u001A\u00020\u0007HÆ\u0003J\u0019\u0010\u001F\u001A\u00020\tHÆ\u0003ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b \u0010\u0018J>\u0010!\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\tHÆ\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#J\u0013\u0010$\u001A\u00020%2\b\u0010&\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\'\u001A\u00020(HÖ\u0001J\t\u0010)\u001A\u00020*HÖ\u0001R\u001A\u0010\u0006\u001A\u00020\u0007X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u000B\u0010\f\"\u0004\b\r\u0010\u000ER\u001A\u0010\u0002\u001A\u00020\u0003X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u000F\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001A\u0010\u0004\u001A\u00020\u0005X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R%\u0010\b\u001A\u00020\tX\u0086\u000Eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u001B\u001A\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001A\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006+"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "", "density", "Landroidx/compose/ui/unit/Density;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "size", "Landroidx/compose/ui/geometry/Size;", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/Canvas;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCanvas", "()Landroidx/compose/ui/graphics/Canvas;", "setCanvas", "(Landroidx/compose/ui/graphics/Canvas;)V", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "getSize-NH-jbRc", "()J", "setSize-uvyYCjk", "(J)V", "J", "component1", "component2", "component3", "component4", "component4-NH-jbRc", "copy", "copy-Ug5Nnss", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/Canvas;J)Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "equals", "", "other", "hashCode", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class DrawParams {
        private Canvas canvas;
        private Density density;
        private LayoutDirection layoutDirection;
        private long size;

        private DrawParams(Density density0, LayoutDirection layoutDirection0, Canvas canvas0, long v) {
            this.density = density0;
            this.layoutDirection = layoutDirection0;
            this.canvas = canvas0;
            this.size = v;
        }

        public DrawParams(Density density0, LayoutDirection layoutDirection0, Canvas canvas0, long v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v1 & 1) != 0) {
                density0 = CanvasDrawScopeKt.DefaultDensity;
            }
            if((v1 & 2) != 0) {
                layoutDirection0 = LayoutDirection.Ltr;
            }
            if((v1 & 4) != 0) {
                canvas0 = new EmptyCanvas();
            }
            if((v1 & 8) != 0) {
                v = 0L;
            }
            this(density0, layoutDirection0, canvas0, v, null);
        }

        public DrawParams(Density density0, LayoutDirection layoutDirection0, Canvas canvas0, long v, DefaultConstructorMarker defaultConstructorMarker0) {
            this(density0, layoutDirection0, canvas0, v);
        }

        public final Density component1() {
            return this.density;
        }

        public final LayoutDirection component2() {
            return this.layoutDirection;
        }

        public final Canvas component3() {
            return this.canvas;
        }

        public final long component4-NH-jbRc() {
            return this.size;
        }

        public final DrawParams copy-Ug5Nnss(Density density0, LayoutDirection layoutDirection0, Canvas canvas0, long v) {
            Intrinsics.checkNotNullParameter(density0, "density");
            Intrinsics.checkNotNullParameter(layoutDirection0, "layoutDirection");
            Intrinsics.checkNotNullParameter(canvas0, "canvas");
            return new DrawParams(density0, layoutDirection0, canvas0, v, null);
        }

        public static DrawParams copy-Ug5Nnss$default(DrawParams canvasDrawScope$DrawParams0, Density density0, LayoutDirection layoutDirection0, Canvas canvas0, long v, int v1, Object object0) {
            if((v1 & 1) != 0) {
                density0 = canvasDrawScope$DrawParams0.density;
            }
            if((v1 & 2) != 0) {
                layoutDirection0 = canvasDrawScope$DrawParams0.layoutDirection;
            }
            if((v1 & 4) != 0) {
                canvas0 = canvasDrawScope$DrawParams0.canvas;
            }
            if((v1 & 8) != 0) {
                v = canvasDrawScope$DrawParams0.size;
            }
            return canvasDrawScope$DrawParams0.copy-Ug5Nnss(density0, layoutDirection0, canvas0, v);
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof DrawParams)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.density, ((DrawParams)object0).density)) {
                return false;
            }
            if(this.layoutDirection != ((DrawParams)object0).layoutDirection) {
                return false;
            }
            return Intrinsics.areEqual(this.canvas, ((DrawParams)object0).canvas) ? Size.equals-impl0(this.size, ((DrawParams)object0).size) : false;
        }

        public final Canvas getCanvas() {
            return this.canvas;
        }

        public final Density getDensity() {
            return this.density;
        }

        public final LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        public final long getSize-NH-jbRc() {
            return this.size;
        }

        @Override
        public int hashCode() {
            return ((this.density.hashCode() * 0x1F + this.layoutDirection.hashCode()) * 0x1F + this.canvas.hashCode()) * 0x1F + Size.hashCode-impl(this.size);
        }

        public final void setCanvas(Canvas canvas0) {
            Intrinsics.checkNotNullParameter(canvas0, "<set-?>");
            this.canvas = canvas0;
        }

        public final void setDensity(Density density0) {
            Intrinsics.checkNotNullParameter(density0, "<set-?>");
            this.density = density0;
        }

        public final void setLayoutDirection(LayoutDirection layoutDirection0) {
            Intrinsics.checkNotNullParameter(layoutDirection0, "<set-?>");
            this.layoutDirection = layoutDirection0;
        }

        public final void setSize-uvyYCjk(long v) {
            this.size = v;
        }

        @Override
        public String toString() {
            return "DrawParams(density=" + this.density + ", layoutDirection=" + this.layoutDirection + ", canvas=" + this.canvas + ", size=" + Size.toString-impl(this.size) + ')';
        }
    }

    private final DrawContext drawContext;
    private final DrawParams drawParams;
    private Paint fillPaint;
    private Paint strokePaint;

    public CanvasDrawScope() {
        this.drawParams = new DrawParams(null, null, null, 0L, 15, null);
        this.drawContext = new DrawContext() {
            private final DrawTransform transform;

            {
                this.transform = CanvasDrawScopeKt.asDrawTransform(this);
            }

            @Override  // androidx.compose.ui.graphics.drawscope.DrawContext
            public Canvas getCanvas() {
                return CanvasDrawScope.this.getDrawParams().getCanvas();
            }

            @Override  // androidx.compose.ui.graphics.drawscope.DrawContext
            public long getSize-NH-jbRc() {
                return CanvasDrawScope.this.getDrawParams().getSize-NH-jbRc();
            }

            @Override  // androidx.compose.ui.graphics.drawscope.DrawContext
            public DrawTransform getTransform() {
                return this.transform;
            }

            @Override  // androidx.compose.ui.graphics.drawscope.DrawContext
            public void setSize-uvyYCjk(long v) {
                CanvasDrawScope.this.getDrawParams().setSize-uvyYCjk(v);
            }
        };
    }

    private final Paint configurePaint-46ZPVWY(long v, DrawStyle drawStyle0, float f, ColorFilter colorFilter0, int v1) {
        Paint paint0 = this.selectPaint(drawStyle0);
        long v2 = this.modulate-5vOe2sY(v, f);
        if(!Color.equals-impl0(paint0.getColor-0d7_KjU(), v2)) {
            paint0.setColor-8_81llA(v2);
        }
        if(paint0.getShader() != null) {
            paint0.setShader(null);
        }
        if(!Intrinsics.areEqual(paint0.getColorFilter(), colorFilter0)) {
            paint0.setColorFilter(colorFilter0);
        }
        if(!BlendMode.equals-impl0(paint0.getBlendMode-0nO6VwU(), v1)) {
            paint0.setBlendMode-s9anfk8(v1);
        }
        return paint0;
    }

    private final Paint configurePaint-UXdrQoc(Brush brush0, DrawStyle drawStyle0, float f, ColorFilter colorFilter0, int v) {
        Paint paint0 = this.selectPaint(drawStyle0);
        if(brush0 != null) {
            brush0.applyTo-Pq9zytI(this.getSize-NH-jbRc(), paint0, f);
        }
        else if(paint0.getAlpha() != f) {
            paint0.setAlpha(f);
        }
        if(!Intrinsics.areEqual(paint0.getColorFilter(), colorFilter0)) {
            paint0.setColorFilter(colorFilter0);
        }
        if(!BlendMode.equals-impl0(paint0.getBlendMode-0nO6VwU(), v)) {
            paint0.setBlendMode-s9anfk8(v);
        }
        return paint0;
    }

    private final Paint configureStrokePaint-ApHOwBQ(Brush brush0, float f, float f1, int v, int v1, PathEffect pathEffect0, float f2, ColorFilter colorFilter0, int v2) {
        Paint paint0 = this.obtainStrokePaint();
        if(brush0 != null) {
            brush0.applyTo-Pq9zytI(this.getSize-NH-jbRc(), paint0, f2);
        }
        else if(paint0.getAlpha() != f2) {
            paint0.setAlpha(f2);
        }
        if(!Intrinsics.areEqual(paint0.getColorFilter(), colorFilter0)) {
            paint0.setColorFilter(colorFilter0);
        }
        if(!BlendMode.equals-impl0(paint0.getBlendMode-0nO6VwU(), v2)) {
            paint0.setBlendMode-s9anfk8(v2);
        }
        if(paint0.getStrokeWidth() != f) {
            paint0.setStrokeWidth(f);
        }
        if(paint0.getStrokeMiterLimit() != f1) {
            paint0.setStrokeMiterLimit(f1);
        }
        if(!StrokeCap.equals-impl0(paint0.getStrokeCap-KaPHkGw(), v)) {
            paint0.setStrokeCap-BeK7IIE(v);
        }
        if(!StrokeJoin.equals-impl0(paint0.getStrokeJoin-LxFBmk8(), v1)) {
            paint0.setStrokeJoin-Ww9F2mQ(v1);
        }
        if(!Intrinsics.areEqual(paint0.getPathEffect(), pathEffect0)) {
            paint0.setPathEffect(pathEffect0);
        }
        return paint0;
    }

    private final Paint configureStrokePaint-TuZ1BDo(long v, float f, float f1, int v1, int v2, PathEffect pathEffect0, float f2, ColorFilter colorFilter0, int v3) {
        Paint paint0 = this.obtainStrokePaint();
        long v4 = this.modulate-5vOe2sY(v, f2);
        if(!Color.equals-impl0(paint0.getColor-0d7_KjU(), v4)) {
            paint0.setColor-8_81llA(v4);
        }
        if(paint0.getShader() != null) {
            paint0.setShader(null);
        }
        if(!Intrinsics.areEqual(paint0.getColorFilter(), colorFilter0)) {
            paint0.setColorFilter(colorFilter0);
        }
        if(!BlendMode.equals-impl0(paint0.getBlendMode-0nO6VwU(), v3)) {
            paint0.setBlendMode-s9anfk8(v3);
        }
        if(paint0.getStrokeWidth() != f) {
            paint0.setStrokeWidth(f);
        }
        if(paint0.getStrokeMiterLimit() != f1) {
            paint0.setStrokeMiterLimit(f1);
        }
        if(!StrokeCap.equals-impl0(paint0.getStrokeCap-KaPHkGw(), v1)) {
            paint0.setStrokeCap-BeK7IIE(v1);
        }
        if(!StrokeJoin.equals-impl0(paint0.getStrokeJoin-LxFBmk8(), v2)) {
            paint0.setStrokeJoin-Ww9F2mQ(v2);
        }
        if(!Intrinsics.areEqual(paint0.getPathEffect(), pathEffect0)) {
            paint0.setPathEffect(pathEffect0);
        }
        return paint0;
    }

    public final void draw-yzxVdVo(Density density0, LayoutDirection layoutDirection0, Canvas canvas0, long v, Function1 function10) {
        Intrinsics.checkNotNullParameter(density0, "density");
        Intrinsics.checkNotNullParameter(layoutDirection0, "layoutDirection");
        Intrinsics.checkNotNullParameter(canvas0, "canvas");
        Intrinsics.checkNotNullParameter(function10, "block");
        DrawParams canvasDrawScope$DrawParams0 = this.getDrawParams();
        DrawParams canvasDrawScope$DrawParams1 = this.getDrawParams();
        canvasDrawScope$DrawParams1.setDensity(density0);
        canvasDrawScope$DrawParams1.setLayoutDirection(layoutDirection0);
        canvasDrawScope$DrawParams1.setCanvas(canvas0);
        canvasDrawScope$DrawParams1.setSize-uvyYCjk(v);
        canvas0.save();
        function10.invoke(this);
        canvas0.restore();
        DrawParams canvasDrawScope$DrawParams2 = this.getDrawParams();
        canvasDrawScope$DrawParams2.setDensity(canvasDrawScope$DrawParams0.component1());
        canvasDrawScope$DrawParams2.setLayoutDirection(canvasDrawScope$DrawParams0.component2());
        canvasDrawScope$DrawParams2.setCanvas(canvasDrawScope$DrawParams0.component3());
        canvasDrawScope$DrawParams2.setSize-uvyYCjk(canvasDrawScope$DrawParams0.component4-NH-jbRc());
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawArc-illE91I(Brush brush0, float f, float f1, boolean z, long v, long v1, float f2, DrawStyle drawStyle0, ColorFilter colorFilter0, int v2) {
        Intrinsics.checkNotNullParameter(brush0, "brush");
        Intrinsics.checkNotNullParameter(drawStyle0, "style");
        float f3 = Offset.getX-impl(v);
        float f4 = Offset.getY-impl(v);
        float f5 = Offset.getX-impl(v);
        float f6 = Size.getWidth-impl(v1);
        float f7 = Offset.getY-impl(v);
        float f8 = Size.getHeight-impl(v1);
        this.drawParams.getCanvas().drawArc(f3, f4, f5 + f6, f7 + f8, f, f1, z, this.configurePaint-UXdrQoc(brush0, drawStyle0, f2, colorFilter0, v2));
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawArc-yD3GUKo(long v, float f, float f1, boolean z, long v1, long v2, float f2, DrawStyle drawStyle0, ColorFilter colorFilter0, int v3) {
        Intrinsics.checkNotNullParameter(drawStyle0, "style");
        float f3 = Offset.getX-impl(v1);
        float f4 = Offset.getY-impl(v1);
        float f5 = Offset.getX-impl(v1);
        float f6 = Size.getWidth-impl(v2);
        float f7 = Offset.getY-impl(v1);
        float f8 = Size.getHeight-impl(v2);
        Paint paint0 = this.configurePaint-46ZPVWY(v, drawStyle0, f2, colorFilter0, v3);
        this.drawParams.getCanvas().drawArc(f3, f4, f5 + f6, f7 + f8, f, f1, z, paint0);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawCircle-V9BoPsw(Brush brush0, float f, long v, float f1, DrawStyle drawStyle0, ColorFilter colorFilter0, int v1) {
        Intrinsics.checkNotNullParameter(brush0, "brush");
        Intrinsics.checkNotNullParameter(drawStyle0, "style");
        this.drawParams.getCanvas().drawCircle-9KIMszo(v, f, this.configurePaint-UXdrQoc(brush0, drawStyle0, f1, colorFilter0, v1));
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawCircle-VaOC9Bg(long v, float f, long v1, float f1, DrawStyle drawStyle0, ColorFilter colorFilter0, int v2) {
        Intrinsics.checkNotNullParameter(drawStyle0, "style");
        Paint paint0 = this.configurePaint-46ZPVWY(v, drawStyle0, f1, colorFilter0, v2);
        this.drawParams.getCanvas().drawCircle-9KIMszo(v1, f, paint0);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawImage-9jGpkUE(ImageBitmap imageBitmap0, long v, long v1, long v2, long v3, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v4) {
        Intrinsics.checkNotNullParameter(imageBitmap0, "image");
        Intrinsics.checkNotNullParameter(drawStyle0, "style");
        Paint paint0 = this.configurePaint-UXdrQoc(null, drawStyle0, f, colorFilter0, v4);
        this.drawParams.getCanvas().drawImageRect-HPBpro0(imageBitmap0, v, v1, v2, v3, paint0);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawImage-gbVJVH8(ImageBitmap imageBitmap0, long v, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v1) {
        Intrinsics.checkNotNullParameter(imageBitmap0, "image");
        Intrinsics.checkNotNullParameter(drawStyle0, "style");
        Paint paint0 = this.configurePaint-UXdrQoc(null, drawStyle0, f, colorFilter0, v1);
        this.drawParams.getCanvas().drawImage-d-4ec7I(imageBitmap0, v, paint0);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawLine-1RTmtNc(Brush brush0, long v, long v1, float f, int v2, PathEffect pathEffect0, float f1, ColorFilter colorFilter0, int v3) {
        Intrinsics.checkNotNullParameter(brush0, "brush");
        Paint paint0 = this.configureStrokePaint-ApHOwBQ(brush0, f, 4.0f, v2, 0, pathEffect0, f1, colorFilter0, v3);
        this.drawParams.getCanvas().drawLine-Wko1d7g(v, v1, paint0);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawLine-NGM6Ib0(long v, long v1, long v2, float f, int v3, PathEffect pathEffect0, float f1, ColorFilter colorFilter0, int v4) {
        Paint paint0 = this.configureStrokePaint-TuZ1BDo(v, f, 4.0f, v3, 0, pathEffect0, f1, colorFilter0, v4);
        this.drawParams.getCanvas().drawLine-Wko1d7g(v1, v2, paint0);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawOval-AsUm42w(Brush brush0, long v, long v1, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v2) {
        Intrinsics.checkNotNullParameter(brush0, "brush");
        Intrinsics.checkNotNullParameter(drawStyle0, "style");
        float f1 = Offset.getX-impl(v);
        float f2 = Offset.getY-impl(v);
        float f3 = Offset.getX-impl(v);
        float f4 = Size.getWidth-impl(v1);
        float f5 = Offset.getY-impl(v);
        float f6 = Size.getHeight-impl(v1);
        Paint paint0 = this.configurePaint-UXdrQoc(brush0, drawStyle0, f, colorFilter0, v2);
        this.drawParams.getCanvas().drawOval(f1, f2, f3 + f4, f5 + f6, paint0);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawOval-n-J9OG0(long v, long v1, long v2, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v3) {
        Intrinsics.checkNotNullParameter(drawStyle0, "style");
        float f1 = Offset.getX-impl(v1);
        float f2 = Offset.getY-impl(v1);
        float f3 = Offset.getX-impl(v1);
        float f4 = Size.getWidth-impl(v2);
        float f5 = Offset.getY-impl(v1);
        float f6 = Size.getHeight-impl(v2);
        Paint paint0 = this.configurePaint-46ZPVWY(v, drawStyle0, f, colorFilter0, v3);
        this.drawParams.getCanvas().drawOval(f1, f2, f3 + f4, f5 + f6, paint0);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawPath-GBMwjPU(Path path0, Brush brush0, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v) {
        Intrinsics.checkNotNullParameter(path0, "path");
        Intrinsics.checkNotNullParameter(brush0, "brush");
        Intrinsics.checkNotNullParameter(drawStyle0, "style");
        Paint paint0 = this.configurePaint-UXdrQoc(brush0, drawStyle0, f, colorFilter0, v);
        this.drawParams.getCanvas().drawPath(path0, paint0);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawPath-LG529CI(Path path0, long v, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v1) {
        Intrinsics.checkNotNullParameter(path0, "path");
        Intrinsics.checkNotNullParameter(drawStyle0, "style");
        Paint paint0 = this.configurePaint-46ZPVWY(v, drawStyle0, f, colorFilter0, v1);
        this.drawParams.getCanvas().drawPath(path0, paint0);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawPoints-F8ZwMP8(List list0, int v, long v1, float f, int v2, PathEffect pathEffect0, float f1, ColorFilter colorFilter0, int v3) {
        Intrinsics.checkNotNullParameter(list0, "points");
        Paint paint0 = this.configureStrokePaint-TuZ1BDo(v1, f, 4.0f, v2, 0, pathEffect0, f1, colorFilter0, v3);
        this.drawParams.getCanvas().drawPoints-O7TthRY(v, list0, paint0);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawPoints-Gsft0Ws(List list0, int v, Brush brush0, float f, int v1, PathEffect pathEffect0, float f1, ColorFilter colorFilter0, int v2) {
        Intrinsics.checkNotNullParameter(list0, "points");
        Intrinsics.checkNotNullParameter(brush0, "brush");
        Paint paint0 = this.configureStrokePaint-ApHOwBQ(brush0, f, 4.0f, v1, 0, pathEffect0, f1, colorFilter0, v2);
        this.drawParams.getCanvas().drawPoints-O7TthRY(v, list0, paint0);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawRect-AsUm42w(Brush brush0, long v, long v1, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v2) {
        Intrinsics.checkNotNullParameter(brush0, "brush");
        Intrinsics.checkNotNullParameter(drawStyle0, "style");
        float f1 = Offset.getX-impl(v);
        float f2 = Offset.getY-impl(v);
        float f3 = Offset.getX-impl(v);
        float f4 = Size.getWidth-impl(v1);
        float f5 = Offset.getY-impl(v);
        float f6 = Size.getHeight-impl(v1);
        Paint paint0 = this.configurePaint-UXdrQoc(brush0, drawStyle0, f, colorFilter0, v2);
        this.drawParams.getCanvas().drawRect(f1, f2, f3 + f4, f5 + f6, paint0);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawRect-n-J9OG0(long v, long v1, long v2, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v3) {
        Intrinsics.checkNotNullParameter(drawStyle0, "style");
        float f1 = Offset.getX-impl(v1);
        float f2 = Offset.getY-impl(v1);
        float f3 = Offset.getX-impl(v1);
        float f4 = Size.getWidth-impl(v2);
        float f5 = Offset.getY-impl(v1);
        float f6 = Size.getHeight-impl(v2);
        Paint paint0 = this.configurePaint-46ZPVWY(v, drawStyle0, f, colorFilter0, v3);
        this.drawParams.getCanvas().drawRect(f1, f2, f3 + f4, f5 + f6, paint0);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawRoundRect-ZuiqVtQ(Brush brush0, long v, long v1, long v2, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v3) {
        Intrinsics.checkNotNullParameter(brush0, "brush");
        Intrinsics.checkNotNullParameter(drawStyle0, "style");
        float f1 = Offset.getX-impl(v);
        float f2 = Offset.getY-impl(v);
        float f3 = Offset.getX-impl(v);
        float f4 = Size.getWidth-impl(v1);
        float f5 = Offset.getY-impl(v);
        float f6 = Size.getHeight-impl(v1);
        Paint paint0 = this.configurePaint-UXdrQoc(brush0, drawStyle0, f, colorFilter0, v3);
        this.drawParams.getCanvas().drawRoundRect(f1, f2, f3 + f4, f5 + f6, CornerRadius.getX-impl(v2), CornerRadius.getY-impl(v2), paint0);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawRoundRect-u-Aw5IA(long v, long v1, long v2, long v3, DrawStyle drawStyle0, float f, ColorFilter colorFilter0, int v4) {
        Intrinsics.checkNotNullParameter(drawStyle0, "style");
        float f1 = Offset.getX-impl(v1);
        float f2 = Offset.getY-impl(v1);
        float f3 = Offset.getX-impl(v1);
        float f4 = Size.getWidth-impl(v2);
        float f5 = Offset.getY-impl(v1);
        float f6 = Size.getHeight-impl(v2);
        Paint paint0 = this.configurePaint-46ZPVWY(v, drawStyle0, f, colorFilter0, v4);
        this.drawParams.getCanvas().drawRoundRect(f1, f2, f3 + f4, f5 + f6, CornerRadius.getX-impl(v3), CornerRadius.getY-impl(v3), paint0);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public long getCenter-F1C5BW0() {
        return DefaultImpls.getCenter-F1C5BW0(this);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.drawParams.getDensity().getDensity();
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public DrawContext getDrawContext() {
        return this.drawContext;
    }

    public final DrawParams getDrawParams() {
        return this.drawParams;
    }

    public static void getDrawParams$annotations() {
    }

    @Override  // androidx.compose.ui.unit.Density
    public float getFontScale() {
        return this.drawParams.getDensity().getFontScale();
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public LayoutDirection getLayoutDirection() {
        return this.drawParams.getLayoutDirection();
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public long getSize-NH-jbRc() {
        return DefaultImpls.getSize-NH-jbRc(this);
    }

    // 去混淆评级： 低(30)
    private final long modulate-5vOe2sY(long v, float f) {
        return f == 1.0f ? v : Color.copy-wmQWz5c$default(v, Color.getAlpha-impl(v) * f, 0.0f, 0.0f, 0.0f, 14, null);
    }

    private final Paint obtainFillPaint() {
        Paint paint0 = this.fillPaint;
        if(paint0 == null) {
            paint0 = AndroidPaint_androidKt.Paint();
            paint0.setStyle-k9PVt8s(0);
            this.fillPaint = paint0;
        }
        return paint0;
    }

    private final Paint obtainStrokePaint() {
        Paint paint0 = this.strokePaint;
        if(paint0 == null) {
            paint0 = AndroidPaint_androidKt.Paint();
            paint0.setStyle-k9PVt8s(1);
            this.strokePaint = paint0;
        }
        return paint0;
    }

    @Override  // androidx.compose.ui.unit.Density
    public int roundToPx--R2X_6o(long v) {
        return DefaultImpls.roundToPx--R2X_6o(this, v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public int roundToPx-0680j_4(float f) {
        return DefaultImpls.roundToPx-0680j_4(this, f);
    }

    private final Paint selectPaint(DrawStyle drawStyle0) {
        if(Intrinsics.areEqual(drawStyle0, Fill.INSTANCE)) {
            return this.obtainFillPaint();
        }
        if(!(drawStyle0 instanceof Stroke)) {
            throw new NoWhenBranchMatchedException();
        }
        Paint paint0 = this.obtainStrokePaint();
        if(paint0.getStrokeWidth() != ((Stroke)drawStyle0).getWidth()) {
            paint0.setStrokeWidth(((Stroke)drawStyle0).getWidth());
        }
        if(!StrokeCap.equals-impl0(paint0.getStrokeCap-KaPHkGw(), ((Stroke)drawStyle0).getCap-KaPHkGw())) {
            paint0.setStrokeCap-BeK7IIE(((Stroke)drawStyle0).getCap-KaPHkGw());
        }
        if(paint0.getStrokeMiterLimit() != ((Stroke)drawStyle0).getMiter()) {
            paint0.setStrokeMiterLimit(((Stroke)drawStyle0).getMiter());
        }
        if(!StrokeJoin.equals-impl0(paint0.getStrokeJoin-LxFBmk8(), ((Stroke)drawStyle0).getJoin-LxFBmk8())) {
            paint0.setStrokeJoin-Ww9F2mQ(((Stroke)drawStyle0).getJoin-LxFBmk8());
        }
        if(!Intrinsics.areEqual(paint0.getPathEffect(), ((Stroke)drawStyle0).getPathEffect())) {
            paint0.setPathEffect(((Stroke)drawStyle0).getPathEffect());
        }
        return paint0;
    }

    @Override  // androidx.compose.ui.unit.Density
    public float toDp-GaN1DYA(long v) {
        return DefaultImpls.toDp-GaN1DYA(this, v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float toDp-u2uoSUM(float f) {
        return DefaultImpls.toDp-u2uoSUM(this, f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float toDp-u2uoSUM(int v) {
        return DefaultImpls.toDp-u2uoSUM(this, v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float toPx--R2X_6o(long v) {
        return DefaultImpls.toPx--R2X_6o(this, v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float toPx-0680j_4(float f) {
        return DefaultImpls.toPx-0680j_4(this, f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public Rect toRect(DpRect dpRect0) {
        return DefaultImpls.toRect(this, dpRect0);
    }

    @Override  // androidx.compose.ui.unit.Density
    public long toSp-0xMU5do(float f) {
        return DefaultImpls.toSp-0xMU5do(this, f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public long toSp-kPz2Gy4(float f) {
        return DefaultImpls.toSp-kPz2Gy4(this, f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public long toSp-kPz2Gy4(int v) {
        return DefaultImpls.toSp-kPz2Gy4(this, v);
    }
}

