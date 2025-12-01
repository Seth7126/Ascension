// 函数: luaL_checktype
// 地址: 0xc0bd0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t result = lua_type()

if (result != arg3)
    return luaL_argerror(arg1, arg2, 
        lua_pushfstring(arg1, "%s expected, got %s", lua_typename(arg1, arg3), 
            lua_typename(arg1, lua_type(arg1, arg2)))) __tailcall

return result
