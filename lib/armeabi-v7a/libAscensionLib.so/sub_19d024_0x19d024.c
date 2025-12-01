// 函数: sub_19d024
// 地址: 0x19d024
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

char* r3 = *arg1
int32_t r1 = 0
int32_t r12 = 0
uint32_t lr_1

do
    lr_1 = zx.d(*r3)
    r3 = &r3[1]
    r12 |= (lr_1 & 0x7f) << r1
    r1 += 7
while (lr_1 << 0x18 s< 0)

*arg1 = r3
int32_t r0_1 = r12

if (lr_1 << 0x19 s< 0)
    r0_1 |= 0xffffffff << r1

if (r1 u>= 0x20)
    return r12

return r0_1
