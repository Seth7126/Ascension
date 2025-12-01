package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\r¨\u0006\u000E"}, d2 = {"Landroidx/compose/ui/layout/ModifierInfo;", "", "modifier", "Landroidx/compose/ui/Modifier;", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "extra", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/LayoutCoordinates;Ljava/lang/Object;)V", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "getExtra", "()Ljava/lang/Object;", "getModifier", "()Landroidx/compose/ui/Modifier;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class ModifierInfo {
    public static final int $stable = 8;
    private final LayoutCoordinates coordinates;
    private final Object extra;
    private final Modifier modifier;

    static {
    }

    public ModifierInfo(Modifier modifier0, LayoutCoordinates layoutCoordinates0, Object object0) {
        Intrinsics.checkNotNullParameter(modifier0, "modifier");
        Intrinsics.checkNotNullParameter(layoutCoordinates0, "coordinates");
        super();
        this.modifier = modifier0;
        this.coordinates = layoutCoordinates0;
        this.extra = object0;
    }

    public ModifierInfo(Modifier modifier0, LayoutCoordinates layoutCoordinates0, Object object0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 4) != 0) {
            object0 = null;
        }
        this(modifier0, layoutCoordinates0, object0);
    }

    public final LayoutCoordinates getCoordinates() {
        return this.coordinates;
    }

    public final Object getExtra() {
        return this.extra;
    }

    public final Modifier getModifier() {
        return this.modifier;
    }
}

