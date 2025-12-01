package androidx.compose.ui.platform;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableString;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.collection.ArraySet;
import androidx.collection.SparseArrayCompat;
import androidx.compose.ui.R.id;
import androidx.compose.ui.R.string;
import androidx.compose.ui.TempListUtilsKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.accessibility.CollectionInfoKt;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsModifier;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsNodeKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsWrapper;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.platform.AndroidAccessibilitySpannableString_androidKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.RangeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelKt;

@Metadata(d1 = {"\u0000\u00F0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u001C\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000 \u00A9\u00012\u00020\u0001:\f\u00A7\u0001\u00A8\u0001\u00A9\u0001\u00AA\u0001\u00AB\u0001\u00AC\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\u0002\u0010\u0004J*\u0010B\u001A\u00020\u00142\u0006\u0010C\u001A\u00020\u00062\u0006\u0010D\u001A\u00020E2\u0006\u0010F\u001A\u00020G2\b\u0010H\u001A\u0004\u0018\u00010IH\u0002J\u0011\u0010J\u001A\u00020\u0014H\u0086@\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010KJ\b\u0010L\u001A\u00020\u0014H\u0002J\u0010\u0010M\u001A\u00020\b2\u0006\u0010C\u001A\u00020\u0006H\u0002J\u001D\u0010N\u001A\u00020O2\u0006\u0010C\u001A\u00020\u00062\u0006\u0010P\u001A\u00020\u0006H\u0001\u00A2\u0006\u0002\bQJ\u0012\u0010R\u001A\u0004\u0018\u00010E2\u0006\u0010C\u001A\u00020\u0006H\u0002J=\u0010S\u001A\u00020O2\u0006\u0010C\u001A\u00020\u00062\b\u0010T\u001A\u0004\u0018\u00010\u00062\b\u0010U\u001A\u0004\u0018\u00010\u00062\b\u0010V\u001A\u0004\u0018\u00010\u00062\b\u0010W\u001A\u0004\u0018\u00010GH\u0002\u00A2\u0006\u0002\u0010XJ\u000E\u0010Y\u001A\u00020\b2\u0006\u0010Z\u001A\u00020[J\u0012\u0010\\\u001A\u00020\'2\b\u0010]\u001A\u0004\u0018\u00010^H\u0016J\u0010\u0010_\u001A\u00020\u00062\u0006\u0010`\u001A\u00020aH\u0002J\u0010\u0010b\u001A\u00020\u00062\u0006\u0010`\u001A\u00020aH\u0002J\u0014\u0010c\u001A\u0004\u0018\u00010G2\b\u0010`\u001A\u0004\u0018\u00010aH\u0002J\u001C\u0010d\u001A\u0004\u0018\u00010e2\b\u0010`\u001A\u0004\u0018\u00010a2\u0006\u0010f\u001A\u00020\u0006H\u0002J\u0014\u0010g\u001A\u0004\u0018\u00010G2\b\u0010`\u001A\u0004\u0018\u00010aH\u0002J\u001D\u0010h\u001A\u00020\u00062\u0006\u0010i\u001A\u00020j2\u0006\u0010k\u001A\u00020jH\u0001\u00A2\u0006\u0002\blJ\u0010\u0010m\u001A\u00020\b2\u0006\u0010C\u001A\u00020\u0006H\u0002J\u0010\u0010n\u001A\u00020\b2\u0006\u0010`\u001A\u00020aH\u0002J\u0010\u0010o\u001A\u00020\u00142\u0006\u0010p\u001A\u00020?H\u0002J\u0015\u0010q\u001A\u00020\u00142\u0006\u0010p\u001A\u00020?H\u0000\u00A2\u0006\u0002\brJ\r\u0010s\u001A\u00020\u0014H\u0000\u00A2\u0006\u0002\btJ\"\u0010u\u001A\u00020\b2\u0006\u0010C\u001A\u00020\u00062\u0006\u0010v\u001A\u00020\u00062\b\u0010H\u001A\u0004\u0018\u00010IH\u0002J \u0010w\u001A\u00020\u00142\u0006\u0010C\u001A\u00020\u00062\u0006\u0010D\u001A\u00020x2\u0006\u0010y\u001A\u00020aH\u0007J\u001E\u0010z\u001A\u00020\b2\u0006\u0010{\u001A\u00020\u00062\f\u0010|\u001A\b\u0012\u0004\u0012\u0002090}H\u0002J\u0010\u0010~\u001A\u00020\b2\u0006\u0010C\u001A\u00020\u0006H\u0002J\u0010\u0010\u007F\u001A\u00020\u00062\u0006\u0010{\u001A\u00020\u0006H\u0002J\u0011\u0010\u0080\u0001\u001A\u00020\b2\u0006\u0010Z\u001A\u00020OH\u0002J?\u0010\u0081\u0001\u001A\u00020\b2\u0006\u0010C\u001A\u00020\u00062\u0006\u0010P\u001A\u00020\u00062\u000B\b\u0002\u0010\u0082\u0001\u001A\u0004\u0018\u00010\u00062\u0011\b\u0002\u0010\u0083\u0001\u001A\n\u0012\u0004\u0012\u00020G\u0018\u00010}H\u0002\u00A2\u0006\u0003\u0010\u0084\u0001J&\u0010\u0085\u0001\u001A\u00020\u00142\u0007\u0010\u0086\u0001\u001A\u00020\u00062\u0007\u0010\u0082\u0001\u001A\u00020\u00062\t\u0010\u0087\u0001\u001A\u0004\u0018\u00010GH\u0002J\u0012\u0010\u0088\u0001\u001A\u00020\u00142\u0007\u0010\u0086\u0001\u001A\u00020\u0006H\u0002J\u0012\u0010\u0089\u0001\u001A\u00020\u00142\u0007\u0010\u008A\u0001\u001A\u000209H\u0002J$\u0010\u008B\u0001\u001A\u00020\u00142\u0013\u0010\u008C\u0001\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00180\u0017H\u0001\u00A2\u0006\u0003\b\u008D\u0001J\u001B\u0010\u008E\u0001\u001A\u00020\u00142\u0007\u0010\u008F\u0001\u001A\u00020a2\u0007\u0010\u0090\u0001\u001A\u00020.H\u0002J \u0010\u0091\u0001\u001A\u00020\u00142\u0006\u0010p\u001A\u00020?2\r\u0010\u0092\u0001\u001A\b\u0012\u0004\u0012\u00020\u00060)H\u0002J,\u0010\u0093\u0001\u001A\u00020\b2\u0006\u0010`\u001A\u00020a2\u0007\u0010\u0094\u0001\u001A\u00020\u00062\u0007\u0010\u0095\u0001\u001A\u00020\u00062\u0007\u0010\u0096\u0001\u001A\u00020\bH\u0002J\u0019\u0010\u0097\u0001\u001A\u00020\u00142\u0006\u0010`\u001A\u00020a2\u0006\u0010D\u001A\u00020xH\u0002J\u0019\u0010\u0098\u0001\u001A\u00020\u00142\u0006\u0010`\u001A\u00020a2\u0006\u0010D\u001A\u00020xH\u0002J!\u0010\u0099\u0001\u001A\u0005\u0018\u00010\u009A\u00012\t\u0010\u009B\u0001\u001A\u0004\u0018\u00010a2\b\u0010\u009C\u0001\u001A\u00030\u009D\u0001H\u0002J+\u0010\u009E\u0001\u001A\u00020\b2\u0006\u0010`\u001A\u00020a2\u0006\u0010f\u001A\u00020\u00062\u0007\u0010\u009F\u0001\u001A\u00020\b2\u0007\u0010\u00A0\u0001\u001A\u00020\bH\u0002J3\u0010\u00A1\u0001\u001A\u0005\u0018\u0001H\u00A2\u0001\"\t\b\u0000\u0010\u00A2\u0001*\u00020\u00112\t\u0010W\u001A\u0005\u0018\u0001H\u00A2\u00012\t\b\u0001\u0010\u00A3\u0001\u001A\u00020\u0006H\u0002\u00A2\u0006\u0003\u0010\u00A4\u0001J\u0011\u0010\u00A5\u0001\u001A\u00020\u00142\u0006\u0010C\u001A\u00020\u0006H\u0002J\t\u0010\u00A6\u0001\u001A\u00020\u0014H\u0002R\u000E\u0010\u0005\u001A\u00020\u0006X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u001A\u0010\u0007\u001A\u00020\bX\u0080\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\t\u0010\n\"\u0004\b\u000B\u0010\fR\u000E\u0010\r\u001A\u00020\u000EX\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u001A\u0010\u000F\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u0010X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0015\u001A\u00020\bX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\"\u0010\u0016\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00180\u00178BX\u0082\u000E\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0019\u0010\u001AR\u000E\u0010\u001B\u001A\u00020\bX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u001C\u001A\u00020\u0006X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u001D\u001A\u00020\u001EX\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u001A\u0010\u001F\u001A\u00020\u0006X\u0080\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0014\u0010$\u001A\u00020\b8BX\u0082\u0004\u00A2\u0006\u0006\u001A\u0004\b$\u0010\nR \u0010%\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\u00170\u0010X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010&\u001A\u00020\'X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0014\u0010(\u001A\b\u0012\u0004\u0012\u00020\u00060)X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0010\u0010*\u001A\u0004\u0018\u00010+X\u0082\u000E\u00A2\u0006\u0002\n\u0000R0\u0010,\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020.0-8\u0000@\u0000X\u0081\u000E\u00A2\u0006\u0014\n\u0000\u0012\u0004\b/\u00100\u001A\u0004\b1\u0010\u001A\"\u0004\b2\u00103R\u000E\u00104\u001A\u00020.X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0012\u00105\u001A\u0004\u0018\u00010\u0006X\u0082\u000E\u00A2\u0006\u0004\n\u0002\u00106R\u0014\u00107\u001A\b\u0012\u0004\u0012\u00020908X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u000E\u0010:\u001A\u00020;X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u001A\u0010<\u001A\u000E\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\u00140=X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0014\u0010>\u001A\b\u0012\u0004\u0012\u00020?0)X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b@\u0010A\u0082\u0002\u0004\n\u0002\b\u0019\u00A8\u0006\u00AD\u0001"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "Landroidx/core/view/AccessibilityDelegateCompat;", "view", "Landroidx/compose/ui/platform/AndroidComposeView;", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "accessibilityCursorPosition", "", "accessibilityForceEnabledForTesting", "", "getAccessibilityForceEnabledForTesting$ui_release", "()Z", "setAccessibilityForceEnabledForTesting$ui_release", "(Z)V", "accessibilityManager", "Landroid/view/accessibility/AccessibilityManager;", "actionIdToLabel", "Landroidx/collection/SparseArrayCompat;", "", "boundsUpdateChannel", "Lkotlinx/coroutines/channels/Channel;", "", "checkingForSemanticsChanges", "currentSemanticsNodes", "", "Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;", "getCurrentSemanticsNodes", "()Ljava/util/Map;", "currentSemanticsNodesInvalidated", "focusedVirtualViewId", "handler", "Landroid/os/Handler;", "hoveredVirtualViewId", "getHoveredVirtualViewId$ui_release", "()I", "setHoveredVirtualViewId$ui_release", "(I)V", "isAccessibilityEnabled", "labelToActionId", "nodeProvider", "Landroidx/core/view/accessibility/AccessibilityNodeProviderCompat;", "paneDisplayed", "Landroidx/collection/ArraySet;", "pendingTextTraversedEvent", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent;", "previousSemanticsNodes", "", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy;", "getPreviousSemanticsNodes$ui_release$annotations", "()V", "getPreviousSemanticsNodes$ui_release", "setPreviousSemanticsNodes$ui_release", "(Ljava/util/Map;)V", "previousSemanticsRoot", "previousTraversedNode", "Ljava/lang/Integer;", "scrollObservationScopes", "", "Landroidx/compose/ui/platform/ScrollObservationScope;", "semanticsChangeChecker", "Ljava/lang/Runnable;", "sendScrollEventIfNeededLambda", "Lkotlin/Function1;", "subtreeChangedLayoutNodes", "Landroidx/compose/ui/node/LayoutNode;", "getView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "addExtraDataToAccessibilityNodeInfoHelper", "virtualViewId", "info", "Landroid/view/accessibility/AccessibilityNodeInfo;", "extraDataKey", "", "arguments", "Landroid/os/Bundle;", "boundsUpdatesEventLoop", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkForSemanticsChanges", "clearAccessibilityFocus", "createEvent", "Landroid/view/accessibility/AccessibilityEvent;", "eventType", "createEvent$ui_release", "createNodeInfo", "createTextSelectionChangedEvent", "fromIndex", "toIndex", "itemCount", "text", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityEvent;", "dispatchHoverEvent", "event", "Landroid/view/MotionEvent;", "getAccessibilityNodeProvider", "host", "Landroid/view/View;", "getAccessibilitySelectionEnd", "node", "Landroidx/compose/ui/semantics/SemanticsNode;", "getAccessibilitySelectionStart", "getIterableTextForAccessibility", "getIteratorForGranularity", "Landroidx/compose/ui/platform/AccessibilityIterators$TextSegmentIterator;", "granularity", "getTextForTextField", "hitTestSemanticsAt", "x", "", "y", "hitTestSemanticsAt$ui_release", "isAccessibilityFocused", "isAccessibilitySelectionExtendable", "notifySubtreeAccessibilityStateChangedIfNeeded", "layoutNode", "onLayoutChange", "onLayoutChange$ui_release", "onSemanticsChange", "onSemanticsChange$ui_release", "performActionHelper", "action", "populateAccessibilityNodeInfoProperties", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "semanticsNode", "registerScrollingId", "id", "oldScrollObservationScopes", "", "requestAccessibilityFocus", "semanticsNodeIdToAccessibilityVirtualNodeId", "sendEvent", "sendEventForVirtualView", "contentChangeType", "contentDescription", "(IILjava/lang/Integer;Ljava/util/List;)Z", "sendPaneChangeEvents", "semanticsNodeId", "title", "sendPendingTextTraversedAtGranularityEvent", "sendScrollEventIfNeeded", "scrollObservationScope", "sendSemanticsPropertyChangeEvents", "newSemanticsNodes", "sendSemanticsPropertyChangeEvents$ui_release", "sendSemanticsStructureChangeEvents", "newNode", "oldNode", "sendSubtreeChangeAccessibilityEvents", "subtreeChangedSemanticsNodesIds", "setAccessibilitySelection", "start", "end", "traversalMode", "setContentInvalid", "setText", "toScreenCoords", "Landroid/graphics/RectF;", "textNode", "bounds", "Landroidx/compose/ui/geometry/Rect;", "traverseAtGranularity", "forward", "extendSelection", "trimToSize", "T", "size", "(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;", "updateHoveredVirtualView", "updateSemanticsNodesCopyAndPanes", "Api24Impl", "Api28Impl", "Companion", "MyNodeProvider", "PendingTextTraversedEvent", "SemanticsNodeCopy", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class AndroidComposeViewAccessibilityDelegateCompat extends AccessibilityDelegateCompat {
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Api24Impl;", "", "()V", "Companion", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    static final class Api24Impl {
        @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Api24Impl$Companion;", "", "()V", "addSetProgressAction", "", "info", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "semanticsNode", "Landroidx/compose/ui/semantics/SemanticsNode;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
        public static final class Companion {
            private Companion() {
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            public final void addSetProgressAction(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0, SemanticsNode semanticsNode0) {
                Intrinsics.checkNotNullParameter(accessibilityNodeInfoCompat0, "info");
                Intrinsics.checkNotNullParameter(semanticsNode0, "semanticsNode");
                if(AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode0)) {
                    AccessibilityAction accessibilityAction0 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getSetProgress());
                    if(accessibilityAction0 != null) {
                        accessibilityNodeInfoCompat0.addAction(new AccessibilityActionCompat(0x102003D, accessibilityAction0.getLabel()));
                    }
                }
            }
        }

        public static final Companion Companion;

        static {
            Api24Impl.Companion = new Companion(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Api28Impl;", "", "()V", "Companion", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    static final class Api28Impl {
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001E\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\b¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Api28Impl$Companion;", "", "()V", "setScrollEventDelta", "", "event", "Landroid/view/accessibility/AccessibilityEvent;", "deltaX", "", "deltaY", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
        public static final class androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.Api28Impl.Companion {
            private androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.Api28Impl.Companion() {
            }

            public androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.Api28Impl.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            public final void setScrollEventDelta(AccessibilityEvent accessibilityEvent0, int v, int v1) {
                Intrinsics.checkNotNullParameter(accessibilityEvent0, "event");
                accessibilityEvent0.setScrollDeltaX(v);
                accessibilityEvent0.setScrollDeltaY(v1);
            }
        }

        public static final androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.Api28Impl.Companion Companion;

        static {
            Api28Impl.Companion = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.Api28Impl.Companion(null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000E\u0010\u0003\u001A\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u0005\u001A\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000E\u0010\u0007\u001A\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000E\u0010\b\u001A\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000E\u0010\n\u001A\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000E\u0010\u000B\u001A\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000E\u0010\f\u001A\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000E\u0010\r\u001A\u00020\u000EX\u0086T¢\u0006\u0002\n\u0000R\u000E\u0010\u000F\u001A\u00020\u000EX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Companion;", "", "()V", "AccessibilityActionsResourceIds", "", "AccessibilityCursorPositionUndefined", "", "AccessibilitySliderStepsCount", "ClassName", "", "InvalidId", "LogTag", "ParcelSafeTextLength", "SendRecurringAccessibilityEventsIntervalMillis", "", "TextTraversedEventTimeoutMillis", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.Companion {
        private androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.Companion() {
        }

        public androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\n2\b\u0010\u000B\u001A\u0004\u0018\u00010\fH\u0016J\u0012\u0010\r\u001A\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001A\u00020\u0006H\u0016J\"\u0010\u000E\u001A\u00020\u000F2\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0010\u001A\u00020\u00062\b\u0010\u000B\u001A\u0004\u0018\u00010\fH\u0016¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$MyNodeProvider;", "Landroid/view/accessibility/AccessibilityNodeProvider;", "(Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;)V", "addExtraDataToAccessibilityNodeInfo", "", "virtualViewId", "", "info", "Landroid/view/accessibility/AccessibilityNodeInfo;", "extraDataKey", "", "arguments", "Landroid/os/Bundle;", "createAccessibilityNodeInfo", "performAction", "", "action", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public final class MyNodeProvider extends AccessibilityNodeProvider {
        public MyNodeProvider() {
            Intrinsics.checkNotNullParameter(androidComposeViewAccessibilityDelegateCompat0, "this$0");
            AndroidComposeViewAccessibilityDelegateCompat.this = androidComposeViewAccessibilityDelegateCompat0;
            super();
        }

        @Override  // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int v, AccessibilityNodeInfo accessibilityNodeInfo0, String s, Bundle bundle0) {
            Intrinsics.checkNotNullParameter(accessibilityNodeInfo0, "info");
            Intrinsics.checkNotNullParameter(s, "extraDataKey");
            AndroidComposeViewAccessibilityDelegateCompat.this.addExtraDataToAccessibilityNodeInfoHelper(v, accessibilityNodeInfo0, s, bundle0);
        }

        @Override  // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int v) {
            return AndroidComposeViewAccessibilityDelegateCompat.this.createNodeInfo(v);
        }

        @Override  // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int v, int v1, Bundle bundle0) {
            return AndroidComposeViewAccessibilityDelegateCompat.this.performActionHelper(v, v1, bundle0);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000B\b\u0002\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\u0007\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0005\u0012\u0006\u0010\t\u001A\u00020\n¢\u0006\u0002\u0010\u000BR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\rR\u0011\u0010\u0006\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\rR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001A\u00020\n¢\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent;", "", "node", "Landroidx/compose/ui/semantics/SemanticsNode;", "action", "", "granularity", "fromIndex", "toIndex", "traverseTime", "", "(Landroidx/compose/ui/semantics/SemanticsNode;IIIIJ)V", "getAction", "()I", "getFromIndex", "getGranularity", "getNode", "()Landroidx/compose/ui/semantics/SemanticsNode;", "getToIndex", "getTraverseTime", "()J", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    static final class PendingTextTraversedEvent {
        private final int action;
        private final int fromIndex;
        private final int granularity;
        private final SemanticsNode node;
        private final int toIndex;
        private final long traverseTime;

        public PendingTextTraversedEvent(SemanticsNode semanticsNode0, int v, int v1, int v2, int v3, long v4) {
            Intrinsics.checkNotNullParameter(semanticsNode0, "node");
            super();
            this.node = semanticsNode0;
            this.action = v;
            this.granularity = v1;
            this.fromIndex = v2;
            this.toIndex = v3;
            this.traverseTime = v4;
        }

        public final int getAction() {
            return this.action;
        }

        public final int getFromIndex() {
            return this.fromIndex;
        }

        public final int getGranularity() {
            return this.granularity;
        }

        public final SemanticsNode getNode() {
            return this.node;
        }

        public final int getToIndex() {
            return this.toIndex;
        }

        public final long getTraverseTime() {
            return this.traverseTime;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ\u0006\u0010\u0011\u001A\u00020\u0012R\u0017\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\r\u001A\u00020\u000E¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u0010¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy;", "", "semanticsNode", "Landroidx/compose/ui/semantics/SemanticsNode;", "currentSemanticsNodes", "", "", "Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;", "(Landroidx/compose/ui/semantics/SemanticsNode;Ljava/util/Map;)V", "children", "", "getChildren", "()Ljava/util/Set;", "unmergedConfig", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getUnmergedConfig", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "hasPaneTitle", "", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class SemanticsNodeCopy {
        private final Set children;
        private final SemanticsConfiguration unmergedConfig;

        public SemanticsNodeCopy(SemanticsNode semanticsNode0, Map map0) {
            Intrinsics.checkNotNullParameter(semanticsNode0, "semanticsNode");
            Intrinsics.checkNotNullParameter(map0, "currentSemanticsNodes");
            super();
            this.unmergedConfig = semanticsNode0.getUnmergedConfig$ui_release();
            this.children = new LinkedHashSet();
            List list0 = semanticsNode0.getReplacedChildren$ui_release();
            int v = list0.size();
            if(v - 1 >= 0) {
                for(int v1 = 0; true; ++v1) {
                    SemanticsNode semanticsNode1 = (SemanticsNode)list0.get(v1);
                    if(map0.containsKey(semanticsNode1.getId())) {
                        this.getChildren().add(semanticsNode1.getId());
                    }
                    if(v1 + 1 > v - 1) {
                        break;
                    }
                }
            }
        }

        public final Set getChildren() {
            return this.children;
        }

        public final SemanticsConfiguration getUnmergedConfig() {
            return this.unmergedConfig;
        }

        public final boolean hasPaneTitle() {
            return this.unmergedConfig.contains(SemanticsProperties.INSTANCE.getPaneTitle());
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[ToggleableState.values().length];
            arr_v[ToggleableState.On.ordinal()] = 1;
            arr_v[ToggleableState.Off.ordinal()] = 2;
            arr_v[ToggleableState.Indeterminate.ordinal()] = 3;
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    private static final int[] AccessibilityActionsResourceIds = null;
    public static final int AccessibilityCursorPositionUndefined = -1;
    public static final int AccessibilitySliderStepsCount = 20;
    public static final String ClassName = "android.view.View";
    public static final androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.Companion Companion = null;
    public static final int InvalidId = 0x80000000;
    public static final String LogTag = "AccessibilityDelegate";
    public static final int ParcelSafeTextLength = 100000;
    public static final long SendRecurringAccessibilityEventsIntervalMillis = 100L;
    public static final long TextTraversedEventTimeoutMillis = 1000L;
    private int accessibilityCursorPosition;
    private boolean accessibilityForceEnabledForTesting;
    private final AccessibilityManager accessibilityManager;
    private SparseArrayCompat actionIdToLabel;
    private final Channel boundsUpdateChannel;
    private boolean checkingForSemanticsChanges;
    private Map currentSemanticsNodes;
    private boolean currentSemanticsNodesInvalidated;
    private int focusedVirtualViewId;
    private final Handler handler;
    private int hoveredVirtualViewId;
    private SparseArrayCompat labelToActionId;
    private AccessibilityNodeProviderCompat nodeProvider;
    private ArraySet paneDisplayed;
    private PendingTextTraversedEvent pendingTextTraversedEvent;
    private Map previousSemanticsNodes;
    private SemanticsNodeCopy previousSemanticsRoot;
    private Integer previousTraversedNode;
    private final List scrollObservationScopes;
    private final Runnable semanticsChangeChecker;
    private final Function1 sendScrollEventIfNeededLambda;
    private final ArraySet subtreeChangedLayoutNodes;
    private final AndroidComposeView view;

    static {
        AndroidComposeViewAccessibilityDelegateCompat.Companion = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.Companion(null);
        AndroidComposeViewAccessibilityDelegateCompat.AccessibilityActionsResourceIds = new int[]{id.accessibility_custom_action_0, id.accessibility_custom_action_1, id.accessibility_custom_action_2, id.accessibility_custom_action_3, id.accessibility_custom_action_4, id.accessibility_custom_action_5, id.accessibility_custom_action_6, id.accessibility_custom_action_7, id.accessibility_custom_action_8, id.accessibility_custom_action_9, id.accessibility_custom_action_10, id.accessibility_custom_action_11, id.accessibility_custom_action_12, id.accessibility_custom_action_13, id.accessibility_custom_action_14, id.accessibility_custom_action_15, id.accessibility_custom_action_16, id.accessibility_custom_action_17, id.accessibility_custom_action_18, id.accessibility_custom_action_19, id.accessibility_custom_action_20, id.accessibility_custom_action_21, id.accessibility_custom_action_22, id.accessibility_custom_action_23, id.accessibility_custom_action_24, id.accessibility_custom_action_25, id.accessibility_custom_action_26, id.accessibility_custom_action_27, id.accessibility_custom_action_28, id.accessibility_custom_action_29, id.accessibility_custom_action_30, id.accessibility_custom_action_31};
    }

    public AndroidComposeViewAccessibilityDelegateCompat(AndroidComposeView androidComposeView0) {
        Intrinsics.checkNotNullParameter(androidComposeView0, "view");
        super();
        this.view = androidComposeView0;
        this.hoveredVirtualViewId = 0x80000000;
        Object object0 = androidComposeView0.getContext().getSystemService("accessibility");
        if(object0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        }
        this.accessibilityManager = (AccessibilityManager)object0;
        this.handler = new Handler(Looper.getMainLooper());
        this.nodeProvider = new AccessibilityNodeProviderCompat(new MyNodeProvider(this));
        this.focusedVirtualViewId = 0x80000000;
        this.actionIdToLabel = new SparseArrayCompat();
        this.labelToActionId = new SparseArrayCompat();
        this.accessibilityCursorPosition = -1;
        this.subtreeChangedLayoutNodes = new ArraySet();
        this.boundsUpdateChannel = ChannelKt.Channel$default(-1, null, null, 6, null);
        this.currentSemanticsNodesInvalidated = true;
        this.currentSemanticsNodes = MapsKt.emptyMap();
        this.paneDisplayed = new ArraySet();
        this.previousSemanticsNodes = new LinkedHashMap();
        this.previousSemanticsRoot = new SemanticsNodeCopy(androidComposeView0.getSemanticsOwner().getUnmergedRootSemanticsNode(), MapsKt.emptyMap());
        androidComposeView0.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view0) {
                Intrinsics.checkNotNullParameter(view0, "view");
            }

            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view0) {
                Intrinsics.checkNotNullParameter(view0, "view");
                AndroidComposeViewAccessibilityDelegateCompat.this.handler.removeCallbacks(AndroidComposeViewAccessibilityDelegateCompat.this.semanticsChangeChecker);
            }
        });
        this.semanticsChangeChecker = new Runnable() {
            @Override
            public final void run() {
                AndroidComposeViewAccessibilityDelegateCompat.this.checkForSemanticsChanges();
                AndroidComposeViewAccessibilityDelegateCompat.this.checkingForSemanticsChanges = false;
            }
        };
        this.scrollObservationScopes = new ArrayList();
        this.sendScrollEventIfNeededLambda = new Function1() {
            {
                AndroidComposeViewAccessibilityDelegateCompat.this = androidComposeViewAccessibilityDelegateCompat0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((ScrollObservationScope)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(ScrollObservationScope scrollObservationScope0) {
                Intrinsics.checkNotNullParameter(scrollObservationScope0, "it");
                AndroidComposeViewAccessibilityDelegateCompat.this.sendScrollEventIfNeeded(scrollObservationScope0);
            }
        };
    }

    private final void addExtraDataToAccessibilityNodeInfoHelper(int v, AccessibilityNodeInfo accessibilityNodeInfo0, String s, Bundle bundle0) {
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds0 = (SemanticsNodeWithAdjustedBounds)this.getCurrentSemanticsNodes().get(v);
        if(semanticsNodeWithAdjustedBounds0 == null) {
            return;
        }
        SemanticsNode semanticsNode0 = semanticsNodeWithAdjustedBounds0.getSemanticsNode();
        String s1 = this.getIterableTextForAccessibility(semanticsNode0);
        if(semanticsNode0.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getGetTextLayoutResult()) && bundle0 != null && Intrinsics.areEqual(s, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int v1 = bundle0.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int v2 = bundle0.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if(v2 > 0 && v1 >= 0 && v1 < (s1 == null ? 0x7FFFFFFF : s1.length())) {
                List list0 = new ArrayList();
                Function1 function10 = (Function1)((AccessibilityAction)semanticsNode0.getUnmergedConfig$ui_release().get(SemanticsActions.INSTANCE.getGetTextLayoutResult())).getAction();
                if(Intrinsics.areEqual((function10 == null ? null : ((Boolean)function10.invoke(list0))), Boolean.TRUE)) {
                    TextLayoutResult textLayoutResult0 = (TextLayoutResult)list0.get(0);
                    List list1 = new ArrayList();
                    if(v2 > 0) {
                        for(int v3 = 0; true; ++v3) {
                            int v4 = v3 + v1;
                            if(v4 >= textLayoutResult0.getLayoutInput().getText().length()) {
                                list1.add(null);
                            }
                            else {
                                list1.add(this.toScreenCoords(semanticsNode0, textLayoutResult0.getBoundingBox(v4)));
                            }
                            if(v3 + 1 >= v2) {
                                break;
                            }
                        }
                    }
                    Bundle bundle1 = accessibilityNodeInfo0.getExtras();
                    Object[] arr_object = list1.toArray(new RectF[0]);
                    if(arr_object == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    bundle1.putParcelableArray(s, ((Parcelable[])arr_object));
                    return;
                }
                return;
            }
            Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
        }
    }

    public final Object boundsUpdatesEventLoop(Continuation continuation0) {
        ArraySet arraySet1;
        ChannelIterator channelIterator0;
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat0;
        ArraySet arraySet0;
        androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.boundsUpdatesEventLoop.1 androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$10;
        if(continuation0 instanceof androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.boundsUpdatesEventLoop.1) {
            androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$10 = (androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.boundsUpdatesEventLoop.1)continuation0;
            if((androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$10.label & 0x80000000) == 0) {
                androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return continuation0.boundsUpdatesEventLoop(this);
                    }
                };
            }
            else {
                androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$10.label ^= 0x80000000;
            }
        }
        else {
            androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                Object L$0;
                Object L$1;
                Object L$2;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return continuation0.boundsUpdatesEventLoop(this);
                }
            };
        }
        Object object0 = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$10.result;
        Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$10.label) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    arraySet0 = new ArraySet();
                    androidComposeViewAccessibilityDelegateCompat0 = this;
                    channelIterator0 = this.boundsUpdateChannel.iterator();
                    androidComposeViewAccessibilityDelegateCompat0 = this;
                    goto label_28;
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            case 1: {
                channelIterator0 = (ChannelIterator)androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$10.L$2;
                arraySet1 = (ArraySet)androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$10.L$1;
                androidComposeViewAccessibilityDelegateCompat0 = (AndroidComposeViewAccessibilityDelegateCompat)androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$10.L$0;
                try {
                    ResultKt.throwOnFailure(object0);
                    goto label_37;
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            case 2: {
                channelIterator0 = (ChannelIterator)androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$10.L$2;
                arraySet1 = (ArraySet)androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$10.L$1;
                androidComposeViewAccessibilityDelegateCompat0 = (AndroidComposeViewAccessibilityDelegateCompat)androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$10.L$0;
                try {
                    ResultKt.throwOnFailure(object0);
                    while(true) {
                        arraySet0 = arraySet1;
                    label_28:
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$10.L$0 = androidComposeViewAccessibilityDelegateCompat0;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$10.L$1 = arraySet0;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$10.L$2 = channelIterator0;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$10.label = 1;
                        Object object2 = channelIterator0.hasNext(androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$10);
                        if(object2 == object1) {
                            return object1;
                        }
                        arraySet1 = arraySet0;
                        object0 = object2;
                    label_37:
                        if(!((Boolean)object0).booleanValue()) {
                            goto label_65;
                        }
                        channelIterator0.next();
                        if(androidComposeViewAccessibilityDelegateCompat0.isAccessibilityEnabled()) {
                            int v = androidComposeViewAccessibilityDelegateCompat0.subtreeChangedLayoutNodes.size() - 1;
                            if(v >= 0) {
                                for(int v1 = 0; true; ++v1) {
                                    Object object3 = androidComposeViewAccessibilityDelegateCompat0.subtreeChangedLayoutNodes.valueAt(v1);
                                    Intrinsics.checkNotNull(object3);
                                    Intrinsics.checkNotNullExpressionValue(object3, "subtreeChangedLayoutNodes.valueAt(i)!!");
                                    androidComposeViewAccessibilityDelegateCompat0.sendSubtreeChangeAccessibilityEvents(((LayoutNode)object3), arraySet1);
                                    if(v1 + 1 > v) {
                                        break;
                                    }
                                }
                            }
                            arraySet1.clear();
                            if(!androidComposeViewAccessibilityDelegateCompat0.checkingForSemanticsChanges) {
                                androidComposeViewAccessibilityDelegateCompat0.checkingForSemanticsChanges = true;
                                androidComposeViewAccessibilityDelegateCompat0.handler.post(androidComposeViewAccessibilityDelegateCompat0.semanticsChangeChecker);
                            }
                        }
                        androidComposeViewAccessibilityDelegateCompat0.subtreeChangedLayoutNodes.clear();
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$10.L$0 = androidComposeViewAccessibilityDelegateCompat0;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$10.L$1 = arraySet1;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$10.L$2 = channelIterator0;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$10.label = 2;
                        if(DelayKt.delay(100L, androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$10) != object1) {
                            continue;
                        }
                        return object1;
                    }
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        androidComposeViewAccessibilityDelegateCompat0.subtreeChangedLayoutNodes.clear();
        throw throwable0;
    label_65:
        androidComposeViewAccessibilityDelegateCompat0.subtreeChangedLayoutNodes.clear();
        return Unit.INSTANCE;
    }

    private final void checkForSemanticsChanges() {
        this.sendSemanticsStructureChangeEvents(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), this.previousSemanticsRoot);
        this.sendSemanticsPropertyChangeEvents$ui_release(this.getCurrentSemanticsNodes());
        this.updateSemanticsNodesCopyAndPanes();
    }

    private final boolean clearAccessibilityFocus(int v) {
        if(this.isAccessibilityFocused(v)) {
            this.focusedVirtualViewId = 0x80000000;
            this.view.invalidate();
            AndroidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView$default(this, v, 0x10000, null, null, 12, null);
            return true;
        }
        return false;
    }

    public final AccessibilityEvent createEvent$ui_release(int v, int v1) {
        AccessibilityEvent accessibilityEvent0 = AccessibilityEvent.obtain(v1);
        Intrinsics.checkNotNullExpressionValue(accessibilityEvent0, "obtain(eventType)");
        accessibilityEvent0.setEnabled(true);
        accessibilityEvent0.setClassName("android.view.View");
        accessibilityEvent0.setPackageName("com.playdekgames.android.Ascension");
        accessibilityEvent0.setSource(this.view, v);
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds0 = (SemanticsNodeWithAdjustedBounds)this.getCurrentSemanticsNodes().get(v);
        if(semanticsNodeWithAdjustedBounds0 != null) {
            accessibilityEvent0.setPassword(AndroidComposeViewAccessibilityDelegateCompat_androidKt.isPassword(semanticsNodeWithAdjustedBounds0.getSemanticsNode()));
        }
        return accessibilityEvent0;
    }

    private final AccessibilityNodeInfo createNodeInfo(int v) {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0 = AccessibilityNodeInfoCompat.obtain();
        Intrinsics.checkNotNullExpressionValue(accessibilityNodeInfoCompat0, "obtain()");
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds0 = (SemanticsNodeWithAdjustedBounds)this.getCurrentSemanticsNodes().get(v);
        View view0 = null;
        if(semanticsNodeWithAdjustedBounds0 == null) {
            accessibilityNodeInfoCompat0.recycle();
            return null;
        }
        SemanticsNode semanticsNode0 = semanticsNodeWithAdjustedBounds0.getSemanticsNode();
        int v1 = -1;
        if(v == -1) {
            ViewParent viewParent0 = ViewCompat.getParentForAccessibility(this.view);
            if(viewParent0 instanceof View) {
                view0 = (View)viewParent0;
            }
            accessibilityNodeInfoCompat0.setParent(view0);
        }
        else if(semanticsNode0.getParent() != null) {
            SemanticsNode semanticsNode1 = semanticsNode0.getParent();
            Intrinsics.checkNotNull(semanticsNode1);
            int v2 = semanticsNode1.getId();
            if(v2 != this.view.getSemanticsOwner().getUnmergedRootSemanticsNode().getId()) {
                v1 = v2;
            }
            accessibilityNodeInfoCompat0.setParent(this.view, v1);
        }
        else {
            throw new IllegalStateException("semanticsNode " + v + " has null parent");
        }
        accessibilityNodeInfoCompat0.setSource(this.view, v);
        Rect rect0 = semanticsNodeWithAdjustedBounds0.getAdjustedBounds();
        long v3 = this.view.localToScreen-MK-Hz9U(OffsetKt.Offset(rect0.left, rect0.top));
        long v4 = this.view.localToScreen-MK-Hz9U(OffsetKt.Offset(rect0.right, rect0.bottom));
        accessibilityNodeInfoCompat0.setBoundsInScreen(new Rect(((int)(((float)Math.floor(Offset.getX-impl(v3))))), ((int)(((float)Math.floor(Offset.getY-impl(v3))))), ((int)(((float)Math.ceil(Offset.getX-impl(v4))))), ((int)(((float)Math.ceil(Offset.getY-impl(v4)))))));
        this.populateAccessibilityNodeInfoProperties(v, accessibilityNodeInfoCompat0, semanticsNode0);
        return accessibilityNodeInfoCompat0.unwrap();
    }

    private final AccessibilityEvent createTextSelectionChangedEvent(int v, Integer integer0, Integer integer1, Integer integer2, String s) {
        AccessibilityEvent accessibilityEvent0 = this.createEvent$ui_release(v, 0x2000);
        if(integer0 != null) {
            accessibilityEvent0.setFromIndex(integer0.intValue());
        }
        if(integer1 != null) {
            accessibilityEvent0.setToIndex(integer1.intValue());
        }
        if(integer2 != null) {
            accessibilityEvent0.setItemCount(integer2.intValue());
        }
        if(s != null) {
            accessibilityEvent0.getText().add(s);
        }
        return accessibilityEvent0;
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent0) {
        Intrinsics.checkNotNullParameter(motionEvent0, "event");
        if(!this.isAccessibilityEnabled()) {
            return false;
        }
        switch(motionEvent0.getAction()) {
            case 7: 
            case 9: {
                int v = this.hitTestSemanticsAt$ui_release(motionEvent0.getX(), motionEvent0.getY());
                boolean z = this.view.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent0);
                this.updateHoveredVirtualView(v);
                return v == 0x80000000 ? z : true;
            }
            case 10: {
                if(this.hoveredVirtualViewId != 0x80000000) {
                    this.updateHoveredVirtualView(0x80000000);
                    return true;
                }
                return this.view.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent0);
            }
            default: {
                return false;
            }
        }
    }

    public final boolean getAccessibilityForceEnabledForTesting$ui_release() {
        return this.accessibilityForceEnabledForTesting;
    }

    @Override  // androidx.core.view.AccessibilityDelegateCompat
    public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view0) {
        return this.nodeProvider;
    }

    // 去混淆评级： 低(20)
    private final int getAccessibilitySelectionEnd(SemanticsNode semanticsNode0) {
        return semanticsNode0.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getContentDescription()) || !semanticsNode0.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getTextSelectionRange()) ? this.accessibilityCursorPosition : TextRange.getEnd-impl(((TextRange)semanticsNode0.getUnmergedConfig$ui_release().get(SemanticsProperties.INSTANCE.getTextSelectionRange())).unbox-impl());
    }

    // 去混淆评级： 低(20)
    private final int getAccessibilitySelectionStart(SemanticsNode semanticsNode0) {
        return semanticsNode0.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getContentDescription()) || !semanticsNode0.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getTextSelectionRange()) ? this.accessibilityCursorPosition : TextRange.getStart-impl(((TextRange)semanticsNode0.getUnmergedConfig$ui_release().get(SemanticsProperties.INSTANCE.getTextSelectionRange())).unbox-impl());
    }

    private final Map getCurrentSemanticsNodes() {
        if(this.currentSemanticsNodesInvalidated) {
            this.currentSemanticsNodes = AndroidComposeViewAccessibilityDelegateCompat_androidKt.getAllUncoveredSemanticsNodesToMap(this.view.getSemanticsOwner());
            this.currentSemanticsNodesInvalidated = false;
        }
        return this.currentSemanticsNodes;
    }

    public final int getHoveredVirtualViewId$ui_release() {
        return this.hoveredVirtualViewId;
    }

    private final String getIterableTextForAccessibility(SemanticsNode semanticsNode0) {
        if(semanticsNode0 == null) {
            return null;
        }
        if(semanticsNode0.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getContentDescription())) {
            return TempListUtilsKt.fastJoinToString$default(((List)semanticsNode0.getUnmergedConfig$ui_release().get(SemanticsProperties.INSTANCE.getContentDescription())), ",", null, null, 0, null, null, 62, null);
        }
        if(AndroidComposeViewAccessibilityDelegateCompat_androidKt.isTextField(semanticsNode0)) {
            return this.getTextForTextField(semanticsNode0);
        }
        List list0 = (List)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getText());
        if(list0 != null) {
            AnnotatedString annotatedString0 = (AnnotatedString)CollectionsKt.firstOrNull(list0);
            return annotatedString0 == null ? null : annotatedString0.getText();
        }
        return null;
    }

    private final TextSegmentIterator getIteratorForGranularity(SemanticsNode semanticsNode0, int v) {
        AbstractTextSegmentIterator accessibilityIterators$AbstractTextSegmentIterator0;
        if(semanticsNode0 == null) {
            return null;
        }
        String s = this.getIterableTextForAccessibility(semanticsNode0);
        if(s == null || s.length() == 0) {
            return null;
        }
        switch(v) {
            case 1: {
                Locale locale1 = this.view.getContext().getResources().getConfiguration().locale;
                Intrinsics.checkNotNullExpressionValue(locale1, "view.context.resources.configuration.locale");
                accessibilityIterators$AbstractTextSegmentIterator0 = CharacterTextSegmentIterator.Companion.getInstance(locale1);
                accessibilityIterators$AbstractTextSegmentIterator0.initialize(s);
                return accessibilityIterators$AbstractTextSegmentIterator0;
            }
            case 2: {
                Locale locale0 = this.view.getContext().getResources().getConfiguration().locale;
                Intrinsics.checkNotNullExpressionValue(locale0, "view.context.resources.configuration.locale");
                accessibilityIterators$AbstractTextSegmentIterator0 = WordTextSegmentIterator.Companion.getInstance(locale0);
                accessibilityIterators$AbstractTextSegmentIterator0.initialize(s);
                return accessibilityIterators$AbstractTextSegmentIterator0;
            }
            case 8: {
                accessibilityIterators$AbstractTextSegmentIterator0 = ParagraphTextSegmentIterator.Companion.getInstance();
                accessibilityIterators$AbstractTextSegmentIterator0.initialize(s);
                return accessibilityIterators$AbstractTextSegmentIterator0;
            }
            case 4: 
            case 16: {
                if(!semanticsNode0.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getGetTextLayoutResult())) {
                    return null;
                }
                List list0 = new ArrayList();
                Function1 function10 = (Function1)((AccessibilityAction)semanticsNode0.getUnmergedConfig$ui_release().get(SemanticsActions.INSTANCE.getGetTextLayoutResult())).getAction();
                if(Intrinsics.areEqual((function10 == null ? null : ((Boolean)function10.invoke(list0))), Boolean.TRUE)) {
                    TextLayoutResult textLayoutResult0 = (TextLayoutResult)list0.get(0);
                    if(v == 4) {
                        accessibilityIterators$AbstractTextSegmentIterator0 = LineTextSegmentIterator.Companion.getInstance();
                        ((LineTextSegmentIterator)accessibilityIterators$AbstractTextSegmentIterator0).initialize(s, textLayoutResult0);
                        return accessibilityIterators$AbstractTextSegmentIterator0;
                    }
                    AbstractTextSegmentIterator accessibilityIterators$AbstractTextSegmentIterator1 = PageTextSegmentIterator.Companion.getInstance();
                    ((PageTextSegmentIterator)accessibilityIterators$AbstractTextSegmentIterator1).initialize(s, textLayoutResult0, semanticsNode0);
                    return accessibilityIterators$AbstractTextSegmentIterator1;
                }
                return null;
            }
            default: {
                return null;
            }
        }
    }

    public final Map getPreviousSemanticsNodes$ui_release() {
        return this.previousSemanticsNodes;
    }

    public static void getPreviousSemanticsNodes$ui_release$annotations() {
    }

    private final String getTextForTextField(SemanticsNode semanticsNode0) {
        if(semanticsNode0 == null) {
            return null;
        }
        AnnotatedString annotatedString0 = (AnnotatedString)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getEditableText());
        if(annotatedString0 == null || annotatedString0.length() == 0) {
            List list0 = (List)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getText());
            if(list0 != null) {
                AnnotatedString annotatedString1 = (AnnotatedString)CollectionsKt.firstOrNull(list0);
                return annotatedString1 == null ? null : annotatedString1.getText();
            }
            return null;
        }
        return annotatedString0.getText();
    }

    public final AndroidComposeView getView() {
        return this.view;
    }

    public final int hitTestSemanticsAt$ui_release(float f, float f1) {
        this.view.measureAndLayout();
        List list0 = new ArrayList();
        this.view.getRoot().hitTestSemantics-3MmeM6k$ui_release(OffsetKt.Offset(f, f1), list0);
        SemanticsWrapper semanticsWrapper0 = (SemanticsWrapper)CollectionsKt.lastOrNull(list0);
        SemanticsWrapper semanticsWrapper1 = null;
        if(semanticsWrapper0 != null) {
            LayoutNode layoutNode0 = semanticsWrapper0.getLayoutNode$ui_release();
            if(layoutNode0 != null) {
                semanticsWrapper1 = SemanticsNodeKt.getOuterSemantics(layoutNode0);
            }
        }
        return semanticsWrapper1 == null || ((AndroidViewHolder)this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(semanticsWrapper1.getLayoutNode$ui_release())) != null ? 0x80000000 : this.semanticsNodeIdToAccessibilityVirtualNodeId(((SemanticsModifier)semanticsWrapper1.getModifier()).getId());
    }

    // 去混淆评级： 低(30)
    private final boolean isAccessibilityEnabled() {
        return this.accessibilityForceEnabledForTesting || this.accessibilityManager.isEnabled() && this.accessibilityManager.isTouchExplorationEnabled();
    }

    private final boolean isAccessibilityFocused(int v) {
        return this.focusedVirtualViewId == v;
    }

    // 去混淆评级： 低(20)
    private final boolean isAccessibilitySelectionExtendable(SemanticsNode semanticsNode0) {
        return !semanticsNode0.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getContentDescription()) && semanticsNode0.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getEditableText());
    }

    private final void notifySubtreeAccessibilityStateChangedIfNeeded(LayoutNode layoutNode0) {
        if(this.subtreeChangedLayoutNodes.add(layoutNode0)) {
            this.boundsUpdateChannel.trySend-JP2dKIU(Unit.INSTANCE);
        }
    }

    public final void onLayoutChange$ui_release(LayoutNode layoutNode0) {
        Intrinsics.checkNotNullParameter(layoutNode0, "layoutNode");
        this.currentSemanticsNodesInvalidated = true;
        if(!this.isAccessibilityEnabled()) {
            return;
        }
        this.notifySubtreeAccessibilityStateChangedIfNeeded(layoutNode0);
    }

    public final void onSemanticsChange$ui_release() {
        this.currentSemanticsNodesInvalidated = true;
        if(this.isAccessibilityEnabled() && !this.checkingForSemanticsChanges) {
            this.checkingForSemanticsChanges = true;
            this.handler.post(this.semanticsChangeChecker);
        }
    }

    private final boolean performActionHelper(int v, int v1, Bundle bundle0) {
        int v5;
        float f2;
        AccessibilityAction accessibilityAction10;
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds0 = (SemanticsNodeWithAdjustedBounds)this.getCurrentSemanticsNodes().get(v);
        boolean z = false;
        if(semanticsNodeWithAdjustedBounds0 == null) {
            return false;
        }
        int v2 = -1;
        SemanticsNode semanticsNode0 = semanticsNodeWithAdjustedBounds0.getSemanticsNode();
        switch(v1) {
            case 0x40: {
                return this.requestAccessibilityFocus(v);
            }
            case 0x80: {
                return this.clearAccessibilityFocus(v);
            }
            default: {
                if(v1 != 0x100 && v1 != 0x200) {
                    switch(v1) {
                        case 0x4000: {
                            AccessibilityAction accessibilityAction12 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getCopyText());
                            if(accessibilityAction12 != null) {
                                Function0 function07 = (Function0)accessibilityAction12.getAction();
                                if(function07 != null) {
                                    Boolean boolean14 = (Boolean)function07.invoke();
                                    return boolean14 == null ? false : boolean14.booleanValue();
                                }
                            }
                            return false;
                        }
                        case 0x20000: {
                            int v7 = bundle0 == null ? -1 : bundle0.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1);
                            if(bundle0 != null) {
                                v2 = bundle0.getInt("ACTION_ARGUMENT_SELECTION_END_INT", -1);
                            }
                            boolean z1 = this.setAccessibilitySelection(semanticsNode0, v7, v2, false);
                            if(z1) {
                                AndroidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView$default(this, this.semanticsNodeIdToAccessibilityVirtualNodeId(semanticsNode0.getId()), 0, null, null, 12, null);
                            }
                            return z1;
                        }
                        default: {
                            if(!AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode0)) {
                                return false;
                            }
                            CharSequence charSequence0 = null;
                            switch(v1) {
                                case 16: {
                                    AccessibilityAction accessibilityAction0 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getOnClick());
                                    if(accessibilityAction0 != null) {
                                        Function0 function00 = (Function0)accessibilityAction0.getAction();
                                        if(function00 != null) {
                                            charSequence0 = (Boolean)function00.invoke();
                                        }
                                    }
                                    AndroidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView$default(this, v, 1, null, null, 12, null);
                                    return charSequence0 == null ? false : ((Boolean)charSequence0).booleanValue();
                                }
                                case 0x20: {
                                    AccessibilityAction accessibilityAction1 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getOnLongClick());
                                    if(accessibilityAction1 != null) {
                                        Function0 function01 = (Function0)accessibilityAction1.getAction();
                                        if(function01 != null) {
                                            Boolean boolean0 = (Boolean)function01.invoke();
                                            return boolean0 == null ? false : boolean0.booleanValue();
                                        }
                                    }
                                    return false;
                                }
                                case 0x8000: {
                                    AccessibilityAction accessibilityAction4 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getPasteText());
                                    if(accessibilityAction4 != null) {
                                        Function0 function02 = (Function0)accessibilityAction4.getAction();
                                        if(function02 != null) {
                                            Boolean boolean6 = (Boolean)function02.invoke();
                                            return boolean6 == null ? false : boolean6.booleanValue();
                                        }
                                    }
                                    return false;
                                }
                                case 0x10000: {
                                    AccessibilityAction accessibilityAction5 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getCutText());
                                    if(accessibilityAction5 != null) {
                                        Function0 function03 = (Function0)accessibilityAction5.getAction();
                                        if(function03 != null) {
                                            Boolean boolean7 = (Boolean)function03.invoke();
                                            return boolean7 == null ? false : boolean7.booleanValue();
                                        }
                                    }
                                    return false;
                                }
                                case 0x40000: {
                                    AccessibilityAction accessibilityAction6 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getExpand());
                                    if(accessibilityAction6 != null) {
                                        Function0 function04 = (Function0)accessibilityAction6.getAction();
                                        if(function04 != null) {
                                            Boolean boolean8 = (Boolean)function04.invoke();
                                            return boolean8 == null ? false : boolean8.booleanValue();
                                        }
                                    }
                                    return false;
                                }
                                case 0x80000: {
                                    AccessibilityAction accessibilityAction7 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getCollapse());
                                    if(accessibilityAction7 != null) {
                                        Function0 function05 = (Function0)accessibilityAction7.getAction();
                                        if(function05 != null) {
                                            Boolean boolean9 = (Boolean)function05.invoke();
                                            return boolean9 == null ? false : boolean9.booleanValue();
                                        }
                                    }
                                    return false;
                                }
                                case 0x100000: {
                                    AccessibilityAction accessibilityAction8 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getDismiss());
                                    if(accessibilityAction8 != null) {
                                        Function0 function06 = (Function0)accessibilityAction8.getAction();
                                        if(function06 != null) {
                                            Boolean boolean10 = (Boolean)function06.invoke();
                                            return boolean10 == null ? false : boolean10.booleanValue();
                                        }
                                    }
                                    return false;
                                }
                                case 0x200000: {
                                    if(bundle0 != null) {
                                        charSequence0 = bundle0.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
                                    }
                                    AccessibilityAction accessibilityAction9 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getSetText());
                                    if(accessibilityAction9 != null) {
                                        Function1 function11 = (Function1)accessibilityAction9.getAction();
                                        if(function11 != null) {
                                            if(charSequence0 == null) {
                                                charSequence0 = "";
                                            }
                                            Boolean boolean11 = (Boolean)function11.invoke(new AnnotatedString(((String)charSequence0), null, null, 6, null));
                                            return boolean11 == null ? false : boolean11.booleanValue();
                                        }
                                    }
                                    return false;
                                }
                                case 0x1020036: {
                                    SemanticsNode semanticsNode1 = semanticsNode0.getParent();
                                    if(semanticsNode1 != null) {
                                        SemanticsConfiguration semanticsConfiguration0 = semanticsNode1.getConfig();
                                        if(semanticsConfiguration0 != null) {
                                            accessibilityAction10 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsConfiguration0, SemanticsActions.INSTANCE.getScrollBy());
                                            goto label_150;
                                        }
                                    }
                                alab1:
                                    while(true) {
                                        while(true) {
                                            accessibilityAction10 = null;
                                        label_150:
                                            if(semanticsNode1 == null || accessibilityAction10 != null) {
                                                break alab1;
                                            }
                                            semanticsNode1 = semanticsNode1.getParent();
                                            if(semanticsNode1 == null) {
                                                break;
                                            }
                                            SemanticsConfiguration semanticsConfiguration1 = semanticsNode1.getConfig();
                                            if(semanticsConfiguration1 == null) {
                                                break;
                                            }
                                            accessibilityAction10 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsConfiguration1, SemanticsActions.INSTANCE.getScrollBy());
                                            goto label_150;
                                        }
                                    }
                                    if(semanticsNode1 == null) {
                                        return false;
                                    }
                                    float f4 = ((float)IntSize.getWidth-impl(semanticsNode0.getSize-YbymL2g())) - semanticsNode0.getBoundsInWindow().getWidth();
                                    if(semanticsNode0.getBoundsInWindow().getLeft() == Offset.getX-impl(semanticsNode1.getPositionInWindow-F1C5BW0())) {
                                        f4 = -f4;
                                    }
                                    float f5 = ((float)IntSize.getHeight-impl(semanticsNode0.getSize-YbymL2g())) - semanticsNode0.getBoundsInWindow().getHeight();
                                    if(semanticsNode0.getBoundsInWindow().getTop() == Offset.getY-impl(semanticsNode1.getPositionInWindow-F1C5BW0())) {
                                        f5 = -f5;
                                    }
                                    if(accessibilityAction10 != null) {
                                        Function2 function24 = (Function2)accessibilityAction10.getAction();
                                        if(function24 != null) {
                                            Boolean boolean12 = (Boolean)function24.invoke(f4, f5);
                                            return boolean12 == null ? false : boolean12.booleanValue();
                                        }
                                    }
                                    return false;
                                }
                                case 0x1000: 
                                case 0x2000: 
                                case 0x1020038: 
                                case 0x1020039: 
                                case 0x102003A: 
                                case 0x102003B: {
                                    if(v1 == 0x1000 || v1 == 0x2000) {
                                        ProgressBarRangeInfo progressBarRangeInfo0 = (ProgressBarRangeInfo)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getProgressBarRangeInfo());
                                        AccessibilityAction accessibilityAction2 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getSetProgress());
                                        if(progressBarRangeInfo0 != null && accessibilityAction2 != null) {
                                            float f = RangesKt.coerceAtLeast(((Number)progressBarRangeInfo0.getRange().getEndInclusive()).floatValue(), ((Number)progressBarRangeInfo0.getRange().getStart()).floatValue());
                                            float f1 = RangesKt.coerceAtMost(((Number)progressBarRangeInfo0.getRange().getStart()).floatValue(), ((Number)progressBarRangeInfo0.getRange().getEndInclusive()).floatValue());
                                            if(progressBarRangeInfo0.getSteps() > 0) {
                                                f2 = f - f1;
                                                v5 = progressBarRangeInfo0.getSteps() + 1;
                                            }
                                            else {
                                                f2 = f - f1;
                                                v5 = 20;
                                            }
                                            float f3 = f2 / ((float)v5);
                                            if(v1 == 0x2000) {
                                                f3 = -f3;
                                            }
                                            Function1 function10 = (Function1)accessibilityAction2.getAction();
                                            if(function10 != null) {
                                                Boolean boolean1 = (Boolean)function10.invoke(((float)(progressBarRangeInfo0.getCurrent() + f3)));
                                                return boolean1 == null ? false : boolean1.booleanValue();
                                            }
                                            return false;
                                        }
                                    }
                                    long v6 = LayoutCoordinatesKt.boundsInParent(semanticsNode0.getLayoutInfo().getCoordinates()).getSize-NH-jbRc();
                                    AccessibilityAction accessibilityAction3 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getScrollBy());
                                    if(accessibilityAction3 == null) {
                                        return false;
                                    }
                                    ScrollAxisRange scrollAxisRange0 = (ScrollAxisRange)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange());
                                    if(scrollAxisRange0 != null) {
                                        if((!scrollAxisRange0.getReverseScrolling() && v1 == 0x102003B || scrollAxisRange0.getReverseScrolling() && v1 == 0x1020039 || v1 == 0x1000) && ((Number)scrollAxisRange0.getValue().invoke()).floatValue() < ((Number)scrollAxisRange0.getMaxValue().invoke()).floatValue()) {
                                            Function2 function20 = (Function2)accessibilityAction3.getAction();
                                            if(function20 != null) {
                                                Boolean boolean2 = (Boolean)function20.invoke(Size.getWidth-impl(v6), 0.0f);
                                                return boolean2 == null ? false : boolean2.booleanValue();
                                            }
                                            return false;
                                        }
                                        if((scrollAxisRange0.getReverseScrolling() && v1 == 0x102003B || !scrollAxisRange0.getReverseScrolling() && v1 == 0x1020039 || v1 == 0x2000) && ((Number)scrollAxisRange0.getValue().invoke()).floatValue() > 0.0f) {
                                            Function2 function21 = (Function2)accessibilityAction3.getAction();
                                            if(function21 != null) {
                                                Boolean boolean3 = (Boolean)function21.invoke(((float)(-Size.getWidth-impl(v6))), 0.0f);
                                                return boolean3 == null ? false : boolean3.booleanValue();
                                            }
                                            return false;
                                        }
                                    }
                                    ScrollAxisRange scrollAxisRange1 = (ScrollAxisRange)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getVerticalScrollAxisRange());
                                    if(scrollAxisRange1 != null) {
                                        if((!scrollAxisRange1.getReverseScrolling() && v1 == 0x102003A || scrollAxisRange1.getReverseScrolling() && v1 == 0x1020038 || v1 == 0x1000) && ((Number)scrollAxisRange1.getValue().invoke()).floatValue() < ((Number)scrollAxisRange1.getMaxValue().invoke()).floatValue()) {
                                            Function2 function22 = (Function2)accessibilityAction3.getAction();
                                            if(function22 != null) {
                                                Boolean boolean4 = (Boolean)function22.invoke(0.0f, Size.getHeight-impl(v6));
                                                return boolean4 == null ? false : boolean4.booleanValue();
                                            }
                                            return false;
                                        }
                                        if((scrollAxisRange1.getReverseScrolling() && v1 == 0x102003A || !scrollAxisRange1.getReverseScrolling() && v1 == 0x1020038 || v1 == 0x2000) && ((Number)scrollAxisRange1.getValue().invoke()).floatValue() > 0.0f) {
                                            Function2 function23 = (Function2)accessibilityAction3.getAction();
                                            if(function23 != null) {
                                                Boolean boolean5 = (Boolean)function23.invoke(0.0f, ((float)(-Size.getHeight-impl(v6))));
                                                return boolean5 == null ? false : boolean5.booleanValue();
                                            }
                                        }
                                    }
                                    return false;
                                }
                                case 0x102003D: {
                                    if(bundle0 != null && bundle0.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                                        AccessibilityAction accessibilityAction11 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getSetProgress());
                                        if(accessibilityAction11 != null) {
                                            Function1 function12 = (Function1)accessibilityAction11.getAction();
                                            if(function12 != null) {
                                                Boolean boolean13 = (Boolean)function12.invoke(bundle0.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"));
                                                return boolean13 == null ? false : boolean13.booleanValue();
                                            }
                                        }
                                    }
                                    return false;
                                }
                                default: {
                                    SparseArrayCompat sparseArrayCompat0 = (SparseArrayCompat)this.actionIdToLabel.get(v);
                                    if(sparseArrayCompat0 != null) {
                                        charSequence0 = (CharSequence)sparseArrayCompat0.get(v1);
                                    }
                                    if(charSequence0 == null) {
                                        return false;
                                    }
                                    List list0 = (List)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getCustomActions());
                                    if(list0 == null) {
                                        return false;
                                    }
                                    int v3 = list0.size();
                                    if(v3 - 1 >= 0) {
                                        for(int v4 = 0; true; ++v4) {
                                            CustomAccessibilityAction customAccessibilityAction0 = (CustomAccessibilityAction)list0.get(v4);
                                            if(Intrinsics.areEqual(customAccessibilityAction0.getLabel(), charSequence0)) {
                                                return ((Boolean)customAccessibilityAction0.getAction().invoke()).booleanValue();
                                            }
                                            if(v4 + 1 > v3 - 1) {
                                                break;
                                            }
                                        }
                                    }
                                    return false;
                                }
                            }
                        }
                    }
                }
                if(bundle0 != null) {
                    int v8 = bundle0.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
                    boolean z2 = bundle0.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
                    if(v1 == 0x100) {
                        z = true;
                    }
                    return this.traverseAtGranularity(semanticsNode0, v8, z, z2);
                }
                return false;
            }
        }
    }

    public final void populateAccessibilityNodeInfoProperties(int v, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0, SemanticsNode semanticsNode0) {
        String s1;
        Intrinsics.checkNotNullParameter(accessibilityNodeInfoCompat0, "info");
        Intrinsics.checkNotNullParameter(semanticsNode0, "semanticsNode");
        accessibilityNodeInfoCompat0.setClassName("android.view.View");
        Role role0 = (Role)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getRole());
        String s = null;
        int v1 = 0;
        if(role0 != null) {
            int v2 = role0.unbox-impl();
            if(semanticsNode0.isFake$ui_release() || semanticsNode0.getReplacedChildren$ui_release().isEmpty()) {
                if(Role.equals-impl0(role0.unbox-impl(), 4)) {
                    accessibilityNodeInfoCompat0.setRoleDescription(this.getView().getContext().getResources().getString(string.tab));
                }
                else {
                    if(Role.equals-impl0(v2, 0)) {
                        s1 = "android.widget.Button";
                    }
                    else if(Role.equals-impl0(v2, 1)) {
                        s1 = "android.widget.CheckBox";
                    }
                    else if(Role.equals-impl0(v2, 2)) {
                        s1 = "android.widget.Switch";
                    }
                    else if(Role.equals-impl0(v2, 3)) {
                        s1 = "android.widget.RadioButton";
                    }
                    else {
                        s1 = Role.equals-impl0(v2, 5) ? "android.widget.ImageView" : null;
                    }
                    if(!Role.equals-impl0(role0.unbox-impl(), 5)) {
                        accessibilityNodeInfoCompat0.setClassName(s1);
                    }
                    else if(AndroidComposeViewAccessibilityDelegateCompat_androidKt.findClosestParentNode(semanticsNode0.getLayoutNode$ui_release(), androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.populateAccessibilityNodeInfoProperties.1.ancestor.1.INSTANCE) == null || semanticsNode0.getUnmergedConfig$ui_release().isMergingSemanticsOfDescendants()) {
                        accessibilityNodeInfoCompat0.setClassName(s1);
                    }
                }
            }
        }
        if(AndroidComposeViewAccessibilityDelegateCompat_androidKt.isTextField(semanticsNode0)) {
            accessibilityNodeInfoCompat0.setClassName("android.widget.EditText");
        }
        accessibilityNodeInfoCompat0.setPackageName("com.playdekgames.android.Ascension");
        List list0 = semanticsNode0.getReplacedChildrenSortedByBounds$ui_release();
        int v3 = list0.size();
        if(v3 - 1 >= 0) {
            for(int v4 = 0; true; ++v4) {
                SemanticsNode semanticsNode1 = (SemanticsNode)list0.get(v4);
                if(this.getCurrentSemanticsNodes().containsKey(semanticsNode1.getId())) {
                    AndroidViewHolder androidViewHolder0 = (AndroidViewHolder)this.getView().getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(semanticsNode1.getLayoutNode$ui_release());
                    if(androidViewHolder0 == null) {
                        accessibilityNodeInfoCompat0.addChild(this.getView(), semanticsNode1.getId());
                    }
                    else {
                        accessibilityNodeInfoCompat0.addChild(androidViewHolder0);
                    }
                }
                if(v4 + 1 > v3 - 1) {
                    break;
                }
            }
        }
        if(this.focusedVirtualViewId == v) {
            accessibilityNodeInfoCompat0.setAccessibilityFocused(true);
            accessibilityNodeInfoCompat0.addAction(AccessibilityActionCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS);
        }
        else {
            accessibilityNodeInfoCompat0.setAccessibilityFocused(false);
            accessibilityNodeInfoCompat0.addAction(AccessibilityActionCompat.ACTION_ACCESSIBILITY_FOCUS);
        }
        this.setText(semanticsNode0, accessibilityNodeInfoCompat0);
        this.setContentInvalid(semanticsNode0, accessibilityNodeInfoCompat0);
        accessibilityNodeInfoCompat0.setStateDescription(((CharSequence)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getStateDescription())));
        ToggleableState toggleableState0 = (ToggleableState)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getToggleableState());
        int v5 = 2;
        if(toggleableState0 != null) {
            accessibilityNodeInfoCompat0.setCheckable(true);
            int v6 = WhenMappings.$EnumSwitchMapping$0[toggleableState0.ordinal()];
            switch(v6) {
                case 1: {
                    accessibilityNodeInfoCompat0.setChecked(true);
                    if((role0 == null ? false : Role.equals-impl0(role0.unbox-impl(), 2)) && accessibilityNodeInfoCompat0.getStateDescription() == null) {
                        accessibilityNodeInfoCompat0.setStateDescription(this.getView().getContext().getResources().getString(string.on));
                    }
                    break;
                }
                case 2: {
                    accessibilityNodeInfoCompat0.setChecked(false);
                    if((role0 == null ? false : Role.equals-impl0(role0.unbox-impl(), 2)) && accessibilityNodeInfoCompat0.getStateDescription() == null) {
                        accessibilityNodeInfoCompat0.setStateDescription(this.getView().getContext().getResources().getString(string.off));
                    }
                    break;
                }
                default: {
                    if(v6 == 3 && accessibilityNodeInfoCompat0.getStateDescription() == null) {
                        accessibilityNodeInfoCompat0.setStateDescription(this.getView().getContext().getResources().getString(string.indeterminate));
                    }
                }
            }
        }
        Boolean boolean0 = (Boolean)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getSelected());
        if(boolean0 != null) {
            boolean z = boolean0.booleanValue();
            if((role0 == null ? false : Role.equals-impl0(role0.unbox-impl(), 4))) {
                accessibilityNodeInfoCompat0.setSelected(z);
            }
            else {
                accessibilityNodeInfoCompat0.setCheckable(true);
                accessibilityNodeInfoCompat0.setChecked(z);
                if(accessibilityNodeInfoCompat0.getStateDescription() == null) {
                    accessibilityNodeInfoCompat0.setStateDescription((z ? this.getView().getContext().getResources().getString(string.selected) : this.getView().getContext().getResources().getString(string.not_selected)));
                }
            }
        }
        if(!semanticsNode0.getUnmergedConfig$ui_release().isMergingSemanticsOfDescendants() || semanticsNode0.getReplacedChildren$ui_release().isEmpty()) {
            List list1 = (List)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getContentDescription());
            accessibilityNodeInfoCompat0.setContentDescription((list1 == null ? null : ((String)CollectionsKt.firstOrNull(list1))));
        }
        if(semanticsNode0.getUnmergedConfig$ui_release().isMergingSemanticsOfDescendants()) {
            accessibilityNodeInfoCompat0.setScreenReaderFocusable(true);
        }
        if(((Unit)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getHeading())) != null) {
            accessibilityNodeInfoCompat0.setHeading(true);
        }
        accessibilityNodeInfoCompat0.setPassword(AndroidComposeViewAccessibilityDelegateCompat_androidKt.isPassword(semanticsNode0));
        accessibilityNodeInfoCompat0.setEditable(AndroidComposeViewAccessibilityDelegateCompat_androidKt.isTextField(semanticsNode0));
        accessibilityNodeInfoCompat0.setEnabled(AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode0));
        accessibilityNodeInfoCompat0.setFocusable(semanticsNode0.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getFocused()));
        if(accessibilityNodeInfoCompat0.isFocusable()) {
            accessibilityNodeInfoCompat0.setFocused(((Boolean)semanticsNode0.getUnmergedConfig$ui_release().get(SemanticsProperties.INSTANCE.getFocused())).booleanValue());
        }
        accessibilityNodeInfoCompat0.setVisibleToUser(SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getInvisibleToUser()) == null);
        LiveRegionMode liveRegionMode0 = (LiveRegionMode)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getLiveRegion());
        if(liveRegionMode0 != null) {
            int v7 = liveRegionMode0.unbox-impl();
            if(LiveRegionMode.equals-impl0(v7, 0)) {
                v5 = 1;
            }
            else if(!LiveRegionMode.equals-impl0(v7, 1)) {
                v5 = 1;
            }
            accessibilityNodeInfoCompat0.setLiveRegion(v5);
        }
        accessibilityNodeInfoCompat0.setClickable(false);
        AccessibilityAction accessibilityAction0 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getOnClick());
        if(accessibilityAction0 != null) {
            boolean z1 = Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getSelected()), Boolean.TRUE);
            accessibilityNodeInfoCompat0.setClickable(!z1);
            if(AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode0) && !z1) {
                accessibilityNodeInfoCompat0.addAction(new AccessibilityActionCompat(16, accessibilityAction0.getLabel()));
            }
        }
        accessibilityNodeInfoCompat0.setLongClickable(false);
        AccessibilityAction accessibilityAction1 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getOnLongClick());
        if(accessibilityAction1 != null) {
            accessibilityNodeInfoCompat0.setLongClickable(true);
            if(AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode0)) {
                accessibilityNodeInfoCompat0.addAction(new AccessibilityActionCompat(0x20, accessibilityAction1.getLabel()));
            }
        }
        AccessibilityAction accessibilityAction2 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getCopyText());
        if(accessibilityAction2 != null) {
            accessibilityNodeInfoCompat0.addAction(new AccessibilityActionCompat(0x4000, accessibilityAction2.getLabel()));
        }
        if(AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode0)) {
            AccessibilityAction accessibilityAction3 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getSetText());
            if(accessibilityAction3 != null) {
                accessibilityNodeInfoCompat0.addAction(new AccessibilityActionCompat(0x200000, accessibilityAction3.getLabel()));
            }
            AccessibilityAction accessibilityAction4 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getCutText());
            if(accessibilityAction4 != null) {
                accessibilityNodeInfoCompat0.addAction(new AccessibilityActionCompat(0x10000, accessibilityAction4.getLabel()));
            }
            AccessibilityAction accessibilityAction5 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getPasteText());
            if(accessibilityAction5 != null && accessibilityNodeInfoCompat0.isFocused() && this.getView().getClipboardManager().hasText()) {
                accessibilityNodeInfoCompat0.addAction(new AccessibilityActionCompat(0x8000, accessibilityAction5.getLabel()));
            }
        }
        CharSequence charSequence0 = this.getIterableTextForAccessibility(semanticsNode0);
        if(charSequence0 != null && charSequence0.length() != 0) {
            accessibilityNodeInfoCompat0.setTextSelection(this.getAccessibilitySelectionStart(semanticsNode0), this.getAccessibilitySelectionEnd(semanticsNode0));
            AccessibilityAction accessibilityAction6 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getSetSelection());
            if(accessibilityAction6 != null) {
                s = accessibilityAction6.getLabel();
            }
            accessibilityNodeInfoCompat0.addAction(new AccessibilityActionCompat(0x20000, s));
            accessibilityNodeInfoCompat0.addAction(0x100);
            accessibilityNodeInfoCompat0.addAction(0x200);
            accessibilityNodeInfoCompat0.setMovementGranularities(11);
            Collection collection0 = (List)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getContentDescription());
            if((collection0 == null || collection0.isEmpty()) && semanticsNode0.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getGetTextLayoutResult()) && !AndroidComposeViewAccessibilityDelegateCompat_androidKt.excludeLineAndPageGranularities(semanticsNode0)) {
                accessibilityNodeInfoCompat0.setMovementGranularities(accessibilityNodeInfoCompat0.getMovementGranularities() | 20);
            }
        }
        if(Build.VERSION.SDK_INT >= 26) {
            CharSequence charSequence1 = accessibilityNodeInfoCompat0.getText();
            if(charSequence1 != null && charSequence1.length() != 0 && semanticsNode0.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getGetTextLayoutResult())) {
                AccessibilityNodeInfo accessibilityNodeInfo0 = accessibilityNodeInfoCompat0.unwrap();
                Intrinsics.checkNotNullExpressionValue(accessibilityNodeInfo0, "info.unwrap()");
                List list2 = CollectionsKt.listOf("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                AccessibilityNodeInfoVerificationHelperMethods.INSTANCE.setAvailableExtraData(accessibilityNodeInfo0, list2);
            }
        }
        ProgressBarRangeInfo progressBarRangeInfo0 = (ProgressBarRangeInfo)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getProgressBarRangeInfo());
        if(progressBarRangeInfo0 != null) {
            if(semanticsNode0.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getSetProgress())) {
                accessibilityNodeInfoCompat0.setClassName("android.widget.SeekBar");
            }
            else {
                accessibilityNodeInfoCompat0.setClassName("android.widget.ProgressBar");
            }
            if(progressBarRangeInfo0 != ProgressBarRangeInfo.Companion.getIndeterminate()) {
                accessibilityNodeInfoCompat0.setRangeInfo(RangeInfoCompat.obtain(1, ((Number)progressBarRangeInfo0.getRange().getStart()).floatValue(), ((Number)progressBarRangeInfo0.getRange().getEndInclusive()).floatValue(), progressBarRangeInfo0.getCurrent()));
                if(accessibilityNodeInfoCompat0.getStateDescription() == null) {
                    int v8 = 100;
                    ClosedFloatingPointRange closedFloatingPointRange0 = progressBarRangeInfo0.getRange();
                    float f = RangesKt.coerceIn((((Number)closedFloatingPointRange0.getEndInclusive()).floatValue() - ((Number)closedFloatingPointRange0.getStart()).floatValue() == 0.0f ? 0.0f : (progressBarRangeInfo0.getCurrent() - ((Number)closedFloatingPointRange0.getStart()).floatValue()) / (((Number)closedFloatingPointRange0.getEndInclusive()).floatValue() - ((Number)closedFloatingPointRange0.getStart()).floatValue())), 0.0f, 1.0f);
                    if(f == 0.0f) {
                        v8 = 0;
                    }
                    else if(f != 1.0f) {
                        v8 = RangesKt.coerceIn(MathKt.roundToInt(f * 100.0f), 1, 99);
                    }
                    accessibilityNodeInfoCompat0.setStateDescription(this.view.getContext().getResources().getString(string.template_percent, new Object[]{v8}));
                }
            }
            else if(accessibilityNodeInfoCompat0.getStateDescription() == null) {
                accessibilityNodeInfoCompat0.setStateDescription(this.view.getContext().getResources().getString(string.in_progress));
            }
            if(semanticsNode0.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getSetProgress()) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode0)) {
                if(progressBarRangeInfo0.getCurrent() < RangesKt.coerceAtLeast(((Number)progressBarRangeInfo0.getRange().getEndInclusive()).floatValue(), ((Number)progressBarRangeInfo0.getRange().getStart()).floatValue())) {
                    accessibilityNodeInfoCompat0.addAction(AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                }
                if(progressBarRangeInfo0.getCurrent() > RangesKt.coerceAtMost(((Number)progressBarRangeInfo0.getRange().getStart()).floatValue(), ((Number)progressBarRangeInfo0.getRange().getEndInclusive()).floatValue())) {
                    accessibilityNodeInfoCompat0.addAction(AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                }
            }
        }
        if(Build.VERSION.SDK_INT >= 24) {
            Api24Impl.Companion.addSetProgressAction(accessibilityNodeInfoCompat0, semanticsNode0);
        }
        CollectionInfoKt.setCollectionInfo(semanticsNode0, accessibilityNodeInfoCompat0);
        CollectionInfoKt.setCollectionItemInfo(semanticsNode0, accessibilityNodeInfoCompat0);
        ScrollAxisRange scrollAxisRange0 = (ScrollAxisRange)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange());
        AccessibilityAction accessibilityAction7 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getScrollBy());
        if(scrollAxisRange0 != null && accessibilityAction7 != null) {
            float f1 = ((Number)scrollAxisRange0.getValue().invoke()).floatValue();
            float f2 = ((Number)scrollAxisRange0.getMaxValue().invoke()).floatValue();
            boolean z2 = scrollAxisRange0.getReverseScrolling();
            accessibilityNodeInfoCompat0.setClassName("android.widget.HorizontalScrollView");
            if(f2 > 0.0f) {
                accessibilityNodeInfoCompat0.setScrollable(true);
            }
            if(AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode0) && f1 < f2) {
                accessibilityNodeInfoCompat0.addAction(AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                if(z2) {
                    accessibilityNodeInfoCompat0.addAction(AccessibilityActionCompat.ACTION_SCROLL_LEFT);
                }
                else {
                    accessibilityNodeInfoCompat0.addAction(AccessibilityActionCompat.ACTION_SCROLL_RIGHT);
                }
            }
            if(AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode0) && f1 > 0.0f) {
                accessibilityNodeInfoCompat0.addAction(AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                if(z2) {
                    accessibilityNodeInfoCompat0.addAction(AccessibilityActionCompat.ACTION_SCROLL_RIGHT);
                }
                else {
                    accessibilityNodeInfoCompat0.addAction(AccessibilityActionCompat.ACTION_SCROLL_LEFT);
                }
            }
        }
        ScrollAxisRange scrollAxisRange1 = (ScrollAxisRange)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getVerticalScrollAxisRange());
        if(scrollAxisRange1 != null && accessibilityAction7 != null) {
            float f3 = ((Number)scrollAxisRange1.getValue().invoke()).floatValue();
            float f4 = ((Number)scrollAxisRange1.getMaxValue().invoke()).floatValue();
            boolean z3 = scrollAxisRange1.getReverseScrolling();
            accessibilityNodeInfoCompat0.setClassName("android.widget.ScrollView");
            if(f4 > 0.0f) {
                accessibilityNodeInfoCompat0.setScrollable(true);
            }
            if(AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode0) && f3 < f4) {
                accessibilityNodeInfoCompat0.addAction(AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                if(z3) {
                    accessibilityNodeInfoCompat0.addAction(AccessibilityActionCompat.ACTION_SCROLL_UP);
                }
                else {
                    accessibilityNodeInfoCompat0.addAction(AccessibilityActionCompat.ACTION_SCROLL_DOWN);
                }
            }
            if(AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode0) && f3 > 0.0f) {
                accessibilityNodeInfoCompat0.addAction(AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                if(z3) {
                    accessibilityNodeInfoCompat0.addAction(AccessibilityActionCompat.ACTION_SCROLL_DOWN);
                }
                else {
                    accessibilityNodeInfoCompat0.addAction(AccessibilityActionCompat.ACTION_SCROLL_UP);
                }
            }
        }
        accessibilityNodeInfoCompat0.setPaneTitle(((CharSequence)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getPaneTitle())));
        if(AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode0)) {
            AccessibilityAction accessibilityAction8 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getExpand());
            if(accessibilityAction8 != null) {
                accessibilityNodeInfoCompat0.addAction(new AccessibilityActionCompat(0x40000, accessibilityAction8.getLabel()));
            }
            AccessibilityAction accessibilityAction9 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getCollapse());
            if(accessibilityAction9 != null) {
                accessibilityNodeInfoCompat0.addAction(new AccessibilityActionCompat(0x80000, accessibilityAction9.getLabel()));
            }
            AccessibilityAction accessibilityAction10 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getDismiss());
            if(accessibilityAction10 != null) {
                accessibilityNodeInfoCompat0.addAction(new AccessibilityActionCompat(0x100000, accessibilityAction10.getLabel()));
            }
            if(semanticsNode0.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getCustomActions())) {
                List list3 = (List)semanticsNode0.getUnmergedConfig$ui_release().get(SemanticsActions.INSTANCE.getCustomActions());
                int[] arr_v = AndroidComposeViewAccessibilityDelegateCompat.AccessibilityActionsResourceIds;
                if(list3.size() >= arr_v.length) {
                    throw new IllegalStateException("Can\'t have more than " + arr_v.length + " custom actions for one widget");
                }
                SparseArrayCompat sparseArrayCompat0 = new SparseArrayCompat();
                Map map0 = new LinkedHashMap();
                if(this.labelToActionId.containsKey(v)) {
                    Map map1 = (Map)this.labelToActionId.get(v);
                    List list4 = ArraysKt.toMutableList(arr_v);
                    List list5 = new ArrayList();
                    int v9 = list3.size();
                    if(v9 - 1 >= 0) {
                        for(int v10 = 0; true; ++v10) {
                            CustomAccessibilityAction customAccessibilityAction0 = (CustomAccessibilityAction)list3.get(v10);
                            Intrinsics.checkNotNull(map1);
                            if(map1.containsKey(customAccessibilityAction0.getLabel())) {
                                Integer integer0 = (Integer)map1.get(customAccessibilityAction0.getLabel());
                                Intrinsics.checkNotNull(integer0);
                                sparseArrayCompat0.put(((int)integer0), customAccessibilityAction0.getLabel());
                                map0.put(customAccessibilityAction0.getLabel(), integer0);
                                list4.remove(integer0);
                                accessibilityNodeInfoCompat0.addAction(new AccessibilityActionCompat(((int)integer0), customAccessibilityAction0.getLabel()));
                            }
                            else {
                                list5.add(customAccessibilityAction0);
                            }
                            if(v10 + 1 > v9 - 1) {
                                break;
                            }
                        }
                    }
                    int v11 = list5.size();
                    if(v11 - 1 >= 0) {
                        while(true) {
                            CustomAccessibilityAction customAccessibilityAction1 = (CustomAccessibilityAction)list5.get(v1);
                            int v12 = ((Number)list4.get(v1)).intValue();
                            sparseArrayCompat0.put(v12, customAccessibilityAction1.getLabel());
                            map0.put(customAccessibilityAction1.getLabel(), v12);
                            accessibilityNodeInfoCompat0.addAction(new AccessibilityActionCompat(v12, customAccessibilityAction1.getLabel()));
                            if(v1 + 1 > v11 - 1) {
                                break;
                            }
                            ++v1;
                        }
                    }
                }
                else {
                    int v13 = list3.size();
                    if(v13 - 1 >= 0) {
                        while(true) {
                            CustomAccessibilityAction customAccessibilityAction2 = (CustomAccessibilityAction)list3.get(v1);
                            int v14 = AndroidComposeViewAccessibilityDelegateCompat.AccessibilityActionsResourceIds[v1];
                            sparseArrayCompat0.put(v14, customAccessibilityAction2.getLabel());
                            map0.put(customAccessibilityAction2.getLabel(), v14);
                            accessibilityNodeInfoCompat0.addAction(new AccessibilityActionCompat(v14, customAccessibilityAction2.getLabel()));
                            if(v1 + 1 > v13 - 1) {
                                break;
                            }
                            ++v1;
                        }
                    }
                }
                this.actionIdToLabel.put(v, sparseArrayCompat0);
                this.labelToActionId.put(v, map0);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\n"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "parent", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        final class androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.populateAccessibilityNodeInfoProperties.1.ancestor.1 extends Lambda implements Function1 {
            public static final androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.populateAccessibilityNodeInfoProperties.1.ancestor.1 INSTANCE;

            static {
                androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.populateAccessibilityNodeInfoProperties.1.ancestor.1.INSTANCE = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.populateAccessibilityNodeInfoProperties.1.ancestor.1();
            }

            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.populateAccessibilityNodeInfoProperties.1.ancestor.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return Boolean.valueOf(this.invoke(((LayoutNode)object0)));
            }

            public final boolean invoke(LayoutNode layoutNode0) {
                Intrinsics.checkNotNullParameter(layoutNode0, "parent");
                SemanticsWrapper semanticsWrapper0 = SemanticsNodeKt.getOuterSemantics(layoutNode0);
                if(semanticsWrapper0 != null) {
                    SemanticsConfiguration semanticsConfiguration0 = semanticsWrapper0.collapsedSemanticsConfiguration();
                    return semanticsConfiguration0 != null && semanticsConfiguration0.isMergingSemanticsOfDescendants();
                }
                return false;
            }
        }

    }

    private final boolean registerScrollingId(int v, List list0) {
        boolean z;
        ScrollObservationScope scrollObservationScope0 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.findById(list0, v);
        if(scrollObservationScope0 == null) {
            scrollObservationScope0 = new ScrollObservationScope(v, this.scrollObservationScopes, null, null, null, null);
            z = true;
        }
        else {
            z = false;
        }
        this.scrollObservationScopes.add(scrollObservationScope0);
        return z;
    }

    private final boolean requestAccessibilityFocus(int v) {
        if(!this.isAccessibilityEnabled()) {
            return false;
        }
        if(!this.isAccessibilityFocused(v)) {
            int v1 = this.focusedVirtualViewId;
            if(v1 != 0x80000000) {
                AndroidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView$default(this, v1, 0x10000, null, null, 12, null);
            }
            this.focusedVirtualViewId = v;
            this.view.invalidate();
            AndroidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView$default(this, v, 0x8000, null, null, 12, null);
            return true;
        }
        return false;
    }

    private final int semanticsNodeIdToAccessibilityVirtualNodeId(int v) {
        return v == this.view.getSemanticsOwner().getUnmergedRootSemanticsNode().getId() ? -1 : v;
    }

    private final boolean sendEvent(AccessibilityEvent accessibilityEvent0) {
        return this.isAccessibilityEnabled() ? this.view.getParent().requestSendAccessibilityEvent(this.view, accessibilityEvent0) : false;
    }

    private final boolean sendEventForVirtualView(int v, int v1, Integer integer0, List list0) {
        if(v != 0x80000000 && this.isAccessibilityEnabled()) {
            AccessibilityEvent accessibilityEvent0 = this.createEvent$ui_release(v, v1);
            if(integer0 != null) {
                accessibilityEvent0.setContentChangeTypes(((int)integer0));
            }
            if(list0 != null) {
                accessibilityEvent0.setContentDescription(TempListUtilsKt.fastJoinToString$default(list0, ",", null, null, 0, null, null, 62, null));
            }
            return this.sendEvent(accessibilityEvent0);
        }
        return false;
    }

    static boolean sendEventForVirtualView$default(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat0, int v, int v1, Integer integer0, List list0, int v2, Object object0) {
        if((v2 & 4) != 0) {
            integer0 = null;
        }
        if((v2 & 8) != 0) {
            list0 = null;
        }
        return androidComposeViewAccessibilityDelegateCompat0.sendEventForVirtualView(v, v1, integer0, list0);
    }

    private final void sendPaneChangeEvents(int v, int v1, String s) {
        AccessibilityEvent accessibilityEvent0 = this.createEvent$ui_release(this.semanticsNodeIdToAccessibilityVirtualNodeId(v), 0x20);
        accessibilityEvent0.setContentChangeTypes(v1);
        if(s != null) {
            accessibilityEvent0.getText().add(s);
        }
        this.sendEvent(accessibilityEvent0);
    }

    private final void sendPendingTextTraversedAtGranularityEvent(int v) {
        PendingTextTraversedEvent androidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent0 = this.pendingTextTraversedEvent;
        if(androidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent0 != null) {
            if(v != androidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent0.getNode().getId()) {
                return;
            }
            if(SystemClock.uptimeMillis() - androidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent0.getTraverseTime() <= 1000L) {
                AccessibilityEvent accessibilityEvent0 = this.createEvent$ui_release(this.semanticsNodeIdToAccessibilityVirtualNodeId(androidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent0.getNode().getId()), 0x20000);
                accessibilityEvent0.setFromIndex(androidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent0.getFromIndex());
                accessibilityEvent0.setToIndex(androidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent0.getToIndex());
                accessibilityEvent0.setAction(androidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent0.getAction());
                accessibilityEvent0.setMovementGranularity(androidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent0.getGranularity());
                accessibilityEvent0.getText().add(this.getIterableTextForAccessibility(androidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent0.getNode()));
                this.sendEvent(accessibilityEvent0);
            }
        }
        this.pendingTextTraversedEvent = null;
    }

    private final void sendScrollEventIfNeeded(ScrollObservationScope scrollObservationScope0) {
        if(!scrollObservationScope0.isValid()) {
            return;
        }
        Function0 function00 = new Function0(this) {
            final ScrollObservationScope $scrollObservationScope;

            {
                this.$scrollObservationScope = scrollObservationScope0;
                AndroidComposeViewAccessibilityDelegateCompat.this = androidComposeViewAccessibilityDelegateCompat0;
                super(0);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                this.invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                ScrollAxisRange scrollAxisRange0 = this.$scrollObservationScope.getHorizontalScrollAxisRange();
                ScrollAxisRange scrollAxisRange1 = this.$scrollObservationScope.getVerticalScrollAxisRange();
                Float float0 = this.$scrollObservationScope.getOldXValue();
                Float float1 = this.$scrollObservationScope.getOldYValue();
                float f = scrollAxisRange0 == null || float0 == null ? 0.0f : ((Number)scrollAxisRange0.getValue().invoke()).floatValue() - ((float)float0);
                float f1 = scrollAxisRange1 == null || float1 == null ? 0.0f : ((Number)scrollAxisRange1.getValue().invoke()).floatValue() - ((float)float1);
                if(f != 0.0f || f1 != 0.0f) {
                    int v = AndroidComposeViewAccessibilityDelegateCompat.this.semanticsNodeIdToAccessibilityVirtualNodeId(this.$scrollObservationScope.getSemanticsNodeId());
                    AndroidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView$default(AndroidComposeViewAccessibilityDelegateCompat.this, v, 0x800, 1, null, 8, null);
                    AccessibilityEvent accessibilityEvent0 = AndroidComposeViewAccessibilityDelegateCompat.this.createEvent$ui_release(v, 0x1000);
                    if(scrollAxisRange0 != null) {
                        accessibilityEvent0.setScrollX(((int)((Number)scrollAxisRange0.getValue().invoke()).floatValue()));
                        accessibilityEvent0.setMaxScrollX(((int)((Number)scrollAxisRange0.getMaxValue().invoke()).floatValue()));
                    }
                    if(scrollAxisRange1 != null) {
                        accessibilityEvent0.setScrollY(((int)((Number)scrollAxisRange1.getValue().invoke()).floatValue()));
                        accessibilityEvent0.setMaxScrollY(((int)((Number)scrollAxisRange1.getMaxValue().invoke()).floatValue()));
                    }
                    if(Build.VERSION.SDK_INT >= 28) {
                        Api28Impl.Companion.setScrollEventDelta(accessibilityEvent0, ((int)f), ((int)f1));
                    }
                    AndroidComposeViewAccessibilityDelegateCompat.this.sendEvent(accessibilityEvent0);
                }
                if(scrollAxisRange0 != null) {
                    Float float2 = (Float)scrollAxisRange0.getValue().invoke();
                    this.$scrollObservationScope.setOldXValue(float2);
                }
                if(scrollAxisRange1 != null) {
                    Float float3 = (Float)scrollAxisRange1.getValue().invoke();
                    this.$scrollObservationScope.setOldYValue(float3);
                }
            }
        };
        this.view.getSnapshotObserver().observeReads$ui_release(scrollObservationScope0, this.sendScrollEventIfNeededLambda, function00);
    }

    public final void sendSemanticsPropertyChangeEvents$ui_release(Map map0) {
        String s4;
        Map.Entry map$Entry0;
        boolean z;
        Intrinsics.checkNotNullParameter(map0, "newSemanticsNodes");
        ArrayList arrayList0 = new ArrayList(this.scrollObservationScopes);
        this.scrollObservationScopes.clear();
        for(Object object0: map0.keySet()) {
            int v = ((Number)object0).intValue();
            SemanticsNodeCopy androidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy0 = (SemanticsNodeCopy)this.previousSemanticsNodes.get(v);
            if(androidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy0 != null) {
                SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds0 = (SemanticsNodeWithAdjustedBounds)map0.get(v);
                SemanticsNode semanticsNode0 = semanticsNodeWithAdjustedBounds0 == null ? null : semanticsNodeWithAdjustedBounds0.getSemanticsNode();
                Intrinsics.checkNotNull(semanticsNode0);
                Iterator iterator1 = semanticsNode0.getUnmergedConfig$ui_release().iterator();
                while(true) {
                    z = false;
                label_14:
                    if(!iterator1.hasNext()) {
                        goto label_150;
                    }
                    Object object1 = iterator1.next();
                    map$Entry0 = (Map.Entry)object1;
                    if(!(Intrinsics.areEqual(map$Entry0.getKey(), SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange()) || Intrinsics.areEqual(map$Entry0.getKey(), SemanticsProperties.INSTANCE.getVerticalScrollAxisRange()) ? this.registerScrollingId(v, arrayList0) : false) && Intrinsics.areEqual(map$Entry0.getValue(), SemanticsConfigurationKt.getOrNull(androidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy0.getUnmergedConfig(), ((SemanticsPropertyKey)map$Entry0.getKey())))) {
                        goto label_14;
                    }
                    String s = "";
                    SemanticsPropertyKey semanticsPropertyKey0 = (SemanticsPropertyKey)map$Entry0.getKey();
                    if(Intrinsics.areEqual(semanticsPropertyKey0, SemanticsProperties.INSTANCE.getPaneTitle())) {
                        Object object2 = map$Entry0.getValue();
                        if(object2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        if(!androidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy0.hasPaneTitle()) {
                            goto label_14;
                        }
                        this.sendPaneChangeEvents(v, 8, ((String)object2));
                        goto label_14;
                    }
                    if(((Intrinsics.areEqual(semanticsPropertyKey0, SemanticsProperties.INSTANCE.getStateDescription()) ? true : Intrinsics.areEqual(semanticsPropertyKey0, SemanticsProperties.INSTANCE.getToggleableState())) ? true : Intrinsics.areEqual(semanticsPropertyKey0, SemanticsProperties.INSTANCE.getProgressBarRangeInfo()))) {
                        AndroidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView$default(this, this.semanticsNodeIdToAccessibilityVirtualNodeId(v), 0x800, 0x40, null, 8, null);
                        goto label_14;
                    }
                    if(Intrinsics.areEqual(semanticsPropertyKey0, SemanticsProperties.INSTANCE.getSelected())) {
                        Role role0 = (Role)SemanticsConfigurationKt.getOrNull(semanticsNode0.getConfig(), SemanticsProperties.INSTANCE.getRole());
                        if(!(role0 == null ? false : Role.equals-impl0(role0.unbox-impl(), 4))) {
                            AndroidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView$default(this, this.semanticsNodeIdToAccessibilityVirtualNodeId(v), 0x800, 0x40, null, 8, null);
                        }
                        else if(Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(semanticsNode0.getConfig(), SemanticsProperties.INSTANCE.getSelected()), Boolean.TRUE)) {
                            AccessibilityEvent accessibilityEvent0 = this.createEvent$ui_release(this.semanticsNodeIdToAccessibilityVirtualNodeId(v), 4);
                            SemanticsNode semanticsNode1 = new SemanticsNode(semanticsNode0.getOuterSemanticsNodeWrapper$ui_release(), true);
                            List list0 = (List)SemanticsConfigurationKt.getOrNull(semanticsNode1.getConfig(), SemanticsProperties.INSTANCE.getContentDescription());
                            String s1 = list0 == null ? null : TempListUtilsKt.fastJoinToString$default(list0, ",", null, null, 0, null, null, 62, null);
                            List list1 = (List)SemanticsConfigurationKt.getOrNull(semanticsNode1.getConfig(), SemanticsProperties.INSTANCE.getText());
                            String s2 = list1 == null ? null : TempListUtilsKt.fastJoinToString$default(list1, ",", null, null, 0, null, null, 62, null);
                            if(s1 != null) {
                                accessibilityEvent0.setContentDescription(s1);
                            }
                            if(s2 != null) {
                                accessibilityEvent0.getText().add(s2);
                            }
                            this.sendEvent(accessibilityEvent0);
                        }
                        else {
                            AndroidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView$default(this, this.semanticsNodeIdToAccessibilityVirtualNodeId(v), 0x800, 0, null, 8, null);
                        }
                        goto label_14;
                    }
                    if(Intrinsics.areEqual(semanticsPropertyKey0, SemanticsProperties.INSTANCE.getContentDescription())) {
                        int v1 = this.semanticsNodeIdToAccessibilityVirtualNodeId(v);
                        Object object3 = map$Entry0.getValue();
                        if(object3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                        }
                        this.sendEventForVirtualView(v1, 0x800, 4, ((List)object3));
                        goto label_14;
                    }
                    if(Intrinsics.areEqual(semanticsPropertyKey0, SemanticsProperties.INSTANCE.getEditableText())) {
                        if(AndroidComposeViewAccessibilityDelegateCompat_androidKt.isTextField(semanticsNode0)) {
                            AnnotatedString annotatedString0 = (AnnotatedString)SemanticsConfigurationKt.getOrNull(androidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy0.getUnmergedConfig(), SemanticsProperties.INSTANCE.getEditableText());
                            if(annotatedString0 == null) {
                                s4 = "";
                            }
                            else {
                                String s3 = annotatedString0.getText();
                                s4 = s3 == null ? "" : s3;
                            }
                            AnnotatedString annotatedString1 = (AnnotatedString)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getEditableText());
                            if(annotatedString1 != null) {
                                String s5 = annotatedString1.getText();
                                if(s5 != null) {
                                    s = s5;
                                }
                            }
                            int v2 = s4.length();
                            int v3 = s.length();
                            int v4 = RangesKt.coerceAtMost(v2, v3);
                            int v5;
                            for(v5 = 0; v5 < v4 && s4.charAt(v5) == s.charAt(v5); ++v5) {
                            }
                            int v6;
                            for(v6 = 0; v6 < v4 - v5 && s4.charAt(v2 - 1 - v6) == s.charAt(v3 - 1 - v6); ++v6) {
                            }
                            AccessibilityEvent accessibilityEvent1 = this.createEvent$ui_release(this.semanticsNodeIdToAccessibilityVirtualNodeId(v), 16);
                            accessibilityEvent1.setFromIndex(v5);
                            accessibilityEvent1.setRemovedCount(v2 - v6 - v5);
                            accessibilityEvent1.setAddedCount(v3 - v6 - v5);
                            accessibilityEvent1.setBeforeText(s4);
                            accessibilityEvent1.getText().add(this.trimToSize(s, 100000));
                            this.sendEvent(accessibilityEvent1);
                        }
                        else {
                            AndroidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView$default(this, this.semanticsNodeIdToAccessibilityVirtualNodeId(v), 0x800, 2, null, 8, null);
                        }
                        goto label_14;
                    }
                    if(Intrinsics.areEqual(semanticsPropertyKey0, SemanticsProperties.INSTANCE.getTextSelectionRange())) {
                        String s6 = this.getTextForTextField(semanticsNode0);
                        if(s6 != null) {
                            s = s6;
                        }
                        long v7 = ((TextRange)semanticsNode0.getUnmergedConfig$ui_release().get(SemanticsProperties.INSTANCE.getTextSelectionRange())).unbox-impl();
                        this.sendEvent(this.createTextSelectionChangedEvent(this.semanticsNodeIdToAccessibilityVirtualNodeId(v), ((int)(v7 >> 0x20)), ((int)(v7 & 0xFFFFFFFFL)), s.length(), ((String)this.trimToSize(s, 100000))));
                        this.sendPendingTextTraversedAtGranularityEvent(semanticsNode0.getId());
                        goto label_14;
                    }
                    else if((Intrinsics.areEqual(semanticsPropertyKey0, SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange()) ? true : Intrinsics.areEqual(semanticsPropertyKey0, SemanticsProperties.INSTANCE.getVerticalScrollAxisRange()))) {
                        this.notifySubtreeAccessibilityStateChangedIfNeeded(semanticsNode0.getLayoutNode$ui_release());
                        ScrollObservationScope scrollObservationScope0 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.findById(this.scrollObservationScopes, v);
                        Intrinsics.checkNotNull(scrollObservationScope0);
                        scrollObservationScope0.setHorizontalScrollAxisRange(((ScrollAxisRange)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange())));
                        scrollObservationScope0.setVerticalScrollAxisRange(((ScrollAxisRange)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getVerticalScrollAxisRange())));
                        this.sendScrollEventIfNeeded(scrollObservationScope0);
                        goto label_14;
                    }
                    else if(Intrinsics.areEqual(semanticsPropertyKey0, SemanticsProperties.INSTANCE.getFocused())) {
                        Object object4 = map$Entry0.getValue();
                        if(object4 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                        }
                        if(((Boolean)object4).booleanValue()) {
                            this.sendEvent(this.createEvent$ui_release(this.semanticsNodeIdToAccessibilityVirtualNodeId(semanticsNode0.getId()), 8));
                        }
                        AndroidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView$default(this, this.semanticsNodeIdToAccessibilityVirtualNodeId(semanticsNode0.getId()), 0x800, 0, null, 8, null);
                        goto label_14;
                    }
                    else {
                        if(Intrinsics.areEqual(semanticsPropertyKey0, SemanticsActions.INSTANCE.getCustomActions())) {
                            List list2 = (List)semanticsNode0.getUnmergedConfig$ui_release().get(SemanticsActions.INSTANCE.getCustomActions());
                            List list3 = (List)SemanticsConfigurationKt.getOrNull(androidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy0.getUnmergedConfig(), SemanticsActions.INSTANCE.getCustomActions());
                            if(list3 == null) {
                                goto label_140;
                            }
                            else {
                                Set set0 = new LinkedHashSet();
                                int v8 = list2.size() - 1;
                                if(v8 >= 0) {
                                    for(int v9 = 0; true; ++v9) {
                                        set0.add(((CustomAccessibilityAction)list2.get(v9)).getLabel());
                                        if(v9 + 1 > v8) {
                                            break;
                                        }
                                    }
                                }
                                Set set1 = new LinkedHashSet();
                                int v10 = list3.size() - 1;
                                if(v10 >= 0) {
                                    for(int v11 = 0; true; ++v11) {
                                        set1.add(((CustomAccessibilityAction)list3.get(v11)).getLabel());
                                        if(v11 + 1 > v10) {
                                            break;
                                        }
                                    }
                                }
                                if(set0.containsAll(set1) && set1.containsAll(set0)) {
                                    continue;
                                }
                                break;
                            }
                        }
                        goto label_142;
                    }
                    goto label_150;
                }
                z = true;
                goto label_14;
            label_140:
                if(!list2.isEmpty() == 0) {
                    goto label_14;
                }
                z = true;
                goto label_14;
            label_142:
                if(map$Entry0.getValue() instanceof AccessibilityAction) {
                    Object object5 = map$Entry0.getValue();
                    if(object5 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                    }
                    z = !AndroidComposeViewAccessibilityDelegateCompat_androidKt.accessibilityEquals(((AccessibilityAction)object5), SemanticsConfigurationKt.getOrNull(androidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy0.getUnmergedConfig(), ((SemanticsPropertyKey)map$Entry0.getKey())));
                    goto label_14;
                }
                z = true;
                goto label_14;
            label_150:
                if(!z) {
                    z = AndroidComposeViewAccessibilityDelegateCompat_androidKt.propertiesDeleted(semanticsNode0, androidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy0);
                }
                if(z) {
                    AndroidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView$default(this, this.semanticsNodeIdToAccessibilityVirtualNodeId(v), 0x800, 0, null, 8, null);
                }
            }
        }
    }

    private final void sendSemanticsStructureChangeEvents(SemanticsNode semanticsNode0, SemanticsNodeCopy androidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy0) {
        Set set0 = new LinkedHashSet();
        List list0 = semanticsNode0.getReplacedChildren$ui_release();
        int v = list0.size();
        if(v - 1 >= 0) {
            for(int v2 = 0; true; ++v2) {
                SemanticsNode semanticsNode1 = (SemanticsNode)list0.get(v2);
                if(this.getCurrentSemanticsNodes().containsKey(semanticsNode1.getId())) {
                    if(!androidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy0.getChildren().contains(semanticsNode1.getId())) {
                        this.notifySubtreeAccessibilityStateChangedIfNeeded(semanticsNode0.getLayoutNode$ui_release());
                        return;
                    }
                    set0.add(semanticsNode1.getId());
                }
                if(v2 + 1 > v - 1) {
                    break;
                }
            }
        }
        for(Object object0: androidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy0.getChildren()) {
            if(!set0.contains(((Number)object0).intValue())) {
                this.notifySubtreeAccessibilityStateChangedIfNeeded(semanticsNode0.getLayoutNode$ui_release());
                return;
            }
            if(false) {
                break;
            }
        }
        List list1 = semanticsNode0.getReplacedChildren$ui_release();
        int v3 = list1.size();
        if(v3 - 1 >= 0) {
            for(int v1 = 0; true; ++v1) {
                SemanticsNode semanticsNode2 = (SemanticsNode)list1.get(v1);
                if(this.getCurrentSemanticsNodes().containsKey(semanticsNode2.getId())) {
                    Object object1 = this.getPreviousSemanticsNodes$ui_release().get(semanticsNode2.getId());
                    Intrinsics.checkNotNull(object1);
                    this.sendSemanticsStructureChangeEvents(semanticsNode2, ((SemanticsNodeCopy)object1));
                }
                if(v1 + 1 > v3 - 1) {
                    break;
                }
            }
        }
    }

    private final void sendSubtreeChangeAccessibilityEvents(LayoutNode layoutNode0, ArraySet arraySet0) {
        if(!layoutNode0.isAttached()) {
            return;
        }
        if(this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode0)) {
            return;
        }
        SemanticsWrapper semanticsWrapper0 = SemanticsNodeKt.getOuterSemantics(layoutNode0);
        if(semanticsWrapper0 == null) {
            LayoutNode layoutNode1 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.findClosestParentNode(layoutNode0, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sendSubtreeChangeAccessibilityEvents.semanticsWrapper.1.INSTANCE);
            semanticsWrapper0 = layoutNode1 == null ? null : SemanticsNodeKt.getOuterSemantics(layoutNode1);
            if(semanticsWrapper0 == null) {
                return;
            }
        }
        if(!semanticsWrapper0.collapsedSemanticsConfiguration().isMergingSemanticsOfDescendants()) {
            LayoutNode layoutNode2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.findClosestParentNode(layoutNode0, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sendSubtreeChangeAccessibilityEvents.1.INSTANCE);
            if(layoutNode2 != null) {
                SemanticsWrapper semanticsWrapper1 = SemanticsNodeKt.getOuterSemantics(layoutNode2);
                if(semanticsWrapper1 != null) {
                    semanticsWrapper0 = semanticsWrapper1;
                }
            }
        }
        int v = ((SemanticsModifier)semanticsWrapper0.getModifier()).getId();
        if(!arraySet0.add(v)) {
            return;
        }
        AndroidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView$default(this, this.semanticsNodeIdToAccessibilityVirtualNodeId(v), 0x800, 1, null, 8, null);

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\n"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        final class androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sendSubtreeChangeAccessibilityEvents.1 extends Lambda implements Function1 {
            public static final androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sendSubtreeChangeAccessibilityEvents.1 INSTANCE;

            static {
                androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sendSubtreeChangeAccessibilityEvents.1.INSTANCE = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sendSubtreeChangeAccessibilityEvents.1();
            }

            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sendSubtreeChangeAccessibilityEvents.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return Boolean.valueOf(this.invoke(((LayoutNode)object0)));
            }

            public final boolean invoke(LayoutNode layoutNode0) {
                Intrinsics.checkNotNullParameter(layoutNode0, "it");
                SemanticsWrapper semanticsWrapper0 = SemanticsNodeKt.getOuterSemantics(layoutNode0);
                if(semanticsWrapper0 != null) {
                    SemanticsConfiguration semanticsConfiguration0 = semanticsWrapper0.collapsedSemanticsConfiguration();
                    return semanticsConfiguration0 != null && semanticsConfiguration0.isMergingSemanticsOfDescendants();
                }
                return false;
            }
        }


        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\n"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        final class androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sendSubtreeChangeAccessibilityEvents.semanticsWrapper.1 extends Lambda implements Function1 {
            public static final androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sendSubtreeChangeAccessibilityEvents.semanticsWrapper.1 INSTANCE;

            static {
                androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sendSubtreeChangeAccessibilityEvents.semanticsWrapper.1.INSTANCE = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sendSubtreeChangeAccessibilityEvents.semanticsWrapper.1();
            }

            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sendSubtreeChangeAccessibilityEvents.semanticsWrapper.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return Boolean.valueOf(this.invoke(((LayoutNode)object0)));
            }

            public final boolean invoke(LayoutNode layoutNode0) {
                Intrinsics.checkNotNullParameter(layoutNode0, "it");
                return SemanticsNodeKt.getOuterSemantics(layoutNode0) != null;
            }
        }

    }

    public final void setAccessibilityForceEnabledForTesting$ui_release(boolean z) {
        this.accessibilityForceEnabledForTesting = z;
    }

    private final boolean setAccessibilitySelection(SemanticsNode semanticsNode0, int v, int v1, boolean z) {
        boolean z1 = false;
        if(semanticsNode0.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getSetSelection()) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode0)) {
            Function3 function30 = (Function3)((AccessibilityAction)semanticsNode0.getUnmergedConfig$ui_release().get(SemanticsActions.INSTANCE.getSetSelection())).getAction();
            if(function30 != null) {
                Boolean boolean0 = (Boolean)function30.invoke(v, v1, Boolean.valueOf(z));
                return boolean0 == null ? false : boolean0.booleanValue();
            }
            return false;
        }
        if(v == v1 && v1 == this.accessibilityCursorPosition) {
            return false;
        }
        String s = this.getIterableTextForAccessibility(semanticsNode0);
        if(s == null) {
            return false;
        }
        if(v < 0 || v != v1 || v1 > s.length()) {
            v = -1;
        }
        this.accessibilityCursorPosition = v;
        if(s.length() > 0) {
            z1 = true;
        }
        int v2 = this.semanticsNodeIdToAccessibilityVirtualNodeId(semanticsNode0.getId());
        Integer integer0 = null;
        Integer integer1 = z1 ? this.accessibilityCursorPosition : null;
        Integer integer2 = z1 ? this.accessibilityCursorPosition : null;
        if(z1) {
            integer0 = s.length();
        }
        this.sendEvent(this.createTextSelectionChangedEvent(v2, integer1, integer2, integer0, s));
        this.sendPendingTextTraversedAtGranularityEvent(semanticsNode0.getId());
        return true;
    }

    private final void setContentInvalid(SemanticsNode semanticsNode0, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
        if(semanticsNode0.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getError())) {
            accessibilityNodeInfoCompat0.setContentInvalid(true);
            accessibilityNodeInfoCompat0.setError(((CharSequence)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getError())));
        }
    }

    public final void setHoveredVirtualViewId$ui_release(int v) {
        this.hoveredVirtualViewId = v;
    }

    public final void setPreviousSemanticsNodes$ui_release(Map map0) {
        Intrinsics.checkNotNullParameter(map0, "<set-?>");
        this.previousSemanticsNodes = map0;
    }

    private final void setText(SemanticsNode semanticsNode0, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
        AnnotatedString annotatedString0 = (AnnotatedString)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getEditableText());
        SpannableString spannableString0 = null;
        SpannableString spannableString1 = (SpannableString)this.trimToSize((annotatedString0 == null ? null : AndroidAccessibilitySpannableString_androidKt.toAccessibilitySpannableString(annotatedString0, this.view.getDensity(), this.view.getFontLoader())), 100000);
        List list0 = (List)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getText());
        if(list0 != null) {
            AnnotatedString annotatedString1 = (AnnotatedString)CollectionsKt.firstOrNull(list0);
            if(annotatedString1 != null) {
                spannableString0 = AndroidAccessibilitySpannableString_androidKt.toAccessibilitySpannableString(annotatedString1, this.view.getDensity(), this.view.getFontLoader());
            }
        }
        accessibilityNodeInfoCompat0.setText((spannableString1 == null ? ((SpannableString)this.trimToSize(spannableString0, 100000)) : spannableString1));
    }

    private final RectF toScreenCoords(SemanticsNode semanticsNode0, androidx.compose.ui.geometry.Rect rect0) {
        if(semanticsNode0 == null) {
            return null;
        }
        androidx.compose.ui.geometry.Rect rect1 = rect0.translate-k-4lQ0M(semanticsNode0.getPositionInRoot-F1C5BW0());
        androidx.compose.ui.geometry.Rect rect2 = semanticsNode0.getBoundsInRoot();
        androidx.compose.ui.geometry.Rect rect3 = rect1.overlaps(rect2) ? rect1.intersect(rect2) : null;
        if(rect3 != null) {
            long v = this.view.localToScreen-MK-Hz9U(OffsetKt.Offset(rect3.getLeft(), rect3.getTop()));
            long v1 = this.view.localToScreen-MK-Hz9U(OffsetKt.Offset(rect3.getRight(), rect3.getBottom()));
            return new RectF(Offset.getX-impl(v), Offset.getY-impl(v), Offset.getX-impl(v1), Offset.getY-impl(v1));
        }
        return null;
    }

    private final boolean traverseAtGranularity(SemanticsNode semanticsNode0, int v, boolean z, boolean z1) {
        int v5;
        int v4;
        if(this.previousTraversedNode == null || semanticsNode0.getId() != ((int)this.previousTraversedNode)) {
            this.accessibilityCursorPosition = -1;
            this.previousTraversedNode = semanticsNode0.getId();
        }
        String s = this.getIterableTextForAccessibility(semanticsNode0);
        if(s == null || s.length() == 0) {
            return false;
        }
        TextSegmentIterator accessibilityIterators$TextSegmentIterator0 = this.getIteratorForGranularity(semanticsNode0, v);
        if(accessibilityIterators$TextSegmentIterator0 == null) {
            return false;
        }
        int v1 = this.getAccessibilitySelectionEnd(semanticsNode0);
        if(v1 == -1) {
            v1 = z ? 0 : s.length();
        }
        int[] arr_v = z ? accessibilityIterators$TextSegmentIterator0.following(v1) : accessibilityIterators$TextSegmentIterator0.preceding(v1);
        if(arr_v == null) {
            return false;
        }
        int v2 = arr_v[0];
        int v3 = arr_v[1];
        if(!z1 || !this.isAccessibilitySelectionExtendable(semanticsNode0)) {
            v4 = z ? v3 : v2;
            v5 = v4;
        }
        else {
            v4 = this.getAccessibilitySelectionStart(semanticsNode0);
            if(v4 == -1) {
                v4 = z ? v2 : v3;
            }
            v5 = z ? v3 : v2;
        }
        this.pendingTextTraversedEvent = new PendingTextTraversedEvent(semanticsNode0, (z ? 0x100 : 0x200), v, v2, v3, SystemClock.uptimeMillis());
        this.setAccessibilitySelection(semanticsNode0, v4, v5, true);
        return true;
    }

    private final CharSequence trimToSize(CharSequence charSequence0, int v) {
        boolean z = true;
        if(v <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if(charSequence0 != null && charSequence0.length() != 0) {
            z = false;
        }
        if(!z && charSequence0.length() > v) {
            if(Character.isHighSurrogate(charSequence0.charAt(v - 1)) && Character.isLowSurrogate(charSequence0.charAt(v))) {
                --v;
            }
            return charSequence0.subSequence(0, v);
        }
        return charSequence0;
    }

    private final void updateHoveredVirtualView(int v) {
        int v1 = this.hoveredVirtualViewId;
        if(v1 == v) {
            return;
        }
        this.hoveredVirtualViewId = v;
        AndroidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView$default(this, v, 0x80, null, null, 12, null);
        AndroidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView$default(this, v1, 0x100, null, null, 12, null);
    }

    private final void updateSemanticsNodesCopyAndPanes() {
        for(Object object0: this.paneDisplayed) {
            Integer integer0 = (Integer)object0;
            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds0 = (SemanticsNodeWithAdjustedBounds)this.getCurrentSemanticsNodes().get(integer0);
            String s = null;
            SemanticsNode semanticsNode0 = semanticsNodeWithAdjustedBounds0 == null ? null : semanticsNodeWithAdjustedBounds0.getSemanticsNode();
            if(semanticsNode0 == null || !AndroidComposeViewAccessibilityDelegateCompat_androidKt.hasPaneTitle(semanticsNode0)) {
                this.paneDisplayed.remove(integer0);
                Intrinsics.checkNotNullExpressionValue(integer0, "id");
                int v = (int)integer0;
                SemanticsNodeCopy androidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy0 = (SemanticsNodeCopy)this.previousSemanticsNodes.get(integer0);
                if(androidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy0 != null) {
                    s = (String)SemanticsConfigurationKt.getOrNull(androidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy0.getUnmergedConfig(), SemanticsProperties.INSTANCE.getPaneTitle());
                }
                this.sendPaneChangeEvents(v, 0x20, s);
            }
        }
        this.previousSemanticsNodes.clear();
        for(Object object1: this.getCurrentSemanticsNodes().entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object1;
            if(AndroidComposeViewAccessibilityDelegateCompat_androidKt.hasPaneTitle(((SemanticsNodeWithAdjustedBounds)map$Entry0.getValue()).getSemanticsNode()) && this.paneDisplayed.add(map$Entry0.getKey())) {
                this.sendPaneChangeEvents(((Number)map$Entry0.getKey()).intValue(), 16, ((String)((SemanticsNodeWithAdjustedBounds)map$Entry0.getValue()).getSemanticsNode().getUnmergedConfig$ui_release().get(SemanticsProperties.INSTANCE.getPaneTitle())));
            }
            this.previousSemanticsNodes.put(map$Entry0.getKey(), new SemanticsNodeCopy(((SemanticsNodeWithAdjustedBounds)map$Entry0.getValue()).getSemanticsNode(), this.getCurrentSemanticsNodes()));
        }
        this.previousSemanticsRoot = new SemanticsNodeCopy(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), this.getCurrentSemanticsNodes());
    }
}

