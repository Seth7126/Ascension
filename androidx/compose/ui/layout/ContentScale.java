package androidx.compose.ui.layout;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u0000 \t2\u00020\u0001:\u0001\tJ%\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u0005H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\n"}, d2 = {"Landroidx/compose/ui/layout/ContentScale;", "", "computeScaleFactor", "Landroidx/compose/ui/layout/ScaleFactor;", "srcSize", "Landroidx/compose/ui/geometry/Size;", "dstSize", "computeScaleFactor-H7hwNQA", "(JJ)J", "Companion", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface ContentScale {
    @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001C\u0010\u0003\u001A\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000E\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001A\u0004\b\u0006\u0010\u0007R\u001C\u0010\b\u001A\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000E\n\u0000\u0012\u0004\b\t\u0010\u0002\u001A\u0004\b\n\u0010\u0007R\u001C\u0010\u000B\u001A\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000E\n\u0000\u0012\u0004\b\f\u0010\u0002\u001A\u0004\b\r\u0010\u0007R\u001C\u0010\u000E\u001A\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000E\n\u0000\u0012\u0004\b\u000F\u0010\u0002\u001A\u0004\b\u0010\u0010\u0007R\u001C\u0010\u0011\u001A\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000E\n\u0000\u0012\u0004\b\u0012\u0010\u0002\u001A\u0004\b\u0013\u0010\u0007R\u001C\u0010\u0014\u001A\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000E\n\u0000\u0012\u0004\b\u0015\u0010\u0002\u001A\u0004\b\u0016\u0010\u0007R\u001C\u0010\u0017\u001A\u00020\u00188\u0006X\u0087\u0004¢\u0006\u000E\n\u0000\u0012\u0004\b\u0019\u0010\u0002\u001A\u0004\b\u001A\u0010\u001B¨\u0006\u001C"}, d2 = {"Landroidx/compose/ui/layout/ContentScale$Companion;", "", "()V", "Crop", "Landroidx/compose/ui/layout/ContentScale;", "getCrop$annotations", "getCrop", "()Landroidx/compose/ui/layout/ContentScale;", "FillBounds", "getFillBounds$annotations", "getFillBounds", "FillHeight", "getFillHeight$annotations", "getFillHeight", "FillWidth", "getFillWidth$annotations", "getFillWidth", "Fit", "getFit$annotations", "getFit", "Inside", "getInside$annotations", "getInside", "None", "Landroidx/compose/ui/layout/FixedScale;", "getNone$annotations", "getNone", "()Landroidx/compose/ui/layout/FixedScale;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        static final Companion $$INSTANCE;
        private static final ContentScale Crop;
        private static final ContentScale FillBounds;
        private static final ContentScale FillHeight;
        private static final ContentScale FillWidth;
        private static final ContentScale Fit;
        private static final ContentScale Inside;
        private static final FixedScale None;

        static {
            Companion.$$INSTANCE = new Companion();
            Companion.Crop = new ContentScale.Companion.Crop.1();
            Companion.Fit = new ContentScale.Companion.Fit.1();
            Companion.FillHeight = new ContentScale.Companion.FillHeight.1();
            Companion.FillWidth = new ContentScale.Companion.FillWidth.1();
            Companion.Inside = new ContentScale.Companion.Inside.1();
            Companion.None = new FixedScale(1.0f);
            Companion.FillBounds = new ContentScale.Companion.FillBounds.1();
        }

        public final ContentScale getCrop() {
            return Companion.Crop;
        }

        public static void getCrop$annotations() {
        }

        public final ContentScale getFillBounds() {
            return Companion.FillBounds;
        }

        public static void getFillBounds$annotations() {
        }

        public final ContentScale getFillHeight() {
            return Companion.FillHeight;
        }

        public static void getFillHeight$annotations() {
        }

        public final ContentScale getFillWidth() {
            return Companion.FillWidth;
        }

        public static void getFillWidth$annotations() {
        }

        public final ContentScale getFit() {
            return Companion.Fit;
        }

        public static void getFit$annotations() {
        }

        public final ContentScale getInside() {
            return Companion.Inside;
        }

        public static void getInside$annotations() {
        }

        public final FixedScale getNone() {
            return Companion.None;
        }

        public static void getNone$annotations() {
        }
    }

    public static final Companion Companion;

    static {
        ContentScale.Companion = Companion.$$INSTANCE;
    }

    long computeScaleFactor-H7hwNQA(long arg1, long arg2);
}

