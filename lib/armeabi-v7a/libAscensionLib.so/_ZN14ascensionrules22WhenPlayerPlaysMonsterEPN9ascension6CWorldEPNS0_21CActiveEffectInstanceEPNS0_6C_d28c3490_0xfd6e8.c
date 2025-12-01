// 函数: _ZN14ascensionrules22WhenPlayerPlaysMonsterEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0xfd6e8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (*(arg3 + 4) != 0x15)
    return 0

int32_t temp0 = 0
uint32_t i = *(*(*(arg3 + 0x50) + 0xc) + 0x88) - 3

while (i != 0)
    i u>>= 1
    temp0 += 1

return (0x20 - temp0) u>> 5
