// 函数: luaL_newstate
// 地址: 0xc24ac
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = lua_newstate(sub_c24f0, 0)

if (result != 0)
    lua_atpanic(result, sub_c2518)

return result
