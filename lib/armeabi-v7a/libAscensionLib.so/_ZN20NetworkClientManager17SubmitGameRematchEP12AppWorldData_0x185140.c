// 函数: _ZN20NetworkClientManager17SubmitGameRematchEP12AppWorldData
// 地址: 0x185140
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* entry_r1

if (entry_r1 != 0)
    int32_t* r0_1 = *(arg1 + 4)
    
    if (r0_1 != 0)
        int32_t r1 = *(entry_r1 + 0xa08)
        
        if (r1 != 0)
            void* r7_1 = entry_r1 + 0x1e
            int32_t r3_1 = 0
            
            do
                if (*(r7_1 - 0xa) == *(arg1 + 0xa4))
                    int32_t var_2c_1 = 0
                    int32_t var_30 = 0xf9f9f9f9
                    int32_t var_28_1 = *(entry_r1 + 4)
                    (*(*r0_1 + 8))(r0_1, &var_30, 0xc)
                    
                    if (zx.d(*r7_1) != 4)
                        *r7_1 = 5
                    
                    int32_t r0_5 = *(entry_r1 + 0x10c)
                    
                    if (*(entry_r1 + 0xa0c) u< r0_5)
                        *(entry_r1 + 0xa0c) = r0_5
                    
                    NetworkClientManager::InsertGameData(arg1)
                    break
                
                r3_1 += 1
                r7_1 += 0x30
            while (r3_1 u< r1)

int32_t r0_2 = *__stack_chk_guard

if (r0_2 == r0)
    return r0_2 - r0

__stack_chk_fail()
noreturn
