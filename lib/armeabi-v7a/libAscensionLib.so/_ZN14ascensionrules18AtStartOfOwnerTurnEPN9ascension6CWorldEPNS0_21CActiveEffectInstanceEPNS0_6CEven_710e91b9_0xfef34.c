// 函数: _ZN14ascensionrules18AtStartOfOwnerTurnEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0xfef34
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (*(arg3 + 4) != 0x10 || *(arg3 + 0x50) != 1)
    return 0

int32_t temp0 = 0
uint32_t i = *(arg3 + 0x4c) - *(*(arg2 + 0x10) + 0xc)

while (i != 0)
    i u>>= 1
    temp0 += 1

return (0x20 - temp0) u>> 5
