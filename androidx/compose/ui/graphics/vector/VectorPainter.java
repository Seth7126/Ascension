package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0000\u00A2\u0006\u0002\u0010\u0002Jd\u0010\"\u001A\u00020#2\u0006\u0010$\u001A\u00020%2\u0006\u0010&\u001A\u00020\u00062\u0006\u0010\'\u001A\u00020\u00062;\u0010(\u001A7\u0012\u0013\u0012\u00110\u0006\u00A2\u0006\f\b*\u0012\b\b$\u0012\u0004\b\b(&\u0012\u0013\u0012\u00110\u0006\u00A2\u0006\f\b*\u0012\b\b$\u0012\u0004\b\b(\'\u0012\u0004\u0012\u00020#0)\u00A2\u0006\u0002\b+H\u0001\u00A2\u0006\u0004\b,\u0010-J\u0010\u0010.\u001A\u00020\u00142\u0006\u0010/\u001A\u00020\u0006H\u0014J\u0012\u00100\u001A\u00020\u00142\b\u00101\u001A\u0004\u0018\u00010\bH\u0014JR\u00102\u001A\u00020\u00042\u0006\u00103\u001A\u0002042;\u00105\u001A7\u0012\u0013\u0012\u00110\u0006\u00A2\u0006\f\b*\u0012\b\b$\u0012\u0004\b\b(&\u0012\u0013\u0012\u00110\u0006\u00A2\u0006\f\b*\u0012\b\b$\u0012\u0004\b\b(\'\u0012\u0004\u0012\u00020#0)\u00A2\u0006\u0002\b+H\u0002\u00A2\u0006\u0002\u00106J\f\u00107\u001A\u00020#*\u000208H\u0014R\u0010\u0010\u0003\u001A\u0004\u0018\u00010\u0004X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0005\u001A\u00020\u0006X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001A\u0004\u0018\u00010\bX\u0082\u000E\u00A2\u0006\u0002\n\u0000R(\u0010\n\u001A\u0004\u0018\u00010\b2\b\u0010\t\u001A\u0004\u0018\u00010\b8@@@X\u0080\u000E\u00A2\u0006\f\u001A\u0004\b\u000B\u0010\f\"\u0004\b\r\u0010\u000ER\u001D\u0010\u000F\u001A\u00020\u00108VX\u0096\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0006\u001A\u0004\b\u0011\u0010\u0012R+\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0013\u001A\u00020\u00148B@BX\u0082\u008E\u0002\u00A2\u0006\u0012\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R4\u0010\u001B\u001A\u00020\u00102\u0006\u0010\u0013\u001A\u00020\u00108@@@X\u0080\u008E\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0012\n\u0004\b\u001F\u0010\u001A\u001A\u0004\b\u001C\u0010\u0012\"\u0004\b\u001D\u0010\u001ER\u000E\u0010 \u001A\u00020!X\u0082\u0004\u00A2\u0006\u0002\n\u0000\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u00069"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorPainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "()V", "composition", "Landroidx/compose/runtime/Composition;", "currentAlpha", "", "currentColorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "value", "intrinsicColorFilter", "getIntrinsicColorFilter$ui_release", "()Landroidx/compose/ui/graphics/ColorFilter;", "setIntrinsicColorFilter$ui_release", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "intrinsicSize", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "<set-?>", "", "isDirty", "()Z", "setDirty", "(Z)V", "isDirty$delegate", "Landroidx/compose/runtime/MutableState;", "size", "getSize-NH-jbRc$ui_release", "setSize-uvyYCjk$ui_release", "(J)V", "size$delegate", "vector", "Landroidx/compose/ui/graphics/vector/VectorComponent;", "RenderVector", "", "name", "", "viewportWidth", "viewportHeight", "content", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "Landroidx/compose/runtime/Composable;", "RenderVector$ui_release", "(Ljava/lang/String;FFLkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)V", "applyAlpha", "alpha", "applyColorFilter", "colorFilter", "composeVector", "parent", "Landroidx/compose/runtime/CompositionContext;", "composable", "(Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function4;)Landroidx/compose/runtime/Composition;", "onDraw", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class VectorPainter extends Painter {
    public static final int $stable = 8;
    private Composition composition;
    private float currentAlpha;
    private ColorFilter currentColorFilter;
    private final MutableState isDirty$delegate;
    private final MutableState size$delegate;
    private final VectorComponent vector;

    static {
    }

    public VectorPainter() {
        this.size$delegate = SnapshotStateKt.mutableStateOf$default(Size.box-impl(0L), null, 2, null);
        VectorComponent vectorComponent0 = new VectorComponent();
        vectorComponent0.setInvalidateCallback$ui_release(new Function0() {
            {
                VectorPainter.this = vectorPainter0;
                super(0);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                this.invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                VectorPainter.this.setDirty(true);
            }
        });
        this.vector = vectorComponent0;
        this.isDirty$delegate = SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this.currentAlpha = 1.0f;
    }

    public final void RenderVector$ui_release(String s, float f, float f1, Function4 function40, Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(function40, "content");
        Composer composer1 = composer0.startRestartGroup(0x25496F07);
        ComposerKt.sourceInformation(composer1, "C(RenderVector)P(1,3,2)177@6554L28,181@6623L117:VectorPainter.kt#huu6hf");
        this.vector.setName(s);
        this.vector.setViewportWidth(f);
        this.vector.setViewportHeight(f1);
        Composition composition0 = this.composeVector(ComposablesKt.rememberCompositionContext(composer1, 0), function40);
        EffectsKt.DisposableEffect(composition0, new Function1() {
            final Composition $composition;

            {
                this.$composition = composition0;
                super(1);
            }

            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope0) {
                Intrinsics.checkNotNullParameter(disposableEffectScope0, "$this$DisposableEffect");
                return new DisposableEffectResult() {
                    @Override  // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        this.$composition$inlined.dispose();
                    }
                };
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((DisposableEffectScope)object0));
            }
        }, composer1, 8);
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new Function2(s, f, f1, function40, v) {
                final int $$changed;
                final Function4 $content;
                final String $name;
                final VectorPainter $tmp0_rcvr;
                final float $viewportHeight;
                final float $viewportWidth;

                {
                    this.$tmp0_rcvr = vectorPainter0;
                    this.$name = s;
                    this.$viewportWidth = f;
                    this.$viewportHeight = f1;
                    this.$content = function40;
                    this.$$changed = v;
                    super(2);
                }

                @Override  // kotlin.jvm.functions.Function2
                public Object invoke(Object object0, Object object1) {
                    this.invoke(((Composer)object0), ((Number)object1).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer0, int v) {
                    this.$tmp0_rcvr.RenderVector$ui_release(this.$name, this.$viewportWidth, this.$viewportHeight, this.$content, composer0, this.$$changed | 1);
                }
            });
        }
    }

    @Override  // androidx.compose.ui.graphics.painter.Painter
    protected boolean applyAlpha(float f) {
        this.currentAlpha = f;
        return true;
    }

    @Override  // androidx.compose.ui.graphics.painter.Painter
    protected boolean applyColorFilter(ColorFilter colorFilter0) {
        this.currentColorFilter = colorFilter0;
        return true;
    }

    private final Composition composeVector(CompositionContext compositionContext0, Function4 function40) {
        Composition composition0 = this.composition != null && !this.composition.isDisposed() ? this.composition : CompositionKt.Composition(new VectorApplier(this.vector.getRoot()), compositionContext0);
        this.composition = composition0;
        composition0.setContent(ComposableLambdaKt.composableLambdaInstance(0xC541E60D, true, new Function2(this) {
            final Function4 $composable;

            {
                this.$composable = function40;
                VectorPainter.this = vectorPainter0;
                super(2);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                this.invoke(((Composer)object0), ((Number)object1).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer0, int v) {
                ComposerKt.sourceInformation(composer0, "C157@5980L55:VectorPainter.kt#huu6hf");
                if((v & 11 ^ 2) == 0 && composer0.getSkipping()) {
                    composer0.skipToGroupEnd();
                    return;
                }
                this.$composable.invoke(VectorPainter.this.vector.getViewportWidth(), VectorPainter.this.vector.getViewportHeight(), composer0, 0);
            }
        }));
        return composition0;
    }

    public final ColorFilter getIntrinsicColorFilter$ui_release() {
        return this.vector.getIntrinsicColorFilter$ui_release();
    }

    @Override  // androidx.compose.ui.graphics.painter.Painter
    public long getIntrinsicSize-NH-jbRc() {
        return this.getSize-NH-jbRc$ui_release();
    }

    public final long getSize-NH-jbRc$ui_release() {
        return ((Size)this.size$delegate.getValue()).unbox-impl();
    }

    private final boolean isDirty() {
        return ((Boolean)this.isDirty$delegate.getValue()).booleanValue();
    }

    @Override  // androidx.compose.ui.graphics.painter.Painter
    protected void onDraw(DrawScope drawScope0) {
        Intrinsics.checkNotNullParameter(drawScope0, "<this>");
        this.vector.draw(drawScope0, this.currentAlpha, (this.currentColorFilter == null ? this.vector.getIntrinsicColorFilter$ui_release() : this.currentColorFilter));
        if(this.isDirty()) {
            this.setDirty(false);
        }
    }

    private final void setDirty(boolean z) {
        this.isDirty$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setIntrinsicColorFilter$ui_release(ColorFilter colorFilter0) {
        this.vector.setIntrinsicColorFilter$ui_release(colorFilter0);
    }

    public final void setSize-uvyYCjk$ui_release(long v) {
        Size size0 = Size.box-impl(v);
        this.size$delegate.setValue(size0);
    }
}

