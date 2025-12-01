package androidx.compose.ui.node;

import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u0010\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0003\u001A\u00020\u0004H\u0000\u001A1\u0010\u0005\u001A\u0002H\u0006\"\b\b\u0000\u0010\u0006*\u00020\u0007*\u00020\b2\u0006\u0010\t\u001A\u00020\u00012\f\u0010\n\u001A\b\u0012\u0004\u0012\u0002H\u00060\u000BH\u0007¢\u0006\u0002\u0010\f\u001A\f\u0010\r\u001A\u00020\u000E*\u00020\bH\u0000\u001A\u000E\u0010\u000F\u001A\u0004\u0018\u00010\u000E*\u00020\bH\u0000\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"viewAdaptersKey", "", "tagKey", "key", "", "getOrAddAdapter", "T", "Landroidx/compose/ui/node/ViewAdapter;", "Landroid/view/View;", "id", "factory", "Lkotlin/Function0;", "(Landroid/view/View;ILkotlin/jvm/functions/Function0;)Landroidx/compose/ui/node/ViewAdapter;", "getViewAdapter", "Landroidx/compose/ui/node/MergedViewAdapter;", "getViewAdapterIfExists", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class ViewInterop_androidKt {
    private static final int viewAdaptersKey;

    static {
        ViewInterop_androidKt.viewAdaptersKey = ViewInterop_androidKt.tagKey("ViewAdapter");
    }

    public static final ViewAdapter getOrAddAdapter(View view0, int v, Function0 function00) {
        Object object1;
        Intrinsics.checkNotNullParameter(view0, "<this>");
        Intrinsics.checkNotNullParameter(function00, "factory");
        MergedViewAdapter mergedViewAdapter0 = ViewInterop_androidKt.getViewAdapter(view0);
        List list0 = mergedViewAdapter0.getAdapters();
        int v1 = list0.size();
        ViewAdapter viewAdapter0 = null;
        if(v1 - 1 >= 0) {
            int v2 = 0;
            while(true) {
                Object object0 = list0.get(v2);
                if(((ViewAdapter)object0).getId() == v) {
                    object1 = object0;
                    goto label_16;
                }
                if(v2 + 1 > v1 - 1) {
                    break;
                }
                ++v2;
            }
        }
        object1 = null;
    label_16:
        if(object1 instanceof ViewAdapter) {
            viewAdapter0 = (ViewAdapter)object1;
        }
        if(viewAdapter0 == null) {
            viewAdapter0 = (ViewAdapter)function00.invoke();
            mergedViewAdapter0.getAdapters().add(viewAdapter0);
        }
        return viewAdapter0;
    }

    public static final MergedViewAdapter getViewAdapter(View view0) {
        Intrinsics.checkNotNullParameter(view0, "<this>");
        int v = ViewInterop_androidKt.viewAdaptersKey;
        Object object0 = view0.getTag(v);
        MergedViewAdapter mergedViewAdapter0 = object0 instanceof MergedViewAdapter ? ((MergedViewAdapter)object0) : null;
        if(mergedViewAdapter0 == null) {
            mergedViewAdapter0 = new MergedViewAdapter();
            view0.setTag(v, mergedViewAdapter0);
        }
        return mergedViewAdapter0;
    }

    public static final MergedViewAdapter getViewAdapterIfExists(View view0) {
        Intrinsics.checkNotNullParameter(view0, "<this>");
        Object object0 = view0.getTag(ViewInterop_androidKt.viewAdaptersKey);
        return object0 instanceof MergedViewAdapter ? ((MergedViewAdapter)object0) : null;
    }

    public static final int tagKey(String s) {
        Intrinsics.checkNotNullParameter(s, "key");
        return s.hashCode() | 0x3000000;
    }
}

