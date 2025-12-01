// 函数: _ZN14ascensionrules36CStateProcessPlayerChooseTurnActions18SelectPlayFromHandER13CStateMachineP6CStateiPj
// 地址: 0x1700fc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
core::CCardInstance* r10 = *(arg2 + 0x24c)
core::CCardInstance* r4 = *(r10 + 4)
int32_t* r0_1 = core::CWorldBase::GetInstanceByID(r4)
core::CWorldBase::OutputMessageFormat(r4, "%s plays %s\n", r10 + 0x10, (*(*r0_1 + 0xc))(r0_1))
void* r7 = r0_1[3]
int32_t result = *(r7 + 0x88) - 1

if (result u<= 5)
    result = jump_table_170174[result]
    void** r4_1
    
    switch (result)
        case 0x18
            int32_t r0_10
            
            if (zx.d(*(*(arg2 + 0x24c) + 0xa4)) != 0)
                r0_10 = ascension::CCard::IsCardFaction(r7)
            
            if (zx.d(*(*(arg2 + 0x24c) + 0xa4)) != 0 && r0_10 != 0)
                goto label_1701bc
            
            int32_t var_28_4 = 0
            ascension::CWorld::OutputAnimationCard(r4, r0_1, 1, 1, zx.d(*(r10 + 8)), 0xb, 0, 0)
            ascension::CPlayer::RemoveCardFromHand(r10)
            CState::CleanupEmbeddedState()
            r4_1 = *(arg2 + 0x20)
            CState::CState()
            *r4_1 = _vtable_for_ascensionrules::CStatePlayHeroFromHand + 8
            r4_1[0xc] = r10
            r4_1[0xd] = r0_1
            r4_1[0xe] = 0
            r4_1[0xf] = _vtable_for_ascension::CEventBeforePlayHero + 8
            r4_1[0x10] = 0x13
            r4_1[0x11] = 0
            r4_1[0x22] = 0
            r4_1[0x23] = 0
            r4_1[0x24] = _vtable_for_ascension::CEventPlayHero + 8
            r4_1[0x25] = 0x14
            r4_1[0x26] = 0
            r4_1[0x37] = 0
            r4_1[0x38] = 0
            r4_1[0x39].b = 0
            r4_1[0x3a] = 0
            goto label_1704a0
        case 0x3c
        label_1701bc:
            void* r0_12 = ascension::CPlayer::PutConstructInPlay(r10, r0_1.b)
            uint32_t r1_4 = zx.d(*(r10 + 8))
            uint32_t var_28 = r1_4
            ascension::CWorld::OutputAnimationCard(r4, r0_1, 1, 1, r1_4, 4, zx.d(*(r0_12 + 8)), 0xc)
            ascension::CPlayer::RemoveCardFromHand(r10)
            *(arg2 + 0xf0c) = 0
            *(arg2 + 0xf50) = r10
            *(arg2 + 0xf54) = r0_1
            ascensionrules::CreateStateHandleEvent(r4, arg2 + 0xf04, true, 0, nullptr, 0)
            return CStateMachine::PushOwnedState(arg1) __tailcall
        case 0xd8
            uint32_t r0_20 = zx.d(*(r10 + 8))
            
            if (*(r4 + 0x30) u< 0x1a)
                int32_t var_28_5 = 0
                ascension::CWorld::OutputAnimationCard(r4, r0_1, 1, 1, r0_20, 0xa, 0, 0)
                ascension::CWorld::OutputAnimationPower(r4, *(r7 + 0xa0), r0_1)
                ascension::CPlayer::RemoveCardFromHand(r10)
                *(r7 + 0xa0)
                ascension::CWorld::AddCurrentTurnPower(r4)
                core::CWorldBase::OutputMessageFormat(r4, "%s gains %d power\n", r10 + 0x10, 
                    *(r7 + 0xa0))
                ascension::CWorld::AddToPlayedCards(r4, r0_1)
                return ascension::CPlayer::AddTurnLog(r10, 1) __tailcall
            
            int32_t var_28_1 = 0
            ascension::CWorld::OutputAnimationCard(r4, r0_1, 1, 1, r0_20, 0xb, 0, 0)
            ascension::CPlayer::RemoveCardFromHand(r10)
            CState::CleanupEmbeddedState()
            r4_1 = *(arg2 + 0x20)
            CState::CState()
            *r4_1 = _vtable_for_ascensionrules::CStatePlayMonsterFromHand + 8
            r4_1[0xc] = r10
            r4_1[0xd] = r0_1
            r4_1[0xe] = 0
            r4_1[0xf] = _vtable_for_ascension::CEventPlayMonster + 8
            r4_1[0x10] = 0x15
            r4_1[0x11] = 0
            r4_1[0x22] = 0
            r4_1[0x23] = 0
            r4_1[0x24].b = 0
            r4_1[0x25] = _vtable_for_ascension::CEventPutConstructIntoPlay + 8
            r4_1[0x26] = 0x18
            r4_1[0x27] = 0
            r4_1[0x38] = 0
            r4_1[0x39] = 0
            r4_1[0x3a] = 0
            goto label_1704a0
        case 0x19c
            int32_t var_28_2 = 0
            ascension::CWorld::OutputAnimationCard(r4, r0_1, 1, 1, zx.d(*(r10 + 8)), 0xb, 0, 0)
            ascension::CPlayer::RemoveCardFromHand(r10)
            CState::CleanupEmbeddedState()
            r4_1 = *(arg2 + 0x20)
            CStateList::CStateList()
            *r4_1 = _vtable_for_ascensionrules::CStatePlaySoulGem + 8
            r4_1[0xe] = r10
            r4_1[0xf] = r0_1
        label_1704a0:
            r4_1[0xb].b = 0
            CState::SetEmbeddedState(arg2)
            return CStateMachine::PushState(arg1) __tailcall
        case 0x204
            int32_t var_28_3 = 0
            ascension::CWorld::OutputAnimationCard(r4, r0_1, 1, 1, zx.d(*(r10 + 8)), 0xb, 0, 0)
            ascension::CPlayer::RemoveCardFromHand(r10)
            CState::CleanupEmbeddedState()
            r4_1 = *(arg2 + 0x20)
            CState::CState()
            *r4_1 = _vtable_for_ascensionrules::CStatePlayTreasureFromHand + 8
            r4_1[0xc] = r10
            r4_1[0xd] = r0_1
            goto label_1704a0

return result
