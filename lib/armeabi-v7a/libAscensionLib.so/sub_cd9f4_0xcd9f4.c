// 函数: sub_cd9f4
// 地址: 0xcd9f4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = lua_gettop()

if (r0 s>= 0x13)
    luaL_argerror(arg1, 0x11, "too many options")

int32_t r7 = 1
lua_pushvalue(arg1, 1)
lua_pushinteger(arg1, r0 - 1)
lua_pushboolean(arg1, arg2)

if (r0 s>= 2)
    do
        r7 += 1
        lua_pushvalue(arg1, r7)
    while (r0 != r7)

return lua_pushcclosure(arg1, sub_cda94, r0 + 2) __tailcall
