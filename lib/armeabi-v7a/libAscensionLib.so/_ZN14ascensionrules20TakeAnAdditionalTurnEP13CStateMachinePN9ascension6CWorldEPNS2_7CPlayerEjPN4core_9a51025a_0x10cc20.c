// 函数: _ZN14ascensionrules20TakeAnAdditionalTurnEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x10cc20
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

ascension::CWorld::SetNextPlayerTurn(arg2)
uint32_t r6_1

if (arg5 == 0)
    r6_1 = 0
    
    if (arg7 != 0)
        void* r0_3 = __dynamic_cast(arg7, _typeinfo_for_ascension::CEvent, 
            _typeinfo_for_ascension::CEventCopyHeroEffect, 0)
        
        if (r0_3 != 0)
            core::CInstance* r0_1 = *(r0_3 + 0x50)
            
            if (r0_1 != 0)
                r6_1 = zx.d(*(r0_1 + 8))
else
    r6_1 = zx.d(*(arg5 + 8))

int32_t var_20 = 0
return ascension::CWorld::OutputEvent(arg2, 7, zx.d(*(arg3 + 8)), r6_1)
