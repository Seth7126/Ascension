// 函数: _ZN14ascensionrules21BeforePlayerPlaysHeroEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0xfd170
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r1 = *(arg3 + 4)
uint32_t i_1

if (*(arg1 + 0x30) u<= 3)
    i_1 = r1 - 0x14
else
    i_1 = r1 - 0x13

int32_t temp0 = 0
uint32_t i = i_1

while (i != 0)
    i u>>= 1
    temp0 += 1

return (0x20 - temp0) u>> 5
