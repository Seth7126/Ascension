// 函数: sub_c79b8
// 地址: 0xc79b8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r5 = 0
int32_t r8 = arg1

if (lua_type(arg1, 1) == 8)
    r8 = lua_tothread(arg1, 1)
    r5 = 1

int32_t r0_4 = lua_tolstring(arg1, r5 + 1, 0)

if (r0_4 == 0 && lua_type(arg1, r5 + 1) s>= 1)
    lua_pushvalue(arg1, r5 + 1)
    return 1

int32_t temp0 = 0
uint32_t i = r8 - arg1

while (i != 0)
    i u>>= 1
    temp0 += 1

luaL_traceback(arg1, r8, r0_4, luaL_optinteger(arg1, r5 | 2, (0x20 - temp0) u>> 5))
return 1
