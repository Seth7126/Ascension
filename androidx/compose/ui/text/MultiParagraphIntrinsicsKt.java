package androidx.compose.ui.text;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001A4\u0010\u0000\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u0005H\u0002¨\u0006\u0007"}, d2 = {"getLocalPlaceholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "start", "", "end", "ui-text_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class MultiParagraphIntrinsicsKt {
    private static final List getLocalPlaceholders(List list0, int v, int v1) {
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v2 = list0.size();
        if(v2 - 1 >= 0) {
            for(int v3 = 0; true; ++v3) {
                Object object0 = list0.get(v3);
                if(AnnotatedStringKt.intersect(v, v1, ((Range)object0).getStart(), ((Range)object0).getEnd())) {
                    arrayList0.add(object0);
                }
                if(v3 + 1 > v2 - 1) {
                    break;
                }
            }
        }
        ArrayList arrayList1 = new ArrayList(arrayList0.size());
        int v4 = arrayList0.size();
        if(v4 - 1 >= 0) {
            for(int v5 = 0; true; ++v5) {
                Range annotatedString$Range0 = (Range)arrayList0.get(v5);
                if(v > annotatedString$Range0.getStart() || annotatedString$Range0.getEnd() > v1) {
                    throw new IllegalArgumentException("placeholder can not overlap with paragraph.");
                }
                arrayList1.add(new Range(annotatedString$Range0.getItem(), annotatedString$Range0.getStart() - v, annotatedString$Range0.getEnd() - v));
                if(v5 + 1 > v4 - 1) {
                    break;
                }
            }
        }
        return arrayList1;
    }
}

