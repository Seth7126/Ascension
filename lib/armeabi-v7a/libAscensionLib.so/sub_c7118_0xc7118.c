// 函数: sub_c7118
// 地址: 0xc7118
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t r7 = 0
int32_t r5 = arg1

if (lua_type(arg1, 1) == 8)
    r5 = lua_tothread(arg1, 1)
    r7 = 1

int32_t r0_6 = luaL_checkinteger(arg1, r7 | 2)
int32_t result
void var_88

if (lua_type(arg1, r7 + 1) != 6)
    if (lua_getstack(r5, luaL_checkinteger(arg1, r7 + 1), &var_88) == 0)
        result = luaL_argerror(arg1, r7 + 1, "level out of range")
    else
        int32_t r0_18 = lua_getlocal(r5, &var_88, r0_6)
        
        if (r0_18 == 0)
            lua_pushnil(arg1)
            result = 1
        else
            lua_xmove(r5, arg1, 1)
            lua_pushstring(arg1, r0_18)
            lua_pushvalue(arg1, 0xfffffffe)
            result = 2
else
    lua_pushvalue(arg1, r7 + 1)
    lua_pushstring(arg1, lua_getlocal(arg1, 0, r0_6))
    result = 1

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
