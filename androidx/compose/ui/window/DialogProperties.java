package androidx.compose.ui.window;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.draw.PainterModifier..ExternalSyntheticBackport0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B%\b\u0016\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0006¢\u0006\u0002\u0010\u0007B/\b\u0007\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0006\u0012\b\b\u0002\u0010\b\u001A\u00020\u0003¢\u0006\u0002\u0010\tJ\u0013\u0010\u0010\u001A\u00020\u00032\b\u0010\u0011\u001A\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0012\u001A\u00020\u0013H\u0016R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\u000BR\u0011\u0010\u0005\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u0013\u0010\b\u001A\u00020\u00038\u0007¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u000B¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/window/DialogProperties;", "", "dismissOnBackPress", "", "dismissOnClickOutside", "securePolicy", "Landroidx/compose/ui/window/SecureFlagPolicy;", "(ZZLandroidx/compose/ui/window/SecureFlagPolicy;)V", "usePlatformDefaultWidth", "(ZZLandroidx/compose/ui/window/SecureFlagPolicy;Z)V", "getDismissOnBackPress", "()Z", "getDismissOnClickOutside", "getSecurePolicy", "()Landroidx/compose/ui/window/SecureFlagPolicy;", "getUsePlatformDefaultWidth", "equals", "other", "hashCode", "", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class DialogProperties {
    private final boolean dismissOnBackPress;
    private final boolean dismissOnClickOutside;
    private final SecureFlagPolicy securePolicy;
    private final boolean usePlatformDefaultWidth;

    @ExperimentalComposeUiApi
    public DialogProperties() {
        this(false, false, null, false, 15, null);
    }

    public DialogProperties(boolean z, boolean z1, SecureFlagPolicy secureFlagPolicy0) {
        Intrinsics.checkNotNullParameter(secureFlagPolicy0, "securePolicy");
        this(z, z1, secureFlagPolicy0, true);
    }

    public DialogProperties(boolean z, boolean z1, SecureFlagPolicy secureFlagPolicy0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            z = true;
        }
        if((v & 2) != 0) {
            z1 = true;
        }
        if((v & 4) != 0) {
            secureFlagPolicy0 = SecureFlagPolicy.Inherit;
        }
        this(z, z1, secureFlagPolicy0);
    }

    @ExperimentalComposeUiApi
    public DialogProperties(boolean z, boolean z1, SecureFlagPolicy secureFlagPolicy0, boolean z2) {
        Intrinsics.checkNotNullParameter(secureFlagPolicy0, "securePolicy");
        super();
        this.dismissOnBackPress = z;
        this.dismissOnClickOutside = z1;
        this.securePolicy = secureFlagPolicy0;
        this.usePlatformDefaultWidth = z2;
    }

    public DialogProperties(boolean z, boolean z1, SecureFlagPolicy secureFlagPolicy0, boolean z2, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            z = true;
        }
        if((v & 2) != 0) {
            z1 = true;
        }
        if((v & 4) != 0) {
            secureFlagPolicy0 = SecureFlagPolicy.Inherit;
        }
        if((v & 8) != 0) {
            z2 = true;
        }
        this(z, z1, secureFlagPolicy0, z2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof DialogProperties)) {
            return false;
        }
        if(this.dismissOnBackPress != ((DialogProperties)object0).dismissOnBackPress) {
            return false;
        }
        if(this.dismissOnClickOutside != ((DialogProperties)object0).dismissOnClickOutside) {
            return false;
        }
        return this.securePolicy == ((DialogProperties)object0).securePolicy ? this.usePlatformDefaultWidth == ((DialogProperties)object0).usePlatformDefaultWidth : false;
    }

    public final boolean getDismissOnBackPress() {
        return this.dismissOnBackPress;
    }

    public final boolean getDismissOnClickOutside() {
        return this.dismissOnClickOutside;
    }

    public final SecureFlagPolicy getSecurePolicy() {
        return this.securePolicy;
    }

    @ExperimentalComposeUiApi
    public final boolean getUsePlatformDefaultWidth() {
        return this.usePlatformDefaultWidth;
    }

    @Override
    public int hashCode() {
        return ((PainterModifier..ExternalSyntheticBackport0.m(this.dismissOnBackPress) * 0x1F + PainterModifier..ExternalSyntheticBackport0.m(this.dismissOnClickOutside)) * 0x1F + this.securePolicy.hashCode()) * 0x1F + PainterModifier..ExternalSyntheticBackport0.m(this.usePlatformDefaultWidth);
    }
}

