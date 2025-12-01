// 函数: _ZN14ascensionrules24MayRecurEffectForInsightEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x116888
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CCardInstance* r5

if (arg5 == 0)
    r5 = nullptr
else
    core::CCardInstance* r0_1 =
        __dynamic_cast(arg5, _typeinfo_for_core::CInstance, _typeinfo_for_core::CCardInstance, 0)
    r5 = r0_1
    
    if (r0_1 == 0)
        r5 = nullptr
        void* r0_3 = __dynamic_cast(arg5, _typeinfo_for_core::CInstance, 
            _typeinfo_for_ascension::CCardInPlayAbilityInstance, 0)
        
        if (r0_3 != 0)
            r5 = *(*(r0_3 + 0xc) + 0x10)
        else
            r0_3 = __dynamic_cast(arg5, _typeinfo_for_core::CInstance, 
                _typeinfo_for_ascension::CConstructAbilityInstance, 0)
            
            if (r0_3 != 0)
                r5 = *(*(r0_3 + 0xc) + 0x10)

CState* r6_1 = *arg1

if (*(r6_1 + 0x1c) s< 1)
    ascensionrules::CreateStateRecurEffectForInsight(arg3, arg4, r5, arg6, nullptr, 0)
    CState::AddOwnedChild(r6_1)
else
    CState::CleanupEmbeddedState()
    ascensionrules::CreateStateRecurEffectForInsight(arg3, arg4, r5, arg6, *(r6_1 + 0x20), 
        *(r6_1 + 0x1c))
    CState::SetEmbeddedState(r6_1)

return CStateMachine::PushState(arg1) __tailcall
