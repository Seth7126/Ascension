package kotlin.sequences;

import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001AN\u0010\b\u001A\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n2/\b\t\u0010\u000B\u001A)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000F0\u000E\u0012\u0006\u0012\u0004\u0018\u00010\u00100\f\u00A2\u0006\u0002\b\u0011H\u0087\b\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010\u0012\u001AN\u0010\u0013\u001A\b\u0012\u0004\u0012\u0002H\n0\u0014\"\u0004\b\u0000\u0010\n2/\b\t\u0010\u000B\u001A)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000F0\u000E\u0012\u0006\u0012\u0004\u0018\u00010\u00100\f\u00A2\u0006\u0002\b\u0011H\u0087\b\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010\u0015\u001AM\u0010\u0016\u001A\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n2/\b\u0001\u0010\u0017\u001A)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000F0\u000E\u0012\u0006\u0012\u0004\u0018\u00010\u00100\f\u00A2\u0006\u0002\b\u0011H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010\u0012\u001AM\u0010\u0018\u001A\b\u0012\u0004\u0012\u0002H\n0\u0014\"\u0004\b\u0000\u0010\n2/\b\u0001\u0010\u0017\u001A)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000F0\u000E\u0012\u0006\u0012\u0004\u0018\u00010\u00100\f\u00A2\u0006\u0002\b\u0011H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010\u0015\"\u0012\u0010\u0000\u001A\u00060\u0001j\u0002`\u0002X\u0082T\u00A2\u0006\u0002\n\u0000\"\u0012\u0010\u0003\u001A\u00060\u0001j\u0002`\u0002X\u0082T\u00A2\u0006\u0002\n\u0000\"\u0012\u0010\u0004\u001A\u00060\u0001j\u0002`\u0002X\u0082T\u00A2\u0006\u0002\n\u0000\"\u0012\u0010\u0005\u001A\u00060\u0001j\u0002`\u0002X\u0082T\u00A2\u0006\u0002\n\u0000\"\u0012\u0010\u0006\u001A\u00060\u0001j\u0002`\u0002X\u0082T\u00A2\u0006\u0002\n\u0000\"\u0012\u0010\u0007\u001A\u00060\u0001j\u0002`\u0002X\u0082T\u00A2\u0006\u0002\n\u0000*V\b\u0007\u0010\u0019\u001A\u0004\b\u0000\u0010\n\"\b\u0012\u0004\u0012\u0002H\n0\r2\b\u0012\u0004\u0012\u0002H\n0\rB6\b\u001A\u0012\b\b\u001B\u0012\u0004\b\b(\u001C\u0012\u001C\b\u001D\u0012\u0018\b\u000BB\u0014\b\u001E\u0012\u0006\b\u001F\u0012\u0002\b\f\u0012\b\b \u0012\u0004\b\b(!\u0012\n\b\"\u0012\u0006\b\n0#8$*\f\b\u0002\u0010%\"\u00020\u00012\u00020\u0001\u0082\u0002\u0004\n\u0002\b\u0019\u00A8\u0006&"}, d2 = {"State_Done", "", "Lkotlin/sequences/State;", "State_Failed", "State_ManyNotReady", "State_ManyReady", "State_NotReady", "State_Ready", "buildIterator", "", "T", "builderAction", "Lkotlin/Function2;", "Lkotlin/sequences/SequenceScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;)Ljava/util/Iterator;", "buildSequence", "Lkotlin/sequences/Sequence;", "(Lkotlin/jvm/functions/Function2;)Lkotlin/sequences/Sequence;", "iterator", "block", "sequence", "SequenceBuilder", "Lkotlin/Deprecated;", "message", "Use SequenceScope class instead.", "replaceWith", "Lkotlin/ReplaceWith;", "imports", "expression", "SequenceScope<T>", "level", "Lkotlin/DeprecationLevel;", "ERROR", "State", "kotlin-stdlib"}, k = 5, mv = {1, 5, 1}, xi = 1, xs = "kotlin/sequences/SequencesKt")
class SequencesKt__SequenceBuilderKt {
    private static final int State_Done = 4;
    private static final int State_Failed = 5;
    private static final int State_ManyNotReady = 1;
    private static final int State_ManyReady = 2;
    private static final int State_NotReady = 0;
    private static final int State_Ready = 3;

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use SequenceScope class instead.", replaceWith = @ReplaceWith(expression = "SequenceScope<T>", imports = {}))
    public static void SequenceBuilder$annotations() {
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use \'iterator { }\' function instead.", replaceWith = @ReplaceWith(expression = "iterator(builderAction)", imports = {}))
    private static final Iterator buildIterator(Function2 function20) {
        return SequencesKt.iterator(function20);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use \'sequence { }\' function instead.", replaceWith = @ReplaceWith(expression = "sequence(builderAction)", imports = {}))
    private static final Sequence buildSequence(Function2 function20) {
        return new Sequence() {
            @Override  // kotlin.sequences.Sequence
            public Iterator iterator() {
                return SequencesKt.iterator(function20);
            }
        };
    }

    public static final Iterator iterator(Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "block");
        SequenceBuilderIterator sequenceBuilderIterator0 = new SequenceBuilderIterator();
        sequenceBuilderIterator0.setNextStep(IntrinsicsKt.createCoroutineUnintercepted(function20, sequenceBuilderIterator0, sequenceBuilderIterator0));
        return sequenceBuilderIterator0;
    }

    public static final Sequence sequence(Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "block");
        return new Sequence() {
            @Override  // kotlin.sequences.Sequence
            public Iterator iterator() {
                return SequencesKt.iterator(function20);
            }
        };
    }
}

