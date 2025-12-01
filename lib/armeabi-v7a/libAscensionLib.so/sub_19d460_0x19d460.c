// 函数: sub_19d460
// 地址: 0x19d460
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0_2 = *(arg2 + 0x10)

if (r0_2 == 0)
    *(arg2 + 0x18) = arg4
    *(arg2 + 0x10) = arg3
    *(arg2 + 0x24) = 1
    return 1

if (r0_2 != arg3)
    *(arg2 + 0x18) = 2
    *(arg2 + 0x24)
    *(arg2 + 0x36) = 1
    jump(0x19d47e)

int32_t result = *(arg2 + 0x18)

if (result != 2)
    jump(0x19d48c)

*(arg2 + 0x18) = arg4
return result
