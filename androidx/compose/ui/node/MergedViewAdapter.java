package androidx.compose.ui.node;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u0010H\u0016J\u0018\u0010\u0011\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u0010H\u0016J1\u0010\u0012\u001A\u0002H\u0013\"\b\b\u0000\u0010\u0013*\u00020\u00012\u0006\u0010\u0007\u001A\u00020\b2\f\u0010\u0014\u001A\b\u0012\u0004\u0012\u0002H\u00130\u0015H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0016J\u0018\u0010\u0017\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u0010H\u0016R\u0017\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001A\u00020\bX\u0096D¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/node/MergedViewAdapter;", "Landroidx/compose/ui/node/ViewAdapter;", "()V", "adapters", "", "getAdapters", "()Ljava/util/List;", "id", "", "getId", "()I", "didInsert", "", "view", "Landroid/view/View;", "parent", "Landroid/view/ViewGroup;", "didUpdate", "get", "T", "factory", "Lkotlin/Function0;", "(ILkotlin/jvm/functions/Function0;)Landroidx/compose/ui/node/ViewAdapter;", "willInsert", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class MergedViewAdapter implements ViewAdapter {
    private final List adapters;
    private final int id;

    public MergedViewAdapter() {
        this.adapters = new ArrayList();
    }

    @Override  // androidx.compose.ui.node.ViewAdapter
    public void didInsert(View view0, ViewGroup viewGroup0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        Intrinsics.checkNotNullParameter(viewGroup0, "parent");
        List list0 = this.adapters;
        int v = list0.size();
        if(v - 1 >= 0) {
            for(int v1 = 0; true; ++v1) {
                ((ViewAdapter)list0.get(v1)).didInsert(view0, viewGroup0);
                if(v1 + 1 > v - 1) {
                    break;
                }
            }
        }
    }

    @Override  // androidx.compose.ui.node.ViewAdapter
    public void didUpdate(View view0, ViewGroup viewGroup0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        Intrinsics.checkNotNullParameter(viewGroup0, "parent");
        List list0 = this.adapters;
        int v = list0.size();
        if(v - 1 >= 0) {
            for(int v1 = 0; true; ++v1) {
                ((ViewAdapter)list0.get(v1)).didUpdate(view0, viewGroup0);
                if(v1 + 1 > v - 1) {
                    break;
                }
            }
        }
    }

    public final ViewAdapter get(int v, Function0 function00) {
        Object object1;
        Intrinsics.checkNotNullParameter(function00, "factory");
        List list0 = this.getAdapters();
        int v1 = list0.size();
        ViewAdapter viewAdapter0 = null;
        if(v1 - 1 >= 0) {
            int v2 = 0;
            while(true) {
                Object object0 = list0.get(v2);
                if(((ViewAdapter)object0).getId() == v) {
                    object1 = object0;
                    goto label_14;
                }
                if(v2 + 1 > v1 - 1) {
                    break;
                }
                ++v2;
            }
        }
        object1 = null;
    label_14:
        if(object1 instanceof ViewAdapter) {
            viewAdapter0 = (ViewAdapter)object1;
        }
        if(viewAdapter0 != null) {
            return viewAdapter0;
        }
        ViewAdapter viewAdapter1 = (ViewAdapter)function00.invoke();
        this.getAdapters().add(viewAdapter1);
        return viewAdapter1;
    }

    public final List getAdapters() {
        return this.adapters;
    }

    @Override  // androidx.compose.ui.node.ViewAdapter
    public int getId() {
        return this.id;
    }

    @Override  // androidx.compose.ui.node.ViewAdapter
    public void willInsert(View view0, ViewGroup viewGroup0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        Intrinsics.checkNotNullParameter(viewGroup0, "parent");
        List list0 = this.adapters;
        int v = list0.size();
        if(v - 1 >= 0) {
            for(int v1 = 0; true; ++v1) {
                ((ViewAdapter)list0.get(v1)).willInsert(view0, viewGroup0);
                if(v1 + 1 > v - 1) {
                    break;
                }
            }
        }
    }
}

