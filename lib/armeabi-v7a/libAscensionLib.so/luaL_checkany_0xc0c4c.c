// 函数: luaL_checkany
// 地址: 0xc0c4c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t result = lua_type()

if (result != 0xffffffff)
    return result

return luaL_argerror(arg1, arg2, "value expected") __tailcall
