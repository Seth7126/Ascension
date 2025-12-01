package com.google.android.vending.licensing.util;

public class Base64 {
    static final boolean $assertionsDisabled = false;
    private static final byte[] ALPHABET = null;
    private static final byte[] DECODABET = null;
    public static final boolean DECODE = false;
    public static final boolean ENCODE = true;
    private static final byte EQUALS_SIGN = 61;
    private static final byte EQUALS_SIGN_ENC = -1;
    private static final byte NEW_LINE = 10;
    private static final byte[] WEBSAFE_ALPHABET = null;
    private static final byte[] WEBSAFE_DECODABET = null;
    private static final byte WHITE_SPACE_ENC = -5;

    static {
        Base64.ALPHABET = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 0x4F, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 0x6F, 0x70, 0x71, 0x72, 0x73, 0x74, 0x75, 0x76, 0x77, 120, 0x79, 0x7A, 0x30, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 0x2F};
        Base64.WEBSAFE_ALPHABET = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 0x4F, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 0x6F, 0x70, 0x71, 0x72, 0x73, 0x74, 0x75, 0x76, 0x77, 120, 0x79, 0x7A, 0x30, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 0x5F};
        Base64.DECODABET = new byte[]{-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 0x3F, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 0x1F, 0x20, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 0x2F, 0x30, 49, 50, 51, -9, -9, -9, -9, -9};
        Base64.WEBSAFE_DECODABET = new byte[]{-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, 0x3F, -9, 26, 27, 28, 29, 30, 0x1F, 0x20, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 0x2F, 0x30, 49, 50, 51, -9, -9, -9, -9, -9};
    }

    public static byte[] decode(String s) throws Base64DecoderException [...] // 潜在的解密器

    public static byte[] decode(byte[] arr_b) throws Base64DecoderException {
        return Base64.decode(arr_b, 0, arr_b.length);
    }

    public static byte[] decode(byte[] arr_b, int v, int v1) throws Base64DecoderException {
        return Base64.decode(arr_b, v, v1, Base64.DECODABET);
    }

    public static byte[] decode(byte[] arr_b, int v, int v1, byte[] arr_b1) throws Base64DecoderException {
        byte[] arr_b2 = new byte[v1 * 3 / 4 + 2];
        byte[] arr_b3 = new byte[4];
        int v3 = 0;
        int v4 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            int v5 = v2 + v;
            byte b = (byte)(arr_b[v5] & 0x7F);
            int v6 = arr_b1[b];
            if(v6 < -5) {
                throw new Base64DecoderException("Bad Base64 input character at " + v2 + ": " + ((int)arr_b[v5]) + "(decimal)");
            }
            if(v6 >= -1) {
                if(b == 61) {
                    int v7 = (byte)(arr_b[v1 - 1 + v] & 0x7F);
                    if(v3 == 0 || v3 == 1) {
                        throw new Base64DecoderException("invalid padding byte \'=\' at byte offset " + v2);
                    }
                    if(v3 == 3 && v1 - v2 > 2 || v3 == 4 && v1 - v2 > 1) {
                        throw new Base64DecoderException("padding byte \'=\' falsely signals end of encoded value at offset " + v2);
                    }
                    if(v7 != 10 && v7 != 61) {
                        throw new Base64DecoderException("encoded value has invalid trailing byte");
                    }
                    break;
                }
                arr_b3[v3] = b;
                if(v3 + 1 == 4) {
                    v4 += Base64.decode4to3(arr_b3, 0, arr_b2, v4, arr_b1);
                    v3 = 0;
                }
                else {
                    ++v3;
                }
            }
        }
        switch(v3) {
            case 0: {
                break;
            }
            case 1: {
                throw new Base64DecoderException("single trailing character at offset " + (v1 - 1));
            }
            default: {
                arr_b3[v3] = 61;
                v4 += Base64.decode4to3(arr_b3, 0, arr_b2, v4, arr_b1);
                break;
            }
        }
        byte[] arr_b4 = new byte[v4];
        System.arraycopy(arr_b2, 0, arr_b4, 0, v4);
        return arr_b4;
    }

    private static int decode4to3(byte[] arr_b, int v, byte[] arr_b1, int v1, byte[] arr_b2) {
        int v2 = arr_b[v + 2];
        if(v2 == 61) {
            arr_b1[v1] = (byte)((arr_b2[arr_b[v + 1]] << 24 >>> 12 | arr_b2[arr_b[v]] << 24 >>> 6) >>> 16);
            return 1;
        }
        int v3 = arr_b[v + 3];
        if(v3 == 61) {
            int v4 = arr_b2[arr_b[v + 1]] << 24 >>> 12 | arr_b2[arr_b[v]] << 24 >>> 6 | arr_b2[v2] << 24 >>> 18;
            arr_b1[v1] = (byte)(v4 >>> 16);
            arr_b1[v1 + 1] = (byte)(v4 >>> 8);
            return 2;
        }
        int v5 = arr_b2[arr_b[v + 1]] << 24 >>> 12 | arr_b2[arr_b[v]] << 24 >>> 6 | arr_b2[v2] << 24 >>> 18 | arr_b2[v3] << 24 >>> 24;
        arr_b1[v1] = (byte)(v5 >> 16);
        arr_b1[v1 + 1] = (byte)(v5 >> 8);
        arr_b1[v1 + 2] = (byte)v5;
        return 3;
    }

    public static byte[] decodeWebSafe(String s) throws Base64DecoderException {
        byte[] arr_b = s.getBytes();
        return Base64.decodeWebSafe(arr_b, 0, arr_b.length);
    }

    public static byte[] decodeWebSafe(byte[] arr_b) throws Base64DecoderException {
        return Base64.decodeWebSafe(arr_b, 0, arr_b.length);
    }

    public static byte[] decodeWebSafe(byte[] arr_b, int v, int v1) throws Base64DecoderException {
        return Base64.decode(arr_b, v, v1, Base64.WEBSAFE_DECODABET);
    }

    public static String encode(byte[] arr_b) {
        return Base64.encode(arr_b, 0, arr_b.length, Base64.ALPHABET, true);
    }

    public static String encode(byte[] arr_b, int v, int v1, byte[] arr_b1, boolean z) {
        byte[] arr_b2 = Base64.encode(arr_b, v, v1, arr_b1, 0x7FFFFFFF);
        int v2;
        for(v2 = arr_b2.length; !z && v2 > 0 && arr_b2[v2 - 1] == 61; --v2) {
        }
        return new String(arr_b2, 0, v2);
    }

    public static byte[] encode(byte[] arr_b, int v, int v1, byte[] arr_b1, int v2) {
        int v3 = (v1 + 2) / 3 * 4;
        byte[] arr_b2 = new byte[v3 + v3 / v2];
        int v4 = 0;
        int v5 = 0;
        int v6 = 0;
        while(v4 < v1 - 2) {
            int v7 = arr_b[v4 + v] << 24 >>> 8 | arr_b[v4 + 1 + v] << 24 >>> 16 | arr_b[v4 + 2 + v] << 24 >>> 24;
            arr_b2[v5] = arr_b1[v7 >>> 18];
            arr_b2[v5 + 1] = arr_b1[v7 >>> 12 & 0x3F];
            arr_b2[v5 + 2] = arr_b1[v7 >>> 6 & 0x3F];
            arr_b2[v5 + 3] = arr_b1[v7 & 0x3F];
            v6 += 4;
            if(v6 == v2) {
                arr_b2[v5 + 4] = 10;
                ++v5;
                v6 = 0;
            }
            v4 += 3;
            v5 += 4;
        }
        if(v4 < v1) {
            Base64.encode3to4(arr_b, v4 + v, v1 - v4, arr_b2, v5, arr_b1);
            if(v6 + 4 == v2) {
                arr_b2[v5 + 4] = 10;
            }
        }
        return arr_b2;
    }

    private static byte[] encode3to4(byte[] arr_b, int v, int v1, byte[] arr_b1, int v2, byte[] arr_b2) {
        int v3 = 0;
        int v4 = v1 <= 0 ? 0 : arr_b[v] << 24 >>> 8;
        int v5 = v1 <= 1 ? 0 : arr_b[v + 1] << 24 >>> 16;
        if(v1 > 2) {
            v3 = arr_b[v + 2] << 24 >>> 24;
        }
        int v6 = v4 | v5 | v3;
        switch(v1) {
            case 1: {
                arr_b1[v2] = arr_b2[v6 >>> 18];
                arr_b1[v2 + 1] = arr_b2[v6 >>> 12 & 0x3F];
                arr_b1[v2 + 2] = 61;
                arr_b1[v2 + 3] = 61;
                return arr_b1;
            }
            case 2: {
                arr_b1[v2] = arr_b2[v6 >>> 18];
                arr_b1[v2 + 1] = arr_b2[v6 >>> 12 & 0x3F];
                arr_b1[v2 + 2] = arr_b2[v6 >>> 6 & 0x3F];
                arr_b1[v2 + 3] = 61;
                return arr_b1;
            }
            case 3: {
                arr_b1[v2] = arr_b2[v6 >>> 18];
                arr_b1[v2 + 1] = arr_b2[v6 >>> 12 & 0x3F];
                arr_b1[v2 + 2] = arr_b2[v6 >>> 6 & 0x3F];
                arr_b1[v2 + 3] = arr_b2[v6 & 0x3F];
                return arr_b1;
            }
            default: {
                return arr_b1;
            }
        }
    }

    public static String encodeWebSafe(byte[] arr_b, boolean z) {
        return Base64.encode(arr_b, 0, arr_b.length, Base64.WEBSAFE_ALPHABET, z);
    }
}

