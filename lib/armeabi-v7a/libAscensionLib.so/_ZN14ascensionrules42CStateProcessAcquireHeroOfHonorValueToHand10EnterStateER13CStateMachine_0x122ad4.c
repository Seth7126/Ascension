// 函数: _ZN14ascensionrules42CStateProcessAcquireHeroOfHonorValueToHand10EnterStateER13CStateMachine
// 地址: 0x122ad4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* r0_1 = *(arg1 + 0x24c)
int32_t r6 = *(r0_1 + 4)
int32_t var_7c = 6
int32_t var_78 = 0
void* __offset(vtable_for_ascension::CEventQueryCardAcquireAttributes, 0x8) var_80 =
    _vtable_for_ascension::CEventQueryCardAcquireAttributes + 8
void* var_34 = r0_1
int32_t var_30 = 0
void* __offset(CStateMachine, 0x258) var_2c = arg1 + 0x258
int32_t* i = *(r6 + 0xa30)

for (int32_t r0_3 = *(r6 + 0xa34); i != r0_3; i = &i[1])
    void* r2_3 = *i
    
    if (*(r2_3 + 0x10) != 0)
        int32_t r1_1 = *(r2_3 + 0x14)
        
        if (r1_1 != 0)
            void* r2_1 = *(r2_3 + 0xc)
            
            if (*(r2_1 + 0x88) == 1 && *(r2_1 + 0xa4) s<= *(arg1 + 0x250))
                ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_80, r1_1, 6)
                r0_3 = *(r6 + 0xa34)

int32_t r0_6 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_6 != 0)
    void* r0_7 = *(r0_6 + 0xc)
    
    if (*(r0_7 + 0x88) == 1 && *(r0_7 + 0xa4) s<= *(arg1 + 0x250))
        ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_80, r0_6, 7)

int32_t r0_11 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_11 != 0)
    void* r0_12 = *(r0_11 + 0xc)
    
    if (*(r0_12 + 0x88) == 1 && *(r0_12 + 0xa4) s<= *(arg1 + 0x250))
        ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_80, r0_11, 7)

int32_t r0_16 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_16 != 0)
    void* r0_17 = *(r0_16 + 0xc)
    
    if (*(r0_17 + 0x88) == 1 && *(r0_17 + 0xa4) s<= *(arg1 + 0x250))
        ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_80, r0_16, 7)

int32_t r0_21 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_21 != 0)
    void* r0_22 = *(r0_21 + 0xc)
    
    if (*(r0_22 + 0x88) == 1 && *(r0_22 + 0xa4) s<= *(arg1 + 0x250))
        ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_80, r0_21, 7)

int32_t r0_26 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_26 != 0)
    void* r0_27 = *(r0_26 + 0xc)
    
    if (*(r0_27 + 0x88) == 1 && *(r0_27 + 0xa4) s<= *(arg1 + 0x250))
        ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_80, r0_26, 7)

int32_t r0_31 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_31 != 0)
    void* r0_32 = *(r0_31 + 0xc)
    
    if (*(r0_32 + 0x88) == 1 && *(r0_32 + 0xa4) s<= *(arg1 + 0x250))
        ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_80, r0_31, 7)

int32_t r0_36 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_36 != 0)
    void* r0_37 = *(r0_36 + 0xc)
    
    if (*(r0_37 + 0x88) == 1 && *(r0_37 + 0xa4) s<= *(arg1 + 0x250))
        ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_80, r0_36, 7)

ascension::CWorld::HandleQuery(r6)

if (var_30 s>= 1)
    void* __offset(CStateMachine, 0x264) r1_16 = arg1 + 0x264
    int32_t r3_11 = 0
    
    do
        r3_11 += 1
        
        if (*r1_16 s<= 0xffffffff)
            *r1_16 = 0
        
        r1_16 += 0x44
    while (r3_11 s< var_30)

*(arg1 + 0x254) = var_30
void* i_2 = nullptr
int32_t* i_1 = *(r6 + 0xa30)
int32_t var_84 = 0
int32_t (* const var_98)(CStateMachine&, CState*, int32_t, uint32_t*)
void* i_3
int32_t var_8c
uint32_t __n

if (i_1 != *(r6 + 0xa34))
    var_84 = 0
    
    do
        void* i_4 = *i_1
        
        if (*(i_4 + 0x10) != 0 && *(i_4 + 0x14) != 0)
            void* r0_46 = *(i_4 + 0xc)
            
            if (*(r0_46 + 0x88) == 1 && *(r0_46 + 0xa4) s<= *(arg1 + 0x250))
                if (*(r6 + 0x30) u< 4)
                    var_98 = ascensionrules::CStateProcessAcquireHeroOfHonorValueToHand::SelectAcquireFromKingdomToHand
                    i_3 = i_4
                    CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_4 + 8), 0xa024, 
                        "Acquire %s to Hand", var_98)
                else
                    void* r10_1 = arg1 + var_84 * 0x44
                    __n = *(r10_1 + 0x274)
                    int32_t r0_52 = *(r10_1 + 0x298)
                    var_8c = r0_52
                    
                    if (r0_52 == 0xffffffff)
                        var_98 = ascensionrules::CStateProcessAcquireHeroOfHonorValueToHand::SelectAcquireFromKingdomToHand
                        i_3 = i_4
                        CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_4 + 8), 0xa024, 
                            "Acquire %s to Hand", var_98)
                    
                    if (memchr(r10_1 + 0x278, 1, __n) != 0
                            && (var_8c == 0xffffffff || zx.d(*(r10_1 + var_8c + 0x278)) == 1))
                        var_98 = ascensionrules::CStateProcessAcquireHeroOfHonorValueToHand::SelectAcquireFromKingdomToHand
                        i_3 = i_4
                        CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_4 + 8), 0xa024, 
                            "Acquire %s to Hand", var_98)
                    
                    var_84 += 1
                    
                    if (memchr(r10_1 + 0x278, 2, __n) != 0
                            && (var_8c == 0xffffffff || zx.d(*(r10_1 + var_8c + 0x278)) == 2))
                        var_98 = ascensionrules::CStateProcessAcquireHeroOfHonorValueToHand::SelectAcquireFromKingdomToTopOfDeck
                        i_3 = i_4
                        CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_4 + 8), 0xa022, 
                            "Acquire %s to Top of Deck", var_98)
        
        i_1 = &i_1[1]
    while (i_1 != *(r6 + 0xa34))

do
    void* r0_71 = ascension::CWorld::GetCenterRowCard(r6)
    
    if (r0_71 != 0)
        void* r0_72 = *(r0_71 + 0xc)
        
        if (*(r0_72 + 0x88) == 1 && *(r0_72 + 0xa4) s<= *(arg1 + 0x250))
            if (*(r6 + 0x30) u< 4)
                var_98 = ascensionrules::CStateProcessAcquireHeroOfHonorValueToHand::SelectAcquireFromCenterRowToHand
                i_3 = i_2
                CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_71 + 8), 0xa024, 
                    "Acquire %s to Hand", var_98)
            else
                void* r5 = arg1 + var_84 * 0x44
                int32_t r8_2 = *(r5 + 0x298)
                uint32_t __n_1 = *(r5 + 0x274)
                
                if (r8_2 == 0xffffffff)
                    var_98 = ascensionrules::CStateProcessAcquireHeroOfHonorValueToHand::SelectAcquireFromCenterRowToHand
                    i_3 = i_2
                    CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_71 + 8), 0xa024, 
                        "Acquire %s to Hand", var_98)
                
                var_84 += 1
                
                if (memchr(r5 + 0x278, 2, __n_1) != 0
                        && (r8_2 == 0xffffffff || zx.d(*(r5 + r8_2 + 0x278)) == 2))
                    var_98 = ascensionrules::CStateProcessAcquireHeroOfHonorValueToHand::SelectAcquireFromCenterRowToTopOfDeck
                    i_3 = i_2
                    CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_71 + 8), 0xa022, 
                        "Acquire %s to Top of Deck", var_98)
    
    i_2 += 1
while (i_2 u< 7)

int32_t entry_r1
(*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), "You Must Acquire a Hero", var_98, i_3, 
    entry_r1, var_8c, __n, var_84)
ascension::CEvent::~CEvent()
int32_t r0_86 = *__stack_chk_guard

if (r0_86 == r0)
    return r0_86 - r0

__stack_chk_fail()
noreturn
