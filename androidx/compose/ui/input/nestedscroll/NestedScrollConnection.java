package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J)\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u0003H\u0096@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\b\u001A\u00020\t2\u0006\u0010\u0004\u001A\u00020\t2\u0006\u0010\u0005\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000BH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000E\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u0003H\u0096@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000F\u0010\u0010J%\u0010\u0011\u001A\u00020\t2\u0006\u0010\u0005\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000BH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreFling", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface NestedScrollConnection {
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public static final class DefaultImpls {
        // 去混淆评级： 低(20)
        public static Object onPostFling-RZ2iAVY(NestedScrollConnection nestedScrollConnection0, long v, long v1, Continuation continuation0) {
            return Velocity.box-impl(0L);
        }

        public static long onPostScroll-DzOQY0M(NestedScrollConnection nestedScrollConnection0, long v, long v1, int v2) {
            Intrinsics.checkNotNullParameter(nestedScrollConnection0, "this");
            return 0L;
        }

        // 去混淆评级： 低(20)
        public static Object onPreFling-QWom1Mo(NestedScrollConnection nestedScrollConnection0, long v, Continuation continuation0) {
            return Velocity.box-impl(0L);
        }

        public static long onPreScroll-OzD1aCk(NestedScrollConnection nestedScrollConnection0, long v, int v1) {
            Intrinsics.checkNotNullParameter(nestedScrollConnection0, "this");
            return 0L;
        }
    }

    Object onPostFling-RZ2iAVY(long arg1, long arg2, Continuation arg3);

    long onPostScroll-DzOQY0M(long arg1, long arg2, int arg3);

    Object onPreFling-QWom1Mo(long arg1, Continuation arg2);

    long onPreScroll-OzD1aCk(long arg1, int arg2);
}

