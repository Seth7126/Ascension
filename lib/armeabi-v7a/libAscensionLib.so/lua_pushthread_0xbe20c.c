// 函数: lua_pushthread
// 地址: 0xbe20c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void** r1_3 = *(arg1 + 8)
r1_3[2] = 0x48
*r1_3 = arg1
void* r2 = *(arg1 + 0xc)
*(arg1 + 8) += 0x10
int32_t temp0 = 0
void* i = *(r2 + 0xac) - arg1

while (i != 0)
    i u>>= 1
    temp0 += 1

return (0x20 - temp0) u>> 5
