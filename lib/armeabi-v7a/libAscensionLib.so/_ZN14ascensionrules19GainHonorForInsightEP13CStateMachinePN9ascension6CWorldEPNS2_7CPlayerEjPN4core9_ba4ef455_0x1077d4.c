// 函数: _ZN14ascensionrules19GainHonorForInsightEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x1077d4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CCardInstance* r7

if (arg5 == 0)
    r7 = nullptr
else
    core::CCardInstance* r0_1 =
        __dynamic_cast(arg5, _typeinfo_for_core::CInstance, _typeinfo_for_core::CCardInstance, 0)
    r7 = r0_1
    
    if (r0_1 == 0)
        r7 = nullptr
        void* r0_3 = __dynamic_cast(arg5, _typeinfo_for_core::CInstance, 
            _typeinfo_for_ascension::CCardInPlayAbilityInstance, 0)
        
        if (r0_3 != 0)
            r7 = *(*(r0_3 + 0xc) + 0x10)
        else
            r0_3 = __dynamic_cast(arg5, _typeinfo_for_core::CInstance, 
                _typeinfo_for_ascension::CConstructAbilityInstance, 0)
            
            if (r0_3 != 0)
                r7 = *(*(r0_3 + 0xc) + 0x10)

ascensionrules::CreateStateGainHonorForInsight(arg3, arg4, 1, r7)
return CStateMachine::PushListState(arg1) __tailcall
