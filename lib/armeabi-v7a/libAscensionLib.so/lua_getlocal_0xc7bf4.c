// 函数: lua_getlocal
// 地址: 0xc7bf4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
char const* const result

if (arg2 == 0)
    int32_t r1_4 = *(arg1 + 8)
    result = nullptr
    
    if (*(r1_4 - 8) == 0x46)
        return sub_cad74(*(*(r1_4 - 0x10) + 0xc), arg3, 0) __tailcall
else
    int32_t* r7_1 = *(arg2 + 0x60)
    int32_t* r1_11
    int32_t r6_1
    
    if ((zx.d(*(r7_1 + 0x12)) & 1) != 0)
        if (arg3 s> 0xffffffff)
            r6_1 = r7_1[6]
            void* r0_8 = *(**r7_1 + 0xc)
            result = sub_cad74(r0_8, arg3, 0xffffffff + ((r7_1[7] - *(r0_8 + 0xc)) s>> 2))
            
            if (result == 0)
                goto label_c7c2c
            
            r1_11 = r6_1 + (arg3 << 4) - 0x10
            goto label_c7ccc
        
        int32_t* r1_15 = *r7_1
        uint32_t r2_6 = zx.d(*(*(*r1_15 + 0xc) + 0x4c))
        result = nullptr
        
        if (((r7_1[6] - r1_15) s>> 4) - r2_6 s> 0 - arg3)
            r1_11 = &r1_15[r2_6 * 4 + (0 - arg3) * 4]
            result = "(*vararg)"
        label_c7ccc:
            int32_t* r2_3 = *(arg1 + 8)
            int32_t r7_2 = r1_11[1]
            *r2_3 = *r1_11
            r2_3[1] = r7_2
            r2_3[2] = r1_11[2]
            *(arg1 + 8) += 0x10
    else
        r6_1 = *r7_1 + 0x10
    label_c7c2c:
        result = nullptr
        void* r1
        
        if (*(arg1 + 0x10) != r7_1)
            r1 = r7_1[3]
        else
            r1 = arg1 + 8
        
        if (arg3 s>= 1 && (*r1 - r6_1) s>> 4 s>= arg3)
            result = "(*temporary)"
            r1_11 = r6_1 + (arg3 << 4) - 0x10
            goto label_c7ccc

return result
