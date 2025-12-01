// 函数: sub_19bfe8
// 地址: 0x19bfe8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r0_1 = strlen(arg2)
uint32_t* r0_3 = operator new(r0_1 + 0xd)
*r0_3 = r0_1
r0_3[1] = r0_1
r0_3[2] = 0
__aeabi_memcpy(&r0_3[3], arg2, r0_1 + 1)
*arg1 = &r0_3[3]
return arg1
