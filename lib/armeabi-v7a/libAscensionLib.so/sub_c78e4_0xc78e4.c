// 函数: sub_c78e4
// 地址: 0xc78e4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = lua_type(arg1, 2)

if (r0 != 0 && r0 != 5)
    luaL_argerror(arg1, 2, "nil or table expected")

lua_settop(arg1, 2)
lua_setmetatable(arg1, 1)
return 1
