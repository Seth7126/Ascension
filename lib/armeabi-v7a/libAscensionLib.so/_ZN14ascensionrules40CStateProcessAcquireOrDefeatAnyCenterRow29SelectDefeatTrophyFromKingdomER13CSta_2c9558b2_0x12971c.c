// 函数: _ZN14ascensionrules40CStateProcessAcquireOrDefeatAnyCenterRow29SelectDefeatTrophyFromKingdomER13CStateMachineP6CStateiPj
// 地址: 0x12971c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CCardInstance* r6 = *(arg2 + 0x24c)
uint32_t r8 = *(r6 + 4)

if (*(arg3 + 0x10) s>= 1)
    core::CCardStackUniform::SetCardCount(arg3)

uint32_t r0_3
uint32_t r3
r0_3, r3 = ascension::CCardStackUniformAscension::TakeSampleCardInstance()
void* r0_4 = *(arg3 + 0x14)

if (r0_4 != 0)
    r3 = zx.d(*(r0_4 + 8))

int32_t r0_5 = *(arg3 + 0x10)

if (r0_4 == 0)
    r3 = 0

ascension::CWorld::OutputEvent(r8, 0x21, zx.d(*(arg3 + 8)), r3)
void* r10 = *(r0_3 + 0xc)
core::CWorldBase::OutputMessageFormat(r8, "%s defeats %s\n", r6 + 0x10, r10 + 4, r0_5)
int32_t var_38_1 = 6
ascension::CWorld::OutputEvent(r8, 2, zx.d(*(r6 + 8)), zx.d(*(r0_3 + 8)))
void* r0_10 = ascension::CPlayer::PutTrophyInPlay(r6)
ascension::CPlayer::AddOwnedCard(r6)
uint32_t var_28 = zx.d(*(r6 + 8))
ascension::CWorld::OutputAnimationCard(r8, r0_3, 4, 6, zx.d(*(arg3 + 8)), 5, zx.d(*(r0_10 + 8)), 1)
ascension::CPlayer::AddTurnLog(r6, 4)

if (*(r8 + 0x30) u>= 3)
    ascension::CWorld::AddToDefeatedMonsterCount()

ascensionrules::CreateStateProcessCardEffect(r8, r6, *(r10 + 0xec), nullptr, nullptr, nullptr, 0)
CState::AddOwnedChild(arg2)
CStateList::AppendState(arg2)
*(arg2 + 0xcf8) = 0
*(arg2 + 0xd3c) = r6
*(arg2 + 0xd40) = r0_3
*(arg2 + 0xd44) = 6
*(arg2 + 0xd48) = 0xffffffff
*(arg2 + 0xd4c) = 0
*(arg2 + 0xd50) = 5
*(arg2 + 0xd54) = 0
ascensionrules::CreateStateHandleEvent(r8, arg2 + 0xcf0, true, 0, nullptr, 0)
CState::AddOwnedChild(arg2)
CStateList::AppendState(arg2)
*(arg2 + 0xced) = 1
return 1
