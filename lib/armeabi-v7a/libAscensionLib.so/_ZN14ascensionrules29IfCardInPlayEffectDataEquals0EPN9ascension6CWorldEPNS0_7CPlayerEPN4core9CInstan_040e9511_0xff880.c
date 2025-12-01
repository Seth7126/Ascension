// 函数: _ZN14ascensionrules29IfCardInPlayEffectDataEquals0EPN9ascension6CWorldEPNS0_7CPlayerEPN4core9CInstanceEjPNS0_19CEffectInstanceDataEPNS0_6CEventE
// 地址: 0xff880
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t temp0 = 0
uint32_t i = ascension::CCardInPlayInstance::GetEffectData(arg3)

while (i != 0)
    i u>>= 1
    temp0 += 1

return (0x20 - temp0) u>> 5
