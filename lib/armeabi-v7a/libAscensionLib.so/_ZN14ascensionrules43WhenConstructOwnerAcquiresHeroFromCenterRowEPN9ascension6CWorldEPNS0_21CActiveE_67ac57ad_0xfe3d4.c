// 函数: _ZN14ascensionrules43WhenConstructOwnerAcquiresHeroFromCenterRowEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0xfe3d4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (*(arg3 + 4) != 0x12 || *(arg3 + 0x54) != 7)
    return 0

void* r12 = *(arg2 + 0x10)

if (*(arg3 + 0x4c) != *(r12 + 0xc))
    return 0

void* r2 = *(arg3 + 0x50)

if (r2 == 0 || r2 == *(r12 + 0x10))
    return 0

int32_t temp0_1 = 0
uint32_t i = *(*(r2 + 0xc) + 0x88) - 1

while (i != 0)
    i u>>= 1
    temp0_1 += 1

return (0x20 - temp0_1) u>> 5
