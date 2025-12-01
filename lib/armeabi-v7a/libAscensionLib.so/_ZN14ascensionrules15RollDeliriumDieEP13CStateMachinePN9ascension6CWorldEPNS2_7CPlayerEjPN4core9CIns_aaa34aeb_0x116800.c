// 函数: _ZN14ascensionrules15RollDeliriumDieEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x116800
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

CState* r5 = *arg1

if (*(r5 + 0x1c) s< 1)
    ascensionrules::CreateStateRollDeliriumDie(arg3, arg5, nullptr, 0)
    CState::AddOwnedChild(r5)
else
    CState::CleanupEmbeddedState()
    ascensionrules::CreateStateRollDeliriumDie(arg3, arg5, *(r5 + 0x20), *(r5 + 0x1c))
    CState::SetEmbeddedState(r5)

return CStateMachine::PushState(arg1) __tailcall
