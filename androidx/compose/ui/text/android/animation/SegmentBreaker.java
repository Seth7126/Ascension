package androidx.compose.ui.text.android.animation;

import android.text.Layout;
import androidx.compose.ui.text.android.CharSequenceCharacterIterator;
import androidx.compose.ui.text.android.InternalPlatformTextApi;
import androidx.compose.ui.text.android.LayoutCompatKt;
import androidx.compose.ui.text.android.LayoutHelper;
import java.text.Bidi;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@InternalPlatformTextApi
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001A\u00020\u0007H\u0002J\u001C\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\t\u001A\u00020\nJ\u001E\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\r\u001A\u00020\u000EH\u0002J\u0016\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0006\u001A\u00020\u0007H\u0002J\u001E\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\r\u001A\u00020\u000EH\u0002J\u0016\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0006\u001A\u00020\u0007H\u0002J\u001E\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\r\u001A\u00020\u000EH\u0002J$\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\t\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\u000EJ\u001E\u0010\u0014\u001A\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0015\u001A\u00020\u00162\u0006\u0010\u0017\u001A\u00020\u0018H\u0002¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/text/android/animation/SegmentBreaker;", "", "()V", "breakInWords", "", "", "layoutHelper", "Landroidx/compose/ui/text/android/LayoutHelper;", "breakOffsets", "segmentType", "Landroidx/compose/ui/text/android/animation/SegmentType;", "breakSegmentWithChar", "Landroidx/compose/ui/text/android/animation/Segment;", "dropSpaces", "", "breakSegmentWithDocument", "breakSegmentWithLine", "breakSegmentWithParagraph", "breakSegmentWithWord", "breakSegments", "breakWithBreakIterator", "text", "", "breaker", "Ljava/text/BreakIterator;", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class SegmentBreaker {
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[SegmentType.values().length];
            arr_v[SegmentType.Document.ordinal()] = 1;
            arr_v[SegmentType.Paragraph.ordinal()] = 2;
            arr_v[SegmentType.Line.ordinal()] = 3;
            arr_v[SegmentType.Word.ordinal()] = 4;
            arr_v[SegmentType.Character.ordinal()] = 5;
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final SegmentBreaker INSTANCE;

    static {
        SegmentBreaker.INSTANCE = new SegmentBreaker();
    }

    private final List breakInWords(LayoutHelper layoutHelper0) {
        CharSequence charSequence0 = layoutHelper0.getLayout().getText();
        Intrinsics.checkNotNullExpressionValue(charSequence0, "text");
        BreakIterator breakIterator0 = BreakIterator.getLineInstance(Locale.getDefault());
        Intrinsics.checkNotNullExpressionValue(breakIterator0, "getLineInstance(Locale.getDefault())");
        List list0 = this.breakWithBreakIterator(charSequence0, breakIterator0);
        TreeSet treeSet0 = new TreeSet();
        int v = list0.size();
        if(v - 1 >= 0) {
            for(int v1 = 0; true; ++v1) {
                treeSet0.add(((Number)list0.get(v1)).intValue());
                if(v1 + 1 > v - 1) {
                    break;
                }
            }
        }
        int v2 = layoutHelper0.getParagraphCount();
        if(v2 > 0) {
            for(int v3 = 0; true; ++v3) {
                Bidi bidi0 = layoutHelper0.analyzeBidi(v3);
                if(bidi0 != null) {
                    int v4 = layoutHelper0.getParagraphStart(v3);
                    int v5 = bidi0.getRunCount();
                    if(v5 > 0) {
                        for(int v6 = 0; true; ++v6) {
                            treeSet0.add(((int)(bidi0.getRunStart(v6) + v4)));
                            if(v6 + 1 >= v5) {
                                break;
                            }
                        }
                    }
                }
                if(v3 + 1 >= v2) {
                    break;
                }
            }
        }
        return CollectionsKt.toList(treeSet0);
    }

    public final List breakOffsets(LayoutHelper layoutHelper0, SegmentType segmentType0) {
        Intrinsics.checkNotNullParameter(layoutHelper0, "layoutHelper");
        Intrinsics.checkNotNullParameter(segmentType0, "segmentType");
        Layout layout0 = layoutHelper0.getLayout();
        CharSequence charSequence0 = layout0.getText();
        int v = 0;
        switch(segmentType0) {
            case 1: {
                return CollectionsKt.listOf(new Integer[]{0, charSequence0.length()});
            }
            case 2: {
                List list0 = CollectionsKt.mutableListOf(new Integer[]{0});
                int v1 = layoutHelper0.getParagraphCount();
                if(v1 > 0) {
                    while(true) {
                        list0.add(layoutHelper0.getParagraphEnd(v));
                        if(v + 1 >= v1) {
                            break;
                        }
                        ++v;
                    }
                }
                return list0;
            }
            case 3: {
                List list1 = CollectionsKt.mutableListOf(new Integer[]{0});
                int v2 = layout0.getLineCount();
                if(v2 > 0) {
                    while(true) {
                        list1.add(layout0.getLineEnd(v));
                        if(v + 1 >= v2) {
                            break;
                        }
                        ++v;
                    }
                }
                return list1;
            }
            case 4: {
                return this.breakInWords(layoutHelper0);
            }
            case 5: {
                Intrinsics.checkNotNullExpressionValue(charSequence0, "text");
                BreakIterator breakIterator0 = BreakIterator.getCharacterInstance(Locale.getDefault());
                Intrinsics.checkNotNullExpressionValue(breakIterator0, "getCharacterInstance(Locale.getDefault())");
                return this.breakWithBreakIterator(charSequence0, breakIterator0);
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private final List breakSegmentWithChar(LayoutHelper layoutHelper0, boolean z) {
        int v4;
        List list0 = new ArrayList();
        List list1 = this.breakOffsets(layoutHelper0, SegmentType.Character);
        switch(list1.size()) {
            case 0: 
            case 1: {
                break;
            }
            default: {
                List list2 = new ArrayList();
                Object object0 = list1.get(0);
                int v = CollectionsKt.getLastIndex(list1);
                if(v > 0) {
                    int v1 = 0;
                    for(boolean z1 = true; true; z1 = true) {
                        ++v1;
                        Object object1 = list1.get(v1);
                        int v2 = ((Number)object1).intValue();
                        int v3 = ((Number)object0).intValue();
                        Layout layout0 = layoutHelper0.getLayout();
                        if(!z || v2 != v3 + 1 || !layoutHelper0.isLineEndSpace(layout0.getText().charAt(v3))) {
                            int v5 = LayoutCompatKt.getLineForOffset(layout0, v3, false);
                            boolean z2 = layout0.getParagraphDirection(v5) == -1;
                            boolean z3 = layout0.isRtlCharAt(v3);
                            if(z3 != z2) {
                                z1 = false;
                            }
                            int v6 = (int)(((float)Math.ceil(layoutHelper0.getHorizontalPosition(v3, z1, false))));
                            v4 = v;
                            int v7 = (int)(((float)Math.ceil(layoutHelper0.getHorizontalPosition(v2, z3 == z2, true))));
                            list0.add(new Segment(v3, v2, Math.min(v6, v7), layout0.getLineTop(v5), Math.max(v6, v7), layout0.getLineBottom(v5)));
                        }
                        else {
                            v4 = v;
                        }
                        list2.add(Unit.INSTANCE);
                        if(v1 >= v4) {
                            break;
                        }
                        v = v4;
                        object0 = object1;
                    }
                }
            }
        }
        return list0;
    }

    private final List breakSegmentWithDocument(LayoutHelper layoutHelper0) {
        return CollectionsKt.listOf(new Segment(0, layoutHelper0.getLayout().getText().length(), 0, 0, layoutHelper0.getLayout().getWidth(), layoutHelper0.getLayout().getHeight()));
    }

    private final List breakSegmentWithLine(LayoutHelper layoutHelper0, boolean z) {
        List list0 = new ArrayList();
        Layout layout0 = layoutHelper0.getLayout();
        int v = layoutHelper0.getLayout().getLineCount();
        if(v > 0) {
            for(int v1 = 0; true; ++v1) {
                list0.add(new Segment(layout0.getLineStart(v1), layout0.getLineEnd(v1), (z ? ((int)(((float)Math.ceil(layout0.getLineLeft(v1))))) : 0), layout0.getLineTop(v1), (z ? ((int)(((float)Math.ceil(layout0.getLineRight(v1))))) : layout0.getWidth()), layout0.getLineBottom(v1)));
                if(v1 + 1 >= v) {
                    break;
                }
            }
        }
        return list0;
    }

    private final List breakSegmentWithParagraph(LayoutHelper layoutHelper0) {
        List list0 = new ArrayList();
        Layout layout0 = layoutHelper0.getLayout();
        int v = layoutHelper0.getParagraphCount();
        if(v > 0) {
            for(int v1 = 0; true; ++v1) {
                int v2 = layoutHelper0.getParagraphStart(v1);
                int v3 = layoutHelper0.getParagraphEnd(v1);
                int v4 = LayoutCompatKt.getLineForOffset(layout0, v2, false);
                int v5 = LayoutCompatKt.getLineForOffset(layout0, v3, true);
                list0.add(new Segment(v2, v3, 0, layout0.getLineTop(v4), layout0.getWidth(), layout0.getLineBottom(v5)));
                if(v1 + 1 >= v) {
                    break;
                }
            }
        }
        return list0;
    }

    private final List breakSegmentWithWord(LayoutHelper layoutHelper0, boolean z) {
        int v10;
        Layout layout0 = layoutHelper0.getLayout();
        int v = (int)(((float)Math.ceil(layout0.getPaint().measureText(" "))));
        List list0 = this.breakOffsets(layoutHelper0, SegmentType.Word);
        switch(list0.size()) {
            case 0: 
            case 1: {
                return CollectionsKt.emptyList();
            }
            default: {
                List list1 = new ArrayList();
                Object object0 = list0.get(0);
                int v1 = CollectionsKt.getLastIndex(list0);
                if(v1 > 0) {
                    int v2 = 0;
                    for(boolean z1 = true; true; z1 = true) {
                        ++v2;
                        Object object1 = list0.get(v2);
                        int v3 = ((Number)object1).intValue();
                        int v4 = ((Number)object0).intValue();
                        int v5 = LayoutCompatKt.getLineForOffset(layout0, v4, false);
                        boolean z2 = layout0.getParagraphDirection(v5) == -1;
                        boolean z3 = layout0.isRtlCharAt(v4);
                        if(z3 != z2) {
                            z1 = false;
                        }
                        int v6 = (int)(((float)Math.ceil(layoutHelper0.getHorizontalPosition(v4, z1, false))));
                        int v7 = (int)(((float)Math.ceil(layoutHelper0.getHorizontalPosition(v3, z3 == z2, true))));
                        int v8 = Math.min(v6, v7);
                        int v9 = Math.max(v6, v7);
                        if(!z || v3 == 0 || layout0.getText().charAt(v3 - 1) != 0x20) {
                            v10 = v5;
                        }
                        else {
                            v10 = v5;
                            if(layout0.getLineEnd(v10) != v3) {
                                if(z3) {
                                    v8 += v;
                                }
                                else {
                                    v9 -= v;
                                }
                            }
                        }
                        list1.add(new Segment(v4, v3, v8, layout0.getLineTop(v10), v9, layout0.getLineBottom(v10)));
                        if(v2 >= v1) {
                            break;
                        }
                        object0 = object1;
                    }
                }
                return list1;
            }
        }
    }

    public final List breakSegments(LayoutHelper layoutHelper0, SegmentType segmentType0, boolean z) {
        Intrinsics.checkNotNullParameter(layoutHelper0, "layoutHelper");
        Intrinsics.checkNotNullParameter(segmentType0, "segmentType");
        switch(segmentType0) {
            case 1: {
                return this.breakSegmentWithDocument(layoutHelper0);
            }
            case 2: {
                return this.breakSegmentWithParagraph(layoutHelper0);
            }
            case 3: {
                return this.breakSegmentWithLine(layoutHelper0, z);
            }
            case 4: {
                return this.breakSegmentWithWord(layoutHelper0, z);
            }
            case 5: {
                return this.breakSegmentWithChar(layoutHelper0, z);
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private final List breakWithBreakIterator(CharSequence charSequence0, BreakIterator breakIterator0) {
        CharSequenceCharacterIterator charSequenceCharacterIterator0 = new CharSequenceCharacterIterator(charSequence0, 0, charSequence0.length());
        List list0 = CollectionsKt.mutableListOf(new Integer[]{0});
        breakIterator0.setText(charSequenceCharacterIterator0);
        while(breakIterator0.next() != -1) {
            list0.add(breakIterator0.current());
        }
        return list0;
    }
}

