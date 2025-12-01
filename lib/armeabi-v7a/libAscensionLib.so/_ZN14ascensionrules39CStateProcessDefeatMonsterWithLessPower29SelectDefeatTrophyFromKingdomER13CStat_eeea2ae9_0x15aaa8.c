// 函数: _ZN14ascensionrules39CStateProcessDefeatMonsterWithLessPower29SelectDefeatTrophyFromKingdomER13CStateMachineP6CStateiPj
// 地址: 0x15aaa8
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
int32_t* r0_9 = *(arg2 + 0x260)

if (r0_9 != 0)
    void* r2_4 = r0_9 + *r0_9 + 4
    uint32_t r1_2 = zx.d(*r2_4)
    
    if (r1_2 u<= 7)
        uint32_t r3_3 = zx.d(*(r0_3 + 8))
        *r2_4 = r1_2.b + 1
        r0_9[*r0_9 * 8 + r1_2 + 4] = r3_3

void* r0_12 = *(arg2 + 0x25c)

if (r0_12 != 0 && zx.d(*(r8 + 0xa14)) == 0)
    uint32_t var_38_2 = zx.d(*(r0_12 + 8))
    ascension::CWorld::OutputEvent(r8, 0x15, zx.d(*(r6 + 8)), zx.d(*(r0_3 + 8)))

void* r0_16 = ascension::CPlayer::PutTrophyInPlay(r6)
ascension::CPlayer::AddOwnedCard(r6)
uint32_t var_28 = zx.d(*(r6 + 8))
ascension::CWorld::OutputAnimationCard(r8, r0_3, 4, 6, zx.d(*(arg3 + 8)), 5, zx.d(*(r0_16 + 8)), 1)
ascension::CPlayer::AddTurnLog(r6, 4)

if (*(r8 + 0x30) u>= 3)
    ascension::CWorld::AddToDefeatedMonsterCount()

ascensionrules::CreateStateProcessCardEffect(r8, r6, *(r10 + 0xec), nullptr, nullptr, nullptr, 0)
CState::AddOwnedChild(arg2)
CStateList::AppendState(arg2)
*(arg2 + 0x4f8) = r6
*(arg2 + 0x4fc) = r0_3
*(arg2 + 0x500) = 6
*(arg2 + 0x504) = 0xffffffff
*(arg2 + 0x508) = 0
*(arg2 + 0x50c) = 5
*(arg2 + 0x510) = 0
ascensionrules::CreateStateHandleEvent(r8, arg2 + 0x4ac, true, 0, nullptr, 0)
CState::AddOwnedChild(arg2)
return CStateList::AppendState(arg2) __tailcall
