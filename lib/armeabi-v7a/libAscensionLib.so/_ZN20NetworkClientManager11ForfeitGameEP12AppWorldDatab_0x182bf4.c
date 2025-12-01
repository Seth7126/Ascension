// 函数: _ZN20NetworkClientManager11ForfeitGameEP12AppWorldDatab
// 地址: 0x182bf4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r4 = arg2
int32_t r0 = *__stack_chk_guard
int32_t result = 0

if (zx.d(*(arg1 + 0x8e)) != 0)
    int32_t* lr_1 = *(arg1 + 4)
    
    if (lr_1 != 0 && *(r4 + 0xa04) == 2)
        for (int32_t* i = *(arg1 + 0xdc); i != *(arg1 + 0xe0); i = &i[1])
            if (*i == r4)
                int32_t r7_1 = *(r4 + 0xa08)
                
                if (r7_1 != 0)
                    int32_t r2_2 = 0
                    void* r6_1 = r4 + 0x1e
                    
                    while (*(r6_1 - 0xa) != *(arg1 + 0xa4))
                        r2_2 += 1
                        r6_1 += 0x30
                        
                        if (r2_2 u>= r7_1)
                            goto label_182cb8
                    
                    uint32_t r0_1 = zx.d(*r6_1)
                    int32_t entry_r2
                    
                    if ((r0_1 & 0xfffe) != 4)
                        int32_t var_30_1 = *(r4 + 4)
                        int32_t var_34 = 0xfefefefe
                        int32_t var_2c_1 = entry_r2
                        (*(*lr_1 + 8))(lr_1, &var_34, 0xc)
                        r0_1 = zx.d(*r6_1)
                    
                    if (r0_1 != 4)
                        int16_t r0_5 = 4
                        
                        if (entry_r2 != 0)
                            r0_5 = 5
                        
                        *r6_1 = r0_5
                    
                    int32_t r0_6 = *(r4 + 0x10c)
                    
                    if (*(r4 + 0xa0c) u< r0_6)
                        *(r4 + 0xa0c) = r0_6
                    
                    NetworkClientManager::InsertGameData(arg1)
                    result = 1
                    break
            
        label_182cb8:

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
