// 函数: luaL_error
// 地址: 0xc048c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t var_8 = arg3
int32_t r3
int32_t var_4 = r3
void var_88
int32_t r0_2 = lua_getstack(arg1, 1, &var_88)

if (r0_2 != 0)
    lua_getinfo(arg1, 0x1bfdd2, &var_88)

int32_t var_74
void var_64

if (r0_2 == 0 || var_74 s< 1)
    lua_pushlstring(arg1, &data_1bfacb, 0)
else
    lua_pushfstring(arg1, "%s:%d: ", &var_64, var_74)
lua_pushvfstring(arg1, arg2, &var_8)
lua_concat(arg1, 2)
int32_t result = lua_error(arg1)

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
