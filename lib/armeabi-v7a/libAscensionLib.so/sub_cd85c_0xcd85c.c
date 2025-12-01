// 函数: sub_cd85c
// 地址: 0xcd85c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (lua_type(arg1, 1) s>= 1)
    char* r0_2 = lua_tolstring(arg1, 1, 0)
    
    if (r0_2 == 0)
        if (*(luaL_checkudata(arg1, 1, "FILE*") + 4) == 0)
            luaL_error(arg1, "attempt to use a closed file")
        
        lua_pushvalue(arg1, 1)
    else
        sub_cd91c(arg1, r0_2, arg3)
    
    lua_setfield(arg1, 0xfff0b9d8, arg2)

return lua_getfield(arg1, 0xfff0b9d8, arg2) __tailcall
