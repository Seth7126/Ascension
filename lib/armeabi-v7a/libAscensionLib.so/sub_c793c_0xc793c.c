// 函数: sub_c793c
// 地址: 0xc793c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

luaL_checkany(arg1, 3)
int32_t r0_1 = luaL_checkinteger(arg1, 2)
luaL_checktype(arg1, 1, 6)
int32_t r0_4 = lua_setupvalue(arg1, 1, r0_1)

if (r0_4 == 0)
    return 0

lua_pushstring(arg1, r0_4)
lua_insert(arg1, 0xffffffff)
return 1
