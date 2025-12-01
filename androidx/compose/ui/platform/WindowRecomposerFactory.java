package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import androidx.compose.ui.InternalComposeUiApi;
import kotlin.Metadata;

@InternalComposeUiApi
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bç\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/WindowRecomposerFactory;", "", "createRecomposer", "Landroidx/compose/runtime/Recomposer;", "windowRootView", "Landroid/view/View;", "Companion", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface WindowRecomposerFactory {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001A\u00020\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/WindowRecomposerFactory$Companion;", "", "()V", "LifecycleAware", "Landroidx/compose/ui/platform/WindowRecomposerFactory;", "getLifecycleAware", "()Landroidx/compose/ui/platform/WindowRecomposerFactory;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        static final Companion $$INSTANCE;
        private static final WindowRecomposerFactory LifecycleAware;

        static {
            Companion.$$INSTANCE = new Companion();
            Companion.LifecycleAware = WindowRecomposerFactory.Companion.LifecycleAware.1.INSTANCE;
        }

        public final WindowRecomposerFactory getLifecycleAware() {
            return Companion.LifecycleAware;
        }
    }

    public static final Companion Companion;

    static {
        WindowRecomposerFactory.Companion = Companion.$$INSTANCE;
    }

    Recomposer createRecomposer(View arg1);
}

