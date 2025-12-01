// 函数: _ZN14ascensionrules35WhenPlayerDefeatsMonsterInCenterRowEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0xfde34
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (*(arg3 + 4) != 0x1b)
    return 0

int32_t r1 = *(arg3 + 0x54)

if (r1 u> 9 || (0x290 & 1 << (r1 & 0xff)) == 0)
    return 0

int32_t temp0_1 = 0
uint32_t i = *(*(*(arg3 + 0x50) + 0xc) + 0x88) - 3

while (i != 0)
    i u>>= 1
    temp0_1 += 1

return (0x20 - temp0_1) u>> 5
