// 函数: luaL_callmeta
// 地址: 0xc1970
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = lua_absindex()
int32_t result = 0

if (lua_getmetatable(arg1, r0) != 0)
    lua_pushstring(arg1, arg3)
    lua_rawget(arg1, 0xfffffffe)
    
    if (lua_type(arg1, 0xffffffff) == 0)
        lua_settop(arg1, 0xfffffffd)
    else
        lua_remove(arg1, 0xfffffffe)
        lua_pushvalue(arg1, r0)
        result = 1
        lua_callk(arg1, 1, 1, 0, 0)

return result
