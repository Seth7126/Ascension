package androidx.compose.ui.platform.accessibility;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.compose.ui.semantics.CollectionItemInfo;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u0016\u0010\u0004\u001A\u00020\u00012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002\u001A\u0018\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u00072\u0006\u0010\u000B\u001A\u00020\fH\u0000\u001A\u0018\u0010\r\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u00072\u0006\u0010\u000B\u001A\u00020\fH\u0000\u001A\u0014\u0010\u000E\u001A\n \u0010*\u0004\u0018\u00010\u000F0\u000F*\u00020\u0002H\u0002\u001A\u001C\u0010\u0011\u001A\n \u0010*\u0004\u0018\u00010\u00120\u0012*\u00020\u00132\u0006\u0010\u0014\u001A\u00020\u0007H\u0002\"\u0018\u0010\u0000\u001A\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001A\u0004\b\u0000\u0010\u0003¨\u0006\u0015"}, d2 = {"isLazyCollection", "", "Landroidx/compose/ui/semantics/CollectionInfo;", "(Landroidx/compose/ui/semantics/CollectionInfo;)Z", "calculateIfHorizontallyStacked", "items", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "setCollectionInfo", "", "node", "info", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "setCollectionItemInfo", "toAccessibilityCollectionInfo", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat$CollectionInfoCompat;", "kotlin.jvm.PlatformType", "toAccessibilityCollectionItemInfo", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat$CollectionItemInfoCompat;", "Landroidx/compose/ui/semantics/CollectionItemInfo;", "itemNode", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class CollectionInfoKt {
    private static final boolean calculateIfHorizontallyStacked(List list0) {
        long v2;
        List list1;
        if(list0.size() < 2) {
            return true;
        }
        if(list0.size() == 0 || list0.size() == 1) {
            list1 = CollectionsKt.emptyList();
        }
        else {
            list1 = new ArrayList();
            Object object0 = list0.get(0);
            int v = CollectionsKt.getLastIndex(list0);
            if(v > 0) {
                int v1 = 0;
                while(true) {
                    ++v1;
                    Object object1 = list0.get(v1);
                    list1.add(Offset.box-impl(OffsetKt.Offset(Math.abs(Offset.getX-impl(((SemanticsNode)object0).getBoundsInRoot().getCenter-F1C5BW0()) - Offset.getX-impl(((SemanticsNode)object1).getBoundsInRoot().getCenter-F1C5BW0())), Math.abs(Offset.getY-impl(((SemanticsNode)object0).getBoundsInRoot().getCenter-F1C5BW0()) - Offset.getY-impl(((SemanticsNode)object1).getBoundsInRoot().getCenter-F1C5BW0())))));
                    if(v1 >= v) {
                        break;
                    }
                    object0 = object1;
                }
            }
        }
        if(list1.size() == 1) {
            v2 = ((Offset)CollectionsKt.first(list1)).unbox-impl();
        }
        else if(!list1.isEmpty()) {
            Offset offset0 = CollectionsKt.first(list1);
            int v3 = CollectionsKt.getLastIndex(list1);
            if(1 <= v3) {
                for(int v4 = 1; true; ++v4) {
                    offset0 = Offset.box-impl(Offset.plus-MK-Hz9U(offset0.unbox-impl(), ((Offset)list1.get(v4)).unbox-impl()));
                    if(v4 == v3) {
                        break;
                    }
                }
            }
            v2 = offset0.unbox-impl();
        }
        else {
            throw new UnsupportedOperationException("Empty collection can\'t be reduced.");
        }
        float f = Offset.component1-impl(v2);
        return Offset.component2-impl(v2) < f;
    }

    private static final boolean isLazyCollection(CollectionInfo collectionInfo0) {
        return collectionInfo0.getRowCount() < 0 || collectionInfo0.getColumnCount() < 0;
    }

    public static final void setCollectionInfo(SemanticsNode semanticsNode0, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
        Intrinsics.checkNotNullParameter(semanticsNode0, "node");
        Intrinsics.checkNotNullParameter(accessibilityNodeInfoCompat0, "info");
        CollectionInfo collectionInfo0 = (CollectionInfo)SemanticsConfigurationKt.getOrNull(semanticsNode0.getConfig(), SemanticsProperties.INSTANCE.getCollectionInfo());
        if(collectionInfo0 != null) {
            accessibilityNodeInfoCompat0.setCollectionInfo(CollectionInfoKt.toAccessibilityCollectionInfo(collectionInfo0));
            return;
        }
        List list0 = new ArrayList();
        if(SemanticsConfigurationKt.getOrNull(semanticsNode0.getConfig(), SemanticsProperties.INSTANCE.getSelectableGroup()) != null) {
            List list1 = semanticsNode0.getReplacedChildren$ui_release();
            int v = list1.size();
            if(v - 1 >= 0) {
                for(int v1 = 0; true; ++v1) {
                    SemanticsNode semanticsNode1 = (SemanticsNode)list1.get(v1);
                    if(semanticsNode1.getConfig().contains(SemanticsProperties.INSTANCE.getSelected())) {
                        list0.add(semanticsNode1);
                    }
                    if(v1 + 1 > v - 1) {
                        break;
                    }
                }
            }
        }
        int v2 = 1;
        if(!list0.isEmpty() != 0) {
            boolean z = CollectionInfoKt.calculateIfHorizontallyStacked(list0);
            int v3 = z ? 1 : list0.size();
            if(z) {
                v2 = list0.size();
            }
            accessibilityNodeInfoCompat0.setCollectionInfo(CollectionInfoCompat.obtain(v3, v2, false, 0));
        }
    }

    public static final void setCollectionItemInfo(SemanticsNode semanticsNode0, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
        Intrinsics.checkNotNullParameter(semanticsNode0, "node");
        Intrinsics.checkNotNullParameter(accessibilityNodeInfoCompat0, "info");
        CollectionItemInfo collectionItemInfo0 = (CollectionItemInfo)SemanticsConfigurationKt.getOrNull(semanticsNode0.getConfig(), SemanticsProperties.INSTANCE.getCollectionItemInfo());
        if(collectionItemInfo0 != null) {
            accessibilityNodeInfoCompat0.setCollectionItemInfo(CollectionInfoKt.toAccessibilityCollectionItemInfo(collectionItemInfo0, semanticsNode0));
        }
        SemanticsNode semanticsNode1 = semanticsNode0.getParent();
        if(semanticsNode1 == null) {
            return;
        }
        if(SemanticsConfigurationKt.getOrNull(semanticsNode1.getConfig(), SemanticsProperties.INSTANCE.getSelectableGroup()) != null) {
            CollectionInfo collectionInfo0 = (CollectionInfo)SemanticsConfigurationKt.getOrNull(semanticsNode1.getConfig(), SemanticsProperties.INSTANCE.getCollectionInfo());
            if(collectionInfo0 != null && CollectionInfoKt.isLazyCollection(collectionInfo0)) {
                return;
            }
            if(!semanticsNode0.getConfig().contains(SemanticsProperties.INSTANCE.getSelected())) {
                return;
            }
            List list0 = new ArrayList();
            List list1 = semanticsNode1.getReplacedChildren$ui_release();
            int v = list1.size();
            if(v - 1 >= 0) {
                for(int v1 = 0; true; ++v1) {
                    SemanticsNode semanticsNode2 = (SemanticsNode)list1.get(v1);
                    if(semanticsNode2.getConfig().contains(SemanticsProperties.INSTANCE.getSelected())) {
                        list0.add(semanticsNode2);
                    }
                    if(v1 + 1 > v - 1) {
                        break;
                    }
                }
            }
            if(!list0.isEmpty() != 0) {
                boolean z = CollectionInfoKt.calculateIfHorizontallyStacked(list0);
                int v2 = list0.size();
                if(v2 - 1 >= 0) {
                    for(int v3 = 0; true; ++v3) {
                        SemanticsNode semanticsNode3 = (SemanticsNode)list0.get(v3);
                        if(semanticsNode3.getId() == semanticsNode0.getId()) {
                            CollectionItemInfoCompat accessibilityNodeInfoCompat$CollectionItemInfoCompat0 = CollectionItemInfoCompat.obtain((z ? 0 : v3), 1, (z ? v3 : 0), 1, false, ((Boolean)semanticsNode3.getConfig().getOrElse(SemanticsProperties.INSTANCE.getSelected(), androidx.compose.ui.platform.accessibility.CollectionInfoKt.setCollectionItemInfo.2.itemInfo.1.INSTANCE)).booleanValue());
                            if(accessibilityNodeInfoCompat$CollectionItemInfoCompat0 != null) {
                                accessibilityNodeInfoCompat0.setCollectionItemInfo(accessibilityNodeInfoCompat$CollectionItemInfoCompat0);
                            }
                        }
                        if(v3 + 1 > v2 - 1) {
                            break;
                        }
                    }
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u000B\n\u0000\u0010\u0001\u001A\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        final class androidx.compose.ui.platform.accessibility.CollectionInfoKt.setCollectionItemInfo.2.itemInfo.1 extends Lambda implements Function0 {
            public static final androidx.compose.ui.platform.accessibility.CollectionInfoKt.setCollectionItemInfo.2.itemInfo.1 INSTANCE;

            static {
                androidx.compose.ui.platform.accessibility.CollectionInfoKt.setCollectionItemInfo.2.itemInfo.1.INSTANCE = new androidx.compose.ui.platform.accessibility.CollectionInfoKt.setCollectionItemInfo.2.itemInfo.1();
            }

            androidx.compose.ui.platform.accessibility.CollectionInfoKt.setCollectionItemInfo.2.itemInfo.1() {
                super(0);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return false;
            }

            public final boolean invoke() [...] // Inlined contents
        }

    }

    private static final CollectionInfoCompat toAccessibilityCollectionInfo(CollectionInfo collectionInfo0) {
        return CollectionInfoCompat.obtain(collectionInfo0.getRowCount(), collectionInfo0.getColumnCount(), false, 0);
    }

    private static final CollectionItemInfoCompat toAccessibilityCollectionItemInfo(CollectionItemInfo collectionItemInfo0, SemanticsNode semanticsNode0) {
        return CollectionItemInfoCompat.obtain(collectionItemInfo0.getRowIndex(), collectionItemInfo0.getRowSpan(), collectionItemInfo0.getColumnIndex(), collectionItemInfo0.getColumnSpan(), false, ((Boolean)semanticsNode0.getConfig().getOrElse(SemanticsProperties.INSTANCE.getSelected(), androidx.compose.ui.platform.accessibility.CollectionInfoKt.toAccessibilityCollectionItemInfo.1.INSTANCE)).booleanValue());

        @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u000B\n\u0000\u0010\u0001\u001A\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        final class androidx.compose.ui.platform.accessibility.CollectionInfoKt.toAccessibilityCollectionItemInfo.1 extends Lambda implements Function0 {
            public static final androidx.compose.ui.platform.accessibility.CollectionInfoKt.toAccessibilityCollectionItemInfo.1 INSTANCE;

            static {
                androidx.compose.ui.platform.accessibility.CollectionInfoKt.toAccessibilityCollectionItemInfo.1.INSTANCE = new androidx.compose.ui.platform.accessibility.CollectionInfoKt.toAccessibilityCollectionItemInfo.1();
            }

            androidx.compose.ui.platform.accessibility.CollectionInfoKt.toAccessibilityCollectionItemInfo.1() {
                super(0);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return false;
            }

            public final boolean invoke() [...] // Inlined contents
        }

    }
}

