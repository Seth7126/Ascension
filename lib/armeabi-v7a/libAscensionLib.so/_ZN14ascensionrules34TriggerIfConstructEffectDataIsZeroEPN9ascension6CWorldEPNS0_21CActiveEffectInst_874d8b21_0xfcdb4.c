// 函数: _ZN14ascensionrules34TriggerIfConstructEffectDataIsZeroEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0xfcdb4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t temp0 = 0
uint32_t i = ascension::CCardInPlayInstance::GetEffectData(*(arg2 + 0x10))

while (i != 0)
    i u>>= 1
    temp0 += 1

return (0x20 - temp0) u>> 5
