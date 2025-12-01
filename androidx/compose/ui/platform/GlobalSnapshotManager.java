package androidx.compose.ui.platform;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ReceiveChannel;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001A\u00020\u0006R\u000E\u0010\u0003\u001A\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/GlobalSnapshotManager;", "", "()V", "started", "Ljava/util/concurrent/atomic/AtomicBoolean;", "ensureStarted", "", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class GlobalSnapshotManager {
    public static final GlobalSnapshotManager INSTANCE;
    private static final AtomicBoolean started;

    static {
        GlobalSnapshotManager.INSTANCE = new GlobalSnapshotManager();
        GlobalSnapshotManager.started = new AtomicBoolean(false);
    }

    public final void ensureStarted() {
        if(GlobalSnapshotManager.started.compareAndSet(false, true)) {
            Channel channel0 = ChannelKt.Channel$default(-1, null, null, 6, null);
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(AndroidUiDispatcher.Companion.getMain()), null, null, new Function2(null) {
                final Channel $channel;
                Object L$0;
                Object L$1;
                int label;

                {
                    this.$channel = channel0;
                    super(2, continuation0);
                }

                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object object0, Continuation continuation0) {
                    return new androidx.compose.ui.platform.GlobalSnapshotManager.ensureStarted.1(this.$channel, continuation0);
                }

                @Override  // kotlin.jvm.functions.Function2
                public Object invoke(Object object0, Object object1) {
                    return this.invoke(((CoroutineScope)object0), ((Continuation)object1));
                }

                public final Object invoke(CoroutineScope coroutineScope0, Continuation continuation0) {
                    return ((androidx.compose.ui.platform.GlobalSnapshotManager.ensureStarted.1)this.create(coroutineScope0, continuation0)).invokeSuspend(Unit.INSTANCE);
                }

                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object object0) {
                    Object object2;
                    androidx.compose.ui.platform.GlobalSnapshotManager.ensureStarted.1 globalSnapshotManager$ensureStarted$11;
                    ChannelIterator channelIterator2;
                    ReceiveChannel receiveChannel1;
                    androidx.compose.ui.platform.GlobalSnapshotManager.ensureStarted.1 globalSnapshotManager$ensureStarted$10;
                    ChannelIterator channelIterator0;
                    ReceiveChannel receiveChannel0;
                    Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch(this.label) {
                        case 0: {
                            ResultKt.throwOnFailure(object0);
                            receiveChannel0 = this.$channel;
                            channelIterator0 = receiveChannel0.iterator();
                            globalSnapshotManager$ensureStarted$10 = this;
                            goto label_24;
                        }
                        case 1: {
                            ChannelIterator channelIterator1 = (ChannelIterator)this.L$1;
                            receiveChannel0 = (ReceiveChannel)this.L$0;
                            ResultKt.throwOnFailure(object0);
                            receiveChannel1 = receiveChannel0;
                            channelIterator2 = channelIterator1;
                            globalSnapshotManager$ensureStarted$11 = this;
                            break;
                        }
                        default: {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                    }
                    while(true) {
                        try {
                            if(!((Boolean)object0).booleanValue()) {
                                break;
                            }
                            Unit unit0 = (Unit)channelIterator2.next();
                            Snapshot.Companion.sendApplyNotifications();
                            globalSnapshotManager$ensureStarted$10 = globalSnapshotManager$ensureStarted$11;
                            channelIterator0 = channelIterator2;
                            receiveChannel0 = receiveChannel1;
                        }
                        catch(Throwable throwable0) {
                            receiveChannel0 = receiveChannel1;
                            throw throwable0;
                        }
                        try {
                        label_24:
                            globalSnapshotManager$ensureStarted$10.L$0 = receiveChannel0;
                            globalSnapshotManager$ensureStarted$10.L$1 = channelIterator0;
                            globalSnapshotManager$ensureStarted$10.label = 1;
                            object2 = channelIterator0.hasNext(globalSnapshotManager$ensureStarted$10);
                            goto label_34;
                        }
                        catch(Throwable throwable0) {
                        }
                        try {
                            throw throwable0;
                        }
                        catch(Throwable throwable1) {
                            ChannelsKt.cancelConsumed(receiveChannel0, throwable0);
                            throw throwable1;
                        }
                    label_34:
                        if(object2 == object1) {
                            return object1;
                        }
                        globalSnapshotManager$ensureStarted$11 = globalSnapshotManager$ensureStarted$10;
                        object0 = object2;
                        receiveChannel1 = receiveChannel0;
                        channelIterator2 = channelIterator0;
                    }
                    ChannelsKt.cancelConsumed(receiveChannel1, null);
                    return Unit.INSTANCE;
                }
            }, 3, null);
            Function1 function10 = new Function1() {
                final Channel $channel;

                {
                    this.$channel = channel0;
                    super(1);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.invoke(object0);
                    return Unit.INSTANCE;
                }

                public final void invoke(Object object0) {
                    Intrinsics.checkNotNullParameter(object0, "it");
                    this.$channel.trySend-JP2dKIU(Unit.INSTANCE);
                }
            };
            Snapshot.Companion.registerGlobalWriteObserver(function10);
        }
    }
}

