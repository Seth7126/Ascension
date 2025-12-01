package androidx.compose.ui.semantics;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeWrapper;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.RootForTest;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u00A2\u0006\u0002\u0010\u0006J\u0016\u0010B\u001A\u00020C2\f\u0010D\u001A\b\u0012\u0004\u0012\u00020\u00000EH\u0002J6\u0010F\u001A\u00020\u00002\b\u0010G\u001A\u0004\u0018\u00010H2\u0017\u0010I\u001A\u0013\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020C0J\u00A2\u0006\u0002\bLH\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0002\bMJ(\u0010N\u001A\b\u0012\u0004\u0012\u00020\u00000\u000E2\u000E\b\u0002\u0010O\u001A\b\u0012\u0004\u0012\u00020\u00000E2\b\b\u0002\u0010P\u001A\u00020\u0005H\u0002J\b\u0010Q\u001A\u00020RH\u0002J\u000E\u0010S\u001A\u00020\u00172\u0006\u0010T\u001A\u00020UJ\u001E\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u00000\u000E2\u0006\u0010P\u001A\u00020\u00052\u0006\u0010V\u001A\u00020\u0005H\u0002J\u0010\u0010W\u001A\u00020C2\u0006\u0010X\u001A\u00020\u0012H\u0002J\u001D\u0010D\u001A\b\u0012\u0004\u0012\u00020\u00000\u000E2\b\b\u0002\u0010P\u001A\u00020\u0005H\u0000\u00A2\u0006\u0002\bYR\u0011\u0010\u0007\u001A\u00020\b8F\u00A2\u0006\u0006\u001A\u0004\b\t\u0010\nR\u0011\u0010\u000B\u001A\u00020\b8F\u00A2\u0006\u0006\u001A\u0004\b\f\u0010\nR\u0017\u0010\r\u001A\b\u0012\u0004\u0012\u00020\u00000\u000E8F\u00A2\u0006\u0006\u001A\u0004\b\u000F\u0010\u0010R\u0011\u0010\u0011\u001A\u00020\u00128F\u00A2\u0006\u0006\u001A\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001A\u0004\u0018\u00010\u0000X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0011\u0010\u0016\u001A\u00020\u0017\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0018\u0010\u0019R\u001A\u0010\u001A\u001A\u00020\u0005X\u0080\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001B\u0010\u001C\"\u0004\b\u001D\u0010\u001ER\u0014\u0010\u001F\u001A\u00020\u00058BX\u0082\u0004\u00A2\u0006\u0006\u001A\u0004\b\u001F\u0010\u001CR\u0011\u0010 \u001A\u00020\u00058F\u00A2\u0006\u0006\u001A\u0004\b \u0010\u001CR\u0011\u0010!\u001A\u00020\"8F\u00A2\u0006\u0006\u001A\u0004\b#\u0010$R\u0014\u0010%\u001A\u00020&X\u0080\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\'\u0010(R\u0011\u0010\u0004\u001A\u00020\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b)\u0010\u001CR\u0014\u0010\u0002\u001A\u00020\u0003X\u0080\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b*\u0010+R\u0013\u0010,\u001A\u0004\u0018\u00010\u00008F\u00A2\u0006\u0006\u001A\u0004\b-\u0010.R\u001A\u0010/\u001A\u0002008F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0006\u001A\u0004\b1\u00102R\u001A\u00103\u001A\u0002008F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0006\u001A\u0004\b4\u00102R\u001A\u00105\u001A\b\u0012\u0004\u0012\u00020\u00000\u000E8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b6\u0010\u0010R\u001A\u00107\u001A\b\u0012\u0004\u0012\u00020\u00000\u000E8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b8\u0010\u0010R\u0013\u00109\u001A\u0004\u0018\u00010:8F\u00A2\u0006\u0006\u001A\u0004\b;\u0010<R\u001A\u0010=\u001A\u00020>8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0006\u001A\u0004\b?\u00102R\u0014\u0010@\u001A\u00020\u0012X\u0080\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\bA\u0010\u0014\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006Z"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsNode;", "", "outerSemanticsNodeWrapper", "Landroidx/compose/ui/semantics/SemanticsWrapper;", "mergingEnabled", "", "(Landroidx/compose/ui/semantics/SemanticsWrapper;Z)V", "boundsInRoot", "Landroidx/compose/ui/geometry/Rect;", "getBoundsInRoot", "()Landroidx/compose/ui/geometry/Rect;", "boundsInWindow", "getBoundsInWindow", "children", "", "getChildren", "()Ljava/util/List;", "config", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getConfig", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "fakeNodeParent", "id", "", "getId", "()I", "isFake", "isFake$ui_release", "()Z", "setFake$ui_release", "(Z)V", "isMergingSemanticsOfDescendants", "isRoot", "layoutInfo", "Landroidx/compose/ui/layout/LayoutInfo;", "getLayoutInfo", "()Landroidx/compose/ui/layout/LayoutInfo;", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode$ui_release", "()Landroidx/compose/ui/node/LayoutNode;", "getMergingEnabled", "getOuterSemanticsNodeWrapper$ui_release", "()Landroidx/compose/ui/semantics/SemanticsWrapper;", "parent", "getParent", "()Landroidx/compose/ui/semantics/SemanticsNode;", "positionInRoot", "Landroidx/compose/ui/geometry/Offset;", "getPositionInRoot-F1C5BW0", "()J", "positionInWindow", "getPositionInWindow-F1C5BW0", "replacedChildren", "getReplacedChildren$ui_release", "replacedChildrenSortedByBounds", "getReplacedChildrenSortedByBounds$ui_release", "root", "Landroidx/compose/ui/node/RootForTest;", "getRoot", "()Landroidx/compose/ui/node/RootForTest;", "size", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "unmergedConfig", "getUnmergedConfig$ui_release", "emitFakeNodes", "", "unmergedChildren", "", "fakeSemanticsNode", "role", "Landroidx/compose/ui/semantics/Role;", "properties", "Lkotlin/Function1;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "Lkotlin/ExtensionFunctionType;", "fakeSemanticsNode-ypyhhiA", "findOneLayerOfMergingSemanticsNodes", "list", "sortByBounds", "findWrapperToGetBounds", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "getAlignmentLinePosition", "alignmentLine", "Landroidx/compose/ui/layout/AlignmentLine;", "includeReplacedSemantics", "mergeConfig", "mergedConfig", "unmergedChildren$ui_release", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class SemanticsNode {
    public static final int $stable = 8;
    private SemanticsNode fakeNodeParent;
    private final int id;
    private boolean isFake;
    private final LayoutNode layoutNode;
    private final boolean mergingEnabled;
    private final SemanticsWrapper outerSemanticsNodeWrapper;
    private final SemanticsConfiguration unmergedConfig;

    static {
    }

    public SemanticsNode(SemanticsWrapper semanticsWrapper0, boolean z) {
        Intrinsics.checkNotNullParameter(semanticsWrapper0, "outerSemanticsNodeWrapper");
        super();
        this.outerSemanticsNodeWrapper = semanticsWrapper0;
        this.mergingEnabled = z;
        this.unmergedConfig = semanticsWrapper0.collapsedSemanticsConfiguration();
        this.id = ((SemanticsModifier)semanticsWrapper0.getModifier()).getId();
        this.layoutNode = semanticsWrapper0.getLayoutNode$ui_release();
    }

    private final void emitFakeNodes(List list0) {
        Role role0 = SemanticsNodeKt.getRole(this);
        if(role0 != null && this.unmergedConfig.isMergingSemanticsOfDescendants() && !list0.isEmpty() != 0) {
            list0.add(this.fakeSemanticsNode-ypyhhiA(role0, new Function1() {
                final Role $nodeRole;

                {
                    this.$nodeRole = role0;
                    super(1);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.invoke(((SemanticsPropertyReceiver)object0));
                    return Unit.INSTANCE;
                }

                public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
                    Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "$this$fakeSemanticsNode");
                    SemanticsPropertiesKt.setRole-kuIjeqM(semanticsPropertyReceiver0, this.$nodeRole.unbox-impl());
                }
            }));
        }
        if(this.unmergedConfig.contains(SemanticsProperties.INSTANCE.getContentDescription()) && !list0.isEmpty() != 0 && this.unmergedConfig.isMergingSemanticsOfDescendants()) {
            List list1 = (List)SemanticsConfigurationKt.getOrNull(this.unmergedConfig, SemanticsProperties.INSTANCE.getContentDescription());
            String s = list1 == null ? null : ((String)CollectionsKt.firstOrNull(list1));
            if(s != null) {
                list0.add(0, this.fakeSemanticsNode-ypyhhiA(null, new Function1() {
                    final String $contentDescription;

                    {
                        this.$contentDescription = s;
                        super(1);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.invoke(((SemanticsPropertyReceiver)object0));
                        return Unit.INSTANCE;
                    }

                    public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
                        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "$this$fakeSemanticsNode");
                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver0, this.$contentDescription);
                    }
                }));
            }
        }
    }

    private final SemanticsNode fakeSemanticsNode-ypyhhiA(Role role0, Function1 function10) {
        SemanticsNode semanticsNode0 = new SemanticsNode(new SemanticsWrapper(new LayoutNode(true).getInnerLayoutNodeWrapper$ui_release(), new SemanticsModifierCore((role0 == null ? SemanticsNodeKt.contentDescriptionFakeNodeId(this) : SemanticsNodeKt.roleFakeNodeId(this)), false, false, function10)), false);
        semanticsNode0.isFake = true;
        semanticsNode0.fakeNodeParent = this;
        return semanticsNode0;
    }

    private final List findOneLayerOfMergingSemanticsNodes(List list0, boolean z) {
        List list1 = this.unmergedChildren$ui_release(z);
        int v = list1.size();
        if(v - 1 >= 0) {
            for(int v1 = 0; true; ++v1) {
                SemanticsNode semanticsNode0 = (SemanticsNode)list1.get(v1);
                if(semanticsNode0.isMergingSemanticsOfDescendants()) {
                    list0.add(semanticsNode0);
                }
                else if(!semanticsNode0.getUnmergedConfig$ui_release().isClearingSemantics()) {
                    SemanticsNode.findOneLayerOfMergingSemanticsNodes$default(semanticsNode0, list0, false, 2, null);
                }
                if(v1 + 1 > v - 1) {
                    break;
                }
            }
        }
        return list0;
    }

    static List findOneLayerOfMergingSemanticsNodes$default(SemanticsNode semanticsNode0, List list0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            list0 = new ArrayList();
        }
        if((v & 2) != 0) {
            z = false;
        }
        return semanticsNode0.findOneLayerOfMergingSemanticsNodes(list0, z);
    }

    private final LayoutNodeWrapper findWrapperToGetBounds() {
        if(this.unmergedConfig.isMergingSemanticsOfDescendants()) {
            SemanticsWrapper semanticsWrapper0 = SemanticsNodeKt.getOuterMergingSemantics(this.layoutNode);
            return semanticsWrapper0 == null ? this.outerSemanticsNodeWrapper : semanticsWrapper0;
        }
        return this.outerSemanticsNodeWrapper;
    }

    public final int getAlignmentLinePosition(AlignmentLine alignmentLine0) {
        Intrinsics.checkNotNullParameter(alignmentLine0, "alignmentLine");
        return this.findWrapperToGetBounds().get(alignmentLine0);
    }

    public final Rect getBoundsInRoot() {
        return this.layoutNode.isAttached() ? LayoutCoordinatesKt.boundsInRoot(this.findWrapperToGetBounds()) : Rect.Companion.getZero();
    }

    public final Rect getBoundsInWindow() {
        return this.layoutNode.isAttached() ? LayoutCoordinatesKt.boundsInWindow(this.findWrapperToGetBounds()) : Rect.Companion.getZero();
    }

    private final List getChildren(boolean z, boolean z1) {
        if(!z1 && this.unmergedConfig.isClearingSemantics()) {
            return CollectionsKt.emptyList();
        }
        return this.isMergingSemanticsOfDescendants() ? SemanticsNode.findOneLayerOfMergingSemanticsNodes$default(this, null, z, 1, null) : this.unmergedChildren$ui_release(z);
    }

    public final List getChildren() {
        return this.getChildren(false, !this.mergingEnabled);
    }

    public final SemanticsConfiguration getConfig() {
        if(this.isMergingSemanticsOfDescendants()) {
            SemanticsConfiguration semanticsConfiguration0 = this.unmergedConfig.copy();
            this.mergeConfig(semanticsConfiguration0);
            return semanticsConfiguration0;
        }
        return this.unmergedConfig;
    }

    public final int getId() {
        return this.id;
    }

    public final LayoutInfo getLayoutInfo() {
        return this.layoutNode;
    }

    public final LayoutNode getLayoutNode$ui_release() {
        return this.layoutNode;
    }

    public final boolean getMergingEnabled() {
        return this.mergingEnabled;
    }

    public final SemanticsWrapper getOuterSemanticsNodeWrapper$ui_release() {
        return this.outerSemanticsNodeWrapper;
    }

    public final SemanticsNode getParent() {
        SemanticsNode semanticsNode0 = this.fakeNodeParent;
        if(semanticsNode0 != null) {
            return semanticsNode0;
        }
        LayoutNode layoutNode0 = this.mergingEnabled ? SemanticsNodeKt.findClosestParentNode(this.layoutNode, androidx.compose.ui.semantics.SemanticsNode.parent.1.INSTANCE) : null;
        if(layoutNode0 == null) {
            layoutNode0 = SemanticsNodeKt.findClosestParentNode(this.layoutNode, androidx.compose.ui.semantics.SemanticsNode.parent.2.INSTANCE);
        }
        SemanticsWrapper semanticsWrapper0 = layoutNode0 == null ? null : SemanticsNodeKt.getOuterSemantics(layoutNode0);
        return semanticsWrapper0 == null ? null : new SemanticsNode(semanticsWrapper0, this.mergingEnabled);

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\n"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        final class androidx.compose.ui.semantics.SemanticsNode.parent.1 extends Lambda implements Function1 {
            public static final androidx.compose.ui.semantics.SemanticsNode.parent.1 INSTANCE;

            static {
                androidx.compose.ui.semantics.SemanticsNode.parent.1.INSTANCE = new androidx.compose.ui.semantics.SemanticsNode.parent.1();
            }

            androidx.compose.ui.semantics.SemanticsNode.parent.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return Boolean.valueOf(this.invoke(((LayoutNode)object0)));
            }

            public final boolean invoke(LayoutNode layoutNode0) {
                Intrinsics.checkNotNullParameter(layoutNode0, "it");
                SemanticsWrapper semanticsWrapper0 = SemanticsNodeKt.getOuterSemantics(layoutNode0);
                if(semanticsWrapper0 != null) {
                    SemanticsConfiguration semanticsConfiguration0 = semanticsWrapper0.collapsedSemanticsConfiguration();
                    return semanticsConfiguration0 != null && semanticsConfiguration0.isMergingSemanticsOfDescendants();
                }
                return false;
            }
        }


        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\n"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        final class androidx.compose.ui.semantics.SemanticsNode.parent.2 extends Lambda implements Function1 {
            public static final androidx.compose.ui.semantics.SemanticsNode.parent.2 INSTANCE;

            static {
                androidx.compose.ui.semantics.SemanticsNode.parent.2.INSTANCE = new androidx.compose.ui.semantics.SemanticsNode.parent.2();
            }

            androidx.compose.ui.semantics.SemanticsNode.parent.2() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return Boolean.valueOf(this.invoke(((LayoutNode)object0)));
            }

            public final boolean invoke(LayoutNode layoutNode0) {
                Intrinsics.checkNotNullParameter(layoutNode0, "it");
                return SemanticsNodeKt.getOuterSemantics(layoutNode0) != null;
            }
        }

    }

    // 去混淆评级： 低(30)
    public final long getPositionInRoot-F1C5BW0() {
        return this.layoutNode.isAttached() ? LayoutCoordinatesKt.positionInRoot(this.findWrapperToGetBounds()) : 0L;
    }

    // 去混淆评级： 低(30)
    public final long getPositionInWindow-F1C5BW0() {
        return this.layoutNode.isAttached() ? LayoutCoordinatesKt.positionInWindow(this.findWrapperToGetBounds()) : 0L;
    }

    public final List getReplacedChildren$ui_release() {
        return this.getChildren(false, false);
    }

    public final List getReplacedChildrenSortedByBounds$ui_release() {
        return this.getChildren(true, false);
    }

    public final RootForTest getRoot() {
        Owner owner0 = this.layoutNode.getOwner$ui_release();
        return owner0 == null ? null : owner0.getRootForTest();
    }

    public final long getSize-YbymL2g() {
        return this.findWrapperToGetBounds().getSize-YbymL2g();
    }

    public final SemanticsConfiguration getUnmergedConfig$ui_release() {
        return this.unmergedConfig;
    }

    public final boolean isFake$ui_release() {
        return this.isFake;
    }

    // 去混淆评级： 低(20)
    private final boolean isMergingSemanticsOfDescendants() {
        return this.mergingEnabled && this.unmergedConfig.isMergingSemanticsOfDescendants();
    }

    public final boolean isRoot() {
        return this.getParent() == null;
    }

    private final void mergeConfig(SemanticsConfiguration semanticsConfiguration0) {
        if(!this.unmergedConfig.isClearingSemantics()) {
            List list0 = SemanticsNode.unmergedChildren$ui_release$default(this, false, 1, null);
            int v1 = list0.size();
            if(v1 - 1 >= 0) {
                for(int v = 0; true; ++v) {
                    SemanticsNode semanticsNode0 = (SemanticsNode)list0.get(v);
                    if(!semanticsNode0.isFake$ui_release() && !semanticsNode0.isMergingSemanticsOfDescendants()) {
                        semanticsConfiguration0.mergeChild$ui_release(semanticsNode0.getUnmergedConfig$ui_release());
                        semanticsNode0.mergeConfig(semanticsConfiguration0);
                    }
                    if(v + 1 > v1 - 1) {
                        break;
                    }
                }
            }
        }
    }

    public final void setFake$ui_release(boolean z) {
        this.isFake = z;
    }

    public final List unmergedChildren$ui_release(boolean z) {
        if(this.isFake) {
            return CollectionsKt.emptyList();
        }
        List list0 = new ArrayList();
        List list1 = z ? SemanticsSortKt.findOneLayerOfSemanticsWrappersSortedByBounds$default(this.layoutNode, null, 1, null) : SemanticsNodeKt.findOneLayerOfSemanticsWrappers$default(this.layoutNode, null, 1, null);
        int v = list1.size();
        if(v - 1 >= 0) {
            for(int v1 = 0; true; ++v1) {
                list0.add(new SemanticsNode(((SemanticsWrapper)list1.get(v1)), this.getMergingEnabled()));
                if(v1 + 1 > v - 1) {
                    break;
                }
            }
        }
        this.emitFakeNodes(list0);
        return list0;
    }

    public static List unmergedChildren$ui_release$default(SemanticsNode semanticsNode0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        return semanticsNode0.unmergedChildren$ui_release(z);
    }
}

