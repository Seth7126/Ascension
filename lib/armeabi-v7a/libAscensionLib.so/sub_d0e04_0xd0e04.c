// 函数: sub_d0e04
// 地址: 0xd0e04
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t exp
int32_t r1
exp, r1 = luaL_checknumber(arg1, 1)
luaL_checkinteger(arg1, 2)
ldexp(arg2, exp)
lua_pushnumber(arg1)
return 1
