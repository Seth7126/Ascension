package kotlinx.coroutines.channels;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001A\u001C\u0010\u0000\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001A\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"BroadcastChannel", "Lkotlinx/coroutines/channels/BroadcastChannel;", "E", "capacity", "", "kotlinx-coroutines-core"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class BroadcastChannelKt {
    public static final BroadcastChannel BroadcastChannel(int v) {
        if(v != -2) {
            switch(v) {
                case -1: {
                    return new ConflatedBroadcastChannel();
                }
                case 0: {
                    throw new IllegalArgumentException("Unsupported 0 capacity for BroadcastChannel");
                }
                default: {
                    if(v == 0x7FFFFFFF) {
                        throw new IllegalArgumentException("Unsupported UNLIMITED capacity for BroadcastChannel");
                    }
                    return new ArrayBroadcastChannel(v);
                }
            }
        }
        return new ArrayBroadcastChannel(0x40);
    }
}

