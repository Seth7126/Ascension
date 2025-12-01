// 函数: _ZN14ascensionrules22GainHonorForTurnPlayerEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x1078b4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (arg4 == 0)
    return 

CStateMachine* r4_1 = arg1
arg1 = *(arg2 + 0xb20)

if (arg1 != 0)
    ascensionrules::CreateStateGainHonor(arg1, arg5, arg4, false, nullptr, 0)
    return CStateMachine::PushListState(r4_1) __tailcall
