// 函数: luaL_pushmodule
// 地址: 0xc1bc0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

sub_c1c94(arg1, 0xfff0b9d8, "_LOADED", 1)
lua_getfield(arg1, 0xffffffff, arg2)

if (lua_type(arg1, 0xffffffff) != 5)
    lua_settop(arg1, 0xfffffffe)
    lua_rawgeti(arg1, 0xfff0b9d8, 2)
    
    if (sub_c1c94(arg1, 0, arg2, arg3) != 0)
        luaL_error(arg1, "name conflict for module '%s'", arg2)
    
    lua_pushvalue(arg1, 0xffffffff)
    lua_setfield(arg1, 0xfffffffd, arg2)

return lua_remove(arg1, 0xfffffffe) __tailcall
