// 函数: _ZN14ascensionrules30CStateDefeatMonsterFromKingdom10EnterStateER13CStateMachine
// 地址: 0x16b96c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0 = *(arg1 + 0x30)
void* r1 = *(arg1 + 0x34)
uint32_t r6 = *(r0 + 4)
void* r9 = *(r1 + 0xc)
int32_t var_38 = 6
ascension::CWorld::OutputEvent(r6, 2, zx.d(*(r0 + 8)), zx.d(*(r1 + 8)))

if (zx.d(*(arg1 + 0x3c)) == 0)
    int32_t var_28_1 = 0
    ascension::CWorld::OutputAnimationCard(r6, *(arg1 + 0x34), 4, 6, zx.d(*(*(arg1 + 0x38) + 8)), 
        9, 0, &__elf_header.ident.file_class)
else
    *(arg1 + 0x34)
    void* r0_4 = ascension::CPlayer::PutTrophyInPlay(*(arg1 + 0x30))
    *(arg1 + 0x34)
    ascension::CPlayer::AddOwnedCard(*(arg1 + 0x30))
    uint32_t var_28 = zx.d(*(*(arg1 + 0x30) + 8))
    ascension::CWorld::OutputAnimationCard(r6, *(arg1 + 0x34), 4, 6, zx.d(*(*(arg1 + 0x38) + 8)), 
        5, zx.d(*(r0_4 + 8)), 1)
    ascension::CWorld::OutputPauseForAllAnimation()

*(arg1 + 0x34)
ascension::CPlayer::AddTurnLog(*(arg1 + 0x30), 4)

if (*(r6 + 0x30) u>= 3)
    ascension::CWorld::AddToDefeatedMonsterCount()

if (*(r9 + 0xec) != 0)
    CState::DeleteState(*(arg1 + 0x40))
    ascension::CPlayer* r1_5 = *(arg1 + 0x30)
    core::CInstance* r3_2 = *(arg1 + 0x34)
    *(arg1 + 0x40) = 0
    *(arg1 + 0x40) = ascensionrules::CreateStateProcessCardEffect(r6, r1_5, *(r9 + 0xec), r3_2, 
        nullptr, arg1 + 0x44, 0x800)
    CState* entry_r1
    CStateMachine::PushState(entry_r1)

*(arg1 + 0x844) = 1
return 1
