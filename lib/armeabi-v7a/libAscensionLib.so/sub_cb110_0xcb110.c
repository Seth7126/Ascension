// 函数: sub_cb110
// 地址: 0xcb110
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (arg3 == 0)
    return 

int32_t* r5_1 = arg1

if ((zx.d(*(arg2 + 5)) & 0x18) != 0 || (zx.d(*(arg3 + 6)) & 4) != 0)
    return 

void* r7_1 = r5_1[3]

if (sub_dc6c8(arg3, 2, *(r7_1 + 0xc0)) == 0)
    return 

int32_t* r6 = *(r7_1 + 0x4c)

if (r6 == arg2)
    int32_t* r0_3
    
    do
        r0_3 = sub_cb400(r5_1, r6, 1)
    while (r0_3 == r6)
    
    *(r7_1 + 0x4c) = r0_3

void* r1_1 = r7_1 + 0x44
void* r0_4

do
    r0_4 = r1_1
    r1_1 = *r1_1
while (r1_1 != arg2)

*r0_4 = *arg2
*arg2 = *(r7_1 + 0x48)
*(r7_1 + 0x48) = arg2
char r0_7 = *(arg2 + 5) | 0x10
*(arg2 + 5) = r0_7

if (zx.d(*(r7_1 + 0x3d)) u>= 2)
    *(arg2 + 5) = (*(r7_1 + 0x3c) & 3) | (r0_7 & 0xb8)
    return 

*(arg2 + 5) = r0_7 & 0xbf
