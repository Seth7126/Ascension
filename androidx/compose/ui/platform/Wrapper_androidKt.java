package androidx.compose.ui.platform;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.R.id;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.UiApplier;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u0018\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\tH\u0001\u001A0\u0010\n\u001A\u00020\u00052\u0006\u0010\u000B\u001A\u00020\f2\u0006\u0010\b\u001A\u00020\t2\u0011\u0010\r\u001A\r\u0012\u0004\u0012\u00020\u000F0\u000E¢\u0006\u0002\b\u0010H\u0002¢\u0006\u0002\u0010\u0011\u001A\b\u0010\u0012\u001A\u00020\u000FH\u0002\u001A\u0010\u0010\u0013\u001A\u00020\u00142\u0006\u0010\u000B\u001A\u00020\fH\u0002\u001A,\u0010\u0015\u001A\u00020\u0005*\u00020\u00162\u0006\u0010\b\u001A\u00020\t2\u0011\u0010\r\u001A\r\u0012\u0004\u0012\u00020\u000F0\u000E¢\u0006\u0002\b\u0010H\u0000¢\u0006\u0002\u0010\u0017\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000E\u0010\u0002\u001A\u00020\u0003X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"DefaultLayoutParams", "Landroid/view/ViewGroup$LayoutParams;", "TAG", "", "createSubcomposition", "Landroidx/compose/runtime/Composition;", "container", "Landroidx/compose/ui/node/LayoutNode;", "parent", "Landroidx/compose/runtime/CompositionContext;", "doSetContent", "owner", "Landroidx/compose/ui/platform/AndroidComposeView;", "content", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/Composition;", "enableDebugInspectorInfo", "inspectionWanted", "", "setContent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/Composition;", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class Wrapper_androidKt {
    private static final ViewGroup.LayoutParams DefaultLayoutParams = null;
    private static final String TAG = "Wrapper";

    static {
        Wrapper_androidKt.DefaultLayoutParams = new ViewGroup.LayoutParams(-2, -2);
    }

    public static final Composition createSubcomposition(LayoutNode layoutNode0, CompositionContext compositionContext0) {
        Intrinsics.checkNotNullParameter(layoutNode0, "container");
        Intrinsics.checkNotNullParameter(compositionContext0, "parent");
        return CompositionKt.Composition(new UiApplier(layoutNode0), compositionContext0);
    }

    private static final Composition doSetContent(AndroidComposeView androidComposeView0, CompositionContext compositionContext0, Function2 function20) {
        if(Wrapper_androidKt.inspectionWanted(androidComposeView0)) {
            Set set0 = Collections.newSetFromMap(new WeakHashMap());
            androidComposeView0.setTag(id.inspection_slot_table_set, set0);
            Wrapper_androidKt.enableDebugInspectorInfo();
        }
        Composition composition0 = CompositionKt.Composition(new UiApplier(androidComposeView0.getRoot()), compositionContext0);
        Object object0 = androidComposeView0.getTag(id.wrapped_composition_tag);
        WrappedComposition wrappedComposition0 = object0 instanceof WrappedComposition ? ((WrappedComposition)object0) : null;
        if(wrappedComposition0 == null) {
            wrappedComposition0 = new WrappedComposition(androidComposeView0, composition0);
            androidComposeView0.setTag(id.wrapped_composition_tag, wrappedComposition0);
        }
        wrappedComposition0.setContent(function20);
        return wrappedComposition0;
    }

    private static final void enableDebugInspectorInfo() {
        try {
            InspectableValueKt.class.getDeclaredField("isDebugInspectorInfoEnabled").setAccessible(true);
            InspectableValueKt.isDebugInspectorInfoEnabled = true;
        }
        catch(Exception unused_ex) {
            Log.w("Wrapper", "Could not access isDebugInspectorInfoEnabled. Please set explicitly.");
        }
    }

    private static final boolean inspectionWanted(AndroidComposeView androidComposeView0) {
        return Build.VERSION.SDK_INT >= 29 && !WrapperVerificationHelperMethods.INSTANCE.attributeSourceResourceMap(androidComposeView0).isEmpty() != 0;
    }

    public static final Composition setContent(ViewGroup viewGroup0, CompositionContext compositionContext0, Function2 function20) {
        Intrinsics.checkNotNullParameter(viewGroup0, "<this>");
        Intrinsics.checkNotNullParameter(compositionContext0, "parent");
        Intrinsics.checkNotNullParameter(function20, "content");
        GlobalSnapshotManager.INSTANCE.ensureStarted();
        AndroidComposeView androidComposeView0 = null;
        if(viewGroup0.getChildCount() > 0) {
            View view0 = viewGroup0.getChildAt(0);
            if(view0 instanceof AndroidComposeView) {
                androidComposeView0 = (AndroidComposeView)view0;
            }
        }
        else {
            viewGroup0.removeAllViews();
        }
        if(androidComposeView0 == null) {
            Context context0 = viewGroup0.getContext();
            Intrinsics.checkNotNullExpressionValue(context0, "context");
            androidComposeView0 = new AndroidComposeView(context0);
            viewGroup0.addView(androidComposeView0, Wrapper_androidKt.DefaultLayoutParams);
        }
        return Wrapper_androidKt.doSetContent(androidComposeView0, compositionContext0, function20);
    }
}

