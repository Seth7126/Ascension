// 函数: sub_cb0b8
// 地址: 0xcb0b8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r6 = arg1[3]
int32_t* r0
void* r4_1
char r5_1
r0, r4_1, r5_1 = sub_d14cc(arg1, 0, arg2 & 0xf, arg3)

if (r4_1 == 0)
    r4_1 = r6 + 0x44

void* result = r0 + arg4
char r3_3 = *(r6 + 0x3c) & 3
*(result + 4) = r5_1
*(result + 5) = r3_3
*(r0 + arg4) = *r4_1
*r4_1 = result
return result
