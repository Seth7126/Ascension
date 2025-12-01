// 函数: _ZN20NetworkClientManager18SubmitChatPositionEjj
// 地址: 0x185860
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t* r0_1 = *(arg1 + 4)

if (r0_1 != 0)
    int32_t* r3_1 = *(arg1 + 0xdc)
    int32_t r2_1 = *(arg1 + 0xe0)
    
    if (r3_1 != r2_1)
        do
            void* r6_1 = *r3_1
            r3_1 = &r3_1[1]
            
            if (*(r6_1 + 4) == arg2)
                int32_t entry_r2
                
                if (r6_1 != 0 && (zx.d(*(r6_1 + 0x1c)) == 0 || zx.d(*(r6_1 + 0x4c)) == 0
                        || zx.d(*(r6_1 + 0x7c)) == 0 || zx.d(*(r6_1 + 0xac)) == 0)
                        && *(r6_1 + 0xa24) u< entry_r2)
                    uint32_t var_24_1 = arg2
                    int32_t var_28 = 0x100c
                    int32_t var_20_1 = entry_r2
                    (*(*r0_1 + 8))(r0_1, &var_28, 0xc)
                    *(r6_1 + 0xa24) = entry_r2
                
                break
        while (r2_1 != r3_1)

int32_t r0_2 = *__stack_chk_guard

if (r0_2 == r0)
    return r0_2 - r0

__stack_chk_fail()
noreturn
