// 函数: luaL_loadbufferx
// 地址: 0xc1808
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r4 = *__stack_chk_guard
int32_t var_1c = arg2
int32_t r2
int32_t var_18 = r2
int32_t var_20 = arg3
int32_t result = lua_load(arg1, sub_c1864, &var_1c)

if (*__stack_chk_guard == r4)
    return result

__stack_chk_fail()
noreturn
