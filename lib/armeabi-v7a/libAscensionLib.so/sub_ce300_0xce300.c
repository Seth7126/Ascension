// 函数: sub_ce300
// 地址: 0xce300
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r0 = luaL_checkudata(arg1, 1, "FILE*")

if (r0[1] == 0)
    luaL_error(arg1, "attempt to use a closed file")

return sub_cdbe0(arg1, *r0, 2) __tailcall
