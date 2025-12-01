package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0017\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\n\u0018\u00002\u00020\u0001BH\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\b\u001A\b\u0012\u0004\u0012\u00020\t0\u0005\u0012\f\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u000B0\u0005ø\u0001\u0000¢\u0006\u0002\u0010\fJ\u0019\u0010\u001A\u001A\u00020\r2\f\u0010\b\u001A\b\u0012\u0004\u0012\u00020\t0\u0005H\u0002ø\u0001\u0000J\u0019\u0010\u001B\u001A\u00020\u00132\f\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002ø\u0001\u0000R\u0011\u0010\b\u001A\u00020\r¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000FR\u0011\u0010\n\u001A\u00020\u0010¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001A\u00020\u0013¢\u0006\b\n\u0000\u001A\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001A\u00020\u0013¢\u0006\b\n\u0000\u001A\u0004\b\u0016\u0010\u0015R\u001C\u0010\u0002\u001A\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0019\u001A\u0004\b\u0017\u0010\u0018\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u001D"}, d2 = {"Landroidx/compose/ui/graphics/Vertices;", "", "vertexMode", "Landroidx/compose/ui/graphics/VertexMode;", "positions", "", "Landroidx/compose/ui/geometry/Offset;", "textureCoordinates", "colors", "Landroidx/compose/ui/graphics/Color;", "indices", "", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "getColors", "()[I", "", "getIndices", "()[S", "", "getPositions", "()[F", "getTextureCoordinates", "getVertexMode-c2xauaI", "()I", "I", "encodeColorList", "encodePointList", "points", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class Vertices {
    private final int[] colors;
    private final short[] indices;
    private final float[] positions;
    private final float[] textureCoordinates;
    private final int vertexMode;

    private Vertices(int v, List list0, List list1, List list2, List list3) {
        boolean z;
        this.vertexMode = v;
        Function1 function10 = new Function1() {
            final List $positions;

            {
                this.$positions = list0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return Boolean.valueOf(this.invoke(((Number)object0).intValue()));
            }

            public final boolean invoke(int v) {
                return v < 0 || v >= this.$positions.size();
            }
        };
        if(list1.size() != list0.size()) {
            throw new IllegalArgumentException("positions and textureCoordinates lengths must match.");
        }
        if(list2.size() != list0.size()) {
            throw new IllegalArgumentException("positions and colors lengths must match.");
        }
        int v1 = list3.size();
        if(v1 - 1 >= 0) {
            int v3 = 0;
            while(true) {
                if(((Boolean)function10.invoke(list3.get(v3))).booleanValue()) {
                    z = true;
                    goto label_16;
                }
                if(v3 + 1 > v1 - 1) {
                    break;
                }
                ++v3;
            }
        }
        z = false;
    label_16:
        if(z) {
            throw new IllegalArgumentException("indices values must be valid indices in the positions list.");
        }
        this.positions = this.encodePointList(list0);
        this.textureCoordinates = this.encodePointList(list1);
        this.colors = this.encodeColorList(list2);
        int v4 = list3.size();
        short[] arr_v = new short[v4];
        for(int v2 = 0; v2 < v4; ++v2) {
            arr_v[v2] = (short)((Number)list3.get(v2)).intValue();
        }
        this.indices = arr_v;
    }

    public Vertices(int v, List list0, List list1, List list2, List list3, DefaultConstructorMarker defaultConstructorMarker0) {
        this(v, list0, list1, list2, list3);
    }

    private final int[] encodeColorList(List list0) {
        int v = list0.size();
        int[] arr_v = new int[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_v[v1] = ColorKt.toArgb-8_81llA(((Color)list0.get(v1)).unbox-impl());
        }
        return arr_v;
    }

    private final float[] encodePointList(List list0) {
        int v = list0.size();
        float[] arr_f = new float[v * 2];
        for(int v1 = 0; v1 < v * 2; ++v1) {
            long v2 = ((Offset)list0.get(v1 / 2)).unbox-impl();
            arr_f[v1] = v1 % 2 == 0 ? Offset.getX-impl(v2) : Offset.getY-impl(v2);
        }
        return arr_f;
    }

    public final int[] getColors() {
        return this.colors;
    }

    public final short[] getIndices() {
        return this.indices;
    }

    public final float[] getPositions() {
        return this.positions;
    }

    public final float[] getTextureCoordinates() {
        return this.textureCoordinates;
    }

    public final int getVertexMode-c2xauaI() {
        return this.vertexMode;
    }
}

