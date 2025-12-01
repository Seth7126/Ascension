// 函数: sub_1a9044
// 地址: 0x1a9044
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t i = arg5 - arg2

while (i != 0)
    uint32_t i_1 = i
    int32_t lr = *arg4
    int32_t r5_1 = arg2 + (i_1 u>> 1)
    int32_t r8_1 = *(lr + (r5_1 << 3))
    i = i_1 u>> 1
    
    if (*arg6 u>= lr + (r5_1 << 3) + (r8_1 | (r8_1 & 0x40000000) << 1))
        i = i_1 + not.d(i)
        arg2 = r5_1 + 1

*arg1 = arg2
arg1[1] = arg3
arg1[2] = arg4
return &arg1[3]
