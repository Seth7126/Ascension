package kotlin.text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CharIterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

@Metadata(d1 = {"\u0000|\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001E\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0019\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b!\u001A\u001C\u0010\t\u001A\u00020\n*\u00020\u00022\u0006\u0010\u000B\u001A\u00020\u00022\b\b\u0002\u0010\f\u001A\u00020\r\u001A\u001C\u0010\u000E\u001A\u00020\n*\u00020\u00022\u0006\u0010\u000B\u001A\u00020\u00022\b\b\u0002\u0010\f\u001A\u00020\r\u001A\u001F\u0010\u000F\u001A\u00020\r*\u00020\u00022\u0006\u0010\u0010\u001A\u00020\u00112\b\b\u0002\u0010\f\u001A\u00020\rH\u0086\u0002\u001A\u001F\u0010\u000F\u001A\u00020\r*\u00020\u00022\u0006\u0010\u000B\u001A\u00020\u00022\b\b\u0002\u0010\f\u001A\u00020\rH\u0086\u0002\u001A\u0015\u0010\u000F\u001A\u00020\r*\u00020\u00022\u0006\u0010\u0012\u001A\u00020\u0013H\u0087\n\u001A\u0018\u0010\u0014\u001A\u00020\r*\u0004\u0018\u00010\u00022\b\u0010\u000B\u001A\u0004\u0018\u00010\u0002H\u0000\u001A\u0018\u0010\u0015\u001A\u00020\r*\u0004\u0018\u00010\u00022\b\u0010\u000B\u001A\u0004\u0018\u00010\u0002H\u0000\u001A\u001C\u0010\u0016\u001A\u00020\r*\u00020\u00022\u0006\u0010\u0010\u001A\u00020\u00112\b\b\u0002\u0010\f\u001A\u00020\r\u001A\u001C\u0010\u0016\u001A\u00020\r*\u00020\u00022\u0006\u0010\u0017\u001A\u00020\u00022\b\b\u0002\u0010\f\u001A\u00020\r\u001A:\u0010\u0018\u001A\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\u0019*\u00020\u00022\f\u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\n0\u001B2\b\b\u0002\u0010\u001C\u001A\u00020\u00062\b\b\u0002\u0010\f\u001A\u00020\r\u001AE\u0010\u0018\u001A\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\u0019*\u00020\u00022\f\u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\n0\u001B2\u0006\u0010\u001C\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\r2\u0006\u0010\u001D\u001A\u00020\rH\u0002\u00A2\u0006\u0002\b\u001E\u001A:\u0010\u001F\u001A\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\u0019*\u00020\u00022\f\u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\n0\u001B2\b\b\u0002\u0010\u001C\u001A\u00020\u00062\b\b\u0002\u0010\f\u001A\u00020\r\u001A\u0012\u0010 \u001A\u00020\r*\u00020\u00022\u0006\u0010!\u001A\u00020\u0006\u001A7\u0010\"\u001A\u0002H#\"\f\b\u0000\u0010$*\u00020\u0002*\u0002H#\"\u0004\b\u0001\u0010#*\u0002H$2\f\u0010%\u001A\b\u0012\u0004\u0012\u0002H#0&H\u0087\b\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010\'\u001A7\u0010(\u001A\u0002H#\"\f\b\u0000\u0010$*\u00020\u0002*\u0002H#\"\u0004\b\u0001\u0010#*\u0002H$2\f\u0010%\u001A\b\u0012\u0004\u0012\u0002H#0&H\u0087\b\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010\'\u001A&\u0010)\u001A\u00020\u0006*\u00020\u00022\u0006\u0010\u0010\u001A\u00020\u00112\b\b\u0002\u0010\u001C\u001A\u00020\u00062\b\b\u0002\u0010\f\u001A\u00020\r\u001A;\u0010)\u001A\u00020\u0006*\u00020\u00022\u0006\u0010\u000B\u001A\u00020\u00022\u0006\u0010\u001C\u001A\u00020\u00062\u0006\u0010*\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\r2\b\b\u0002\u0010\u001D\u001A\u00020\rH\u0002\u00A2\u0006\u0002\b+\u001A&\u0010)\u001A\u00020\u0006*\u00020\u00022\u0006\u0010,\u001A\u00020\n2\b\b\u0002\u0010\u001C\u001A\u00020\u00062\b\b\u0002\u0010\f\u001A\u00020\r\u001A&\u0010-\u001A\u00020\u0006*\u00020\u00022\u0006\u0010.\u001A\u00020/2\b\b\u0002\u0010\u001C\u001A\u00020\u00062\b\b\u0002\u0010\f\u001A\u00020\r\u001A,\u0010-\u001A\u00020\u0006*\u00020\u00022\f\u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\n0\u001B2\b\b\u0002\u0010\u001C\u001A\u00020\u00062\b\b\u0002\u0010\f\u001A\u00020\r\u001A\r\u00100\u001A\u00020\r*\u00020\u0002H\u0087\b\u001A\r\u00101\u001A\u00020\r*\u00020\u0002H\u0087\b\u001A\r\u00102\u001A\u00020\r*\u00020\u0002H\u0087\b\u001A \u00103\u001A\u00020\r*\u0004\u0018\u00010\u0002H\u0087\b\u0082\u0002\u000E\n\f\b\u0000\u0012\u0002\u0018\u0001\u001A\u0004\b\u0003\u0010\u0000\u001A \u00104\u001A\u00020\r*\u0004\u0018\u00010\u0002H\u0087\b\u0082\u0002\u000E\n\f\b\u0000\u0012\u0002\u0018\u0001\u001A\u0004\b\u0003\u0010\u0000\u001A\r\u00105\u001A\u000206*\u00020\u0002H\u0086\u0002\u001A&\u00107\u001A\u00020\u0006*\u00020\u00022\u0006\u0010\u0010\u001A\u00020\u00112\b\b\u0002\u0010\u001C\u001A\u00020\u00062\b\b\u0002\u0010\f\u001A\u00020\r\u001A&\u00107\u001A\u00020\u0006*\u00020\u00022\u0006\u0010,\u001A\u00020\n2\b\b\u0002\u0010\u001C\u001A\u00020\u00062\b\b\u0002\u0010\f\u001A\u00020\r\u001A&\u00108\u001A\u00020\u0006*\u00020\u00022\u0006\u0010.\u001A\u00020/2\b\b\u0002\u0010\u001C\u001A\u00020\u00062\b\b\u0002\u0010\f\u001A\u00020\r\u001A,\u00108\u001A\u00020\u0006*\u00020\u00022\f\u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\n0\u001B2\b\b\u0002\u0010\u001C\u001A\u00020\u00062\b\b\u0002\u0010\f\u001A\u00020\r\u001A\u0010\u00109\u001A\b\u0012\u0004\u0012\u00020\n0:*\u00020\u0002\u001A\u0010\u0010;\u001A\b\u0012\u0004\u0012\u00020\n0<*\u00020\u0002\u001A\u0015\u0010=\u001A\u00020\r*\u00020\u00022\u0006\u0010\u0012\u001A\u00020\u0013H\u0087\f\u001A\u000F\u0010>\u001A\u00020\n*\u0004\u0018\u00010\nH\u0087\b\u001A\u001C\u0010?\u001A\u00020\u0002*\u00020\u00022\u0006\u0010@\u001A\u00020\u00062\b\b\u0002\u0010A\u001A\u00020\u0011\u001A\u001C\u0010?\u001A\u00020\n*\u00020\n2\u0006\u0010@\u001A\u00020\u00062\b\b\u0002\u0010A\u001A\u00020\u0011\u001A\u001C\u0010B\u001A\u00020\u0002*\u00020\u00022\u0006\u0010@\u001A\u00020\u00062\b\b\u0002\u0010A\u001A\u00020\u0011\u001A\u001C\u0010B\u001A\u00020\n*\u00020\n2\u0006\u0010@\u001A\u00020\u00062\b\b\u0002\u0010A\u001A\u00020\u0011\u001AG\u0010C\u001A\b\u0012\u0004\u0012\u00020\u00010:*\u00020\u00022\u000E\u0010D\u001A\n\u0012\u0006\b\u0001\u0012\u00020\n0E2\b\b\u0002\u0010\u001C\u001A\u00020\u00062\b\b\u0002\u0010\f\u001A\u00020\r2\b\b\u0002\u0010F\u001A\u00020\u0006H\u0002\u00A2\u0006\u0004\bG\u0010H\u001A=\u0010C\u001A\b\u0012\u0004\u0012\u00020\u00010:*\u00020\u00022\u0006\u0010D\u001A\u00020/2\b\b\u0002\u0010\u001C\u001A\u00020\u00062\b\b\u0002\u0010\f\u001A\u00020\r2\b\b\u0002\u0010F\u001A\u00020\u0006H\u0002\u00A2\u0006\u0002\bG\u001A4\u0010I\u001A\u00020\r*\u00020\u00022\u0006\u0010J\u001A\u00020\u00062\u0006\u0010\u000B\u001A\u00020\u00022\u0006\u0010K\u001A\u00020\u00062\u0006\u0010@\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\rH\u0000\u001A\u0012\u0010L\u001A\u00020\u0002*\u00020\u00022\u0006\u0010M\u001A\u00020\u0002\u001A\u0012\u0010L\u001A\u00020\n*\u00020\n2\u0006\u0010M\u001A\u00020\u0002\u001A\u001A\u0010N\u001A\u00020\u0002*\u00020\u00022\u0006\u0010\u001C\u001A\u00020\u00062\u0006\u0010*\u001A\u00020\u0006\u001A\u0012\u0010N\u001A\u00020\u0002*\u00020\u00022\u0006\u0010O\u001A\u00020\u0001\u001A\u001D\u0010N\u001A\u00020\n*\u00020\n2\u0006\u0010\u001C\u001A\u00020\u00062\u0006\u0010*\u001A\u00020\u0006H\u0087\b\u001A\u0015\u0010N\u001A\u00020\n*\u00020\n2\u0006\u0010O\u001A\u00020\u0001H\u0087\b\u001A\u0012\u0010P\u001A\u00020\u0002*\u00020\u00022\u0006\u0010\u0017\u001A\u00020\u0002\u001A\u0012\u0010P\u001A\u00020\n*\u00020\n2\u0006\u0010\u0017\u001A\u00020\u0002\u001A\u0012\u0010Q\u001A\u00020\u0002*\u00020\u00022\u0006\u0010R\u001A\u00020\u0002\u001A\u001A\u0010Q\u001A\u00020\u0002*\u00020\u00022\u0006\u0010M\u001A\u00020\u00022\u0006\u0010\u0017\u001A\u00020\u0002\u001A\u0012\u0010Q\u001A\u00020\n*\u00020\n2\u0006\u0010R\u001A\u00020\u0002\u001A\u001A\u0010Q\u001A\u00020\n*\u00020\n2\u0006\u0010M\u001A\u00020\u00022\u0006\u0010\u0017\u001A\u00020\u0002\u001A.\u0010S\u001A\u00020\n*\u00020\u00022\u0006\u0010\u0012\u001A\u00020\u00132\u0014\b\b\u0010T\u001A\u000E\u0012\u0004\u0012\u00020V\u0012\u0004\u0012\u00020\u00020UH\u0087\b\u00F8\u0001\u0000\u001A\u001D\u0010S\u001A\u00020\n*\u00020\u00022\u0006\u0010\u0012\u001A\u00020\u00132\u0006\u0010W\u001A\u00020\nH\u0087\b\u001A$\u0010X\u001A\u00020\n*\u00020\n2\u0006\u0010R\u001A\u00020\u00112\u0006\u0010W\u001A\u00020\n2\b\b\u0002\u0010Y\u001A\u00020\n\u001A$\u0010X\u001A\u00020\n*\u00020\n2\u0006\u0010R\u001A\u00020\n2\u0006\u0010W\u001A\u00020\n2\b\b\u0002\u0010Y\u001A\u00020\n\u001A$\u0010Z\u001A\u00020\n*\u00020\n2\u0006\u0010R\u001A\u00020\u00112\u0006\u0010W\u001A\u00020\n2\b\b\u0002\u0010Y\u001A\u00020\n\u001A$\u0010Z\u001A\u00020\n*\u00020\n2\u0006\u0010R\u001A\u00020\n2\u0006\u0010W\u001A\u00020\n2\b\b\u0002\u0010Y\u001A\u00020\n\u001A$\u0010[\u001A\u00020\n*\u00020\n2\u0006\u0010R\u001A\u00020\u00112\u0006\u0010W\u001A\u00020\n2\b\b\u0002\u0010Y\u001A\u00020\n\u001A$\u0010[\u001A\u00020\n*\u00020\n2\u0006\u0010R\u001A\u00020\n2\u0006\u0010W\u001A\u00020\n2\b\b\u0002\u0010Y\u001A\u00020\n\u001A$\u0010\\\u001A\u00020\n*\u00020\n2\u0006\u0010R\u001A\u00020\u00112\u0006\u0010W\u001A\u00020\n2\b\b\u0002\u0010Y\u001A\u00020\n\u001A$\u0010\\\u001A\u00020\n*\u00020\n2\u0006\u0010R\u001A\u00020\n2\u0006\u0010W\u001A\u00020\n2\b\b\u0002\u0010Y\u001A\u00020\n\u001A\u001D\u0010]\u001A\u00020\n*\u00020\u00022\u0006\u0010\u0012\u001A\u00020\u00132\u0006\u0010W\u001A\u00020\nH\u0087\b\u001A)\u0010^\u001A\u00020\n*\u00020\n2\u0012\u0010T\u001A\u000E\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110UH\u0087\b\u00F8\u0001\u0000\u00A2\u0006\u0002\b_\u001A)\u0010^\u001A\u00020\n*\u00020\n2\u0012\u0010T\u001A\u000E\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00020UH\u0087\b\u00F8\u0001\u0000\u00A2\u0006\u0002\b`\u001A\"\u0010a\u001A\u00020\u0002*\u00020\u00022\u0006\u0010\u001C\u001A\u00020\u00062\u0006\u0010*\u001A\u00020\u00062\u0006\u0010W\u001A\u00020\u0002\u001A\u001A\u0010a\u001A\u00020\u0002*\u00020\u00022\u0006\u0010O\u001A\u00020\u00012\u0006\u0010W\u001A\u00020\u0002\u001A%\u0010a\u001A\u00020\n*\u00020\n2\u0006\u0010\u001C\u001A\u00020\u00062\u0006\u0010*\u001A\u00020\u00062\u0006\u0010W\u001A\u00020\u0002H\u0087\b\u001A\u001D\u0010a\u001A\u00020\n*\u00020\n2\u0006\u0010O\u001A\u00020\u00012\u0006\u0010W\u001A\u00020\u0002H\u0087\b\u001A=\u0010b\u001A\b\u0012\u0004\u0012\u00020\n0<*\u00020\u00022\u0012\u0010D\u001A\n\u0012\u0006\b\u0001\u0012\u00020\n0E\"\u00020\n2\b\b\u0002\u0010\f\u001A\u00020\r2\b\b\u0002\u0010F\u001A\u00020\u0006\u00A2\u0006\u0002\u0010c\u001A0\u0010b\u001A\b\u0012\u0004\u0012\u00020\n0<*\u00020\u00022\n\u0010D\u001A\u00020/\"\u00020\u00112\b\b\u0002\u0010\f\u001A\u00020\r2\b\b\u0002\u0010F\u001A\u00020\u0006\u001A/\u0010b\u001A\b\u0012\u0004\u0012\u00020\n0<*\u00020\u00022\u0006\u0010R\u001A\u00020\n2\u0006\u0010\f\u001A\u00020\r2\u0006\u0010F\u001A\u00020\u0006H\u0002\u00A2\u0006\u0002\bd\u001A%\u0010b\u001A\b\u0012\u0004\u0012\u00020\n0<*\u00020\u00022\u0006\u0010\u0012\u001A\u00020\u00132\b\b\u0002\u0010F\u001A\u00020\u0006H\u0087\b\u001A=\u0010e\u001A\b\u0012\u0004\u0012\u00020\n0:*\u00020\u00022\u0012\u0010D\u001A\n\u0012\u0006\b\u0001\u0012\u00020\n0E\"\u00020\n2\b\b\u0002\u0010\f\u001A\u00020\r2\b\b\u0002\u0010F\u001A\u00020\u0006\u00A2\u0006\u0002\u0010f\u001A0\u0010e\u001A\b\u0012\u0004\u0012\u00020\n0:*\u00020\u00022\n\u0010D\u001A\u00020/\"\u00020\u00112\b\b\u0002\u0010\f\u001A\u00020\r2\b\b\u0002\u0010F\u001A\u00020\u0006\u001A\u001C\u0010g\u001A\u00020\r*\u00020\u00022\u0006\u0010\u0010\u001A\u00020\u00112\b\b\u0002\u0010\f\u001A\u00020\r\u001A\u001C\u0010g\u001A\u00020\r*\u00020\u00022\u0006\u0010M\u001A\u00020\u00022\b\b\u0002\u0010\f\u001A\u00020\r\u001A$\u0010g\u001A\u00020\r*\u00020\u00022\u0006\u0010M\u001A\u00020\u00022\u0006\u0010\u001C\u001A\u00020\u00062\b\b\u0002\u0010\f\u001A\u00020\r\u001A\u0012\u0010h\u001A\u00020\u0002*\u00020\u00022\u0006\u0010O\u001A\u00020\u0001\u001A\u001D\u0010h\u001A\u00020\u0002*\u00020\n2\u0006\u0010i\u001A\u00020\u00062\u0006\u0010j\u001A\u00020\u0006H\u0087\b\u001A\u001F\u0010k\u001A\u00020\n*\u00020\u00022\u0006\u0010\u001C\u001A\u00020\u00062\b\b\u0002\u0010*\u001A\u00020\u0006H\u0087\b\u001A\u0012\u0010k\u001A\u00020\n*\u00020\u00022\u0006\u0010O\u001A\u00020\u0001\u001A\u0012\u0010k\u001A\u00020\n*\u00020\n2\u0006\u0010O\u001A\u00020\u0001\u001A\u001C\u0010l\u001A\u00020\n*\u00020\n2\u0006\u0010R\u001A\u00020\u00112\b\b\u0002\u0010Y\u001A\u00020\n\u001A\u001C\u0010l\u001A\u00020\n*\u00020\n2\u0006\u0010R\u001A\u00020\n2\b\b\u0002\u0010Y\u001A\u00020\n\u001A\u001C\u0010m\u001A\u00020\n*\u00020\n2\u0006\u0010R\u001A\u00020\u00112\b\b\u0002\u0010Y\u001A\u00020\n\u001A\u001C\u0010m\u001A\u00020\n*\u00020\n2\u0006\u0010R\u001A\u00020\n2\b\b\u0002\u0010Y\u001A\u00020\n\u001A\u001C\u0010n\u001A\u00020\n*\u00020\n2\u0006\u0010R\u001A\u00020\u00112\b\b\u0002\u0010Y\u001A\u00020\n\u001A\u001C\u0010n\u001A\u00020\n*\u00020\n2\u0006\u0010R\u001A\u00020\n2\b\b\u0002\u0010Y\u001A\u00020\n\u001A\u001C\u0010o\u001A\u00020\n*\u00020\n2\u0006\u0010R\u001A\u00020\u00112\b\b\u0002\u0010Y\u001A\u00020\n\u001A\u001C\u0010o\u001A\u00020\n*\u00020\n2\u0006\u0010R\u001A\u00020\n2\b\b\u0002\u0010Y\u001A\u00020\n\u001A\f\u0010p\u001A\u00020\r*\u00020\nH\u0007\u001A\u0013\u0010q\u001A\u0004\u0018\u00010\r*\u00020\nH\u0007\u00A2\u0006\u0002\u0010r\u001A\n\u0010s\u001A\u00020\u0002*\u00020\u0002\u001A$\u0010s\u001A\u00020\u0002*\u00020\u00022\u0012\u0010t\u001A\u000E\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0UH\u0086\b\u00F8\u0001\u0000\u001A\u0016\u0010s\u001A\u00020\u0002*\u00020\u00022\n\u0010.\u001A\u00020/\"\u00020\u0011\u001A\r\u0010s\u001A\u00020\n*\u00020\nH\u0087\b\u001A$\u0010s\u001A\u00020\n*\u00020\n2\u0012\u0010t\u001A\u000E\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0UH\u0086\b\u00F8\u0001\u0000\u001A\u0016\u0010s\u001A\u00020\n*\u00020\n2\n\u0010.\u001A\u00020/\"\u00020\u0011\u001A\n\u0010u\u001A\u00020\u0002*\u00020\u0002\u001A$\u0010u\u001A\u00020\u0002*\u00020\u00022\u0012\u0010t\u001A\u000E\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0UH\u0086\b\u00F8\u0001\u0000\u001A\u0016\u0010u\u001A\u00020\u0002*\u00020\u00022\n\u0010.\u001A\u00020/\"\u00020\u0011\u001A\r\u0010u\u001A\u00020\n*\u00020\nH\u0087\b\u001A$\u0010u\u001A\u00020\n*\u00020\n2\u0012\u0010t\u001A\u000E\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0UH\u0086\b\u00F8\u0001\u0000\u001A\u0016\u0010u\u001A\u00020\n*\u00020\n2\n\u0010.\u001A\u00020/\"\u00020\u0011\u001A\n\u0010v\u001A\u00020\u0002*\u00020\u0002\u001A$\u0010v\u001A\u00020\u0002*\u00020\u00022\u0012\u0010t\u001A\u000E\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0UH\u0086\b\u00F8\u0001\u0000\u001A\u0016\u0010v\u001A\u00020\u0002*\u00020\u00022\n\u0010.\u001A\u00020/\"\u00020\u0011\u001A\r\u0010v\u001A\u00020\n*\u00020\nH\u0087\b\u001A$\u0010v\u001A\u00020\n*\u00020\n2\u0012\u0010t\u001A\u000E\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0UH\u0086\b\u00F8\u0001\u0000\u001A\u0016\u0010v\u001A\u00020\n*\u00020\n2\n\u0010.\u001A\u00020/\"\u00020\u0011\"\u0015\u0010\u0000\u001A\u00020\u0001*\u00020\u00028F\u00A2\u0006\u0006\u001A\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001A\u00020\u0006*\u00020\u00028F\u00A2\u0006\u0006\u001A\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00A8\u0006w"}, d2 = {"indices", "Lkotlin/ranges/IntRange;", "", "getIndices", "(Ljava/lang/CharSequence;)Lkotlin/ranges/IntRange;", "lastIndex", "", "getLastIndex", "(Ljava/lang/CharSequence;)I", "commonPrefixWith", "", "other", "ignoreCase", "", "commonSuffixWith", "contains", "char", "", "regex", "Lkotlin/text/Regex;", "contentEqualsIgnoreCaseImpl", "contentEqualsImpl", "endsWith", "suffix", "findAnyOf", "Lkotlin/Pair;", "strings", "", "startIndex", "last", "findAnyOf$StringsKt__StringsKt", "findLastAnyOf", "hasSurrogatePairAt", "index", "ifBlank", "R", "C", "defaultValue", "Lkotlin/Function0;", "(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "ifEmpty", "indexOf", "endIndex", "indexOf$StringsKt__StringsKt", "string", "indexOfAny", "chars", "", "isEmpty", "isNotBlank", "isNotEmpty", "isNullOrBlank", "isNullOrEmpty", "iterator", "Lkotlin/collections/CharIterator;", "lastIndexOf", "lastIndexOfAny", "lineSequence", "Lkotlin/sequences/Sequence;", "lines", "", "matches", "orEmpty", "padEnd", "length", "padChar", "padStart", "rangesDelimitedBy", "delimiters", "", "limit", "rangesDelimitedBy$StringsKt__StringsKt", "(Ljava/lang/CharSequence;[Ljava/lang/String;IZI)Lkotlin/sequences/Sequence;", "regionMatchesImpl", "thisOffset", "otherOffset", "removePrefix", "prefix", "removeRange", "range", "removeSuffix", "removeSurrounding", "delimiter", "replace", "transform", "Lkotlin/Function1;", "Lkotlin/text/MatchResult;", "replacement", "replaceAfter", "missingDelimiterValue", "replaceAfterLast", "replaceBefore", "replaceBeforeLast", "replaceFirst", "replaceFirstChar", "replaceFirstCharWithChar", "replaceFirstCharWithCharSequence", "replaceRange", "split", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Ljava/util/List;", "split$StringsKt__StringsKt", "splitToSequence", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Lkotlin/sequences/Sequence;", "startsWith", "subSequence", "start", "end", "substring", "substringAfter", "substringAfterLast", "substringBefore", "substringBeforeLast", "toBooleanStrict", "toBooleanStrictOrNull", "(Ljava/lang/String;)Ljava/lang/Boolean;", "trim", "predicate", "trimEnd", "trimStart", "kotlin-stdlib"}, k = 5, mv = {1, 5, 1}, xi = 1, xs = "kotlin/text/StringsKt")
class StringsKt__StringsKt extends StringsKt__StringsJVMKt {
    public static final String commonPrefixWith(CharSequence charSequence0, CharSequence charSequence1, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence0, "$this$commonPrefixWith");
        Intrinsics.checkNotNullParameter(charSequence1, "other");
        int v = Math.min(charSequence0.length(), charSequence1.length());
        int v1;
        for(v1 = 0; v1 < v && CharsKt.equals(charSequence0.charAt(v1), charSequence1.charAt(v1), z); ++v1) {
        }
        if(StringsKt.hasSurrogatePairAt(charSequence0, v1 - 1) || StringsKt.hasSurrogatePairAt(charSequence1, v1 - 1)) {
            --v1;
        }
        return charSequence0.subSequence(0, v1).toString();
    }

    public static String commonPrefixWith$default(CharSequence charSequence0, CharSequence charSequence1, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return StringsKt.commonPrefixWith(charSequence0, charSequence1, z);
    }

    public static final String commonSuffixWith(CharSequence charSequence0, CharSequence charSequence1, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence0, "$this$commonSuffixWith");
        Intrinsics.checkNotNullParameter(charSequence1, "other");
        int v = charSequence0.length();
        int v1 = charSequence1.length();
        int v2 = Math.min(v, v1);
        int v3;
        for(v3 = 0; v3 < v2 && CharsKt.equals(charSequence0.charAt(v - v3 - 1), charSequence1.charAt(v1 - v3 - 1), z); ++v3) {
        }
        if(StringsKt.hasSurrogatePairAt(charSequence0, v - v3 - 1) || StringsKt.hasSurrogatePairAt(charSequence1, v1 - v3 - 1)) {
            --v3;
        }
        return charSequence0.subSequence(v - v3, v).toString();
    }

    public static String commonSuffixWith$default(CharSequence charSequence0, CharSequence charSequence1, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return StringsKt.commonSuffixWith(charSequence0, charSequence1, z);
    }

    public static final boolean contains(CharSequence charSequence0, char c, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence0, "$this$contains");
        return StringsKt.indexOf$default(charSequence0, c, 0, z, 2, null) >= 0;
    }

    public static final boolean contains(CharSequence charSequence0, CharSequence charSequence1, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence0, "$this$contains");
        Intrinsics.checkNotNullParameter(charSequence1, "other");
        return charSequence1 instanceof String ? StringsKt.indexOf$default(charSequence0, ((String)charSequence1), 0, z, 2, null) >= 0 : StringsKt__StringsKt.indexOf$StringsKt__StringsKt$default(charSequence0, charSequence1, 0, charSequence0.length(), z, false, 16, null) >= 0;
    }

    private static final boolean contains(CharSequence charSequence0, Regex regex0) {
        Intrinsics.checkNotNullParameter(charSequence0, "$this$contains");
        return regex0.containsMatchIn(charSequence0);
    }

    public static boolean contains$default(CharSequence charSequence0, char c, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return StringsKt.contains(charSequence0, c, z);
    }

    public static boolean contains$default(CharSequence charSequence0, CharSequence charSequence1, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return StringsKt.contains(charSequence0, charSequence1, z);
    }

    public static final boolean contentEqualsIgnoreCaseImpl(CharSequence charSequence0, CharSequence charSequence1) {
        if(charSequence0 instanceof String && charSequence1 instanceof String) {
            return StringsKt.equals(((String)charSequence0), ((String)charSequence1), true);
        }
        if(charSequence0 == charSequence1) {
            return true;
        }
        if(charSequence0 != null && charSequence1 != null && charSequence0.length() == charSequence1.length()) {
            int v = charSequence0.length();
            for(int v1 = 0; v1 < v; ++v1) {
                if(!CharsKt.equals(charSequence0.charAt(v1), charSequence1.charAt(v1), true)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean contentEqualsImpl(CharSequence charSequence0, CharSequence charSequence1) {
        if(charSequence0 instanceof String && charSequence1 instanceof String) {
            return Intrinsics.areEqual(charSequence0, charSequence1);
        }
        if(charSequence0 == charSequence1) {
            return true;
        }
        if(charSequence0 != null && charSequence1 != null && charSequence0.length() == charSequence1.length()) {
            int v = charSequence0.length();
            for(int v1 = 0; v1 < v; ++v1) {
                if(charSequence0.charAt(v1) != charSequence1.charAt(v1)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean endsWith(CharSequence charSequence0, char c, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence0, "$this$endsWith");
        return charSequence0.length() > 0 && CharsKt.equals(charSequence0.charAt(StringsKt.getLastIndex(charSequence0)), c, z);
    }

    public static final boolean endsWith(CharSequence charSequence0, CharSequence charSequence1, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence0, "$this$endsWith");
        Intrinsics.checkNotNullParameter(charSequence1, "suffix");
        return z || !(charSequence0 instanceof String) || !(charSequence1 instanceof String) ? StringsKt.regionMatchesImpl(charSequence0, charSequence0.length() - charSequence1.length(), charSequence1, 0, charSequence1.length(), z) : StringsKt.endsWith$default(((String)charSequence0), ((String)charSequence1), false, 2, null);
    }

    public static boolean endsWith$default(CharSequence charSequence0, char c, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return StringsKt.endsWith(charSequence0, c, z);
    }

    public static boolean endsWith$default(CharSequence charSequence0, CharSequence charSequence1, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return StringsKt.endsWith(charSequence0, charSequence1, z);
    }

    public static final Pair findAnyOf(CharSequence charSequence0, Collection collection0, int v, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence0, "$this$findAnyOf");
        Intrinsics.checkNotNullParameter(collection0, "strings");
        return StringsKt__StringsKt.findAnyOf$StringsKt__StringsKt(charSequence0, collection0, v, z, false);
    }

    private static final Pair findAnyOf$StringsKt__StringsKt(CharSequence charSequence0, Collection collection0, int v, boolean z, boolean z1) {
        Iterator iterator1;
        Object object1;
        Iterator iterator0;
        Object object0;
        if(!z && collection0.size() == 1) {
            String s = (String)CollectionsKt.single(collection0);
            int v1 = z1 ? StringsKt.lastIndexOf$default(charSequence0, s, v, false, 4, null) : StringsKt.indexOf$default(charSequence0, s, v, false, 4, null);
            return v1 < 0 ? null : TuplesKt.to(v1, s);
        }
        IntProgression intProgression0 = z1 ? RangesKt.downTo(RangesKt.coerceAtMost(v, StringsKt.getLastIndex(charSequence0)), 0) : new IntRange(RangesKt.coerceAtLeast(v, 0), charSequence0.length());
        if(charSequence0 instanceof String) {
            int v2 = intProgression0.getFirst();
            int v3 = intProgression0.getLast();
            int v4 = intProgression0.getStep();
            if(v4 < 0) {
                if(v2 >= v3) {
                    while(true) {
                        iterator0 = collection0.iterator();
                    label_18:
                        while(iterator0.hasNext()) {
                            object0 = iterator0.next();
                            if(!StringsKt.regionMatches(((String)object0), 0, ((String)charSequence0), v2, ((String)object0).length(), z)) {
                                continue;
                            }
                            goto label_23;
                        }
                        object0 = null;
                    label_23:
                        if(((String)object0) != null) {
                            return TuplesKt.to(v2, ((String)object0));
                        }
                        if(v2 == v3) {
                            break;
                        }
                        v2 += v4;
                    }
                }
            }
            else if(v2 <= v3) {
                iterator0 = collection0.iterator();
                goto label_18;
            }
        }
        else {
            int v5 = intProgression0.getFirst();
            int v6 = intProgression0.getLast();
            int v7 = intProgression0.getStep();
            if(v7 < 0) {
                if(v5 >= v6) {
                    while(true) {
                        iterator1 = collection0.iterator();
                    label_37:
                        while(iterator1.hasNext()) {
                            object1 = iterator1.next();
                            if(!StringsKt.regionMatchesImpl(((String)object1), 0, charSequence0, v5, ((String)object1).length(), z)) {
                                continue;
                            }
                            goto label_42;
                        }
                        object1 = null;
                    label_42:
                        if(((String)object1) != null) {
                            return TuplesKt.to(v5, ((String)object1));
                        }
                        if(v5 == v6) {
                            break;
                        }
                        v5 += v7;
                    }
                }
            }
            else if(v5 <= v6) {
                iterator1 = collection0.iterator();
                goto label_37;
            }
        }
        return null;
    }

    public static Pair findAnyOf$default(CharSequence charSequence0, Collection collection0, int v, boolean z, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0;
        }
        if((v1 & 4) != 0) {
            z = false;
        }
        return StringsKt.findAnyOf(charSequence0, collection0, v, z);
    }

    public static final Pair findLastAnyOf(CharSequence charSequence0, Collection collection0, int v, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence0, "$this$findLastAnyOf");
        Intrinsics.checkNotNullParameter(collection0, "strings");
        return StringsKt__StringsKt.findAnyOf$StringsKt__StringsKt(charSequence0, collection0, v, z, true);
    }

    public static Pair findLastAnyOf$default(CharSequence charSequence0, Collection collection0, int v, boolean z, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = StringsKt.getLastIndex(charSequence0);
        }
        if((v1 & 4) != 0) {
            z = false;
        }
        return StringsKt.findLastAnyOf(charSequence0, collection0, v, z);
    }

    public static final IntRange getIndices(CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "$this$indices");
        return new IntRange(0, charSequence0.length() - 1);
    }

    public static final int getLastIndex(CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "$this$lastIndex");
        return charSequence0.length() - 1;
    }

    public static final boolean hasSurrogatePairAt(CharSequence charSequence0, int v) {
        Intrinsics.checkNotNullParameter(charSequence0, "$this$hasSurrogatePairAt");
        return v >= 0 && charSequence0.length() - 2 >= v && Character.isHighSurrogate(charSequence0.charAt(v)) && Character.isLowSurrogate(charSequence0.charAt(v + 1));
    }

    private static final Object ifBlank(CharSequence charSequence0, Function0 function00) {
        return StringsKt.isBlank(charSequence0) ? function00.invoke() : charSequence0;
    }

    private static final Object ifEmpty(CharSequence charSequence0, Function0 function00) {
        return charSequence0.length() == 0 ? function00.invoke() : charSequence0;
    }

    public static final int indexOf(CharSequence charSequence0, char c, int v, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence0, "$this$indexOf");
        return z || !(charSequence0 instanceof String) ? StringsKt.indexOfAny(charSequence0, new char[]{c}, v, z) : ((String)charSequence0).indexOf(((int)c), v);
    }

    public static final int indexOf(CharSequence charSequence0, String s, int v, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence0, "$this$indexOf");
        Intrinsics.checkNotNullParameter(s, "string");
        return z || !(charSequence0 instanceof String) ? StringsKt__StringsKt.indexOf$StringsKt__StringsKt$default(charSequence0, s, v, charSequence0.length(), z, false, 16, null) : ((String)charSequence0).indexOf(s, v);
    }

    private static final int indexOf$StringsKt__StringsKt(CharSequence charSequence0, CharSequence charSequence1, int v, int v1, boolean z, boolean z1) {
        IntProgression intProgression0 = z1 ? RangesKt.downTo(RangesKt.coerceAtMost(v, StringsKt.getLastIndex(charSequence0)), RangesKt.coerceAtLeast(v1, 0)) : new IntRange(RangesKt.coerceAtLeast(v, 0), RangesKt.coerceAtMost(v1, charSequence0.length()));
        if(!(charSequence0 instanceof String) || !(charSequence1 instanceof String)) {
            int v5 = intProgression0.getFirst();
            int v6 = intProgression0.getLast();
            int v7 = intProgression0.getStep();
            if(v7 < 0) {
                if(v5 >= v6) {
                    while(true) {
                    label_24:
                        if(StringsKt.regionMatchesImpl(charSequence1, 0, charSequence0, v5, charSequence1.length(), z)) {
                            return v5;
                        }
                        if(v5 == v6) {
                            break;
                        }
                        v5 += v7;
                    }
                }
            }
            else if(v5 <= v6) {
                goto label_24;
            }
        }
        else {
            int v2 = intProgression0.getFirst();
            int v3 = intProgression0.getLast();
            int v4 = intProgression0.getStep();
            if(v4 < 0) {
                if(v2 >= v3) {
                    while(true) {
                    label_12:
                        if(StringsKt.regionMatches(((String)charSequence1), 0, ((String)charSequence0), v2, charSequence1.length(), z)) {
                            return v2;
                        }
                        if(v2 == v3) {
                            break;
                        }
                        v2 += v4;
                    }
                }
            }
            else if(v2 <= v3) {
                goto label_12;
            }
        }
        return -1;
    }

    static int indexOf$StringsKt__StringsKt$default(CharSequence charSequence0, CharSequence charSequence1, int v, int v1, boolean z, boolean z1, int v2, Object object0) {
        return (v2 & 16) == 0 ? StringsKt__StringsKt.indexOf$StringsKt__StringsKt(charSequence0, charSequence1, v, v1, z, z1) : StringsKt__StringsKt.indexOf$StringsKt__StringsKt(charSequence0, charSequence1, v, v1, z, false);
    }

    public static int indexOf$default(CharSequence charSequence0, char c, int v, boolean z, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0;
        }
        if((v1 & 4) != 0) {
            z = false;
        }
        return StringsKt.indexOf(charSequence0, c, v, z);
    }

    public static int indexOf$default(CharSequence charSequence0, String s, int v, boolean z, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0;
        }
        if((v1 & 4) != 0) {
            z = false;
        }
        return StringsKt.indexOf(charSequence0, s, v, z);
    }

    public static final int indexOfAny(CharSequence charSequence0, Collection collection0, int v, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence0, "$this$indexOfAny");
        Intrinsics.checkNotNullParameter(collection0, "strings");
        Pair pair0 = StringsKt__StringsKt.findAnyOf$StringsKt__StringsKt(charSequence0, collection0, v, z, false);
        if(pair0 != null) {
            Integer integer0 = (Integer)pair0.getFirst();
            return integer0 == null ? -1 : ((int)integer0);
        }
        return -1;
    }

    public static final int indexOfAny(CharSequence charSequence0, char[] arr_c, int v, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence0, "$this$indexOfAny");
        Intrinsics.checkNotNullParameter(arr_c, "chars");
        if(!z && arr_c.length == 1 && charSequence0 instanceof String) {
            return ((String)charSequence0).indexOf(ArraysKt.single(arr_c), v);
        }
        int v1 = RangesKt.coerceAtLeast(v, 0);
        int v2 = StringsKt.getLastIndex(charSequence0);
        if(v1 <= v2) {
            while(true) {
                int v3 = charSequence0.charAt(v1);
                int v4 = 0;
                while(true) {
                    boolean z1 = false;
                    if(v4 < arr_c.length) {
                        if(CharsKt.equals(arr_c[v4], ((char)v3), z)) {
                            z1 = true;
                        }
                        else {
                            ++v4;
                            continue;
                        }
                    }
                    break;
                }
                if(z1) {
                    return v1;
                }
                if(v1 == v2) {
                    break;
                }
                ++v1;
            }
        }
        return -1;
    }

    public static int indexOfAny$default(CharSequence charSequence0, Collection collection0, int v, boolean z, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0;
        }
        if((v1 & 4) != 0) {
            z = false;
        }
        return StringsKt.indexOfAny(charSequence0, collection0, v, z);
    }

    public static int indexOfAny$default(CharSequence charSequence0, char[] arr_c, int v, boolean z, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0;
        }
        if((v1 & 4) != 0) {
            z = false;
        }
        return StringsKt.indexOfAny(charSequence0, arr_c, v, z);
    }

    private static final boolean isEmpty(CharSequence charSequence0) {
        return charSequence0.length() == 0;
    }

    private static final boolean isNotBlank(CharSequence charSequence0) {
        return !StringsKt.isBlank(charSequence0);
    }

    private static final boolean isNotEmpty(CharSequence charSequence0) {
        return charSequence0.length() > 0;
    }

    private static final boolean isNullOrBlank(CharSequence charSequence0) {
        return charSequence0 == null || StringsKt.isBlank(charSequence0);
    }

    private static final boolean isNullOrEmpty(CharSequence charSequence0) {
        return charSequence0 == null || charSequence0.length() == 0;
    }

    public static final CharIterator iterator(CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "$this$iterator");
        return new CharIterator() {
            private int index;

            @Override
            public boolean hasNext() {
                return this.index < charSequence0.length();
            }

            @Override  // kotlin.collections.CharIterator
            public char nextChar() {
                int v = this.index;
                this.index = v + 1;
                return charSequence0.charAt(v);
            }
        };
    }

    public static final int lastIndexOf(CharSequence charSequence0, char c, int v, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence0, "$this$lastIndexOf");
        return z || !(charSequence0 instanceof String) ? StringsKt.lastIndexOfAny(charSequence0, new char[]{c}, v, z) : ((String)charSequence0).lastIndexOf(((int)c), v);
    }

    public static final int lastIndexOf(CharSequence charSequence0, String s, int v, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence0, "$this$lastIndexOf");
        Intrinsics.checkNotNullParameter(s, "string");
        return z || !(charSequence0 instanceof String) ? StringsKt__StringsKt.indexOf$StringsKt__StringsKt(charSequence0, s, v, 0, z, true) : ((String)charSequence0).lastIndexOf(s, v);
    }

    public static int lastIndexOf$default(CharSequence charSequence0, char c, int v, boolean z, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = StringsKt.getLastIndex(charSequence0);
        }
        if((v1 & 4) != 0) {
            z = false;
        }
        return StringsKt.lastIndexOf(charSequence0, c, v, z);
    }

    public static int lastIndexOf$default(CharSequence charSequence0, String s, int v, boolean z, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = StringsKt.getLastIndex(charSequence0);
        }
        if((v1 & 4) != 0) {
            z = false;
        }
        return StringsKt.lastIndexOf(charSequence0, s, v, z);
    }

    public static final int lastIndexOfAny(CharSequence charSequence0, Collection collection0, int v, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence0, "$this$lastIndexOfAny");
        Intrinsics.checkNotNullParameter(collection0, "strings");
        Pair pair0 = StringsKt__StringsKt.findAnyOf$StringsKt__StringsKt(charSequence0, collection0, v, z, true);
        if(pair0 != null) {
            Integer integer0 = (Integer)pair0.getFirst();
            return integer0 == null ? -1 : ((int)integer0);
        }
        return -1;
    }

    // This method was un-flattened
    public static final int lastIndexOfAny(CharSequence charSequence0, char[] arr_c, int v, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence0, "$this$lastIndexOfAny");
        Intrinsics.checkNotNullParameter(arr_c, "chars");
        if(!z && arr_c.length == 1 && charSequence0 instanceof String) {
            return ((String)charSequence0).lastIndexOf(ArraysKt.single(arr_c), v);
        }
        int v1 = RangesKt.coerceAtMost(v, StringsKt.getLastIndex(charSequence0));
        while(v1 >= 0) {
            int v2 = charSequence0.charAt(v1);
            int v3 = 0;
        label_8:
            if(v3 >= arr_c.length) {
                --v1;
                continue;
            }
            if(!CharsKt.equals(arr_c[v3], ((char)v2), z)) {
                ++v3;
                goto label_8;
            }
            return v1;
        }
        return -1;
    }

    public static int lastIndexOfAny$default(CharSequence charSequence0, Collection collection0, int v, boolean z, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = StringsKt.getLastIndex(charSequence0);
        }
        if((v1 & 4) != 0) {
            z = false;
        }
        return StringsKt.lastIndexOfAny(charSequence0, collection0, v, z);
    }

    public static int lastIndexOfAny$default(CharSequence charSequence0, char[] arr_c, int v, boolean z, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = StringsKt.getLastIndex(charSequence0);
        }
        if((v1 & 4) != 0) {
            z = false;
        }
        return StringsKt.lastIndexOfAny(charSequence0, arr_c, v, z);
    }

    public static final Sequence lineSequence(CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "$this$lineSequence");
        return StringsKt.splitToSequence$default(charSequence0, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, null);
    }

    public static final List lines(CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "$this$lines");
        return SequencesKt.toList(StringsKt.lineSequence(charSequence0));
    }

    private static final boolean matches(CharSequence charSequence0, Regex regex0) {
        return regex0.matches(charSequence0);
    }

    private static final String orEmpty(String s) {
        return s == null ? "" : s;
    }

    public static final CharSequence padEnd(CharSequence charSequence0, int v, char c) {
        Intrinsics.checkNotNullParameter(charSequence0, "$this$padEnd");
        if(v < 0) {
            throw new IllegalArgumentException("Desired length " + v + " is less than zero.");
        }
        if(v <= charSequence0.length()) {
            return charSequence0.subSequence(0, charSequence0.length());
        }
        StringBuilder stringBuilder0 = new StringBuilder(v);
        stringBuilder0.append(charSequence0);
        int v1 = v - charSequence0.length();
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                stringBuilder0.append(c);
                if(v2 == v1) {
                    break;
                }
            }
        }
        return stringBuilder0;
    }

    public static final String padEnd(String s, int v, char c) {
        Intrinsics.checkNotNullParameter(s, "$this$padEnd");
        return StringsKt.padEnd(s, v, c).toString();
    }

    public static CharSequence padEnd$default(CharSequence charSequence0, int v, char c, int v1, Object object0) {
        if((v1 & 2) != 0) {
            c = ' ';
        }
        return StringsKt.padEnd(charSequence0, v, c);
    }

    public static String padEnd$default(String s, int v, char c, int v1, Object object0) {
        if((v1 & 2) != 0) {
            c = ' ';
        }
        return StringsKt.padEnd(s, v, c);
    }

    public static final CharSequence padStart(CharSequence charSequence0, int v, char c) {
        Intrinsics.checkNotNullParameter(charSequence0, "$this$padStart");
        if(v < 0) {
            throw new IllegalArgumentException("Desired length " + v + " is less than zero.");
        }
        if(v <= charSequence0.length()) {
            return charSequence0.subSequence(0, charSequence0.length());
        }
        StringBuilder stringBuilder0 = new StringBuilder(v);
        int v1 = v - charSequence0.length();
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                stringBuilder0.append(c);
                if(v2 == v1) {
                    break;
                }
            }
        }
        stringBuilder0.append(charSequence0);
        return stringBuilder0;
    }

    public static final String padStart(String s, int v, char c) {
        Intrinsics.checkNotNullParameter(s, "$this$padStart");
        return StringsKt.padStart(s, v, c).toString();
    }

    public static CharSequence padStart$default(CharSequence charSequence0, int v, char c, int v1, Object object0) {
        if((v1 & 2) != 0) {
            c = ' ';
        }
        return StringsKt.padStart(charSequence0, v, c);
    }

    public static String padStart$default(String s, int v, char c, int v1, Object object0) {
        if((v1 & 2) != 0) {
            c = ' ';
        }
        return StringsKt.padStart(s, v, c);
    }

    private static final Sequence rangesDelimitedBy$StringsKt__StringsKt(CharSequence charSequence0, char[] arr_c, int v, boolean z, int v1) {
        if(v1 < 0) {
            throw new IllegalArgumentException(("Limit must be non-negative, but was " + v1 + '.').toString());
        }
        return new DelimitedRangesSequence(charSequence0, v, v1, new Function2(arr_c, z) {
            final char[] $delimiters;
            final boolean $ignoreCase;

            {
                this.$delimiters = arr_c;
                this.$ignoreCase = z;
                super(2);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((CharSequence)object0), ((Number)object1).intValue());
            }

            public final Pair invoke(CharSequence charSequence0, int v) {
                Intrinsics.checkNotNullParameter(charSequence0, "$receiver");
                int v1 = StringsKt.indexOfAny(charSequence0, this.$delimiters, v, this.$ignoreCase);
                return v1 >= 0 ? TuplesKt.to(v1, 1) : null;
            }
        });
    }

    private static final Sequence rangesDelimitedBy$StringsKt__StringsKt(CharSequence charSequence0, String[] arr_s, int v, boolean z, int v1) {
        if(v1 < 0) {
            throw new IllegalArgumentException(("Limit must be non-negative, but was " + v1 + '.').toString());
        }
        return new DelimitedRangesSequence(charSequence0, v, v1, new Function2(ArraysKt.asList(arr_s), z) {
            final List $delimitersList;
            final boolean $ignoreCase;

            {
                this.$delimitersList = list0;
                this.$ignoreCase = z;
                super(2);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((CharSequence)object0), ((Number)object1).intValue());
            }

            public final Pair invoke(CharSequence charSequence0, int v) {
                Intrinsics.checkNotNullParameter(charSequence0, "$receiver");
                Pair pair0 = StringsKt__StringsKt.findAnyOf$StringsKt__StringsKt(charSequence0, this.$delimitersList, v, this.$ignoreCase, false);
                return pair0 == null ? null : TuplesKt.to(pair0.getFirst(), ((String)pair0.getSecond()).length());
            }
        });
    }

    static Sequence rangesDelimitedBy$StringsKt__StringsKt$default(CharSequence charSequence0, char[] arr_c, int v, boolean z, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            z = false;
        }
        if((v2 & 8) != 0) {
            v1 = 0;
        }
        return StringsKt__StringsKt.rangesDelimitedBy$StringsKt__StringsKt(charSequence0, arr_c, v, z, v1);
    }

    static Sequence rangesDelimitedBy$StringsKt__StringsKt$default(CharSequence charSequence0, String[] arr_s, int v, boolean z, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            z = false;
        }
        if((v2 & 8) != 0) {
            v1 = 0;
        }
        return StringsKt__StringsKt.rangesDelimitedBy$StringsKt__StringsKt(charSequence0, arr_s, v, z, v1);
    }

    public static final boolean regionMatchesImpl(CharSequence charSequence0, int v, CharSequence charSequence1, int v1, int v2, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence0, "$this$regionMatchesImpl");
        Intrinsics.checkNotNullParameter(charSequence1, "other");
        if(v1 >= 0 && v >= 0 && v <= charSequence0.length() - v2 && v1 <= charSequence1.length() - v2) {
            for(int v3 = 0; v3 < v2; ++v3) {
                if(!CharsKt.equals(charSequence0.charAt(v + v3), charSequence1.charAt(v1 + v3), z)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static final CharSequence removePrefix(CharSequence charSequence0, CharSequence charSequence1) {
        Intrinsics.checkNotNullParameter(charSequence0, "$this$removePrefix");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        return StringsKt.startsWith$default(charSequence0, charSequence1, false, 2, null) ? charSequence0.subSequence(charSequence1.length(), charSequence0.length()) : charSequence0.subSequence(0, charSequence0.length());
    }

    public static final String removePrefix(String s, CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(s, "$this$removePrefix");
        Intrinsics.checkNotNullParameter(charSequence0, "prefix");
        if(StringsKt.startsWith$default(s, charSequence0, false, 2, null)) {
            s = s.substring(charSequence0.length());
            Intrinsics.checkNotNullExpressionValue(s, "(this as java.lang.String).substring(startIndex)");
        }
        return s;
    }

    public static final CharSequence removeRange(CharSequence charSequence0, int v, int v1) {
        Intrinsics.checkNotNullParameter(charSequence0, "$this$removeRange");
        if(v1 < v) {
            throw new IndexOutOfBoundsException("End index (" + v1 + ") is less than start index (" + v + ").");
        }
        if(v1 == v) {
            return charSequence0.subSequence(0, charSequence0.length());
        }
        StringBuilder stringBuilder0 = new StringBuilder(charSequence0.length() - (v1 - v));
        stringBuilder0.append(charSequence0, 0, v);
        Intrinsics.checkNotNullExpressionValue(stringBuilder0, "this.append(value, startIndex, endIndex)");
        stringBuilder0.append(charSequence0, v1, charSequence0.length());
        Intrinsics.checkNotNullExpressionValue(stringBuilder0, "this.append(value, startIndex, endIndex)");
        return stringBuilder0;
    }

    public static final CharSequence removeRange(CharSequence charSequence0, IntRange intRange0) {
        Intrinsics.checkNotNullParameter(charSequence0, "$this$removeRange");
        Intrinsics.checkNotNullParameter(intRange0, "range");
        return StringsKt.removeRange(charSequence0, ((int)intRange0.getStart()), ((int)intRange0.getEndInclusive()) + 1);
    }

    private static final String removeRange(String s, int v, int v1) {
        if(s == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
        }
        return StringsKt.removeRange(s, v, v1).toString();
    }

    private static final String removeRange(String s, IntRange intRange0) {
        if(s == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
        }
        return StringsKt.removeRange(s, intRange0).toString();
    }

    public static final CharSequence removeSuffix(CharSequence charSequence0, CharSequence charSequence1) {
        Intrinsics.checkNotNullParameter(charSequence0, "$this$removeSuffix");
        Intrinsics.checkNotNullParameter(charSequence1, "suffix");
        return StringsKt.endsWith$default(charSequence0, charSequence1, false, 2, null) ? charSequence0.subSequence(0, charSequence0.length() - charSequence1.length()) : charSequence0.subSequence(0, charSequence0.length());
    }

    public static final String removeSuffix(String s, CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(s, "$this$removeSuffix");
        Intrinsics.checkNotNullParameter(charSequence0, "suffix");
        if(StringsKt.endsWith$default(s, charSequence0, false, 2, null)) {
            s = s.substring(0, s.length() - charSequence0.length());
            Intrinsics.checkNotNullExpressionValue(s, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        return s;
    }

    public static final CharSequence removeSurrounding(CharSequence charSequence0, CharSequence charSequence1) {
        Intrinsics.checkNotNullParameter(charSequence0, "$this$removeSurrounding");
        Intrinsics.checkNotNullParameter(charSequence1, "delimiter");
        return StringsKt.removeSurrounding(charSequence0, charSequence1, charSequence1);
    }

    public static final CharSequence removeSurrounding(CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2) {
        Intrinsics.checkNotNullParameter(charSequence0, "$this$removeSurrounding");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        Intrinsics.checkNotNullParameter(charSequence2, "suffix");
        return charSequence0.length() < charSequence1.length() + charSequence2.length() || !StringsKt.startsWith$default(charSequence0, charSequence1, false, 2, null) || !StringsKt.endsWith$default(charSequence0, charSequence2, false, 2, null) ? charSequence0.subSequence(0, charSequence0.length()) : charSequence0.subSequence(charSequence1.length(), charSequence0.length() - charSequence2.length());
    }

    public static final String removeSurrounding(String s, CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(s, "$this$removeSurrounding");
        Intrinsics.checkNotNullParameter(charSequence0, "delimiter");
        return StringsKt.removeSurrounding(s, charSequence0, charSequence0);
    }

    public static final String removeSurrounding(String s, CharSequence charSequence0, CharSequence charSequence1) {
        Intrinsics.checkNotNullParameter(s, "$this$removeSurrounding");
        Intrinsics.checkNotNullParameter(charSequence0, "prefix");
        Intrinsics.checkNotNullParameter(charSequence1, "suffix");
        if(s.length() >= charSequence0.length() + charSequence1.length() && StringsKt.startsWith$default(s, charSequence0, false, 2, null) && StringsKt.endsWith$default(s, charSequence1, false, 2, null)) {
            s = s.substring(charSequence0.length(), s.length() - charSequence1.length());
            Intrinsics.checkNotNullExpressionValue(s, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        return s;
    }

    private static final String replace(CharSequence charSequence0, Regex regex0, String s) {
        return regex0.replace(charSequence0, s);
    }

    private static final String replace(CharSequence charSequence0, Regex regex0, Function1 function10) {
        return regex0.replace(charSequence0, function10);
    }

    public static final String replaceAfter(String s, char c, String s1, String s2) {
        Intrinsics.checkNotNullParameter(s, "$this$replaceAfter");
        Intrinsics.checkNotNullParameter(s1, "replacement");
        Intrinsics.checkNotNullParameter(s2, "missingDelimiterValue");
        int v = StringsKt.indexOf$default(s, c, 0, false, 6, null);
        return v == -1 ? s2 : StringsKt.replaceRange(s, v + 1, s.length(), s1).toString();
    }

    public static final String replaceAfter(String s, String s1, String s2, String s3) {
        Intrinsics.checkNotNullParameter(s, "$this$replaceAfter");
        Intrinsics.checkNotNullParameter(s1, "delimiter");
        Intrinsics.checkNotNullParameter(s2, "replacement");
        Intrinsics.checkNotNullParameter(s3, "missingDelimiterValue");
        int v = StringsKt.indexOf$default(s, s1, 0, false, 6, null);
        return v == -1 ? s3 : StringsKt.replaceRange(s, v + s1.length(), s.length(), s2).toString();
    }

    public static String replaceAfter$default(String s, char c, String s1, String s2, int v, Object object0) {
        if((v & 4) != 0) {
            s2 = s;
        }
        return StringsKt.replaceAfter(s, c, s1, s2);
    }

    public static String replaceAfter$default(String s, String s1, String s2, String s3, int v, Object object0) {
        if((v & 4) != 0) {
            s3 = s;
        }
        return StringsKt.replaceAfter(s, s1, s2, s3);
    }

    public static final String replaceAfterLast(String s, char c, String s1, String s2) {
        Intrinsics.checkNotNullParameter(s, "$this$replaceAfterLast");
        Intrinsics.checkNotNullParameter(s1, "replacement");
        Intrinsics.checkNotNullParameter(s2, "missingDelimiterValue");
        int v = StringsKt.lastIndexOf$default(s, c, 0, false, 6, null);
        return v == -1 ? s2 : StringsKt.replaceRange(s, v + 1, s.length(), s1).toString();
    }

    public static final String replaceAfterLast(String s, String s1, String s2, String s3) {
        Intrinsics.checkNotNullParameter(s, "$this$replaceAfterLast");
        Intrinsics.checkNotNullParameter(s1, "delimiter");
        Intrinsics.checkNotNullParameter(s2, "replacement");
        Intrinsics.checkNotNullParameter(s3, "missingDelimiterValue");
        int v = StringsKt.lastIndexOf$default(s, s1, 0, false, 6, null);
        return v == -1 ? s3 : StringsKt.replaceRange(s, v + s1.length(), s.length(), s2).toString();
    }

    public static String replaceAfterLast$default(String s, char c, String s1, String s2, int v, Object object0) {
        if((v & 4) != 0) {
            s2 = s;
        }
        return StringsKt.replaceAfterLast(s, c, s1, s2);
    }

    public static String replaceAfterLast$default(String s, String s1, String s2, String s3, int v, Object object0) {
        if((v & 4) != 0) {
            s3 = s;
        }
        return StringsKt.replaceAfterLast(s, s1, s2, s3);
    }

    public static final String replaceBefore(String s, char c, String s1, String s2) {
        Intrinsics.checkNotNullParameter(s, "$this$replaceBefore");
        Intrinsics.checkNotNullParameter(s1, "replacement");
        Intrinsics.checkNotNullParameter(s2, "missingDelimiterValue");
        int v = StringsKt.indexOf$default(s, c, 0, false, 6, null);
        return v == -1 ? s2 : StringsKt.replaceRange(s, 0, v, s1).toString();
    }

    public static final String replaceBefore(String s, String s1, String s2, String s3) {
        Intrinsics.checkNotNullParameter(s, "$this$replaceBefore");
        Intrinsics.checkNotNullParameter(s1, "delimiter");
        Intrinsics.checkNotNullParameter(s2, "replacement");
        Intrinsics.checkNotNullParameter(s3, "missingDelimiterValue");
        int v = StringsKt.indexOf$default(s, s1, 0, false, 6, null);
        return v == -1 ? s3 : StringsKt.replaceRange(s, 0, v, s2).toString();
    }

    public static String replaceBefore$default(String s, char c, String s1, String s2, int v, Object object0) {
        if((v & 4) != 0) {
            s2 = s;
        }
        return StringsKt.replaceBefore(s, c, s1, s2);
    }

    public static String replaceBefore$default(String s, String s1, String s2, String s3, int v, Object object0) {
        if((v & 4) != 0) {
            s3 = s;
        }
        return StringsKt.replaceBefore(s, s1, s2, s3);
    }

    public static final String replaceBeforeLast(String s, char c, String s1, String s2) {
        Intrinsics.checkNotNullParameter(s, "$this$replaceBeforeLast");
        Intrinsics.checkNotNullParameter(s1, "replacement");
        Intrinsics.checkNotNullParameter(s2, "missingDelimiterValue");
        int v = StringsKt.lastIndexOf$default(s, c, 0, false, 6, null);
        return v == -1 ? s2 : StringsKt.replaceRange(s, 0, v, s1).toString();
    }

    public static final String replaceBeforeLast(String s, String s1, String s2, String s3) {
        Intrinsics.checkNotNullParameter(s, "$this$replaceBeforeLast");
        Intrinsics.checkNotNullParameter(s1, "delimiter");
        Intrinsics.checkNotNullParameter(s2, "replacement");
        Intrinsics.checkNotNullParameter(s3, "missingDelimiterValue");
        int v = StringsKt.lastIndexOf$default(s, s1, 0, false, 6, null);
        return v == -1 ? s3 : StringsKt.replaceRange(s, 0, v, s2).toString();
    }

    public static String replaceBeforeLast$default(String s, char c, String s1, String s2, int v, Object object0) {
        if((v & 4) != 0) {
            s2 = s;
        }
        return StringsKt.replaceBeforeLast(s, c, s1, s2);
    }

    public static String replaceBeforeLast$default(String s, String s1, String s2, String s3, int v, Object object0) {
        if((v & 4) != 0) {
            s3 = s;
        }
        return StringsKt.replaceBeforeLast(s, s1, s2, s3);
    }

    private static final String replaceFirst(CharSequence charSequence0, Regex regex0, String s) {
        return regex0.replaceFirst(charSequence0, s);
    }

    private static final String replaceFirstCharWithChar(String s, Function1 function10) {
        if(s.length() > 0) {
            int v = ((Character)function10.invoke(Character.valueOf(s.charAt(0)))).charValue();
            String s1 = s.substring(1);
            Intrinsics.checkNotNullExpressionValue(s1, "(this as java.lang.String).substring(startIndex)");
            return ((char)v) + s1;
        }
        return s;
    }

    private static final String replaceFirstCharWithCharSequence(String s, Function1 function10) {
        if(s.length() > 0) {
            String s1 = s.substring(1);
            Intrinsics.checkNotNullExpressionValue(s1, "(this as java.lang.String).substring(startIndex)");
            return function10.invoke(Character.valueOf(s.charAt(0))).toString() + s1;
        }
        return s;
    }

    public static final CharSequence replaceRange(CharSequence charSequence0, int v, int v1, CharSequence charSequence1) {
        Intrinsics.checkNotNullParameter(charSequence0, "$this$replaceRange");
        Intrinsics.checkNotNullParameter(charSequence1, "replacement");
        if(v1 < v) {
            throw new IndexOutOfBoundsException("End index (" + v1 + ") is less than start index (" + v + ").");
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(charSequence0, 0, v);
        Intrinsics.checkNotNullExpressionValue(stringBuilder0, "this.append(value, startIndex, endIndex)");
        stringBuilder0.append(charSequence1);
        stringBuilder0.append(charSequence0, v1, charSequence0.length());
        Intrinsics.checkNotNullExpressionValue(stringBuilder0, "this.append(value, startIndex, endIndex)");
        return stringBuilder0;
    }

    public static final CharSequence replaceRange(CharSequence charSequence0, IntRange intRange0, CharSequence charSequence1) {
        Intrinsics.checkNotNullParameter(charSequence0, "$this$replaceRange");
        Intrinsics.checkNotNullParameter(intRange0, "range");
        Intrinsics.checkNotNullParameter(charSequence1, "replacement");
        return StringsKt.replaceRange(charSequence0, ((int)intRange0.getStart()), ((int)intRange0.getEndInclusive()) + 1, charSequence1);
    }

    private static final String replaceRange(String s, int v, int v1, CharSequence charSequence0) {
        if(s == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
        }
        return StringsKt.replaceRange(s, v, v1, charSequence0).toString();
    }

    private static final String replaceRange(String s, IntRange intRange0, CharSequence charSequence0) {
        if(s == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
        }
        return StringsKt.replaceRange(s, intRange0, charSequence0).toString();
    }

    private static final List split(CharSequence charSequence0, Regex regex0, int v) {
        return regex0.split(charSequence0, v);
    }

    public static final List split(CharSequence charSequence0, char[] arr_c, boolean z, int v) {
        Intrinsics.checkNotNullParameter(charSequence0, "$this$split");
        Intrinsics.checkNotNullParameter(arr_c, "delimiters");
        if(arr_c.length == 1) {
            return StringsKt__StringsKt.split$StringsKt__StringsKt(charSequence0, String.valueOf(arr_c[0]), z, v);
        }
        Iterable iterable0 = SequencesKt.asIterable(StringsKt__StringsKt.rangesDelimitedBy$StringsKt__StringsKt$default(charSequence0, arr_c, 0, z, v, 2, null));
        ArrayList arrayList0 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable0, 10));
        for(Object object0: iterable0) {
            arrayList0.add(StringsKt.substring(charSequence0, ((IntRange)object0)));
        }
        return arrayList0;
    }

    public static final List split(CharSequence charSequence0, String[] arr_s, boolean z, int v) {
        Intrinsics.checkNotNullParameter(charSequence0, "$this$split");
        Intrinsics.checkNotNullParameter(arr_s, "delimiters");
        if(arr_s.length == 1) {
            String s = arr_s[0];
            if(s.length() != 0) {
                return StringsKt__StringsKt.split$StringsKt__StringsKt(charSequence0, s, z, v);
            }
        }
        Iterable iterable0 = SequencesKt.asIterable(StringsKt__StringsKt.rangesDelimitedBy$StringsKt__StringsKt$default(charSequence0, arr_s, 0, z, v, 2, null));
        ArrayList arrayList0 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable0, 10));
        for(Object object0: iterable0) {
            arrayList0.add(StringsKt.substring(charSequence0, ((IntRange)object0)));
        }
        return arrayList0;
    }

    private static final List split$StringsKt__StringsKt(CharSequence charSequence0, String s, boolean z, int v) {
        int v1 = 0;
        if(v < 0) {
            throw new IllegalArgumentException(("Limit must be non-negative, but was " + v + '.').toString());
        }
        int v2 = StringsKt.indexOf(charSequence0, s, 0, z);
        if(v2 != -1 && v != 1) {
            ArrayList arrayList0 = new ArrayList((v <= 0 ? RangesKt.coerceAtMost(v, 10) : 10));
            do {
                arrayList0.add(charSequence0.subSequence(v1, v2).toString());
                v1 = s.length() + v2;
                if(v > 0 && arrayList0.size() == v - 1) {
                    break;
                }
                v2 = StringsKt.indexOf(charSequence0, s, v1, z);
            }
            while(v2 != -1);
            arrayList0.add(charSequence0.subSequence(v1, charSequence0.length()).toString());
            return arrayList0;
        }
        return CollectionsKt.listOf(charSequence0.toString());
    }

    static List split$default(CharSequence charSequence0, Regex regex0, int v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0;
        }
        return regex0.split(charSequence0, v);
    }

    public static List split$default(CharSequence charSequence0, char[] arr_c, boolean z, int v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            z = false;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        return StringsKt.split(charSequence0, arr_c, z, v);
    }

    public static List split$default(CharSequence charSequence0, String[] arr_s, boolean z, int v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            z = false;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        return StringsKt.split(charSequence0, arr_s, z, v);
    }

    public static final Sequence splitToSequence(CharSequence charSequence0, char[] arr_c, boolean z, int v) {
        Intrinsics.checkNotNullParameter(charSequence0, "$this$splitToSequence");
        Intrinsics.checkNotNullParameter(arr_c, "delimiters");
        return SequencesKt.map(StringsKt__StringsKt.rangesDelimitedBy$StringsKt__StringsKt$default(charSequence0, arr_c, 0, z, v, 2, null), new Function1(charSequence0) {
            final CharSequence $this_splitToSequence;

            {
                this.$this_splitToSequence = charSequence0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((IntRange)object0));
            }

            public final String invoke(IntRange intRange0) {
                Intrinsics.checkNotNullParameter(intRange0, "it");
                return StringsKt.substring(this.$this_splitToSequence, intRange0);
            }
        });
    }

    public static final Sequence splitToSequence(CharSequence charSequence0, String[] arr_s, boolean z, int v) {
        Intrinsics.checkNotNullParameter(charSequence0, "$this$splitToSequence");
        Intrinsics.checkNotNullParameter(arr_s, "delimiters");
        return SequencesKt.map(StringsKt__StringsKt.rangesDelimitedBy$StringsKt__StringsKt$default(charSequence0, arr_s, 0, z, v, 2, null), new Function1(charSequence0) {
            final CharSequence $this_splitToSequence;

            {
                this.$this_splitToSequence = charSequence0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((IntRange)object0));
            }

            public final String invoke(IntRange intRange0) {
                Intrinsics.checkNotNullParameter(intRange0, "it");
                return StringsKt.substring(this.$this_splitToSequence, intRange0);
            }
        });
    }

    public static Sequence splitToSequence$default(CharSequence charSequence0, char[] arr_c, boolean z, int v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            z = false;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        return StringsKt.splitToSequence(charSequence0, arr_c, z, v);
    }

    public static Sequence splitToSequence$default(CharSequence charSequence0, String[] arr_s, boolean z, int v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            z = false;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        return StringsKt.splitToSequence(charSequence0, arr_s, z, v);
    }

    public static final boolean startsWith(CharSequence charSequence0, char c, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence0, "$this$startsWith");
        return charSequence0.length() > 0 && CharsKt.equals(charSequence0.charAt(0), c, z);
    }

    public static final boolean startsWith(CharSequence charSequence0, CharSequence charSequence1, int v, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence0, "$this$startsWith");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        return z || !(charSequence0 instanceof String) || !(charSequence1 instanceof String) ? StringsKt.regionMatchesImpl(charSequence0, v, charSequence1, 0, charSequence1.length(), z) : StringsKt.startsWith$default(((String)charSequence0), ((String)charSequence1), v, false, 4, null);
    }

    public static final boolean startsWith(CharSequence charSequence0, CharSequence charSequence1, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence0, "$this$startsWith");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        return z || !(charSequence0 instanceof String) || !(charSequence1 instanceof String) ? StringsKt.regionMatchesImpl(charSequence0, 0, charSequence1, 0, charSequence1.length(), z) : StringsKt.startsWith$default(((String)charSequence0), ((String)charSequence1), false, 2, null);
    }

    public static boolean startsWith$default(CharSequence charSequence0, char c, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return StringsKt.startsWith(charSequence0, c, z);
    }

    public static boolean startsWith$default(CharSequence charSequence0, CharSequence charSequence1, int v, boolean z, int v1, Object object0) {
        if((v1 & 4) != 0) {
            z = false;
        }
        return StringsKt.startsWith(charSequence0, charSequence1, v, z);
    }

    public static boolean startsWith$default(CharSequence charSequence0, CharSequence charSequence1, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return StringsKt.startsWith(charSequence0, charSequence1, z);
    }

    public static final CharSequence subSequence(CharSequence charSequence0, IntRange intRange0) {
        Intrinsics.checkNotNullParameter(charSequence0, "$this$subSequence");
        Intrinsics.checkNotNullParameter(intRange0, "range");
        return charSequence0.subSequence(((int)intRange0.getStart()), ((int)intRange0.getEndInclusive()) + 1);
    }

    @Deprecated(message = "Use parameters named startIndex and endIndex.", replaceWith = @ReplaceWith(expression = "subSequence(startIndex = start, endIndex = end)", imports = {}))
    private static final CharSequence subSequence(String s, int v, int v1) {
        return s.subSequence(v, v1);
    }

    private static final String substring(CharSequence charSequence0, int v, int v1) {
        return charSequence0.subSequence(v, v1).toString();
    }

    public static final String substring(CharSequence charSequence0, IntRange intRange0) {
        Intrinsics.checkNotNullParameter(charSequence0, "$this$substring");
        Intrinsics.checkNotNullParameter(intRange0, "range");
        return charSequence0.subSequence(((int)intRange0.getStart()), ((int)intRange0.getEndInclusive()) + 1).toString();
    }

    public static final String substring(String s, IntRange intRange0) {
        Intrinsics.checkNotNullParameter(s, "$this$substring");
        Intrinsics.checkNotNullParameter(intRange0, "range");
        String s1 = s.substring(((int)intRange0.getStart()), ((int)intRange0.getEndInclusive()) + 1);
        Intrinsics.checkNotNullExpressionValue(s1, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return s1;
    }

    static String substring$default(CharSequence charSequence0, int v, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v1 = charSequence0.length();
        }
        return charSequence0.subSequence(v, v1).toString();
    }

    public static final String substringAfter(String s, char c, String s1) {
        Intrinsics.checkNotNullParameter(s, "$this$substringAfter");
        Intrinsics.checkNotNullParameter(s1, "missingDelimiterValue");
        int v = StringsKt.indexOf$default(s, c, 0, false, 6, null);
        if(v != -1) {
            s1 = s.substring(v + 1, s.length());
            Intrinsics.checkNotNullExpressionValue(s1, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        return s1;
    }

    public static final String substringAfter(String s, String s1, String s2) {
        Intrinsics.checkNotNullParameter(s, "$this$substringAfter");
        Intrinsics.checkNotNullParameter(s1, "delimiter");
        Intrinsics.checkNotNullParameter(s2, "missingDelimiterValue");
        int v = StringsKt.indexOf$default(s, s1, 0, false, 6, null);
        if(v != -1) {
            s2 = s.substring(v + s1.length(), s.length());
            Intrinsics.checkNotNullExpressionValue(s2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        return s2;
    }

    public static String substringAfter$default(String s, char c, String s1, int v, Object object0) {
        if((v & 2) != 0) {
            s1 = s;
        }
        return StringsKt.substringAfter(s, c, s1);
    }

    public static String substringAfter$default(String s, String s1, String s2, int v, Object object0) {
        if((v & 2) != 0) {
            s2 = s;
        }
        return StringsKt.substringAfter(s, s1, s2);
    }

    public static final String substringAfterLast(String s, char c, String s1) {
        Intrinsics.checkNotNullParameter(s, "$this$substringAfterLast");
        Intrinsics.checkNotNullParameter(s1, "missingDelimiterValue");
        int v = StringsKt.lastIndexOf$default(s, c, 0, false, 6, null);
        if(v != -1) {
            s1 = s.substring(v + 1, s.length());
            Intrinsics.checkNotNullExpressionValue(s1, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        return s1;
    }

    public static final String substringAfterLast(String s, String s1, String s2) {
        Intrinsics.checkNotNullParameter(s, "$this$substringAfterLast");
        Intrinsics.checkNotNullParameter(s1, "delimiter");
        Intrinsics.checkNotNullParameter(s2, "missingDelimiterValue");
        int v = StringsKt.lastIndexOf$default(s, s1, 0, false, 6, null);
        if(v != -1) {
            s2 = s.substring(v + s1.length(), s.length());
            Intrinsics.checkNotNullExpressionValue(s2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        return s2;
    }

    public static String substringAfterLast$default(String s, char c, String s1, int v, Object object0) {
        if((v & 2) != 0) {
            s1 = s;
        }
        return StringsKt.substringAfterLast(s, c, s1);
    }

    public static String substringAfterLast$default(String s, String s1, String s2, int v, Object object0) {
        if((v & 2) != 0) {
            s2 = s;
        }
        return StringsKt.substringAfterLast(s, s1, s2);
    }

    public static final String substringBefore(String s, char c, String s1) {
        Intrinsics.checkNotNullParameter(s, "$this$substringBefore");
        Intrinsics.checkNotNullParameter(s1, "missingDelimiterValue");
        int v = StringsKt.indexOf$default(s, c, 0, false, 6, null);
        if(v != -1) {
            s1 = s.substring(0, v);
            Intrinsics.checkNotNullExpressionValue(s1, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        return s1;
    }

    public static final String substringBefore(String s, String s1, String s2) {
        Intrinsics.checkNotNullParameter(s, "$this$substringBefore");
        Intrinsics.checkNotNullParameter(s1, "delimiter");
        Intrinsics.checkNotNullParameter(s2, "missingDelimiterValue");
        int v = StringsKt.indexOf$default(s, s1, 0, false, 6, null);
        if(v != -1) {
            s2 = s.substring(0, v);
            Intrinsics.checkNotNullExpressionValue(s2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        return s2;
    }

    public static String substringBefore$default(String s, char c, String s1, int v, Object object0) {
        if((v & 2) != 0) {
            s1 = s;
        }
        return StringsKt.substringBefore(s, c, s1);
    }

    public static String substringBefore$default(String s, String s1, String s2, int v, Object object0) {
        if((v & 2) != 0) {
            s2 = s;
        }
        return StringsKt.substringBefore(s, s1, s2);
    }

    public static final String substringBeforeLast(String s, char c, String s1) {
        Intrinsics.checkNotNullParameter(s, "$this$substringBeforeLast");
        Intrinsics.checkNotNullParameter(s1, "missingDelimiterValue");
        int v = StringsKt.lastIndexOf$default(s, c, 0, false, 6, null);
        if(v != -1) {
            s1 = s.substring(0, v);
            Intrinsics.checkNotNullExpressionValue(s1, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        return s1;
    }

    public static final String substringBeforeLast(String s, String s1, String s2) {
        Intrinsics.checkNotNullParameter(s, "$this$substringBeforeLast");
        Intrinsics.checkNotNullParameter(s1, "delimiter");
        Intrinsics.checkNotNullParameter(s2, "missingDelimiterValue");
        int v = StringsKt.lastIndexOf$default(s, s1, 0, false, 6, null);
        if(v != -1) {
            s2 = s.substring(0, v);
            Intrinsics.checkNotNullExpressionValue(s2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        return s2;
    }

    public static String substringBeforeLast$default(String s, char c, String s1, int v, Object object0) {
        if((v & 2) != 0) {
            s1 = s;
        }
        return StringsKt.substringBeforeLast(s, c, s1);
    }

    public static String substringBeforeLast$default(String s, String s1, String s2, int v, Object object0) {
        if((v & 2) != 0) {
            s2 = s;
        }
        return StringsKt.substringBeforeLast(s, s1, s2);
    }

    public static final boolean toBooleanStrict(String s) {
        Intrinsics.checkNotNullParameter(s, "$this$toBooleanStrict");
        switch(s) {
            case "false": {
                return false;
            }
            case "true": {
                return true;
            }
            default: {
                throw new IllegalArgumentException("The string doesn\'t represent a boolean value: " + s);
            }
        }
    }

    public static final Boolean toBooleanStrictOrNull(String s) {
        Intrinsics.checkNotNullParameter(s, "$this$toBooleanStrictOrNull");
        switch(s) {
            case "false": {
                return false;
            }
            case "true": {
                return true;
            }
            default: {
                return null;
            }
        }
    }

    public static final CharSequence trim(CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "$this$trim");
        int v = charSequence0.length() - 1;
        int v1 = 0;
        boolean z = false;
        while(v1 <= v) {
            boolean z1 = CharsKt.isWhitespace(charSequence0.charAt((z ? v : v1)));
            if(z) {
                if(!z1) {
                    break;
                }
                --v;
            }
            else if(z1) {
                ++v1;
            }
            else {
                z = true;
            }
        }
        return charSequence0.subSequence(v1, v + 1);
    }

    public static final CharSequence trim(CharSequence charSequence0, Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "$this$trim");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = charSequence0.length() - 1;
        int v1 = 0;
        boolean z = false;
        while(v1 <= v) {
            boolean z1 = ((Boolean)function10.invoke(Character.valueOf(charSequence0.charAt((z ? v : v1))))).booleanValue();
            if(z) {
                if(!z1) {
                    break;
                }
                --v;
            }
            else if(z1) {
                ++v1;
            }
            else {
                z = true;
            }
        }
        return charSequence0.subSequence(v1, v + 1);
    }

    public static final CharSequence trim(CharSequence charSequence0, char[] arr_c) {
        Intrinsics.checkNotNullParameter(charSequence0, "$this$trim");
        Intrinsics.checkNotNullParameter(arr_c, "chars");
        int v = charSequence0.length() - 1;
        int v1 = 0;
        boolean z = false;
        while(v1 <= v) {
            boolean z1 = ArraysKt.contains(arr_c, charSequence0.charAt((z ? v : v1)));
            if(z) {
                if(!z1) {
                    break;
                }
                --v;
            }
            else if(z1) {
                ++v1;
            }
            else {
                z = true;
            }
        }
        return charSequence0.subSequence(v1, v + 1);
    }

    private static final String trim(String s) {
        if(s == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
        }
        return StringsKt.trim(s).toString();
    }

    public static final String trim(String s, Function1 function10) {
        Intrinsics.checkNotNullParameter(s, "$this$trim");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = s.length() - 1;
        int v1 = 0;
        boolean z = false;
        while(v1 <= v) {
            boolean z1 = ((Boolean)function10.invoke(Character.valueOf(s.charAt((z ? v : v1))))).booleanValue();
            if(z) {
                if(!z1) {
                    break;
                }
                --v;
            }
            else if(z1) {
                ++v1;
            }
            else {
                z = true;
            }
        }
        return s.subSequence(v1, v + 1).toString();
    }

    public static final String trim(String s, char[] arr_c) {
        Intrinsics.checkNotNullParameter(s, "$this$trim");
        Intrinsics.checkNotNullParameter(arr_c, "chars");
        int v = s.length() - 1;
        int v1 = 0;
        boolean z = false;
        while(v1 <= v) {
            boolean z1 = ArraysKt.contains(arr_c, s.charAt((z ? v : v1)));
            if(z) {
                if(!z1) {
                    break;
                }
                --v;
            }
            else if(z1) {
                ++v1;
            }
            else {
                z = true;
            }
        }
        return s.subSequence(v1, v + 1).toString();
    }

    public static final CharSequence trimEnd(CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "$this$trimEnd");
        int v = charSequence0.length();
        while(true) {
            --v;
            if(v < 0) {
                break;
            }
            if(!CharsKt.isWhitespace(charSequence0.charAt(v))) {
                return charSequence0.subSequence(0, v + 1);
            }
        }
        return "";
    }

    public static final CharSequence trimEnd(CharSequence charSequence0, Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "$this$trimEnd");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = charSequence0.length();
        while(true) {
            --v;
            if(v < 0) {
                break;
            }
            if(!((Boolean)function10.invoke(Character.valueOf(charSequence0.charAt(v)))).booleanValue()) {
                return charSequence0.subSequence(0, v + 1);
            }
        }
        return "";
    }

    public static final CharSequence trimEnd(CharSequence charSequence0, char[] arr_c) {
        Intrinsics.checkNotNullParameter(charSequence0, "$this$trimEnd");
        Intrinsics.checkNotNullParameter(arr_c, "chars");
        int v = charSequence0.length();
        while(true) {
            --v;
            if(v < 0) {
                break;
            }
            if(!ArraysKt.contains(arr_c, charSequence0.charAt(v))) {
                return charSequence0.subSequence(0, v + 1);
            }
        }
        return "";
    }

    private static final String trimEnd(String s) {
        if(s == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
        }
        return StringsKt.trimEnd(s).toString();
    }

    public static final String trimEnd(String s, Function1 function10) {
        Intrinsics.checkNotNullParameter(s, "$this$trimEnd");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = s.length();
        while(true) {
            --v;
            if(v < 0) {
                break;
            }
            if(!((Boolean)function10.invoke(Character.valueOf(s.charAt(v)))).booleanValue()) {
                return s.subSequence(0, v + 1).toString();
            }
        }
        return "";
    }

    public static final String trimEnd(String s, char[] arr_c) {
        Intrinsics.checkNotNullParameter(s, "$this$trimEnd");
        Intrinsics.checkNotNullParameter(arr_c, "chars");
        int v = s.length();
        while(true) {
            --v;
            if(v < 0) {
                break;
            }
            if(!ArraysKt.contains(arr_c, s.charAt(v))) {
                return s.subSequence(0, v + 1).toString();
            }
        }
        return "";
    }

    public static final CharSequence trimStart(CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "$this$trimStart");
        int v = charSequence0.length();
        for(int v1 = 0; v1 < v; ++v1) {
            if(!CharsKt.isWhitespace(charSequence0.charAt(v1))) {
                return charSequence0.subSequence(v1, charSequence0.length());
            }
        }
        return "";
    }

    public static final CharSequence trimStart(CharSequence charSequence0, Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "$this$trimStart");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = charSequence0.length();
        for(int v1 = 0; v1 < v; ++v1) {
            if(!((Boolean)function10.invoke(Character.valueOf(charSequence0.charAt(v1)))).booleanValue()) {
                return charSequence0.subSequence(v1, charSequence0.length());
            }
        }
        return "";
    }

    public static final CharSequence trimStart(CharSequence charSequence0, char[] arr_c) {
        Intrinsics.checkNotNullParameter(charSequence0, "$this$trimStart");
        Intrinsics.checkNotNullParameter(arr_c, "chars");
        int v = charSequence0.length();
        for(int v1 = 0; v1 < v; ++v1) {
            if(!ArraysKt.contains(arr_c, charSequence0.charAt(v1))) {
                return charSequence0.subSequence(v1, charSequence0.length());
            }
        }
        return "";
    }

    private static final String trimStart(String s) {
        if(s == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
        }
        return StringsKt.trimStart(s).toString();
    }

    public static final String trimStart(String s, Function1 function10) {
        Intrinsics.checkNotNullParameter(s, "$this$trimStart");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = s.length();
        for(int v1 = 0; v1 < v; ++v1) {
            if(!((Boolean)function10.invoke(Character.valueOf(s.charAt(v1)))).booleanValue()) {
                return s.subSequence(v1, s.length()).toString();
            }
        }
        return "";
    }

    public static final String trimStart(String s, char[] arr_c) {
        Intrinsics.checkNotNullParameter(s, "$this$trimStart");
        Intrinsics.checkNotNullParameter(arr_c, "chars");
        int v = s.length();
        for(int v1 = 0; v1 < v; ++v1) {
            if(!ArraysKt.contains(arr_c, s.charAt(v1))) {
                return s.subSequence(v1, s.length()).toString();
            }
        }
        return "";
    }
}

