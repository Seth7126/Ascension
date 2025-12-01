// 函数: sub_ce528
// 地址: 0xce528
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r0 = luaL_checkudata(arg1, 1, "FILE*")

if (r0[1] == 0)
    luaL_error(arg1, "attempt to use a closed file")

FILE* r5_1 = *r0
lua_pushvalue(arg1, 1)
return sub_ce110(arg1, r5_1, 2) __tailcall
