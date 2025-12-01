// 函数: _ZN14ascensionrules35CStateProcessAcquireHeroOrConstruct10EnterStateER13CStateMachine
// 地址: 0x1212f8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t i_1 = 0
int32_t r0 = *__stack_chk_guard
void* r0_1 = *(arg1 + 0x24c)
int32_t r8 = *(r0_1 + 4)
int32_t r2 = *(r0_1 + 0x8c)
int32_t r1 = *(r8 + 0x30)

if (zx.d(*(r8 + 0xb3d)) != 0)
    r2 += *(r8 + 0xb48)

int32_t var_7c = 6
int32_t var_78 = 0
void* __offset(vtable_for_ascension::CEventQueryCardAcquireAttributes, 0x8) var_80 =
    _vtable_for_ascension::CEventQueryCardAcquireAttributes + 8
void* var_34 = r0_1
int32_t var_30 = 0
void* __offset(CStateMachine, 0x268) var_2c = arg1 + 0x268

if (zx.d(*(arg1 + 0x250)) == 0)
    for (void** i = *(r8 + 0xa30); i != *(r8 + 0xa34); i = &i[1])
        void* r0_5 = *i
        
        if (*(r0_5 + 0x10) != 0)
            int32_t r7_1 = *(r0_5 + 0x14)
            
            if (r7_1 != 0)
                int32_t* r10_1 = *(r0_5 + 0xc)
                int32_t r0_7 = r10_1[0x22]
                
                if (r0_7 == 1)
                    if (zx.d(*(arg1 + 0x253)) != 0)
                    label_1213fc:
                        int32_t r0_11
                        
                        if (*(arg1 + 0x258) != 0)
                            r0_11 = ascension::CCard::IsCardFaction(r10_1)
                        
                        if (*(arg1 + 0x258) == 0 || r0_11 != 0)
                            int32_t r0_12 = *(arg1 + 0x25c)
                            int32_t r1_8
                            
                            if (r0_12 s>= 0)
                                int32_t r1_7 = 0x98
                                
                                if (r1 u< 0x14)
                                    r1_7 = 0x9c
                                
                                r1_8 = *(r10_1 + r1_7)
                                
                                if (zx.d(*(arg1 + 0x260)) != 0)
                                    r1_8 += r10_1[0x28]
                            
                            if (r0_12 s< 0 || r1_8 s<= r0_12)
                                ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_80, 
                                    r7_1, 6)
                else if (r0_7 == 2 && zx.d(*(arg1 + 0x254)) != 0)
                    goto label_1213fc

do
    int32_t r0_15 = ascension::CWorld::GetCenterRowCard(r8)
    
    if (r0_15 != 0)
        int32_t* r0_16 = *(r0_15 + 0xc)
        
        if (zx.d(*(arg1 + 0x251)) == 0 || zx.d(*(r0_16 + 0xd2)) != 0)
            int32_t r1_13 = r0_16[0x22]
            
            if (r1_13 == 8)
                if (zx.d(*(arg1 + 0x255)) != 0)
                    int32_t r1_16 = *(arg1 + 0x25c)
                    
                    if (r1_16 s< 0 || *(r0_15 + 0x14) s<= r1_16)
                    label_121538:
                        int32_t r0_17
                        
                        if (*(arg1 + 0x258) != 0)
                            r0_17 = ascension::CCard::IsCardFaction(r0_16)
                        
                        if (*(arg1 + 0x258) == 0 || r0_17 != 0)
                            ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_80, 
                                r0_15, 7)
            else if (r1_13 == 2)
                if (zx.d(*(arg1 + 0x254)) != 0)
                label_1214f8:
                    int32_t r1_18 = *(arg1 + 0x25c)
                    
                    if (r1_18 s< 0)
                        goto label_121538
                    
                    int32_t r2_5 = 0x98
                    
                    if (r1 u< 0x14)
                        r2_5 = 0x9c
                    
                    int32_t r2_6 = *(r0_16 + r2_5)
                    
                    if (zx.d(*(arg1 + 0x260)) != 0)
                        r2_6 += r0_16[0x28]
                    
                    if (r2_6 s<= r1_18)
                        goto label_121538
            else if (r1_13 == 1 && zx.d(*(arg1 + 0x253)) != 0)
                goto label_1214f8
    
    i_1 += 1
while (i_1 u< 7)

ascension::CWorld::HandleQuery(r8)

if (var_30 s>= 1)
    void* __offset(CStateMachine, 0x274) r1_21 = arg1 + 0x274
    int32_t r3_5 = 0
    
    do
        r3_5 += 1
        
        if (*r1_21 s<= 0xffffffff)
            *r1_21 = 0
        
        r1_21 += 0x44
    while (r3_5 s< var_30)

*(arg1 + 0x264) = var_30
int32_t i_3 = 0
int32_t var_8c = 0

if (zx.d(*(arg1 + 0x250)) == 0)
    int32_t* i_2 = *(r8 + 0xa30)
    var_8c = 0
    
    if (i_2 != *(r8 + 0xa34))
        var_8c = 0
        
        do
            void* r6_1 = *i_2
            
            if (*(r6_1 + 0x10) != 0 && *(r6_1 + 0x14) != 0)
                int32_t* r4 = *(r6_1 + 0xc)
                int32_t r0_26 = r4[0x22]
                
                if (r0_26 == 1)
                    if (zx.d(*(arg1 + 0x253)) != 0)
                    label_12164c:
                        int32_t r0_30
                        
                        if (*(arg1 + 0x258) != 0)
                            r0_30 = ascension::CCard::IsCardFaction(r4)
                        
                        if (*(arg1 + 0x258) == 0 || r0_30 != 0)
                            int32_t r0_31 = *(arg1 + 0x25c)
                            int32_t r1_25
                            
                            if (r0_31 s>= 0)
                                int32_t r1_24 = 0x98
                                
                                if (r1 u< 0x14)
                                    r1_24 = 0x9c
                                
                                r1_25 = *(r4 + r1_24)
                                
                                if (zx.d(*(arg1 + 0x260)) != 0)
                                    r1_25 += r4[0x28]
                            
                            if (r0_31 s< 0 || r1_25 s<= r0_31)
                                int32_t r1_26 = var_8c * 0x11
                                var_8c += 1
                                void* r4_1 = arg1 + (r1_26 << 2)
                                uint32_t __n = *(r4_1 + 0x284)
                                
                                if (*(r8 + 0x30) u< 3)
                                    void* var_ac_2 = r6_1
                                    CGameStateOptions::AddSimpleUserOption(arg1.w, *(r6_1 + 8), 
                                        0xa020, "Acquire %s", 
                                        ascensionrules::CStateProcessAcquireHeroOrConstruct::SelectAcquireFromKingdom)
                                    
                                    if (*(r8 + 0x30) u>= 2)
                                        if (memchr(r4_1 + 0x288, 1, __n) != 0)
                                            void* var_ac_3 = r6_1
                                            CGameStateOptions::AddSimpleUserOption(arg1.w, 
                                                *(r6_1 + 8), 0xa024, "Acquire %s to Hand", 
                                                ascensionrules::CStateProcessAcquireHeroOrConstruct::SelectAcquireFromKingdomToHand)
                                        
                                        if (memchr(r4_1 + 0x288, 2, __n) != 0)
                                            void* var_ac_4 = r6_1
                                            CGameStateOptions::AddSimpleUserOption(arg1.w, 
                                                *(r6_1 + 8), 0xa022, "Acquire %s to Top of Deck", 
                                                ascensionrules::CStateProcessAcquireHeroOrConstruct::SelectAcquireFromKingdomToTopOfDeck)
                                else if (zx.d(*(arg1 + 0x252)) == 0)
                                    int32_t r0_43 = *(r4_1 + 0x2a8)
                                    
                                    if (r0_43 == 0xffffffff)
                                        void* var_ac_5 = r6_1
                                        CGameStateOptions::AddSimpleUserOption(arg1.w, *(r6_1 + 8), 
                                            0xa020, "Acquire %s", 
                                            ascensionrules::CStateProcessAcquireHeroOrConstruct::SelectAcquireFromKingdom)
                                    
                                    if (memchr(r4_1 + 0x288, 1, __n) != 0 && (r0_43 == 0xffffffff
                                            || zx.d(*(r4_1 + r0_43 + 0x288)) == 1))
                                        void* var_ac_6 = r6_1
                                        CGameStateOptions::AddSimpleUserOption(arg1.w, *(r6_1 + 8), 
                                            0xa024, "Acquire %s to Hand", 
                                            ascensionrules::CStateProcessAcquireHeroOrConstruct::SelectAcquireFromKingdomToHand)
                                    
                                    if (memchr(r4_1 + 0x288, 2, __n) != 0 && (r0_43 == 0xffffffff
                                            || zx.d(*(r4_1 + r0_43 + 0x288)) == 2))
                                        void* var_ac_7 = r6_1
                                        CGameStateOptions::AddSimpleUserOption(arg1.w, *(r6_1 + 8), 
                                            0xa022, "Acquire %s to Top of Deck", 
                                            ascensionrules::CStateProcessAcquireHeroOrConstruct::SelectAcquireFromKingdomToTopOfDeck)
                                else
                                    void* var_ac_1 = r6_1
                                    CGameStateOptions::AddSimpleUserOption(arg1.w, *(r6_1 + 8), 
                                        0xa024, "Acquire %s to Hand", 
                                        ascensionrules::CStateProcessAcquireHeroOrConstruct::SelectAcquireFromKingdomToHand)
                else if (r0_26 == 2 && zx.d(*(arg1 + 0x254)) != 0)
                    goto label_12164c
            
            i_2 = &i_2[1]
        while (i_2 != *(r8 + 0xa34))

int32_t var_94 = r8

do
    void* r0_59 = ascension::CWorld::GetCenterRowCard(r8)
    
    if (r0_59 != 0)
        int32_t* r4_2 = *(r0_59 + 0xc)
        
        if (zx.d(*(arg1 + 0x251)) == 0 || zx.d(*(r4_2 + 0xd2)) != 0)
            int32_t r0_62 = r4_2[0x22]
            
            if (r0_62 == 8)
                if (zx.d(*(arg1 + 0x255)) != 0)
                    int32_t r0_65 = *(arg1 + 0x25c)
                    
                    if (r0_65 s< 0 || *(r0_59 + 0x14) s<= r0_65)
                    label_121984:
                        int32_t r0_69
                        
                        if (*(arg1 + 0x258) != 0)
                            r0_69 = ascension::CCard::IsCardFaction(r4_2)
                        
                        if (*(arg1 + 0x258) == 0 || r0_69 != 0)
                            int32_t r1_40 = var_8c * 0x11
                            var_8c += 1
                            void* r1_41 = arg1 + (r1_40 << 2)
                            uint32_t __n_1 = *(r1_41 + 0x284)
                            int32_t r9_2 = *(r1_41 + 0x2a8)
                            
                            if (*(r8 + 0x30) u< 3)
                                int32_t i_5 = i_3
                                CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_59 + 8), 
                                    0xa020, "Acquire %s", 
                                    ascensionrules::CStateProcessAcquireHeroOrConstruct::SelectAcquireFromCenterRow)
                                r8 = var_94
                                
                                if (*(r8 + 0x30) u>= 2)
                                    if (memchr(r1_41 + 0x288, 1, __n_1) != 0 && (r9_2 == 0xffffffff
                                            || zx.d(*(r1_41 + r9_2 + 0x288)) == 1))
                                        int32_t i_6 = i_3
                                        CGameStateOptions::AddSimpleUserOption(arg1.w, 
                                            *(r0_59 + 8), 0xa024, "Acquire %s to Hand", 
                                            ascensionrules::CStateProcessAcquireHeroOrConstruct::SelectAcquireFromCenterRowToHand)
                                    
                                    if (memchr(r1_41 + 0x288, 2, __n_1) != 0 && (r9_2 == 0xffffffff
                                            || zx.d(*(r1_41 + r9_2 + 0x288)) == 2))
                                        int32_t i_7 = i_3
                                        CGameStateOptions::AddSimpleUserOption(arg1.w, 
                                            *(r0_59 + 8), 0xa022, "Acquire %s to Top of Deck", 
                                            ascensionrules::CStateProcessAcquireHeroOrConstruct::SelectAcquireFromCenterRowToTopOfDeck)
                                    
                                    if (memchr(r1_41 + 0x288, 4, __n_1) != 0 && (r9_2 == 0xffffffff
                                            || zx.d(*(r1_41 + r9_2 + 0x288)) == 4))
                                        int32_t i_8 = i_3
                                        CGameStateOptions::AddSimpleUserOption(arg1.w, 
                                            *(r0_59 + 8), 0xa023, "Acquire %s into play", 
                                            ascensionrules::CStateProcessAcquireHeroOrConstruct::SelectAcquireFromCenterRowIntoPlay)
                            else if (r4_2[0x22] == 8)
                                int32_t i_4 = i_3
                                CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_59 + 8), 
                                    0xa02d, "Acquire %s", 
                                    ascensionrules::CStateProcessAcquireHeroOrConstruct::SelectAcquirePortalFromCenterRow)
                                r8 = var_94
                            else if (zx.d(*(arg1 + 0x252)) == 0)
                                r8 = var_94
                                
                                if (r9_2 == 0xffffffff)
                                    int32_t i_10 = i_3
                                    CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_59 + 8), 
                                        0xa020, "Acquire %s", 
                                        ascensionrules::CStateProcessAcquireHeroOrConstruct::SelectAcquireFromCenterRow)
                                
                                if (memchr(r1_41 + 0x288, 1, __n_1) != 0 &&
                                        (r9_2 == 0xffffffff || zx.d(*(r1_41 + r9_2 + 0x288)) == 1))
                                    int32_t i_11 = i_3
                                    CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_59 + 8), 
                                        0xa024, "Acquire %s to Hand", 
                                        ascensionrules::CStateProcessAcquireHeroOrConstruct::SelectAcquireFromCenterRowToHand)
                                
                                if (memchr(r1_41 + 0x288, 2, __n_1) != 0 &&
                                        (r9_2 == 0xffffffff || zx.d(*(r1_41 + r9_2 + 0x288)) == 2))
                                    int32_t i_12 = i_3
                                    CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_59 + 8), 
                                        0xa022, "Acquire %s to Top of Deck", 
                                        ascensionrules::CStateProcessAcquireHeroOrConstruct::SelectAcquireFromCenterRowToTopOfDeck)
                                
                                void var_88
                                void* var_b0_17 = &var_88
                                char var_85
                                int32_t var_84
                                
                                if (ascension::CEventQueryCardAcquireAttributes::AcquireCardEntry::FindAcquireLocation(
                                        r1_41.b + 0x68, 4, &var_84, &var_85) != 0
                                        && (r9_2 == 0xffffffff || r9_2 == var_84)
                                        && r2 s>= zx.d(var_85))
                                    int32_t i_13 = i_3
                                    CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_59 + 8), 
                                        0xa023, "Acquire %s into play", 
                                        ascensionrules::CStateProcessAcquireHeroOrConstruct::SelectAcquireFromCenterRowIntoPlay)
                            else
                                int32_t i_9 = i_3
                                CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_59 + 8), 
                                    0xa024, "Acquire %s to Hand", 
                                    ascensionrules::CStateProcessAcquireHeroOrConstruct::SelectAcquireFromCenterRowToHand)
                                r8 = var_94
            else if (r0_62 == 2)
                if (zx.d(*(arg1 + 0x254)) != 0)
                label_121944:
                    int32_t r0_67 = *(arg1 + 0x25c)
                    
                    if (r0_67 s< 0)
                        goto label_121984
                    
                    int32_t r1_37 = 0x98
                    
                    if (r1 u< 0x14)
                        r1_37 = 0x9c
                    
                    int32_t r1_38 = *(r4_2 + r1_37)
                    
                    if (zx.d(*(arg1 + 0x260)) != 0)
                        r1_38 += r4_2[0x28]
                    
                    if (r1_38 s<= r0_67)
                        goto label_121984
            else if (r0_62 == 1 && zx.d(*(arg1 + 0x253)) != 0)
                goto label_121944
    
    i_3 += 1
while (i_3 u< 7)

int32_t var_ac_8 = 0
CGameStateOptions::AddSimpleUserOption(arg1.w, 0, 0xa000, "None", 0)
int32_t entry_r1

if (zx.d(*(arg1 + 0x253)) == 0)
    (*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), "You May Acquire a Construct")
else
    int32_t r2_25 = *(arg1 + 0x24c)
    int32_t r7_4 = *(*arg1 + 0x34)
    
    if (zx.d(*(arg1 + 0x254)) == 0)
        r7_4(arg1, entry_r1, r2_25, "You May Acquire a Hero")
    else
        r7_4(arg1, entry_r1, r2_25, "You May Acquire a Hero or Construct")
ascension::CEvent::~CEvent()
int32_t r0_121 = *__stack_chk_guard

if (r0_121 == r0)
    return r0_121 - r0

__stack_chk_fail()
noreturn
