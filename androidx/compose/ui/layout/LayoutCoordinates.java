package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Rect;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0013\u001A\u00020\u00142\u0006\u0010\u0015\u001A\u00020\fH¦\u0002J\u001A\u0010\u0016\u001A\u00020\u00172\u0006\u0010\u0018\u001A\u00020\u00002\b\b\u0002\u0010\u0019\u001A\u00020\u0003H&J%\u0010\u001A\u001A\u00020\u001B2\u0006\u0010\u0018\u001A\u00020\u00002\u0006\u0010\u001C\u001A\u00020\u001BH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001D\u0010\u001EJ\u001D\u0010\u001F\u001A\u00020\u001B2\u0006\u0010 \u001A\u00020\u001BH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"J\u001D\u0010#\u001A\u00020\u001B2\u0006\u0010 \u001A\u00020\u001BH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010\"J\u001D\u0010%\u001A\u00020\u001B2\u0006\u0010&\u001A\u00020\u001BH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\'\u0010\"R\u0012\u0010\u0002\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0002\u0010\u0004R\u0014\u0010\u0005\u001A\u0004\u0018\u00010\u0000X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001A\u0004\u0018\u00010\u0000X¦\u0004¢\u0006\u0006\u001A\u0004\b\t\u0010\u0007R\u0018\u0010\n\u001A\b\u0012\u0004\u0012\u00020\f0\u000BX¦\u0004¢\u0006\u0006\u001A\u0004\b\r\u0010\u000ER\u001B\u0010\u000F\u001A\u00020\u0010X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001A\u0004\b\u0011\u0010\u0012\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Landroidx/compose/ui/layout/LayoutCoordinates;", "", "isAttached", "", "()Z", "parentCoordinates", "getParentCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "parentLayoutCoordinates", "getParentLayoutCoordinates", "providedAlignmentLines", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getProvidedAlignmentLines", "()Ljava/util/Set;", "size", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "()J", "get", "", "alignmentLine", "localBoundingBoxOf", "Landroidx/compose/ui/geometry/Rect;", "sourceCoordinates", "clipBounds", "localPositionOf", "Landroidx/compose/ui/geometry/Offset;", "relativeToSource", "localPositionOf-R5De75A", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)J", "localToRoot", "relativeToLocal", "localToRoot-MK-Hz9U", "(J)J", "localToWindow", "localToWindow-MK-Hz9U", "windowToLocal", "relativeToWindow", "windowToLocal-MK-Hz9U", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface LayoutCoordinates {
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public static final class DefaultImpls {
        public static Rect localBoundingBoxOf$default(LayoutCoordinates layoutCoordinates0, LayoutCoordinates layoutCoordinates1, boolean z, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localBoundingBoxOf");
            }
            if((v & 2) != 0) {
                z = true;
            }
            return layoutCoordinates0.localBoundingBoxOf(layoutCoordinates1, z);
        }
    }

    int get(AlignmentLine arg1);

    LayoutCoordinates getParentCoordinates();

    LayoutCoordinates getParentLayoutCoordinates();

    Set getProvidedAlignmentLines();

    long getSize-YbymL2g();

    boolean isAttached();

    Rect localBoundingBoxOf(LayoutCoordinates arg1, boolean arg2);

    long localPositionOf-R5De75A(LayoutCoordinates arg1, long arg2);

    long localToRoot-MK-Hz9U(long arg1);

    long localToWindow-MK-Hz9U(long arg1);

    long windowToLocal-MK-Hz9U(long arg1);
}

