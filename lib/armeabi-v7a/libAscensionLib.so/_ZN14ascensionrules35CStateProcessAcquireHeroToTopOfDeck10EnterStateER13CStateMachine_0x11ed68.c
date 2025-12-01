// 函数: _ZN14ascensionrules35CStateProcessAcquireHeroToTopOfDeck10EnterStateER13CStateMachine
// 地址: 0x11ed68
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* r0_1 = *(arg1 + 0x24c)
int32_t r6 = *(r0_1 + 4)
int32_t r1 = *(r6 + 0x30)
int32_t var_7c = 6
int32_t var_78 = 0
void* __offset(vtable_for_ascension::CEventQueryCardAcquireAttributes, 0x8) var_80 =
    _vtable_for_ascension::CEventQueryCardAcquireAttributes + 8
void* var_34 = r0_1
int32_t var_30 = 0
void* __offset(CStateMachine, 0x270) var_2c = arg1 + 0x270

if (zx.d(*(arg1 + 0x261)) == 0)
    int32_t* i = *(r6 + 0xa30)
    
    for (int32_t r2_1 = *(r6 + 0xa34); i != r2_1; i = &i[1])
        void* r0_7 = *i
        
        if (*(r0_7 + 0x10) != 0)
            int32_t r1_2 = *(r0_7 + 0x14)
            
            if (r1_2 != 0)
                int32_t* r3_1 = *(r0_7 + 0xc)
                
                if (r3_1[0x22] == 1)
                    int32_t r0_5 = *(arg1 + 0x25c)
                    int32_t r4_2
                    
                    if (r0_5 s>= 1)
                        int32_t r4_1 = 0x98
                        
                        if (r1 u< 0x14)
                            r4_1 = 0x9c
                        
                        r4_2 = *(r3_1 + r4_1)
                        
                        if (zx.d(*(arg1 + 0x260)) != 0)
                            r4_2 += r3_1[0x28]
                    
                    if (r0_5 s< 1 || r4_2 s<= r0_5)
                        ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_80, r1_2, 6)
                        r2_1 = *(r6 + 0xa34)

int32_t r0_9 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_9 != 0)
    int32_t* r1_4 = *(r0_9 + 0xc)
    
    if (r1_4[0x22] == 1)
        int32_t r0_11 = *(arg1 + 0x25c)
        int32_t r3_5
        
        if (r0_11 s>= 1)
            int32_t r3_4 = 0x98
            
            if (r1 u< 0x14)
                r3_4 = 0x9c
            
            r3_5 = *(r1_4 + r3_4)
            
            if (zx.d(*(arg1 + 0x260)) != 0)
                r3_5 += r1_4[0x28]
        
        if (r0_11 s< 1 || r3_5 s<= r0_11)
            ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_80, r0_9, 7)

int32_t r0_14 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_14 != 0)
    int32_t* r2_3 = *(r0_14 + 0xc)
    
    if (r2_3[0x22] == 1)
        int32_t r0_16 = *(arg1 + 0x25c)
        int32_t r3_8
        
        if (r0_16 s>= 1)
            int32_t r3_7 = 0x98
            
            if (r1 u< 0x14)
                r3_7 = 0x9c
            
            r3_8 = *(r2_3 + r3_7)
            
            if (zx.d(*(arg1 + 0x260)) != 0)
                r3_8 += r2_3[0x28]
        
        if (r0_16 s< 1 || r3_8 s<= r0_16)
            ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_80, r0_14, 7)

int32_t r0_19 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_19 != 0)
    int32_t* r2_5 = *(r0_19 + 0xc)
    
    if (r2_5[0x22] == 1)
        int32_t r0_21 = *(arg1 + 0x25c)
        int32_t r3_11
        
        if (r0_21 s>= 1)
            int32_t r3_10 = 0x98
            
            if (r1 u< 0x14)
                r3_10 = 0x9c
            
            r3_11 = *(r2_5 + r3_10)
            
            if (zx.d(*(arg1 + 0x260)) != 0)
                r3_11 += r2_5[0x28]
        
        if (r0_21 s< 1 || r3_11 s<= r0_21)
            ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_80, r0_19, 7)

int32_t r0_24 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_24 != 0)
    int32_t* r2_7 = *(r0_24 + 0xc)
    
    if (r2_7[0x22] == 1)
        int32_t r0_26 = *(arg1 + 0x25c)
        int32_t r3_14
        
        if (r0_26 s>= 1)
            int32_t r3_13 = 0x98
            
            if (r1 u< 0x14)
                r3_13 = 0x9c
            
            r3_14 = *(r2_7 + r3_13)
            
            if (zx.d(*(arg1 + 0x260)) != 0)
                r3_14 += r2_7[0x28]
        
        if (r0_26 s< 1 || r3_14 s<= r0_26)
            ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_80, r0_24, 7)

int32_t r0_29 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_29 != 0)
    int32_t* r2_9 = *(r0_29 + 0xc)
    
    if (r2_9[0x22] == 1)
        int32_t r0_31 = *(arg1 + 0x25c)
        int32_t r3_17
        
        if (r0_31 s>= 1)
            int32_t r3_16 = 0x98
            
            if (r1 u< 0x14)
                r3_16 = 0x9c
            
            r3_17 = *(r2_9 + r3_16)
            
            if (zx.d(*(arg1 + 0x260)) != 0)
                r3_17 += r2_9[0x28]
        
        if (r0_31 s< 1 || r3_17 s<= r0_31)
            ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_80, r0_29, 7)

int32_t r0_34 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_34 != 0)
    int32_t* r2_11 = *(r0_34 + 0xc)
    
    if (r2_11[0x22] == 1)
        int32_t r0_36 = *(arg1 + 0x25c)
        int32_t r3_20
        
        if (r0_36 s>= 1)
            int32_t r3_19 = 0x98
            
            if (r1 u< 0x14)
                r3_19 = 0x9c
            
            r3_20 = *(r2_11 + r3_19)
            
            if (zx.d(*(arg1 + 0x260)) != 0)
                r3_20 += r2_11[0x28]
        
        if (r0_36 s< 1 || r3_20 s<= r0_36)
            ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_80, r0_34, 7)

int32_t r0_39 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_39 != 0)
    int32_t* r2_13 = *(r0_39 + 0xc)
    
    if (r2_13[0x22] == 1)
        int32_t r0_41 = *(arg1 + 0x25c)
        int32_t r3_23
        
        if (r0_41 s>= 1)
            int32_t r3_22 = 0x98
            
            if (r1 u< 0x14)
                r3_22 = 0x9c
            
            r3_23 = *(r2_13 + r3_22)
            
            if (zx.d(*(arg1 + 0x260)) != 0)
                r3_23 += r2_13[0x28]
        
        if (r0_41 s< 1 || r3_23 s<= r0_41)
            ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_80, r0_39, 7)

ascension::CWorld::HandleQuery(r6)

if (var_30 s>= 1)
    void* __offset(CStateMachine, 0x27c) r1_19 = arg1 + 0x27c
    int32_t r3_25 = 0
    
    do
        r3_25 += 1
        
        if (*r1_19 s<= 0xffffffff)
            *r1_19 = 0
        
        r1_19 += 0x44
    while (r3_25 s< var_30)

*(arg1 + 0x26c) = var_30
int32_t i_2 = 0
int32_t r4_3 = 0
int32_t var_84 = r6
int32_t var_a0
void* const var_9c
uint32_t __n_3
void* __s_4
int32_t var_8c

if (zx.d(*(arg1 + 0x261)) == 0)
    void** i_1 = *(r6 + 0xa30)
    r4_3 = 0
    
    if (i_1 != *(r6 + 0xa34))
        r4_3 = 0
        
        do
            void* r10_1 = *i_1
            
            if (*(r10_1 + 0x10) != 0 && *(r10_1 + 0x14) != 0)
                int32_t* r1_20 = *(r10_1 + 0xc)
                
                if (r1_20[0x22] == 1)
                    int32_t r6_1 = *(arg1 + 0x25c)
                    CStateMachine& r0_48 = arg1
                    int32_t r2_17
                    
                    if (r6_1 s>= 1)
                        uint32_t r3_26 = zx.d(*(r0_48 + 0x260))
                        r0_48 = arg1
                        int32_t r2_16 = 0x98
                        
                        if (r1 u< 0x14)
                            r2_16 = 0x9c
                        
                        r2_17 = *(r1_20 + r2_16)
                        
                        if (r3_26 != 0)
                            r2_17 += r1_20[0x28]
                    
                    if (r6_1 s>= 1 && r2_17 s> r6_1)
                        r6 = var_84
                    else if (*(r0_48 + 0x258) == 0)
                        r6 = var_84
                        void* r4_4 = r0_48 + r4_3 * 0x44
                        void* __s_2 = r4_4 + 0x290
                        int32_t r1_25 = *(r4_4 + 0x2b0)
                        
                        if (*(r0_48 + 0x254) == 0)
                            uint32_t __n_1 = *(r4_4 + 0x28c)
                            var_8c = r1_25
                            __s_4 = __s_2
                            
                            if (r1_25 == 0xffffffff)
                                var_a0 = ascensionrules::CStateProcessAcquireHeroToTopOfDeck::SelectAcquireFromKingdom
                                var_9c = r10_1
                                __n_3 = __n_1
                                CGameStateOptions::AddSimpleUserOption(arg1.w, *(r10_1 + 8), 
                                    0xa020, "Acquire %s", var_a0)
                                __n_1 = __n_3
                                __s_2 = __s_4
                            
                            void* __s = __s_4
                            
                            if (memchr(__s_2, 1, __n_1) != 0 &&
                                    (var_8c == 0xffffffff || zx.d(*(r4_4 + var_8c + 0x290)) == 1))
                                var_a0 = ascensionrules::CStateProcessAcquireHeroToTopOfDeck::SelectAcquireFromKingdomToHand
                                var_9c = r10_1
                                CGameStateOptions::AddSimpleUserOption(arg1.w, *(r10_1 + 8), 
                                    0xa024, "Acquire %s to Hand", var_a0)
                                __s = __s_4
                            
                            if (memchr(__s, 2, 4) == 0 ||
                                    (var_8c != 0xffffffff && zx.d(*(r4_4 + var_8c + 0x290)) != 2))
                                r4_3 += 1
                            else
                                var_a0 = ascensionrules::CStateProcessAcquireHeroToTopOfDeck::SelectAcquireFromKingdomToTopOfDeck
                                var_9c = r10_1
                                CGameStateOptions::AddSimpleUserOption(arg1.w, *(r10_1 + 8), 
                                    0xa022, "Acquire %s to Top of Deck", var_a0)
                                r4_3 += 1
                        else if (*(r6 + 0x30) u> 7)
                            var_8c = r1_25
                            
                            if (r1_25 == 0xffffffff || zx.d(*(r4_4 + var_8c + 0x290)) == 2)
                                var_a0 = ascensionrules::CStateProcessAcquireHeroToTopOfDeck::SelectAcquireFromKingdom
                                var_9c = r10_1
                                __s_4 = __s_2
                                CGameStateOptions::AddSimpleUserOption(arg1.w, *(r10_1 + 8), 
                                    0xa022, "Acquire %s", var_a0)
                                __s_2 = __s_4
                            
                            if (memchr(__s_2, 1, 4) == 0 ||
                                    (var_8c != 0xffffffff && zx.d(*(r4_4 + var_8c + 0x290)) != 1))
                                r4_3 += 1
                            else
                                var_a0 = ascensionrules::CStateProcessAcquireHeroToTopOfDeck::SelectAcquireFromKingdomToHand
                                var_9c = r10_1
                                CGameStateOptions::AddSimpleUserOption(arg1.w, *(r10_1 + 8), 
                                    0xa024, "Acquire %s to Hand", var_a0)
                                r4_3 += 1
                        else
                            var_a0 = ascensionrules::CStateProcessAcquireHeroToTopOfDeck::SelectAcquireFromKingdom
                            var_9c = r10_1
                            CGameStateOptions::AddSimpleUserOption(arg1.w, *(r10_1 + 8), 0xa022, 
                                "Acquire %s", var_a0)
                            r4_3 += 1
                    else
                        var_a0 = ascensionrules::CStateProcessAcquireHeroToTopOfDeck::SelectAcquireFromKingdomToHand
                        var_9c = r10_1
                        CGameStateOptions::AddSimpleUserOption(r0_48.w, *(r10_1 + 8), 0xa024, 
                            "Acquire %s to Hand", var_a0)
                        r4_3 += 1
                        r6 = var_84
            
            i_1 = &i_1[1]
        while (i_1 != *(r6 + 0xa34))

do
    void* r0_107 = ascension::CWorld::GetCenterRowCard(r6)
    
    if (r0_107 != 0)
        int32_t* r1_41 = *(r0_107 + 0xc)
        
        if (r1_41[0x22] == 1)
            int32_t r6_2 = *(arg1 + 0x25c)
            int32_t r2_24
            
            if (r6_2 s>= 1)
                int32_t r2_23 = 0x98
                
                if (r1 u< 0x14)
                    r2_23 = 0x9c
                
                r2_24 = *(r1_41 + r2_23)
                
                if (zx.d(*(arg1 + 0x260)) != 0)
                    r2_24 += r1_41[0x28]
            
            if (r6_2 s>= 1 && r2_24 s> r6_2)
                r6 = var_84
            else if (*(arg1 + 0x258) == 0)
                r6 = var_84
                void* r4_5 = arg1 + r4_3 * 0x44
                void* __s_3 = r4_5 + 0x290
                uint32_t __n_2 = *(r4_5 + 0x28c)
                int32_t r1_33 = *(r4_5 + 0x2b0)
                
                if (*(arg1 + 0x254) == 0)
                    var_8c = r1_33
                    
                    if (r1_33 == 0xffffffff)
                        var_a0 = ascensionrules::CStateProcessAcquireHeroToTopOfDeck::SelectAcquireFromCenterRow
                        var_9c = r0_107
                        __n_3 = __n_2
                        CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_107 + 8), 0xa020, 
                            "Acquire %s", var_a0)
                        __n_2 = __n_3
                    
                    __s_4 = __s_3
                    void* __s_1 = __s_4
                    uint32_t __n = __n_2
                    
                    if (memchr(__s_3, 1, __n_2) != 0
                            && (var_8c == 0xffffffff || zx.d(*(r4_5 + var_8c + 0x290)) == 1))
                        var_a0 = ascensionrules::CStateProcessAcquireHeroToTopOfDeck::SelectAcquireFromCenterRowToHand
                        var_9c = r0_107
                        CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_107 + 8), 0xa024, 
                            "Acquire %s to Hand", var_a0)
                        __s_1 = __s_4
                        __n = __n_2
                    
                    if (memchr(__s_1, 2, __n) == 0
                            || (var_8c != 0xffffffff && zx.d(*(r4_5 + var_8c + 0x290)) != 2))
                        r4_3 += 1
                    else
                        var_a0 = ascensionrules::CStateProcessAcquireHeroToTopOfDeck::SelectAcquireFromCenterRowToTopOfDeck
                        var_9c = r0_107
                        CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_107 + 8), 0xa022, 
                            "Acquire %s to Top of Deck", var_a0)
                        r4_3 += 1
                else if (*(r6 + 0x30) u> 7)
                    var_8c = r1_33
                    
                    if (r1_33 == 0xffffffff || zx.d(*(r4_5 + var_8c + 0x290)) == 2)
                        var_a0 = ascensionrules::CStateProcessAcquireHeroToTopOfDeck::SelectAcquireFromCenterRow
                        var_9c = r0_107
                        __n_3 = __n_2
                        CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_107 + 8), 0xa022, 
                            "Acquire %s", var_a0)
                        __n_2 = __n_3
                    
                    if (memchr(__s_3, 1, __n_2) == 0
                            || (var_8c != 0xffffffff && zx.d(*(r4_5 + var_8c + 0x290)) != 1))
                        r4_3 += 1
                    else
                        var_a0 = ascensionrules::CStateProcessAcquireHeroToTopOfDeck::SelectAcquireFromCenterRowToHand
                        var_9c = r0_107
                        CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_107 + 8), 0xa024, 
                            "Acquire %s to Hand", var_a0)
                        r4_3 += 1
                else
                    var_a0 = ascensionrules::CStateProcessAcquireHeroToTopOfDeck::SelectAcquireFromCenterRow
                    var_9c = r0_107
                    CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_107 + 8), 0xa022, 
                        "Acquire %s", var_a0)
                    r4_3 += 1
            else
                var_a0 = ascensionrules::CStateProcessAcquireHeroToTopOfDeck::SelectAcquireFromCenterRowToHand
                var_9c = r0_107
                CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_107 + 8), 0xa024, 
                    "Acquire %s to Hand", var_a0)
                r4_3 += 1
                r6 = var_84
    
    i_2 += 1
while (i_2 u< 7)

if (zx.d(*(arg1 + 0x262)) != 0)
    var_9c = nullptr
    var_a0 = ascensionrules::CStateProcessAcquireHeroToTopOfDeck::SelectAddCardToDreamscape
    CGameStateOptions::AddSimpleUserOption(arg1.w, 0, 0xa0d1, "Add Card To Dreamscape", var_a0)

int32_t entry_r1

if (*(arg1 + 0x250) != 0)
    int32_t var_9c_1 = 0
    CGameStateOptions::AddSimpleUserOption(arg1.w, 0, 0xa000, "None", 0)
    
    if (*(arg1 + 0x258) != 0)
        (*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), "You May Acquire a Hero to your Hand")
    else if (*(arg1 + 0x254) == 0)
        int32_t r2_29 = *(arg1 + 0x24c)
        int32_t r7_20 = *(*arg1 + 0x34)
        
        if (zx.d(*(arg1 + 0x262)) == 0)
            r7_20(arg1, entry_r1, r2_29, "You May Acquire a Hero")
        else
            r7_20(arg1, entry_r1, r2_29, "You May Acquire a Hero or Add a Card")
    else
        (*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), 
            "You May Acquire a Hero to the Top of your Deck")
else if (*(arg1 + 0x258) != 0)
    (*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), "Acquire a Hero to your Hand", var_a0, 
        var_9c, __n_3, entry_r1, __s_4, var_8c, r1, var_84)
else if (*(arg1 + 0x254) == 0)
    int32_t r2_30 = *(arg1 + 0x24c)
    int32_t r7_21 = *(*arg1 + 0x34)
    
    if (zx.d(*(arg1 + 0x262)) == 0)
        r7_21(arg1, entry_r1, r2_30, "Acquire a Hero", var_a0, var_9c, __n_3, entry_r1, __s_4, 
            var_8c, r1, var_84)
    else
        r7_21(arg1, entry_r1, r2_30, "Acquire a Hero or Add a Card", var_a0, var_9c, __n_3, 
            entry_r1, __s_4, var_8c, r1, var_84)
else
    (*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), "Acquire a Hero to the Top of your Deck", 
        var_a0, var_9c, __n_3, entry_r1, __s_4, var_8c, r1, var_84)
ascension::CEvent::~CEvent()
int32_t r0_131 = *__stack_chk_guard

if (r0_131 == r0)
    return r0_131 - r0

__stack_chk_fail()
noreturn
