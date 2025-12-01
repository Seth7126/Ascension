// 函数: _ZN17GameOptionManager13OptionListEndEiPKcPFbP13CStateMachinePvjittPjES4_
// 地址: 0x1812b4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
char** result = *(arg1 + 0x3f8)

if (result != 0)
    *result = arg2
    result[1] = arg4
    int32_t arg_0
    result[2] = arg_0
    strcpy(&result[3], arg3)
    int32_t r2 = *(arg1 + 8)
    
    if (r2 != 0)
        r2(*(arg1 + 0xc), arg2)
    
    int32_t r12_1 = *(arg1 + 0x10)
    
    if (r12_1 != 0)
        void* r0_2 = *(arg1 + 0x3f8)
        
        if (*(r0_2 + 0x98) s>= 1)
            int32_t r5_1 = 1
            int32_t r6_1 = 0
            
            while (true)
                int32_t* r2_2 = *(r0_2 + 0xa0) + r6_1
                r12_1(*(arg1 + 0x14), *r2_2, r2_2 + 9, zx.d(r2_2[1].w), zx.d(*(r2_2 + 6)))
                r0_2 = *(arg1 + 0x3f8)
                
                if (r5_1 s>= *(r0_2 + 0x98))
                    break
                
                r6_1 += 0x40
                r12_1 = *(arg1 + 0x10)
                r5_1 += 1
    
    if (*(arg1 + 4) == arg2)
        *(arg1 + 0x3fc) = *(arg1 + 0x3f8)
    
    result = nullptr
    int32_t r12_2 = *(arg1 + 0x18)
    *(arg1 + 0x3f8) = 0
    
    if (r12_2 != 0)
        *(arg1 + 0x1c)
        jump(r12_2)

return result
