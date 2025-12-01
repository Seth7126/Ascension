// 函数: _Z10strcpyUtf8PcjPKc
// 地址: 0xb9bdc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

char* r3 = arg1

if (arg3 != 0)
    uint32_t i = zx.d(*arg3)
    r3 = arg1
    
    if ((i & 0xc0) != 0x80)
        if (arg2 == 1)
            r3 = arg1
        label_b9c64:
            
            if ((i & 0xc0) == 0x80)
                void* r1_3 = arg3 - 1
                uint32_t r2_1
                
                do
                    r2_1 = zx.d(*r1_3)
                    r1_3 -= 1
                    r3 -= 1
                while ((r2_1 & 0xc0) == 0x80)
        else
            r3 = arg1
            
            if (i != 0)
                int32_t r1 = 0
                
                do
                    arg1[r1] = i.b
                    i = zx.d(arg3[1 + r1])
                    
                    if (arg2 - 2 == r1)
                        arg3 = &arg3[r1 + 1]
                        r3 = &arg1[r1 + 1]
                        goto label_b9c64
                    
                    r1 += 1
                while (i != 0)
                
                r3 = &arg1[r1]

*r3 = 0
