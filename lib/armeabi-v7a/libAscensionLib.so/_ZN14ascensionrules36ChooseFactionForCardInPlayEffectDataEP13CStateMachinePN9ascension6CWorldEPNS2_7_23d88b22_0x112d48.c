// 函数: _ZN14ascensionrules36ChooseFactionForCardInPlayEffectDataEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x112d48
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (arg5 == 0)
    return 

CStateMachine* r4_1 = arg1
ascension::CCardInPlayInstance* r0_1 = __dynamic_cast(arg5, _typeinfo_for_core::CInstance, 
    _typeinfo_for_ascension::CCardInPlayInstance, 0)

if (r0_1 != 0)
    ascensionrules::CreateStateProcessChooseFactionForCardInPlayEffectData(arg3, r0_1, arg4)
    return CStateMachine::PushListState(r4_1) __tailcall

arg1 = __dynamic_cast(arg5, _typeinfo_for_core::CInstance, 
    _typeinfo_for_ascension::CCardInPlayAbilityInstance, 0)

if (arg1 == 0)
    return 

ascension::CCardInPlayInstance* r1_1 = *(arg1 + 0xc)

if (r1_1 != 0)
    ascensionrules::CreateStateProcessChooseFactionForCardInPlayEffectData(arg3, r1_1, arg4)
    return CStateMachine::PushListState(r4_1) __tailcall
