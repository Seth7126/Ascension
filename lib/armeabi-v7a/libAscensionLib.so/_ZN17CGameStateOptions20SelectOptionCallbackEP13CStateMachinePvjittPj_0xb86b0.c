// 函数: _ZN17CGameStateOptions20SelectOptionCallbackEP13CStateMachinePvjittPj
// 地址: 0xb86b0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = 0

if (arg2 != 0)
    int32_t r2 = *(arg2 + 0x38)
    bool cond:0_1 = arg4 s> 0
    
    if (arg4 s>= 0)
        cond:0_1 = r2 s> arg4
    
    if (not(cond:0_1))
        printf("    selected option (%d) out of range (%d)\n", arg4, r2)
        return 0
    
    int16_t* r2_2 = *(arg2 + 0x40) + (arg4 << 4)
    
    if (r2_2 == 0)
        printf("    Selected Option %d: NULL\n", arg4, r2_2)
        return 0
    
    if (zx.d(*r2_2) == arg5.d && zx.d(r2_2[1]) == arg6.d)
        *(arg2 + 0x38) = 0
        result = 1
        
        if (arg1 != 0)
            int32_t r12_3 = *(r2_2 + 8)
            
            if (r12_3 != 0)
                r12_3(arg1, arg2, *(r2_2 + 0xc), arg7)
                return 1

return result
