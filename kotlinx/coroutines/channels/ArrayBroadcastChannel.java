package kotlinx.coroutines.channels;

import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import jeb.synthetic.FIN;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.internal.ConcurrentKt;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.selects.SelectKt;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000K2\b\u0012\u0004\u0012\u00028\u00000L:\u0001IB\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001A\u00020\b2\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006H\u0017\u00A2\u0006\u0004\b\t\u0010\nJ\u001F\u0010\t\u001A\u00020\r2\u000E\u0010\u0007\u001A\n\u0018\u00010\u000Bj\u0004\u0018\u0001`\fH\u0016\u00A2\u0006\u0004\b\t\u0010\u000EJ\u0019\u0010\u000F\u001A\u00020\b2\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006H\u0002\u00A2\u0006\u0004\b\u000F\u0010\nJ\u000F\u0010\u0010\u001A\u00020\rH\u0002\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001A\u00020\b2\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006H\u0016\u00A2\u0006\u0004\b\u0012\u0010\nJ\u000F\u0010\u0014\u001A\u00020\u0013H\u0002\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001A\u00028\u00002\u0006\u0010\u0016\u001A\u00020\u0013H\u0002\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001B\u001A\u00020\u001A2\u0006\u0010\u0019\u001A\u00028\u0000H\u0014\u00A2\u0006\u0004\b\u001B\u0010\u001CJ#\u0010\u001F\u001A\u00020\u001A2\u0006\u0010\u0019\u001A\u00028\u00002\n\u0010\u001E\u001A\u0006\u0012\u0002\b\u00030\u001DH\u0014\u00A2\u0006\u0004\b\u001F\u0010 J\u0015\u0010\"\u001A\b\u0012\u0004\u0012\u00028\u00000!H\u0016\u00A2\u0006\u0004\b\"\u0010#J4\u0010\'\u001A\u00020\r2\u0010\b\u0002\u0010%\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010$2\u0010\b\u0002\u0010&\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010$H\u0082\u0010\u00A2\u0006\u0004\b\'\u0010(R\u001E\u0010*\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u001A0)8\u0002@\u0002X\u0082\u0004\u00A2\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010/\u001A\u00020,8T@\u0014X\u0094\u0004\u00A2\u0006\u0006\u001A\u0004\b-\u0010.R\u001A\u00102\u001A\u000600j\u0002`18\u0002@\u0002X\u0082\u0004\u00A2\u0006\u0006\n\u0004\b2\u00103R\u0019\u0010\u0003\u001A\u00020\u00028\u0006@\u0006\u00A2\u0006\f\n\u0004\b\u0003\u00104\u001A\u0004\b5\u00106R$\u0010;\u001A\u00020\u00132\u0006\u00107\u001A\u00020\u00138B@BX\u0082\u000E\u00A2\u0006\f\u001A\u0004\b8\u0010\u0015\"\u0004\b9\u0010:R\u0016\u0010<\u001A\u00020\b8T@\u0014X\u0094\u0004\u00A2\u0006\u0006\u001A\u0004\b<\u0010=R\u0016\u0010>\u001A\u00020\b8T@\u0014X\u0094\u0004\u00A2\u0006\u0006\u001A\u0004\b>\u0010=R$\u0010A\u001A\u00020\u00022\u0006\u00107\u001A\u00020\u00028B@BX\u0082\u000E\u00A2\u0006\f\u001A\u0004\b?\u00106\"\u0004\b@\u0010\u0005R2\u0010D\u001A\u001E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000$0Bj\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000$`C8\u0002@\u0002X\u0082\u0004\u00A2\u0006\u0006\n\u0004\bD\u0010ER$\u0010H\u001A\u00020\u00132\u0006\u00107\u001A\u00020\u00138B@BX\u0082\u000E\u00A2\u0006\f\u001A\u0004\bF\u0010\u0015\"\u0004\bG\u0010:\u00A8\u0006J"}, d2 = {"Lkotlinx/coroutines/channels/ArrayBroadcastChannel;", "E", "", "capacity", "<init>", "(I)V", "", "cause", "", "cancel", "(Ljava/lang/Throwable;)Z", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "", "(Ljava/util/concurrent/CancellationException;)V", "cancelInternal", "checkSubOffers", "()V", "close", "", "computeMinHead", "()J", "index", "elementAt", "(J)Ljava/lang/Object;", "element", "", "offerInternal", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "offerSelectInternal", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "openSubscription", "()Lkotlinx/coroutines/channels/ReceiveChannel;", "Lkotlinx/coroutines/channels/ArrayBroadcastChannel$Subscriber;", "addSub", "removeSub", "updateHead", "(Lkotlinx/coroutines/channels/ArrayBroadcastChannel$Subscriber;Lkotlinx/coroutines/channels/ArrayBroadcastChannel$Subscriber;)V", "", "buffer", "[Ljava/lang/Object;", "", "getBufferDebugString", "()Ljava/lang/String;", "bufferDebugString", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "bufferLock", "Ljava/util/concurrent/locks/ReentrantLock;", "I", "getCapacity", "()I", "value", "getHead", "setHead", "(J)V", "head", "isBufferAlwaysFull", "()Z", "isBufferFull", "getSize", "setSize", "size", "", "Lkotlinx/coroutines/internal/SubscribersList;", "subscribers", "Ljava/util/List;", "getTail", "setTail", "tail", "Subscriber", "kotlinx-coroutines-core", "Lkotlinx/coroutines/channels/AbstractSendChannel;", "Lkotlinx/coroutines/channels/BroadcastChannel;"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class ArrayBroadcastChannel extends AbstractSendChannel implements BroadcastChannel {
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\'2\b\u0012\u0004\u0012\u00028\u00010(B\u0015\u0012\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000B\u001A\u00020\u00062\b\u0010\n\u001A\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\r\u001A\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\bJ\u0011\u0010\u000F\u001A\u0004\u0018\u00010\u000EH\u0002¢\u0006\u0004\b\u000F\u0010\u0010J\u0011\u0010\u0011\u001A\u0004\u0018\u00010\u000EH\u0014¢\u0006\u0004\b\u0011\u0010\u0010J\u001D\u0010\u0014\u001A\u0004\u0018\u00010\u000E2\n\u0010\u0013\u001A\u0006\u0012\u0002\b\u00030\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u001C\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00010\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0016\u0010\u0017\u001A\u00020\u00068T@\u0014X\u0094\u0004¢\u0006\u0006\u001A\u0004\b\u0017\u0010\bR\u0016\u0010\u0018\u001A\u00020\u00068T@\u0014X\u0094\u0004¢\u0006\u0006\u001A\u0004\b\u0018\u0010\bR\u0016\u0010\u0019\u001A\u00020\u00068T@\u0014X\u0094\u0004¢\u0006\u0006\u001A\u0004\b\u0019\u0010\bR\u0016\u0010\u001A\u001A\u00020\u00068T@\u0014X\u0094\u0004¢\u0006\u0006\u001A\u0004\b\u001A\u0010\bR$\u0010!\u001A\u00020\u001B2\u0006\u0010\u001C\u001A\u00020\u001B8F@FX\u0086\u000E¢\u0006\f\u001A\u0004\b\u001D\u0010\u001E\"\u0004\b\u001F\u0010 R\u001A\u0010$\u001A\u00060\"j\u0002`#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lkotlinx/coroutines/channels/ArrayBroadcastChannel$Subscriber;", "E", "Lkotlinx/coroutines/channels/ArrayBroadcastChannel;", "broadcastChannel", "<init>", "(Lkotlinx/coroutines/channels/ArrayBroadcastChannel;)V", "", "checkOffer", "()Z", "", "cause", "close", "(Ljava/lang/Throwable;)Z", "needsToCheckOfferWithoutLock", "", "peekUnderLock", "()Ljava/lang/Object;", "pollInternal", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "pollSelectInternal", "(Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ArrayBroadcastChannel;", "isBufferAlwaysEmpty", "isBufferAlwaysFull", "isBufferEmpty", "isBufferFull", "", "value", "getSubHead", "()J", "setSubHead", "(J)V", "subHead", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "subLock", "Ljava/util/concurrent/locks/ReentrantLock;", "kotlinx-coroutines-core", "Lkotlinx/coroutines/channels/AbstractChannel;", "Lkotlinx/coroutines/channels/ReceiveChannel;"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    static final class Subscriber extends AbstractChannel implements ReceiveChannel {
        private volatile long _subHead;
        private final ArrayBroadcastChannel broadcastChannel;
        private final ReentrantLock subLock;

        public Subscriber(ArrayBroadcastChannel arrayBroadcastChannel0) {
            super(null);
            this.broadcastChannel = arrayBroadcastChannel0;
            this.subLock = new ReentrantLock();
            this._subHead = 0L;
        }

        public final boolean checkOffer() {
            Closed closed0;
            boolean z = false;
            while(true) {
                closed0 = null;
                if(!this.needsToCheckOfferWithoutLock() || !this.subLock.tryLock()) {
                    break;
                }
                try {
                    Object object0 = this.peekUnderLock();
                    if(object0 != AbstractChannelKt.POLL_FAILED) {
                        if(object0 instanceof Closed) {
                            closed0 = (Closed)object0;
                            break;
                        }
                        else {
                            ReceiveOrClosed receiveOrClosed0 = this.takeFirstReceiveOrPeekClosed();
                            if(receiveOrClosed0 == null || receiveOrClosed0 instanceof Closed) {
                                break;
                            }
                            else if(receiveOrClosed0.tryResumeReceive(object0, null) != null) {
                                this.setSubHead(this.getSubHead() + 1L);
                                receiveOrClosed0.completeResumeReceive(object0);
                                z = true;
                                continue;
                            }
                        }
                    }
                }
                finally {
                    this.subLock.unlock();
                }
            }
            if(closed0 != null) {
                this.close(closed0.closeCause);
            }
            return z;
        }

        @Override  // kotlinx.coroutines.channels.AbstractSendChannel, kotlinx.coroutines.channels.SendChannel
        public boolean close(Throwable throwable0) {
            if(super.close(throwable0)) {
                ArrayBroadcastChannel.updateHead$default(this.broadcastChannel, null, this, 1, null);
                this.subLock.lock();
                try {
                    this.setSubHead(this.broadcastChannel.getTail());
                    return true;
                }
                finally {
                    this.subLock.unlock();
                }
            }
            return false;
        }

        public final long getSubHead() {
            return this._subHead;
        }

        @Override  // kotlinx.coroutines.channels.AbstractChannel
        protected boolean isBufferAlwaysEmpty() {
            return false;
        }

        // 去混淆评级： 低(20)
        @Override  // kotlinx.coroutines.channels.AbstractSendChannel
        protected boolean isBufferAlwaysFull() {
            throw new IllegalStateException("Should not be used");
        }

        @Override  // kotlinx.coroutines.channels.AbstractChannel
        protected boolean isBufferEmpty() {
            return this.getSubHead() >= this.broadcastChannel.getTail();
        }

        // 去混淆评级： 低(20)
        @Override  // kotlinx.coroutines.channels.AbstractSendChannel
        protected boolean isBufferFull() {
            throw new IllegalStateException("Should not be used");
        }

        private final boolean needsToCheckOfferWithoutLock() {
            return this.getClosedForReceive() == null ? !this.isBufferEmpty() || this.broadcastChannel.getClosedForReceive() != null : false;
        }

        private final Object peekUnderLock() {
            long v = this.getSubHead();
            Closed closed0 = this.broadcastChannel.getClosedForReceive();
            if(v >= this.broadcastChannel.getTail()) {
                if(closed0 == null) {
                    closed0 = this.getClosedForReceive();
                    if(closed0 == null) {
                        return AbstractChannelKt.POLL_FAILED;
                    }
                }
                return closed0;
            }
            Object object0 = this.broadcastChannel.elementAt(v);
            Closed closed1 = this.getClosedForReceive();
            return closed1 != null ? closed1 : object0;
        }

        @Override  // kotlinx.coroutines.channels.AbstractChannel
        protected Object pollInternal() {
            int v1;
            Object object0;
            int v2;
            Lock lock0 = this.subLock;
            lock0.lock();
            try {
                object0 = this.peekUnderLock();
                v1 = 1;
                if(!(object0 instanceof Closed) && object0 != AbstractChannelKt.POLL_FAILED) {
                    this.setSubHead(this.getSubHead() + 1L);
                    v2 = 1;
                }
                else {
                    v2 = 0;
                }
            }
            finally {
                lock0.unlock();
            }
            Closed closed0 = object0 instanceof Closed ? ((Closed)object0) : null;
            if(closed0 != null) {
                this.close(closed0.closeCause);
            }
            if(!this.checkOffer()) {
                v1 = v2;
            }
            if(v1 != 0) {
                ArrayBroadcastChannel.updateHead$default(this.broadcastChannel, null, null, 3, null);
            }
            return object0;
        }

        @Override  // kotlinx.coroutines.channels.AbstractChannel
        protected Object pollSelectInternal(SelectInstance selectInstance0) {
            int v2;
            int v1;
            Object object0;
            Lock lock0 = this.subLock;
            lock0.lock();
            try {
                object0 = this.peekUnderLock();
                v1 = 1;
                v2 = 0;
                if(!(object0 instanceof Closed) && object0 != AbstractChannelKt.POLL_FAILED) {
                    if(selectInstance0.trySelect()) {
                        this.setSubHead(this.getSubHead() + 1L);
                        v2 = 1;
                    }
                    else {
                        object0 = SelectKt.getALREADY_SELECTED();
                    }
                }
            }
            finally {
                lock0.unlock();
            }
            Closed closed0 = object0 instanceof Closed ? ((Closed)object0) : null;
            if(closed0 != null) {
                this.close(closed0.closeCause);
            }
            if(!this.checkOffer()) {
                v1 = v2;
            }
            if(v1 != 0) {
                ArrayBroadcastChannel.updateHead$default(this.broadcastChannel, null, null, 3, null);
            }
            return object0;
        }

        public final void setSubHead(long v) {
            this._subHead = v;
        }
    }

    private volatile long _head;
    private volatile int _size;
    private volatile long _tail;
    private final Object[] buffer;
    private final ReentrantLock bufferLock;
    private final int capacity;
    private final List subscribers;

    public ArrayBroadcastChannel(int v) {
        super(null);
        this.capacity = v;
        if(v < 1) {
            throw new IllegalArgumentException(("ArrayBroadcastChannel capacity must be at least 1, but " + this.getCapacity() + " was specified").toString());
        }
        this.bufferLock = new ReentrantLock();
        this.buffer = new Object[v];
        this._head = 0L;
        this._tail = 0L;
        this._size = 0;
        this.subscribers = ConcurrentKt.subscriberList();
    }

    @Override  // kotlinx.coroutines.channels.BroadcastChannel
    public void cancel(CancellationException cancellationException0) {
        this.cancelInternal(cancellationException0);
    }

    @Override  // kotlinx.coroutines.channels.BroadcastChannel
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public boolean cancel(Throwable throwable0) {
        return this.cancelInternal(throwable0);
    }

    private final boolean cancelInternal(Throwable throwable0) {
        boolean z = this.close(throwable0);
        for(Object object0: this.subscribers) {
            ((Subscriber)object0).cancelInternal$kotlinx_coroutines_core(throwable0);
        }
        return z;
    }

    private final void checkSubOffers() {
        boolean z = false;
        boolean z1 = false;
        for(Object object0: this.subscribers) {
            if(((Subscriber)object0).checkOffer()) {
                z = true;
            }
            z1 = true;
        }
        if(z || !z1) {
            ArrayBroadcastChannel.updateHead$default(this, null, null, 3, null);
        }
    }

    @Override  // kotlinx.coroutines.channels.AbstractSendChannel, kotlinx.coroutines.channels.SendChannel
    public boolean close(Throwable throwable0) {
        if(!super.close(throwable0)) {
            return false;
        }
        this.checkSubOffers();
        return true;
    }

    private final long computeMinHead() {
        long v = 0x7FFFFFFFFFFFFFFFL;
        for(Object object0: this.subscribers) {
            v = RangesKt.coerceAtMost(v, ((Subscriber)object0).getSubHead());
        }
        return v;
    }

    private final Object elementAt(long v) {
        return this.buffer[((int)(v % ((long)this.capacity)))];
    }

    @Override  // kotlinx.coroutines.channels.AbstractSendChannel
    protected String getBufferDebugString() {
        return "(buffer:capacity=" + this.buffer.length + ",size=" + this.getSize() + ')';
    }

    public final int getCapacity() {
        return this.capacity;
    }

    private final long getHead() {
        return this._head;
    }

    private final int getSize() {
        return this._size;
    }

    private final long getTail() {
        return this._tail;
    }

    @Override  // kotlinx.coroutines.channels.AbstractSendChannel
    protected boolean isBufferAlwaysFull() {
        return false;
    }

    @Override  // kotlinx.coroutines.channels.AbstractSendChannel
    protected boolean isBufferFull() {
        return this.getSize() >= this.capacity;
    }

    @Override  // kotlinx.coroutines.channels.AbstractSendChannel
    protected Object offerInternal(Object object0) {
        Lock lock0 = this.bufferLock;
        lock0.lock();
        try {
            Closed closed0 = this.getClosedForSend();
            if(closed0 == null) {
                int v1 = this.getSize();
                if(v1 >= this.getCapacity()) {
                    return AbstractChannelKt.OFFER_FAILED;
                }
                long v2 = this.getTail();
                this.buffer[((int)(v2 % ((long)this.getCapacity())))] = object0;
                this.setSize(v1 + 1);
                this.setTail(v2 + 1L);
                this.checkSubOffers();
                return AbstractChannelKt.OFFER_SUCCESS;
            }
            return closed0;
        }
        finally {
            lock0.unlock();
        }
    }

    @Override  // kotlinx.coroutines.channels.AbstractSendChannel
    protected Object offerSelectInternal(Object object0, SelectInstance selectInstance0) {
        Lock lock0 = this.bufferLock;
        lock0.lock();
        try {
            Closed closed0 = this.getClosedForSend();
            if(closed0 == null) {
                int v1 = this.getSize();
                if(v1 >= this.getCapacity()) {
                    return AbstractChannelKt.OFFER_FAILED;
                }
                if(!selectInstance0.trySelect()) {
                    return SelectKt.getALREADY_SELECTED();
                }
                long v2 = this.getTail();
                this.buffer[((int)(v2 % ((long)this.getCapacity())))] = object0;
                this.setSize(v1 + 1);
                this.setTail(v2 + 1L);
                this.checkSubOffers();
                return AbstractChannelKt.OFFER_SUCCESS;
            }
            return closed0;
        }
        finally {
            lock0.unlock();
        }
    }

    @Override  // kotlinx.coroutines.channels.BroadcastChannel
    public ReceiveChannel openSubscription() {
        Subscriber arrayBroadcastChannel$Subscriber0 = new Subscriber(this);
        ArrayBroadcastChannel.updateHead$default(this, arrayBroadcastChannel$Subscriber0, null, 2, null);
        return arrayBroadcastChannel$Subscriber0;
    }

    private final void setHead(long v) {
        this._head = v;
    }

    private final void setSize(int v) {
        this._size = v;
    }

    private final void setTail(long v) {
        this._tail = v;
    }

    private final void updateHead(Subscriber arrayBroadcastChannel$Subscriber0, Subscriber arrayBroadcastChannel$Subscriber1) {
        int v;
        while(true) {
            Lock lock0 = this.bufferLock;
            lock0.lock();
            v = FIN.finallyOpen$NT();
            if(arrayBroadcastChannel$Subscriber0 != null) {
                arrayBroadcastChannel$Subscriber0.setSubHead(this.getTail());
                this.subscribers.add(arrayBroadcastChannel$Subscriber0);
                if(!this.subscribers.isEmpty()) {
                    FIN.finallyExec$NT(v);
                    return;
                }
            }
            if(arrayBroadcastChannel$Subscriber1 != null) {
                this.subscribers.remove(arrayBroadcastChannel$Subscriber1);
                if(this.getHead() != arrayBroadcastChannel$Subscriber1.getSubHead()) {
                    FIN.finallyExec$NT(v);
                    return;
                }
            }
            long v1 = this.getTail();
            long v2 = this.getHead();
            long v3 = RangesKt.coerceAtMost(this.computeMinHead(), v1);
            if(v3 <= v2) {
                FIN.finallyExec$NT(v);
                return;
            }
            int v4 = this.getSize();
        label_21:
            if(v2 >= v3) {
                goto label_45;
            }
            this.buffer[((int)(v2 % ((long)this.getCapacity())))] = null;
            boolean z = v4 >= this.getCapacity();
            ++v2;
            this.setHead(v2);
            --v4;
            this.setSize(v4);
            if(!z) {
                goto label_21;
            }
        label_29:
            Send send0 = this.takeFirstSendOrPeekClosed();
            if(send0 == null || send0 instanceof Closed) {
                goto label_44;
            }
            if(send0.tryResumeSend(null) == null) {
                break;
            }
            this.buffer[((int)(v1 % ((long)this.getCapacity())))] = send0.getPollResult();
            this.setSize(v4 + 1);
            this.setTail(v1 + 1L);
            FIN.finallyCodeBegin$NT(v);
            lock0.unlock();
            FIN.finallyCodeEnd$NT(v);
            send0.completeResumeSend();
            this.checkSubOffers();
            arrayBroadcastChannel$Subscriber0 = null;
            arrayBroadcastChannel$Subscriber1 = null;
        }
        goto label_29;
    label_44:
        goto label_21;
    label_45:
        FIN.finallyExec$NT(v);
    }

    static void updateHead$default(ArrayBroadcastChannel arrayBroadcastChannel0, Subscriber arrayBroadcastChannel$Subscriber0, Subscriber arrayBroadcastChannel$Subscriber1, int v, Object object0) {
        if((v & 1) != 0) {
            arrayBroadcastChannel$Subscriber0 = null;
        }
        if((v & 2) != 0) {
            arrayBroadcastChannel$Subscriber1 = null;
        }
        arrayBroadcastChannel0.updateHead(arrayBroadcastChannel$Subscriber0, arrayBroadcastChannel$Subscriber1);
    }
}

