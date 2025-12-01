// 函数: sub_d1b74
// 地址: 0xd1b74
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

lua_getfield(arg1, 0xfff0b9d8, "_CLIBS")
lua_getfield(arg1, 0xffffffff, arg2)
int32_t r0_2 = lua_touserdata(arg1, 0xffffffff)
lua_settop(arg1, 0xfffffffd)

if (r0_2 == 0)
    lua_pushlstring(arg1, "dynamic libraries not enabled; check your Lua installation", 0x3a)
    return 1

if (zx.d(*arg3) != 0x2a)
    lua_pushlstring(arg1, "dynamic libraries not enabled; check your Lua installation", 0x3a)
    return 2

lua_pushboolean(arg1, 1)
return 0
