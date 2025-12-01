package androidx.compose.ui.platform;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.autofill.Autofill;
import androidx.compose.ui.autofill.AutofillTree;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.text.font.Font.ResourceLoader;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u009C\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000E\n\u0000\u001A0\u0010/\u001A\u0002002\u0006\u00101\u001A\u0002022\u0006\u00103\u001A\u00020\'2\u0011\u00104\u001A\r\u0012\u0004\u0012\u00020005\u00A2\u0006\u0002\b6H\u0001\u00A2\u0006\u0002\u00107\u001A\u0010\u00108\u001A\u0002092\u0006\u0010:\u001A\u00020;H\u0002\"\u0019\u0010\u0000\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0003\u0010\u0004\"$\u0010\u0005\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00018GX\u0087\u0004\u00A2\u0006\u000E\n\u0000\u0012\u0004\b\u0007\u0010\b\u001A\u0004\b\t\u0010\u0004\"\"\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u000B0\u00018GX\u0087\u0004\u00A2\u0006\u000E\n\u0000\u0012\u0004\b\f\u0010\b\u001A\u0004\b\r\u0010\u0004\"\u0017\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\u000F0\u0001\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u0004\"\u0017\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u00120\u0001\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u0004\"\u0017\u0010\u0014\u001A\b\u0012\u0004\u0012\u00020\u00150\u0001\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0016\u0010\u0004\"\u0017\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\u00180\u0001\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0019\u0010\u0004\"\u0017\u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\u001B0\u0001\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001C\u0010\u0004\"\u0017\u0010\u001D\u001A\b\u0012\u0004\u0012\u00020\u001E0\u0001\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001F\u0010\u0004\"\u0019\u0010 \u001A\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u0001\u00A2\u0006\b\n\u0000\u001A\u0004\b\"\u0010\u0004\"\u0017\u0010#\u001A\b\u0012\u0004\u0012\u00020$0\u0001\u00A2\u0006\b\n\u0000\u001A\u0004\b%\u0010\u0004\"\u0017\u0010&\u001A\b\u0012\u0004\u0012\u00020\'0\u0001\u00A2\u0006\b\n\u0000\u001A\u0004\b(\u0010\u0004\"\u0017\u0010)\u001A\b\u0012\u0004\u0012\u00020*0\u0001\u00A2\u0006\b\n\u0000\u001A\u0004\b+\u0010\u0004\"\u0017\u0010,\u001A\b\u0012\u0004\u0012\u00020-0\u0001\u00A2\u0006\b\n\u0000\u001A\u0004\b.\u0010\u0004\u00A8\u0006<"}, d2 = {"LocalAccessibilityManager", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/platform/AccessibilityManager;", "getLocalAccessibilityManager", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalAutofill", "Landroidx/compose/ui/autofill/Autofill;", "getLocalAutofill$annotations", "()V", "getLocalAutofill", "LocalAutofillTree", "Landroidx/compose/ui/autofill/AutofillTree;", "getLocalAutofillTree$annotations", "getLocalAutofillTree", "LocalClipboardManager", "Landroidx/compose/ui/platform/ClipboardManager;", "getLocalClipboardManager", "LocalDensity", "Landroidx/compose/ui/unit/Density;", "getLocalDensity", "LocalFocusManager", "Landroidx/compose/ui/focus/FocusManager;", "getLocalFocusManager", "LocalFontLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getLocalFontLoader", "LocalHapticFeedback", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getLocalHapticFeedback", "LocalLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLocalLayoutDirection", "LocalTextInputService", "Landroidx/compose/ui/text/input/TextInputService;", "getLocalTextInputService", "LocalTextToolbar", "Landroidx/compose/ui/platform/TextToolbar;", "getLocalTextToolbar", "LocalUriHandler", "Landroidx/compose/ui/platform/UriHandler;", "getLocalUriHandler", "LocalViewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getLocalViewConfiguration", "LocalWindowInfo", "Landroidx/compose/ui/platform/WindowInfo;", "getLocalWindowInfo", "ProvideCommonCompositionLocals", "", "owner", "Landroidx/compose/ui/node/Owner;", "uriHandler", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/node/Owner;Landroidx/compose/ui/platform/UriHandler;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "noLocalProvidedFor", "", "name", "", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class CompositionLocalsKt {
    private static final ProvidableCompositionLocal LocalAccessibilityManager;
    private static final ProvidableCompositionLocal LocalAutofill;
    private static final ProvidableCompositionLocal LocalAutofillTree;
    private static final ProvidableCompositionLocal LocalClipboardManager;
    private static final ProvidableCompositionLocal LocalDensity;
    private static final ProvidableCompositionLocal LocalFocusManager;
    private static final ProvidableCompositionLocal LocalFontLoader;
    private static final ProvidableCompositionLocal LocalHapticFeedback;
    private static final ProvidableCompositionLocal LocalLayoutDirection;
    private static final ProvidableCompositionLocal LocalTextInputService;
    private static final ProvidableCompositionLocal LocalTextToolbar;
    private static final ProvidableCompositionLocal LocalUriHandler;
    private static final ProvidableCompositionLocal LocalViewConfiguration;
    private static final ProvidableCompositionLocal LocalWindowInfo;

    static {
        CompositionLocalsKt.LocalAccessibilityManager = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt.LocalAccessibilityManager.1.INSTANCE);
        CompositionLocalsKt.LocalAutofill = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt.LocalAutofill.1.INSTANCE);
        CompositionLocalsKt.LocalAutofillTree = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt.LocalAutofillTree.1.INSTANCE);
        CompositionLocalsKt.LocalClipboardManager = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt.LocalClipboardManager.1.INSTANCE);
        CompositionLocalsKt.LocalDensity = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt.LocalDensity.1.INSTANCE);
        CompositionLocalsKt.LocalFocusManager = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt.LocalFocusManager.1.INSTANCE);
        CompositionLocalsKt.LocalFontLoader = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt.LocalFontLoader.1.INSTANCE);
        CompositionLocalsKt.LocalHapticFeedback = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt.LocalHapticFeedback.1.INSTANCE);
        CompositionLocalsKt.LocalLayoutDirection = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt.LocalLayoutDirection.1.INSTANCE);
        CompositionLocalsKt.LocalTextInputService = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt.LocalTextInputService.1.INSTANCE);
        CompositionLocalsKt.LocalTextToolbar = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt.LocalTextToolbar.1.INSTANCE);
        CompositionLocalsKt.LocalUriHandler = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt.LocalUriHandler.1.INSTANCE);
        CompositionLocalsKt.LocalViewConfiguration = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt.LocalViewConfiguration.1.INSTANCE);
        CompositionLocalsKt.LocalWindowInfo = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt.LocalWindowInfo.1.INSTANCE);
    }

    @ExperimentalComposeUiApi
    public static final void ProvideCommonCompositionLocals(Owner owner0, UriHandler uriHandler0, Function2 function20, Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(owner0, "owner");
        Intrinsics.checkNotNullParameter(uriHandler0, "uriHandler");
        Intrinsics.checkNotNullParameter(function20, "content");
        Composer composer1 = composer0.startRestartGroup(0x5B0D6DBD);
        ComposerKt.sourceInformation(composer1, "C(ProvideCommonCompositionLocals)P(1,2)147@4867L841:CompositionLocals.kt#itgzvw");
        int v1 = (v & 14) == 0 ? (composer1.changed(owner0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(uriHandler0) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changed(function20) ? 0x100 : 0x80);
        }
        if((v1 & 731 ^ 0x92) != 0 || !composer1.getSkipping()) {
            ProvidedValue[] arr_providedValue = new ProvidedValue[14];
            AccessibilityManager accessibilityManager0 = owner0.getAccessibilityManager();
            arr_providedValue[0] = CompositionLocalsKt.LocalAccessibilityManager.provides(accessibilityManager0);
            Autofill autofill0 = owner0.getAutofill();
            arr_providedValue[1] = CompositionLocalsKt.LocalAutofill.provides(autofill0);
            AutofillTree autofillTree0 = owner0.getAutofillTree();
            arr_providedValue[2] = CompositionLocalsKt.LocalAutofillTree.provides(autofillTree0);
            ClipboardManager clipboardManager0 = owner0.getClipboardManager();
            arr_providedValue[3] = CompositionLocalsKt.LocalClipboardManager.provides(clipboardManager0);
            Density density0 = owner0.getDensity();
            arr_providedValue[4] = CompositionLocalsKt.LocalDensity.provides(density0);
            FocusManager focusManager0 = owner0.getFocusManager();
            arr_providedValue[5] = CompositionLocalsKt.LocalFocusManager.provides(focusManager0);
            ResourceLoader font$ResourceLoader0 = owner0.getFontLoader();
            arr_providedValue[6] = CompositionLocalsKt.LocalFontLoader.provides(font$ResourceLoader0);
            HapticFeedback hapticFeedback0 = owner0.getHapticFeedBack();
            arr_providedValue[7] = CompositionLocalsKt.LocalHapticFeedback.provides(hapticFeedback0);
            LayoutDirection layoutDirection0 = owner0.getLayoutDirection();
            arr_providedValue[8] = CompositionLocalsKt.LocalLayoutDirection.provides(layoutDirection0);
            TextInputService textInputService0 = owner0.getTextInputService();
            arr_providedValue[9] = CompositionLocalsKt.LocalTextInputService.provides(textInputService0);
            TextToolbar textToolbar0 = owner0.getTextToolbar();
            arr_providedValue[10] = CompositionLocalsKt.LocalTextToolbar.provides(textToolbar0);
            arr_providedValue[11] = CompositionLocalsKt.LocalUriHandler.provides(uriHandler0);
            ViewConfiguration viewConfiguration0 = owner0.getViewConfiguration();
            arr_providedValue[12] = CompositionLocalsKt.LocalViewConfiguration.provides(viewConfiguration0);
            WindowInfo windowInfo0 = owner0.getWindowInfo();
            arr_providedValue[13] = CompositionLocalsKt.LocalWindowInfo.provides(windowInfo0);
            CompositionLocalKt.CompositionLocalProvider(arr_providedValue, function20, composer1, v1 >> 3 & 0x70 | 8);
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new Function2(owner0, uriHandler0, function20, v) {
                final int $$changed;
                final Function2 $content;
                final Owner $owner;
                final UriHandler $uriHandler;

                {
                    this.$owner = owner0;
                    this.$uriHandler = uriHandler0;
                    this.$content = function20;
                    this.$$changed = v;
                    super(2);
                }

                @Override  // kotlin.jvm.functions.Function2
                public Object invoke(Object object0, Object object1) {
                    this.invoke(((Composer)object0), ((Number)object1).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer0, int v) {
                    CompositionLocalsKt.ProvideCommonCompositionLocals(this.$owner, this.$uriHandler, this.$content, composer0, this.$$changed | 1);
                }
            });
        }
    }

    public static final ProvidableCompositionLocal getLocalAccessibilityManager() {
        return CompositionLocalsKt.LocalAccessibilityManager;
    }

    @ExperimentalComposeUiApi
    public static final ProvidableCompositionLocal getLocalAutofill() {
        return CompositionLocalsKt.LocalAutofill;
    }

    @ExperimentalComposeUiApi
    public static void getLocalAutofill$annotations() {
    }

    @ExperimentalComposeUiApi
    public static final ProvidableCompositionLocal getLocalAutofillTree() {
        return CompositionLocalsKt.LocalAutofillTree;
    }

    @ExperimentalComposeUiApi
    public static void getLocalAutofillTree$annotations() {
    }

    public static final ProvidableCompositionLocal getLocalClipboardManager() {
        return CompositionLocalsKt.LocalClipboardManager;
    }

    public static final ProvidableCompositionLocal getLocalDensity() {
        return CompositionLocalsKt.LocalDensity;
    }

    public static final ProvidableCompositionLocal getLocalFocusManager() {
        return CompositionLocalsKt.LocalFocusManager;
    }

    public static final ProvidableCompositionLocal getLocalFontLoader() {
        return CompositionLocalsKt.LocalFontLoader;
    }

    public static final ProvidableCompositionLocal getLocalHapticFeedback() {
        return CompositionLocalsKt.LocalHapticFeedback;
    }

    public static final ProvidableCompositionLocal getLocalLayoutDirection() {
        return CompositionLocalsKt.LocalLayoutDirection;
    }

    public static final ProvidableCompositionLocal getLocalTextInputService() {
        return CompositionLocalsKt.LocalTextInputService;
    }

    public static final ProvidableCompositionLocal getLocalTextToolbar() {
        return CompositionLocalsKt.LocalTextToolbar;
    }

    public static final ProvidableCompositionLocal getLocalUriHandler() {
        return CompositionLocalsKt.LocalUriHandler;
    }

    public static final ProvidableCompositionLocal getLocalViewConfiguration() {
        return CompositionLocalsKt.LocalViewConfiguration;
    }

    public static final ProvidableCompositionLocal getLocalWindowInfo() {
        return CompositionLocalsKt.LocalWindowInfo;
    }

    private static final Void noLocalProvidedFor(String s) {
        throw new IllegalStateException(("CompositionLocal " + s + " not present").toString());
    }
}

