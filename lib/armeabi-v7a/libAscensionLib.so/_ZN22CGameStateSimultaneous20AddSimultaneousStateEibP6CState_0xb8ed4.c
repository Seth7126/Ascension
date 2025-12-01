// 函数: _ZN22CGameStateSimultaneous20AddSimultaneousStateEibP6CState
// 地址: 0xb8ed4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t result = *(arg1 + 0x34)

if (result s> 5)
    return result

*(arg1 + 0x34) = result + 1
int32_t r0_1 = arg1 + result * 0x30
*(r0_1 + 0x5c) = arg3.b
*(r0_1 + 0x58) = arg2
*(r0_1 + 0x60) = 0
*(r0_1 + 0x64) = 0
CStateMachine::SetOptionListBeginCallback(r0_1 + 0x38, 
    CGameStateSimultaneous::SimultaneousOptionListBeginListener)
CStateMachine::SetOptionListAddCallback(r0_1 + 0x38, 
    CGameStateSimultaneous::SimultaneousOptionListAddListener)
CStateMachine::SetOptionListEndCallback(r0_1 + 0x38, 
    CGameStateSimultaneous::SimultaneousOptionListEndListener)
*(arg1 + 0x30)
CStateMachine::SetParentStateMachine(r0_1 + 0x38)
CStateMachine::PushState(r0_1 + 0x38)
return CState::AddOwnedChild(arg1) __tailcall
