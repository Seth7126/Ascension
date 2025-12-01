package androidx.compose.ui.text;

import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0007\u0018\u00002\u00020\u0001B \u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006ø\u0001\u0000¢\u0006\u0002\u0010\u0007J1\u0010\u000F\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001A\u00020\u00132\b\u0010\u0014\u001A\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0015\u001A\u00020\u0016H\u0016J\b\u0010\u0017\u001A\u00020\u0018H\u0016R\u001C\u0010\u0004\u001A\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\n\u001A\u0004\b\b\u0010\tR\u001C\u0010\u0005\u001A\u00020\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\r\u001A\u0004\b\u000B\u0010\fR\u001C\u0010\u0002\u001A\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\n\u001A\u0004\b\u000E\u0010\t\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/text/Placeholder;", "", "width", "Landroidx/compose/ui/unit/TextUnit;", "height", "placeholderVerticalAlign", "Landroidx/compose/ui/text/PlaceholderVerticalAlign;", "(JJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getHeight-XSAIIZE", "()J", "J", "getPlaceholderVerticalAlign-J6kI3mc", "()I", "I", "getWidth-XSAIIZE", "copy", "copy-K8Q-__8", "(JJI)Landroidx/compose/ui/text/Placeholder;", "equals", "", "other", "hashCode", "", "toString", "", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class Placeholder {
    private final long height;
    private final int placeholderVerticalAlign;
    private final long width;

    private Placeholder(long v, long v1, int v2) {
        this.width = v;
        this.height = v1;
        this.placeholderVerticalAlign = v2;
        if(!TextUnitKt.isUnspecified--R2X_6o(this.getWidth-XSAIIZE()) == 0) {
            throw new IllegalArgumentException("width cannot be TextUnit.Unspecified");
        }
        if(!TextUnitKt.isUnspecified--R2X_6o(this.getHeight-XSAIIZE()) == 0) {
            throw new IllegalArgumentException("height cannot be TextUnit.Unspecified");
        }
    }

    public Placeholder(long v, long v1, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        this(v, v1, v2);
    }

    public final Placeholder copy-K8Q-__8(long v, long v1, int v2) {
        return new Placeholder(v, v1, v2, null);
    }

    public static Placeholder copy-K8Q-__8$default(Placeholder placeholder0, long v, long v1, int v2, int v3, Object object0) {
        if((v3 & 1) != 0) {
            v = placeholder0.getWidth-XSAIIZE();
        }
        if((v3 & 2) != 0) {
            v1 = placeholder0.getHeight-XSAIIZE();
        }
        if((v3 & 4) != 0) {
            v2 = placeholder0.getPlaceholderVerticalAlign-J6kI3mc();
        }
        return placeholder0.copy-K8Q-__8(v, v1, v2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Placeholder)) {
            return false;
        }
        if(!TextUnit.equals-impl0(this.getWidth-XSAIIZE(), ((Placeholder)object0).getWidth-XSAIIZE())) {
            return false;
        }
        return TextUnit.equals-impl0(this.getHeight-XSAIIZE(), ((Placeholder)object0).getHeight-XSAIIZE()) ? PlaceholderVerticalAlign.equals-impl0(this.getPlaceholderVerticalAlign-J6kI3mc(), ((Placeholder)object0).getPlaceholderVerticalAlign-J6kI3mc()) : false;
    }

    public final long getHeight-XSAIIZE() {
        return this.height;
    }

    public final int getPlaceholderVerticalAlign-J6kI3mc() {
        return this.placeholderVerticalAlign;
    }

    public final long getWidth-XSAIIZE() {
        return this.width;
    }

    @Override
    public int hashCode() {
        return (TextUnit.hashCode-impl(this.getWidth-XSAIIZE()) * 0x1F + TextUnit.hashCode-impl(this.getHeight-XSAIIZE())) * 0x1F + this.getPlaceholderVerticalAlign-J6kI3mc();
    }

    @Override
    public String toString() {
        return "Placeholder(width=" + TextUnit.toString-impl(this.getWidth-XSAIIZE()) + ", height=" + TextUnit.toString-impl(this.getHeight-XSAIIZE()) + ", placeholderVerticalAlign=" + PlaceholderVerticalAlign.toString-impl(this.getPlaceholderVerticalAlign-J6kI3mc()) + ')';
    }
}

