package androidx.compose.ui.node;

import androidx.compose.ui.focus.FocusOrder;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.MutableRectKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollDelegatingWrapper;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0082\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b \u0018\u0000 \u00C6\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005:\u0002\u00C6\u0001B\r\u0012\u0006\u0010\b\u001A\u00020\t\u00A2\u0006\u0002\u0010\nJ \u0010a\u001A\u00020\u00072\u0006\u0010b\u001A\u00020\u00002\u0006\u0010c\u001A\u00020\u00102\u0006\u0010d\u001A\u00020\fH\u0002J%\u0010a\u001A\u00020e2\u0006\u0010b\u001A\u00020\u00002\u0006\u0010f\u001A\u00020eH\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bg\u0010hJ\b\u0010i\u001A\u00020\u0007H\u0016J\u0010\u0010j\u001A\u00020;2\u0006\u0010k\u001A\u00020:H&J\b\u0010l\u001A\u00020\u0007H\u0016J\u000E\u0010m\u001A\u00020\u00072\u0006\u0010n\u001A\u00020\u0006J\u0018\u0010o\u001A\u00020\u00072\u0006\u0010n\u001A\u00020\u00062\u0006\u0010p\u001A\u00020qH\u0004J\u0015\u0010r\u001A\u00020\u00002\u0006\u0010s\u001A\u00020\u0000H\u0000\u00A2\u0006\u0002\btJ\n\u0010u\u001A\u0004\u0018\u00010vH&J\n\u0010w\u001A\u0004\u0018\u00010xH&J\n\u0010y\u001A\u0004\u0018\u00010vH&J\n\u0010z\u001A\u0004\u0018\u00010xH&J\n\u0010{\u001A\u0004\u0018\u00010|H&J\u000F\u0010}\u001A\u0004\u0018\u00010vH\u0000\u00A2\u0006\u0002\b~J\u0010\u0010\u007F\u001A\u0004\u0018\u00010xH\u0000\u00A2\u0006\u0003\b\u0080\u0001J\u000B\u0010\u0081\u0001\u001A\u0004\u0018\u00010vH&J\u000B\u0010\u0082\u0001\u001A\u0004\u0018\u00010xH&J\u000B\u0010\u0083\u0001\u001A\u0004\u0018\u00010|H&J \u0010\u0084\u0001\u001A\u00020e2\u0006\u0010B\u001A\u00020eH\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u001A\u0010\u0087\u0001\u001A\u00020\u00072\u0007\u0010\u0088\u0001\u001A\u00020\u00102\u0006\u0010d\u001A\u00020\fH\u0002J\u0012\u0010\u0089\u0001\u001A\u00020;2\u0006\u0010k\u001A\u00020:H\u0086\u0002J\u000B\u0010\u008A\u0001\u001A\u0004\u0018\u00010\u0003H\u0014J2\u0010\u008B\u0001\u001A\u00020\u00072\u0007\u0010\u008C\u0001\u001A\u00020e2\u000F\u0010\u008D\u0001\u001A\n\u0012\u0005\u0012\u00030\u008F\u00010\u008E\u0001H&\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J2\u0010\u0092\u0001\u001A\u00020\u00072\u0007\u0010\u008C\u0001\u001A\u00020e2\u000F\u0010\u0093\u0001\u001A\n\u0012\u0005\u0012\u00030\u0094\u00010\u008E\u0001H&\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\b\u0095\u0001\u0010\u0091\u0001J\t\u0010\u0096\u0001\u001A\u00020\u0007H\u0016J\u0012\u0010\u0097\u0001\u001A\u00020\u00072\u0006\u0010n\u001A\u00020\u0006H\u0096\u0002J!\u0010\u0098\u0001\u001A\u00020\f2\u0007\u0010\u008C\u0001\u001A\u00020eH\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\b\u0099\u0001\u0010\u009A\u0001J\u001B\u0010\u009B\u0001\u001A\u00030\u009C\u00012\u0007\u0010\u009D\u0001\u001A\u00020\u00032\u0006\u0010d\u001A\u00020\fH\u0016J*\u0010\u009E\u0001\u001A\u00020e2\u0007\u0010\u009D\u0001\u001A\u00020\u00032\u0007\u0010\u009F\u0001\u001A\u00020eH\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\b\u00A0\u0001\u0010\u00A1\u0001J!\u0010\u00A2\u0001\u001A\u00020e2\u0007\u0010\u00A3\u0001\u001A\u00020eH\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\b\u00A4\u0001\u0010\u0086\u0001J!\u0010\u00A5\u0001\u001A\u00020e2\u0007\u0010\u00A3\u0001\u001A\u00020eH\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\b\u00A6\u0001\u0010\u0086\u0001J\"\u0010\u00A7\u0001\u001A\u00020\u00072\u0019\u0010%\u001A\u0015\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u00A2\u0006\u0002\b$J\u001B\u0010\u00A8\u0001\u001A\u00020\u00072\u0007\u0010\u00A9\u0001\u001A\u00020;2\u0007\u0010\u00AA\u0001\u001A\u00020;H\u0014J\t\u0010\u00AB\u0001\u001A\u00020\u0007H\u0016J\u0011\u0010\u00AC\u0001\u001A\u00020\u00072\u0006\u0010n\u001A\u00020\u0006H$J5\u0010\u00AD\u0001\u001A\u00020\u00012\b\u0010\u00AE\u0001\u001A\u00030\u00AF\u00012\r\u0010\u00B0\u0001\u001A\b\u0012\u0004\u0012\u00020\u00010\u0015H\u0084\b\u00F8\u0001\u0000\u00F8\u0001\u0003\u00F8\u0001\u0001\u00A2\u0006\u0006\b\u00B1\u0001\u0010\u00B2\u0001JC\u0010\u00B3\u0001\u001A\u00020\u00072\u0006\u0010B\u001A\u00020A2\u0006\u0010\\\u001A\u00020[2\u0019\u0010%\u001A\u0015\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u00A2\u0006\u0002\b$H\u0014\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\b\u00B4\u0001\u0010\u00B5\u0001J\u0013\u0010\u00B6\u0001\u001A\u00020\u00072\b\u0010\u00B7\u0001\u001A\u00030\u00B8\u0001H\u0016J\u0013\u0010\u00B9\u0001\u001A\u00020\u00072\b\u0010\u00BA\u0001\u001A\u00030\u00BB\u0001H\u0016J\u001A\u0010\u00BC\u0001\u001A\u00020\u00072\u0007\u0010\u0088\u0001\u001A\u00020\u00102\u0006\u0010d\u001A\u00020\fH\u0002J \u0010\u00BD\u0001\u001A\u00020e2\u0006\u0010B\u001A\u00020eH\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\b\u00BE\u0001\u0010\u0086\u0001J\t\u0010\u00BF\u0001\u001A\u00020\u0007H\u0002J!\u0010\u00C0\u0001\u001A\u00020e2\u0007\u0010\u00C1\u0001\u001A\u00020eH\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\b\u00C2\u0001\u0010\u0086\u0001J*\u0010\u00C3\u0001\u001A\u00020\u00072\u0006\u0010n\u001A\u00020\u00062\u0013\u0010\u00B0\u0001\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0084\b\u00F8\u0001\u0003J!\u0010\u00C4\u0001\u001A\u00020\f2\u0007\u0010\u008C\u0001\u001A\u00020eH\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\b\u00C5\u0001\u0010\u009A\u0001R\u000E\u0010\u000B\u001A\u00020\fX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0010\u0010\r\u001A\u0004\u0018\u00010\u000EX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0010\u0010\u000F\u001A\u0004\u0018\u00010\u0010X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001A\u00020\f8BX\u0082\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001A\b\u0012\u0004\u0012\u00020\u00070\u0015X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0011\u0010\u0016\u001A\u00020\f8F\u00A2\u0006\u0006\u001A\u0004\b\u0016\u0010\u0013R\u000E\u0010\u0017\u001A\u00020\fX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u001A\u0010\u0018\u001A\u00020\fX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u001AR\u0014\u0010\u001B\u001A\u00020\f8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\u001B\u0010\u0013R\u001E\u0010\u001D\u001A\u00020\f2\u0006\u0010\u001C\u001A\u00020\f@BX\u0080\u000E\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001E\u0010\u0013R\"\u0010 \u001A\u0004\u0018\u00010\u001F2\b\u0010\u001C\u001A\u0004\u0018\u00010\u001F@BX\u0086\u000E\u00A2\u0006\b\n\u0000\u001A\u0004\b!\u0010\"RD\u0010%\u001A\u0015\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u00A2\u0006\u0002\b$2\u0019\u0010\u001C\u001A\u0015\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u00A2\u0006\u0002\b$@BX\u0084\u000E\u00A2\u0006\b\n\u0000\u001A\u0004\b&\u0010\'R\u000E\u0010(\u001A\u00020)X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010*\u001A\u00020+X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0014\u0010\b\u001A\u00020\tX\u0080\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b,\u0010-R$\u0010/\u001A\u00020\u000E2\u0006\u0010.\u001A\u00020\u000E8F@@X\u0086\u000E\u00A2\u0006\f\u001A\u0004\b0\u00101\"\u0004\b2\u00103R\u0012\u00104\u001A\u000205X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b6\u00107R\u001C\u00108\u001A\u0010\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020;\u0018\u000109X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0013\u0010<\u001A\u0004\u0018\u00010\u00038F\u00A2\u0006\u0006\u001A\u0004\b=\u0010>R\u0013\u0010?\u001A\u0004\u0018\u00010\u00038F\u00A2\u0006\u0006\u001A\u0004\b@\u0010>R)\u0010B\u001A\u00020A2\u0006\u0010\u001C\u001A\u00020A@BX\u0086\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010E\u001A\u0004\bC\u0010DR\u001A\u0010F\u001A\b\u0012\u0004\u0012\u00020:0G8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bH\u0010IR\u0014\u0010J\u001A\u00020\u00108BX\u0082\u0004\u00A2\u0006\u0006\u001A\u0004\bK\u0010LR\u001A\u0010M\u001A\u00020N8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0006\u001A\u0004\bO\u0010DR\u0014\u0010P\u001A\u00020Q8BX\u0082\u0004\u00A2\u0006\u0006\u001A\u0004\bR\u0010SR\u0016\u0010T\u001A\u0004\u0018\u00010\u00008PX\u0090\u0004\u00A2\u0006\u0006\u001A\u0004\bU\u0010VR\u001C\u0010W\u001A\u0004\u0018\u00010\u0000X\u0080\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\bX\u0010V\"\u0004\bY\u0010ZR$\u0010\\\u001A\u00020[2\u0006\u0010\u001C\u001A\u00020[@DX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b]\u0010^\"\u0004\b_\u0010`\u0082\u0002\u0016\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\n\u0005\b\u009920\u0001\u00A8\u0006\u00C7\u0001"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeWrapper;", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/node/OwnerScope;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "(Landroidx/compose/ui/node/LayoutNode;)V", "_isAttached", "", "_measureResult", "Landroidx/compose/ui/layout/MeasureResult;", "_rectCache", "Landroidx/compose/ui/geometry/MutableRect;", "hasMeasureResult", "getHasMeasureResult", "()Z", "invalidateParentLayer", "Lkotlin/Function0;", "isAttached", "isClipping", "isShallowPlacing", "setShallowPlacing", "(Z)V", "isValid", "<set-?>", "lastLayerDrawingWasSkipped", "getLastLayerDrawingWasSkipped$ui_release", "Landroidx/compose/ui/node/OwnedLayer;", "layer", "getLayer", "()Landroidx/compose/ui/node/OwnedLayer;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "getLayerBlock", "()Lkotlin/jvm/functions/Function1;", "layerDensity", "Landroidx/compose/ui/unit/Density;", "layerLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutNode$ui_release", "()Landroidx/compose/ui/node/LayoutNode;", "value", "measureResult", "getMeasureResult", "()Landroidx/compose/ui/layout/MeasureResult;", "setMeasureResult$ui_release", "(Landroidx/compose/ui/layout/MeasureResult;)V", "measureScope", "Landroidx/compose/ui/layout/MeasureScope;", "getMeasureScope", "()Landroidx/compose/ui/layout/MeasureScope;", "oldAlignmentLines", "", "Landroidx/compose/ui/layout/AlignmentLine;", "", "parentCoordinates", "getParentCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "parentLayoutCoordinates", "getParentLayoutCoordinates", "Landroidx/compose/ui/unit/IntOffset;", "position", "getPosition-nOcc-ac", "()J", "J", "providedAlignmentLines", "", "getProvidedAlignmentLines", "()Ljava/util/Set;", "rectCache", "getRectCache", "()Landroidx/compose/ui/geometry/MutableRect;", "size", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "snapshotObserver", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "wrapped", "getWrapped$ui_release", "()Landroidx/compose/ui/node/LayoutNodeWrapper;", "wrappedBy", "getWrappedBy$ui_release", "setWrappedBy$ui_release", "(Landroidx/compose/ui/node/LayoutNodeWrapper;)V", "", "zIndex", "getZIndex", "()F", "setZIndex", "(F)V", "ancestorToLocal", "ancestor", "rect", "clipBounds", "Landroidx/compose/ui/geometry/Offset;", "offset", "ancestorToLocal-R5De75A", "(Landroidx/compose/ui/node/LayoutNodeWrapper;J)J", "attach", "calculateAlignmentLine", "alignmentLine", "detach", "draw", "canvas", "drawBorder", "paint", "Landroidx/compose/ui/graphics/Paint;", "findCommonAncestor", "other", "findCommonAncestor$ui_release", "findLastFocusWrapper", "Landroidx/compose/ui/node/ModifiedFocusNode;", "findLastKeyInputWrapper", "Landroidx/compose/ui/node/ModifiedKeyInputNode;", "findNextFocusWrapper", "findNextKeyInputWrapper", "findNextNestedScrollWrapper", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;", "findParentFocusNode", "findParentFocusNode$ui_release", "findParentKeyInputNode", "findParentKeyInputNode$ui_release", "findPreviousFocusWrapper", "findPreviousKeyInputWrapper", "findPreviousNestedScrollWrapper", "fromParentPosition", "fromParentPosition-MK-Hz9U", "(J)J", "fromParentRect", "bounds", "get", "getWrappedByCoordinates", "hitTest", "pointerPosition", "hitPointerInputFilters", "", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "hitTest-3MmeM6k", "(JLjava/util/List;)V", "hitTestSemantics", "hitSemanticsWrappers", "Landroidx/compose/ui/semantics/SemanticsWrapper;", "hitTestSemantics-3MmeM6k", "invalidateLayer", "invoke", "isPointerInBounds", "isPointerInBounds-k-4lQ0M", "(J)Z", "localBoundingBoxOf", "Landroidx/compose/ui/geometry/Rect;", "sourceCoordinates", "localPositionOf", "relativeToSource", "localPositionOf-R5De75A", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)J", "localToRoot", "relativeToLocal", "localToRoot-MK-Hz9U", "localToWindow", "localToWindow-MK-Hz9U", "onLayerBlockUpdated", "onMeasureResultChanged", "width", "height", "onModifierChanged", "performDraw", "performingMeasure", "constraints", "Landroidx/compose/ui/unit/Constraints;", "block", "performingMeasure-K40F9xA", "(JLkotlin/jvm/functions/Function0;)Landroidx/compose/ui/layout/Placeable;", "placeAt", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "populateFocusOrder", "focusOrder", "Landroidx/compose/ui/focus/FocusOrder;", "propagateFocusEvent", "focusState", "Landroidx/compose/ui/focus/FocusState;", "rectInParent", "toParentPosition", "toParentPosition-MK-Hz9U", "updateLayerParameters", "windowToLocal", "relativeToWindow", "windowToLocal-MK-Hz9U", "withPositionTranslation", "withinLayerBounds", "withinLayerBounds-k-4lQ0M", "Companion", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public abstract class LayoutNodeWrapper extends Placeable implements LayoutCoordinates, Measurable, OwnerScope, Function1 {
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000E\u0010\u0003\u001A\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000E\u0010\u0005\u001A\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000E\u0010\u0006\u001A\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001A\u0010\b\u001A\u000E\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000B0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001A\u0010\f\u001A\u000E\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000B0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeWrapper$Companion;", "", "()V", "ExpectAttachedLayoutCoordinates", "", "UnmeasuredError", "graphicsLayerScope", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "onCommitAffectingLayer", "Lkotlin/Function1;", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "", "onCommitAffectingLayerParams", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final Companion Companion = null;
    public static final String ExpectAttachedLayoutCoordinates = "LayoutCoordinate operations are only valid when isAttached is true";
    public static final String UnmeasuredError = "Asking for measurement result of unmeasured layout modifier";
    private boolean _isAttached;
    private MeasureResult _measureResult;
    private MutableRect _rectCache;
    private static final ReusableGraphicsLayerScope graphicsLayerScope;
    private final Function0 invalidateParentLayer;
    private boolean isClipping;
    private boolean isShallowPlacing;
    private boolean lastLayerDrawingWasSkipped;
    private OwnedLayer layer;
    private Function1 layerBlock;
    private Density layerDensity;
    private LayoutDirection layerLayoutDirection;
    private final LayoutNode layoutNode;
    private Map oldAlignmentLines;
    private static final Function1 onCommitAffectingLayer;
    private static final Function1 onCommitAffectingLayerParams;
    private long position;
    private LayoutNodeWrapper wrappedBy;
    private float zIndex;

    static {
        LayoutNodeWrapper.Companion = new Companion(null);
        LayoutNodeWrapper.onCommitAffectingLayerParams = LayoutNodeWrapper.Companion.onCommitAffectingLayerParams.1.INSTANCE;
        LayoutNodeWrapper.onCommitAffectingLayer = LayoutNodeWrapper.Companion.onCommitAffectingLayer.1.INSTANCE;
        LayoutNodeWrapper.graphicsLayerScope = new ReusableGraphicsLayerScope();
    }

    public LayoutNodeWrapper(LayoutNode layoutNode0) {
        Intrinsics.checkNotNullParameter(layoutNode0, "layoutNode");
        super();
        this.layoutNode = layoutNode0;
        this.layerDensity = layoutNode0.getDensity();
        this.layerLayoutDirection = layoutNode0.getLayoutDirection();
        this.position = 0L;
        this.invalidateParentLayer = new Function0() {
            {
                LayoutNodeWrapper.this = layoutNodeWrapper0;
                super(0);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                this.invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                LayoutNodeWrapper layoutNodeWrapper0 = LayoutNodeWrapper.this.getWrappedBy$ui_release();
                if(layoutNodeWrapper0 != null) {
                    layoutNodeWrapper0.invalidateLayer();
                }
            }
        };
    }

    private final void ancestorToLocal(LayoutNodeWrapper layoutNodeWrapper0, MutableRect mutableRect0, boolean z) {
        if(layoutNodeWrapper0 == this) {
            return;
        }
        LayoutNodeWrapper layoutNodeWrapper1 = this.wrappedBy;
        if(layoutNodeWrapper1 != null) {
            layoutNodeWrapper1.ancestorToLocal(layoutNodeWrapper0, mutableRect0, z);
        }
        this.fromParentRect(mutableRect0, z);
    }

    private final long ancestorToLocal-R5De75A(LayoutNodeWrapper layoutNodeWrapper0, long v) {
        if(layoutNodeWrapper0 == this) {
            return v;
        }
        LayoutNodeWrapper layoutNodeWrapper1 = this.wrappedBy;
        return layoutNodeWrapper1 == null || Intrinsics.areEqual(layoutNodeWrapper0, layoutNodeWrapper1) ? this.fromParentPosition-MK-Hz9U(v) : this.fromParentPosition-MK-Hz9U(layoutNodeWrapper1.ancestorToLocal-R5De75A(layoutNodeWrapper0, v));
    }

    public void attach() {
        this._isAttached = true;
        this.onLayerBlockUpdated(this.layerBlock);
    }

    public abstract int calculateAlignmentLine(AlignmentLine arg1);

    public void detach() {
        this._isAttached = false;
        this.onLayerBlockUpdated(this.layerBlock);
        LayoutNode layoutNode0 = this.layoutNode.getParent$ui_release();
        if(layoutNode0 != null) {
            layoutNode0.invalidateLayer$ui_release();
        }
    }

    public final void draw(Canvas canvas0) {
        Intrinsics.checkNotNullParameter(canvas0, "canvas");
        OwnedLayer ownedLayer0 = this.layer;
        if(ownedLayer0 != null) {
            ownedLayer0.drawLayer(canvas0);
            return;
        }
        float f = (float)(((int)(this.getPosition-nOcc-ac() >> 0x20)));
        float f1 = (float)(((int)(this.getPosition-nOcc-ac() & 0xFFFFFFFFL)));
        canvas0.translate(f, f1);
        this.performDraw(canvas0);
        canvas0.translate(-f, -f1);
    }

    protected final void drawBorder(Canvas canvas0, Paint paint0) {
        Intrinsics.checkNotNullParameter(canvas0, "canvas");
        Intrinsics.checkNotNullParameter(paint0, "paint");
        canvas0.drawRect(new Rect(0.5f, 0.5f, ((float)IntSize.getWidth-impl(this.getMeasuredSize-YbymL2g())) - 0.5f, ((float)IntSize.getHeight-impl(this.getMeasuredSize-YbymL2g())) - 0.5f), paint0);
    }

    public final LayoutNodeWrapper findCommonAncestor$ui_release(LayoutNodeWrapper layoutNodeWrapper0) {
        Intrinsics.checkNotNullParameter(layoutNodeWrapper0, "other");
        LayoutNode layoutNode0 = layoutNodeWrapper0.layoutNode;
        LayoutNode layoutNode1 = this.layoutNode;
        if(layoutNode0 == layoutNode1) {
            LayoutNodeWrapper layoutNodeWrapper1 = layoutNode1.getOuterLayoutNodeWrapper$ui_release();
            LayoutNodeWrapper layoutNodeWrapper2 = this;
            while(layoutNodeWrapper2 != layoutNodeWrapper1 && layoutNodeWrapper2 != layoutNodeWrapper0) {
                layoutNodeWrapper2 = layoutNodeWrapper2.wrappedBy;
                Intrinsics.checkNotNull(layoutNodeWrapper2);
            }
            return layoutNodeWrapper2 == layoutNodeWrapper0 ? layoutNodeWrapper0 : this;
        }
        while(layoutNode0.getDepth$ui_release() > layoutNode1.getDepth$ui_release()) {
            layoutNode0 = layoutNode0.getParent$ui_release();
            Intrinsics.checkNotNull(layoutNode0);
        }
        while(layoutNode1.getDepth$ui_release() > layoutNode0.getDepth$ui_release()) {
            layoutNode1 = layoutNode1.getParent$ui_release();
            Intrinsics.checkNotNull(layoutNode1);
        }
        while(layoutNode0 != layoutNode1) {
            layoutNode0 = layoutNode0.getParent$ui_release();
            layoutNode1 = layoutNode1.getParent$ui_release();
            if(layoutNode0 == null || layoutNode1 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
            if(false) {
                break;
            }
        }
        if(layoutNode1 == this.layoutNode) {
            return this;
        }
        return layoutNode0 == layoutNodeWrapper0.layoutNode ? layoutNodeWrapper0 : layoutNode0.getInnerLayoutNodeWrapper$ui_release();
    }

    public abstract ModifiedFocusNode findLastFocusWrapper();

    public abstract ModifiedKeyInputNode findLastKeyInputWrapper();

    public abstract ModifiedFocusNode findNextFocusWrapper();

    public abstract ModifiedKeyInputNode findNextKeyInputWrapper();

    public abstract NestedScrollDelegatingWrapper findNextNestedScrollWrapper();

    public final ModifiedFocusNode findParentFocusNode$ui_release() {
        ModifiedFocusNode modifiedFocusNode0 = this.wrappedBy == null ? null : this.wrappedBy.findPreviousFocusWrapper();
        if(modifiedFocusNode0 != null) {
            return modifiedFocusNode0;
        }
        for(LayoutNode layoutNode0 = this.layoutNode.getParent$ui_release(); layoutNode0 != null; layoutNode0 = layoutNode0.getParent$ui_release()) {
            ModifiedFocusNode modifiedFocusNode1 = layoutNode0.getOuterLayoutNodeWrapper$ui_release().findLastFocusWrapper();
            if(modifiedFocusNode1 != null) {
                return modifiedFocusNode1;
            }
        }
        return null;
    }

    public final ModifiedKeyInputNode findParentKeyInputNode$ui_release() {
        ModifiedKeyInputNode modifiedKeyInputNode0 = this.wrappedBy == null ? null : this.wrappedBy.findPreviousKeyInputWrapper();
        if(modifiedKeyInputNode0 != null) {
            return modifiedKeyInputNode0;
        }
        for(LayoutNode layoutNode0 = this.layoutNode.getParent$ui_release(); layoutNode0 != null; layoutNode0 = layoutNode0.getParent$ui_release()) {
            ModifiedKeyInputNode modifiedKeyInputNode1 = layoutNode0.getOuterLayoutNodeWrapper$ui_release().findLastKeyInputWrapper();
            if(modifiedKeyInputNode1 != null) {
                return modifiedKeyInputNode1;
            }
        }
        return null;
    }

    public abstract ModifiedFocusNode findPreviousFocusWrapper();

    public abstract ModifiedKeyInputNode findPreviousKeyInputWrapper();

    public abstract NestedScrollDelegatingWrapper findPreviousNestedScrollWrapper();

    public long fromParentPosition-MK-Hz9U(long v) {
        long v1 = IntOffsetKt.minus-Nv-tHpc(v, this.getPosition-nOcc-ac());
        return this.layer == null ? v1 : this.layer.mapOffset-8S9VItk(v1, true);
    }

    private final void fromParentRect(MutableRect mutableRect0, boolean z) {
        float f = (float)(((int)(this.getPosition-nOcc-ac() >> 0x20)));
        mutableRect0.setLeft(mutableRect0.getLeft() - f);
        mutableRect0.setRight(mutableRect0.getRight() - f);
        float f1 = (float)(((int)(this.getPosition-nOcc-ac() & 0xFFFFFFFFL)));
        mutableRect0.setTop(mutableRect0.getTop() - f1);
        mutableRect0.setBottom(mutableRect0.getBottom() - f1);
        OwnedLayer ownedLayer0 = this.layer;
        if(ownedLayer0 != null) {
            ownedLayer0.mapBounds(mutableRect0, true);
            if(this.isClipping && z) {
                mutableRect0.intersect(0.0f, 0.0f, ((float)IntSize.getWidth-impl(this.getSize-YbymL2g())), ((float)IntSize.getHeight-impl(this.getSize-YbymL2g())));
            }
        }
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates, androidx.compose.ui.layout.Measured
    public final int get(AlignmentLine alignmentLine0) {
        Intrinsics.checkNotNullParameter(alignmentLine0, "alignmentLine");
        if(!this.getHasMeasureResult()) {
            return 0x80000000;
        }
        int v = this.calculateAlignmentLine(alignmentLine0);
        if(v == 0x80000000) {
            return 0x80000000;
        }
        return alignmentLine0 instanceof VerticalAlignmentLine ? v + IntOffset.getX-impl(this.getApparentToRealOffset-nOcc-ac()) : v + IntOffset.getY-impl(this.getApparentToRealOffset-nOcc-ac());
    }

    private final boolean getHasMeasureResult() {
        return this._measureResult != null;
    }

    public final boolean getLastLayerDrawingWasSkipped$ui_release() {
        return this.lastLayerDrawingWasSkipped;
    }

    public final OwnedLayer getLayer() {
        return this.layer;
    }

    protected final Function1 getLayerBlock() {
        return this.layerBlock;
    }

    public final LayoutNode getLayoutNode$ui_release() {
        return this.layoutNode;
    }

    public final MeasureResult getMeasureResult() {
        MeasureResult measureResult0 = this._measureResult;
        if(measureResult0 == null) {
            throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
        }
        return measureResult0;
    }

    public abstract MeasureScope getMeasureScope();

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public final LayoutCoordinates getParentCoordinates() {
        if(!this.isAttached()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return this.wrappedBy == null ? null : this.wrappedBy.getWrappedByCoordinates();
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public final LayoutCoordinates getParentLayoutCoordinates() {
        if(!this.isAttached()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return this.layoutNode.getOuterLayoutNodeWrapper$ui_release().wrappedBy;
    }

    public final long getPosition-nOcc-ac() {
        return this.position;
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public Set getProvidedAlignmentLines() {
        MeasureResult measureResult0 = this._measureResult;
        Set set0 = null;
        if(measureResult0 != null) {
            Map map0 = measureResult0.getAlignmentLines();
            if(map0 != null) {
                set0 = map0.keySet();
            }
        }
        return set0 == null ? SetsKt.emptySet() : set0;
    }

    private final MutableRect getRectCache() {
        MutableRect mutableRect0 = this._rectCache;
        if(mutableRect0 == null) {
            mutableRect0 = new MutableRect(0.0f, 0.0f, 0.0f, 0.0f);
            this._rectCache = mutableRect0;
        }
        return mutableRect0;
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public final long getSize-YbymL2g() {
        return this.getMeasuredSize-YbymL2g();
    }

    private final OwnerSnapshotObserver getSnapshotObserver() {
        return LayoutNodeKt.requireOwner(this.layoutNode).getSnapshotObserver();
    }

    public LayoutNodeWrapper getWrapped$ui_release() {
        return null;
    }

    public final LayoutNodeWrapper getWrappedBy$ui_release() {
        return this.wrappedBy;
    }

    protected LayoutCoordinates getWrappedByCoordinates() {
        return this.wrappedBy == null ? null : this.wrappedBy.getWrappedByCoordinates();
    }

    public final float getZIndex() {
        return this.zIndex;
    }

    public abstract void hitTest-3MmeM6k(long arg1, List arg2);

    public abstract void hitTestSemantics-3MmeM6k(long arg1, List arg2);

    public void invalidateLayer() {
        OwnedLayer ownedLayer0 = this.layer;
        if(ownedLayer0 != null) {
            ownedLayer0.invalidate();
            return;
        }
        LayoutNodeWrapper layoutNodeWrapper0 = this.wrappedBy;
        if(layoutNodeWrapper0 != null) {
            layoutNodeWrapper0.invalidateLayer();
        }
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        this.invoke(((Canvas)object0));
        return Unit.INSTANCE;
    }

    public void invoke(Canvas canvas0) {
        Intrinsics.checkNotNullParameter(canvas0, "canvas");
        if(this.layoutNode.isPlaced()) {
            OwnerSnapshotObserver ownerSnapshotObserver0 = this.getSnapshotObserver();
            Function0 function00 = new Function0(canvas0) {
                final Canvas $canvas;

                {
                    LayoutNodeWrapper.this = layoutNodeWrapper0;
                    this.$canvas = canvas0;
                    super(0);
                }

                @Override  // kotlin.jvm.functions.Function0
                public Object invoke() {
                    this.invoke();
                    return Unit.INSTANCE;
                }

                public final void invoke() {
                    LayoutNodeWrapper.this.performDraw(this.$canvas);
                }
            };
            ownerSnapshotObserver0.observeReads$ui_release(this, LayoutNodeWrapper.onCommitAffectingLayer, function00);
            this.lastLayerDrawingWasSkipped = false;
            return;
        }
        this.lastLayerDrawingWasSkipped = true;
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public final boolean isAttached() {
        if(this._isAttached && !this.layoutNode.isAttached()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return this._isAttached;
    }

    protected final boolean isPointerInBounds-k-4lQ0M(long v) {
        float f = Offset.getX-impl(v);
        float f1 = Offset.getY-impl(v);
        return f >= 0.0f && f1 >= 0.0f && f < ((float)this.getMeasuredWidth()) && f1 < ((float)this.getMeasuredHeight());
    }

    public final boolean isShallowPlacing() {
        return this.isShallowPlacing;
    }

    @Override  // androidx.compose.ui.node.OwnerScope
    public boolean isValid() {
        return this.layer != null;
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public Rect localBoundingBoxOf(LayoutCoordinates layoutCoordinates0, boolean z) {
        Intrinsics.checkNotNullParameter(layoutCoordinates0, "sourceCoordinates");
        if(!this.isAttached()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if(!layoutCoordinates0.isAttached()) {
            throw new IllegalStateException(("LayoutCoordinates " + layoutCoordinates0 + " is not attached!").toString());
        }
        LayoutNodeWrapper layoutNodeWrapper0 = (LayoutNodeWrapper)layoutCoordinates0;
        LayoutNodeWrapper layoutNodeWrapper1 = this.findCommonAncestor$ui_release(layoutNodeWrapper0);
        MutableRect mutableRect0 = this.getRectCache();
        mutableRect0.setLeft(0.0f);
        mutableRect0.setTop(0.0f);
        mutableRect0.setRight(((float)IntSize.getWidth-impl(layoutCoordinates0.getSize-YbymL2g())));
        mutableRect0.setBottom(((float)IntSize.getHeight-impl(layoutCoordinates0.getSize-YbymL2g())));
        while(layoutNodeWrapper0 != layoutNodeWrapper1) {
            layoutNodeWrapper0.rectInParent(mutableRect0, z);
            if(mutableRect0.isEmpty()) {
                return Rect.Companion.getZero();
            }
            layoutNodeWrapper0 = layoutNodeWrapper0.wrappedBy;
            Intrinsics.checkNotNull(layoutNodeWrapper0);
        }
        this.ancestorToLocal(layoutNodeWrapper1, mutableRect0, z);
        return MutableRectKt.toRect(mutableRect0);
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public long localPositionOf-R5De75A(LayoutCoordinates layoutCoordinates0, long v) {
        Intrinsics.checkNotNullParameter(layoutCoordinates0, "sourceCoordinates");
        LayoutNodeWrapper layoutNodeWrapper0 = (LayoutNodeWrapper)layoutCoordinates0;
        LayoutNodeWrapper layoutNodeWrapper1 = this.findCommonAncestor$ui_release(layoutNodeWrapper0);
        while(layoutNodeWrapper0 != layoutNodeWrapper1) {
            v = layoutNodeWrapper0.toParentPosition-MK-Hz9U(v);
            layoutNodeWrapper0 = layoutNodeWrapper0.wrappedBy;
            Intrinsics.checkNotNull(layoutNodeWrapper0);
        }
        return this.ancestorToLocal-R5De75A(layoutNodeWrapper1, v);
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public long localToRoot-MK-Hz9U(long v) {
        if(!this.isAttached()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        for(LayoutNodeWrapper layoutNodeWrapper0 = this; layoutNodeWrapper0 != null; layoutNodeWrapper0 = layoutNodeWrapper0.wrappedBy) {
            v = layoutNodeWrapper0.toParentPosition-MK-Hz9U(v);
        }
        return v;
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public long localToWindow-MK-Hz9U(long v) {
        long v1 = this.localToRoot-MK-Hz9U(v);
        return LayoutNodeKt.requireOwner(this.layoutNode).calculatePositionInWindow-MK-Hz9U(v1);
    }

    public final void onLayerBlockUpdated(Function1 function10) {
        boolean z = this.layerBlock != function10 || !Intrinsics.areEqual(this.layerDensity, this.layoutNode.getDensity()) || this.layerLayoutDirection != this.layoutNode.getLayoutDirection();
        this.layerBlock = function10;
        this.layerDensity = this.layoutNode.getDensity();
        this.layerLayoutDirection = this.layoutNode.getLayoutDirection();
        if(!this.isAttached() || function10 == null) {
            OwnedLayer ownedLayer1 = this.layer;
            if(ownedLayer1 != null) {
                ownedLayer1.destroy();
                this.getLayoutNode$ui_release().setInnerLayerWrapperIsDirty$ui_release(true);
                this.invalidateParentLayer.invoke();
                if(this.isAttached()) {
                    Owner owner0 = this.getLayoutNode$ui_release().getOwner$ui_release();
                    if(owner0 != null) {
                        owner0.onLayoutChange(this.getLayoutNode$ui_release());
                    }
                }
            }
            this.layer = null;
            this.lastLayerDrawingWasSkipped = false;
        }
        else {
            if(this.layer == null) {
                OwnedLayer ownedLayer0 = LayoutNodeKt.requireOwner(this.layoutNode).createLayer(this, this.invalidateParentLayer);
                ownedLayer0.resize-ozmzZPI(this.getMeasuredSize-YbymL2g());
                ownedLayer0.move--gyyYBs(this.getPosition-nOcc-ac());
                this.layer = ownedLayer0;
                this.updateLayerParameters();
                this.layoutNode.setInnerLayerWrapperIsDirty$ui_release(true);
                this.invalidateParentLayer.invoke();
                return;
            }
            if(z) {
                this.updateLayerParameters();
            }
        }
    }

    protected void onMeasureResultChanged(int v, int v1) {
        OwnedLayer ownedLayer0 = this.layer;
        if(ownedLayer0 == null) {
            LayoutNodeWrapper layoutNodeWrapper0 = this.wrappedBy;
            if(layoutNodeWrapper0 != null) {
                layoutNodeWrapper0.invalidateLayer();
            }
        }
        else {
            ownedLayer0.resize-ozmzZPI(IntSizeKt.IntSize(v, v1));
        }
        Owner owner0 = this.layoutNode.getOwner$ui_release();
        if(owner0 != null) {
            owner0.onLayoutChange(this.layoutNode);
        }
        this.setMeasuredSize-ozmzZPI(IntSizeKt.IntSize(v, v1));
    }

    public void onModifierChanged() {
        OwnedLayer ownedLayer0 = this.layer;
        if(ownedLayer0 != null) {
            ownedLayer0.invalidate();
        }
    }

    protected abstract void performDraw(Canvas arg1);

    protected final Placeable performingMeasure-K40F9xA(long v, Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "block");
        this.setMeasurementConstraints-BRTryo0(v);
        Placeable placeable0 = (Placeable)function00.invoke();
        OwnedLayer ownedLayer0 = this.getLayer();
        if(ownedLayer0 != null) {
            ownedLayer0.resize-ozmzZPI(this.getMeasuredSize-YbymL2g());
        }
        return placeable0;
    }

    @Override  // androidx.compose.ui.layout.Placeable
    protected void placeAt-f8xVGno(long v, float f, Function1 function10) {
        this.onLayerBlockUpdated(function10);
        if(!IntOffset.equals-impl0(this.getPosition-nOcc-ac(), v)) {
            this.position = v;
            OwnedLayer ownedLayer0 = this.layer;
            if(ownedLayer0 == null) {
                LayoutNodeWrapper layoutNodeWrapper0 = this.wrappedBy;
                if(layoutNodeWrapper0 != null) {
                    layoutNodeWrapper0.invalidateLayer();
                }
            }
            else {
                ownedLayer0.move--gyyYBs(v);
            }
            LayoutNodeWrapper layoutNodeWrapper1 = this.getWrapped$ui_release();
            if(Intrinsics.areEqual((layoutNodeWrapper1 == null ? null : layoutNodeWrapper1.layoutNode), this.layoutNode)) {
                LayoutNode layoutNode0 = this.layoutNode.getParent$ui_release();
                if(layoutNode0 != null) {
                    layoutNode0.onAlignmentsChanged$ui_release();
                }
            }
            else {
                this.layoutNode.onAlignmentsChanged$ui_release();
            }
            Owner owner0 = this.layoutNode.getOwner$ui_release();
            if(owner0 != null) {
                owner0.onLayoutChange(this.layoutNode);
            }
        }
        this.zIndex = f;
    }

    public void populateFocusOrder(FocusOrder focusOrder0) {
        Intrinsics.checkNotNullParameter(focusOrder0, "focusOrder");
        LayoutNodeWrapper layoutNodeWrapper0 = this.wrappedBy;
        if(layoutNodeWrapper0 != null) {
            layoutNodeWrapper0.populateFocusOrder(focusOrder0);
        }
    }

    public void propagateFocusEvent(FocusState focusState0) {
        Intrinsics.checkNotNullParameter(focusState0, "focusState");
        LayoutNodeWrapper layoutNodeWrapper0 = this.wrappedBy;
        if(layoutNodeWrapper0 != null) {
            layoutNodeWrapper0.propagateFocusEvent(focusState0);
        }
    }

    private final void rectInParent(MutableRect mutableRect0, boolean z) {
        OwnedLayer ownedLayer0 = this.layer;
        if(ownedLayer0 != null) {
            if(this.isClipping && z) {
                mutableRect0.intersect(0.0f, 0.0f, ((float)IntSize.getWidth-impl(this.getSize-YbymL2g())), ((float)IntSize.getHeight-impl(this.getSize-YbymL2g())));
                if(mutableRect0.isEmpty()) {
                    return;
                }
            }
            ownedLayer0.mapBounds(mutableRect0, false);
        }
        float f = (float)(((int)(this.getPosition-nOcc-ac() >> 0x20)));
        mutableRect0.setLeft(mutableRect0.getLeft() + f);
        mutableRect0.setRight(mutableRect0.getRight() + f);
        float f1 = (float)(((int)(this.getPosition-nOcc-ac() & 0xFFFFFFFFL)));
        mutableRect0.setTop(mutableRect0.getTop() + f1);
        mutableRect0.setBottom(mutableRect0.getBottom() + f1);
    }

    public final void setMeasureResult$ui_release(MeasureResult measureResult0) {
        Intrinsics.checkNotNullParameter(measureResult0, "value");
        MeasureResult measureResult1 = this._measureResult;
        if(measureResult0 != measureResult1) {
            this._measureResult = measureResult0;
            if(measureResult1 == null || measureResult0.getWidth() != measureResult1.getWidth() || measureResult0.getHeight() != measureResult1.getHeight()) {
                this.onMeasureResultChanged(measureResult0.getWidth(), measureResult0.getHeight());
            }
            if((this.oldAlignmentLines != null && !this.oldAlignmentLines.isEmpty() || !measureResult0.getAlignmentLines().isEmpty() != 0) && !Intrinsics.areEqual(measureResult0.getAlignmentLines(), this.oldAlignmentLines)) {
                LayoutNodeWrapper layoutNodeWrapper0 = this.getWrapped$ui_release();
                if(Intrinsics.areEqual((layoutNodeWrapper0 == null ? null : layoutNodeWrapper0.layoutNode), this.layoutNode)) {
                    LayoutNode layoutNode0 = this.layoutNode.getParent$ui_release();
                    if(layoutNode0 != null) {
                        layoutNode0.onAlignmentsChanged$ui_release();
                    }
                    if(this.layoutNode.getAlignmentLines$ui_release().getUsedDuringParentMeasurement$ui_release()) {
                        LayoutNode layoutNode1 = this.layoutNode.getParent$ui_release();
                        if(layoutNode1 != null) {
                            layoutNode1.requestRemeasure$ui_release();
                        }
                    }
                    else if(this.layoutNode.getAlignmentLines$ui_release().getUsedDuringParentLayout$ui_release()) {
                        LayoutNode layoutNode2 = this.layoutNode.getParent$ui_release();
                        if(layoutNode2 != null) {
                            layoutNode2.requestRelayout$ui_release();
                        }
                    }
                }
                else {
                    this.layoutNode.onAlignmentsChanged$ui_release();
                }
                this.layoutNode.getAlignmentLines$ui_release().setDirty$ui_release(true);
                Map map0 = this.oldAlignmentLines;
                if(map0 == null) {
                    map0 = new LinkedHashMap();
                    this.oldAlignmentLines = map0;
                }
                map0.clear();
                map0.putAll(measureResult0.getAlignmentLines());
            }
        }
    }

    public final void setShallowPlacing(boolean z) {
        this.isShallowPlacing = z;
    }

    public final void setWrappedBy$ui_release(LayoutNodeWrapper layoutNodeWrapper0) {
        this.wrappedBy = layoutNodeWrapper0;
    }

    protected final void setZIndex(float f) {
        this.zIndex = f;
    }

    public long toParentPosition-MK-Hz9U(long v) {
        OwnedLayer ownedLayer0 = this.layer;
        if(ownedLayer0 != null) {
            v = ownedLayer0.mapOffset-8S9VItk(v, false);
        }
        return IntOffsetKt.plus-Nv-tHpc(v, this.getPosition-nOcc-ac());
    }

    private final void updateLayerParameters() {
        OwnedLayer ownedLayer0 = this.layer;
        if(ownedLayer0 != null) {
            Function1 function10 = this.layerBlock;
            if(function10 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            LayoutNodeWrapper.graphicsLayerScope.reset();
            LayoutNodeWrapper.graphicsLayerScope.setGraphicsDensity$ui_release(this.layoutNode.getDensity());
            OwnerSnapshotObserver ownerSnapshotObserver0 = this.getSnapshotObserver();
            Function0 function00 = new Function0() {
                final Function1 $layerBlock;

                {
                    this.$layerBlock = function10;
                    super(0);
                }

                @Override  // kotlin.jvm.functions.Function0
                public Object invoke() {
                    this.invoke();
                    return Unit.INSTANCE;
                }

                public final void invoke() {
                    ReusableGraphicsLayerScope reusableGraphicsLayerScope0 = LayoutNodeWrapper.graphicsLayerScope;
                    this.$layerBlock.invoke(reusableGraphicsLayerScope0);
                }
            };
            ownerSnapshotObserver0.observeReads$ui_release(this, LayoutNodeWrapper.onCommitAffectingLayerParams, function00);
            ownedLayer0.updateLayerProperties-dRfWZ4U(LayoutNodeWrapper.graphicsLayerScope.getScaleX(), LayoutNodeWrapper.graphicsLayerScope.getScaleY(), LayoutNodeWrapper.graphicsLayerScope.getAlpha(), LayoutNodeWrapper.graphicsLayerScope.getTranslationX(), LayoutNodeWrapper.graphicsLayerScope.getTranslationY(), LayoutNodeWrapper.graphicsLayerScope.getShadowElevation(), LayoutNodeWrapper.graphicsLayerScope.getRotationX(), LayoutNodeWrapper.graphicsLayerScope.getRotationY(), LayoutNodeWrapper.graphicsLayerScope.getRotationZ(), LayoutNodeWrapper.graphicsLayerScope.getCameraDistance(), LayoutNodeWrapper.graphicsLayerScope.getTransformOrigin-SzJe1aQ(), LayoutNodeWrapper.graphicsLayerScope.getShape(), LayoutNodeWrapper.graphicsLayerScope.getClip(), this.layoutNode.getLayoutDirection(), this.layoutNode.getDensity());
            this.isClipping = LayoutNodeWrapper.graphicsLayerScope.getClip();
        }
        else if(this.layerBlock != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Owner owner0 = this.layoutNode.getOwner$ui_release();
        if(owner0 != null) {
            owner0.onLayoutChange(this.layoutNode);
        }
    }

    @Override  // androidx.compose.ui.layout.LayoutCoordinates
    public long windowToLocal-MK-Hz9U(long v) {
        if(!this.isAttached()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        LayoutCoordinates layoutCoordinates0 = LayoutCoordinatesKt.findRoot(this);
        return this.localPositionOf-R5De75A(layoutCoordinates0, Offset.minus-MK-Hz9U(LayoutNodeKt.requireOwner(this.layoutNode).calculateLocalPosition-MK-Hz9U(v), LayoutCoordinatesKt.positionInRoot(layoutCoordinates0)));
    }

    protected final void withPositionTranslation(Canvas canvas0, Function1 function10) {
        Intrinsics.checkNotNullParameter(canvas0, "canvas");
        Intrinsics.checkNotNullParameter(function10, "block");
        float f = (float)(((int)(this.getPosition-nOcc-ac() >> 0x20)));
        float f1 = (float)(((int)(this.getPosition-nOcc-ac() & 0xFFFFFFFFL)));
        canvas0.translate(f, f1);
        function10.invoke(canvas0);
        canvas0.translate(-f, -f1);
    }

    protected final boolean withinLayerBounds-k-4lQ0M(long v) {
        return this.layer == null || !this.isClipping ? true : this.layer.isInLayer-k-4lQ0M(v);
    }
}

