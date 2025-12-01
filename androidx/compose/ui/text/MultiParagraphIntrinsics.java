package androidx.compose.ui.text;

import androidx.compose.ui.text.font.Font.ResourceLoader;
import androidx.compose.ui.unit.Density;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0012\u0010\u0006\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007\u0012\u0006\u0010\n\u001A\u00020\u000B\u0012\u0006\u0010\f\u001A\u00020\r¢\u0006\u0002\u0010\u000EJ\u0018\u0010\u001F\u001A\u00020 2\u0006\u0010\u0004\u001A\u00020 2\u0006\u0010!\u001A\u00020 H\u0002R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u0010R\u001A\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u00120\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u0014R\u001B\u0010\u0015\u001A\u00020\u00168VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u0017\u0010\u0018R\u001B\u0010\u001B\u001A\u00020\u00168VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001D\u0010\u001A\u001A\u0004\b\u001C\u0010\u0018R\u001D\u0010\u0006\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007¢\u0006\b\n\u0000\u001A\u0004\b\u001E\u0010\u0014¨\u0006\""}, d2 = {"Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "annotatedString", "Landroidx/compose/ui/text/AnnotatedString;", "style", "Landroidx/compose/ui/text/TextStyle;", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "density", "Landroidx/compose/ui/unit/Density;", "resourceLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/Font$ResourceLoader;)V", "getAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "infoList", "Landroidx/compose/ui/text/ParagraphIntrinsicInfo;", "getInfoList$ui_text_release", "()Ljava/util/List;", "maxIntrinsicWidth", "", "getMaxIntrinsicWidth", "()F", "maxIntrinsicWidth$delegate", "Lkotlin/Lazy;", "minIntrinsicWidth", "getMinIntrinsicWidth", "minIntrinsicWidth$delegate", "getPlaceholders", "resolveTextDirection", "Landroidx/compose/ui/text/ParagraphStyle;", "defaultStyle", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class MultiParagraphIntrinsics implements ParagraphIntrinsics {
    private final AnnotatedString annotatedString;
    private final List infoList;
    private final Lazy maxIntrinsicWidth$delegate;
    private final Lazy minIntrinsicWidth$delegate;
    private final List placeholders;

    static {
    }

    public MultiParagraphIntrinsics(AnnotatedString annotatedString0, TextStyle textStyle0, List list0, Density density0, ResourceLoader font$ResourceLoader0) {
        Intrinsics.checkNotNullParameter(annotatedString0, "annotatedString");
        Intrinsics.checkNotNullParameter(textStyle0, "style");
        Intrinsics.checkNotNullParameter(list0, "placeholders");
        Intrinsics.checkNotNullParameter(density0, "density");
        Intrinsics.checkNotNullParameter(font$ResourceLoader0, "resourceLoader");
        super();
        this.annotatedString = annotatedString0;
        this.placeholders = list0;
        Function0 function00 = new Function0() {
            {
                MultiParagraphIntrinsics.this = multiParagraphIntrinsics0;
                super(0);
            }

            public final float invoke() {
                List list0 = MultiParagraphIntrinsics.this.getInfoList$ui_text_release();
                if(list0.isEmpty()) {
                    return 0.0f;
                }
                Object object0 = list0.get(0);
                float f = ((ParagraphIntrinsicInfo)object0).getIntrinsics().getMinIntrinsicWidth();
                int v = CollectionsKt.getLastIndex(list0);
                if(1 <= v) {
                    for(int v1 = 1; true; ++v1) {
                        Object object1 = list0.get(v1);
                        float f1 = ((ParagraphIntrinsicInfo)object1).getIntrinsics().getMinIntrinsicWidth();
                        if(Float.compare(f, f1) < 0) {
                            object0 = object1;
                            f = f1;
                        }
                        if(v1 == v) {
                            break;
                        }
                    }
                }
                return ((ParagraphIntrinsicInfo)object0) == null ? 0.0f : ((ParagraphIntrinsicInfo)object0).getIntrinsics().getMinIntrinsicWidth();
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        };
        this.minIntrinsicWidth$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, function00);
        Function0 function01 = new Function0() {
            {
                MultiParagraphIntrinsics.this = multiParagraphIntrinsics0;
                super(0);
            }

            public final float invoke() {
                List list0 = MultiParagraphIntrinsics.this.getInfoList$ui_text_release();
                if(list0.isEmpty()) {
                    return 0.0f;
                }
                Object object0 = list0.get(0);
                float f = ((ParagraphIntrinsicInfo)object0).getIntrinsics().getMaxIntrinsicWidth();
                int v = CollectionsKt.getLastIndex(list0);
                if(1 <= v) {
                    for(int v1 = 1; true; ++v1) {
                        Object object1 = list0.get(v1);
                        float f1 = ((ParagraphIntrinsicInfo)object1).getIntrinsics().getMaxIntrinsicWidth();
                        if(Float.compare(f, f1) < 0) {
                            object0 = object1;
                            f = f1;
                        }
                        if(v1 == v) {
                            break;
                        }
                    }
                }
                return ((ParagraphIntrinsicInfo)object0) == null ? 0.0f : ((ParagraphIntrinsicInfo)object0).getIntrinsics().getMaxIntrinsicWidth();
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        };
        this.maxIntrinsicWidth$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, function01);
        ParagraphStyle paragraphStyle0 = textStyle0.toParagraphStyle();
        List list1 = AnnotatedStringKt.normalizedParagraphStyles(annotatedString0, paragraphStyle0);
        ArrayList arrayList0 = new ArrayList(list1.size());
        int v = list1.size();
        if(v - 1 >= 0) {
            for(int v1 = 0; true; ++v1) {
                Object object0 = list1.get(v1);
                AnnotatedString annotatedString1 = AnnotatedStringKt.substringWithoutParagraphStyles(annotatedString0, ((Range)object0).getStart(), ((Range)object0).getEnd());
                arrayList0.add(new ParagraphIntrinsicInfo(ParagraphIntrinsicsKt.ParagraphIntrinsics(annotatedString1.getText(), textStyle0.merge(this.resolveTextDirection(((ParagraphStyle)((Range)object0).getItem()), paragraphStyle0)), annotatedString1.getSpanStyles(), MultiParagraphIntrinsicsKt.getLocalPlaceholders(this.getPlaceholders(), ((Range)object0).getStart(), ((Range)object0).getEnd()), density0, font$ResourceLoader0), ((Range)object0).getStart(), ((Range)object0).getEnd()));
                if(v1 + 1 > v - 1) {
                    break;
                }
            }
        }
        this.infoList = arrayList0;
    }

    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    public final List getInfoList$ui_text_release() {
        return this.infoList;
    }

    @Override  // androidx.compose.ui.text.ParagraphIntrinsics
    public float getMaxIntrinsicWidth() {
        return ((Number)this.maxIntrinsicWidth$delegate.getValue()).floatValue();
    }

    @Override  // androidx.compose.ui.text.ParagraphIntrinsics
    public float getMinIntrinsicWidth() {
        return ((Number)this.minIntrinsicWidth$delegate.getValue()).floatValue();
    }

    public final List getPlaceholders() {
        return this.placeholders;
    }

    private final ParagraphStyle resolveTextDirection(ParagraphStyle paragraphStyle0, ParagraphStyle paragraphStyle1) {
        ParagraphStyle paragraphStyle2 = paragraphStyle0.getTextDirection-mmuk1to() == null ? null : paragraphStyle0;
        return paragraphStyle2 == null ? ParagraphStyle.copy-Elsmlbk$default(paragraphStyle0, null, paragraphStyle1.getTextDirection-mmuk1to(), 0L, null, 13, null) : paragraphStyle2;
    }
}

