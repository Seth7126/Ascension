package androidx.compose.ui.viewinterop;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001A\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
final class AndroidView_androidKt.NoOpUpdate.1 extends Lambda implements Function1 {
    public static final AndroidView_androidKt.NoOpUpdate.1 INSTANCE;

    static {
        AndroidView_androidKt.NoOpUpdate.1.INSTANCE = new AndroidView_androidKt.NoOpUpdate.1();
    }

    AndroidView_androidKt.NoOpUpdate.1() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        this.invoke(((View)object0));
        return Unit.INSTANCE;
    }

    public final void invoke(View view0) {
        Intrinsics.checkNotNullParameter(view0, "$this$null");
    }
}

