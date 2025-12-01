// 函数: sub_ce248
// 地址: 0xce248
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r0 = luaL_checkudata(arg1, 1, "FILE*")

if (r0[1] == 0)
    luaL_error(arg1, "attempt to use a closed file")

int32_t temp0 = 0
int32_t i = fflush(*r0)

while (i != 0)
    i u>>= 1
    temp0 += 1

return luaL_fileresult(arg1, (0x20 - temp0) u>> 5, 0) __tailcall
