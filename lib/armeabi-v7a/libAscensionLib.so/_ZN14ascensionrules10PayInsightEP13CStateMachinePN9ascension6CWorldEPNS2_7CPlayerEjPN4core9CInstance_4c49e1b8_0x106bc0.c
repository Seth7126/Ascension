// 函数: _ZN14ascensionrules10PayInsightEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x106bc0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (zx.d(*(arg2 + 0xb3d)) != 0)
    uint32_t r0_1 = zx.d(*(arg2 + 0xb29))
    uint32_t r5_1 = r0_1
    
    if (r0_1 != 0)
        r5_1 = 8
    
    if (*(arg2 + 0xb48) s> 0)
    label_106c0c:
        core::CInstance* r4 = nullptr
        
        if (arg5 != 0)
            core::CInstance* r0_3 = __dynamic_cast(arg5, _typeinfo_for_core::CInstance, 
                _typeinfo_for_core::CCardInstance, 0)
            
            if (r0_3 == 0)
                r4 = nullptr
                void* r0_8 = __dynamic_cast(arg5, _typeinfo_for_core::CInstance, 
                    _typeinfo_for_ascension::CConstructAbilityInstance, 0)
                
                if (r0_8 == 0)
                    void* r0_10 = __dynamic_cast(arg5, _typeinfo_for_core::CInstance, 
                        _typeinfo_for_ascension::CCardInPlayAbilityInstance, 0)
                    
                    if (r0_10 != 0)
                        r4 = *(r0_10 + 0xc)
                else
                    r4 = *(r0_8 + 0xc)
            else
                r4 = r0_3
        
        ascensionrules::CreateStateMustPayResources(arg3, r4, 0, 0, arg4, r5_1, 8, 0)
        return CStateMachine::PushOwnedState(arg1) __tailcall
    
    if (r0_1 != 0 && *(arg2 + 0xb40) s>= 1)
        goto label_106c0c

return ascension::CPlayer::RemoveInsightCount(arg3) __tailcall
