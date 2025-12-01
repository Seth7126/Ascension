// 函数: _ZN14ascensionrules39CStateProcessDefeatMonsterWithLessPower10EnterStateER13CStateMachine
// 地址: 0x1599dc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r1 = *__stack_chk_guard
void* r7 = *(arg1 + 0x24c)
int32_t var_80 = 8
int32_t var_7c = 0
void* __offset(vtable_for_ascension::CEventQueryCardDefeatAttributes, 0x8) var_84 =
    _vtable_for_ascension::CEventQueryCardDefeatAttributes + 8
void* var_38 = r7
int32_t var_34 = 0
void* __offset(CStateMachine, 0x268) var_30 = arg1 + 0x268
int32_t r2 = *(r7 + 4)
int32_t r0 = *(r2 + 0x30)

if (zx.d(*(arg1 + 0x254)) == 0)
    int32_t* r6_1 = *(r2 + 0xa30)
    int32_t r2_1 = *(r2 + 0xa34)
    
    if (r6_1 != r2_1)
        do
            void* r3_1 = *r6_1
            
            if (*(r3_1 + 0x10) != 0 && *(*(r3_1 + 0xc) + 0x88) == 3)
                ascension::CEventQueryCardDefeatAttributes::AddQueryCard(&var_84, *(r3_1 + 0x14))
                r2_1 = *(r2 + 0xa34)
            
            r6_1 = &r6_1[1]
        while (r6_1 != r2_1)
        
        r7 = *(arg1 + 0x24c)

for (int32_t* i = *(r7 + 0x54); i != *(r7 + 0x58); i = &i[1])
    void* r2_3 = *i
    int32_t r1_5 = *(r2_3 + 0x4c)
    
    if (r1_5 - *(r2_3 + 0x48) == 4 && zx.d(*(*(*(r2_3 + 0x10) + 0xc) + 0xcb)) != 0)
        ascension::CEventQueryCardDefeatAttributes::AddQueryCard(&var_84, *(r1_5 - 4))
        r7 = *(arg1 + 0x24c)

int32_t r4 = r2
int32_t r0_10 = ascension::CWorld::GetCenterRowCard(r4)

if (r0_10 != 0)
    void* r0_11 = *(r0_10 + 0xc)
    
    if (*(r0_11 + 0x88) == 3)
        int32_t r2_10 = *(arg1 + 0x250)
        bool cond:1_1 = r2_10 s> 1
        
        if (r2_10 s>= 1)
            cond:1_1 = *(r0_11 + 0xa0) s> r2_10
        
        if (not(cond:1_1))
            ascension::CEventQueryCardDefeatAttributes::AddQueryCard(&var_84, r0_10)

int32_t r0_15 = ascension::CWorld::GetCenterRowCard(r4)

if (r0_15 != 0)
    void* r0_16 = *(r0_15 + 0xc)
    
    if (*(r0_16 + 0x88) == 3)
        int32_t r2_14 = *(arg1 + 0x250)
        bool cond:2_1 = r2_14 s> 1
        
        if (r2_14 s>= 1)
            cond:2_1 = *(r0_16 + 0xa0) s> r2_14
        
        if (not(cond:2_1))
            ascension::CEventQueryCardDefeatAttributes::AddQueryCard(&var_84, r0_15)

int32_t r0_20 = ascension::CWorld::GetCenterRowCard(r4)

if (r0_20 != 0)
    void* r0_21 = *(r0_20 + 0xc)
    
    if (*(r0_21 + 0x88) == 3)
        int32_t r2_18 = *(arg1 + 0x250)
        bool cond:3_1 = r2_18 s> 1
        
        if (r2_18 s>= 1)
            cond:3_1 = *(r0_21 + 0xa0) s> r2_18
        
        if (not(cond:3_1))
            ascension::CEventQueryCardDefeatAttributes::AddQueryCard(&var_84, r0_20)

int32_t r0_25 = ascension::CWorld::GetCenterRowCard(r4)

if (r0_25 != 0)
    void* r0_26 = *(r0_25 + 0xc)
    
    if (*(r0_26 + 0x88) == 3)
        int32_t r2_22 = *(arg1 + 0x250)
        bool cond:4_1 = r2_22 s> 1
        
        if (r2_22 s>= 1)
            cond:4_1 = *(r0_26 + 0xa0) s> r2_22
        
        if (not(cond:4_1))
            ascension::CEventQueryCardDefeatAttributes::AddQueryCard(&var_84, r0_25)

int32_t r0_30 = ascension::CWorld::GetCenterRowCard(r4)

if (r0_30 != 0)
    void* r0_31 = *(r0_30 + 0xc)
    
    if (*(r0_31 + 0x88) == 3)
        int32_t r2_26 = *(arg1 + 0x250)
        bool cond:5_1 = r2_26 s> 1
        
        if (r2_26 s>= 1)
            cond:5_1 = *(r0_31 + 0xa0) s> r2_26
        
        if (not(cond:5_1))
            ascension::CEventQueryCardDefeatAttributes::AddQueryCard(&var_84, r0_30)

int32_t r0_35 = ascension::CWorld::GetCenterRowCard(r4)

if (r0_35 != 0)
    void* r0_36 = *(r0_35 + 0xc)
    
    if (*(r0_36 + 0x88) == 3)
        int32_t r2_30 = *(arg1 + 0x250)
        bool cond:6_1 = r2_30 s> 1
        
        if (r2_30 s>= 1)
            cond:6_1 = *(r0_36 + 0xa0) s> r2_30
        
        if (not(cond:6_1))
            ascension::CEventQueryCardDefeatAttributes::AddQueryCard(&var_84, r0_35)

int32_t r0_40 = ascension::CWorld::GetCenterRowCard(r4)

if (r0_40 != 0)
    void* r0_41 = *(r0_40 + 0xc)
    
    if (*(r0_41 + 0x88) == 3)
        int32_t r2_34 = *(arg1 + 0x250)
        bool cond:7_1 = r2_34 s> 1
        
        if (r2_34 s>= 1)
            cond:7_1 = *(r0_41 + 0xa0) s> r2_34
        
        if (not(cond:7_1))
            ascension::CEventQueryCardDefeatAttributes::AddQueryCard(&var_84, r0_40)

ascension::CWorld::HandleQuery(r4)
CStateMachine& r5_1 = arg1

if (var_34 s>= 1)
    void* __offset(CStateMachine, 0x274) r1_22 = r5_1 + 0x274
    int32_t r3_4 = 0
    
    do
        r3_4 += 1
        
        if (*r1_22 s<= 0xffffffff)
            *r1_22 = 0
        
        r1_22 += 0x34
    while (r3_4 s< var_34)

*(r5_1 + 0x264) = var_34
int32_t var_e4 = 0
int32_t (* const var_100)(CStateMachine&, CState*, int32_t, uint32_t*)
void* i_6

if (zx.d(*(r5_1 + 0x254)) == 0)
    int32_t* i_1 = *(r4 + 0xa30)
    
    if (i_1 != *(r4 + 0xa34))
        var_e4 = 0
        
        do
            void* i_7 = *i_1
            
            if (*(i_7 + 0x10) != 0)
                void* r1_24 = *(i_7 + 0xc)
                
                if (*(r1_24 + 0x88) == 3)
                    int32_t r2_37 = *(r5_1 + 0x250)
                    int32_t r3_6
                    
                    if (r2_37 s>= 1)
                        int32_t r6_2 = var_e4
                        r3_6 = *(r5_1 + r6_2 * 0x34 + 0x274)
                        
                        if (r3_6 s> r2_37)
                            r6_2 += 1
                        
                        var_e4 = r6_2
                    
                    if (r2_37 s< 1 || r3_6 s<= r2_37)
                        var_e4 += 1
                        
                        if (zx.d(*(r1_24 + 0xc5)) == 0)
                            i_6 = i_7
                            var_100 = ascensionrules::CStateProcessDefeatMonsterWithLessPower::SelectDefeatFromKingdom
                            CGameStateOptions::AddSimpleUserOption(r5_1.w, *(i_7 + 8), 0xa041, 
                                "Defeat %s", var_100)
                        else if (zx.d(*(r1_24 + 0xc6)) == 0)
                        label_159ebc:
                            i_6 = i_7
                            r5_1 = arg1
                            var_100 = ascensionrules::CStateProcessDefeatMonsterWithLessPower::SelectDefeatTrophyFromKingdom
                            CGameStateOptions::AddSimpleUserOption(r5_1.w, *(i_7 + 8), 0xa045, 
                                "Defeat %s", var_100)
                            r4 = r2
                        else
                            void* r3_9 = *(arg1 + 0x24c)
                            int32_t* r2_41 = *(r3_9 + 0x60)
                            int32_t r3_10 = *(r3_9 + 0x64)
                            
                            if (r2_41 == r3_10)
                                goto label_159ebc
                            
                            int32_t r6_3 = 0
                            
                            do
                                void* r5_2 = *r2_41
                                r2_41 = &r2_41[1]
                                int32_t r4_1 = *(*(r5_2 + 0x10) + 0xc)
                                
                                if (r4_1 == r1_24)
                                    goto label_159e80
                                
                                int32_t temp0_1 = 0
                                void* j = r4_1 - r1_24
                                
                                while (j != 0)
                                    j u>>= 1
                                    temp0_1 += 1
                                
                                r6_3 |= (0x20 - temp0_1) u>> 5
                            while (r3_10 != r2_41)
                            
                            if ((r6_3 & 1) == 0)
                                goto label_159ebc
                            
                        label_159e80:
                            i_6 = i_7
                            r5_1 = arg1
                            var_100 = ascensionrules::CStateProcessDefeatMonsterWithLessPower::SelectDefeatFromKingdom
                            CGameStateOptions::AddSimpleUserOption(r5_1.w, *(i_7 + 8), 0xa041, 
                                "Defeat %s", var_100)
                            r4 = r2
            
            i_1 = &i_1[1]
        while (i_1 != *(r4 + 0xa34))

void* r2_42 = *(r5_1 + 0x24c)
int32_t* i_2 = *(r2_42 + 0x54)
void* __offset(CStateMachine, 0x256) var_f0

if (i_2 == *(r2_42 + 0x58))
    var_f0 = r5_1 + 0x256
else
    int32_t r3_11 = var_e4
    var_f0 = r5_1 + 0x256
    
    do
        void* i_9 = *i_2
        int32_t r0_54 = *(i_9 + 0x4c)
        
        if (r0_54 - *(i_9 + 0x48) == 4 && zx.d(*(*(*(i_9 + 0x10) + 0xc) + 0xcb)) != 0)
            void* r8_1 = r5_1 + r3_11 * 0x34
            void* r3_12 = *(*(r0_54 - 4) + 0xc)
            int32_t r0_56 = *(r5_1 + 0x250)
            int32_t* r1_33 = r3_12 + 0xa0
            
            if (r0 u< 0xc)
                r1_33 = r8_1 + 0x274
            
            if (r0_56 == 0 || r0_56 s>= *r1_33)
                uint32_t r0_58 = zx.d(*var_f0)
                uint16_t r1_37
                
                if (zx.d(*(r3_12 + 0xc5)) == 0)
                    r1_37 = *(i_9 + 8)
                    
                    if (r0_58 != 0)
                        goto label_159ff0
                    
                    var_100 = ascensionrules::CStateProcessDefeatMonsterWithLessPower::SelectDefeatFromConstruct
                    i_6 = i_9
                    CGameStateOptions::AddSimpleUserOption(r5_1.w, r1_37, 0xa040, "Defeat %s", 
                        var_100)
                label_15a080:
                    
                    if (r0 u< 2)
                        r3_11 += 1
                    else
                        if (memchr(r8_1 + 0x284, 3, *(r8_1 + 0x280)) != 0
                                && (r0 u< 0x1f || zx.d(*var_f0) == 0))
                            var_100 = ascensionrules::CStateProcessDefeatMonsterWithLessPower::SelectDefeatFromConstructToDiscardPile
                            i_6 = i_9
                            CGameStateOptions::AddSimpleUserOption(r5_1.w, *(i_9 + 8), 0xa043, 
                                "Defeat %s to Discard Pile", var_100)
                        
                        r3_11 += 1
                else
                    if (r0 u>= 0x1f && r0_58 != 0)
                        r1_37 = *(i_9 + 8)
                    label_159ff0:
                        var_100 = ascensionrules::CStateProcessDefeatMonsterWithLessPower::SelectDefeatFromConstruct
                        i_6 = i_9
                        CGameStateOptions::AddSimpleUserOption(r5_1.w, r1_37, 0xa049, "Defeat %s", 
                            var_100)
                        goto label_15a080
                    
                    if (zx.d(*(r3_12 + 0xc6)) == 0)
                    label_15a03c:
                        var_100 = ascensionrules::CStateProcessDefeatMonsterWithLessPower::SelectDefeatTrophyFromConstruct
                        i_6 = i_9
                        r5_1 = arg1
                        CGameStateOptions::AddSimpleUserOption(r5_1.w, *(i_9 + 8), 0xa040, 
                            "Defeat %s", var_100)
                        r4 = r2
                        goto label_15a080
                    
                    int32_t* r4_3 = *(r2_42 + 0x60)
                    int32_t r0_61 = *(r2_42 + 0x64)
                    
                    if (r4_3 == r0_61)
                        goto label_15a03c
                    
                    int32_t r2_44 = 0
                    
                    do
                        void* r1_40 = *r4_3
                        r4_3 = &r4_3[1]
                        int32_t r5_7 = *(*(r1_40 + 0x10) + 0xc)
                        
                        if (r5_7 == r3_12)
                            goto label_15a150
                        
                        int32_t temp0_2 = 0
                        void* j_1 = r5_7 - r3_12
                        
                        while (j_1 != 0)
                            j_1 u>>= 1
                            temp0_2 += 1
                        
                        r2_44 |= (0x20 - temp0_2) u>> 5
                    while (r0_61 != r4_3)
                    
                    if ((r2_44 & 1) == 0)
                        goto label_15a03c
                    
                label_15a150:
                    var_100 = ascensionrules::CStateProcessDefeatMonsterWithLessPower::SelectDefeatFromConstruct
                    i_6 = i_9
                    r5_1 = arg1
                    CGameStateOptions::AddSimpleUserOption(r5_1.w, *(i_9 + 8), 0xa040, "Defeat %s", 
                        var_100)
                    r4 = r2
            else
                r3_11 += 1
        
        r2_42 = *(r5_1 + 0x24c)
        i_2 = &i_2[1]
    while (i_2 != *(r2_42 + 0x58))
    
    var_e4 = r3_11

for (void* i_3 = nullptr; i_3 u< 7; i_3 += 1)
    void* r0_75 = ascension::CWorld::GetCenterRowCard(r4)
    
    if (r0_75 != 0)
        void* r0_76 = *(r0_75 + 0xc)
        
        if (*(r0_76 + 0x88) == 3)
            int32_t r1_48 = *(r5_1 + 0x250)
            bool cond:8_1 = r1_48 s> 1
            
            if (r1_48 s>= 1)
                cond:8_1 = *(r0_76 + 0xa0) s> r1_48
            
            if (not(cond:8_1))
                uint32_t r2_46 = zx.d(*(r5_1 + 0x256))
                void* r9_2 = r5_1 + var_e4 * 0x34
                var_e4 += 1
                uint32_t __n = *(r9_2 + 0x280)
                uint16_t r1_51
                void* r6_6
                
                if (zx.d(*(r0_76 + 0xc5)) == 0)
                    r6_6 = r0_75 + 8
                    r1_51 = *r6_6
                    
                    if (r2_46 != 0)
                        goto label_15a228
                    
                    var_100 = ascensionrules::CStateProcessDefeatMonsterWithLessPower::SelectDefeatFromCenterRow
                    i_6 = i_3
                    CGameStateOptions::AddSimpleUserOption(r5_1.w, r1_51, 0xa040, "Defeat %s", 
                        var_100)
                    
                    if (*(*(r5_1 + 0x24c) + 0xa8) s>= 1)
                        var_100 = ascensionrules::CStateProcessDefeatMonsterWithLessPower::SelectDefeatFromCenterRowIntoPlay
                        i_6 = i_3
                        CGameStateOptions::AddSimpleUserOption(r5_1.w, *r6_6, 0xa047, 
                            "Defeat %s into Play", var_100)
                    
                    goto label_15a37c
                
                if (r0 u>= 0x1f && r2_46 != 0)
                    r6_6 = r0_75 + 8
                    r1_51 = *r6_6
                label_15a228:
                    var_100 = ascensionrules::CStateProcessDefeatMonsterWithLessPower::SelectDefeatFromCenterRow
                    i_6 = i_3
                    CGameStateOptions::AddSimpleUserOption(r5_1.w, r1_51, 0xa049, "Defeat %s", 
                        var_100)
                    
                    if (r0 u<= 0x1e && *(*(r5_1 + 0x24c) + 0xa8) s>= 1)
                        var_100 = ascensionrules::CStateProcessDefeatMonsterWithLessPower::SelectDefeatFromCenterRowIntoPlay
                        i_6 = i_3
                        CGameStateOptions::AddSimpleUserOption(r5_1.w, *r6_6, 0xa047, 
                            "Defeat %s into Play", var_100)
                    
                    goto label_15a37c
                
                if (zx.d(*(r0_76 + 0xc6)) == 0)
                label_15a2f8:
                    var_100 = ascensionrules::CStateProcessDefeatMonsterWithLessPower::SelectDefeatTrophyFromCenterRow
                    i_6 = i_3
                    CGameStateOptions::AddSimpleUserOption(r5_1.w, *(r0_75 + 8), 0xa045, 
                        "Defeat %s", var_100)
                label_15a37c:
                    
                    if (r0 u>= 2 && memchr(r9_2 + 0x284, 3, __n) != 0
                            && (r0 u< 0x1f || zx.d(*var_f0) == 0))
                        var_100 = ascensionrules::CStateProcessDefeatMonsterWithLessPower::SelectDefeatFromCenterRowToDiscardPile
                        i_6 = i_3
                        CGameStateOptions::AddSimpleUserOption(r5_1.w, *(r0_75 + 8), 0xa043, 
                            "Defeat %s to Discard Pile", var_100)
                else
                    void* r2_47 = *(r5_1 + 0x24c)
                    int32_t* r1_54 = *(r2_47 + 0x60)
                    int32_t r2_48 = *(r2_47 + 0x64)
                    
                    if (r1_54 == r2_48)
                        goto label_15a2f8
                    
                    int32_t r3_15 = 0
                    
                    do
                        void* r6_8 = *r1_54
                        r1_54 = &r1_54[1]
                        int32_t r6_10 = *(*(r6_8 + 0x10) + 0xc)
                        
                        if (r6_10 == r0_76)
                            goto label_15a3e4
                        
                        int32_t temp0_3 = 0
                        void* j_2 = r6_10 - r0_76
                        
                        while (j_2 != 0)
                            j_2 u>>= 1
                            temp0_3 += 1
                        
                        r3_15 |= (0x20 - temp0_3) u>> 5
                    while (r2_48 != r1_54)
                    
                    if ((r3_15 & 1) == 0)
                        goto label_15a2f8
    
label_15a3e4:

if (zx.d(*(r5_1 + 0x255)) != 0)
label_15a3fc:
    void* r0_95 = *(r5_1 + 0x4a8)
    
    if (r0_95 != 0)
        operator delete[](r0_95)
        *(r5_1 + 0x4a8) = 0
    
    uint32_t r0_98
    int32_t r1_58
    r1_58:r0_98 = mulu.dp.d(*(*(r4 + 0xa4c) + 0x18), 0x34)
    
    if (r1_58 != 0)
        r1_58 = 1
    
    if (r1_58 != 0)
        r0_98 = 0xffffffff
    
    int32_t r0_99 = operator new[](r0_98)
    *(r5_1 + 0x4a8) = r0_99
    int32_t r2_50 = *(r5_1 + 0x24c)
    int32_t var_d8_1 = 8
    int32_t var_d4_1 = 0
    void* __offset(vtable_for_ascension::CEventQueryCardDefeatAttributes, 0x8) var_dc =
        _vtable_for_ascension::CEventQueryCardDefeatAttributes + 8
    int32_t var_90_1 = r2_50
    int32_t var_8c_1 = 0
    int32_t var_88_1 = r0_99
    void* r2_51 = *(r4 + 0xa4c)
    
    for (int32_t* i_4 = *(r2_51 + 0xc); i_4 != *(r2_51 + 0x10); i_4 = &i_4[1])
        int32_t r1_59 = *i_4
        
        if (r1_59 != 0)
            void* r0_101 = *(r1_59 + 0xc)
            
            if (*(r0_101 + 0x88) == 3 && (zx.d(*(r0_101 + 0xc5)) == 0 || zx.d(*(r5_1 + 0x255)) != 0
                    || zx.d(*(r2 + 0xb34)) != 0))
                int32_t r3_22 = *(r5_1 + 0x250)
                bool cond:16_1 = r3_22 s> 1
                
                if (r3_22 s>= 1)
                    cond:16_1 = *(r0_101 + 0xa0) s> r3_22
                
                if (not(cond:16_1))
                    ascension::CEventQueryCardDefeatAttributes::AddQueryCard(&var_dc, r1_59)
                    r2_51 = *(r2 + 0xa4c)
    
    ascension::CWorld::HandleQuery(r2)
    
    if (var_8c_1 s>= 1)
        int32_t r3_23 = 0
        int32_t* r1_61 = *(r5_1 + 0x4a8) + 0xc
        
        do
            r3_23 += 1
            
            if (*r1_61 s<= 0xffffffff)
                *r1_61 = 0
            
            r1_61 = &r1_61[0xd]
        while (r3_23 s< var_8c_1)
    
    *(r5_1 + 0x4a4) = var_8c_1
    void* r2_53 = *(r2 + 0xa4c)
    void** i_5 = *(r2_53 + 0xc)
    
    if (i_5 != *(r2_53 + 0x10))
        int32_t r8_3 = 0
        
        do
            void* i_8 = *i_5
            
            if (i_8 != 0)
                void* r0_109 = *(i_8 + 0xc)
                
                if (*(r0_109 + 0x88) == 3 && (zx.d(*(r0_109 + 0xc5)) == 0
                        || zx.d(*(r5_1 + 0x255)) != 0 || zx.d(*(r2 + 0xb34)) != 0))
                    int32_t r1_67 = *(r5_1 + 0x250)
                    bool cond:18_1 = r1_67 s> 1
                    
                    if (r1_67 s>= 1)
                        cond:18_1 = *(r0_109 + 0xa0) s> r1_67
                    
                    if (not(cond:18_1))
                        var_100 = ascensionrules::CStateProcessDefeatMonsterWithLessPower::SelectDefeatFromTheVoid
                        i_6 = i_8
                        CGameStateOptions::AddSimpleUserOption(r5_1.w, *(i_8 + 8), 0xa042, 
                            "Defeat %s", var_100)
                        
                        if (r0 u< 0x1f || zx.d(*var_f0) == 0)
                            if (*(*(r5_1 + 0x24c) + 0xa8) s>= 1)
                                var_100 = ascensionrules::CStateProcessDefeatMonsterWithLessPower::SelectDefeatFromTheVoidIntoPlay
                                i_6 = i_8
                                CGameStateOptions::AddSimpleUserOption(r5_1.w, *(i_8 + 8), 0xa048, 
                                    "Defeat %s into Play", var_100)
                            
                            void* r0_119 = *(r5_1 + 0x4a8) + r8_3 * 0x34
                            
                            if (memchr(r0_119 + 0x1c, 3, *(r0_119 + 0x18)) != 0)
                                var_100 = ascensionrules::CStateProcessDefeatMonsterWithLessPower::SelectDefeatFromTheVoidToDiscardPile
                                i_6 = i_8
                                CGameStateOptions::AddSimpleUserOption(r5_1.w, *(i_8 + 8), 0xa044, 
                                    "Defeat %s to Discard Pile", var_100)
                        
                        r8_3 += 1
                        r2_53 = *(r2 + 0xa4c)
            
            i_5 = &i_5[1]
        while (i_5 != *(r2_53 + 0x10))
    
    ascension::CEvent::~CEvent()
else if ((r0 u> 0x19 || zx.d(*(r5_1 + 0x254)) == 0)
        && (zx.d(*(r4 + 0xb34)) != 0 || *(r4 + 0xb38) s>= 1) && *(*(r4 + 0xa4c) + 0x18) s>= 1)
    goto label_15a3fc

int32_t entry_r1

if (zx.d(*(r5_1 + 0x257)) == 0)
    (*(*r5_1 + 0x34))(r5_1, entry_r1, *(r5_1 + 0x24c), "Defeat a Monster", var_100, i_6, 
        _vtable_for_ascension::CEventQueryCardDefeatAttributes + 8, entry_r1, var_f0, arg1, r2, 
        var_e4, r0)
else
    int32_t var_fc = 0
    CGameStateOptions::AddSimpleUserOption(r5_1.w, 0, 0xa0d1, "Add Card To Dreamscape", 
        ascensionrules::CStateProcessDefeatMonsterWithLessPower::SelectAddCardToDreamscape)
    (*(*r5_1 + 0x34))(r5_1, entry_r1, *(r5_1 + 0x24c), "Defeat a Monster or Add a Card")
ascension::CEvent::~CEvent()
int32_t r0_137 = *__stack_chk_guard

if (r0_137 == r1)
    return r0_137 - r1

__stack_chk_fail()
noreturn
