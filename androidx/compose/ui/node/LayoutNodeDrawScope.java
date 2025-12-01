package androidx.compose.ui.node;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u00EC\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000F\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0004\u00A2\u0006\u0002\u0010\u0005JJ\u0010\u001D\u001A\u00020\u001E2\u0006\u0010\u001F\u001A\u00020 2\u0006\u0010\u0018\u001A\u00020\u00192\u0006\u0010!\u001A\u00020\u001C2\u0017\u0010\"\u001A\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u001E0#\u00A2\u0006\u0002\b$H\u0080\b\u00F8\u0001\u0000\u00F8\u0001\u0003\u00F8\u0001\u0001\u00A2\u0006\u0004\b%\u0010&Jt\u0010\'\u001A\u00020\u001E2\u0006\u0010(\u001A\u00020)2\u0006\u0010*\u001A\u00020\u000B2\u0006\u0010+\u001A\u00020\u000B2\u0006\u0010,\u001A\u00020-2\b\b\u0002\u0010.\u001A\u00020\u00072\b\b\u0002\u0010\u0018\u001A\u00020\u00192\b\b\u0002\u0010/\u001A\u00020\u000B2\b\b\u0002\u00100\u001A\u0002012\n\b\u0002\u00102\u001A\u0004\u0018\u0001032\b\b\u0002\u00104\u001A\u000205H\u0096\u0001\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b6\u00107Jt\u0010\'\u001A\u00020\u001E2\u0006\u00108\u001A\u0002092\u0006\u0010*\u001A\u00020\u000B2\u0006\u0010+\u001A\u00020\u000B2\u0006\u0010,\u001A\u00020-2\b\b\u0002\u0010.\u001A\u00020\u00072\b\b\u0002\u0010\u0018\u001A\u00020\u00192\b\b\u0002\u0010/\u001A\u00020\u000B2\b\b\u0002\u00100\u001A\u0002012\n\b\u0002\u00102\u001A\u0004\u0018\u0001032\b\b\u0002\u00104\u001A\u000205H\u0096\u0001\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b:\u0010;J\\\u0010<\u001A\u00020\u001E2\u0006\u0010(\u001A\u00020)2\b\b\u0002\u0010=\u001A\u00020\u000B2\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010/\u001A\u00020\u000B2\b\b\u0002\u00100\u001A\u0002012\n\b\u0002\u00102\u001A\u0004\u0018\u0001032\b\b\u0002\u00104\u001A\u000205H\u0096\u0001\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b>\u0010?J\\\u0010<\u001A\u00020\u001E2\u0006\u00108\u001A\u0002092\b\b\u0002\u0010=\u001A\u00020\u000B2\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010/\u001A\u00020\u000B2\b\b\u0002\u00100\u001A\u0002012\n\b\u0002\u00102\u001A\u0004\u0018\u0001032\b\b\u0002\u00104\u001A\u000205H\u0096\u0001\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b@\u0010AJ\b\u0010B\u001A\u00020\u001EH\u0016JR\u0010C\u001A\u00020\u001E2\u0006\u0010D\u001A\u00020E2\b\b\u0002\u0010.\u001A\u00020\u00072\b\b\u0002\u0010/\u001A\u00020\u000B2\b\b\u0002\u00100\u001A\u0002012\n\b\u0002\u00102\u001A\u0004\u0018\u0001032\b\b\u0002\u00104\u001A\u000205H\u0096\u0001\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bF\u0010GJp\u0010C\u001A\u00020\u001E2\u0006\u0010D\u001A\u00020E2\b\b\u0002\u0010H\u001A\u00020I2\b\b\u0002\u0010J\u001A\u00020K2\b\b\u0002\u0010L\u001A\u00020I2\b\b\u0002\u0010M\u001A\u00020K2\b\b\u0002\u0010/\u001A\u00020\u000B2\b\b\u0002\u00100\u001A\u0002012\n\b\u0002\u00102\u001A\u0004\u0018\u0001032\b\b\u0002\u00104\u001A\u000205H\u0096\u0001\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bN\u0010OJn\u0010P\u001A\u00020\u001E2\u0006\u0010(\u001A\u00020)2\u0006\u0010Q\u001A\u00020\u00072\u0006\u0010R\u001A\u00020\u00072\b\b\u0002\u0010S\u001A\u00020\u000B2\b\b\u0002\u0010T\u001A\u00020U2\n\b\u0002\u0010V\u001A\u0004\u0018\u00010W2\b\b\u0002\u0010/\u001A\u00020\u000B2\n\b\u0002\u00102\u001A\u0004\u0018\u0001032\b\b\u0002\u00104\u001A\u000205H\u0096\u0001\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bX\u0010YJn\u0010P\u001A\u00020\u001E2\u0006\u00108\u001A\u0002092\u0006\u0010Q\u001A\u00020\u00072\u0006\u0010R\u001A\u00020\u00072\b\b\u0002\u0010S\u001A\u00020\u000B2\b\b\u0002\u0010T\u001A\u00020U2\n\b\u0002\u0010V\u001A\u0004\u0018\u00010W2\b\b\u0002\u0010/\u001A\u00020\u000B2\n\b\u0002\u00102\u001A\u0004\u0018\u0001032\b\b\u0002\u00104\u001A\u000205H\u0096\u0001\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bZ\u0010[J\\\u0010\\\u001A\u00020\u001E2\u0006\u0010(\u001A\u00020)2\b\b\u0002\u0010.\u001A\u00020\u00072\b\b\u0002\u0010\u0018\u001A\u00020\u00192\b\b\u0002\u0010/\u001A\u00020\u000B2\b\b\u0002\u00100\u001A\u0002012\n\b\u0002\u00102\u001A\u0004\u0018\u0001032\b\b\u0002\u00104\u001A\u000205H\u0096\u0001\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b]\u0010^J\\\u0010\\\u001A\u00020\u001E2\u0006\u00108\u001A\u0002092\b\b\u0002\u0010.\u001A\u00020\u00072\b\b\u0002\u0010\u0018\u001A\u00020\u00192\b\b\u0002\u0010/\u001A\u00020\u000B2\b\b\u0002\u00100\u001A\u0002012\n\b\u0002\u00102\u001A\u0004\u0018\u0001032\b\b\u0002\u00104\u001A\u000205H\u0096\u0001\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b_\u0010`JP\u0010a\u001A\u00020\u001E2\u0006\u0010b\u001A\u00020c2\u0006\u0010(\u001A\u00020)2\b\b\u0002\u0010/\u001A\u00020\u000B2\b\b\u0002\u00100\u001A\u0002012\n\b\u0002\u00102\u001A\u0004\u0018\u0001032\b\b\u0002\u00104\u001A\u000205H\u0096\u0001\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bd\u0010eJP\u0010a\u001A\u00020\u001E2\u0006\u0010b\u001A\u00020c2\u0006\u00108\u001A\u0002092\b\b\u0002\u0010/\u001A\u00020\u000B2\b\b\u0002\u00100\u001A\u0002012\n\b\u0002\u00102\u001A\u0004\u0018\u0001032\b\b\u0002\u00104\u001A\u000205H\u0096\u0001\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bf\u0010gJt\u0010h\u001A\u00020\u001E2\f\u0010i\u001A\b\u0012\u0004\u0012\u00020\u00070j2\u0006\u0010k\u001A\u00020l2\u0006\u0010(\u001A\u00020)2\b\b\u0002\u0010S\u001A\u00020\u000B2\b\b\u0002\u0010T\u001A\u00020U2\n\b\u0002\u0010V\u001A\u0004\u0018\u00010W2\b\b\u0002\u0010/\u001A\u00020\u000B2\n\b\u0002\u00102\u001A\u0004\u0018\u0001032\b\b\u0002\u00104\u001A\u000205H\u0096\u0001\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bm\u0010nJt\u0010h\u001A\u00020\u001E2\f\u0010i\u001A\b\u0012\u0004\u0012\u00020\u00070j2\u0006\u0010k\u001A\u00020l2\u0006\u00108\u001A\u0002092\b\b\u0002\u0010S\u001A\u00020\u000B2\b\b\u0002\u0010T\u001A\u00020U2\n\b\u0002\u0010V\u001A\u0004\u0018\u00010W2\b\b\u0002\u0010/\u001A\u00020\u000B2\n\b\u0002\u00102\u001A\u0004\u0018\u0001032\b\b\u0002\u00104\u001A\u000205H\u0096\u0001\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bo\u0010pJ\\\u0010q\u001A\u00020\u001E2\u0006\u0010(\u001A\u00020)2\b\b\u0002\u0010.\u001A\u00020\u00072\b\b\u0002\u0010\u0018\u001A\u00020\u00192\b\b\u0002\u0010/\u001A\u00020\u000B2\b\b\u0002\u00100\u001A\u0002012\n\b\u0002\u00102\u001A\u0004\u0018\u0001032\b\b\u0002\u00104\u001A\u000205H\u0096\u0001\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\br\u0010^J\\\u0010q\u001A\u00020\u001E2\u0006\u00108\u001A\u0002092\b\b\u0002\u0010.\u001A\u00020\u00072\b\b\u0002\u0010\u0018\u001A\u00020\u00192\b\b\u0002\u0010/\u001A\u00020\u000B2\b\b\u0002\u00100\u001A\u0002012\n\b\u0002\u00102\u001A\u0004\u0018\u0001032\b\b\u0002\u00104\u001A\u000205H\u0096\u0001\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bs\u0010`Jf\u0010t\u001A\u00020\u001E2\u0006\u0010(\u001A\u00020)2\b\b\u0002\u0010.\u001A\u00020\u00072\b\b\u0002\u0010\u0018\u001A\u00020\u00192\b\b\u0002\u0010u\u001A\u00020v2\b\b\u0002\u0010/\u001A\u00020\u000B2\b\b\u0002\u00100\u001A\u0002012\n\b\u0002\u00102\u001A\u0004\u0018\u0001032\b\b\u0002\u00104\u001A\u000205H\u0096\u0001\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bw\u0010xJf\u0010t\u001A\u00020\u001E2\u0006\u00108\u001A\u0002092\b\b\u0002\u0010.\u001A\u00020\u00072\b\b\u0002\u0010\u0018\u001A\u00020\u00192\b\b\u0002\u0010u\u001A\u00020v2\b\b\u0002\u00100\u001A\u0002012\b\b\u0002\u0010/\u001A\u00020\u000B2\n\b\u0002\u00102\u001A\u0004\u0018\u0001032\b\b\u0002\u00104\u001A\u000205H\u0096\u0001\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\by\u0010zJ\u001A\u0010{\u001A\u00020|*\u00020}H\u0097\u0001\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b~\u0010\u007FJ\u001D\u0010{\u001A\u00020|*\u00030\u0080\u0001H\u0097\u0001\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u001E\u0010\u0083\u0001\u001A\u00020}*\u00030\u0080\u0001H\u0097\u0001\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J \u0010\u0083\u0001\u001A\u00020}*\u00020\u000BH\u0097\u0001\u00F8\u0001\u0000\u00F8\u0001\u0002\u00F8\u0001\u0001\u00A2\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J \u0010\u0083\u0001\u001A\u00020}*\u00020|H\u0097\u0001\u00F8\u0001\u0000\u00F8\u0001\u0002\u00F8\u0001\u0001\u00A2\u0006\u0006\b\u0086\u0001\u0010\u0088\u0001J\u001D\u0010\u0089\u0001\u001A\u00020\u000B*\u00020}H\u0097\u0001\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\b\u008A\u0001\u0010\u0087\u0001J\u001E\u0010\u0089\u0001\u001A\u00020\u000B*\u00030\u0080\u0001H\u0097\u0001\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\b\u008B\u0001\u0010\u0085\u0001J\u0010\u0010\u008C\u0001\u001A\u00030\u008D\u0001*\u00030\u008E\u0001H\u0097\u0001J\u001E\u0010\u008F\u0001\u001A\u00030\u0080\u0001*\u00020}H\u0097\u0001\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J!\u0010\u008F\u0001\u001A\u00030\u0080\u0001*\u00020\u000BH\u0097\u0001\u00F8\u0001\u0000\u00F8\u0001\u0002\u00F8\u0001\u0001\u00A2\u0006\u0006\b\u0092\u0001\u0010\u0091\u0001J!\u0010\u008F\u0001\u001A\u00030\u0080\u0001*\u00020|H\u0097\u0001\u00F8\u0001\u0000\u00F8\u0001\u0002\u00F8\u0001\u0001\u00A2\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001R\u000E\u0010\u0003\u001A\u00020\u0004X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u001D\u0010\u0006\u001A\u00020\u00078VX\u0096\u0005\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0006\u001A\u0004\b\b\u0010\tR\u0014\u0010\n\u001A\u00020\u000B8\u0016X\u0097\u0005\u00A2\u0006\u0006\u001A\u0004\b\f\u0010\rR\u0012\u0010\u000E\u001A\u00020\u000FX\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001A\u00020\u000B8\u0016X\u0097\u0005\u00A2\u0006\u0006\u001A\u0004\b\u0013\u0010\rR\u0012\u0010\u0014\u001A\u00020\u0015X\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\b\u0016\u0010\u0017R\u001D\u0010\u0018\u001A\u00020\u00198VX\u0096\u0005\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0006\u001A\u0004\b\u001A\u0010\tR\u0010\u0010\u001B\u001A\u0004\u0018\u00010\u001CX\u0082\u000E\u00A2\u0006\u0002\n\u0000\u0082\u0002\u0016\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\n\u0005\b\u009920\u0001\u00A8\u0006\u0094\u0001"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "canvasDrawScope", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "(Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;)V", "center", "Landroidx/compose/ui/geometry/Offset;", "getCenter-F1C5BW0", "()J", "density", "", "getDensity", "()F", "drawContext", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "getDrawContext", "()Landroidx/compose/ui/graphics/drawscope/DrawContext;", "fontScale", "getFontScale", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "size", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "wrapped", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "draw", "", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "LayoutNodeWrapper", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "draw-x_KDEd0$ui_release", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/node/LayoutNodeWrapper;Lkotlin/jvm/functions/Function1;)V", "drawArc", "brush", "Landroidx/compose/ui/graphics/Brush;", "startAngle", "sweepAngle", "useCenter", "", "topLeft", "alpha", "style", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "drawArc-illE91I", "(Landroidx/compose/ui/graphics/Brush;FFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "color", "Landroidx/compose/ui/graphics/Color;", "drawArc-yD3GUKo", "(JFFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle", "radius", "drawCircle-V9BoPsw", "(Landroidx/compose/ui/graphics/Brush;FJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle-VaOC9Bg", "(JFJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawContent", "drawImage", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "drawImage-gbVJVH8", "(Landroidx/compose/ui/graphics/ImageBitmap;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "srcOffset", "Landroidx/compose/ui/unit/IntOffset;", "srcSize", "Landroidx/compose/ui/unit/IntSize;", "dstOffset", "dstSize", "drawImage-9jGpkUE", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawLine", "start", "end", "strokeWidth", "cap", "Landroidx/compose/ui/graphics/StrokeCap;", "pathEffect", "Landroidx/compose/ui/graphics/PathEffect;", "drawLine-1RTmtNc", "(Landroidx/compose/ui/graphics/Brush;JJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawLine-NGM6Ib0", "(JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval", "drawOval-AsUm42w", "(Landroidx/compose/ui/graphics/Brush;JJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval-n-J9OG0", "(JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath", "path", "Landroidx/compose/ui/graphics/Path;", "drawPath-GBMwjPU", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath-LG529CI", "(Landroidx/compose/ui/graphics/Path;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints", "points", "", "pointMode", "Landroidx/compose/ui/graphics/PointMode;", "drawPoints-Gsft0Ws", "(Ljava/util/List;ILandroidx/compose/ui/graphics/Brush;FILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints-F8ZwMP8", "(Ljava/util/List;IJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawRect", "drawRect-AsUm42w", "drawRect-n-J9OG0", "drawRoundRect", "cornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "drawRoundRect-ZuiqVtQ", "(Landroidx/compose/ui/graphics/Brush;JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawRoundRect-u-Aw5IA", "(JJJJLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "roundToPx", "", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp", "toDp-GaN1DYA", "(J)F", "toDp-u2uoSUM", "(F)F", "(I)F", "toPx", "toPx-0680j_4", "toPx--R2X_6o", "toRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/DpRect;", "toSp", "toSp-0xMU5do", "(F)J", "toSp-kPz2Gy4", "(I)J", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class LayoutNodeDrawScope implements ContentDrawScope, DrawScope {
    private final CanvasDrawScope canvasDrawScope;
    private LayoutNodeWrapper wrapped;

    public LayoutNodeDrawScope() {
        this(null, 1, null);
    }

    public LayoutNodeDrawScope(CanvasDrawScope canvasDrawScope0) {
        Intrinsics.checkNotNullParameter(canvasDrawScope0, "canvasDrawScope");
        super();
        this.canvasDrawScope = canvasDrawScope0;
    }

    public LayoutNodeDrawScope(CanvasDrawScope canvasDrawScope0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            canvasDrawScope0 = new CanvasDrawScope();
        }
        this(canvasDrawScope0);
    }

    public final void draw-x_KDEd0$ui_release(Canvas canvas0, long v, LayoutNodeWrapper layoutNodeWrapper0, Function1 function10) {
        Intrinsics.checkNotNullParameter(canvas0, "canvas");
        Intrinsics.checkNotNullParameter(layoutNodeWrapper0, "LayoutNodeWrapper");
        Intrinsics.checkNotNullParameter(function10, "block");
        this.wrapped = layoutNodeWrapper0;
        CanvasDrawScope canvasDrawScope0 = this.canvasDrawScope;
        Density density0 = layoutNodeWrapper0.getMeasureScope();
        LayoutDirection layoutDirection0 = layoutNodeWrapper0.getMeasureScope().getLayoutDirection();
        DrawParams canvasDrawScope$DrawParams0 = canvasDrawScope0.getDrawParams();
        DrawParams canvasDrawScope$DrawParams1 = canvasDrawScope0.getDrawParams();
        canvasDrawScope$DrawParams1.setDensity(density0);
        canvasDrawScope$DrawParams1.setLayoutDirection(layoutDirection0);
        canvasDrawScope$DrawParams1.setCanvas(canvas0);
        canvasDrawScope$DrawParams1.setSize-uvyYCjk(v);
        canvas0.save();
        function10.invoke(canvasDrawScope0);
        canvas0.restore();
        DrawParams canvasDrawScope$DrawParams2 = canvasDrawScope0.getDrawParams();
        canvasDrawScope$DrawParams2.setDensity(canvasDrawScope$DrawParams0.component1());
        canvasDrawScope$DrawParams2.setLayoutDirection(canvasDrawScope$DrawParams0.component2());
        canvasDrawScope$DrawParams2.setCanvas(canvasDrawScope$DrawParams0.component3());
        canvasDrawScope$DrawParams2.setSize-uvyYCjk(canvasDrawScope$DrawParams0.component4-NH-jbRc());
        this.wrapped = this.wrapped;
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawArc-illE91I(Brush brush0, float f, float f1, boolean z, long v, long v1, float f2, DrawStyle drawStyle0, ColorFilter colorFilter0, int v2) {
        Intrinsics.checkNotNullParameter(brush0, "brush");
        Intrinsics.checkNotNullParameter(drawStyle0, "style");
        this.canvasDrawScope.drawArc-illE91I(brush0, f, f1, z, v, v1, f2, drawStyle0, colorFilter0, v2);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawArc-yD3GUKo(long v, float f, float f1, boolean z, long v1, long v2, float f2, DrawStyle drawStyle0, ColorFilter colorFilter0, int v3) {
        Intrinsics.checkNotNullParameter(drawStyle0, "style");
        this.canvasDrawScope.drawArc-yD3GUKo(v, f, f1, z, v1, v2, f2, drawStyle0, colorFilter0, v3);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawCircle-V9BoPsw(Brush brush0, float f, long v, float f1, DrawStyle drawStyle0, ColorFilter colorFilter0, int v1) {
        Intrinsics.checkNotNullParameter(brush0, "brush");
        Intrinsics.checkNotNullParameter(drawStyle0, "style");
        this.canvasDrawScope.drawCircle-V9BoPsw(brush0, f, v, f1, drawStyle0, colorFilter0, v1);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawCircle-VaOC9Bg(long v, float f, long v1, float f1, DrawStyle drawStyle0, ColorFilter colorFilter0, int v2) {
        Intrinsics.checkNotNullParameter(drawStyle0, "style");
        this.canvasDrawScope.drawCircle-VaOC9Bg(v, f, v1, f1, drawStyle0, colorFilter0, v2);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.ContentDrawScope
    public void drawContent() {
        Canvas canvas0 = this.getDrawContext().getCanvas();
        LayoutNodeWrapper layoutNodeWrapper0 = this.wrapped;
        if(layoutNodeWrapper0 != null) {
            layoutNodeWrapper0.draw(canvas0);
        }
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawImage-9jGpkUE(ImageBitmap imageBitmap0, long v, long v1, long v2, long v3, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v4) {
        Intrinsics.checkNotNullParameter(imageBitmap0, "image");
        Intrinsics.checkNotNullParameter(drawStyle0, "style");
        this.canvasDrawScope.drawImage-9jGpkUE(imageBitmap0, v, v1, v2, v3, f, drawStyle0, colorFilter0, v4);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawImage-gbVJVH8(ImageBitmap imageBitmap0, long v, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v1) {
        Intrinsics.checkNotNullParameter(imageBitmap0, "image");
        Intrinsics.checkNotNullParameter(drawStyle0, "style");
        this.canvasDrawScope.drawImage-gbVJVH8(imageBitmap0, v, f, drawStyle0, colorFilter0, v1);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawLine-1RTmtNc(Brush brush0, long v, long v1, float f, int v2, PathEffect pathEffect0, float f1, ColorFilter colorFilter0, int v3) {
        Intrinsics.checkNotNullParameter(brush0, "brush");
        this.canvasDrawScope.drawLine-1RTmtNc(brush0, v, v1, f, v2, pathEffect0, f1, colorFilter0, v3);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawLine-NGM6Ib0(long v, long v1, long v2, float f, int v3, PathEffect pathEffect0, float f1, ColorFilter colorFilter0, int v4) {
        this.canvasDrawScope.drawLine-NGM6Ib0(v, v1, v2, f, v3, pathEffect0, f1, colorFilter0, v4);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawOval-AsUm42w(Brush brush0, long v, long v1, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v2) {
        Intrinsics.checkNotNullParameter(brush0, "brush");
        Intrinsics.checkNotNullParameter(drawStyle0, "style");
        this.canvasDrawScope.drawOval-AsUm42w(brush0, v, v1, f, drawStyle0, colorFilter0, v2);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawOval-n-J9OG0(long v, long v1, long v2, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v3) {
        Intrinsics.checkNotNullParameter(drawStyle0, "style");
        this.canvasDrawScope.drawOval-n-J9OG0(v, v1, v2, f, drawStyle0, colorFilter0, v3);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawPath-GBMwjPU(Path path0, Brush brush0, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v) {
        Intrinsics.checkNotNullParameter(path0, "path");
        Intrinsics.checkNotNullParameter(brush0, "brush");
        Intrinsics.checkNotNullParameter(drawStyle0, "style");
        this.canvasDrawScope.drawPath-GBMwjPU(path0, brush0, f, drawStyle0, colorFilter0, v);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawPath-LG529CI(Path path0, long v, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v1) {
        Intrinsics.checkNotNullParameter(path0, "path");
        Intrinsics.checkNotNullParameter(drawStyle0, "style");
        this.canvasDrawScope.drawPath-LG529CI(path0, v, f, drawStyle0, colorFilter0, v1);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawPoints-F8ZwMP8(List list0, int v, long v1, float f, int v2, PathEffect pathEffect0, float f1, ColorFilter colorFilter0, int v3) {
        Intrinsics.checkNotNullParameter(list0, "points");
        this.canvasDrawScope.drawPoints-F8ZwMP8(list0, v, v1, f, v2, pathEffect0, f1, colorFilter0, v3);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawPoints-Gsft0Ws(List list0, int v, Brush brush0, float f, int v1, PathEffect pathEffect0, float f1, ColorFilter colorFilter0, int v2) {
        Intrinsics.checkNotNullParameter(list0, "points");
        Intrinsics.checkNotNullParameter(brush0, "brush");
        this.canvasDrawScope.drawPoints-Gsft0Ws(list0, v, brush0, f, v1, pathEffect0, f1, colorFilter0, v2);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawRect-AsUm42w(Brush brush0, long v, long v1, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v2) {
        Intrinsics.checkNotNullParameter(brush0, "brush");
        Intrinsics.checkNotNullParameter(drawStyle0, "style");
        this.canvasDrawScope.drawRect-AsUm42w(brush0, v, v1, f, drawStyle0, colorFilter0, v2);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawRect-n-J9OG0(long v, long v1, long v2, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v3) {
        Intrinsics.checkNotNullParameter(drawStyle0, "style");
        this.canvasDrawScope.drawRect-n-J9OG0(v, v1, v2, f, drawStyle0, colorFilter0, v3);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawRoundRect-ZuiqVtQ(Brush brush0, long v, long v1, long v2, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v3) {
        Intrinsics.checkNotNullParameter(brush0, "brush");
        Intrinsics.checkNotNullParameter(drawStyle0, "style");
        this.canvasDrawScope.drawRoundRect-ZuiqVtQ(brush0, v, v1, v2, f, drawStyle0, colorFilter0, v3);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public void drawRoundRect-u-Aw5IA(long v, long v1, long v2, long v3, DrawStyle drawStyle0, float f, ColorFilter colorFilter0, int v4) {
        Intrinsics.checkNotNullParameter(drawStyle0, "style");
        this.canvasDrawScope.drawRoundRect-u-Aw5IA(v, v1, v2, v3, drawStyle0, f, colorFilter0, v4);
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public long getCenter-F1C5BW0() {
        return this.canvasDrawScope.getCenter-F1C5BW0();
    }

    @Override  // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.canvasDrawScope.getDensity();
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public DrawContext getDrawContext() {
        return this.canvasDrawScope.getDrawContext();
    }

    @Override  // androidx.compose.ui.unit.Density
    public float getFontScale() {
        return this.canvasDrawScope.getFontScale();
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public LayoutDirection getLayoutDirection() {
        return this.canvasDrawScope.getLayoutDirection();
    }

    @Override  // androidx.compose.ui.graphics.drawscope.DrawScope
    public long getSize-NH-jbRc() {
        return this.canvasDrawScope.getSize-NH-jbRc();
    }

    @Override  // androidx.compose.ui.unit.Density
    public int roundToPx--R2X_6o(long v) {
        return this.canvasDrawScope.roundToPx--R2X_6o(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public int roundToPx-0680j_4(float f) {
        return this.canvasDrawScope.roundToPx-0680j_4(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float toDp-GaN1DYA(long v) {
        return this.canvasDrawScope.toDp-GaN1DYA(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float toDp-u2uoSUM(float f) {
        return this.canvasDrawScope.toDp-u2uoSUM(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float toDp-u2uoSUM(int v) {
        return this.canvasDrawScope.toDp-u2uoSUM(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float toPx--R2X_6o(long v) {
        return this.canvasDrawScope.toPx--R2X_6o(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float toPx-0680j_4(float f) {
        return this.canvasDrawScope.toPx-0680j_4(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public Rect toRect(DpRect dpRect0) {
        Intrinsics.checkNotNullParameter(dpRect0, "<this>");
        return this.canvasDrawScope.toRect(dpRect0);
    }

    @Override  // androidx.compose.ui.unit.Density
    public long toSp-0xMU5do(float f) {
        return this.canvasDrawScope.toSp-0xMU5do(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public long toSp-kPz2Gy4(float f) {
        return this.canvasDrawScope.toSp-kPz2Gy4(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public long toSp-kPz2Gy4(int v) {
        return this.canvasDrawScope.toSp-kPz2Gy4(v);
    }
}

