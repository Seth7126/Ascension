// 函数: _ZN14ascensionrules34CStateProcessAcquireTopOfDreamDeck15BuildOptionListER13CStateMachine
// 地址: 0x14c748
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t r1 = *(arg1 + 0x250)
void* r0_1 = *(r1 + 0xc)
int32_t r2 = *(r0_1 + 0x88)
int32_t entry_r1

if (r2 == 9)
    int32_t (* const var_98_1)(CStateMachine&, CState*, int32_t, uint32_t*)
    int16_t r0_24
    
    if (zx.d(*(r0_1 + 0xd4)) == 0)
        int32_t var_94_2 = r1
        var_98_1 = ascensionrules::CStateProcessAcquireTopOfDreamDeck::SelectAcquireVision
        r0_24 = -0x5fd2
    else
        int32_t var_94_1 = r1
        var_98_1 = ascensionrules::CStateProcessAcquireTopOfDreamDeck::SelectAcquireOngoingVision
        r0_24 = -0x5fd1
    
    CGameStateOptions::AddSimpleUserOption(arg1.w, *(r1 + 8), zx.d(r0_24), "Acquire %s", var_98_1)
    (*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), "Acquire the Top Card from the Dream Deck")
else
    void* r0_2 = *(arg1 + 0x24c)
    ascension::CEvent* r7 = *(r0_2 + 4)
    void* var_94
    void* __offset(vtable_for_ascension::CEventQueryCardAcquireAttributes, 0x8) var_80
    
    if (r2 == 2)
        int32_t r2_4 = *(r0_2 + 0x8c)
        int32_t var_7c_2 = 6
        int32_t var_78_2 = 0
        var_80 = _vtable_for_ascension::CEventQueryCardAcquireAttributes + 8
        void* var_34_2 = r0_2
        int32_t var_30_2 = 0
        void* __offset(CStateMachine, 0x25c) var_2c_2 = arg1 + 0x25c
        ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_80, r1, 8)
        ascension::CWorld::HandleQuery(r7)
        
        if (var_30_2 s>= 1)
            void* __offset(CStateMachine, 0x268) r1_6 = arg1 + 0x268
            int32_t r3_6 = 0
            
            do
                r3_6 += 1
                
                if (*r1_6 s<= 0xffffffff)
                    *r1_6 = 0
                
                r1_6 += 0x44
            while (r3_6 s< var_30_2)
        
        int32_t r10_1 = *(arg1 + 0x29c)
        uint32_t __n_1 = *(arg1 + 0x278)
        *(arg1 + 0x258) = var_30_2
        
        if (r10_1 == 0xffffffff)
            void* r0_28 = *(arg1 + 0x250)
            var_94 = r0_28
            CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_28 + 8), 0xa020, "Acquire %s", 
                ascensionrules::CStateProcessAcquireTopOfDreamDeck::SelectAcquireToDiscardPile)
        
        if (*(r7 + 0x30) u>= 0x18)
            if (memchr(arg1 + 0x27c, 1, __n_1) != 0
                    && (r10_1 == 0xffffffff || zx.d(*(arg1 + r10_1 + 0x27c)) == 1))
                void* r0_35 = *(arg1 + 0x250)
                var_94 = r0_35
                CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_35 + 8), 0xa024, 
                    "Acquire %s to Hand", 
                    ascensionrules::CStateProcessAcquireTopOfDreamDeck::SelectAcquireToHand)
            
            if (memchr(arg1 + 0x27c, 2, __n_1) != 0
                    && (r10_1 == 0xffffffff || zx.d(*(arg1 + r10_1 + 0x27c)) == 2))
                void* r0_41 = *(arg1 + 0x250)
                var_94 = r0_41
                CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_41 + 8), 0xa022, 
                    "Acquire %s to Top of Deck", 
                    ascensionrules::CStateProcessAcquireTopOfDreamDeck::SelectAcquireToTopOfDeck)
        
        void var_88
        void* var_98_5 = &var_88
        char var_85
        int32_t var_84
        
        if (ascension::CEventQueryCardAcquireAttributes::AcquireCardEntry::FindAcquireLocation(
                (arg1 + 0x25c).b, 4, &var_84, &var_85) != 0 && (r10_1 == 0xffffffff || r10_1 == var_84)
                && r2_4 s>= zx.d(var_85))
            void* r0_47 = *(arg1 + 0x250)
            var_94 = r0_47
            var_98_5 = ascensionrules::CStateProcessAcquireTopOfDreamDeck::SelectAcquireIntoPlay
            CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_47 + 8), 0xa023, 
                "Acquire %s into play", var_98_5)
        
        (*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), 
            "Acquire the Top Card from the Dream Deck", var_98_5, var_94)
        ascension::CEvent::~CEvent()
    else if (r2 == 1)
        int32_t var_7c_1 = 6
        int32_t var_78_1 = 0
        var_80 = _vtable_for_ascension::CEventQueryCardAcquireAttributes + 8
        void* var_34_1 = r0_2
        int32_t var_30_1 = 0
        void* __offset(CStateMachine, 0x25c) var_2c_1 = arg1 + 0x25c
        ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_80, r1, 8)
        ascension::CWorld::HandleQuery(r7)
        
        if (var_30_1 s>= 1)
            void* __offset(CStateMachine, 0x268) r1_1 = arg1 + 0x268
            int32_t r3_3 = 0
            
            do
                r3_3 += 1
                
                if (*r1_1 s<= 0xffffffff)
                    *r1_1 = 0
                
                r1_1 += 0x44
            while (r3_3 s< var_30_1)
        
        int32_t r7_2 = *(arg1 + 0x29c)
        uint32_t __n = *(arg1 + 0x278)
        *(arg1 + 0x258) = var_30_1
        int32_t (* const var_98)(CStateMachine&, CState*, int32_t, uint32_t*)
        
        if (r7_2 == 0xffffffff)
            void* r0_7 = *(arg1 + 0x250)
            var_94 = r0_7
            var_98 = ascensionrules::CStateProcessAcquireTopOfDreamDeck::SelectAcquireToDiscardPile
            CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_7 + 8), 0xa020, "Acquire %s", 
                var_98)
        
        if (memchr(arg1 + 0x27c, 1, __n) != 0
                && (r7_2 == 0xffffffff || zx.d(*(arg1 + r7_2 + 0x27c)) == 1))
            void* r0_13 = *(arg1 + 0x250)
            var_94 = r0_13
            var_98 = ascensionrules::CStateProcessAcquireTopOfDreamDeck::SelectAcquireToHand
            CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_13 + 8), 0xa024, 
                "Acquire %s to Hand", var_98)
        
        if (memchr(arg1 + 0x27c, 2, __n) != 0
                && (r7_2 == 0xffffffff || zx.d(*(arg1 + r7_2 + 0x27c)) == 2))
            void* r0_19 = *(arg1 + 0x250)
            var_94 = r0_19
            var_98 = ascensionrules::CStateProcessAcquireTopOfDreamDeck::SelectAcquireToTopOfDeck
            CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_19 + 8), 0xa022, 
                "Acquire %s to Top of Deck", var_98)
        
        (*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), 
            "Acquire the Top Card from the Dream Deck", var_98, var_94)
        ascension::CEvent::~CEvent()
int32_t r0_54 = *__stack_chk_guard

if (r0_54 == r0)
    return r0_54 - r0

__stack_chk_fail()
noreturn
