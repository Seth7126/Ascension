// 函数: _ZN14ascensionrules49CStateProcessAcquireAllCenterRowHeroesToTopOfDeck19BuildAcquireOptionsER13CStateMachine
// 地址: 0x12ce7c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t i = 0
int32_t r0 = *__stack_chk_guard
void* r0_1 = *(arg1 + 0x24c)
ascension::CEvent* r6 = *(r0_1 + 4)
int32_t var_7c = 6
int32_t var_78 = 0
void* __offset(vtable_for_ascension::CEventQueryCardAcquireAttributes, 0x8) var_80 =
    _vtable_for_ascension::CEventQueryCardAcquireAttributes + 8
void* var_34 = r0_1
int32_t var_30 = 0
void* __offset(CStateMachine, 0x258) var_2c = arg1 + 0x258

do
    if (zx.d(*(arg1 + 0x438 + i + 0x1c)) == 0 && *(arg1 + 0x438 + (i << 2)) != 0)
        int32_t r0_7 = ascension::CWorld::GetCenterRowCard(r6)
        
        if (r0_7 != *(arg1 + 0x438 + (i << 2)))
            *(arg1 + 0x438 + (i << 2)) = 0
        else if (*(*(r0_7 + 0xc) + 0x88) == 1)
            ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_80, r0_7, 7)
    
    i += 1
while (i u< 7)

ascension::CWorld::HandleQuery(r6)

if (var_30 s>= 1)
    void* __offset(CStateMachine, 0x264) r1_3 = arg1 + 0x264
    int32_t r3_2 = 0
    
    do
        r3_2 += 1
        
        if (*r1_3 s<= 0xffffffff)
            *r1_3 = 0
        
        r1_3 += 0x44
    while (r3_2 s< var_30)

*(arg1 + 0x254) = var_30
int32_t i_1 = 0
int32_t r4 = 0
int32_t (* const var_98)(CStateMachine&, CState*, int32_t, uint32_t*)
int32_t i_2

do
    if (zx.d(*(arg1 + 0x438 + i_1 + 0x1c)) == 0 && *(arg1 + 0x438 + (i_1 << 2)) != 0)
        void* r0_16 = ascension::CWorld::GetCenterRowCard(r6)
        
        if (r0_16 != *(arg1 + 0x438 + (i_1 << 2)))
            *(arg1 + 0x438 + (i_1 << 2)) = 0
        else if (*(*(r0_16 + 0xc) + 0x88) == 1)
            if (zx.d(*(arg1 + 0x250)) == 0)
                void* r4_1 = arg1 + r4 * 0x44
                int32_t r0_23 = *(r4_1 + 0x298)
                uint32_t __n = *(r4_1 + 0x274)
                
                if (r0_23 == 0xffffffff)
                    var_98 = ascensionrules::CStateProcessAcquireAllCenterRowHeroesToTopOfDeck::SelectAcquireToTopOfDeck
                    i_2 = i_1
                    CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_16 + 8), 0xa022, 
                        "Acquire %s to Top of Deck", var_98)
                
                if (memchr(r4_1 + 0x278, 1, __n) == 0
                        || (r0_23 != 0xffffffff && zx.d(*(r4_1 + r0_23 + 0x278)) != 1))
                    r4 += 1
                else
                    var_98 = ascensionrules::CStateProcessAcquireAllCenterRowHeroesToTopOfDeck::SelectAcquireToHand
                    i_2 = i_1
                    CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_16 + 8), 0xa024, 
                        "Acquire %s to Hand", var_98)
                    r4 += 1
            else
                var_98 = ascensionrules::CStateProcessAcquireAllCenterRowHeroesToTopOfDeck::SelectAcquireToHand
                i_2 = i_1
                CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_16 + 8), 0xa024, 
                    "Acquire %s to Hand", var_98)
                r4 += 1
    
    i_1 += 1
while (i_1 u< 7)

int32_t entry_r1

if (*(arg1 + 0x38) s<= 0)
    *(arg1 + 0x434) = 1
else
    (*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), "Acquire all Heroes from the Center Row", 
        var_98, i_2)
ascension::CEvent::~CEvent()
int32_t r0_36 = *__stack_chk_guard

if (r0_36 == r0)
    return r0_36 - r0

__stack_chk_fail()
noreturn
