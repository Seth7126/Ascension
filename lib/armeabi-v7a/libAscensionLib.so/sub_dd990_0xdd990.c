// 函数: sub_dd990
// 地址: 0xdd990
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = lua_tolstring(arg1, 1, 0)

if (r0 != 0)
    luaL_traceback(arg1, arg1, r0, 1)
    return 1

if (lua_type(arg1, 1) s>= 1 && luaL_callmeta(arg1, 1, "__tostring") == 0)
    lua_pushlstring(arg1, "(no error message)", 0x12)

return 1
