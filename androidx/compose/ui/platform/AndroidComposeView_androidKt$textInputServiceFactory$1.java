package androidx.compose.ui.platform;

import androidx.compose.ui.text.input.PlatformTextInputService;
import androidx.compose.ui.text.input.TextInputService;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\n"}, d2 = {"Landroidx/compose/ui/text/input/PlatformTextInputService;", "it", "Landroidx/compose/ui/text/input/TextInputService;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
final class AndroidComposeView_androidKt.textInputServiceFactory.1 extends Lambda implements Function1 {
    public static final AndroidComposeView_androidKt.textInputServiceFactory.1 INSTANCE;

    static {
        AndroidComposeView_androidKt.textInputServiceFactory.1.INSTANCE = new AndroidComposeView_androidKt.textInputServiceFactory.1();
    }

    AndroidComposeView_androidKt.textInputServiceFactory.1() {
        super(1);
    }

    public final TextInputService invoke(PlatformTextInputService platformTextInputService0) {
        Intrinsics.checkNotNullParameter(platformTextInputService0, "it");
        return new TextInputService(platformTextInputService0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.invoke(((PlatformTextInputService)object0));
    }
}

