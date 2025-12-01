package androidx.compose.runtime.tooling;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001C\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000E\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u001A\u0010\u0002\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001A\u00020\u0004X¦\u0004¢\u0006\u0006\u001A\u0004\b\b\u0010\tR\u0014\u0010\n\u001A\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001A\u0004\b\u000B\u0010\tR\u0014\u0010\f\u001A\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001A\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"Landroidx/compose/runtime/tooling/CompositionGroup;", "Landroidx/compose/runtime/tooling/CompositionData;", "data", "", "", "getData", "()Ljava/lang/Iterable;", "key", "getKey", "()Ljava/lang/Object;", "node", "getNode", "sourceInfo", "", "getSourceInfo", "()Ljava/lang/String;", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface CompositionGroup extends CompositionData {
    Iterable getData();

    Object getKey();

    Object getNode();

    String getSourceInfo();
}

