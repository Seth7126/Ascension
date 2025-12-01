package androidx.compose.ui.platform;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001A\u00020\u0000H\n"}, d2 = {"Landroidx/compose/ui/platform/ViewConfiguration;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
final class CompositionLocalsKt.LocalViewConfiguration.1 extends Lambda implements Function0 {
    public static final CompositionLocalsKt.LocalViewConfiguration.1 INSTANCE;

    static {
        CompositionLocalsKt.LocalViewConfiguration.1.INSTANCE = new CompositionLocalsKt.LocalViewConfiguration.1();
    }

    CompositionLocalsKt.LocalViewConfiguration.1() {
        super(0);
    }

    public final ViewConfiguration invoke() {
        CompositionLocalsKt.noLocalProvidedFor("LocalViewConfiguration");
        throw new KotlinNothingValueException();
    }

    @Override  // kotlin.jvm.functions.Function0
    public Object invoke() {
        return this.invoke();
    }
}

