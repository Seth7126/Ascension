// 函数: _ZN14ascensionrules32UntilHeroIsAcquiredFromCenterRowEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0xfceb0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (*(arg3 + 4) != 0x12 || *(arg3 + 0x54) != 7)
    return 0

if (*(arg3 + 0x4c) != *(arg2 + 0x14))
    return 0

int32_t temp0 = 0
uint32_t i = *(*(*(arg3 + 0x50) + 0xc) + 0x88) - 1

while (i != 0)
    i u>>= 1
    temp0 += 1

return (0x20 - temp0) u>> 5
