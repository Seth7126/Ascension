// 函数: sub_c46bc
// 地址: 0xc46bc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r2_1 = *arg2

if (r2_1 == 0xd)
    int32_t r12 = arg2[2]
    int32_t r0_5 = *(*arg1 + 0xc)
    *(r0_5 + (r12 << 2)) = (*(r0_5 + (r12 << 2)) & 0x7fffff) | 0x1000000
    *arg2 = 0xb
    return 

if (r2_1 != 0xc)
    return 

*arg2 = 6
arg2[2] = *(*(*arg1 + 0xc) + (arg2[2] << 2)) u>> 6 & 0xff
