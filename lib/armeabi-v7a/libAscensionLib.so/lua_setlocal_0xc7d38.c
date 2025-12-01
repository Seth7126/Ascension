// 函数: lua_setlocal
// 地址: 0xc7d38
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r7 = *(arg2 + 0x60)
char const* const result
int32_t* r1_8
int32_t r6_1

if ((zx.d(*(r7 + 0x12)) & 1) != 0)
    if (arg3 s> 0xffffffff)
        r6_1 = r7[6]
        void* r0_5 = *(**r7 + 0xc)
        result = sub_cad74(r0_5, arg3, 0xffffffff + ((r7[7] - *(r0_5 + 0xc)) s>> 2))
        
        if (result == 0)
            goto label_c7d68
        
        r1_8 = r6_1 + (arg3 << 4) - 0x10
        goto label_c7e1c
    
    int32_t* r1_9 = *r7
    uint32_t r2_4 = zx.d(*(*(*r1_9 + 0xc) + 0x4c))
    result = nullptr
    
    if (((r7[6] - r1_9) s>> 4) - r2_4 s> 0 - arg3)
        r1_8 = &r1_9[r2_4 * 4 + (0 - arg3) * 4]
        result = "(*vararg)"
    label_c7e1c:
        int32_t r2_5 = *(arg1 + 8)
        int32_t r7_2 = *(r2_5 - 0xc)
        *r1_8 = *(r2_5 - 0x10)
        r1_8[1] = r7_2
        r1_8[2] = *(r2_5 - 8)
else
    r6_1 = *r7 + 0x10
label_c7d68:
    result = nullptr
    void* r1
    
    if (*(arg1 + 0x10) != r7)
        r1 = r7[3]
    else
        r1 = arg1 + 8
    
    if (arg3 s>= 1 && (*r1 - r6_1) s>> 4 s>= arg3)
        result = "(*temporary)"
        r1_8 = r6_1 + (arg3 << 4) - 0x10
        goto label_c7e1c
*(arg1 + 8) -= 0x10
return result
