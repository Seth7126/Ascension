// 函数: sub_c72cc
// 地址: 0xc72cc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = luaL_checkinteger(arg1, 2)
luaL_checktype(arg1, 1, 6)
int32_t r0_3 = lua_getupvalue(arg1, 1, r0)

if (r0_3 == 0)
    return 0

lua_pushstring(arg1, r0_3)
lua_insert(arg1, 0xfffffffe)
return 2
