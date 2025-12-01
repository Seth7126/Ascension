package kotlin.time;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001A\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001B\u0010\u000B\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\bH\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\nJ\b\u0010\r\u001A\u00020\u0004H\u0014R\u000E\u0010\u0003\u001A\u00020\u0004X\u0082\u000E¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000E"}, d2 = {"Lkotlin/time/TestTimeSource;", "Lkotlin/time/AbstractLongTimeSource;", "()V", "reading", "", "overflow", "", "duration", "Lkotlin/time/Duration;", "overflow-LRDsOJo", "(J)V", "plusAssign", "plusAssign-LRDsOJo", "read", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
public final class TestTimeSource extends AbstractLongTimeSource {
    private long reading;

    public TestTimeSource() {
        super(TimeUnit.NANOSECONDS);
    }

    private final void overflow-LRDsOJo(long v) {
        throw new IllegalStateException("TestTimeSource will overflow if its reading " + this.reading + "ns is advanced by " + Duration.toString-impl(v) + '.');
    }

    public final void plusAssign-LRDsOJo(long v) {
        long v2;
        long v1 = Duration.toLong-impl(v, this.getUnit());
        if(v1 == 0x8000000000000000L || v1 == 0x7FFFFFFFFFFFFFFFL) {
            double f = Duration.toDouble-impl(v, this.getUnit());
            double f1 = ((double)this.reading) + f;
            if(f1 > 9223372036854776000.0 || f1 < -9223372036854776000.0) {
                this.overflow-LRDsOJo(v);
            }
            v2 = (long)f1;
        }
        else {
            v2 = this.reading + v1;
            if((v1 ^ this.reading) >= 0L && (this.reading ^ v2) < 0L) {
                this.overflow-LRDsOJo(v);
            }
        }
        this.reading = v2;
    }

    @Override  // kotlin.time.AbstractLongTimeSource
    protected long read() {
        return this.reading;
    }
}

