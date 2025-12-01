package androidx.compose.ui.text.android;

import android.os.Build.VERSION;
import android.text.StaticLayout.Builder;
import android.text.StaticLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/android/StaticLayoutFactory23;", "Landroidx/compose/ui/text/android/StaticLayoutFactoryImpl;", "()V", "create", "Landroid/text/StaticLayout;", "params", "Landroidx/compose/ui/text/android/StaticLayoutParams;", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
final class StaticLayoutFactory23 implements StaticLayoutFactoryImpl {
    @Override  // androidx.compose.ui.text.android.StaticLayoutFactoryImpl
    public StaticLayout create(StaticLayoutParams staticLayoutParams0) {
        Intrinsics.checkNotNullParameter(staticLayoutParams0, "params");
        StaticLayout.Builder staticLayout$Builder0 = StaticLayout.Builder.obtain(staticLayoutParams0.getText(), staticLayoutParams0.getStart(), staticLayoutParams0.getEnd(), staticLayoutParams0.getPaint(), staticLayoutParams0.getWidth());
        staticLayout$Builder0.setTextDirection(staticLayoutParams0.getTextDir());
        staticLayout$Builder0.setAlignment(staticLayoutParams0.getAlignment());
        staticLayout$Builder0.setMaxLines(staticLayoutParams0.getMaxLines());
        staticLayout$Builder0.setEllipsize(staticLayoutParams0.getEllipsize());
        staticLayout$Builder0.setEllipsizedWidth(staticLayoutParams0.getEllipsizedWidth());
        staticLayout$Builder0.setLineSpacing(staticLayoutParams0.getLineSpacingExtra(), staticLayoutParams0.getLineSpacingMultiplier());
        staticLayout$Builder0.setIncludePad(staticLayoutParams0.getIncludePadding());
        staticLayout$Builder0.setBreakStrategy(staticLayoutParams0.getBreakStrategy());
        staticLayout$Builder0.setHyphenationFrequency(staticLayoutParams0.getHyphenationFrequency());
        staticLayout$Builder0.setIndents(staticLayoutParams0.getLeftIndents(), staticLayoutParams0.getRightIndents());
        if(Build.VERSION.SDK_INT >= 26) {
            Intrinsics.checkNotNullExpressionValue(staticLayout$Builder0, "this");
            StaticLayoutFactory26.INSTANCE.setJustificationMode(staticLayout$Builder0, staticLayoutParams0.getJustificationMode());
        }
        if(Build.VERSION.SDK_INT >= 28) {
            Intrinsics.checkNotNullExpressionValue(staticLayout$Builder0, "this");
            StaticLayoutFactory28.INSTANCE.setUseLineSpacingFromFallbacks(staticLayout$Builder0, staticLayoutParams0.getUseFallbackLineSpacing());
        }
        StaticLayout staticLayout0 = staticLayout$Builder0.build();
        Intrinsics.checkNotNullExpressionValue(staticLayout0, "obtain(params.text, params.start, params.end, params.paint, params.width)\n            .apply {\n                setTextDirection(params.textDir)\n                setAlignment(params.alignment)\n                setMaxLines(params.maxLines)\n                setEllipsize(params.ellipsize)\n                setEllipsizedWidth(params.ellipsizedWidth)\n                setLineSpacing(params.lineSpacingExtra, params.lineSpacingMultiplier)\n                setIncludePad(params.includePadding)\n                setBreakStrategy(params.breakStrategy)\n                setHyphenationFrequency(params.hyphenationFrequency)\n                setIndents(params.leftIndents, params.rightIndents)\n                if (Build.VERSION.SDK_INT >= 26) {\n                    StaticLayoutFactory26.setJustificationMode(this, params.justificationMode)\n                }\n                if (Build.VERSION.SDK_INT >= 28) {\n                    StaticLayoutFactory28.setUseLineSpacingFromFallbacks(\n                        this,\n                        params.useFallbackLineSpacing\n                    )\n                }\n            }.build()");
        return staticLayout0;
    }
}

