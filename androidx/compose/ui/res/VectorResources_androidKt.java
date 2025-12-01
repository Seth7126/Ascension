package androidx.compose.ui.res;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.vector.ImageVector.Builder;
import androidx.compose.ui.graphics.vector.ImageVector.Companion;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.compat.XmlVectorParser_androidKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParserException;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001A(\u0010\u0000\u001A\u00020\u00012\u000E\b\u0002\u0010\u0002\u001A\b\u0018\u00010\u0003R\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u0007H\u0000\u001A*\u0010\b\u001A\u00020\u0001*\u00020\t2\u000E\b\u0002\u0010\u0002\u001A\b\u0018\u00010\u0003R\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u000B\u001A\u001B\u0010\b\u001A\u00020\u0001*\u00020\t2\b\b\u0001\u0010\f\u001A\u00020\u000BH\u0007¢\u0006\u0002\u0010\r¨\u0006\u000E"}, d2 = {"loadVectorResourceInner", "Landroidx/compose/ui/graphics/vector/ImageVector;", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "res", "parser", "Landroid/content/res/XmlResourceParser;", "vectorResource", "Landroidx/compose/ui/graphics/vector/ImageVector$Companion;", "resId", "", "id", "(Landroidx/compose/ui/graphics/vector/ImageVector$Companion;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/vector/ImageVector;", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class VectorResources_androidKt {
    public static final ImageVector loadVectorResourceInner(Resources.Theme resources$Theme0, Resources resources0, XmlResourceParser xmlResourceParser0) throws XmlPullParserException {
        Intrinsics.checkNotNullParameter(resources0, "res");
        Intrinsics.checkNotNullParameter(xmlResourceParser0, "parser");
        AttributeSet attributeSet0 = Xml.asAttributeSet(xmlResourceParser0);
        Intrinsics.checkNotNullExpressionValue(attributeSet0, "attrs");
        Builder imageVector$Builder0 = XmlVectorParser_androidKt.createVectorImageBuilder(xmlResourceParser0, resources0, resources$Theme0, attributeSet0);
        int v = 0;
        while(!XmlVectorParser_androidKt.isAtEnd(xmlResourceParser0)) {
            v = XmlVectorParser_androidKt.parseCurrentVectorNode(xmlResourceParser0, resources0, attributeSet0, resources$Theme0, imageVector$Builder0, v);
            xmlResourceParser0.next();
        }
        return imageVector$Builder0.build();
    }

    public static ImageVector loadVectorResourceInner$default(Resources.Theme resources$Theme0, Resources resources0, XmlResourceParser xmlResourceParser0, int v, Object object0) throws XmlPullParserException {
        if((v & 1) != 0) {
            resources$Theme0 = null;
        }
        return VectorResources_androidKt.loadVectorResourceInner(resources$Theme0, resources0, xmlResourceParser0);
    }

    public static final ImageVector vectorResource(Companion imageVector$Companion0, int v, Composer composer0, int v1) {
        Intrinsics.checkNotNullParameter(imageVector$Companion0, "<this>");
        composer0.startReplaceableGroup(0x576FB119);
        ComposerKt.sourceInformation(composer0, "C(vectorResource)44@1790L7,47@1871L59:VectorResources.android.kt#ccshc7");
        ComposerKt.sourceInformationMarkerStart(composer0, 103361330, "C:CompositionLocal.kt#9igjgp");
        Object object0 = composer0.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        ComposerKt.sourceInformationMarkerEnd(composer0);
        Resources resources0 = ((Context)object0).getResources();
        Resources.Theme resources$Theme0 = ((Context)object0).getTheme();
        composer0.startReplaceableGroup(-3686930);
        ComposerKt.sourceInformation(composer0, "C(remember)P(1):Composables.kt#9igjgp");
        boolean z = composer0.changed(v);
        ImageVector imageVector0 = composer0.rememberedValue();
        if(z || imageVector0 == Composer.Companion.getEmpty()) {
            Intrinsics.checkNotNullExpressionValue(resources0, "res");
            imageVector0 = VectorResources_androidKt.vectorResource(imageVector$Companion0, resources$Theme0, resources0, v);
            composer0.updateRememberedValue(imageVector0);
        }
        composer0.endReplaceableGroup();
        composer0.endReplaceableGroup();
        return imageVector0;
    }

    public static final ImageVector vectorResource(Companion imageVector$Companion0, Resources.Theme resources$Theme0, Resources resources0, int v) throws XmlPullParserException {
        Intrinsics.checkNotNullParameter(imageVector$Companion0, "<this>");
        Intrinsics.checkNotNullParameter(resources0, "res");
        XmlResourceParser xmlResourceParser0 = resources0.getXml(v);
        Intrinsics.checkNotNullExpressionValue(xmlResourceParser0, "");
        XmlVectorParser_androidKt.seekToStartTag(xmlResourceParser0);
        Intrinsics.checkNotNullExpressionValue(xmlResourceParser0, "res.getXml(resId).apply { seekToStartTag() }");
        return VectorResources_androidKt.loadVectorResourceInner(resources$Theme0, resources0, xmlResourceParser0);
    }

    public static ImageVector vectorResource$default(Companion imageVector$Companion0, Resources.Theme resources$Theme0, Resources resources0, int v, int v1, Object object0) throws XmlPullParserException {
        if((v1 & 1) != 0) {
            resources$Theme0 = null;
        }
        return VectorResources_androidKt.vectorResource(imageVector$Companion0, resources$Theme0, resources0, v);
    }
}

