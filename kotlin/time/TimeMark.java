package kotlin.time;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\b\b\'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001A\u00020\u0004H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0007\u001A\u00020\bJ\u0006\u0010\t\u001A\u00020\bJ\u001B\u0010\n\u001A\u00020\u00002\u0006\u0010\u000B\u001A\u00020\u0004H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001B\u0010\u000E\u001A\u00020\u00002\u0006\u0010\u000B\u001A\u00020\u0004H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u000F\u0010\r\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0010"}, d2 = {"Lkotlin/time/TimeMark;", "", "()V", "elapsedNow", "Lkotlin/time/Duration;", "elapsedNow-UwyO8pc", "()J", "hasNotPassedNow", "", "hasPassedNow", "minus", "duration", "minus-LRDsOJo", "(J)Lkotlin/time/TimeMark;", "plus", "plus-LRDsOJo", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
public abstract class TimeMark {
    public abstract long elapsedNow-UwyO8pc();

    public final boolean hasNotPassedNow() {
        return Duration.isNegative-impl(this.elapsedNow-UwyO8pc());
    }

    public final boolean hasPassedNow() {
        return !Duration.isNegative-impl(this.elapsedNow-UwyO8pc());
    }

    public TimeMark minus-LRDsOJo(long v) {
        return this.plus-LRDsOJo(Duration.unaryMinus-UwyO8pc(v));
    }

    public TimeMark plus-LRDsOJo(long v) {
        return new AdjustedTimeMark(this, v, null);
    }
}

