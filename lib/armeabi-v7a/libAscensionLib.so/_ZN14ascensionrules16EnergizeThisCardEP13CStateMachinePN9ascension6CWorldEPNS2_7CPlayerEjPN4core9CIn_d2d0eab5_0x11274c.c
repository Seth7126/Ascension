// 函数: _ZN14ascensionrules16EnergizeThisCardEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x11274c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CInstance* r0 = arg5

if (r0 != 0)
    r0 = __dynamic_cast(r0, _typeinfo_for_core::CInstance, _typeinfo_for_core::CCardInstance, 0)
    
    if (r0 != 0)
        int32_t r0_1 = *(arg2 + 0xb4c)
        
        if (r0_1 s< arg4)
            return r0_1
        
        if (*(arg2 + 0x30) u< 0x18)
            return ascension::CWorld::SetPlayedCardsFlags(arg2, r0)
        
        return ascension::CWorld::AddPlayedCardsFlags(arg2, r0)

return r0
