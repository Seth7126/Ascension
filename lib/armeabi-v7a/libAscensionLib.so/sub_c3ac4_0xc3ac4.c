// 函数: sub_c3ac4
// 地址: 0xc3ac4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = luaL_checkunsigned(arg1, 1)
int32_t r0_2 = luaL_checkunsigned(arg1, 2)
int32_t r0_4 = luaL_checkinteger(arg1, 3)
int32_t r0_6 = luaL_optinteger(arg1, 4, 1)

if (r0_4 s<= 0xffffffff)
    luaL_argerror(arg1, 3, "field cannot be negative")
    
    if (r0_6 s<= 0)
        luaL_argerror(arg1, 4, "width must be positive")
else if (r0_6 s<= 0)
    luaL_argerror(arg1, 4, "width must be positive")

if (r0_6 + r0_4 s>= 0x21)
    luaL_error(arg1, "trying to access non-existent bits")

lua_pushunsigned(arg1, 
    (r0 & not.d(not.d(0xfffffffe << zx.d(r0_6.b - 1)) << (r0_4 & 0xff)))
        | (r0_2 & not.d(0xfffffffe << zx.d(r0_6.b - 1))) << (r0_4 & 0xff))
return 1
