// 函数: _ZN14ascensionrules57CStateProcessAcquireOrDefeatTopOfCenterRowStackDeprecated15BuildOptionListER13CStateMachine
// 地址: 0x133338
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t r1 = *(arg1 + 0x254)
void* r0_1 = *(arg1 + 0x24c)
void* r2 = *(r1 + 0xc)
ascension::CEvent* r6 = *(r0_1 + 4)
int32_t r3_1 = *(r2 + 0x88) - 1
int32_t (* const var_c0)(CStateMachine&, CState*, int32_t, uint32_t*)
void* var_bc
void* __offset(vtable_for_ascension::CEventQueryCardAcquireAttributes, 0x8) var_80
int32_t entry_r1

if (r3_1 u> 5)
label_1336d0:
    int32_t r2_7 = *(r6 + 0xa6c)
    
    if (r2_7 != 0)
        ascension::CWorld::RemoveEventCardInPlay(r6, r2_7.b)
        *(arg1 + 0x254)
    
    ascension::CWorld::PutEventCardInPlay(r6)
    *(arg1 + 0x254)
    ascension::CWorld::PopRevealCard(r6)
    *(arg1 + 0x254) = 0
else
    switch (r3_1)
        case 0
        label_133530:
            int32_t var_7c_2 = 6
            int32_t var_78_2 = 0
            var_80 = _vtable_for_ascension::CEventQueryCardAcquireAttributes + 8
            void* var_34_2 = r0_1
            int32_t var_30_2 = 0
            void* __offset(CStateMachine, 0x260) var_2c_2 = arg1 + 0x260
            ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_80, r1, 8)
            ascension::CWorld::HandleQuery(r6)
            
            if (var_30_2 s>= 1)
                void* __offset(CStateMachine, 0x26c) r1_5 = arg1 + 0x26c
                int32_t r3_8 = 0
                
                do
                    r3_8 += 1
                    
                    if (*r1_5 s<= 0xffffffff)
                        *r1_5 = 0
                    
                    r1_5 += 0x44
                while (r3_8 s< var_30_2)
            
            int32_t r5_2 = *(arg1 + 0x2a0)
            uint32_t __n_2 = *(arg1 + 0x27c)
            *(arg1 + 0x25c) = var_30_2
            
            if (r5_2 == 0xffffffff)
                void* r0_22 = *(arg1 + 0x254)
                var_bc = r0_22
                var_c0 = ascensionrules::CStateProcessAcquireOrDefeatTopOfCenterRowStackDeprecated::SelectAcquireToDiscardPile
                CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_22 + 8), 0xa020, "Acquire %s", 
                    var_c0)
            
            if (memchr(arg1 + 0x280, 1, __n_2) != 0
                    && (r5_2 == 0xffffffff || zx.d(*(arg1 + r5_2 + 0x280)) == 1))
                void* r0_28 = *(arg1 + 0x254)
                var_bc = r0_28
                var_c0 = ascensionrules::CStateProcessAcquireOrDefeatTopOfCenterRowStackDeprecated::SelectAcquireToHand
                CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_28 + 8), 0xa024, 
                    "Acquire %s to Hand", var_c0)
            
            if (memchr(arg1 + 0x280, 2, __n_2) != 0
                    && (r5_2 == 0xffffffff || zx.d(*(arg1 + r5_2 + 0x280)) == 2))
                void* r0_34 = *(arg1 + 0x254)
                var_bc = r0_34
                var_c0 = ascensionrules::CStateProcessAcquireOrDefeatTopOfCenterRowStackDeprecated::SelectAcquireToTopOfDeck
                CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_34 + 8), 0xa022, 
                    "Acquire %s to Top of Deck", var_c0)
            
            (*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), "Acquire the Revealed Card", var_c0, 
                var_bc)
            ascension::CEvent::~CEvent()
        case 1
            int32_t var_7c_1 = 6
            int32_t var_78_1 = 0
            var_80 = _vtable_for_ascension::CEventQueryCardAcquireAttributes + 8
            void* var_34_1 = r0_1
            int32_t var_30_1 = 0
            void* __offset(CStateMachine, 0x260) var_2c_1 = arg1 + 0x260
            ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_80, r1, 8)
            ascension::CWorld::HandleQuery(r6)
            
            if (var_30_1 s>= 1)
                void* __offset(CStateMachine, 0x26c) r1_1 = arg1 + 0x26c
                int32_t r3_5 = 0
                
                do
                    r3_5 += 1
                    
                    if (*r1_1 s<= 0xffffffff)
                        *r1_1 = 0
                    
                    r1_1 += 0x44
                while (r3_5 s< var_30_1)
            
            int32_t r5_1 = *(arg1 + 0x2a0)
            uint32_t __n_1 = *(arg1 + 0x27c)
            *(arg1 + 0x25c) = var_30_1
            
            if (r5_1 == 0xffffffff)
                void* r0_6 = *(arg1 + 0x254)
                var_bc = r0_6
                var_c0 = ascensionrules::CStateProcessAcquireOrDefeatTopOfCenterRowStackDeprecated::SelectAcquireToDiscardPile
                CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_6 + 8), 0xa020, "Acquire %s", 
                    var_c0)
            
            if (memchr(arg1 + 0x280, 4, __n_1) != 0
                    && (r5_1 == 0xffffffff || zx.d(*(arg1 + r5_1 + 0x280)) == 4))
                void* r0_12 = *(arg1 + 0x254)
                var_bc = r0_12
                var_c0 = ascensionrules::CStateProcessAcquireOrDefeatTopOfCenterRowStackDeprecated::SelectAcquireIntoPlay
                CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_12 + 8), 0xa023, 
                    "Acquire %s into play", var_c0)
            
            (*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), "Acquire the Revealed Card", var_c0, 
                var_bc)
            ascension::CEvent::~CEvent()
        case 2
            int32_t (* const var_c0_1)(CStateMachine&, CState*, int32_t, uint32_t*)
            int32_t var_bc_1
            int16_t r0_17
            
            if (zx.d(*(r2 + 0xc5)) == 0)
                var_bc_1 = r1
                var_c0_1 = ascensionrules::CStateProcessAcquireOrDefeatTopOfCenterRowStackDeprecated::SelectDefeatToVoid
                r0_17 = -0x5fc0
            else
                var_bc_1 = r1
                var_c0_1 = ascensionrules::CStateProcessAcquireOrDefeatTopOfCenterRowStackDeprecated::SelectDefeatTrophy
                r0_17 = -0x5fbb
            
            CGameStateOptions::AddSimpleUserOption(arg1.w, *(r1 + 8), zx.d(r0_17), "Defeat %s", 
                var_c0_1)
            int32_t r1_14 = *(arg1 + 0x24c)
            int32_t var_7c_3 = 8
            int32_t var_78_3 = 0
            var_80 = _vtable_for_ascension::CEventQueryCardDefeatAttributes + 8
            int32_t var_34_3 = r1_14
            int32_t var_30_3 = 0
            void var_b4
            void* var_2c_3 = &var_b4
            ascension::CEventQueryCardDefeatAttributes::AddQueryCard(&var_80, *(arg1 + 0x254))
            ascension::CWorld::HandleQuery(r6)
            int32_t var_a8
            
            if (var_a8 s<= 0xffffffff)
                int32_t var_a8_1 = 0
            
            uint32_t __n
            void __s
            
            if (__n s>= 1 && memchr(&__s, 3, __n) != 0)
                int32_t r0_47 = *(arg1 + 0x254)
                var_bc_1 = r0_47
                var_c0_1 = ascensionrules::CStateProcessAcquireOrDefeatTopOfCenterRowStackDeprecated::SelectDefeatToDiscardPile
                CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_47 + 8), 0xa043, 
                    "Defeat %s to Discard Pile", var_c0_1)
            
            (*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), "Defeat the Revealed Monster", 
                var_c0_1, var_bc_1)
            ascension::CEvent::~CEvent()
        case 3, 4
            goto label_1336d0
        case 5
            if (*(r6 + 0x30) u< 0xd)
                goto label_1336d0
            
            goto label_133530
int32_t r0_51 = *__stack_chk_guard

if (r0_51 == r0)
    return r0_51 - r0

__stack_chk_fail()
noreturn
