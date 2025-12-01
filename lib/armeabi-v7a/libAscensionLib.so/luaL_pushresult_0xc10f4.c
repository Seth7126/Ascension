// 函数: luaL_pushresult
// 地址: 0xc10f4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t r4 = arg1[3]
lua_pushlstring(r4, *arg1, arg1[2])
int32_t result = *arg1

if (result == &arg1[4])
    return result

return lua_remove(r4, 0xfffffffe) __tailcall
