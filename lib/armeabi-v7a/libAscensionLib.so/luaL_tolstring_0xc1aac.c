// 函数: luaL_tolstring
// 地址: 0xc1aac
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (luaL_callmeta(arg1, arg2, "__tostring") == 0)
    int32_t r0_4 = lua_type(arg1, arg2)
    
    if (r0_4 - 3 u< 2)
        lua_pushvalue(arg1, arg2)
    else if (r0_4 == 0)
        lua_pushlstring(arg1, 0x1bfe95, 3)
    else if (r0_4 != 1)
        lua_pushfstring(arg1, "%s: %p", lua_typename(arg1, lua_type(arg1, arg2)), 
            lua_topointer(arg1, arg2))
    else
        char const* const r1_4 = "false"
        
        if (lua_toboolean(arg1, arg2) != 0)
            r1_4 = "true"
        
        lua_pushstring(arg1, r1_4, "true")

return lua_tolstring(arg1, 0xffffffff, arg3) __tailcall
