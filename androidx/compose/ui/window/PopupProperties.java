package androidx.compose.ui.window;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.draw.PainterModifier..ExternalSyntheticBackport0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001BC\b\u0016\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0007\u0012\b\b\u0002\u0010\b\u001A\u00020\u0003\u0012\b\b\u0002\u0010\t\u001A\u00020\u0003¢\u0006\u0002\u0010\nBM\b\u0007\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0007\u0012\b\b\u0002\u0010\b\u001A\u00020\u0003\u0012\b\b\u0002\u0010\t\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u000B\u001A\u00020\u0003¢\u0006\u0002\u0010\fJ\u0013\u0010\u0016\u001A\u00020\u00032\b\u0010\u0017\u001A\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0018\u001A\u00020\u0019H\u0016R\u0011\u0010\t\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u000ER\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u000ER\u0011\u0010\b\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u000ER\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\u000ER\u0011\u0010\u0006\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u0014R\u0013\u0010\u000B\u001A\u00020\u00038\u0007¢\u0006\b\n\u0000\u001A\u0004\b\u0015\u0010\u000E¨\u0006\u001A"}, d2 = {"Landroidx/compose/ui/window/PopupProperties;", "", "focusable", "", "dismissOnBackPress", "dismissOnClickOutside", "securePolicy", "Landroidx/compose/ui/window/SecureFlagPolicy;", "excludeFromSystemGesture", "clippingEnabled", "(ZZZLandroidx/compose/ui/window/SecureFlagPolicy;ZZ)V", "usePlatformDefaultWidth", "(ZZZLandroidx/compose/ui/window/SecureFlagPolicy;ZZZ)V", "getClippingEnabled", "()Z", "getDismissOnBackPress", "getDismissOnClickOutside", "getExcludeFromSystemGesture", "getFocusable", "getSecurePolicy", "()Landroidx/compose/ui/window/SecureFlagPolicy;", "getUsePlatformDefaultWidth", "equals", "other", "hashCode", "", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class PopupProperties {
    private final boolean clippingEnabled;
    private final boolean dismissOnBackPress;
    private final boolean dismissOnClickOutside;
    private final boolean excludeFromSystemGesture;
    private final boolean focusable;
    private final SecureFlagPolicy securePolicy;
    private final boolean usePlatformDefaultWidth;

    @ExperimentalComposeUiApi
    public PopupProperties() {
        this(false, false, false, null, false, false, false, 0x7F, null);
    }

    public PopupProperties(boolean z, boolean z1, boolean z2, SecureFlagPolicy secureFlagPolicy0, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(secureFlagPolicy0, "securePolicy");
        this(z, z1, z2, secureFlagPolicy0, z3, z4, false);
    }

    public PopupProperties(boolean z, boolean z1, boolean z2, SecureFlagPolicy secureFlagPolicy0, boolean z3, boolean z4, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            z = false;
        }
        boolean z5 = true;
        if((v & 8) != 0) {
            secureFlagPolicy0 = SecureFlagPolicy.Inherit;
        }
        if((v & 0x20) == 0) {
            z5 = z4;
        }
        this(z, ((v & 2) == 0 ? z1 : true), ((v & 4) == 0 ? z2 : true), secureFlagPolicy0, ((v & 16) == 0 ? z3 : true), z5);
    }

    @ExperimentalComposeUiApi
    public PopupProperties(boolean z, boolean z1, boolean z2, SecureFlagPolicy secureFlagPolicy0, boolean z3, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(secureFlagPolicy0, "securePolicy");
        super();
        this.focusable = z;
        this.dismissOnBackPress = z1;
        this.dismissOnClickOutside = z2;
        this.securePolicy = secureFlagPolicy0;
        this.excludeFromSystemGesture = z3;
        this.clippingEnabled = z4;
        this.usePlatformDefaultWidth = z5;
    }

    public PopupProperties(boolean z, boolean z1, boolean z2, SecureFlagPolicy secureFlagPolicy0, boolean z3, boolean z4, boolean z5, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        boolean z6 = true;
        if((v & 8) != 0) {
            secureFlagPolicy0 = SecureFlagPolicy.Inherit;
        }
        if((v & 0x20) == 0) {
            z6 = z4;
        }
        this(((v & 1) == 0 ? z : false), ((v & 2) == 0 ? z1 : true), ((v & 4) == 0 ? z2 : true), secureFlagPolicy0, ((v & 16) == 0 ? z3 : true), z6, ((v & 0x40) == 0 ? z5 : false));
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof PopupProperties)) {
            return false;
        }
        if(this.focusable != ((PopupProperties)object0).focusable) {
            return false;
        }
        if(this.dismissOnBackPress != ((PopupProperties)object0).dismissOnBackPress) {
            return false;
        }
        if(this.dismissOnClickOutside != ((PopupProperties)object0).dismissOnClickOutside) {
            return false;
        }
        if(this.securePolicy != ((PopupProperties)object0).securePolicy) {
            return false;
        }
        if(this.excludeFromSystemGesture != ((PopupProperties)object0).excludeFromSystemGesture) {
            return false;
        }
        return this.clippingEnabled == ((PopupProperties)object0).clippingEnabled ? this.usePlatformDefaultWidth == ((PopupProperties)object0).usePlatformDefaultWidth : false;
    }

    public final boolean getClippingEnabled() {
        return this.clippingEnabled;
    }

    public final boolean getDismissOnBackPress() {
        return this.dismissOnBackPress;
    }

    public final boolean getDismissOnClickOutside() {
        return this.dismissOnClickOutside;
    }

    public final boolean getExcludeFromSystemGesture() {
        return this.excludeFromSystemGesture;
    }

    public final boolean getFocusable() {
        return this.focusable;
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
        return ((((((PainterModifier..ExternalSyntheticBackport0.m(this.dismissOnBackPress) * 0x1F + PainterModifier..ExternalSyntheticBackport0.m(this.focusable)) * 0x1F + PainterModifier..ExternalSyntheticBackport0.m(this.dismissOnBackPress)) * 0x1F + PainterModifier..ExternalSyntheticBackport0.m(this.dismissOnClickOutside)) * 0x1F + this.securePolicy.hashCode()) * 0x1F + PainterModifier..ExternalSyntheticBackport0.m(this.excludeFromSystemGesture)) * 0x1F + PainterModifier..ExternalSyntheticBackport0.m(this.clippingEnabled)) * 0x1F + PainterModifier..ExternalSyntheticBackport0.m(this.usePlatformDefaultWidth);
    }
}

