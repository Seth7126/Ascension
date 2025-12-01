// 函数: _ZN14ascensionrules31CStateProcessAcquireResolveCard15BuildOptionListER13CStateMachine
// 地址: 0x135390
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t r1 = *(arg1 + 0x250)

if (*(*(r1 + 0xc) + 0x88) == 1)
    void* r0_3 = *(arg1 + 0x24c)
    ascension::CEvent* r6_1 = *(r0_3 + 4)
    int32_t var_7c_1 = 6
    int32_t var_78_1 = 0
    void* __offset(vtable_for_ascension::CEventQueryCardAcquireAttributes, 0x8) var_80 =
        _vtable_for_ascension::CEventQueryCardAcquireAttributes + 8
    void* var_34_1 = r0_3
    int32_t var_30_1 = 0
    void* __offset(CStateMachine, 0x258) var_2c_1 = arg1 + 0x258
    ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_80, r1, 0xb)
    ascension::CWorld::HandleQuery(r6_1)
    
    if (var_30_1 s>= 1)
        void* __offset(CStateMachine, 0x264) r1_1 = arg1 + 0x264
        int32_t r3_3 = 0
        
        do
            r3_3 += 1
            
            if (*r1_1 s<= 0xffffffff)
                *r1_1 = 0
            
            r1_1 += 0x44
        while (r3_3 s< var_30_1)
    
    int32_t r4_1 = *(arg1 + 0x298)
    uint32_t __n = *(arg1 + 0x274)
    *(arg1 + 0x254) = var_30_1
    int32_t (* const var_88)(CStateMachine&, CState*, int32_t, uint32_t*)
    void* var_84
    
    if (r4_1 == 0xffffffff)
        void* r0_8 = *(arg1 + 0x250)
        var_84 = r0_8
        var_88 = ascensionrules::CStateProcessAcquireResolveCard::SelectAcquireToDiscardPile
        CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_8 + 8), 0xa020, "Acquire %s", var_88)
    
    if (memchr(arg1 + 0x278, 1, __n) != 0
            && (r4_1 == 0xffffffff || zx.d(*(arg1 + r4_1 + 0x278)) == 1))
        void* r0_14 = *(arg1 + 0x250)
        var_84 = r0_14
        var_88 = ascensionrules::CStateProcessAcquireResolveCard::SelectAcquireToHand
        CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_14 + 8), 0xa024, "Acquire %s to Hand", 
            var_88)
    
    if (memchr(arg1 + 0x278, 2, __n) != 0
            && (r4_1 == 0xffffffff || zx.d(*(arg1 + r4_1 + 0x278)) == 2))
        void* r0_20 = *(arg1 + 0x250)
        var_84 = r0_20
        var_88 = ascensionrules::CStateProcessAcquireResolveCard::SelectAcquireToTopOfDeck
        CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_20 + 8), 0xa022, 
            "Acquire %s to Top of Deck", var_88)
    
    int32_t entry_r1
    (*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), "Acquire the Card", var_88, var_84)
    ascension::CEvent::~CEvent()

int32_t r0_24 = *__stack_chk_guard

if (r0_24 == r0)
    return r0_24 - r0

__stack_chk_fail()
noreturn
