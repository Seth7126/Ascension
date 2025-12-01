// 函数: luaL_len
// 地址: 0xc1a24
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
lua_len(arg1)
int32_t var_20
int32_t result = lua_tointegerx(arg1, 0xffffffff, &var_20)

if (var_20 == 0)
    luaL_error(arg1, "object length is not a number")

lua_settop(arg1, 0xfffffffe)

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
