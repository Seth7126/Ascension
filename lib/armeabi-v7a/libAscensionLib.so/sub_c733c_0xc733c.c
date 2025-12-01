// 函数: sub_c733c
// 地址: 0xc733c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t r0_2 = luaL_checkinteger(arg1, 2)
luaL_checktype(arg1, 1, 6)
lua_pushvalue(arg1, 1)
void var_80
lua_getinfo(arg1, 0x1c0589, &var_80)
char var_60

if (r0_2 s< 1 || r0_2 s> zx.d(var_60))
    luaL_argerror(arg1, 2, "invalid upvalue index")

int32_t r0_9 = luaL_checkinteger(arg1, 4)
luaL_checktype(arg1, 3, 6)
lua_pushvalue(arg1, 3)
lua_getinfo(arg1, 0x1c0589, &var_80)

if (r0_9 s< 1 || r0_9 s> zx.d(var_60))
    luaL_argerror(arg1, 4, "invalid upvalue index")

if (lua_iscfunction(arg1, 1) != 0)
    luaL_argerror(arg1, 1, "Lua function expected")

if (lua_iscfunction(arg1, 3) != 0)
    luaL_argerror(arg1, 3, "Lua function expected")

lua_upvaluejoin(arg1, 1, r0_2, 3, r0_9)

if (*__stack_chk_guard == r0)
    return 0

__stack_chk_fail()
noreturn
