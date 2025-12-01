// 函数: sub_cb2bc
// 地址: 0xcb2bc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r6 = arg1[3]
char r0 = *(r6 + 0x3d)

if ((arg2 & 1 << zx.d(r0)) != 0)
    return r0

char r0_2

do
    sub_cb648(arg1)
    r0_2 = *(r6 + 0x3d)
while ((arg2 & 1 << zx.d(r0_2)) == 0)

return r0_2
