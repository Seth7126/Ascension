// 函数: sub_c2a08
// 地址: 0xc2a08
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = 1
int32_t r0 = luaL_optlstring(arg1, 1, 0, 0)
int32_t r0_2 = luaL_optlstring(arg1, 2, 0, 0)
int32_t r0_4 = lua_type(arg1, 3)
int32_t r0_6 = luaL_loadfilex(arg1, r0, r0_2)
int32_t r1_1 = r0_4 + 1

if (r0_4 != 0xffffffff)
    r1_1 = 3

if (r0_6 != 0)
    lua_pushnil(arg1, r1_1)
    lua_insert(arg1, 0xfffffffe)
    return 2

if (r0_4 != 0xffffffff)
    lua_pushvalue(arg1, r1_1)
    result = 1
    
    if (lua_setupvalue(arg1, 0xfffffffe, 1) == 0)
        lua_settop(arg1, 0xfffffffe)
        return 1

return result
