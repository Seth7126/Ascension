package androidx.compose.ui.semantics;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u0000\u00CA\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A,\u0010r\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u0002Hu0t0s\"\u000E\b\u0000\u0010u*\b\u0012\u0004\u0012\u00020\'0v2\u0006\u0010w\u001A\u00020\u0012H\u0000\u001A\u0013\u0010x\u001A\u0002Hu\"\u0004\b\u0000\u0010uH\u0002\u00A2\u0006\u0002\u0010y\u001A&\u0010z\u001A\u00020{*\u00020\u00032\n\b\u0002\u0010|\u001A\u0004\u0018\u00010\u00122\u000E\u0010}\u001A\n\u0012\u0004\u0012\u00020\'\u0018\u00010~\u001A&\u0010\u007F\u001A\u00020{*\u00020\u00032\n\b\u0002\u0010|\u001A\u0004\u0018\u00010\u00122\u000E\u0010}\u001A\n\u0012\u0004\u0012\u00020\'\u0018\u00010~\u001A\'\u0010\u0080\u0001\u001A\u00020{*\u00020\u00032\n\b\u0002\u0010|\u001A\u0004\u0018\u00010\u00122\u000E\u0010}\u001A\n\u0012\u0004\u0012\u00020\'\u0018\u00010~\u001A\u000B\u0010\u0081\u0001\u001A\u00020{*\u00020\u0003\u001A\u000B\u0010\u0082\u0001\u001A\u00020{*\u00020\u0003\u001A\'\u0010\u0083\u0001\u001A\u00020{*\u00020\u00032\n\b\u0002\u0010|\u001A\u0004\u0018\u00010\u00122\u000E\u0010}\u001A\n\u0012\u0004\u0012\u00020\'\u0018\u00010~\u001A\u0014\u0010\u0084\u0001\u001A\u00020{*\u00020\u00032\u0007\u0010\u0085\u0001\u001A\u00020\u0012\u001A\'\u0010\u0086\u0001\u001A\u00020{*\u00020\u00032\n\b\u0002\u0010|\u001A\u0004\u0018\u00010\u00122\u000E\u0010}\u001A\n\u0012\u0004\u0012\u00020\'\u0018\u00010~\u001A6\u0010\u0087\u0001\u001A\u00020{*\u00020\u00032\n\b\u0002\u0010|\u001A\u0004\u0018\u00010\u00122\u001D\u0010}\u001A\u0019\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u008A\u00010\u0089\u0001\u0012\u0004\u0012\u00020\'\u0018\u00010\u0088\u0001\u001A\u000B\u0010\u008B\u0001\u001A\u00020{*\u00020\u0003\u001A#\u0010\u008C\u0001\u001A\u00020{*\u00020\u00032\u0016\u0010\u008D\u0001\u001A\u0011\u0012\u0005\u0012\u00030\u008E\u0001\u0012\u0005\u0012\u00030\u008F\u00010\u0088\u0001\u001A\r\u0010\u0090\u0001\u001A\u00020{*\u00020\u0003H\u0007\u001A\'\u0010\u0091\u0001\u001A\u00020{*\u00020\u00032\n\b\u0002\u0010|\u001A\u0004\u0018\u00010\u00122\u000E\u0010}\u001A\n\u0012\u0004\u0012\u00020\'\u0018\u00010~\u001A\'\u0010\u0092\u0001\u001A\u00020{*\u00020\u00032\n\b\u0002\u0010|\u001A\u0004\u0018\u00010\u00122\u000E\u0010}\u001A\n\u0012\u0004\u0012\u00020\'\u0018\u00010~\u001A\u000B\u0010\u0093\u0001\u001A\u00020{*\u00020\u0003\u001A\'\u0010\u0094\u0001\u001A\u00020{*\u00020\u00032\n\b\u0002\u0010|\u001A\u0004\u0018\u00010\u00122\u000E\u0010}\u001A\n\u0012\u0004\u0012\u00020\'\u0018\u00010~\u001A\u000B\u0010\u0095\u0001\u001A\u00020{*\u00020\u0003\u001AX\u0010\u0096\u0001\u001A\u00020{*\u00020\u00032\n\b\u0002\u0010|\u001A\u0004\u0018\u00010\u00122?\u0010}\u001A;\u0012\u0016\u0012\u00140\u0098\u0001\u00A2\u0006\u000E\b\u0099\u0001\u0012\t\bw\u0012\u0005\b\b(\u009A\u0001\u0012\u0016\u0012\u00140\u0098\u0001\u00A2\u0006\u000E\b\u0099\u0001\u0012\t\bw\u0012\u0005\b\b(\u009B\u0001\u0012\u0004\u0012\u00020\'\u0018\u00010\u0097\u0001\u001A-\u0010\u009C\u0001\u001A\u00020{*\u00020\u00032\n\b\u0002\u0010|\u001A\u0004\u0018\u00010\u00122\u0014\u0010}\u001A\u0010\u0012\u0005\u0012\u00030\u008F\u0001\u0012\u0004\u0012\u00020\'0\u0088\u0001\u001A\u000B\u0010\u009D\u0001\u001A\u00020{*\u00020\u0003\u001A/\u0010\u009E\u0001\u001A\u00020{*\u00020\u00032\n\b\u0002\u0010|\u001A\u0004\u0018\u00010\u00122\u0016\u0010}\u001A\u0012\u0012\u0005\u0012\u00030\u0098\u0001\u0012\u0004\u0012\u00020\'\u0018\u00010\u0088\u0001\u001Ao\u0010\u009F\u0001\u001A\u00020{*\u00020\u00032\n\b\u0002\u0010|\u001A\u0004\u0018\u00010\u00122V\u0010}\u001AR\u0012\u0016\u0012\u00140\u008F\u0001\u00A2\u0006\u000E\b\u0099\u0001\u0012\t\bw\u0012\u0005\b\b(\u00A1\u0001\u0012\u0016\u0012\u00140\u008F\u0001\u00A2\u0006\u000E\b\u0099\u0001\u0012\t\bw\u0012\u0005\b\b(\u00A2\u0001\u0012\u0015\u0012\u00130\'\u00A2\u0006\u000E\b\u0099\u0001\u0012\t\bw\u0012\u0005\b\b(\u00A3\u0001\u0012\u0004\u0012\u00020\'\u0018\u00010\u00A0\u0001\u001A-\u0010_\u001A\u00020{*\u00020\u00032\n\b\u0002\u0010|\u001A\u0004\u0018\u00010\u00122\u0015\u0010}\u001A\u0011\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\'\u0018\u00010\u0088\u0001\"/\u0010\u0002\u001A\u00020\u0001*\u00020\u00032\u0006\u0010\u0000\u001A\u00020\u00018F@FX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\b\b\u0010\t\u001A\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\"/\u0010\u000B\u001A\u00020\n*\u00020\u00032\u0006\u0010\u0000\u001A\u00020\n8F@FX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\b\u0010\u0010\t\u001A\u0004\b\f\u0010\r\"\u0004\b\u000E\u0010\u000F\"(\u0010\u0013\u001A\u00020\u0012*\u00020\u00032\u0006\u0010\u0011\u001A\u00020\u00128F@FX\u0086\u000E\u00A2\u0006\f\u001A\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\";\u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\u00190\u0018*\u00020\u00032\f\u0010\u0000\u001A\b\u0012\u0004\u0012\u00020\u00190\u00188F@FX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\b\u001F\u0010\t\u001A\u0004\b\u001B\u0010\u001C\"\u0004\b\u001D\u0010\u001E\"/\u0010!\u001A\u00020 *\u00020\u00032\u0006\u0010\u0000\u001A\u00020 8F@FX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\b&\u0010\t\u001A\u0004\b\"\u0010#\"\u0004\b$\u0010%\"/\u0010(\u001A\u00020\'*\u00020\u00032\u0006\u0010\u0000\u001A\u00020\'8F@FX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\b-\u0010\t\u001A\u0004\b)\u0010*\"\u0004\b+\u0010,\"/\u0010/\u001A\u00020.*\u00020\u00032\u0006\u0010\u0000\u001A\u00020.8F@FX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\b4\u0010\t\u001A\u0004\b0\u00101\"\u0004\b2\u00103\"2\u00106\u001A\u000205*\u00020\u00032\u0006\u0010\u0000\u001A\u0002058F@FX\u0086\u008E\u0002\u00F8\u0001\u0000\u00A2\u0006\u0012\n\u0004\b;\u0010\t\u001A\u0004\b7\u00108\"\u0004\b9\u0010:\"2\u0010=\u001A\u00020<*\u00020\u00032\u0006\u0010\u0000\u001A\u00020<8F@FX\u0086\u008E\u0002\u00F8\u0001\u0000\u00A2\u0006\u0012\n\u0004\b@\u0010\t\u001A\u0004\b>\u00108\"\u0004\b?\u0010:\"/\u0010A\u001A\u00020\u0012*\u00020\u00032\u0006\u0010\u0000\u001A\u00020\u00128F@FX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\bD\u0010\t\u001A\u0004\bB\u0010\u0015\"\u0004\bC\u0010\u0017\"/\u0010F\u001A\u00020E*\u00020\u00032\u0006\u0010\u0000\u001A\u00020E8F@FX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\bK\u0010\t\u001A\u0004\bG\u0010H\"\u0004\bI\u0010J\"2\u0010M\u001A\u00020L*\u00020\u00032\u0006\u0010\u0000\u001A\u00020L8F@FX\u0086\u008E\u0002\u00F8\u0001\u0000\u00A2\u0006\u0012\n\u0004\bP\u0010\t\u001A\u0004\bN\u00108\"\u0004\bO\u0010:\"/\u0010Q\u001A\u00020\'*\u00020\u00032\u0006\u0010\u0000\u001A\u00020\'8F@FX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\bT\u0010\t\u001A\u0004\bR\u0010*\"\u0004\bS\u0010,\"/\u0010U\u001A\u00020\u0012*\u00020\u00032\u0006\u0010\u0000\u001A\u00020\u00128F@FX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\bX\u0010\t\u001A\u0004\bV\u0010\u0015\"\u0004\bW\u0010\u0017\"/\u0010Y\u001A\u00020\u0012*\u00020\u00032\u0006\u0010\u0000\u001A\u00020\u00128F@FX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\b\\\u0010\t\u001A\u0004\bZ\u0010\u0015\"\u0004\b[\u0010\u0017\"(\u0010]\u001A\u00020 *\u00020\u00032\u0006\u0010\u0011\u001A\u00020 8F@FX\u0086\u000E\u00A2\u0006\f\u001A\u0004\b^\u0010#\"\u0004\b_\u0010%\"2\u0010a\u001A\u00020`*\u00020\u00032\u0006\u0010\u0000\u001A\u00020`8F@FX\u0086\u008E\u0002\u00F8\u0001\u0000\u00A2\u0006\u0012\n\u0004\bf\u0010\t\u001A\u0004\bb\u0010c\"\u0004\bd\u0010e\"/\u0010h\u001A\u00020g*\u00020\u00032\u0006\u0010\u0000\u001A\u00020g8F@FX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\bm\u0010\t\u001A\u0004\bi\u0010j\"\u0004\bk\u0010l\"/\u0010n\u001A\u00020.*\u00020\u00032\u0006\u0010\u0000\u001A\u00020.8F@FX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\bq\u0010\t\u001A\u0004\bo\u00101\"\u0004\bp\u00103\u0082\u0002\u0004\n\u0002\b\u0019\u00A8\u0006\u00A4\u0001"}, d2 = {"<set-?>", "Landroidx/compose/ui/semantics/CollectionInfo;", "collectionInfo", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "getCollectionInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", "setCollectionInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/semantics/CollectionInfo;)V", "collectionInfo$delegate", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Landroidx/compose/ui/semantics/CollectionItemInfo;", "collectionItemInfo", "getCollectionItemInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", "setCollectionItemInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/semantics/CollectionItemInfo;)V", "collectionItemInfo$delegate", "value", "", "contentDescription", "getContentDescription", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", "setContentDescription", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;)V", "", "Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "customActions", "getCustomActions", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", "setCustomActions", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/util/List;)V", "customActions$delegate", "Landroidx/compose/ui/text/AnnotatedString;", "editableText", "getEditableText", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", "setEditableText", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/text/AnnotatedString;)V", "editableText$delegate", "", "focused", "getFocused", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", "setFocused", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Z)V", "focused$delegate", "Landroidx/compose/ui/semantics/ScrollAxisRange;", "horizontalScrollAxisRange", "getHorizontalScrollAxisRange", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", "setHorizontalScrollAxisRange", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/semantics/ScrollAxisRange;)V", "horizontalScrollAxisRange$delegate", "Landroidx/compose/ui/text/input/ImeAction;", "imeAction", "getImeAction", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", "setImeAction-4L7nppU", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;I)V", "imeAction$delegate", "Landroidx/compose/ui/semantics/LiveRegionMode;", "liveRegion", "getLiveRegion", "setLiveRegion-hR3wRGc", "liveRegion$delegate", "paneTitle", "getPaneTitle", "setPaneTitle", "paneTitle$delegate", "Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "progressBarRangeInfo", "getProgressBarRangeInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "setProgressBarRangeInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/semantics/ProgressBarRangeInfo;)V", "progressBarRangeInfo$delegate", "Landroidx/compose/ui/semantics/Role;", "role", "getRole", "setRole-kuIjeqM", "role$delegate", "selected", "getSelected", "setSelected", "selected$delegate", "stateDescription", "getStateDescription", "setStateDescription", "stateDescription$delegate", "testTag", "getTestTag", "setTestTag", "testTag$delegate", "text", "getText", "setText", "Landroidx/compose/ui/text/TextRange;", "textSelectionRange", "getTextSelectionRange", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", "setTextSelectionRange-FDrldGo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;J)V", "textSelectionRange$delegate", "Landroidx/compose/ui/state/ToggleableState;", "toggleableState", "getToggleableState", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", "setToggleableState", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/state/ToggleableState;)V", "toggleableState$delegate", "verticalScrollAxisRange", "getVerticalScrollAxisRange", "setVerticalScrollAxisRange", "verticalScrollAxisRange$delegate", "ActionPropertyKey", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Landroidx/compose/ui/semantics/AccessibilityAction;", "T", "Lkotlin/Function;", "name", "throwSemanticsGetNotSupported", "()Ljava/lang/Object;", "collapse", "", "label", "action", "Lkotlin/Function0;", "copyText", "cutText", "dialog", "disabled", "dismiss", "error", "description", "expand", "getTextLayoutResult", "Lkotlin/Function1;", "", "Landroidx/compose/ui/text/TextLayoutResult;", "heading", "indexForKey", "mapping", "", "", "invisibleToUser", "onClick", "onLongClick", "password", "pasteText", "popup", "scrollBy", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "x", "y", "scrollToIndex", "selectableGroup", "setProgress", "setSelection", "Lkotlin/Function3;", "startIndex", "endIndex", "traversalMode", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class SemanticsPropertiesKt {
    static final KProperty[] $$delegatedProperties;
    private static final SemanticsPropertyKey collectionInfo$delegate;
    private static final SemanticsPropertyKey collectionItemInfo$delegate;
    private static final SemanticsPropertyKey customActions$delegate;
    private static final SemanticsPropertyKey editableText$delegate;
    private static final SemanticsPropertyKey focused$delegate;
    private static final SemanticsPropertyKey horizontalScrollAxisRange$delegate;
    private static final SemanticsPropertyKey imeAction$delegate;
    private static final SemanticsPropertyKey liveRegion$delegate;
    private static final SemanticsPropertyKey paneTitle$delegate;
    private static final SemanticsPropertyKey progressBarRangeInfo$delegate;
    private static final SemanticsPropertyKey role$delegate;
    private static final SemanticsPropertyKey selected$delegate;
    private static final SemanticsPropertyKey stateDescription$delegate;
    private static final SemanticsPropertyKey testTag$delegate;
    private static final SemanticsPropertyKey textSelectionRange$delegate;
    private static final SemanticsPropertyKey toggleableState$delegate;
    private static final SemanticsPropertyKey verticalScrollAxisRange$delegate;

    static {
        SemanticsPropertiesKt.$$delegatedProperties = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(SemanticsPropertiesKt.class, "ui_release"), "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(SemanticsPropertiesKt.class, "ui_release"), "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(SemanticsPropertiesKt.class, "ui_release"), "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(SemanticsPropertiesKt.class, "ui_release"), "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(SemanticsPropertiesKt.class, "ui_release"), "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(SemanticsPropertiesKt.class, "ui_release"), "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(SemanticsPropertiesKt.class, "ui_release"), "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(SemanticsPropertiesKt.class, "ui_release"), "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(SemanticsPropertiesKt.class, "ui_release"), "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(SemanticsPropertiesKt.class, "ui_release"), "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(SemanticsPropertiesKt.class, "ui_release"), "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(SemanticsPropertiesKt.class, "ui_release"), "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(SemanticsPropertiesKt.class, "ui_release"), "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(SemanticsPropertiesKt.class, "ui_release"), "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(SemanticsPropertiesKt.class, "ui_release"), "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(SemanticsPropertiesKt.class, "ui_release"), "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(SemanticsPropertiesKt.class, "ui_release"), "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;"))};
        SemanticsPropertiesKt.stateDescription$delegate = SemanticsProperties.INSTANCE.getStateDescription();
        SemanticsPropertiesKt.progressBarRangeInfo$delegate = SemanticsProperties.INSTANCE.getProgressBarRangeInfo();
        SemanticsPropertiesKt.paneTitle$delegate = SemanticsProperties.INSTANCE.getPaneTitle();
        SemanticsPropertiesKt.liveRegion$delegate = SemanticsProperties.INSTANCE.getLiveRegion();
        SemanticsPropertiesKt.focused$delegate = SemanticsProperties.INSTANCE.getFocused();
        SemanticsPropertiesKt.horizontalScrollAxisRange$delegate = SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange();
        SemanticsPropertiesKt.verticalScrollAxisRange$delegate = SemanticsProperties.INSTANCE.getVerticalScrollAxisRange();
        SemanticsPropertiesKt.role$delegate = SemanticsProperties.INSTANCE.getRole();
        SemanticsPropertiesKt.testTag$delegate = SemanticsProperties.INSTANCE.getTestTag();
        SemanticsPropertiesKt.editableText$delegate = SemanticsProperties.INSTANCE.getEditableText();
        SemanticsPropertiesKt.textSelectionRange$delegate = SemanticsProperties.INSTANCE.getTextSelectionRange();
        SemanticsPropertiesKt.imeAction$delegate = SemanticsProperties.INSTANCE.getImeAction();
        SemanticsPropertiesKt.selected$delegate = SemanticsProperties.INSTANCE.getSelected();
        SemanticsPropertiesKt.collectionInfo$delegate = SemanticsProperties.INSTANCE.getCollectionInfo();
        SemanticsPropertiesKt.collectionItemInfo$delegate = SemanticsProperties.INSTANCE.getCollectionItemInfo();
        SemanticsPropertiesKt.toggleableState$delegate = SemanticsProperties.INSTANCE.getToggleableState();
        SemanticsPropertiesKt.customActions$delegate = SemanticsActions.INSTANCE.getCustomActions();
    }

    public static final SemanticsPropertyKey ActionPropertyKey(String s) {
        Intrinsics.checkNotNullParameter(s, "name");
        return new SemanticsPropertyKey(s, androidx.compose.ui.semantics.SemanticsPropertiesKt.ActionPropertyKey.1.INSTANCE);

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\u000E\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u00002\u000E\u0010\u0004\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00032\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003H\n"}, d2 = {"Lkotlin/Function;", "", "T", "Landroidx/compose/ui/semantics/AccessibilityAction;", "parentValue", "childValue", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        final class androidx.compose.ui.semantics.SemanticsPropertiesKt.ActionPropertyKey.1 extends Lambda implements Function2 {
            public static final androidx.compose.ui.semantics.SemanticsPropertiesKt.ActionPropertyKey.1 INSTANCE;

            static {
                androidx.compose.ui.semantics.SemanticsPropertiesKt.ActionPropertyKey.1.INSTANCE = new androidx.compose.ui.semantics.SemanticsPropertiesKt.ActionPropertyKey.1();
            }

            androidx.compose.ui.semantics.SemanticsPropertiesKt.ActionPropertyKey.1() {
                super(2);
            }

            public final AccessibilityAction invoke(AccessibilityAction accessibilityAction0, AccessibilityAction accessibilityAction1) {
                Intrinsics.checkNotNullParameter(accessibilityAction1, "childValue");
                Function function0 = null;
                String s = accessibilityAction0 == null ? null : accessibilityAction0.getLabel();
                if(s == null) {
                    s = accessibilityAction1.getLabel();
                }
                if(accessibilityAction0 != null) {
                    function0 = accessibilityAction0.getAction();
                }
                if(function0 == null) {
                    function0 = accessibilityAction1.getAction();
                }
                return new AccessibilityAction(s, function0);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((AccessibilityAction)object0), ((AccessibilityAction)object1));
            }
        }

    }

    public static final void collapse(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function0 function00) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        AccessibilityAction accessibilityAction0 = new AccessibilityAction(s, function00);
        semanticsPropertyReceiver0.set(SemanticsActions.INSTANCE.getCollapse(), accessibilityAction0);
    }

    public static void collapse$default(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function0 function00, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.collapse(semanticsPropertyReceiver0, s, function00);
    }

    public static final void copyText(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function0 function00) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        AccessibilityAction accessibilityAction0 = new AccessibilityAction(s, function00);
        semanticsPropertyReceiver0.set(SemanticsActions.INSTANCE.getCopyText(), accessibilityAction0);
    }

    public static void copyText$default(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function0 function00, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.copyText(semanticsPropertyReceiver0, s, function00);
    }

    public static final void cutText(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function0 function00) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        AccessibilityAction accessibilityAction0 = new AccessibilityAction(s, function00);
        semanticsPropertyReceiver0.set(SemanticsActions.INSTANCE.getCutText(), accessibilityAction0);
    }

    public static void cutText$default(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function0 function00, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.cutText(semanticsPropertyReceiver0, s, function00);
    }

    public static final void dialog(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        semanticsPropertyReceiver0.set(SemanticsProperties.INSTANCE.getIsDialog(), Unit.INSTANCE);
    }

    public static final void disabled(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        semanticsPropertyReceiver0.set(SemanticsProperties.INSTANCE.getDisabled(), Unit.INSTANCE);
    }

    public static final void dismiss(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function0 function00) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        AccessibilityAction accessibilityAction0 = new AccessibilityAction(s, function00);
        semanticsPropertyReceiver0.set(SemanticsActions.INSTANCE.getDismiss(), accessibilityAction0);
    }

    public static void dismiss$default(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function0 function00, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.dismiss(semanticsPropertyReceiver0, s, function00);
    }

    public static final void error(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        Intrinsics.checkNotNullParameter(s, "description");
        semanticsPropertyReceiver0.set(SemanticsProperties.INSTANCE.getError(), s);
    }

    public static final void expand(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function0 function00) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        AccessibilityAction accessibilityAction0 = new AccessibilityAction(s, function00);
        semanticsPropertyReceiver0.set(SemanticsActions.INSTANCE.getExpand(), accessibilityAction0);
    }

    public static void expand$default(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function0 function00, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.expand(semanticsPropertyReceiver0, s, function00);
    }

    public static final CollectionInfo getCollectionInfo(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        return (CollectionInfo)SemanticsPropertiesKt.collectionInfo$delegate.getValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.$$delegatedProperties[13]);
    }

    public static final CollectionItemInfo getCollectionItemInfo(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        return (CollectionItemInfo)SemanticsPropertiesKt.collectionItemInfo$delegate.getValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.$$delegatedProperties[14]);
    }

    public static final String getContentDescription(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        return (String)SemanticsPropertiesKt.throwSemanticsGetNotSupported();
    }

    public static final List getCustomActions(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        return (List)SemanticsPropertiesKt.customActions$delegate.getValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.$$delegatedProperties[16]);
    }

    public static final AnnotatedString getEditableText(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        return (AnnotatedString)SemanticsPropertiesKt.editableText$delegate.getValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.$$delegatedProperties[9]);
    }

    public static final boolean getFocused(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        return ((Boolean)SemanticsPropertiesKt.focused$delegate.getValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.$$delegatedProperties[4])).booleanValue();
    }

    public static final ScrollAxisRange getHorizontalScrollAxisRange(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        return (ScrollAxisRange)SemanticsPropertiesKt.horizontalScrollAxisRange$delegate.getValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.$$delegatedProperties[5]);
    }

    public static final int getImeAction(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        return ((ImeAction)SemanticsPropertiesKt.imeAction$delegate.getValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.$$delegatedProperties[11])).unbox-impl();
    }

    public static final int getLiveRegion(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        return ((LiveRegionMode)SemanticsPropertiesKt.liveRegion$delegate.getValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.$$delegatedProperties[3])).unbox-impl();
    }

    public static final String getPaneTitle(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        return (String)SemanticsPropertiesKt.paneTitle$delegate.getValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.$$delegatedProperties[2]);
    }

    public static final ProgressBarRangeInfo getProgressBarRangeInfo(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        return (ProgressBarRangeInfo)SemanticsPropertiesKt.progressBarRangeInfo$delegate.getValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.$$delegatedProperties[1]);
    }

    public static final int getRole(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        return ((Role)SemanticsPropertiesKt.role$delegate.getValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.$$delegatedProperties[7])).unbox-impl();
    }

    public static final boolean getSelected(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        return ((Boolean)SemanticsPropertiesKt.selected$delegate.getValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.$$delegatedProperties[12])).booleanValue();
    }

    public static final String getStateDescription(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        return (String)SemanticsPropertiesKt.stateDescription$delegate.getValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.$$delegatedProperties[0]);
    }

    public static final String getTestTag(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        return (String)SemanticsPropertiesKt.testTag$delegate.getValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.$$delegatedProperties[8]);
    }

    public static final AnnotatedString getText(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        return (AnnotatedString)SemanticsPropertiesKt.throwSemanticsGetNotSupported();
    }

    public static final void getTextLayoutResult(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function1 function10) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        AccessibilityAction accessibilityAction0 = new AccessibilityAction(s, function10);
        semanticsPropertyReceiver0.set(SemanticsActions.INSTANCE.getGetTextLayoutResult(), accessibilityAction0);
    }

    public static void getTextLayoutResult$default(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.getTextLayoutResult(semanticsPropertyReceiver0, s, function10);
    }

    public static final long getTextSelectionRange(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        return ((TextRange)SemanticsPropertiesKt.textSelectionRange$delegate.getValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.$$delegatedProperties[10])).unbox-impl();
    }

    public static final ToggleableState getToggleableState(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        return (ToggleableState)SemanticsPropertiesKt.toggleableState$delegate.getValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.$$delegatedProperties[15]);
    }

    public static final ScrollAxisRange getVerticalScrollAxisRange(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        return (ScrollAxisRange)SemanticsPropertiesKt.verticalScrollAxisRange$delegate.getValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.$$delegatedProperties[6]);
    }

    public static final void heading(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        semanticsPropertyReceiver0.set(SemanticsProperties.INSTANCE.getHeading(), Unit.INSTANCE);
    }

    public static final void indexForKey(SemanticsPropertyReceiver semanticsPropertyReceiver0, Function1 function10) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "mapping");
        semanticsPropertyReceiver0.set(SemanticsProperties.INSTANCE.getIndexForKey(), function10);
    }

    @ExperimentalComposeUiApi
    public static final void invisibleToUser(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        semanticsPropertyReceiver0.set(SemanticsProperties.INSTANCE.getInvisibleToUser(), Unit.INSTANCE);
    }

    public static final void onClick(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function0 function00) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        AccessibilityAction accessibilityAction0 = new AccessibilityAction(s, function00);
        semanticsPropertyReceiver0.set(SemanticsActions.INSTANCE.getOnClick(), accessibilityAction0);
    }

    public static void onClick$default(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function0 function00, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.onClick(semanticsPropertyReceiver0, s, function00);
    }

    public static final void onLongClick(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function0 function00) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        AccessibilityAction accessibilityAction0 = new AccessibilityAction(s, function00);
        semanticsPropertyReceiver0.set(SemanticsActions.INSTANCE.getOnLongClick(), accessibilityAction0);
    }

    public static void onLongClick$default(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function0 function00, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.onLongClick(semanticsPropertyReceiver0, s, function00);
    }

    public static final void password(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        semanticsPropertyReceiver0.set(SemanticsProperties.INSTANCE.getPassword(), Unit.INSTANCE);
    }

    public static final void pasteText(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function0 function00) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        AccessibilityAction accessibilityAction0 = new AccessibilityAction(s, function00);
        semanticsPropertyReceiver0.set(SemanticsActions.INSTANCE.getPasteText(), accessibilityAction0);
    }

    public static void pasteText$default(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function0 function00, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.pasteText(semanticsPropertyReceiver0, s, function00);
    }

    public static final void popup(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        semanticsPropertyReceiver0.set(SemanticsProperties.INSTANCE.getIsPopup(), Unit.INSTANCE);
    }

    public static final void scrollBy(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function2 function20) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        AccessibilityAction accessibilityAction0 = new AccessibilityAction(s, function20);
        semanticsPropertyReceiver0.set(SemanticsActions.INSTANCE.getScrollBy(), accessibilityAction0);
    }

    public static void scrollBy$default(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function2 function20, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.scrollBy(semanticsPropertyReceiver0, s, function20);
    }

    public static final void scrollToIndex(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function1 function10) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "action");
        semanticsPropertyReceiver0.set(SemanticsActions.INSTANCE.getScrollToIndex(), new AccessibilityAction(s, function10));
    }

    public static void scrollToIndex$default(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.scrollToIndex(semanticsPropertyReceiver0, s, function10);
    }

    public static final void selectableGroup(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        semanticsPropertyReceiver0.set(SemanticsProperties.INSTANCE.getSelectableGroup(), Unit.INSTANCE);
    }

    public static final void setCollectionInfo(SemanticsPropertyReceiver semanticsPropertyReceiver0, CollectionInfo collectionInfo0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        Intrinsics.checkNotNullParameter(collectionInfo0, "<set-?>");
        SemanticsPropertiesKt.collectionInfo$delegate.setValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.$$delegatedProperties[13], collectionInfo0);
    }

    public static final void setCollectionItemInfo(SemanticsPropertyReceiver semanticsPropertyReceiver0, CollectionItemInfo collectionItemInfo0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        Intrinsics.checkNotNullParameter(collectionItemInfo0, "<set-?>");
        SemanticsPropertiesKt.collectionItemInfo$delegate.setValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.$$delegatedProperties[14], collectionItemInfo0);
    }

    public static final void setContentDescription(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        Intrinsics.checkNotNullParameter(s, "value");
        List list0 = CollectionsKt.listOf(s);
        semanticsPropertyReceiver0.set(SemanticsProperties.INSTANCE.getContentDescription(), list0);
    }

    public static final void setCustomActions(SemanticsPropertyReceiver semanticsPropertyReceiver0, List list0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        Intrinsics.checkNotNullParameter(list0, "<set-?>");
        SemanticsPropertiesKt.customActions$delegate.setValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.$$delegatedProperties[16], list0);
    }

    public static final void setEditableText(SemanticsPropertyReceiver semanticsPropertyReceiver0, AnnotatedString annotatedString0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        Intrinsics.checkNotNullParameter(annotatedString0, "<set-?>");
        SemanticsPropertiesKt.editableText$delegate.setValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.$$delegatedProperties[9], annotatedString0);
    }

    public static final void setFocused(SemanticsPropertyReceiver semanticsPropertyReceiver0, boolean z) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        SemanticsPropertiesKt.focused$delegate.setValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.$$delegatedProperties[4], Boolean.valueOf(z));
    }

    public static final void setHorizontalScrollAxisRange(SemanticsPropertyReceiver semanticsPropertyReceiver0, ScrollAxisRange scrollAxisRange0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        Intrinsics.checkNotNullParameter(scrollAxisRange0, "<set-?>");
        SemanticsPropertiesKt.horizontalScrollAxisRange$delegate.setValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.$$delegatedProperties[5], scrollAxisRange0);
    }

    public static final void setImeAction-4L7nppU(SemanticsPropertyReceiver semanticsPropertyReceiver0, int v) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "$this$<set-imeAction>");
        KProperty kProperty0 = SemanticsPropertiesKt.$$delegatedProperties[11];
        ImeAction imeAction0 = ImeAction.box-impl(v);
        SemanticsPropertiesKt.imeAction$delegate.setValue(semanticsPropertyReceiver0, kProperty0, imeAction0);
    }

    public static final void setLiveRegion-hR3wRGc(SemanticsPropertyReceiver semanticsPropertyReceiver0, int v) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "$this$<set-liveRegion>");
        KProperty kProperty0 = SemanticsPropertiesKt.$$delegatedProperties[3];
        LiveRegionMode liveRegionMode0 = LiveRegionMode.box-impl(v);
        SemanticsPropertiesKt.liveRegion$delegate.setValue(semanticsPropertyReceiver0, kProperty0, liveRegionMode0);
    }

    public static final void setPaneTitle(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        SemanticsPropertiesKt.paneTitle$delegate.setValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.$$delegatedProperties[2], s);
    }

    public static final void setProgress(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function1 function10) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        AccessibilityAction accessibilityAction0 = new AccessibilityAction(s, function10);
        semanticsPropertyReceiver0.set(SemanticsActions.INSTANCE.getSetProgress(), accessibilityAction0);
    }

    public static void setProgress$default(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.setProgress(semanticsPropertyReceiver0, s, function10);
    }

    public static final void setProgressBarRangeInfo(SemanticsPropertyReceiver semanticsPropertyReceiver0, ProgressBarRangeInfo progressBarRangeInfo0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        Intrinsics.checkNotNullParameter(progressBarRangeInfo0, "<set-?>");
        SemanticsPropertiesKt.progressBarRangeInfo$delegate.setValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.$$delegatedProperties[1], progressBarRangeInfo0);
    }

    public static final void setRole-kuIjeqM(SemanticsPropertyReceiver semanticsPropertyReceiver0, int v) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "$this$<set-role>");
        KProperty kProperty0 = SemanticsPropertiesKt.$$delegatedProperties[7];
        Role role0 = Role.box-impl(v);
        SemanticsPropertiesKt.role$delegate.setValue(semanticsPropertyReceiver0, kProperty0, role0);
    }

    public static final void setSelected(SemanticsPropertyReceiver semanticsPropertyReceiver0, boolean z) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        SemanticsPropertiesKt.selected$delegate.setValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.$$delegatedProperties[12], Boolean.valueOf(z));
    }

    public static final void setSelection(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function3 function30) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        AccessibilityAction accessibilityAction0 = new AccessibilityAction(s, function30);
        semanticsPropertyReceiver0.set(SemanticsActions.INSTANCE.getSetSelection(), accessibilityAction0);
    }

    public static void setSelection$default(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function3 function30, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.setSelection(semanticsPropertyReceiver0, s, function30);
    }

    public static final void setStateDescription(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        SemanticsPropertiesKt.stateDescription$delegate.setValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.$$delegatedProperties[0], s);
    }

    public static final void setTestTag(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        SemanticsPropertiesKt.testTag$delegate.setValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.$$delegatedProperties[8], s);
    }

    public static final void setText(SemanticsPropertyReceiver semanticsPropertyReceiver0, AnnotatedString annotatedString0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        Intrinsics.checkNotNullParameter(annotatedString0, "value");
        List list0 = CollectionsKt.listOf(annotatedString0);
        semanticsPropertyReceiver0.set(SemanticsProperties.INSTANCE.getText(), list0);
    }

    public static final void setText(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function1 function10) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        AccessibilityAction accessibilityAction0 = new AccessibilityAction(s, function10);
        semanticsPropertyReceiver0.set(SemanticsActions.INSTANCE.getSetText(), accessibilityAction0);
    }

    public static void setText$default(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.setText(semanticsPropertyReceiver0, s, function10);
    }

    public static final void setTextSelectionRange-FDrldGo(SemanticsPropertyReceiver semanticsPropertyReceiver0, long v) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "$this$<set-textSelectionRange>");
        KProperty kProperty0 = SemanticsPropertiesKt.$$delegatedProperties[10];
        TextRange textRange0 = TextRange.box-impl(v);
        SemanticsPropertiesKt.textSelectionRange$delegate.setValue(semanticsPropertyReceiver0, kProperty0, textRange0);
    }

    public static final void setToggleableState(SemanticsPropertyReceiver semanticsPropertyReceiver0, ToggleableState toggleableState0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        Intrinsics.checkNotNullParameter(toggleableState0, "<set-?>");
        SemanticsPropertiesKt.toggleableState$delegate.setValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.$$delegatedProperties[15], toggleableState0);
    }

    public static final void setVerticalScrollAxisRange(SemanticsPropertyReceiver semanticsPropertyReceiver0, ScrollAxisRange scrollAxisRange0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        Intrinsics.checkNotNullParameter(scrollAxisRange0, "<set-?>");
        SemanticsPropertiesKt.verticalScrollAxisRange$delegate.setValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.$$delegatedProperties[6], scrollAxisRange0);
    }

    private static final Object throwSemanticsGetNotSupported() {
        throw new UnsupportedOperationException("You cannot retrieve a semantics property directly - use one of the SemanticsConfiguration.getOr* methods instead");
    }
}

