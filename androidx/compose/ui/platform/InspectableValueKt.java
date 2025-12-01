package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u001E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0006\u001A8\u0010\f\u001A\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u0019\b\u0004\u0010\r\u001A\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086\bø\u0001\u0000\"\"\u0010\u0000\u001A\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006\"\u001A\u0010\u0007\u001A\u00020\bX\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000B\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000E"}, d2 = {"NoInspectorInfo", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "getNoInspectorInfo", "()Lkotlin/jvm/functions/Function1;", "isDebugInspectorInfoEnabled", "", "()Z", "setDebugInspectorInfoEnabled", "(Z)V", "debugInspectorInfo", "definitions", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class InspectableValueKt {
    private static final Function1 NoInspectorInfo;
    private static boolean isDebugInspectorInfoEnabled;

    static {
        InspectableValueKt.NoInspectorInfo = InspectableValueKt.NoInspectorInfo.1.INSTANCE;
    }

    public static final Function1 debugInspectorInfo(Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "definitions");
        return InspectableValueKt.getNoInspectorInfo();

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001A\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/compose/ui/platform/InspectorInfo;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public final class androidx.compose.ui.platform.InspectableValueKt.debugInspectorInfo.1 extends Lambda implements Function1 {
            final Function1 $definitions;

            public androidx.compose.ui.platform.InspectableValueKt.debugInspectorInfo.1(Function1 function10) {
                this.$definitions = function10;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(InspectorInfo inspectorInfo0) {
                Intrinsics.checkNotNullParameter(inspectorInfo0, "$this$null");
                this.$definitions.invoke(inspectorInfo0);
            }
        }

    }

    public static final Function1 getNoInspectorInfo() {
        return InspectableValueKt.NoInspectorInfo;
    }

    public static final boolean isDebugInspectorInfoEnabled() [...] // 潜在的解密器

    public static final void setDebugInspectorInfoEnabled(boolean z) {
        InspectableValueKt.isDebugInspectorInfoEnabled = z;
    }
}

