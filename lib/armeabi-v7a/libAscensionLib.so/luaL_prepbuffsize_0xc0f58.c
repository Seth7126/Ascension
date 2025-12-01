// 函数: luaL_prepbuffsize
// 地址: 0xc0f58
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r2 = arg1[1]
int32_t r0 = arg1[2]

if (r2 - r0 u>= arg2)
    return *arg1 + r0

int32_t r5 = r2 << 1
int32_t r6 = arg1[3]

if ((r2 << 1) - r0 u< arg2)
    r5 = r0 + arg2

if (r5 u< r0 || r5 - r0 u< arg2)
    luaL_error(r6, "buffer too large")

int32_t r0_4 = lua_newuserdata(r6, r5)
__aeabi_memcpy(r0_4, *arg1, arg1[2])

if (*arg1 != &arg1[4])
    lua_remove(r6, 0xfffffffe)

int32_t r0_7 = arg1[2]
*arg1 = r0_4
arg1[1] = r5
return r0_4 + r0_7
