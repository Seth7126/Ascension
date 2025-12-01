// 函数: _ZN20NetworkClientManager22SetNotificationSettingEib
// 地址: 0x185a5c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = 0
int32_t r3 = *__stack_chk_guard

if (arg2 u<= 2)
    int32_t r3_1 = arg1 + (arg2 << 1)
    
    if (zx.d(*(r3_1 + 0x5e4)) != 0)
        result = 1
        int32_t entry_r2
        
        if (zx.d(*(r3_1 + 0x5e5)) != entry_r2)
            *(r3_1 + 0x5e5) = entry_r2.b
            int32_t var_28_1 = 0
            int32_t var_2c = 0xdfdfdfdf
            int32_t var_24_1 = arg2
            int32_t var_20_1 = entry_r2
            int32_t* r0_3 = *(arg1 + 4)
            (*(*r0_3 + 8))(r0_3, &var_2c, 0x10)

if (*__stack_chk_guard == r3)
    return result

__stack_chk_fail()
noreturn
