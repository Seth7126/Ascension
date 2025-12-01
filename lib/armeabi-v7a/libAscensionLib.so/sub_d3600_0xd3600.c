// 函数: sub_d3600
// 地址: 0xd3600
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

char* filename = luaL_checklstring(arg1, 1, 0)
int32_t temp0 = 0
int32_t i = remove(filename)

while (i != 0)
    i u>>= 1
    temp0 += 1

return luaL_fileresult(arg1, (0x20 - temp0) u>> 5, filename) __tailcall
