package kotlin.io;

import java.nio.charset.CharsetDecoder;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference0Impl;

@Metadata(k = 3, mv = {1, 5, 1})
final class LineReader.readLine.1 extends MutablePropertyReference0Impl {
    LineReader.readLine.1(LineReader lineReader0) {
        super(lineReader0, LineReader.class, "decoder", "getDecoder()Ljava/nio/charset/CharsetDecoder;", 0);
    }

    @Override  // kotlin.jvm.internal.MutablePropertyReference0Impl
    public Object get() {
        return LineReader.access$getDecoder$p(((LineReader)this.receiver));
    }

    @Override  // kotlin.jvm.internal.MutablePropertyReference0Impl
    public void set(Object object0) {
        LineReader.access$setDecoder$p(((LineReader)this.receiver), ((CharsetDecoder)object0));
    }
}

