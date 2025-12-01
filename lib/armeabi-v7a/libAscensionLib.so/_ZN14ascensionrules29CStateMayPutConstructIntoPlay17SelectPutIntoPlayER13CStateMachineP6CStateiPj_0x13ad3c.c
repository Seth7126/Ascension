// 函数: _ZN14ascensionrules29CStateMayPutConstructIntoPlay17SelectPutIntoPlayER13CStateMachineP6CStateiPj
// 地址: 0x13ad3c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t* r7 = *(arg2 + 0x250)

if (r7 == 0)
    return 

int32_t r6_1 = *(arg2 + 0x24c)
char* r5_1 = *(r6_1 + 4)
core::CWorldBase::OutputMessageFormat(r5_1, "%s puts %s directly into play\n", r6_1 + 0x10, 
    (*(*r7 + 0xc))(r7))
uint32_t r0_6 = zx.d(*(ascension::CPlayer::PutConstructInPlay(r6_1, r7.b) + 8))
uint32_t var_28_1 = zx.d(*(r6_1 + 8))
ascension::CWorld::OutputAnimationCard(r5_1, r7, 3, 7, 0, 4, r0_6, 1)
int32_t var_38_1 = 0
ascension::CWorld::AddToAcquiredCards(r5_1, r7.b, 7, 4)
ascension::CPlayer::AddTurnLog(r6_1, 3)
ascension::CPlayer::AddOwnedCard(r6_1)
*(arg2 + 0x2a8) = r6_1
*(arg2 + 0x2ac) = r7
ascensionrules::CreateStateHandleEvent(r5_1, arg2 + 0x25c, true, 0, nullptr, 0)
CStateMachine::PushOwnedState(arg1)
arg1 = *(arg2 + 0x254)

if (arg1 != 0)
    arg1 = __dynamic_cast(arg1, _typeinfo_for_ascension::CEvent, 
        _typeinfo_for_ascension::CEventAcquireCard, 0)
    
    if (arg1 != 0)
        *(arg1 + 0x60) = 0

if (*(arg2 + 0x258) != 0)
    return ascension::CWorld::PlayActiveEffect(r5_1) __tailcall
