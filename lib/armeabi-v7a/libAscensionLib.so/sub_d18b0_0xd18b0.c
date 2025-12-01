// 函数: sub_d18b0
// 地址: 0xd18b0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

char* r0_1 = getenv(arg3)
char* r7 = r0_1
char* r0_3

if (r0_1 == 0)
    r0_3 = getenv(arg4)
    r7 = r0_3

int32_t r0_6

if (r0_1 != 0 || r0_3 != 0)
    lua_getfield(arg1, 0xfff0b9d8, "LUA_NOENV")
    r0_6 = lua_toboolean(arg1, 0xffffffff)
    lua_settop(arg1, 0xfffffffe)

if ((r0_1 != 0 || r0_3 != 0) && r0_6 == 0)
    luaL_gsub(arg1, luaL_gsub(arg1, r7, 0x1c0ec4, 0x1c0ec7), 0x1c0ecb, arg5)
    lua_remove(arg1, 0xfffffffe)
else
    lua_pushstring(arg1, arg5)

return lua_setfield(arg1, 0xfffffffe, arg2) __tailcall
