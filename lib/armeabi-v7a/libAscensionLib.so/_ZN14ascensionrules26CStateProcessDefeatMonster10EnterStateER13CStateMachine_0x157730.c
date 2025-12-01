// 函数: _ZN14ascensionrules26CStateProcessDefeatMonster10EnterStateER13CStateMachine
// 地址: 0x157730
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0 = *(arg1 + 0x38)
uint32_t r5 = *(r0 + 4)
int32_t var_38 = 7
ascension::CWorld::OutputEvent(r5, 2, zx.d(*(r0 + 8)), zx.d(*(*(arg1 + 0x3c) + 8)))
ascension::CWorld::AddToDefeatedMonsters(r5, (*(arg1 + 0x3c)).w, 7)
*(arg1 + 0x3c)
ascension::CPlayer::AddTurnLog(*(arg1 + 0x38), 4)
ascension::CWorld::PushResolveEffect(r5, *(arg1 + 0x3c))
uint32_t var_28 = zx.d(*(*(arg1 + 0x38) + 8))
ascension::CWorld::OutputAnimationCard(r5, *(arg1 + 0x3c), 4, 7, *(arg1 + 0x40), 0xb, 0, 1)
ascension::CWorld::OutputPauseForAllAnimation()
*(arg1 + 0x3c)
ascension::CWorld::PutCardInVoid(r5)
int32_t r0_10 = *(arg1 + 0x38)
int32_t r1_5 = *(arg1 + 0x3c)
int32_t r2_6 = *(arg1 + 0x40)
*(arg1 + 0xa8) = 1
*(arg1 + 0x90) = r0_10
*(arg1 + 0x94) = r1_5
*(arg1 + 0x9c) = r2_6
*(arg1 + 0xa0) = 0
ascensionrules::CreateStateHandleEvent(r5, arg1 + 0x44, true, 0, nullptr, 0)
CState::AddOwnedChild(arg1)
CStateList::AppendState(arg1)
core::CInstance* r3_2 = *(arg1 + 0x3c)
ascensionrules::CreateStateProcessCardEffect(r5, *(arg1 + 0x38), *(*(r3_2 + 0xc) + 0xec), r3_2, 
    arg1 + 0x44, nullptr, 0)
CState::AddOwnedChild(arg1)
return CStateList::AppendState(arg1) __tailcall
