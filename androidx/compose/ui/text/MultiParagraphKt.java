package androidx.compose.ui.text;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001A\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\u001A\u001E\u0010\u0000\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001A\u00020\u0001H\u0000\u001A\u001E\u0010\u0006\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001A\u00020\u0001H\u0000\u001A\u001E\u0010\b\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\t\u001A\u00020\nH\u0000¨\u0006\u000B"}, d2 = {"findParagraphByIndex", "", "paragraphInfoList", "", "Landroidx/compose/ui/text/ParagraphInfo;", "index", "findParagraphByLineIndex", "lineIndex", "findParagraphByY", "y", "", "ui-text_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class MultiParagraphKt {
    public static final int findParagraphByIndex(List list0, int v) {
        Intrinsics.checkNotNullParameter(list0, "paragraphInfoList");
        return CollectionsKt.binarySearch$default(list0, 0, 0, new Function1(v) {
            final int $index;

            {
                this.$index = v;
                super(1);
            }

            public final int invoke(ParagraphInfo paragraphInfo0) {
                Intrinsics.checkNotNullParameter(paragraphInfo0, "paragraphInfo");
                if(paragraphInfo0.getStartIndex() > this.$index) {
                    return 1;
                }
                return paragraphInfo0.getEndIndex() > this.$index ? 0 : -1;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((ParagraphInfo)object0));
            }
        }, 3, null);
    }

    public static final int findParagraphByLineIndex(List list0, int v) {
        Intrinsics.checkNotNullParameter(list0, "paragraphInfoList");
        return CollectionsKt.binarySearch$default(list0, 0, 0, new Function1(v) {
            final int $lineIndex;

            {
                this.$lineIndex = v;
                super(1);
            }

            public final int invoke(ParagraphInfo paragraphInfo0) {
                Intrinsics.checkNotNullParameter(paragraphInfo0, "paragraphInfo");
                if(paragraphInfo0.getStartLineIndex() > this.$lineIndex) {
                    return 1;
                }
                return paragraphInfo0.getEndLineIndex() > this.$lineIndex ? 0 : -1;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((ParagraphInfo)object0));
            }
        }, 3, null);
    }

    public static final int findParagraphByY(List list0, float f) {
        Intrinsics.checkNotNullParameter(list0, "paragraphInfoList");
        return CollectionsKt.binarySearch$default(list0, 0, 0, new Function1(f) {
            final float $y;

            {
                this.$y = f;
                super(1);
            }

            public final int invoke(ParagraphInfo paragraphInfo0) {
                Intrinsics.checkNotNullParameter(paragraphInfo0, "paragraphInfo");
                if(paragraphInfo0.getTop() > this.$y) {
                    return 1;
                }
                return paragraphInfo0.getBottom() <= this.$y ? -1 : 0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((ParagraphInfo)object0));
            }
        }, 3, null);
    }
}

