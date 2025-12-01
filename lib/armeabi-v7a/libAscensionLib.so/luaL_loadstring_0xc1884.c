// 函数: luaL_loadstring
// 地址: 0xc1884
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
uint32_t r0_2 = strlen(arg2)
char* var_24 = arg2
int32_t result = lua_load(arg1, sub_c1864, &var_24, arg2, 0, var_24, r0_2, r0)

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
