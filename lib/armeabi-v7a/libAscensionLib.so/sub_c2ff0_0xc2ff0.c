// 函数: sub_c2ff0
// 地址: 0xc2ff0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = lua_gettop()

if (lua_type(arg1, 1) == 4 && zx.d(*lua_tolstring(arg1, 1, 0)) == 0x23)
    lua_pushinteger(arg1, r0 - 1)
    return 1

int32_t r0_9 = luaL_checkinteger(arg1, 1)
int32_t r6 = r0_9

if (r0_9 s> r0)
    r6 = r0

if (r0_9 s< 0)
    r6 = r0_9 + r0

if (r6 s<= 0)
    luaL_argerror(arg1, 1, "index out of range")

return r0 - r6
