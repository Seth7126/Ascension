package kotlin.time;

import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.LongRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u000F\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b4\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000B\n\u0002\u0010\u0000\n\u0002\b\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0002\b\u0011\b\u0087@\u0018\u0000 \u00A5\u00012\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u00A5\u0001B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0004\u0010\u0005J%\u0010K\u001A\u00020\u00002\u0006\u0010L\u001A\u00020\u00032\u0006\u0010M\u001A\u00020\u0003H\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bN\u0010OJ\u001B\u0010P\u001A\u00020\t2\u0006\u0010Q\u001A\u00020\u0000H\u0096\u0002\u00F8\u0001\u0000\u00A2\u0006\u0004\bR\u0010SJ\u001E\u0010T\u001A\u00020\u00002\u0006\u0010U\u001A\u00020\u000FH\u0086\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bV\u0010WJ\u001E\u0010T\u001A\u00020\u00002\u0006\u0010U\u001A\u00020\tH\u0086\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bV\u0010XJ\u001B\u0010T\u001A\u00020\u000F2\u0006\u0010Q\u001A\u00020\u0000H\u0086\u0002\u00F8\u0001\u0000\u00A2\u0006\u0004\bY\u0010ZJ\u001A\u0010[\u001A\u00020\\2\b\u0010Q\u001A\u0004\u0018\u00010]H\u00D6\u0003\u00A2\u0006\u0004\b^\u0010_J\u0010\u0010`\u001A\u00020\tH\u00D6\u0001\u00A2\u0006\u0004\ba\u0010\rJ\r\u0010b\u001A\u00020\\\u00A2\u0006\u0004\bc\u0010dJ\u000F\u0010e\u001A\u00020\\H\u0002\u00A2\u0006\u0004\bf\u0010dJ\u000F\u0010g\u001A\u00020\\H\u0002\u00A2\u0006\u0004\bh\u0010dJ\r\u0010i\u001A\u00020\\\u00A2\u0006\u0004\bj\u0010dJ\r\u0010k\u001A\u00020\\\u00A2\u0006\u0004\bl\u0010dJ\r\u0010m\u001A\u00020\\\u00A2\u0006\u0004\bn\u0010dJ\u001B\u0010o\u001A\u00020\u00002\u0006\u0010Q\u001A\u00020\u0000H\u0086\u0002\u00F8\u0001\u0000\u00A2\u0006\u0004\bp\u0010qJ\u001B\u0010r\u001A\u00020\u00002\u0006\u0010Q\u001A\u00020\u0000H\u0086\u0002\u00F8\u0001\u0000\u00A2\u0006\u0004\bs\u0010qJ\u0017\u0010t\u001A\u00020\t2\u0006\u0010I\u001A\u00020\u000FH\u0002\u00A2\u0006\u0004\bu\u0010vJ\u001E\u0010w\u001A\u00020\u00002\u0006\u0010U\u001A\u00020\u000FH\u0086\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bx\u0010WJ\u001E\u0010w\u001A\u00020\u00002\u0006\u0010U\u001A\u00020\tH\u0086\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bx\u0010XJ\u00A3\u0001\u0010y\u001A\u0002Hz\"\u0004\b\u0000\u0010z2y\u0010{\u001Au\u0012\u0013\u0012\u00110\t\u00A2\u0006\f\b}\u0012\b\b~\u0012\u0004\b\b(\u007F\u0012\u0014\u0012\u00120\t\u00A2\u0006\r\b}\u0012\t\b~\u0012\u0005\b\b(\u0080\u0001\u0012\u0014\u0012\u00120\t\u00A2\u0006\r\b}\u0012\t\b~\u0012\u0005\b\b(\u0081\u0001\u0012\u0014\u0012\u00120\t\u00A2\u0006\r\b}\u0012\t\b~\u0012\u0005\b\b(\u0082\u0001\u0012\u0014\u0012\u00120\t\u00A2\u0006\r\b}\u0012\t\b~\u0012\u0005\b\b(\u0083\u0001\u0012\u0004\u0012\u0002Hz0|H\u0086\b\u00F8\u0001\u0002\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u00A2\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u008F\u0001\u0010y\u001A\u0002Hz\"\u0004\b\u0000\u0010z2e\u0010{\u001Aa\u0012\u0014\u0012\u00120\t\u00A2\u0006\r\b}\u0012\t\b~\u0012\u0005\b\b(\u0080\u0001\u0012\u0014\u0012\u00120\t\u00A2\u0006\r\b}\u0012\t\b~\u0012\u0005\b\b(\u0081\u0001\u0012\u0014\u0012\u00120\t\u00A2\u0006\r\b}\u0012\t\b~\u0012\u0005\b\b(\u0082\u0001\u0012\u0014\u0012\u00120\t\u00A2\u0006\r\b}\u0012\t\b~\u0012\u0005\b\b(\u0083\u0001\u0012\u0004\u0012\u0002Hz0\u0086\u0001H\u0086\b\u00F8\u0001\u0002\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u00A2\u0006\u0006\b\u0084\u0001\u0010\u0087\u0001Jy\u0010y\u001A\u0002Hz\"\u0004\b\u0000\u0010z2O\u0010{\u001AK\u0012\u0014\u0012\u00120\t\u00A2\u0006\r\b}\u0012\t\b~\u0012\u0005\b\b(\u0081\u0001\u0012\u0014\u0012\u00120\t\u00A2\u0006\r\b}\u0012\t\b~\u0012\u0005\b\b(\u0082\u0001\u0012\u0014\u0012\u00120\t\u00A2\u0006\r\b}\u0012\t\b~\u0012\u0005\b\b(\u0083\u0001\u0012\u0004\u0012\u0002Hz0\u0088\u0001H\u0086\b\u00F8\u0001\u0002\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u00A2\u0006\u0006\b\u0084\u0001\u0010\u0089\u0001Jc\u0010y\u001A\u0002Hz\"\u0004\b\u0000\u0010z29\u0010{\u001A5\u0012\u0014\u0012\u00120\u0003\u00A2\u0006\r\b}\u0012\t\b~\u0012\u0005\b\b(\u0082\u0001\u0012\u0014\u0012\u00120\t\u00A2\u0006\r\b}\u0012\t\b~\u0012\u0005\b\b(\u0083\u0001\u0012\u0004\u0012\u0002Hz0\u008A\u0001H\u0086\b\u00F8\u0001\u0002\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u00A2\u0006\u0006\b\u0084\u0001\u0010\u008B\u0001J\u001E\u0010\u008C\u0001\u001A\u00020\u000F2\f\u0010\u008D\u0001\u001A\u00070Dj\u0003`\u008E\u0001\u00A2\u0006\u0006\b\u008F\u0001\u0010\u0090\u0001J\u001E\u0010\u0091\u0001\u001A\u00020\t2\f\u0010\u008D\u0001\u001A\u00070Dj\u0003`\u008E\u0001\u00A2\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u0011\u0010\u0094\u0001\u001A\u00030\u0095\u0001\u00A2\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u001E\u0010\u0098\u0001\u001A\u00020\u00032\f\u0010\u008D\u0001\u001A\u00070Dj\u0003`\u008E\u0001\u00A2\u0006\u0006\b\u0099\u0001\u0010\u009A\u0001J\u0011\u0010\u009B\u0001\u001A\u00020\u0003H\u0007\u00A2\u0006\u0005\b\u009C\u0001\u0010\u0005J\u0011\u0010\u009D\u0001\u001A\u00020\u0003H\u0007\u00A2\u0006\u0005\b\u009E\u0001\u0010\u0005J\u0013\u0010\u009F\u0001\u001A\u00030\u0095\u0001H\u0016\u00A2\u0006\u0006\b\u00A0\u0001\u0010\u0097\u0001J*\u0010\u009F\u0001\u001A\u00030\u0095\u00012\f\u0010\u008D\u0001\u001A\u00070Dj\u0003`\u008E\u00012\t\b\u0002\u0010\u00A1\u0001\u001A\u00020\t\u00A2\u0006\u0006\b\u00A0\u0001\u0010\u00A2\u0001J\u0018\u0010\u00A3\u0001\u001A\u00020\u0000H\u0086\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0005\b\u00A4\u0001\u0010\u0005R\u0017\u0010\u0006\u001A\u00020\u00008F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\b\u0007\u0010\u0005R\u001A\u0010\b\u001A\u00020\t8@X\u0081\u0004\u00A2\u0006\f\u0012\u0004\b\n\u0010\u000B\u001A\u0004\b\f\u0010\rR\u001A\u0010\u000E\u001A\u00020\u000F8FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\u0010\u0010\u000B\u001A\u0004\b\u0011\u0010\u0012R\u001A\u0010\u0013\u001A\u00020\u000F8FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\u0014\u0010\u000B\u001A\u0004\b\u0015\u0010\u0012R\u001A\u0010\u0016\u001A\u00020\u000F8FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\u0017\u0010\u000B\u001A\u0004\b\u0018\u0010\u0012R\u001A\u0010\u0019\u001A\u00020\u000F8FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\u001A\u0010\u000B\u001A\u0004\b\u001B\u0010\u0012R\u001A\u0010\u001C\u001A\u00020\u000F8FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\u001D\u0010\u000B\u001A\u0004\b\u001E\u0010\u0012R\u001A\u0010\u001F\u001A\u00020\u000F8FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b \u0010\u000B\u001A\u0004\b!\u0010\u0012R\u001A\u0010\"\u001A\u00020\u000F8FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b#\u0010\u000B\u001A\u0004\b$\u0010\u0012R\u001A\u0010%\u001A\u00020\u00038FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b&\u0010\u000B\u001A\u0004\b\'\u0010\u0005R\u001A\u0010(\u001A\u00020\u00038FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b)\u0010\u000B\u001A\u0004\b*\u0010\u0005R\u001A\u0010+\u001A\u00020\u00038FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b,\u0010\u000B\u001A\u0004\b-\u0010\u0005R\u001A\u0010.\u001A\u00020\u00038FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b/\u0010\u000B\u001A\u0004\b0\u0010\u0005R\u001A\u00101\u001A\u00020\u00038FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b2\u0010\u000B\u001A\u0004\b3\u0010\u0005R\u001A\u00104\u001A\u00020\u00038FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b5\u0010\u000B\u001A\u0004\b6\u0010\u0005R\u001A\u00107\u001A\u00020\u00038FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b8\u0010\u000B\u001A\u0004\b9\u0010\u0005R\u001A\u0010:\u001A\u00020\t8@X\u0081\u0004\u00A2\u0006\f\u0012\u0004\b;\u0010\u000B\u001A\u0004\b<\u0010\rR\u001A\u0010=\u001A\u00020\t8@X\u0081\u0004\u00A2\u0006\f\u0012\u0004\b>\u0010\u000B\u001A\u0004\b?\u0010\rR\u000E\u0010\u0002\u001A\u00020\u0003X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u001A\u0010@\u001A\u00020\t8@X\u0081\u0004\u00A2\u0006\f\u0012\u0004\bA\u0010\u000B\u001A\u0004\bB\u0010\rR\u0014\u0010C\u001A\u00020D8BX\u0082\u0004\u00A2\u0006\u0006\u001A\u0004\bE\u0010FR\u0015\u0010G\u001A\u00020\t8\u00C2\u0002X\u0082\u0004\u00A2\u0006\u0006\u001A\u0004\bH\u0010\rR\u0014\u0010I\u001A\u00020\u00038BX\u0082\u0004\u00A2\u0006\u0006\u001A\u0004\bJ\u0010\u0005\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u00F8\u0001\u0000\u0082\u0002\u000F\n\u0002\b\u0019\n\u0002\b!\n\u0005\b\u009920\u0001\u00A8\u0006\u00A6\u0001"}, d2 = {"Lkotlin/time/Duration;", "", "rawValue", "", "constructor-impl", "(J)J", "absoluteValue", "getAbsoluteValue-UwyO8pc", "hoursComponent", "", "getHoursComponent$annotations", "()V", "getHoursComponent-impl", "(J)I", "inDays", "", "getInDays$annotations", "getInDays-impl", "(J)D", "inHours", "getInHours$annotations", "getInHours-impl", "inMicroseconds", "getInMicroseconds$annotations", "getInMicroseconds-impl", "inMilliseconds", "getInMilliseconds$annotations", "getInMilliseconds-impl", "inMinutes", "getInMinutes$annotations", "getInMinutes-impl", "inNanoseconds", "getInNanoseconds$annotations", "getInNanoseconds-impl", "inSeconds", "getInSeconds$annotations", "getInSeconds-impl", "inWholeDays", "getInWholeDays$annotations", "getInWholeDays-impl", "inWholeHours", "getInWholeHours$annotations", "getInWholeHours-impl", "inWholeMicroseconds", "getInWholeMicroseconds$annotations", "getInWholeMicroseconds-impl", "inWholeMilliseconds", "getInWholeMilliseconds$annotations", "getInWholeMilliseconds-impl", "inWholeMinutes", "getInWholeMinutes$annotations", "getInWholeMinutes-impl", "inWholeNanoseconds", "getInWholeNanoseconds$annotations", "getInWholeNanoseconds-impl", "inWholeSeconds", "getInWholeSeconds$annotations", "getInWholeSeconds-impl", "minutesComponent", "getMinutesComponent$annotations", "getMinutesComponent-impl", "nanosecondsComponent", "getNanosecondsComponent$annotations", "getNanosecondsComponent-impl", "secondsComponent", "getSecondsComponent$annotations", "getSecondsComponent-impl", "storageUnit", "Ljava/util/concurrent/TimeUnit;", "getStorageUnit-impl", "(J)Ljava/util/concurrent/TimeUnit;", "unitDiscriminator", "getUnitDiscriminator-impl", "value", "getValue-impl", "addValuesMixedRanges", "thisMillis", "otherNanos", "addValuesMixedRanges-UwyO8pc", "(JJJ)J", "compareTo", "other", "compareTo-LRDsOJo", "(JJ)I", "div", "scale", "div-UwyO8pc", "(JD)J", "(JI)J", "div-LRDsOJo", "(JJ)D", "equals", "", "", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "isFinite", "isFinite-impl", "(J)Z", "isInMillis", "isInMillis-impl", "isInNanos", "isInNanos-impl", "isInfinite", "isInfinite-impl", "isNegative", "isNegative-impl", "isPositive", "isPositive-impl", "minus", "minus-LRDsOJo", "(JJ)J", "plus", "plus-LRDsOJo", "precision", "precision-impl", "(JD)I", "times", "times-UwyO8pc", "toComponents", "T", "action", "Lkotlin/Function5;", "Lkotlin/ParameterName;", "name", "days", "hours", "minutes", "seconds", "nanoseconds", "toComponents-impl", "(JLkotlin/jvm/functions/Function5;)Ljava/lang/Object;", "Lkotlin/Function4;", "(JLkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "Lkotlin/Function3;", "(JLkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "Lkotlin/Function2;", "(JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "toDouble", "unit", "Lkotlin/time/DurationUnit;", "toDouble-impl", "(JLjava/util/concurrent/TimeUnit;)D", "toInt", "toInt-impl", "(JLjava/util/concurrent/TimeUnit;)I", "toIsoString", "", "toIsoString-impl", "(J)Ljava/lang/String;", "toLong", "toLong-impl", "(JLjava/util/concurrent/TimeUnit;)J", "toLongMilliseconds", "toLongMilliseconds-impl", "toLongNanoseconds", "toLongNanoseconds-impl", "toString", "toString-impl", "decimals", "(JLjava/util/concurrent/TimeUnit;I)Ljava/lang/String;", "unaryMinus", "unaryMinus-UwyO8pc", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
@JvmInline
public final class Duration implements Comparable {
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000E\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00A2\u0006\u0002\u0010\u0002J&\u0010\f\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\r2\n\u0010\u000F\u001A\u00060\u0010j\u0002`\u00112\n\u0010\u0012\u001A\u00060\u0010j\u0002`\u0011J\u001D\u0010\u0013\u001A\u00020\u00042\u0006\u0010\u000E\u001A\u00020\rH\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u001D\u0010\u0013\u001A\u00020\u00042\u0006\u0010\u000E\u001A\u00020\u0016H\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u0014\u0010\u0017J\u001D\u0010\u0013\u001A\u00020\u00042\u0006\u0010\u000E\u001A\u00020\u0018H\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u0014\u0010\u0019J\u001D\u0010\u001A\u001A\u00020\u00042\u0006\u0010\u000E\u001A\u00020\rH\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001B\u0010\u0015J\u001D\u0010\u001A\u001A\u00020\u00042\u0006\u0010\u000E\u001A\u00020\u0016H\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001B\u0010\u0017J\u001D\u0010\u001A\u001A\u00020\u00042\u0006\u0010\u000E\u001A\u00020\u0018H\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001B\u0010\u0019J\u001D\u0010\u001C\u001A\u00020\u00042\u0006\u0010\u000E\u001A\u00020\rH\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001D\u0010\u0015J\u001D\u0010\u001C\u001A\u00020\u00042\u0006\u0010\u000E\u001A\u00020\u0016H\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001D\u0010\u0017J\u001D\u0010\u001C\u001A\u00020\u00042\u0006\u0010\u000E\u001A\u00020\u0018H\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001D\u0010\u0019J\u001D\u0010\u001E\u001A\u00020\u00042\u0006\u0010\u000E\u001A\u00020\rH\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001F\u0010\u0015J\u001D\u0010\u001E\u001A\u00020\u00042\u0006\u0010\u000E\u001A\u00020\u0016H\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001F\u0010\u0017J\u001D\u0010\u001E\u001A\u00020\u00042\u0006\u0010\u000E\u001A\u00020\u0018H\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001F\u0010\u0019J\u001D\u0010 \u001A\u00020\u00042\u0006\u0010\u000E\u001A\u00020\rH\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b!\u0010\u0015J\u001D\u0010 \u001A\u00020\u00042\u0006\u0010\u000E\u001A\u00020\u0016H\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b!\u0010\u0017J\u001D\u0010 \u001A\u00020\u00042\u0006\u0010\u000E\u001A\u00020\u0018H\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b!\u0010\u0019J\u001D\u0010\"\u001A\u00020\u00042\u0006\u0010\u000E\u001A\u00020\rH\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b#\u0010\u0015J\u001D\u0010\"\u001A\u00020\u00042\u0006\u0010\u000E\u001A\u00020\u0016H\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b#\u0010\u0017J\u001D\u0010\"\u001A\u00020\u00042\u0006\u0010\u000E\u001A\u00020\u0018H\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b#\u0010\u0019J\u001D\u0010$\u001A\u00020\u00042\u0006\u0010\u000E\u001A\u00020\rH\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b%\u0010\u0015J\u001D\u0010$\u001A\u00020\u00042\u0006\u0010\u000E\u001A\u00020\u0016H\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b%\u0010\u0017J\u001D\u0010$\u001A\u00020\u00042\u0006\u0010\u000E\u001A\u00020\u0018H\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b%\u0010\u0019R\u0019\u0010\u0003\u001A\u00020\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\u0005\u0010\u0006R\u001C\u0010\b\u001A\u00020\u0004X\u0080\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001A\u00020\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\u000B\u0010\u0006\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!\u00A8\u0006&"}, d2 = {"Lkotlin/time/Duration$Companion;", "", "()V", "INFINITE", "Lkotlin/time/Duration;", "getINFINITE-UwyO8pc", "()J", "J", "NEG_INFINITE", "getNEG_INFINITE-UwyO8pc$kotlin_stdlib", "ZERO", "getZERO-UwyO8pc", "convert", "", "value", "sourceUnit", "Ljava/util/concurrent/TimeUnit;", "Lkotlin/time/DurationUnit;", "targetUnit", "days", "days-UwyO8pc", "(D)J", "", "(I)J", "", "(J)J", "hours", "hours-UwyO8pc", "microseconds", "microseconds-UwyO8pc", "milliseconds", "milliseconds-UwyO8pc", "minutes", "minutes-UwyO8pc", "nanoseconds", "nanoseconds-UwyO8pc", "seconds", "seconds-UwyO8pc", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final double convert(double f, TimeUnit timeUnit0, TimeUnit timeUnit1) {
            Intrinsics.checkNotNullParameter(timeUnit0, "sourceUnit");
            Intrinsics.checkNotNullParameter(timeUnit1, "targetUnit");
            return DurationUnitKt.convertDurationUnit(f, timeUnit0, timeUnit1);
        }

        public final long days-UwyO8pc(double f) {
            return DurationKt.toDuration(f, TimeUnit.DAYS);
        }

        public final long days-UwyO8pc(int v) {
            return DurationKt.toDuration(v, TimeUnit.DAYS);
        }

        public final long days-UwyO8pc(long v) {
            return DurationKt.toDuration(v, TimeUnit.DAYS);
        }

        // 去混淆评级： 低(20)
        public final long getINFINITE-UwyO8pc() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final long getNEG_INFINITE-UwyO8pc$kotlin_stdlib() {
            return 0x8000000000000003L;
        }

        // 去混淆评级： 低(20)
        public final long getZERO-UwyO8pc() [...] // 潜在的解密器

        public final long hours-UwyO8pc(double f) {
            return DurationKt.toDuration(f, TimeUnit.HOURS);
        }

        public final long hours-UwyO8pc(int v) {
            return DurationKt.toDuration(v, TimeUnit.HOURS);
        }

        public final long hours-UwyO8pc(long v) {
            return DurationKt.toDuration(v, TimeUnit.HOURS);
        }

        public final long microseconds-UwyO8pc(double f) {
            return DurationKt.toDuration(f, TimeUnit.MICROSECONDS);
        }

        public final long microseconds-UwyO8pc(int v) {
            return DurationKt.toDuration(v, TimeUnit.MICROSECONDS);
        }

        public final long microseconds-UwyO8pc(long v) {
            return DurationKt.toDuration(v, TimeUnit.MICROSECONDS);
        }

        public final long milliseconds-UwyO8pc(double f) {
            return DurationKt.toDuration(f, TimeUnit.MILLISECONDS);
        }

        public final long milliseconds-UwyO8pc(int v) {
            return DurationKt.toDuration(v, TimeUnit.MILLISECONDS);
        }

        public final long milliseconds-UwyO8pc(long v) {
            return DurationKt.toDuration(v, TimeUnit.MILLISECONDS);
        }

        public final long minutes-UwyO8pc(double f) {
            return DurationKt.toDuration(f, TimeUnit.MINUTES);
        }

        public final long minutes-UwyO8pc(int v) {
            return DurationKt.toDuration(v, TimeUnit.MINUTES);
        }

        public final long minutes-UwyO8pc(long v) {
            return DurationKt.toDuration(v, TimeUnit.MINUTES);
        }

        public final long nanoseconds-UwyO8pc(double f) {
            return DurationKt.toDuration(f, TimeUnit.NANOSECONDS);
        }

        public final long nanoseconds-UwyO8pc(int v) {
            return DurationKt.toDuration(v, TimeUnit.NANOSECONDS);
        }

        public final long nanoseconds-UwyO8pc(long v) {
            return DurationKt.toDuration(v, TimeUnit.NANOSECONDS);
        }

        public final long seconds-UwyO8pc(double f) {
            return DurationKt.toDuration(f, TimeUnit.SECONDS);
        }

        public final long seconds-UwyO8pc(int v) {
            return DurationKt.toDuration(v, TimeUnit.SECONDS);
        }

        public final long seconds-UwyO8pc(long v) {
            return DurationKt.toDuration(v, TimeUnit.SECONDS);
        }
    }

    public static final Companion Companion;
    private static final long INFINITE;
    private static final long NEG_INFINITE;
    private static final long ZERO;
    private final long rawValue;

    static {
        Duration.Companion = new Companion(null);
        Duration.ZERO = 0L;
        Duration.INFINITE = DurationKt.access$durationOfMillis(0x3FFFFFFFFFFFFFFFL);
        Duration.NEG_INFINITE = DurationKt.access$durationOfMillis(0xC000000000000001L);
    }

    private Duration(long v) {
        this.rawValue = v;
    }

    public static final long access$getINFINITE$cp-UwyO8pc() [...] // 潜在的解密器

    public static final long access$getNEG_INFINITE$cp-UwyO8pc() [...] // 潜在的解密器

    public static final long access$getZERO$cp-UwyO8pc() [...] // 潜在的解密器

    private static final long addValuesMixedRanges-UwyO8pc(long v, long v1, long v2) {
        long v3 = DurationKt.access$nanosToMillis(v2);
        long v4 = v1 + v3;
        return -4611686018426L > v4 || 4611686018426L < v4 ? DurationKt.access$durationOfMillis(RangesKt.coerceIn(v4, 0xC000000000000001L, 0x3FFFFFFFFFFFFFFFL)) : DurationKt.access$durationOfNanos(DurationKt.access$millisToNanos(v4) + (v2 - DurationKt.access$millisToNanos(v3)));
    }

    public static final Duration box-impl(long v) {
        return new Duration(v);
    }

    @Override
    public int compareTo(Object object0) {
        return this.compareTo-LRDsOJo(((Duration)object0).unbox-impl());
    }

    public static int compareTo-LRDsOJo(long v, long v1) {
        if((v ^ v1) >= 0L && (((int)(v ^ v1)) & 1) != 0) {
            int v2 = (((int)v) & 1) - (((int)v1) & 1);
            return Duration.isNegative-impl(v) ? -v2 : v2;
        }
        return Long.compare(v, v1);
    }

    public int compareTo-LRDsOJo(long v) {
        return Duration.compareTo-LRDsOJo(this.rawValue, v);
    }

    public static long constructor-impl(long v) {
        if(Duration.isInNanos-impl(v)) {
            if(0xC00000000005EB41L > v >> 1 || 0x3FFFFFFFFFFA14BFL < v >> 1) {
                throw new AssertionError((v >> 1) + " ns is out of nanoseconds range");
            }
            return v;
        }
        if(0xC000000000000001L > v >> 1 || 0x3FFFFFFFFFFFFFFFL < v >> 1) {
            throw new AssertionError((v >> 1) + " ms is out of milliseconds range");
        }
        if(-4611686018426L <= v >> 1 && 4611686018426L >= v >> 1) {
            throw new AssertionError((v >> 1) + " ms is denormalized");
        }
        return v;
    }

    public static final double div-LRDsOJo(long v, long v1) {
        TimeUnit timeUnit0 = (TimeUnit)ComparisonsKt.maxOf(Duration.getStorageUnit-impl(v), Duration.getStorageUnit-impl(v1));
        return Duration.toDouble-impl(v, timeUnit0) / Duration.toDouble-impl(v1, timeUnit0);
    }

    public static final long div-UwyO8pc(long v, double f) {
        int v1 = MathKt.roundToInt(f);
        if(((double)v1) == f && v1 != 0) {
            return Duration.div-UwyO8pc(v, v1);
        }
        TimeUnit timeUnit0 = Duration.getStorageUnit-impl(v);
        return DurationKt.toDuration(Duration.toDouble-impl(v, timeUnit0) / f, timeUnit0);
    }

    public static final long div-UwyO8pc(long v, int v1) {
        if(v1 == 0) {
            if(Duration.isPositive-impl(v)) {
                return Duration.INFINITE;
            }
            if(!Duration.isNegative-impl(v)) {
                throw new IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
            }
            return Duration.NEG_INFINITE;
        }
        if(Duration.isInNanos-impl(v)) {
            return DurationKt.access$durationOfNanos((v >> 1) / ((long)v1));
        }
        if(Duration.isInfinite-impl(v)) {
            return Duration.times-UwyO8pc(v, MathKt.getSign(v1));
        }
        long v2 = (v >> 1) / ((long)v1);
        return -4611686018426L > v2 || 4611686018426L < v2 ? DurationKt.access$durationOfMillis(v2) : DurationKt.access$durationOfNanos(DurationKt.access$millisToNanos(v2) + DurationKt.access$millisToNanos((v >> 1) - v2 * ((long)v1)) / ((long)v1));
    }

    @Override
    public boolean equals(Object object0) {
        return Duration.equals-impl(this.rawValue, object0);
    }

    public static boolean equals-impl(long v, Object object0) {
        return object0 instanceof Duration && v == ((Duration)object0).unbox-impl();
    }

    public static final boolean equals-impl0(long v, long v1) {
        return v == v1;
    }

    // 去混淆评级： 低(20)
    public static final long getAbsoluteValue-UwyO8pc(long v) {
        return Duration.isNegative-impl(v) ? Duration.unaryMinus-UwyO8pc(v) : v;
    }

    public static void getHoursComponent$annotations() {
    }

    // 去混淆评级： 低(20)
    public static final int getHoursComponent-impl(long v) {
        return Duration.isInfinite-impl(v) ? 0 : ((int)(Duration.getInWholeHours-impl(v) % 24L));
    }

    @Deprecated(message = "Use inWholeDays property instead or convert toDouble(DAYS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.DAYS)", imports = {}))
    public static void getInDays$annotations() {
    }

    public static final double getInDays-impl(long v) {
        return Duration.toDouble-impl(v, TimeUnit.DAYS);
    }

    @Deprecated(message = "Use inWholeHours property instead or convert toDouble(HOURS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.HOURS)", imports = {}))
    public static void getInHours$annotations() {
    }

    public static final double getInHours-impl(long v) {
        return Duration.toDouble-impl(v, TimeUnit.HOURS);
    }

    @Deprecated(message = "Use inWholeMicroseconds property instead or convert toDouble(MICROSECONDS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.MICROSECONDS)", imports = {}))
    public static void getInMicroseconds$annotations() {
    }

    public static final double getInMicroseconds-impl(long v) {
        return Duration.toDouble-impl(v, TimeUnit.MICROSECONDS);
    }

    @Deprecated(message = "Use inWholeMilliseconds property instead or convert toDouble(MILLISECONDS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.MILLISECONDS)", imports = {}))
    public static void getInMilliseconds$annotations() {
    }

    public static final double getInMilliseconds-impl(long v) {
        return Duration.toDouble-impl(v, TimeUnit.MILLISECONDS);
    }

    @Deprecated(message = "Use inWholeMinutes property instead or convert toDouble(MINUTES) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.MINUTES)", imports = {}))
    public static void getInMinutes$annotations() {
    }

    public static final double getInMinutes-impl(long v) {
        return Duration.toDouble-impl(v, TimeUnit.MINUTES);
    }

    @Deprecated(message = "Use inWholeNanoseconds property instead or convert toDouble(NANOSECONDS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.NANOSECONDS)", imports = {}))
    public static void getInNanoseconds$annotations() {
    }

    public static final double getInNanoseconds-impl(long v) {
        return Duration.toDouble-impl(v, TimeUnit.NANOSECONDS);
    }

    @Deprecated(message = "Use inWholeSeconds property instead or convert toDouble(SECONDS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.SECONDS)", imports = {}))
    public static void getInSeconds$annotations() {
    }

    public static final double getInSeconds-impl(long v) {
        return Duration.toDouble-impl(v, TimeUnit.SECONDS);
    }

    public static void getInWholeDays$annotations() {
    }

    public static final long getInWholeDays-impl(long v) {
        return Duration.toLong-impl(v, TimeUnit.DAYS);
    }

    public static void getInWholeHours$annotations() {
    }

    public static final long getInWholeHours-impl(long v) {
        return Duration.toLong-impl(v, TimeUnit.HOURS);
    }

    public static void getInWholeMicroseconds$annotations() {
    }

    public static final long getInWholeMicroseconds-impl(long v) {
        return Duration.toLong-impl(v, TimeUnit.MICROSECONDS);
    }

    public static void getInWholeMilliseconds$annotations() {
    }

    // 去混淆评级： 低(20)
    public static final long getInWholeMilliseconds-impl(long v) {
        return !Duration.isInMillis-impl(v) || !Duration.isFinite-impl(v) ? Duration.toLong-impl(v, TimeUnit.MILLISECONDS) : v >> 1;
    }

    public static void getInWholeMinutes$annotations() {
    }

    public static final long getInWholeMinutes-impl(long v) {
        return Duration.toLong-impl(v, TimeUnit.MINUTES);
    }

    public static void getInWholeNanoseconds$annotations() {
    }

    public static final long getInWholeNanoseconds-impl(long v) {
        if(!Duration.isInNanos-impl(v)) {
            if(v >> 1 > 0x8637BD05AF6L) {
                return 0x7FFFFFFFFFFFFFFFL;
            }
            return v >> 1 >= 0xFFFFF79C842FA50AL ? DurationKt.access$millisToNanos(v >> 1) : 0x8000000000000000L;
        }
        return v >> 1;
    }

    public static void getInWholeSeconds$annotations() {
    }

    public static final long getInWholeSeconds-impl(long v) {
        return Duration.toLong-impl(v, TimeUnit.SECONDS);
    }

    public static void getMinutesComponent$annotations() {
    }

    // 去混淆评级： 低(20)
    public static final int getMinutesComponent-impl(long v) {
        return Duration.isInfinite-impl(v) ? 0 : ((int)(Duration.getInWholeMinutes-impl(v) % 60L));
    }

    public static void getNanosecondsComponent$annotations() {
    }

    public static final int getNanosecondsComponent-impl(long v) {
        if(Duration.isInfinite-impl(v)) {
            return 0;
        }
        return Duration.isInMillis-impl(v) ? ((int)DurationKt.access$millisToNanos((v >> 1) % 1000L)) : ((int)((v >> 1) % 1000000000L));
    }

    public static void getSecondsComponent$annotations() {
    }

    // 去混淆评级： 低(20)
    public static final int getSecondsComponent-impl(long v) {
        return Duration.isInfinite-impl(v) ? 0 : ((int)(Duration.getInWholeSeconds-impl(v) % 60L));
    }

    // 去混淆评级： 低(20)
    private static final TimeUnit getStorageUnit-impl(long v) {
        return Duration.isInNanos-impl(v) ? TimeUnit.NANOSECONDS : TimeUnit.MILLISECONDS;
    }

    private static final int getUnitDiscriminator-impl(long v) {
        return ((int)v) & 1;
    }

    private static final long getValue-impl(long v) [...] // Inlined contents

    @Override
    public int hashCode() {
        return (int)(this.rawValue ^ this.rawValue >>> 0x20);
    }

    public static int hashCode-impl(long v) [...] // Inlined contents

    public static final boolean isFinite-impl(long v) {
        return !Duration.isInfinite-impl(v);
    }

    private static final boolean isInMillis-impl(long v) {
        return (((int)v) & 1) == 1;
    }

    private static final boolean isInNanos-impl(long v) {
        return (((int)v) & 1) == 0;
    }

    public static final boolean isInfinite-impl(long v) {
        return v == Duration.INFINITE || v == Duration.NEG_INFINITE;
    }

    public static final boolean isNegative-impl(long v) {
        return v < 0L;
    }

    public static final boolean isPositive-impl(long v) {
        return v > 0L;
    }

    public static final long minus-LRDsOJo(long v, long v1) {
        return Duration.plus-LRDsOJo(v, Duration.unaryMinus-UwyO8pc(v1));
    }

    public static final long plus-LRDsOJo(long v, long v1) {
        if(Duration.isInfinite-impl(v)) {
            if(!Duration.isFinite-impl(v1) && (v1 ^ v) < 0L) {
                throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
            }
            return v;
        }
        if(Duration.isInfinite-impl(v1)) {
            return v1;
        }
        if((((int)v) & 1) == (((int)v1) & 1)) {
            long v2 = (v >> 1) + (v1 >> 1);
            return Duration.isInNanos-impl(v) ? DurationKt.durationOfNanosNormalized(v2) : DurationKt.durationOfMillisNormalized(v2);
        }
        return Duration.isInMillis-impl(v) ? Duration.addValuesMixedRanges-UwyO8pc(v, v >> 1, v1 >> 1) : Duration.addValuesMixedRanges-UwyO8pc(v, v1 >> 1, v >> 1);
    }

    private static final int precision-impl(long v, double f) {
        if(f < 1.0) {
            return 3;
        }
        if(f < 10.0) {
            return 2;
        }
        return f < 100.0 ? 1 : 0;
    }

    public static final long times-UwyO8pc(long v, double f) {
        int v1 = MathKt.roundToInt(f);
        if(((double)v1) == f) {
            return Duration.times-UwyO8pc(v, v1);
        }
        TimeUnit timeUnit0 = Duration.getStorageUnit-impl(v);
        return DurationKt.toDuration(Duration.toDouble-impl(v, timeUnit0) * f, timeUnit0);
    }

    public static final long times-UwyO8pc(long v, int v1) {
        if(Duration.isInfinite-impl(v)) {
            if(v1 == 0) {
                throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
            }
            return v1 > 0 ? v : Duration.unaryMinus-UwyO8pc(v);
        }
        if(v1 == 0) {
            return Duration.ZERO;
        }
        long v2 = (v >> 1) * ((long)v1);
        if(Duration.isInNanos-impl(v)) {
            if(0xFFFFFFFF80000001L <= v >> 1 && 0x7FFFFFFFL >= v >> 1) {
                return DurationKt.durationOfNanos(v2);
            }
            if(v2 / ((long)v1) == v >> 1) {
                return DurationKt.durationOfNanosNormalized(v2);
            }
            long v3 = DurationKt.access$nanosToMillis(v >> 1);
            long v4 = v3 * ((long)v1);
            long v5 = DurationKt.access$nanosToMillis(((v >> 1) - DurationKt.access$millisToNanos(v3)) * ((long)v1)) + v4;
            if(v4 / ((long)v1) == v3 && (v5 ^ v4) >= 0L) {
                return DurationKt.durationOfMillis(RangesKt.coerceIn(v5, new LongRange(0xC000000000000001L, 0x3FFFFFFFFFFFFFFFL)));
            }
            return MathKt.getSign(v >> 1) * MathKt.getSign(v1) <= 0 ? Duration.NEG_INFINITE : Duration.INFINITE;
        }
        if(v2 / ((long)v1) == v >> 1) {
            return DurationKt.durationOfMillis(RangesKt.coerceIn(v2, new LongRange(0xC000000000000001L, 0x3FFFFFFFFFFFFFFFL)));
        }
        return MathKt.getSign(v >> 1) * MathKt.getSign(v1) <= 0 ? Duration.NEG_INFINITE : Duration.INFINITE;
    }

    public static final Object toComponents-impl(long v, Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "action");
        return function20.invoke(Duration.getInWholeSeconds-impl(v), Duration.getNanosecondsComponent-impl(v));
    }

    public static final Object toComponents-impl(long v, Function3 function30) {
        Intrinsics.checkNotNullParameter(function30, "action");
        return function30.invoke(Duration.toInt-impl(v, TimeUnit.MINUTES), Duration.getSecondsComponent-impl(v), Duration.getNanosecondsComponent-impl(v));
    }

    public static final Object toComponents-impl(long v, Function4 function40) {
        Intrinsics.checkNotNullParameter(function40, "action");
        return function40.invoke(Duration.toInt-impl(v, TimeUnit.HOURS), Duration.getMinutesComponent-impl(v), Duration.getSecondsComponent-impl(v), Duration.getNanosecondsComponent-impl(v));
    }

    public static final Object toComponents-impl(long v, Function5 function50) {
        Intrinsics.checkNotNullParameter(function50, "action");
        return function50.invoke(Duration.toInt-impl(v, TimeUnit.DAYS), Duration.getHoursComponent-impl(v), Duration.getMinutesComponent-impl(v), Duration.getSecondsComponent-impl(v), Duration.getNanosecondsComponent-impl(v));
    }

    public static final double toDouble-impl(long v, TimeUnit timeUnit0) {
        Intrinsics.checkNotNullParameter(timeUnit0, "unit");
        if(v == Duration.INFINITE) {
            return Infinity;
        }
        return v == Duration.NEG_INFINITE ? -Infinity : DurationUnitKt.convertDurationUnit(v >> 1, Duration.getStorageUnit-impl(v), timeUnit0);
    }

    public static final int toInt-impl(long v, TimeUnit timeUnit0) {
        Intrinsics.checkNotNullParameter(timeUnit0, "unit");
        return (int)RangesKt.coerceIn(Duration.toLong-impl(v, timeUnit0), 0xFFFFFFFF80000000L, 0x7FFFFFFFL);
    }

    public static final String toIsoString-impl(long v) {
        StringBuilder stringBuilder0 = new StringBuilder();
        if(Duration.isNegative-impl(v)) {
            stringBuilder0.append('-');
        }
        stringBuilder0.append("PT");
        long v1 = Duration.getAbsoluteValue-UwyO8pc(v);
        int v2 = Duration.toInt-impl(v1, TimeUnit.HOURS);
        int v3 = Duration.getMinutesComponent-impl(v1);
        int v4 = Duration.getSecondsComponent-impl(v1);
        int v5 = Duration.getNanosecondsComponent-impl(v1);
        boolean z = true;
        boolean z1 = v4 != 0 || v5 != 0;
        if(v3 == 0 && (!z1 || v2 == 0)) {
            z = false;
        }
        if(v2 != 0) {
            stringBuilder0.append(v2);
            stringBuilder0.append('H');
        }
        if(z) {
            stringBuilder0.append(v3);
            stringBuilder0.append('M');
        }
        if(z1 || v2 == 0 && !z) {
            stringBuilder0.append(v4);
            if(v5 != 0) {
                stringBuilder0.append('.');
                String s = StringsKt.padStart(String.valueOf(v5), 9, '0');
                if(v5 % 1000000 == 0) {
                    stringBuilder0.append(s, 0, 3);
                    Intrinsics.checkNotNullExpressionValue(stringBuilder0, "this.append(value, startIndex, endIndex)");
                }
                else if(v5 % 1000 == 0) {
                    stringBuilder0.append(s, 0, 6);
                    Intrinsics.checkNotNullExpressionValue(stringBuilder0, "this.append(value, startIndex, endIndex)");
                }
                else {
                    stringBuilder0.append(s);
                }
            }
            stringBuilder0.append('S');
        }
        String s1 = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s1, "StringBuilder().apply(builderAction).toString()");
        return s1;
    }

    public static final long toLong-impl(long v, TimeUnit timeUnit0) {
        Intrinsics.checkNotNullParameter(timeUnit0, "unit");
        if(v == Duration.INFINITE) {
            return 0x7FFFFFFFFFFFFFFFL;
        }
        return v == Duration.NEG_INFINITE ? 0x8000000000000000L : DurationUnitKt.convertDurationUnit(v >> 1, Duration.getStorageUnit-impl(v), timeUnit0);
    }

    @Deprecated(message = "Use inWholeMilliseconds property instead.", replaceWith = @ReplaceWith(expression = "this.inWholeMilliseconds", imports = {}))
    public static final long toLongMilliseconds-impl(long v) {
        return Duration.getInWholeMilliseconds-impl(v);
    }

    @Deprecated(message = "Use inWholeNanoseconds property instead.", replaceWith = @ReplaceWith(expression = "this.inWholeNanoseconds", imports = {}))
    public static final long toLongNanoseconds-impl(long v) {
        return Duration.getInWholeNanoseconds-impl(v);
    }

    @Override
    public String toString() {
        return Duration.toString-impl(this.rawValue);
    }

    public static String toString-impl(long v) {
        String s;
        int v1;
        TimeUnit timeUnit0;
        if(v == 0L) {
            return "0s";
        }
        if(v == Duration.INFINITE) {
            return "Infinity";
        }
        if(v == Duration.NEG_INFINITE) {
            return "-Infinity";
        }
        double f = Duration.toDouble-impl(Duration.getAbsoluteValue-UwyO8pc(v), TimeUnit.NANOSECONDS);
        boolean z = false;
        if(f < 0.000001) {
            timeUnit0 = TimeUnit.SECONDS;
            v1 = 0;
            z = true;
        }
        else if(f < 1.0) {
            timeUnit0 = TimeUnit.NANOSECONDS;
            v1 = 7;
        }
        else if(f < 1000.0) {
            timeUnit0 = TimeUnit.NANOSECONDS;
            v1 = 0;
        }
        else if(f < 1000000.0) {
            timeUnit0 = TimeUnit.MICROSECONDS;
            v1 = 0;
        }
        else if(f < 1000000000.0) {
            timeUnit0 = TimeUnit.MILLISECONDS;
            v1 = 0;
        }
        else if(f < 1000000000000.0) {
            timeUnit0 = TimeUnit.SECONDS;
            v1 = 0;
        }
        else if(f < 60000000000000.0) {
            timeUnit0 = TimeUnit.MINUTES;
            v1 = 0;
        }
        else if(f < 3600000000000000.0) {
            timeUnit0 = TimeUnit.HOURS;
            v1 = 0;
        }
        else if(f < 864000000000000000000.0) {
            timeUnit0 = TimeUnit.DAYS;
            v1 = 0;
        }
        else {
            timeUnit0 = TimeUnit.DAYS;
            v1 = 0;
            z = true;
        }
        double f1 = Duration.toDouble-impl(v, timeUnit0);
        StringBuilder stringBuilder0 = new StringBuilder();
        if(z) {
            s = FormatToDecimalsKt.formatScientific(f1);
        }
        else {
            s = v1 <= 0 ? FormatToDecimalsKt.formatToExactDecimals(f1, Duration.precision-impl(v, Math.abs(f1))) : FormatToDecimalsKt.formatUpToDecimals(f1, v1);
        }
        stringBuilder0.append(s);
        stringBuilder0.append(DurationUnitKt.shortName(timeUnit0));
        return stringBuilder0.toString();
    }

    public static final String toString-impl(long v, TimeUnit timeUnit0, int v1) {
        Intrinsics.checkNotNullParameter(timeUnit0, "unit");
        if(v1 < 0) {
            throw new IllegalArgumentException(("decimals must be not negative, but was " + v1).toString());
        }
        double f = Duration.toDouble-impl(v, timeUnit0);
        return Double.isInfinite(f) ? String.valueOf(f) : (Math.abs(f) < 100000000000000.0 ? FormatToDecimalsKt.formatToExactDecimals(f, RangesKt.coerceAtMost(v1, 12)) : FormatToDecimalsKt.formatScientific(f)) + DurationUnitKt.shortName(timeUnit0);
    }

    public static String toString-impl$default(long v, TimeUnit timeUnit0, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v1 = 0;
        }
        return Duration.toString-impl(v, timeUnit0, v1);
    }

    public static final long unaryMinus-UwyO8pc(long v) {
        return DurationKt.durationOf(-(v >> 1), ((int)v) & 1);
    }

    public final long unbox-impl() {
        return this.rawValue;
    }
}

