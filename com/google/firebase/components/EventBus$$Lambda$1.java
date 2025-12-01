package com.google.firebase.components;

import com.google.firebase.events.Event;
import java.util.Map.Entry;

final class EventBus..Lambda.1 implements Runnable {
    private final Map.Entry arg$1;
    private final Event arg$2;

    private EventBus..Lambda.1(Map.Entry map$Entry0, Event event0) {
        this.arg$1 = map$Entry0;
        this.arg$2 = event0;
    }

    public static Runnable lambdaFactory$(Map.Entry map$Entry0, Event event0) {
        return new EventBus..Lambda.1(map$Entry0, event0);
    }

    @Override
    public void run() {
        EventBus.lambda$publish$0(this.arg$1, this.arg$2);
    }
}

