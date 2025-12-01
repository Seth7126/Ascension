package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.internal.ae;
import com.google.android.play.core.assetpacks.internal.ap;
import com.google.android.play.core.assetpacks.internal.aq;
import com.google.android.play.core.assetpacks.internal.as;

final class cb implements a {
    private final as A;
    private final as B;
    private final as C;
    private final cb a;
    private final as b;
    private final as c;
    private final as d;
    private final as e;
    private final as f;
    private final as g;
    private final as h;
    private final as i;
    private final as j;
    private final as k;
    private final as l;
    private final as m;
    private final as n;
    private final as o;
    private final as p;
    private final as q;
    private final as r;
    private final as s;
    private final as t;
    private final as u;
    private final as v;
    private final as w;
    private final as x;
    private final as y;
    private final as z;

    cb(p p0, ca ca0) {
        this.a = this;
        u u0 = new u(p0);
        this.b = u0;
        as as0 = aq.b(new ee(u0));
        this.c = as0;
        as as1 = aq.b(new bi(u0, as0));
        this.d = as1;
        as as2 = aq.b(cp.a());
        this.e = as2;
        as as3 = aq.b(new ec(as1, as0));
        this.f = as3;
        as as4 = aq.b(new ax(u0, as2, as3));
        this.g = as4;
        as as5 = aq.b(new v(u0));
        this.h = as5;
        ap ap0 = new ap();
        this.i = ap0;
        as as6 = aq.b(q.a());
        this.j = as6;
        as as7 = aq.b(new df(as1, ap0, as2, as6));
        this.k = as7;
        ap ap1 = new ap();
        this.l = ap1;
        as as8 = aq.b(new cg(as1, ap0, ap1, as2, as3));
        this.m = as8;
        as as9 = aq.b(new et(as1));
        this.n = as9;
        as as10 = aq.b(new dv(as1));
        this.o = as10;
        as as11 = aq.b(new dz(as1, ap0, as7, as6, as2, as3));
        this.p = as11;
        as as12 = aq.b(new eh(as1, ap0));
        this.q = as12;
        as as13 = aq.b(new el(as1, ap0, as7, as6, as2));
        this.r = as13;
        as as14 = aq.b(new bv(ap0));
        this.s = as14;
        as as15 = aq.b(new di(as7, as1, as14));
        this.t = as15;
        as as16 = aq.b(new cm(as7, ap0, as8, as9, as10, as11, as12, as13, as15));
        this.u = as16;
        as as17 = aq.b(by.a);
        this.v = as17;
        as as18 = aq.b(w.a());
        this.w = as18;
        ap.b(ap1, aq.b(new bc(u0, as7, as16, ap0, as2, as17, as6, as18, as3)));
        as as19 = aq.b(new dp(as5, ap1, as2, u0, as0, as6, as3));
        this.x = as19;
        ap.b(ap0, aq.b(new t(u0, as4, as19)));
        as as20 = aq.b(new ae(u0));
        this.y = as20;
        as as21 = aq.b(new m(as1, ap0, ap1, as20, as7, as2, as17, as6, as3));
        this.z = as21;
        this.A = aq.b(new s(as21, u0));
        as as22 = aq.b(new cj(u0));
        this.B = as22;
        this.C = aq.b(new c(u0, as1, as21, as22));
    }

    @Override  // com.google.android.play.core.assetpacks.a
    public final AssetPackManager a() {
        return (AssetPackManager)this.A.a();
    }

    @Override  // com.google.android.play.core.assetpacks.a
    public final void b(AssetPackExtractionService assetPackExtractionService0) {
        assetPackExtractionService0.a = (b)this.C.a();
    }
}

