// 函数: _ZN22CReliableUDPConnection4SendEP15OutgoingMessage
// 地址: 0xba910
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (zx.d(*(arg1 + 0x20)) == 0)
    return 0

clock_t r0_1 = clock()
*(arg1 + 0x18) = r0_1
clock_t* entry_r1
*entry_r1 = r0_1
uint32_t __n = entry_r1[1]
entry_r1[4] = *(arg1 + 0x28)
int32_t r0_4 = sendto(*(arg1 + 4), &entry_r1[2], __n, 0, arg1 + 8, 0x10)

if (r0_4 != 0xffffffff)
    return 1

return r0_4 + 1
