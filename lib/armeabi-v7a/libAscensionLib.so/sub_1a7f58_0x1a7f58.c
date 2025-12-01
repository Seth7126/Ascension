// 函数: sub_1a7f58
// 地址: 0x1a7f58
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r3 = *arg1

if (r3 s>= 0)
    *arg2 = 1
    *arg3 = 4 + (arg1[1] u>> 0x18 << 2)
    return 

int32_t r12 = r3 u>> 0x18 & 0xf

if (r12 == 0)
    *arg3 = 4
    *arg2 = 1
    return 

if (r12 != 3)
    return 

jump(0x1a7f8a)
