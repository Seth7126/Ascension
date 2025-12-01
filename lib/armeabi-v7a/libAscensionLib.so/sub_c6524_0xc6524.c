// 函数: sub_c6524
// 地址: 0xc6524
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = lua_tothread(arg1, 1)

if (r0 == 0)
    luaL_argerror(arg1, 1, "coroutine expected")

int32_t r0_5 = sub_c678c(arg1, r0, lua_gettop(arg1) - 1)

if (r0_5 s<= 0xffffffff)
    lua_pushboolean(arg1, 0)
    lua_insert(arg1, 0xfffffffe)
    return 2

lua_pushboolean(arg1, 1)
lua_insert(arg1, not.d(r0_5))
return r0_5 + 1
