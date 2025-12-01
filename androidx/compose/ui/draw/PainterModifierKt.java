package androidx.compose.ui.draw;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u001AF\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\n\u001A\u00020\u000B2\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\r¨\u0006\u000E"}, d2 = {"paint", "Landroidx/compose/ui/Modifier;", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "sizeToIntrinsics", "", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class PainterModifierKt {
    public static final Modifier paint(Modifier modifier0, Painter painter0, boolean z, Alignment alignment0, ContentScale contentScale0, float f, ColorFilter colorFilter0) {
        Intrinsics.checkNotNullParameter(modifier0, "<this>");
        Intrinsics.checkNotNullParameter(painter0, "painter");
        Intrinsics.checkNotNullParameter(alignment0, "alignment");
        Intrinsics.checkNotNullParameter(contentScale0, "contentScale");
        return modifier0.then(new PainterModifier(painter0, z, alignment0, contentScale0, f, colorFilter0, InspectableValueKt.getNoInspectorInfo()));

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001A\u00020\u0001*\u00020\u0000H\n¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/InspectorInfo;", "", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public final class androidx.compose.ui.draw.PainterModifierKt.paint..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            final Alignment $alignment$inlined;
            final float $alpha$inlined;
            final ColorFilter $colorFilter$inlined;
            final ContentScale $contentScale$inlined;
            final Painter $painter$inlined;
            final boolean $sizeToIntrinsics$inlined;

            public androidx.compose.ui.draw.PainterModifierKt.paint..inlined.debugInspectorInfo.1(Painter painter0, boolean z, Alignment alignment0, ContentScale contentScale0, float f, ColorFilter colorFilter0) {
                this.$painter$inlined = painter0;
                this.$sizeToIntrinsics$inlined = z;
                this.$alignment$inlined = alignment0;
                this.$contentScale$inlined = contentScale0;
                this.$alpha$inlined = f;
                this.$colorFilter$inlined = colorFilter0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(InspectorInfo inspectorInfo0) {
                Intrinsics.checkNotNullParameter(inspectorInfo0, "$this$null");
                inspectorInfo0.setName("paint");
                inspectorInfo0.getProperties().set("painter", this.$painter$inlined);
                inspectorInfo0.getProperties().set("sizeToIntrinsics", Boolean.valueOf(this.$sizeToIntrinsics$inlined));
                inspectorInfo0.getProperties().set("alignment", this.$alignment$inlined);
                inspectorInfo0.getProperties().set("contentScale", this.$contentScale$inlined);
                inspectorInfo0.getProperties().set("alpha", this.$alpha$inlined);
                inspectorInfo0.getProperties().set("colorFilter", this.$colorFilter$inlined);
            }
        }

    }

    public static Modifier paint$default(Modifier modifier0, Painter painter0, boolean z, Alignment alignment0, ContentScale contentScale0, float f, ColorFilter colorFilter0, int v, Object object0) {
        if((v & 4) != 0) {
            alignment0 = Alignment.Companion.getCenter();
        }
        if((v & 8) != 0) {
            contentScale0 = ContentScale.Companion.getInside();
        }
        if((v & 0x20) != 0) {
            colorFilter0 = null;
        }
        return PainterModifierKt.paint(modifier0, painter0, ((v & 2) == 0 ? z : true), alignment0, contentScale0, ((v & 16) == 0 ? f : 1.0f), colorFilter0);
    }
}

