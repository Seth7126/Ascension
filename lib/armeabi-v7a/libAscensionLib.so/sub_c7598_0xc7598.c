// 函数: sub_c7598
// 地址: 0xc7598
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (lua_type(arg1, 1) == 2)
    luaL_argerror(arg1, 1, "full userdata expected, got light userdata")

luaL_checktype(arg1, 1, 7)

if (lua_type(arg1, 2) s>= 1)
    luaL_checktype(arg1, 2, 5)

lua_settop(arg1, 2)
lua_setuservalue(arg1, 1)
return 1
