// 函数: sub_cd91c
// 地址: 0xcd91c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t* r0 = lua_newuserdata(arg1, 8)
r0[1] = 0
luaL_setmetatable(arg1, "FILE*")
*r0 = 0
r0[1] = sub_cd9b4
FILE* result = fopen(arg2, arg3)
*r0 = result

if (result == 0)
    return luaL_error(arg1, "cannot open file '%s' (%s)", arg2, strerror(*__errno())) __tailcall

return result
