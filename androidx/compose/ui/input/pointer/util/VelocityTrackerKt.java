package androidx.compose.ui.input.pointer.util;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001E\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u001A,\u0010\u0007\u001A\u00020\b2\f\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\f\u001A\u00020\u0001H\u0000\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000E\u0010\u0002\u001A\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000E\u0010\u0004\u001A\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000E\u0010\u0005\u001A\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000E\u0010\u0006\u001A\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"AssumePointerMoveStoppedMilliseconds", "", "DefaultWeight", "", "HistorySize", "HorizonMilliseconds", "MinSampleSize", "polyFitLeastSquares", "Landroidx/compose/ui/input/pointer/util/PolynomialFit;", "x", "", "y", "degree", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class VelocityTrackerKt {
    private static final int AssumePointerMoveStoppedMilliseconds = 40;
    private static final float DefaultWeight = 1.0f;
    private static final int HistorySize = 20;
    private static final int HorizonMilliseconds = 100;
    private static final int MinSampleSize = 3;

    public static final PolynomialFit polyFitLeastSquares(List list0, List list1, int v) {
        float f3;
        Intrinsics.checkNotNullParameter(list0, "x");
        Intrinsics.checkNotNullParameter(list1, "y");
        if(v < 1) {
            throw new IllegalArgumentException("The degree must be at positive integer");
        }
        if(list0.size() != list1.size()) {
            throw new IllegalArgumentException("x and y must be the same length");
        }
        if(list0.isEmpty()) {
            throw new IllegalArgumentException("At least one point must be provided");
        }
        int v1 = v < list0.size() ? v : list0.size() - 1;
        ArrayList arrayList0 = new ArrayList(v + 1);
        for(int v2 = 0; v2 < v + 1; ++v2) {
            arrayList0.add(0.0f);
        }
        int v3 = list0.size();
        Matrix matrix0 = new Matrix(v1 + 1, v3);
        if(v3 > 0) {
            for(int v4 = 0; true; ++v4) {
                matrix0.set(0, v4, 1.0f);
                if(1 < v1 + 1) {
                    for(int v5 = 1; true; ++v5) {
                        matrix0.set(v5, v4, matrix0.get(v5 - 1, v4) * ((Number)list0.get(v4)).floatValue());
                        if(v5 + 1 >= v1 + 1) {
                            break;
                        }
                    }
                }
                if(v4 + 1 >= v3) {
                    break;
                }
            }
        }
        Matrix matrix1 = new Matrix(v1 + 1, v3);
        Matrix matrix2 = new Matrix(v1 + 1, v1 + 1);
        if(v1 + 1 > 0) {
            for(int v6 = 0; true; ++v6) {
                if(v3 > 0) {
                    for(int v7 = 0; true; ++v7) {
                        matrix1.set(v6, v7, matrix0.get(v6, v7));
                        if(v7 + 1 >= v3) {
                            break;
                        }
                    }
                }
                if(v6 > 0) {
                    for(int v8 = 0; true; ++v8) {
                        float f = matrix1.getRow(v6).times(matrix1.getRow(v8));
                        if(v3 > 0) {
                            for(int v9 = 0; true; ++v9) {
                                matrix1.set(v6, v9, matrix1.get(v6, v9) - matrix1.get(v8, v9) * f);
                                if(v9 + 1 >= v3) {
                                    break;
                                }
                            }
                        }
                        if(v8 + 1 >= v6) {
                            break;
                        }
                    }
                }
                float f1 = matrix1.getRow(v6).norm();
                if(((double)f1) < 0.000001) {
                    throw new IllegalArgumentException("Vectors are linearly dependent or zero so no solution. TODO(shepshapard), actually determine what this means");
                }
                float f2 = 1.0f / f1;
                if(v3 > 0) {
                    for(int v10 = 0; true; ++v10) {
                        matrix1.set(v6, v10, matrix1.get(v6, v10) * f2);
                        if(v10 + 1 >= v3) {
                            break;
                        }
                    }
                }
                if(v1 + 1 > 0) {
                    for(int v11 = 0; true; ++v11) {
                        matrix2.set(v6, v11, (v11 >= v6 ? matrix1.getRow(v6).times(matrix0.getRow(v11)) : 0.0f));
                        if(v11 + 1 >= v1 + 1) {
                            break;
                        }
                    }
                }
                if(v6 + 1 >= v1 + 1) {
                    break;
                }
            }
        }
        Vector vector0 = new Vector(v3);
        if(v3 > 0) {
            for(int v12 = 0; true; ++v12) {
                vector0.set(v12, ((Number)list1.get(v12)).floatValue() * 1.0f);
                if(v12 + 1 >= v3) {
                    break;
                }
            }
        }
        if(v1 >= 0) {
            for(int v13 = v1; true; --v13) {
                arrayList0.set(v13, matrix1.getRow(v13).times(vector0));
                int v14 = v13 + 1;
                if(v14 <= v1) {
                    for(int v15 = v1; true; --v15) {
                        arrayList0.set(v13, ((float)(((Number)arrayList0.get(v13)).floatValue() - matrix2.get(v13, v15) * ((Number)arrayList0.get(v15)).floatValue())));
                        if(v15 == v14) {
                            break;
                        }
                    }
                }
                arrayList0.set(v13, ((float)(((Number)arrayList0.get(v13)).floatValue() / matrix2.get(v13, v13))));
                if(v13 - 1 < 0) {
                    break;
                }
            }
        }
        if(v3 > 0) {
            f3 = 0.0f;
            for(int v16 = 0; true; ++v16) {
                f3 += ((Number)list1.get(v16)).floatValue();
                if(v16 + 1 >= v3) {
                    break;
                }
            }
        }
        else {
            f3 = 0.0f;
        }
        if(v3 > 0) {
            float f4 = 0.0f;
            float f5 = 0.0f;
            for(int v17 = 0; true; ++v17) {
                float f6 = ((Number)list1.get(v17)).floatValue() - ((Number)arrayList0.get(0)).floatValue();
                if(1 < v1 + 1) {
                    float f7 = 1.0f;
                    for(int v18 = 1; true; ++v18) {
                        f7 *= ((Number)list0.get(v17)).floatValue();
                        f6 -= ((Number)arrayList0.get(v18)).floatValue() * f7;
                        if(v18 + 1 >= v1 + 1) {
                            break;
                        }
                    }
                }
                f5 += f6 * 1.0f * f6;
                float f8 = ((Number)list1.get(v17)).floatValue() - f3 / ((float)v3);
                f4 += f8 * 1.0f * f8;
                if(v17 + 1 >= v3) {
                    break;
                }
            }
            return f4 <= 0.000001f ? new PolynomialFit(arrayList0, 1.0f) : new PolynomialFit(arrayList0, 1.0f - f5 / f4);
        }
        return new PolynomialFit(arrayList0, 1.0f);
    }
}

