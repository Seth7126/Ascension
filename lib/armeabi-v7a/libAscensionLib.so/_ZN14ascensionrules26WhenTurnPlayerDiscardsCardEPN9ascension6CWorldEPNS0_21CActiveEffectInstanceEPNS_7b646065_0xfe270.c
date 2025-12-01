// 函数: _ZN14ascensionrules26WhenTurnPlayerDiscardsCardEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0xfe270
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (*(arg3 + 4) != 0x1a)
    return 0

int32_t temp0_1 = 0
uint32_t i = *(arg1 + 0xb20) - *(arg3 + 0x4c)

while (i != 0)
    i u>>= 1
    temp0_1 += 1

return (0x20 - temp0_1) u>> 5
