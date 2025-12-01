package androidx.compose.ui.text.input;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001A\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001A2\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00042\b\b\u0002\u0010\u0005\u001A\u00020\u00062\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\b\u001A\u00020\u0006H\u0002¨\u0006\t"}, d2 = {"toCharArray", "", "", "destination", "", "destinationOffset", "", "startIndex", "endIndex", "ui-text_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class GapBufferKt {
    private static final void toCharArray(String s, char[] arr_c, int v, int v1, int v2) {
        for(int v3 = v1; v3 < v2; ++v3) {
            arr_c[v + v3 - v1] = s.charAt(v3);
        }
    }

    static void toCharArray$default(String s, char[] arr_c, int v, int v1, int v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            v = 0;
        }
        if((v3 & 4) != 0) {
            v1 = 0;
        }
        if((v3 & 8) != 0) {
            v2 = s.length();
        }
        GapBufferKt.toCharArray(s, arr_c, v, v1, v2);
    }
}

