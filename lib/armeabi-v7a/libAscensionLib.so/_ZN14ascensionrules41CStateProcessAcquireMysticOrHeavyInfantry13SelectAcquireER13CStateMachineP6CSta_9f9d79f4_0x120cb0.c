// 函数: _ZN14ascensionrules41CStateProcessAcquireMysticOrHeavyInfantry13SelectAcquireER13CStateMachineP6CStateiPj
// 地址: 0x120cb0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CCardInstance* r4 = *(arg2 + 0x24c)
uint32_t r8 = *(r4 + 4)

if (*(arg3 + 0x10) s>= 1)
    core::CCardStackUniform::SetCardCount(arg3)

uint32_t r0_3 = ascension::CCardStackUniformAscension::TakeSampleCardInstance()
uint32_t r3 = ascension::CPlayer::AddTurnLog(r4, 3)
void* r0_5 = *(arg3 + 0x14)

if (r0_5 != 0)
    r3 = zx.d(*(r0_5 + 8))

int32_t var_38 = *(arg3 + 0x10)

if (r0_5 == 0)
    r3 = 0

ascension::CWorld::OutputEvent(r8, 0x21, zx.d(*(arg3 + 8)), r3)

if (*(arg2 + 0x25c) != 0)
    int32_t var_38_1 = 0
    ascension::CWorld::AddToAcquiredCards(r8, r0_3.b, 6, 1)
    int32_t var_28 = 0
    ascension::CWorld::OutputAnimationCard(r8, r0_3, 3, 6, zx.d(*(arg3 + 8)), 1, zx.d(*(r4 + 8)), 0)
    core::CWorldBase::OutputMessageFormat(r8, "%s acquires %s to hand\n", r4 + 0x10, 
        (*(*r0_3 + 0xc))(r0_3))
    ascension::CPlayer::PutCardInHand(r4)
else if (*(arg2 + 0x260) == 0)
    int32_t var_38_5 = 0
    ascension::CWorld::AddToAcquiredCards(r8, r0_3.b, 6, 3)
    int32_t var_28_2 = 0
    ascension::CWorld::OutputAnimationCard(r8, r0_3, 3, 6, zx.d(*(arg3 + 8)), 3, zx.d(*(r4 + 8)), 0)
    core::CWorldBase::OutputMessageFormat(r8, "%s acquires %s\n", r4 + 0x10, (*(*r0_3 + 0xc))(r0_3))
    ascension::CPlayer::PutCardInDiscard(r4)
else
    int32_t var_38_3 = 0
    ascension::CWorld::AddToAcquiredCards(r8, r0_3.b, 6, 2)
    int32_t var_28_1 = 0
    ascension::CWorld::OutputAnimationCard(r8, r0_3, 3, 6, zx.d(*(arg3 + 8)), 2, zx.d(*(r4 + 8)), 0)
    core::CWorldBase::OutputMessageFormat(r8, "%s acquires %s to top of deck\n", r4 + 0x10, 
        (*(*r0_3 + 0xc))(r0_3))
    ascension::CPlayer::PutCardOnTopOfDeck(r4)

return ascension::CPlayer::AddOwnedCard(r4) __tailcall
