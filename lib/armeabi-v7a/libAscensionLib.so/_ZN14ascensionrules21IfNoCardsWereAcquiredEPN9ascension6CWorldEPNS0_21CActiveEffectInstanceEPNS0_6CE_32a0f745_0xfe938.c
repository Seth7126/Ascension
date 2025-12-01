// 函数: _ZN14ascensionrules21IfNoCardsWereAcquiredEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0xfe938
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t temp0 = 0
uint32_t i = ascension::CWorld::GetAcquiredCardCount()

while (i != 0)
    i u>>= 1
    temp0 += 1

return (0x20 - temp0) u>> 5
