// 函数: _ZN14ascensionrules23CStateProcessPlayerTurn11UpdateStateER13CStateMachine
// 地址: 0x176030
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (*(arg1 + 0x30) == 0)
    if (zx.d(*(arg1 + 0x3c)) == 0)
        ascension::CWorld* r5_1 = *(*(arg1 + 0x38) + 4)
        *(arg1 + 0x3c) = 1
        ascension::CWorld::StartTurn(r5_1)
        
        if (*(r5_1 + 0x30) u>= 4)
            ascension::CWorld::ClearPlayedConstructs()
            ascension::CWorld::ClearAcquiredCards()
            ascension::CWorld::ClearDefeatedMonsters()
        
        *(arg1 + 0x8c) = *(arg1 + 0x38)
        ascensionrules::CreateStateHandleEvent(r5_1, arg1 + 0x40, true, 0, nullptr, 0)
        CState::AddOwnedChild(arg1)
        CStateList::AppendState(arg1)
        ascensionrules::CStateProcessPlayerChooseTurnActions::CStateProcessPlayerChooseTurnActions(
            operator new(0x1ae8), (*(arg1 + 0x38)).b)
        CState::AddOwnedChild(arg1)
        int32_t result = CStateList::AppendState(arg1)
        *(arg1 + 0x1c8) = 1
        return result
    
    if (zx.d(*(arg1 + 0x1c8)) != 0)
        int32_t r7 = *(arg1 + 0x38)
        *(arg1 + 0x1c8) = 0
        CStateList::CStateList()
        *(arg1 + 0xcc) = r7
        *(arg1 + 0x94) = _vtable_for_ascensionrules::CStateProcessPlayerTurnEnd + 8
        *(arg1 + 0xd0) = 0x101
        *(arg1 + 0xd4) = _vtable_for_ascension::CEventTurnSequence + 8
        *(arg1 + 0xd8) = 0x10
        *(arg1 + 0xdc) = 0
        *(arg1 + 0x120) = 0
        *(arg1 + 0x124) = 2
        *(arg1 + 0xc0) = 0
        CState* entry_r1
        return CStateMachine::PushOwnedState(entry_r1) __tailcall

return CStateList::UpdateState(arg1) __tailcall
