// 函数: sub_c2f04
// 地址: 0xc2f04
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if ((lua_type(arg1, 1) | 1) != 5)
    luaL_argerror(arg1, 1, "table or string expected")

lua_pushinteger(arg1, lua_rawlen(arg1, 1))
return 1
