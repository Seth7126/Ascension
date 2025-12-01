// 函数: _ZN17GameOptionManager32SelectOptionByInstanceIDWithDataEtj
// 地址: 0x180d48
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r4 = arg1
int32_t result = 0
int32_t r0 = *__stack_chk_guard
int32_t entry_r2
int32_t var_28 = entry_r2

if (arg2 != 0)
    void* r6_1 = *(r4 + 0x3fc)
    
    if (r6_1 != 0)
        int32_t r0_4 = *(r6_1 + 0x98)
        
        if (r0_4 s>= 1)
            int32_t r3_1 = 0
            int16_t* r7_1 = *(r6_1 + 0xa0) + 4
            
            while (true)
                if (zx.d(*r7_1) == arg2)
                    int32_t lr_1 = *(r6_1 + 4)
                    result = 1
                    
                    if (lr_1 != 0)
                        uint32_t var_38_1 = arg2
                        uint32_t var_34_1 = zx.d(r7_1[1])
                        int32_t* var_30_1 = &var_28
                        lr_1(*r4, *(r6_1 + 8), *(r4 + 4))
                        *(r4 + 4)
                        GameOptionManager::ResetPlayerOptionEntry(r4)
                    
                    break
                
                r3_1 += 1
                r7_1 = &r7_1[0x20]
                
                if (r3_1 s>= r0_4)
                    result = 0
                    break

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
