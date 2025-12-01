package androidx.compose.ui.node;

import android.view.KeyEvent;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.autofill.Autofill;
import androidx.compose.ui.autofill.AutofillTree;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.platform.AccessibilityManager;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.text.font.Font.ResourceLoader;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u00D2\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u0000 s2\u00020\u0001:\u0001sJ\u001D\u0010P\u001A\u00020Q2\u0006\u0010R\u001A\u00020QH&\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bS\u0010TJ\u001D\u0010U\u001A\u00020Q2\u0006\u0010V\u001A\u00020QH&\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bW\u0010TJ*\u0010X\u001A\u00020Y2\u0012\u0010Z\u001A\u000E\u0012\u0004\u0012\u00020\\\u0012\u0004\u0012\u00020]0[2\f\u0010^\u001A\b\u0012\u0004\u0012\u00020]0_H&J\u001F\u0010`\u001A\u0004\u0018\u00010a2\u0006\u0010b\u001A\u00020cH&\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bd\u0010eJ\b\u0010f\u001A\u00020]H&J\u0010\u0010g\u001A\u00020]2\u0006\u0010h\u001A\u00020.H&J\u0010\u0010i\u001A\u00020]2\u0006\u0010h\u001A\u00020.H&J\u0010\u0010j\u001A\u00020]2\u0006\u0010k\u001A\u00020.H&J\u0010\u0010l\u001A\u00020]2\u0006\u0010k\u001A\u00020.H&J\u0010\u0010m\u001A\u00020]2\u0006\u0010k\u001A\u00020.H&J\b\u0010n\u001A\u00020]H&J\b\u0010o\u001A\u000206H&J\u0010\u0010p\u001A\u00020]2\u0006\u0010q\u001A\u00020rH&R\u0012\u0010\u0002\u001A\u00020\u0003X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R\u001C\u0010\u0006\u001A\u0004\u0018\u00010\u00078gX\u00A7\u0004\u00A2\u0006\f\u0012\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000BR\u001A\u0010\f\u001A\u00020\r8gX\u00A7\u0004\u00A2\u0006\f\u0012\u0004\b\u000E\u0010\t\u001A\u0004\b\u000F\u0010\u0010R\u0012\u0010\u0011\u001A\u00020\u0012X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0013\u0010\u0014R\u0012\u0010\u0015\u001A\u00020\u0016X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0017\u0010\u0018R\u0012\u0010\u0019\u001A\u00020\u001AX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u001B\u0010\u001CR\u0012\u0010\u001D\u001A\u00020\u001EX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u001F\u0010 R\u0012\u0010!\u001A\u00020\"X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b#\u0010$R\u0012\u0010%\u001A\u00020&X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\'\u0010(R\u0012\u0010)\u001A\u00020*X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b+\u0010,R\u0012\u0010-\u001A\u00020.X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b/\u00100R\u0012\u00101\u001A\u000202X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b3\u00104R\"\u00107\u001A\u0002062\u0006\u00105\u001A\u000206@gX\u00A6\u000E\u00A2\u0006\f\u001A\u0004\b8\u00109\"\u0004\b:\u0010;R\u0012\u0010<\u001A\u00020=X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b>\u0010?R\u0012\u0010@\u001A\u00020AX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\bB\u0010CR\u0012\u0010D\u001A\u00020EX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\bF\u0010GR\u0012\u0010H\u001A\u00020IX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\bJ\u0010KR\u0012\u0010L\u001A\u00020MX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\bN\u0010O\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006t"}, d2 = {"Landroidx/compose/ui/node/Owner;", "", "accessibilityManager", "Landroidx/compose/ui/platform/AccessibilityManager;", "getAccessibilityManager", "()Landroidx/compose/ui/platform/AccessibilityManager;", "autofill", "Landroidx/compose/ui/autofill/Autofill;", "getAutofill$annotations", "()V", "getAutofill", "()Landroidx/compose/ui/autofill/Autofill;", "autofillTree", "Landroidx/compose/ui/autofill/AutofillTree;", "getAutofillTree$annotations", "getAutofillTree", "()Landroidx/compose/ui/autofill/AutofillTree;", "clipboardManager", "Landroidx/compose/ui/platform/ClipboardManager;", "getClipboardManager", "()Landroidx/compose/ui/platform/ClipboardManager;", "density", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "focusManager", "Landroidx/compose/ui/focus/FocusManager;", "getFocusManager", "()Landroidx/compose/ui/focus/FocusManager;", "fontLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getFontLoader", "()Landroidx/compose/ui/text/font/Font$ResourceLoader;", "hapticFeedBack", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "measureIteration", "", "getMeasureIteration", "()J", "root", "Landroidx/compose/ui/node/LayoutNode;", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "rootForTest", "Landroidx/compose/ui/node/RootForTest;", "getRootForTest", "()Landroidx/compose/ui/node/RootForTest;", "<set-?>", "", "showLayoutBounds", "getShowLayoutBounds", "()Z", "setShowLayoutBounds", "(Z)V", "snapshotObserver", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "textInputService", "Landroidx/compose/ui/text/input/TextInputService;", "getTextInputService", "()Landroidx/compose/ui/text/input/TextInputService;", "textToolbar", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "windowInfo", "Landroidx/compose/ui/platform/WindowInfo;", "getWindowInfo", "()Landroidx/compose/ui/platform/WindowInfo;", "calculateLocalPosition", "Landroidx/compose/ui/geometry/Offset;", "positionInWindow", "calculateLocalPosition-MK-Hz9U", "(J)J", "calculatePositionInWindow", "localPosition", "calculatePositionInWindow-MK-Hz9U", "createLayer", "Landroidx/compose/ui/node/OwnedLayer;", "drawBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "", "invalidateParentLayer", "Lkotlin/Function0;", "getFocusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "keyEvent", "Landroidx/compose/ui/input/key/KeyEvent;", "getFocusDirection-P8AzH3I", "(Landroid/view/KeyEvent;)Landroidx/compose/ui/focus/FocusDirection;", "measureAndLayout", "onAttach", "node", "onDetach", "onLayoutChange", "layoutNode", "onRequestMeasure", "onRequestRelayout", "onSemanticsChange", "requestFocus", "requestRectangleOnScreen", "rect", "Landroidx/compose/ui/geometry/Rect;", "Companion", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface Owner {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001A\u0010\u0003\u001A\u00020\u0004X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/node/Owner$Companion;", "", "()V", "enableExtraAssertions", "", "getEnableExtraAssertions", "()Z", "setEnableExtraAssertions", "(Z)V", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        static final Companion $$INSTANCE;
        private static boolean enableExtraAssertions;

        static {
            Companion.$$INSTANCE = new Companion();
        }

        public final boolean getEnableExtraAssertions() [...] // 潜在的解密器

        public final void setEnableExtraAssertions(boolean z) {
            Companion.enableExtraAssertions = z;
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public static final class DefaultImpls {
        @ExperimentalComposeUiApi
        public static void getAutofill$annotations() {
        }

        @ExperimentalComposeUiApi
        public static void getAutofillTree$annotations() {
        }
    }

    public static final Companion Companion;

    static {
        Owner.Companion = Companion.$$INSTANCE;
    }

    long calculateLocalPosition-MK-Hz9U(long arg1);

    long calculatePositionInWindow-MK-Hz9U(long arg1);

    OwnedLayer createLayer(Function1 arg1, Function0 arg2);

    AccessibilityManager getAccessibilityManager();

    @ExperimentalComposeUiApi
    Autofill getAutofill();

    @ExperimentalComposeUiApi
    AutofillTree getAutofillTree();

    ClipboardManager getClipboardManager();

    Density getDensity();

    FocusDirection getFocusDirection-P8AzH3I(KeyEvent arg1);

    FocusManager getFocusManager();

    ResourceLoader getFontLoader();

    HapticFeedback getHapticFeedBack();

    LayoutDirection getLayoutDirection();

    long getMeasureIteration();

    LayoutNode getRoot();

    RootForTest getRootForTest();

    boolean getShowLayoutBounds();

    OwnerSnapshotObserver getSnapshotObserver();

    TextInputService getTextInputService();

    TextToolbar getTextToolbar();

    ViewConfiguration getViewConfiguration();

    WindowInfo getWindowInfo();

    void measureAndLayout();

    void onAttach(LayoutNode arg1);

    void onDetach(LayoutNode arg1);

    void onLayoutChange(LayoutNode arg1);

    void onRequestMeasure(LayoutNode arg1);

    void onRequestRelayout(LayoutNode arg1);

    void onSemanticsChange();

    boolean requestFocus();

    void requestRectangleOnScreen(Rect arg1);

    @InternalCoreApi
    void setShowLayoutBounds(boolean arg1);
}

