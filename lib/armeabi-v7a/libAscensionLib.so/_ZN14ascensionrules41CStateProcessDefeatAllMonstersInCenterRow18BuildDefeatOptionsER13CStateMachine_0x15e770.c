// 函数: _ZN14ascensionrules41CStateProcessDefeatAllMonstersInCenterRow18BuildDefeatOptionsER13CStateMachine
// 地址: 0x15e770
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t i = 0
int32_t r0 = *__stack_chk_guard
void* r0_1 = *(arg1 + 0x24c)
int32_t r9 = *(r0_1 + 4)
int32_t var_7c = 8
int32_t var_78 = 0
void* __offset(vtable_for_ascension::CEventQueryCardDefeatAttributes, 0x8) var_80 =
    _vtable_for_ascension::CEventQueryCardDefeatAttributes + 8
void* var_34 = r0_1
int32_t var_30 = 0
void* __offset(CStateMachine, 0x254) var_2c = arg1 + 0x254

do
    if (zx.d(*(arg1 + 0x498 + i + 0x1c)) == 0 && *(arg1 + 0x498 + (i << 2)) != 0)
        int32_t r0_7 = ascension::CWorld::GetCenterRowCard(r9)
        
        if (r0_7 != *(arg1 + 0x498 + (i << 2)))
            *(arg1 + 0x498 + (i << 2)) = 0
        else if (*(*(r0_7 + 0xc) + 0x88) == 3)
            ascension::CEventQueryCardDefeatAttributes::AddQueryCard(&var_80, r0_7)
    
    i += 1
while (i u< 7)

int32_t r0_12 = *(arg1 + 0x4bc)

if (r0_12 s>= 1)
    int32_t r5_1 = 0
    
    do
        if (zx.d(*(arg1 + 0x4d0 + r5_1)) == 0)
            void* r1_4 = arg1 + 0x4d0 + (r5_1 << 2)
            void* r2_2 = *(r1_4 - 0x10)
            
            if (r2_2 != 0)
                int32_t r2_3
                
                if (zx.d(*(*(*(r2_2 + 0x10) + 0xc) + 0xcb)) != 0)
                    r2_3 = *(r2_2 + 0x4c)
                
                if (zx.d(*(*(*(r2_2 + 0x10) + 0xc) + 0xcb)) == 0 || r2_3 - *(r2_2 + 0x48) != 4)
                    *(r1_4 - 0x10) = 0
                else
                    int32_t r1_5 = *(r2_3 - 4)
                    
                    if (*(*(r1_5 + 0xc) + 0x88) == 3)
                        ascension::CEventQueryCardDefeatAttributes::AddQueryCard(&var_80, r1_5)
                        r0_12 = *(arg1 + 0x4bc)
        
        r5_1 += 1
    while (r5_1 s< r0_12)

ascension::CWorld::HandleQuery(r9)

if (var_30 s>= 1)
    void* __offset(CStateMachine, 0x260) r1_6 = arg1 + 0x260
    int32_t r3_6 = 0
    
    do
        r3_6 += 1
        
        if (*r1_6 s<= 0xffffffff)
            *r1_6 = 0
        
        r1_6 += 0x34
    while (r3_6 s< var_30)

int32_t r10_1 = 0
int32_t i_1 = 0
*(arg1 + 0x250) = var_30
int32_t (* const var_90)(CStateMachine&, CState*, int32_t, uint32_t*)
void* var_8c

do
    if (zx.d(*(arg1 + i_1 + 0x4b4)) == 0 && *(arg1 + (i_1 << 2) + 0x498) != 0)
        void* r0_20 = ascension::CWorld::GetCenterRowCard(r9)
        
        if (r0_20 == *(arg1 + (i_1 << 2) + 0x498))
            void* r0_22 = *(r0_20 + 0xc)
            
            if (*(r0_22 + 0x88) == 3)
                void* r7_2 = arg1 + r10_1 * 0x34
                r10_1 += 1
                uint32_t __n = *(r7_2 + 0x26c)
                
                if (zx.d(*(r0_22 + 0xc5)) == 0)
                    var_90 = ascensionrules::CStateProcessDefeatAllMonstersInCenterRow::SelectDefeatFromCenterRow
                    var_8c = r0_20
                    CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_20 + 8), 0xa040, 
                        "Defeat %s", var_90)
                    
                    if (*(*(arg1 + 0x24c) + 0xa8) s>= 1)
                        var_90 = ascensionrules::CStateProcessDefeatAllMonstersInCenterRow::SelectDefeatFromCenterRowIntoPlay
                        var_8c = r0_20
                        CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_20 + 8), 0xa047, 
                            "Defeat %s into Play", var_90)
                    
                    goto label_15eab4
                
                if (zx.d(*(r0_22 + 0xc6)) == 0)
                label_15ea24:
                    var_90 = ascensionrules::CStateProcessDefeatAllMonstersInCenterRow::SelectDefeatTrophyFromCenterRow
                    var_8c = r0_20
                    CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_20 + 8), 0xa045, 
                        "Defeat %s", var_90)
                label_15eab4:
                    
                    if (memchr(r7_2 + 0x270, 3, __n) != 0)
                        var_90 = ascensionrules::CStateProcessDefeatAllMonstersInCenterRow::SelectDefeatFromCenterRowToDiscardPile
                        var_8c = r0_20
                        CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_20 + 8), 0xa043, 
                            "Defeat %s to Discard Pile", var_90)
                else
                    void* r2_7 = *(arg1 + 0x24c)
                    int32_t* r1_11 = *(r2_7 + 0x60)
                    int32_t r2_8 = *(r2_7 + 0x64)
                    
                    if (r1_11 == r2_8)
                        goto label_15ea24
                    
                    int32_t r3_7 = 0
                    
                    do
                        void* r6_3 = *r1_11
                        r1_11 = &r1_11[1]
                        int32_t r6_5 = *(*(r6_3 + 0x10) + 0xc)
                        
                        if (r6_5 == r0_22)
                            goto label_15e944
                        
                        int32_t temp0_1 = 0
                        void* j = r6_5 - r0_22
                        
                        while (j != 0)
                            j u>>= 1
                            temp0_1 += 1
                        
                        r3_7 |= (0x20 - temp0_1) u>> 5
                    while (r2_8 != r1_11)
                    
                    if ((r3_7 & 1) == 0)
                        goto label_15ea24
        else
            *(arg1 + (i_1 << 2) + 0x498) = 0
    
label_15e944:
    i_1 += 1
while (i_1 u< 7)

if (*(arg1 + 0x4bc) s>= 1)
    int32_t i_2 = 0
    
    do
        if (zx.d(*(arg1 + i_2 + 0x4d0)) == 0)
            void* r8_2 = *(arg1 + (i_2 << 2) + 0x4c0)
            
            if (r8_2 != 0)
                void* r0_38 = *(*(*(r8_2 + 0x4c) - 4) + 0xc)
                
                if (*(r0_38 + 0x88) == 3)
                    void* r9_1 = arg1 + r10_1 * 0x34
                    r10_1 += 1
                    uint32_t __n_1 = *(r9_1 + 0x26c)
                    
                    if (zx.d(*(r0_38 + 0xc5)) == 0)
                        var_90 = ascensionrules::CStateProcessDefeatAllMonstersInCenterRow::SelectDefeatFromConstruct
                        var_8c = r8_2
                        CGameStateOptions::AddSimpleUserOption(arg1.w, *(r8_2 + 8), 0xa040, 
                            "Defeat %s", var_90)
                    label_15ec48:
                        
                        if (memchr(r9_1 + 0x270, 3, __n_1) != 0)
                            var_90 = ascensionrules::CStateProcessDefeatAllMonstersInCenterRow::SelectDefeatFromConstructToDiscardPile
                            var_8c = r8_2
                            CGameStateOptions::AddSimpleUserOption(arg1.w, *(r8_2 + 8), 0xa043, 
                                "Defeat %s to Discard Pile", var_90)
                    else
                        if (zx.d(*(r0_38 + 0xc6)) == 0)
                        label_15ebfc:
                            var_90 = ascensionrules::CStateProcessDefeatAllMonstersInCenterRow::SelectDefeatTrophyFromConstruct
                            var_8c = r8_2
                            CGameStateOptions::AddSimpleUserOption(arg1.w, *(r8_2 + 8), 0xa040, 
                                "Defeat %s", var_90)
                            goto label_15ec48
                        
                        void* r1_19 = *(arg1 + 0x24c)
                        int32_t* r2_10 = *(r1_19 + 0x60)
                        int32_t r1_20 = *(r1_19 + 0x64)
                        
                        if (r2_10 == r1_20)
                            goto label_15ebfc
                        
                        int32_t r3_8 = 0
                        
                        do
                            void* r5_2 = *r2_10
                            r2_10 = &r2_10[1]
                            int32_t r5_4 = *(*(r5_2 + 0x10) + 0xc)
                            
                            if (r5_4 == r0_38)
                                goto label_15ebd0
                            
                            int32_t temp0_2 = 0
                            void* j_1 = r5_4 - r0_38
                            
                            while (j_1 != 0)
                                j_1 u>>= 1
                                temp0_2 += 1
                            
                            r3_8 |= (0x20 - temp0_2) u>> 5
                        while (r1_20 != r2_10)
                        
                        if ((r3_8 & 1) == 0)
                            goto label_15ebfc
                        
                    label_15ebd0:
                        var_90 = ascensionrules::CStateProcessDefeatAllMonstersInCenterRow::SelectDefeatFromConstruct
                        var_8c = r8_2
                        CGameStateOptions::AddSimpleUserOption(arg1.w, *(r8_2 + 8), 0xa040, 
                            "Defeat %s", var_90)
        
        i_2 += 1
    while (i_2 s< *(arg1 + 0x4bc))

int32_t entry_r1

if (*(arg1 + 0x38) s<= 0)
    *(arg1 + 0x494) = 1
else
    (*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), "Defeat all Monsters from the Center Row", 
        var_90, var_8c)
ascension::CEvent::~CEvent()
int32_t r0_48 = *__stack_chk_guard

if (r0_48 == r0)
    return r0_48 - r0

__stack_chk_fail()
noreturn
