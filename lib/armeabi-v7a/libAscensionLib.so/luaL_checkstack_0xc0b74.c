// 函数: luaL_checkstack
// 地址: 0xc0b74
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t result = lua_checkstack(arg1, arg2 + 0x14)

if (result != 0)
    return result

if (arg3 == 0)
    return luaL_error(arg1, "stack overflow") __tailcall

return luaL_error(arg1, "stack overflow (%s)", arg3) __tailcall
