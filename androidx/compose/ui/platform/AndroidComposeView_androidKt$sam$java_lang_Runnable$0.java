package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
final class AndroidComposeView_androidKt.sam.java_lang_Runnable.0 implements Runnable {
    private final Function0 function;

    AndroidComposeView_androidKt.sam.java_lang_Runnable.0(Function0 function00) {
        this.function = function00;
    }

    @Override
    public final void run() {
        this.function.invoke();
    }
}

