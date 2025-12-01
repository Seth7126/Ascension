package androidx.compose.ui.text;

import androidx.compose.ui.draw.PainterModifier..ExternalSyntheticBackport0;
import androidx.compose.ui.text.font.Font.ResourceLoader;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001D\n\u0002\u0010\u000E\n\u0000\u0018\u00002\u00020\u0001Bd\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0012\u0010\u0006\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007\u0012\u0006\u0010\n\u001A\u00020\u000B\u0012\u0006\u0010\f\u001A\u00020\r\u0012\u0006\u0010\u000E\u001A\u00020\u000F\u0012\u0006\u0010\u0010\u001A\u00020\u0011\u0012\u0006\u0010\u0012\u001A\u00020\u0013\u0012\u0006\u0010\u0014\u001A\u00020\u0015\u0012\u0006\u0010\u0016\u001A\u00020\u0017\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010\u0018J\u0083\u0001\u0010.\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\u0014\b\u0002\u0010\u0006\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\b\u0002\u0010\n\u001A\u00020\u000B2\b\b\u0002\u0010\f\u001A\u00020\r2\b\b\u0002\u0010\u000E\u001A\u00020\u000F2\b\b\u0002\u0010\u0010\u001A\u00020\u00112\b\b\u0002\u0010\u0012\u001A\u00020\u00132\b\b\u0002\u0010\u0014\u001A\u00020\u00152\b\b\u0002\u0010\u0016\u001A\u00020\u0017\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b/\u00100J\u0013\u00101\u001A\u00020\r2\b\u00102\u001A\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u00103\u001A\u00020\u000BH\u0016J\b\u00104\u001A\u000205H\u0016R\u001C\u0010\u0016\u001A\u00020\u0017\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u001B\u001A\u0004\b\u0019\u0010\u001AR\u0011\u0010\u0010\u001A\u00020\u0011\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001C\u0010\u001DR\u0011\u0010\u0012\u001A\u00020\u0013\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001E\u0010\u001FR\u0011\u0010\n\u001A\u00020\u000B\u00A2\u0006\b\n\u0000\u001A\u0004\b \u0010!R\u001C\u0010\u000E\u001A\u00020\u000F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010#\u001A\u0004\b\"\u0010!R\u001D\u0010\u0006\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007\u00A2\u0006\b\n\u0000\u001A\u0004\b$\u0010%R\u0011\u0010\u0014\u001A\u00020\u0015\u00A2\u0006\b\n\u0000\u001A\u0004\b&\u0010\'R\u0011\u0010\f\u001A\u00020\r\u00A2\u0006\b\n\u0000\u001A\u0004\b(\u0010)R\u0011\u0010\u0004\u001A\u00020\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b*\u0010+R\u0011\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b,\u0010-\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u00066"}, d2 = {"Landroidx/compose/ui/text/TextLayoutInput;", "", "text", "Landroidx/compose/ui/text/AnnotatedString;", "style", "Landroidx/compose/ui/text/TextStyle;", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "maxLines", "", "softWrap", "", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "density", "Landroidx/compose/ui/unit/Density;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "resourceLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IZILandroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/font/Font$ResourceLoader;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getConstraints-msEJaDk", "()J", "J", "getDensity", "()Landroidx/compose/ui/unit/Density;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "getMaxLines", "()I", "getOverflow-gIe3tQ8", "I", "getPlaceholders", "()Ljava/util/List;", "getResourceLoader", "()Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getSoftWrap", "()Z", "getStyle", "()Landroidx/compose/ui/text/TextStyle;", "getText", "()Landroidx/compose/ui/text/AnnotatedString;", "copy", "copy-hu-1Yfo", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IZILandroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/font/Font$ResourceLoader;J)Landroidx/compose/ui/text/TextLayoutInput;", "equals", "other", "hashCode", "toString", "", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class TextLayoutInput {
    private final long constraints;
    private final Density density;
    private final LayoutDirection layoutDirection;
    private final int maxLines;
    private final int overflow;
    private final List placeholders;
    private final ResourceLoader resourceLoader;
    private final boolean softWrap;
    private final TextStyle style;
    private final AnnotatedString text;

    private TextLayoutInput(AnnotatedString annotatedString0, TextStyle textStyle0, List list0, int v, boolean z, int v1, Density density0, LayoutDirection layoutDirection0, ResourceLoader font$ResourceLoader0, long v2) {
        this.text = annotatedString0;
        this.style = textStyle0;
        this.placeholders = list0;
        this.maxLines = v;
        this.softWrap = z;
        this.overflow = v1;
        this.density = density0;
        this.layoutDirection = layoutDirection0;
        this.resourceLoader = font$ResourceLoader0;
        this.constraints = v2;
    }

    public TextLayoutInput(AnnotatedString annotatedString0, TextStyle textStyle0, List list0, int v, boolean z, int v1, Density density0, LayoutDirection layoutDirection0, ResourceLoader font$ResourceLoader0, long v2, DefaultConstructorMarker defaultConstructorMarker0) {
        this(annotatedString0, textStyle0, list0, v, z, v1, density0, layoutDirection0, font$ResourceLoader0, v2);
    }

    public final TextLayoutInput copy-hu-1Yfo(AnnotatedString annotatedString0, TextStyle textStyle0, List list0, int v, boolean z, int v1, Density density0, LayoutDirection layoutDirection0, ResourceLoader font$ResourceLoader0, long v2) {
        Intrinsics.checkNotNullParameter(annotatedString0, "text");
        Intrinsics.checkNotNullParameter(textStyle0, "style");
        Intrinsics.checkNotNullParameter(list0, "placeholders");
        Intrinsics.checkNotNullParameter(density0, "density");
        Intrinsics.checkNotNullParameter(layoutDirection0, "layoutDirection");
        Intrinsics.checkNotNullParameter(font$ResourceLoader0, "resourceLoader");
        return new TextLayoutInput(annotatedString0, textStyle0, list0, v, z, v1, density0, layoutDirection0, font$ResourceLoader0, v2, null);
    }

    public static TextLayoutInput copy-hu-1Yfo$default(TextLayoutInput textLayoutInput0, AnnotatedString annotatedString0, TextStyle textStyle0, List list0, int v, boolean z, int v1, Density density0, LayoutDirection layoutDirection0, ResourceLoader font$ResourceLoader0, long v2, int v3, Object object0) {
        AnnotatedString annotatedString1 = (v3 & 1) == 0 ? annotatedString0 : textLayoutInput0.text;
        TextStyle textStyle1 = (v3 & 2) == 0 ? textStyle0 : textLayoutInput0.style;
        List list1 = (v3 & 4) == 0 ? list0 : textLayoutInput0.placeholders;
        int v4 = (v3 & 8) == 0 ? v : textLayoutInput0.maxLines;
        boolean z1 = (v3 & 16) == 0 ? z : textLayoutInput0.softWrap;
        int v5 = (v3 & 0x20) == 0 ? v1 : textLayoutInput0.getOverflow-gIe3tQ8();
        Density density1 = (v3 & 0x40) == 0 ? density0 : textLayoutInput0.density;
        LayoutDirection layoutDirection1 = (v3 & 0x80) == 0 ? layoutDirection0 : textLayoutInput0.layoutDirection;
        ResourceLoader font$ResourceLoader1 = (v3 & 0x100) == 0 ? font$ResourceLoader0 : textLayoutInput0.resourceLoader;
        return (v3 & 0x200) == 0 ? textLayoutInput0.copy-hu-1Yfo(annotatedString1, textStyle1, list1, v4, z1, v5, density1, layoutDirection1, font$ResourceLoader1, v2) : textLayoutInput0.copy-hu-1Yfo(annotatedString1, textStyle1, list1, v4, z1, v5, density1, layoutDirection1, font$ResourceLoader1, textLayoutInput0.getConstraints-msEJaDk());
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof TextLayoutInput)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.text, ((TextLayoutInput)object0).text)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.style, ((TextLayoutInput)object0).style)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.placeholders, ((TextLayoutInput)object0).placeholders)) {
            return false;
        }
        if(this.maxLines != ((TextLayoutInput)object0).maxLines) {
            return false;
        }
        if(this.softWrap != ((TextLayoutInput)object0).softWrap) {
            return false;
        }
        if(!TextOverflow.equals-impl0(this.getOverflow-gIe3tQ8(), ((TextLayoutInput)object0).getOverflow-gIe3tQ8())) {
            return false;
        }
        if(!Intrinsics.areEqual(this.density, ((TextLayoutInput)object0).density)) {
            return false;
        }
        if(this.layoutDirection != ((TextLayoutInput)object0).layoutDirection) {
            return false;
        }
        return Intrinsics.areEqual(this.resourceLoader, ((TextLayoutInput)object0).resourceLoader) ? Constraints.equals-impl0(this.getConstraints-msEJaDk(), ((TextLayoutInput)object0).getConstraints-msEJaDk()) : false;
    }

    public final long getConstraints-msEJaDk() {
        return this.constraints;
    }

    public final Density getDensity() {
        return this.density;
    }

    public final LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final int getOverflow-gIe3tQ8() {
        return this.overflow;
    }

    public final List getPlaceholders() {
        return this.placeholders;
    }

    public final ResourceLoader getResourceLoader() {
        return this.resourceLoader;
    }

    public final boolean getSoftWrap() {
        return this.softWrap;
    }

    public final TextStyle getStyle() {
        return this.style;
    }

    public final AnnotatedString getText() {
        return this.text;
    }

    @Override
    public int hashCode() {
        return ((((((((this.text.hashCode() * 0x1F + this.style.hashCode()) * 0x1F + this.placeholders.hashCode()) * 0x1F + this.maxLines) * 0x1F + PainterModifier..ExternalSyntheticBackport0.m(this.softWrap)) * 0x1F + this.getOverflow-gIe3tQ8()) * 0x1F + this.density.hashCode()) * 0x1F + this.layoutDirection.hashCode()) * 0x1F + this.resourceLoader.hashCode()) * 0x1F + Constraints.hashCode-impl(this.getConstraints-msEJaDk());
    }

    @Override
    public String toString() {
        return "TextLayoutInput(text=" + this.text + ", style=" + this.style + ", placeholders=" + this.placeholders + ", maxLines=" + this.maxLines + ", softWrap=" + this.softWrap + ", overflow=" + TextOverflow.toString-impl(this.getOverflow-gIe3tQ8()) + ", density=" + this.density + ", layoutDirection=" + this.layoutDirection + ", resourceLoader=" + this.resourceLoader + ", constraints=" + Constraints.toString-impl(this.getConstraints-msEJaDk()) + ')';
    }
}

