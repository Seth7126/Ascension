package androidx.compose.ui.text;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0002./B;\b\u0016\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u0012\u0014\b\u0002\u0010\b\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00060\u0005\u00A2\u0006\u0002\u0010\nBS\b\u0000\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u0012\u0014\b\u0002\u0010\b\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00060\u0005\u0012\u0016\b\u0002\u0010\u000B\u001A\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u00060\u0005\u00A2\u0006\u0002\u0010\rJ\u0013\u0010\u0018\u001A\u00020\u00192\b\u0010\u001A\u001A\u0004\u0018\u00010\fH\u0096\u0002J\u0011\u0010\u001B\u001A\u00020\u001C2\u0006\u0010\u001D\u001A\u00020\u0011H\u0096\u0002J\"\u0010\u001E\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u00052\u0006\u0010\u001F\u001A\u00020\u00112\u0006\u0010 \u001A\u00020\u0011J*\u0010\u001E\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u00052\u0006\u0010!\u001A\u00020\u00032\u0006\u0010\u001F\u001A\u00020\u00112\u0006\u0010 \u001A\u00020\u0011J\"\u0010\"\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00060\u00052\u0006\u0010\u001F\u001A\u00020\u00112\u0006\u0010 \u001A\u00020\u0011J\b\u0010$\u001A\u00020\u0011H\u0016J\u0011\u0010%\u001A\u00020\u00002\u0006\u0010\u001A\u001A\u00020\u0000H\u0087\u0002J\u001B\u0010&\u001A\u00020\u00002\u0006\u0010\'\u001A\u00020(\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b)\u0010*J\u0018\u0010&\u001A\u00020\u00002\u0006\u0010+\u001A\u00020\u00112\u0006\u0010,\u001A\u00020\u0011H\u0016J\b\u0010-\u001A\u00020\u0003H\u0016R\"\u0010\u000B\u001A\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u00060\u0005X\u0080\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000FR\u0014\u0010\u0010\u001A\u00020\u00118VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013R\u001D\u0010\b\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00060\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0014\u0010\u000FR\u001D\u0010\u0004\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0015\u0010\u000FR\u0011\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0016\u0010\u0017\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\u00A8\u00060"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "", "text", "", "spanStyles", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "paragraphStyles", "Landroidx/compose/ui/text/ParagraphStyle;", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "annotations", "", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getAnnotations$ui_text_release", "()Ljava/util/List;", "length", "", "getLength", "()I", "getParagraphStyles", "getSpanStyles", "getText", "()Ljava/lang/String;", "equals", "", "other", "get", "", "index", "getStringAnnotations", "start", "end", "tag", "getTtsAnnotations", "Landroidx/compose/ui/text/TtsAnnotation;", "hashCode", "plus", "subSequence", "range", "Landroidx/compose/ui/text/TextRange;", "subSequence-5zc-tL8", "(J)Landroidx/compose/ui/text/AnnotatedString;", "startIndex", "endIndex", "toString", "Builder", "Range", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class AnnotatedString implements CharSequence {
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001+B\u000F\b\u0016\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\u0002\u0010\u0004B\u000F\b\u0016\u0012\u0006\u0010\u0002\u001A\u00020\u0005\u00A2\u0006\u0002\u0010\u0006B\u000F\u0012\b\b\u0002\u0010\u0007\u001A\u00020\b\u00A2\u0006\u0002\u0010\tJ&\u0010\u0017\u001A\u00020\u00182\u0006\u0010\u0019\u001A\u00020\u00032\u0006\u0010\u001A\u001A\u00020\u00032\u0006\u0010\u001B\u001A\u00020\b2\u0006\u0010\u001C\u001A\u00020\bJ\u001E\u0010\u001D\u001A\u00020\u00182\u0006\u0010\u001E\u001A\u00020\u00112\u0006\u0010\u001B\u001A\u00020\b2\u0006\u0010\u001C\u001A\u00020\bJ\u001E\u0010\u001D\u001A\u00020\u00182\u0006\u0010\u001E\u001A\u00020\u00132\u0006\u0010\u001B\u001A\u00020\b2\u0006\u0010\u001C\u001A\u00020\bJ \u0010\u001F\u001A\u00020\u00182\u0006\u0010 \u001A\u00020!2\u0006\u0010\u001B\u001A\u00020\b2\u0006\u0010\u001C\u001A\u00020\bH\u0007J\u000E\u0010\"\u001A\u00020\u00182\u0006\u0010\u0002\u001A\u00020\u0005J\u000E\u0010\"\u001A\u00020\u00182\u0006\u0010#\u001A\u00020$J\u000E\u0010\"\u001A\u00020\u00182\u0006\u0010\u0002\u001A\u00020\u0003J\u0006\u0010%\u001A\u00020\u0018J\u000E\u0010%\u001A\u00020\u00182\u0006\u0010&\u001A\u00020\bJ\u0016\u0010\'\u001A\u00020\b2\u0006\u0010\u0019\u001A\u00020\u00032\u0006\u0010\u001A\u001A\u00020\u0003J\u000E\u0010(\u001A\u00020\b2\u0006\u0010\u001E\u001A\u00020\u0011J\u000E\u0010(\u001A\u00020\b2\u0006\u0010\u001E\u001A\u00020\u0013J\u000E\u0010)\u001A\u00020\b2\u0006\u0010 \u001A\u00020!J\u0006\u0010*\u001A\u00020\u0005R\u001C\u0010\n\u001A\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\f0\u000BX\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0011\u0010\r\u001A\u00020\b8F\u00A2\u0006\u0006\u001A\u0004\b\u000E\u0010\u000FR\u001A\u0010\u0010\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\f0\u000BX\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u001A\u0010\u0012\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\f0\u000BX\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u001C\u0010\u0014\u001A\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\f0\u000BX\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0012\u0010\u0002\u001A\u00060\u0015j\u0002`\u0016X\u0082\u0004\u00A2\u0006\u0002\n\u0000\u00A8\u0006,"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Builder;", "", "text", "", "(Ljava/lang/String;)V", "Landroidx/compose/ui/text/AnnotatedString;", "(Landroidx/compose/ui/text/AnnotatedString;)V", "capacity", "", "(I)V", "annotations", "", "Landroidx/compose/ui/text/AnnotatedString$Builder$MutableRange;", "length", "getLength", "()I", "paragraphStyles", "Landroidx/compose/ui/text/ParagraphStyle;", "spanStyles", "Landroidx/compose/ui/text/SpanStyle;", "styleStack", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "addStringAnnotation", "", "tag", "annotation", "start", "end", "addStyle", "style", "addTtsAnnotation", "ttsAnnotation", "Landroidx/compose/ui/text/TtsAnnotation;", "append", "char", "", "pop", "index", "pushStringAnnotation", "pushStyle", "pushTtsAnnotation", "toAnnotatedString", "MutableRange", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Builder {
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0012\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B)\u0012\u0006\u0010\u0003\u001A\u00028\u0000\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001A\u00020\b¢\u0006\u0002\u0010\tJ\u000E\u0010\u0014\u001A\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u000FJ\t\u0010\u0015\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001A\u00020\bHÆ\u0003J<\u0010\u0018\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001A\u00028\u00002\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\bHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001A\u001A\u00020\u001B2\b\u0010\u001C\u001A\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u001D\u001A\u00020\u0005HÖ\u0001J\u0016\u0010\u001E\u001A\b\u0012\u0004\u0012\u00028\u00000\u001F2\b\b\u0002\u0010 \u001A\u00020\u0005J\t\u0010!\u001A\u00020\bHÖ\u0001R\u001A\u0010\u0006\u001A\u00020\u0005X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\n\u0010\u000B\"\u0004\b\f\u0010\rR\u0013\u0010\u0003\u001A\u00028\u0000¢\u0006\n\n\u0002\u0010\u0010\u001A\u0004\b\u000E\u0010\u000FR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u000BR\u0011\u0010\u0007\u001A\u00020\b¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\u0013¨\u0006\""}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Builder$MutableRange;", "T", "", "item", "start", "", "end", "tag", "", "(Ljava/lang/Object;IILjava/lang/String;)V", "getEnd", "()I", "setEnd", "(I)V", "getItem", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getStart", "getTag", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Object;IILjava/lang/String;)Landroidx/compose/ui/text/AnnotatedString$Builder$MutableRange;", "equals", "", "other", "hashCode", "toRange", "Landroidx/compose/ui/text/AnnotatedString$Range;", "defaultEnd", "toString", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
        static final class MutableRange {
            private int end;
            private final Object item;
            private final int start;
            private final String tag;

            public MutableRange(Object object0, int v, int v1, String s) {
                Intrinsics.checkNotNullParameter(s, "tag");
                super();
                this.item = object0;
                this.start = v;
                this.end = v1;
                this.tag = s;
            }

            public MutableRange(Object object0, int v, int v1, String s, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
                if((v2 & 4) != 0) {
                    v1 = 0x80000000;
                }
                if((v2 & 8) != 0) {
                    s = "";
                }
                this(object0, v, v1, s);
            }

            public final Object component1() {
                return this.item;
            }

            public final int component2() {
                return this.start;
            }

            public final int component3() {
                return this.end;
            }

            public final String component4() {
                return this.tag;
            }

            public final MutableRange copy(Object object0, int v, int v1, String s) {
                Intrinsics.checkNotNullParameter(s, "tag");
                return new MutableRange(object0, v, v1, s);
            }

            public static MutableRange copy$default(MutableRange annotatedString$Builder$MutableRange0, Object object0, int v, int v1, String s, int v2, Object object1) {
                if((v2 & 1) != 0) {
                    object0 = annotatedString$Builder$MutableRange0.item;
                }
                if((v2 & 2) != 0) {
                    v = annotatedString$Builder$MutableRange0.start;
                }
                if((v2 & 4) != 0) {
                    v1 = annotatedString$Builder$MutableRange0.end;
                }
                if((v2 & 8) != 0) {
                    s = annotatedString$Builder$MutableRange0.tag;
                }
                return annotatedString$Builder$MutableRange0.copy(object0, v, v1, s);
            }

            @Override
            public boolean equals(Object object0) {
                if(this == object0) {
                    return true;
                }
                if(!(object0 instanceof MutableRange)) {
                    return false;
                }
                if(!Intrinsics.areEqual(this.item, ((MutableRange)object0).item)) {
                    return false;
                }
                if(this.start != ((MutableRange)object0).start) {
                    return false;
                }
                return this.end == ((MutableRange)object0).end ? Intrinsics.areEqual(this.tag, ((MutableRange)object0).tag) : false;
            }

            public final int getEnd() {
                return this.end;
            }

            public final Object getItem() {
                return this.item;
            }

            public final int getStart() {
                return this.start;
            }

            public final String getTag() {
                return this.tag;
            }

            @Override
            public int hashCode() {
                return this.item == null ? (this.start * 0x1F + this.end) * 0x1F + this.tag.hashCode() : ((this.item.hashCode() * 0x1F + this.start) * 0x1F + this.end) * 0x1F + this.tag.hashCode();
            }

            public final void setEnd(int v) {
                this.end = v;
            }

            public final Range toRange(int v) {
                int v1 = this.end;
                if(v1 != 0x80000000) {
                    v = v1;
                }
                if(v == 0x80000000) {
                    throw new IllegalStateException("Item.end should be set first");
                }
                return new Range(this.item, this.start, v, this.tag);
            }

            public static Range toRange$default(MutableRange annotatedString$Builder$MutableRange0, int v, int v1, Object object0) {
                if((v1 & 1) != 0) {
                    v = 0x80000000;
                }
                return annotatedString$Builder$MutableRange0.toRange(v);
            }

            @Override
            public String toString() {
                return "MutableRange(item=" + this.item + ", start=" + this.start + ", end=" + this.end + ", tag=" + this.tag + ')';
            }
        }

        private final List annotations;
        private final List paragraphStyles;
        private final List spanStyles;
        private final List styleStack;
        private final StringBuilder text;

        public Builder() {
            this(0, 1, null);
        }

        public Builder(int v) {
            this.text = new StringBuilder(v);
            this.spanStyles = new ArrayList();
            this.paragraphStyles = new ArrayList();
            this.annotations = new ArrayList();
            this.styleStack = new ArrayList();
        }

        public Builder(int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v1 & 1) != 0) {
                v = 16;
            }
            this(v);
        }

        public Builder(AnnotatedString annotatedString0) {
            Intrinsics.checkNotNullParameter(annotatedString0, "text");
            this(0, 1, null);
            this.append(annotatedString0);
        }

        public Builder(String s) {
            Intrinsics.checkNotNullParameter(s, "text");
            this(0, 1, null);
            this.append(s);
        }

        public final void addStringAnnotation(String s, String s1, int v, int v1) {
            Intrinsics.checkNotNullParameter(s, "tag");
            Intrinsics.checkNotNullParameter(s1, "annotation");
            MutableRange annotatedString$Builder$MutableRange0 = new MutableRange(s1, v, v1, s);
            this.annotations.add(annotatedString$Builder$MutableRange0);
        }

        public final void addStyle(ParagraphStyle paragraphStyle0, int v, int v1) {
            Intrinsics.checkNotNullParameter(paragraphStyle0, "style");
            MutableRange annotatedString$Builder$MutableRange0 = new MutableRange(paragraphStyle0, v, v1, null, 8, null);
            this.paragraphStyles.add(annotatedString$Builder$MutableRange0);
        }

        public final void addStyle(SpanStyle spanStyle0, int v, int v1) {
            Intrinsics.checkNotNullParameter(spanStyle0, "style");
            MutableRange annotatedString$Builder$MutableRange0 = new MutableRange(spanStyle0, v, v1, null, 8, null);
            this.spanStyles.add(annotatedString$Builder$MutableRange0);
        }

        @ExperimentalTextApi
        public final void addTtsAnnotation(TtsAnnotation ttsAnnotation0, int v, int v1) {
            Intrinsics.checkNotNullParameter(ttsAnnotation0, "ttsAnnotation");
            MutableRange annotatedString$Builder$MutableRange0 = new MutableRange(ttsAnnotation0, v, v1, null, 8, null);
            this.annotations.add(annotatedString$Builder$MutableRange0);
        }

        public final void append(char c) {
            this.text.append(c);
        }

        public final void append(AnnotatedString annotatedString0) {
            Intrinsics.checkNotNullParameter(annotatedString0, "text");
            int v = this.text.length();
            this.text.append(annotatedString0.getText());
            List list0 = annotatedString0.getSpanStyles();
            int v1 = list0.size();
            if(v1 - 1 >= 0) {
                for(int v3 = 0; true; ++v3) {
                    Range annotatedString$Range0 = (Range)list0.get(v3);
                    this.addStyle(((SpanStyle)annotatedString$Range0.getItem()), annotatedString$Range0.getStart() + v, annotatedString$Range0.getEnd() + v);
                    if(v3 + 1 > v1 - 1) {
                        break;
                    }
                }
            }
            List list1 = annotatedString0.getParagraphStyles();
            int v4 = list1.size();
            if(v4 - 1 >= 0) {
                for(int v5 = 0; true; ++v5) {
                    Range annotatedString$Range1 = (Range)list1.get(v5);
                    this.addStyle(((ParagraphStyle)annotatedString$Range1.getItem()), annotatedString$Range1.getStart() + v, annotatedString$Range1.getEnd() + v);
                    if(v5 + 1 > v4 - 1) {
                        break;
                    }
                }
            }
            List list2 = annotatedString0.getAnnotations$ui_text_release();
            int v6 = list2.size();
            if(v6 - 1 >= 0) {
                for(int v2 = 0; true; ++v2) {
                    Range annotatedString$Range2 = (Range)list2.get(v2);
                    MutableRange annotatedString$Builder$MutableRange0 = new MutableRange(annotatedString$Range2.getItem(), annotatedString$Range2.getStart() + v, annotatedString$Range2.getEnd() + v, annotatedString$Range2.getTag());
                    this.annotations.add(annotatedString$Builder$MutableRange0);
                    if(v2 + 1 > v6 - 1) {
                        break;
                    }
                }
            }
        }

        public final void append(String s) {
            Intrinsics.checkNotNullParameter(s, "text");
            this.text.append(s);
        }

        public final int getLength() {
            return this.text.length();
        }

        public final void pop() {
            if(!this.styleStack.isEmpty() == 0) {
                throw new IllegalStateException("Nothing to pop.");
            }
            ((MutableRange)this.styleStack.remove(this.styleStack.size() - 1)).setEnd(this.text.length());
        }

        public final void pop(int v) {
            if(v >= this.styleStack.size()) {
                throw new IllegalStateException((v + " should be less than " + this.styleStack.size()).toString());
            }
            while(this.styleStack.size() - 1 >= v) {
                this.pop();
            }
        }

        public final int pushStringAnnotation(String s, String s1) {
            Intrinsics.checkNotNullParameter(s, "tag");
            Intrinsics.checkNotNullParameter(s1, "annotation");
            MutableRange annotatedString$Builder$MutableRange0 = new MutableRange(s1, this.text.length(), 0, s, 4, null);
            this.styleStack.add(annotatedString$Builder$MutableRange0);
            this.annotations.add(annotatedString$Builder$MutableRange0);
            return this.styleStack.size() - 1;
        }

        public final int pushStyle(ParagraphStyle paragraphStyle0) {
            Intrinsics.checkNotNullParameter(paragraphStyle0, "style");
            MutableRange annotatedString$Builder$MutableRange0 = new MutableRange(paragraphStyle0, this.text.length(), 0, null, 12, null);
            this.styleStack.add(annotatedString$Builder$MutableRange0);
            this.paragraphStyles.add(annotatedString$Builder$MutableRange0);
            return this.styleStack.size() - 1;
        }

        public final int pushStyle(SpanStyle spanStyle0) {
            Intrinsics.checkNotNullParameter(spanStyle0, "style");
            MutableRange annotatedString$Builder$MutableRange0 = new MutableRange(spanStyle0, this.text.length(), 0, null, 12, null);
            this.styleStack.add(annotatedString$Builder$MutableRange0);
            this.spanStyles.add(annotatedString$Builder$MutableRange0);
            return this.styleStack.size() - 1;
        }

        public final int pushTtsAnnotation(TtsAnnotation ttsAnnotation0) {
            Intrinsics.checkNotNullParameter(ttsAnnotation0, "ttsAnnotation");
            MutableRange annotatedString$Builder$MutableRange0 = new MutableRange(ttsAnnotation0, this.text.length(), 0, null, 12, null);
            this.styleStack.add(annotatedString$Builder$MutableRange0);
            this.annotations.add(annotatedString$Builder$MutableRange0);
            return this.styleStack.size() - 1;
        }

        public final AnnotatedString toAnnotatedString() {
            String s = this.text.toString();
            Intrinsics.checkNotNullExpressionValue(s, "text.toString()");
            List list0 = this.spanStyles;
            ArrayList arrayList0 = new ArrayList(list0.size());
            int v = list0.size();
            if(v - 1 >= 0) {
                for(int v2 = 0; true; ++v2) {
                    arrayList0.add(((MutableRange)list0.get(v2)).toRange(this.text.length()));
                    if(v2 + 1 > v - 1) {
                        break;
                    }
                }
            }
            List list1 = this.paragraphStyles;
            ArrayList arrayList1 = new ArrayList(list1.size());
            int v3 = list1.size();
            if(v3 - 1 >= 0) {
                for(int v4 = 0; true; ++v4) {
                    arrayList1.add(((MutableRange)list1.get(v4)).toRange(this.text.length()));
                    if(v4 + 1 > v3 - 1) {
                        break;
                    }
                }
            }
            List list2 = this.annotations;
            ArrayList arrayList2 = new ArrayList(list2.size());
            int v5 = list2.size();
            if(v5 - 1 >= 0) {
                for(int v1 = 0; true; ++v1) {
                    arrayList2.add(((MutableRange)list2.get(v1)).toRange(this.text.length()));
                    if(v1 + 1 > v5 - 1) {
                        break;
                    }
                }
            }
            return new AnnotatedString(s, arrayList0, arrayList1, arrayList2);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0010\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001F\b\u0016\u0012\u0006\u0010\u0003\u001A\u00028\u0000\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0002\u0010\u0007B%\u0012\u0006\u0010\u0003\u001A\u00028\u0000\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\t¢\u0006\u0002\u0010\nJ\u000E\u0010\u0013\u001A\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u000EJ\t\u0010\u0014\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001A\u00020\tHÆ\u0003J<\u0010\u0017\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001A\u00028\u00002\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\tHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001A\u00020\u001A2\b\u0010\u001B\u001A\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u001C\u001A\u00020\u0005HÖ\u0001J\t\u0010\u001D\u001A\u00020\tHÖ\u0001R\u0011\u0010\u0006\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0013\u0010\u0003\u001A\u00028\u0000¢\u0006\n\n\u0002\u0010\u000F\u001A\u0004\b\r\u0010\u000ER\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001A\u00020\t¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u0012¨\u0006\u001E"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Range;", "T", "", "item", "start", "", "end", "(Ljava/lang/Object;II)V", "tag", "", "(Ljava/lang/Object;IILjava/lang/String;)V", "getEnd", "()I", "getItem", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getStart", "getTag", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Object;IILjava/lang/String;)Landroidx/compose/ui/text/AnnotatedString$Range;", "equals", "", "other", "hashCode", "toString", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Range {
        private final int end;
        private final Object item;
        private final int start;
        private final String tag;

        public Range(Object object0, int v, int v1) {
            this(object0, v, v1, "");
        }

        public Range(Object object0, int v, int v1, String s) {
            Intrinsics.checkNotNullParameter(s, "tag");
            super();
            this.item = object0;
            this.start = v;
            this.end = v1;
            this.tag = s;
            if(v > v1) {
                throw new IllegalArgumentException("Reversed range is not supported");
            }
        }

        public final Object component1() {
            return this.item;
        }

        public final int component2() {
            return this.start;
        }

        public final int component3() {
            return this.end;
        }

        public final String component4() {
            return this.tag;
        }

        public final Range copy(Object object0, int v, int v1, String s) {
            Intrinsics.checkNotNullParameter(s, "tag");
            return new Range(object0, v, v1, s);
        }

        public static Range copy$default(Range annotatedString$Range0, Object object0, int v, int v1, String s, int v2, Object object1) {
            if((v2 & 1) != 0) {
                object0 = annotatedString$Range0.item;
            }
            if((v2 & 2) != 0) {
                v = annotatedString$Range0.start;
            }
            if((v2 & 4) != 0) {
                v1 = annotatedString$Range0.end;
            }
            if((v2 & 8) != 0) {
                s = annotatedString$Range0.tag;
            }
            return annotatedString$Range0.copy(object0, v, v1, s);
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Range)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.item, ((Range)object0).item)) {
                return false;
            }
            if(this.start != ((Range)object0).start) {
                return false;
            }
            return this.end == ((Range)object0).end ? Intrinsics.areEqual(this.tag, ((Range)object0).tag) : false;
        }

        public final int getEnd() {
            return this.end;
        }

        public final Object getItem() {
            return this.item;
        }

        public final int getStart() {
            return this.start;
        }

        public final String getTag() {
            return this.tag;
        }

        @Override
        public int hashCode() {
            return this.item == null ? (this.start * 0x1F + this.end) * 0x1F + this.tag.hashCode() : ((this.item.hashCode() * 0x1F + this.start) * 0x1F + this.end) * 0x1F + this.tag.hashCode();
        }

        @Override
        public String toString() {
            return "Range(item=" + this.item + ", start=" + this.start + ", end=" + this.end + ", tag=" + this.tag + ')';
        }
    }

    private final List annotations;
    private final List paragraphStyles;
    private final List spanStyles;
    private final String text;

    public AnnotatedString(String s, List list0, List list1) {
        Intrinsics.checkNotNullParameter(s, "text");
        Intrinsics.checkNotNullParameter(list0, "spanStyles");
        Intrinsics.checkNotNullParameter(list1, "paragraphStyles");
        this(s, list0, list1, CollectionsKt.emptyList());
    }

    public AnnotatedString(String s, List list0, List list1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            list0 = CollectionsKt.emptyList();
        }
        if((v & 4) != 0) {
            list1 = CollectionsKt.emptyList();
        }
        this(s, list0, list1);
    }

    public AnnotatedString(String s, List list0, List list1, List list2) {
        Intrinsics.checkNotNullParameter(s, "text");
        Range annotatedString$Range0;
        Intrinsics.checkNotNullParameter(list0, "spanStyles");
        Intrinsics.checkNotNullParameter(list1, "paragraphStyles");
        Intrinsics.checkNotNullParameter(list2, "annotations");
        super();
        this.text = s;
        this.spanStyles = list0;
        this.paragraphStyles = list1;
        this.annotations = list2;
        int v = list1.size();
        int v1 = -1;
        if(v - 1 >= 0) {
            for(int v2 = 0; true; ++v2) {
                annotatedString$Range0 = (Range)list1.get(v2);
                if(annotatedString$Range0.getStart() < v1) {
                    throw new IllegalArgumentException("ParagraphStyle should not overlap");
                }
                if(annotatedString$Range0.getEnd() > this.getText().length()) {
                    break;
                }
                v1 = annotatedString$Range0.getEnd();
                if(v2 + 1 > v - 1) {
                    return;
                }
            }
            throw new IllegalArgumentException(("ParagraphStyle range [" + annotatedString$Range0.getStart() + ", " + annotatedString$Range0.getEnd() + ") is out of boundary").toString());
        }
    }

    public AnnotatedString(String s, List list0, List list1, List list2, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            list0 = CollectionsKt.emptyList();
        }
        if((v & 4) != 0) {
            list1 = CollectionsKt.emptyList();
        }
        if((v & 8) != 0) {
            list2 = CollectionsKt.emptyList();
        }
        this(s, list0, list1, list2);
    }

    @Override
    public final char charAt(int v) {
        return this.get(v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof AnnotatedString)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.text, ((AnnotatedString)object0).text)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.spanStyles, ((AnnotatedString)object0).spanStyles)) {
            return false;
        }
        return Intrinsics.areEqual(this.paragraphStyles, ((AnnotatedString)object0).paragraphStyles) ? Intrinsics.areEqual(this.annotations, ((AnnotatedString)object0).annotations) : false;
    }

    public char get(int v) {
        return this.text.charAt(v);
    }

    public final List getAnnotations$ui_text_release() {
        return this.annotations;
    }

    public int getLength() {
        return this.text.length();
    }

    public final List getParagraphStyles() {
        return this.paragraphStyles;
    }

    public final List getSpanStyles() {
        return this.spanStyles;
    }

    public final List getStringAnnotations(int v, int v1) {
        List list0 = this.annotations;
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v2 = list0.size();
        if(v2 - 1 >= 0) {
            for(int v3 = 0; true; ++v3) {
                Object object0 = list0.get(v3);
                Range annotatedString$Range0 = (Range)object0;
                if(annotatedString$Range0.getItem() instanceof String && AnnotatedStringKt.intersect(v, v1, annotatedString$Range0.getStart(), annotatedString$Range0.getEnd())) {
                    arrayList0.add(object0);
                }
                if(v3 + 1 > v2 - 1) {
                    break;
                }
            }
        }
        return arrayList0;
    }

    public final List getStringAnnotations(String s, int v, int v1) {
        Intrinsics.checkNotNullParameter(s, "tag");
        List list0 = this.annotations;
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v2 = list0.size();
        if(v2 - 1 >= 0) {
            for(int v3 = 0; true; ++v3) {
                Object object0 = list0.get(v3);
                Range annotatedString$Range0 = (Range)object0;
                if(annotatedString$Range0.getItem() instanceof String && Intrinsics.areEqual(s, annotatedString$Range0.getTag()) && AnnotatedStringKt.intersect(v, v1, annotatedString$Range0.getStart(), annotatedString$Range0.getEnd())) {
                    arrayList0.add(object0);
                }
                if(v3 + 1 > v2 - 1) {
                    break;
                }
            }
        }
        return arrayList0;
    }

    public final String getText() {
        return this.text;
    }

    public final List getTtsAnnotations(int v, int v1) {
        List list0 = this.annotations;
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v2 = list0.size();
        if(v2 - 1 >= 0) {
            for(int v3 = 0; true; ++v3) {
                Object object0 = list0.get(v3);
                Range annotatedString$Range0 = (Range)object0;
                if(annotatedString$Range0.getItem() instanceof TtsAnnotation && AnnotatedStringKt.intersect(v, v1, annotatedString$Range0.getStart(), annotatedString$Range0.getEnd())) {
                    arrayList0.add(object0);
                }
                if(v3 + 1 > v2 - 1) {
                    break;
                }
            }
        }
        return arrayList0;
    }

    @Override
    public int hashCode() {
        return ((this.text.hashCode() * 0x1F + this.spanStyles.hashCode()) * 0x1F + this.paragraphStyles.hashCode()) * 0x1F + this.annotations.hashCode();
    }

    @Override
    public final int length() {
        return this.getLength();
    }

    public final AnnotatedString plus(AnnotatedString annotatedString0) {
        Intrinsics.checkNotNullParameter(annotatedString0, "other");
        Builder annotatedString$Builder0 = new Builder(this);
        annotatedString$Builder0.append(annotatedString0);
        return annotatedString$Builder0.toAnnotatedString();
    }

    public AnnotatedString subSequence(int v, int v1) {
        if(v > v1) {
            throw new IllegalArgumentException(("start (" + v + ") should be less or equal to end (" + v1 + ')').toString());
        }
        if(v == 0 && v1 == this.text.length()) {
            return this;
        }
        String s = this.text;
        if(s == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String s1 = s.substring(v, v1);
        Intrinsics.checkNotNullExpressionValue(s1, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return new AnnotatedString(s1, AnnotatedStringKt.filterRanges(this.spanStyles, v, v1), AnnotatedStringKt.filterRanges(this.paragraphStyles, v, v1), AnnotatedStringKt.filterRanges(this.annotations, v, v1));
    }

    @Override
    public CharSequence subSequence(int v, int v1) {
        return this.subSequence(v, v1);
    }

    public final AnnotatedString subSequence-5zc-tL8(long v) {
        return this.subSequence(TextRange.getMin-impl(v), TextRange.getMax-impl(v));
    }

    @Override
    public String toString() {
        return this.text;
    }
}

