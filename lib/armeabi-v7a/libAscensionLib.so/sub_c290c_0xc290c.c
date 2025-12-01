// 函数: sub_c290c
// 地址: 0xc290c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = luaL_optinteger(arg1, 2, 1)
lua_settop(arg1, 1)

if (r0 s>= 1 && lua_isstring(arg1, 1) != 0)
    luaL_where(arg1, r0)
    lua_pushvalue(arg1, 1)
    lua_concat(arg1, 2)

return lua_error(arg1) __tailcall
