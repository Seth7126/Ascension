// 函数: luaL_getsubtable
// 地址: 0xc2028
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

lua_getfield()
int32_t result = 1

if (lua_type(arg1, 0xffffffff) != 5)
    lua_settop(arg1, 0xfffffffe)
    int32_t r0_4 = lua_absindex(arg1, arg2)
    result = 0
    lua_createtable(arg1, 0, 0)
    lua_pushvalue(arg1, 0xffffffff)
    lua_setfield(arg1, r0_4, arg3)

return result
