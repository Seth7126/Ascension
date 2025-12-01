// 函数: sub_c3478
// 地址: 0xc3478
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (luaL_getmetafield(arg1, 1, arg2) != 0)
    lua_pushvalue(arg1, 1)
    return lua_callk(arg1, 1, 3, 0, 0)

luaL_checktype(arg1, 1, 5)
lua_pushcclosure(arg1, arg4, 0)
lua_pushvalue(arg1, 1)

if (arg3 == 0)
    return lua_pushnil(arg1) __tailcall

return lua_pushinteger(arg1, 0) __tailcall
