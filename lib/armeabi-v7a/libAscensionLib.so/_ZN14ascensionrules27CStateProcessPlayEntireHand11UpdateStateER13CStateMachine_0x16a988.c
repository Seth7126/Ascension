// 函数: _ZN14ascensionrules27CStateProcessPlayEntireHand11UpdateStateER13CStateMachine
// 地址: 0x16a988
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CInstance* r4 = *(arg1 + 0x38)
core::CCardInstance* r1 = *(r4 + 4)
int32_t var_2c = 0
int32_t var_48
CState* r0_45
CState* entry_r1

if (*(r1 + 0x30) u>= 0x10)
    void* r1_2 = *(r4 + 0x3c)
    int32_t* i = *(r1_2 + 0xc)
    
    if (i != *(r1_2 + 0x10))
        int32_t r7_1 = 0
        
        do
            ascension::CEvent* r6_1 = *i
            void* r1_4 = *(r6_1 + 0xc)
            ascension::CWorld* r0 = *(r1_4 + 0xfc)
            
            if (r0 == 0 || *(r1_4 + 0xb8) != 0)
                r7_1 = 1
            else
                var_48 = 0
                
                if (ascension::CEffect::CanUseEffect(r0, r1, r4, r6_1) != 0)
                    core::CWorldBase::OutputMessageFormat(r1, "%s transforms %s\n", 
                        *(arg1 + 0x38) + 0x10, (*(*r6_1 + 0xc))(r6_1), 0)
                    int32_t* r0_43 = operator new(0x40)
                    int32_t r4_3 = *(arg1 + 0x38)
                    CStateList::CStateList()
                    *r0_43 = _vtable_for_ascensionrules::CStateTransformCardFromHand + 8
                    r0_43[0xe] = r4_3
                    r0_45 = entry_r1
                    r0_43[0xf] = r6_1
                    goto label_16af80
                
                r4 = *(arg1 + 0x38)
            
            i = &i[1]
        while (i != *(*(r4 + 0x3c) + 0x10))
        
        var_2c = r7_1 & 1

void* r0_5 = *(r4 + 0x3c)
int32_t* r5_1 = *(r0_5 + 0xc)

if (r5_1 == *(r0_5 + 0x10))
label_16ab78:
    return CStateMachine::PopState(entry_r1) __tailcall

while (true)
    int32_t* r6_2 = *r5_1
    void* r7_2 = r6_2[3]
    
    if (var_2c == 0 || *(r7_2 + 0xfc) == 0 || *(r7_2 + 0xb8) != 0)
        core::CWorldBase::OutputMessageFormat(r1, "%s plays %s\n", r4 + 0x10, 
            (*(*r6_2 + 0xc))(r6_2), var_48)
        
        switch (*(r7_2 + 0x88) - 1)
            case 0
                void* r0_52 = *(arg1 + 0x38)
                
                if (zx.d(*(r0_52 + 0xa4)) == 0)
                    goto label_16afa8
                
                if (ascension::CCard::IsCardFaction(r7_2) == 0)
                    r0_52 = *(arg1 + 0x38)
                label_16afa8:
                    int32_t var_38_7 = 0
                    ascension::CWorld::OutputAnimationCard(r1, r6_2, 1, 1, zx.d(*(r0_52 + 8)), 0xb, 
                        0, 0)
                    ascension::CPlayer::RemoveCardFromHand(*(arg1 + 0x38))
                    int32_t* r0_87 = operator new(0x8ec)
                    int32_t r7_6 = *(arg1 + 0x38)
                    CState::CState()
                    *r0_87 = _vtable_for_ascensionrules::CStatePlayHeroFromHand + 8
                    r0_87[0xc] = r7_6
                    r0_87[0xd] = r6_2
                    r0_87[0xe] = 0
                    r0_87[0xf] = _vtable_for_ascension::CEventBeforePlayHero + 8
                    r0_87[0x10] = 0x13
                    r0_87[0x11] = 0
                    r0_87[0x22] = 0
                    r0_87[0x23] = 0
                    r0_87[0x24] = _vtable_for_ascension::CEventPlayHero + 8
                    r0_87[0x25] = 0x14
                    r0_45 = entry_r1
                    r0_87[0x26] = 0
                    r0_87[0x37] = 0
                    r0_87[0x38] = 0
                    r0_87[0x39].b = 0
                    r0_87[0x3a] = 0
                else
                    void* r0_56 = ascension::CPlayer::PutConstructInPlay(*(arg1 + 0x38), r6_2.b)
                    int32_t var_38_3 = 0
                    ascension::CWorld* r5_3 = r1
                    ascension::CWorld::OutputAnimationCard(r5_3, r6_2, 1, 1, 
                        zx.d(*(*(arg1 + 0x38) + 8)), 4, zx.d(*(r0_56 + 8)), 0)
                    ascension::CPlayer::RemoveCardFromHand(*(arg1 + 0x38))
                    int32_t r0_60 = *(arg1 + 0x38)
                    *(arg1 + 0x44) = 0
                    *(arg1 + 0x88) = r0_60
                    *(arg1 + 0x8c) = r6_2
                    ascensionrules::CreateStateHandleEvent(r5_3, arg1 + 0x3c, true, 0, nullptr, 0)
                    r0_45 = entry_r1
                
                break
            case 1
                void* r0_64 = ascension::CPlayer::PutConstructInPlay(*(arg1 + 0x38), r6_2.b)
                int32_t var_38_4 = 0
                ascension::CWorld::OutputAnimationCard(r1, r6_2, 1, 1, zx.d(*(*(arg1 + 0x38) + 8)), 
                    4, zx.d(*(r0_64 + 8)), 0)
                ascension::CPlayer::RemoveCardFromHand(*(arg1 + 0x38))
                int32_t r0_68 = *(arg1 + 0x38)
                *(arg1 + 0x44) = 0
                *(arg1 + 0x88) = r0_68
                *(arg1 + 0x8c) = r6_2
                ascensionrules::CreateStateHandleEvent(r1, arg1 + 0x3c, true, 0, nullptr, 0)
                r0_45 = entry_r1
                break
            case 2
                if (*(r1 + 0x30) u>= 0x1a)
                    int32_t var_38_2 = 0
                    ascension::CWorld::OutputAnimationCard(r1, r6_2, 1, 1, 
                        zx.d(*(*(arg1 + 0x38) + 8)), 0xb, 0, 0)
                    ascension::CPlayer::RemoveCardFromHand(*(arg1 + 0x38))
                    int32_t* r0_50 = operator new(0x8ec)
                    int32_t r7_3 = *(arg1 + 0x38)
                    CState::CState()
                    *r0_50 = _vtable_for_ascensionrules::CStatePlayMonsterFromHand + 8
                    r0_50[0xc] = r7_3
                    r0_50[0xd] = r6_2
                    r0_50[0xe] = 0
                    r0_50[0xf] = _vtable_for_ascension::CEventPlayMonster + 8
                    r0_50[0x10] = 0x15
                    r0_50[0x11] = 0
                    r0_50[0x22] = 0
                    r0_50[0x23] = 0
                    r0_50[0x24].b = 0
                    r0_50[0x25] = _vtable_for_ascension::CEventPutConstructIntoPlay + 8
                    r0_50[0x26] = 0x18
                    r0_50[0x27] = 0
                    r0_50[0x38] = 0
                    r0_50[0x39] = 0
                    r0_50[0x3a] = 0
                    r0_45 = entry_r1
                    break
                
                r4 = *(arg1 + 0x38)
                
                for (int32_t* i_1 = *(r4 + 0x48); i_1 != *(r4 + 0x4c); i_1 = &i_1[1])
                    int32_t* r0_20 = *i_1
                    
                    if (r0_20 != 0)
                        if (strcasecmp((*(*r0_20 + 0xc))(), "Samael the Fallen") == 0)
                            int32_t var_38_1 = 0
                            ascension::CWorld::OutputAnimationCard(r1, r6_2, 1, 1, 
                                zx.d(*(*(arg1 + 0x38) + 8)), 0xa, 0, 0)
                            ascension::CWorld::OutputAnimationPower(r1, *(r7_2 + 0xa0), r6_2)
                            ascension::CPlayer::RemoveCardFromHand(*(arg1 + 0x38))
                            *(r7_2 + 0xa0)
                            ascension::CWorld::AddCurrentTurnPower(r1)
                            core::CWorldBase::OutputMessageFormat(r1, "%s gains %d power\n", 
                                *(arg1 + 0x38) + 0x10, *(r7_2 + 0xa0))
                            ascension::CWorld::AddToPlayedCards(r1, r6_2)
                            return ascension::CPlayer::AddTurnLog(*(arg1 + 0x38), 1) __tailcall
                        
                        r4 = *(arg1 + 0x38)
            case 4
                int32_t var_38_5 = 0
                ascension::CWorld::OutputAnimationCard(r1, r6_2, 1, 1, zx.d(*(*(arg1 + 0x38) + 8)), 
                    0xb, 0, 0)
                ascension::CPlayer::RemoveCardFromHand(*(arg1 + 0x38))
                int32_t* r0_75 = operator new(0x40)
                int32_t r4_4 = *(arg1 + 0x38)
                CStateList::CStateList()
                *r0_75 = _vtable_for_ascensionrules::CStatePlaySoulGem + 8
                r0_75[0xe] = r4_4
                r0_75[0xf] = r6_2
                r0_45 = entry_r1
                break
            case 5
                int32_t var_38_6 = 0
                ascension::CWorld::OutputAnimationCard(r1, r6_2, 1, 1, zx.d(*(*(arg1 + 0x38) + 8)), 
                    0xb, 0, 0)
                ascension::CPlayer::RemoveCardFromHand(*(arg1 + 0x38))
                int32_t* r0_81 = operator new(0x38)
                int32_t r4_5 = *(arg1 + 0x38)
                CState::CState()
                *r0_81 = _vtable_for_ascensionrules::CStatePlayTreasureFromHand + 8
                r0_81[0xc] = r4_5
                r0_81[0xd] = r6_2
                r0_45 = entry_r1
                break
            default
                r4 = *(arg1 + 0x38)
    
    r5_1 = &r5_1[1]
    
    if (r5_1 == *(*(r4 + 0x3c) + 0x10))
        goto label_16ab78

label_16af80:
return CStateMachine::PushOwnedState(r0_45) __tailcall
