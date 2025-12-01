// 函数: _ZN14ascensionrules19MarkPlayedEffectDayEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x116074
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CInstance* result = arg5

if (result != 0)
    result =
        __dynamic_cast(result, _typeinfo_for_core::CInstance, _typeinfo_for_core::CCardInstance, 0)
    
    if (result != 0)
        ascension::CWorld::AddPlayedCardsFlags(arg2, result)
        int32_t var_20_1 = 0
        return ascension::CWorld::OutputEvent(arg2, 0x1e, zx.d(*(arg3 + 8)), zx.d(*(result + 8)))

return result
