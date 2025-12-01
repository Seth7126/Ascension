package androidx.compose.ui.res;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.graphics.vector.compat.XmlVectorParser_androidKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u0018\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u0007H\u0002\u001A$\u0010\b\u001A\u00020\t2\n\u0010\n\u001A\u00060\u000BR\u00020\u00052\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u0007H\u0002\u001A\u0017\u0010\f\u001A\u00020\r2\b\b\u0001\u0010\u0006\u001A\u00020\u0007H\u0007¢\u0006\u0002\u0010\u000E\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000F"}, d2 = {"errorMessage", "", "loadImageBitmapResource", "Landroidx/compose/ui/graphics/ImageBitmap;", "res", "Landroid/content/res/Resources;", "id", "", "loadVectorResource", "Landroidx/compose/ui/graphics/vector/ImageVector;", "theme", "Landroid/content/res/Resources$Theme;", "painterResource", "Landroidx/compose/ui/graphics/painter/Painter;", "(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class PainterResources_androidKt {
    private static final String errorMessage = "Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG";

    private static final ImageBitmap loadImageBitmapResource(Resources resources0, int v) {
        try {
            return ImageResources_androidKt.imageResource(ImageBitmap.Companion, resources0, v);
        }
        catch(Throwable unused_ex) {
            throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG");
        }
    }

    private static final ImageVector loadVectorResource(Resources.Theme resources$Theme0, Resources resources0, int v) {
        XmlResourceParser xmlResourceParser0 = resources0.getXml(v);
        Intrinsics.checkNotNullExpressionValue(xmlResourceParser0, "res.getXml(id)");
        if(!Intrinsics.areEqual(XmlVectorParser_androidKt.seekToStartTag(xmlResourceParser0).getName(), "vector")) {
            throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG");
        }
        return VectorResources_androidKt.loadVectorResourceInner(resources$Theme0, resources0, xmlResourceParser0);
    }

    public static final Painter painterResource(int v, Composer composer0, int v1) {
        Painter painter0;
        composer0.startReplaceableGroup(0xD3FEF586);
        ComposerKt.sourceInformation(composer0, "C(painterResource)56@2348L7,58@2404L25:PainterResources.android.kt#ccshc7");
        ComposerKt.sourceInformationMarkerStart(composer0, 103361330, "C:CompositionLocal.kt#9igjgp");
        Object object0 = composer0.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        ComposerKt.sourceInformationMarkerEnd(composer0);
        Resources resources0 = ((Context)object0).getResources();
        composer0.startReplaceableGroup(0xFFC7BCB7);
        ComposerKt.sourceInformation(composer0, "C(remember):Composables.kt#9igjgp");
        TypedValue typedValue0 = composer0.rememberedValue();
        if(typedValue0 == Composer.Companion.getEmpty()) {
            typedValue0 = new TypedValue();
            composer0.updateRememberedValue(typedValue0);
        }
        composer0.endReplaceableGroup();
        boolean z = true;
        resources0.getValue(v, typedValue0, true);
        CharSequence charSequence0 = typedValue0.string;
        if(charSequence0 == null) {
            z = false;
        }
        else if(!StringsKt.endsWith$default(charSequence0, ".xml", false, 2, null)) {
            z = false;
        }
        if(z) {
            composer0.startReplaceableGroup(0xD3FEF6DD);
            ComposerKt.sourceInformation(composer0, "63@2635L85,66@2729L34");
            composer0.startReplaceableGroup(0xFFC7BF68);
            ComposerKt.sourceInformation(composer0, "C(remember)P(1,2):Composables.kt#9igjgp");
            boolean z1 = composer0.changed(charSequence0);
            boolean z2 = composer0.changed(v);
            ImageVector imageVector0 = composer0.rememberedValue();
            if(z1 || z2 || imageVector0 == Composer.Companion.getEmpty()) {
                Resources.Theme resources$Theme0 = ((Context)object0).getTheme();
                Intrinsics.checkNotNullExpressionValue(resources$Theme0, "context.theme");
                Intrinsics.checkNotNullExpressionValue(resources0, "res");
                imageVector0 = PainterResources_androidKt.loadVectorResource(resources$Theme0, resources0, v);
                composer0.updateRememberedValue(imageVector0);
            }
            composer0.endReplaceableGroup();
            VectorPainter vectorPainter0 = VectorPainterKt.rememberVectorPainter(imageVector0, composer0, 0);
            composer0.endReplaceableGroup();
            painter0 = vectorPainter0;
        }
        else {
            composer0.startReplaceableGroup(0xD3FEF785);
            ComposerKt.sourceInformation(composer0, "69@2849L75");
            composer0.startReplaceableGroup(0xFFC7BF68);
            ComposerKt.sourceInformation(composer0, "C(remember)P(1,2):Composables.kt#9igjgp");
            boolean z3 = composer0.changed(charSequence0);
            boolean z4 = composer0.changed(v);
            ImageBitmap imageBitmap0 = composer0.rememberedValue();
            if(z4 || z3 || imageBitmap0 == Composer.Companion.getEmpty()) {
                Intrinsics.checkNotNullExpressionValue(resources0, "res");
                imageBitmap0 = PainterResources_androidKt.loadImageBitmapResource(resources0, v);
                composer0.updateRememberedValue(imageBitmap0);
            }
            composer0.endReplaceableGroup();
            BitmapPainter bitmapPainter0 = new BitmapPainter(imageBitmap0, 0L, 0L, 6, null);
            composer0.endReplaceableGroup();
            painter0 = bitmapPainter0;
        }
        composer0.endReplaceableGroup();
        return painter0;
    }
}

