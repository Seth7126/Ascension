// 函数: _ZN26CReliableTCPConnectionIPV64SendEPKcj
// 地址: 0xbbb54
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t result = 0
int32_t entry_r2

if (zx.d(arg1[0x18]) != 0 && arg2 != 0 && entry_r2 u<= 0x7d0)
    int32_t var_7fc_1 = 0xabcdef0
    int32_t result_1 = (entry_r2 + 3) & 0xfffffffc
    int32_t var_800_1 = result_1 + 4
    void var_7f8
    __aeabi_memcpy(&var_7f8, arg2, result_1)
    result = CReliableTCPConnectionIPV6::Send(arg1)
    
    if (result != 0)
        result = result_1

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
