package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J)\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u0003H\u0096@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\b\u001A\u00020\t2\u0006\u0010\u0004\u001A\u00020\t2\u0006\u0010\u0005\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000BH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000E\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u0003H\u0096@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000F\u0010\u0010J%\u0010\u0011\u001A\u00020\t2\u0006\u0010\u0005\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000BH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\u0014"}, d2 = {"androidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapperKt$NoOpConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreFling", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class NestedScrollDelegatingWrapperKt.NoOpConnection.1 implements NestedScrollConnection {
    // 去混淆评级： 低(20)
    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public Object onPostFling-RZ2iAVY(long v, long v1, Continuation continuation0) {
        return Velocity.box-impl(0L);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public long onPostScroll-DzOQY0M(long v, long v1, int v2) {
        return 0L;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public Object onPreFling-QWom1Mo(long v, Continuation continuation0) {
        return Velocity.box-impl(0L);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public long onPreScroll-OzD1aCk(long v, int v1) {
        return 0L;
    }
}

