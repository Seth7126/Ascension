package androidx.compose.ui.graphics.vector;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001AB\u0010\u001F\u001A\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\"\u001A\u00020#2\u0006\u0010$\u001A\u00020\b2!\u0010%\u001A\u001D\u0012\u0013\u0012\u00110#\u00A2\u0006\f\b\'\u0012\b\b(\u0012\u0004\b\b()\u0012\u0004\u0012\u00020!0&H\u0082\b\u001A\u001A\u0010*\u001A\b\u0012\u0004\u0012\u00020!0 *\u00020\u00012\u0006\u0010\"\u001A\u00020#H\u0000\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u0002\u001A\u00020\u0001X\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u0003\u001A\u00020\u0001X\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u0004\u001A\u00020\u0001X\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u0005\u001A\u00020\u0001X\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u0006\u001A\u00020\u0001X\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u0007\u001A\u00020\bX\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\t\u001A\u00020\bX\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\n\u001A\u00020\bX\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u000B\u001A\u00020\bX\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\f\u001A\u00020\bX\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\r\u001A\u00020\bX\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u000E\u001A\u00020\bX\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u000F\u001A\u00020\bX\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u0010\u001A\u00020\bX\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u0011\u001A\u00020\u0001X\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u0012\u001A\u00020\u0001X\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u0013\u001A\u00020\u0001X\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u0014\u001A\u00020\u0001X\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u0015\u001A\u00020\u0001X\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u0016\u001A\u00020\u0001X\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u0017\u001A\u00020\u0001X\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u0018\u001A\u00020\u0001X\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u0019\u001A\u00020\u0001X\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u001A\u001A\u00020\u0001X\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u001B\u001A\u00020\u0001X\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u001C\u001A\u00020\u0001X\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u001D\u001A\u00020\u0001X\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u001E\u001A\u00020\u0001X\u0082T\u00A2\u0006\u0002\n\u0000\u00A8\u0006+"}, d2 = {"ArcToKey", "", "CloseKey", "CurveToKey", "HorizontalToKey", "LineToKey", "MoveToKey", "NUM_ARC_TO_ARGS", "", "NUM_CURVE_TO_ARGS", "NUM_HORIZONTAL_TO_ARGS", "NUM_LINE_TO_ARGS", "NUM_MOVE_TO_ARGS", "NUM_QUAD_TO_ARGS", "NUM_REFLECTIVE_CURVE_TO_ARGS", "NUM_REFLECTIVE_QUAD_TO_ARGS", "NUM_VERTICAL_TO_ARGS", "QuadToKey", "ReflectiveCurveToKey", "ReflectiveQuadToKey", "RelativeArcToKey", "RelativeCloseKey", "RelativeCurveToKey", "RelativeHorizontalToKey", "RelativeLineToKey", "RelativeMoveToKey", "RelativeQuadToKey", "RelativeReflectiveCurveToKey", "RelativeReflectiveQuadToKey", "RelativeVerticalToKey", "VerticalToKey", "pathNodesFromArgs", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "args", "", "numArgs", "nodeFor", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "subArray", "toPathNodes", "ui-graphics_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class PathNodeKt {
    private static final char ArcToKey = 'A';
    private static final char CloseKey = 'Z';
    private static final char CurveToKey = 'C';
    private static final char HorizontalToKey = 'H';
    private static final char LineToKey = 'L';
    private static final char MoveToKey = 'M';
    private static final int NUM_ARC_TO_ARGS = 7;
    private static final int NUM_CURVE_TO_ARGS = 6;
    private static final int NUM_HORIZONTAL_TO_ARGS = 1;
    private static final int NUM_LINE_TO_ARGS = 2;
    private static final int NUM_MOVE_TO_ARGS = 2;
    private static final int NUM_QUAD_TO_ARGS = 4;
    private static final int NUM_REFLECTIVE_CURVE_TO_ARGS = 4;
    private static final int NUM_REFLECTIVE_QUAD_TO_ARGS = 2;
    private static final int NUM_VERTICAL_TO_ARGS = 1;
    private static final char QuadToKey = 'Q';
    private static final char ReflectiveCurveToKey = 'S';
    private static final char ReflectiveQuadToKey = 'T';
    private static final char RelativeArcToKey = 'a';
    private static final char RelativeCloseKey = 'z';
    private static final char RelativeCurveToKey = 'c';
    private static final char RelativeHorizontalToKey = 'h';
    private static final char RelativeLineToKey = 'l';
    private static final char RelativeMoveToKey = 'm';
    private static final char RelativeQuadToKey = 'q';
    private static final char RelativeReflectiveCurveToKey = 's';
    private static final char RelativeReflectiveQuadToKey = 't';
    private static final char RelativeVerticalToKey = 'v';
    private static final char VerticalToKey = 'V';

    private static final List pathNodesFromArgs(float[] arr_f, int v, Function1 function10) {
        Iterable iterable0 = RangesKt.step(new IntRange(0, arr_f.length - v), v);
        ArrayList arrayList0 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable0, 10));
        Iterator iterator0 = iterable0.iterator();
        while(iterator0.hasNext()) {
            int v1 = ((IntIterator)iterator0).nextInt();
            float[] arr_f1 = CollectionsKt.toFloatArray(ArraysKt.slice(arr_f, RangesKt.until(v1, v1 + v)));
            PathNode pathNode0 = (PathNode)function10.invoke(arr_f1);
            if(pathNode0 instanceof MoveTo && v1 > 0) {
                pathNode0 = new LineTo(arr_f1[0], arr_f1[1]);
            }
            else if(pathNode0 instanceof RelativeMoveTo && v1 > 0) {
                pathNode0 = new RelativeLineTo(arr_f1[0], arr_f1[1]);
            }
            arrayList0.add(pathNode0);
        }
        return arrayList0;
    }

    public static final List toPathNodes(char c, float[] arr_f) {
        boolean z;
        Intrinsics.checkNotNullParameter(arr_f, "args");
        switch(c) {
            case 90: {
                z = true;
                break;
            }
            case 0x7A: {
                z = true;
                break;
            }
            default: {
                z = false;
            }
        }
        if(z) {
            return CollectionsKt.listOf(Close.INSTANCE);
        }
        switch(c) {
            case 65: {
                Iterable iterable0 = RangesKt.step(new IntRange(0, arr_f.length - 7), 7);
                ArrayList arrayList0 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable0, 10));
                Iterator iterator0 = iterable0.iterator();
                while(iterator0.hasNext()) {
                    int v = ((IntIterator)iterator0).nextInt();
                    float[] arr_f1 = CollectionsKt.toFloatArray(ArraysKt.slice(arr_f, RangesKt.until(v, v + 7)));
                    PathNode pathNode0 = new ArcTo(arr_f1[0], arr_f1[1], arr_f1[2], Float.compare(arr_f1[3], 0.0f) != 0, Float.compare(arr_f1[4], 0.0f) != 0, arr_f1[5], arr_f1[6]);
                    if(pathNode0 instanceof MoveTo && v > 0) {
                        pathNode0 = new LineTo(arr_f1[0], arr_f1[1]);
                    }
                    else if(pathNode0 instanceof RelativeMoveTo && v > 0) {
                        pathNode0 = new RelativeLineTo(arr_f1[0], arr_f1[1]);
                    }
                    arrayList0.add(pathNode0);
                }
                return arrayList0;
            }
            case 67: {
                Iterable iterable1 = RangesKt.step(new IntRange(0, arr_f.length - 6), 6);
                ArrayList arrayList1 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable1, 10));
                Iterator iterator1 = iterable1.iterator();
                while(iterator1.hasNext()) {
                    int v1 = ((IntIterator)iterator1).nextInt();
                    float[] arr_f2 = CollectionsKt.toFloatArray(ArraysKt.slice(arr_f, RangesKt.until(v1, v1 + 6)));
                    PathNode pathNode1 = new CurveTo(arr_f2[0], arr_f2[1], arr_f2[2], arr_f2[3], arr_f2[4], arr_f2[5]);
                    if(pathNode1 instanceof MoveTo && v1 > 0) {
                        pathNode1 = new LineTo(arr_f2[0], arr_f2[1]);
                    }
                    else if(pathNode1 instanceof RelativeMoveTo && v1 > 0) {
                        pathNode1 = new RelativeLineTo(arr_f2[0], arr_f2[1]);
                    }
                    arrayList1.add(pathNode1);
                }
                return arrayList1;
            }
            case 72: {
                Iterable iterable2 = RangesKt.step(new IntRange(0, arr_f.length - 1), 1);
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
                Iterator iterator2 = iterable2.iterator();
                while(iterator2.hasNext()) {
                    int v2 = ((IntIterator)iterator2).nextInt();
                    float[] arr_f3 = CollectionsKt.toFloatArray(ArraysKt.slice(arr_f, RangesKt.until(v2, v2 + 1)));
                    PathNode pathNode2 = new HorizontalTo(arr_f3[0]);
                    if(pathNode2 instanceof MoveTo && v2 > 0) {
                        pathNode2 = new LineTo(arr_f3[0], arr_f3[1]);
                    }
                    else if(pathNode2 instanceof RelativeMoveTo && v2 > 0) {
                        pathNode2 = new RelativeLineTo(arr_f3[0], arr_f3[1]);
                    }
                    arrayList2.add(pathNode2);
                }
                return arrayList2;
            }
            case 76: {
                Iterable iterable3 = RangesKt.step(new IntRange(0, arr_f.length - 2), 2);
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable3, 10));
                Iterator iterator3 = iterable3.iterator();
                while(iterator3.hasNext()) {
                    int v3 = ((IntIterator)iterator3).nextInt();
                    float[] arr_f4 = CollectionsKt.toFloatArray(ArraysKt.slice(arr_f, RangesKt.until(v3, v3 + 2)));
                    PathNode pathNode3 = new LineTo(arr_f4[0], arr_f4[1]);
                    if(pathNode3 instanceof MoveTo && v3 > 0) {
                        pathNode3 = new LineTo(arr_f4[0], arr_f4[1]);
                    }
                    else if(pathNode3 instanceof RelativeMoveTo && v3 > 0) {
                        pathNode3 = new RelativeLineTo(arr_f4[0], arr_f4[1]);
                    }
                    arrayList3.add(pathNode3);
                }
                return arrayList3;
            }
            case 77: {
                Iterable iterable4 = RangesKt.step(new IntRange(0, arr_f.length - 2), 2);
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable4, 10));
                Iterator iterator4 = iterable4.iterator();
                while(iterator4.hasNext()) {
                    int v4 = ((IntIterator)iterator4).nextInt();
                    float[] arr_f5 = CollectionsKt.toFloatArray(ArraysKt.slice(arr_f, RangesKt.until(v4, v4 + 2)));
                    PathNode pathNode4 = new MoveTo(arr_f5[0], arr_f5[1]);
                    if(v4 > 0) {
                        pathNode4 = new LineTo(arr_f5[0], arr_f5[1]);
                    }
                    else if(pathNode4 instanceof RelativeMoveTo && v4 > 0) {
                        pathNode4 = new RelativeLineTo(arr_f5[0], arr_f5[1]);
                    }
                    arrayList4.add(pathNode4);
                }
                return arrayList4;
            }
            case 81: {
                Iterable iterable5 = RangesKt.step(new IntRange(0, arr_f.length - 4), 4);
                ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable5, 10));
                Iterator iterator5 = iterable5.iterator();
                while(iterator5.hasNext()) {
                    int v5 = ((IntIterator)iterator5).nextInt();
                    float[] arr_f6 = CollectionsKt.toFloatArray(ArraysKt.slice(arr_f, RangesKt.until(v5, v5 + 4)));
                    PathNode pathNode5 = new QuadTo(arr_f6[0], arr_f6[1], arr_f6[2], arr_f6[3]);
                    if(pathNode5 instanceof MoveTo && v5 > 0) {
                        pathNode5 = new LineTo(arr_f6[0], arr_f6[1]);
                    }
                    else if(pathNode5 instanceof RelativeMoveTo && v5 > 0) {
                        pathNode5 = new RelativeLineTo(arr_f6[0], arr_f6[1]);
                    }
                    arrayList5.add(pathNode5);
                }
                return arrayList5;
            }
            case 83: {
                Iterable iterable6 = RangesKt.step(new IntRange(0, arr_f.length - 4), 4);
                ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable6, 10));
                Iterator iterator6 = iterable6.iterator();
                while(iterator6.hasNext()) {
                    int v6 = ((IntIterator)iterator6).nextInt();
                    float[] arr_f7 = CollectionsKt.toFloatArray(ArraysKt.slice(arr_f, RangesKt.until(v6, v6 + 4)));
                    PathNode pathNode6 = new ReflectiveCurveTo(arr_f7[0], arr_f7[1], arr_f7[2], arr_f7[3]);
                    if(pathNode6 instanceof MoveTo && v6 > 0) {
                        pathNode6 = new LineTo(arr_f7[0], arr_f7[1]);
                    }
                    else if(pathNode6 instanceof RelativeMoveTo && v6 > 0) {
                        pathNode6 = new RelativeLineTo(arr_f7[0], arr_f7[1]);
                    }
                    arrayList6.add(pathNode6);
                }
                return arrayList6;
            }
            case 84: {
                Iterable iterable7 = RangesKt.step(new IntRange(0, arr_f.length - 2), 2);
                ArrayList arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable7, 10));
                Iterator iterator7 = iterable7.iterator();
                while(iterator7.hasNext()) {
                    int v7 = ((IntIterator)iterator7).nextInt();
                    float[] arr_f8 = CollectionsKt.toFloatArray(ArraysKt.slice(arr_f, RangesKt.until(v7, v7 + 2)));
                    PathNode pathNode7 = new ReflectiveQuadTo(arr_f8[0], arr_f8[1]);
                    if(pathNode7 instanceof MoveTo && v7 > 0) {
                        pathNode7 = new LineTo(arr_f8[0], arr_f8[1]);
                    }
                    else if(pathNode7 instanceof RelativeMoveTo && v7 > 0) {
                        pathNode7 = new RelativeLineTo(arr_f8[0], arr_f8[1]);
                    }
                    arrayList7.add(pathNode7);
                }
                return arrayList7;
            }
            case 86: {
                Iterable iterable8 = RangesKt.step(new IntRange(0, arr_f.length - 1), 1);
                ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable8, 10));
                Iterator iterator8 = iterable8.iterator();
                while(iterator8.hasNext()) {
                    int v8 = ((IntIterator)iterator8).nextInt();
                    float[] arr_f9 = CollectionsKt.toFloatArray(ArraysKt.slice(arr_f, RangesKt.until(v8, v8 + 1)));
                    PathNode pathNode8 = new VerticalTo(arr_f9[0]);
                    if(pathNode8 instanceof MoveTo && v8 > 0) {
                        pathNode8 = new LineTo(arr_f9[0], arr_f9[1]);
                    }
                    else if(pathNode8 instanceof RelativeMoveTo && v8 > 0) {
                        pathNode8 = new RelativeLineTo(arr_f9[0], arr_f9[1]);
                    }
                    arrayList8.add(pathNode8);
                }
                return arrayList8;
            }
            case 97: {
                Iterable iterable9 = RangesKt.step(new IntRange(0, arr_f.length - 7), 7);
                ArrayList arrayList9 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable9, 10));
                Iterator iterator9 = iterable9.iterator();
                while(iterator9.hasNext()) {
                    int v9 = ((IntIterator)iterator9).nextInt();
                    float[] arr_f10 = CollectionsKt.toFloatArray(ArraysKt.slice(arr_f, RangesKt.until(v9, v9 + 7)));
                    PathNode pathNode9 = new RelativeArcTo(arr_f10[0], arr_f10[1], arr_f10[2], Float.compare(arr_f10[3], 0.0f) != 0, Float.compare(arr_f10[4], 0.0f) != 0, arr_f10[5], arr_f10[6]);
                    if(pathNode9 instanceof MoveTo && v9 > 0) {
                        pathNode9 = new LineTo(arr_f10[0], arr_f10[1]);
                    }
                    else if(pathNode9 instanceof RelativeMoveTo && v9 > 0) {
                        pathNode9 = new RelativeLineTo(arr_f10[0], arr_f10[1]);
                    }
                    arrayList9.add(pathNode9);
                }
                return arrayList9;
            }
            case 99: {
                Iterable iterable10 = RangesKt.step(new IntRange(0, arr_f.length - 6), 6);
                ArrayList arrayList10 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable10, 10));
                Iterator iterator10 = iterable10.iterator();
                while(iterator10.hasNext()) {
                    int v10 = ((IntIterator)iterator10).nextInt();
                    float[] arr_f11 = CollectionsKt.toFloatArray(ArraysKt.slice(arr_f, RangesKt.until(v10, v10 + 6)));
                    PathNode pathNode10 = new RelativeCurveTo(arr_f11[0], arr_f11[1], arr_f11[2], arr_f11[3], arr_f11[4], arr_f11[5]);
                    if(pathNode10 instanceof MoveTo && v10 > 0) {
                        pathNode10 = new LineTo(arr_f11[0], arr_f11[1]);
                    }
                    else if(pathNode10 instanceof RelativeMoveTo && v10 > 0) {
                        pathNode10 = new RelativeLineTo(arr_f11[0], arr_f11[1]);
                    }
                    arrayList10.add(pathNode10);
                }
                return arrayList10;
            }
            case 104: {
                Iterable iterable11 = RangesKt.step(new IntRange(0, arr_f.length - 1), 1);
                ArrayList arrayList11 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable11, 10));
                Iterator iterator11 = iterable11.iterator();
                while(iterator11.hasNext()) {
                    int v11 = ((IntIterator)iterator11).nextInt();
                    float[] arr_f12 = CollectionsKt.toFloatArray(ArraysKt.slice(arr_f, RangesKt.until(v11, v11 + 1)));
                    PathNode pathNode11 = new RelativeHorizontalTo(arr_f12[0]);
                    if(pathNode11 instanceof MoveTo && v11 > 0) {
                        pathNode11 = new LineTo(arr_f12[0], arr_f12[1]);
                    }
                    else if(pathNode11 instanceof RelativeMoveTo && v11 > 0) {
                        pathNode11 = new RelativeLineTo(arr_f12[0], arr_f12[1]);
                    }
                    arrayList11.add(pathNode11);
                }
                return arrayList11;
            }
            case 108: {
                Iterable iterable12 = RangesKt.step(new IntRange(0, arr_f.length - 2), 2);
                ArrayList arrayList12 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable12, 10));
                Iterator iterator12 = iterable12.iterator();
                while(iterator12.hasNext()) {
                    int v12 = ((IntIterator)iterator12).nextInt();
                    float[] arr_f13 = CollectionsKt.toFloatArray(ArraysKt.slice(arr_f, RangesKt.until(v12, v12 + 2)));
                    PathNode pathNode12 = new RelativeLineTo(arr_f13[0], arr_f13[1]);
                    if(pathNode12 instanceof MoveTo && v12 > 0) {
                        pathNode12 = new LineTo(arr_f13[0], arr_f13[1]);
                    }
                    else if(pathNode12 instanceof RelativeMoveTo && v12 > 0) {
                        pathNode12 = new RelativeLineTo(arr_f13[0], arr_f13[1]);
                    }
                    arrayList12.add(pathNode12);
                }
                return arrayList12;
            }
            case 109: {
                Iterable iterable13 = RangesKt.step(new IntRange(0, arr_f.length - 2), 2);
                ArrayList arrayList13 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable13, 10));
                Iterator iterator13 = iterable13.iterator();
                while(iterator13.hasNext()) {
                    int v13 = ((IntIterator)iterator13).nextInt();
                    float[] arr_f14 = CollectionsKt.toFloatArray(ArraysKt.slice(arr_f, RangesKt.until(v13, v13 + 2)));
                    PathNode pathNode13 = new RelativeMoveTo(arr_f14[0], arr_f14[1]);
                    if(pathNode13 instanceof MoveTo && v13 > 0) {
                        pathNode13 = new LineTo(arr_f14[0], arr_f14[1]);
                    }
                    else if(v13 > 0) {
                        pathNode13 = new RelativeLineTo(arr_f14[0], arr_f14[1]);
                    }
                    arrayList13.add(pathNode13);
                }
                return arrayList13;
            }
            case 0x71: {
                Iterable iterable14 = RangesKt.step(new IntRange(0, arr_f.length - 4), 4);
                ArrayList arrayList14 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable14, 10));
                Iterator iterator14 = iterable14.iterator();
                while(iterator14.hasNext()) {
                    int v14 = ((IntIterator)iterator14).nextInt();
                    float[] arr_f15 = CollectionsKt.toFloatArray(ArraysKt.slice(arr_f, RangesKt.until(v14, v14 + 4)));
                    PathNode pathNode14 = new RelativeQuadTo(arr_f15[0], arr_f15[1], arr_f15[2], arr_f15[3]);
                    if(pathNode14 instanceof MoveTo && v14 > 0) {
                        pathNode14 = new LineTo(arr_f15[0], arr_f15[1]);
                    }
                    else if(pathNode14 instanceof RelativeMoveTo && v14 > 0) {
                        pathNode14 = new RelativeLineTo(arr_f15[0], arr_f15[1]);
                    }
                    arrayList14.add(pathNode14);
                }
                return arrayList14;
            }
            case 0x73: {
                Iterable iterable15 = RangesKt.step(new IntRange(0, arr_f.length - 4), 4);
                ArrayList arrayList15 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable15, 10));
                Iterator iterator15 = iterable15.iterator();
                while(iterator15.hasNext()) {
                    int v15 = ((IntIterator)iterator15).nextInt();
                    float[] arr_f16 = CollectionsKt.toFloatArray(ArraysKt.slice(arr_f, RangesKt.until(v15, v15 + 4)));
                    PathNode pathNode15 = new RelativeReflectiveCurveTo(arr_f16[0], arr_f16[1], arr_f16[2], arr_f16[3]);
                    if(pathNode15 instanceof MoveTo && v15 > 0) {
                        pathNode15 = new LineTo(arr_f16[0], arr_f16[1]);
                    }
                    else if(pathNode15 instanceof RelativeMoveTo && v15 > 0) {
                        pathNode15 = new RelativeLineTo(arr_f16[0], arr_f16[1]);
                    }
                    arrayList15.add(pathNode15);
                }
                return arrayList15;
            }
            case 0x74: {
                Iterable iterable16 = RangesKt.step(new IntRange(0, arr_f.length - 2), 2);
                ArrayList arrayList16 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable16, 10));
                Iterator iterator16 = iterable16.iterator();
                while(iterator16.hasNext()) {
                    int v16 = ((IntIterator)iterator16).nextInt();
                    float[] arr_f17 = CollectionsKt.toFloatArray(ArraysKt.slice(arr_f, RangesKt.until(v16, v16 + 2)));
                    PathNode pathNode16 = new RelativeReflectiveQuadTo(arr_f17[0], arr_f17[1]);
                    if(pathNode16 instanceof MoveTo && v16 > 0) {
                        pathNode16 = new LineTo(arr_f17[0], arr_f17[1]);
                    }
                    else if(pathNode16 instanceof RelativeMoveTo && v16 > 0) {
                        pathNode16 = new RelativeLineTo(arr_f17[0], arr_f17[1]);
                    }
                    arrayList16.add(pathNode16);
                }
                return arrayList16;
            }
            case 0x76: {
                Iterable iterable17 = RangesKt.step(new IntRange(0, arr_f.length - 1), 1);
                ArrayList arrayList17 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable17, 10));
                Iterator iterator17 = iterable17.iterator();
                while(iterator17.hasNext()) {
                    int v17 = ((IntIterator)iterator17).nextInt();
                    float[] arr_f18 = CollectionsKt.toFloatArray(ArraysKt.slice(arr_f, RangesKt.until(v17, v17 + 1)));
                    PathNode pathNode17 = new RelativeVerticalTo(arr_f18[0]);
                    if(pathNode17 instanceof MoveTo && v17 > 0) {
                        pathNode17 = new LineTo(arr_f18[0], arr_f18[1]);
                    }
                    else if(pathNode17 instanceof RelativeMoveTo && v17 > 0) {
                        pathNode17 = new RelativeLineTo(arr_f18[0], arr_f18[1]);
                    }
                    arrayList17.add(pathNode17);
                }
                return arrayList17;
            }
            default: {
                throw new IllegalArgumentException("Unknown command for: " + Character.valueOf(c));
            }
        }
    }
}

