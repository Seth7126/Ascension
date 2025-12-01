package androidx.compose.ui.text.platform.extensions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0002\u001A\u00020\u0001\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001A\u00020\u0001HÆ\u0003J\t\u0010\r\u001A\u00020\u0004HÆ\u0003J\t\u0010\u000E\u001A\u00020\u0004HÆ\u0003J\'\u0010\u000F\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00012\b\b\u0002\u0010\u0003\u001A\u00020\u00042\b\b\u0002\u0010\u0005\u001A\u00020\u0004HÆ\u0001J\u0013\u0010\u0010\u001A\u00020\u00112\b\u0010\u0012\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001A\u00020\u0004HÖ\u0001J\t\u0010\u0014\u001A\u00020\u0015HÖ\u0001R\u0011\u0010\u0005\u001A\u00020\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001A\u00020\u0001¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0011\u0010\u0003\u001A\u00020\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\b¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/text/platform/extensions/SpanRange;", "", "span", "start", "", "end", "(Ljava/lang/Object;II)V", "getEnd", "()I", "getSpan", "()Ljava/lang/Object;", "getStart", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
final class SpanRange {
    private final int end;
    private final Object span;
    private final int start;

    public SpanRange(Object object0, int v, int v1) {
        Intrinsics.checkNotNullParameter(object0, "span");
        super();
        this.span = object0;
        this.start = v;
        this.end = v1;
    }

    public final Object component1() {
        return this.span;
    }

    public final int component2() {
        return this.start;
    }

    public final int component3() {
        return this.end;
    }

    public final SpanRange copy(Object object0, int v, int v1) {
        Intrinsics.checkNotNullParameter(object0, "span");
        return new SpanRange(object0, v, v1);
    }

    public static SpanRange copy$default(SpanRange spanRange0, Object object0, int v, int v1, int v2, Object object1) {
        if((v2 & 1) != 0) {
            object0 = spanRange0.span;
        }
        if((v2 & 2) != 0) {
            v = spanRange0.start;
        }
        if((v2 & 4) != 0) {
            v1 = spanRange0.end;
        }
        return spanRange0.copy(object0, v, v1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SpanRange)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.span, ((SpanRange)object0).span)) {
            return false;
        }
        return this.start == ((SpanRange)object0).start ? this.end == ((SpanRange)object0).end : false;
    }

    public final int getEnd() {
        return this.end;
    }

    public final Object getSpan() {
        return this.span;
    }

    public final int getStart() {
        return this.start;
    }

    @Override
    public int hashCode() {
        return (this.span.hashCode() * 0x1F + this.start) * 0x1F + this.end;
    }

    @Override
    public String toString() {
        return "SpanRange(span=" + this.span + ", start=" + this.start + ", end=" + this.end + ')';
    }
}

