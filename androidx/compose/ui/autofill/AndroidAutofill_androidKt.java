package androidx.compose.ui.autofill;

import android.util.Log;
import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001A\u001A\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001\u001A\u0014\u0010\u0006\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001A\u00020\bH\u0001¨\u0006\t"}, d2 = {"performAutofill", "", "Landroidx/compose/ui/autofill/AndroidAutofill;", "values", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "populateViewStructure", "root", "Landroid/view/ViewStructure;", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class AndroidAutofill_androidKt {
    @ExperimentalComposeUiApi
    public static final void performAutofill(AndroidAutofill androidAutofill0, SparseArray sparseArray0) {
        Intrinsics.checkNotNullParameter(androidAutofill0, "<this>");
        Intrinsics.checkNotNullParameter(sparseArray0, "values");
        int v = sparseArray0.size();
        if(v > 0) {
            int v1 = 0;
            while(true) {
                int v2 = sparseArray0.keyAt(v1);
                AutofillValue autofillValue0 = (AutofillValue)sparseArray0.get(v2);
                Intrinsics.checkNotNullExpressionValue(autofillValue0, "value");
                if(AutofillApi26Helper.INSTANCE.isText(autofillValue0)) {
                    androidAutofill0.getAutofillTree().performAutofill(v2, AutofillApi26Helper.INSTANCE.textValue(autofillValue0).toString());
                }
                else {
                    if(AutofillApi26Helper.INSTANCE.isDate(autofillValue0)) {
                        throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for date");
                    }
                    if(AutofillApi26Helper.INSTANCE.isList(autofillValue0)) {
                        throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for list");
                    }
                    if(!AutofillApi26Helper.INSTANCE.isToggle(autofillValue0)) {
                        goto label_14;
                    }
                    break;
                }
            label_14:
                if(v1 + 1 >= v) {
                    return;
                }
                ++v1;
            }
            throw new NotImplementedError("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
        }
    }

    @ExperimentalComposeUiApi
    public static final void populateViewStructure(AndroidAutofill androidAutofill0, ViewStructure viewStructure0) {
        Intrinsics.checkNotNullParameter(androidAutofill0, "<this>");
        Intrinsics.checkNotNullParameter(viewStructure0, "root");
        int v = AutofillApi23Helper.INSTANCE.addChildCount(viewStructure0, androidAutofill0.getAutofillTree().getChildren().size());
        for(Object object0: androidAutofill0.getAutofillTree().getChildren().entrySet()) {
            int v1 = ((Number)((Map.Entry)object0).getKey()).intValue();
            AutofillNode autofillNode0 = (AutofillNode)((Map.Entry)object0).getValue();
            ViewStructure viewStructure1 = AutofillApi23Helper.INSTANCE.newChild(viewStructure0, v);
            if(viewStructure1 != null) {
                AutofillId autofillId0 = AutofillApi26Helper.INSTANCE.getAutofillId(viewStructure0);
                Intrinsics.checkNotNull(autofillId0);
                AutofillApi26Helper.INSTANCE.setAutofillId(viewStructure1, autofillId0, v1);
                AutofillApi23Helper.INSTANCE.setId(viewStructure1, v1, "com.playdekgames.android.Ascension", null, null);
                AutofillApi26Helper.INSTANCE.setAutofillType(viewStructure1, 1);
                AutofillApi26Helper autofillApi26Helper0 = AutofillApi26Helper.INSTANCE;
                List list0 = autofillNode0.getAutofillTypes();
                ArrayList arrayList0 = new ArrayList(list0.size());
                int v2 = list0.size() - 1;
                if(v2 >= 0) {
                    for(int v3 = 0; true; ++v3) {
                        arrayList0.add(AndroidAutofillType_androidKt.getAndroidType(((AutofillType)list0.get(v3))));
                        if(v3 + 1 > v2) {
                            break;
                        }
                    }
                }
                Object[] arr_object = arrayList0.toArray(new String[0]);
                if(arr_object == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                autofillApi26Helper0.setAutofillHints(viewStructure1, ((String[])arr_object));
                if(autofillNode0.getBoundingBox() == null) {
                    Log.w("Autofill Warning", "Bounding box not set.\n                        Did you call perform autofillTree before the component was positioned? ");
                }
                Rect rect0 = autofillNode0.getBoundingBox();
                if(rect0 != null) {
                    android.graphics.Rect rect1 = RectHelper_androidKt.toAndroidRect(rect0);
                    if(rect1 != null) {
                        int v4 = rect1.left;
                        int v5 = rect1.top;
                        int v6 = rect1.width();
                        int v7 = rect1.height();
                        AutofillApi23Helper.INSTANCE.setDimens(viewStructure1, v4, v5, 0, 0, v6, v7);
                    }
                }
            }
            ++v;
        }
    }
}

