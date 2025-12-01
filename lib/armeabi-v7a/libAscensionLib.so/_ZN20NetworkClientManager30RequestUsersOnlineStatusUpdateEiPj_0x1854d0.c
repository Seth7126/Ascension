// 函数: _ZN20NetworkClientManager30RequestUsersOnlineStatusUpdateEiPj
// 地址: 0x1854d0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r3 = *__stack_chk_guard

if (arg2 s>= 1)
    int32_t* r4_1 = *(arg1 + 4)
    
    if (r4_1 != 0)
        int32_t var_54_1 = 0
        
        if (arg2 s>= 0xc)
            arg2 = 0xc
        
        int32_t var_58 = 0x83838383
        int32_t r3_1 = arg2 << 2
        void var_4c
        int32_t entry_r2
        __aeabi_memcpy4(&var_4c, entry_r2, r3_1, r3_1, var_58, var_54_1, arg2)
        (*(*r4_1 + 8))(r4_1, &var_58, 0x3c)

int32_t r0_3 = *__stack_chk_guard

if (r0_3 == r3)
    return r0_3 - r3

__stack_chk_fail()
noreturn
