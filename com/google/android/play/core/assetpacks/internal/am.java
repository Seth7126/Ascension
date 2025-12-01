package com.google.android.play.core.assetpacks.internal;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import jeb.synthetic.FIN;

public final class am {
    public static long a(an an0, InputStream inputStream0, OutputStream outputStream0, long v) throws IOException {
        byte[] arr_b = new byte[0x4000];
        DataInputStream dataInputStream0 = new DataInputStream(new BufferedInputStream(inputStream0, 0x1000));
        int v1 = dataInputStream0.readInt();
        if(v1 != 0xD1FFD1FF) {
            throw new al("Unexpected magic=" + String.format("%x", v1));
        }
        int v2 = dataInputStream0.read();
        if(v2 == 4) {
            long v3 = 0L;
            int v4 = FIN.finallyOpen$NT();
            while(true) {
                long v5 = v - v3;
                int v6 = dataInputStream0.read();
                switch(v6) {
                    case -1: {
                        FIN.finallyExec$NT(v4);
                        throw new IOException("Patch file overrun");
                    }
                    case 0: {
                        FIN.finallyCodeBegin$NT(v4);
                        outputStream0.flush();
                        FIN.finallyCodeEnd$NT(v4);
                        return v3;
                    label_18:
                        am.c(arr_b, dataInputStream0, outputStream0, v6, v5);
                        break;
                    }
                    case 0xF7: {
                        v6 = dataInputStream0.readUnsignedShort();
                        am.c(arr_b, dataInputStream0, outputStream0, v6, v5);
                        break;
                    }
                    case 0xF8: {
                        v6 = dataInputStream0.readInt();
                        am.c(arr_b, dataInputStream0, outputStream0, v6, v5);
                        break;
                    }
                    case 0xF9: {
                        long v7 = (long)dataInputStream0.readUnsignedShort();
                        v6 = dataInputStream0.read();
                        if(v6 != -1) {
                            am.b(arr_b, an0, outputStream0, v7, v6, v5);
                            break;
                        }
                        FIN.finallyExec$NT(v4);
                        throw new IOException("Unexpected end of patch");
                    }
                    case 0xFA: {
                        long v8 = (long)dataInputStream0.readUnsignedShort();
                        v6 = dataInputStream0.readUnsignedShort();
                        am.b(arr_b, an0, outputStream0, v8, v6, v5);
                        break;
                    }
                    case 0xFB: {
                        long v9 = (long)dataInputStream0.readUnsignedShort();
                        v6 = dataInputStream0.readInt();
                        am.b(arr_b, an0, outputStream0, v9, v6, v5);
                        break;
                    }
                    case 0xFC: {
                        long v10 = (long)dataInputStream0.readInt();
                        v6 = dataInputStream0.read();
                        if(v6 != -1) {
                            am.b(arr_b, an0, outputStream0, v10, v6, v5);
                            break;
                        }
                        FIN.finallyExec$NT(v4);
                        throw new IOException("Unexpected end of patch");
                    }
                    case 0xFD: {
                        long v11 = (long)dataInputStream0.readInt();
                        v6 = dataInputStream0.readUnsignedShort();
                        am.b(arr_b, an0, outputStream0, v11, v6, v5);
                        break;
                    }
                    case 0xFE: {
                        long v12 = (long)dataInputStream0.readInt();
                        v6 = dataInputStream0.readInt();
                        am.b(arr_b, an0, outputStream0, v12, v6, v5);
                        break;
                    }
                    case 0xFF: {
                        long v13 = dataInputStream0.readLong();
                        v6 = dataInputStream0.readInt();
                        am.b(arr_b, an0, outputStream0, v13, v6, v5);
                        break;
                    }
                    default: {
                        goto label_18;
                    }
                }
                v3 += (long)v6;
            }
        }
        throw new al("Unexpected version=" + v2);
    }

    private static void b(byte[] arr_b, an an0, OutputStream outputStream0, long v, int v1, long v2) throws IOException {
        if(v1 < 0) {
            throw new IOException("copyLength negative");
        }
        if(v < 0L) {
            throw new IOException("inputOffset negative");
        }
        if(((long)v1) <= v2) {
            try(InputStream inputStream0 = new ao(an0, v, ((long)v1)).c()) {
                while(v1 > 0) {
                    int v3 = Math.min(v1, 0x4000);
                    for(int v4 = 0; true; v4 += v5) {
                        if(v4 >= v3) {
                            break;
                        }
                        int v5 = inputStream0.read(arr_b, v4, v3 - v4);
                        if(v5 == -1) {
                            throw new IOException("truncated input stream");
                        }
                    }
                    outputStream0.write(arr_b, 0, v3);
                    v1 -= v3;
                }
                return;
            }
            catch(EOFException eOFException0) {
                throw new IOException("patch underrun", eOFException0);
            }
        }
        throw new IOException("Output length overrun");
    }

    private static void c(byte[] arr_b, DataInputStream dataInputStream0, OutputStream outputStream0, int v, long v1) throws IOException {
        if(v < 0) {
            throw new IOException("copyLength negative");
        }
        if(((long)v) > v1) {
            throw new IOException("Output length overrun");
        }
        while(v > 0) {
            try {
                int v2 = Math.min(v, 0x4000);
                dataInputStream0.readFully(arr_b, 0, v2);
                outputStream0.write(arr_b, 0, v2);
                v -= v2;
            }
            catch(EOFException unused_ex) {
                throw new IOException("patch underrun");
            }
        }
    }
}

