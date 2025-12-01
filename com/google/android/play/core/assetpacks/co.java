package com.google.android.play.core.assetpacks;

import java.util.HashMap;
import java.util.Map;

final class co {
    private final Map a;

    co() {
        this.a = new HashMap();
    }

    final double a(String s) {
        Double double0;
        synchronized(this) {
            double0 = (Double)this.a.get(s);
            if(double0 == null) {
                return 0.0;
            }
        }
        return (double)double0;
    }

    final double b(String s, dg dg0) {
        synchronized(this) {
            double f = (((double)((ce)dg0).f) + 1.0) / ((double)((ce)dg0).g);
            this.a.put(s, f);
            return f;
        }
    }

    final void c(String s) {
        synchronized(this) {
            this.a.put(s, 0.0);
        }
    }
}

