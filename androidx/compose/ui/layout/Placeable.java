package androidx.compose.ui.layout;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\'\u0018\u00002\u00020\u0001:\u0001)B\u0005¢\u0006\u0002\u0010\u0002J@\u0010\u001D\u001A\u00020\u001E2\u0006\u0010\u001F\u001A\u00020\u00042\u0006\u0010 \u001A\u00020!2\u0019\u0010\"\u001A\u0015\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001E\u0018\u00010#¢\u0006\u0002\b%H$ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010\'J\b\u0010(\u001A\u00020\u001EH\u0002R\u001D\u0010\u0003\u001A\u00020\u00048DX\u0084\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006R\u001E\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\b@BX\u0086\u000E¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0014\u0010\f\u001A\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\r\u0010\u000BR/\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u000E\u001A\u00020\u000F@DX\u0084\u000Eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u0014\u001A\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001A\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0016\u0010\u000BR/\u0010\u0018\u001A\u00020\u00172\u0006\u0010\u000E\u001A\u00020\u0017@DX\u0084\u000Eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u0014\u001A\u0004\b\u0019\u0010\u0006\"\u0004\b\u001A\u0010\u0013R\u001E\u0010\u001B\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\b@BX\u0086\u000E¢\u0006\b\n\u0000\u001A\u0004\b\u001C\u0010\u000B\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006*"}, d2 = {"Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/layout/Measured;", "()V", "apparentToRealOffset", "Landroidx/compose/ui/unit/IntOffset;", "getApparentToRealOffset-nOcc-ac", "()J", "<set-?>", "", "height", "getHeight", "()I", "measuredHeight", "getMeasuredHeight", "value", "Landroidx/compose/ui/unit/IntSize;", "measuredSize", "getMeasuredSize-YbymL2g", "setMeasuredSize-ozmzZPI", "(J)V", "J", "measuredWidth", "getMeasuredWidth", "Landroidx/compose/ui/unit/Constraints;", "measurementConstraints", "getMeasurementConstraints-msEJaDk", "setMeasurementConstraints-BRTryo0", "width", "getWidth", "placeAt", "", "position", "zIndex", "", "layerBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "recalculateWidthAndHeight", "PlacementScope", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public abstract class Placeable implements Measured {
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\'\u0018\u0000 %2\u00020\u0001:\u0001%B\u0005\u00A2\u0006\u0002\u0010\u0002J)\u0010\u000B\u001A\u00020\f*\u00020\r2\u0006\u0010\u000E\u001A\u00020\u000F2\b\b\u0002\u0010\u0010\u001A\u00020\u0011\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u000B\u001A\u00020\f*\u00020\r2\u0006\u0010\u0014\u001A\u00020\b2\u0006\u0010\u0015\u001A\u00020\b2\b\b\u0002\u0010\u0010\u001A\u00020\u0011JJ\u0010\u0016\u001A\u00020\f*\u00020\r2\u0006\u0010\u000E\u001A\u00020\u000F2\u0006\u0010\u0010\u001A\u00020\u00112\u001B\b\b\u0010\u0017\u001A\u0015\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\f\u0018\u00010\u0018\u00A2\u0006\u0002\b\u001AH\u0080\b\u00F8\u0001\u0000\u00F8\u0001\u0002\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001B\u0010\u001CJJ\u0010\u001D\u001A\u00020\f*\u00020\r2\u0006\u0010\u000E\u001A\u00020\u000F2\u0006\u0010\u0010\u001A\u00020\u00112\u001B\b\b\u0010\u0017\u001A\u0015\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\f\u0018\u00010\u0018\u00A2\u0006\u0002\b\u001AH\u0080\b\u00F8\u0001\u0000\u00F8\u0001\u0002\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001E\u0010\u001CJ)\u0010\u001F\u001A\u00020\f*\u00020\r2\u0006\u0010\u000E\u001A\u00020\u000F2\b\b\u0002\u0010\u0010\u001A\u00020\u0011\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b \u0010\u0013J$\u0010\u001F\u001A\u00020\f*\u00020\r2\u0006\u0010\u0014\u001A\u00020\b2\u0006\u0010\u0015\u001A\u00020\b2\b\b\u0002\u0010\u0010\u001A\u00020\u0011JD\u0010!\u001A\u00020\f*\u00020\r2\u0006\u0010\u000E\u001A\u00020\u000F2\b\b\u0002\u0010\u0010\u001A\u00020\u00112\u0019\b\u0002\u0010\u0017\u001A\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\f0\u0018\u00A2\u0006\u0002\b\u001A\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\"\u0010\u001CJ?\u0010!\u001A\u00020\f*\u00020\r2\u0006\u0010\u0014\u001A\u00020\b2\u0006\u0010\u0015\u001A\u00020\b2\b\b\u0002\u0010\u0010\u001A\u00020\u00112\u0019\b\u0002\u0010\u0017\u001A\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\f0\u0018\u00A2\u0006\u0002\b\u001AJD\u0010#\u001A\u00020\f*\u00020\r2\u0006\u0010\u000E\u001A\u00020\u000F2\b\b\u0002\u0010\u0010\u001A\u00020\u00112\u0019\b\u0002\u0010\u0017\u001A\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\f0\u0018\u00A2\u0006\u0002\b\u001A\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b$\u0010\u001CJ?\u0010#\u001A\u00020\f*\u00020\r2\u0006\u0010\u0014\u001A\u00020\b2\u0006\u0010\u0015\u001A\u00020\b2\b\b\u0002\u0010\u0010\u001A\u00020\u00112\u0019\b\u0002\u0010\u0017\u001A\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\f0\u0018\u00A2\u0006\u0002\b\u001AR\u0012\u0010\u0003\u001A\u00020\u0004X\u00A4\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001A\u00020\bX\u00A4\u0004\u00A2\u0006\u0006\u001A\u0004\b\t\u0010\n\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\n\u0005\b\u009920\u0001\u00A8\u0006&"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "()V", "parentLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "parentWidth", "", "getParentWidth", "()I", "place", "", "Landroidx/compose/ui/layout/Placeable;", "position", "Landroidx/compose/ui/unit/IntOffset;", "zIndex", "", "place-70tqf50", "(Landroidx/compose/ui/layout/Placeable;JF)V", "x", "y", "placeApparentToRealOffset", "layerBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "placeApparentToRealOffset-aW-9-wM$ui_release", "(Landroidx/compose/ui/layout/Placeable;JFLkotlin/jvm/functions/Function1;)V", "placeAutoMirrored", "placeAutoMirrored-aW-9-wM$ui_release", "placeRelative", "placeRelative-70tqf50", "placeRelativeWithLayer", "placeRelativeWithLayer-aW-9-wM", "placeWithLayer", "placeWithLayer-aW-9-wM", "Companion", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static abstract class PlacementScope {
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J7\u0010\f\u001A\u00020\r2\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u0005\u001A\u00020\u00042\u0019\b\u0004\u0010\u000E\u001A\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\u000F¢\u0006\u0002\b\u0010H\u0086\bø\u0001\u0000R\u001E\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0004@RX\u0094\u000E¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u001E\u0010\t\u001A\u00020\b2\u0006\u0010\u0003\u001A\u00020\b@RX\u0094\u000E¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000B\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope$Companion;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "()V", "<set-?>", "Landroidx/compose/ui/unit/LayoutDirection;", "parentLayoutDirection", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "", "parentWidth", "getParentWidth", "()I", "executeWithRtlMirroringValues", "", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
        public static final class Companion extends PlacementScope {
            private Companion() {
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            // 去混淆评级： 低(20)
            public static final int access$getParentWidth(Companion placeable$PlacementScope$Companion0) [...] // 潜在的解密器

            public final void executeWithRtlMirroringValues(int v, LayoutDirection layoutDirection0, Function1 function10) {
                Intrinsics.checkNotNullParameter(layoutDirection0, "parentLayoutDirection");
                Intrinsics.checkNotNullParameter(function10, "block");
                LayoutDirection layoutDirection1 = PlacementScope.Companion.getParentLayoutDirection();
                PlacementScope.parentWidth = v;
                PlacementScope.parentLayoutDirection = layoutDirection0;
                function10.invoke(this);
                PlacementScope.parentWidth = 0;
                PlacementScope.parentLayoutDirection = layoutDirection1;
            }

            @Override  // androidx.compose.ui.layout.Placeable$PlacementScope
            protected LayoutDirection getParentLayoutDirection() {
                return PlacementScope.parentLayoutDirection;
            }

            // 去混淆评级： 低(20)
            @Override  // androidx.compose.ui.layout.Placeable$PlacementScope
            protected int getParentWidth() [...] // 潜在的解密器
        }

        public static final int $stable;
        public static final Companion Companion;
        private static LayoutDirection parentLayoutDirection;
        private static int parentWidth;

        static {
            PlacementScope.Companion = new Companion(null);
            PlacementScope.parentLayoutDirection = LayoutDirection.Ltr;
        }

        public static final int access$getParentWidth$cp() [...] // 潜在的解密器

        protected abstract LayoutDirection getParentLayoutDirection();

        protected abstract int getParentWidth();

        public final void place(Placeable placeable0, int v, int v1, float f) {
            Intrinsics.checkNotNullParameter(placeable0, "<this>");
            long v2 = IntOffsetKt.IntOffset(v, v1);
            long v3 = placeable0.getApparentToRealOffset-nOcc-ac();
            placeable0.placeAt-f8xVGno(IntOffsetKt.IntOffset(((int)(v2 >> 0x20)) + ((int)(v3 >> 0x20)), ((int)(v2 & 0xFFFFFFFFL)) + ((int)(v3 & 0xFFFFFFFFL))), f, null);
        }

        public static void place$default(PlacementScope placeable$PlacementScope0, Placeable placeable0, int v, int v1, float f, int v2, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
            }
            if((v2 & 4) != 0) {
                f = 0.0f;
            }
            placeable$PlacementScope0.place(placeable0, v, v1, f);
        }

        public final void place-70tqf50(Placeable placeable0, long v, float f) {
            Intrinsics.checkNotNullParameter(placeable0, "$receiver");
            long v1 = placeable0.getApparentToRealOffset-nOcc-ac();
            placeable0.placeAt-f8xVGno(IntOffsetKt.IntOffset(((int)(v >> 0x20)) + ((int)(v1 >> 0x20)), v + v1), f, null);
        }

        public static void place-70tqf50$default(PlacementScope placeable$PlacementScope0, Placeable placeable0, long v, float f, int v1, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
            }
            if((v1 & 2) != 0) {
                f = 0.0f;
            }
            placeable$PlacementScope0.place-70tqf50(placeable0, v, f);
        }

        public final void placeApparentToRealOffset-aW-9-wM$ui_release(Placeable placeable0, long v, float f, Function1 function10) {
            Intrinsics.checkNotNullParameter(placeable0, "$receiver");
            long v1 = placeable0.getApparentToRealOffset-nOcc-ac();
            placeable0.placeAt-f8xVGno(IntOffsetKt.IntOffset(((int)(v >> 0x20)) + ((int)(v1 >> 0x20)), ((int)(v & 0xFFFFFFFFL)) + ((int)(v1 & 0xFFFFFFFFL))), f, function10);
        }

        public final void placeAutoMirrored-aW-9-wM$ui_release(Placeable placeable0, long v, float f, Function1 function10) {
            Intrinsics.checkNotNullParameter(placeable0, "$receiver");
            if(this.getParentLayoutDirection() != LayoutDirection.Ltr && this.getParentWidth() != 0) {
                long v1 = IntOffsetKt.IntOffset(this.getParentWidth() - IntSize.getWidth-impl(placeable0.getMeasuredSize-YbymL2g()) - ((int)(v >> 0x20)), ((int)(v & 0xFFFFFFFFL)));
                long v2 = placeable0.getApparentToRealOffset-nOcc-ac();
                placeable0.placeAt-f8xVGno(IntOffsetKt.IntOffset(((int)(v1 >> 0x20)) + ((int)(v2 >> 0x20)), ((int)(v1 & 0xFFFFFFFFL)) + ((int)(v2 & 0xFFFFFFFFL))), f, function10);
                return;
            }
            long v3 = placeable0.getApparentToRealOffset-nOcc-ac();
            placeable0.placeAt-f8xVGno(IntOffsetKt.IntOffset(((int)(v >> 0x20)) + ((int)(v3 >> 0x20)), ((int)(v & 0xFFFFFFFFL)) + ((int)(v3 & 0xFFFFFFFFL))), f, function10);
        }

        public final void placeRelative(Placeable placeable0, int v, int v1, float f) {
            Intrinsics.checkNotNullParameter(placeable0, "<this>");
            long v2 = IntOffsetKt.IntOffset(v, v1);
            if(this.getParentLayoutDirection() != LayoutDirection.Ltr && this.getParentWidth() != 0) {
                long v3 = IntOffsetKt.IntOffset(this.getParentWidth() - IntSize.getWidth-impl(placeable0.getMeasuredSize-YbymL2g()) - ((int)(v2 >> 0x20)), ((int)(v2 & 0xFFFFFFFFL)));
                long v4 = placeable0.getApparentToRealOffset-nOcc-ac();
                placeable0.placeAt-f8xVGno(IntOffsetKt.IntOffset(((int)(v3 >> 0x20)) + ((int)(v4 >> 0x20)), ((int)(v3 & 0xFFFFFFFFL)) + ((int)(v4 & 0xFFFFFFFFL))), f, null);
                return;
            }
            long v5 = placeable0.getApparentToRealOffset-nOcc-ac();
            placeable0.placeAt-f8xVGno(IntOffsetKt.IntOffset(((int)(v2 >> 0x20)) + ((int)(v5 >> 0x20)), ((int)(v2 & 0xFFFFFFFFL)) + ((int)(v5 & 0xFFFFFFFFL))), f, null);
        }

        public static void placeRelative$default(PlacementScope placeable$PlacementScope0, Placeable placeable0, int v, int v1, float f, int v2, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
            }
            if((v2 & 4) != 0) {
                f = 0.0f;
            }
            placeable$PlacementScope0.placeRelative(placeable0, v, v1, f);
        }

        public final void placeRelative-70tqf50(Placeable placeable0, long v, float f) {
            Intrinsics.checkNotNullParameter(placeable0, "$receiver");
            if(this.getParentLayoutDirection() != LayoutDirection.Ltr && this.getParentWidth() != 0) {
                long v1 = IntOffsetKt.IntOffset(this.getParentWidth() - IntSize.getWidth-impl(placeable0.getMeasuredSize-YbymL2g()) - ((int)(v >> 0x20)), ((int)(v & 0xFFFFFFFFL)));
                long v2 = placeable0.getApparentToRealOffset-nOcc-ac();
                placeable0.placeAt-f8xVGno(IntOffsetKt.IntOffset(((int)(v1 >> 0x20)) + ((int)(v2 >> 0x20)), v1 + v2), f, null);
                return;
            }
            long v3 = placeable0.getApparentToRealOffset-nOcc-ac();
            placeable0.placeAt-f8xVGno(IntOffsetKt.IntOffset(((int)(v >> 0x20)) + ((int)(v3 >> 0x20)), ((int)(v & 0xFFFFFFFFL)) + ((int)(v3 & 0xFFFFFFFFL))), f, null);
        }

        public static void placeRelative-70tqf50$default(PlacementScope placeable$PlacementScope0, Placeable placeable0, long v, float f, int v1, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
            }
            if((v1 & 2) != 0) {
                f = 0.0f;
            }
            placeable$PlacementScope0.placeRelative-70tqf50(placeable0, v, f);
        }

        public final void placeRelativeWithLayer(Placeable placeable0, int v, int v1, float f, Function1 function10) {
            Intrinsics.checkNotNullParameter(placeable0, "<this>");
            Intrinsics.checkNotNullParameter(function10, "layerBlock");
            long v2 = IntOffsetKt.IntOffset(v, v1);
            if(this.getParentLayoutDirection() != LayoutDirection.Ltr && this.getParentWidth() != 0) {
                long v3 = IntOffsetKt.IntOffset(this.getParentWidth() - IntSize.getWidth-impl(placeable0.getMeasuredSize-YbymL2g()) - ((int)(v2 >> 0x20)), ((int)(v2 & 0xFFFFFFFFL)));
                long v4 = placeable0.getApparentToRealOffset-nOcc-ac();
                placeable0.placeAt-f8xVGno(IntOffsetKt.IntOffset(((int)(v3 >> 0x20)) + ((int)(v4 >> 0x20)), ((int)(v3 & 0xFFFFFFFFL)) + ((int)(v4 & 0xFFFFFFFFL))), f, function10);
                return;
            }
            long v5 = placeable0.getApparentToRealOffset-nOcc-ac();
            placeable0.placeAt-f8xVGno(IntOffsetKt.IntOffset(((int)(v2 >> 0x20)) + ((int)(v5 >> 0x20)), ((int)(v2 & 0xFFFFFFFFL)) + ((int)(v5 & 0xFFFFFFFFL))), f, function10);
        }

        public static void placeRelativeWithLayer$default(PlacementScope placeable$PlacementScope0, Placeable placeable0, int v, int v1, float f, Function1 function10, int v2, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if((v2 & 8) != 0) {
                function10 = PlaceableKt.DefaultLayerBlock;
            }
            placeable$PlacementScope0.placeRelativeWithLayer(placeable0, v, v1, ((v2 & 4) == 0 ? f : 0.0f), function10);
        }

        public final void placeRelativeWithLayer-aW-9-wM(Placeable placeable0, long v, float f, Function1 function10) {
            Intrinsics.checkNotNullParameter(placeable0, "$receiver");
            Intrinsics.checkNotNullParameter(function10, "layerBlock");
            if(this.getParentLayoutDirection() != LayoutDirection.Ltr && this.getParentWidth() != 0) {
                long v1 = IntOffsetKt.IntOffset(this.getParentWidth() - IntSize.getWidth-impl(placeable0.getMeasuredSize-YbymL2g()) - ((int)(v >> 0x20)), ((int)(v & 0xFFFFFFFFL)));
                long v2 = placeable0.getApparentToRealOffset-nOcc-ac();
                placeable0.placeAt-f8xVGno(IntOffsetKt.IntOffset(((int)(v1 >> 0x20)) + ((int)(v2 >> 0x20)), ((int)(v1 & 0xFFFFFFFFL)) + ((int)(v2 & 0xFFFFFFFFL))), f, function10);
                return;
            }
            long v3 = placeable0.getApparentToRealOffset-nOcc-ac();
            placeable0.placeAt-f8xVGno(IntOffsetKt.IntOffset(((int)(v >> 0x20)) + ((int)(v3 >> 0x20)), ((int)(v & 0xFFFFFFFFL)) + ((int)(v3 & 0xFFFFFFFFL))), f, function10);
        }

        public static void placeRelativeWithLayer-aW-9-wM$default(PlacementScope placeable$PlacementScope0, Placeable placeable0, long v, float f, Function1 function10, int v1, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if((v1 & 4) != 0) {
                function10 = PlaceableKt.DefaultLayerBlock;
            }
            placeable$PlacementScope0.placeRelativeWithLayer-aW-9-wM(placeable0, v, ((v1 & 2) == 0 ? f : 0.0f), function10);
        }

        public final void placeWithLayer(Placeable placeable0, int v, int v1, float f, Function1 function10) {
            Intrinsics.checkNotNullParameter(placeable0, "<this>");
            Intrinsics.checkNotNullParameter(function10, "layerBlock");
            long v2 = IntOffsetKt.IntOffset(v, v1);
            long v3 = placeable0.getApparentToRealOffset-nOcc-ac();
            placeable0.placeAt-f8xVGno(IntOffsetKt.IntOffset(((int)(v2 >> 0x20)) + ((int)(v3 >> 0x20)), ((int)(v2 & 0xFFFFFFFFL)) + ((int)(v3 & 0xFFFFFFFFL))), f, function10);
        }

        public static void placeWithLayer$default(PlacementScope placeable$PlacementScope0, Placeable placeable0, int v, int v1, float f, Function1 function10, int v2, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if((v2 & 8) != 0) {
                function10 = PlaceableKt.DefaultLayerBlock;
            }
            placeable$PlacementScope0.placeWithLayer(placeable0, v, v1, ((v2 & 4) == 0 ? f : 0.0f), function10);
        }

        public final void placeWithLayer-aW-9-wM(Placeable placeable0, long v, float f, Function1 function10) {
            Intrinsics.checkNotNullParameter(placeable0, "$receiver");
            Intrinsics.checkNotNullParameter(function10, "layerBlock");
            long v1 = placeable0.getApparentToRealOffset-nOcc-ac();
            placeable0.placeAt-f8xVGno(IntOffsetKt.IntOffset(((int)(v >> 0x20)) + ((int)(v1 >> 0x20)), ((int)(v & 0xFFFFFFFFL)) + ((int)(v1 & 0xFFFFFFFFL))), f, function10);
        }

        public static void placeWithLayer-aW-9-wM$default(PlacementScope placeable$PlacementScope0, Placeable placeable0, long v, float f, Function1 function10, int v1, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if((v1 & 4) != 0) {
                function10 = PlaceableKt.DefaultLayerBlock;
            }
            placeable$PlacementScope0.placeWithLayer-aW-9-wM(placeable0, v, ((v1 & 2) == 0 ? f : 0.0f), function10);
        }
    }

    public static final int $stable = 8;
    private int height;
    private long measuredSize;
    private long measurementConstraints;
    private int width;

    static {
    }

    public Placeable() {
        this.measuredSize = 0L;
        this.measurementConstraints = 3L;
    }

    protected final long getApparentToRealOffset-nOcc-ac() {
        return IntOffsetKt.IntOffset((this.width - ((int)(this.getMeasuredSize-YbymL2g() >> 0x20))) / 2, (this.height - ((int)(this.getMeasuredSize-YbymL2g() & 0xFFFFFFFFL))) / 2);
    }

    public final int getHeight() {
        return this.height;
    }

    @Override  // androidx.compose.ui.layout.Measured
    public int getMeasuredHeight() {
        return IntSize.getHeight-impl(this.getMeasuredSize-YbymL2g());
    }

    protected final long getMeasuredSize-YbymL2g() {
        return this.measuredSize;
    }

    @Override  // androidx.compose.ui.layout.Measured
    public int getMeasuredWidth() {
        return (int)(this.getMeasuredSize-YbymL2g() >> 0x20);
    }

    protected final long getMeasurementConstraints-msEJaDk() {
        return this.measurementConstraints;
    }

    public final int getWidth() {
        return this.width;
    }

    protected abstract void placeAt-f8xVGno(long arg1, float arg2, Function1 arg3);

    private final void recalculateWidthAndHeight() {
        this.width = RangesKt.coerceIn(((int)(this.getMeasuredSize-YbymL2g() >> 0x20)), Constraints.getMinWidth-impl(this.getMeasurementConstraints-msEJaDk()), Constraints.getMaxWidth-impl(this.getMeasurementConstraints-msEJaDk()));
        this.height = RangesKt.coerceIn(((int)(this.getMeasuredSize-YbymL2g() & 0xFFFFFFFFL)), Constraints.getMinHeight-impl(this.getMeasurementConstraints-msEJaDk()), Constraints.getMaxHeight-impl(this.getMeasurementConstraints-msEJaDk()));
    }

    protected final void setMeasuredSize-ozmzZPI(long v) {
        if(!IntSize.equals-impl0(this.measuredSize, v)) {
            this.measuredSize = v;
            this.recalculateWidthAndHeight();
        }
    }

    protected final void setMeasurementConstraints-BRTryo0(long v) {
        if(!Constraints.equals-impl0(this.measurementConstraints, v)) {
            this.measurementConstraints = v;
            this.recalculateWidthAndHeight();
        }
    }
}

