// 函数: sub_cd6f0
// 地址: 0xcd6f0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t* r0 = lua_newuserdata(arg1, 8)
r0[1] = 0
luaL_setmetatable(arg1, "FILE*")
*r0 = 0
r0[1] = sub_cd9b4
FILE* r0_2 = tmpfile()
*r0 = r0_2

if (r0_2 == 0)
    return luaL_fileresult(arg1, 0, 0) __tailcall

return 1
