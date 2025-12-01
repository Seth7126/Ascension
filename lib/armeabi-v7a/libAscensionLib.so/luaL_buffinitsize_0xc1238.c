// 函数: luaL_buffinitsize
// 地址: 0xc1238
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*arg2 = &arg2[4]
arg2[1] = 0x400
arg2[2] = 0
arg2[3] = arg1

if (arg3 u<= 0x400)
    return &arg2[4]

int32_t r4 = arg3

if (arg3 u<= 0x800)
    r4 = 0x800

int32_t r0_1 = lua_newuserdata(arg1, r4)
__aeabi_memcpy(r0_1, *arg2, arg2[2])

if (*arg2 != &arg2[4])
    lua_remove(arg1, 0xfffffffe)

int32_t r0_4 = arg2[2]
*arg2 = r0_1
arg2[1] = r4
return r0_1 + r0_4
