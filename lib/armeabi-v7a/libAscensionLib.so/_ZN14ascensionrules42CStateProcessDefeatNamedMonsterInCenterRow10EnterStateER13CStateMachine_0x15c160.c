// 函数: _ZN14ascensionrules42CStateProcessDefeatNamedMonsterInCenterRow10EnterStateER13CStateMachine
// 地址: 0x15c160
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* r4 = *(arg1 + 0x24c)
int32_t var_7c = 8
int32_t var_78 = 0
void* __offset(vtable_for_ascension::CEventQueryCardDefeatAttributes, 0x8) var_80 =
    _vtable_for_ascension::CEventQueryCardDefeatAttributes + 8
void* var_34 = r4
int32_t var_30 = 0
void* __offset(CStateMachine, 0x258) var_2c = arg1 + 0x258
ascension::CEvent* r0_2 = *(r4 + 4)

for (int32_t* i = *(r4 + 0x54); i != *(r4 + 0x58); i = &i[1])
    void* r1_1 = *i
    int32_t r0_4 = *(r1_1 + 0x4c)
    
    if (r0_4 - *(r1_1 + 0x48) == 4 && zx.d(*(*(*(r1_1 + 0x10) + 0xc) + 0xcb)) != 0)
        int32_t r7_1 = *(r0_4 - 4)
        void* r0_5 = *(r7_1 + 0xc)
        
        if (*(r0_5 + 0x88) == 3 && strcasecmp(r0_5 + 0x44, *(arg1 + 0x250)) == 0)
            ascension::CEventQueryCardDefeatAttributes::AddQueryCard(&var_80, r7_1)
            r4 = *(arg1 + 0x24c)

int32_t r0_11 = ascension::CWorld::GetCenterRowCard(r0_2)

if (r0_11 != 0)
    void* r0_12 = *(r0_11 + 0xc)
    
    if (*(r0_12 + 0x88) == 3 && strcasecmp(r0_12 + 0x44, *(arg1 + 0x250)) == 0)
        ascension::CEventQueryCardDefeatAttributes::AddQueryCard(&var_80, r0_11)

int32_t r0_17 = ascension::CWorld::GetCenterRowCard(r0_2)

if (r0_17 != 0)
    void* r0_18 = *(r0_17 + 0xc)
    
    if (*(r0_18 + 0x88) == 3 && strcasecmp(r0_18 + 0x44, *(arg1 + 0x250)) == 0)
        ascension::CEventQueryCardDefeatAttributes::AddQueryCard(&var_80, r0_17)

int32_t r0_23 = ascension::CWorld::GetCenterRowCard(r0_2)

if (r0_23 != 0)
    void* r0_24 = *(r0_23 + 0xc)
    
    if (*(r0_24 + 0x88) == 3 && strcasecmp(r0_24 + 0x44, *(arg1 + 0x250)) == 0)
        ascension::CEventQueryCardDefeatAttributes::AddQueryCard(&var_80, r0_23)

int32_t r0_29 = ascension::CWorld::GetCenterRowCard(r0_2)

if (r0_29 != 0)
    void* r0_30 = *(r0_29 + 0xc)
    
    if (*(r0_30 + 0x88) == 3 && strcasecmp(r0_30 + 0x44, *(arg1 + 0x250)) == 0)
        ascension::CEventQueryCardDefeatAttributes::AddQueryCard(&var_80, r0_29)

int32_t r0_35 = ascension::CWorld::GetCenterRowCard(r0_2)

if (r0_35 != 0)
    void* r0_36 = *(r0_35 + 0xc)
    
    if (*(r0_36 + 0x88) == 3 && strcasecmp(r0_36 + 0x44, *(arg1 + 0x250)) == 0)
        ascension::CEventQueryCardDefeatAttributes::AddQueryCard(&var_80, r0_35)

int32_t r0_41 = ascension::CWorld::GetCenterRowCard(r0_2)

if (r0_41 != 0)
    void* r0_42 = *(r0_41 + 0xc)
    
    if (*(r0_42 + 0x88) == 3 && strcasecmp(r0_42 + 0x44, *(arg1 + 0x250)) == 0)
        ascension::CEventQueryCardDefeatAttributes::AddQueryCard(&var_80, r0_41)

int32_t r0_47 = ascension::CWorld::GetCenterRowCard(r0_2)

if (r0_47 != 0)
    void* r0_48 = *(r0_47 + 0xc)
    
    if (*(r0_48 + 0x88) == 3 && strcasecmp(r0_48 + 0x44, *(arg1 + 0x250)) == 0)
        ascension::CEventQueryCardDefeatAttributes::AddQueryCard(&var_80, r0_47)

ascension::CWorld::HandleQuery(r0_2)

if (var_30 s>= 1)
    void* __offset(CStateMachine, 0x264) r1_36 = arg1 + 0x264
    int32_t r3_1 = 0
    
    do
        r3_1 += 1
        
        if (*r1_36 s<= 0xffffffff)
            *r1_36 = 0
        
        r1_36 += 0x34
    while (r3_1 s< var_30)

void* r8 = *(arg1 + 0x24c)
void* i_2 = nullptr
*(arg1 + 0x254) = var_30
int32_t* i_1 = *(r8 + 0x54)
int32_t var_88 = 0
int32_t (* const var_98)(CStateMachine&, CState*, int32_t, uint32_t*)
void* i_3

if (i_1 != *(r8 + 0x58))
    var_88 = 0
    
    do
        void* i_4 = *i_1
        int32_t r0_55 = *(i_4 + 0x4c)
        
        if (r0_55 - *(i_4 + 0x48) == 4 && zx.d(*(*(*(i_4 + 0x10) + 0xc) + 0xcb)) != 0)
            void* r6 = *(*(r0_55 - 4) + 0xc)
            
            if (*(r6 + 0x88) == 3 && strcasecmp(r6 + 0x44, *(arg1 + 0x250)) == 0)
                int32_t r6_1
                
                if (zx.d(*(r6 + 0xc5)) == 0)
                    var_98 = ascensionrules::CStateProcessDefeatNamedMonsterInCenterRow::SelectDefeatFromConstruct
                    i_3 = i_4
                    CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_4 + 8), 0xa040, "Defeat %s", 
                        var_98)
                    r6_1 = var_88
                label_15c5a8:
                    void* r1_45 = arg1 + r6_1 * 0x34
                    
                    if (memchr(r1_45 + 0x274, 3, *(r1_45 + 0x270)) != 0)
                        var_98 = ascensionrules::CStateProcessDefeatNamedMonsterInCenterRow::SelectDefeatFromConstructToDiscardPile
                        i_3 = i_4
                        CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_4 + 8), 0xa043, 
                            "Defeat %s to Discard Pile", var_98)
                    
                    var_88 = r6_1 + 1
                else
                    if (zx.d(*(r6 + 0xc6)) == 0)
                    label_15c558:
                        var_98 = ascensionrules::CStateProcessDefeatNamedMonsterInCenterRow::SelectDefeatTrophyFromConstruct
                        i_3 = i_4
                        CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_4 + 8), 0xa040, 
                            "Defeat %s", var_98)
                        r6_1 = var_88
                        goto label_15c5a8
                    
                    int32_t* r2_11 = *(r8 + 0x60)
                    int32_t r0_62 = *(r8 + 0x64)
                    
                    if (r2_11 == r0_62)
                        goto label_15c558
                    
                    int32_t r3_2 = 0
                    
                    do
                        void* r1_47 = *r2_11
                        r2_11 = &r2_11[1]
                        int32_t r5_1 = *(*(r1_47 + 0x10) + 0xc)
                        
                        if (r5_1 == r6)
                            goto label_15c658
                        
                        int32_t temp0_1 = 0
                        void* j = r5_1 - r6
                        
                        while (j != 0)
                            j u>>= 1
                            temp0_1 += 1
                        
                        r3_2 |= (0x20 - temp0_1) u>> 5
                    while (r0_62 != r2_11)
                    
                    if ((r3_2 & 1) == 0)
                        goto label_15c558
                    
                label_15c658:
                    var_98 = ascensionrules::CStateProcessDefeatNamedMonsterInCenterRow::SelectDefeatFromConstruct
                    i_3 = i_4
                    CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_4 + 8), 0xa040, "Defeat %s", 
                        var_98)
        
        r8 = *(arg1 + 0x24c)
        i_1 = &i_1[1]
    while (i_1 != *(r8 + 0x58))

do
    void* r0_71 = ascension::CWorld::GetCenterRowCard(r0_2)
    
    if (r0_71 != 0)
        void* r6_3 = *(r0_71 + 0xc)
        
        if (*(r6_3 + 0x88) == 3 && strcasecmp(r6_3 + 0x44, *(arg1 + 0x250)) == 0)
            void* r4_8 = arg1 + var_88 * 0x34
            var_88 += 1
            uint32_t __n = *(r4_8 + 0x270)
            
            if (zx.d(*(r6_3 + 0xc5)) == 0)
                var_98 = ascensionrules::CStateProcessDefeatNamedMonsterInCenterRow::SelectDefeatFromCenterRow
                i_3 = i_2
                CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_71 + 8), 0xa040, "Defeat %s", 
                    var_98)
                
                if (*(*(arg1 + 0x24c) + 0xa8) s>= 1)
                    var_98 = ascensionrules::CStateProcessDefeatNamedMonsterInCenterRow::SelectDefeatFromCenterRowIntoPlay
                    i_3 = i_2
                    CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_71 + 8), 0xa047, 
                        "Defeat %s into Play", var_98)
                
                goto label_15c7cc
            
            if (zx.d(*(r6_3 + 0xc6)) == 0)
            label_15c73c:
                var_98 = ascensionrules::CStateProcessDefeatNamedMonsterInCenterRow::SelectDefeatTrophyFromCenterRow
                i_3 = i_2
                CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_71 + 8), 0xa045, "Defeat %s", 
                    var_98)
            label_15c7cc:
                
                if (memchr(r4_8 + 0x274, 3, __n) != 0)
                    var_98 = ascensionrules::CStateProcessDefeatNamedMonsterInCenterRow::SelectDefeatFromCenterRowToDiscardPile
                    i_3 = i_2
                    CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_71 + 8), 0xa043, 
                        "Defeat %s to Discard Pile", var_98)
            else
                void* r1_57 = *(arg1 + 0x24c)
                int32_t* r0_77 = *(r1_57 + 0x60)
                int32_t r1_58 = *(r1_57 + 0x64)
                
                if (r0_77 == r1_58)
                    goto label_15c73c
                
                int32_t r2_13 = 0
                
                do
                    void* r3_3 = *r0_77
                    r0_77 = &r0_77[1]
                    int32_t r3_5 = *(*(r3_3 + 0x10) + 0xc)
                    
                    if (r3_5 == r6_3)
                        goto label_15c804
                    
                    int32_t temp0_2 = 0
                    void* j_1 = r3_5 - r6_3
                    
                    while (j_1 != 0)
                        j_1 u>>= 1
                        temp0_2 += 1
                    
                    r2_13 |= (0x20 - temp0_2) u>> 5
                while (r1_58 != r0_77)
                
                if ((r2_13 & 1) == 0)
                    goto label_15c73c
    
label_15c804:
    i_2 += 1
while (i_2 u< 7)

int32_t entry_r1
(*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), "Defeat a Monster", var_98, i_3)
ascension::CEvent::~CEvent()
int32_t r0_88 = *__stack_chk_guard

if (r0_88 == r0)
    return r0_88 - r0

__stack_chk_fail()
noreturn
