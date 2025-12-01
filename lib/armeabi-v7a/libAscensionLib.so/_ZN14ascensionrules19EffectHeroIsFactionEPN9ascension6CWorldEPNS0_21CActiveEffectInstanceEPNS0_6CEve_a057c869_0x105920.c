// 函数: _ZN14ascensionrules19EffectHeroIsFactionEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0x105920
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = 0

if (*(arg3 + 4) != 2 || *(arg3 + 0x50) != *(arg2 + 0x14))
    return 0

if ((*(arg3 + 0x54) & 1 << zx.d(ascension::CActiveEffectInstance::GetEffectData(arg2))) != 0)
    result = 1
    *(arg3 + 0x58) = 1

return result
