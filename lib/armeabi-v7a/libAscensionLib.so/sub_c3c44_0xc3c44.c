// 函数: sub_c3c44
// 地址: 0xc3c44
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t r3 = arg1[5]

if (r3 s> arg1[6])
    int32_t r12_1 = *(*arg1 + 0xc)
    int32_t r3_1 = *(r12_1 + ((r3 - 1) << 2))
    
    if ((r3_1 & 0x3f) == 4)
        uint32_t r4_3 = (r3_1 u>> 0x17) + zx.d((r3_1 u>> 6).b)
        int32_t r6_3 = r3_1 u>> 6 & 0xff
        int32_t r5_1 = arg3 + arg2
        
        if (r6_3 s<= arg2 && r4_3 + 1 s>= arg2)
        label_c3cc0:
            
            if (r4_3 s< r5_1)
                r4_3 = r5_1 + 0x1ff
            
            if (r6_3 s< arg2)
                arg2 = r6_3
            
            int32_t result = (r3_1 & 0x7fc03f) | (arg2 & 0xff) << 6 | (r4_3 - arg2) << 0x17
            *(r12_1 + ((r3 - 1) << 2)) = result
            return result
        
        if (r6_3 s>= arg2 && r6_3 s<= r5_1)
            goto label_c3cc0

return sub_c4198(arg1) __tailcall
