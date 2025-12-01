package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.AndroidAutofill;
import androidx.compose.ui.autofill.AndroidAutofill_androidKt;
import androidx.compose.ui.autofill.Autofill;
import androidx.compose.ui.autofill.AutofillCallback;
import androidx.compose.ui.autofill.AutofillTree;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusManagerImpl;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.PlatformHapticFeedback;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifier;
import androidx.compose.ui.input.pointer.MotionEventAdapter;
import androidx.compose.ui.input.pointer.PointerInputEvent;
import androidx.compose.ui.input.pointer.PointerInputEventProcessor;
import androidx.compose.ui.input.pointer.PositionCalculator;
import androidx.compose.ui.input.pointer.ProcessResult;
import androidx.compose.ui.layout.RootMeasurePolicy;
import androidx.compose.ui.node.LayoutNode.UsageByParent;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.MeasureAndLayoutDelegate;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.node.RootForTest;
import androidx.compose.ui.semantics.SemanticsModifierCore;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsNodeKt;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.semantics.SemanticsWrapper;
import androidx.compose.ui.text.font.Font.ResourceLoader;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputServiceAndroid;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;

@Metadata(d1 = {"\u0000\u00F6\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00BB\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0004\u00BB\u0002\u00BC\u0002B\r\u0012\u0006\u0010\u0006\u001A\u00020\u0007\u00A2\u0006\u0002\u0010\bJ\u001A\u0010\u00B4\u0001\u001A\u00020+2\b\u0010\u009B\u0001\u001A\u00030\u00B5\u00012\u0007\u0010\u00B6\u0001\u001A\u00020rJ\u0019\u0010\u001A\u001A\u00020+2\u000F\u0010\u00B7\u0001\u001A\n\u0012\u0005\u0012\u00030\u00B9\u00010\u00B8\u0001H\u0016J\t\u0010\u00BA\u0001\u001A\u00020AH\u0002J\u0013\u0010\u00BB\u0001\u001A\u00020+H\u0086@\u00F8\u0001\u0000\u00A2\u0006\u0003\u0010\u00BC\u0001J#\u0010\u00BD\u0001\u001A\u00030\u00B2\u00012\b\u0010\u00BE\u0001\u001A\u00030\u00B2\u0001H\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\b\u00BF\u0001\u0010\u00C0\u0001J#\u0010\u00C1\u0001\u001A\u00030\u00B2\u00012\b\u0010\u00C2\u0001\u001A\u00030\u00B2\u0001H\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\b\u00C3\u0001\u0010\u00C0\u0001J\u0012\u0010\u00C4\u0001\u001A\u00020+2\u0007\u0010\u00C5\u0001\u001A\u00020\u0001H\u0002J\u000F\u0010\u00C6\u0001\u001A\u00020+H\u0000\u00A2\u0006\u0003\b\u00C7\u0001J\"\u0010\u00C8\u0001\u001A\u0011\u0012\u0005\u0012\u00030\u00CA\u0001\u0012\u0005\u0012\u00030\u00CA\u00010\u00C9\u00012\b\u0010\u00CB\u0001\u001A\u00030\u00CA\u0001H\u0002J/\u0010\u00CC\u0001\u001A\u0002072\u0014\u0010\u00CD\u0001\u001A\u000F\u0012\u0005\u0012\u00030\u00CE\u0001\u0012\u0004\u0012\u00020+0)2\u000E\u0010\u00CF\u0001\u001A\t\u0012\u0004\u0012\u00020+0\u00D0\u0001H\u0016J\u0013\u0010\u00D1\u0001\u001A\u00020+2\b\u0010\u00D2\u0001\u001A\u00030\u00D3\u0001H\u0014J\u0013\u0010\u00D4\u0001\u001A\u00020A2\b\u0010\u00D5\u0001\u001A\u00030\u00D6\u0001H\u0016J\u0013\u0010\u00D7\u0001\u001A\u00020A2\b\u0010\u00D5\u0001\u001A\u00030\u00D8\u0001H\u0016J\u0013\u0010\u00D9\u0001\u001A\u00020A2\b\u0010\u00DA\u0001\u001A\u00030\u00D6\u0001H\u0016J\u001B\u0010\u00DB\u0001\u001A\u00020+2\b\u0010\u009B\u0001\u001A\u00030\u00B5\u00012\b\u0010\u00D2\u0001\u001A\u00030\u00D3\u0001J \u0010\u00DC\u0001\u001A\u0005\u0018\u00010\u009C\u00012\b\u0010\u00DD\u0001\u001A\u00030\u00CA\u00012\b\u0010\u00DE\u0001\u001A\u00030\u009C\u0001H\u0002J\u0014\u0010\u00DF\u0001\u001A\u0005\u0018\u00010\u009C\u00012\b\u0010\u00DD\u0001\u001A\u00030\u00CA\u0001J%\u0010\u00E0\u0001\u001A\u0005\u0018\u00010\u00E1\u00012\b\u0010\u00E2\u0001\u001A\u00030\u00E3\u0001H\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\b\u00E4\u0001\u0010\u00E5\u0001J\t\u0010\u00E6\u0001\u001A\u00020+H\u0016J\u0012\u0010\u00E7\u0001\u001A\u00020+2\u0007\u0010\u00E8\u0001\u001A\u00020rH\u0002J\u0012\u0010\u00E9\u0001\u001A\u00020+2\u0007\u0010\u00E8\u0001\u001A\u00020rH\u0002J\u0013\u0010\u00EA\u0001\u001A\u00020+H\u0086@\u00F8\u0001\u0000\u00A2\u0006\u0003\u0010\u00BC\u0001J#\u0010\u00EB\u0001\u001A\u00030\u00B2\u00012\b\u0010\u00C2\u0001\u001A\u00030\u00B2\u0001H\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\b\u00EC\u0001\u0010\u00C0\u0001J\t\u0010\u00ED\u0001\u001A\u00020+H\u0016J!\u0010\u00EE\u0001\u001A\u00020+2\u0007\u0010\u00EF\u0001\u001A\u0002072\u0007\u0010\u00F0\u0001\u001A\u00020AH\u0000\u00A2\u0006\u0003\b\u00F1\u0001J\u0012\u0010\u00F2\u0001\u001A\u00020+2\u0007\u0010\u00E8\u0001\u001A\u00020rH\u0016J\t\u0010\u00F3\u0001\u001A\u00020+H\u0014J\t\u0010\u00F4\u0001\u001A\u00020AH\u0016J\u0012\u0010\u00F5\u0001\u001A\u00020+2\u0007\u0010\u00F6\u0001\u001A\u00020*H\u0014J\u0016\u0010\u00F7\u0001\u001A\u0005\u0018\u00010\u00F8\u00012\b\u0010\u00F9\u0001\u001A\u00030\u00FA\u0001H\u0016J\u0012\u0010\u00FB\u0001\u001A\u00020+2\u0007\u0010\u00E8\u0001\u001A\u00020rH\u0016J\t\u0010\u00FC\u0001\u001A\u00020+H\u0014J\u0013\u0010\u00FD\u0001\u001A\u00020+2\b\u0010\u00D2\u0001\u001A\u00030\u00D3\u0001H\u0014J(\u0010\u00FE\u0001\u001A\u00020+2\u0007\u0010\u00FF\u0001\u001A\u00020A2\b\u0010\u0080\u0002\u001A\u00030\u00CA\u00012\n\u0010\u0081\u0002\u001A\u0005\u0018\u00010\u0082\u0002H\u0014J:\u0010\u0083\u0002\u001A\u00020+2\u0007\u0010\u0084\u0002\u001A\u00020A2\b\u0010\u0085\u0002\u001A\u00030\u00CA\u00012\b\u0010\u0086\u0002\u001A\u00030\u00CA\u00012\b\u0010\u0087\u0002\u001A\u00030\u00CA\u00012\b\u0010\u0088\u0002\u001A\u00030\u00CA\u0001H\u0014J\u0012\u0010\u0089\u0002\u001A\u00020+2\u0007\u0010\u00B6\u0001\u001A\u00020rH\u0016J\u001D\u0010\u008A\u0002\u001A\u00020+2\b\u0010\u008B\u0002\u001A\u00030\u00CA\u00012\b\u0010\u008C\u0002\u001A\u00030\u00CA\u0001H\u0014J\u001F\u0010\u008D\u0002\u001A\u00020+2\n\u0010\u008E\u0002\u001A\u0005\u0018\u00010\u008F\u00022\b\u0010\u0090\u0002\u001A\u00030\u00CA\u0001H\u0016J\u0012\u0010\u0091\u0002\u001A\u00020+2\u0007\u0010\u00B6\u0001\u001A\u00020rH\u0016J\u0012\u0010\u0092\u0002\u001A\u00020+2\u0007\u0010\u00B6\u0001\u001A\u00020rH\u0016J\u0013\u0010\u0093\u0002\u001A\u00020+2\b\u0010\u0094\u0002\u001A\u00030\u0095\u0002H\u0016J\u0012\u0010\u0096\u0002\u001A\u00020+2\u0007\u0010\\\u001A\u00030\u00CA\u0001H\u0016J\t\u0010\u0097\u0002\u001A\u00020+H\u0016J\u0012\u0010\u0098\u0002\u001A\u00020+2\u0007\u0010\u0099\u0002\u001A\u00020AH\u0016J\t\u0010\u009A\u0002\u001A\u00020+H\u0002J\u0013\u0010\u009A\u0002\u001A\u00020+2\b\u0010\u00DA\u0001\u001A\u00030\u00D6\u0001H\u0002J\t\u0010\u009B\u0002\u001A\u00020+H\u0002J\u0011\u0010\u009C\u0002\u001A\u00020+2\b\u0010\u009B\u0001\u001A\u00030\u00B5\u0001J\u0007\u0010\u009D\u0002\u001A\u00020+J\u0013\u0010\u009E\u0002\u001A\u00020+2\b\u0010\u009F\u0002\u001A\u00030\u00A0\u0002H\u0016J\u0016\u0010\u00A1\u0002\u001A\u00020+2\u000B\b\u0002\u0010\u00A2\u0002\u001A\u0004\u0018\u00010rH\u0002J#\u0010\u00A3\u0002\u001A\u00030\u00B2\u00012\b\u0010\u00A4\u0002\u001A\u00030\u00B2\u0001H\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\b\u00A5\u0002\u0010\u00C0\u0001J\"\u0010\u00A6\u0002\u001A\u00020A2\b\u0010\u00E2\u0001\u001A\u00030\u00E3\u0001H\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\b\u00A7\u0002\u0010\u00A8\u0002J\u001C\u0010\u00A9\u0002\u001A\u00020+2\u0013\u0010\u00AA\u0002\u001A\u000E\u0012\u0004\u0012\u00020m\u0012\u0004\u0012\u00020+0)J,\u0010\u00AB\u0002\u001A\u00020+2\b\u0010\u009B\u0001\u001A\u00030\u009C\u00012\b\u0010\u00AC\u0002\u001A\u00030\u0097\u0001H\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\b\u00AD\u0002\u0010\u00AE\u0002J\t\u0010\u00AF\u0002\u001A\u00020+H\u0002J\'\u0010\u00B0\u0002\u001A\u00020+*\u00030\u0097\u00012\b\u0010\u00B1\u0002\u001A\u00030\u00B2\u0002H\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\b\u00B3\u0002\u0010\u00B4\u0002J1\u0010\u00B5\u0002\u001A\u00020+*\u00030\u0097\u00012\b\u0010\u00B6\u0002\u001A\u00030\u00B7\u00022\b\u0010\u00B8\u0002\u001A\u00030\u00B7\u0002H\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\b\u00B9\u0002\u0010\u00BA\u0002R\u0010\u0010\t\u001A\u0004\u0018\u00010\nX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0010\u0010\u000B\u001A\u0004\u0018\u00010\fX\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u000E\u0010\r\u001A\u00020\u000EX\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u000F\u001A\u00020\u0010X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0011\u001A\u00020\u0012X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001A\u00020\u0014X\u0096\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001A\u00020\n8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001A\u001A\u0004\u0018\u00010\u001B8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\u001C\u0010\u001DR\u0014\u0010\u001E\u001A\u00020\u001FX\u0096\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b \u0010!R\u000E\u0010\"\u001A\u00020#X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0014\u0010$\u001A\u00020%X\u0096\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b&\u0010\'R&\u0010(\u001A\u000E\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001E\u00102\u001A\u0002012\u0006\u00100\u001A\u000201@RX\u0096\u000E\u00A2\u0006\b\n\u0000\u001A\u0004\b3\u00104R\u0014\u00105\u001A\b\u0012\u0004\u0012\u00020706X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0014\u00108\u001A\u0002098VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b:\u0010;R\u0014\u0010<\u001A\u00020=X\u0096\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b>\u0010?R\u000E\u0010@\u001A\u00020AX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010B\u001A\u00020CX\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0019\u0010D\u001A\u00020EX\u0082\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0004\n\u0002\u0010FR\u0014\u0010G\u001A\u00020HX\u0096\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\bI\u0010JR\u0014\u0010K\u001A\u00020A8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bL\u0010MR\u000E\u0010N\u001A\u00020AX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0014\u0010O\u001A\u00020A8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bO\u0010MR\u000E\u0010P\u001A\u00020AX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010Q\u001A\u00020RX\u0082\u0004\u00A2\u0006\u0002\n\u0000R$\u0010S\u001A\u00020T8\u0000@\u0000X\u0081\u000E\u00A2\u0006\u0014\n\u0000\u0012\u0004\bU\u0010V\u001A\u0004\bW\u0010X\"\u0004\bY\u0010ZR+\u0010\\\u001A\u00020[2\u0006\u00100\u001A\u00020[8V@RX\u0096\u008E\u0002\u00A2\u0006\u0012\n\u0004\ba\u0010b\u001A\u0004\b]\u0010^\"\u0004\b_\u0010`R\u000E\u0010c\u001A\u00020dX\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0014\u0010e\u001A\u00020T8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bf\u0010XR\u000E\u0010g\u001A\u00020hX\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u000E\u0010i\u001A\u00020AX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0019\u0010j\u001A\u0004\u0018\u00010kX\u0082\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0002\n\u0000R\u001C\u0010l\u001A\u0010\u0012\u0004\u0012\u00020m\u0012\u0004\u0012\u00020+\u0018\u00010)X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010n\u001A\u00020oX\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0016\u0010p\u001A\n\u0012\u0004\u0012\u000207\u0018\u000106X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0014\u0010q\u001A\u00020rX\u0096\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\bs\u0010tR\u0014\u0010u\u001A\u00020vX\u0096\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\bw\u0010xR\u000E\u0010y\u001A\u00020zX\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u000E\u0010{\u001A\u00020|X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0015\u0010}\u001A\u00020~X\u0096\u0004\u00A2\u0006\t\n\u0000\u001A\u0005\b\u007F\u0010\u0080\u0001R%\u0010\u0081\u0001\u001A\u00020AX\u0096\u000E\u00A2\u0006\u0018\n\u0000\u0012\u0005\b\u0082\u0001\u0010V\u001A\u0005\b\u0083\u0001\u0010M\"\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0018\u0010\u0086\u0001\u001A\u00030\u0087\u0001X\u0096\u0004\u00A2\u0006\n\n\u0000\u001A\u0006\b\u0088\u0001\u0010\u0089\u0001R\u000F\u0010\u008A\u0001\u001A\u00020AX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u001F\u0010\u008B\u0001\u001A\u00030\u008C\u0001X\u0096\u0004\u00A2\u0006\u0011\n\u0000\u0012\u0005\b\u008D\u0001\u0010V\u001A\u0006\b\u008E\u0001\u0010\u008F\u0001R\u0010\u0010\u0090\u0001\u001A\u00030\u0091\u0001X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0018\u0010\u0092\u0001\u001A\u00030\u0093\u0001X\u0096\u0004\u00A2\u0006\n\n\u0000\u001A\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001C\u0010\u0096\u0001\u001A\u00030\u0097\u0001X\u0082\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0005\n\u0003\u0010\u0098\u0001R\u0010\u0010\u0099\u0001\u001A\u00030\u009A\u0001X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0018\u0010\u009B\u0001\u001A\u00030\u009C\u00018VX\u0096\u0004\u00A2\u0006\b\u001A\u0006\b\u009D\u0001\u0010\u009E\u0001R\u0018\u0010\u009F\u0001\u001A\u00030\u00A0\u0001X\u0096\u0004\u00A2\u0006\n\n\u0000\u001A\u0006\b\u00A1\u0001\u0010\u00A2\u0001R\u0012\u0010\u00A3\u0001\u001A\u0005\u0018\u00010\u00A4\u0001X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u001C\u0010\u00A5\u0001\u001A\u00030\u0097\u0001X\u0082\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0005\n\u0003\u0010\u0098\u0001R5\u0010\u00A6\u0001\u001A\u0004\u0018\u00010m2\b\u00100\u001A\u0004\u0018\u00010m8F@BX\u0086\u008E\u0002\u00A2\u0006\u0017\n\u0005\b\u00AB\u0001\u0010b\u001A\u0006\b\u00A7\u0001\u0010\u00A8\u0001\"\u0006\b\u00A9\u0001\u0010\u00AA\u0001R\u000F\u0010\u00AC\u0001\u001A\u00020AX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0018\u0010\u00AD\u0001\u001A\u00030\u00AE\u00018VX\u0096\u0004\u00A2\u0006\b\u001A\u0006\b\u00AF\u0001\u0010\u00B0\u0001R\u001B\u0010\u00B1\u0001\u001A\u00030\u00B2\u0001X\u0082\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0004\n\u0002\u0010FR\u001C\u0010\u00B3\u0001\u001A\u00030\u0097\u0001X\u0082\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0005\n\u0003\u0010\u0098\u0001\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006\u00BD\u0002"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/view/ViewGroup;", "Landroidx/compose/ui/node/Owner;", "Landroidx/compose/ui/platform/ViewRootForTest;", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "_androidViewsHandler", "Landroidx/compose/ui/platform/AndroidViewsHandler;", "_autofill", "Landroidx/compose/ui/autofill/AndroidAutofill;", "_focusManager", "Landroidx/compose/ui/focus/FocusManagerImpl;", "_windowInfo", "Landroidx/compose/ui/platform/WindowInfoImpl;", "accessibilityDelegate", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "accessibilityManager", "Landroidx/compose/ui/platform/AndroidAccessibilityManager;", "getAccessibilityManager", "()Landroidx/compose/ui/platform/AndroidAccessibilityManager;", "androidViewsHandler", "getAndroidViewsHandler$ui_release", "()Landroidx/compose/ui/platform/AndroidViewsHandler;", "autofill", "Landroidx/compose/ui/autofill/Autofill;", "getAutofill", "()Landroidx/compose/ui/autofill/Autofill;", "autofillTree", "Landroidx/compose/ui/autofill/AutofillTree;", "getAutofillTree", "()Landroidx/compose/ui/autofill/AutofillTree;", "canvasHolder", "Landroidx/compose/ui/graphics/CanvasHolder;", "clipboardManager", "Landroidx/compose/ui/platform/AndroidClipboardManager;", "getClipboardManager", "()Landroidx/compose/ui/platform/AndroidClipboardManager;", "configurationChangeObserver", "Lkotlin/Function1;", "Landroid/content/res/Configuration;", "", "getConfigurationChangeObserver", "()Lkotlin/jvm/functions/Function1;", "setConfigurationChangeObserver", "(Lkotlin/jvm/functions/Function1;)V", "<set-?>", "Landroidx/compose/ui/unit/Density;", "density", "getDensity", "()Landroidx/compose/ui/unit/Density;", "dirtyLayers", "", "Landroidx/compose/ui/node/OwnedLayer;", "focusManager", "Landroidx/compose/ui/focus/FocusManager;", "getFocusManager", "()Landroidx/compose/ui/focus/FocusManager;", "fontLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getFontLoader", "()Landroidx/compose/ui/text/font/Font$ResourceLoader;", "forceUseMatrixCache", "", "globalLayoutListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "globalPosition", "Landroidx/compose/ui/unit/IntOffset;", "J", "hapticFeedBack", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "hasPendingMeasureOrLayout", "getHasPendingMeasureOrLayout", "()Z", "isDrawingContent", "isLifecycleInResumedState", "isRenderNodeCompatible", "keyInputModifier", "Landroidx/compose/ui/input/key/KeyInputModifier;", "lastMatrixRecalculationAnimationTime", "", "getLastMatrixRecalculationAnimationTime$ui_release$annotations", "()V", "getLastMatrixRecalculationAnimationTime$ui_release", "()J", "setLastMatrixRecalculationAnimationTime$ui_release", "(J)V", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layoutDirection$delegate", "Landroidx/compose/runtime/MutableState;", "measureAndLayoutDelegate", "Landroidx/compose/ui/node/MeasureAndLayoutDelegate;", "measureIteration", "getMeasureIteration", "motionEventAdapter", "Landroidx/compose/ui/input/pointer/MotionEventAdapter;", "observationClearRequested", "onMeasureConstraints", "Landroidx/compose/ui/unit/Constraints;", "onViewTreeOwnersAvailable", "Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;", "pointerInputEventProcessor", "Landroidx/compose/ui/input/pointer/PointerInputEventProcessor;", "postponedDirtyLayers", "root", "Landroidx/compose/ui/node/LayoutNode;", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "rootForTest", "Landroidx/compose/ui/node/RootForTest;", "getRootForTest", "()Landroidx/compose/ui/node/RootForTest;", "scrollChangedListener", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "semanticsModifier", "Landroidx/compose/ui/semantics/SemanticsModifierCore;", "semanticsOwner", "Landroidx/compose/ui/semantics/SemanticsOwner;", "getSemanticsOwner", "()Landroidx/compose/ui/semantics/SemanticsOwner;", "showLayoutBounds", "getShowLayoutBounds$annotations", "getShowLayoutBounds", "setShowLayoutBounds", "(Z)V", "snapshotObserver", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "superclassInitComplete", "textInputService", "Landroidx/compose/ui/text/input/TextInputService;", "getTextInputService$annotations", "getTextInputService", "()Landroidx/compose/ui/text/input/TextInputService;", "textInputServiceAndroid", "Landroidx/compose/ui/text/input/TextInputServiceAndroid;", "textToolbar", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "tmpCalculationMatrix", "Landroidx/compose/ui/graphics/Matrix;", "[F", "tmpPositionArray", "", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "viewLayersContainer", "Landroidx/compose/ui/platform/DrawChildContainer;", "viewToWindowMatrix", "viewTreeOwners", "getViewTreeOwners", "()Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;", "setViewTreeOwners", "(Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;)V", "viewTreeOwners$delegate", "wasMeasuredWithMultipleConstraints", "windowInfo", "Landroidx/compose/ui/platform/WindowInfo;", "getWindowInfo", "()Landroidx/compose/ui/platform/WindowInfo;", "windowPosition", "Landroidx/compose/ui/geometry/Offset;", "windowToViewMatrix", "addAndroidView", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "layoutNode", "values", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "autofillSupported", "boundsUpdatesEventLoop", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "calculateLocalPosition", "positionInWindow", "calculateLocalPosition-MK-Hz9U", "(J)J", "calculatePositionInWindow", "localPosition", "calculatePositionInWindow-MK-Hz9U", "clearChildInvalidObservations", "viewGroup", "clearInvalidObservations", "clearInvalidObservations$ui_release", "convertMeasureSpec", "Lkotlin/Pair;", "", "measureSpec", "createLayer", "drawBlock", "Landroidx/compose/ui/graphics/Canvas;", "invalidateParentLayer", "Lkotlin/Function0;", "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "dispatchHoverEvent", "event", "Landroid/view/MotionEvent;", "dispatchKeyEvent", "Landroid/view/KeyEvent;", "dispatchTouchEvent", "motionEvent", "drawAndroidView", "findViewByAccessibilityIdRootedAtCurrentView", "accessibilityId", "currentView", "findViewByAccessibilityIdTraversal", "getFocusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "keyEvent", "Landroidx/compose/ui/input/key/KeyEvent;", "getFocusDirection-P8AzH3I", "(Landroid/view/KeyEvent;)Landroidx/compose/ui/focus/FocusDirection;", "invalidateDescendants", "invalidateLayers", "node", "invalidateLayoutNodeMeasurement", "keyboardVisibilityEventLoop", "localToScreen", "localToScreen-MK-Hz9U", "measureAndLayout", "notifyLayerIsDirty", "layer", "isDirty", "notifyLayerIsDirty$ui_release", "onAttach", "onAttachedToWindow", "onCheckIsTextEditor", "onConfigurationChanged", "newConfig", "onCreateInputConnection", "Landroid/view/inputmethod/InputConnection;", "outAttrs", "Landroid/view/inputmethod/EditorInfo;", "onDetach", "onDetachedFromWindow", "onDraw", "onFocusChanged", "gainFocus", "direction", "previouslyFocusedRect", "Landroid/graphics/Rect;", "onLayout", "changed", "l", "t", "r", "b", "onLayoutChange", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onProvideAutofillVirtualStructure", "structure", "Landroid/view/ViewStructure;", "flags", "onRequestMeasure", "onRequestRelayout", "onResume", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onRtlPropertiesChanged", "onSemanticsChange", "onWindowFocusChanged", "hasWindowFocus", "recalculateWindowPosition", "recalculateWindowViewTransforms", "removeAndroidView", "requestClearInvalidObservations", "requestRectangleOnScreen", "rect", "Landroidx/compose/ui/geometry/Rect;", "scheduleMeasureAndLayout", "nodeToRemeasure", "screenToLocal", "positionOnScreen", "screenToLocal-MK-Hz9U", "sendKeyEvent", "sendKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "setOnViewTreeOwnersAvailable", "callback", "transformMatrixToWindow", "matrix", "transformMatrixToWindow-EL8BTi8", "(Landroid/view/View;[F)V", "updatePositionCacheAndDispatch", "preConcat", "other", "Landroid/graphics/Matrix;", "preConcat-tU-YjHk", "([FLandroid/graphics/Matrix;)V", "preTranslate", "x", "", "y", "preTranslate-3XD1CNM", "([FFF)V", "Companion", "ViewTreeOwners", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class AndroidComposeView extends ViewGroup implements PositionCalculator, Owner, ViewRootForTest, DefaultLifecycleObserver {
    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001A\u00020\bH\u0003R\u0010\u0010\u0003\u001A\u0004\u0018\u00010\u0004X\u0082\u000E¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001A\b\u0012\u0002\b\u0003\u0018\u00010\u0006X\u0082\u000E¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$Companion;", "", "()V", "getBooleanMethod", "Ljava/lang/reflect/Method;", "systemPropertiesClass", "Ljava/lang/Class;", "getIsShowingLayoutBounds", "", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        private final boolean getIsShowingLayoutBounds() {
            try {
                Boolean boolean0 = null;
                if(AndroidComposeView.systemPropertiesClass == null) {
                    AndroidComposeView.systemPropertiesClass = Class.forName("android.os.SystemProperties");
                    Class class0 = AndroidComposeView.systemPropertiesClass;
                    AndroidComposeView.getBooleanMethod = class0 == null ? null : class0.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
                }
                Method method0 = AndroidComposeView.getBooleanMethod;
                Object object0 = method0 == null ? null : method0.invoke(null, "debug.layout", Boolean.FALSE);
                if(object0 instanceof Boolean) {
                    boolean0 = (Boolean)object0;
                }
                return boolean0 == null ? false : boolean0.booleanValue();
            }
            catch(Exception unused_ex) {
            }
            return false;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;", "", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "savedStateRegistryOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/savedstate/SavedStateRegistryOwner;)V", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "getSavedStateRegistryOwner", "()Landroidx/savedstate/SavedStateRegistryOwner;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class ViewTreeOwners {
        public static final int $stable = 8;
        private final LifecycleOwner lifecycleOwner;
        private final SavedStateRegistryOwner savedStateRegistryOwner;

        static {
        }

        public ViewTreeOwners(LifecycleOwner lifecycleOwner0, SavedStateRegistryOwner savedStateRegistryOwner0) {
            Intrinsics.checkNotNullParameter(lifecycleOwner0, "lifecycleOwner");
            Intrinsics.checkNotNullParameter(savedStateRegistryOwner0, "savedStateRegistryOwner");
            super();
            this.lifecycleOwner = lifecycleOwner0;
            this.savedStateRegistryOwner = savedStateRegistryOwner0;
        }

        public final LifecycleOwner getLifecycleOwner() {
            return this.lifecycleOwner;
        }

        public final SavedStateRegistryOwner getSavedStateRegistryOwner() {
            return this.savedStateRegistryOwner;
        }
    }

    public static final Companion Companion;
    private AndroidViewsHandler _androidViewsHandler;
    private final AndroidAutofill _autofill;
    private final FocusManagerImpl _focusManager;
    private final WindowInfoImpl _windowInfo;
    private final AndroidComposeViewAccessibilityDelegateCompat accessibilityDelegate;
    private final AndroidAccessibilityManager accessibilityManager;
    private final AutofillTree autofillTree;
    private final CanvasHolder canvasHolder;
    private final AndroidClipboardManager clipboardManager;
    private Function1 configurationChangeObserver;
    private Density density;
    private final List dirtyLayers;
    private final ResourceLoader fontLoader;
    private boolean forceUseMatrixCache;
    private static Method getBooleanMethod;
    private final ViewTreeObserver.OnGlobalLayoutListener globalLayoutListener;
    private long globalPosition;
    private final HapticFeedback hapticFeedBack;
    private boolean isDrawingContent;
    private boolean isRenderNodeCompatible;
    private final KeyInputModifier keyInputModifier;
    private long lastMatrixRecalculationAnimationTime;
    private final MutableState layoutDirection$delegate;
    private final MeasureAndLayoutDelegate measureAndLayoutDelegate;
    private final MotionEventAdapter motionEventAdapter;
    private boolean observationClearRequested;
    private Constraints onMeasureConstraints;
    private Function1 onViewTreeOwnersAvailable;
    private final PointerInputEventProcessor pointerInputEventProcessor;
    private List postponedDirtyLayers;
    private final LayoutNode root;
    private final RootForTest rootForTest;
    private final ViewTreeObserver.OnScrollChangedListener scrollChangedListener;
    private final SemanticsModifierCore semanticsModifier;
    private final SemanticsOwner semanticsOwner;
    private boolean showLayoutBounds;
    private final OwnerSnapshotObserver snapshotObserver;
    private boolean superclassInitComplete;
    private static Class systemPropertiesClass;
    private final TextInputService textInputService;
    private final TextInputServiceAndroid textInputServiceAndroid;
    private final TextToolbar textToolbar;
    private final float[] tmpCalculationMatrix;
    private final int[] tmpPositionArray;
    private final ViewConfiguration viewConfiguration;
    private DrawChildContainer viewLayersContainer;
    private final float[] viewToWindowMatrix;
    private final MutableState viewTreeOwners$delegate;
    private boolean wasMeasuredWithMultipleConstraints;
    private long windowPosition;
    private final float[] windowToViewMatrix;

    static {
        AndroidComposeView.Companion = new Companion(null);
    }

    public AndroidComposeView(Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0);
        this.superclassInitComplete = true;
        this.density = AndroidDensity_androidKt.Density(context0);
        SemanticsModifierCore semanticsModifierCore0 = new SemanticsModifierCore(SemanticsModifierCore.Companion.generateSemanticsId(), false, false, androidx.compose.ui.platform.AndroidComposeView.semanticsModifier.1.INSTANCE);
        this.semanticsModifier = semanticsModifierCore0;
        FocusManagerImpl focusManagerImpl0 = new FocusManagerImpl(null, 1, null);
        this._focusManager = focusManagerImpl0;
        this._windowInfo = new WindowInfoImpl();
        KeyInputModifier keyInputModifier0 = new KeyInputModifier(new Function1() {
            {
                AndroidComposeView.this = androidComposeView0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke-ZmokQxo(((KeyEvent)object0).unbox-impl());
            }

            public final Boolean invoke-ZmokQxo(android.view.KeyEvent keyEvent0) {
                Intrinsics.checkNotNullParameter(keyEvent0, "it");
                FocusDirection focusDirection0 = AndroidComposeView.this.getFocusDirection-P8AzH3I(keyEvent0);
                return focusDirection0 == null || !KeyEventType.equals-impl0(KeyEvent_androidKt.getType-ZmokQxo(keyEvent0), 2) ? false : Boolean.valueOf(AndroidComposeView.this.getFocusManager().moveFocus-3ESFkO8(focusDirection0.unbox-impl()));
            }
        }, null);
        this.keyInputModifier = keyInputModifier0;
        this.canvasHolder = new CanvasHolder();
        LayoutNode layoutNode0 = new LayoutNode();
        layoutNode0.setMeasurePolicy(RootMeasurePolicy.INSTANCE);
        layoutNode0.setModifier(Modifier.Companion.then(semanticsModifierCore0).then(focusManagerImpl0.getModifier()).then(keyInputModifier0));
        this.root = layoutNode0;
        this.rootForTest = this;
        this.semanticsOwner = new SemanticsOwner(this.getRoot());
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat0 = new AndroidComposeViewAccessibilityDelegateCompat(this);
        this.accessibilityDelegate = androidComposeViewAccessibilityDelegateCompat0;
        this.autofillTree = new AutofillTree();
        this.dirtyLayers = new ArrayList();
        this.motionEventAdapter = new MotionEventAdapter();
        this.pointerInputEventProcessor = new PointerInputEventProcessor(this.getRoot());
        this.configurationChangeObserver = androidx.compose.ui.platform.AndroidComposeView.configurationChangeObserver.1.INSTANCE;
        this._autofill = new AndroidAutofill(this, this.getAutofillTree());
        this.clipboardManager = new AndroidClipboardManager(context0);
        this.accessibilityManager = new AndroidAccessibilityManager(context0);
        this.snapshotObserver = new OwnerSnapshotObserver(new Function1() {
            {
                AndroidComposeView.this = androidComposeView0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Function0)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(Function0 function00) {
                Intrinsics.checkNotNullParameter(function00, "command");
                Handler handler0 = AndroidComposeView.this.getHandler();
                if((handler0 == null ? null : handler0.getLooper()) == Looper.myLooper()) {
                    function00.invoke();
                    return;
                }
                Handler handler1 = AndroidComposeView.this.getHandler();
                if(handler1 != null) {
                    handler1.post(new AndroidComposeView_androidKt.sam.java_lang_Runnable.0(function00));
                }
            }
        });
        this.measureAndLayoutDelegate = new MeasureAndLayoutDelegate(this.getRoot());
        android.view.ViewConfiguration viewConfiguration0 = android.view.ViewConfiguration.get(context0);
        Intrinsics.checkNotNullExpressionValue(viewConfiguration0, "get(context)");
        this.viewConfiguration = new AndroidViewConfiguration(viewConfiguration0);
        this.globalPosition = 0L;
        this.tmpPositionArray = new int[]{0, 0};
        this.viewToWindowMatrix = Matrix.constructor-impl$default(null, 1, null);
        this.windowToViewMatrix = Matrix.constructor-impl$default(null, 1, null);
        this.tmpCalculationMatrix = Matrix.constructor-impl$default(null, 1, null);
        this.lastMatrixRecalculationAnimationTime = -1L;
        this.windowPosition = 0x7F8000007F800000L;
        this.isRenderNodeCompatible = true;
        this.viewTreeOwners$delegate = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.globalLayoutListener = () -> {
            AndroidComposeView.this.getLocationOnScreen(AndroidComposeView.this.tmpPositionArray);
            boolean z = false;
            if(((int)(AndroidComposeView.this.globalPosition >> 0x20)) != AndroidComposeView.this.tmpPositionArray[0] || ((int)(AndroidComposeView.this.globalPosition & 0xFFFFFFFFL)) != AndroidComposeView.this.tmpPositionArray[1]) {
                AndroidComposeView.this.globalPosition = IntOffsetKt.IntOffset(AndroidComposeView.this.tmpPositionArray[0], AndroidComposeView.this.tmpPositionArray[1]);
                z = true;
            }
            AndroidComposeView.this.measureAndLayoutDelegate.dispatchOnPositionedCallbacks(z);
        };
        this.scrollChangedListener = () -> {
            AndroidComposeView.this.getLocationOnScreen(AndroidComposeView.this.tmpPositionArray);
            boolean z = false;
            if(((int)(AndroidComposeView.this.globalPosition >> 0x20)) != AndroidComposeView.this.tmpPositionArray[0] || ((int)(AndroidComposeView.this.globalPosition & 0xFFFFFFFFL)) != AndroidComposeView.this.tmpPositionArray[1]) {
                AndroidComposeView.this.globalPosition = IntOffsetKt.IntOffset(AndroidComposeView.this.tmpPositionArray[0], AndroidComposeView.this.tmpPositionArray[1]);
                z = true;
            }
            AndroidComposeView.this.measureAndLayoutDelegate.dispatchOnPositionedCallbacks(z);
        };
        TextInputServiceAndroid textInputServiceAndroid0 = new TextInputServiceAndroid(this);
        this.textInputServiceAndroid = textInputServiceAndroid0;
        this.textInputService = (TextInputService)AndroidComposeView_androidKt.getTextInputServiceFactory().invoke(textInputServiceAndroid0);
        this.fontLoader = new AndroidFontResourceLoader(context0);
        Configuration configuration0 = context0.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration0, "context.resources.configuration");
        this.layoutDirection$delegate = SnapshotStateKt.mutableStateOf$default(AndroidComposeView_androidKt.getLocaleLayoutDirection(configuration0), null, 2, null);
        this.hapticFeedBack = new PlatformHapticFeedback(this);
        this.textToolbar = new AndroidTextToolbar(this);
        this.setWillNotDraw(false);
        this.setFocusable(true);
        if(Build.VERSION.SDK_INT >= 26) {
            AndroidComposeViewVerificationHelperMethods.INSTANCE.focusable(this, 1, false);
        }
        this.setFocusableInTouchMode(true);
        this.setClipChildren(false);
        ViewCompat.setAccessibilityDelegate(this, androidComposeViewAccessibilityDelegateCompat0);
        Function1 function10 = ViewRootForTest.Companion.getOnViewCreatedCallback();
        if(function10 != null) {
            function10.invoke(this);
        }
        this.getRoot().attach$ui_release(this);

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\n"}, d2 = {"Landroid/content/res/Configuration;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        final class androidx.compose.ui.platform.AndroidComposeView.configurationChangeObserver.1 extends Lambda implements Function1 {
            public static final androidx.compose.ui.platform.AndroidComposeView.configurationChangeObserver.1 INSTANCE;

            static {
                androidx.compose.ui.platform.AndroidComposeView.configurationChangeObserver.1.INSTANCE = new androidx.compose.ui.platform.AndroidComposeView.configurationChangeObserver.1();
            }

            androidx.compose.ui.platform.AndroidComposeView.configurationChangeObserver.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Configuration)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(Configuration configuration0) {
                Intrinsics.checkNotNullParameter(configuration0, "it");
            }
        }


        @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001A\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        final class androidx.compose.ui.platform.AndroidComposeView.globalLayoutListener.1 implements ViewTreeObserver.OnGlobalLayoutListener {
            androidx.compose.ui.platform.AndroidComposeView.globalLayoutListener.1(AndroidComposeView androidComposeView0) {
            }

            @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
            public final void onGlobalLayout() {
                AndroidComposeView.this.updatePositionCacheAndDispatch();
            }
        }


        @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001A\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        final class androidx.compose.ui.platform.AndroidComposeView.scrollChangedListener.1 implements ViewTreeObserver.OnScrollChangedListener {
            androidx.compose.ui.platform.AndroidComposeView.scrollChangedListener.1(AndroidComposeView androidComposeView0) {
            }

            @Override  // android.view.ViewTreeObserver$OnScrollChangedListener
            public final void onScrollChanged() {
                AndroidComposeView.this.updatePositionCacheAndDispatch();
            }
        }


        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001A\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        final class androidx.compose.ui.platform.AndroidComposeView.semanticsModifier.1 extends Lambda implements Function1 {
            public static final androidx.compose.ui.platform.AndroidComposeView.semanticsModifier.1 INSTANCE;

            static {
                androidx.compose.ui.platform.AndroidComposeView.semanticsModifier.1.INSTANCE = new androidx.compose.ui.platform.AndroidComposeView.semanticsModifier.1();
            }

            androidx.compose.ui.platform.AndroidComposeView.semanticsModifier.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((SemanticsPropertyReceiver)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
                Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "$this$$receiver");
            }
        }

    }

    public final void addAndroidView(AndroidViewHolder androidViewHolder0, LayoutNode layoutNode0) {
        Intrinsics.checkNotNullParameter(androidViewHolder0, "view");
        Intrinsics.checkNotNullParameter(layoutNode0, "layoutNode");
        this.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().put(androidViewHolder0, layoutNode0);
        this.getAndroidViewsHandler$ui_release().addView(androidViewHolder0);
        this.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(layoutNode0, androidViewHolder0);
        ViewCompat.setImportantForAccessibility(androidViewHolder0, 1);
        ViewCompat.setAccessibilityDelegate(androidViewHolder0, new AccessibilityDelegateCompat() {
            @Override  // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view0, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
                super.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfoCompat0);
                SemanticsWrapper semanticsWrapper0 = SemanticsNodeKt.getOuterSemantics(this);
                Intrinsics.checkNotNull(semanticsWrapper0);
                SemanticsNode semanticsNode0 = new SemanticsNode(semanticsWrapper0, false).getParent();
                Intrinsics.checkNotNull(semanticsNode0);
                int v = semanticsNode0.getId();
                if(v == this.getSemanticsOwner().getUnmergedRootSemanticsNode().getId()) {
                    v = -1;
                }
                Intrinsics.checkNotNull(accessibilityNodeInfoCompat0);
                accessibilityNodeInfoCompat0.setParent(this.$thisView, v);
            }
        });
    }

    @Override  // android.view.View
    public void autofill(SparseArray sparseArray0) {
        Intrinsics.checkNotNullParameter(sparseArray0, "values");
        AndroidAutofill androidAutofill0 = this._autofill;
        if(androidAutofill0 != null) {
            AndroidAutofill_androidKt.performAutofill(androidAutofill0, sparseArray0);
        }
    }

    private final boolean autofillSupported() [...] // 潜在的解密器

    public final Object boundsUpdatesEventLoop(Continuation continuation0) {
        Object object0 = this.accessibilityDelegate.boundsUpdatesEventLoop(continuation0);
        return object0 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Override  // androidx.compose.ui.node.Owner
    public long calculateLocalPosition-MK-Hz9U(long v) {
        this.recalculateWindowPosition();
        return Matrix.map-MK-Hz9U(this.windowToViewMatrix, v);
    }

    @Override  // androidx.compose.ui.node.Owner
    public long calculatePositionInWindow-MK-Hz9U(long v) {
        this.recalculateWindowPosition();
        return Matrix.map-MK-Hz9U(this.viewToWindowMatrix, v);
    }

    private final void clearChildInvalidObservations(ViewGroup viewGroup0) {
        int v = viewGroup0.getChildCount();
        if(v > 0) {
            for(int v1 = 0; true; ++v1) {
                View view0 = viewGroup0.getChildAt(v1);
                if(view0 instanceof AndroidComposeView) {
                    ((AndroidComposeView)view0).clearInvalidObservations$ui_release();
                }
                else if(view0 instanceof ViewGroup) {
                    this.clearChildInvalidObservations(((ViewGroup)view0));
                }
                if(v1 + 1 >= v) {
                    break;
                }
            }
        }
    }

    public final void clearInvalidObservations$ui_release() {
        if(this.observationClearRequested) {
            this.getSnapshotObserver().clearInvalidObservations$ui_release();
            this.observationClearRequested = false;
        }
        AndroidViewsHandler androidViewsHandler0 = this._androidViewsHandler;
        if(androidViewsHandler0 != null) {
            this.clearChildInvalidObservations(androidViewsHandler0);
        }
    }

    private final Pair convertMeasureSpec(int v) {
        int v1 = View.MeasureSpec.getMode(v);
        int v2 = View.MeasureSpec.getSize(v);
        switch(v1) {
            case 0x80000000: {
                return TuplesKt.to(0, v2);
            }
            case 0: {
                return TuplesKt.to(0, 0x7FFFFFFF);
            }
            default: {
                if(v1 != 0x40000000) {
                    throw new IllegalStateException();
                }
                return TuplesKt.to(v2, v2);
            }
        }
    }

    @Override  // androidx.compose.ui.node.Owner
    public OwnedLayer createLayer(Function1 function10, Function0 function00) {
        Intrinsics.checkNotNullParameter(function10, "drawBlock");
        Intrinsics.checkNotNullParameter(function00, "invalidateParentLayer");
        if(Build.VERSION.SDK_INT >= 23 && this.isRenderNodeCompatible) {
            try {
                return new RenderNodeLayer(this, function10, function00);
            }
            catch(Throwable unused_ex) {
                this.isRenderNodeCompatible = false;
            }
        }
        if(this.viewLayersContainer == null) {
            View view0 = new View(this.getContext());
            ViewLayer.Companion.updateDisplayList(view0);
            Context context0 = this.getContext();
            Intrinsics.checkNotNullExpressionValue(context0, "context");
            DrawChildContainer drawChildContainer0 = new ViewLayerContainer(context0);
            this.viewLayersContainer = drawChildContainer0;
            this.addView(drawChildContainer0);
        }
        DrawChildContainer drawChildContainer1 = this.viewLayersContainer;
        Intrinsics.checkNotNull(drawChildContainer1);
        return new ViewLayer(this, drawChildContainer1, function10, function00);
    }

    @Override  // android.view.ViewGroup
    protected void dispatchDraw(Canvas canvas0) {
        Intrinsics.checkNotNullParameter(canvas0, "canvas");
        if(!this.isAttachedToWindow()) {
            this.invalidateLayers(this.getRoot());
        }
        this.measureAndLayout();
        this.isDrawingContent = true;
        this.canvasHolder.getAndroidCanvas().setInternalCanvas(canvas0);
        this.getRoot().draw$ui_release(this.canvasHolder.getAndroidCanvas());
        this.canvasHolder.getAndroidCanvas().setInternalCanvas(this.canvasHolder.getAndroidCanvas().getInternalCanvas());
        if((true ^ this.dirtyLayers.isEmpty()) != 0) {
            int v = this.dirtyLayers.size();
            if(v > 0) {
                for(int v1 = 0; true; ++v1) {
                    ((OwnedLayer)this.dirtyLayers.get(v1)).updateDisplayList();
                    if(v1 + 1 >= v) {
                        break;
                    }
                }
            }
        }
        this.dirtyLayers.clear();
        this.isDrawingContent = false;
        List list0 = this.postponedDirtyLayers;
        if(list0 != null) {
            Intrinsics.checkNotNull(list0);
            this.dirtyLayers.addAll(list0);
            list0.clear();
        }
    }

    @Override  // android.view.ViewGroup
    public boolean dispatchHoverEvent(MotionEvent motionEvent0) {
        Intrinsics.checkNotNullParameter(motionEvent0, "event");
        return this.accessibilityDelegate.dispatchHoverEvent(motionEvent0);
    }

    @Override  // android.view.ViewGroup
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent0) {
        Intrinsics.checkNotNullParameter(keyEvent0, "event");
        return this.isFocused() ? this.sendKeyEvent-ZmokQxo(KeyEvent.constructor-impl(keyEvent0)) : super.dispatchKeyEvent(keyEvent0);
    }

    @Override  // android.view.ViewGroup
    public boolean dispatchTouchEvent(MotionEvent motionEvent0) {
        int v2;
        Intrinsics.checkNotNullParameter(motionEvent0, "motionEvent");
        if(!Float.isNaN(motionEvent0.getX()) && !Float.isNaN(motionEvent0.getY()) && !Float.isNaN(motionEvent0.getRawX()) && !Float.isNaN(motionEvent0.getRawY())) {
            try {
                this.recalculateWindowPosition(motionEvent0);
                this.forceUseMatrixCache = true;
                this.measureAndLayout();
                Trace.beginSection("AndroidOwner:onTouch");
                try {
                    PointerInputEvent pointerInputEvent0 = this.motionEventAdapter.convertToPointerInputEvent$ui_release(motionEvent0, this);
                    if(pointerInputEvent0 == null) {
                        this.pointerInputEventProcessor.processCancel();
                        v2 = 0;
                    }
                    else {
                        v2 = this.pointerInputEventProcessor.process-gBdvCQM(pointerInputEvent0, this);
                    }
                }
                finally {
                    Trace.endSection();
                }
                if(ProcessResult.getAnyMovementConsumed-impl(v2)) {
                    this.getParent().requestDisallowInterceptTouchEvent(true);
                }
            }
            finally {
                this.forceUseMatrixCache = false;
            }
            return ProcessResult.getDispatchedToAPointerInputModifier-impl(v2);
        }
        return false;
    }

    public final void drawAndroidView(AndroidViewHolder androidViewHolder0, Canvas canvas0) {
        Intrinsics.checkNotNullParameter(androidViewHolder0, "view");
        Intrinsics.checkNotNullParameter(canvas0, "canvas");
        this.getAndroidViewsHandler$ui_release().drawView(androidViewHolder0, canvas0);
    }

    private final View findViewByAccessibilityIdRootedAtCurrentView(int v, View view0) {
        if(Build.VERSION.SDK_INT < 29) {
            Method method0 = View.class.getDeclaredMethod("getAccessibilityViewId");
            method0.setAccessible(true);
            if(Intrinsics.areEqual(method0.invoke(view0, new Object[0]), v)) {
                return view0;
            }
            if(view0 instanceof ViewGroup) {
                int v2 = ((ViewGroup)view0).getChildCount();
                if(v2 > 0) {
                    for(int v1 = 0; true; ++v1) {
                        View view1 = ((ViewGroup)view0).getChildAt(v1);
                        Intrinsics.checkNotNullExpressionValue(view1, "currentView.getChildAt(i)");
                        View view2 = this.findViewByAccessibilityIdRootedAtCurrentView(v, view1);
                        if(view2 != null) {
                            return view2;
                        }
                        if(v1 + 1 >= v2) {
                            break;
                        }
                    }
                }
            }
        }
        return null;
    }

    public final View findViewByAccessibilityIdTraversal(int v) {
        try {
            if(Build.VERSION.SDK_INT < 29) {
                return this.findViewByAccessibilityIdRootedAtCurrentView(v, this);
            }
            Method method0 = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            method0.setAccessible(true);
            Object object0 = method0.invoke(this, v);
            return object0 instanceof View ? ((View)object0) : null;
        }
        catch(NoSuchMethodException unused_ex) {
        }
        return null;
    }

    @Override  // androidx.compose.ui.node.Owner
    public AccessibilityManager getAccessibilityManager() {
        return this.getAccessibilityManager();
    }

    public AndroidAccessibilityManager getAccessibilityManager() {
        return this.accessibilityManager;
    }

    public final AndroidViewsHandler getAndroidViewsHandler$ui_release() {
        if(this._androidViewsHandler == null) {
            Context context0 = this.getContext();
            Intrinsics.checkNotNullExpressionValue(context0, "context");
            AndroidViewsHandler androidViewsHandler0 = new AndroidViewsHandler(context0);
            this._androidViewsHandler = androidViewsHandler0;
            this.addView(androidViewsHandler0);
        }
        AndroidViewsHandler androidViewsHandler1 = this._androidViewsHandler;
        Intrinsics.checkNotNull(androidViewsHandler1);
        return androidViewsHandler1;
    }

    @Override  // androidx.compose.ui.node.Owner
    public Autofill getAutofill() {
        return this._autofill;
    }

    @Override  // androidx.compose.ui.node.Owner
    public AutofillTree getAutofillTree() {
        return this.autofillTree;
    }

    public AndroidClipboardManager getClipboardManager() {
        return this.clipboardManager;
    }

    @Override  // androidx.compose.ui.node.Owner
    public ClipboardManager getClipboardManager() {
        return this.getClipboardManager();
    }

    public final Function1 getConfigurationChangeObserver() {
        return this.configurationChangeObserver;
    }

    @Override  // androidx.compose.ui.node.Owner, androidx.compose.ui.node.RootForTest
    public Density getDensity() {
        return this.density;
    }

    // 去混淆评级： 低(26)
    @Override  // androidx.compose.ui.node.Owner
    public FocusDirection getFocusDirection-P8AzH3I(android.view.KeyEvent keyEvent0) {
        Intrinsics.checkNotNullParameter(keyEvent0, "keyEvent");
        long v = KeyEvent_androidKt.getKey-ZmokQxo(keyEvent0);
        if(Key.equals-impl0(v, 0x3D00000000L)) {
            return KeyEvent_androidKt.isShiftPressed-ZmokQxo(keyEvent0) ? FocusDirection.box-impl(2) : FocusDirection.box-impl(1);
        }
        if(Key.equals-impl0(v, 0x1600000000L)) {
            return FocusDirection.box-impl(4);
        }
        if(Key.equals-impl0(v, 0x1500000000L)) {
            return FocusDirection.box-impl(3);
        }
        if(Key.equals-impl0(v, 0x1300000000L)) {
            return FocusDirection.box-impl(5);
        }
        if(Key.equals-impl0(v, 0x1400000000L)) {
            return FocusDirection.box-impl(6);
        }
        if(Key.equals-impl0(v, 0x1700000000L)) {
            return FocusDirection.box-impl(7);
        }
        return Key.equals-impl0(v, 0x400000000L) ? FocusDirection.box-impl(8) : null;
    }

    @Override  // androidx.compose.ui.node.Owner
    public FocusManager getFocusManager() {
        return this._focusManager;
    }

    @Override  // androidx.compose.ui.node.Owner
    public ResourceLoader getFontLoader() {
        return this.fontLoader;
    }

    @Override  // androidx.compose.ui.node.Owner
    public HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    @Override  // androidx.compose.ui.platform.ViewRootForTest
    public boolean getHasPendingMeasureOrLayout() {
        return this.measureAndLayoutDelegate.getHasPendingMeasureOrLayout();
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.lastMatrixRecalculationAnimationTime;
    }

    public static void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    @Override  // androidx.compose.ui.node.Owner
    public LayoutDirection getLayoutDirection() {
        return (LayoutDirection)this.layoutDirection$delegate.getValue();
    }

    @Override  // androidx.compose.ui.node.Owner
    public long getMeasureIteration() {
        return this.measureAndLayoutDelegate.getMeasureIteration();
    }

    @Override  // androidx.compose.ui.node.Owner
    public LayoutNode getRoot() {
        return this.root;
    }

    @Override  // androidx.compose.ui.node.Owner
    public RootForTest getRootForTest() {
        return this.rootForTest;
    }

    @Override  // androidx.compose.ui.node.RootForTest
    public SemanticsOwner getSemanticsOwner() {
        return this.semanticsOwner;
    }

    @Override  // androidx.compose.ui.node.Owner
    public boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    public static void getShowLayoutBounds$annotations() {
    }

    @Override  // androidx.compose.ui.node.Owner
    public OwnerSnapshotObserver getSnapshotObserver() {
        return this.snapshotObserver;
    }

    @Override  // androidx.compose.ui.node.Owner, androidx.compose.ui.node.RootForTest
    public TextInputService getTextInputService() {
        return this.textInputService;
    }

    public static void getTextInputService$annotations() {
    }

    @Override  // androidx.compose.ui.node.Owner
    public TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    @Override  // androidx.compose.ui.platform.ViewRootForTest
    public View getView() [...] // Inlined contents

    @Override  // androidx.compose.ui.node.Owner
    public ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    public final ViewTreeOwners getViewTreeOwners() {
        return (ViewTreeOwners)this.viewTreeOwners$delegate.getValue();
    }

    @Override  // androidx.compose.ui.node.Owner
    public WindowInfo getWindowInfo() {
        return this._windowInfo;
    }

    @Override  // androidx.compose.ui.platform.ViewRootForTest
    public void invalidateDescendants() {
        this.invalidateLayers(this.getRoot());
    }

    private final void invalidateLayers(LayoutNode layoutNode0) {
        layoutNode0.invalidateLayers$ui_release();
        MutableVector mutableVector0 = layoutNode0.get_children$ui_release();
        int v = mutableVector0.getSize();
        if(v > 0) {
            Object[] arr_object = mutableVector0.getContent();
            int v1 = 0;
            while(true) {
                this.invalidateLayers(((LayoutNode)arr_object[v1]));
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
    }

    private final void invalidateLayoutNodeMeasurement(LayoutNode layoutNode0) {
        this.measureAndLayoutDelegate.requestRemeasure(layoutNode0);
        MutableVector mutableVector0 = layoutNode0.get_children$ui_release();
        int v = mutableVector0.getSize();
        if(v > 0) {
            Object[] arr_object = mutableVector0.getContent();
            int v1 = 0;
            while(true) {
                this.invalidateLayoutNodeMeasurement(((LayoutNode)arr_object[v1]));
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
    }

    @Override  // androidx.compose.ui.platform.ViewRootForTest
    public boolean isLifecycleInResumedState() {
        ViewTreeOwners androidComposeView$ViewTreeOwners0 = this.getViewTreeOwners();
        State lifecycle$State0 = null;
        if(androidComposeView$ViewTreeOwners0 != null) {
            Lifecycle lifecycle0 = androidComposeView$ViewTreeOwners0.getLifecycleOwner().getLifecycle();
            if(lifecycle0 != null) {
                lifecycle$State0 = lifecycle0.getCurrentState();
            }
        }
        return lifecycle$State0 == State.RESUMED;
    }

    public final Object keyboardVisibilityEventLoop(Continuation continuation0) {
        Object object0 = this.textInputServiceAndroid.keyboardVisibilityEventLoop(continuation0);
        return object0 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Override  // androidx.compose.ui.input.pointer.PositionCalculator
    public long localToScreen-MK-Hz9U(long v) {
        this.recalculateWindowPosition();
        long v1 = Matrix.map-MK-Hz9U(this.viewToWindowMatrix, v);
        return OffsetKt.Offset(Offset.getX-impl(v1) + Offset.getX-impl(this.windowPosition), Offset.getY-impl(v1) + Offset.getY-impl(this.windowPosition));
    }

    @Override  // androidx.compose.ui.node.Owner
    public void measureAndLayout() {
        if(this.measureAndLayoutDelegate.measureAndLayout()) {
            this.requestLayout();
        }
        MeasureAndLayoutDelegate.dispatchOnPositionedCallbacks$default(this.measureAndLayoutDelegate, false, 1, null);
    }

    public final void notifyLayerIsDirty$ui_release(OwnedLayer ownedLayer0, boolean z) {
        Intrinsics.checkNotNullParameter(ownedLayer0, "layer");
        if(z) {
            if(!this.isDrawingContent) {
                this.dirtyLayers.add(ownedLayer0);
                return;
            }
            List list0 = this.postponedDirtyLayers;
            if(list0 == null) {
                list0 = new ArrayList();
                this.postponedDirtyLayers = list0;
            }
            list0.add(ownedLayer0);
        }
        else if(!this.isDrawingContent && !this.dirtyLayers.remove(ownedLayer0)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    @Override  // androidx.compose.ui.node.Owner
    public void onAttach(LayoutNode layoutNode0) {
        Intrinsics.checkNotNullParameter(layoutNode0, "node");
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.invalidateLayoutNodeMeasurement(this.getRoot());
        this.invalidateLayers(this.getRoot());
        this.getSnapshotObserver().startObserving$ui_release();
        AndroidAutofill androidAutofill0 = this._autofill;
        if(androidAutofill0 != null) {
            AutofillCallback.INSTANCE.register(androidAutofill0);
        }
        LifecycleOwner lifecycleOwner0 = ViewTreeLifecycleOwner.get(this);
        SavedStateRegistryOwner savedStateRegistryOwner0 = ViewTreeSavedStateRegistryOwner.get(this);
        ViewTreeOwners androidComposeView$ViewTreeOwners0 = this.getViewTreeOwners();
        if(androidComposeView$ViewTreeOwners0 == null || lifecycleOwner0 != null && savedStateRegistryOwner0 != null && (lifecycleOwner0 != androidComposeView$ViewTreeOwners0.getLifecycleOwner() || savedStateRegistryOwner0 != androidComposeView$ViewTreeOwners0.getLifecycleOwner())) {
            if(lifecycleOwner0 == null) {
                throw new IllegalStateException("Composed into the View which doesn\'t propagate ViewTreeLifecycleOwner!");
            }
            if(savedStateRegistryOwner0 == null) {
                throw new IllegalStateException("Composed into the View which doesn\'t propagateViewTreeSavedStateRegistryOwner!");
            }
            if(androidComposeView$ViewTreeOwners0 != null) {
                Lifecycle lifecycle0 = androidComposeView$ViewTreeOwners0.getLifecycleOwner().getLifecycle();
                if(lifecycle0 != null) {
                    lifecycle0.removeObserver(this);
                }
            }
            lifecycleOwner0.getLifecycle().addObserver(this);
            ViewTreeOwners androidComposeView$ViewTreeOwners1 = new ViewTreeOwners(lifecycleOwner0, savedStateRegistryOwner0);
            this.setViewTreeOwners(androidComposeView$ViewTreeOwners1);
            Function1 function10 = this.onViewTreeOwnersAvailable;
            if(function10 != null) {
                function10.invoke(androidComposeView$ViewTreeOwners1);
            }
            this.onViewTreeOwnersAvailable = null;
        }
        ViewTreeOwners androidComposeView$ViewTreeOwners2 = this.getViewTreeOwners();
        Intrinsics.checkNotNull(androidComposeView$ViewTreeOwners2);
        androidComposeView$ViewTreeOwners2.getLifecycleOwner().getLifecycle().addObserver(this);
        this.getViewTreeObserver().addOnGlobalLayoutListener(this.globalLayoutListener);
        this.getViewTreeObserver().addOnScrollChangedListener(this.scrollChangedListener);
    }

    @Override  // android.view.View
    public boolean onCheckIsTextEditor() {
        return this.textInputServiceAndroid.isEditorFocused();
    }

    @Override  // android.view.View
    protected void onConfigurationChanged(Configuration configuration0) {
        Intrinsics.checkNotNullParameter(configuration0, "newConfig");
        super.onConfigurationChanged(configuration0);
        Context context0 = this.getContext();
        Intrinsics.checkNotNullExpressionValue(context0, "context");
        this.density = AndroidDensity_androidKt.Density(context0);
        this.configurationChangeObserver.invoke(configuration0);
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(LifecycleOwner lifecycleOwner0) {
    }

    @Override  // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo0) {
        Intrinsics.checkNotNullParameter(editorInfo0, "outAttrs");
        return this.textInputServiceAndroid.createInputConnection(editorInfo0);
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(LifecycleOwner lifecycleOwner0) {
    }

    @Override  // androidx.compose.ui.node.Owner
    public void onDetach(LayoutNode layoutNode0) {
        Intrinsics.checkNotNullParameter(layoutNode0, "node");
        this.measureAndLayoutDelegate.onNodeDetached(layoutNode0);
        this.requestClearInvalidObservations();
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.getSnapshotObserver().stopObserving$ui_release();
        ViewTreeOwners androidComposeView$ViewTreeOwners0 = this.getViewTreeOwners();
        if(androidComposeView$ViewTreeOwners0 != null) {
            Lifecycle lifecycle0 = androidComposeView$ViewTreeOwners0.getLifecycleOwner().getLifecycle();
            if(lifecycle0 != null) {
                lifecycle0.removeObserver(this);
            }
        }
        AndroidAutofill androidAutofill0 = this._autofill;
        if(androidAutofill0 != null) {
            AutofillCallback.INSTANCE.unregister(androidAutofill0);
        }
        this.getViewTreeObserver().removeOnGlobalLayoutListener(this.globalLayoutListener);
        this.getViewTreeObserver().removeOnScrollChangedListener(this.scrollChangedListener);
    }

    @Override  // android.view.View
    protected void onDraw(Canvas canvas0) {
        Intrinsics.checkNotNullParameter(canvas0, "canvas");
    }

    @Override  // android.view.View
    protected void onFocusChanged(boolean z, int v, Rect rect0) {
        super.onFocusChanged(z, v, rect0);
        Log.d("Compose Focus", "Owner FocusChanged(" + z + ')');
        FocusManagerImpl focusManagerImpl0 = this._focusManager;
        if(z) {
            focusManagerImpl0.takeFocus();
            return;
        }
        focusManagerImpl0.releaseFocus();
    }

    @Override  // android.view.ViewGroup
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        this.onMeasureConstraints = null;
        this.updatePositionCacheAndDispatch();
        if(this._androidViewsHandler != null) {
            this.getAndroidViewsHandler$ui_release().layout(0, 0, v2 - v, v3 - v1);
        }
    }

    @Override  // androidx.compose.ui.node.Owner
    public void onLayoutChange(LayoutNode layoutNode0) {
        Intrinsics.checkNotNullParameter(layoutNode0, "layoutNode");
        this.accessibilityDelegate.onLayoutChange$ui_release(layoutNode0);
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if(!this.isAttachedToWindow()) {
                this.invalidateLayoutNodeMeasurement(this.getRoot());
            }
            Pair pair0 = this.convertMeasureSpec(v);
            Pair pair1 = this.convertMeasureSpec(v1);
            long v3 = ConstraintsKt.Constraints(((Number)pair0.component1()).intValue(), ((Number)pair0.component2()).intValue(), ((Number)pair1.component1()).intValue(), ((Number)pair1.component2()).intValue());
            Constraints constraints0 = this.onMeasureConstraints;
            boolean z = false;
            if(constraints0 == null) {
                this.onMeasureConstraints = Constraints.box-impl(v3);
                this.wasMeasuredWithMultipleConstraints = false;
            }
            else {
                if(constraints0 != null) {
                    z = Constraints.equals-impl0(constraints0.unbox-impl(), v3);
                }
                if(!z) {
                    this.wasMeasuredWithMultipleConstraints = true;
                }
            }
            this.measureAndLayoutDelegate.updateRootConstraints-BRTryo0(v3);
            this.measureAndLayoutDelegate.measureAndLayout();
            this.setMeasuredDimension(this.getRoot().getWidth(), this.getRoot().getHeight());
            if(this._androidViewsHandler != null) {
                this.getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(this.getRoot().getWidth(), 0x40000000), View.MeasureSpec.makeMeasureSpec(this.getRoot().getHeight(), 0x40000000));
            }
        }
        finally {
            Trace.endSection();
        }
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(LifecycleOwner lifecycleOwner0) {
    }

    @Override  // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure0, int v) {
        if(viewStructure0 != null) {
            AndroidAutofill androidAutofill0 = this._autofill;
            if(androidAutofill0 != null) {
                AndroidAutofill_androidKt.populateViewStructure(androidAutofill0, viewStructure0);
            }
        }
    }

    @Override  // androidx.compose.ui.node.Owner
    public void onRequestMeasure(LayoutNode layoutNode0) {
        Intrinsics.checkNotNullParameter(layoutNode0, "layoutNode");
        if(this.measureAndLayoutDelegate.requestRemeasure(layoutNode0)) {
            this.scheduleMeasureAndLayout(layoutNode0);
        }
    }

    @Override  // androidx.compose.ui.node.Owner
    public void onRequestRelayout(LayoutNode layoutNode0) {
        Intrinsics.checkNotNullParameter(layoutNode0, "layoutNode");
        if(this.measureAndLayoutDelegate.requestRelayout(layoutNode0)) {
            AndroidComposeView.scheduleMeasureAndLayout$default(this, null, 1, null);
        }
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(LifecycleOwner lifecycleOwner0) {
        Intrinsics.checkNotNullParameter(lifecycleOwner0, "owner");
        this.setShowLayoutBounds(AndroidComposeView.Companion.getIsShowingLayoutBounds());
    }

    @Override  // android.view.View
    public void onRtlPropertiesChanged(int v) {
        if(this.superclassInitComplete) {
            this.setLayoutDirection(AndroidComposeView_androidKt.layoutDirectionFromInt(v));
        }
    }

    @Override  // androidx.compose.ui.node.Owner
    public void onSemanticsChange() {
        this.accessibilityDelegate.onSemanticsChange$ui_release();
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(LifecycleOwner lifecycleOwner0) {
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner lifecycleOwner0) {
    }

    @Override  // android.view.View
    public void onWindowFocusChanged(boolean z) {
        this._windowInfo.setWindowFocused(z);
        super.onWindowFocusChanged(z);
    }

    private final void preConcat-tU-YjHk(float[] arr_f, android.graphics.Matrix matrix0) {
        AndroidMatrixConversions_androidKt.setFrom-tU-YjHk(this.tmpCalculationMatrix, matrix0);
        AndroidComposeView_androidKt.preTransform-JiSxe2E(arr_f, this.tmpCalculationMatrix);
    }

    private final void preTranslate-3XD1CNM(float[] arr_f, float f, float f1) {
        Matrix.reset-impl(this.tmpCalculationMatrix);
        Matrix.translate-impl$default(this.tmpCalculationMatrix, f, f1, 0.0f, 4, null);
        AndroidComposeView_androidKt.preTransform-JiSxe2E(arr_f, this.tmpCalculationMatrix);
    }

    private final void recalculateWindowPosition() {
        if(!this.forceUseMatrixCache) {
            long v = AnimationUtils.currentAnimationTimeMillis();
            if(v != this.lastMatrixRecalculationAnimationTime) {
                this.lastMatrixRecalculationAnimationTime = v;
                this.recalculateWindowViewTransforms();
                ViewParent viewParent0 = this.getParent();
                View view0 = this;
                while(viewParent0 instanceof ViewGroup) {
                    view0 = (View)viewParent0;
                    viewParent0 = ((ViewGroup)view0).getParent();
                }
                view0.getLocationOnScreen(this.tmpPositionArray);
                float f = (float)this.tmpPositionArray[0];
                float f1 = (float)this.tmpPositionArray[1];
                view0.getLocationInWindow(this.tmpPositionArray);
                this.windowPosition = OffsetKt.Offset(f - ((float)this.tmpPositionArray[0]), f1 - ((float)this.tmpPositionArray[1]));
            }
        }
    }

    private final void recalculateWindowPosition(MotionEvent motionEvent0) {
        this.lastMatrixRecalculationAnimationTime = AnimationUtils.currentAnimationTimeMillis();
        this.recalculateWindowViewTransforms();
        long v = OffsetKt.Offset(motionEvent0.getX(), motionEvent0.getY());
        long v1 = Matrix.map-MK-Hz9U(this.viewToWindowMatrix, v);
        this.windowPosition = OffsetKt.Offset(motionEvent0.getRawX() - Offset.getX-impl(v1), motionEvent0.getRawY() - Offset.getY-impl(v1));
    }

    private final void recalculateWindowViewTransforms() {
        Matrix.reset-impl(this.viewToWindowMatrix);
        this.transformMatrixToWindow-EL8BTi8(this, this.viewToWindowMatrix);
        AndroidComposeView_androidKt.invertTo-JiSxe2E(this.viewToWindowMatrix, this.windowToViewMatrix);
    }

    public final void removeAndroidView(AndroidViewHolder androidViewHolder0) {
        Intrinsics.checkNotNullParameter(androidViewHolder0, "view");
        this.getAndroidViewsHandler$ui_release().removeView(androidViewHolder0);
        this.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(androidViewHolder0);
        Map map0 = this.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder();
        Object object0 = this.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().get(androidViewHolder0);
        if(map0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
        }
        TypeIntrinsics.asMutableMap(map0).remove(object0);
        ViewCompat.setImportantForAccessibility(androidViewHolder0, 0);
    }

    public final void requestClearInvalidObservations() {
        this.observationClearRequested = true;
    }

    @Override  // androidx.compose.ui.node.Owner
    public void requestRectangleOnScreen(androidx.compose.ui.geometry.Rect rect0) {
        Intrinsics.checkNotNullParameter(rect0, "rect");
        this.requestRectangleOnScreen(AndroidComposeView_androidKt.toRect(rect0));
    }

    private final void scheduleMeasureAndLayout(LayoutNode layoutNode0) {
        if(!this.isLayoutRequested() && this.isAttachedToWindow()) {
            if(this.wasMeasuredWithMultipleConstraints && layoutNode0 != null) {
                while(layoutNode0 != null && layoutNode0.getMeasuredByParent$ui_release() == UsageByParent.InMeasureBlock) {
                    layoutNode0 = layoutNode0.getParent$ui_release();
                }
                if(layoutNode0 == this.getRoot()) {
                    this.requestLayout();
                    return;
                }
            }
            if(this.getWidth() != 0 && this.getHeight() != 0) {
                this.invalidate();
                return;
            }
            this.requestLayout();
        }
    }

    static void scheduleMeasureAndLayout$default(AndroidComposeView androidComposeView0, LayoutNode layoutNode0, int v, Object object0) {
        if((v & 1) != 0) {
            layoutNode0 = null;
        }
        androidComposeView0.scheduleMeasureAndLayout(layoutNode0);
    }

    @Override  // androidx.compose.ui.input.pointer.PositionCalculator
    public long screenToLocal-MK-Hz9U(long v) {
        this.recalculateWindowPosition();
        long v1 = OffsetKt.Offset(Offset.getX-impl(v) - Offset.getX-impl(this.windowPosition), Offset.getY-impl(v) - Offset.getY-impl(this.windowPosition));
        return Matrix.map-MK-Hz9U(this.windowToViewMatrix, v1);
    }

    @Override  // androidx.compose.ui.node.RootForTest
    public boolean sendKeyEvent-ZmokQxo(android.view.KeyEvent keyEvent0) {
        Intrinsics.checkNotNullParameter(keyEvent0, "keyEvent");
        return this.keyInputModifier.processKeyInput-ZmokQxo(keyEvent0);
    }

    public final void setConfigurationChangeObserver(Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "<set-?>");
        this.configurationChangeObserver = function10;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long v) {
        this.lastMatrixRecalculationAnimationTime = v;
    }

    private void setLayoutDirection(LayoutDirection layoutDirection0) {
        this.layoutDirection$delegate.setValue(layoutDirection0);
    }

    public final void setOnViewTreeOwnersAvailable(Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "callback");
        ViewTreeOwners androidComposeView$ViewTreeOwners0 = this.getViewTreeOwners();
        if(androidComposeView$ViewTreeOwners0 != null) {
            function10.invoke(androidComposeView$ViewTreeOwners0);
        }
        if(!this.isAttachedToWindow()) {
            this.onViewTreeOwnersAvailable = function10;
        }
    }

    @Override  // androidx.compose.ui.node.Owner
    public void setShowLayoutBounds(boolean z) {
        this.showLayoutBounds = z;
    }

    private final void setViewTreeOwners(ViewTreeOwners androidComposeView$ViewTreeOwners0) {
        this.viewTreeOwners$delegate.setValue(androidComposeView$ViewTreeOwners0);
    }

    private final void transformMatrixToWindow-EL8BTi8(View view0, float[] arr_f) {
        ViewParent viewParent0 = view0.getParent();
        if(viewParent0 instanceof View) {
            this.transformMatrixToWindow-EL8BTi8(((View)viewParent0), arr_f);
            this.preTranslate-3XD1CNM(arr_f, -((float)view0.getScrollX()), -((float)view0.getScrollY()));
            this.preTranslate-3XD1CNM(arr_f, ((float)view0.getLeft()), ((float)view0.getTop()));
        }
        else {
            view0.getLocationInWindow(this.tmpPositionArray);
            this.preTranslate-3XD1CNM(arr_f, -((float)view0.getScrollX()), -((float)view0.getScrollY()));
            this.preTranslate-3XD1CNM(arr_f, ((float)this.tmpPositionArray[0]), ((float)this.tmpPositionArray[1]));
        }
        android.graphics.Matrix matrix0 = view0.getMatrix();
        if(!matrix0.isIdentity()) {
            Intrinsics.checkNotNullExpressionValue(matrix0, "viewMatrix");
            this.preConcat-tU-YjHk(arr_f, matrix0);
        }
    }

    // 检测为 Lambda 实现
    private final void updatePositionCacheAndDispatch() [...]
}

