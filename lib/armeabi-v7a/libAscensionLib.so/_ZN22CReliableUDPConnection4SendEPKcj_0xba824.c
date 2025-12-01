// 函数: _ZN22CReliableUDPConnection4SendEPKcj
// 地址: 0xba824
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (zx.d(arg1[0x20]) == 0)
    return 0

void* r0_1 = operator new(0x7e4)
int32_t entry_result
*(r0_1 + 4) = entry_result + 0xc
*(r0_1 + 8) = 0xabcdef0
int32_t r0_3 = *(arg1 + 0x24)
*(arg1 + 0x24) = r0_3 + 1
*(r0_1 + 0xc) = r0_3
__aeabi_memcpy(r0_1 + 0x14, arg2, entry_result)
void** r0_5 = operator new(0xc)
void* r2_1 = *(arg1 + 0x2c)
*r0_5 = r2_1
r0_5[1] = &arg1[0x2c]
r0_5[2] = r0_1
*(r2_1 + 4) = r0_5
int32_t r1_3 = *(arg1 + 0x34)
*(arg1 + 0x2c) = r0_5
*(arg1 + 0x34) = r1_3 + 1
clock_t r0_7 = clock()
*(arg1 + 0x18) = r0_7
*r0_1 = r0_7
uint32_t __n = *(r0_1 + 4)
*(r0_1 + 0x10) = *(arg1 + 0x28)
int32_t r0_10 = sendto(*(arg1 + 4), r0_1 + 8, __n, 0, &arg1[8], 0x10)

if (r0_10 == 0xffffffff)
    return r0_10 + 1

return entry_result
