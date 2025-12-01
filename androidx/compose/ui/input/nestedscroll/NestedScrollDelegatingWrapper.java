package androidx.compose.ui.input.nestedscroll;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier.Element;
import androidx.compose.ui.node.DelegatingLayoutNodeWrapper;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeWrapper;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012\u0006\u0010\u0005\u001A\u00020\u0002¢\u0006\u0002\u0010\u0006J\b\u0010\u001D\u001A\u00020\u001EH\u0016J\b\u0010\u001F\u001A\u00020\u001EH\u0016J\b\u0010 \u001A\u00020\u0000H\u0016J\b\u0010!\u001A\u00020\u0000H\u0016J\u0016\u0010\"\u001A\u00020\u001E2\f\u0010#\u001A\b\u0012\u0004\u0012\u00020$0\u0018H\u0002J\b\u0010%\u001A\u00020\u001EH\u0016J\u0012\u0010&\u001A\u00020\u001E2\b\u0010\'\u001A\u0004\u0018\u00010\u0019H\u0002J\b\u0010(\u001A\u00020\u001EH\u0002R\u000E\u0010\u0007\u001A\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R4\u0010\f\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u000B0\n2\u000E\u0010\t\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u000B0\n8B@BX\u0082\u000E¢\u0006\f\u001A\u0004\b\r\u0010\u000E\"\u0004\b\u000F\u0010\u0010R\u0010\u0010\u0011\u001A\u0004\u0018\u00010\u0002X\u0082\u000E¢\u0006\u0002\n\u0000R$\u0010\u0012\u001A\u00020\u00022\u0006\u0010\t\u001A\u00020\u00028V@VX\u0096\u000E¢\u0006\f\u001A\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\u00000\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u001A\u001A\u0004\u0018\u00010\u00192\b\u0010\t\u001A\u0004\u0018\u00010\u0019@BX\u0082\u000E¢\u0006\b\n\u0000\"\u0004\b\u001B\u0010\u001C¨\u0006)"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;", "Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;", "wrapped", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "nestedScrollModifier", "(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;)V", "childScrollConnection", "Landroidx/compose/ui/input/nestedscroll/ParentWrapperNestedScrollConnection;", "value", "Lkotlin/Function0;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScopeEvaluation", "getCoroutineScopeEvaluation", "()Lkotlin/jvm/functions/Function0;", "setCoroutineScopeEvaluation", "(Lkotlin/jvm/functions/Function0;)V", "lastModifier", "modifier", "getModifier", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;", "setModifier", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;)V", "nestedScrollChildrenResult", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "parentConnection", "setParentConnection", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;)V", "attach", "", "detach", "findNextNestedScrollWrapper", "findPreviousNestedScrollWrapper", "loopChildrenForNestedScroll", "children", "Landroidx/compose/ui/node/LayoutNode;", "onModifierChanged", "refreshChildrenWithParentConnection", "newParent", "refreshSelfIfNeeded", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class NestedScrollDelegatingWrapper extends DelegatingLayoutNodeWrapper {
    private final ParentWrapperNestedScrollConnection childScrollConnection;
    private NestedScrollModifier lastModifier;
    private final MutableVector nestedScrollChildrenResult;
    private NestedScrollConnection parentConnection;

    public NestedScrollDelegatingWrapper(LayoutNodeWrapper layoutNodeWrapper0, NestedScrollModifier nestedScrollModifier0) {
        Intrinsics.checkNotNullParameter(layoutNodeWrapper0, "wrapped");
        Intrinsics.checkNotNullParameter(nestedScrollModifier0, "nestedScrollModifier");
        super(layoutNodeWrapper0, nestedScrollModifier0);
        this.childScrollConnection = new ParentWrapperNestedScrollConnection((this.parentConnection == null ? NestedScrollDelegatingWrapperKt.NoOpConnection : this.parentConnection), nestedScrollModifier0.getConnection());
        this.nestedScrollChildrenResult = new MutableVector(new NestedScrollDelegatingWrapper[16], 0);
    }

    @Override  // androidx.compose.ui.node.LayoutNodeWrapper
    public void attach() {
        super.attach();
        this.refreshSelfIfNeeded();
    }

    @Override  // androidx.compose.ui.node.LayoutNodeWrapper
    public void detach() {
        super.detach();
        this.refreshChildrenWithParentConnection(this.parentConnection);
        this.lastModifier = null;
    }

    @Override  // androidx.compose.ui.node.DelegatingLayoutNodeWrapper
    public NestedScrollDelegatingWrapper findNextNestedScrollWrapper() {
        return this;
    }

    @Override  // androidx.compose.ui.node.DelegatingLayoutNodeWrapper
    public NestedScrollDelegatingWrapper findPreviousNestedScrollWrapper() {
        return this;
    }

    private final Function0 getCoroutineScopeEvaluation() {
        return this.getModifier().getDispatcher().getCalculateNestedScrollScope$ui_release();
    }

    @Override  // androidx.compose.ui.node.DelegatingLayoutNodeWrapper
    public Element getModifier() {
        return this.getModifier();
    }

    public NestedScrollModifier getModifier() {
        return (NestedScrollModifier)super.getModifier();
    }

    private final void loopChildrenForNestedScroll(MutableVector mutableVector0) {
        int v = mutableVector0.getSize();
        if(v > 0) {
            Object[] arr_object = mutableVector0.getContent();
            int v1 = 0;
            while(true) {
                LayoutNode layoutNode0 = (LayoutNode)arr_object[v1];
                NestedScrollDelegatingWrapper nestedScrollDelegatingWrapper0 = layoutNode0.getOuterLayoutNodeWrapper$ui_release().findNextNestedScrollWrapper();
                if(nestedScrollDelegatingWrapper0 == null) {
                    this.loopChildrenForNestedScroll(layoutNode0.get_children$ui_release());
                }
                else {
                    this.nestedScrollChildrenResult.add(nestedScrollDelegatingWrapper0);
                }
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
    }

    @Override  // androidx.compose.ui.node.LayoutNodeWrapper
    public void onModifierChanged() {
        super.onModifierChanged();
        NestedScrollConnection nestedScrollConnection0 = this.getModifier().getConnection();
        this.childScrollConnection.setSelf(nestedScrollConnection0);
        this.getModifier().getDispatcher().setParent$ui_release(this.parentConnection);
        this.refreshSelfIfNeeded();
    }

    private final void refreshChildrenWithParentConnection(NestedScrollConnection nestedScrollConnection0) {
        this.nestedScrollChildrenResult.clear();
        NestedScrollDelegatingWrapper nestedScrollDelegatingWrapper0 = this.getWrapped$ui_release().findNextNestedScrollWrapper();
        if(nestedScrollDelegatingWrapper0 == null) {
            this.loopChildrenForNestedScroll(this.getLayoutNode$ui_release().get_children$ui_release());
        }
        else {
            this.nestedScrollChildrenResult.add(nestedScrollDelegatingWrapper0);
        }
        int v = 0;
        NestedScrollDelegatingWrapper nestedScrollDelegatingWrapper1 = this.nestedScrollChildrenResult.isNotEmpty() ? ((NestedScrollDelegatingWrapper)this.nestedScrollChildrenResult.getContent()[0]) : null;
        MutableVector mutableVector0 = this.nestedScrollChildrenResult;
        int v1 = mutableVector0.getSize();
        if(v1 > 0) {
            Object[] arr_object = mutableVector0.getContent();
            while(true) {
                NestedScrollDelegatingWrapper nestedScrollDelegatingWrapper2 = (NestedScrollDelegatingWrapper)arr_object[v];
                nestedScrollDelegatingWrapper2.setParentConnection(nestedScrollConnection0);
                Function0 function00 = nestedScrollConnection0 == null ? new Function0() {
                    final NestedScrollDelegatingWrapper $outerChild;

                    {
                        this.$outerChild = nestedScrollDelegatingWrapper0;
                        super(0);
                    }

                    @Override  // kotlin.jvm.functions.Function0
                    public Object invoke() {
                        return this.invoke();
                    }

                    public final CoroutineScope invoke() {
                        NestedScrollDelegatingWrapper nestedScrollDelegatingWrapper0 = this.$outerChild;
                        if(nestedScrollDelegatingWrapper0 != null) {
                            NestedScrollDispatcher nestedScrollDispatcher0 = nestedScrollDelegatingWrapper0.getModifier().getDispatcher();
                            return nestedScrollDispatcher0 == null ? null : nestedScrollDispatcher0.getOriginNestedScrollScope$ui_release();
                        }
                        return null;
                    }
                } : new Function0() {
                    {
                        NestedScrollDelegatingWrapper.this = nestedScrollDelegatingWrapper0;
                        super(0);
                    }

                    @Override  // kotlin.jvm.functions.Function0
                    public Object invoke() {
                        return this.invoke();
                    }

                    public final CoroutineScope invoke() {
                        return (CoroutineScope)NestedScrollDelegatingWrapper.this.getCoroutineScopeEvaluation().invoke();
                    }
                };
                nestedScrollDelegatingWrapper2.setCoroutineScopeEvaluation(function00);
                ++v;
                if(v >= v1) {
                    break;
                }
            }
        }
    }

    private final void refreshSelfIfNeeded() {
        NestedScrollModifier nestedScrollModifier0 = this.lastModifier;
        if((nestedScrollModifier0 == null || nestedScrollModifier0.getConnection() != this.getModifier().getConnection() || nestedScrollModifier0.getDispatcher() != this.getModifier().getDispatcher()) && this.isAttached()) {
            NestedScrollDelegatingWrapper nestedScrollDelegatingWrapper0 = super.findPreviousNestedScrollWrapper();
            this.setParentConnection((nestedScrollDelegatingWrapper0 == null ? null : nestedScrollDelegatingWrapper0.childScrollConnection));
            this.setCoroutineScopeEvaluation((nestedScrollDelegatingWrapper0 == null ? this.getCoroutineScopeEvaluation() : nestedScrollDelegatingWrapper0.getCoroutineScopeEvaluation()));
            this.refreshChildrenWithParentConnection(this.childScrollConnection);
            this.lastModifier = this.getModifier();
        }
    }

    private final void setCoroutineScopeEvaluation(Function0 function00) {
        this.getModifier().getDispatcher().setCalculateNestedScrollScope$ui_release(function00);
    }

    @Override  // androidx.compose.ui.node.DelegatingLayoutNodeWrapper
    public void setModifier(Element modifier$Element0) {
        this.setModifier(((NestedScrollModifier)modifier$Element0));
    }

    public void setModifier(NestedScrollModifier nestedScrollModifier0) {
        Intrinsics.checkNotNullParameter(nestedScrollModifier0, "value");
        this.lastModifier = (NestedScrollModifier)super.getModifier();
        super.setModifier(nestedScrollModifier0);
    }

    private final void setParentConnection(NestedScrollConnection nestedScrollConnection0) {
        this.getModifier().getDispatcher().setParent$ui_release(nestedScrollConnection0);
        this.childScrollConnection.setParent((nestedScrollConnection0 == null ? NestedScrollDelegatingWrapperKt.NoOpConnection : nestedScrollConnection0));
        this.parentConnection = nestedScrollConnection0;
    }
}

