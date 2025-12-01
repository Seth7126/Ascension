// 函数: sub_dc0b0
// 地址: 0xdc0b0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

luaL_checktype(arg1, 1, 5)
int32_t r0_1 = luaL_len(arg1, 1)
int32_t r0_3 = luaL_optinteger(arg1, 2, r0_1)
int32_t r5 = r0_3

if (r0_3 != r0_1 && (r5 s< 1 || r5 s> r0_1 + 1))
    luaL_argerror(arg1, 1, "position out of bounds")

lua_rawgeti(arg1, 1, r5)

if (r5 s< r0_1)
    bool cond:0_1
    
    do
        lua_rawgeti(arg1, 1, r5 + 1)
        lua_rawseti(arg1, 1, r5)
        cond:0_1 = r0_1 != r5 + 1
        r5 += 1
    while (cond:0_1)
    r5 = r0_1

lua_pushnil(arg1)
lua_rawseti(arg1, 1, r5)
return 1
