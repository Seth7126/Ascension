// 函数: _ZN14ascensionrules26CStateProcessAcquirePortal15BuildOptionListER13CStateMachine
// 地址: 0x160520
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t r1 = *(arg1 + 0x260)
void* r0_1 = *(arg1 + 0x24c)
ascension::CEvent* r8 = *(r0_1 + 4)
int32_t r2_1 = *(*(r1 + 0xc) + 0x88)
void* var_94
void* __offset(vtable_for_ascension::CEventQueryCardAcquireAttributes, 0x8) var_80
int32_t entry_r1

if (r2_1 == 6)
label_160574:
    int32_t var_7c_1 = 6
    int32_t var_78_1 = 0
    var_80 = _vtable_for_ascension::CEventQueryCardAcquireAttributes + 8
    void* var_34_1 = r0_1
    int32_t var_30_1 = 0
    void* __offset(CStateMachine, 0x26c) var_2c_1 = arg1 + 0x26c
    ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_80, r1, *(arg1 + 0x254))
    ascension::CWorld::HandleQuery(r8)
    
    if (var_30_1 s>= 1)
        void* __offset(CStateMachine, 0x278) r1_1 = arg1 + 0x278
        int32_t r3_3 = 0
        
        do
            r3_3 += 1
            
            if (*r1_1 s<= 0xffffffff)
                *r1_1 = 0
            
            r1_1 += 0x44
        while (r3_3 s< var_30_1)
    
    int32_t r9_1 = *(arg1 + 0x2ac)
    uint32_t __n = *(arg1 + 0x288)
    *(arg1 + 0x268) = var_30_1
    int32_t (* const var_98)(CStateMachine&, CState*, int32_t, uint32_t*)
    int32_t r0_6
    
    if (r9_1 != 0xffffffff)
        r0_6 = *(arg1 + 0x25c)
    else
        r0_6 = *(arg1 + 0x25c)
        
        if (r0_6 == 3)
            void* r0_7 = *(arg1 + 0x260)
            var_94 = r0_7
            var_98 = ascensionrules::CStateProcessAcquirePortal::SelectAcquireToDiscardPile
            CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_7 + 8), 0xa020, "Acquire %s", 
                var_98)
            r0_6 = *(arg1 + 0x25c)
    
    void* r0_10
    
    if (r0_6 != 1)
        r0_10 = memchr(arg1 + 0x28c, 1, __n)
    
    if ((r0_6 == 1 || r0_10 != 0) && (r9_1 == 0xffffffff || zx.d(*(arg1 + r9_1 + 0x28c)) == 1))
        void* r0_13 = *(arg1 + 0x260)
        var_94 = r0_13
        var_98 = ascensionrules::CStateProcessAcquirePortal::SelectAcquireToHand
        CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_13 + 8), 0xa024, "Acquire %s to Hand", 
            var_98)
    
    if (memchr(arg1 + 0x28c, 2, __n) != 0
            && (r9_1 == 0xffffffff || zx.d(*(arg1 + r9_1 + 0x28c)) == 2))
        void* r0_19 = *(arg1 + 0x260)
        var_94 = r0_19
        var_98 = ascensionrules::CStateProcessAcquirePortal::SelectAcquireToTopOfDeck
        CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_19 + 8), 0xa022, 
            "Acquire %s to Top of Deck", var_98)
    
    if (*(r8 + 0x30) u<= 0x12)
        void* r0_22 = *(arg1 + 0x260)
        var_94 = r0_22
        var_98 = ascensionrules::CStateProcessAcquirePortal::SelectAcquireToDiscardPile
        CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_22 + 8), 0xa021, 
            "Acquire %s to Discard", var_98)
    
    (*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), "Acquire the Revealed Hero", var_98, var_94)
    ascension::CEvent::~CEvent()
else if (r2_1 == 2)
    int32_t r2_6 = *(r0_1 + 0x8c)
    int32_t var_7c_2 = 6
    int32_t var_78_2 = 0
    var_80 = _vtable_for_ascension::CEventQueryCardAcquireAttributes + 8
    void* var_34_2 = r0_1
    int32_t var_30_2 = 0
    void* __offset(CStateMachine, 0x26c) var_2c_2 = arg1 + 0x26c
    ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_80, r1, *(arg1 + 0x254))
    ascension::CWorld::HandleQuery(r8)
    
    if (var_30_2 s>= 1)
        void* __offset(CStateMachine, 0x278) r1_7 = arg1 + 0x278
        int32_t r3_6 = 0
        
        do
            r3_6 += 1
            
            if (*r1_7 s<= 0xffffffff)
                *r1_7 = 0
            
            r1_7 += 0x44
        while (r3_6 s< var_30_2)
    
    int32_t r10_1 = *(arg1 + 0x2ac)
    uint32_t __n_1 = *(arg1 + 0x288)
    *(arg1 + 0x268) = var_30_2
    
    if (r10_1 == 0xffffffff && *(arg1 + 0x25c) == 3)
        void* r0_54 = *(arg1 + 0x260)
        var_94 = r0_54
        CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_54 + 8), 0xa020, "Acquire %s", 
            ascensionrules::CStateProcessAcquirePortal::SelectAcquireToDiscardPile)
    
    if (*(r8 + 0x30) u>= 0x18)
        void* r0_33
        
        if (*(arg1 + 0x25c) != 1)
            r0_33 = memchr(arg1 + 0x28c, 1, __n_1)
        
        if ((*(arg1 + 0x25c) == 1 || r0_33 != 0)
                && (r10_1 == 0xffffffff || zx.d(*(arg1 + r10_1 + 0x28c)) == 1))
            void* r0_36 = *(arg1 + 0x260)
            var_94 = r0_36
            CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_36 + 8), 0xa024, 
                "Acquire %s to Hand", 
                ascensionrules::CStateProcessAcquirePortal::SelectAcquireToHand)
        
        if (memchr(arg1 + 0x28c, 2, __n_1) != 0
                && (r10_1 == 0xffffffff || zx.d(*(arg1 + r10_1 + 0x28c)) == 2))
            void* r0_42 = *(arg1 + 0x260)
            var_94 = r0_42
            CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_42 + 8), 0xa022, 
                "Acquire %s to Top of Deck", 
                ascensionrules::CStateProcessAcquirePortal::SelectAcquireToTopOfDeck)
    
    void var_88
    void* var_98_3 = &var_88
    char var_85
    int32_t var_84
    
    if (ascension::CEventQueryCardAcquireAttributes::AcquireCardEntry::FindAcquireLocation(
            (arg1 + 0x26c).b, 4, &var_84, &var_85) != 0 && (r10_1 == 0xffffffff || r10_1 == var_84)
            && r2_6 s>= zx.d(var_85))
        void* r0_48 = *(arg1 + 0x260)
        var_94 = r0_48
        var_98_3 = ascensionrules::CStateProcessAcquirePortal::SelectAcquireIntoPlay
        CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_48 + 8), 0xa023, 
            "Acquire %s into play", var_98_3)
    
    (*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), "Acquire the Revealed Construct", var_98_3, 
        var_94, r2_6, entry_r1)
    ascension::CEvent::~CEvent()
else if (r2_1 == 1)
    goto label_160574
int32_t r0_52 = *__stack_chk_guard

if (r0_52 == r0)
    return r0_52 - r0

__stack_chk_fail()
noreturn
