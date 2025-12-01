// 函数: sub_cb04c
// 地址: 0xcb04c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r2_5 = zx.d(*(arg2 + 5))

if ((r2_5 & 7) != 0)
    return 

uint32_t r3_1 = zx.d(*(arg1 + 0x3e))
bool cond:0_1 = r3_1 u> 2

if (r3_1 != 2)
    cond:0_1 = zx.d(*(arg1 + 0x3d)) u> 1

if (cond:0_1)
    *(arg2 + 5) = (*(arg1 + 0x3c) & 3) | (r2_5.b & 0xb8)
    return 

void** r3_3 = *(arg2 + 8)
*(arg2 + 5) = (r2_5.b & 0xbb) | 4

if ((zx.d(r3_3[2].b) & 0x40) == 0)
    return 

void* r1_1 = *r3_3

if ((zx.d(*(r1_1 + 5)) & 3) == 0)
    return 

return sub_cae14(arg1, r1_1) __tailcall
