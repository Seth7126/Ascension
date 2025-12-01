package kotlin.internal.jdk8;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.internal.jdk7.JDK7PlatformImplementations;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.random.jdk8.PlatformThreadLocalRandom;
import kotlin.ranges.IntRange;
import kotlin.text.MatchGroup;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0010\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001A\u00020\u0004H\u0016J\u001A\u0010\u0005\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\nH\u0016¨\u0006\u000B"}, d2 = {"Lkotlin/internal/jdk8/JDK8PlatformImplementations;", "Lkotlin/internal/jdk7/JDK7PlatformImplementations;", "()V", "defaultPlatformRandom", "Lkotlin/random/Random;", "getMatchResultNamedGroup", "Lkotlin/text/MatchGroup;", "matchResult", "Ljava/util/regex/MatchResult;", "name", "", "kotlin-stdlib-jdk8"}, k = 1, mv = {1, 5, 1})
public class JDK8PlatformImplementations extends JDK7PlatformImplementations {
    @Override  // kotlin.internal.PlatformImplementations
    public Random defaultPlatformRandom() {
        return new PlatformThreadLocalRandom();
    }

    @Override  // kotlin.internal.PlatformImplementations
    public MatchGroup getMatchResultNamedGroup(MatchResult matchResult0, String s) {
        Intrinsics.checkNotNullParameter(matchResult0, "matchResult");
        Intrinsics.checkNotNullParameter(s, "name");
        if(!(matchResult0 instanceof Matcher)) {
            matchResult0 = null;
        }
        if(((Matcher)matchResult0) == null) {
            throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
        }
        IntRange intRange0 = new IntRange(((Matcher)matchResult0).start(s), ((Matcher)matchResult0).end(s) - 1);
        if(((int)intRange0.getStart()) >= 0) {
            String s1 = ((Matcher)matchResult0).group(s);
            Intrinsics.checkNotNullExpressionValue(s1, "matcher.group(name)");
            return new MatchGroup(s1, intRange0);
        }
        return null;
    }
}

