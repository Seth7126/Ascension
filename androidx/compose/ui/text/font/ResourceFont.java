package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\u0018\u00002\u00020\u0001B&\b\u0000\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\bJ1\u0010\u000F\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001A\u00020\u00132\b\u0010\u0014\u001A\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001A\u00020\u0003H\u0016J\b\u0010\u0017\u001A\u00020\u0018H\u0016R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u001F\u0010\u0006\u001A\u00020\u0007X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\f\u001A\u0004\b\u000B\u0010\nR\u0014\u0010\u0004\u001A\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000E\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/text/font/ResourceFont;", "Landroidx/compose/ui/text/font/Font;", "resId", "", "weight", "Landroidx/compose/ui/text/font/FontWeight;", "style", "Landroidx/compose/ui/text/font/FontStyle;", "(ILandroidx/compose/ui/text/font/FontWeight;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getResId", "()I", "getStyle-_-LCdwA", "I", "getWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "copy", "copy-RetOiIg", "(ILandroidx/compose/ui/text/font/FontWeight;I)Landroidx/compose/ui/text/font/ResourceFont;", "equals", "", "other", "", "hashCode", "toString", "", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class ResourceFont implements Font {
    private final int resId;
    private final int style;
    private final FontWeight weight;

    private ResourceFont(int v, FontWeight fontWeight0, int v1) {
        this.resId = v;
        this.weight = fontWeight0;
        this.style = v1;
    }

    public ResourceFont(int v, FontWeight fontWeight0, int v1, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v2 & 2) != 0) {
            fontWeight0 = FontWeight.Companion.getNormal();
        }
        if((v2 & 4) != 0) {
            v1 = 0;
        }
        this(v, fontWeight0, v1, null);
    }

    public ResourceFont(int v, FontWeight fontWeight0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        this(v, fontWeight0, v1);
    }

    public final ResourceFont copy-RetOiIg(int v, FontWeight fontWeight0, int v1) {
        Intrinsics.checkNotNullParameter(fontWeight0, "weight");
        return new ResourceFont(v, fontWeight0, v1, null);
    }

    public static ResourceFont copy-RetOiIg$default(ResourceFont resourceFont0, int v, FontWeight fontWeight0, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = resourceFont0.resId;
        }
        if((v2 & 2) != 0) {
            fontWeight0 = resourceFont0.getWeight();
        }
        if((v2 & 4) != 0) {
            v1 = resourceFont0.getStyle-_-LCdwA();
        }
        return resourceFont0.copy-RetOiIg(v, fontWeight0, v1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ResourceFont)) {
            return false;
        }
        if(this.resId != ((ResourceFont)object0).resId) {
            return false;
        }
        return Intrinsics.areEqual(this.getWeight(), ((ResourceFont)object0).getWeight()) ? FontStyle.equals-impl0(this.getStyle-_-LCdwA(), ((ResourceFont)object0).getStyle-_-LCdwA()) : false;
    }

    public final int getResId() {
        return this.resId;
    }

    @Override  // androidx.compose.ui.text.font.Font
    public int getStyle-_-LCdwA() {
        return this.style;
    }

    @Override  // androidx.compose.ui.text.font.Font
    public FontWeight getWeight() {
        return this.weight;
    }

    @Override
    public int hashCode() {
        return (this.resId * 0x1F + this.getWeight().hashCode()) * 0x1F + this.getStyle-_-LCdwA();
    }

    @Override
    public String toString() {
        return "ResourceFont(resId=" + this.resId + ", weight=" + this.getWeight() + ", style=" + FontStyle.toString-impl(this.getStyle-_-LCdwA()) + ')';
    }
}

