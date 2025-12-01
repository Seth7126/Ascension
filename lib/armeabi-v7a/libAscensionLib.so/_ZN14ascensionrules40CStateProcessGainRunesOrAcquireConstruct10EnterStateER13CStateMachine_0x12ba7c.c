// 函数: _ZN14ascensionrules40CStateProcessGainRunesOrAcquireConstruct10EnterStateER13CStateMachine
// 地址: 0x12ba7c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* r0_1 = *(arg1 + 0x24c)
int32_t r6 = *(r0_1 + 4)
int32_t r4 = *(r0_1 + 0x8c)

if (zx.d(*(r6 + 0xb3d)) != 0)
    r4 += *(r6 + 0xb48)

int32_t var_7c = 6
int32_t var_78 = 0
void* __offset(vtable_for_ascension::CEventQueryCardAcquireAttributes, 0x8) var_80 =
    _vtable_for_ascension::CEventQueryCardAcquireAttributes + 8
void* var_34 = r0_1
int32_t var_30 = 0
void* __offset(CStateMachine, 0x25c) var_2c = arg1 + 0x25c
int32_t r0_4 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_4 != 0 && *(*(r0_4 + 0xc) + 0x88) == 2)
    ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_80, r0_4, 7)

int32_t r0_9 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_9 != 0 && *(*(r0_9 + 0xc) + 0x88) == 2)
    ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_80, r0_9, 7)

int32_t r0_14 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_14 != 0 && *(*(r0_14 + 0xc) + 0x88) == 2)
    ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_80, r0_14, 7)

int32_t r0_19 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_19 != 0 && *(*(r0_19 + 0xc) + 0x88) == 2)
    ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_80, r0_19, 7)

int32_t r0_24 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_24 != 0 && *(*(r0_24 + 0xc) + 0x88) == 2)
    ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_80, r0_24, 7)

int32_t r0_29 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_29 != 0 && *(*(r0_29 + 0xc) + 0x88) == 2)
    ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_80, r0_29, 7)

int32_t r0_34 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_34 != 0 && *(*(r0_34 + 0xc) + 0x88) == 2)
    ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_80, r0_34, 7)

ascension::CWorld::HandleQuery(r6)

if (var_30 s>= 1)
    void* __offset(CStateMachine, 0x268) r1_16 = arg1 + 0x268
    int32_t r3_8 = 0
    
    do
        r3_8 += 1
        
        if (*r1_16 s<= 0xffffffff)
            *r1_16 = 0
        
        r1_16 += 0x44
    while (r3_8 s< var_30)

int32_t i = 0
*(arg1 + 0x258) = var_30
int32_t r4_1 = r6
int32_t var_8c = 0
void* var_a0
int32_t i_1

do
    void* r0_41 = ascension::CWorld::GetCenterRowCard(r6)
    
    if (r0_41 != 0 && *(*(r0_41 + 0xc) + 0x88) == 2)
        void* r6_1 = arg1 + var_8c * 0x44
        int32_t r5_1 = *(r6_1 + 0x29c)
        uint32_t __n = *(r6_1 + 0x278)
        
        if (r5_1 == 0xffffffff)
            i_1 = i
            CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_41 + 8), 0xa020, "Acquire %s", 
                ascensionrules::CStateProcessGainRunesOrAcquireConstruct::SelectCardToAcquire)
        
        if (memchr(r6_1 + 0x27c, 1, __n) != 0
                && (r5_1 == 0xffffffff || zx.d(*(r6_1 + r5_1 + 0x27c)) == 1))
            i_1 = i
            CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_41 + 8), 0xa024, 
                "Acquire %s to Hand", 
                ascensionrules::CStateProcessGainRunesOrAcquireConstruct::SelectAcquireToHand)
        
        if (memchr(r6_1 + 0x27c, 2, __n) != 0
                && (r5_1 == 0xffffffff || zx.d(*(r6_1 + r5_1 + 0x27c)) == 2))
            i_1 = i
            CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_41 + 8), 0xa022, 
                "Acquire %s to Top of Deck", 
                ascensionrules::CStateProcessGainRunesOrAcquireConstruct::SelectAcquireToTopOfDeck)
        
        void var_88
        var_a0 = &var_88
        var_8c += 1
        char var_85
        int32_t var_84
        
        if (ascension::CEventQueryCardAcquireAttributes::AcquireCardEntry::FindAcquireLocation(
                r6_1.b + 0x5c, 4, &var_84, &var_85) != 0 && (r5_1 == 0xffffffff || r5_1 == var_84)
                && r4 s>= zx.d(var_85))
            var_a0 = ascensionrules::CStateProcessGainRunesOrAcquireConstruct::SelectAcquireIntoPlay
            i_1 = i
            CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_41 + 8), 0xa023, 
                "Acquire %s into Play", var_a0)
    
    i += 1
    r6 = r4_1
while (i u< 7)

if (*(arg1 + 0x250) == 3)
    i_1 = 0
    var_a0 = ascensionrules::CStateProcessGainRunesOrAcquireConstruct::SelectGainRunes
    CGameStateOptions::AddSimpleUserOption(arg1.w, 0, 0xa080, "Gain 3 Runes", var_a0)

int32_t entry_r1
(*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), "You May Acquire a Construct or Gain Runes", 
    var_a0, i_1, entry_r1, r4, arg1, var_8c)
ascension::CEvent::~CEvent()
int32_t r0_66 = *__stack_chk_guard

if (r0_66 == r0)
    return r0_66 - r0

__stack_chk_fail()
noreturn
