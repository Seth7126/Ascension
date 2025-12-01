// 函数: sub_c77d4
// 地址: 0xc77d4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t r7 = 0
int32_t r5 = arg1

if (lua_type(arg1, 1) == 8)
    r5 = lua_tothread(arg1, 1)
    r7 = 1

void var_88
int32_t result

if (lua_getstack(r5, luaL_checkinteger(arg1, r7 + 1), &var_88) == 0)
    result = luaL_argerror(arg1, r7 + 1, "level out of range")
else
    luaL_checkany(arg1, r7 + 3)
    lua_settop(arg1, r7 + 3)
    result = 1
    lua_xmove(arg1, r5, 1)
    lua_pushstring(arg1, lua_setlocal(r5, &var_88, luaL_checkinteger(arg1, r7 | 2)))

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
