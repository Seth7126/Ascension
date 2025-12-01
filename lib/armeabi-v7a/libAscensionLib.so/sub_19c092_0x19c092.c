// 函数: sub_19c092
// 地址: 0x19c092
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r1 = *arg2
int32_t r0 = *arg1
*arg1 = r1
__dmb_ISH()

do
    *(r1 - 4)
    unimplemented  {strex r3, r2, [r1]}
while (arg4 != 0)

__dmb_ISH()
__dmb_ISH()

do
    unimplemented  {strex r3, r2, [r1]}
while (arg4 != 0)

bool cond:0 = *(r0 - 4) - 1 s<= 0xffffffff
__dmb_ISH()

if (cond:0)
    operator delete(r0 - 0xc)

return arg1
