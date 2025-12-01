// 函数: sub_c6b34
// 地址: 0xc6b34
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t r5 = arg1

if (lua_type(arg1, 1) == 8)
    r5 = lua_tothread(arg1, 1)

int32_t r0_6 = lua_gethookmask()
int32_t r0_8 = lua_gethook()

if (r0_8 != 0 && r0_8 != sub_c7a6c)
    lua_pushlstring(arg1, "external hook", 0xd)
else
    luaL_getsubtable(arg1, 0xfff0b9d8, "_HKEY")
    lua_pushthread(r5)
    lua_xmove(r5, arg1, 1)
    lua_rawget(arg1, 0xfffffffe)
    lua_remove(arg1, 0xfffffffe)

int32_t r0_15 = 0
char var_21[0x5]

if ((r0_6 & 1) != 0)
    var_21[0] = 0x63
    r0_15 = 1

if ((r0_6 & 2) != 0)
    var_21[r0_15] = 0x72
    r0_15 += 1

if ((r0_6 & 4) != 0)
    var_21[r0_15] = 0x6c
    r0_15 += 1

var_21[r0_15] = 0
lua_pushstring(arg1, &var_21, 0)
lua_pushinteger(arg1, lua_gethookcount())

if (*__stack_chk_guard == r0)
    return 3

__stack_chk_fail()
noreturn
