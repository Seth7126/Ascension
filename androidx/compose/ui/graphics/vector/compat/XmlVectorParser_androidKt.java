package androidx.compose.ui.graphics.vector.compat;

import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.BrushKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.vector.ImageVector.Builder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.content.res.ComplexColorCompat;
import androidx.core.content.res.TypedArrayUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u001A\'\u0010\f\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\u00012\b\b\u0002\u0010\u000F\u001A\u00020\rH\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u0010\u0010\u0011\u001A\'\u0010\u0012\u001A\u00020\u00132\u0006\u0010\u000E\u001A\u00020\u00012\b\b\u0002\u0010\u000F\u001A\u00020\u0013H\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u0014\u0010\u0011\u001A\u0012\u0010\u0015\u001A\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001A\u00020\u0018H\u0002\u001A*\u0010\u0019\u001A\u00020\u001A*\u00020\u001B2\u0006\u0010\u001C\u001A\u00020\u001D2\f\u0010\u001E\u001A\b\u0018\u00010\u001FR\u00020\u001D2\u0006\u0010 \u001A\u00020!H\u0000\u001A\f\u0010\"\u001A\u00020#*\u00020\u001BH\u0000\u001A2\u0010$\u001A\u00020%*\u00020\u001B2\u0006\u0010\u001C\u001A\u00020\u001D2\f\u0010\u001E\u001A\b\u0018\u00010\u001FR\u00020\u001D2\u0006\u0010 \u001A\u00020!2\u0006\u0010&\u001A\u00020\u001AH\u0000\u001A<\u0010\'\u001A\u00020\u0001*\u00020\u001B2\u0006\u0010\u001C\u001A\u00020\u001D2\u0006\u0010 \u001A\u00020!2\u000E\b\u0002\u0010\u001E\u001A\b\u0018\u00010\u001FR\u00020\u001D2\u0006\u0010&\u001A\u00020\u001A2\u0006\u0010(\u001A\u00020\u0001H\u0000\u001A2\u0010)\u001A\u00020%*\u00020\u001B2\u0006\u0010\u001C\u001A\u00020\u001D2\f\u0010\u001E\u001A\b\u0018\u00010\u001FR\u00020\u001D2\u0006\u0010 \u001A\u00020!2\u0006\u0010&\u001A\u00020\u001AH\u0000\u001A2\u0010*\u001A\u00020%*\u00020\u001B2\u0006\u0010\u001C\u001A\u00020\u001D2\f\u0010\u001E\u001A\b\u0018\u00010\u001FR\u00020\u001D2\u0006\u0010 \u001A\u00020!2\u0006\u0010&\u001A\u00020\u001AH\u0000\u001A\f\u0010+\u001A\u00020\u001B*\u00020\u001BH\u0000\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0082D\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u0002\u001A\u00020\u0001X\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u0003\u001A\u00020\u0001X\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u0004\u001A\u00020\u0001X\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u0005\u001A\u00020\u0001X\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u0006\u001A\u00020\u0001X\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u0007\u001A\u00020\u0001X\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\b\u001A\u00020\tX\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\n\u001A\u00020\tX\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u000B\u001A\u00020\tX\u0082T\u00A2\u0006\u0002\n\u0000\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006,"}, d2 = {"FILL_TYPE_WINDING", "", "LINECAP_BUTT", "LINECAP_ROUND", "LINECAP_SQUARE", "LINEJOIN_BEVEL", "LINEJOIN_MITER", "LINEJOIN_ROUND", "SHAPE_CLIP_PATH", "", "SHAPE_GROUP", "SHAPE_PATH", "getStrokeLineCap", "Landroidx/compose/ui/graphics/StrokeCap;", "id", "defValue", "getStrokeLineCap-CSYIeUk", "(II)I", "getStrokeLineJoin", "Landroidx/compose/ui/graphics/StrokeJoin;", "getStrokeLineJoin-kLtJ_vA", "obtainBrushFromComplexColor", "Landroidx/compose/ui/graphics/Brush;", "complexColor", "Landroidx/core/content/res/ComplexColorCompat;", "createVectorImageBuilder", "Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "Lorg/xmlpull/v1/XmlPullParser;", "res", "Landroid/content/res/Resources;", "theme", "Landroid/content/res/Resources$Theme;", "attrs", "Landroid/util/AttributeSet;", "isAtEnd", "", "parseClipPath", "", "builder", "parseCurrentVectorNode", "nestedGroups", "parseGroup", "parsePath", "seekToStartTag", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class XmlVectorParser_androidKt {
    private static final int FILL_TYPE_WINDING = 0;
    private static final int LINECAP_BUTT = 0;
    private static final int LINECAP_ROUND = 1;
    private static final int LINECAP_SQUARE = 2;
    private static final int LINEJOIN_BEVEL = 2;
    private static final int LINEJOIN_MITER = 0;
    private static final int LINEJOIN_ROUND = 1;
    private static final String SHAPE_CLIP_PATH = "clip-path";
    private static final String SHAPE_GROUP = "group";
    private static final String SHAPE_PATH = "path";

    static {
    }

    public static final Builder createVectorImageBuilder(XmlPullParser xmlPullParser0, Resources resources0, Resources.Theme resources$Theme0, AttributeSet attributeSet0) {
        int v1;
        long v;
        Intrinsics.checkNotNullParameter(xmlPullParser0, "<this>");
        Intrinsics.checkNotNullParameter(resources0, "res");
        Intrinsics.checkNotNullParameter(attributeSet0, "attrs");
        TypedArray typedArray0 = TypedArrayUtils.obtainAttributes(resources0, resources$Theme0, attributeSet0, AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_TYPE_ARRAY());
        Intrinsics.checkNotNullExpressionValue(typedArray0, "obtainAttributes(\n        res,\n        theme,\n        attrs,\n        AndroidVectorResources.STYLEABLE_VECTOR_DRAWABLE_TYPE_ARRAY\n    )");
        float f = TypedArrayUtils.getNamedFloat(typedArray0, xmlPullParser0, "viewportWidth", 7, 0.0f);
        float f1 = TypedArrayUtils.getNamedFloat(typedArray0, xmlPullParser0, "viewportHeight", 8, 0.0f);
        if(f <= 0.0f) {
            throw new XmlPullParserException(Intrinsics.stringPlus(typedArray0.getPositionDescription(), "<VectorGraphic> tag requires viewportWidth > 0"));
        }
        if(f1 <= 0.0f) {
            throw new XmlPullParserException(Intrinsics.stringPlus(typedArray0.getPositionDescription(), "<VectorGraphic> tag requires viewportHeight > 0"));
        }
        float f2 = typedArray0.getDimension(3, 0.0f);
        float f3 = typedArray0.getDimension(2, 0.0f);
        if(typedArray0.hasValue(1)) {
            TypedValue typedValue0 = new TypedValue();
            typedArray0.getValue(1, typedValue0);
            v = typedValue0.type < 28 || typedValue0.type > 0x1F ? 16L : ColorKt.Color(typedValue0.data);
        }
        else {
            v = 16L;
        }
        switch(typedArray0.getInt(6, -1)) {
            case -1: {
                v1 = 5;
                break;
            }
            case 3: {
                v1 = 3;
                break;
            }
            case 5: {
                v1 = 5;
                break;
            }
            case 9: {
                v1 = 9;
                break;
            }
            case 14: {
                v1 = 13;
                break;
            }
            case 15: {
                v1 = 14;
                break;
            }
            case 16: {
                v1 = 12;
                break;
            }
            default: {
                v1 = 5;
            }
        }
        float f4 = Dp.constructor-impl(f2 / resources0.getDisplayMetrics().density);
        float f5 = Dp.constructor-impl(f3 / resources0.getDisplayMetrics().density);
        typedArray0.recycle();
        return new Builder(null, f4, f5, f, f1, v, v1, 1, null);
    }

    private static final int getStrokeLineCap-CSYIeUk(int v, int v1) {
        switch(v) {
            case 0: {
                return 0;
            }
            case 1: {
                return 1;
            }
            case 2: {
                return 2;
            }
            default: {
                return v1;
            }
        }
    }

    static int getStrokeLineCap-CSYIeUk$default(int v, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v1 = 0;
        }
        return XmlVectorParser_androidKt.getStrokeLineCap-CSYIeUk(v, v1);
    }

    private static final int getStrokeLineJoin-kLtJ_vA(int v, int v1) {
        switch(v) {
            case 0: {
                return 0;
            }
            case 1: {
                return 1;
            }
            case 2: {
                return 2;
            }
            default: {
                return v1;
            }
        }
    }

    static int getStrokeLineJoin-kLtJ_vA$default(int v, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v1 = 0;
        }
        return XmlVectorParser_androidKt.getStrokeLineJoin-kLtJ_vA(v, v1);
    }

    public static final boolean isAtEnd(XmlPullParser xmlPullParser0) {
        Intrinsics.checkNotNullParameter(xmlPullParser0, "<this>");
        return xmlPullParser0.getEventType() == 1 || xmlPullParser0.getDepth() < 1 && xmlPullParser0.getEventType() == 3;
    }

    private static final Brush obtainBrushFromComplexColor(ComplexColorCompat complexColorCompat0) {
        if(complexColorCompat0.willDraw()) {
            Shader shader0 = complexColorCompat0.getShader();
            return shader0 != null ? BrushKt.ShaderBrush(shader0) : new SolidColor(ColorKt.Color(complexColorCompat0.getColor()), null);
        }
        return null;
    }

    public static final void parseClipPath(XmlPullParser xmlPullParser0, Resources resources0, Resources.Theme resources$Theme0, AttributeSet attributeSet0, Builder imageVector$Builder0) {
        Intrinsics.checkNotNullParameter(xmlPullParser0, "<this>");
        Intrinsics.checkNotNullParameter(resources0, "res");
        Intrinsics.checkNotNullParameter(attributeSet0, "attrs");
        Intrinsics.checkNotNullParameter(imageVector$Builder0, "builder");
        TypedArray typedArray0 = resources$Theme0 == null ? null : resources$Theme0.obtainStyledAttributes(attributeSet0, AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH(), 0, 0);
        if(typedArray0 == null) {
            typedArray0 = resources0.obtainAttributes(attributeSet0, AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH());
        }
        String s = typedArray0.getString(0);
        if(s == null) {
            s = "";
        }
        List list0 = VectorKt.addPathNodes(typedArray0.getString(1));
        typedArray0.recycle();
        Builder.addGroup$default(imageVector$Builder0, s, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, list0, 0xFE, null);
    }

    public static final int parseCurrentVectorNode(XmlPullParser xmlPullParser0, Resources resources0, AttributeSet attributeSet0, Resources.Theme resources$Theme0, Builder imageVector$Builder0, int v) {
        Intrinsics.checkNotNullParameter(xmlPullParser0, "<this>");
        Intrinsics.checkNotNullParameter(resources0, "res");
        Intrinsics.checkNotNullParameter(attributeSet0, "attrs");
        Intrinsics.checkNotNullParameter(imageVector$Builder0, "builder");
        switch(xmlPullParser0.getEventType()) {
            case 2: {
                String s = xmlPullParser0.getName();
                if(s != null) {
                    switch(s) {
                        case "clip-path": {
                            XmlVectorParser_androidKt.parseClipPath(xmlPullParser0, resources0, resources$Theme0, attributeSet0, imageVector$Builder0);
                            return v + 1;
                        }
                        case "group": {
                            XmlVectorParser_androidKt.parseGroup(xmlPullParser0, resources0, resources$Theme0, attributeSet0, imageVector$Builder0);
                            return v;
                        }
                        case "path": {
                            XmlVectorParser_androidKt.parsePath(xmlPullParser0, resources0, resources$Theme0, attributeSet0, imageVector$Builder0);
                            return v;
                        }
                        default: {
                            return v;
                        }
                    }
                }
                break;
            }
            case 3: {
                if(Intrinsics.areEqual("group", xmlPullParser0.getName())) {
                    for(int v1 = 0; v1 < v + 1; ++v1) {
                        imageVector$Builder0.clearGroup();
                    }
                    return 0;
                }
                break;
            }
            default: {
                return v;
            }
        }
        return v;
    }

    public static int parseCurrentVectorNode$default(XmlPullParser xmlPullParser0, Resources resources0, AttributeSet attributeSet0, Resources.Theme resources$Theme0, Builder imageVector$Builder0, int v, int v1, Object object0) {
        if((v1 & 4) != 0) {
            resources$Theme0 = null;
        }
        return XmlVectorParser_androidKt.parseCurrentVectorNode(xmlPullParser0, resources0, attributeSet0, resources$Theme0, imageVector$Builder0, v);
    }

    public static final void parseGroup(XmlPullParser xmlPullParser0, Resources resources0, Resources.Theme resources$Theme0, AttributeSet attributeSet0, Builder imageVector$Builder0) {
        Intrinsics.checkNotNullParameter(xmlPullParser0, "<this>");
        Intrinsics.checkNotNullParameter(resources0, "res");
        Intrinsics.checkNotNullParameter(attributeSet0, "attrs");
        Intrinsics.checkNotNullParameter(imageVector$Builder0, "builder");
        TypedArray typedArray0 = TypedArrayUtils.obtainAttributes(resources0, resources$Theme0, attributeSet0, AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_GROUP());
        Intrinsics.checkNotNullExpressionValue(typedArray0, "obtainAttributes(\n        res,\n        theme,\n        attrs,\n        AndroidVectorResources.STYLEABLE_VECTOR_DRAWABLE_GROUP\n    )");
        float f = TypedArrayUtils.getNamedFloat(typedArray0, xmlPullParser0, "rotation", 5, 0.0f);
        float f1 = typedArray0.getFloat(1, 0.0f);
        float f2 = typedArray0.getFloat(2, 0.0f);
        float f3 = TypedArrayUtils.getNamedFloat(typedArray0, xmlPullParser0, "scaleX", 3, 1.0f);
        float f4 = TypedArrayUtils.getNamedFloat(typedArray0, xmlPullParser0, "scaleY", 4, 1.0f);
        float f5 = TypedArrayUtils.getNamedFloat(typedArray0, xmlPullParser0, "translateX", 6, 0.0f);
        float f6 = TypedArrayUtils.getNamedFloat(typedArray0, xmlPullParser0, "translateY", 7, 0.0f);
        String s = typedArray0.getString(0);
        if(s == null) {
            s = "";
        }
        typedArray0.recycle();
        imageVector$Builder0.addGroup(s, f, f1, f2, f3, f4, f5, f6, VectorKt.getEmptyPath());
    }

    public static final void parsePath(XmlPullParser xmlPullParser0, Resources resources0, Resources.Theme resources$Theme0, AttributeSet attributeSet0, Builder imageVector$Builder0) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(xmlPullParser0, "<this>");
        Intrinsics.checkNotNullParameter(resources0, "res");
        Intrinsics.checkNotNullParameter(attributeSet0, "attrs");
        Intrinsics.checkNotNullParameter(imageVector$Builder0, "builder");
        TypedArray typedArray0 = TypedArrayUtils.obtainAttributes(resources0, resources$Theme0, attributeSet0, AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_PATH());
        Intrinsics.checkNotNullExpressionValue(typedArray0, "obtainAttributes(\n        res,\n        theme,\n        attrs,\n        AndroidVectorResources.STYLEABLE_VECTOR_DRAWABLE_PATH\n    )");
        if(!TypedArrayUtils.hasAttribute(xmlPullParser0, "pathData")) {
            throw new IllegalArgumentException("No path data available");
        }
        String s = typedArray0.getString(0);
        if(s == null) {
            s = "";
        }
        List list0 = VectorKt.addPathNodes(typedArray0.getString(2));
        ComplexColorCompat complexColorCompat0 = TypedArrayUtils.getNamedComplexColor(typedArray0, xmlPullParser0, resources$Theme0, "fillColor", 1, 0);
        float f = TypedArrayUtils.getNamedFloat(typedArray0, xmlPullParser0, "fillAlpha", 12, 1.0f);
        int v = XmlVectorParser_androidKt.getStrokeLineCap-CSYIeUk(TypedArrayUtils.getNamedInt(typedArray0, xmlPullParser0, "strokeLineCap", 8, -1), 0);
        int v1 = XmlVectorParser_androidKt.getStrokeLineJoin-kLtJ_vA(TypedArrayUtils.getNamedInt(typedArray0, xmlPullParser0, "strokeLineJoin", 9, -1), 2);
        float f1 = TypedArrayUtils.getNamedFloat(typedArray0, xmlPullParser0, "strokeMiterLimit", 10, 1.0f);
        ComplexColorCompat complexColorCompat1 = TypedArrayUtils.getNamedComplexColor(typedArray0, xmlPullParser0, resources$Theme0, "strokeColor", 3, 0);
        float f2 = TypedArrayUtils.getNamedFloat(typedArray0, xmlPullParser0, "strokeAlpha", 11, 1.0f);
        float f3 = TypedArrayUtils.getNamedFloat(typedArray0, xmlPullParser0, "strokeWidth", 4, 1.0f);
        float f4 = TypedArrayUtils.getNamedFloat(typedArray0, xmlPullParser0, "trimPathEnd", 6, 1.0f);
        float f5 = TypedArrayUtils.getNamedFloat(typedArray0, xmlPullParser0, "trimPathOffset", 7, 0.0f);
        float f6 = TypedArrayUtils.getNamedFloat(typedArray0, xmlPullParser0, "trimPathStart", 5, 0.0f);
        int v2 = TypedArrayUtils.getNamedInt(typedArray0, xmlPullParser0, "fillType", 13, XmlVectorParser_androidKt.FILL_TYPE_WINDING);
        typedArray0.recycle();
        Intrinsics.checkNotNullExpressionValue(complexColorCompat0, "fillColor");
        Brush brush0 = XmlVectorParser_androidKt.obtainBrushFromComplexColor(complexColorCompat0);
        Intrinsics.checkNotNullExpressionValue(complexColorCompat1, "strokeColor");
        imageVector$Builder0.addPath-oIyEayM(list0, (v2 == 0 ? 0 : 1), s, brush0, f, XmlVectorParser_androidKt.obtainBrushFromComplexColor(complexColorCompat1), f2, f3, v, v1, f1, f6, f4, f5);
    }

    public static final XmlPullParser seekToStartTag(XmlPullParser xmlPullParser0) throws XmlPullParserException {
        Intrinsics.checkNotNullParameter(xmlPullParser0, "<this>");
        int v;
        for(v = xmlPullParser0.next(); v != 1 && v != 2; v = xmlPullParser0.next()) {
        }
        if(v != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        return xmlPullParser0;
    }
}

