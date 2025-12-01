// 函数: _ZN14ascensionrules38CStateTakeRandomCardFromSingleOpponent14SelectOpponentER13CStateMachineP6CStateiPj
// 地址: 0x14a608
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r7 = *(arg2 + 0x24c)
int32_t r0_1 = core::CWorldBase::GetInstanceByID(*(r7 + 4))
void** r0_2 = operator new(0x38)
CState::CState()
*r0_2 = _vtable_for_ascensionrules::CStateProcessTakeRandomCardFromOpponent + 8
r0_2[0xc] = r7
r0_2[0xd] = r0_1
CState::AddOwnedChild(arg2)
return CStateList::AppendState(arg2) __tailcall
