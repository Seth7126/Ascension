// 函数: _ZN14ascensionrules34CStateProcessDefeatMonsterSequence10EnterStateER13CStateMachine
// 地址: 0x157e6c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* r0_1 = *(arg1 + 0x30)
int32_t r1 = *(arg1 + 0x34)
*(arg1 + 0x198) = 0
*(arg1 + 0x4c) = 0
void* r10 = *(r1 + 0xc)
int32_t r8 = *(r0_1 + 4)
*(arg1 + 0x48) = 0
int32_t var_7c = 8
int32_t var_78 = 0
void* __offset(vtable_for_ascension::CEventQueryCardDefeatAttributes, 0x8) var_80 =
    _vtable_for_ascension::CEventQueryCardDefeatAttributes + 8
void* var_34 = r0_1
int32_t var_30 = 0
void var_b4
void* var_2c = &var_b4
*(arg1 + 0x38)
ascension::CEventQueryCardDefeatAttributes::AddQueryCard(&var_80, r1)
ascension::CWorld::HandleQuery(r8)
int32_t var_a8

if (var_a8 s<= 0xffffffff)
    int32_t var_a8_1 = 0

int32_t r4 = 5
uint32_t __n
void __s

if (memchr(&__s, 5, __n) == 0)
    r4 = *(arg1 + 0x40)

void* r0_7 = *(arg1 + 0x30)
void* r1_1 = *(arg1 + 0x34)
int32_t r7_1 = *(arg1 + 0x38)
*(arg1 + 0x48) = r4
int32_t var_c8 = r7_1
ascension::CWorld::OutputEvent(r8, 2, zx.d(*(r0_7 + 8)), zx.d(*(r1_1 + 8)))
ascension::CWorld::AddToDefeatedMonsters(r8, (*(arg1 + 0x34)).w, *(arg1 + 0x38))
*(arg1 + 0x34)
ascension::CPlayer::AddTurnLog(*(arg1 + 0x30), 4)
ascension::CWorld::PushResolveEffect(r8, *(arg1 + 0x34))
bool* r1_4 = *(arg1 + 0x30)
int32_t r0_12 = *(arg1 + 0x34)
int32_t r2_6 = *(arg1 + 0x38)
int32_t r3_4 = *(arg1 + 0x3c)
*(arg1 + 0xb8) = 1
int32_t r4_1 = *(arg1 + 0x48)
*(arg1 + 0xbc) = arg1 + 0xc0
*(arg1 + 0xa0) = r1_4
*(arg1 + 0xa4) = r0_12
*(arg1 + 0xa8) = r2_6
*(arg1 + 0xac) = r3_4
*(arg1 + 0xb4) = r4_1
int32_t var_c8_1 = 1
ascension::CWorld::GetCenterRowDayNight(r8, r1_4, arg1 + 0xba, arg1.b - 0x45)
int32_t r0_14 = *(arg1 + 0x38)
*(arg1 + 0xb0) = 0
*(arg1 + 0x50) = 0

if (r0_14 == 7)
    if (*(r8 + 0x30) u>= 0x13)
        *(arg1 + 0x50) = ascension::CWorld::RemoveCenterRowCard(r8, (*(arg1 + 0x3c)).b)
    
    *(arg1 + 0x3c)
    int32_t* r0_19 = ascension::CWorld::GetCenterRowCardStackList(r8)
    
    if (r0_19 != 0)
        void* r2_9 = *r0_19
        int32_t r0_20 = r0_19[1]
        
        if (r2_9 != r0_20)
            do
                int32_t r1_7 = *(r2_9 + 4)
                r2_9 += 8
                
                if (r1_7 == 3)
                    *(arg1 + 0xb0) += 1
            while (r0_20 != r2_9)

if (*(r8 + 0x30) u>= 3)
    ascension::CWorld::HandleEvent(r8)
    ascension::CWorld::RemoveActiveEffectList(r8, zx.d(*(arg1 + 0x5e)))

if (zx.d(*(arg1 + 0x46)) == 0)
    uint32_t r3_7 = *(arg1 + 0x38)
    uint32_t r0_28 = 1
    
    if (r3_7 == 6)
        r0_28 = 1
        
        if (zx.d(*(r10 + 0xc5)) == 0)
            r0_28 = 4
    
    uint32_t var_b8_1 = zx.d(*(*(arg1 + 0x30) + 8))
    ascension::CWorld::OutputAnimationCard(r8, *(arg1 + 0x34), 4, r3_7, *(arg1 + 0x3c), 0xb, 0, 
        r0_28)
else
    int32_t var_b8 = 0
    ascension::CWorld::OutputAnimationCard(r8, *(arg1 + 0x34), 4, *(arg1 + 0x38), *(arg1 + 0x3c), 
        0xb, 0, 1)
    ascension::CWorld::OutputPauseForAllAnimation()

switch (*(arg1 + 0x48) - 3)
    case 0
        if (*(r8 + 0x30) u< 0x10 || *(r10 + 0x150) == 0)
            int32_t var_c8_4 = 0
            ascension::CWorld::AddToAcquiredCards(r8, (*(arg1 + 0x34)).b, *(arg1 + 0x38), 3)
            *(arg1 + 0x34)
            ascension::CPlayer::AddTurnLog(*(arg1 + 0x30), 3)
            *(arg1 + 0x34)
            ascension::CPlayer::PutCardInDiscard(*(arg1 + 0x30))
            *(arg1 + 0x34)
            ascension::CPlayer::AddOwnedCard(*(arg1 + 0x30))
    case 2
        int32_t var_c8_5 = 0
        ascension::CWorld::AddToAcquiredCards(r8, (*(arg1 + 0x34)).b, *(arg1 + 0x38), 5)
        *(arg1 + 0x34)
        ascension::CPlayer::AddTurnLog(*(arg1 + 0x30), 3)
        core::CCardInstance* r0_41 = *(arg1 + 0x30)
        *(arg1 + 0x34)
        
        if (zx.d(*(r10 + 0xc5)) == 0)
            ascension::CPlayer::PutCardInPlay(r0_41)
        else
            ascension::CPlayer::PutTrophyInPlay(r0_41)
        
        *(arg1 + 0x34)
        ascension::CPlayer::AddOwnedCard(*(arg1 + 0x30))
    case 5
        if (*(r8 + 0x30) u< 0x10 || *(r10 + 0x150) == 0)
            *(arg1 + 0x34)
            ascension::CWorld::PutCardOnBottomOfPortalDeck(r8)
    case 6
        if (*(r8 + 0x30) u< 0x10 || *(r10 + 0x150) == 0)
            *(arg1 + 0x34)
            ascension::CWorld::PutCardInVoid(r8)

switch (*(arg1 + 0x38) - 4)
    case 0
        void* r1_23 = *(arg1 + 0x30)
        int32_t r0_52 = *(r1_23 + 0x54)
        int32_t r1_24 = *(r1_23 + 0x58)
        
        if (r1_24 != r0_52)
            int32_t i = 0
            
            do
                void* r7_3 = *(r0_52 + (i << 2))
                int32_t r3_8 = *(r7_3 + 0x4c)
                
                if (r3_8 - *(r7_3 + 0x48) == 4 && *(arg1 + 0x34) == *(r3_8 - 4))
                    ascension::CConstructInstance::ClearCardUnderConstructList()
                    int32_t var_b8_2 = 0
                    ascension::CWorld::OutputAnimationCard(r8, *(r7_3 + 0x10), 0, 0xb, 0, 4, 
                        zx.d(*(r7_3 + 8)), 0)
                    break
                
                i += 1
            while (i u< (r1_24 - r0_52) s>> 2)
        
        ascension::CWorld::OutputPauseForAnimationToDestination(r8)
    case 3
        if (zx.d(*(arg1 + 0x45)) == 0 && *(r8 + 0x30) u<= 0x12)
            ascension::CWorld::RemoveCenterRowCard(r8, (*(arg1 + 0x3c)).b)
    case 5
        *(arg1 + 0x34)
        ascension::CWorld::RemoveCardFromVoid(r8)
        ascension::CWorld::OutputPauseForAnimationToDestination(r8)
    case 8
        *(arg1 + 0x34)
        ascension::CWorld::PopRevealCard(r8)
        ascension::CWorld::OutputPauseForAnimationToDestination(r8)

ascension::CEvent::~CEvent()
int32_t r0_64 = *__stack_chk_guard

if (r0_64 == r0)
    return r0_64 - r0

__stack_chk_fail()
noreturn
