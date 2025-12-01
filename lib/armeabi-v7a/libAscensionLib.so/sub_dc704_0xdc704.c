// 函数: sub_dc704
// 地址: 0xdc704
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r3 = arg2[2] & 0xf
int32_t* r1_1

if (r3 != 7 && r3 != 5)
    r1_1 = *(arg1 + 0xc) + (r3 << 2) + 0xfc
else
    r1_1 = *arg2 + 8

void* r3_1 = *r1_1

if (r3_1 == 0)
    return &data_1d13d0

return sub_db738(r3_1, *(*(arg1 + 0xc) + (arg3 << 2) + 0xb8)) __tailcall
