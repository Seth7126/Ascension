package androidx.compose.ui.platform;

import androidx.compose.ui.ExperimentalComposeUiApi;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;

@ExperimentalComposeUiApi
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001A\u00020\u0003H&J\b\u0010\u0004\u001A\u00020\u0003H\u0017J\b\u0010\u0005\u001A\u00020\u0003H&J\b\u0010\u0006\u001A\u00020\u0003H\u0017¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/SoftwareKeyboardController;", "", "hide", "", "hideSoftwareKeyboard", "show", "showSoftwareKeyboard", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface SoftwareKeyboardController {
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public static final class DefaultImpls {
        @Deprecated(message = "Use hide instead.", replaceWith = @ReplaceWith(expression = "hide()", imports = {}))
        public static void hideSoftwareKeyboard(SoftwareKeyboardController softwareKeyboardController0) {
            Intrinsics.checkNotNullParameter(softwareKeyboardController0, "this");
            softwareKeyboardController0.hide();
        }

        @Deprecated(message = "Use show instead.", replaceWith = @ReplaceWith(expression = "show()", imports = {}))
        public static void showSoftwareKeyboard(SoftwareKeyboardController softwareKeyboardController0) {
            Intrinsics.checkNotNullParameter(softwareKeyboardController0, "this");
            softwareKeyboardController0.show();
        }
    }

    void hide();

    @Deprecated(message = "Use hide instead.", replaceWith = @ReplaceWith(expression = "hide()", imports = {}))
    void hideSoftwareKeyboard();

    void show();

    @Deprecated(message = "Use show instead.", replaceWith = @ReplaceWith(expression = "show()", imports = {}))
    void showSoftwareKeyboard();
}

