// 函数: sub_c1798
// 地址: 0xc1798
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *arg2

if (r0 s>= 1)
    *arg3 = r0
    *arg2 = 0
    return &arg2[2]

if (feof(arg2[1]) != 0)
    return 0

*arg3 = fread(&arg2[2], 1, 0x400, arg2[1])
return &arg2[2]
