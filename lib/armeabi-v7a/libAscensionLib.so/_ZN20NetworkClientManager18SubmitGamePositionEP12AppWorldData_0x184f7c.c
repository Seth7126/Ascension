// 函数: _ZN20NetworkClientManager18SubmitGamePositionEP12AppWorldData
// 地址: 0x184f7c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r1 = *__stack_chk_guard
int32_t* r0 = *(arg1 + 4)
void* entry_r1

if (r0 != 0)
    int32_t r1_5
    
    if (zx.d(*(entry_r1 + 0x1c)) == 0)
        r1_5 = 0
    label_184ffc:
        int32_t r6_1 = *(entry_r1 + (r1_5 << 2) + 0xfc)
        
        if (r6_1 u> *(entry_r1 + 0xa0c))
            int32_t var_24_1 = *(entry_r1 + 4)
            int32_t var_28 = 0x100d
            int32_t var_20_1 = r6_1
            (*(*r0 + 8))(r0, &var_28, 0xc)
            *(entry_r1 + 0xa0c) = r6_1
    else
        if (zx.d(*(entry_r1 + 0x4c)) == 0)
            r1_5 = 1
            goto label_184ffc
        
        if (zx.d(*(entry_r1 + 0x7c)) == 0)
            r1_5 = 2
            goto label_184ffc
        
        if (zx.d(*(entry_r1 + 0xac)) == 0)
            r1_5 = 3
            goto label_184ffc
int32_t r0_1 = *__stack_chk_guard

if (r0_1 == r1)
    return r0_1 - r1

__stack_chk_fail()
noreturn
