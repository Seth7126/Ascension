package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Path.DefaultImpls;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.Font.ResourceLoader;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u009C\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001BY\b\u0016\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0014\b\u0002\u0010\u0006\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007\u0012\b\b\u0002\u0010\n\u001A\u00020\u000B\u0012\b\b\u0002\u0010\f\u001A\u00020\r\u0012\u0006\u0010\u000E\u001A\u00020\u000F\u0012\u0006\u0010\u0010\u001A\u00020\u0011\u0012\u0006\u0010\u0012\u001A\u00020\u0013\u00A2\u0006\u0002\u0010\u0014B)\u0012\u0006\u0010\u0015\u001A\u00020\u0016\u0012\b\b\u0002\u0010\n\u001A\u00020\u000B\u0012\b\b\u0002\u0010\f\u001A\u00020\r\u0012\u0006\u0010\u000E\u001A\u00020\u000F\u00A2\u0006\u0002\u0010\u0017J\u000E\u00106\u001A\u0002072\u0006\u00108\u001A\u00020\u000BJ\u000E\u00109\u001A\u0002032\u0006\u00108\u001A\u00020\u000BJ\u000E\u0010:\u001A\u0002032\u0006\u00108\u001A\u00020\u000BJ\u0016\u0010;\u001A\u00020\u000F2\u0006\u00108\u001A\u00020\u000B2\u0006\u0010<\u001A\u00020\rJ\u000E\u0010=\u001A\u00020\u000F2\u0006\u0010>\u001A\u00020\u000BJ\u0018\u0010?\u001A\u00020\u000B2\u0006\u0010>\u001A\u00020\u000B2\b\b\u0002\u0010@\u001A\u00020\rJ\u000E\u0010A\u001A\u00020\u000B2\u0006\u00108\u001A\u00020\u000BJ\u000E\u0010B\u001A\u00020\u000B2\u0006\u0010C\u001A\u00020\u000FJ\u000E\u0010D\u001A\u00020\u000F2\u0006\u0010>\u001A\u00020\u000BJ\u000E\u0010E\u001A\u00020\u000F2\u0006\u0010>\u001A\u00020\u000BJ\u000E\u0010F\u001A\u00020\u000F2\u0006\u0010>\u001A\u00020\u000BJ\u000E\u0010G\u001A\u00020\u000B2\u0006\u0010>\u001A\u00020\u000BJ\u000E\u0010H\u001A\u00020\u000F2\u0006\u0010>\u001A\u00020\u000BJ\u000E\u0010I\u001A\u00020\u000F2\u0006\u0010>\u001A\u00020\u000BJ\u001B\u0010J\u001A\u00020\u000B2\u0006\u0010K\u001A\u00020L\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bM\u0010NJ\u000E\u0010O\u001A\u0002072\u0006\u00108\u001A\u00020\u000BJ\u0016\u0010P\u001A\u00020Q2\u0006\u0010R\u001A\u00020\u000B2\u0006\u0010S\u001A\u00020\u000BJ\u001E\u0010T\u001A\u00020U2\u0006\u00108\u001A\u00020\u000B\u00F8\u0001\u0000\u00F8\u0001\u0002\u00F8\u0001\u0001\u00A2\u0006\u0004\bV\u0010WJ\u000E\u0010X\u001A\u00020\r2\u0006\u0010>\u001A\u00020\u000BJ=\u0010Y\u001A\u00020Z2\u0006\u0010[\u001A\u00020\\2\b\b\u0002\u0010]\u001A\u00020^2\n\b\u0002\u0010_\u001A\u0004\u0018\u00010`2\n\b\u0002\u0010a\u001A\u0004\u0018\u00010b\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bc\u0010dJ\u0010\u0010e\u001A\u00020Z2\u0006\u00108\u001A\u00020\u000BH\u0002J\u0010\u0010f\u001A\u00020Z2\u0006\u00108\u001A\u00020\u000BH\u0002J\u0010\u0010g\u001A\u00020Z2\u0006\u0010>\u001A\u00020\u000BH\u0002R\u0014\u0010\u0002\u001A\u00020\u00038BX\u0082\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001A\u001A\u00020\r\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001B\u0010\u001CR\u0011\u0010\u001D\u001A\u00020\u000F8F\u00A2\u0006\u0006\u001A\u0004\b\u001E\u0010\u001FR\u0011\u0010 \u001A\u00020\u000F\u00A2\u0006\b\n\u0000\u001A\u0004\b!\u0010\u001FR\u0011\u0010\u0015\u001A\u00020\u0016\u00A2\u0006\b\n\u0000\u001A\u0004\b\"\u0010#R\u0011\u0010$\u001A\u00020\u000F8F\u00A2\u0006\u0006\u001A\u0004\b%\u0010\u001FR\u0011\u0010&\u001A\u00020\u000B\u00A2\u0006\b\n\u0000\u001A\u0004\b\'\u0010(R\u0011\u0010)\u001A\u00020\u000F8F\u00A2\u0006\u0006\u001A\u0004\b*\u0010\u001FR\u0011\u0010\n\u001A\u00020\u000B\u00A2\u0006\b\n\u0000\u001A\u0004\b+\u0010(R\u0011\u0010,\u001A\u00020\u000F8F\u00A2\u0006\u0006\u001A\u0004\b-\u0010\u001FR\u001A\u0010.\u001A\b\u0012\u0004\u0012\u00020/0\u0007X\u0080\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b0\u00101R\u0019\u00102\u001A\n\u0012\u0006\u0012\u0004\u0018\u0001030\u0007\u00A2\u0006\b\n\u0000\u001A\u0004\b4\u00101R\u0011\u0010\u000E\u001A\u00020\u000F\u00A2\u0006\b\n\u0000\u001A\u0004\b5\u0010\u001F\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006h"}, d2 = {"Landroidx/compose/ui/text/MultiParagraph;", "", "annotatedString", "Landroidx/compose/ui/text/AnnotatedString;", "style", "Landroidx/compose/ui/text/TextStyle;", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "maxLines", "", "ellipsis", "", "width", "", "density", "Landroidx/compose/ui/unit/Density;", "resourceLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IZFLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/Font$ResourceLoader;)V", "intrinsics", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "(Landroidx/compose/ui/text/MultiParagraphIntrinsics;IZF)V", "getAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "didExceedMaxLines", "getDidExceedMaxLines", "()Z", "firstBaseline", "getFirstBaseline", "()F", "height", "getHeight", "getIntrinsics", "()Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "lastBaseline", "getLastBaseline", "lineCount", "getLineCount", "()I", "maxIntrinsicWidth", "getMaxIntrinsicWidth", "getMaxLines", "minIntrinsicWidth", "getMinIntrinsicWidth", "paragraphInfoList", "Landroidx/compose/ui/text/ParagraphInfo;", "getParagraphInfoList$ui_text_release", "()Ljava/util/List;", "placeholderRects", "Landroidx/compose/ui/geometry/Rect;", "getPlaceholderRects", "getWidth", "getBidiRunDirection", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "offset", "getBoundingBox", "getCursorRect", "getHorizontalPosition", "usePrimaryDirection", "getLineBottom", "lineIndex", "getLineEnd", "visibleEnd", "getLineForOffset", "getLineForVerticalPosition", "vertical", "getLineHeight", "getLineLeft", "getLineRight", "getLineStart", "getLineTop", "getLineWidth", "getOffsetForPosition", "position", "Landroidx/compose/ui/geometry/Offset;", "getOffsetForPosition-k-4lQ0M", "(J)I", "getParagraphDirection", "getPathForRange", "Landroidx/compose/ui/graphics/Path;", "start", "end", "getWordBoundary", "Landroidx/compose/ui/text/TextRange;", "getWordBoundary--jx7JFs", "(I)J", "isLineEllipsized", "paint", "", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "color", "Landroidx/compose/ui/graphics/Color;", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "decoration", "Landroidx/compose/ui/text/style/TextDecoration;", "paint-RPmYEkk", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;)V", "requireIndexInRange", "requireIndexInRangeInclusiveEnd", "requireLineIndexInRange", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class MultiParagraph {
    private final boolean didExceedMaxLines;
    private final float height;
    private final MultiParagraphIntrinsics intrinsics;
    private final int lineCount;
    private final int maxLines;
    private final List paragraphInfoList;
    private final List placeholderRects;
    private final float width;

    public MultiParagraph(AnnotatedString annotatedString0, TextStyle textStyle0, List list0, int v, boolean z, float f, Density density0, ResourceLoader font$ResourceLoader0) {
        Intrinsics.checkNotNullParameter(annotatedString0, "annotatedString");
        Intrinsics.checkNotNullParameter(textStyle0, "style");
        Intrinsics.checkNotNullParameter(list0, "placeholders");
        Intrinsics.checkNotNullParameter(density0, "density");
        Intrinsics.checkNotNullParameter(font$ResourceLoader0, "resourceLoader");
        this(new MultiParagraphIntrinsics(annotatedString0, textStyle0, list0, density0, font$ResourceLoader0), v, z, f);
    }

    public MultiParagraph(AnnotatedString annotatedString0, TextStyle textStyle0, List list0, int v, boolean z, float f, Density density0, ResourceLoader font$ResourceLoader0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        this(annotatedString0, textStyle0, ((v1 & 4) == 0 ? list0 : CollectionsKt.emptyList()), ((v1 & 8) == 0 ? v : 0x7FFFFFFF), ((v1 & 16) == 0 ? z : false), f, density0, font$ResourceLoader0);
    }

    public MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics0, int v, boolean z, float f) {
        Intrinsics.checkNotNullParameter(multiParagraphIntrinsics0, "intrinsics");
        boolean z1;
        int v6;
        int v5;
        float f3;
        super();
        this.intrinsics = multiParagraphIntrinsics0;
        this.maxLines = v;
        List list0 = new ArrayList();
        List list1 = multiParagraphIntrinsics0.getInfoList$ui_text_release();
        int v1 = list1.size();
        float f1 = 0.0f;
        if(v1 - 1 >= 0) {
            int v2 = 0;
            int v3 = 0;
            float f2 = 0.0f;
            while(true) {
                ParagraphIntrinsicInfo paragraphIntrinsicInfo0 = (ParagraphIntrinsicInfo)list1.get(v2);
                Paragraph paragraph0 = ParagraphKt.Paragraph(paragraphIntrinsicInfo0.getIntrinsics(), this.maxLines - v3, z, f);
                f3 = f2 + paragraph0.getHeight();
                int v4 = v3 + paragraph0.getLineCount();
                v5 = v4;
                list0.add(new ParagraphInfo(paragraph0, paragraphIntrinsicInfo0.getStartIndex(), paragraphIntrinsicInfo0.getEndIndex(), v3, v4, f2, f3));
                if(paragraph0.getDidExceedMaxLines()) {
                    break;
                }
                v3 = v5;
                if(v3 == this.maxLines && v2 != CollectionsKt.getLastIndex(this.intrinsics.getInfoList$ui_text_release())) {
                    goto label_30;
                }
                if(v2 + 1 > v1 - 1) {
                    v6 = v3;
                    f1 = f3;
                    z1 = false;
                    goto label_36;
                }
                ++v2;
                f2 = f3;
            }
            v3 = v5;
        label_30:
            z1 = true;
            v6 = v3;
            f1 = f3;
        }
        else {
            z1 = false;
            v6 = 0;
        }
    label_36:
        this.height = f1;
        this.lineCount = v6;
        this.didExceedMaxLines = z1;
        this.paragraphInfoList = list0;
        this.width = f;
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v7 = list0.size();
        if(v7 - 1 >= 0) {
            for(int v8 = 0; true; ++v8) {
                ParagraphInfo paragraphInfo0 = (ParagraphInfo)list0.get(v8);
                List list2 = paragraphInfo0.getParagraph().getPlaceholderRects();
                ArrayList arrayList1 = new ArrayList(list2.size());
                int v9 = list2.size() - 1;
                if(v9 >= 0) {
                    for(int v10 = 0; true; ++v10) {
                        Rect rect0 = (Rect)list2.get(v10);
                        arrayList1.add((rect0 == null ? null : paragraphInfo0.toGlobal(rect0)));
                        if(v10 + 1 > v9) {
                            break;
                        }
                    }
                }
                CollectionsKt.addAll(arrayList0, arrayList1);
                if(v8 + 1 > v7 - 1) {
                    break;
                }
            }
        }
        List list3 = arrayList0;
        if(list3.size() < this.getIntrinsics().getPlaceholders().size()) {
            int v11 = this.getIntrinsics().getPlaceholders().size() - list3.size();
            ArrayList arrayList2 = new ArrayList(v11);
            for(int v12 = 0; v12 < v11; ++v12) {
                arrayList2.add(null);
            }
            list3 = CollectionsKt.plus(list3, arrayList2);
        }
        this.placeholderRects = list3;
    }

    public MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics0, int v, boolean z, float f, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            v = 0x7FFFFFFF;
        }
        if((v1 & 4) != 0) {
            z = false;
        }
        this(multiParagraphIntrinsics0, v, z, f);
    }

    private final AnnotatedString getAnnotatedString() {
        return this.intrinsics.getAnnotatedString();
    }

    public final ResolvedTextDirection getBidiRunDirection(int v) {
        this.requireIndexInRangeInclusiveEnd(v);
        int v1 = v == this.getAnnotatedString().length() ? CollectionsKt.getLastIndex(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, v);
        ParagraphInfo paragraphInfo0 = (ParagraphInfo)this.paragraphInfoList.get(v1);
        return paragraphInfo0.getParagraph().getBidiRunDirection(paragraphInfo0.toLocalIndex(v));
    }

    public final Rect getBoundingBox(int v) {
        this.requireIndexInRange(v);
        int v1 = MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, v);
        ParagraphInfo paragraphInfo0 = (ParagraphInfo)this.paragraphInfoList.get(v1);
        return paragraphInfo0.toGlobal(paragraphInfo0.getParagraph().getBoundingBox(paragraphInfo0.toLocalIndex(v)));
    }

    public final Rect getCursorRect(int v) {
        this.requireIndexInRangeInclusiveEnd(v);
        int v1 = v == this.getAnnotatedString().length() ? CollectionsKt.getLastIndex(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, v);
        ParagraphInfo paragraphInfo0 = (ParagraphInfo)this.paragraphInfoList.get(v1);
        return paragraphInfo0.toGlobal(paragraphInfo0.getParagraph().getCursorRect(paragraphInfo0.toLocalIndex(v)));
    }

    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    // 去混淆评级： 低(20)
    public final float getFirstBaseline() {
        return this.paragraphInfoList.isEmpty() ? 0.0f : ((ParagraphInfo)this.paragraphInfoList.get(0)).getParagraph().getFirstBaseline();
    }

    public final float getHeight() {
        return this.height;
    }

    public final float getHorizontalPosition(int v, boolean z) {
        this.requireIndexInRangeInclusiveEnd(v);
        int v1 = v == this.getAnnotatedString().length() ? CollectionsKt.getLastIndex(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, v);
        ParagraphInfo paragraphInfo0 = (ParagraphInfo)this.paragraphInfoList.get(v1);
        return paragraphInfo0.getParagraph().getHorizontalPosition(paragraphInfo0.toLocalIndex(v), z);
    }

    public final MultiParagraphIntrinsics getIntrinsics() {
        return this.intrinsics;
    }

    public final float getLastBaseline() {
        if(this.paragraphInfoList.isEmpty()) {
            return 0.0f;
        }
        ParagraphInfo paragraphInfo0 = (ParagraphInfo)CollectionsKt.last(this.paragraphInfoList);
        return paragraphInfo0.toGlobalYPosition(paragraphInfo0.getParagraph().getLastBaseline());
    }

    public final float getLineBottom(int v) {
        this.requireLineIndexInRange(v);
        int v1 = MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, v);
        ParagraphInfo paragraphInfo0 = (ParagraphInfo)this.paragraphInfoList.get(v1);
        return paragraphInfo0.toGlobalYPosition(paragraphInfo0.getParagraph().getLineBottom(paragraphInfo0.toLocalLineIndex(v)));
    }

    public final int getLineCount() {
        return this.lineCount;
    }

    public final int getLineEnd(int v, boolean z) {
        this.requireLineIndexInRange(v);
        int v1 = MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, v);
        ParagraphInfo paragraphInfo0 = (ParagraphInfo)this.paragraphInfoList.get(v1);
        return paragraphInfo0.toGlobalIndex(paragraphInfo0.getParagraph().getLineEnd(paragraphInfo0.toLocalLineIndex(v), z));
    }

    public static int getLineEnd$default(MultiParagraph multiParagraph0, int v, boolean z, int v1, Object object0) {
        if((v1 & 2) != 0) {
            z = false;
        }
        return multiParagraph0.getLineEnd(v, z);
    }

    public final int getLineForOffset(int v) {
        this.requireIndexInRangeInclusiveEnd(v);
        int v1 = v == this.getAnnotatedString().length() ? CollectionsKt.getLastIndex(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, v);
        ParagraphInfo paragraphInfo0 = (ParagraphInfo)this.paragraphInfoList.get(v1);
        return paragraphInfo0.toGlobalLineIndex(paragraphInfo0.getParagraph().getLineForOffset(paragraphInfo0.toLocalIndex(v)));
    }

    public final int getLineForVerticalPosition(float f) {
        int v;
        if(f <= 0.0f) {
            v = 0;
        }
        else {
            v = f >= this.height ? CollectionsKt.getLastIndex(this.paragraphInfoList) : MultiParagraphKt.findParagraphByY(this.paragraphInfoList, f);
        }
        ParagraphInfo paragraphInfo0 = (ParagraphInfo)this.paragraphInfoList.get(v);
        return paragraphInfo0.getLength() == 0 ? Math.max(0, paragraphInfo0.getStartIndex() - 1) : paragraphInfo0.toGlobalLineIndex(paragraphInfo0.getParagraph().getLineForVerticalPosition(paragraphInfo0.toLocalYPosition(f)));
    }

    public final float getLineHeight(int v) {
        this.requireLineIndexInRange(v);
        int v1 = MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, v);
        ParagraphInfo paragraphInfo0 = (ParagraphInfo)this.paragraphInfoList.get(v1);
        return paragraphInfo0.getParagraph().getLineHeight(paragraphInfo0.toLocalLineIndex(v));
    }

    public final float getLineLeft(int v) {
        this.requireLineIndexInRange(v);
        int v1 = MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, v);
        ParagraphInfo paragraphInfo0 = (ParagraphInfo)this.paragraphInfoList.get(v1);
        return paragraphInfo0.getParagraph().getLineLeft(paragraphInfo0.toLocalLineIndex(v));
    }

    public final float getLineRight(int v) {
        this.requireLineIndexInRange(v);
        int v1 = MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, v);
        ParagraphInfo paragraphInfo0 = (ParagraphInfo)this.paragraphInfoList.get(v1);
        return paragraphInfo0.getParagraph().getLineRight(paragraphInfo0.toLocalLineIndex(v));
    }

    public final int getLineStart(int v) {
        this.requireLineIndexInRange(v);
        int v1 = MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, v);
        ParagraphInfo paragraphInfo0 = (ParagraphInfo)this.paragraphInfoList.get(v1);
        return paragraphInfo0.toGlobalIndex(paragraphInfo0.getParagraph().getLineStart(paragraphInfo0.toLocalLineIndex(v)));
    }

    public final float getLineTop(int v) {
        this.requireLineIndexInRange(v);
        int v1 = MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, v);
        ParagraphInfo paragraphInfo0 = (ParagraphInfo)this.paragraphInfoList.get(v1);
        return paragraphInfo0.toGlobalYPosition(paragraphInfo0.getParagraph().getLineTop(paragraphInfo0.toLocalLineIndex(v)));
    }

    public final float getLineWidth(int v) {
        this.requireLineIndexInRange(v);
        int v1 = MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, v);
        ParagraphInfo paragraphInfo0 = (ParagraphInfo)this.paragraphInfoList.get(v1);
        return paragraphInfo0.getParagraph().getLineWidth(paragraphInfo0.toLocalLineIndex(v));
    }

    public final float getMaxIntrinsicWidth() {
        return this.intrinsics.getMaxIntrinsicWidth();
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final float getMinIntrinsicWidth() {
        return this.intrinsics.getMaxIntrinsicWidth();
    }

    public final int getOffsetForPosition-k-4lQ0M(long v) {
        int v1;
        if(Offset.getY-impl(v) <= 0.0f) {
            v1 = 0;
        }
        else if(Offset.getY-impl(v) >= this.height) {
            v1 = CollectionsKt.getLastIndex(this.paragraphInfoList);
        }
        else {
            float f = Offset.getY-impl(v);
            v1 = MultiParagraphKt.findParagraphByY(this.paragraphInfoList, f);
        }
        ParagraphInfo paragraphInfo0 = (ParagraphInfo)this.paragraphInfoList.get(v1);
        return paragraphInfo0.getLength() == 0 ? Math.max(0, paragraphInfo0.getStartIndex() - 1) : paragraphInfo0.toGlobalIndex(paragraphInfo0.getParagraph().getOffsetForPosition-k-4lQ0M(paragraphInfo0.toLocal-MK-Hz9U(v)));
    }

    public final ResolvedTextDirection getParagraphDirection(int v) {
        this.requireIndexInRangeInclusiveEnd(v);
        int v1 = v == this.getAnnotatedString().length() ? CollectionsKt.getLastIndex(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, v);
        ParagraphInfo paragraphInfo0 = (ParagraphInfo)this.paragraphInfoList.get(v1);
        return paragraphInfo0.getParagraph().getParagraphDirection(paragraphInfo0.toLocalIndex(v));
    }

    public final List getParagraphInfoList$ui_text_release() {
        return this.paragraphInfoList;
    }

    public final Path getPathForRange(int v, int v1) {
        if(v < 0 || v > v1 || v1 > this.getAnnotatedString().getText().length()) {
            throw new IllegalArgumentException(("Start(" + v + ") or End(" + v1 + ") is out of range [0.." + this.getAnnotatedString().getText().length() + "), or start > end!").toString());
        }
        if(v == v1) {
            return AndroidPath_androidKt.Path();
        }
        int v3 = MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, v);
        Path path0 = AndroidPath_androidKt.Path();
        List list0 = TempListUtilsKt.fastDrop(this.paragraphInfoList, v3);
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v4 = list0.size();
        if(v4 - 1 >= 0) {
            for(int v5 = 0; true; ++v5) {
                Object object0 = list0.get(v5);
                if(((ParagraphInfo)object0).getStartIndex() >= v1) {
                    break;
                }
                arrayList0.add(object0);
                if(v5 + 1 > v4 - 1) {
                    break;
                }
            }
        }
        ArrayList arrayList1 = new ArrayList(arrayList0.size());
        int v6 = arrayList0.size();
        if(v6 - 1 >= 0) {
            for(int v7 = 0; true; ++v7) {
                Object object1 = arrayList0.get(v7);
                if(((ParagraphInfo)object1).getStartIndex() != ((ParagraphInfo)object1).getEndIndex()) {
                    arrayList1.add(object1);
                }
                if(v7 + 1 > v6 - 1) {
                    break;
                }
            }
        }
        int v8 = arrayList1.size();
        if(v8 - 1 >= 0) {
            for(int v2 = 0; true; ++v2) {
                ParagraphInfo paragraphInfo0 = (ParagraphInfo)arrayList1.get(v2);
                DefaultImpls.addPath-Uv8p0NA$default(path0, paragraphInfo0.toGlobal(paragraphInfo0.getParagraph().getPathForRange(paragraphInfo0.toLocalIndex(v), paragraphInfo0.toLocalIndex(v1))), 0L, 2, null);
                if(v2 + 1 > v8 - 1) {
                    break;
                }
            }
        }
        return path0;
    }

    public final List getPlaceholderRects() {
        return this.placeholderRects;
    }

    public final float getWidth() {
        return this.width;
    }

    public final long getWordBoundary--jx7JFs(int v) {
        this.requireIndexInRange(v);
        int v1 = MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, v);
        ParagraphInfo paragraphInfo0 = (ParagraphInfo)this.paragraphInfoList.get(v1);
        return paragraphInfo0.toGlobal-GEjPoXI(paragraphInfo0.getParagraph().getWordBoundary--jx7JFs(paragraphInfo0.toLocalIndex(v)));
    }

    public final boolean isLineEllipsized(int v) {
        this.requireLineIndexInRange(v);
        int v1 = MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, v);
        return ((ParagraphInfo)this.paragraphInfoList.get(v1)).getParagraph().isLineEllipsized(v);
    }

    public final void paint-RPmYEkk(Canvas canvas0, long v, Shadow shadow0, TextDecoration textDecoration0) {
        Intrinsics.checkNotNullParameter(canvas0, "canvas");
        canvas0.save();
        List list0 = this.paragraphInfoList;
        int v1 = list0.size();
        if(v1 - 1 >= 0) {
            for(int v2 = 0; true; ++v2) {
                ParagraphInfo paragraphInfo0 = (ParagraphInfo)list0.get(v2);
                paragraphInfo0.getParagraph().paint-RPmYEkk(canvas0, v, shadow0, textDecoration0);
                canvas0.translate(0.0f, paragraphInfo0.getParagraph().getHeight());
                if(v2 + 1 > v1 - 1) {
                    break;
                }
            }
        }
        canvas0.restore();
    }

    public static void paint-RPmYEkk$default(MultiParagraph multiParagraph0, Canvas canvas0, long v, Shadow shadow0, TextDecoration textDecoration0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 16L;
        }
        multiParagraph0.paint-RPmYEkk(canvas0, v, ((v1 & 4) == 0 ? shadow0 : null), ((v1 & 8) == 0 ? textDecoration0 : null));
    }

    private final void requireIndexInRange(int v) {
        if(v < 0 || v > this.getAnnotatedString().getText().length() - 1) {
            throw new IllegalArgumentException(("offset(" + v + ") is out of bounds [0, " + this.getAnnotatedString().length() + ')').toString());
        }
    }

    private final void requireIndexInRangeInclusiveEnd(int v) {
        if(v < 0 || v > this.getAnnotatedString().getText().length()) {
            throw new IllegalArgumentException(("offset(" + v + ") is out of bounds [0, " + this.getAnnotatedString().length() + ']').toString());
        }
    }

    private final void requireLineIndexInRange(int v) {
        if(v < 0 || v >= this.lineCount) {
            throw new IllegalArgumentException(("lineIndex(" + v + ") is out of bounds [0, " + v + ')').toString());
        }
    }
}

