// 函数: _ZN14ascensionrules23CStateProcessPlayerTurn10EnterStateER13CStateMachine
// 地址: 0x175e78
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0 = *(arg1 + 0x38)
*(arg1 + 0x3c) = 0
char* r5 = *(r0 + 4)
core::CWorldBase::OutputMessage(r5)
core::CWorldBase::OutputMessageFormat(r5, "Round %d: %s (%d)\n", *(r5 + 0xb18), 
    *(arg1 + 0x38) + 0x10, *(r5 + 0xb0c))
int32_t var_20_1 = 0
ascension::CWorld::OutputEvent(r5, 0x35, zx.d(*(*(arg1 + 0x38) + 8)), 0)

if (*(r5 + 0x30) u>= 4)
    *(arg1 + 0x38)
    int32_t i
    
    for (i = ascension::CPlayer::GetNextPendingAsyncState(); i != 0; 
            i = ascension::CPlayer::GetNextPendingAsyncState())
        CState::AddOwnedChild(arg1)
        CStateList::AppendState(arg1)
        *(arg1 + 0x38)
    
    return i

*(arg1 + 0x38)
*(arg1 + 0x3c) = 1
ascension::CWorld::StartTurn(r5)
*(arg1 + 0x38)

if (ascension::CPlayer::GetNextPendingAsyncState() != 0)
    int32_t i_1
    
    do
        CState::AddOwnedChild(arg1)
        CStateList::AppendState(arg1)
        *(arg1 + 0x38)
        i_1 = ascension::CPlayer::GetNextPendingAsyncState()
    while (i_1 != 0)

*(arg1 + 0x8c) = *(arg1 + 0x38)
ascensionrules::CreateStateHandleEvent(r5, arg1 + 0x40, true, 0, nullptr, 0)
CState::AddOwnedChild(arg1)
CStateList::AppendState(arg1)
ascensionrules::CStateProcessPlayerChooseTurnActions::CStateProcessPlayerChooseTurnActions(
    operator new(0x1ae8), (*(arg1 + 0x38)).b)
CState::AddOwnedChild(arg1)
int32_t r0_25 = CStateList::AppendState(arg1)
*(arg1 + 0x1c8) = 1
return r0_25
