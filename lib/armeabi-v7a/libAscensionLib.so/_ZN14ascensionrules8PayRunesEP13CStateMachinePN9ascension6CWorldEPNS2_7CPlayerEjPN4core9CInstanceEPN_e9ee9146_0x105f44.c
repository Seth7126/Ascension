// 函数: _ZN14ascensionrules8PayRunesEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x105f44
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (arg4 s< 1)
    return 

CStateMachine* r8_1

if (zx.d(*(arg2 + 0xb2b)) != 0)
    r8_1 = arg1

if (zx.d(*(arg2 + 0xb2b)) == 0 || *(arg2 + 0xb48) s< 1)
    return ascension::CWorld::RemoveCurrentTurnRunes(arg2) __tailcall

if (arg5 == 0)
    return 

core::CInstance* r0_1 =
    __dynamic_cast(arg5, _typeinfo_for_core::CInstance, _typeinfo_for_core::CCardInstance, 0)

if (r0_1 != 0)
    ascensionrules::CreateStateMustPayResources(arg3, r0_1, arg4, 0, 0, 0, 2, 0)
    return CStateMachine::PushListState(r8_1) __tailcall

arg1 = __dynamic_cast(arg5, _typeinfo_for_core::CInstance, 
    _typeinfo_for_ascension::CCardInPlayInstance, 0)
core::CInstance* r1_1

if (arg1 != 0)
label_105ff0:
    r1_1 = arg1
    
    if (r1_1 != 0)
        ascensionrules::CreateStateMustPayResources(arg3, r1_1, arg4, 0, 0, 0, 2, 0)
        return CStateMachine::PushListState(r8_1) __tailcall
    
    return 

arg1 = __dynamic_cast(arg5, _typeinfo_for_core::CInstance, 
    _typeinfo_for_ascension::CCardInPlayAbilityInstance, 0)

if (arg1 == 0)
    arg1 = __dynamic_cast(arg5, _typeinfo_for_core::CInstance, 
        _typeinfo_for_ascension::CConstructInstance, 0)
    
    if (arg1 != 0)
        goto label_105ff0
    
    arg1 = __dynamic_cast(arg5, _typeinfo_for_core::CInstance, 
        _typeinfo_for_ascension::CConstructAbilityInstance, 0)
    
    if (arg1 != 0)
        goto label_106024
else
label_106024:
    r1_1 = *(arg1 + 0xc)
    
    if (r1_1 != 0)
        ascensionrules::CreateStateMustPayResources(arg3, r1_1, arg4, 0, 0, 0, 2, 0)
        return CStateMachine::PushListState(r8_1) __tailcall
