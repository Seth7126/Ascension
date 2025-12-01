// 函数: _ZN14ascensionrules47CStateProcessAcquireOrDefeatTopOfCenterRowStack15BuildOptionListER13CStateMachine
// 地址: 0x1341dc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* r0_1 = *(arg1 + 0x24c)
ascension::CEvent* r6 = *(r0_1 + 4)
int32_t r7 = *(r0_1 + 0x8c)

if (zx.d(*(r6 + 0xb3d)) != 0)
    r7 += *(r6 + 0xb48)

int32_t r1_2 = *(arg1 + 0x258)

if (r1_2 != 0)
    void* r2_1 = *(r1_2 + 0xc)
    void* var_c4
    void* __offset(vtable_for_ascension::CEventQueryCardDefeatAttributes, 0x8) var_80
    int32_t entry_r1
    
    switch (*(r2_1 + 0x88) - 1)
        case 0, 5
            int32_t var_7c_1 = 6
            int32_t var_78_1 = 0
            var_80 = _vtable_for_ascension::CEventQueryCardAcquireAttributes + 8
            void* var_34_1 = r0_1
            int32_t var_30_1 = 0
            void* __offset(CStateMachine, 0x260) var_2c_1 = arg1 + 0x260
            ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_80, r1_2, 7)
            ascension::CWorld::HandleQuery(r6)
            
            if (var_30_1 s>= 1)
                void* __offset(CStateMachine, 0x26c) r1_3 = arg1 + 0x26c
                int32_t r3_6 = 0
                
                do
                    r3_6 += 1
                    
                    if (*r1_3 s<= 0xffffffff)
                        *r1_3 = 0
                    
                    r1_3 += 0x44
                while (r3_6 s< var_30_1)
            
            int32_t r5_1 = *(arg1 + 0x2a0)
            uint32_t __n_1 = *(arg1 + 0x27c)
            *(arg1 + 0x25c) = var_30_1
            int32_t (* const var_c8)(CStateMachine&, CState*, int32_t, uint32_t*)
            
            if (r5_1 == 0xffffffff)
                void* r0_6 = *(arg1 + 0x258)
                var_c4 = r0_6
                var_c8 = ascensionrules::CStateProcessAcquireOrDefeatTopOfCenterRowStack::SelectAcquireToDiscardPile
                CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_6 + 8), 0xa020, "Acquire %s", 
                    var_c8)
            
            if (memchr(arg1 + 0x280, 1, __n_1) != 0
                    && (r5_1 == 0xffffffff || zx.d(*(arg1 + r5_1 + 0x280)) == 1))
                void* r0_12 = *(arg1 + 0x258)
                var_c4 = r0_12
                var_c8 = ascensionrules::CStateProcessAcquireOrDefeatTopOfCenterRowStack::SelectAcquireToHand
                CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_12 + 8), 0xa024, 
                    "Acquire %s to Hand", var_c8)
            
            if (memchr(arg1 + 0x280, 2, __n_1) != 0
                    && (r5_1 == 0xffffffff || zx.d(*(arg1 + r5_1 + 0x280)) == 2))
                void* r0_18 = *(arg1 + 0x258)
                var_c4 = r0_18
                var_c8 = ascensionrules::CStateProcessAcquireOrDefeatTopOfCenterRowStack::SelectAcquireToTopOfDeck
                CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_18 + 8), 0xa022, 
                    "Acquire %s to Top of Deck", var_c8)
            
            char const* const r3_7 = "Acquire the Revealed Card"
            
            if (zx.d(*(arg1 + 0x254)) != 0)
                r3_7 = "Acquire the Rally Card"
            
            (*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), r3_7, var_c8, var_c4)
            ascension::CEvent::~CEvent()
        case 1
            int32_t var_7c_2 = 6
            int32_t var_78_2 = 0
            var_80 = _vtable_for_ascension::CEventQueryCardAcquireAttributes + 8
            void* var_34_2 = r0_1
            int32_t var_30_2 = 0
            void* __offset(CStateMachine, 0x260) var_2c_2 = arg1 + 0x260
            ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_80, r1_2, 7)
            ascension::CWorld::HandleQuery(r6)
            
            if (var_30_2 s>= 1)
                void* __offset(CStateMachine, 0x26c) r1_9 = arg1 + 0x26c
                int32_t r3_10 = 0
                
                do
                    r3_10 += 1
                    
                    if (*r1_9 s<= 0xffffffff)
                        *r1_9 = 0
                    
                    r1_9 += 0x44
                while (r3_10 s< var_30_2)
            
            int32_t r8_1 = *(arg1 + 0x2a0)
            uint32_t __n_2 = *(arg1 + 0x27c)
            *(arg1 + 0x25c) = var_30_2
            
            if (r8_1 == 0xffffffff)
                void* r0_25 = *(arg1 + 0x258)
                var_c4 = r0_25
                CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_25 + 8), 0xa020, "Acquire %s", 
                    ascensionrules::CStateProcessAcquireOrDefeatTopOfCenterRowStack::SelectAcquireToDiscardPile)
            
            if (*(r6 + 0x30) u>= 0x18)
                if (memchr(arg1 + 0x280, 1, __n_2) != 0
                        && (r8_1 == 0xffffffff || zx.d(*(arg1 + r8_1 + 0x280)) == 1))
                    void* r0_32 = *(arg1 + 0x258)
                    var_c4 = r0_32
                    CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_32 + 8), 0xa024, 
                        "Acquire %s to Hand", 
                        ascensionrules::CStateProcessAcquireOrDefeatTopOfCenterRowStack::SelectAcquireToHand)
                
                if (memchr(arg1 + 0x280, 2, __n_2) != 0
                        && (r8_1 == 0xffffffff || zx.d(*(arg1 + r8_1 + 0x280)) == 2))
                    void* r0_38 = *(arg1 + 0x258)
                    var_c4 = r0_38
                    CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_38 + 8), 0xa022, 
                        "Acquire %s to Top of Deck", 
                        ascensionrules::CStateProcessAcquireOrDefeatTopOfCenterRowStack::SelectAcquireToTopOfDeck)
            
            void var_bc
            void* var_c8_4 = &var_bc
            char var_b9
            int32_t var_b8
            
            if (ascension::CEventQueryCardAcquireAttributes::AcquireCardEntry::FindAcquireLocation(
                    (arg1 + 0x260).b, 4, &var_b8, &var_b9) != 0 && (r8_1 == 0xffffffff || r8_1 == var_b8)
                    && r7 s>= zx.d(var_b9))
                void* r0_44 = *(arg1 + 0x258)
                var_c4 = r0_44
                var_c8_4 = ascensionrules::CStateProcessAcquireOrDefeatTopOfCenterRowStack::SelectAcquireIntoPlay
                CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_44 + 8), 0xa023, 
                    "Acquire %s into play", var_c8_4)
            
            char const* const r3_12 = "Acquire the Revealed Card"
            
            if (zx.d(*(arg1 + 0x254)) != 0)
                r3_12 = "Acquire the Rally Card"
            
            (*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), r3_12, var_c8_4, var_c4, 
                arg1 + 0x260)
            ascension::CEvent::~CEvent()
        case 2
            uint16_t r7_5 = *(r1_2 + 8)
            int32_t var_c8_5
            int32_t var_c4_1
            
            if (zx.d(*(r2_1 + 0xc5)) == 0)
                var_c4_1 = r1_2
                var_c8_5 = ascensionrules::CStateProcessAcquireOrDefeatTopOfCenterRowStack::SelectDefeatToVoid
                CGameStateOptions::AddSimpleUserOption(arg1.w, r7_5, 0xa040, "Defeat %s", var_c8_5)
                
                if (*(*(arg1 + 0x24c) + 0xa8) s>= 1)
                    int32_t r0_59 = *(arg1 + 0x258)
                    var_c4_1 = r0_59
                    var_c8_5 = ascensionrules::CStateProcessAcquireOrDefeatTopOfCenterRowStack::SelectDefeatIntoPlay
                    CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_59 + 8), -0x5fb9, 
                        "Defeat %s into Play", var_c8_5)
            else
                var_c4_1 = r1_2
                var_c8_5 = ascensionrules::CStateProcessAcquireOrDefeatTopOfCenterRowStack::SelectDefeatTrophy
                CGameStateOptions::AddSimpleUserOption(arg1.w, r7_5, -0x5fbb, "Defeat %s", var_c8_5)
            
            int32_t r1_22 = *(arg1 + 0x24c)
            int32_t var_7c_3 = 8
            int32_t var_78_3 = 0
            var_80 = _vtable_for_ascension::CEventQueryCardDefeatAttributes + 8
            int32_t var_34_3 = r1_22
            int32_t var_30_3 = 0
            void var_b4
            void* var_2c_3 = &var_b4
            ascension::CEventQueryCardDefeatAttributes::AddQueryCard(&var_80, *(arg1 + 0x258))
            ascension::CWorld::HandleQuery(r6)
            int32_t var_a8
            
            if (var_a8 s<= 0xffffffff)
                int32_t var_a8_1 = 0
            
            uint32_t __n
            void __s
            
            if (__n s>= 1 && memchr(&__s, 3, __n) != 0)
                int32_t r0_66 = *(arg1 + 0x258)
                var_c4_1 = r0_66
                var_c8_5 = ascensionrules::CStateProcessAcquireOrDefeatTopOfCenterRowStack::SelectDefeatToDiscardPile
                CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_66 + 8), 0xa043, 
                    "Defeat %s to Discard Pile", var_c8_5)
            
            char const* const r3_14 = "Defeat the Revealed Monster"
            
            if (zx.d(*(arg1 + 0x254)) != 0)
                r3_14 = "Defeat the Rally Monster"
            
            (*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), r3_14, var_c8_5, var_c4_1)
            ascension::CEvent::~CEvent()
        case 7
            ascension::CWorld::AssignPortalCard(r6)
            void* r0_52 = *(arg1 + 0x258)
            void* var_c4_2 = r0_52
            CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_52 + 8), 0xa02d, "Acquire %s", 
                ascensionrules::CStateProcessAcquireOrDefeatTopOfCenterRowStack::SelectAcquirePortal)
            (*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), "Acquire the Revealed Card")
        default
            int32_t r2_9 = *(r6 + 0xa6c)
            
            if (r2_9 != 0)
                ascension::CWorld::RemoveEventCardInPlay(r6, r2_9.b)
                *(arg1 + 0x258)
            
            ascension::CWorld::PutEventCardInPlay(r6)
            *(arg1 + 0x258) = 0

int32_t r0_69 = *__stack_chk_guard

if (r0_69 == r0)
    return r0_69 - r0

__stack_chk_fail()
noreturn
