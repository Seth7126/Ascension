package androidx.compose.ui.input.key;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0016\u0012\n\u0010\u0002\u001A\u00060\u0003j\u0002`\u0004ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001A\u0010\t\u001A\u00020\n2\b\u0010\u000B\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000E\u001A\u00020\u000FHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001A\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0002\u001A\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\b\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/input/key/KeyEvent;", "", "nativeKeyEvent", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "constructor-impl", "(Landroid/view/KeyEvent;)Landroid/view/KeyEvent;", "getNativeKeyEvent", "()Landroid/view/KeyEvent;", "equals", "", "other", "equals-impl", "(Landroid/view/KeyEvent;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Landroid/view/KeyEvent;)I", "toString", "", "toString-impl", "(Landroid/view/KeyEvent;)Ljava/lang/String;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
@JvmInline
public final class KeyEvent {
    private final android.view.KeyEvent nativeKeyEvent;

    private KeyEvent(android.view.KeyEvent keyEvent0) {
        this.nativeKeyEvent = keyEvent0;
    }

    public static final KeyEvent box-impl(android.view.KeyEvent keyEvent0) {
        return new KeyEvent(keyEvent0);
    }

    public static android.view.KeyEvent constructor-impl(android.view.KeyEvent keyEvent0) {
        Intrinsics.checkNotNullParameter(keyEvent0, "nativeKeyEvent");
        return keyEvent0;
    }

    @Override
    public boolean equals(Object object0) {
        return KeyEvent.equals-impl(this.unbox-impl(), object0);
    }

    // 去混淆评级： 低(20)
    public static boolean equals-impl(android.view.KeyEvent keyEvent0, Object object0) {
        return object0 instanceof KeyEvent ? Intrinsics.areEqual(keyEvent0, ((KeyEvent)object0).unbox-impl()) : false;
    }

    public static final boolean equals-impl0(android.view.KeyEvent keyEvent0, android.view.KeyEvent keyEvent1) {
        return Intrinsics.areEqual(keyEvent0, keyEvent1);
    }

    public final android.view.KeyEvent getNativeKeyEvent() {
        return this.unbox-impl();
    }

    @Override
    public int hashCode() {
        return KeyEvent.hashCode-impl(this.unbox-impl());
    }

    public static int hashCode-impl(android.view.KeyEvent keyEvent0) {
        return keyEvent0.hashCode();
    }

    @Override
    public String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.unbox-impl() + ')';
    }

    public static String toString-impl(android.view.KeyEvent keyEvent0) [...] // Inlined contents

    public final android.view.KeyEvent unbox-impl() {
        return this.nativeKeyEvent;
    }
}

