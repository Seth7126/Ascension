// 函数: _ZN14ascensionrules9GainHonorEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x1071d8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (arg4 == 0)
    return 

int32_t lr
int32_t var_4 = lr
CState* r5 = *arg1

if (*(r5 + 0x1c) s< 1)
    ascensionrules::CreateStateGainHonor(arg3, arg5, arg4, false, nullptr, 0)
    CState::AddOwnedChild(r5)
else
    CState::CleanupEmbeddedState()
    ascensionrules::CreateStateGainHonor(arg3, arg5, arg4, false, *(r5 + 0x20), *(r5 + 0x1c))
    CState::SetEmbeddedState(r5)

return CStateMachine::PushState(arg1) __tailcall
