// 函数: _ZN14ascensionrules8PayPowerEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x10660c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (arg4 s< 1)
    return 

CStateMachine* r8_1

if (zx.d(*(arg2 + 0xb29)) != 0)
    r8_1 = arg1

if (zx.d(*(arg2 + 0xb29)) == 0 || *(arg2 + 0xb40) s< 1)
    return ascension::CWorld::RemoveCurrentTurnPower(arg2) __tailcall

if (arg5 == 0)
    return 

core::CInstance* r0_1 =
    __dynamic_cast(arg5, _typeinfo_for_core::CInstance, _typeinfo_for_core::CCardInstance, 0)

if (r0_1 != 0)
    ascensionrules::CreateStateMustPayResources(arg3, r0_1, 0, arg4, 0, 4, 0, 0)
    return CStateMachine::PushListState(r8_1) __tailcall

arg1 = __dynamic_cast(arg5, _typeinfo_for_core::CInstance, 
    _typeinfo_for_ascension::CCardInPlayInstance, 0)
core::CInstance* r1_1

if (arg1 != 0)
label_1066b8:
    r1_1 = arg1
    
    if (r1_1 != 0)
        ascensionrules::CreateStateMustPayResources(arg3, r1_1, 0, arg4, 0, 4, 0, 0)
        return CStateMachine::PushListState(r8_1) __tailcall
    
    return 

arg1 = __dynamic_cast(arg5, _typeinfo_for_core::CInstance, 
    _typeinfo_for_ascension::CCardInPlayAbilityInstance, 0)

if (arg1 == 0)
    arg1 = __dynamic_cast(arg5, _typeinfo_for_core::CInstance, 
        _typeinfo_for_ascension::CConstructInstance, 0)
    
    if (arg1 != 0)
        goto label_1066b8
    
    arg1 = __dynamic_cast(arg5, _typeinfo_for_core::CInstance, 
        _typeinfo_for_ascension::CConstructAbilityInstance, 0)
    
    if (arg1 != 0)
        goto label_1066ec
else
label_1066ec:
    r1_1 = *(arg1 + 0xc)
    
    if (r1_1 != 0)
        ascensionrules::CreateStateMustPayResources(arg3, r1_1, 0, arg4, 0, 4, 0, 0)
        return CStateMachine::PushListState(r8_1) __tailcall
