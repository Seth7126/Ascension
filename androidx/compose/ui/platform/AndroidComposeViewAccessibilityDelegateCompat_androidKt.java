package androidx.compose.ui.platform;

import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.Region;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsNodeKt;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsWrapper;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001A\u001A\u0010\u0005\u001A\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00062\b\u0010\u0007\u001A\u0004\u0018\u00010\bH\u0002\u001A\f\u0010\t\u001A\u00020\u0001*\u00020\u0002H\u0002\u001A\f\u0010\n\u001A\u00020\u0001*\u00020\u0002H\u0002\u001A\u001C\u0010\u000B\u001A\u0004\u0018\u00010\f*\b\u0012\u0004\u0012\u00020\f0\r2\u0006\u0010\u000E\u001A\u00020\u000FH\u0000\u001A\"\u0010\u0010\u001A\u0004\u0018\u00010\u0011*\u00020\u00112\u0012\u0010\u0012\u001A\u000E\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u0013H\u0002\u001A\u0018\u0010\u0014\u001A\u000E\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u00020\u00160\u0015*\u00020\u0017H\u0000\u001A\f\u0010\u0018\u001A\u00020\u0001*\u00020\u0002H\u0002\u001A\u0014\u0010\u0019\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u001A\u001A\u00020\u001BH\u0002\"\u0018\u0010\u0000\u001A\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001A\u0004\b\u0000\u0010\u0003\"\u0018\u0010\u0004\u001A\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0003¨\u0006\u001C"}, d2 = {"isPassword", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "(Landroidx/compose/ui/semantics/SemanticsNode;)Z", "isTextField", "accessibilityEquals", "Landroidx/compose/ui/semantics/AccessibilityAction;", "other", "", "enabled", "excludeLineAndPageGranularities", "findById", "Landroidx/compose/ui/platform/ScrollObservationScope;", "", "id", "", "findClosestParentNode", "Landroidx/compose/ui/node/LayoutNode;", "selector", "Lkotlin/Function1;", "getAllUncoveredSemanticsNodesToMap", "", "Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;", "Landroidx/compose/ui/semantics/SemanticsOwner;", "hasPaneTitle", "propertiesDeleted", "oldNode", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy;", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class AndroidComposeViewAccessibilityDelegateCompat_androidKt {
    private static final boolean accessibilityEquals(AccessibilityAction accessibilityAction0, Object object0) {
        if(accessibilityAction0 == object0) {
            return true;
        }
        if(!(object0 instanceof AccessibilityAction)) {
            return false;
        }
        if(!Intrinsics.areEqual(accessibilityAction0.getLabel(), ((AccessibilityAction)object0).getLabel())) {
            return false;
        }
        return accessibilityAction0.getAction() != null || ((AccessibilityAction)object0).getAction() == null ? accessibilityAction0.getAction() == null || ((AccessibilityAction)object0).getAction() != null : false;
    }

    private static final boolean enabled(SemanticsNode semanticsNode0) {
        return SemanticsConfigurationKt.getOrNull(semanticsNode0.getConfig(), SemanticsProperties.INSTANCE.getDisabled()) == null;
    }

    private static final boolean excludeLineAndPageGranularities(SemanticsNode semanticsNode0) {
        if(AndroidComposeViewAccessibilityDelegateCompat_androidKt.isTextField(semanticsNode0) && !Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getFocused()), Boolean.TRUE)) {
            return true;
        }
        LayoutNode layoutNode0 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.findClosestParentNode(semanticsNode0.getLayoutNode$ui_release(), androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.excludeLineAndPageGranularities.ancestor.1.INSTANCE);
        if(layoutNode0 != null) {
            SemanticsWrapper semanticsWrapper0 = SemanticsNodeKt.getOuterSemantics(layoutNode0);
            if(semanticsWrapper0 == null) {
                return true;
            }
            SemanticsConfiguration semanticsConfiguration0 = semanticsWrapper0.collapsedSemanticsConfiguration();
            return semanticsConfiguration0 == null ? true : !Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(semanticsConfiguration0, SemanticsProperties.INSTANCE.getFocused()), Boolean.TRUE);
        }
        return false;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\n"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        final class androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.excludeLineAndPageGranularities.ancestor.1 extends Lambda implements Function1 {
            public static final androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.excludeLineAndPageGranularities.ancestor.1 INSTANCE;

            static {
                androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.excludeLineAndPageGranularities.ancestor.1.INSTANCE = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.excludeLineAndPageGranularities.ancestor.1();
            }

            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.excludeLineAndPageGranularities.ancestor.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return Boolean.valueOf(this.invoke(((LayoutNode)object0)));
            }

            public final boolean invoke(LayoutNode layoutNode0) {
                Intrinsics.checkNotNullParameter(layoutNode0, "it");
                SemanticsWrapper semanticsWrapper0 = SemanticsNodeKt.getOuterSemantics(layoutNode0);
                SemanticsConfiguration semanticsConfiguration0 = semanticsWrapper0 == null ? null : semanticsWrapper0.collapsedSemanticsConfiguration();
                if(semanticsConfiguration0 == null) {
                    return false;
                }
                return semanticsConfiguration0.isMergingSemanticsOfDescendants() ? semanticsConfiguration0.contains(SemanticsActions.INSTANCE.getSetText()) : false;
            }
        }

    }

    public static final ScrollObservationScope findById(List list0, int v) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        int v1 = list0.size();
        if(v1 - 1 >= 0) {
            for(int v2 = 0; true; ++v2) {
                if(((ScrollObservationScope)list0.get(v2)).getSemanticsNodeId() == v) {
                    return (ScrollObservationScope)list0.get(v2);
                }
                if(v2 + 1 > v1 - 1) {
                    break;
                }
            }
        }
        return null;
    }

    private static final LayoutNode findClosestParentNode(LayoutNode layoutNode0, Function1 function10) {
        for(LayoutNode layoutNode1 = layoutNode0.getParent$ui_release(); layoutNode1 != null; layoutNode1 = layoutNode1.getParent$ui_release()) {
            if(((Boolean)function10.invoke(layoutNode1)).booleanValue()) {
                return layoutNode1;
            }
        }
        return null;
    }

    public static final Map getAllUncoveredSemanticsNodesToMap(SemanticsOwner semanticsOwner0) {
        Intrinsics.checkNotNullParameter(semanticsOwner0, "<this>");
        SemanticsNode semanticsNode0 = semanticsOwner0.getUnmergedRootSemanticsNode();
        Map map0 = new LinkedHashMap();
        if(!semanticsNode0.getLayoutNode$ui_release().isPlaced()) {
            return map0;
        }
        Region region0 = new Region();
        region0.set(RectHelper_androidKt.toAndroidRect(semanticsNode0.getBoundsInRoot()));
        AndroidComposeViewAccessibilityDelegateCompat_androidKt.getAllUncoveredSemanticsNodesToMap$findAllSemanticNodesRecursive(region0, semanticsNode0, map0, semanticsNode0);
        return map0;
    }

    private static final void getAllUncoveredSemanticsNodesToMap$findAllSemanticNodesRecursive(Region region0, SemanticsNode semanticsNode0, Map map0, SemanticsNode semanticsNode1) {
        if(region0.isEmpty() && semanticsNode1.getId() != semanticsNode0.getId() || !semanticsNode1.getLayoutNode$ui_release().isPlaced() && !semanticsNode1.isFake$ui_release()) {
            return;
        }
        Rect rect0 = RectHelper_androidKt.toAndroidRect(semanticsNode1.getBoundsInRoot());
        Region region1 = new Region();
        region1.set(rect0);
        int v = semanticsNode1.getId() == semanticsNode0.getId() ? -1 : semanticsNode1.getId();
        if(region1.op(region0, region1, Region.Op.INTERSECT)) {
            Rect rect1 = region1.getBounds();
            Intrinsics.checkNotNullExpressionValue(rect1, "region.bounds");
            map0.put(v, new SemanticsNodeWithAdjustedBounds(semanticsNode1, rect1));
            List list0 = semanticsNode1.getReplacedChildren$ui_release();
            int v1 = list0.size() - 1;
            if(v1 >= 0) {
                while(true) {
                    AndroidComposeViewAccessibilityDelegateCompat_androidKt.getAllUncoveredSemanticsNodesToMap$findAllSemanticNodesRecursive(region0, semanticsNode0, map0, ((SemanticsNode)list0.get(v1)));
                    if(v1 - 1 < 0) {
                        break;
                    }
                    --v1;
                }
            }
            region0.op(rect0, region0, Region.Op.REVERSE_DIFFERENCE);
            return;
        }
        if(semanticsNode1.isFake$ui_release()) {
            map0.put(v, new SemanticsNodeWithAdjustedBounds(semanticsNode1, RectHelper_androidKt.toAndroidRect(new androidx.compose.ui.geometry.Rect(0.0f, 0.0f, 10.0f, 10.0f))));
            return;
        }
        if(v == -1) {
            Rect rect2 = region1.getBounds();
            Intrinsics.checkNotNullExpressionValue(rect2, "region.bounds");
            map0.put(-1, new SemanticsNodeWithAdjustedBounds(semanticsNode1, rect2));
        }
    }

    private static final boolean hasPaneTitle(SemanticsNode semanticsNode0) {
        return semanticsNode0.getConfig().contains(SemanticsProperties.INSTANCE.getPaneTitle());
    }

    private static final boolean isPassword(SemanticsNode semanticsNode0) {
        return semanticsNode0.getConfig().contains(SemanticsProperties.INSTANCE.getPassword());
    }

    private static final boolean isTextField(SemanticsNode semanticsNode0) {
        return semanticsNode0.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getSetText());
    }

    private static final boolean propertiesDeleted(SemanticsNode semanticsNode0, SemanticsNodeCopy androidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy0) {
        for(Object object0: androidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy0.getUnmergedConfig()) {
            if(!semanticsNode0.getConfig().contains(((SemanticsPropertyKey)((Map.Entry)object0).getKey()))) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }
}

