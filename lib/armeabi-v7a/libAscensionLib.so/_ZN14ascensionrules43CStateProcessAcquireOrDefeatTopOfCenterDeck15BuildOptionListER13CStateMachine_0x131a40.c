// 函数: _ZN14ascensionrules43CStateProcessAcquireOrDefeatTopOfCenterDeck15BuildOptionListER13CStateMachine
// 地址: 0x131a40
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* r0_1 = *(arg1 + 0x24c)
ascension::CEvent* r8 = *(r0_1 + 4)
int32_t r7 = *(r0_1 + 0x8c)

if (zx.d(*(r8 + 0xb3d)) != 0)
    r7 += *(r8 + 0xb48)

int32_t r1_2 = *(arg1 + 0x254)
void* r3 = *(r1_2 + 0xc)
int32_t r2 = *(r3 + 0x88)
int32_t (* const var_c8_1)(CStateMachine&, CState*, int32_t, uint32_t*)
void* var_c4
void* __offset(vtable_for_ascension::CEventQueryCardDefeatAttributes, 0x8) var_80
int32_t entry_r1

if (r2 - 1 u<= 7)
    switch (r2)
        case 1, 6
            if ((r2 != 1 || zx.d(*(arg1 + 0x250)) == 0) && (r2 != 6 || zx.d(*(arg1 + 0x252)) == 0))
                int32_t var_7c_1 = 6
                int32_t var_78_1 = 0
                var_80 = _vtable_for_ascension::CEventQueryCardAcquireAttributes + 8
                void* var_34_1 = r0_1
                int32_t var_30_1 = 0
                void* __offset(CStateMachine, 0x260) var_2c_1 = arg1 + 0x260
                ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_80, r1_2, 8)
                ascension::CWorld::HandleQuery(r8)
                
                if (var_30_1 s>= 1)
                    void* __offset(CStateMachine, 0x26c) r1_3 = arg1 + 0x26c
                    int32_t r3_4 = 0
                    
                    do
                        r3_4 += 1
                        
                        if (*r1_3 s<= 0xffffffff)
                            *r1_3 = 0
                        
                        r1_3 += 0x44
                    while (r3_4 s< var_30_1)
                
                int32_t r10_1 = *(arg1 + 0x2a0)
                uint32_t __n_1 = *(arg1 + 0x27c)
                *(arg1 + 0x25c) = var_30_1
                int32_t (* const var_c8)(CStateMachine&, CState*, int32_t, uint32_t*)
                
                if (r10_1 == 0xffffffff)
                    void* r0_6 = *(arg1 + 0x254)
                    var_c4 = r0_6
                    var_c8 = ascensionrules::CStateProcessAcquireOrDefeatTopOfCenterDeck::SelectAcquireToDiscardPile
                    CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_6 + 8), 0xa020, 
                        "Acquire %s", var_c8)
                
                if (memchr(arg1 + 0x280, 1, __n_1) != 0
                        && (r10_1 == 0xffffffff || zx.d(*(arg1 + r10_1 + 0x280)) == 1))
                    void* r0_12 = *(arg1 + 0x254)
                    var_c4 = r0_12
                    var_c8 = ascensionrules::CStateProcessAcquireOrDefeatTopOfCenterDeck::SelectAcquireToHand
                    CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_12 + 8), 0xa024, 
                        "Acquire %s to Hand", var_c8)
                
                if (memchr(arg1 + 0x280, 2, __n_1) != 0
                        && (r10_1 == 0xffffffff || zx.d(*(arg1 + r10_1 + 0x280)) == 2))
                    void* r0_18 = *(arg1 + 0x254)
                    var_c4 = r0_18
                    var_c8 = ascensionrules::CStateProcessAcquireOrDefeatTopOfCenterDeck::SelectAcquireToTopOfDeck
                    CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_18 + 8), 0xa022, 
                        "Acquire %s to Top of Deck", var_c8)
                
                if (*(r8 + 0x30) u<= 0x12)
                    void* r0_21 = *(arg1 + 0x254)
                    var_c4 = r0_21
                    var_c8 = ascensionrules::CStateProcessAcquireOrDefeatTopOfCenterDeck::SelectAcquireToDiscardPile
                    CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_21 + 8), 0xa021, 
                        "Acquire %s to Discard", var_c8)
                
                (*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), 
                    "Acquire the Top Card from the Portal Deck", var_c8, var_c4)
                ascension::CEvent::~CEvent()
            else
            label_131cec:
                var_c8_1 =
                    ascensionrules::CStateProcessAcquireOrDefeatTopOfCenterDeck::SelectAcquireToHand
                CGameStateOptions::AddSimpleUserOption(arg1.w, *(r1_2 + 8), 0xa024, 
                    "Acquire %s to Hand", var_c8_1)
                (*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), 
                    "Draw the Top Card from the Portal Deck", var_c8_1, r1_2)
        case 2
            if (zx.d(*(arg1 + 0x251)) != 0)
                goto label_131cec
            
            int32_t var_7c_2 = 6
            int32_t var_78_2 = 0
            var_80 = _vtable_for_ascension::CEventQueryCardAcquireAttributes + 8
            void* var_34_2 = r0_1
            int32_t var_30_2 = 0
            void* __offset(CStateMachine, 0x260) var_2c_2 = arg1 + 0x260
            ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_80, r1_2, 8)
            ascension::CWorld::HandleQuery(r8)
            
            if (var_30_2 s>= 1)
                void* __offset(CStateMachine, 0x26c) r1_12 = arg1 + 0x26c
                int32_t r3_8 = 0
                
                do
                    r3_8 += 1
                    
                    if (*r1_12 s<= 0xffffffff)
                        *r1_12 = 0
                    
                    r1_12 += 0x44
                while (r3_8 s< var_30_2)
            
            int32_t r4_3 = *(arg1 + 0x2a0)
            uint32_t __n_2 = *(arg1 + 0x27c)
            *(arg1 + 0x25c) = var_30_2
            
            if (r4_3 == 0xffffffff)
                void* r0_35 = *(arg1 + 0x254)
                var_c4 = r0_35
                CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_35 + 8), 0xa020, "Acquire %s", 
                    ascensionrules::CStateProcessAcquireOrDefeatTopOfCenterDeck::SelectAcquireToDiscardPile)
            
            if (*(r8 + 0x30) u>= 0x18)
                if (memchr(arg1 + 0x280, 1, __n_2) != 0
                        && (r4_3 == 0xffffffff || zx.d(*(arg1 + r4_3 + 0x280)) == 1))
                    void* r0_42 = *(arg1 + 0x254)
                    var_c4 = r0_42
                    CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_42 + 8), 0xa024, 
                        "Acquire %s to Hand", 
                        ascensionrules::CStateProcessAcquireOrDefeatTopOfCenterDeck::SelectAcquireToHand)
                
                if (memchr(arg1 + 0x280, 2, __n_2) != 0
                        && (r4_3 == 0xffffffff || zx.d(*(arg1 + r4_3 + 0x280)) == 2))
                    void* r0_48 = *(arg1 + 0x254)
                    var_c4 = r0_48
                    CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_48 + 8), 0xa022, 
                        "Acquire %s to Top of Deck", 
                        ascensionrules::CStateProcessAcquireOrDefeatTopOfCenterDeck::SelectAcquireToTopOfDeck)
            
            void var_bc
            void* var_c8_6 = &var_bc
            char var_b9
            int32_t var_b8
            
            if (ascension::CEventQueryCardAcquireAttributes::AcquireCardEntry::FindAcquireLocation(
                    (arg1 + 0x260).b, 4, &var_b8, &var_b9) != 0 && (r4_3 == 0xffffffff || r4_3 == var_b8)
                    && r7 s>= zx.d(var_b9))
                void* r0_54 = *(arg1 + 0x254)
                var_c4 = r0_54
                var_c8_6 = ascensionrules::CStateProcessAcquireOrDefeatTopOfCenterDeck::SelectAcquireIntoPlay
                CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_54 + 8), 0xa023, 
                    "Acquire %s into play", var_c8_6)
            
            (*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), 
                "Acquire the Top Card from the Portal Deck", var_c8_6, var_c4, entry_r1)
            ascension::CEvent::~CEvent()
        case 3
            int32_t (* const var_c8_2)(CStateMachine&, CState*, int32_t, uint32_t*)
            int32_t var_c4_2
            int16_t r0_28
            
            if (zx.d(*(r3 + 0xc5)) == 0)
                var_c4_2 = r1_2
                var_c8_2 =
                    ascensionrules::CStateProcessAcquireOrDefeatTopOfCenterDeck::SelectDefeatToVoid
                r0_28 = -0x5fc0
            else
                var_c4_2 = r1_2
                var_c8_2 =
                    ascensionrules::CStateProcessAcquireOrDefeatTopOfCenterDeck::SelectDefeatTrophy
                r0_28 = -0x5fbb
            
            CGameStateOptions::AddSimpleUserOption(arg1.w, *(r1_2 + 8), zx.d(r0_28), "Defeat %s", 
                var_c8_2)
            int32_t r1_19 = *(arg1 + 0x24c)
            int32_t var_7c_3 = 8
            int32_t var_78_3 = 0
            var_80 = _vtable_for_ascension::CEventQueryCardDefeatAttributes + 8
            int32_t var_34_3 = r1_19
            int32_t var_30_3 = 0
            void var_b4
            void* var_2c_3 = &var_b4
            ascension::CEventQueryCardDefeatAttributes::AddQueryCard(&var_80, *(arg1 + 0x254))
            ascension::CWorld::HandleQuery(r8)
            int32_t var_a8
            
            if (var_a8 s<= 0xffffffff)
                int32_t var_a8_1 = 0
            
            uint32_t __n
            void __s
            
            if (memchr(&__s, 3, __n) != 0)
                int32_t r0_64 = *(arg1 + 0x254)
                var_c4_2 = r0_64
                var_c8_2 = ascensionrules::CStateProcessAcquireOrDefeatTopOfCenterDeck::SelectDefeatToDiscardPile
                CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_64 + 8), 0xa043, 
                    "Defeat %s to Discard Pile", var_c8_2)
            
            (*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), 
                "Defeat the Top Card from the Portal Deck", var_c8_2, var_c4_2)
            ascension::CEvent::~CEvent()
        case 8
            var_c8_1 =
                ascensionrules::CStateProcessAcquireOrDefeatTopOfCenterDeck::SelectAcquirePortal
            CGameStateOptions::AddSimpleUserOption(arg1.w, *(r1_2 + 8), 0xa02d, "Acquire %s", 
                var_c8_1)
            (*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), 
                "Acquire the Top Card from the Portal Deck", var_c8_1, r1_2)
int32_t r0_68 = *__stack_chk_guard

if (r0_68 == r0)
    return r0_68 - r0

__stack_chk_fail()
noreturn
