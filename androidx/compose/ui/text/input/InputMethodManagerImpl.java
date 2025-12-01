package androidx.compose.ui.text.input;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.ExtractedText;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u000B\u001A\u00020\f2\b\u0010\r\u001A\u0004\u0018\u00010\u000EH\u0016J\u0010\u0010\u000F\u001A\u00020\f2\u0006\u0010\u0010\u001A\u00020\u0011H\u0016J\u0010\u0010\u0012\u001A\u00020\f2\u0006\u0010\u0010\u001A\u00020\u0011H\u0016J \u0010\u0013\u001A\u00020\f2\u0006\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0014\u001A\u00020\u00152\u0006\u0010\u0016\u001A\u00020\u0017H\u0016J0\u0010\u0018\u001A\u00020\f2\u0006\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0019\u001A\u00020\u00152\u0006\u0010\u001A\u001A\u00020\u00152\u0006\u0010\u001B\u001A\u00020\u00152\u0006\u0010\u001C\u001A\u00020\u0015H\u0016R\u001B\u0010\u0005\u001A\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u0007\u0010\b¨\u0006\u001D"}, d2 = {"Landroidx/compose/ui/text/input/InputMethodManagerImpl;", "Landroidx/compose/ui/text/input/InputMethodManager;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "imm", "Landroid/view/inputmethod/InputMethodManager;", "getImm", "()Landroid/view/inputmethod/InputMethodManager;", "imm$delegate", "Lkotlin/Lazy;", "hideSoftInputFromWindow", "", "windowToken", "Landroid/os/IBinder;", "restartInput", "view", "Landroid/view/View;", "showSoftInput", "updateExtractedText", "token", "", "extractedText", "Landroid/view/inputmethod/ExtractedText;", "updateSelection", "selectionStart", "selectionEnd", "compositionStart", "compositionEnd", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class InputMethodManagerImpl implements InputMethodManager {
    private final Lazy imm$delegate;

    static {
    }

    public InputMethodManagerImpl(Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super();
        Function0 function00 = new Function0() {
            final Context $context;

            {
                this.$context = context0;
                super(0);
            }

            public final android.view.inputmethod.InputMethodManager invoke() {
                Object object0 = this.$context.getSystemService("input_method");
                if(object0 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                }
                return (android.view.inputmethod.InputMethodManager)object0;
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        };
        this.imm$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, function00);
    }

    private final android.view.inputmethod.InputMethodManager getImm() {
        return (android.view.inputmethod.InputMethodManager)this.imm$delegate.getValue();
    }

    @Override  // androidx.compose.ui.text.input.InputMethodManager
    public void hideSoftInputFromWindow(IBinder iBinder0) {
        this.getImm().hideSoftInputFromWindow(iBinder0, 0);
    }

    @Override  // androidx.compose.ui.text.input.InputMethodManager
    public void restartInput(View view0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        this.getImm().restartInput(view0);
    }

    @Override  // androidx.compose.ui.text.input.InputMethodManager
    public void showSoftInput(View view0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        this.getImm().showSoftInput(view0, 0);
    }

    @Override  // androidx.compose.ui.text.input.InputMethodManager
    public void updateExtractedText(View view0, int v, ExtractedText extractedText0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        Intrinsics.checkNotNullParameter(extractedText0, "extractedText");
        this.getImm().updateExtractedText(view0, v, extractedText0);
    }

    @Override  // androidx.compose.ui.text.input.InputMethodManager
    public void updateSelection(View view0, int v, int v1, int v2, int v3) {
        Intrinsics.checkNotNullParameter(view0, "view");
        this.getImm().updateSelection(view0, v, v1, v2, v3);
    }
}

