// 函数: _Z23SaveAppGameDataToBufferP12AppWorldDataRPc
// 地址: 0x187774
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *(arg1 + 0x10c)
int32_t r10 = r0 << 4
uint32_t r0_1 = 0x12c + (r0 << 4)

if (r10 s< 0xfffffed4)
    r0_1 = 0xffffffff

char* r0_2 = operator new[](r0_1)
__builtin_strcpy(r0_2, "PLAYDEK")
*(r0_2 + 8) = 1
int32_t r6 = *(arg1 + 0x11c)
int32_t r5 = *(arg1 + 0x120)
*(arg1 + 0x11c) = 0
__aeabi_memcpy(&r0_2[0xc], arg1, 0x120)
*(arg1 + 0x11c) = r6
*(arg1 + 0x120) = r5
__aeabi_memcpy(&r0_2[0x12c], r5, r10)
*arg2 = r0_2
return 0x12c + (r0 << 4)
