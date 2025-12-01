// 函数: _ZN20NetworkClientManager16AcceptGameInviteEP12AppWorldData
// 地址: 0x182f1c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t result = 0

if (zx.d(*(arg1 + 0x8e)) != 0)
    int32_t* r2_1 = *(arg1 + 4)
    void* entry_r1
    
    if (r2_1 != 0 && *(entry_r1 + 0xa04) == 1)
        int32_t* r4_2 = *(arg1 + 0xdc)
        int32_t r3_1 = *(arg1 + 0xe0)
        
        if (r4_2 != r3_1)
            do
                int32_t r5_1 = *r4_2
                r4_2 = &r4_2[1]
                
                if (r5_1 == entry_r1)
                    int32_t var_24_1 = 0
                    int32_t var_28 = 0xfbfbfbfb
                    int32_t var_20_1 = *(entry_r1 + 4)
                    (*(*r2_1 + 8))(r2_1, &var_28, 0xc)
                    result = 1
                    break
            while (r3_1 != r4_2)

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
