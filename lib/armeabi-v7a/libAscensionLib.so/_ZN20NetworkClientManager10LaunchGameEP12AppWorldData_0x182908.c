// 函数: _ZN20NetworkClientManager10LaunchGameEP12AppWorldData
// 地址: 0x182908
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t result = 0

if (zx.d(*(arg1 + 0x8e)) != 0)
    int32_t* r2_1 = *(arg1 + 4)
    void* entry_r1
    
    if (r2_1 != 0 && *(entry_r1 + 0xa04) == 1)
        int32_t var_18_1 = *(entry_r1 + 4)
        int32_t var_1c = 0xd4d4d4d4
        (*(*r2_1 + 8))(r2_1, &var_1c, 8)
        result = 1

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
