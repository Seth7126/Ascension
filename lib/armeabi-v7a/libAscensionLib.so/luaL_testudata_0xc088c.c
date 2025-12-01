// 函数: luaL_testudata
// 地址: 0xc088c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = lua_touserdata()

if (r0 != 0 && lua_getmetatable(arg1, arg2) != 0)
    lua_getfield(arg1, 0xfff0b9d8, arg3)
    int32_t r0_5 = lua_rawequal(arg1, 0xffffffff, 0xfffffffe)
    lua_settop(arg1, 0xfffffffd)
    
    if (r0_5 == 0)
        return r0_5
    
    return r0

return 0
