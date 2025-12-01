// 函数: sub_ce590
// 地址: 0xce590
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r0 = luaL_checkudata(arg1, 1, "FILE*")

if (r0[1] == 0 || *r0 == 0)
    return 0

void* r0_4 = luaL_checkudata(arg1, 1, "FILE*")
int32_t r1_1 = *(r0_4 + 4)
*(r0_4 + 4) = 0
r1_1(arg1)
return 0
