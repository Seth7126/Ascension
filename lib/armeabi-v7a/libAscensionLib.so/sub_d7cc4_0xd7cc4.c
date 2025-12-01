// 函数: sub_d7cc4
// 地址: 0xd7cc4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r2 = zx.d(*(arg1 + 4))
uint32_t result = 0

if (r2 == zx.d(*(arg2 + 4)))
    if (r2 == 4)
        int32_t temp0_1 = 0
        uint32_t i = arg1 - arg2
        
        while (i != 0)
            i u>>= 1
            temp0_1 += 1
        
        return (0x20 - temp0_1) u>> 5
    
    if (arg1 == arg2)
        return 1
    
    uint32_t n = *(arg1 + 0xc)
    result = 0
    
    if (n == *(arg2 + 0xc))
        int32_t temp0_2 = 0
        int32_t i_1 = memcmp(arg1 + 0x10, arg2 + 0x10, n)
        
        while (i_1 != 0)
            i_1 u>>= 1
            temp0_2 += 1
        
        return (0x20 - temp0_2) u>> 5

return result
