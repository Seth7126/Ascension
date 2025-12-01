// 函数: _ZN14ascensionrules18CStateProcessRound11UpdateStateER13CStateMachine
// 地址: 0x1533c4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

CState::DeleteState(*(arg1 + 0x38))
int32_t r0_1 = *(arg1 + 0x30)
*(arg1 + 0x38) = 0
ascension::CPlayer* r6 = *(r0_1 + 0xb24)
ascension::CPlayer* r0_2
CState* entry_r1

if (r6 == 0)
    int32_t r1_1 = *(arg1 + 0x34)
    
    if (r1_1 u>= (*(r0_1 + 0x1c) - *(r0_1 + 0x18)) s>> 2)
        return CStateMachine::PopState(entry_r1) __tailcall
    
    *(arg1 + 0x34) = r1_1 + 1
    r0_2 = ascension::CWorld::GetPlayer(r0_1)
else
    ascension::CWorld::SetNextPlayerTurn(r0_1)
    r0_2 = r6

*(arg1 + 0x38) = ascensionrules::CreateStateProcessPlayerTurn(r0_2)
return CStateMachine::PushState(entry_r1) __tailcall
