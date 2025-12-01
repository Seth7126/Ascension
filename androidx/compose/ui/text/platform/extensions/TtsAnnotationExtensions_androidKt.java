package androidx.compose.ui.text.platform.extensions;

import android.text.style.TtsSpan.VerbatimBuilder;
import android.text.style.TtsSpan;
import androidx.compose.ui.text.TtsAnnotation;
import androidx.compose.ui.text.VerbatimTtsAnnotation;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001A\n\u0010\u0000\u001A\u00020\u0001*\u00020\u0002\u001A\n\u0010\u0000\u001A\u00020\u0001*\u00020\u0003¨\u0006\u0004"}, d2 = {"toSpan", "Landroid/text/style/TtsSpan;", "Landroidx/compose/ui/text/TtsAnnotation;", "Landroidx/compose/ui/text/VerbatimTtsAnnotation;", "ui-text_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class TtsAnnotationExtensions_androidKt {
    public static final TtsSpan toSpan(TtsAnnotation ttsAnnotation0) {
        Intrinsics.checkNotNullParameter(ttsAnnotation0, "<this>");
        if(!(ttsAnnotation0 instanceof VerbatimTtsAnnotation)) {
            throw new NoWhenBranchMatchedException();
        }
        return TtsAnnotationExtensions_androidKt.toSpan(((VerbatimTtsAnnotation)ttsAnnotation0));
    }

    public static final TtsSpan toSpan(VerbatimTtsAnnotation verbatimTtsAnnotation0) {
        Intrinsics.checkNotNullParameter(verbatimTtsAnnotation0, "<this>");
        TtsSpan ttsSpan0 = new TtsSpan.VerbatimBuilder(verbatimTtsAnnotation0.getVerbatim()).build();
        Intrinsics.checkNotNullExpressionValue(ttsSpan0, "builder.build()");
        return ttsSpan0;
    }
}

