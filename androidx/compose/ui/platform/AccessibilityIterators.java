package androidx.compose.ui.platform;

import android.graphics.Rect;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\tB\u0005¢\u0006\u0002\u0010\u0002¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators;", "", "()V", "AbstractTextSegmentIterator", "CharacterTextSegmentIterator", "LineTextSegmentIterator", "PageTextSegmentIterator", "ParagraphTextSegmentIterator", "TextSegmentIterator", "WordTextSegmentIterator", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class AccessibilityIterators {
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001A\u0010\u000B\u001A\u0004\u0018\u00010\u00042\u0006\u0010\f\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\rH\u0004J\u0010\u0010\u000F\u001A\u00020\u00102\u0006\u0010\u0005\u001A\u00020\u0006H\u0016R\u000E\u0010\u0003\u001A\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001A\u0010\u0005\u001A\u00020\u0006X\u0084.¢\u0006\u000E\n\u0000\u001A\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "Landroidx/compose/ui/platform/AccessibilityIterators$TextSegmentIterator;", "()V", "segment", "", "text", "", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "getRange", "start", "", "end", "initialize", "", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static abstract class AbstractTextSegmentIterator implements TextSegmentIterator {
        public static final int $stable = 8;
        private final int[] segment;
        protected String text;

        static {
        }

        public AbstractTextSegmentIterator() {
            this.segment = new int[2];
        }

        protected final int[] getRange(int v, int v1) {
            if(v >= 0 && v1 >= 0 && v != v1) {
                this.segment[0] = v;
                this.segment[1] = v1;
                return this.segment;
            }
            return null;
        }

        protected final String getText() {
            String s = this.text;
            if(s != null) {
                return s;
            }
            Intrinsics.throwUninitializedPropertyAccessException("text");
            throw null;
        }

        public void initialize(String s) {
            Intrinsics.checkNotNullParameter(s, "text");
            this.setText(s);
        }

        protected final void setText(String s) {
            Intrinsics.checkNotNullParameter(s, "<set-?>");
            this.text = s;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\b\u0017\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000F\b\u0002\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001A\u0004\u0018\u00010\b2\u0006\u0010\t\u001A\u00020\nH\u0016J\u0010\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\u000EH\u0016J\u0010\u0010\u000F\u001A\u00020\f2\u0006\u0010\u0002\u001A\u00020\u0003H\u0002J\u0012\u0010\u0010\u001A\u0004\u0018\u00010\b2\u0006\u0010\t\u001A\u00020\nH\u0016R\u000E\u0010\u0005\u001A\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$CharacterTextSegmentIterator;", "Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "locale", "Ljava/util/Locale;", "(Ljava/util/Locale;)V", "impl", "Ljava/text/BreakIterator;", "following", "", "current", "", "initialize", "", "text", "", "onLocaleChanged", "preceding", "Companion", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static class CharacterTextSegmentIterator extends AbstractTextSegmentIterator {
        @Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000E\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u0007R\u0010\u0010\u0003\u001A\u0004\u0018\u00010\u0004X\u0082\u000E¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$CharacterTextSegmentIterator$Companion;", "", "()V", "instance", "Landroidx/compose/ui/platform/AccessibilityIterators$CharacterTextSegmentIterator;", "getInstance", "locale", "Ljava/util/Locale;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
        public static final class Companion {
            private Companion() {
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            public final CharacterTextSegmentIterator getInstance(Locale locale0) {
                Intrinsics.checkNotNullParameter(locale0, "locale");
                if(CharacterTextSegmentIterator.instance == null) {
                    CharacterTextSegmentIterator.instance = new CharacterTextSegmentIterator(locale0, null);
                }
                CharacterTextSegmentIterator accessibilityIterators$CharacterTextSegmentIterator0 = CharacterTextSegmentIterator.instance;
                if(accessibilityIterators$CharacterTextSegmentIterator0 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
                }
                return accessibilityIterators$CharacterTextSegmentIterator0;
            }
        }

        public static final int $stable;
        public static final Companion Companion;
        private BreakIterator impl;
        private static CharacterTextSegmentIterator instance;

        static {
            CharacterTextSegmentIterator.Companion = new Companion(null);
            CharacterTextSegmentIterator.$stable = 8;
        }

        private CharacterTextSegmentIterator(Locale locale0) {
            this.onLocaleChanged(locale0);
        }

        public CharacterTextSegmentIterator(Locale locale0, DefaultConstructorMarker defaultConstructorMarker0) {
            this(locale0);
        }

        @Override  // androidx.compose.ui.platform.AccessibilityIterators$TextSegmentIterator
        public int[] following(int v) {
            int v1 = this.getText().length();
            if(v1 <= 0) {
                return null;
            }
            if(v >= v1) {
                return null;
            }
            if(v < 0) {
                v = 0;
            }
            do {
                BreakIterator breakIterator0 = this.impl;
                if(breakIterator0 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("impl");
                    throw null;
                }
                if(breakIterator0.isBoundary(v)) {
                    goto label_17;
                }
                BreakIterator breakIterator1 = this.impl;
                if(breakIterator1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("impl");
                    throw null;
                }
                v = breakIterator1.following(v);
            }
            while(v != -1);
            return null;
        label_17:
            BreakIterator breakIterator2 = this.impl;
            if(breakIterator2 != null) {
                int v2 = breakIterator2.following(v);
                return v2 == -1 ? null : this.getRange(v, v2);
            }
            Intrinsics.throwUninitializedPropertyAccessException("impl");
            throw null;
        }

        @Override  // androidx.compose.ui.platform.AccessibilityIterators$AbstractTextSegmentIterator
        public void initialize(String s) {
            Intrinsics.checkNotNullParameter(s, "text");
            super.initialize(s);
            BreakIterator breakIterator0 = this.impl;
            if(breakIterator0 != null) {
                breakIterator0.setText(s);
                return;
            }
            Intrinsics.throwUninitializedPropertyAccessException("impl");
            throw null;
        }

        private final void onLocaleChanged(Locale locale0) {
            BreakIterator breakIterator0 = BreakIterator.getCharacterInstance(locale0);
            Intrinsics.checkNotNullExpressionValue(breakIterator0, "getCharacterInstance(locale)");
            this.impl = breakIterator0;
        }

        @Override  // androidx.compose.ui.platform.AccessibilityIterators$TextSegmentIterator
        public int[] preceding(int v) {
            int v1 = this.getText().length();
            if(v1 <= 0) {
                return null;
            }
            if(v <= 0) {
                return null;
            }
            if(v > v1) {
                v = v1;
            }
            do {
                BreakIterator breakIterator0 = this.impl;
                if(breakIterator0 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("impl");
                    throw null;
                }
                if(breakIterator0.isBoundary(v)) {
                    goto label_17;
                }
                BreakIterator breakIterator1 = this.impl;
                if(breakIterator1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("impl");
                    throw null;
                }
                v = breakIterator1.preceding(v);
            }
            while(v != -1);
            return null;
        label_17:
            BreakIterator breakIterator2 = this.impl;
            if(breakIterator2 != null) {
                int v2 = breakIterator2.preceding(v);
                return v2 == -1 ? null : this.getRange(v2, v);
            }
            Intrinsics.throwUninitializedPropertyAccessException("impl");
            throw null;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001A\u00020\bH\u0016J\u0018\u0010\t\u001A\u00020\b2\u0006\u0010\n\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\fH\u0002J\u0016\u0010\r\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u00102\u0006\u0010\u0003\u001A\u00020\u0004J\u0012\u0010\u0011\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001A\u00020\bH\u0016R\u000E\u0010\u0003\u001A\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$LineTextSegmentIterator;", "Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "()V", "layoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "following", "", "current", "", "getLineEdgeIndex", "lineNumber", "direction", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "initialize", "", "text", "", "preceding", "Companion", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class LineTextSegmentIterator extends AbstractTextSegmentIterator {
        @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001A\u00020\u0007R\u000E\u0010\u0003\u001A\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u0005\u001A\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001A\u0004\u0018\u00010\u0007X\u0082\u000E¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$LineTextSegmentIterator$Companion;", "", "()V", "DirectionEnd", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "DirectionStart", "lineInstance", "Landroidx/compose/ui/platform/AccessibilityIterators$LineTextSegmentIterator;", "getInstance", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
        public static final class androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator.Companion {
            private androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator.Companion() {
            }

            public androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            public final LineTextSegmentIterator getInstance() {
                if(LineTextSegmentIterator.lineInstance == null) {
                    LineTextSegmentIterator.lineInstance = new LineTextSegmentIterator(null);
                }
                LineTextSegmentIterator accessibilityIterators$LineTextSegmentIterator0 = LineTextSegmentIterator.lineInstance;
                if(accessibilityIterators$LineTextSegmentIterator0 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
                }
                return accessibilityIterators$LineTextSegmentIterator0;
            }
        }

        public static final int $stable;
        public static final androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator.Companion Companion;
        private static final ResolvedTextDirection DirectionEnd;
        private static final ResolvedTextDirection DirectionStart;
        private TextLayoutResult layoutResult;
        private static LineTextSegmentIterator lineInstance;

        static {
            LineTextSegmentIterator.Companion = new androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator.Companion(null);
            LineTextSegmentIterator.$stable = 8;
            LineTextSegmentIterator.DirectionStart = ResolvedTextDirection.Rtl;
            LineTextSegmentIterator.DirectionEnd = ResolvedTextDirection.Ltr;
        }

        private LineTextSegmentIterator() {
        }

        public LineTextSegmentIterator(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @Override  // androidx.compose.ui.platform.AccessibilityIterators$TextSegmentIterator
        public int[] following(int v) {
            int v1;
            if(this.getText().length() <= 0) {
                return null;
            }
            if(v >= this.getText().length()) {
                return null;
            }
            if(v < 0) {
                TextLayoutResult textLayoutResult0 = this.layoutResult;
                if(textLayoutResult0 != null) {
                    v1 = textLayoutResult0.getLineForOffset(0);
                    goto label_15;
                }
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                throw null;
            }
            TextLayoutResult textLayoutResult1 = this.layoutResult;
            if(textLayoutResult1 != null) {
                int v2 = textLayoutResult1.getLineForOffset(v);
                v1 = this.getLineEdgeIndex(v2, LineTextSegmentIterator.DirectionStart) == v ? v2 : v2 + 1;
            label_15:
                TextLayoutResult textLayoutResult2 = this.layoutResult;
                if(textLayoutResult2 != null) {
                    return v1 < textLayoutResult2.getLineCount() ? this.getRange(this.getLineEdgeIndex(v1, LineTextSegmentIterator.DirectionStart), this.getLineEdgeIndex(v1, LineTextSegmentIterator.DirectionEnd) + 1) : null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
            throw null;
        }

        private final int getLineEdgeIndex(int v, ResolvedTextDirection resolvedTextDirection0) {
            TextLayoutResult textLayoutResult0 = this.layoutResult;
            if(textLayoutResult0 != null) {
                int v1 = textLayoutResult0.getLineStart(v);
                TextLayoutResult textLayoutResult1 = this.layoutResult;
                if(textLayoutResult1 != null) {
                    if(resolvedTextDirection0 != textLayoutResult1.getParagraphDirection(v1)) {
                        TextLayoutResult textLayoutResult2 = this.layoutResult;
                        if(textLayoutResult2 != null) {
                            return textLayoutResult2.getLineStart(v);
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                        throw null;
                    }
                    TextLayoutResult textLayoutResult3 = this.layoutResult;
                    if(textLayoutResult3 != null) {
                        return TextLayoutResult.getLineEnd$default(textLayoutResult3, v, false, 2, null) - 1;
                    }
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
            throw null;
        }

        public final void initialize(String s, TextLayoutResult textLayoutResult0) {
            Intrinsics.checkNotNullParameter(s, "text");
            Intrinsics.checkNotNullParameter(textLayoutResult0, "layoutResult");
            this.setText(s);
            this.layoutResult = textLayoutResult0;
        }

        @Override  // androidx.compose.ui.platform.AccessibilityIterators$TextSegmentIterator
        public int[] preceding(int v) {
            int v1;
            if(this.getText().length() <= 0) {
                return null;
            }
            if(v <= 0) {
                return null;
            }
            if(v > this.getText().length()) {
                TextLayoutResult textLayoutResult0 = this.layoutResult;
                if(textLayoutResult0 != null) {
                    v1 = textLayoutResult0.getLineForOffset(this.getText().length());
                    return v1 >= 0 ? this.getRange(this.getLineEdgeIndex(v1, LineTextSegmentIterator.DirectionStart), this.getLineEdgeIndex(v1, LineTextSegmentIterator.DirectionEnd) + 1) : null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                throw null;
            }
            TextLayoutResult textLayoutResult1 = this.layoutResult;
            if(textLayoutResult1 != null) {
                int v2 = textLayoutResult1.getLineForOffset(v);
                v1 = this.getLineEdgeIndex(v2, LineTextSegmentIterator.DirectionEnd) + 1 == v ? v2 : v2 - 1;
                return v1 >= 0 ? this.getRange(this.getLineEdgeIndex(v1, LineTextSegmentIterator.DirectionStart), this.getLineEdgeIndex(v1, LineTextSegmentIterator.DirectionEnd) + 1) : null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001A\u0004\u0018\u00010\n2\u0006\u0010\u000B\u001A\u00020\fH\u0016J\u0018\u0010\r\u001A\u00020\f2\u0006\u0010\u000E\u001A\u00020\f2\u0006\u0010\u000F\u001A\u00020\u0010H\u0002J\u001E\u0010\u0011\u001A\u00020\u00122\u0006\u0010\u0013\u001A\u00020\u00142\u0006\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0006J\u0012\u0010\u0015\u001A\u0004\u0018\u00010\n2\u0006\u0010\u000B\u001A\u00020\fH\u0016R\u000E\u0010\u0003\u001A\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000E\u0010\u0005\u001A\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000E\u0010\u0007\u001A\u00020\bX\u0082\u000E¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$PageTextSegmentIterator;", "Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "()V", "layoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "node", "Landroidx/compose/ui/semantics/SemanticsNode;", "tempRect", "Landroid/graphics/Rect;", "following", "", "current", "", "getLineEdgeIndex", "lineNumber", "direction", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "initialize", "", "text", "", "preceding", "Companion", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class PageTextSegmentIterator extends AbstractTextSegmentIterator {
        @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001A\u00020\u0007R\u000E\u0010\u0003\u001A\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u0005\u001A\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001A\u0004\u0018\u00010\u0007X\u0082\u000E¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$PageTextSegmentIterator$Companion;", "", "()V", "DirectionEnd", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "DirectionStart", "pageInstance", "Landroidx/compose/ui/platform/AccessibilityIterators$PageTextSegmentIterator;", "getInstance", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
        public static final class androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator.Companion {
            private androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator.Companion() {
            }

            public androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            public final PageTextSegmentIterator getInstance() {
                if(PageTextSegmentIterator.pageInstance == null) {
                    PageTextSegmentIterator.pageInstance = new PageTextSegmentIterator(null);
                }
                PageTextSegmentIterator accessibilityIterators$PageTextSegmentIterator0 = PageTextSegmentIterator.pageInstance;
                if(accessibilityIterators$PageTextSegmentIterator0 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
                }
                return accessibilityIterators$PageTextSegmentIterator0;
            }
        }

        public static final int $stable;
        public static final androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator.Companion Companion;
        private static final ResolvedTextDirection DirectionEnd;
        private static final ResolvedTextDirection DirectionStart;
        private TextLayoutResult layoutResult;
        private SemanticsNode node;
        private static PageTextSegmentIterator pageInstance;
        private Rect tempRect;

        static {
            PageTextSegmentIterator.Companion = new androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator.Companion(null);
            PageTextSegmentIterator.$stable = 8;
            PageTextSegmentIterator.DirectionStart = ResolvedTextDirection.Rtl;
            PageTextSegmentIterator.DirectionEnd = ResolvedTextDirection.Ltr;
        }

        private PageTextSegmentIterator() {
            this.tempRect = new Rect();
        }

        public PageTextSegmentIterator(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @Override  // androidx.compose.ui.platform.AccessibilityIterators$TextSegmentIterator
        public int[] following(int v) {
            int v1;
            if(this.getText().length() <= 0) {
                return null;
            }
            if(v >= this.getText().length()) {
                return null;
            }
            try {
                SemanticsNode semanticsNode0 = this.node;
                if(semanticsNode0 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("node");
                    throw null;
                }
                v1 = MathKt.roundToInt(semanticsNode0.getBoundsInRoot().getHeight());
            }
            catch(IllegalStateException unused_ex) {
                return null;
            }
            int v2 = RangesKt.coerceAtLeast(0, v);
            TextLayoutResult textLayoutResult0 = this.layoutResult;
            if(textLayoutResult0 != null) {
                int v3 = textLayoutResult0.getLineForOffset(v2);
                TextLayoutResult textLayoutResult1 = this.layoutResult;
                if(textLayoutResult1 != null) {
                    float f = textLayoutResult1.getLineTop(v3) + ((float)v1);
                    TextLayoutResult textLayoutResult2 = this.layoutResult;
                    if(textLayoutResult2 != null) {
                        if(f < textLayoutResult2.getLineTop(textLayoutResult2.getLineCount() - 1)) {
                            TextLayoutResult textLayoutResult3 = this.layoutResult;
                            if(textLayoutResult3 != null) {
                                return this.getRange(v2, this.getLineEdgeIndex(textLayoutResult3.getLineForVerticalPosition(f) - 1, PageTextSegmentIterator.DirectionEnd) + 1);
                            }
                            Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                            throw null;
                        }
                        TextLayoutResult textLayoutResult4 = this.layoutResult;
                        if(textLayoutResult4 != null) {
                            return this.getRange(v2, this.getLineEdgeIndex(textLayoutResult4.getLineCount() - 1, PageTextSegmentIterator.DirectionEnd) + 1);
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                        throw null;
                    }
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
            throw null;
        }

        private final int getLineEdgeIndex(int v, ResolvedTextDirection resolvedTextDirection0) {
            TextLayoutResult textLayoutResult0 = this.layoutResult;
            if(textLayoutResult0 != null) {
                int v1 = textLayoutResult0.getLineStart(v);
                TextLayoutResult textLayoutResult1 = this.layoutResult;
                if(textLayoutResult1 != null) {
                    if(resolvedTextDirection0 != textLayoutResult1.getParagraphDirection(v1)) {
                        TextLayoutResult textLayoutResult2 = this.layoutResult;
                        if(textLayoutResult2 != null) {
                            return textLayoutResult2.getLineStart(v);
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                        throw null;
                    }
                    TextLayoutResult textLayoutResult3 = this.layoutResult;
                    if(textLayoutResult3 != null) {
                        return TextLayoutResult.getLineEnd$default(textLayoutResult3, v, false, 2, null) - 1;
                    }
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
            throw null;
        }

        public final void initialize(String s, TextLayoutResult textLayoutResult0, SemanticsNode semanticsNode0) {
            Intrinsics.checkNotNullParameter(s, "text");
            Intrinsics.checkNotNullParameter(textLayoutResult0, "layoutResult");
            Intrinsics.checkNotNullParameter(semanticsNode0, "node");
            this.setText(s);
            this.layoutResult = textLayoutResult0;
            this.node = semanticsNode0;
        }

        @Override  // androidx.compose.ui.platform.AccessibilityIterators$TextSegmentIterator
        public int[] preceding(int v) {
            int v4;
            int v1;
            if(this.getText().length() <= 0) {
                return null;
            }
            if(v <= 0) {
                return null;
            }
            try {
                SemanticsNode semanticsNode0 = this.node;
                if(semanticsNode0 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("node");
                    throw null;
                }
                v1 = MathKt.roundToInt(semanticsNode0.getBoundsInRoot().getHeight());
            }
            catch(IllegalStateException unused_ex) {
                return null;
            }
            int v2 = RangesKt.coerceAtMost(this.getText().length(), v);
            TextLayoutResult textLayoutResult0 = this.layoutResult;
            if(textLayoutResult0 != null) {
                int v3 = textLayoutResult0.getLineForOffset(v2);
                TextLayoutResult textLayoutResult1 = this.layoutResult;
                if(textLayoutResult1 != null) {
                    float f = textLayoutResult1.getLineTop(v3) - ((float)v1);
                    if(f > 0.0f) {
                        TextLayoutResult textLayoutResult2 = this.layoutResult;
                        if(textLayoutResult2 != null) {
                            v4 = textLayoutResult2.getLineForVerticalPosition(f);
                            goto label_26;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                        throw null;
                    }
                    else {
                        v4 = 0;
                    }
                label_26:
                    if(v2 == this.getText().length() && v4 < v3) {
                        ++v4;
                    }
                    return this.getRange(this.getLineEdgeIndex(v4, PageTextSegmentIterator.DirectionStart), v2);
                }
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0005\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001A\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001A\u00020\u0006H\u0016J\u0010\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\u0006H\u0002J\u0010\u0010\n\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\u0006H\u0002J\u0012\u0010\u000B\u001A\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001A\u00020\u0006H\u0016¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$ParagraphTextSegmentIterator;", "Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "()V", "following", "", "current", "", "isEndBoundary", "", "index", "isStartBoundary", "preceding", "Companion", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class ParagraphTextSegmentIterator extends AbstractTextSegmentIterator {
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001A\u00020\u0004R\u0010\u0010\u0003\u001A\u0004\u0018\u00010\u0004X\u0082\u000E¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$ParagraphTextSegmentIterator$Companion;", "", "()V", "instance", "Landroidx/compose/ui/platform/AccessibilityIterators$ParagraphTextSegmentIterator;", "getInstance", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
        public static final class androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator.Companion {
            private androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator.Companion() {
            }

            public androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            public final ParagraphTextSegmentIterator getInstance() {
                if(ParagraphTextSegmentIterator.instance == null) {
                    ParagraphTextSegmentIterator.instance = new ParagraphTextSegmentIterator(null);
                }
                ParagraphTextSegmentIterator accessibilityIterators$ParagraphTextSegmentIterator0 = ParagraphTextSegmentIterator.instance;
                if(accessibilityIterators$ParagraphTextSegmentIterator0 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
                }
                return accessibilityIterators$ParagraphTextSegmentIterator0;
            }
        }

        public static final int $stable;
        public static final androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator.Companion Companion;
        private static ParagraphTextSegmentIterator instance;

        static {
            ParagraphTextSegmentIterator.Companion = new androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator.Companion(null);
        }

        private ParagraphTextSegmentIterator() {
        }

        public ParagraphTextSegmentIterator(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @Override  // androidx.compose.ui.platform.AccessibilityIterators$TextSegmentIterator
        public int[] following(int v) {
            int v1 = this.getText().length();
            if(v1 <= 0) {
                return null;
            }
            if(v >= v1) {
                return null;
            }
            if(v < 0) {
                v = 0;
            }
            while(v < v1 && this.getText().charAt(v) == 10 && !this.isStartBoundary(v)) {
                ++v;
            }
            if(v >= v1) {
                return null;
            }
            int v2;
            for(v2 = v + 1; v2 < v1 && !this.isEndBoundary(v2); ++v2) {
            }
            return this.getRange(v, v2);
        }

        private final boolean isEndBoundary(int v) {
            return v > 0 && this.getText().charAt(v - 1) != 10 && (v == this.getText().length() || this.getText().charAt(v) == 10);
        }

        private final boolean isStartBoundary(int v) {
            return this.getText().charAt(v) != 10 && (v == 0 || this.getText().charAt(v - 1) == 10);
        }

        @Override  // androidx.compose.ui.platform.AccessibilityIterators$TextSegmentIterator
        public int[] preceding(int v) {
            int v1 = this.getText().length();
            if(v1 <= 0) {
                return null;
            }
            if(v <= 0) {
                return null;
            }
            if(v > v1) {
                v = v1;
            }
            while(v > 0 && this.getText().charAt(v - 1) == 10 && !this.isEndBoundary(v)) {
                --v;
            }
            if(v <= 0) {
                return null;
            }
            int v2;
            for(v2 = v - 1; v2 > 0 && !this.isStartBoundary(v2); --v2) {
            }
            return this.getRange(v2, v);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001A\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001A\u00020\u0005H&J\u0012\u0010\u0006\u001A\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001A\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$TextSegmentIterator;", "", "following", "", "current", "", "preceding", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public interface TextSegmentIterator {
        int[] following(int arg1);

        int[] preceding(int arg1);
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000F\b\u0002\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001A\u0004\u0018\u00010\b2\u0006\u0010\t\u001A\u00020\nH\u0016J\u0010\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\u000EH\u0016J\u0010\u0010\u000F\u001A\u00020\u00102\u0006\u0010\u0011\u001A\u00020\nH\u0002J\u0010\u0010\u0012\u001A\u00020\u00102\u0006\u0010\u0011\u001A\u00020\nH\u0002J\u0010\u0010\u0013\u001A\u00020\u00102\u0006\u0010\u0011\u001A\u00020\nH\u0002J\u0010\u0010\u0014\u001A\u00020\f2\u0006\u0010\u0002\u001A\u00020\u0003H\u0002J\u0012\u0010\u0015\u001A\u0004\u0018\u00010\b2\u0006\u0010\t\u001A\u00020\nH\u0016R\u000E\u0010\u0005\u001A\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$WordTextSegmentIterator;", "Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "locale", "Ljava/util/Locale;", "(Ljava/util/Locale;)V", "impl", "Ljava/text/BreakIterator;", "following", "", "current", "", "initialize", "", "text", "", "isEndBoundary", "", "index", "isLetterOrDigit", "isStartBoundary", "onLocaleChanged", "preceding", "Companion", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class WordTextSegmentIterator extends AbstractTextSegmentIterator {
        @Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000E\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u0007R\u0010\u0010\u0003\u001A\u0004\u0018\u00010\u0004X\u0082\u000E¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$WordTextSegmentIterator$Companion;", "", "()V", "instance", "Landroidx/compose/ui/platform/AccessibilityIterators$WordTextSegmentIterator;", "getInstance", "locale", "Ljava/util/Locale;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
        public static final class androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator.Companion {
            private androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator.Companion() {
            }

            public androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            public final WordTextSegmentIterator getInstance(Locale locale0) {
                Intrinsics.checkNotNullParameter(locale0, "locale");
                if(WordTextSegmentIterator.instance == null) {
                    WordTextSegmentIterator.instance = new WordTextSegmentIterator(locale0, null);
                }
                WordTextSegmentIterator accessibilityIterators$WordTextSegmentIterator0 = WordTextSegmentIterator.instance;
                if(accessibilityIterators$WordTextSegmentIterator0 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
                }
                return accessibilityIterators$WordTextSegmentIterator0;
            }
        }

        public static final int $stable;
        public static final androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator.Companion Companion;
        private BreakIterator impl;
        private static WordTextSegmentIterator instance;

        static {
            WordTextSegmentIterator.Companion = new androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator.Companion(null);
            WordTextSegmentIterator.$stable = 8;
        }

        private WordTextSegmentIterator(Locale locale0) {
            this.onLocaleChanged(locale0);
        }

        public WordTextSegmentIterator(Locale locale0, DefaultConstructorMarker defaultConstructorMarker0) {
            this(locale0);
        }

        @Override  // androidx.compose.ui.platform.AccessibilityIterators$TextSegmentIterator
        public int[] following(int v) {
            if(this.getText().length() <= 0) {
                return null;
            }
            if(v >= this.getText().length()) {
                return null;
            }
            if(v < 0) {
                v = 0;
            }
            while(!this.isLetterOrDigit(v) && !this.isStartBoundary(v)) {
                BreakIterator breakIterator0 = this.impl;
                if(breakIterator0 != null) {
                    v = breakIterator0.following(v);
                    if(v != -1) {
                        continue;
                    }
                    return null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("impl");
                throw null;
            }
            BreakIterator breakIterator1 = this.impl;
            if(breakIterator1 != null) {
                int v1 = breakIterator1.following(v);
                return v1 == -1 || !this.isEndBoundary(v1) ? null : this.getRange(v, v1);
            }
            Intrinsics.throwUninitializedPropertyAccessException("impl");
            throw null;
        }

        @Override  // androidx.compose.ui.platform.AccessibilityIterators$AbstractTextSegmentIterator
        public void initialize(String s) {
            Intrinsics.checkNotNullParameter(s, "text");
            super.initialize(s);
            BreakIterator breakIterator0 = this.impl;
            if(breakIterator0 != null) {
                breakIterator0.setText(s);
                return;
            }
            Intrinsics.throwUninitializedPropertyAccessException("impl");
            throw null;
        }

        // 去混淆评级： 低(30)
        private final boolean isEndBoundary(int v) {
            return v > 0 && this.isLetterOrDigit(v - 1) && (v == this.getText().length() || !this.isLetterOrDigit(v));
        }

        private final boolean isLetterOrDigit(int v) {
            if(v >= 0 && v < this.getText().length()) {
                String s = this.getText();
                if(s == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                return Character.isLetterOrDigit(s.codePointAt(v));
            }
            return false;
        }

        // 去混淆评级： 低(20)
        private final boolean isStartBoundary(int v) {
            return this.isLetterOrDigit(v) && (v == 0 || !this.isLetterOrDigit(v - 1));
        }

        private final void onLocaleChanged(Locale locale0) {
            BreakIterator breakIterator0 = BreakIterator.getWordInstance(locale0);
            Intrinsics.checkNotNullExpressionValue(breakIterator0, "getWordInstance(locale)");
            this.impl = breakIterator0;
        }

        @Override  // androidx.compose.ui.platform.AccessibilityIterators$TextSegmentIterator
        public int[] preceding(int v) {
            int v1 = this.getText().length();
            if(v1 <= 0) {
                return null;
            }
            if(v <= 0) {
                return null;
            }
            if(v > v1) {
                v = v1;
            }
            while(v > 0 && !this.isLetterOrDigit(v - 1) && !this.isEndBoundary(v)) {
                BreakIterator breakIterator0 = this.impl;
                if(breakIterator0 != null) {
                    v = breakIterator0.preceding(v);
                    if(v != -1) {
                        continue;
                    }
                    return null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("impl");
                throw null;
            }
            BreakIterator breakIterator1 = this.impl;
            if(breakIterator1 != null) {
                int v2 = breakIterator1.preceding(v);
                return v2 == -1 || !this.isStartBoundary(v2) ? null : this.getRange(v2, v);
            }
            Intrinsics.throwUninitializedPropertyAccessException("impl");
            throw null;
        }
    }

}

