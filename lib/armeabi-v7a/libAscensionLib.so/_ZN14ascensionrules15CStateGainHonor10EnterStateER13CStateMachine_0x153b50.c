// 函数: _ZN14ascensionrules15CStateGainHonor10EnterStateER13CStateMachine
// 地址: 0x153b50
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
ascension::CWorld* r5 = *(*(arg1 + 0x30) + 4)
int32_t r2 = *(arg1 + 0x38)
*(arg1 + 0x90) = *(arg1 + 0x34)
*(arg1 + 0x94) = r2
*(arg1 + 0x98) = r2
ascension::CWorld::HandleEvent(r5)
uint32_t result = zx.d(*(arg1 + 0x48))

if (result == 0)
    return result

ascensionrules::CreateStateHandleEvent(r5, arg1 + 0x40, false, 0, nullptr, 0)
CState* entry_r1
return CStateMachine::PushOwnedState(entry_r1) __tailcall
