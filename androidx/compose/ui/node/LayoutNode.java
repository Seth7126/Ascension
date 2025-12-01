package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier.Element;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.focus.FocusEventModifier;
import androidx.compose.ui.focus.FocusModifier;
import androidx.compose.ui.focus.FocusOrderModifier;
import androidx.compose.ui.focus.FocusRequesterModifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.input.key.KeyInputModifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollDelegatingWrapper;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifier;
import androidx.compose.ui.input.pointer.PointerInputModifier;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope.DefaultImpls;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import androidx.compose.ui.layout.OnRemeasuredModifier;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.platform.JvmActuals_jvmKt;
import androidx.compose.ui.semantics.SemanticsModifier;
import androidx.compose.ui.semantics.SemanticsNodeKt;
import androidx.compose.ui.semantics.SemanticsWrapper;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u00BA\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u008C\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\b\u008C\u0002\u008D\u0002\u008E\u0002\u008F\u0002B\u0007\b\u0010\u00A2\u0006\u0002\u0010\u0006B\u000F\b\u0010\u0012\u0006\u0010\u0007\u001A\u00020\b\u00A2\u0006\u0002\u0010\tJ\t\u0010\u00A2\u0001\u001A\u00020vH\u0002J\u0018\u0010\u00A3\u0001\u001A\u00020v2\u0007\u0010\u0084\u0001\u001A\u00020uH\u0000\u00A2\u0006\u0003\b\u00A4\u0001J\u001D\u0010\u00A5\u0001\u001A\u0010\u0012\u0005\u0012\u00030\u00A7\u0001\u0012\u0004\u0012\u00020/0\u00A6\u0001H\u0000\u00A2\u0006\u0003\b\u00A8\u0001J\t\u0010\u00A9\u0001\u001A\u00020vH\u0002J\u0014\u0010\u00AA\u0001\u001A\u00030\u00AB\u00012\b\b\u0002\u0010.\u001A\u00020/H\u0002J\u000F\u0010\u00AC\u0001\u001A\u00020vH\u0000\u00A2\u0006\u0003\b\u00AD\u0001J\u000F\u0010\u00AE\u0001\u001A\u00020vH\u0000\u00A2\u0006\u0003\b\u00AF\u0001J\u0019\u0010\u00B0\u0001\u001A\u00020v2\b\u0010\u00B1\u0001\u001A\u00030\u00B2\u0001H\u0000\u00A2\u0006\u0003\b\u00B3\u0001J\u001F\u0010\u00B4\u0001\u001A\u00020v2\u0013\u0010\u00B5\u0001\u001A\u000E\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020v0tH\u0082\bJ\u001F\u0010\u00B6\u0001\u001A\u00020v2\u0013\u0010\u00B5\u0001\u001A\u000E\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020v0tH\u0082\bJ\t\u0010\u00B7\u0001\u001A\u00020vH\u0016J\u0010\u0010\u00B8\u0001\u001A\t\u0012\u0005\u0012\u00030\u00B9\u00010 H\u0016J\u000F\u0010\u00BA\u0001\u001A\b\u0012\u0004\u0012\u00020\u007F0\rH\u0002J\u0019\u0010\u00BB\u0001\u001A\u00020v2\b\u0010\u00BC\u0001\u001A\u00030\u00BD\u0001H\u0000\u00A2\u0006\u0003\b\u00BE\u0001J\t\u0010\u00BF\u0001\u001A\u00020\bH\u0002J3\u0010\u00C0\u0001\u001A\u00020v2\b\u0010\u00C1\u0001\u001A\u00030\u00C2\u00012\u000F\u0010\u00C3\u0001\u001A\n\u0012\u0005\u0012\u00030\u00C5\u00010\u00C4\u0001H\u0000\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\b\u00C6\u0001\u0010\u00C7\u0001J3\u0010\u00C8\u0001\u001A\u00020v2\b\u0010\u00C1\u0001\u001A\u00030\u00C2\u00012\u000F\u0010\u00C9\u0001\u001A\n\u0012\u0005\u0012\u00030\u00CA\u00010\u00C4\u0001H\u0000\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\b\u00CB\u0001\u0010\u00C7\u0001J\"\u00108\u001A\u00020v2\u000E\u0010\u00B5\u0001\u001A\t\u0012\u0004\u0012\u00020v0\u00CC\u0001H\u0080\b\u00F8\u0001\u0002\u00A2\u0006\u0003\b\u00CD\u0001J!\u0010\u00CE\u0001\u001A\u00020v2\u0007\u0010\u00CF\u0001\u001A\u00020/2\u0007\u0010\u00D0\u0001\u001A\u00020\u0000H\u0000\u00A2\u0006\u0003\b\u00D1\u0001J\u000F\u0010\u00D2\u0001\u001A\u00020vH\u0000\u00A2\u0006\u0003\b\u00D3\u0001J\u000F\u0010\u00D4\u0001\u001A\u00020vH\u0000\u00A2\u0006\u0003\b\u00D5\u0001J\t\u0010\u00D6\u0001\u001A\u00020vH\u0002J\u000F\u0010\u00D7\u0001\u001A\u00020vH\u0000\u00A2\u0006\u0003\b\u00D8\u0001J\t\u0010\u00D9\u0001\u001A\u00020vH\u0002J\u0011\u0010\u00DA\u0001\u001A\u00020v2\u0006\u0010j\u001A\u00020iH\u0002J\t\u0010\u00DB\u0001\u001A\u00020vH\u0002J\u0012\u0010\u00DC\u0001\u001A\u00020/2\u0007\u0010\u0098\u0001\u001A\u00020/H\u0016J\u0011\u0010\u00DD\u0001\u001A\u00020/2\u0006\u00106\u001A\u00020/H\u0016J#\u0010\u00DE\u0001\u001A\u00030\u00DF\u00012\b\u0010\u00E0\u0001\u001A\u00030\u00E1\u0001H\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\b\u00E2\u0001\u0010\u00E3\u0001J\u0012\u0010\u00E4\u0001\u001A\u00020/2\u0007\u0010\u0098\u0001\u001A\u00020/H\u0016J\u0011\u0010\u00E5\u0001\u001A\u00020/2\u0006\u00106\u001A\u00020/H\u0016J*\u0010\u00E6\u0001\u001A\u00020v2\u0007\u0010\u00E7\u0001\u001A\u00020/2\u0007\u0010\u00E8\u0001\u001A\u00020/2\u0007\u0010\u00E9\u0001\u001A\u00020/H\u0000\u00A2\u0006\u0003\b\u00EA\u0001J\u000F\u0010\u00EB\u0001\u001A\u00020vH\u0000\u00A2\u0006\u0003\b\u00EC\u0001J\t\u0010\u00ED\u0001\u001A\u00020vH\u0002J\t\u0010\u00EE\u0001\u001A\u00020vH\u0002J\u000F\u0010\u00EF\u0001\u001A\u00020vH\u0000\u00A2\u0006\u0003\b\u00F0\u0001J\t\u0010\u00F1\u0001\u001A\u00020vH\u0002J!\u0010\u00F2\u0001\u001A\u00020v2\u0007\u0010\u00F3\u0001\u001A\u00020/2\u0007\u0010\u00F4\u0001\u001A\u00020/H\u0000\u00A2\u0006\u0003\b\u00F5\u0001J\t\u0010\u00F6\u0001\u001A\u00020vH\u0002J#\u0010\u00F7\u0001\u001A\u00020\b2\f\b\u0002\u0010\u00E0\u0001\u001A\u0005\u0018\u00010\u00E1\u0001H\u0000\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0003\b\u00F8\u0001J\u000F\u0010\u00F9\u0001\u001A\u00020vH\u0000\u00A2\u0006\u0003\b\u00FA\u0001J!\u0010\u00FB\u0001\u001A\u00020v2\u0007\u0010\u00CF\u0001\u001A\u00020/2\u0007\u0010\u00E9\u0001\u001A\u00020/H\u0000\u00A2\u0006\u0003\b\u00FC\u0001J\u000F\u0010\u00FD\u0001\u001A\u00020vH\u0000\u00A2\u0006\u0003\b\u00FE\u0001J\u000F\u0010\u00FF\u0001\u001A\u00020vH\u0000\u00A2\u0006\u0003\b\u0080\u0002J\u000F\u0010\u0081\u0002\u001A\u00020vH\u0000\u00A2\u0006\u0003\b\u0082\u0002J\u0012\u0010\u0083\u0002\u001A\u00020v2\u0007\u0010\u0084\u0002\u001A\u00020\u0000H\u0002J\"\u0010\u0085\u0002\u001A\t\u0012\u0002\b\u0003\u0018\u00010\u009B\u00012\u0007\u0010j\u001A\u00030\u0086\u00022\u0007\u0010\u0087\u0002\u001A\u00020\u0013H\u0002J\t\u0010\u0088\u0002\u001A\u00020\bH\u0002J\n\u0010\u0089\u0002\u001A\u00030\u00AB\u0001H\u0016J\u001F\u0010\u008A\u0002\u001A\u00020v2\u000E\u0010\u00B5\u0001\u001A\t\u0012\u0004\u0012\u00020v0\u00CC\u0001H\u0000\u00A2\u0006\u0003\b\u008B\u0002R\u0014\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00000\u000BX\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u001A\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u00000\r8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b\u000E\u0010\u000FR\u0014\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u00000\rX\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001A\u0004\u0018\u00010\u0000X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001A\u0004\u0018\u00010\u0013X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001A\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\rX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001A\b\u0012\u0004\u0012\u00020\u00000\rX\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001A\u00020\u0017X\u0080\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0018\u0010\u0019R$\u0010\u001A\u001A\u00020\b8\u0000@\u0000X\u0081\u000E\u00A2\u0006\u0014\n\u0000\u0012\u0004\b\u001B\u0010\u0006\u001A\u0004\b\u001C\u0010\u001D\"\u0004\b\u001E\u0010\tR\u001A\u0010\u001F\u001A\b\u0012\u0004\u0012\u00020\u00000 8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b!\u0010\"R\u0014\u0010#\u001A\u00020$8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b%\u0010&R$\u0010)\u001A\u00020(2\u0006\u0010\'\u001A\u00020(@VX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001A\u0010.\u001A\u00020/X\u0080\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b0\u00101\"\u0004\b2\u00103R\u001A\u00104\u001A\b\u0012\u0004\u0012\u00020\u00000 8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b5\u0010\"R\u0014\u00106\u001A\u00020/8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b7\u00101R\u000E\u00108\u001A\u00020\bX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0016\u00109\u001A\u0004\u0018\u00010\u00138@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b:\u0010;R\u001A\u0010<\u001A\u00020\bX\u0080\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b=\u0010\u001D\"\u0004\b>\u0010\tR\u0014\u0010?\u001A\u00020\u0013X\u0080\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b@\u0010;R\u0014\u0010A\u001A\u00020BX\u0080\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\bC\u0010DR\u0014\u0010E\u001A\u00020\b8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bE\u0010\u001DR\u001E\u0010G\u001A\u00020\b2\u0006\u0010F\u001A\u00020\b@RX\u0096\u000E\u00A2\u0006\b\n\u0000\u001A\u0004\bG\u0010\u001DR\u0014\u0010H\u001A\u00020\b8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bH\u0010\u001DR\u000E\u0010\u0007\u001A\u00020\bX\u0082\u0004\u00A2\u0006\u0002\n\u0000R$\u0010J\u001A\u00020I2\u0006\u0010\'\u001A\u00020I@VX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\bK\u0010L\"\u0004\bM\u0010NR\u001A\u0010O\u001A\u00020PX\u0080\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u0014\u0010U\u001A\u00020VX\u0080\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\bW\u0010XR$\u0010Z\u001A\u00020Y2\u0006\u0010\'\u001A\u00020Y@VX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u0014\u0010_\u001A\u00020`X\u0080\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\ba\u0010bR\u001A\u0010c\u001A\u00020dX\u0080\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\be\u0010f\"\u0004\bg\u0010hR$\u0010j\u001A\u00020i2\u0006\u0010\'\u001A\u00020i@VX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\bk\u0010l\"\u0004\bm\u0010nR\u001A\u0010o\u001A\u00020\bX\u0080\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\bp\u0010\u001D\"\u0004\bq\u0010\tR\u000E\u0010r\u001A\u00020/X\u0082\u000E\u00A2\u0006\u0002\n\u0000R(\u0010s\u001A\u0010\u0012\u0004\u0012\u00020u\u0012\u0004\u0012\u00020v\u0018\u00010tX\u0080\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\bw\u0010x\"\u0004\by\u0010zR(\u0010{\u001A\u0010\u0012\u0004\u0012\u00020u\u0012\u0004\u0012\u00020v\u0018\u00010tX\u0080\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b|\u0010x\"\u0004\b}\u0010zR\u0016\u0010~\u001A\n\u0012\u0004\u0012\u00020\u007F\u0018\u00010\rX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0016\u0010\u0080\u0001\u001A\u00020\u00138@X\u0080\u0004\u00A2\u0006\u0007\u001A\u0005\b\u0081\u0001\u0010;R\u0010\u0010\u0082\u0001\u001A\u00030\u0083\u0001X\u0082\u0004\u00A2\u0006\u0002\n\u0000R%\u0010\u0084\u0001\u001A\u0004\u0018\u00010u2\b\u0010F\u001A\u0004\u0018\u00010u@BX\u0080\u000E\u00A2\u0006\n\n\u0000\u001A\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0019\u0010\u0087\u0001\u001A\u0004\u0018\u00010\u00008@X\u0080\u0004\u00A2\u0006\b\u001A\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001A\u0010\u008A\u0001\u001A\u0005\u0018\u00010\u008B\u00018VX\u0096\u0004\u00A2\u0006\b\u001A\u0006\b\u008C\u0001\u0010\u008D\u0001R\u0019\u0010\u008E\u0001\u001A\u0004\u0018\u00010\u00048VX\u0096\u0004\u00A2\u0006\b\u001A\u0006\b\u008F\u0001\u0010\u0090\u0001R \u0010\u0091\u0001\u001A\u00020/2\u0006\u0010F\u001A\u00020/@BX\u0080\u000E\u00A2\u0006\t\n\u0000\u001A\u0005\b\u0092\u0001\u00101R\u000F\u0010\u0093\u0001\u001A\u00020/X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000F\u0010\u0094\u0001\u001A\u00020\bX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000F\u0010\u0095\u0001\u001A\u00020/X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0016\u0010\u0096\u0001\u001A\u00020\b8@X\u0080\u0004\u00A2\u0006\u0007\u001A\u0005\b\u0097\u0001\u0010\u001DR\u0016\u0010\u0098\u0001\u001A\u00020/8VX\u0096\u0004\u00A2\u0006\u0007\u001A\u0005\b\u0099\u0001\u00101R\u001A\u0010\u009A\u0001\u001A\r\u0012\t\u0012\u0007\u0012\u0002\b\u00030\u009B\u00010\rX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0010\u0010\u009C\u0001\u001A\u00030\u009D\u0001X\u0082\u000E\u00A2\u0006\u0002\n\u0000R#\u0010\u009E\u0001\u001A\b\u0012\u0004\u0012\u00020\u00000\r8@X\u0081\u0004\u00A2\u0006\u000E\u0012\u0005\b\u009F\u0001\u0010\u0006\u001A\u0005\b\u00A0\u0001\u0010\u000FR\u000F\u0010\u00A1\u0001\u001A\u00020\bX\u0082\u000E\u00A2\u0006\u0002\n\u0000\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\n\u0005\b\u009920\u0001\u00A8\u0006\u0090\u0002"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/Remeasurement;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/compose/ui/layout/LayoutInfo;", "Landroidx/compose/ui/node/ComposeUiNode;", "()V", "isVirtual", "", "(Z)V", "ZComparator", "Ljava/util/Comparator;", "_children", "Landroidx/compose/runtime/collection/MutableVector;", "get_children$ui_release", "()Landroidx/compose/runtime/collection/MutableVector;", "_foldedChildren", "_foldedParent", "_innerLayerWrapper", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "_unfoldedChildren", "_zSortedChildren", "alignmentLines", "Landroidx/compose/ui/node/LayoutNodeAlignmentLines;", "getAlignmentLines$ui_release", "()Landroidx/compose/ui/node/LayoutNodeAlignmentLines;", "canMultiMeasure", "getCanMultiMeasure$ui_release$annotations", "getCanMultiMeasure$ui_release", "()Z", "setCanMultiMeasure$ui_release", "children", "", "getChildren$ui_release", "()Ljava/util/List;", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "value", "Landroidx/compose/ui/unit/Density;", "density", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "depth", "", "getDepth$ui_release", "()I", "setDepth$ui_release", "(I)V", "foldedChildren", "getFoldedChildren$ui_release", "height", "getHeight", "ignoreRemeasureRequests", "innerLayerWrapper", "getInnerLayerWrapper$ui_release", "()Landroidx/compose/ui/node/LayoutNodeWrapper;", "innerLayerWrapperIsDirty", "getInnerLayerWrapperIsDirty$ui_release", "setInnerLayerWrapperIsDirty$ui_release", "innerLayoutNodeWrapper", "getInnerLayoutNodeWrapper$ui_release", "intrinsicsPolicy", "Landroidx/compose/ui/node/IntrinsicsPolicy;", "getIntrinsicsPolicy$ui_release", "()Landroidx/compose/ui/node/IntrinsicsPolicy;", "isAttached", "<set-?>", "isPlaced", "isValid", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layoutState", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", "getLayoutState$ui_release", "()Landroidx/compose/ui/node/LayoutNode$LayoutState;", "setLayoutState$ui_release", "(Landroidx/compose/ui/node/LayoutNode$LayoutState;)V", "mDrawScope", "Landroidx/compose/ui/node/LayoutNodeDrawScope;", "getMDrawScope$ui_release", "()Landroidx/compose/ui/node/LayoutNodeDrawScope;", "Landroidx/compose/ui/layout/MeasurePolicy;", "measurePolicy", "getMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "setMeasurePolicy", "(Landroidx/compose/ui/layout/MeasurePolicy;)V", "measureScope", "Landroidx/compose/ui/layout/MeasureScope;", "getMeasureScope$ui_release", "()Landroidx/compose/ui/layout/MeasureScope;", "measuredByParent", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "getMeasuredByParent$ui_release", "()Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "setMeasuredByParent$ui_release", "(Landroidx/compose/ui/node/LayoutNode$UsageByParent;)V", "Landroidx/compose/ui/Modifier;", "modifier", "getModifier", "()Landroidx/compose/ui/Modifier;", "setModifier", "(Landroidx/compose/ui/Modifier;)V", "needsOnPositionedDispatch", "getNeedsOnPositionedDispatch$ui_release", "setNeedsOnPositionedDispatch$ui_release", "nextChildPlaceOrder", "onAttach", "Lkotlin/Function1;", "Landroidx/compose/ui/node/Owner;", "", "getOnAttach$ui_release", "()Lkotlin/jvm/functions/Function1;", "setOnAttach$ui_release", "(Lkotlin/jvm/functions/Function1;)V", "onDetach", "getOnDetach$ui_release", "setOnDetach$ui_release", "onPositionedCallbacks", "Landroidx/compose/ui/node/OnGloballyPositionedModifierWrapper;", "outerLayoutNodeWrapper", "getOuterLayoutNodeWrapper$ui_release", "outerMeasurablePlaceable", "Landroidx/compose/ui/node/OuterMeasurablePlaceable;", "owner", "getOwner$ui_release", "()Landroidx/compose/ui/node/Owner;", "parent", "getParent$ui_release", "()Landroidx/compose/ui/node/LayoutNode;", "parentData", "", "getParentData", "()Ljava/lang/Object;", "parentInfo", "getParentInfo", "()Landroidx/compose/ui/layout/LayoutInfo;", "placeOrder", "getPlaceOrder$ui_release", "previousPlaceOrder", "unfoldedVirtualChildrenListDirty", "virtualChildrenCount", "wasMeasuredDuringThisIteration", "getWasMeasuredDuringThisIteration$ui_release", "width", "getWidth", "wrapperCache", "Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;", "zIndex", "", "zSortedChildren", "getZSortedChildren$annotations", "getZSortedChildren", "zSortedChildrenInvalidated", "alignmentLinesQueriedByModifier", "attach", "attach$ui_release", "calculateAlignmentLines", "", "Landroidx/compose/ui/layout/AlignmentLine;", "calculateAlignmentLines$ui_release", "copyWrappersToCache", "debugTreeToString", "", "detach", "detach$ui_release", "dispatchOnPositionedCallbacks", "dispatchOnPositionedCallbacks$ui_release", "draw", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "draw$ui_release", "forEachDelegate", "block", "forEachDelegateIncludingInner", "forceRemeasure", "getModifierInfo", "Landroidx/compose/ui/layout/ModifierInfo;", "getOrCreateOnPositionedCallbacks", "handleMeasureResult", "measureResult", "Landroidx/compose/ui/layout/MeasureResult;", "handleMeasureResult$ui_release", "hasNewPositioningCallback", "hitTest", "pointerPosition", "Landroidx/compose/ui/geometry/Offset;", "hitPointerInputFilters", "", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "hitTest-3MmeM6k$ui_release", "(JLjava/util/List;)V", "hitTestSemantics", "hitSemanticsWrappers", "Landroidx/compose/ui/semantics/SemanticsWrapper;", "hitTestSemantics-3MmeM6k$ui_release", "Lkotlin/Function0;", "ignoreRemeasureRequests$ui_release", "insertAt", "index", "instance", "insertAt$ui_release", "invalidateLayer", "invalidateLayer$ui_release", "invalidateLayers", "invalidateLayers$ui_release", "invalidateUnfoldedVirtualChildren", "layoutChildren", "layoutChildren$ui_release", "markNodeAndSubtreeAsPlaced", "markReusedModifiers", "markSubtreeAsNotPlaced", "maxIntrinsicHeight", "maxIntrinsicWidth", "measure", "Landroidx/compose/ui/layout/Placeable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "minIntrinsicHeight", "minIntrinsicWidth", "move", "from", "to", "count", "move$ui_release", "onAlignmentsChanged", "onAlignmentsChanged$ui_release", "onBeforeLayoutChildren", "onDensityOrLayoutDirectionChanged", "onNodePlaced", "onNodePlaced$ui_release", "onZSortedChildrenInvalidated", "place", "x", "y", "place$ui_release", "recreateUnfoldedChildrenIfDirty", "remeasure", "remeasure-_Sx5XlM$ui_release", "removeAll", "removeAll$ui_release", "removeAt", "removeAt$ui_release", "replace", "replace$ui_release", "requestRelayout", "requestRelayout$ui_release", "requestRemeasure", "requestRemeasure$ui_release", "rescheduleRemeasureOrRelayout", "it", "reuseLayoutNodeWrapper", "Landroidx/compose/ui/Modifier$Element;", "wrapper", "shouldInvalidateParentLayer", "toString", "withNoSnapshotReadObservation", "withNoSnapshotReadObservation$ui_release", "Companion", "LayoutState", "NoIntrinsicsMeasurePolicy", "UsageByParent", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class LayoutNode implements LayoutInfo, Measurable, Remeasurement, ComposeUiNode, OwnerScope {
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001A\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u000E\u0010\b\u001A\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\n\u001A\u00020\u000BX\u0080T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$Companion;", "", "()V", "Constructor", "Lkotlin/Function0;", "Landroidx/compose/ui/node/LayoutNode;", "getConstructor$ui_release", "()Lkotlin/jvm/functions/Function0;", "ErrorMeasurePolicy", "Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "NotPlacedPlaceOrder", "", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final Function0 getConstructor$ui_release() {
            return LayoutNode.Constructor;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$LayoutState;", "", "(Ljava/lang/String;I)V", "NeedsRemeasure", "Measuring", "NeedsRelayout", "LayingOut", "Ready", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static enum LayoutState {
        NeedsRemeasure,
        Measuring,
        NeedsRelayout,
        LayingOut,
        Ready;

        private static final LayoutState[] $values() [...] // Inlined contents
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001A\u00020\u0006*\u00020\u00072\f\u0010\b\u001A\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000B\u001A\u00020\fH\u0016J\"\u0010\r\u001A\u00020\u0006*\u00020\u00072\f\u0010\b\u001A\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000E\u001A\u00020\fH\u0016J\"\u0010\u000F\u001A\u00020\u0006*\u00020\u00072\f\u0010\b\u001A\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000B\u001A\u00020\fH\u0016J\"\u0010\u0010\u001A\u00020\u0006*\u00020\u00072\f\u0010\b\u001A\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000E\u001A\u00020\fH\u0016R\u000E\u0010\u0002\u001A\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "error", "", "(Ljava/lang/String;)V", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "", "maxIntrinsicWidth", "height", "minIntrinsicHeight", "minIntrinsicWidth", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static abstract class NoIntrinsicsMeasurePolicy implements MeasurePolicy {
        private final String error;

        public NoIntrinsicsMeasurePolicy(String s) {
            Intrinsics.checkNotNullParameter(s, "error");
            super();
            this.error = s;
        }

        @Override  // androidx.compose.ui.layout.MeasurePolicy
        public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
            return ((Number)this.maxIntrinsicHeight(intrinsicMeasureScope0, list0, v)).intValue();
        }

        public Void maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope0, "<this>");
            Intrinsics.checkNotNullParameter(list0, "measurables");
            throw new IllegalStateException(this.error.toString());
        }

        @Override  // androidx.compose.ui.layout.MeasurePolicy
        public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
            return ((Number)this.maxIntrinsicWidth(intrinsicMeasureScope0, list0, v)).intValue();
        }

        public Void maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope0, "<this>");
            Intrinsics.checkNotNullParameter(list0, "measurables");
            throw new IllegalStateException(this.error.toString());
        }

        @Override  // androidx.compose.ui.layout.MeasurePolicy
        public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
            return ((Number)this.minIntrinsicHeight(intrinsicMeasureScope0, list0, v)).intValue();
        }

        public Void minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope0, "<this>");
            Intrinsics.checkNotNullParameter(list0, "measurables");
            throw new IllegalStateException(this.error.toString());
        }

        @Override  // androidx.compose.ui.layout.MeasurePolicy
        public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
            return ((Number)this.minIntrinsicWidth(intrinsicMeasureScope0, list0, v)).intValue();
        }

        public Void minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope0, "<this>");
            Intrinsics.checkNotNullParameter(list0, "measurables");
            throw new IllegalStateException(this.error.toString());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "", "(Ljava/lang/String;I)V", "InMeasureBlock", "InLayoutBlock", "NotUsed", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static enum UsageByParent {
        InMeasureBlock,
        InLayoutBlock,
        NotUsed;

        private static final UsageByParent[] $values() [...] // Inlined contents
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[LayoutState.values().length];
            arr_v[LayoutState.NeedsRemeasure.ordinal()] = 1;
            arr_v[LayoutState.NeedsRelayout.ordinal()] = 2;
            arr_v[LayoutState.Ready.ordinal()] = 3;
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final Companion Companion = null;
    private static final Function0 Constructor = null;
    private static final NoIntrinsicsMeasurePolicy ErrorMeasurePolicy = null;
    public static final int NotPlacedPlaceOrder = 0x7FFFFFFF;
    private final Comparator ZComparator;
    private final MutableVector _foldedChildren;
    private LayoutNode _foldedParent;
    private LayoutNodeWrapper _innerLayerWrapper;
    private MutableVector _unfoldedChildren;
    private final MutableVector _zSortedChildren;
    private final LayoutNodeAlignmentLines alignmentLines;
    private boolean canMultiMeasure;
    private Density density;
    private int depth;
    private boolean ignoreRemeasureRequests;
    private boolean innerLayerWrapperIsDirty;
    private final LayoutNodeWrapper innerLayoutNodeWrapper;
    private final IntrinsicsPolicy intrinsicsPolicy;
    private boolean isPlaced;
    private final boolean isVirtual;
    private LayoutDirection layoutDirection;
    private LayoutState layoutState;
    private final LayoutNodeDrawScope mDrawScope;
    private MeasurePolicy measurePolicy;
    private final MeasureScope measureScope;
    private UsageByParent measuredByParent;
    private Modifier modifier;
    private boolean needsOnPositionedDispatch;
    private int nextChildPlaceOrder;
    private Function1 onAttach;
    private Function1 onDetach;
    private MutableVector onPositionedCallbacks;
    private final OuterMeasurablePlaceable outerMeasurablePlaceable;
    private Owner owner;
    private int placeOrder;
    private int previousPlaceOrder;
    private boolean unfoldedVirtualChildrenListDirty;
    private int virtualChildrenCount;
    private MutableVector wrapperCache;
    private float zIndex;
    private boolean zSortedChildrenInvalidated;

    static {
        LayoutNode.Companion = new Companion(null);
        LayoutNode.ErrorMeasurePolicy = new LayoutNode.Companion.ErrorMeasurePolicy.1();
        LayoutNode.Constructor = LayoutNode.Companion.Constructor.1.INSTANCE;
    }

    public LayoutNode() {
        this(false);

        @Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u0010\u0005\u001A\u00020\u00042\u000E\u0010\u0002\u001A\n \u0001*\u0004\u0018\u00010\u00000\u00002\u000E\u0010\u0003\u001A\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "kotlin.jvm.PlatformType", "node1", "node2", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        final class androidx.compose.ui.node.LayoutNode.ZComparator.1 implements Comparator {
            public static final androidx.compose.ui.node.LayoutNode.ZComparator.1 INSTANCE;

            static {
                androidx.compose.ui.node.LayoutNode.ZComparator.1.INSTANCE = new androidx.compose.ui.node.LayoutNode.ZComparator.1();
            }

            androidx.compose.ui.node.LayoutNode.ZComparator.1() {
                super();
            }

            public final int compare(LayoutNode layoutNode0, LayoutNode layoutNode1) {
                Intrinsics.checkNotNullExpressionValue(layoutNode0, "node1");
                Intrinsics.checkNotNullExpressionValue(layoutNode1, "node2");
                return layoutNode0.zIndex == layoutNode1.zIndex ? Intrinsics.compare(layoutNode0.getPlaceOrder$ui_release(), layoutNode1.getPlaceOrder$ui_release()) : Float.compare(layoutNode0.zIndex, layoutNode1.zIndex);
            }

            // 检测为 Lambda 实现
            @Override
            public int compare(Object object0, Object object1) [...]
        }


        @Metadata(d1 = {"\u0000\u001F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002R\u0014\u0010\u0003\u001A\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001A\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001A\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"androidx/compose/ui/node/LayoutNode$measureScope$1", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/unit/Density;", "density", "", "getDensity", "()F", "fontScale", "getFontScale", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
        public final class androidx.compose.ui.node.LayoutNode.measureScope.1 implements MeasureScope, Density {
            androidx.compose.ui.node.LayoutNode.measureScope.1(LayoutNode layoutNode0) {
            }

            @Override  // androidx.compose.ui.unit.Density
            public float getDensity() {
                return LayoutNode.this.getDensity().getDensity();
            }

            @Override  // androidx.compose.ui.unit.Density
            public float getFontScale() {
                return LayoutNode.this.getDensity().getFontScale();
            }

            @Override  // androidx.compose.ui.layout.IntrinsicMeasureScope
            public LayoutDirection getLayoutDirection() {
                return LayoutNode.this.getLayoutDirection();
            }

            @Override  // androidx.compose.ui.layout.MeasureScope
            public MeasureResult layout(int v, int v1, Map map0, Function1 function10) {
                return DefaultImpls.layout(this, v, v1, map0, function10);
            }

            @Override  // androidx.compose.ui.unit.Density
            public int roundToPx--R2X_6o(long v) {
                return DefaultImpls.roundToPx--R2X_6o(this, v);
            }

            @Override  // androidx.compose.ui.unit.Density
            public int roundToPx-0680j_4(float f) {
                return DefaultImpls.roundToPx-0680j_4(this, f);
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

    }

    public LayoutNode(boolean z) {
        this._foldedChildren = new MutableVector(new LayoutNode[16], 0);
        this.layoutState = LayoutState.Ready;
        this.wrapperCache = new MutableVector(new DelegatingLayoutNodeWrapper[16], 0);
        this._zSortedChildren = new MutableVector(new LayoutNode[16], 0);
        this.zSortedChildrenInvalidated = true;
        this.measurePolicy = LayoutNode.ErrorMeasurePolicy;
        this.intrinsicsPolicy = new IntrinsicsPolicy(this);
        this.density = DensityKt.Density$default(1.0f, 0.0f, 2, null);
        this.measureScope = new androidx.compose.ui.node.LayoutNode.measureScope.1(this);
        this.layoutDirection = LayoutDirection.Ltr;
        this.alignmentLines = new LayoutNodeAlignmentLines(this);
        this.mDrawScope = LayoutNodeKt.getSharedDrawScope();
        this.placeOrder = 0x7FFFFFFF;
        this.previousPlaceOrder = 0x7FFFFFFF;
        this.measuredByParent = UsageByParent.NotUsed;
        LayoutNodeWrapper layoutNodeWrapper0 = new InnerPlaceable(this);
        this.innerLayoutNodeWrapper = layoutNodeWrapper0;
        this.outerMeasurablePlaceable = new OuterMeasurablePlaceable(this, layoutNodeWrapper0);
        this.innerLayerWrapperIsDirty = true;
        this.modifier = Modifier.Companion;
        this.ZComparator = (Object object0, Object object1) -> this.compare(((LayoutNode)object0), ((LayoutNode)object1));
        this.isVirtual = z;
    }

    private final void alignmentLinesQueriedByModifier() {
        if(this.layoutState == LayoutState.Measuring) {
            this.alignmentLines.setUsedByModifierMeasurement$ui_release(true);
            if(this.alignmentLines.getDirty$ui_release()) {
                this.layoutState = LayoutState.NeedsRelayout;
            }
        }
        else {
            this.alignmentLines.setUsedByModifierLayout$ui_release(true);
        }
    }

    public final void attach$ui_release(Owner owner0) {
        Intrinsics.checkNotNullParameter(owner0, "owner");
        int v = 0;
        String s = null;
        if(this.owner != null) {
            throw new IllegalStateException(("Cannot attach " + this + " as it already is attached.  Tree: " + LayoutNode.debugTreeToString$default(this, 0, 1, null)).toString());
        }
        if(this._foldedParent != null && !Intrinsics.areEqual((this._foldedParent == null ? null : this._foldedParent.owner), owner0)) {
            StringBuilder stringBuilder0 = new StringBuilder("Attaching to a different owner(");
            stringBuilder0.append(owner0);
            stringBuilder0.append(") than the parent\'s owner(");
            LayoutNode layoutNode0 = this.getParent$ui_release();
            stringBuilder0.append((layoutNode0 == null ? null : layoutNode0.getOwner$ui_release()));
            stringBuilder0.append("). This tree: ");
            stringBuilder0.append(LayoutNode.debugTreeToString$default(this, 0, 1, null));
            stringBuilder0.append(" Parent tree: ");
            LayoutNode layoutNode1 = this._foldedParent;
            if(layoutNode1 != null) {
                s = LayoutNode.debugTreeToString$default(layoutNode1, 0, 1, null);
            }
            stringBuilder0.append(s);
            throw new IllegalStateException(stringBuilder0.toString().toString());
        }
        LayoutNode layoutNode2 = this.getParent$ui_release();
        if(layoutNode2 == null) {
            this.isPlaced = true;
        }
        this.owner = owner0;
        this.depth = (layoutNode2 == null ? -1 : layoutNode2.depth) + 1;
        if(SemanticsNodeKt.getOuterSemantics(this) != null) {
            owner0.onSemanticsChange();
        }
        owner0.onAttach(this);
        MutableVector mutableVector0 = this._foldedChildren;
        int v1 = mutableVector0.getSize();
        if(v1 > 0) {
            Object[] arr_object = mutableVector0.getContent();
            while(true) {
                ((LayoutNode)arr_object[v]).attach$ui_release(owner0);
                ++v;
                if(v >= v1) {
                    break;
                }
            }
        }
        this.requestRemeasure$ui_release();
        if(layoutNode2 != null) {
            layoutNode2.requestRemeasure$ui_release();
        }
        this.innerLayoutNodeWrapper.attach();
        LayoutNodeWrapper layoutNodeWrapper0 = this.getOuterLayoutNodeWrapper$ui_release();
        LayoutNodeWrapper layoutNodeWrapper1 = this.getInnerLayoutNodeWrapper$ui_release();
        while(!Intrinsics.areEqual(layoutNodeWrapper0, layoutNodeWrapper1)) {
            layoutNodeWrapper0.attach();
            layoutNodeWrapper0 = layoutNodeWrapper0.getWrapped$ui_release();
            Intrinsics.checkNotNull(layoutNodeWrapper0);
        }
        Function1 function10 = this.onAttach;
        if(function10 != null) {
            function10.invoke(owner0);
        }
    }

    public final Map calculateAlignmentLines$ui_release() {
        if(!this.outerMeasurablePlaceable.getDuringAlignmentLinesQuery$ui_release()) {
            this.alignmentLinesQueriedByModifier();
        }
        this.layoutChildren$ui_release();
        return this.alignmentLines.getLastCalculation();
    }

    private final void copyWrappersToCache() {
        LayoutNodeWrapper layoutNodeWrapper0 = this.getOuterLayoutNodeWrapper$ui_release();
        LayoutNodeWrapper layoutNodeWrapper1 = this.getInnerLayoutNodeWrapper$ui_release();
        while(!Intrinsics.areEqual(layoutNodeWrapper0, layoutNodeWrapper1)) {
            this.wrapperCache.add(((DelegatingLayoutNodeWrapper)layoutNodeWrapper0));
            layoutNodeWrapper0 = layoutNodeWrapper0.getWrapped$ui_release();
            Intrinsics.checkNotNull(layoutNodeWrapper0);
        }
    }

    private final String debugTreeToString(int v) {
        StringBuilder stringBuilder0 = new StringBuilder();
        if(v > 0) {
            int v1 = 0;
            while(true) {
                ++v1;
                stringBuilder0.append("  ");
                if(v1 >= v) {
                    break;
                }
            }
        }
        stringBuilder0.append("|-");
        stringBuilder0.append(this.toString());
        stringBuilder0.append('\n');
        MutableVector mutableVector0 = this.get_children$ui_release();
        int v2 = mutableVector0.getSize();
        if(v2 > 0) {
            Object[] arr_object = mutableVector0.getContent();
            int v3 = 0;
            while(true) {
                stringBuilder0.append(((LayoutNode)arr_object[v3]).debugTreeToString(v + 1));
                ++v3;
                if(v3 >= v2) {
                    break;
                }
            }
        }
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "tree.toString()");
        if(v == 0) {
            s = s.substring(0, s.length() - 1);
            Intrinsics.checkNotNullExpressionValue(s, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        return s;
    }

    static String debugTreeToString$default(LayoutNode layoutNode0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        return layoutNode0.debugTreeToString(v);
    }

    public final void detach$ui_release() {
        Owner owner0 = this.owner;
        String s = null;
        if(owner0 == null) {
            LayoutNode layoutNode0 = this.getParent$ui_release();
            if(layoutNode0 != null) {
                s = LayoutNode.debugTreeToString$default(layoutNode0, 0, 1, null);
            }
            throw new IllegalStateException(("Cannot detach node that is already detached!  Tree: " + s).toString());
        }
        LayoutNode layoutNode1 = this.getParent$ui_release();
        if(layoutNode1 != null) {
            layoutNode1.invalidateLayer$ui_release();
            layoutNode1.requestRemeasure$ui_release();
        }
        this.alignmentLines.reset$ui_release();
        Function1 function10 = this.onDetach;
        if(function10 != null) {
            function10.invoke(owner0);
        }
        LayoutNodeWrapper layoutNodeWrapper0 = this.getOuterLayoutNodeWrapper$ui_release();
        LayoutNodeWrapper layoutNodeWrapper1 = this.getInnerLayoutNodeWrapper$ui_release();
        while(!Intrinsics.areEqual(layoutNodeWrapper0, layoutNodeWrapper1)) {
            layoutNodeWrapper0.detach();
            layoutNodeWrapper0 = layoutNodeWrapper0.getWrapped$ui_release();
            Intrinsics.checkNotNull(layoutNodeWrapper0);
        }
        this.innerLayoutNodeWrapper.detach();
        if(SemanticsNodeKt.getOuterSemantics(this) != null) {
            owner0.onSemanticsChange();
        }
        owner0.onDetach(this);
        this.owner = null;
        this.depth = 0;
        MutableVector mutableVector0 = this._foldedChildren;
        int v = mutableVector0.getSize();
        if(v > 0) {
            Object[] arr_object = mutableVector0.getContent();
            int v1 = 0;
            while(true) {
                ((LayoutNode)arr_object[v1]).detach$ui_release();
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
        this.placeOrder = 0x7FFFFFFF;
        this.previousPlaceOrder = 0x7FFFFFFF;
        this.isPlaced = false;
    }

    public final void dispatchOnPositionedCallbacks$ui_release() {
        if(this.layoutState != LayoutState.Ready) {
            return;
        }
        if(!this.isPlaced()) {
            return;
        }
        MutableVector mutableVector0 = this.onPositionedCallbacks;
        if(mutableVector0 != null) {
            int v = mutableVector0.getSize();
            if(v > 0) {
                Object[] arr_object = mutableVector0.getContent();
                int v1 = 0;
                while(true) {
                    OnGloballyPositionedModifierWrapper onGloballyPositionedModifierWrapper0 = (OnGloballyPositionedModifierWrapper)arr_object[v1];
                    ((OnGloballyPositionedModifier)onGloballyPositionedModifierWrapper0.getModifier()).onGloballyPositioned(onGloballyPositionedModifierWrapper0);
                    ++v1;
                    if(v1 >= v) {
                        break;
                    }
                }
            }
        }
    }

    public final void draw$ui_release(Canvas canvas0) {
        Intrinsics.checkNotNullParameter(canvas0, "canvas");
        this.getOuterLayoutNodeWrapper$ui_release().draw(canvas0);
    }

    private final void forEachDelegate(Function1 function10) {
        LayoutNodeWrapper layoutNodeWrapper0 = this.getOuterLayoutNodeWrapper$ui_release();
        LayoutNodeWrapper layoutNodeWrapper1 = this.getInnerLayoutNodeWrapper$ui_release();
        while(!Intrinsics.areEqual(layoutNodeWrapper0, layoutNodeWrapper1)) {
            function10.invoke(layoutNodeWrapper0);
            layoutNodeWrapper0 = layoutNodeWrapper0.getWrapped$ui_release();
            Intrinsics.checkNotNull(layoutNodeWrapper0);
        }
    }

    private final void forEachDelegateIncludingInner(Function1 function10) {
        LayoutNodeWrapper layoutNodeWrapper0 = this.getOuterLayoutNodeWrapper$ui_release();
        LayoutNodeWrapper layoutNodeWrapper1 = this.getInnerLayoutNodeWrapper$ui_release().getWrapped$ui_release();
        while(!Intrinsics.areEqual(layoutNodeWrapper0, layoutNodeWrapper1) && layoutNodeWrapper0 != null) {
            function10.invoke(layoutNodeWrapper0);
            layoutNodeWrapper0 = layoutNodeWrapper0.getWrapped$ui_release();
        }
    }

    @Override  // androidx.compose.ui.layout.Remeasurement
    public void forceRemeasure() {
        this.requestRemeasure$ui_release();
        Owner owner0 = this.owner;
        if(owner0 != null) {
            owner0.measureAndLayout();
        }
    }

    public final LayoutNodeAlignmentLines getAlignmentLines$ui_release() {
        return this.alignmentLines;
    }

    public final boolean getCanMultiMeasure$ui_release() {
        return this.canMultiMeasure;
    }

    @Deprecated(message = "Temporary API to support ConstraintLayout prototyping.")
    public static void getCanMultiMeasure$ui_release$annotations() {
    }

    public final List getChildren$ui_release() {
        return this.get_children$ui_release().asMutableList();
    }

    @Override  // androidx.compose.ui.layout.LayoutInfo
    public LayoutCoordinates getCoordinates() {
        return this.innerLayoutNodeWrapper;
    }

    @Override  // androidx.compose.ui.node.ComposeUiNode
    public Density getDensity() {
        return this.density;
    }

    public final int getDepth$ui_release() {
        return this.depth;
    }

    public final List getFoldedChildren$ui_release() {
        return this._foldedChildren.asMutableList();
    }

    @Override  // androidx.compose.ui.layout.LayoutInfo
    public int getHeight() {
        return this.outerMeasurablePlaceable.getHeight();
    }

    public final LayoutNodeWrapper getInnerLayerWrapper$ui_release() {
        if(this.innerLayerWrapperIsDirty) {
            LayoutNodeWrapper layoutNodeWrapper0 = this.innerLayoutNodeWrapper;
            LayoutNodeWrapper layoutNodeWrapper1 = this.getOuterLayoutNodeWrapper$ui_release().getWrappedBy$ui_release();
            this._innerLayerWrapper = null;
            while(!Intrinsics.areEqual(layoutNodeWrapper0, layoutNodeWrapper1)) {
                if((layoutNodeWrapper0 == null ? null : layoutNodeWrapper0.getLayer()) != null) {
                    this._innerLayerWrapper = layoutNodeWrapper0;
                    break;
                }
                layoutNodeWrapper0 = layoutNodeWrapper0 == null ? null : layoutNodeWrapper0.getWrappedBy$ui_release();
            }
        }
        LayoutNodeWrapper layoutNodeWrapper2 = this._innerLayerWrapper;
        if(layoutNodeWrapper2 != null && layoutNodeWrapper2.getLayer() == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        return layoutNodeWrapper2;
    }

    public final boolean getInnerLayerWrapperIsDirty$ui_release() {
        return this.innerLayerWrapperIsDirty;
    }

    public final LayoutNodeWrapper getInnerLayoutNodeWrapper$ui_release() {
        return this.innerLayoutNodeWrapper;
    }

    public final IntrinsicsPolicy getIntrinsicsPolicy$ui_release() {
        return this.intrinsicsPolicy;
    }

    @Override  // androidx.compose.ui.node.ComposeUiNode
    public LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    public final LayoutState getLayoutState$ui_release() {
        return this.layoutState;
    }

    public final LayoutNodeDrawScope getMDrawScope$ui_release() {
        return this.mDrawScope;
    }

    @Override  // androidx.compose.ui.node.ComposeUiNode
    public MeasurePolicy getMeasurePolicy() {
        return this.measurePolicy;
    }

    public final MeasureScope getMeasureScope$ui_release() {
        return this.measureScope;
    }

    public final UsageByParent getMeasuredByParent$ui_release() {
        return this.measuredByParent;
    }

    @Override  // androidx.compose.ui.node.ComposeUiNode
    public Modifier getModifier() {
        return this.modifier;
    }

    @Override  // androidx.compose.ui.layout.LayoutInfo
    public List getModifierInfo() {
        MutableVector mutableVector0 = new MutableVector(new ModifierInfo[16], 0);
        LayoutNodeWrapper layoutNodeWrapper0 = this.getOuterLayoutNodeWrapper$ui_release();
        LayoutNodeWrapper layoutNodeWrapper1 = this.getInnerLayoutNodeWrapper$ui_release();
        while(!Intrinsics.areEqual(layoutNodeWrapper0, layoutNodeWrapper1)) {
            mutableVector0.add(new ModifierInfo(((DelegatingLayoutNodeWrapper)layoutNodeWrapper0).getModifier(), layoutNodeWrapper0, layoutNodeWrapper0.getLayer()));
            layoutNodeWrapper0 = layoutNodeWrapper0.getWrapped$ui_release();
            Intrinsics.checkNotNull(layoutNodeWrapper0);
        }
        return mutableVector0.asMutableList();
    }

    public final boolean getNeedsOnPositionedDispatch$ui_release() {
        return this.needsOnPositionedDispatch;
    }

    public final Function1 getOnAttach$ui_release() {
        return this.onAttach;
    }

    public final Function1 getOnDetach$ui_release() {
        return this.onDetach;
    }

    private final MutableVector getOrCreateOnPositionedCallbacks() {
        MutableVector mutableVector0 = this.onPositionedCallbacks;
        if(mutableVector0 == null) {
            mutableVector0 = new MutableVector(new OnGloballyPositionedModifierWrapper[16], 0);
            this.onPositionedCallbacks = mutableVector0;
        }
        return mutableVector0;
    }

    public final LayoutNodeWrapper getOuterLayoutNodeWrapper$ui_release() {
        return this.outerMeasurablePlaceable.getOuterWrapper();
    }

    public final Owner getOwner$ui_release() {
        return this.owner;
    }

    public final LayoutNode getParent$ui_release() {
        LayoutNode layoutNode0 = this._foldedParent;
        if(layoutNode0 != null && layoutNode0.isVirtual) {
            return layoutNode0 == null ? null : layoutNode0.getParent$ui_release();
        }
        return layoutNode0;
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public Object getParentData() {
        return this.outerMeasurablePlaceable.getParentData();
    }

    @Override  // androidx.compose.ui.layout.LayoutInfo
    public LayoutInfo getParentInfo() {
        return this.getParent$ui_release();
    }

    public final int getPlaceOrder$ui_release() {
        return this.placeOrder;
    }

    public final boolean getWasMeasuredDuringThisIteration$ui_release() {
        return LayoutNodeKt.requireOwner(this).getMeasureIteration() == this.outerMeasurablePlaceable.getMeasureIteration();
    }

    @Override  // androidx.compose.ui.layout.LayoutInfo
    public int getWidth() {
        return this.outerMeasurablePlaceable.getWidth();
    }

    public final MutableVector getZSortedChildren() {
        if(this.zSortedChildrenInvalidated) {
            this._zSortedChildren.clear();
            MutableVector mutableVector0 = this.get_children$ui_release();
            this._zSortedChildren.addAll(this._zSortedChildren.getSize(), mutableVector0);
            this._zSortedChildren.sortWith(this.ZComparator);
            this.zSortedChildrenInvalidated = false;
        }
        return this._zSortedChildren;
    }

    public static void getZSortedChildren$annotations() {
    }

    public final MutableVector get_children$ui_release() {
        if(this.virtualChildrenCount == 0) {
            return this._foldedChildren;
        }
        this.recreateUnfoldedChildrenIfDirty();
        MutableVector mutableVector0 = this._unfoldedChildren;
        Intrinsics.checkNotNull(mutableVector0);
        return mutableVector0;
    }

    public final void handleMeasureResult$ui_release(MeasureResult measureResult0) {
        Intrinsics.checkNotNullParameter(measureResult0, "measureResult");
        this.innerLayoutNodeWrapper.setMeasureResult$ui_release(measureResult0);
    }

    private final boolean hasNewPositioningCallback() {
        return ((Boolean)this.getModifier().foldOut(Boolean.FALSE, new Function2() {
            final MutableVector $onPositionedCallbacks;

            {
                this.$onPositionedCallbacks = mutableVector0;
                super(2);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                return Boolean.valueOf(this.invoke(((Element)object0), ((Boolean)object1).booleanValue()));
            }

            public final boolean invoke(Element modifier$Element0, boolean z) {
                Intrinsics.checkNotNullParameter(modifier$Element0, "mod");
                if(!z) {
                    if(modifier$Element0 instanceof OnGloballyPositionedModifier) {
                        MutableVector mutableVector0 = this.$onPositionedCallbacks;
                        if(mutableVector0 != null) {
                            int v = mutableVector0.getSize();
                            if(v > 0) {
                                Object[] arr_object = mutableVector0.getContent();
                                int v1 = 0;
                                while(true) {
                                    Object object0 = arr_object[v1];
                                    if(Intrinsics.areEqual(modifier$Element0, ((OnGloballyPositionedModifierWrapper)object0).getModifier())) {
                                        return object0 == null;
                                    }
                                    ++v1;
                                    if(v1 >= v) {
                                        break;
                                    }
                                }
                            }
                        }
                        return true;
                    }
                    return false;
                }
                return true;
            }
        })).booleanValue();
    }

    public final void hitTest-3MmeM6k$ui_release(long v, List list0) {
        Intrinsics.checkNotNullParameter(list0, "hitPointerInputFilters");
        this.getOuterLayoutNodeWrapper$ui_release().hitTest-3MmeM6k(this.getOuterLayoutNodeWrapper$ui_release().fromParentPosition-MK-Hz9U(v), list0);
    }

    public final void hitTestSemantics-3MmeM6k$ui_release(long v, List list0) {
        Intrinsics.checkNotNullParameter(list0, "hitSemanticsWrappers");
        this.getOuterLayoutNodeWrapper$ui_release().hitTestSemantics-3MmeM6k(this.getOuterLayoutNodeWrapper$ui_release().fromParentPosition-MK-Hz9U(v), list0);
    }

    public final void ignoreRemeasureRequests$ui_release(Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "block");
        this.ignoreRemeasureRequests = true;
        function00.invoke();
        this.ignoreRemeasureRequests = false;
    }

    public final void insertAt$ui_release(int v, LayoutNode layoutNode0) {
        Intrinsics.checkNotNullParameter(layoutNode0, "instance");
        String s = null;
        if(layoutNode0._foldedParent != null) {
            StringBuilder stringBuilder0 = new StringBuilder("Cannot insert ");
            stringBuilder0.append(layoutNode0);
            stringBuilder0.append(" because it already has a parent. This tree: ");
            stringBuilder0.append(LayoutNode.debugTreeToString$default(this, 0, 1, null));
            stringBuilder0.append(" Other tree: ");
            LayoutNode layoutNode1 = layoutNode0._foldedParent;
            if(layoutNode1 != null) {
                s = LayoutNode.debugTreeToString$default(layoutNode1, 0, 1, null);
            }
            stringBuilder0.append(s);
            throw new IllegalStateException(stringBuilder0.toString().toString());
        }
        if(layoutNode0.owner != null) {
            throw new IllegalStateException(("Cannot insert " + layoutNode0 + " because it already has an owner. This tree: " + LayoutNode.debugTreeToString$default(this, 0, 1, null) + " Other tree: " + LayoutNode.debugTreeToString$default(layoutNode0, 0, 1, null)).toString());
        }
        layoutNode0._foldedParent = this;
        this._foldedChildren.add(v, layoutNode0);
        this.onZSortedChildrenInvalidated();
        if(layoutNode0.isVirtual) {
            if(!this.isVirtual == 0) {
                throw new IllegalArgumentException("Virtual LayoutNode can\'t be added into a virtual parent");
            }
            ++this.virtualChildrenCount;
        }
        this.invalidateUnfoldedVirtualChildren();
        layoutNode0.getOuterLayoutNodeWrapper$ui_release().setWrappedBy$ui_release(this.innerLayoutNodeWrapper);
        Owner owner0 = this.owner;
        if(owner0 != null) {
            layoutNode0.attach$ui_release(owner0);
        }
    }

    public final void invalidateLayer$ui_release() {
        LayoutNodeWrapper layoutNodeWrapper0 = this.getInnerLayerWrapper$ui_release();
        if(layoutNodeWrapper0 != null) {
            layoutNodeWrapper0.invalidateLayer();
            return;
        }
        LayoutNode layoutNode0 = this.getParent$ui_release();
        if(layoutNode0 != null) {
            layoutNode0.invalidateLayer$ui_release();
        }
    }

    public final void invalidateLayers$ui_release() {
        LayoutNodeWrapper layoutNodeWrapper0 = this.getOuterLayoutNodeWrapper$ui_release();
        LayoutNodeWrapper layoutNodeWrapper1 = this.getInnerLayoutNodeWrapper$ui_release();
        while(!Intrinsics.areEqual(layoutNodeWrapper0, layoutNodeWrapper1)) {
            OwnedLayer ownedLayer0 = layoutNodeWrapper0.getLayer();
            if(ownedLayer0 != null) {
                ownedLayer0.invalidate();
            }
            layoutNodeWrapper0 = layoutNodeWrapper0.getWrapped$ui_release();
            Intrinsics.checkNotNull(layoutNodeWrapper0);
        }
        OwnedLayer ownedLayer1 = this.innerLayoutNodeWrapper.getLayer();
        if(ownedLayer1 != null) {
            ownedLayer1.invalidate();
        }
    }

    private final void invalidateUnfoldedVirtualChildren() {
        if(this.virtualChildrenCount > 0) {
            this.unfoldedVirtualChildrenListDirty = true;
        }
        if(this.isVirtual) {
            LayoutNode layoutNode0 = this.getParent$ui_release();
            if(layoutNode0 != null) {
                layoutNode0.unfoldedVirtualChildrenListDirty = true;
            }
        }
    }

    @Override  // androidx.compose.ui.layout.LayoutInfo
    public boolean isAttached() {
        return this.owner != null;
    }

    @Override  // androidx.compose.ui.layout.LayoutInfo
    public boolean isPlaced() {
        return this.isPlaced;
    }

    @Override  // androidx.compose.ui.node.OwnerScope
    public boolean isValid() {
        return this.isAttached();
    }

    public final void layoutChildren$ui_release() {
        this.alignmentLines.recalculateQueryOwner$ui_release();
        if(this.layoutState == LayoutState.NeedsRelayout) {
            this.onBeforeLayoutChildren();
        }
        if(this.layoutState == LayoutState.NeedsRelayout) {
            this.layoutState = LayoutState.LayingOut;
            LayoutNodeKt.requireOwner(this).getSnapshotObserver().observeLayoutSnapshotReads$ui_release(this, new Function0() {
                {
                    LayoutNode.this = layoutNode0;
                    super(0);
                }

                @Override  // kotlin.jvm.functions.Function0
                public Object invoke() {
                    this.invoke();
                    return Unit.INSTANCE;
                }

                public final void invoke() {
                    int v = 0;
                    LayoutNode.this.nextChildPlaceOrder = 0;
                    MutableVector mutableVector0 = LayoutNode.this.get_children$ui_release();
                    int v1 = mutableVector0.getSize();
                    if(v1 > 0) {
                        Object[] arr_object = mutableVector0.getContent();
                        int v2 = 0;
                        while(true) {
                            LayoutNode layoutNode0 = (LayoutNode)arr_object[v2];
                            layoutNode0.previousPlaceOrder = layoutNode0.getPlaceOrder$ui_release();
                            layoutNode0.placeOrder = 0x7FFFFFFF;
                            layoutNode0.getAlignmentLines$ui_release().setUsedDuringParentLayout$ui_release(false);
                            ++v2;
                            if(v2 >= v1) {
                                break;
                            }
                        }
                    }
                    LayoutNode.this.getInnerLayoutNodeWrapper$ui_release().getMeasureResult().placeChildren();
                    MutableVector mutableVector1 = LayoutNode.this.get_children$ui_release();
                    LayoutNode layoutNode1 = LayoutNode.this;
                    int v3 = mutableVector1.getSize();
                    if(v3 > 0) {
                        Object[] arr_object1 = mutableVector1.getContent();
                        while(true) {
                            LayoutNode layoutNode2 = (LayoutNode)arr_object1[v];
                            if(layoutNode2.previousPlaceOrder != layoutNode2.getPlaceOrder$ui_release()) {
                                layoutNode1.onZSortedChildrenInvalidated();
                                layoutNode1.invalidateLayer$ui_release();
                                if(layoutNode2.getPlaceOrder$ui_release() == 0x7FFFFFFF) {
                                    layoutNode2.markSubtreeAsNotPlaced();
                                }
                            }
                            layoutNode2.getAlignmentLines$ui_release().setPreviousUsedDuringParentLayout$ui_release(layoutNode2.getAlignmentLines$ui_release().getUsedDuringParentLayout$ui_release());
                            ++v;
                            if(v >= v3) {
                                break;
                            }
                        }
                    }
                }
            });
            this.layoutState = LayoutState.Ready;
        }
        if(this.alignmentLines.getUsedDuringParentLayout$ui_release()) {
            this.alignmentLines.setPreviousUsedDuringParentLayout$ui_release(true);
        }
        if(this.alignmentLines.getDirty$ui_release() && this.alignmentLines.getRequired$ui_release()) {
            this.alignmentLines.recalculate();
        }
    }

    private final void markNodeAndSubtreeAsPlaced() {
        this.isPlaced = true;
        LayoutNodeWrapper layoutNodeWrapper0 = this.getOuterLayoutNodeWrapper$ui_release();
        LayoutNodeWrapper layoutNodeWrapper1 = this.getInnerLayoutNodeWrapper$ui_release().getWrapped$ui_release();
        while(!Intrinsics.areEqual(layoutNodeWrapper0, layoutNodeWrapper1) && layoutNodeWrapper0 != null) {
            if(layoutNodeWrapper0.getLastLayerDrawingWasSkipped$ui_release()) {
                layoutNodeWrapper0.invalidateLayer();
            }
            layoutNodeWrapper0 = layoutNodeWrapper0.getWrapped$ui_release();
        }
        MutableVector mutableVector0 = this.get_children$ui_release();
        int v = mutableVector0.getSize();
        if(v > 0) {
            Object[] arr_object = mutableVector0.getContent();
            int v1 = 0;
            while(true) {
                LayoutNode layoutNode0 = (LayoutNode)arr_object[v1];
                if(layoutNode0.getPlaceOrder$ui_release() != 0x7FFFFFFF) {
                    layoutNode0.markNodeAndSubtreeAsPlaced();
                    this.rescheduleRemeasureOrRelayout(layoutNode0);
                }
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
    }

    private final void markReusedModifiers(Modifier modifier0) {
        MutableVector mutableVector0 = this.wrapperCache;
        int v = mutableVector0.getSize();
        if(v > 0) {
            Object[] arr_object = mutableVector0.getContent();
            int v1 = 0;
            while(true) {
                ((DelegatingLayoutNodeWrapper)arr_object[v1]).setToBeReusedForSameModifier(false);
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
        Function2 function20 = new Function2() {
            {
                LayoutNode.this = layoutNode0;
                super(2);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                this.invoke(((Unit)object0), ((Element)object1));
                return Unit.INSTANCE;
            }

            public final void invoke(Unit unit0, Element modifier$Element0) {
                Object object1;
                Intrinsics.checkNotNullParameter(unit0, "$noName_0");
                Intrinsics.checkNotNullParameter(modifier$Element0, "mod");
                MutableVector mutableVector0 = LayoutNode.this.wrapperCache;
                int v = mutableVector0.getSize();
                if(v > 0) {
                    int v1 = v - 1;
                    Object[] arr_object = mutableVector0.getContent();
                    while(true) {
                        Object object0 = arr_object[v1];
                        if(((DelegatingLayoutNodeWrapper)object0).getModifier() == modifier$Element0 && !((DelegatingLayoutNodeWrapper)object0).getToBeReusedForSameModifier()) {
                            object1 = object0;
                            goto label_14;
                        }
                        --v1;
                        if(v1 < 0) {
                            break;
                        }
                    }
                }
                object1 = null;
            label_14:
                DelegatingLayoutNodeWrapper delegatingLayoutNodeWrapper0 = (DelegatingLayoutNodeWrapper)object1;
                while(delegatingLayoutNodeWrapper0 != null) {
                    delegatingLayoutNodeWrapper0.setToBeReusedForSameModifier(true);
                    if(delegatingLayoutNodeWrapper0.isChained()) {
                        LayoutNodeWrapper layoutNodeWrapper0 = delegatingLayoutNodeWrapper0.getWrappedBy$ui_release();
                        if(layoutNodeWrapper0 instanceof DelegatingLayoutNodeWrapper) {
                            delegatingLayoutNodeWrapper0 = (DelegatingLayoutNodeWrapper)layoutNodeWrapper0;
                            continue;
                        }
                    }
                    delegatingLayoutNodeWrapper0 = null;
                }
            }
        };
        modifier0.foldIn(Unit.INSTANCE, function20);
    }

    private final void markSubtreeAsNotPlaced() {
        if(this.isPlaced()) {
            int v = 0;
            this.isPlaced = false;
            MutableVector mutableVector0 = this.get_children$ui_release();
            int v1 = mutableVector0.getSize();
            if(v1 > 0) {
                Object[] arr_object = mutableVector0.getContent();
                while(true) {
                    ((LayoutNode)arr_object[v]).markSubtreeAsNotPlaced();
                    ++v;
                    if(v >= v1) {
                        break;
                    }
                }
            }
        }
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int v) {
        return this.outerMeasurablePlaceable.maxIntrinsicHeight(v);
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int v) {
        return this.outerMeasurablePlaceable.maxIntrinsicWidth(v);
    }

    @Override  // androidx.compose.ui.layout.Measurable
    public Placeable measure-BRTryo0(long v) {
        return this.outerMeasurablePlaceable.measure-BRTryo0(v);
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int v) {
        return this.outerMeasurablePlaceable.minIntrinsicHeight(v);
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int v) {
        return this.outerMeasurablePlaceable.minIntrinsicWidth(v);
    }

    public final void move$ui_release(int v, int v1, int v2) {
        if(v == v1) {
            return;
        }
        if(v2 > 0) {
            for(int v3 = 0; true; ++v3) {
                LayoutNode layoutNode0 = (LayoutNode)this._foldedChildren.removeAt((v <= v1 ? v : v + v3));
                this._foldedChildren.add((v <= v1 ? v1 + v2 - 2 : v3 + v1), layoutNode0);
                if(v3 + 1 >= v2) {
                    break;
                }
            }
        }
        this.onZSortedChildrenInvalidated();
        this.invalidateUnfoldedVirtualChildren();
        this.requestRemeasure$ui_release();
    }

    public final void onAlignmentsChanged$ui_release() {
        if(this.alignmentLines.getDirty$ui_release()) {
            return;
        }
        this.alignmentLines.setDirty$ui_release(true);
        LayoutNode layoutNode0 = this.getParent$ui_release();
        if(layoutNode0 == null) {
            return;
        }
        if(this.alignmentLines.getUsedDuringParentMeasurement$ui_release()) {
            layoutNode0.requestRemeasure$ui_release();
        }
        else if(this.alignmentLines.getPreviousUsedDuringParentLayout$ui_release()) {
            layoutNode0.requestRelayout$ui_release();
        }
        if(this.alignmentLines.getUsedByModifierMeasurement$ui_release()) {
            this.requestRemeasure$ui_release();
        }
        if(this.alignmentLines.getUsedByModifierLayout$ui_release()) {
            layoutNode0.requestRelayout$ui_release();
        }
        layoutNode0.onAlignmentsChanged$ui_release();
    }

    private final void onBeforeLayoutChildren() {
        MutableVector mutableVector0 = this.get_children$ui_release();
        int v = mutableVector0.getSize();
        if(v > 0) {
            Object[] arr_object = mutableVector0.getContent();
            int v1 = 0;
            while(true) {
                LayoutNode layoutNode0 = (LayoutNode)arr_object[v1];
                if(layoutNode0.getLayoutState$ui_release() == LayoutState.NeedsRemeasure && layoutNode0.getMeasuredByParent$ui_release() == UsageByParent.InMeasureBlock && LayoutNode.remeasure-_Sx5XlM$ui_release$default(layoutNode0, null, 1, null)) {
                    this.requestRemeasure$ui_release();
                }
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
    }

    private final void onDensityOrLayoutDirectionChanged() {
        this.requestRemeasure$ui_release();
        LayoutNode layoutNode0 = this.getParent$ui_release();
        if(layoutNode0 != null) {
            layoutNode0.invalidateLayer$ui_release();
        }
        this.invalidateLayers$ui_release();
    }

    public final void onNodePlaced$ui_release() {
        LayoutNode layoutNode0 = this.getParent$ui_release();
        float f = this.innerLayoutNodeWrapper.getZIndex();
        LayoutNodeWrapper layoutNodeWrapper0 = this.getOuterLayoutNodeWrapper$ui_release();
        LayoutNodeWrapper layoutNodeWrapper1 = this.getInnerLayoutNodeWrapper$ui_release();
        while(!Intrinsics.areEqual(layoutNodeWrapper0, layoutNodeWrapper1)) {
            f += layoutNodeWrapper0.getZIndex();
            layoutNodeWrapper0 = layoutNodeWrapper0.getWrapped$ui_release();
            Intrinsics.checkNotNull(layoutNodeWrapper0);
        }
        if(f != this.zIndex) {
            this.zIndex = f;
            if(layoutNode0 != null) {
                layoutNode0.onZSortedChildrenInvalidated();
            }
            if(layoutNode0 != null) {
                layoutNode0.invalidateLayer$ui_release();
            }
        }
        if(!this.isPlaced()) {
            if(layoutNode0 != null) {
                layoutNode0.invalidateLayer$ui_release();
            }
            this.markNodeAndSubtreeAsPlaced();
        }
        if(layoutNode0 == null) {
            this.placeOrder = 0;
        }
        else if(layoutNode0.layoutState == LayoutState.LayingOut) {
            if(this.placeOrder != 0x7FFFFFFF) {
                throw new IllegalStateException("Place was called on a node which was placed already");
            }
            this.placeOrder = layoutNode0.nextChildPlaceOrder;
            ++layoutNode0.nextChildPlaceOrder;
        }
        this.layoutChildren$ui_release();
    }

    private final void onZSortedChildrenInvalidated() {
        if(this.isVirtual) {
            LayoutNode layoutNode0 = this.getParent$ui_release();
            if(layoutNode0 != null) {
                layoutNode0.onZSortedChildrenInvalidated();
            }
        }
        else {
            this.zSortedChildrenInvalidated = true;
        }
    }

    public final void place$ui_release(int v, int v1) {
        int v2 = this.outerMeasurablePlaceable.getMeasuredWidth();
        LayoutDirection layoutDirection0 = PlacementScope.Companion.getParentLayoutDirection();
        PlacementScope.parentWidth = v2;
        PlacementScope.parentLayoutDirection = this.getLayoutDirection();
        PlacementScope.placeRelative$default(PlacementScope.Companion, this.outerMeasurablePlaceable, v, v1, 0.0f, 4, null);
        PlacementScope.parentWidth = 0;
        PlacementScope.parentLayoutDirection = layoutDirection0;
    }

    private final void recreateUnfoldedChildrenIfDirty() {
        if(this.unfoldedVirtualChildrenListDirty) {
            int v = 0;
            this.unfoldedVirtualChildrenListDirty = false;
            MutableVector mutableVector0 = this._unfoldedChildren;
            if(mutableVector0 == null) {
                mutableVector0 = new MutableVector(new LayoutNode[16], 0);
                this._unfoldedChildren = mutableVector0;
            }
            mutableVector0.clear();
            MutableVector mutableVector1 = this._foldedChildren;
            int v1 = mutableVector1.getSize();
            if(v1 > 0) {
                Object[] arr_object = mutableVector1.getContent();
                while(true) {
                    LayoutNode layoutNode0 = (LayoutNode)arr_object[v];
                    if(layoutNode0.isVirtual) {
                        mutableVector0.addAll(mutableVector0.getSize(), layoutNode0.get_children$ui_release());
                    }
                    else {
                        mutableVector0.add(layoutNode0);
                    }
                    ++v;
                    if(v >= v1) {
                        break;
                    }
                }
            }
        }
    }

    public final boolean remeasure-_Sx5XlM$ui_release(Constraints constraints0) {
        return constraints0 == null ? false : this.outerMeasurablePlaceable.remeasure-BRTryo0(constraints0.unbox-impl());
    }

    public static boolean remeasure-_Sx5XlM$ui_release$default(LayoutNode layoutNode0, Constraints constraints0, int v, Object object0) {
        if((v & 1) != 0) {
            constraints0 = layoutNode0.outerMeasurablePlaceable.getLastConstraints-DWUhwKw();
        }
        return layoutNode0.remeasure-_Sx5XlM$ui_release(constraints0);
    }

    public final void removeAll$ui_release() {
        boolean z = this.owner != null;
        int v = this._foldedChildren.getSize() - 1;
        if(v >= 0) {
            while(true) {
                LayoutNode layoutNode0 = (LayoutNode)this._foldedChildren.getContent()[v];
                if(z) {
                    layoutNode0.detach$ui_release();
                }
                layoutNode0._foldedParent = null;
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        this._foldedChildren.clear();
        this.onZSortedChildrenInvalidated();
        this.virtualChildrenCount = 0;
        this.invalidateUnfoldedVirtualChildren();
    }

    public final void removeAt$ui_release(int v, int v1) {
        boolean z = false;
        if(v1 < 0) {
            throw new IllegalArgumentException(("count (" + v1 + ") must be greater than 0").toString());
        }
        if(this.owner != null) {
            z = true;
        }
        int v2 = v1 + v - 1;
        if(v <= v2) {
            while(true) {
                LayoutNode layoutNode0 = (LayoutNode)this._foldedChildren.removeAt(v2);
                this.onZSortedChildrenInvalidated();
                if(z) {
                    layoutNode0.detach$ui_release();
                }
                layoutNode0._foldedParent = null;
                if(layoutNode0.isVirtual) {
                    --this.virtualChildrenCount;
                }
                this.invalidateUnfoldedVirtualChildren();
                if(v2 == v) {
                    break;
                }
                --v2;
            }
        }
    }

    public final void replace$ui_release() {
        this.outerMeasurablePlaceable.replace();
    }

    public final void requestRelayout$ui_release() {
        if(!this.isVirtual) {
            Owner owner0 = this.owner;
            if(owner0 != null) {
                owner0.onRequestRelayout(this);
            }
        }
    }

    public final void requestRemeasure$ui_release() {
        Owner owner0 = this.owner;
        if(owner0 == null) {
            return;
        }
        if(!this.ignoreRemeasureRequests && !this.isVirtual) {
            owner0.onRequestMeasure(this);
        }
    }

    private final void rescheduleRemeasureOrRelayout(LayoutNode layoutNode0) {
        int v = WhenMappings.$EnumSwitchMapping$0[layoutNode0.layoutState.ordinal()];
        switch(v) {
            case 1: 
            case 2: {
                layoutNode0.layoutState = LayoutState.Ready;
                if(v == 1) {
                    layoutNode0.requestRemeasure$ui_release();
                    return;
                }
                layoutNode0.requestRelayout$ui_release();
                break;
            }
            case 3: {
                break;
            }
            default: {
                throw new IllegalStateException("Unexpected state " + layoutNode0.layoutState);
            }
        }
    }

    private final DelegatingLayoutNodeWrapper reuseLayoutNodeWrapper(Element modifier$Element0, LayoutNodeWrapper layoutNodeWrapper0) {
        int v2;
        if(this.wrapperCache.isEmpty()) {
            return null;
        }
        MutableVector mutableVector0 = this.wrapperCache;
        int v = mutableVector0.getSize();
        int v1 = -1;
        if(v > 0) {
            v2 = v - 1;
            Object[] arr_object = mutableVector0.getContent();
            while(true) {
                DelegatingLayoutNodeWrapper delegatingLayoutNodeWrapper0 = (DelegatingLayoutNodeWrapper)arr_object[v2];
                if(delegatingLayoutNodeWrapper0.getToBeReusedForSameModifier() && delegatingLayoutNodeWrapper0.getModifier() == modifier$Element0) {
                    goto label_13;
                }
                --v2;
                if(v2 < 0) {
                    break;
                }
            }
        }
        v2 = -1;
    label_13:
        if(v2 < 0) {
            MutableVector mutableVector1 = this.wrapperCache;
            int v3 = mutableVector1.getSize();
            if(v3 > 0) {
                int v4 = v3 - 1;
                Object[] arr_object1 = mutableVector1.getContent();
                while(true) {
                    DelegatingLayoutNodeWrapper delegatingLayoutNodeWrapper1 = (DelegatingLayoutNodeWrapper)arr_object1[v4];
                    if(!delegatingLayoutNodeWrapper1.getToBeReusedForSameModifier() && Intrinsics.areEqual(JvmActuals_jvmKt.nativeClass(delegatingLayoutNodeWrapper1.getModifier()), JvmActuals_jvmKt.nativeClass(modifier$Element0))) {
                        v1 = v4;
                        break;
                    }
                    --v4;
                    if(v4 < 0) {
                        break;
                    }
                }
            }
            v2 = v1;
        }
        if(v2 < 0) {
            return null;
        }
        DelegatingLayoutNodeWrapper delegatingLayoutNodeWrapper2 = (DelegatingLayoutNodeWrapper)this.wrapperCache.getContent()[v2];
        delegatingLayoutNodeWrapper2.setModifierTo(modifier$Element0);
        DelegatingLayoutNodeWrapper delegatingLayoutNodeWrapper3 = delegatingLayoutNodeWrapper2;
        int v5 = v2;
        while(delegatingLayoutNodeWrapper3.isChained()) {
            --v5;
            delegatingLayoutNodeWrapper3 = (DelegatingLayoutNodeWrapper)this.wrapperCache.getContent()[v5];
            delegatingLayoutNodeWrapper3.setModifierTo(modifier$Element0);
        }
        this.wrapperCache.removeRange(v5, v2 + 1);
        delegatingLayoutNodeWrapper2.setWrapped(layoutNodeWrapper0);
        layoutNodeWrapper0.setWrappedBy$ui_release(delegatingLayoutNodeWrapper2);
        return delegatingLayoutNodeWrapper3;
    }

    public final void setCanMultiMeasure$ui_release(boolean z) {
        this.canMultiMeasure = z;
    }

    @Override  // androidx.compose.ui.node.ComposeUiNode
    public void setDensity(Density density0) {
        Intrinsics.checkNotNullParameter(density0, "value");
        if(!Intrinsics.areEqual(this.density, density0)) {
            this.density = density0;
            this.onDensityOrLayoutDirectionChanged();
        }
    }

    public final void setDepth$ui_release(int v) {
        this.depth = v;
    }

    public final void setInnerLayerWrapperIsDirty$ui_release(boolean z) {
        this.innerLayerWrapperIsDirty = z;
    }

    @Override  // androidx.compose.ui.node.ComposeUiNode
    public void setLayoutDirection(LayoutDirection layoutDirection0) {
        Intrinsics.checkNotNullParameter(layoutDirection0, "value");
        if(this.layoutDirection != layoutDirection0) {
            this.layoutDirection = layoutDirection0;
            this.onDensityOrLayoutDirectionChanged();
        }
    }

    public final void setLayoutState$ui_release(LayoutState layoutNode$LayoutState0) {
        Intrinsics.checkNotNullParameter(layoutNode$LayoutState0, "<set-?>");
        this.layoutState = layoutNode$LayoutState0;
    }

    @Override  // androidx.compose.ui.node.ComposeUiNode
    public void setMeasurePolicy(MeasurePolicy measurePolicy0) {
        Intrinsics.checkNotNullParameter(measurePolicy0, "value");
        if(!Intrinsics.areEqual(this.measurePolicy, measurePolicy0)) {
            this.measurePolicy = measurePolicy0;
            this.intrinsicsPolicy.updateFrom(this.getMeasurePolicy());
            this.requestRemeasure$ui_release();
        }
    }

    public final void setMeasuredByParent$ui_release(UsageByParent layoutNode$UsageByParent0) {
        Intrinsics.checkNotNullParameter(layoutNode$UsageByParent0, "<set-?>");
        this.measuredByParent = layoutNode$UsageByParent0;
    }

    @Override  // androidx.compose.ui.node.ComposeUiNode
    public void setModifier(Modifier modifier0) {
        Intrinsics.checkNotNullParameter(modifier0, "value");
        if(Intrinsics.areEqual(modifier0, this.modifier)) {
            return;
        }
        if(!Intrinsics.areEqual(this.getModifier(), Modifier.Companion) && !this.isVirtual == 0) {
            throw new IllegalArgumentException("Modifiers are not supported on virtual LayoutNodes");
        }
        this.modifier = modifier0;
        boolean z = this.shouldInvalidateParentLayer();
        this.copyWrappersToCache();
        this.markReusedModifiers(modifier0);
        LayoutNodeWrapper layoutNodeWrapper0 = this.outerMeasurablePlaceable.getOuterWrapper();
        if(SemanticsNodeKt.getOuterSemantics(this) != null && this.isAttached()) {
            Owner owner0 = this.owner;
            Intrinsics.checkNotNull(owner0);
            owner0.onSemanticsChange();
        }
        boolean z1 = this.hasNewPositioningCallback();
        MutableVector mutableVector0 = this.onPositionedCallbacks;
        if(mutableVector0 != null) {
            mutableVector0.clear();
        }
        Function2 function20 = new Function2() {
            {
                LayoutNode.this = layoutNode0;
                super(2);
            }

            public final LayoutNodeWrapper invoke(Element modifier$Element0, LayoutNodeWrapper layoutNodeWrapper0) {
                Intrinsics.checkNotNullParameter(modifier$Element0, "mod");
                Intrinsics.checkNotNullParameter(layoutNodeWrapper0, "toWrap");
                if(modifier$Element0 instanceof RemeasurementModifier) {
                    ((RemeasurementModifier)modifier$Element0).onRemeasurementAvailable(LayoutNode.this);
                }
                DelegatingLayoutNodeWrapper delegatingLayoutNodeWrapper0 = LayoutNode.this.reuseLayoutNodeWrapper(modifier$Element0, layoutNodeWrapper0);
                if(delegatingLayoutNodeWrapper0 != null) {
                    if(delegatingLayoutNodeWrapper0 instanceof OnGloballyPositionedModifierWrapper) {
                        LayoutNode.this.getOrCreateOnPositionedCallbacks().add(delegatingLayoutNodeWrapper0);
                    }
                    return delegatingLayoutNodeWrapper0;
                }
                LayoutNodeWrapper layoutNodeWrapper1 = modifier$Element0 instanceof DrawModifier ? new ModifiedDrawNode(layoutNodeWrapper0, ((DrawModifier)modifier$Element0)) : layoutNodeWrapper0;
                if(modifier$Element0 instanceof FocusModifier) {
                    ModifiedFocusNode modifiedFocusNode0 = new ModifiedFocusNode(layoutNodeWrapper1, ((FocusModifier)modifier$Element0));
                    if(layoutNodeWrapper0 != modifiedFocusNode0.getWrapped$ui_release()) {
                        ((DelegatingLayoutNodeWrapper)modifiedFocusNode0.getWrapped$ui_release()).setChained(true);
                    }
                    layoutNodeWrapper1 = modifiedFocusNode0;
                }
                if(modifier$Element0 instanceof FocusEventModifier) {
                    ModifiedFocusEventNode modifiedFocusEventNode0 = new ModifiedFocusEventNode(layoutNodeWrapper1, ((FocusEventModifier)modifier$Element0));
                    if(layoutNodeWrapper0 != modifiedFocusEventNode0.getWrapped$ui_release()) {
                        ((DelegatingLayoutNodeWrapper)modifiedFocusEventNode0.getWrapped$ui_release()).setChained(true);
                    }
                    layoutNodeWrapper1 = modifiedFocusEventNode0;
                }
                if(modifier$Element0 instanceof FocusRequesterModifier) {
                    ModifiedFocusRequesterNode modifiedFocusRequesterNode0 = new ModifiedFocusRequesterNode(layoutNodeWrapper1, ((FocusRequesterModifier)modifier$Element0));
                    if(layoutNodeWrapper0 != modifiedFocusRequesterNode0.getWrapped$ui_release()) {
                        ((DelegatingLayoutNodeWrapper)modifiedFocusRequesterNode0.getWrapped$ui_release()).setChained(true);
                    }
                    layoutNodeWrapper1 = modifiedFocusRequesterNode0;
                }
                if(modifier$Element0 instanceof FocusOrderModifier) {
                    ModifiedFocusOrderNode modifiedFocusOrderNode0 = new ModifiedFocusOrderNode(layoutNodeWrapper1, ((FocusOrderModifier)modifier$Element0));
                    if(layoutNodeWrapper0 != modifiedFocusOrderNode0.getWrapped$ui_release()) {
                        ((DelegatingLayoutNodeWrapper)modifiedFocusOrderNode0.getWrapped$ui_release()).setChained(true);
                    }
                    layoutNodeWrapper1 = modifiedFocusOrderNode0;
                }
                if(modifier$Element0 instanceof KeyInputModifier) {
                    ModifiedKeyInputNode modifiedKeyInputNode0 = new ModifiedKeyInputNode(layoutNodeWrapper1, ((KeyInputModifier)modifier$Element0));
                    if(layoutNodeWrapper0 != modifiedKeyInputNode0.getWrapped$ui_release()) {
                        ((DelegatingLayoutNodeWrapper)modifiedKeyInputNode0.getWrapped$ui_release()).setChained(true);
                    }
                    layoutNodeWrapper1 = modifiedKeyInputNode0;
                }
                if(modifier$Element0 instanceof PointerInputModifier) {
                    PointerInputDelegatingWrapper pointerInputDelegatingWrapper0 = new PointerInputDelegatingWrapper(layoutNodeWrapper1, ((PointerInputModifier)modifier$Element0));
                    if(layoutNodeWrapper0 != pointerInputDelegatingWrapper0.getWrapped$ui_release()) {
                        ((DelegatingLayoutNodeWrapper)pointerInputDelegatingWrapper0.getWrapped$ui_release()).setChained(true);
                    }
                    layoutNodeWrapper1 = pointerInputDelegatingWrapper0;
                }
                if(modifier$Element0 instanceof NestedScrollModifier) {
                    NestedScrollDelegatingWrapper nestedScrollDelegatingWrapper0 = new NestedScrollDelegatingWrapper(layoutNodeWrapper1, ((NestedScrollModifier)modifier$Element0));
                    if(layoutNodeWrapper0 != nestedScrollDelegatingWrapper0.getWrapped$ui_release()) {
                        ((DelegatingLayoutNodeWrapper)nestedScrollDelegatingWrapper0.getWrapped$ui_release()).setChained(true);
                    }
                    layoutNodeWrapper1 = nestedScrollDelegatingWrapper0;
                }
                if(modifier$Element0 instanceof LayoutModifier) {
                    ModifiedLayoutNode modifiedLayoutNode0 = new ModifiedLayoutNode(layoutNodeWrapper1, ((LayoutModifier)modifier$Element0));
                    if(layoutNodeWrapper0 != modifiedLayoutNode0.getWrapped$ui_release()) {
                        ((DelegatingLayoutNodeWrapper)modifiedLayoutNode0.getWrapped$ui_release()).setChained(true);
                    }
                    layoutNodeWrapper1 = modifiedLayoutNode0;
                }
                if(modifier$Element0 instanceof ParentDataModifier) {
                    ModifiedParentDataNode modifiedParentDataNode0 = new ModifiedParentDataNode(layoutNodeWrapper1, ((ParentDataModifier)modifier$Element0));
                    if(layoutNodeWrapper0 != modifiedParentDataNode0.getWrapped$ui_release()) {
                        ((DelegatingLayoutNodeWrapper)modifiedParentDataNode0.getWrapped$ui_release()).setChained(true);
                    }
                    layoutNodeWrapper1 = modifiedParentDataNode0;
                }
                if(modifier$Element0 instanceof SemanticsModifier) {
                    SemanticsWrapper semanticsWrapper0 = new SemanticsWrapper(layoutNodeWrapper1, ((SemanticsModifier)modifier$Element0));
                    if(layoutNodeWrapper0 != semanticsWrapper0.getWrapped$ui_release()) {
                        ((DelegatingLayoutNodeWrapper)semanticsWrapper0.getWrapped$ui_release()).setChained(true);
                    }
                    layoutNodeWrapper1 = semanticsWrapper0;
                }
                if(modifier$Element0 instanceof OnRemeasuredModifier) {
                    RemeasureModifierWrapper remeasureModifierWrapper0 = new RemeasureModifierWrapper(layoutNodeWrapper1, ((OnRemeasuredModifier)modifier$Element0));
                    if(layoutNodeWrapper0 != remeasureModifierWrapper0.getWrapped$ui_release()) {
                        ((DelegatingLayoutNodeWrapper)remeasureModifierWrapper0.getWrapped$ui_release()).setChained(true);
                    }
                    layoutNodeWrapper1 = remeasureModifierWrapper0;
                }
                if(modifier$Element0 instanceof OnGloballyPositionedModifier) {
                    OnGloballyPositionedModifierWrapper onGloballyPositionedModifierWrapper0 = new OnGloballyPositionedModifierWrapper(layoutNodeWrapper1, ((OnGloballyPositionedModifier)modifier$Element0));
                    if(layoutNodeWrapper0 != onGloballyPositionedModifierWrapper0.getWrapped$ui_release()) {
                        ((DelegatingLayoutNodeWrapper)onGloballyPositionedModifierWrapper0.getWrapped$ui_release()).setChained(true);
                    }
                    layoutNodeWrapper1 = onGloballyPositionedModifierWrapper0;
                    LayoutNode.this.getOrCreateOnPositionedCallbacks().add(layoutNodeWrapper1);
                }
                return layoutNodeWrapper1;
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((Element)object0), ((LayoutNodeWrapper)object1));
            }
        };
        LayoutNodeWrapper layoutNodeWrapper1 = (LayoutNodeWrapper)this.getModifier().foldOut(this.innerLayoutNodeWrapper, function20);
        LayoutNode layoutNode0 = this.getParent$ui_release();
        layoutNodeWrapper1.setWrappedBy$ui_release((layoutNode0 == null ? null : layoutNode0.innerLayoutNodeWrapper));
        this.outerMeasurablePlaceable.setOuterWrapper(layoutNodeWrapper1);
        if(this.isAttached()) {
            MutableVector mutableVector1 = this.wrapperCache;
            int v = mutableVector1.getSize();
            if(v > 0) {
                Object[] arr_object = mutableVector1.getContent();
                int v1 = 0;
                while(true) {
                    ((DelegatingLayoutNodeWrapper)arr_object[v1]).detach();
                    ++v1;
                    if(v1 >= v) {
                        break;
                    }
                }
            }
            LayoutNodeWrapper layoutNodeWrapper2 = this.getOuterLayoutNodeWrapper$ui_release();
            LayoutNodeWrapper layoutNodeWrapper3 = this.getInnerLayoutNodeWrapper$ui_release();
            while(!Intrinsics.areEqual(layoutNodeWrapper2, layoutNodeWrapper3)) {
                if(!layoutNodeWrapper2.isAttached()) {
                    layoutNodeWrapper2.attach();
                }
                layoutNodeWrapper2 = layoutNodeWrapper2.getWrapped$ui_release();
                Intrinsics.checkNotNull(layoutNodeWrapper2);
            }
        }
        this.wrapperCache.clear();
        LayoutNodeWrapper layoutNodeWrapper4 = this.getOuterLayoutNodeWrapper$ui_release();
        LayoutNodeWrapper layoutNodeWrapper5 = this.getInnerLayoutNodeWrapper$ui_release();
        while(!Intrinsics.areEqual(layoutNodeWrapper4, layoutNodeWrapper5)) {
            layoutNodeWrapper4.onModifierChanged();
            layoutNodeWrapper4 = layoutNodeWrapper4.getWrapped$ui_release();
            Intrinsics.checkNotNull(layoutNodeWrapper4);
        }
        if(!Intrinsics.areEqual(layoutNodeWrapper0, this.innerLayoutNodeWrapper) || !Intrinsics.areEqual(layoutNodeWrapper1, this.innerLayoutNodeWrapper)) {
            this.requestRemeasure$ui_release();
            LayoutNode layoutNode1 = this.getParent$ui_release();
            if(layoutNode1 != null) {
                layoutNode1.requestRelayout$ui_release();
            }
        }
        else if(this.layoutState == LayoutState.Ready && z1) {
            this.requestRemeasure$ui_release();
        }
        Object object0 = this.getParentData();
        this.outerMeasurablePlaceable.recalculateParentData();
        if(!Intrinsics.areEqual(object0, this.getParentData())) {
            LayoutNode layoutNode2 = this.getParent$ui_release();
            if(layoutNode2 != null) {
                layoutNode2.requestRemeasure$ui_release();
            }
        }
        if(z || this.shouldInvalidateParentLayer()) {
            LayoutNode layoutNode3 = this.getParent$ui_release();
            if(layoutNode3 != null) {
                layoutNode3.invalidateLayer$ui_release();
            }
        }
    }

    public final void setNeedsOnPositionedDispatch$ui_release(boolean z) {
        this.needsOnPositionedDispatch = z;
    }

    public final void setOnAttach$ui_release(Function1 function10) {
        this.onAttach = function10;
    }

    public final void setOnDetach$ui_release(Function1 function10) {
        this.onDetach = function10;
    }

    private final boolean shouldInvalidateParentLayer() {
        LayoutNodeWrapper layoutNodeWrapper0 = this.getOuterLayoutNodeWrapper$ui_release();
        LayoutNodeWrapper layoutNodeWrapper1 = this.getInnerLayoutNodeWrapper$ui_release().getWrapped$ui_release();
        while(!Intrinsics.areEqual(layoutNodeWrapper0, layoutNodeWrapper1) && layoutNodeWrapper0 != null) {
            if(layoutNodeWrapper0.getLayer() != null) {
                return false;
            }
            if(layoutNodeWrapper0 instanceof ModifiedDrawNode) {
                return true;
            }
            layoutNodeWrapper0 = layoutNodeWrapper0.getWrapped$ui_release();
        }
        return true;
    }

    @Override
    public String toString() {
        return JvmActuals_jvmKt.simpleIdentityToString(this, null) + " children: " + this.getChildren$ui_release().size() + " measurePolicy: " + this.getMeasurePolicy();
    }

    public final void withNoSnapshotReadObservation$ui_release(Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "block");
        LayoutNodeKt.requireOwner(this).getSnapshotObserver().withNoSnapshotReadObservation$ui_release(function00);
    }
}

