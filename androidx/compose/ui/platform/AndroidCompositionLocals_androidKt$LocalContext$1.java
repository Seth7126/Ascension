package androidx.compose.ui.platform;

import android.content.Context;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001A\u00020\u0000H\n"}, d2 = {"Landroid/content/Context;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
final class AndroidCompositionLocals_androidKt.LocalContext.1 extends Lambda implements Function0 {
    public static final AndroidCompositionLocals_androidKt.LocalContext.1 INSTANCE;

    static {
        AndroidCompositionLocals_androidKt.LocalContext.1.INSTANCE = new AndroidCompositionLocals_androidKt.LocalContext.1();
    }

    AndroidCompositionLocals_androidKt.LocalContext.1() {
        super(0);
    }

    public final Context invoke() {
        AndroidCompositionLocals_androidKt.noLocalProvidedFor("LocalContext");
        throw new KotlinNothingValueException();
    }

    @Override  // kotlin.jvm.functions.Function0
    public Object invoke() {
        return this.invoke();
    }
}

