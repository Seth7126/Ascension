// 函数: sub_c60dc
// 地址: 0xc60dc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r0_2 = *(*arg1 + 0xc) + (arg2 << 2)
int32_t r3_1
int32_t* lr_2

if (arg2 s>= 1)
    lr_2 = r0_2 - 4
    r3_1 = *lr_2

if (arg2 s< 1 || sx.d((*"`qATPP\l<")[r3_1 & 0x3f]) s>= 0)
    r3_1 = *r0_2
    lr_2 = r0_2

if ((r3_1 & 0x3f) != 0x1c)
    return 0

uint32_t r0_4 = r3_1 u>> 0x17
int32_t r3_2

if (arg3 != 0xff && r0_4 != arg3)
    r3_2 = (r3_1 & 0xffffc03f) | (arg3 & 0xff) << 6
else
    r3_2 = (r3_1 & 0x7fc000) | r0_4 << 6 | 0x1b

*lr_2 = r3_2
return 1
