// 函数: _ZN14ascensionrules47CStateProcessAcquireOrDefeatAllCardsInCenterRow27BuildAcquireOrDefeatOptionsER13CStateMachine
// 地址: 0x12df7c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* r0_1 = *(arg1 + 0x24c)
int32_t r9 = *(r0_1 + 4)
int32_t r6 = *(r0_1 + 0x8c)

if (zx.d(*(r9 + 0xb3d)) != 0)
    r6 += *(r9 + 0xb48)

int32_t var_80 = 6
int32_t var_7c = 0
void* __offset(vtable_for_ascension::CEventQueryCardAcquireAttributes, 0x8) var_84 =
    _vtable_for_ascension::CEventQueryCardAcquireAttributes + 8
void* var_38 = r0_1
int32_t var_34 = 0
void* __offset(CStateMachine, 0x260) var_30 = arg1 + 0x260
int32_t var_d8 = 8
int32_t var_d4 = 0
void* __offset(vtable_for_ascension::CEventQueryCardDefeatAttributes, 0x8) var_dc =
    _vtable_for_ascension::CEventQueryCardDefeatAttributes + 8
void* var_90 = r0_1
int32_t var_8c = 0
void* __offset(CStateMachine, 0x440) var_88 = arg1 + 0x440

if (zx.d(*(arg1 + 0x6a0)) == 0 && *(arg1 + 0x684) != 0)
    int32_t r0_113 = ascension::CWorld::GetCenterRowCard(r9)
    
    if (r0_113 == *(arg1 + 0x684))
        ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_84, r0_113, 7)
    else
        *(arg1 + 0x684) = 0

if (zx.d(*(arg1 + 0x6a1)) == 0 && *(arg1 + 0x688) != 0)
    int32_t r0_117 = ascension::CWorld::GetCenterRowCard(r9)
    
    if (r0_117 == *(arg1 + 0x688))
        ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_84, r0_117, 7)
    else
        *(arg1 + 0x688) = 0

if (zx.d(*(arg1 + 0x6a2)) == 0 && *(arg1 + 0x68c) != 0)
    int32_t r0_121 = ascension::CWorld::GetCenterRowCard(r9)
    
    if (r0_121 == *(arg1 + 0x68c))
        ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_84, r0_121, 7)
    else
        *(arg1 + 0x68c) = 0

if (zx.d(*(arg1 + 0x6a3)) == 0 && *(arg1 + 0x690) != 0)
    int32_t r0_125 = ascension::CWorld::GetCenterRowCard(r9)
    
    if (r0_125 == *(arg1 + 0x690))
        ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_84, r0_125, 7)
    else
        *(arg1 + 0x690) = 0

if (zx.d(*(arg1 + 0x6a4)) == 0 && *(arg1 + 0x694) != 0)
    int32_t r0_129 = ascension::CWorld::GetCenterRowCard(r9)
    
    if (r0_129 == *(arg1 + 0x694))
        ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_84, r0_129, 7)
    else
        *(arg1 + 0x694) = 0

if (zx.d(*(arg1 + 0x6a5)) == 0 && *(arg1 + 0x698) != 0)
    int32_t r0_133 = ascension::CWorld::GetCenterRowCard(r9)
    
    if (r0_133 == *(arg1 + 0x698))
        ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_84, r0_133, 7)
    else
        *(arg1 + 0x698) = 0

if (zx.d(*(arg1 + 0x6a6)) == 0 && *(arg1 + 0x69c) != 0)
    int32_t r0_137 = ascension::CWorld::GetCenterRowCard(r9)
    
    if (r0_137 == *(arg1 + 0x69c))
        ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_84, r0_137, 7)
    else
        *(arg1 + 0x69c) = 0

for (int32_t i = 0; i u< 7; i += 1)
    if (zx.d(*(arg1 + 0x6a8 + i + 0x1c)) == 0 && *(arg1 + 0x6a8 + (i << 2)) != 0)
        int32_t r0_14 = ascension::CWorld::GetCenterRowCard(r9)
        
        if (r0_14 != *(arg1 + 0x6a8 + (i << 2)))
            *(arg1 + 0x6a8 + (i << 2)) = 0
        else if (*(*(r0_14 + 0xc) + 0x88) == 3)
            ascension::CEventQueryCardDefeatAttributes::AddQueryCard(&var_dc, r0_14)

int32_t r0_19 = *(arg1 + 0x6cc)

if (r0_19 s>= 1)
    int32_t r4_1 = 0
    
    do
        if (zx.d(*(arg1 + 0x6e0 + r4_1)) == 0)
            void* r1_5 = arg1 + 0x6e0 + (r4_1 << 2)
            void* r2_4 = *(r1_5 - 0x10)
            
            if (r2_4 != 0)
                int32_t r2_5
                
                if (zx.d(*(*(*(r2_4 + 0x10) + 0xc) + 0xcb)) != 0)
                    r2_5 = *(r2_4 + 0x4c)
                
                if (zx.d(*(*(*(r2_4 + 0x10) + 0xc) + 0xcb)) == 0 || r2_5 - *(r2_4 + 0x48) != 4)
                    *(r1_5 - 0x10) = 0
                else
                    int32_t r1_6 = *(r2_5 - 4)
                    
                    if (*(*(r1_6 + 0xc) + 0x88) == 3)
                        ascension::CEventQueryCardDefeatAttributes::AddQueryCard(&var_dc, r1_6)
                        r0_19 = *(arg1 + 0x6cc)
        
        r4_1 += 1
    while (r4_1 s< r0_19)

ascension::CWorld::HandleQuery(r9)

if (var_34 s>= 1)
    void* __offset(CStateMachine, 0x26c) r1_7 = arg1 + 0x26c
    int32_t r3_6 = 0
    
    do
        r3_6 += 1
        
        if (*r1_7 s<= 0xffffffff)
            *r1_7 = 0
        
        r1_7 += 0x44
    while (r3_6 s< var_34)

*(arg1 + 0x25c) = var_34
ascension::CWorld::HandleQuery(r9)

if (var_8c s>= 1)
    void* __offset(CStateMachine, 0x44c) r1_8 = arg1 + 0x44c
    int32_t r3_7 = 0
    
    do
        r3_7 += 1
        
        if (*r1_8 s<= 0xffffffff)
            *r1_8 = 0
        
        r1_8 += 0x34
    while (r3_7 s< var_8c)

*(arg1 + 0x43c) = var_8c
int32_t var_f0 = 0
void* i_1 = nullptr
int32_t var_ec = 0
int32_t (* const var_108)(CStateMachine&, CState*, int32_t, uint32_t*)
void* i_4

do
    if (zx.d(*(arg1 + 0x6a0 + i_1)) == 0)
        void* r4_2 = arg1 + 0x6a0 + (i_1 << 2)
        
        if (*(r4_2 - 0x1c) != 0)
            void* i_5 = ascension::CWorld::GetCenterRowCard(r9)
            
            if (i_5 == *(r4_2 - 0x1c))
                int32_t r0_30 = *(*(i_5 + 0xc) + 0x88)
                
                if (r0_30 == 8)
                    var_108 = ascensionrules::CStateProcessAcquireOrDefeatAllCardsInCenterRow::SelectAcquirePortal
                    i_4 = i_5
                    CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_5 + 8), 0xa02d, 
                        "Acquire %s", var_108)
                    var_ec += 1
                    var_f0 = 1
                else if (r0_30 == 2)
                    void* r4_4 = arg1 + var_ec * 0x44
                    int32_t r8_2 = *(r4_4 + 0x2a0)
                    uint32_t __n_1 = *(r4_4 + 0x27c)
                    
                    if (r8_2 == 0xffffffff)
                        i_4 = i_1
                        CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_5 + 8), 0xa020, 
                            "Acquire %s", 
                            ascensionrules::CStateProcessAcquireOrDefeatAllCardsInCenterRow::SelectAcquireToDiscard)
                    
                    if (*(r9 + 0x30) u>= 0x18)
                        if (memchr(r4_4 + 0x280, 2, __n_1) != 0
                                && (r8_2 == 0xffffffff || zx.d(*(r4_4 + r8_2 + 0x280)) == 2))
                            i_4 = i_1
                            CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_5 + 8), 0xa022, 
                                "Acquire %s to Top of Deck", 
                                ascensionrules::CStateProcessAcquireOrDefeatAllCardsInCenterRow::SelectAcquireToTopOfDeck)
                        
                        if (memchr(r4_4 + 0x280, 1, __n_1) != 0
                                && (r8_2 == 0xffffffff || zx.d(*(r4_4 + r8_2 + 0x280)) == 1))
                            i_4 = i_1
                            CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_5 + 8), 0xa024, 
                                "Acquire %s to Hand", 
                                ascensionrules::CStateProcessAcquireOrDefeatAllCardsInCenterRow::SelectAcquireToHand)
                    
                    int32_t var_e4(CStateMachine&, CState*, int32_t, uint32_t*)
                    var_108 = &var_e4
                    var_ec += 1
                    var_f0 = 1
                    char var_e1
                    int32_t var_e0
                    
                    if (ascension::CEventQueryCardAcquireAttributes::AcquireCardEntry::FindAcquireLocation(
                            r4_4.b + 0x60, 4, &var_e0, &var_e1) != 0
                            && (r8_2 == 0xffffffff || r8_2 == var_e0) && r6 s>= zx.d(var_e1))
                        var_108 = ascensionrules::CStateProcessAcquireOrDefeatAllCardsInCenterRow::SelectAcquireIntoPlay
                        i_4 = i_5
                        CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_5 + 8), 0xa023, 
                            "Acquire %s into play", var_108)
                else if (r0_30 == 1)
                    void* r6_3 = arg1 + var_ec * 0x44
                    int32_t r4_3 = *(r6_3 + 0x2a0)
                    uint32_t __n = *(r6_3 + 0x27c)
                    
                    if (r4_3 == 0xffffffff)
                        var_108 = ascensionrules::CStateProcessAcquireOrDefeatAllCardsInCenterRow::SelectAcquireToDiscard
                        i_4 = i_1
                        CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_5 + 8), 0xa020, 
                            "Acquire %s", var_108)
                    
                    if (memchr(r6_3 + 0x280, 2, __n) != 0
                            && (r4_3 == 0xffffffff || zx.d(*(r6_3 + r4_3 + 0x280)) == 2))
                        var_108 = ascensionrules::CStateProcessAcquireOrDefeatAllCardsInCenterRow::SelectAcquireToTopOfDeck
                        i_4 = i_1
                        CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_5 + 8), 0xa022, 
                            "Acquire %s to Top of Deck", var_108)
                    
                    var_ec += 1
                    var_f0 = 1
                    
                    if (memchr(r6_3 + 0x280, 1, __n) != 0
                            && (r4_3 == 0xffffffff || zx.d(*(r6_3 + r4_3 + 0x280)) == 1))
                        var_108 = ascensionrules::CStateProcessAcquireOrDefeatAllCardsInCenterRow::SelectAcquireToHand
                        i_4 = i_1
                        CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_5 + 8), 0xa024, 
                            "Acquire %s to Hand", var_108)
            else
                *(r4_2 - 0x1c) = 0
    
    i_1 += 1
while (i_1 u< 7)

int32_t r9_1 = 0
int32_t i_2 = 0
int32_t r10_2 = 0

do
    if (zx.d(*(arg1 + i_2 + 0x6c4)) == 0 && *(arg1 + (i_2 << 2) + 0x6a8) != 0)
        void* i_6 = ascension::CWorld::GetCenterRowCard(r9)
        
        if (i_6 == *(arg1 + (i_2 << 2) + 0x6a8))
            void* r0_74 = *(i_6 + 0xc)
            
            if (*(r0_74 + 0x88) == 3)
                void* r9_2 = arg1 + r10_2 * 0x34
                r10_2 += 1
                uint32_t __n_2 = *(r9_2 + 0x458)
                
                if (zx.d(*(r0_74 + 0xc5)) == 0)
                    var_108 = ascensionrules::CStateProcessAcquireOrDefeatAllCardsInCenterRow::SelectDefeatFromCenterRow
                    i_4 = i_6
                    CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_6 + 8), 0xa040, "Defeat %s", 
                        var_108)
                    
                    if (*(*(arg1 + 0x24c) + 0xa8) s>= 1)
                        var_108 = ascensionrules::CStateProcessAcquireOrDefeatAllCardsInCenterRow::SelectDefeatFromCenterRowIntoPlay
                        i_4 = i_6
                        CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_6 + 8), 0xa047, 
                            "Defeat %s into Play", var_108)
                    
                    goto label_12e730
                
                if (zx.d(*(r0_74 + 0xc6)) == 0)
                label_12e69c:
                    var_108 = ascensionrules::CStateProcessAcquireOrDefeatAllCardsInCenterRow::SelectDefeatTrophyFromCenterRow
                    i_4 = i_6
                    CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_6 + 8), 0xa045, "Defeat %s", 
                        var_108)
                label_12e730:
                    r9_1 = 1
                    
                    if (memchr(r9_2 + 0x45c, 3, __n_2) != 0)
                        var_108 = ascensionrules::CStateProcessAcquireOrDefeatAllCardsInCenterRow::SelectDefeatFromCenterRowToDiscardPile
                        i_4 = i_6
                        CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_6 + 8), 0xa043, 
                            "Defeat %s to Discard Pile", var_108)
                else
                    void* r2_14 = *(arg1 + 0x24c)
                    int32_t* r1_25 = *(r2_14 + 0x60)
                    int32_t r2_15 = *(r2_14 + 0x64)
                    
                    if (r1_25 == r2_15)
                        goto label_12e69c
                    
                    int32_t r3_9 = 0
                    
                    do
                        void* r6_6 = *r1_25
                        r1_25 = &r1_25[1]
                        int32_t r6_8 = *(*(r6_6 + 0x10) + 0xc)
                        
                        if (r6_8 == r0_74)
                            goto label_12e5b8
                        
                        int32_t temp0_1 = 0
                        void* j = r6_8 - r0_74
                        
                        while (j != 0)
                            j u>>= 1
                            temp0_1 += 1
                        
                        r3_9 |= (0x20 - temp0_1) u>> 5
                    while (r2_15 != r1_25)
                    
                    if ((r3_9 & 1) == 0)
                        goto label_12e69c
        else
            *(arg1 + (i_2 << 2) + 0x6a8) = 0
    
label_12e5b8:
    i_2 += 1
while (i_2 u< 7)

if (*(arg1 + 0x6cc) s>= 1)
    int32_t i_3 = 0
    int32_t r7_3 = r10_2
    
    do
        if (zx.d(*(arg1 + i_3 + 0x6e0)) == 0)
            void* i_7 = *(arg1 + (i_3 << 2) + 0x6d0)
            
            if (i_7 != 0)
                void* r0_90 = *(*(*(i_7 + 0x4c) - 4) + 0xc)
                
                if (*(r0_90 + 0x88) == 3)
                    void* r6_12 = arg1 + r7_3 * 0x34
                    r7_3 += 1
                    uint32_t __n_3 = *(r6_12 + 0x458)
                    
                    if (zx.d(*(r0_90 + 0xc5)) == 0)
                        var_108 = ascensionrules::CStateProcessAcquireOrDefeatAllCardsInCenterRow::SelectDefeatFromConstruct
                        i_4 = i_7
                        CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_7 + 8), 0xa040, 
                            "Defeat %s", var_108)
                    label_12e8dc:
                        r9_1 = 1
                        
                        if (memchr(r6_12 + 0x45c, 3, __n_3) != 0)
                            var_108 = ascensionrules::CStateProcessAcquireOrDefeatAllCardsInCenterRow::SelectDefeatFromConstructToDiscardPile
                            i_4 = i_7
                            CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_7 + 8), 0xa043, 
                                "Defeat %s to Discard Pile", var_108)
                    else
                        if (zx.d(*(r0_90 + 0xc6)) == 0)
                        label_12e88c:
                            var_108 = ascensionrules::CStateProcessAcquireOrDefeatAllCardsInCenterRow::SelectDefeatTrophyFromConstruct
                            i_4 = i_7
                            CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_7 + 8), 0xa040, 
                                "Defeat %s", var_108)
                            goto label_12e8dc
                        
                        void* r1_33 = *(arg1 + 0x24c)
                        int32_t* r2_17 = *(r1_33 + 0x60)
                        int32_t r1_34 = *(r1_33 + 0x64)
                        
                        if (r2_17 == r1_34)
                            goto label_12e88c
                        
                        int32_t r3_10 = 0
                        
                        do
                            void* r7_4 = *r2_17
                            r2_17 = &r2_17[1]
                            int32_t r7_6 = *(*(r7_4 + 0x10) + 0xc)
                            
                            if (r7_6 == r0_90)
                                goto label_12e85c
                            
                            int32_t temp0_2 = 0
                            void* j_1 = r7_6 - r0_90
                            
                            while (j_1 != 0)
                                j_1 u>>= 1
                                temp0_2 += 1
                            
                            r3_10 |= (0x20 - temp0_2) u>> 5
                        while (r1_34 != r2_17)
                        
                        if ((r3_10 & 1) == 0)
                            goto label_12e88c
                        
                    label_12e85c:
                        var_108 = ascensionrules::CStateProcessAcquireOrDefeatAllCardsInCenterRow::SelectDefeatFromConstruct
                        i_4 = i_7
                        CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_7 + 8), 0xa040, 
                            "Defeat %s", var_108)
        
        i_3 += 1
    while (i_3 s< *(arg1 + 0x6cc))

if (zx.d(*(arg1 + 0x258)) != 0 && *(arg1 + 0x680) == 0)
    int32_t r2_19 = 0x3c
    int32_t* r0_99 = *(arg1 + 0x24c)
    
    if (*(r9 + 0x30) u> 0x1d)
        r2_19 = 0x38
    
    if (*(*(r0_99 + r2_19) + 0x18) + *(r0_99[0x10] + 0x18) s>= 1)
        i_4 = nullptr
        var_108 = ascensionrules::CStateProcessAcquireOrDefeatAllCardsInCenterRow::SelectDrawCard
        CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_99[0xe] + 8), 0xa035, "Draw Card", 
            var_108)

if (*(arg1 + 0x38) s<= 0)
    *(arg1 + 0x67c) = 1
else
    if (*(arg1 + 0x254) != 0 && *(arg1 + 0x680) s>= 1)
        i_4 = nullptr
        var_108 = ascensionrules::CStateProcessAcquireOrDefeatAllCardsInCenterRow::SelectDone
        CGameStateOptions::AddSimpleUserOption(arg1.w, 0, 0xa000, "Done", var_108)
    
    int32_t entry_r1
    
    if (zx.d(*(arg1 + 0x258)) != 0 && *(arg1 + 0x680) == 0)
        int32_t r2_24 = *(arg1 + 0x24c)
        int32_t r7_12 = *(*arg1 + 0x34)
        
        if ((var_f0 & 1) == 0)
            r7_12(arg1, entry_r1, r2_24, "You May Draw a Card", var_108, i_4)
        else
            r7_12(arg1, entry_r1, r2_24, "Acquire All Cards or Draw a Card", var_108, i_4)
    else if ((var_f0 & 1) != 0)
        int32_t r2_22 = *(arg1 + 0x24c)
        int32_t r7_10 = *(*arg1 + 0x34)
        
        if ((r9_1 & 1) == 0)
            r7_10(arg1, entry_r1, r2_22, "Acquire All Cards in Center Row", var_108, i_4)
        else
            r7_10(arg1, entry_r1, r2_22, "Acquire or Defeat All Cards in Center Row", var_108, i_4)
    else if ((r9_1 & 1) != 0)
        (*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), "Defeat All Monsters in Center Row", 
            var_108, i_4)

ascension::CEvent::~CEvent()
ascension::CEvent::~CEvent()
int32_t r0_153 = *__stack_chk_guard

if (r0_153 == r0)
    return r0_153 - r0

__stack_chk_fail()
noreturn
