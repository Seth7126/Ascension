package kotlin.time;

import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b0\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A \u0010#\u001A\u00020\u00072\u0006\u0010$\u001A\u00020\u00012\u0006\u0010%\u001A\u00020\u0005H\u0003\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010&\u001A\u0018\u0010\'\u001A\u00020\u00072\u0006\u0010(\u001A\u00020\u0001H\u0003\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010\u0010\u001A\u0018\u0010)\u001A\u00020\u00072\u0006\u0010*\u001A\u00020\u0001H\u0003\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010\u0010\u001A\u0018\u0010+\u001A\u00020\u00072\u0006\u0010,\u001A\u00020\u0001H\u0003\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010\u0010\u001A\u0018\u0010-\u001A\u00020\u00072\u0006\u0010.\u001A\u00020\u0001H\u0003\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010\u0010\u001A\u0010\u0010/\u001A\u00020\u00012\u0006\u0010*\u001A\u00020\u0001H\u0002\u001A\u0010\u00100\u001A\u00020\u00012\u0006\u0010.\u001A\u00020\u0001H\u0002\u001A\u001F\u00101\u001A\u00020\u0007*\u00020\b2\u0006\u00102\u001A\u00020\u0007H\u0087\n\u00F8\u0001\u0000\u00A2\u0006\u0004\b3\u00104\u001A\u001F\u00101\u001A\u00020\u0007*\u00020\u00052\u0006\u00102\u001A\u00020\u0007H\u0087\n\u00F8\u0001\u0000\u00A2\u0006\u0004\b5\u00106\u001A \u00107\u001A\u00020\u0007*\u00020\b2\n\u00108\u001A\u000609j\u0002`:H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010;\u001A \u00107\u001A\u00020\u0007*\u00020\u00052\n\u00108\u001A\u000609j\u0002`:H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010<\u001A \u00107\u001A\u00020\u0007*\u00020\u00012\n\u00108\u001A\u000609j\u0002`:H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010=\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0080T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u0002\u001A\u00020\u0001X\u0080T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u0003\u001A\u00020\u0001X\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u0004\u001A\u00020\u0005X\u0080T\u00A2\u0006\u0002\n\u0000\"!\u0010\u0006\u001A\u00020\u0007*\u00020\b8FX\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\f\"!\u0010\u0006\u001A\u00020\u0007*\u00020\u00058FX\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b\t\u0010\r\u001A\u0004\b\u000B\u0010\u000E\"!\u0010\u0006\u001A\u00020\u0007*\u00020\u00018FX\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b\t\u0010\u000F\u001A\u0004\b\u000B\u0010\u0010\"!\u0010\u0011\u001A\u00020\u0007*\u00020\b8FX\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b\u0012\u0010\n\u001A\u0004\b\u0013\u0010\f\"!\u0010\u0011\u001A\u00020\u0007*\u00020\u00058FX\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b\u0012\u0010\r\u001A\u0004\b\u0013\u0010\u000E\"!\u0010\u0011\u001A\u00020\u0007*\u00020\u00018FX\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b\u0012\u0010\u000F\u001A\u0004\b\u0013\u0010\u0010\"!\u0010\u0014\u001A\u00020\u0007*\u00020\b8FX\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b\u0015\u0010\n\u001A\u0004\b\u0016\u0010\f\"!\u0010\u0014\u001A\u00020\u0007*\u00020\u00058FX\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b\u0015\u0010\r\u001A\u0004\b\u0016\u0010\u000E\"!\u0010\u0014\u001A\u00020\u0007*\u00020\u00018FX\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b\u0015\u0010\u000F\u001A\u0004\b\u0016\u0010\u0010\"!\u0010\u0017\u001A\u00020\u0007*\u00020\b8FX\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b\u0018\u0010\n\u001A\u0004\b\u0019\u0010\f\"!\u0010\u0017\u001A\u00020\u0007*\u00020\u00058FX\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b\u0018\u0010\r\u001A\u0004\b\u0019\u0010\u000E\"!\u0010\u0017\u001A\u00020\u0007*\u00020\u00018FX\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b\u0018\u0010\u000F\u001A\u0004\b\u0019\u0010\u0010\"!\u0010\u001A\u001A\u00020\u0007*\u00020\b8FX\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b\u001B\u0010\n\u001A\u0004\b\u001C\u0010\f\"!\u0010\u001A\u001A\u00020\u0007*\u00020\u00058FX\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b\u001B\u0010\r\u001A\u0004\b\u001C\u0010\u000E\"!\u0010\u001A\u001A\u00020\u0007*\u00020\u00018FX\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b\u001B\u0010\u000F\u001A\u0004\b\u001C\u0010\u0010\"!\u0010\u001D\u001A\u00020\u0007*\u00020\b8FX\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b\u001E\u0010\n\u001A\u0004\b\u001F\u0010\f\"!\u0010\u001D\u001A\u00020\u0007*\u00020\u00058FX\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b\u001E\u0010\r\u001A\u0004\b\u001F\u0010\u000E\"!\u0010\u001D\u001A\u00020\u0007*\u00020\u00018FX\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b\u001E\u0010\u000F\u001A\u0004\b\u001F\u0010\u0010\"!\u0010 \u001A\u00020\u0007*\u00020\b8FX\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b!\u0010\n\u001A\u0004\b\"\u0010\f\"!\u0010 \u001A\u00020\u0007*\u00020\u00058FX\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b!\u0010\r\u001A\u0004\b\"\u0010\u000E\"!\u0010 \u001A\u00020\u0007*\u00020\u00018FX\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b!\u0010\u000F\u001A\u0004\b\"\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00A8\u0006>"}, d2 = {"MAX_MILLIS", "", "MAX_NANOS", "MAX_NANOS_IN_MILLIS", "NANOS_IN_MILLIS", "", "days", "Lkotlin/time/Duration;", "", "getDays$annotations", "(D)V", "getDays", "(D)J", "(I)V", "(I)J", "(J)V", "(J)J", "hours", "getHours$annotations", "getHours", "microseconds", "getMicroseconds$annotations", "getMicroseconds", "milliseconds", "getMilliseconds$annotations", "getMilliseconds", "minutes", "getMinutes$annotations", "getMinutes", "nanoseconds", "getNanoseconds$annotations", "getNanoseconds", "seconds", "getSeconds$annotations", "getSeconds", "durationOf", "normalValue", "unitDiscriminator", "(JI)J", "durationOfMillis", "normalMillis", "durationOfMillisNormalized", "millis", "durationOfNanos", "normalNanos", "durationOfNanosNormalized", "nanos", "millisToNanos", "nanosToMillis", "times", "duration", "times-kIfJnKk", "(DJ)J", "times-mvk6XK0", "(IJ)J", "toDuration", "unit", "Ljava/util/concurrent/TimeUnit;", "Lkotlin/time/DurationUnit;", "(DLjava/util/concurrent/TimeUnit;)J", "(ILjava/util/concurrent/TimeUnit;)J", "(JLjava/util/concurrent/TimeUnit;)J", "kotlin-stdlib"}, k = 2, mv = {1, 5, 1})
public final class DurationKt {
    public static final long MAX_MILLIS = 0x3FFFFFFFFFFFFFFFL;
    public static final long MAX_NANOS = 0x3FFFFFFFFFFA14BFL;
    private static final long MAX_NANOS_IN_MILLIS = 4611686018426L;
    public static final int NANOS_IN_MILLIS = 1000000;

    public static final long access$millisToNanos(long v) {
        return v * 1000000L;
    }

    public static final long access$nanosToMillis(long v) {
        return v / 1000000L;
    }

    private static final long durationOf(long v, int v1) {
        return Duration.constructor-impl((v << 1) + ((long)v1));
    }

    private static final long durationOfMillis(long v) {
        return Duration.constructor-impl((v << 1) + 1L);
    }

    private static final long durationOfMillisNormalized(long v) {
        return -4611686018426L > v || 4611686018426L < v ? DurationKt.durationOfMillis(RangesKt.coerceIn(v, 0xC000000000000001L, 0x3FFFFFFFFFFFFFFFL)) : DurationKt.durationOfNanos(v * 1000000L);
    }

    private static final long durationOfNanos(long v) {
        return Duration.constructor-impl(v << 1);
    }

    private static final long durationOfNanosNormalized(long v) {
        return 0xC00000000005EB41L > v || 0x3FFFFFFFFFFA14BFL < v ? DurationKt.durationOfMillis(v / 1000000L) : DurationKt.durationOfNanos(v);
    }

    public static final long getDays(double f) {
        return DurationKt.toDuration(f, TimeUnit.DAYS);
    }

    public static final long getDays(int v) {
        return DurationKt.toDuration(v, TimeUnit.DAYS);
    }

    public static final long getDays(long v) {
        return DurationKt.toDuration(v, TimeUnit.DAYS);
    }

    @Deprecated(message = "Use Duration.days() function instead.", replaceWith = @ReplaceWith(expression = "Duration.days(this)", imports = {"kotlin.time.Duration"}))
    public static void getDays$annotations(double f) {
    }

    @Deprecated(message = "Use Duration.days() function instead.", replaceWith = @ReplaceWith(expression = "Duration.days(this)", imports = {"kotlin.time.Duration"}))
    public static void getDays$annotations(int v) {
    }

    @Deprecated(message = "Use Duration.days() function instead.", replaceWith = @ReplaceWith(expression = "Duration.days(this)", imports = {"kotlin.time.Duration"}))
    public static void getDays$annotations(long v) {
    }

    public static final long getHours(double f) {
        return DurationKt.toDuration(f, TimeUnit.HOURS);
    }

    public static final long getHours(int v) {
        return DurationKt.toDuration(v, TimeUnit.HOURS);
    }

    public static final long getHours(long v) {
        return DurationKt.toDuration(v, TimeUnit.HOURS);
    }

    @Deprecated(message = "Use Duration.hours() function instead.", replaceWith = @ReplaceWith(expression = "Duration.hours(this)", imports = {"kotlin.time.Duration"}))
    public static void getHours$annotations(double f) {
    }

    @Deprecated(message = "Use Duration.hours() function instead.", replaceWith = @ReplaceWith(expression = "Duration.hours(this)", imports = {"kotlin.time.Duration"}))
    public static void getHours$annotations(int v) {
    }

    @Deprecated(message = "Use Duration.hours() function instead.", replaceWith = @ReplaceWith(expression = "Duration.hours(this)", imports = {"kotlin.time.Duration"}))
    public static void getHours$annotations(long v) {
    }

    public static final long getMicroseconds(double f) {
        return DurationKt.toDuration(f, TimeUnit.MICROSECONDS);
    }

    public static final long getMicroseconds(int v) {
        return DurationKt.toDuration(v, TimeUnit.MICROSECONDS);
    }

    public static final long getMicroseconds(long v) {
        return DurationKt.toDuration(v, TimeUnit.MICROSECONDS);
    }

    @Deprecated(message = "Use Duration.microseconds() function instead.", replaceWith = @ReplaceWith(expression = "Duration.microseconds(this)", imports = {"kotlin.time.Duration"}))
    public static void getMicroseconds$annotations(double f) {
    }

    @Deprecated(message = "Use Duration.microseconds() function instead.", replaceWith = @ReplaceWith(expression = "Duration.microseconds(this)", imports = {"kotlin.time.Duration"}))
    public static void getMicroseconds$annotations(int v) {
    }

    @Deprecated(message = "Use Duration.microseconds() function instead.", replaceWith = @ReplaceWith(expression = "Duration.microseconds(this)", imports = {"kotlin.time.Duration"}))
    public static void getMicroseconds$annotations(long v) {
    }

    public static final long getMilliseconds(double f) {
        return DurationKt.toDuration(f, TimeUnit.MILLISECONDS);
    }

    public static final long getMilliseconds(int v) {
        return DurationKt.toDuration(v, TimeUnit.MILLISECONDS);
    }

    public static final long getMilliseconds(long v) {
        return DurationKt.toDuration(v, TimeUnit.MILLISECONDS);
    }

    @Deprecated(message = "Use Duration.milliseconds() function instead.", replaceWith = @ReplaceWith(expression = "Duration.milliseconds(this)", imports = {"kotlin.time.Duration"}))
    public static void getMilliseconds$annotations(double f) {
    }

    @Deprecated(message = "Use Duration.milliseconds() function instead.", replaceWith = @ReplaceWith(expression = "Duration.milliseconds(this)", imports = {"kotlin.time.Duration"}))
    public static void getMilliseconds$annotations(int v) {
    }

    @Deprecated(message = "Use Duration.milliseconds() function instead.", replaceWith = @ReplaceWith(expression = "Duration.milliseconds(this)", imports = {"kotlin.time.Duration"}))
    public static void getMilliseconds$annotations(long v) {
    }

    public static final long getMinutes(double f) {
        return DurationKt.toDuration(f, TimeUnit.MINUTES);
    }

    public static final long getMinutes(int v) {
        return DurationKt.toDuration(v, TimeUnit.MINUTES);
    }

    public static final long getMinutes(long v) {
        return DurationKt.toDuration(v, TimeUnit.MINUTES);
    }

    @Deprecated(message = "Use Duration.minutes() function instead.", replaceWith = @ReplaceWith(expression = "Duration.minutes(this)", imports = {"kotlin.time.Duration"}))
    public static void getMinutes$annotations(double f) {
    }

    @Deprecated(message = "Use Duration.minutes() function instead.", replaceWith = @ReplaceWith(expression = "Duration.minutes(this)", imports = {"kotlin.time.Duration"}))
    public static void getMinutes$annotations(int v) {
    }

    @Deprecated(message = "Use Duration.minutes() function instead.", replaceWith = @ReplaceWith(expression = "Duration.minutes(this)", imports = {"kotlin.time.Duration"}))
    public static void getMinutes$annotations(long v) {
    }

    public static final long getNanoseconds(double f) {
        return DurationKt.toDuration(f, TimeUnit.NANOSECONDS);
    }

    public static final long getNanoseconds(int v) {
        return DurationKt.toDuration(v, TimeUnit.NANOSECONDS);
    }

    public static final long getNanoseconds(long v) {
        return DurationKt.toDuration(v, TimeUnit.NANOSECONDS);
    }

    @Deprecated(message = "Use Duration.nanoseconds() function instead.", replaceWith = @ReplaceWith(expression = "Duration.nanoseconds(this)", imports = {"kotlin.time.Duration"}))
    public static void getNanoseconds$annotations(double f) {
    }

    @Deprecated(message = "Use Duration.nanoseconds() function instead.", replaceWith = @ReplaceWith(expression = "Duration.nanoseconds(this)", imports = {"kotlin.time.Duration"}))
    public static void getNanoseconds$annotations(int v) {
    }

    @Deprecated(message = "Use Duration.nanoseconds() function instead.", replaceWith = @ReplaceWith(expression = "Duration.nanoseconds(this)", imports = {"kotlin.time.Duration"}))
    public static void getNanoseconds$annotations(long v) {
    }

    public static final long getSeconds(double f) {
        return DurationKt.toDuration(f, TimeUnit.SECONDS);
    }

    public static final long getSeconds(int v) {
        return DurationKt.toDuration(v, TimeUnit.SECONDS);
    }

    public static final long getSeconds(long v) {
        return DurationKt.toDuration(v, TimeUnit.SECONDS);
    }

    @Deprecated(message = "Use Duration.seconds() function instead.", replaceWith = @ReplaceWith(expression = "Duration.seconds(this)", imports = {"kotlin.time.Duration"}))
    public static void getSeconds$annotations(double f) {
    }

    @Deprecated(message = "Use Duration.seconds() function instead.", replaceWith = @ReplaceWith(expression = "Duration.seconds(this)", imports = {"kotlin.time.Duration"}))
    public static void getSeconds$annotations(int v) {
    }

    @Deprecated(message = "Use Duration.seconds() function instead.", replaceWith = @ReplaceWith(expression = "Duration.seconds(this)", imports = {"kotlin.time.Duration"}))
    public static void getSeconds$annotations(long v) {
    }

    private static final long millisToNanos(long v) [...] // Inlined contents

    private static final long nanosToMillis(long v) [...] // Inlined contents

    private static final long times-kIfJnKk(double f, long v) {
        return Duration.times-UwyO8pc(v, f);
    }

    private static final long times-mvk6XK0(int v, long v1) {
        return Duration.times-UwyO8pc(v1, v);
    }

    public static final long toDuration(double f, TimeUnit timeUnit0) {
        Intrinsics.checkNotNullParameter(timeUnit0, "unit");
        double f1 = DurationUnitKt.convertDurationUnit(f, timeUnit0, TimeUnit.NANOSECONDS);
        if(!Double.isNaN(f1) == 0) {
            throw new IllegalArgumentException("Duration value cannot be NaN.");
        }
        return 0xC00000000005EB41L > ((long)f1) || 0x3FFFFFFFFFFA14BFL < ((long)f1) ? DurationKt.durationOfMillisNormalized(((long)DurationUnitKt.convertDurationUnit(f, timeUnit0, TimeUnit.MILLISECONDS))) : DurationKt.durationOfNanos(((long)f1));
    }

    public static final long toDuration(int v, TimeUnit timeUnit0) {
        Intrinsics.checkNotNullParameter(timeUnit0, "unit");
        return timeUnit0.compareTo(TimeUnit.SECONDS) > 0 ? DurationKt.toDuration(v, timeUnit0) : DurationKt.durationOfNanos(DurationUnitKt.convertDurationUnitOverflow(v, timeUnit0, TimeUnit.NANOSECONDS));
    }

    public static final long toDuration(long v, TimeUnit timeUnit0) {
        Intrinsics.checkNotNullParameter(timeUnit0, "unit");
        long v1 = DurationUnitKt.convertDurationUnitOverflow(0x3FFFFFFFFFFA14BFL, TimeUnit.NANOSECONDS, timeUnit0);
        return -v1 > v || v1 < v ? DurationKt.durationOfMillis(RangesKt.coerceIn(DurationUnitKt.convertDurationUnit(v, timeUnit0, TimeUnit.MILLISECONDS), 0xC000000000000001L, 0x3FFFFFFFFFFFFFFFL)) : DurationKt.durationOfNanos(DurationUnitKt.convertDurationUnitOverflow(v, timeUnit0, TimeUnit.NANOSECONDS));
    }
}

