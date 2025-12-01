package kotlin.text;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 ,2\u00060\u0001j\u0002`\u0002:\u0002,-B\u000F\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u00A2\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0007\u00A2\u0006\u0002\u0010\bB\u001D\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012\f\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00070\n\u00A2\u0006\u0002\u0010\u000BB\u000F\b\u0001\u0012\u0006\u0010\f\u001A\u00020\r\u00A2\u0006\u0002\u0010\u000EJ\u000E\u0010\u0014\u001A\u00020\u00152\u0006\u0010\u0016\u001A\u00020\u0017J\u001A\u0010\u0018\u001A\u0004\u0018\u00010\u00192\u0006\u0010\u0016\u001A\u00020\u00172\b\b\u0002\u0010\u001A\u001A\u00020\u001BJ\u001E\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\u00190\u001D2\u0006\u0010\u0016\u001A\u00020\u00172\b\b\u0002\u0010\u001A\u001A\u00020\u001BJ\u0010\u0010\u001E\u001A\u0004\u0018\u00010\u00192\u0006\u0010\u0016\u001A\u00020\u0017J\u0011\u0010\u001F\u001A\u00020\u00152\u0006\u0010\u0016\u001A\u00020\u0017H\u0086\u0004J\"\u0010 \u001A\u00020\u00042\u0006\u0010\u0016\u001A\u00020\u00172\u0012\u0010!\u001A\u000E\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00170\"J\u0016\u0010 \u001A\u00020\u00042\u0006\u0010\u0016\u001A\u00020\u00172\u0006\u0010#\u001A\u00020\u0004J\u0016\u0010$\u001A\u00020\u00042\u0006\u0010\u0016\u001A\u00020\u00172\u0006\u0010#\u001A\u00020\u0004J\u001E\u0010%\u001A\b\u0012\u0004\u0012\u00020\u00040&2\u0006\u0010\u0016\u001A\u00020\u00172\b\b\u0002\u0010\'\u001A\u00020\u001BJ\u0006\u0010(\u001A\u00020\rJ\b\u0010)\u001A\u00020\u0004H\u0016J\b\u0010*\u001A\u00020+H\u0002R\u0016\u0010\u000F\u001A\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\nX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010\f\u001A\u00020\rX\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0017\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00070\n8F\u00A2\u0006\u0006\u001A\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0003\u001A\u00020\u00048F\u00A2\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013\u00A8\u0006."}, d2 = {"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "pattern", "", "(Ljava/lang/String;)V", "option", "Lkotlin/text/RegexOption;", "(Ljava/lang/String;Lkotlin/text/RegexOption;)V", "options", "", "(Ljava/lang/String;Ljava/util/Set;)V", "nativePattern", "Ljava/util/regex/Pattern;", "(Ljava/util/regex/Pattern;)V", "_options", "getOptions", "()Ljava/util/Set;", "getPattern", "()Ljava/lang/String;", "containsMatchIn", "", "input", "", "find", "Lkotlin/text/MatchResult;", "startIndex", "", "findAll", "Lkotlin/sequences/Sequence;", "matchEntire", "matches", "replace", "transform", "Lkotlin/Function1;", "replacement", "replaceFirst", "split", "", "limit", "toPattern", "toString", "writeReplace", "", "Companion", "Serialized", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
public final class Regex implements Serializable {
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0004H\u0002J\u000E\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\u0007J\u000E\u0010\t\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\u0007J\u000E\u0010\n\u001A\u00020\u000B2\u0006\u0010\b\u001A\u00020\u0007¨\u0006\f"}, d2 = {"Lkotlin/text/Regex$Companion;", "", "()V", "ensureUnicodeCase", "", "flags", "escape", "", "literal", "escapeReplacement", "fromLiteral", "Lkotlin/text/Regex;", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public static final int access$ensureUnicodeCase(Companion regex$Companion0, int v) {
            return regex$Companion0.ensureUnicodeCase(v);
        }

        private final int ensureUnicodeCase(int v) {
            return (v & 2) == 0 ? v : v | 0x40;
        }

        public final String escape(String s) {
            Intrinsics.checkNotNullParameter(s, "literal");
            String s1 = Pattern.quote(s);
            Intrinsics.checkNotNullExpressionValue(s1, "Pattern.quote(literal)");
            return s1;
        }

        public final String escapeReplacement(String s) {
            Intrinsics.checkNotNullParameter(s, "literal");
            String s1 = Matcher.quoteReplacement(s);
            Intrinsics.checkNotNullExpressionValue(s1, "Matcher.quoteReplacement(literal)");
            return s1;
        }

        public final Regex fromLiteral(String s) {
            Intrinsics.checkNotNullParameter(s, "literal");
            return new Regex(s, RegexOption.LITERAL);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u0000 \u000E2\u00060\u0001j\u0002`\u0002:\u0001\u000EB\u0015\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012\u0006\u0010\u0005\u001A\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001A\u00020\rH\u0002R\u0011\u0010\u0005\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001A\u00020\u0004¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000B¨\u0006\u000F"}, d2 = {"Lkotlin/text/Regex$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "pattern", "", "flags", "", "(Ljava/lang/String;I)V", "getFlags", "()I", "getPattern", "()Ljava/lang/String;", "readResolve", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
    static final class Serialized implements Serializable {
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000E\u0010\u0003\u001A\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlin/text/Regex$Serialized$Companion;", "", "()V", "serialVersionUID", "", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
        public static final class kotlin.text.Regex.Serialized.Companion {
            private kotlin.text.Regex.Serialized.Companion() {
            }

            public kotlin.text.Regex.Serialized.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }
        }

        public static final kotlin.text.Regex.Serialized.Companion Companion;
        private final int flags;
        private final String pattern;
        private static final long serialVersionUID;

        static {
            Serialized.Companion = new kotlin.text.Regex.Serialized.Companion(null);
        }

        public Serialized(String s, int v) {
            Intrinsics.checkNotNullParameter(s, "pattern");
            super();
            this.pattern = s;
            this.flags = v;
        }

        public final int getFlags() {
            return this.flags;
        }

        public final String getPattern() {
            return this.pattern;
        }

        private final Object readResolve() {
            Pattern pattern0 = Pattern.compile(this.pattern, this.flags);
            Intrinsics.checkNotNullExpressionValue(pattern0, "Pattern.compile(pattern, flags)");
            return new Regex(pattern0);
        }
    }

    public static final Companion Companion;
    private Set _options;
    private final Pattern nativePattern;

    static {
        Regex.Companion = new Companion(null);
    }

    public Regex(String s) {
        Intrinsics.checkNotNullParameter(s, "pattern");
        Pattern pattern0 = Pattern.compile(s);
        Intrinsics.checkNotNullExpressionValue(pattern0, "Pattern.compile(pattern)");
        this(pattern0);
    }

    public Regex(String s, Set set0) {
        Intrinsics.checkNotNullParameter(s, "pattern");
        Intrinsics.checkNotNullParameter(set0, "options");
        int v = RegexKt.access$toInt(set0);
        Pattern pattern0 = Pattern.compile(s, Companion.access$ensureUnicodeCase(Regex.Companion, v));
        Intrinsics.checkNotNullExpressionValue(pattern0, "Pattern.compile(pattern,…odeCase(options.toInt()))");
        this(pattern0);
    }

    public Regex(String s, RegexOption regexOption0) {
        Intrinsics.checkNotNullParameter(s, "pattern");
        Intrinsics.checkNotNullParameter(regexOption0, "option");
        Pattern pattern0 = Pattern.compile(s, Companion.access$ensureUnicodeCase(Regex.Companion, regexOption0.getValue()));
        Intrinsics.checkNotNullExpressionValue(pattern0, "Pattern.compile(pattern,…nicodeCase(option.value))");
        this(pattern0);
    }

    public Regex(Pattern pattern0) {
        Intrinsics.checkNotNullParameter(pattern0, "nativePattern");
        super();
        this.nativePattern = pattern0;
    }

    public final boolean containsMatchIn(CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "input");
        return this.nativePattern.matcher(charSequence0).find();
    }

    public final MatchResult find(CharSequence charSequence0, int v) {
        Intrinsics.checkNotNullParameter(charSequence0, "input");
        Matcher matcher0 = this.nativePattern.matcher(charSequence0);
        Intrinsics.checkNotNullExpressionValue(matcher0, "nativePattern.matcher(input)");
        return RegexKt.access$findNext(matcher0, v, charSequence0);
    }

    public static MatchResult find$default(Regex regex0, CharSequence charSequence0, int v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0;
        }
        return regex0.find(charSequence0, v);
    }

    public final Sequence findAll(CharSequence charSequence0, int v) {
        Intrinsics.checkNotNullParameter(charSequence0, "input");
        if(v < 0 || v > charSequence0.length()) {
            throw new IndexOutOfBoundsException("Start index out of bounds: " + v + ", input length: " + charSequence0.length());
        }
        return SequencesKt.generateSequence(new Function0(charSequence0, v) {
            final CharSequence $input;
            final int $startIndex;

            {
                Regex.this = regex0;
                this.$input = charSequence0;
                this.$startIndex = v;
                super(0);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }

            public final MatchResult invoke() {
                return Regex.this.find(this.$input, this.$startIndex);
            }
        }, kotlin.text.Regex.findAll.2.INSTANCE);

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001A\u00020\u0001¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lkotlin/text/MatchResult;", "p1", "invoke"}, k = 3, mv = {1, 5, 1})
        final class kotlin.text.Regex.findAll.2 extends FunctionReferenceImpl implements Function1 {
            public static final kotlin.text.Regex.findAll.2 INSTANCE;

            static {
                kotlin.text.Regex.findAll.2.INSTANCE = new kotlin.text.Regex.findAll.2();
            }

            kotlin.text.Regex.findAll.2() {
                super(1, MatchResult.class, "next", "next()Lkotlin/text/MatchResult;", 0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((MatchResult)object0));
            }

            public final MatchResult invoke(MatchResult matchResult0) {
                Intrinsics.checkNotNullParameter(matchResult0, "p1");
                return matchResult0.next();
            }
        }

    }

    public static Sequence findAll$default(Regex regex0, CharSequence charSequence0, int v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0;
        }
        return regex0.findAll(charSequence0, v);
    }

    public final Set getOptions() {
        Set set0 = this._options;
        if(set0 == null) {
            int v = this.nativePattern.flags();
            EnumSet enumSet0 = EnumSet.allOf(RegexOption.class);
            CollectionsKt.retainAll(enumSet0, new Regex.fromInt..inlined.apply.lambda.1(v));
            set0 = Collections.unmodifiableSet(enumSet0);
            Intrinsics.checkNotNullExpressionValue(set0, "Collections.unmodifiable…mask == it.value }\n    })");
            this._options = set0;
        }
        return set0;
    }

    public final String getPattern() {
        String s = this.nativePattern.pattern();
        Intrinsics.checkNotNullExpressionValue(s, "nativePattern.pattern()");
        return s;
    }

    public final MatchResult matchEntire(CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "input");
        Matcher matcher0 = this.nativePattern.matcher(charSequence0);
        Intrinsics.checkNotNullExpressionValue(matcher0, "nativePattern.matcher(input)");
        return RegexKt.matchEntire(matcher0, charSequence0);
    }

    public final boolean matches(CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "input");
        return this.nativePattern.matcher(charSequence0).matches();
    }

    public final String replace(CharSequence charSequence0, String s) {
        Intrinsics.checkNotNullParameter(charSequence0, "input");
        Intrinsics.checkNotNullParameter(s, "replacement");
        String s1 = this.nativePattern.matcher(charSequence0).replaceAll(s);
        Intrinsics.checkNotNullExpressionValue(s1, "nativePattern.matcher(in…).replaceAll(replacement)");
        return s1;
    }

    public final String replace(CharSequence charSequence0, Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "input");
        Intrinsics.checkNotNullParameter(function10, "transform");
        int v = 0;
        MatchResult matchResult0 = Regex.find$default(this, charSequence0, 0, 2, null);
        if(matchResult0 != null) {
            int v1 = charSequence0.length();
            StringBuilder stringBuilder0 = new StringBuilder(v1);
            do {
                Intrinsics.checkNotNull(matchResult0);
                stringBuilder0.append(charSequence0, v, ((int)matchResult0.getRange().getStart()));
                stringBuilder0.append(((CharSequence)function10.invoke(matchResult0)));
                v = ((int)matchResult0.getRange().getEndInclusive()) + 1;
                matchResult0 = matchResult0.next();
            }
            while(v < v1 && matchResult0 != null);
            if(v < v1) {
                stringBuilder0.append(charSequence0, v, v1);
            }
            String s = stringBuilder0.toString();
            Intrinsics.checkNotNullExpressionValue(s, "sb.toString()");
            return s;
        }
        return charSequence0.toString();
    }

    public final String replaceFirst(CharSequence charSequence0, String s) {
        Intrinsics.checkNotNullParameter(charSequence0, "input");
        Intrinsics.checkNotNullParameter(s, "replacement");
        String s1 = this.nativePattern.matcher(charSequence0).replaceFirst(s);
        Intrinsics.checkNotNullExpressionValue(s1, "nativePattern.matcher(in…replaceFirst(replacement)");
        return s1;
    }

    public final List split(CharSequence charSequence0, int v) {
        Intrinsics.checkNotNullParameter(charSequence0, "input");
        int v1 = 0;
        if(v < 0) {
            throw new IllegalArgumentException(("Limit must be non-negative, but was " + v + '.').toString());
        }
        int v2 = 10;
        Matcher matcher0 = this.nativePattern.matcher(charSequence0);
        if(matcher0.find() && v != 1) {
            if(v > 0) {
                v2 = RangesKt.coerceAtMost(v, 10);
            }
            ArrayList arrayList0 = new ArrayList(v2);
            do {
                arrayList0.add(charSequence0.subSequence(v1, matcher0.start()).toString());
                v1 = matcher0.end();
            }
            while((v - 1 < 0 || arrayList0.size() != v - 1) && matcher0.find());
            arrayList0.add(charSequence0.subSequence(v1, charSequence0.length()).toString());
            return arrayList0;
        }
        return CollectionsKt.listOf(charSequence0.toString());
    }

    public static List split$default(Regex regex0, CharSequence charSequence0, int v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0;
        }
        return regex0.split(charSequence0, v);
    }

    public final Pattern toPattern() {
        return this.nativePattern;
    }

    @Override
    public String toString() {
        String s = this.nativePattern.toString();
        Intrinsics.checkNotNullExpressionValue(s, "nativePattern.toString()");
        return s;
    }

    private final Object writeReplace() {
        String s = this.nativePattern.pattern();
        Intrinsics.checkNotNullExpressionValue(s, "nativePattern.pattern()");
        return new Serialized(s, this.nativePattern.flags());
    }
}

