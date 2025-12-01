// 函数: sub_e116c
// 地址: 0xe116c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r5 = arg3
int32_t r2 = arg2[2]

if (r2 u>= r5)
    return *arg2

if (r5 u<= 0x20)
    r5 = 0x20

if (r5 + 1 u>= 0xfffffffe)
    sub_d14b4(arg1)
    noreturn

int32_t result
int32_t* r4_1
int32_t r5_1
result, r4_1, r5_1 = sub_d14cc(arg1, *arg2, r2, r5)
*r4_1 = result
r4_1[2] = r5_1
return result
