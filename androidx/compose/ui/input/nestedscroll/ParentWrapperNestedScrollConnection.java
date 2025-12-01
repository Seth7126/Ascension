package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0001\u0012\u0006\u0010\u0003\u001A\u00020\u0001¢\u0006\u0002\u0010\u0004J)\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000E\u001A\u00020\fH\u0096@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000F\u0010\u0010J-\u0010\u0011\u001A\u00020\u00122\u0006\u0010\r\u001A\u00020\u00122\u0006\u0010\u000E\u001A\u00020\u00122\u0006\u0010\u0013\u001A\u00020\u0014H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001A\u00020\f2\u0006\u0010\u000E\u001A\u00020\fH\u0096@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001A\u001A\u00020\u00122\u0006\u0010\u000E\u001A\u00020\u00122\u0006\u0010\u0013\u001A\u00020\u0014H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001B\u0010\u001CR\u001A\u0010\u0002\u001A\u00020\u0001X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001A\u0010\u0003\u001A\u00020\u0001X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\t\u0010\u0006\"\u0004\b\n\u0010\b\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\u001D"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/ParentWrapperNestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "parent", "self", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;)V", "getParent", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "setParent", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;)V", "getSelf", "setSelf", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreFling", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
final class ParentWrapperNestedScrollConnection implements NestedScrollConnection {
    private NestedScrollConnection parent;
    private NestedScrollConnection self;

    public ParentWrapperNestedScrollConnection(NestedScrollConnection nestedScrollConnection0, NestedScrollConnection nestedScrollConnection1) {
        Intrinsics.checkNotNullParameter(nestedScrollConnection0, "parent");
        Intrinsics.checkNotNullParameter(nestedScrollConnection1, "self");
        super();
        this.parent = nestedScrollConnection0;
        this.self = nestedScrollConnection1;
    }

    public final NestedScrollConnection getParent() {
        return this.parent;
    }

    public final NestedScrollConnection getSelf() {
        return this.self;
    }

    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public Object onPostFling-RZ2iAVY(long v, long v1, Continuation continuation0) {
        ParentWrapperNestedScrollConnection parentWrapperNestedScrollConnection0;
        long v4;
        long v3;
        androidx.compose.ui.input.nestedscroll.ParentWrapperNestedScrollConnection.onPostFling.1 parentWrapperNestedScrollConnection$onPostFling$10;
        if(continuation0 instanceof androidx.compose.ui.input.nestedscroll.ParentWrapperNestedScrollConnection.onPostFling.1) {
            parentWrapperNestedScrollConnection$onPostFling$10 = (androidx.compose.ui.input.nestedscroll.ParentWrapperNestedScrollConnection.onPostFling.1)continuation0;
            if((parentWrapperNestedScrollConnection$onPostFling$10.label & 0x80000000) == 0) {
                parentWrapperNestedScrollConnection$onPostFling$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                    long J$0;
                    long J$1;
                    Object L$0;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return continuation0.onPostFling-RZ2iAVY(0L, 0L, this);
                    }
                };
            }
            else {
                parentWrapperNestedScrollConnection$onPostFling$10.label ^= 0x80000000;
            }
        }
        else {
            parentWrapperNestedScrollConnection$onPostFling$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                long J$0;
                long J$1;
                Object L$0;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return continuation0.onPostFling-RZ2iAVY(0L, 0L, this);
                }
            };
        }
        Object object0 = parentWrapperNestedScrollConnection$onPostFling$10.result;
        Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(parentWrapperNestedScrollConnection$onPostFling$10.label) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                parentWrapperNestedScrollConnection$onPostFling$10.L$0 = this;
                v3 = v;
                parentWrapperNestedScrollConnection$onPostFling$10.J$0 = v3;
                v4 = v1;
                parentWrapperNestedScrollConnection$onPostFling$10.J$1 = v4;
                parentWrapperNestedScrollConnection$onPostFling$10.label = 1;
                object0 = this.getSelf().onPostFling-RZ2iAVY(v, v1, parentWrapperNestedScrollConnection$onPostFling$10);
                if(object0 == object1) {
                    return object1;
                }
                parentWrapperNestedScrollConnection0 = this;
                break;
            }
            case 1: {
                long v5 = parentWrapperNestedScrollConnection$onPostFling$10.J$1;
                long v6 = parentWrapperNestedScrollConnection$onPostFling$10.J$0;
                parentWrapperNestedScrollConnection0 = (ParentWrapperNestedScrollConnection)parentWrapperNestedScrollConnection$onPostFling$10.L$0;
                ResultKt.throwOnFailure(object0);
                v4 = v5;
                v3 = v6;
                break;
            }
            case 2: {
                long v2 = parentWrapperNestedScrollConnection$onPostFling$10.J$0;
                ResultKt.throwOnFailure(object0);
                return Velocity.box-impl(Velocity.plus-AH228Gc(v2, ((Velocity)object0).unbox-impl()));
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        long v7 = ((Velocity)object0).unbox-impl();
        long v8 = Velocity.plus-AH228Gc(v3, v7);
        long v9 = Velocity.minus-AH228Gc(v4, v7);
        parentWrapperNestedScrollConnection$onPostFling$10.L$0 = null;
        parentWrapperNestedScrollConnection$onPostFling$10.J$0 = v7;
        parentWrapperNestedScrollConnection$onPostFling$10.label = 2;
        object0 = parentWrapperNestedScrollConnection0.getParent().onPostFling-RZ2iAVY(v8, v9, parentWrapperNestedScrollConnection$onPostFling$10);
        return object0 == object1 ? object1 : Velocity.box-impl(Velocity.plus-AH228Gc(v7, ((Velocity)object0).unbox-impl()));
    }

    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public long onPostScroll-DzOQY0M(long v, long v1, int v2) {
        long v3 = this.self.onPostScroll-DzOQY0M(v, v1, v2);
        return Offset.plus-MK-Hz9U(v3, this.parent.onPostScroll-DzOQY0M(Offset.plus-MK-Hz9U(v, v3), Offset.minus-MK-Hz9U(v1, v3), v2));
    }

    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public Object onPreFling-QWom1Mo(long v, Continuation continuation0) {
        ParentWrapperNestedScrollConnection parentWrapperNestedScrollConnection0;
        androidx.compose.ui.input.nestedscroll.ParentWrapperNestedScrollConnection.onPreFling.1 parentWrapperNestedScrollConnection$onPreFling$10;
        if(continuation0 instanceof androidx.compose.ui.input.nestedscroll.ParentWrapperNestedScrollConnection.onPreFling.1) {
            parentWrapperNestedScrollConnection$onPreFling$10 = (androidx.compose.ui.input.nestedscroll.ParentWrapperNestedScrollConnection.onPreFling.1)continuation0;
            if((parentWrapperNestedScrollConnection$onPreFling$10.label & 0x80000000) == 0) {
                parentWrapperNestedScrollConnection$onPreFling$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                    long J$0;
                    Object L$0;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return continuation0.onPreFling-QWom1Mo(0L, this);
                    }
                };
            }
            else {
                parentWrapperNestedScrollConnection$onPreFling$10.label ^= 0x80000000;
            }
        }
        else {
            parentWrapperNestedScrollConnection$onPreFling$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                long J$0;
                Object L$0;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return continuation0.onPreFling-QWom1Mo(0L, this);
                }
            };
        }
        Object object0 = parentWrapperNestedScrollConnection$onPreFling$10.result;
        Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(parentWrapperNestedScrollConnection$onPreFling$10.label) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                parentWrapperNestedScrollConnection$onPreFling$10.L$0 = this;
                parentWrapperNestedScrollConnection$onPreFling$10.J$0 = v;
                parentWrapperNestedScrollConnection$onPreFling$10.label = 1;
                object0 = this.getParent().onPreFling-QWom1Mo(v, parentWrapperNestedScrollConnection$onPreFling$10);
                if(object0 == object1) {
                    return object1;
                }
                parentWrapperNestedScrollConnection0 = this;
                break;
            }
            case 1: {
                v = parentWrapperNestedScrollConnection$onPreFling$10.J$0;
                parentWrapperNestedScrollConnection0 = (ParentWrapperNestedScrollConnection)parentWrapperNestedScrollConnection$onPreFling$10.L$0;
                ResultKt.throwOnFailure(object0);
                break;
            }
            case 2: {
                long v1 = parentWrapperNestedScrollConnection$onPreFling$10.J$0;
                ResultKt.throwOnFailure(object0);
                return Velocity.box-impl(Velocity.plus-AH228Gc(v1, ((Velocity)object0).unbox-impl()));
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        long v2 = ((Velocity)object0).unbox-impl();
        long v3 = Velocity.minus-AH228Gc(v, v2);
        parentWrapperNestedScrollConnection$onPreFling$10.L$0 = null;
        parentWrapperNestedScrollConnection$onPreFling$10.J$0 = v2;
        parentWrapperNestedScrollConnection$onPreFling$10.label = 2;
        object0 = parentWrapperNestedScrollConnection0.getSelf().onPreFling-QWom1Mo(v3, parentWrapperNestedScrollConnection$onPreFling$10);
        return object0 == object1 ? object1 : Velocity.box-impl(Velocity.plus-AH228Gc(v2, ((Velocity)object0).unbox-impl()));
    }

    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public long onPreScroll-OzD1aCk(long v, int v1) {
        long v2 = this.parent.onPreScroll-OzD1aCk(v, v1);
        return Offset.plus-MK-Hz9U(v2, this.self.onPreScroll-OzD1aCk(Offset.minus-MK-Hz9U(v, v2), v1));
    }

    public final void setParent(NestedScrollConnection nestedScrollConnection0) {
        Intrinsics.checkNotNullParameter(nestedScrollConnection0, "<set-?>");
        this.parent = nestedScrollConnection0;
    }

    public final void setSelf(NestedScrollConnection nestedScrollConnection0) {
        Intrinsics.checkNotNullParameter(nestedScrollConnection0, "<set-?>");
        this.self = nestedScrollConnection0;
    }
}

