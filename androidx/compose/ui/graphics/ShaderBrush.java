package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.ui.geometry.Size;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\b\'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J+\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\u00042\u0006\u0010\f\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\u000Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0012\u001A\u00060\u0007j\u0002`\b2\u0006\u0010\u000B\u001A\u00020\u0004H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001A\u00020\u0004X\u0082\u000Eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0006\u001A\n\u0018\u00010\u0007j\u0004\u0018\u0001`\bX\u0082\u000E¢\u0006\u0002\n\u0000\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/graphics/ShaderBrush;", "Landroidx/compose/ui/graphics/Brush;", "()V", "createdSize", "Landroidx/compose/ui/geometry/Size;", "J", "internalShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "applyTo", "", "size", "p", "Landroidx/compose/ui/graphics/Paint;", "alpha", "", "applyTo-Pq9zytI", "(JLandroidx/compose/ui/graphics/Paint;F)V", "createShader", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public abstract class ShaderBrush extends Brush {
    private long createdSize;
    private Shader internalShader;

    public ShaderBrush() {
        super(null);
        this.createdSize = 0x7FC000007FC00000L;
    }

    @Override  // androidx.compose.ui.graphics.Brush
    public final void applyTo-Pq9zytI(long v, Paint paint0, float f) {
        Intrinsics.checkNotNullParameter(paint0, "p");
        Shader shader0 = this.internalShader;
        if(shader0 == null || !Size.equals-impl0(this.createdSize, v)) {
            shader0 = this.createShader-uvyYCjk(v);
            this.internalShader = shader0;
            this.createdSize = v;
        }
        if(!Color.equals-impl0(paint0.getColor-0d7_KjU(), 0xFF00000000000000L)) {
            paint0.setColor-8_81llA(0xFF00000000000000L);
        }
        if(!Intrinsics.areEqual(paint0.getShader(), shader0)) {
            paint0.setShader(shader0);
        }
        if(paint0.getAlpha() != f) {
            paint0.setAlpha(f);
        }
    }

    public abstract Shader createShader-uvyYCjk(long arg1);
}

