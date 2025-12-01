// 函数: sub_c3528
// 地址: 0xc3528
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = luaL_checkinteger(arg1, 2)
luaL_checktype(arg1, 1, 5)
lua_pushinteger(arg1, r0 + 1)
lua_rawgeti(arg1, 1, r0 + 1)

if (lua_type(arg1, 0xffffffff) == 0)
    return 1

return 2
