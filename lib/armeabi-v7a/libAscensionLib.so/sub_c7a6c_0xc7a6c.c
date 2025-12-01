// 函数: sub_c7a6c
// 地址: 0xc7a6c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

luaL_getsubtable(arg1, 0xfff0b9d8, "_HKEY")
lua_pushthread(arg1)
lua_rawget(arg1, 0xfffffffe)
int32_t result = lua_type(arg1, 0xffffffff)

if (result != 6)
    return result

lua_pushstring(arg1, (&data_1d7468)[*arg2])
int32_t r1_2 = arg2[5]

if (r1_2 s< 0)
    lua_pushnil(arg1, r1_2)
else
    lua_pushinteger(arg1, r1_2)

return lua_callk(arg1, 2, 0, 0, 0)
