// 函数: _ZN14ascensionrules26CStatePlayTreasureFromHand10EnterStateER13CStateMachine
// 地址: 0x169814
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
uint32_t r5 = *(*(arg1 + 0x30) + 4)
ascension::CWorld::AddToPlayedCards(r5, *(arg1 + 0x34))
int32_t var_28 = 0
ascension::CWorld::OutputEvent(r5, 9, zx.d(*(*(arg1 + 0x30) + 8)), zx.d(*(*(arg1 + 0x34) + 8)))
*(arg1 + 0x34)
ascension::CPlayer::AddTurnLog(*(arg1 + 0x30), 1)
ascension::CWorld::PushResolveEffect(r5, *(arg1 + 0x34))
core::CInstance* r3_1 = *(arg1 + 0x34)
void* result = *(r3_1 + 0xc)
ascension::CEffect* r2_4 = *(result + 0xe8)

if (r2_4 == 0)
    return result

ascensionrules::CreateStateProcessCardEffect(r5, *(arg1 + 0x30), r2_4, r3_1, nullptr, nullptr, 0)
CState* entry_r1
return CStateMachine::PushOwnedState(entry_r1) __tailcall
