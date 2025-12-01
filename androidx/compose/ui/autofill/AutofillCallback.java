package androidx.compose.ui.autofill;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager.AutofillCallback;
import androidx.compose.ui.ExperimentalComposeUiApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\bH\u0016J\u0010\u0010\n\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\fH\u0007J\u0010\u0010\r\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\fH\u0007¨\u0006\u000E"}, d2 = {"Landroidx/compose/ui/autofill/AutofillCallback;", "Landroid/view/autofill/AutofillManager$AutofillCallback;", "()V", "onAutofillEvent", "", "view", "Landroid/view/View;", "virtualId", "", "event", "register", "autofill", "Landroidx/compose/ui/autofill/AndroidAutofill;", "unregister", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class AutofillCallback extends AutofillManager.AutofillCallback {
    public static final AutofillCallback INSTANCE;

    static {
        AutofillCallback.INSTANCE = new AutofillCallback();
    }

    @Override  // android.view.autofill.AutofillManager$AutofillCallback
    public void onAutofillEvent(View view0, int v, int v1) {
        String s;
        Intrinsics.checkNotNullParameter(view0, "view");
        super.onAutofillEvent(view0, v, v1);
        switch(v1) {
            case 1: {
                s = "Autofill popup was shown.";
                break;
            }
            case 2: {
                s = "Autofill popup was hidden.";
                break;
            }
            case 3: {
                s = "Autofill popup isn\'t shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account";
                break;
            }
            default: {
                s = "Unknown status event.";
            }
        }
        Log.d("Autofill Status", s);
    }

    @ExperimentalComposeUiApi
    public final void register(AndroidAutofill androidAutofill0) {
        Intrinsics.checkNotNullParameter(androidAutofill0, "autofill");
        androidAutofill0.getAutofillManager().registerCallback(this);
    }

    @ExperimentalComposeUiApi
    public final void unregister(AndroidAutofill androidAutofill0) {
        Intrinsics.checkNotNullParameter(androidAutofill0, "autofill");
        androidAutofill0.getAutofillManager().unregisterCallback(this);
    }
}

