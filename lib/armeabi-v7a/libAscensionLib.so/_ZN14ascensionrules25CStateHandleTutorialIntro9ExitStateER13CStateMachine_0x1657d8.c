// 函数: _ZN14ascensionrules25CStateHandleTutorialIntro9ExitStateER13CStateMachine
// 地址: 0x1657d8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CCardInstance* r0 = *(arg1 + 0x38)
void* r1 = *(r0 + 0x40)
ascension::CPlayer* r10 = *(r0 + 4)
int32_t* i = *(r1 + 0xc)

if (i != *(r1 + 0x10))
    do
        int32_t* r4_1 = *i
        i = &i[1]
        int32_t r0_4 = strcasecmp((*(*r4_1 + 0xc))(r4_1), "Mystic")
        r0 = *(arg1 + 0x38)
        
        if (r0_4 == 0)
            ascension::CPlayer::RemoveCardFromDiscard(r0)
            r0 = *(arg1 + 0x38)
            break
    while (i != *(*(r0 + 0x40) + 0x10))

ascension::CPlayer::RemoveHonorTokens(r0)
*(r10 + 0xb0c)
ascension::CWorld::SetHonorTokenPool(r10)
*(arg1 + 0x38)
ascension::CWorld::PutPlayedCardsIntoDiscardPile(r10)
*(arg1 + 0x38)
ascension::CPlayer::PutEntireHandInDiscard()
*(arg1 + 0x38)
ascension::CPlayer::ShuffleDiscardIntoDeck()
*(arg1 + 0x38)
uint32_t r0_11 = ascension::CPlayer::RemoveTopCardFromDeck()

if (r0_11 != 0)
    ascension::CPlayer::PutCardInHand(*(arg1 + 0x38))
    uint32_t r0_14 = zx.d(*(*(arg1 + 0x38) + 8))
    int32_t var_28_1 = 0
    ascension::CWorld::OutputAnimationCard(r10, r0_11, 2, 2, r0_14, 1, r0_14, 0)

*(arg1 + 0x38)
uint32_t r0_17 = ascension::CPlayer::RemoveTopCardFromDeck()

if (r0_17 != 0)
    ascension::CPlayer::PutCardInHand(*(arg1 + 0x38))
    uint32_t r0_20 = zx.d(*(*(arg1 + 0x38) + 8))
    int32_t var_28_2 = 0
    ascension::CWorld::OutputAnimationCard(r10, r0_17, 2, 2, r0_20, 1, r0_20, 0)

*(arg1 + 0x38)
uint32_t r0_23 = ascension::CPlayer::RemoveTopCardFromDeck()

if (r0_23 != 0)
    ascension::CPlayer::PutCardInHand(*(arg1 + 0x38))
    uint32_t r0_26 = zx.d(*(*(arg1 + 0x38) + 8))
    int32_t var_28_3 = 0
    ascension::CWorld::OutputAnimationCard(r10, r0_23, 2, 2, r0_26, 1, r0_26, 0)

*(arg1 + 0x38)
uint32_t r0_29 = ascension::CPlayer::RemoveTopCardFromDeck()

if (r0_29 != 0)
    ascension::CPlayer::PutCardInHand(*(arg1 + 0x38))
    uint32_t r0_32 = zx.d(*(*(arg1 + 0x38) + 8))
    int32_t var_28_4 = 0
    ascension::CWorld::OutputAnimationCard(r10, r0_29, 2, 2, r0_32, 1, r0_32, 0)

*(arg1 + 0x38)
uint32_t r0_35 = ascension::CPlayer::RemoveTopCardFromDeck()

if (r0_35 != 0)
    ascension::CPlayer::PutCardInHand(*(arg1 + 0x38))
    uint32_t r0_38 = zx.d(*(*(arg1 + 0x38) + 8))
    int32_t var_28_5 = 0
    ascension::CWorld::OutputAnimationCard(r10, r0_35, 2, 2, r0_38, 1, r0_38, 0)

ascension::CWorld::ClearAcquiredCards()
ascension::CWorld::ClearDefeatedMonsters()
return CStateList::ExitState(arg1) __tailcall
