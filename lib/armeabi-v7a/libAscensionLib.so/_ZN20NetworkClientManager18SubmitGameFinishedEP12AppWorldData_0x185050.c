// 函数: _ZN20NetworkClientManager18SubmitGameFinishedEP12AppWorldData
// 地址: 0x185050
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
                    uint32_t r1_2 = zx.d(*r7_1)
                    
                    if ((r1_2 & 0xfffe) != 4)
                        int32_t var_28_1 = *(entry_r1 + 4)
                        int32_t var_2c = 0x100f
                        (*(*r0_1 + 8))(r0_1, &var_2c, 8)
                        r1_2 = zx.d(*r7_1)
                    
                    if (r1_2 != 4)
                        *r7_1 = 5
                    
                    int32_t r0_4 = *(entry_r1 + 0x10c)
                    
                    if (*(entry_r1 + 0xa0c) u< r0_4)
                        *(entry_r1 + 0xa0c) = r0_4
                    
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
