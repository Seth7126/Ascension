// 函数: _ZN14ascensionrules32CStateProcessAcquireChampionHero15BuildOptionListER13CStateMachine
// 地址: 0x135bcc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t r1 = *(arg1 + 0x258)
void* r0_1 = *(arg1 + 0x24c)
ascension::CEvent* r6 = *(r0_1 + 4)
int32_t r2_1 = *(*(r1 + 0xc) + 0x88)

if (r2_1 == 6 || r2_1 == 1)
    int32_t var_7c_1 = 6
    int32_t var_78_1 = 0
    void* __offset(vtable_for_ascension::CEventQueryCardAcquireAttributes, 0x8) var_80 =
        _vtable_for_ascension::CEventQueryCardAcquireAttributes + 8
    void* var_34_1 = r0_1
    int32_t var_30_1 = 0
    void* __offset(CStateMachine, 0x264) var_2c_1 = arg1 + 0x264
    ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_80, r1, 8)
    ascension::CWorld::HandleQuery(r6)
    
    if (var_30_1 s>= 1)
        void* __offset(CStateMachine, 0x270) r1_1 = arg1 + 0x270
        int32_t r3_3 = 0
        
        do
            r3_3 += 1
            
            if (*r1_1 s<= 0xffffffff)
                *r1_1 = 0
            
            r1_1 += 0x44
        while (r3_3 s< var_30_1)
    
    int32_t r10_1 = *(arg1 + 0x2a4)
    uint32_t __n = *(arg1 + 0x280)
    *(arg1 + 0x260) = var_30_1
    int32_t (* const var_88)(CStateMachine&, CState*, int32_t, uint32_t*)
    void* var_84
    
    if (r10_1 == 0xffffffff)
        void* r0_6 = *(arg1 + 0x258)
        var_84 = r0_6
        var_88 = ascensionrules::CStateProcessAcquireChampionHero::SelectAcquireToDiscardPile
        CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_6 + 8), 0xa020, "Acquire %s", var_88)
    
    if (memchr(arg1 + 0x284, 1, __n) != 0
            && (r10_1 == 0xffffffff || zx.d(*(arg1 + r10_1 + 0x284)) == 1))
        void* r0_12 = *(arg1 + 0x258)
        var_84 = r0_12
        var_88 = ascensionrules::CStateProcessAcquireChampionHero::SelectAcquireToHand
        CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_12 + 8), 0xa024, "Acquire %s to Hand", 
            var_88)
    
    if (memchr(arg1 + 0x284, 2, __n) != 0
            && (r10_1 == 0xffffffff || zx.d(*(arg1 + r10_1 + 0x284)) == 2))
        void* r0_18 = *(arg1 + 0x258)
        var_84 = r0_18
        var_88 = ascensionrules::CStateProcessAcquireChampionHero::SelectAcquireToTopOfDeck
        CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_18 + 8), 0xa022, 
            "Acquire %s to Top of Deck", var_88)
    
    if (*(r6 + 0x30) u<= 0x12)
        void* r0_21 = *(arg1 + 0x258)
        var_84 = r0_21
        var_88 = ascensionrules::CStateProcessAcquireChampionHero::SelectAcquireToDiscardPile
        CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_21 + 8), 0xa021, 
            "Acquire %s to Discard", var_88)
    
    int32_t entry_r1
    (*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), "Acquire Your Champion", var_88, var_84)
    ascension::CEvent::~CEvent()

int32_t r0_25 = *__stack_chk_guard

if (r0_25 == r0)
    return r0_25 - r0

__stack_chk_fail()
noreturn
