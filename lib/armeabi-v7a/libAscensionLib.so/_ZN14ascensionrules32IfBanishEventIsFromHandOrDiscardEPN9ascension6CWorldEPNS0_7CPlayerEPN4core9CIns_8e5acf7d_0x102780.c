// 函数: _ZN14ascensionrules32IfBanishEventIsFromHandOrDiscardEPN9ascension6CWorldEPNS0_7CPlayerEPN4core9CInstanceEjPNS0_19CEffectInstanceDataEPNS0_6CEventE
// 地址: 0x102780
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (arg6 == 0)
    return 0

if (*(arg6 + 4) != 0x1d)
    return 0

int32_t temp0_1 = 0
uint32_t i = (*(arg6 + 0x54) | 2) - 3

while (i != 0)
    i u>>= 1
    temp0_1 += 1

return (0x20 - temp0_1) u>> 5
