package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.ScopeUpdateScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u00A2\u0006\u0002\u0010\u0006J\u001B\u0010\u000F\u001A\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u0003H\u0096\u0002J%\u0010\u000F\u001A\u0004\u0018\u00010\b2\b\u0010\u0013\u001A\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u0003H\u0096\u0002J/\u0010\u000F\u001A\u0004\u0018\u00010\b2\b\u0010\u0013\u001A\u0004\u0018\u00010\b2\b\u0010\u0014\u001A\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u0003H\u0096\u0002J9\u0010\u000F\u001A\u0004\u0018\u00010\b2\b\u0010\u0013\u001A\u0004\u0018\u00010\b2\b\u0010\u0014\u001A\u0004\u0018\u00010\b2\b\u0010\u0015\u001A\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u0003H\u0096\u0002JC\u0010\u000F\u001A\u0004\u0018\u00010\b2\b\u0010\u0013\u001A\u0004\u0018\u00010\b2\b\u0010\u0014\u001A\u0004\u0018\u00010\b2\b\u0010\u0015\u001A\u0004\u0018\u00010\b2\b\u0010\u0016\u001A\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u0003H\u0096\u0002JM\u0010\u000F\u001A\u0004\u0018\u00010\b2\b\u0010\u0013\u001A\u0004\u0018\u00010\b2\b\u0010\u0014\u001A\u0004\u0018\u00010\b2\b\u0010\u0015\u001A\u0004\u0018\u00010\b2\b\u0010\u0016\u001A\u0004\u0018\u00010\b2\b\u0010\u0017\u001A\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u0003H\u0096\u0002JW\u0010\u000F\u001A\u0004\u0018\u00010\b2\b\u0010\u0013\u001A\u0004\u0018\u00010\b2\b\u0010\u0014\u001A\u0004\u0018\u00010\b2\b\u0010\u0015\u001A\u0004\u0018\u00010\b2\b\u0010\u0016\u001A\u0004\u0018\u00010\b2\b\u0010\u0017\u001A\u0004\u0018\u00010\b2\b\u0010\u0018\u001A\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u0003H\u0096\u0002Ja\u0010\u000F\u001A\u0004\u0018\u00010\b2\b\u0010\u0013\u001A\u0004\u0018\u00010\b2\b\u0010\u0014\u001A\u0004\u0018\u00010\b2\b\u0010\u0015\u001A\u0004\u0018\u00010\b2\b\u0010\u0016\u001A\u0004\u0018\u00010\b2\b\u0010\u0017\u001A\u0004\u0018\u00010\b2\b\u0010\u0018\u001A\u0004\u0018\u00010\b2\b\u0010\u0019\u001A\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u0003H\u0096\u0002Jk\u0010\u000F\u001A\u0004\u0018\u00010\b2\b\u0010\u0013\u001A\u0004\u0018\u00010\b2\b\u0010\u0014\u001A\u0004\u0018\u00010\b2\b\u0010\u0015\u001A\u0004\u0018\u00010\b2\b\u0010\u0016\u001A\u0004\u0018\u00010\b2\b\u0010\u0017\u001A\u0004\u0018\u00010\b2\b\u0010\u0018\u001A\u0004\u0018\u00010\b2\b\u0010\u0019\u001A\u0004\u0018\u00010\b2\b\u0010\u001A\u001A\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u0003H\u0096\u0002Ju\u0010\u000F\u001A\u0004\u0018\u00010\b2\b\u0010\u0013\u001A\u0004\u0018\u00010\b2\b\u0010\u0014\u001A\u0004\u0018\u00010\b2\b\u0010\u0015\u001A\u0004\u0018\u00010\b2\b\u0010\u0016\u001A\u0004\u0018\u00010\b2\b\u0010\u0017\u001A\u0004\u0018\u00010\b2\b\u0010\u0018\u001A\u0004\u0018\u00010\b2\b\u0010\u0019\u001A\u0004\u0018\u00010\b2\b\u0010\u001A\u001A\u0004\u0018\u00010\b2\b\u0010\u001B\u001A\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u0003H\u0096\u0002J\u0087\u0001\u0010\u000F\u001A\u0004\u0018\u00010\b2\b\u0010\u0013\u001A\u0004\u0018\u00010\b2\b\u0010\u0014\u001A\u0004\u0018\u00010\b2\b\u0010\u0015\u001A\u0004\u0018\u00010\b2\b\u0010\u0016\u001A\u0004\u0018\u00010\b2\b\u0010\u0017\u001A\u0004\u0018\u00010\b2\b\u0010\u0018\u001A\u0004\u0018\u00010\b2\b\u0010\u0019\u001A\u0004\u0018\u00010\b2\b\u0010\u001A\u001A\u0004\u0018\u00010\b2\b\u0010\u001B\u001A\u0004\u0018\u00010\b2\b\u0010\u001C\u001A\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u00032\u0006\u0010\u001D\u001A\u00020\u0003H\u0096\u0002J\u0091\u0001\u0010\u000F\u001A\u0004\u0018\u00010\b2\b\u0010\u0013\u001A\u0004\u0018\u00010\b2\b\u0010\u0014\u001A\u0004\u0018\u00010\b2\b\u0010\u0015\u001A\u0004\u0018\u00010\b2\b\u0010\u0016\u001A\u0004\u0018\u00010\b2\b\u0010\u0017\u001A\u0004\u0018\u00010\b2\b\u0010\u0018\u001A\u0004\u0018\u00010\b2\b\u0010\u0019\u001A\u0004\u0018\u00010\b2\b\u0010\u001A\u001A\u0004\u0018\u00010\b2\b\u0010\u001B\u001A\u0004\u0018\u00010\b2\b\u0010\u001C\u001A\u0004\u0018\u00010\b2\b\u0010\u001E\u001A\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u00032\u0006\u0010\u001D\u001A\u00020\u0003H\u0096\u0002J\u009B\u0001\u0010\u000F\u001A\u0004\u0018\u00010\b2\b\u0010\u0013\u001A\u0004\u0018\u00010\b2\b\u0010\u0014\u001A\u0004\u0018\u00010\b2\b\u0010\u0015\u001A\u0004\u0018\u00010\b2\b\u0010\u0016\u001A\u0004\u0018\u00010\b2\b\u0010\u0017\u001A\u0004\u0018\u00010\b2\b\u0010\u0018\u001A\u0004\u0018\u00010\b2\b\u0010\u0019\u001A\u0004\u0018\u00010\b2\b\u0010\u001A\u001A\u0004\u0018\u00010\b2\b\u0010\u001B\u001A\u0004\u0018\u00010\b2\b\u0010\u001C\u001A\u0004\u0018\u00010\b2\b\u0010\u001E\u001A\u0004\u0018\u00010\b2\b\u0010\u001F\u001A\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u00032\u0006\u0010\u001D\u001A\u00020\u0003H\u0096\u0002J\u00A5\u0001\u0010\u000F\u001A\u0004\u0018\u00010\b2\b\u0010\u0013\u001A\u0004\u0018\u00010\b2\b\u0010\u0014\u001A\u0004\u0018\u00010\b2\b\u0010\u0015\u001A\u0004\u0018\u00010\b2\b\u0010\u0016\u001A\u0004\u0018\u00010\b2\b\u0010\u0017\u001A\u0004\u0018\u00010\b2\b\u0010\u0018\u001A\u0004\u0018\u00010\b2\b\u0010\u0019\u001A\u0004\u0018\u00010\b2\b\u0010\u001A\u001A\u0004\u0018\u00010\b2\b\u0010\u001B\u001A\u0004\u0018\u00010\b2\b\u0010\u001C\u001A\u0004\u0018\u00010\b2\b\u0010\u001E\u001A\u0004\u0018\u00010\b2\b\u0010\u001F\u001A\u0004\u0018\u00010\b2\b\u0010 \u001A\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u00032\u0006\u0010\u001D\u001A\u00020\u0003H\u0096\u0002J\u00AF\u0001\u0010\u000F\u001A\u0004\u0018\u00010\b2\b\u0010\u0013\u001A\u0004\u0018\u00010\b2\b\u0010\u0014\u001A\u0004\u0018\u00010\b2\b\u0010\u0015\u001A\u0004\u0018\u00010\b2\b\u0010\u0016\u001A\u0004\u0018\u00010\b2\b\u0010\u0017\u001A\u0004\u0018\u00010\b2\b\u0010\u0018\u001A\u0004\u0018\u00010\b2\b\u0010\u0019\u001A\u0004\u0018\u00010\b2\b\u0010\u001A\u001A\u0004\u0018\u00010\b2\b\u0010\u001B\u001A\u0004\u0018\u00010\b2\b\u0010\u001C\u001A\u0004\u0018\u00010\b2\b\u0010\u001E\u001A\u0004\u0018\u00010\b2\b\u0010\u001F\u001A\u0004\u0018\u00010\b2\b\u0010 \u001A\u0004\u0018\u00010\b2\b\u0010!\u001A\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u00032\u0006\u0010\u001D\u001A\u00020\u0003H\u0096\u0002J\u00B9\u0001\u0010\u000F\u001A\u0004\u0018\u00010\b2\b\u0010\u0013\u001A\u0004\u0018\u00010\b2\b\u0010\u0014\u001A\u0004\u0018\u00010\b2\b\u0010\u0015\u001A\u0004\u0018\u00010\b2\b\u0010\u0016\u001A\u0004\u0018\u00010\b2\b\u0010\u0017\u001A\u0004\u0018\u00010\b2\b\u0010\u0018\u001A\u0004\u0018\u00010\b2\b\u0010\u0019\u001A\u0004\u0018\u00010\b2\b\u0010\u001A\u001A\u0004\u0018\u00010\b2\b\u0010\u001B\u001A\u0004\u0018\u00010\b2\b\u0010\u001C\u001A\u0004\u0018\u00010\b2\b\u0010\u001E\u001A\u0004\u0018\u00010\b2\b\u0010\u001F\u001A\u0004\u0018\u00010\b2\b\u0010 \u001A\u0004\u0018\u00010\b2\b\u0010!\u001A\u0004\u0018\u00010\b2\b\u0010\"\u001A\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u00032\u0006\u0010\u001D\u001A\u00020\u0003H\u0096\u0002J\u00C3\u0001\u0010\u000F\u001A\u0004\u0018\u00010\b2\b\u0010\u0013\u001A\u0004\u0018\u00010\b2\b\u0010\u0014\u001A\u0004\u0018\u00010\b2\b\u0010\u0015\u001A\u0004\u0018\u00010\b2\b\u0010\u0016\u001A\u0004\u0018\u00010\b2\b\u0010\u0017\u001A\u0004\u0018\u00010\b2\b\u0010\u0018\u001A\u0004\u0018\u00010\b2\b\u0010\u0019\u001A\u0004\u0018\u00010\b2\b\u0010\u001A\u001A\u0004\u0018\u00010\b2\b\u0010\u001B\u001A\u0004\u0018\u00010\b2\b\u0010\u001C\u001A\u0004\u0018\u00010\b2\b\u0010\u001E\u001A\u0004\u0018\u00010\b2\b\u0010\u001F\u001A\u0004\u0018\u00010\b2\b\u0010 \u001A\u0004\u0018\u00010\b2\b\u0010!\u001A\u0004\u0018\u00010\b2\b\u0010\"\u001A\u0004\u0018\u00010\b2\b\u0010#\u001A\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u00032\u0006\u0010\u001D\u001A\u00020\u0003H\u0096\u0002J\u00CD\u0001\u0010\u000F\u001A\u0004\u0018\u00010\b2\b\u0010\u0013\u001A\u0004\u0018\u00010\b2\b\u0010\u0014\u001A\u0004\u0018\u00010\b2\b\u0010\u0015\u001A\u0004\u0018\u00010\b2\b\u0010\u0016\u001A\u0004\u0018\u00010\b2\b\u0010\u0017\u001A\u0004\u0018\u00010\b2\b\u0010\u0018\u001A\u0004\u0018\u00010\b2\b\u0010\u0019\u001A\u0004\u0018\u00010\b2\b\u0010\u001A\u001A\u0004\u0018\u00010\b2\b\u0010\u001B\u001A\u0004\u0018\u00010\b2\b\u0010\u001C\u001A\u0004\u0018\u00010\b2\b\u0010\u001E\u001A\u0004\u0018\u00010\b2\b\u0010\u001F\u001A\u0004\u0018\u00010\b2\b\u0010 \u001A\u0004\u0018\u00010\b2\b\u0010!\u001A\u0004\u0018\u00010\b2\b\u0010\"\u001A\u0004\u0018\u00010\b2\b\u0010#\u001A\u0004\u0018\u00010\b2\b\u0010$\u001A\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u00032\u0006\u0010\u001D\u001A\u00020\u0003H\u0096\u0002J\u00D7\u0001\u0010\u000F\u001A\u0004\u0018\u00010\b2\b\u0010\u0013\u001A\u0004\u0018\u00010\b2\b\u0010\u0014\u001A\u0004\u0018\u00010\b2\b\u0010\u0015\u001A\u0004\u0018\u00010\b2\b\u0010\u0016\u001A\u0004\u0018\u00010\b2\b\u0010\u0017\u001A\u0004\u0018\u00010\b2\b\u0010\u0018\u001A\u0004\u0018\u00010\b2\b\u0010\u0019\u001A\u0004\u0018\u00010\b2\b\u0010\u001A\u001A\u0004\u0018\u00010\b2\b\u0010\u001B\u001A\u0004\u0018\u00010\b2\b\u0010\u001C\u001A\u0004\u0018\u00010\b2\b\u0010\u001E\u001A\u0004\u0018\u00010\b2\b\u0010\u001F\u001A\u0004\u0018\u00010\b2\b\u0010 \u001A\u0004\u0018\u00010\b2\b\u0010!\u001A\u0004\u0018\u00010\b2\b\u0010\"\u001A\u0004\u0018\u00010\b2\b\u0010#\u001A\u0004\u0018\u00010\b2\b\u0010$\u001A\u0004\u0018\u00010\b2\b\u0010%\u001A\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u00032\u0006\u0010\u001D\u001A\u00020\u0003H\u0096\u0002J\u0010\u0010&\u001A\u00020\'2\u0006\u0010(\u001A\u00020\u0011H\u0002J\b\u0010)\u001A\u00020\'H\u0002J\u000E\u0010*\u001A\u00020\'2\u0006\u0010+\u001A\u00020\bR\u0010\u0010\u0007\u001A\u0004\u0018\u00010\bX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0010\u0010\u000B\u001A\u0004\u0018\u00010\fX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0016\u0010\r\u001A\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000EX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0004\u001A\u00020\u0005X\u0082\u0004\u00A2\u0006\u0002\n\u0000\u00A8\u0006,"}, d2 = {"Landroidx/compose/runtime/internal/ComposableLambdaImpl;", "Landroidx/compose/runtime/internal/ComposableLambda;", "key", "", "tracked", "", "(IZ)V", "_block", "", "getKey", "()I", "scope", "Landroidx/compose/runtime/RecomposeScope;", "scopes", "", "invoke", "c", "Landroidx/compose/runtime/Composer;", "changed", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "changed1", "p11", "p12", "p13", "p14", "p15", "p16", "p17", "p18", "trackRead", "", "composer", "trackWrite", "update", "block", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class ComposableLambdaImpl implements ComposableLambda {
    private Object _block;
    private final int key;
    private RecomposeScope scope;
    private List scopes;
    private final boolean tracked;

    public ComposableLambdaImpl(int v, boolean z) {
        this.key = v;
        this.tracked = z;
    }

    public final int getKey() {
        return this.key;
    }

    public Object invoke(Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(composer0, "c");
        Composer composer1 = composer0.startRestartGroup(this.key);
        this.trackRead(composer1);
        int v1 = composer1.changed(this) ? ComposableLambdaKt.differentBits(0) : ComposableLambdaKt.sameBits(0);
        Object object0 = this._block;
        if(object0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, kotlin.Any?>");
        }
        Object object1 = ((Function2)TypeIntrinsics.beforeCheckcastToFunctionOfArity(object0, 2)).invoke(composer1, ((int)(v | v1)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(this);
        }
        return object1;
    }

    public Object invoke(Object object0, Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(composer0, "c");
        Composer composer1 = composer0.startRestartGroup(this.key);
        this.trackRead(composer1);
        int v1 = composer1.changed(this) ? ComposableLambdaKt.differentBits(1) : ComposableLambdaKt.sameBits(1);
        Object object1 = this._block;
        if(object1 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, kotlin.Any?>");
        }
        Object object2 = ((Function3)TypeIntrinsics.beforeCheckcastToFunctionOfArity(object1, 3)).invoke(object0, composer1, ((int)(v1 | v)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new Function2(object0, v) {
                final int $changed;
                final Object $p1;

                {
                    ComposableLambdaImpl.this = composableLambdaImpl0;
                    this.$p1 = object0;
                    this.$changed = v;
                    super(2);
                }

                @Override  // kotlin.jvm.functions.Function2
                public Object invoke(Object object0, Object object1) {
                    this.invoke(((Composer)object0), ((Number)object1).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer0, int v) {
                    Intrinsics.checkNotNullParameter(composer0, "nc");
                    ComposableLambdaImpl.this.invoke(this.$p1, composer0, this.$changed | 1);
                }
            });
        }
        return object2;
    }

    @Override  // kotlin.jvm.functions.Function2
    public Object invoke(Object object0, Object object1) {
        return this.invoke(((Composer)object0), ((Number)object1).intValue());
    }

    public Object invoke(Object object0, Object object1, Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(composer0, "c");
        Composer composer1 = composer0.startRestartGroup(this.key);
        this.trackRead(composer1);
        int v1 = composer1.changed(this) ? ComposableLambdaKt.differentBits(2) : ComposableLambdaKt.sameBits(2);
        Object object2 = this._block;
        if(object2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, kotlin.Any?>");
        }
        Object object3 = ((Function4)TypeIntrinsics.beforeCheckcastToFunctionOfArity(object2, 4)).invoke(object0, object1, composer1, ((int)(v1 | v)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new Function2(object0, object1, v) {
                final int $changed;
                final Object $p1;
                final Object $p2;

                {
                    ComposableLambdaImpl.this = composableLambdaImpl0;
                    this.$p1 = object0;
                    this.$p2 = object1;
                    this.$changed = v;
                    super(2);
                }

                @Override  // kotlin.jvm.functions.Function2
                public Object invoke(Object object0, Object object1) {
                    this.invoke(((Composer)object0), ((Number)object1).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer0, int v) {
                    Intrinsics.checkNotNullParameter(composer0, "nc");
                    ComposableLambdaImpl.this.invoke(this.$p1, this.$p2, composer0, this.$changed | 1);
                }
            });
        }
        return object3;
    }

    @Override  // kotlin.jvm.functions.Function3
    public Object invoke(Object object0, Object object1, Object object2) {
        return this.invoke(object0, ((Composer)object1), ((Number)object2).intValue());
    }

    public Object invoke(Object object0, Object object1, Object object2, Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(composer0, "c");
        Composer composer1 = composer0.startRestartGroup(this.key);
        this.trackRead(composer1);
        int v1 = composer1.changed(this) ? ComposableLambdaKt.differentBits(3) : ComposableLambdaKt.sameBits(3);
        Object object3 = this._block;
        if(object3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'p3\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, kotlin.Any?>");
        }
        Object object4 = ((Function5)TypeIntrinsics.beforeCheckcastToFunctionOfArity(object3, 5)).invoke(object0, object1, object2, composer1, ((int)(v1 | v)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new Function2(object0, object1, object2, v) {
                final int $changed;
                final Object $p1;
                final Object $p2;
                final Object $p3;

                {
                    ComposableLambdaImpl.this = composableLambdaImpl0;
                    this.$p1 = object0;
                    this.$p2 = object1;
                    this.$p3 = object2;
                    this.$changed = v;
                    super(2);
                }

                @Override  // kotlin.jvm.functions.Function2
                public Object invoke(Object object0, Object object1) {
                    this.invoke(((Composer)object0), ((Number)object1).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer0, int v) {
                    Intrinsics.checkNotNullParameter(composer0, "nc");
                    ComposableLambdaImpl.this.invoke(this.$p1, this.$p2, this.$p3, composer0, this.$changed | 1);
                }
            });
        }
        return object4;
    }

    @Override  // kotlin.jvm.functions.Function4
    public Object invoke(Object object0, Object object1, Object object2, Object object3) {
        return this.invoke(object0, object1, ((Composer)object2), ((Number)object3).intValue());
    }

    public Object invoke(Object object0, Object object1, Object object2, Object object3, Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(composer0, "c");
        Composer composer1 = composer0.startRestartGroup(this.key);
        this.trackRead(composer1);
        int v1 = composer1.changed(this) ? ComposableLambdaKt.differentBits(4) : ComposableLambdaKt.sameBits(4);
        Object object4 = this._block;
        if(object4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'p3\')] kotlin.Any?, @[ParameterName(name = \'p4\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, kotlin.Any?>");
        }
        Object object5 = ((Function6)TypeIntrinsics.beforeCheckcastToFunctionOfArity(object4, 6)).invoke(object0, object1, object2, object3, composer1, ((int)(v1 | v)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new Function2(object0, object1, object2, object3, v) {
                final int $changed;
                final Object $p1;
                final Object $p2;
                final Object $p3;
                final Object $p4;

                {
                    ComposableLambdaImpl.this = composableLambdaImpl0;
                    this.$p1 = object0;
                    this.$p2 = object1;
                    this.$p3 = object2;
                    this.$p4 = object3;
                    this.$changed = v;
                    super(2);
                }

                @Override  // kotlin.jvm.functions.Function2
                public Object invoke(Object object0, Object object1) {
                    this.invoke(((Composer)object0), ((Number)object1).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer0, int v) {
                    Intrinsics.checkNotNullParameter(composer0, "nc");
                    ComposableLambdaImpl.this.invoke(this.$p1, this.$p2, this.$p3, this.$p4, composer0, this.$changed | 1);
                }
            });
        }
        return object5;
    }

    @Override  // kotlin.jvm.functions.Function5
    public Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4) {
        return this.invoke(object0, object1, object2, ((Composer)object3), ((Number)object4).intValue());
    }

    public Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(composer0, "c");
        Composer composer1 = composer0.startRestartGroup(this.key);
        this.trackRead(composer1);
        int v1 = composer1.changed(this) ? ComposableLambdaKt.differentBits(5) : ComposableLambdaKt.sameBits(5);
        Object object5 = this._block;
        if(object5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Function7<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'p3\')] kotlin.Any?, @[ParameterName(name = \'p4\')] kotlin.Any?, @[ParameterName(name = \'p5\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, kotlin.Any?>");
        }
        Object object6 = ((Function7)TypeIntrinsics.beforeCheckcastToFunctionOfArity(object5, 7)).invoke(object0, object1, object2, object3, object4, composer1, ((int)(v | v1)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new Function2(object0, object1, object2, object3, object4, v) {
                final int $changed;
                final Object $p1;
                final Object $p2;
                final Object $p3;
                final Object $p4;
                final Object $p5;

                {
                    ComposableLambdaImpl.this = composableLambdaImpl0;
                    this.$p1 = object0;
                    this.$p2 = object1;
                    this.$p3 = object2;
                    this.$p4 = object3;
                    this.$p5 = object4;
                    this.$changed = v;
                    super(2);
                }

                @Override  // kotlin.jvm.functions.Function2
                public Object invoke(Object object0, Object object1) {
                    this.invoke(((Composer)object0), ((Number)object1).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer0, int v) {
                    Intrinsics.checkNotNullParameter(composer0, "nc");
                    ComposableLambdaImpl.this.invoke(this.$p1, this.$p2, this.$p3, this.$p4, this.$p5, composer0, this.$changed | 1);
                }
            });
        }
        return object6;
    }

    @Override  // kotlin.jvm.functions.Function6
    public Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5) {
        return this.invoke(object0, object1, object2, object3, ((Composer)object4), ((Number)object5).intValue());
    }

    public Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(composer0, "c");
        Composer composer1 = composer0.startRestartGroup(this.key);
        this.trackRead(composer1);
        int v1 = composer1.changed(this) ? ComposableLambdaKt.differentBits(6) : ComposableLambdaKt.sameBits(6);
        Object object6 = this._block;
        if(object6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Function8<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'p3\')] kotlin.Any?, @[ParameterName(name = \'p4\')] kotlin.Any?, @[ParameterName(name = \'p5\')] kotlin.Any?, @[ParameterName(name = \'p6\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, kotlin.Any?>");
        }
        Object object7 = ((Function8)TypeIntrinsics.beforeCheckcastToFunctionOfArity(object6, 8)).invoke(object0, object1, object2, object3, object4, object5, composer1, ((int)(v | v1)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new Function2(object0, object1, object2, object3, object4, object5, v) {
                final int $changed;
                final Object $p1;
                final Object $p2;
                final Object $p3;
                final Object $p4;
                final Object $p5;
                final Object $p6;

                {
                    ComposableLambdaImpl.this = composableLambdaImpl0;
                    this.$p1 = object0;
                    this.$p2 = object1;
                    this.$p3 = object2;
                    this.$p4 = object3;
                    this.$p5 = object4;
                    this.$p6 = object5;
                    this.$changed = v;
                    super(2);
                }

                @Override  // kotlin.jvm.functions.Function2
                public Object invoke(Object object0, Object object1) {
                    this.invoke(((Composer)object0), ((Number)object1).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer0, int v) {
                    Intrinsics.checkNotNullParameter(composer0, "nc");
                    ComposableLambdaImpl.this.invoke(this.$p1, this.$p2, this.$p3, this.$p4, this.$p5, this.$p6, composer0, this.$changed | 1);
                }
            });
        }
        return object7;
    }

    @Override  // kotlin.jvm.functions.Function7
    public Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6) {
        return this.invoke(object0, object1, object2, object3, object4, ((Composer)object5), ((Number)object6).intValue());
    }

    public Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(composer0, "c");
        Composer composer1 = composer0.startRestartGroup(this.key);
        this.trackRead(composer1);
        int v1 = composer1.changed(this) ? ComposableLambdaKt.differentBits(7) : ComposableLambdaKt.sameBits(7);
        Object object7 = this._block;
        if(object7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Function9<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'p3\')] kotlin.Any?, @[ParameterName(name = \'p4\')] kotlin.Any?, @[ParameterName(name = \'p5\')] kotlin.Any?, @[ParameterName(name = \'p6\')] kotlin.Any?, @[ParameterName(name = \'p7\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, kotlin.Any?>");
        }
        Object object8 = ((Function9)TypeIntrinsics.beforeCheckcastToFunctionOfArity(object7, 9)).invoke(object0, object1, object2, object3, object4, object5, object6, composer1, ((int)(v | v1)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new Function2(object0, object1, object2, object3, object4, object5, object6, v) {
                final int $changed;
                final Object $p1;
                final Object $p2;
                final Object $p3;
                final Object $p4;
                final Object $p5;
                final Object $p6;
                final Object $p7;

                {
                    ComposableLambdaImpl.this = composableLambdaImpl0;
                    this.$p1 = object0;
                    this.$p2 = object1;
                    this.$p3 = object2;
                    this.$p4 = object3;
                    this.$p5 = object4;
                    this.$p6 = object5;
                    this.$p7 = object6;
                    this.$changed = v;
                    super(2);
                }

                @Override  // kotlin.jvm.functions.Function2
                public Object invoke(Object object0, Object object1) {
                    this.invoke(((Composer)object0), ((Number)object1).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer0, int v) {
                    Intrinsics.checkNotNullParameter(composer0, "nc");
                    ComposableLambdaImpl.this.invoke(this.$p1, this.$p2, this.$p3, this.$p4, this.$p5, this.$p6, this.$p7, composer0, this.$changed | 1);
                }
            });
        }
        return object8;
    }

    @Override  // kotlin.jvm.functions.Function8
    public Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7) {
        return this.invoke(object0, object1, object2, object3, object4, object5, ((Composer)object6), ((Number)object7).intValue());
    }

    public Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(composer0, "c");
        Composer composer1 = composer0.startRestartGroup(this.key);
        this.trackRead(composer1);
        int v1 = composer1.changed(this) ? ComposableLambdaKt.differentBits(8) : ComposableLambdaKt.sameBits(8);
        Object object8 = this._block;
        if(object8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Function10<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'p3\')] kotlin.Any?, @[ParameterName(name = \'p4\')] kotlin.Any?, @[ParameterName(name = \'p5\')] kotlin.Any?, @[ParameterName(name = \'p6\')] kotlin.Any?, @[ParameterName(name = \'p7\')] kotlin.Any?, @[ParameterName(name = \'p8\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, kotlin.Any?>");
        }
        Object object9 = ((Function10)TypeIntrinsics.beforeCheckcastToFunctionOfArity(object8, 10)).invoke(object0, object1, object2, object3, object4, object5, object6, object7, composer1, ((int)(v | v1)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new Function2(object0, object1, object2, object3, object4, object5, object6, object7, v) {
                final int $changed;
                final Object $p1;
                final Object $p2;
                final Object $p3;
                final Object $p4;
                final Object $p5;
                final Object $p6;
                final Object $p7;
                final Object $p8;

                {
                    ComposableLambdaImpl.this = composableLambdaImpl0;
                    this.$p1 = object0;
                    this.$p2 = object1;
                    this.$p3 = object2;
                    this.$p4 = object3;
                    this.$p5 = object4;
                    this.$p6 = object5;
                    this.$p7 = object6;
                    this.$p8 = object7;
                    this.$changed = v;
                    super(2);
                }

                @Override  // kotlin.jvm.functions.Function2
                public Object invoke(Object object0, Object object1) {
                    this.invoke(((Composer)object0), ((Number)object1).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer0, int v) {
                    Intrinsics.checkNotNullParameter(composer0, "nc");
                    ComposableLambdaImpl.this.invoke(this.$p1, this.$p2, this.$p3, this.$p4, this.$p5, this.$p6, this.$p7, this.$p8, composer0, this.$changed | 1);
                }
            });
        }
        return object9;
    }

    @Override  // kotlin.jvm.functions.Function9
    public Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8) {
        return this.invoke(object0, object1, object2, object3, object4, object5, object6, ((Composer)object7), ((Number)object8).intValue());
    }

    public Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(composer0, "c");
        Composer composer1 = composer0.startRestartGroup(this.key);
        this.trackRead(composer1);
        int v1 = composer1.changed(this) ? ComposableLambdaKt.differentBits(9) : ComposableLambdaKt.sameBits(9);
        Object object9 = this._block;
        if(object9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Function11<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'p3\')] kotlin.Any?, @[ParameterName(name = \'p4\')] kotlin.Any?, @[ParameterName(name = \'p5\')] kotlin.Any?, @[ParameterName(name = \'p6\')] kotlin.Any?, @[ParameterName(name = \'p7\')] kotlin.Any?, @[ParameterName(name = \'p8\')] kotlin.Any?, @[ParameterName(name = \'p9\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, kotlin.Any?>");
        }
        Object object10 = ((Function11)TypeIntrinsics.beforeCheckcastToFunctionOfArity(object9, 11)).invoke(object0, object1, object2, object3, object4, object5, object6, object7, object8, composer1, ((int)(v | v1)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new Function2(object0, object1, object2, object3, object4, object5, object6, object7, object8, v) {
                final int $changed;
                final Object $p1;
                final Object $p2;
                final Object $p3;
                final Object $p4;
                final Object $p5;
                final Object $p6;
                final Object $p7;
                final Object $p8;
                final Object $p9;

                {
                    ComposableLambdaImpl.this = composableLambdaImpl0;
                    this.$p1 = object0;
                    this.$p2 = object1;
                    this.$p3 = object2;
                    this.$p4 = object3;
                    this.$p5 = object4;
                    this.$p6 = object5;
                    this.$p7 = object6;
                    this.$p8 = object7;
                    this.$p9 = object8;
                    this.$changed = v;
                    super(2);
                }

                @Override  // kotlin.jvm.functions.Function2
                public Object invoke(Object object0, Object object1) {
                    this.invoke(((Composer)object0), ((Number)object1).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer0, int v) {
                    Intrinsics.checkNotNullParameter(composer0, "nc");
                    ComposableLambdaImpl.this.invoke(this.$p1, this.$p2, this.$p3, this.$p4, this.$p5, this.$p6, this.$p7, this.$p8, this.$p9, composer0, this.$changed | 1);
                }
            });
        }
        return object10;
    }

    @Override  // kotlin.jvm.functions.Function10
    public Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9) {
        return this.invoke(object0, object1, object2, object3, object4, object5, object6, object7, ((Composer)object8), ((Number)object9).intValue());
    }

    public Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Composer composer0, int v, int v1) {
        Intrinsics.checkNotNullParameter(composer0, "c");
        Composer composer1 = composer0.startRestartGroup(this.key);
        this.trackRead(composer1);
        int v2 = composer1.changed(this) ? ComposableLambdaKt.differentBits(10) : ComposableLambdaKt.sameBits(10);
        Object object10 = this._block;
        if(object10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Function13<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'p3\')] kotlin.Any?, @[ParameterName(name = \'p4\')] kotlin.Any?, @[ParameterName(name = \'p5\')] kotlin.Any?, @[ParameterName(name = \'p6\')] kotlin.Any?, @[ParameterName(name = \'p7\')] kotlin.Any?, @[ParameterName(name = \'p8\')] kotlin.Any?, @[ParameterName(name = \'p9\')] kotlin.Any?, @[ParameterName(name = \'p10\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, @[ParameterName(name = \'changed1\')] kotlin.Int, kotlin.Any?>");
        }
        Object object11 = ((Function13)TypeIntrinsics.beforeCheckcastToFunctionOfArity(object10, 13)).invoke(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, composer1, v, ((int)(v1 | v2)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new Function2(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, v) {
                final int $changed;
                final Object $p1;
                final Object $p10;
                final Object $p2;
                final Object $p3;
                final Object $p4;
                final Object $p5;
                final Object $p6;
                final Object $p7;
                final Object $p8;
                final Object $p9;

                {
                    ComposableLambdaImpl.this = composableLambdaImpl0;
                    this.$p1 = object0;
                    this.$p2 = object1;
                    this.$p3 = object2;
                    this.$p4 = object3;
                    this.$p5 = object4;
                    this.$p6 = object5;
                    this.$p7 = object6;
                    this.$p8 = object7;
                    this.$p9 = object8;
                    this.$p10 = object9;
                    this.$changed = v;
                    super(2);
                }

                @Override  // kotlin.jvm.functions.Function2
                public Object invoke(Object object0, Object object1) {
                    this.invoke(((Composer)object0), ((Number)object1).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer0, int v) {
                    Intrinsics.checkNotNullParameter(composer0, "nc");
                    ComposableLambdaImpl.this.invoke(this.$p1, this.$p2, this.$p3, this.$p4, this.$p5, this.$p6, this.$p7, this.$p8, this.$p9, this.$p10, composer0, this.$changed | 1, this.$changed);
                }
            });
        }
        return object11;
    }

    @Override  // kotlin.jvm.functions.Function11
    public Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10) {
        return this.invoke(object0, object1, object2, object3, object4, object5, object6, object7, object8, ((Composer)object9), ((Number)object10).intValue());
    }

    public Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Composer composer0, int v, int v1) {
        Intrinsics.checkNotNullParameter(composer0, "c");
        Composer composer1 = composer0.startRestartGroup(this.key);
        this.trackRead(composer1);
        int v2 = composer1.changed(this) ? ComposableLambdaKt.differentBits(11) : ComposableLambdaKt.sameBits(11);
        Object object11 = this._block;
        if(object11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Function14<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'p3\')] kotlin.Any?, @[ParameterName(name = \'p4\')] kotlin.Any?, @[ParameterName(name = \'p5\')] kotlin.Any?, @[ParameterName(name = \'p6\')] kotlin.Any?, @[ParameterName(name = \'p7\')] kotlin.Any?, @[ParameterName(name = \'p8\')] kotlin.Any?, @[ParameterName(name = \'p9\')] kotlin.Any?, @[ParameterName(name = \'p10\')] kotlin.Any?, @[ParameterName(name = \'p11\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, @[ParameterName(name = \'changed1\')] kotlin.Int, kotlin.Any?>");
        }
        Object object12 = ((Function14)TypeIntrinsics.beforeCheckcastToFunctionOfArity(object11, 14)).invoke(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, composer1, v, ((int)(v1 | v2)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new Function2(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, v, v1) {
                final int $changed;
                final int $changed1;
                final Object $p1;
                final Object $p10;
                final Object $p11;
                final Object $p2;
                final Object $p3;
                final Object $p4;
                final Object $p5;
                final Object $p6;
                final Object $p7;
                final Object $p8;
                final Object $p9;

                {
                    ComposableLambdaImpl.this = composableLambdaImpl0;
                    this.$p1 = object0;
                    this.$p2 = object1;
                    this.$p3 = object2;
                    this.$p4 = object3;
                    this.$p5 = object4;
                    this.$p6 = object5;
                    this.$p7 = object6;
                    this.$p8 = object7;
                    this.$p9 = object8;
                    this.$p10 = object9;
                    this.$p11 = object10;
                    this.$changed = v;
                    this.$changed1 = v1;
                    super(2);
                }

                @Override  // kotlin.jvm.functions.Function2
                public Object invoke(Object object0, Object object1) {
                    this.invoke(((Composer)object0), ((Number)object1).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer0, int v) {
                    Intrinsics.checkNotNullParameter(composer0, "nc");
                    ComposableLambdaImpl.this.invoke(this.$p1, this.$p2, this.$p3, this.$p4, this.$p5, this.$p6, this.$p7, this.$p8, this.$p9, this.$p10, this.$p11, composer0, this.$changed | 1, this.$changed1);
                }
            });
        }
        return object12;
    }

    public Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Composer composer0, int v, int v1) {
        Intrinsics.checkNotNullParameter(composer0, "c");
        Composer composer1 = composer0.startRestartGroup(this.key);
        this.trackRead(composer1);
        int v2 = composer1.changed(this) ? ComposableLambdaKt.differentBits(12) : ComposableLambdaKt.sameBits(12);
        Object object12 = this._block;
        if(object12 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Function15<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'p3\')] kotlin.Any?, @[ParameterName(name = \'p4\')] kotlin.Any?, @[ParameterName(name = \'p5\')] kotlin.Any?, @[ParameterName(name = \'p6\')] kotlin.Any?, @[ParameterName(name = \'p7\')] kotlin.Any?, @[ParameterName(name = \'p8\')] kotlin.Any?, @[ParameterName(name = \'p9\')] kotlin.Any?, @[ParameterName(name = \'p10\')] kotlin.Any?, @[ParameterName(name = \'p11\')] kotlin.Any?, @[ParameterName(name = \'p12\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, @[ParameterName(name = \'changed1\')] kotlin.Int, kotlin.Any?>");
        }
        Object object13 = ((Function15)TypeIntrinsics.beforeCheckcastToFunctionOfArity(object12, 15)).invoke(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, composer1, v, ((int)(v1 | v2)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new Function2(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, v, v1) {
                final int $changed;
                final int $changed1;
                final Object $p1;
                final Object $p10;
                final Object $p11;
                final Object $p12;
                final Object $p2;
                final Object $p3;
                final Object $p4;
                final Object $p5;
                final Object $p6;
                final Object $p7;
                final Object $p8;
                final Object $p9;

                {
                    ComposableLambdaImpl.this = composableLambdaImpl0;
                    this.$p1 = object0;
                    this.$p2 = object1;
                    this.$p3 = object2;
                    this.$p4 = object3;
                    this.$p5 = object4;
                    this.$p6 = object5;
                    this.$p7 = object6;
                    this.$p8 = object7;
                    this.$p9 = object8;
                    this.$p10 = object9;
                    this.$p11 = object10;
                    this.$p12 = object11;
                    this.$changed = v;
                    this.$changed1 = v1;
                    super(2);
                }

                @Override  // kotlin.jvm.functions.Function2
                public Object invoke(Object object0, Object object1) {
                    this.invoke(((Composer)object0), ((Number)object1).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer0, int v) {
                    Intrinsics.checkNotNullParameter(composer0, "nc");
                    ComposableLambdaImpl.this.invoke(this.$p1, this.$p2, this.$p3, this.$p4, this.$p5, this.$p6, this.$p7, this.$p8, this.$p9, this.$p10, this.$p11, this.$p12, composer0, this.$changed | 1, this.$changed1);
                }
            });
        }
        return object13;
    }

    @Override  // kotlin.jvm.functions.Function13
    public Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12) {
        return this.invoke(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, ((Composer)object10), ((Number)object11).intValue(), ((Number)object12).intValue());
    }

    public Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Composer composer0, int v, int v1) {
        Intrinsics.checkNotNullParameter(composer0, "c");
        Composer composer1 = composer0.startRestartGroup(this.key);
        this.trackRead(composer1);
        int v2 = composer1.changed(this) ? ComposableLambdaKt.differentBits(13) : ComposableLambdaKt.sameBits(13);
        Object object13 = this._block;
        if(object13 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Function16<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'p3\')] kotlin.Any?, @[ParameterName(name = \'p4\')] kotlin.Any?, @[ParameterName(name = \'p5\')] kotlin.Any?, @[ParameterName(name = \'p6\')] kotlin.Any?, @[ParameterName(name = \'p7\')] kotlin.Any?, @[ParameterName(name = \'p8\')] kotlin.Any?, @[ParameterName(name = \'p9\')] kotlin.Any?, @[ParameterName(name = \'p10\')] kotlin.Any?, @[ParameterName(name = \'p11\')] kotlin.Any?, @[ParameterName(name = \'p12\')] kotlin.Any?, @[ParameterName(name = \'p13\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, @[ParameterName(name = \'changed1\')] kotlin.Int, kotlin.Any?>");
        }
        Object object14 = ((Function16)TypeIntrinsics.beforeCheckcastToFunctionOfArity(object13, 16)).invoke(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, composer1, v, ((int)(v1 | v2)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new Function2(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, v, v1) {
                final int $changed;
                final int $changed1;
                final Object $p1;
                final Object $p10;
                final Object $p11;
                final Object $p12;
                final Object $p13;
                final Object $p2;
                final Object $p3;
                final Object $p4;
                final Object $p5;
                final Object $p6;
                final Object $p7;
                final Object $p8;
                final Object $p9;

                {
                    ComposableLambdaImpl.this = composableLambdaImpl0;
                    this.$p1 = object0;
                    this.$p2 = object1;
                    this.$p3 = object2;
                    this.$p4 = object3;
                    this.$p5 = object4;
                    this.$p6 = object5;
                    this.$p7 = object6;
                    this.$p8 = object7;
                    this.$p9 = object8;
                    this.$p10 = object9;
                    this.$p11 = object10;
                    this.$p12 = object11;
                    this.$p13 = object12;
                    this.$changed = v;
                    this.$changed1 = v1;
                    super(2);
                }

                @Override  // kotlin.jvm.functions.Function2
                public Object invoke(Object object0, Object object1) {
                    this.invoke(((Composer)object0), ((Number)object1).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer0, int v) {
                    Intrinsics.checkNotNullParameter(composer0, "nc");
                    ComposableLambdaImpl.this.invoke(this.$p1, this.$p2, this.$p3, this.$p4, this.$p5, this.$p6, this.$p7, this.$p8, this.$p9, this.$p10, this.$p11, this.$p12, this.$p13, composer0, this.$changed | 1, this.$changed1);
                }
            });
        }
        return object14;
    }

    @Override  // kotlin.jvm.functions.Function14
    public Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13) {
        return this.invoke(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, ((Composer)object11), ((Number)object12).intValue(), ((Number)object13).intValue());
    }

    public Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Composer composer0, int v, int v1) {
        Intrinsics.checkNotNullParameter(composer0, "c");
        Composer composer1 = composer0.startRestartGroup(this.key);
        this.trackRead(composer1);
        int v2 = composer1.changed(this) ? ComposableLambdaKt.differentBits(14) : ComposableLambdaKt.sameBits(14);
        Object object14 = this._block;
        if(object14 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Function17<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'p3\')] kotlin.Any?, @[ParameterName(name = \'p4\')] kotlin.Any?, @[ParameterName(name = \'p5\')] kotlin.Any?, @[ParameterName(name = \'p6\')] kotlin.Any?, @[ParameterName(name = \'p7\')] kotlin.Any?, @[ParameterName(name = \'p8\')] kotlin.Any?, @[ParameterName(name = \'p9\')] kotlin.Any?, @[ParameterName(name = \'p10\')] kotlin.Any?, @[ParameterName(name = \'p11\')] kotlin.Any?, @[ParameterName(name = \'p12\')] kotlin.Any?, @[ParameterName(name = \'p13\')] kotlin.Any?, @[ParameterName(name = \'p14\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, @[ParameterName(name = \'changed1\')] kotlin.Int, kotlin.Any?>");
        }
        Object object15 = ((Function17)TypeIntrinsics.beforeCheckcastToFunctionOfArity(object14, 17)).invoke(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, composer1, v, ((int)(v1 | v2)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new Function2(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, v, v1) {
                final int $changed;
                final int $changed1;
                final Object $p1;
                final Object $p10;
                final Object $p11;
                final Object $p12;
                final Object $p13;
                final Object $p14;
                final Object $p2;
                final Object $p3;
                final Object $p4;
                final Object $p5;
                final Object $p6;
                final Object $p7;
                final Object $p8;
                final Object $p9;

                {
                    ComposableLambdaImpl.this = composableLambdaImpl0;
                    this.$p1 = object0;
                    this.$p2 = object1;
                    this.$p3 = object2;
                    this.$p4 = object3;
                    this.$p5 = object4;
                    this.$p6 = object5;
                    this.$p7 = object6;
                    this.$p8 = object7;
                    this.$p9 = object8;
                    this.$p10 = object9;
                    this.$p11 = object10;
                    this.$p12 = object11;
                    this.$p13 = object12;
                    this.$p14 = object13;
                    this.$changed = v;
                    this.$changed1 = v1;
                    super(2);
                }

                @Override  // kotlin.jvm.functions.Function2
                public Object invoke(Object object0, Object object1) {
                    this.invoke(((Composer)object0), ((Number)object1).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer0, int v) {
                    Intrinsics.checkNotNullParameter(composer0, "nc");
                    ComposableLambdaImpl.this.invoke(this.$p1, this.$p2, this.$p3, this.$p4, this.$p5, this.$p6, this.$p7, this.$p8, this.$p9, this.$p10, this.$p11, this.$p12, this.$p13, this.$p14, composer0, this.$changed | 1, this.$changed1);
                }
            });
        }
        return object15;
    }

    @Override  // kotlin.jvm.functions.Function15
    public Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14) {
        return this.invoke(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, ((Composer)object12), ((Number)object13).intValue(), ((Number)object14).intValue());
    }

    public Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Composer composer0, int v, int v1) {
        Intrinsics.checkNotNullParameter(composer0, "c");
        Composer composer1 = composer0.startRestartGroup(this.key);
        this.trackRead(composer1);
        int v2 = composer1.changed(this) ? ComposableLambdaKt.differentBits(15) : ComposableLambdaKt.sameBits(15);
        Object object15 = this._block;
        if(object15 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Function18<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'p3\')] kotlin.Any?, @[ParameterName(name = \'p4\')] kotlin.Any?, @[ParameterName(name = \'p5\')] kotlin.Any?, @[ParameterName(name = \'p6\')] kotlin.Any?, @[ParameterName(name = \'p7\')] kotlin.Any?, @[ParameterName(name = \'p8\')] kotlin.Any?, @[ParameterName(name = \'p9\')] kotlin.Any?, @[ParameterName(name = \'p10\')] kotlin.Any?, @[ParameterName(name = \'p11\')] kotlin.Any?, @[ParameterName(name = \'p12\')] kotlin.Any?, @[ParameterName(name = \'p13\')] kotlin.Any?, @[ParameterName(name = \'p14\')] kotlin.Any?, @[ParameterName(name = \'p15\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, @[ParameterName(name = \'changed1\')] kotlin.Int, kotlin.Any?>");
        }
        Object object16 = ((Function18)TypeIntrinsics.beforeCheckcastToFunctionOfArity(object15, 18)).invoke(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, composer1, v, ((int)(v1 | v2)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new Function2(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, v, v1) {
                final int $changed;
                final int $changed1;
                final Object $p1;
                final Object $p10;
                final Object $p11;
                final Object $p12;
                final Object $p13;
                final Object $p14;
                final Object $p15;
                final Object $p2;
                final Object $p3;
                final Object $p4;
                final Object $p5;
                final Object $p6;
                final Object $p7;
                final Object $p8;
                final Object $p9;

                {
                    ComposableLambdaImpl.this = composableLambdaImpl0;
                    this.$p1 = object0;
                    this.$p2 = object1;
                    this.$p3 = object2;
                    this.$p4 = object3;
                    this.$p5 = object4;
                    this.$p6 = object5;
                    this.$p7 = object6;
                    this.$p8 = object7;
                    this.$p9 = object8;
                    this.$p10 = object9;
                    this.$p11 = object10;
                    this.$p12 = object11;
                    this.$p13 = object12;
                    this.$p14 = object13;
                    this.$p15 = object14;
                    this.$changed = v;
                    this.$changed1 = v1;
                    super(2);
                }

                @Override  // kotlin.jvm.functions.Function2
                public Object invoke(Object object0, Object object1) {
                    this.invoke(((Composer)object0), ((Number)object1).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer0, int v) {
                    Intrinsics.checkNotNullParameter(composer0, "nc");
                    ComposableLambdaImpl.this.invoke(this.$p1, this.$p2, this.$p3, this.$p4, this.$p5, this.$p6, this.$p7, this.$p8, this.$p9, this.$p10, this.$p11, this.$p12, this.$p13, this.$p14, this.$p15, composer0, this.$changed | 1, this.$changed1);
                }
            });
        }
        return object16;
    }

    @Override  // kotlin.jvm.functions.Function16
    public Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15) {
        return this.invoke(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, ((Composer)object13), ((Number)object14).intValue(), ((Number)object15).intValue());
    }

    public Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Composer composer0, int v, int v1) {
        Intrinsics.checkNotNullParameter(composer0, "c");
        Composer composer1 = composer0.startRestartGroup(this.key);
        this.trackRead(composer1);
        int v2 = composer1.changed(this) ? ComposableLambdaKt.differentBits(16) : ComposableLambdaKt.sameBits(16);
        Object object16 = this._block;
        if(object16 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Function19<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'p3\')] kotlin.Any?, @[ParameterName(name = \'p4\')] kotlin.Any?, @[ParameterName(name = \'p5\')] kotlin.Any?, @[ParameterName(name = \'p6\')] kotlin.Any?, @[ParameterName(name = \'p7\')] kotlin.Any?, @[ParameterName(name = \'p8\')] kotlin.Any?, @[ParameterName(name = \'p9\')] kotlin.Any?, @[ParameterName(name = \'p10\')] kotlin.Any?, @[ParameterName(name = \'p11\')] kotlin.Any?, @[ParameterName(name = \'p12\')] kotlin.Any?, @[ParameterName(name = \'p13\')] kotlin.Any?, @[ParameterName(name = \'p14\')] kotlin.Any?, @[ParameterName(name = \'p15\')] kotlin.Any?, @[ParameterName(name = \'p16\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, @[ParameterName(name = \'changed1\')] kotlin.Int, kotlin.Any?>");
        }
        Object object17 = ((Function19)TypeIntrinsics.beforeCheckcastToFunctionOfArity(object16, 19)).invoke(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, composer1, v, ((int)(v1 | v2)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new Function2(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, v, v1) {
                final int $changed;
                final int $changed1;
                final Object $p1;
                final Object $p10;
                final Object $p11;
                final Object $p12;
                final Object $p13;
                final Object $p14;
                final Object $p15;
                final Object $p16;
                final Object $p2;
                final Object $p3;
                final Object $p4;
                final Object $p5;
                final Object $p6;
                final Object $p7;
                final Object $p8;
                final Object $p9;

                {
                    ComposableLambdaImpl.this = composableLambdaImpl0;
                    this.$p1 = object0;
                    this.$p2 = object1;
                    this.$p3 = object2;
                    this.$p4 = object3;
                    this.$p5 = object4;
                    this.$p6 = object5;
                    this.$p7 = object6;
                    this.$p8 = object7;
                    this.$p9 = object8;
                    this.$p10 = object9;
                    this.$p11 = object10;
                    this.$p12 = object11;
                    this.$p13 = object12;
                    this.$p14 = object13;
                    this.$p15 = object14;
                    this.$p16 = object15;
                    this.$changed = v;
                    this.$changed1 = v1;
                    super(2);
                }

                @Override  // kotlin.jvm.functions.Function2
                public Object invoke(Object object0, Object object1) {
                    this.invoke(((Composer)object0), ((Number)object1).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer0, int v) {
                    Intrinsics.checkNotNullParameter(composer0, "nc");
                    ComposableLambdaImpl.this.invoke(this.$p1, this.$p2, this.$p3, this.$p4, this.$p5, this.$p6, this.$p7, this.$p8, this.$p9, this.$p10, this.$p11, this.$p12, this.$p13, this.$p14, this.$p15, this.$p16, composer0, this.$changed | 1, this.$changed1);
                }
            });
        }
        return object17;
    }

    @Override  // kotlin.jvm.functions.Function17
    public Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16) {
        return this.invoke(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, ((Composer)object14), ((Number)object15).intValue(), ((Number)object16).intValue());
    }

    public Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16, Composer composer0, int v, int v1) {
        Intrinsics.checkNotNullParameter(composer0, "c");
        Composer composer1 = composer0.startRestartGroup(this.key);
        this.trackRead(composer1);
        int v2 = composer1.changed(this) ? ComposableLambdaKt.differentBits(17) : ComposableLambdaKt.sameBits(17);
        Object object17 = this._block;
        if(object17 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Function20<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'p3\')] kotlin.Any?, @[ParameterName(name = \'p4\')] kotlin.Any?, @[ParameterName(name = \'p5\')] kotlin.Any?, @[ParameterName(name = \'p6\')] kotlin.Any?, @[ParameterName(name = \'p7\')] kotlin.Any?, @[ParameterName(name = \'p8\')] kotlin.Any?, @[ParameterName(name = \'p9\')] kotlin.Any?, @[ParameterName(name = \'p10\')] kotlin.Any?, @[ParameterName(name = \'p11\')] kotlin.Any?, @[ParameterName(name = \'p12\')] kotlin.Any?, @[ParameterName(name = \'p13\')] kotlin.Any?, @[ParameterName(name = \'p14\')] kotlin.Any?, @[ParameterName(name = \'p15\')] kotlin.Any?, @[ParameterName(name = \'p16\')] kotlin.Any?, @[ParameterName(name = \'p17\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, @[ParameterName(name = \'changed1\')] kotlin.Int, kotlin.Any?>");
        }
        Object object18 = ((Function20)TypeIntrinsics.beforeCheckcastToFunctionOfArity(object17, 20)).invoke(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, object16, composer1, v, ((int)(v1 | v2)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new Function2(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, object16, v, v1) {
                final int $changed;
                final int $changed1;
                final Object $p1;
                final Object $p10;
                final Object $p11;
                final Object $p12;
                final Object $p13;
                final Object $p14;
                final Object $p15;
                final Object $p16;
                final Object $p17;
                final Object $p2;
                final Object $p3;
                final Object $p4;
                final Object $p5;
                final Object $p6;
                final Object $p7;
                final Object $p8;
                final Object $p9;

                {
                    ComposableLambdaImpl.this = composableLambdaImpl0;
                    this.$p1 = object0;
                    this.$p2 = object1;
                    this.$p3 = object2;
                    this.$p4 = object3;
                    this.$p5 = object4;
                    this.$p6 = object5;
                    this.$p7 = object6;
                    this.$p8 = object7;
                    this.$p9 = object8;
                    this.$p10 = object9;
                    this.$p11 = object10;
                    this.$p12 = object11;
                    this.$p13 = object12;
                    this.$p14 = object13;
                    this.$p15 = object14;
                    this.$p16 = object15;
                    this.$p17 = object16;
                    this.$changed = v;
                    this.$changed1 = v1;
                    super(2);
                }

                @Override  // kotlin.jvm.functions.Function2
                public Object invoke(Object object0, Object object1) {
                    this.invoke(((Composer)object0), ((Number)object1).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer0, int v) {
                    Intrinsics.checkNotNullParameter(composer0, "nc");
                    ComposableLambdaImpl.this.invoke(this.$p1, this.$p2, this.$p3, this.$p4, this.$p5, this.$p6, this.$p7, this.$p8, this.$p9, this.$p10, this.$p11, this.$p12, this.$p13, this.$p14, this.$p15, this.$p16, this.$p17, composer0, this.$changed | 1, this.$changed1);
                }
            });
        }
        return object18;
    }

    @Override  // kotlin.jvm.functions.Function18
    public Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16, Object object17) {
        return this.invoke(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, ((Composer)object15), ((Number)object16).intValue(), ((Number)object17).intValue());
    }

    public Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16, Object object17, Composer composer0, int v, int v1) {
        Intrinsics.checkNotNullParameter(composer0, "c");
        Composer composer1 = composer0.startRestartGroup(this.key);
        this.trackRead(composer1);
        int v2 = composer1.changed(this) ? ComposableLambdaKt.differentBits(18) : ComposableLambdaKt.sameBits(18);
        Object object18 = this._block;
        if(object18 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Function21<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'p3\')] kotlin.Any?, @[ParameterName(name = \'p4\')] kotlin.Any?, @[ParameterName(name = \'p5\')] kotlin.Any?, @[ParameterName(name = \'p6\')] kotlin.Any?, @[ParameterName(name = \'p7\')] kotlin.Any?, @[ParameterName(name = \'p8\')] kotlin.Any?, @[ParameterName(name = \'p9\')] kotlin.Any?, @[ParameterName(name = \'p10\')] kotlin.Any?, @[ParameterName(name = \'p11\')] kotlin.Any?, @[ParameterName(name = \'p12\')] kotlin.Any?, @[ParameterName(name = \'p13\')] kotlin.Any?, @[ParameterName(name = \'p14\')] kotlin.Any?, @[ParameterName(name = \'p15\')] kotlin.Any?, @[ParameterName(name = \'p16\')] kotlin.Any?, @[ParameterName(name = \'p17\')] kotlin.Any?, @[ParameterName(name = \'p18\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, @[ParameterName(name = \'changed1\')] kotlin.Int, kotlin.Any?>");
        }
        Object object19 = ((Function21)TypeIntrinsics.beforeCheckcastToFunctionOfArity(object18, 21)).invoke(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, object16, object17, composer1, v, ((int)(v1 | v2)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new Function2(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, object16, object17, v, v1) {
                final int $changed;
                final int $changed1;
                final Object $p1;
                final Object $p10;
                final Object $p11;
                final Object $p12;
                final Object $p13;
                final Object $p14;
                final Object $p15;
                final Object $p16;
                final Object $p17;
                final Object $p18;
                final Object $p2;
                final Object $p3;
                final Object $p4;
                final Object $p5;
                final Object $p6;
                final Object $p7;
                final Object $p8;
                final Object $p9;

                {
                    ComposableLambdaImpl.this = composableLambdaImpl0;
                    this.$p1 = object0;
                    this.$p2 = object1;
                    this.$p3 = object2;
                    this.$p4 = object3;
                    this.$p5 = object4;
                    this.$p6 = object5;
                    this.$p7 = object6;
                    this.$p8 = object7;
                    this.$p9 = object8;
                    this.$p10 = object9;
                    this.$p11 = object10;
                    this.$p12 = object11;
                    this.$p13 = object12;
                    this.$p14 = object13;
                    this.$p15 = object14;
                    this.$p16 = object15;
                    this.$p17 = object16;
                    this.$p18 = object17;
                    this.$changed = v;
                    this.$changed1 = v1;
                    super(2);
                }

                @Override  // kotlin.jvm.functions.Function2
                public Object invoke(Object object0, Object object1) {
                    this.invoke(((Composer)object0), ((Number)object1).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer0, int v) {
                    Intrinsics.checkNotNullParameter(composer0, "nc");
                    ComposableLambdaImpl.this.invoke(this.$p1, this.$p2, this.$p3, this.$p4, this.$p5, this.$p6, this.$p7, this.$p8, this.$p9, this.$p10, this.$p11, this.$p12, this.$p13, this.$p14, this.$p15, this.$p16, this.$p17, this.$p18, composer0, this.$changed | 1, this.$changed1);
                }
            });
        }
        return object19;
    }

    @Override  // kotlin.jvm.functions.Function19
    public Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16, Object object17, Object object18) {
        return this.invoke(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, ((Composer)object16), ((Number)object17).intValue(), ((Number)object18).intValue());
    }

    @Override  // kotlin.jvm.functions.Function20
    public Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16, Object object17, Object object18, Object object19) {
        return this.invoke(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, object16, ((Composer)object17), ((Number)object18).intValue(), ((Number)object19).intValue());
    }

    @Override  // kotlin.jvm.functions.Function21
    public Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16, Object object17, Object object18, Object object19, Object object20) {
        return this.invoke(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, object16, object17, ((Composer)object18), ((Number)object19).intValue(), ((Number)object20).intValue());
    }

    private final void trackRead(Composer composer0) {
        if(this.tracked) {
            RecomposeScope recomposeScope0 = composer0.getRecomposeScope();
            if(recomposeScope0 != null) {
                composer0.recordUsed(recomposeScope0);
                if(ComposableLambdaKt.replacableWith(this.scope, recomposeScope0)) {
                    this.scope = recomposeScope0;
                    return;
                }
                List list0 = this.scopes;
                if(list0 == null) {
                    List list1 = new ArrayList();
                    this.scopes = list1;
                    list1.add(recomposeScope0);
                    return;
                }
                int v = list0.size();
                if(v > 0) {
                    for(int v1 = 0; true; ++v1) {
                        if(ComposableLambdaKt.replacableWith(((RecomposeScope)list0.get(v1)), recomposeScope0)) {
                            list0.set(v1, recomposeScope0);
                            return;
                        }
                        if(v1 + 1 >= v) {
                            break;
                        }
                    }
                }
                list0.add(recomposeScope0);
            }
        }
    }

    private final void trackWrite() {
        if(this.tracked) {
            RecomposeScope recomposeScope0 = this.scope;
            if(recomposeScope0 != null) {
                recomposeScope0.invalidate();
                this.scope = null;
            }
            List list0 = this.scopes;
            if(list0 != null) {
                int v = list0.size();
                if(v > 0) {
                    for(int v1 = 0; true; ++v1) {
                        ((RecomposeScope)list0.get(v1)).invalidate();
                        if(v1 + 1 >= v) {
                            break;
                        }
                    }
                }
                list0.clear();
            }
        }
    }

    public final void update(Object object0) {
        Intrinsics.checkNotNullParameter(object0, "block");
        if(!Intrinsics.areEqual(this._block, object0)) {
            boolean z = this._block == null;
            this._block = object0;
            if(!z) {
                this.trackWrite();
            }
        }
    }
}

