// 函数: luaL_checkudata
// 地址: 0xc0910
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = lua_touserdata()

if (result != 0 && lua_getmetatable(arg1, arg2) != 0)
    lua_getfield(arg1, 0xfff0b9d8, arg3)
    int32_t r0_4 = lua_rawequal(arg1, 0xffffffff, 0xfffffffe)
    lua_settop(arg1, 0xfffffffd)
    
    if (r0_4 != 0)
        return result

luaL_argerror(arg1, arg2, 
    lua_pushfstring(arg1, "%s expected, got %s", arg3, lua_typename(arg1, lua_type(arg1, arg2))))
return 0
