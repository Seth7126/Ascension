// 函数: luaL_ref
// 地址: 0xc12c8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (lua_type(arg1, 0xffffffff) == 0)
    lua_settop(arg1, 0xfffffffe)
    return 0xffffffff

int32_t r0_2 = lua_absindex(arg1, arg2)
lua_rawgeti(arg1, r0_2, 0)
int32_t result = lua_tointegerx(arg1, 0xffffffff, 0)
lua_settop(arg1, 0xfffffffe)

if (result == 0)
    result = lua_rawlen(arg1, r0_2) + 1
else
    lua_rawgeti(arg1, r0_2, result)
    lua_rawseti(arg1, r0_2, 0)

lua_rawseti(arg1, r0_2, result)
return result
