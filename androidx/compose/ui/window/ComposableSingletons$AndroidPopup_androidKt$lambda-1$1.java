package androidx.compose.ui.window;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001A\u00020\u0000H\u000B"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
final class ComposableSingletons.AndroidPopup_androidKt.lambda-1.1 extends Lambda implements Function2 {
    public static final ComposableSingletons.AndroidPopup_androidKt.lambda-1.1 INSTANCE;

    static {
        ComposableSingletons.AndroidPopup_androidKt.lambda-1.1.INSTANCE = new ComposableSingletons.AndroidPopup_androidKt.lambda-1.1();
    }

    ComposableSingletons.AndroidPopup_androidKt.lambda-1.1() {
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public Object invoke(Object object0, Object object1) {
        this.invoke(((Composer)object0), ((Number)object1).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer0, int v) {
        ComposerKt.sourceInformation(composer0, "C:AndroidPopup.android.kt#2oxthz");
        if((v & 11 ^ 2) == 0 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
        }
    }
}

