package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000E\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010/\u001A\u00020\bH\u0002J\b\u00100\u001A\u00020\u0019H\u0016J\f\u00101\u001A\u00020\b*\u00020\u0007H\u0016J\u001C\u00101\u001A\u00020\b*\u00020\u00072\u0006\u00102\u001A\u00020&2\b\u00103\u001A\u0004\u0018\u00010\u000BR\u000E\u0010\u0003\u001A\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001F\u0010\u0005\u001A\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001C\u0010\n\u001A\u0004\u0018\u00010\u000BX\u0080\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\f\u0010\r\"\u0004\b\u000E\u0010\u000FR \u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\b0\u0011X\u0080\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000E\u0010\u0016\u001A\u00020\u0017X\u0082\u000E¢\u0006\u0002\n\u0000R$\u0010\u001A\u001A\u00020\u00192\u0006\u0010\u0018\u001A\u00020\u00198F@FX\u0086\u000E¢\u0006\f\u001A\u0004\b\u001B\u0010\u001C\"\u0004\b\u001D\u0010\u001ER\u0019\u0010\u001F\u001A\u00020 X\u0082\u000Eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010!R\u0011\u0010\"\u001A\u00020#¢\u0006\b\n\u0000\u001A\u0004\b$\u0010%R$\u0010\'\u001A\u00020&2\u0006\u0010\u0018\u001A\u00020&@FX\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010,\u001A\u00020&2\u0006\u0010\u0018\u001A\u00020&@FX\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b-\u0010)\"\u0004\b.\u0010+\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u00064"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorComponent;", "Landroidx/compose/ui/graphics/vector/VNode;", "()V", "cacheDrawScope", "Landroidx/compose/ui/graphics/vector/DrawCache;", "drawVectorBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "Lkotlin/ExtensionFunctionType;", "intrinsicColorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "getIntrinsicColorFilter$ui_release", "()Landroidx/compose/ui/graphics/ColorFilter;", "setIntrinsicColorFilter$ui_release", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "invalidateCallback", "Lkotlin/Function0;", "getInvalidateCallback$ui_release", "()Lkotlin/jvm/functions/Function0;", "setInvalidateCallback$ui_release", "(Lkotlin/jvm/functions/Function0;)V", "isDirty", "", "value", "", "name", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "previousDrawSize", "Landroidx/compose/ui/geometry/Size;", "J", "root", "Landroidx/compose/ui/graphics/vector/GroupComponent;", "getRoot", "()Landroidx/compose/ui/graphics/vector/GroupComponent;", "", "viewportHeight", "getViewportHeight", "()F", "setViewportHeight", "(F)V", "viewportWidth", "getViewportWidth", "setViewportWidth", "doInvalidate", "toString", "draw", "alpha", "colorFilter", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class VectorComponent extends VNode {
    private final DrawCache cacheDrawScope;
    private final Function1 drawVectorBlock;
    private ColorFilter intrinsicColorFilter;
    private Function0 invalidateCallback;
    private boolean isDirty;
    private long previousDrawSize;
    private final GroupComponent root;
    private float viewportHeight;
    private float viewportWidth;

    public VectorComponent() {
        super(null);
        GroupComponent groupComponent0 = new GroupComponent();
        groupComponent0.setPivotX(0.0f);
        groupComponent0.setPivotY(0.0f);
        groupComponent0.setInvalidateListener$ui_release(new Function0() {
            {
                VectorComponent.this = vectorComponent0;
                super(0);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                this.invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                VectorComponent.this.doInvalidate();
            }
        });
        this.root = groupComponent0;
        this.isDirty = true;
        this.cacheDrawScope = new DrawCache();
        this.invalidateCallback = androidx.compose.ui.graphics.vector.VectorComponent.invalidateCallback.1.INSTANCE;
        this.previousDrawSize = 0x7FC000007FC00000L;
        this.drawVectorBlock = new Function1() {
            {
                VectorComponent.this = vectorComponent0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((DrawScope)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(DrawScope drawScope0) {
                Intrinsics.checkNotNullParameter(drawScope0, "$this$null");
                VectorComponent.this.getRoot().draw(drawScope0);
            }
        };

        @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001A\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        final class androidx.compose.ui.graphics.vector.VectorComponent.invalidateCallback.1 extends Lambda implements Function0 {
            public static final androidx.compose.ui.graphics.vector.VectorComponent.invalidateCallback.1 INSTANCE;

            static {
                androidx.compose.ui.graphics.vector.VectorComponent.invalidateCallback.1.INSTANCE = new androidx.compose.ui.graphics.vector.VectorComponent.invalidateCallback.1();
            }

            androidx.compose.ui.graphics.vector.VectorComponent.invalidateCallback.1() {
                super(0);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return Unit.INSTANCE;
            }

            public final void invoke() {
            }
        }

    }

    private final void doInvalidate() {
        this.isDirty = true;
        this.invalidateCallback.invoke();
    }

    @Override  // androidx.compose.ui.graphics.vector.VNode
    public void draw(DrawScope drawScope0) {
        Intrinsics.checkNotNullParameter(drawScope0, "<this>");
        this.draw(drawScope0, 1.0f, null);
    }

    public final void draw(DrawScope drawScope0, float f, ColorFilter colorFilter0) {
        Intrinsics.checkNotNullParameter(drawScope0, "<this>");
        if(colorFilter0 == null) {
            colorFilter0 = this.intrinsicColorFilter;
        }
        if(this.isDirty || !Size.equals-impl0(this.previousDrawSize, drawScope0.getSize-NH-jbRc())) {
            float f1 = Size.getWidth-impl(drawScope0.getSize-NH-jbRc());
            this.root.setScaleX(f1 / this.viewportWidth);
            float f2 = Size.getHeight-impl(drawScope0.getSize-NH-jbRc());
            this.root.setScaleY(f2 / this.viewportHeight);
            long v = IntSizeKt.IntSize(((int)(((float)Math.ceil(Size.getWidth-impl(drawScope0.getSize-NH-jbRc()))))), ((int)(((float)Math.ceil(Size.getHeight-impl(drawScope0.getSize-NH-jbRc()))))));
            LayoutDirection layoutDirection0 = drawScope0.getLayoutDirection();
            this.cacheDrawScope.drawCachedImage-CJJAR-o(v, drawScope0, layoutDirection0, this.drawVectorBlock);
            this.isDirty = false;
            this.previousDrawSize = drawScope0.getSize-NH-jbRc();
        }
        this.cacheDrawScope.drawInto(drawScope0, f, colorFilter0);
    }

    public final ColorFilter getIntrinsicColorFilter$ui_release() {
        return this.intrinsicColorFilter;
    }

    public final Function0 getInvalidateCallback$ui_release() {
        return this.invalidateCallback;
    }

    // 去混淆评级： 低(20)
    public final String getName() [...] // 潜在的解密器

    public final GroupComponent getRoot() {
        return this.root;
    }

    public final float getViewportHeight() {
        return this.viewportHeight;
    }

    public final float getViewportWidth() {
        return this.viewportWidth;
    }

    public final void setIntrinsicColorFilter$ui_release(ColorFilter colorFilter0) {
        this.intrinsicColorFilter = colorFilter0;
    }

    public final void setInvalidateCallback$ui_release(Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "<set-?>");
        this.invalidateCallback = function00;
    }

    public final void setName(String s) {
        Intrinsics.checkNotNullParameter(s, "value");
        this.root.setName(s);
    }

    public final void setViewportHeight(float f) {
        if(this.viewportHeight != f) {
            this.viewportHeight = f;
            this.doInvalidate();
        }
    }

    public final void setViewportWidth(float f) {
        if(this.viewportWidth != f) {
            this.viewportWidth = f;
            this.doInvalidate();
        }
    }

    // 去混淆评级： 低(20)
    @Override
    public String toString() {
        String s = "Params: \tname: \n\tviewportWidth: " + this.getViewportWidth() + "\n\tviewportHeight: " + this.getViewportHeight() + "\n";
        Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }
}

