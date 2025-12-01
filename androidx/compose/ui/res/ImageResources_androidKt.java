package androidx.compose.ui.res;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.ImageBitmap.Companion;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001A\u001C\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00042\b\b\u0001\u0010\u0005\u001A\u00020\u0006\u001A\u001B\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0005\u001A\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"imageResource", "Landroidx/compose/ui/graphics/ImageBitmap;", "Landroidx/compose/ui/graphics/ImageBitmap$Companion;", "res", "Landroid/content/res/Resources;", "id", "", "(Landroidx/compose/ui/graphics/ImageBitmap$Companion;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/ImageBitmap;", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class ImageResources_androidKt {
    public static final ImageBitmap imageResource(Companion imageBitmap$Companion0, int v, Composer composer0, int v1) {
        Intrinsics.checkNotNullParameter(imageBitmap$Companion0, "<this>");
        composer0.startReplaceableGroup(0x4B626030);
        ComposerKt.sourceInformation(composer0, "C(imageResource)53@2046L7,54@2070L25,57@2238L54:ImageResources.android.kt#ccshc7");
        ComposerKt.sourceInformationMarkerStart(composer0, 103361330, "C:CompositionLocal.kt#9igjgp");
        Object object0 = composer0.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        ComposerKt.sourceInformationMarkerEnd(composer0);
        composer0.startReplaceableGroup(0xFFC7BCB7);
        ComposerKt.sourceInformation(composer0, "C(remember):Composables.kt#9igjgp");
        TypedValue typedValue0 = composer0.rememberedValue();
        if(typedValue0 == Composer.Companion.getEmpty()) {
            typedValue0 = new TypedValue();
            composer0.updateRememberedValue(typedValue0);
        }
        composer0.endReplaceableGroup();
        ((Context)object0).getResources().getValue(v, typedValue0, true);
        CharSequence charSequence0 = typedValue0.string;
        Intrinsics.checkNotNull(charSequence0);
        composer0.startReplaceableGroup(-3686930);
        ComposerKt.sourceInformation(composer0, "C(remember)P(1):Composables.kt#9igjgp");
        boolean z = composer0.changed(charSequence0.toString());
        ImageBitmap imageBitmap0 = composer0.rememberedValue();
        if(z || imageBitmap0 == Composer.Companion.getEmpty()) {
            Resources resources0 = ((Context)object0).getResources();
            Intrinsics.checkNotNullExpressionValue(resources0, "context.resources");
            imageBitmap0 = ImageResources_androidKt.imageResource(imageBitmap$Companion0, resources0, v);
            composer0.updateRememberedValue(imageBitmap0);
        }
        composer0.endReplaceableGroup();
        composer0.endReplaceableGroup();
        return imageBitmap0;
    }

    public static final ImageBitmap imageResource(Companion imageBitmap$Companion0, Resources resources0, int v) {
        Intrinsics.checkNotNullParameter(imageBitmap$Companion0, "<this>");
        Intrinsics.checkNotNullParameter(resources0, "res");
        Drawable drawable0 = resources0.getDrawable(v, null);
        if(drawable0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        }
        Bitmap bitmap0 = ((BitmapDrawable)drawable0).getBitmap();
        Intrinsics.checkNotNullExpressionValue(bitmap0, "res.getDrawable(id, null) as BitmapDrawable).bitmap");
        return AndroidImageBitmap_androidKt.asImageBitmap(bitmap0);
    }
}

