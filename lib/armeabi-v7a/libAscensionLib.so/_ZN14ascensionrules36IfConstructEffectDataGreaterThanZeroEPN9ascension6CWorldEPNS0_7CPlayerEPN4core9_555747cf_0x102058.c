// 函数: _ZN14ascensionrules36IfConstructEffectDataGreaterThanZeroEPN9ascension6CWorldEPNS0_7CPlayerEPN4core9CInstanceEjPNS0_19CEffectInstanceDataEPNS0_6CEventE
// 地址: 0x102058
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (arg3 == 0)
    return 0

int32_t result = 0
int32_t r0_1 = __dynamic_cast(arg3, _typeinfo_for_core::CInstance, 
    _typeinfo_for_ascension::CConstructInstance, 0)

if (r0_1 != 0)
    result = 0
    
    if (ascension::CCardInPlayInstance::GetEffectData(r0_1) s> 0)
        return 1

return result
