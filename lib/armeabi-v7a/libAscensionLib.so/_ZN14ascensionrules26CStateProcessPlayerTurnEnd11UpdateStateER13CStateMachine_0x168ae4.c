// 函数: _ZN14ascensionrules26CStateProcessPlayerTurnEnd11UpdateStateER13CStateMachine
// 地址: 0x168ae4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r1 = *(arg1 + 0x38)
ascension::CPlayer* r6 = *(r1 + 4)

if (zx.d(*(arg1 + 0x3c)) == 0)
    if (zx.d(*(arg1 + 0x3d)) == 0)
        return CStateList::UpdateState(arg1) __tailcall
    
    *(arg1 + 0x8c) = r1
    *(arg1 + 0x3d) = 0
    ascensionrules::CreateStateHandleEvent(r6, arg1 + 0x40, true, 0, arg1 + 0x94, 0xa0)
else
    *(arg1 + 0x3c) = 0
    
    if (*(r6 + 0x30) u< 0x13)
        ascension::CWorld::PutPlayedCardsIntoDiscardPile(r6)
        *(arg1 + 0x38)
        ascension::CPlayer::PutEntireHandInDiscard()
    else
        ascension::CPlayer::PutEntireHandInDiscard()
        *(arg1 + 0x38)
        ascension::CWorld::PutPlayedCardsIntoDiscardPile(r6)
    
    int32_t var_20_1 = 0
    ascension::CWorld::OutputEvent(r6, 0x34, *(*(arg1 + 0x38) + 0xc), 0)
    ascensionrules::CreateStateProcessDrawHand(*(arg1 + 0x38), nullptr, 0)

CState* entry_r1
return CStateMachine::PushOwnedState(entry_r1) __tailcall
