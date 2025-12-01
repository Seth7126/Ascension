// 函数: _ZN14ascensionrules32CStateProcessAcquireCardSequence10EnterStateER13CStateMachine
// 地址: 0x11dfc8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r1 = *(arg1 + 0x34)
core::CCardInstance* r10 = *(*(arg1 + 0x30) + 4)
void* r0_1 = *(r1 + 0xc)
int32_t r0_2 = *(arg1 + 0x40)
uint32_t r5 = zx.d(*(r10 + 0xa14))
*(arg1 + 0x44) = r0_2
*(arg1 + 0x48) = 0
int32_t var_48 = 0
ascension::CWorld::AddToAcquiredCards(r10, r1.b, *(arg1 + 0x38), r0_2.w & 0xff)

if (r5 == 0)
    var_48 = *(arg1 + 0x40)
    ascension::CWorld::OutputEvent(r10, 4, zx.d(*(*(arg1 + 0x30) + 8)), zx.d(*(*(arg1 + 0x34) + 8)))

*(arg1 + 0x34)
ascension::CPlayer::AddTurnLog(*(arg1 + 0x30), 3)
*(arg1 + 0x34)
ascension::CPlayer::AddOwnedCard(*(arg1 + 0x30))
uint32_t r8 = *(arg1 + 0x38)
int32_t r6_2 = *(arg1 + 0x3c)

if (r8 == 7)
    *(arg1 + 0x34)
    r8 = 7
    
    if (ascension::CWorld::IsRevealCard(r10) != 0)
        r8 = 0xc
        r6_2 = 0

uint32_t var_44
uint32_t var_40
uint32_t var_3c
uint32_t var_38
uint32_t r0_44
uint32_t r1_19

switch (*(arg1 + 0x44) - 1)
    case 0
        if (r5 == 0)
            core::CWorldBase::OutputMessageFormat(r10, "%s acquires %s into hand\n", 
                *(arg1 + 0x30) + 0x10, (*(**(arg1 + 0x34) + 0xc))(), var_48)
            uint32_t r0_18 = zx.d(*(*(arg1 + 0x30) + 8))
            var_44 = 1
            var_3c = 1
            var_40 = r0_18
            var_38 = r0_18
            var_48 = r6_2
            ascension::CWorld::OutputAnimationCard(r10, *(arg1 + 0x34), 3, r8, var_48, 1, var_40, 1)
        
        *(arg1 + 0x34)
        ascension::CPlayer::PutCardInHand(*(arg1 + 0x30))
    case 1
        if (r5 == 0)
            core::CWorldBase::OutputMessageFormat(r10, "%s puts %s on top of deck\n", 
                *(arg1 + 0x30) + 0x10, (*(**(arg1 + 0x34) + 0xc))(), var_48)
            uint32_t r0_26 = zx.d(*(*(arg1 + 0x30) + 8))
            var_44 = 2
            var_3c = 1
            var_40 = r0_26
            var_38 = r0_26
            var_48 = r6_2
            ascension::CWorld::OutputAnimationCard(r10, *(arg1 + 0x34), 3, r8, var_48, 2, var_40, 1)
        
        *(arg1 + 0x34)
        ascension::CPlayer::PutCardOnTopOfDeck(*(arg1 + 0x30))
    case 2
        if (r5 == 0)
            core::CWorldBase::OutputMessageFormat(r10, "%s acquires %s\n", *(arg1 + 0x30) + 0x10, 
                (*(**(arg1 + 0x34) + 0xc))(), var_48)
            uint32_t r0_34 = zx.d(*(*(arg1 + 0x30) + 8))
            var_44 = 3
            var_3c = 1
            var_40 = r0_34
            var_38 = r0_34
            var_48 = r6_2
            ascension::CWorld::OutputAnimationCard(r10, *(arg1 + 0x34), 3, r8, var_48, 3, var_40, 1)
        
        *(arg1 + 0x34)
        ascension::CPlayer::PutCardInDiscard(*(arg1 + 0x30))
    case 3
        void* r0_38 = ascension::CPlayer::PutConstructInPlay(*(arg1 + 0x30), (*(arg1 + 0x34)).b)
        
        if (r5 == 0)
            core::CWorldBase::OutputMessageFormat(r10, "%s puts %s directly into play\n", 
                *(arg1 + 0x30) + 0x10, (*(**(arg1 + 0x34) + 0xc))(), var_48)
            r1_19 = *(arg1 + 0x34)
            r0_44 = zx.d(*(*(arg1 + 0x30) + 8))
            var_40 = zx.d(*(r0_38 + 8))
            var_48 = r6_2
            var_44 = 4
            var_3c = 1
        label_11e3ac:
            var_38 = r0_44
            ascension::CWorld::OutputAnimationCard(r10, r1_19, 3, r8, var_48, var_44, var_40, 
                var_3c)
    case 4
        *(arg1 + 0x34)
        void* r0_46 = ascension::CPlayer::PutCardInPlay(*(arg1 + 0x30))
        
        if (r5 == 0)
            core::CWorldBase::OutputMessageFormat(r10, "%s acquire %s into play\n", 
                *(arg1 + 0x30) + 0x10, (*(**(arg1 + 0x34) + 0xc))(), var_48)
            int32_t r0_52 = *(arg1 + 0x38)
            void* r0_53
            void* r2_15
            uint32_t r12_1
            
            if (r0_52 != 5)
                r2_15 = r0_46
                
                if (r0_52 != 0x17)
                    goto label_11e384
                
                r0_53 = *(arg1 + 0x30)
                r12_1 = 0xe
            label_11e38c:
                r1_19 = *(arg1 + 0x34)
                r0_44 = zx.d(*(r0_53 + 8))
                var_48 = r6_2
                var_44 = 5
                var_40 = zx.d(*(r2_15 + 8))
                var_3c = r12_1
                goto label_11e3ac
            
            r2_15 = r0_46
            
            if (*(r0_1 + 0x88) != 0xa)
            label_11e384:
                r0_53 = *(arg1 + 0x30)
                r12_1 = 1
                goto label_11e38c
            
            var_40 = zx.d(*(r2_15 + 8))
            var_38 = zx.d(*(*(arg1 + 0x30) + 8))
            var_48 = r6_2
            var_44 = 5
            var_3c = 0xf
            ascension::CWorld::OutputAnimationCard(r10, *(arg1 + 0x34), 8, r8, var_48, var_44, 
                var_40, var_3c)

int32_t r0_59 = *(arg1 + 0x38)
int32_t r6_3 = 0
*(arg1 + 0x4c) = 0

if (r0_59 - 5 u<= 0x16)
    switch (r0_59)
        case 5
            *(arg1 + 0x3c)
            int32_t r0_63 = core::CWorldBase::GetInstanceByID(r10)
            
            if (r0_63 != 0)
                r6_3 = 0
                void* r0_64 = __dynamic_cast(r0_63, _typeinfo_for_core::CInstance, 
                    _typeinfo_for_ascension::CCardInPlayInstance, 0, var_48, var_44, var_40, 
                    var_3c, var_38)
                
                if (r0_64 != 0)
                    ascension::CCardInPlayInstance* r8_1 = *(r0_64 + 0xc)
                    ascension::CPlayer::RemoveCardInPlay(r8_1)
                    *(arg1 + 0x34)
                    ascension::CPlayer::RemoveOwnedCard(r8_1)
                    
                    if (r5 == 0)
                        int32_t var_48_1 = 1
                        ascension::CWorld::OutputEvent(r10, 0x37, zx.d(*(*(arg1 + 0x30) + 8)), 
                            zx.d(*(*(arg1 + 0x34) + 8)))
        case 7
            if (*(r10 + 0x30) u>= 0x13)
                *(arg1 + 0x4c) = ascension::CWorld::RemoveCenterRowCard(r10, (*(arg1 + 0x3c)).b)
            
            *(arg1 + 0x3c)
            int32_t* r0_72 = ascension::CWorld::GetCenterRowCardStackList(r10)
            r6_3 = 0
            
            if (r0_72 != 0)
                void* r1_30 = *r0_72
                int32_t r0_73 = r0_72[1]
                
                if (r1_30 != r0_73)
                    r6_3 = 0
                    
                    do
                        int32_t r2_22 = *(r1_30 + 4)
                        r1_30 += 8
                        
                        if (r2_22 == 3)
                            r6_3 += 1
                    while (r0_73 != r1_30)
            
            if (r8 == 0xc)
                *(arg1 + 0x34)
                ascension::CWorld::RemoveRevealCard(r10)
        case 9
            if (*(r10 + 0x30) u< 0x1e)
                goto label_11e560
            
            *(arg1 + 0x34)
            ascension::CWorld::RemoveCardFromVoid(r10)
            
            if (r5 == 0)
                *(arg1 + 0x44)
                ascension::CWorld::OutputPauseForAnimationToDestination(r10)
        case 0xb
            *(arg1 + 0x34)
            ascension::CWorld::PopResolveEffect(r10)
        label_11e560:
            
            if (r5 == 0)
                *(arg1 + 0x44)
                ascension::CWorld::OutputPauseForAnimationToDestination(r10)
        case 0xc
            *(arg1 + 0x34)
            ascension::CWorld::PopRevealCard(r10)
            
            if (r5 == 0)
                *(arg1 + 0x44)
                ascension::CWorld::OutputPauseForAnimationToDestination(r10)
        case 0x14
            *(arg1 + 0x34)
            ascension::CPlayer::RemoveCardFromDreamscape(*(arg1 + 0x30))
        case 0x17
            *(arg1 + 0x34)
            ascension::CWorld::RemoveAvailableTemple(r10)
            
            if (r5 == 0)
                r6_3 = 0
                int32_t var_48_2 = 0
                ascension::CWorld::OutputEvent(r10, 0x37, zx.d(*(*(arg1 + 0x30) + 8)), 
                    zx.d(*(*(arg1 + 0x34) + 8)))
        case 0x1b
            *(arg1 + 0x34)
            ascension::CWorld::RemoveUniqueAvailableCard(r10)

if (zx.d(*(r0_1 + 0xd2)) != 0)
    ascension::CPlayer::AddInsightCount(*(arg1 + 0x30))
    
    if (*(arg1 + 0x30) == *(r10 + 0xb20))
        ascension::CWorld::AddInsightGainedThisTurn(r10)
        
        if (r5 == 0)
        label_11e654:
            int32_t var_48_3 = 0
            ascension::CWorld::OutputAnimationInsight(r10, 1, *(arg1 + 0x30), *(arg1 + 0x34))
        label_11e664:
            
            if (zx.d(*(r0_1 + 0xe4)) != 0)
                int32_t var_48_4 = 0
                ascension::CWorld::OutputEvent(r10, 0x2d, zx.d(*(*(arg1 + 0x30) + 8)), 
                    zx.d(*(*(arg1 + 0x34) + 8)))
    else if (r5 == 0)
        goto label_11e654
else if (r5 == 0)
    goto label_11e664

int32_t r1_44 = *(arg1 + 0x40)
int32_t r0_93 = *(arg1 + 0x38)
*(arg1 + 0xb4) = arg1 + 0xb8
*(arg1 + 0xa4) = r0_93
*(arg1 + 0xa8) = r1_44
*(arg1 + 0xac) = r6_3
ascension::CWorld::HandleEvent(r10)
return ascension::CWorld::RemoveActiveEffectList(r10, zx.d(*(arg1 + 0x5a))) __tailcall
