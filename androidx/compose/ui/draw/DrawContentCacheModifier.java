package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B&\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0017\u0010\u0004\u001A\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007¢\u0006\u0002\u0010\bJ\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\u001A\u0010\u000E\u001A\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007HÆ\u0003J.\u0010\u000F\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\u0019\b\u0002\u0010\u0004\u001A\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007HÆ\u0001J\u0013\u0010\u0010\u001A\u00020\u00112\b\u0010\u0012\u001A\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001A\u00020\u0015H\u0016J\u0010\u0010\u0016\u001A\u00020\u00172\u0006\u0010\u0018\u001A\u00020\u0019H\u0016J\t\u0010\u001A\u001A\u00020\u001BHÖ\u0001J\f\u0010\u001C\u001A\u00020\u0017*\u00020\u001DH\u0016R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\"\u0010\u0004\u001A\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\f¨\u0006\u001E"}, d2 = {"Landroidx/compose/ui/draw/DrawContentCacheModifier;", "Landroidx/compose/ui/draw/DrawCacheModifier;", "cacheDrawScope", "Landroidx/compose/ui/draw/CacheDrawScope;", "onBuildDrawCache", "Lkotlin/Function1;", "Landroidx/compose/ui/draw/DrawResult;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/draw/CacheDrawScope;Lkotlin/jvm/functions/Function1;)V", "getCacheDrawScope", "()Landroidx/compose/ui/draw/CacheDrawScope;", "getOnBuildDrawCache", "()Lkotlin/jvm/functions/Function1;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "onBuildCache", "", "params", "Landroidx/compose/ui/draw/BuildDrawCacheParams;", "toString", "", "draw", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
final class DrawContentCacheModifier implements DrawCacheModifier {
    private final CacheDrawScope cacheDrawScope;
    private final Function1 onBuildDrawCache;

    public DrawContentCacheModifier(CacheDrawScope cacheDrawScope0, Function1 function10) {
        Intrinsics.checkNotNullParameter(cacheDrawScope0, "cacheDrawScope");
        Intrinsics.checkNotNullParameter(function10, "onBuildDrawCache");
        super();
        this.cacheDrawScope = cacheDrawScope0;
        this.onBuildDrawCache = function10;
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean all(Function1 function10) {
        return DefaultImpls.all(this, function10);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean any(Function1 function10) {
        return DefaultImpls.any(this, function10);
    }

    public final CacheDrawScope component1() {
        return this.cacheDrawScope;
    }

    public final Function1 component2() {
        return this.onBuildDrawCache;
    }

    public final DrawContentCacheModifier copy(CacheDrawScope cacheDrawScope0, Function1 function10) {
        Intrinsics.checkNotNullParameter(cacheDrawScope0, "cacheDrawScope");
        Intrinsics.checkNotNullParameter(function10, "onBuildDrawCache");
        return new DrawContentCacheModifier(cacheDrawScope0, function10);
    }

    public static DrawContentCacheModifier copy$default(DrawContentCacheModifier drawContentCacheModifier0, CacheDrawScope cacheDrawScope0, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            cacheDrawScope0 = drawContentCacheModifier0.cacheDrawScope;
        }
        if((v & 2) != 0) {
            function10 = drawContentCacheModifier0.onBuildDrawCache;
        }
        return drawContentCacheModifier0.copy(cacheDrawScope0, function10);
    }

    @Override  // androidx.compose.ui.draw.DrawModifier
    public void draw(ContentDrawScope contentDrawScope0) {
        Intrinsics.checkNotNullParameter(contentDrawScope0, "<this>");
        DrawResult drawResult0 = this.cacheDrawScope.getDrawResult$ui_release();
        Intrinsics.checkNotNull(drawResult0);
        drawResult0.getBlock$ui_release().invoke(contentDrawScope0);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof DrawContentCacheModifier)) {
            return false;
        }
        return Intrinsics.areEqual(this.cacheDrawScope, ((DrawContentCacheModifier)object0).cacheDrawScope) ? Intrinsics.areEqual(this.onBuildDrawCache, ((DrawContentCacheModifier)object0).onBuildDrawCache) : false;
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object foldIn(Object object0, Function2 function20) {
        return DefaultImpls.foldIn(this, object0, function20);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object foldOut(Object object0, Function2 function20) {
        return DefaultImpls.foldOut(this, object0, function20);
    }

    public final CacheDrawScope getCacheDrawScope() {
        return this.cacheDrawScope;
    }

    public final Function1 getOnBuildDrawCache() {
        return this.onBuildDrawCache;
    }

    @Override
    public int hashCode() {
        return this.cacheDrawScope.hashCode() * 0x1F + this.onBuildDrawCache.hashCode();
    }

    @Override  // androidx.compose.ui.draw.DrawCacheModifier
    public void onBuildCache(BuildDrawCacheParams buildDrawCacheParams0) {
        Intrinsics.checkNotNullParameter(buildDrawCacheParams0, "params");
        this.cacheDrawScope.setCacheParams$ui_release(buildDrawCacheParams0);
        this.cacheDrawScope.setDrawResult$ui_release(null);
        this.getOnBuildDrawCache().invoke(this.cacheDrawScope);
        if(this.cacheDrawScope.getDrawResult$ui_release() == null) {
            throw new IllegalStateException("DrawResult not defined, did you forget to call onDraw?");
        }
    }

    @Override  // androidx.compose.ui.Modifier
    public Modifier then(Modifier modifier0) {
        return DefaultImpls.then(this, modifier0);
    }

    @Override
    public String toString() {
        return "DrawContentCacheModifier(cacheDrawScope=" + this.cacheDrawScope + ", onBuildDrawCache=" + this.onBuildDrawCache + ')';
    }
}

