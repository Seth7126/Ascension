package androidx.compose.ui.graphics.vector;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001C\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010(\n\u0000\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002Bw\b\u0000\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u0012\b\b\u0002\u0010\b\u001A\u00020\u0006\u0012\b\b\u0002\u0010\t\u001A\u00020\u0006\u0012\b\b\u0002\u0010\n\u001A\u00020\u0006\u0012\b\b\u0002\u0010\u000B\u001A\u00020\u0006\u0012\b\b\u0002\u0010\f\u001A\u00020\u0006\u0012\u000E\b\u0002\u0010\r\u001A\b\u0012\u0004\u0012\u00020\u000F0\u000E\u0012\u000E\b\u0002\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u00010\u000E¢\u0006\u0002\u0010\u0011J\u0013\u0010\"\u001A\u00020#2\b\u0010$\u001A\u0004\u0018\u00010%H\u0096\u0002J\u0011\u0010&\u001A\u00020\u00012\u0006\u0010\'\u001A\u00020\u001DH\u0086\u0002J\b\u0010(\u001A\u00020\u001DH\u0016J\u000F\u0010)\u001A\b\u0012\u0004\u0012\u00020\u00010*H\u0096\u0002R\u0014\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u00010\u000EX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001A\b\u0012\u0004\u0012\u00020\u000F0\u000E¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0003\u001A\u00020\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0005\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\u0019\u0010\u0017R\u0011\u0010\t\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\u001A\u0010\u0017R\u0011\u0010\n\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\u001B\u0010\u0017R\u0011\u0010\u001C\u001A\u00020\u001D8F¢\u0006\u0006\u001A\u0004\b\u001E\u0010\u001FR\u0011\u0010\u000B\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b \u0010\u0017R\u0011\u0010\f\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b!\u0010\u0017¨\u0006+"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorGroup;", "Landroidx/compose/ui/graphics/vector/VectorNode;", "", "name", "", "rotation", "", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "clipPathData", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "children", "(Ljava/lang/String;FFFFFFFLjava/util/List;Ljava/util/List;)V", "getClipPathData", "()Ljava/util/List;", "getName", "()Ljava/lang/String;", "getPivotX", "()F", "getPivotY", "getRotation", "getScaleX", "getScaleY", "size", "", "getSize", "()I", "getTranslationX", "getTranslationY", "equals", "", "other", "", "get", "index", "hashCode", "iterator", "", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class VectorGroup extends VectorNode implements Iterable, KMappedMarker {
    private final List children;
    private final List clipPathData;
    private final String name;
    private final float pivotX;
    private final float pivotY;
    private final float rotation;
    private final float scaleX;
    private final float scaleY;
    private final float translationX;
    private final float translationY;

    public VectorGroup() {
        this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 0x3FF, null);
    }

    public VectorGroup(String s, float f, float f1, float f2, float f3, float f4, float f5, float f6, List list0, List list1) {
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(list0, "clipPathData");
        Intrinsics.checkNotNullParameter(list1, "children");
        super(null);
        this.name = s;
        this.rotation = f;
        this.pivotX = f1;
        this.pivotY = f2;
        this.scaleX = f3;
        this.scaleY = f4;
        this.translationX = f5;
        this.translationY = f6;
        this.clipPathData = list0;
        this.children = list1;
    }

    public VectorGroup(String s, float f, float f1, float f2, float f3, float f4, float f5, float f6, List list0, List list1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        this(((v & 1) == 0 ? s : ""), ((v & 2) == 0 ? f : 0.0f), ((v & 4) == 0 ? f1 : 0.0f), ((v & 8) == 0 ? f2 : 0.0f), ((v & 16) == 0 ? f3 : 1.0f), ((v & 0x20) == 0 ? f4 : 1.0f), ((v & 0x40) == 0 ? f5 : 0.0f), ((v & 0x80) == 0 ? f6 : 0.0f), ((v & 0x100) == 0 ? list0 : VectorKt.getEmptyPath()), ((v & 0x200) == 0 ? list1 : CollectionsKt.emptyList()));
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null || !(object0 instanceof VectorGroup) || !Intrinsics.areEqual(this.name, ((VectorGroup)object0).name)) {
            return false;
        }
        if(this.rotation != ((VectorGroup)object0).rotation) {
            return false;
        }
        if(this.pivotX != ((VectorGroup)object0).pivotX) {
            return false;
        }
        if(this.pivotY != ((VectorGroup)object0).pivotY) {
            return false;
        }
        if(this.scaleX != ((VectorGroup)object0).scaleX) {
            return false;
        }
        if(this.scaleY != ((VectorGroup)object0).scaleY) {
            return false;
        }
        if(this.translationX != ((VectorGroup)object0).translationX) {
            return false;
        }
        if(this.translationY != ((VectorGroup)object0).translationY) {
            return false;
        }
        return Intrinsics.areEqual(this.clipPathData, ((VectorGroup)object0).clipPathData) ? Intrinsics.areEqual(this.children, ((VectorGroup)object0).children) : false;
    }

    public final VectorNode get(int v) {
        return (VectorNode)this.children.get(v);
    }

    public final List getClipPathData() {
        return this.clipPathData;
    }

    public final String getName() [...] // 潜在的解密器

    public final float getPivotX() {
        return this.pivotX;
    }

    public final float getPivotY() {
        return this.pivotY;
    }

    public final float getRotation() {
        return this.rotation;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final int getSize() {
        return this.children.size();
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    @Override
    public int hashCode() {
        return ((((((((this.name.hashCode() * 0x1F + Float.floatToIntBits(this.rotation)) * 0x1F + Float.floatToIntBits(this.pivotX)) * 0x1F + Float.floatToIntBits(this.pivotY)) * 0x1F + Float.floatToIntBits(this.scaleX)) * 0x1F + Float.floatToIntBits(this.scaleY)) * 0x1F + Float.floatToIntBits(this.translationX)) * 0x1F + Float.floatToIntBits(this.translationY)) * 0x1F + this.clipPathData.hashCode()) * 0x1F + this.children.hashCode();
    }

    @Override
    public Iterator iterator() {
        return new Object() {
            private final Iterator it;

            {
                this.it = vectorGroup0.children.iterator();
            }

            public final Iterator getIt() {
                return this.it;
            }

            @Override
            public boolean hasNext() {
                return this.it.hasNext();
            }

            public VectorNode next() {
                return this.it.next();
            }

            @Override
            public Object next() {
                return this.next();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }
}

