// 函数: _ZN14ascensionrules20YouMayBanishThisCardEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x112224
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
core::CCardInstance* r1_1

if (arg5 == 0)
label_11226c:
    int32_t result = *(arg2 + 0x30)
    r1_1 = nullptr
    
    if (result u> 0x1d)
        return result
else
    core::CCardInstance* r0_1 =
        __dynamic_cast(arg5, _typeinfo_for_core::CInstance, _typeinfo_for_core::CCardInstance, 0)
    r1_1 = r0_1
    
    if (r0_1 == 0)
        goto label_11226c

ascensionrules::CreateStateMayBanishSource(arg3, r1_1, arg6)
return CStateMachine::PushListState(arg1) __tailcall
