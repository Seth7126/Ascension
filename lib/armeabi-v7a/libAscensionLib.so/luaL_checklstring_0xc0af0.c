// 函数: luaL_checklstring
// 地址: 0xc0af0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = lua_tolstring()

if (result != 0)
    return result

luaL_argerror(arg1, arg2, 
    lua_pushfstring(arg1, "%s expected, got %s", lua_typename(arg1, 4), 
        lua_typename(arg1, lua_type(arg1, arg2))))
return result
