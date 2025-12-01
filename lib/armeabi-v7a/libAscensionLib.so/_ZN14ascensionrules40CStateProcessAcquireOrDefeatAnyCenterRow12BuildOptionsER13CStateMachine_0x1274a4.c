// 函数: _ZN14ascensionrules40CStateProcessAcquireOrDefeatAnyCenterRow12BuildOptionsER13CStateMachine
// 地址: 0x1274a4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* r0_1 = *(arg1 + 0x24c)
int32_t r6 = *(r0_1 + 4)
int32_t r9 = *(r0_1 + 0x8c)

if (zx.d(*(r6 + 0xb3d)) != 0)
    r9 += *(r6 + 0xb48)

int32_t var_80 = 6
int32_t var_7c = 0
void* __offset(vtable_for_ascension::CEventQueryCardAcquireAttributes, 0x8) var_84 =
    _vtable_for_ascension::CEventQueryCardAcquireAttributes + 8
void* var_38 = r0_1
int32_t var_34 = 0
void* __offset(CStateMachine, 0x260) var_30 = arg1 + 0x260
int32_t var_d8 = 8
int32_t var_d4 = 0
void* __offset(vtable_for_ascension::CEventQueryCardDefeatAttributes, 0x8) var_dc =
    _vtable_for_ascension::CEventQueryCardDefeatAttributes + 8
void* var_90 = r0_1
int32_t var_8c = 0
void* __offset(CStateMachine, 0xaa0) var_88 = arg1 + 0xaa0

if (zx.d(*(arg1 + 0x258)) != 0)
    for (void** i = *(r6 + 0xa30); i != *(r6 + 0xa34); i = &i[1])
        void* r0_5 = *i
        
        if (*(r0_5 + 0x10) != 0)
            void* r1_3 = *(r0_5 + 0xc)
            int32_t r2_2 = *(r1_3 + 0x88)
            
            if (r2_2 == 3)
                if (zx.d(*(arg1 + 0xced)) == 0)
                    int32_t r2_7 = *(arg1 + 0x250)
                    bool cond:0_1 = r2_7 s> 1
                    
                    if (r2_7 s>= 1)
                        cond:0_1 = *(r1_3 + 0xa0) s> r2_7
                    
                    if (not(cond:0_1))
                        ascension::CEventQueryCardDefeatAttributes::AddQueryCard(&var_dc, 
                            *(r0_5 + 0x14))
            else if (r2_2 == 1 && zx.d(*(arg1 + 0xcec)) == 0 && zx.d(*(arg1 + 0x255)) != 0)
                int32_t r2_5 = *(arg1 + 0x250)
                bool cond:1_1 = r2_5 s> 1
                
                if (r2_5 s>= 1)
                    cond:1_1 = *(r1_3 + 0x98) s> r2_5
                
                if (not(cond:1_1))
                    ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_84, 
                        *(r0_5 + 0x14), 6)

if (zx.d(*(arg1 + 0x257)) != 0)
    for (int32_t i_1 = 0; i_1 u< 7; i_1 += 1)
        int32_t r0_11 = ascension::CWorld::GetCenterRowCard(r6)
        
        if (r0_11 != 0)
            int32_t* r0_12 = *(r0_11 + 0xc)
            
            switch (r0_12[0x22] - 1)
                case 0
                    if (zx.d(*(arg1 + 0xcec)) == 0 && zx.d(*(arg1 + 0x255)) != 0)
                        int32_t r2_14 = *(arg1 + 0x250)
                        int32_t r3_3
                        
                        if (r2_14 s>= 1)
                            r3_3 = 0x98
                            
                            if (*(r6 + 0x30) u< 0x14)
                                r3_3 = 0x9c
                        
                        if (r2_14 s< 1 || *(r0_12 + r3_3) s<= r2_14)
                            ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_84, 
                                r0_11, 7)
                case 1
                    if (zx.d(*(arg1 + 0xcec)) == 0 && zx.d(*(arg1 + 0x256)) != 0)
                        int32_t r2_17 = *(arg1 + 0x250)
                        int32_t r3_6
                        
                        if (r2_17 s>= 1)
                            r3_6 = 0x98
                            
                            if (*(r6 + 0x30) u< 0x14)
                                r3_6 = 0x9c
                        
                        if (r2_17 s< 1 || *(r0_12 + r3_6) s<= r2_17)
                            ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_84, 
                                r0_11, 7)
                case 2
                    if (zx.d(*(arg1 + 0xced)) == 0)
                        int32_t r2_19 = *(arg1 + 0x250)
                        bool cond:3_1 = r2_19 s> 1
                        
                        if (r2_19 s>= 1)
                            cond:3_1 = r0_12[0x28] s> r2_19
                        
                        if (not(cond:3_1))
                            ascension::CEventQueryCardDefeatAttributes::AddQueryCard(&var_dc, r0_11)
                case 7
                    if (*(r6 + 0x30) u>= 0x15 && zx.d(*(arg1 + 0xcec)) == 0
                            && zx.d(*(arg1 + 0x255)) != 0 && zx.d(*(arg1 + 0x256)) != 0)
                        int32_t r0_23 = *(arg1 + 0x250)
                        bool cond:7_1 = r0_23 s> 1
                        
                        if (r0_23 s>= 1)
                            cond:7_1 = *(r0_11 + 0x14) s> r0_23
                        
                        if (not(cond:7_1))
                            ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_84, 
                                r0_11, 7)

if (zx.d(*(arg1 + 0x259)) != 0 && zx.d(*(arg1 + 0xcec)) == 0)
    void* r0_28 = *(*(arg1 + 0x24c) + 0x44)
    
    if (r0_28 != 0)
        int32_t* i_2 = *(r0_28 + 0xc)
        
        if (i_2 != *(r0_28 + 0x10))
            do
                int32_t r1_10 = *i_2
                int32_t r0_31 = *(*(r1_10 + 0xc) + 0x88)
                
                if (r0_31 == 9)
                    ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_84, r1_10, 0x14)
                else if (r0_31 == 2)
                    ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_84, r1_10, 0x14)
                else if (r0_31 == 1)
                    ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_84, r1_10, 0x14)
                
                i_2 = &i_2[1]
            while (i_2 != *(*(*(arg1 + 0x24c) + 0x44) + 0x10))

if (zx.d(*(arg1 + 0x257)) != 0 && zx.d(*(arg1 + 0xced)) == 0)
    void* r2_22 = *(arg1 + 0x24c)
    
    for (int32_t* i_3 = *(r2_22 + 0x54); i_3 != *(r2_22 + 0x58); i_3 = &i_3[1])
        void* r1_11 = *i_3
        int32_t r0_41 = *(r1_11 + 0x4c)
        
        if (r0_41 - *(r1_11 + 0x48) == 4 && zx.d(*(*(*(r1_11 + 0x10) + 0xc) + 0xcb)) != 0)
            int32_t r1_15 = *(r0_41 - 4)
            void* r0_42 = *(r1_15 + 0xc)
            
            if (*(r0_42 + 0x88) == 3)
                int32_t r3_15 = *(arg1 + 0x250)
                bool cond:8_1 = r3_15 s> 1
                
                if (r3_15 s>= 1)
                    cond:8_1 = *(r0_42 + 0xa0) s> r3_15
                
                if (not(cond:8_1))
                    ascension::CEventQueryCardDefeatAttributes::AddQueryCard(&var_dc, r1_15)
                    r2_22 = *(arg1 + 0x24c)

ascension::CWorld::HandleQuery(r6)

if (var_34 s>= 1)
    void* __offset(CStateMachine, 0x26c) r1_16 = arg1 + 0x26c
    int32_t r3_16 = 0
    
    do
        r3_16 += 1
        
        if (*r1_16 s<= 0xffffffff)
            *r1_16 = 0
        
        r1_16 += 0x44
    while (r3_16 s< var_34)

*(arg1 + 0x25c) = var_34
ascension::CWorld::HandleQuery(r6)

if (var_8c s>= 1)
    void* __offset(CStateMachine, 0xaac) r1_17 = arg1 + 0xaac
    int32_t r3_17 = 0
    
    do
        r3_17 += 1
        
        if (*r1_17 s<= 0xffffffff)
            *r1_17 = 0
        
        r1_17 += 0x34
    while (r3_17 s< var_8c)

*(arg1 + 0xa9c) = var_8c
int32_t var_170 = 0
void* var_190
void* i_12
int32_t var_16c

if (zx.d(*(arg1 + 0x258)) == 0)
    var_16c = 0
else
    int32_t* i_4 = *(r6 + 0xa30)
    var_16c = 0
    
    if (i_4 != *(r6 + 0xa34))
        var_16c = 0
        var_170 = 0
        
        do
            void* i_17 = *i_4
            
            if (*(i_17 + 0x10) != 0)
                void* r2_24 = *(i_17 + 0xc)
                int32_t r0_53 = *(r2_24 + 0x88)
                
                if (r0_53 == 3)
                    if (zx.d(*(arg1 + 0xced)) == 0)
                        int32_t r0_75 = *(arg1 + 0x250)
                        bool cond:9_1 = r0_75 s> 1
                        
                        if (r0_75 s>= 1)
                            cond:9_1 = *(r2_24 + 0xa0) s> r0_75
                        
                        if (not(cond:9_1))
                            var_170 += 1
                            
                            if (zx.d(*(r2_24 + 0xc5)) == 0)
                                var_190 = ascensionrules::CStateProcessAcquireOrDefeatAnyCenterRow::SelectDefeatFromKingdom
                                i_12 = i_17
                                CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_17 + 8), 0xa041, 
                                    "Defeat %s", var_190)
                            else if (zx.d(*(r2_24 + 0xc6)) == 0)
                            label_127c20:
                                var_190 = ascensionrules::CStateProcessAcquireOrDefeatAnyCenterRow::SelectDefeatTrophyFromKingdom
                                i_12 = i_17
                                CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_17 + 8), 0xa045, 
                                    "Defeat %s", var_190)
                            else
                                void* r0_78 = *(arg1 + 0x24c)
                                int32_t* r3_18 = *(r0_78 + 0x60)
                                int32_t r0_79 = *(r0_78 + 0x64)
                                
                                if (r3_18 == r0_79)
                                    goto label_127c20
                                
                                int32_t r7_4 = 0
                                
                                do
                                    void* r1_25 = *r3_18
                                    r3_18 = &r3_18[1]
                                    int32_t r4_2 = *(*(r1_25 + 0x10) + 0xc)
                                    
                                    if (r4_2 == r2_24)
                                        goto label_127bf4
                                    
                                    int32_t temp0_1 = 0
                                    void* j = r4_2 - r2_24
                                    
                                    while (j != 0)
                                        j u>>= 1
                                        temp0_1 += 1
                                    
                                    r7_4 |= (0x20 - temp0_1) u>> 5
                                while (r0_79 != r3_18)
                                
                                if ((r7_4 & 1) == 0)
                                    goto label_127c20
                                
                            label_127bf4:
                                var_190 = ascensionrules::CStateProcessAcquireOrDefeatAnyCenterRow::SelectDefeatFromKingdom
                                i_12 = i_17
                                CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_17 + 8), 0xa041, 
                                    "Defeat %s", var_190)
                else if (r0_53 == 1 && zx.d(*(arg1 + 0xcec)) == 0 && zx.d(*(arg1 + 0x255)) != 0)
                    int32_t r0_56 = *(arg1 + 0x250)
                    bool cond:12_1 = r0_56 s> 1
                    
                    if (r0_56 s>= 1)
                        cond:12_1 = *(r2_24 + 0x98) s> r0_56
                    
                    if (not(cond:12_1))
                        void* r4_1 = arg1 + var_16c * 0x44
                        int32_t r7_3 = *(r4_1 + 0x2a0)
                        uint32_t __n = *(r4_1 + 0x27c)
                        
                        if (r7_3 == 0xffffffff)
                            var_190 = ascensionrules::CStateProcessAcquireOrDefeatAnyCenterRow::SelectAcquireFromKingdomToDiscard
                            i_12 = i_17
                            CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_17 + 8), 0xa020, 
                                "Acquire %s", var_190)
                        
                        if (memchr(r4_1 + 0x280, 1, __n) != 0
                                && (r7_3 == 0xffffffff || zx.d(*(r4_1 + r7_3 + 0x280)) == 1))
                            var_190 = ascensionrules::CStateProcessAcquireOrDefeatAnyCenterRow::SelectAcquireFromKingdomToHand
                            i_12 = i_17
                            CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_17 + 8), 0xa024, 
                                "Acquire %s to Hand", var_190)
                        
                        var_16c += 1
                        
                        if (memchr(r4_1 + 0x280, 2, __n) != 0
                                && (r7_3 == 0xffffffff || zx.d(*(r4_1 + r7_3 + 0x280)) == 2))
                            var_190 = ascensionrules::CStateProcessAcquireOrDefeatAnyCenterRow::SelectAcquireFromKingdomToTopOfDeck
                            i_12 = i_17
                            CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_17 + 8), 0xa022, 
                                "Acquire %s to Top of Deck", var_190)
            
            i_4 = &i_4[1]
        while (i_4 != *(r6 + 0xa34))

void var_164
char var_161
int32_t var_160
void* __offset(vtable_for_ascension::CEventQueryCardDefeatAttributes, 0x8) str

if (zx.d(*(arg1 + 0x257)) != 0)
    int32_t r6_1 = r6
    
    for (void* i_5 = nullptr; i_5 u< 7; i_5 += 1)
        void* i_13 = ascension::CWorld::GetCenterRowCard(r6_1)
        
        if (i_13 != 0)
            int32_t* r0_85 = *(i_13 + 0xc)
            
            switch (r0_85[0x22] - 1)
                case 0
                    if (zx.d(*(arg1 + 0xcec)) == 0 && zx.d(*(arg1 + 0x255)) != 0)
                        int32_t r2_27 = *(arg1 + 0x250)
                        int32_t r1_40 = *(r6 + 0x30)
                        int32_t r3_19
                        
                        if (r2_27 s>= 1)
                            r3_19 = 0x98
                            
                            if (r1_40 u< 0x14)
                                r3_19 = 0x9c
                        
                        if (r2_27 s< 1 || *(r0_85 + r3_19) s<= r2_27)
                            int32_t r0_87 = var_16c * 0x11
                            var_16c += 1
                            void* r4_3 = arg1 + (r0_87 << 2)
                            uint32_t __n_1 = *(r4_3 + 0x27c)
                            int32_t r8_2 = *(r4_3 + 0x2a0)
                            
                            if (r1_40 u< 3)
                                var_190 = ascensionrules::CStateProcessAcquireOrDefeatAnyCenterRow::SelectAcquireToDiscard
                                i_12 = i_5
                                CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_13 + 8), 0xa020, 
                                    "Acquire %s", var_190)
                                
                                if (*(r6 + 0x30) u>= 2)
                                    if (memchr(r4_3 + 0x280, 1, __n_1) != 0 && (r8_2 == 0xffffffff
                                            || zx.d(*(r4_3 + r8_2 + 0x280)) == 1))
                                        var_190 = ascensionrules::CStateProcessAcquireOrDefeatAnyCenterRow::SelectAcquireToHand
                                        i_12 = i_5
                                        CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_13 + 8), 
                                            0xa024, "Acquire %s to Hand", var_190)
                                    
                                    if (memchr(r4_3 + 0x280, 2, __n_1) != 0)
                                        var_190 = ascensionrules::CStateProcessAcquireOrDefeatAnyCenterRow::SelectAcquireToTopOfDeck
                                        i_12 = i_5
                                        CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_13 + 8), 
                                            0xa022, "Acquire %s to Top of Deck", var_190)
                                    
                                    if (memchr(r4_3 + 0x280, 4, __n_1) != 0)
                                        var_190 = ascensionrules::CStateProcessAcquireOrDefeatAnyCenterRow::SelectAcquireIntoPlay
                                        i_12 = i_5
                                        CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_13 + 8), 
                                            0xa023, "Acquire %s into Play", var_190)
                            else
                                if (r8_2 == 0xffffffff)
                                    i_12 = i_5
                                    CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_13 + 8), 
                                        0xa020, "Acquire %s", 
                                        ascensionrules::CStateProcessAcquireOrDefeatAnyCenterRow::SelectAcquireToDiscard)
                                
                                if (memchr(r4_3 + 0x280, 1, __n_1) != 0 &&
                                        (r8_2 == 0xffffffff || zx.d(*(r4_3 + r8_2 + 0x280)) == 1))
                                    i_12 = i_5
                                    CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_13 + 8), 
                                        0xa024, "Acquire %s to Hand", 
                                        ascensionrules::CStateProcessAcquireOrDefeatAnyCenterRow::SelectAcquireToHand)
                                
                                if (memchr(r4_3 + 0x280, 2, __n_1) != 0 &&
                                        (r8_2 == 0xffffffff || zx.d(*(r4_3 + r8_2 + 0x280)) == 2))
                                    i_12 = i_5
                                    CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_13 + 8), 
                                        0xa022, "Acquire %s to Top of Deck", 
                                        ascensionrules::CStateProcessAcquireOrDefeatAnyCenterRow::SelectAcquireToTopOfDeck)
                                
                                var_190 = &var_164
                                
                                if (ascension::CEventQueryCardAcquireAttributes::AcquireCardEntry::FindAcquireLocation(
                                        r4_3.b + 0x60, 4, &var_160, &var_161) != 0
                                        && (r8_2 == 0xffffffff || r8_2 == var_160)
                                        && r9 s>= zx.d(var_161))
                                    var_190 = ascensionrules::CStateProcessAcquireOrDefeatAnyCenterRow::SelectAcquireIntoPlay
                                    i_12 = i_5
                                    CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_13 + 8), 
                                        0xa023, "Acquire %s into Play", var_190)
                case 1
                    if (zx.d(*(arg1 + 0xcec)) == 0 && zx.d(*(arg1 + 0x256)) != 0)
                        int32_t r2_33 = *(arg1 + 0x250)
                        int32_t r1_49 = *(r6 + 0x30)
                        int32_t r3_21
                        
                        if (r2_33 s>= 1)
                            r3_21 = 0x98
                            
                            if (r1_49 u< 0x14)
                                r3_21 = 0x9c
                        
                        if (r2_33 s< 1 || *(r0_85 + r3_21) s<= r2_33)
                            int32_t r0_105 = var_16c * 0x11
                            var_16c += 1
                            void* r9_2 = arg1 + (r0_105 << 2)
                            uint32_t __n_2 = *(r9_2 + 0x27c)
                            int32_t r4_4 = *(r9_2 + 0x2a0)
                            
                            if (r1_49 u< 3)
                                var_190 = ascensionrules::CStateProcessAcquireOrDefeatAnyCenterRow::SelectAcquireToDiscard
                                i_12 = i_5
                                CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_13 + 8), 0xa020, 
                                    "Acquire %s", var_190)
                                
                                if (*(r6 + 0x30) u>= 2)
                                    if (memchr(r9_2 + 0x280, 1, __n_2) != 0 && (r4_4 == 0xffffffff
                                            || zx.d(*(r9_2 + r4_4 + 0x280)) == 1))
                                        var_190 = ascensionrules::CStateProcessAcquireOrDefeatAnyCenterRow::SelectAcquireToHand
                                        i_12 = i_5
                                        CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_13 + 8), 
                                            0xa024, "Acquire %s to Hand", var_190)
                                    
                                    if (memchr(r9_2 + 0x280, 2, __n_2) != 0)
                                        var_190 = ascensionrules::CStateProcessAcquireOrDefeatAnyCenterRow::SelectAcquireToTopOfDeck
                                        i_12 = i_5
                                        CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_13 + 8), 
                                            0xa022, "Acquire %s to Top of Deck", var_190)
                                    
                                    if (memchr(r9_2 + 0x280, 4, __n_2) != 0)
                                        var_190 = ascensionrules::CStateProcessAcquireOrDefeatAnyCenterRow::SelectAcquireIntoPlay
                                        i_12 = i_5
                                        CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_13 + 8), 
                                            0xa023, "Acquire %s into Play", var_190)
                            else
                                if (r4_4 == 0xffffffff)
                                    i_12 = i_5
                                    CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_13 + 8), 
                                        0xa020, "Acquire %s", 
                                        ascensionrules::CStateProcessAcquireOrDefeatAnyCenterRow::SelectAcquireToDiscard)
                                
                                if (memchr(r9_2 + 0x280, 1, __n_2) != 0 &&
                                        (r4_4 == 0xffffffff || zx.d(*(r9_2 + r4_4 + 0x280)) == 1))
                                    i_12 = i_5
                                    CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_13 + 8), 
                                        0xa024, "Acquire %s to Hand", 
                                        ascensionrules::CStateProcessAcquireOrDefeatAnyCenterRow::SelectAcquireToHand)
                                
                                if (memchr(r9_2 + 0x280, 2, __n_2) != 0 &&
                                        (r4_4 == 0xffffffff || zx.d(*(r9_2 + r4_4 + 0x280)) == 2))
                                    i_12 = i_5
                                    CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_13 + 8), 
                                        0xa022, "Acquire %s to Top of Deck", 
                                        ascensionrules::CStateProcessAcquireOrDefeatAnyCenterRow::SelectAcquireToTopOfDeck)
                                
                                var_190 = &var_164
                                
                                if (ascension::CEventQueryCardAcquireAttributes::AcquireCardEntry::FindAcquireLocation(
                                        r9_2.b + 0x60, 4, &var_160, &var_161) != 0
                                        && (r4_4 == 0xffffffff || r4_4 == var_160)
                                        && r9 s>= zx.d(var_161))
                                    var_190 = ascensionrules::CStateProcessAcquireOrDefeatAnyCenterRow::SelectAcquireIntoPlay
                                    i_12 = i_5
                                    CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_13 + 8), 
                                        0xa023, "Acquire %s into Play", var_190)
                case 2
                    if (zx.d(*(arg1 + 0xced)) == 0)
                        int32_t r1_56 = *(arg1 + 0x250)
                        bool cond:10_1 = r1_56 s> 1
                        
                        if (r1_56 s>= 1)
                            cond:10_1 = r0_85[0x28] s> r1_56
                        
                        if (not(cond:10_1))
                            void* r4_5 = arg1 + var_170 * 0x34
                            var_170 += 1
                            uint32_t __n_6 = *(r4_5 + 0xab8)
                            
                            if (zx.d(*(r0_85 + 0xc5)) == 0)
                                var_190 = ascensionrules::CStateProcessAcquireOrDefeatAnyCenterRow::SelectMonsterToDefeat
                                i_12 = i_13
                                CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_13 + 8), 0xa040, 
                                    "Defeat %s", var_190)
                                
                                if (*(*(arg1 + 0x24c) + 0xa8) s>= 1)
                                    var_190 = ascensionrules::CStateProcessAcquireOrDefeatAnyCenterRow::SelectDefeatIntoPlay
                                    i_12 = i_13
                                    CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_13 + 8), 
                                        0xa047, "Defeat %s into Play", var_190)
                                
                                goto label_128210
                            
                            if (zx.d(*(r0_85 + 0xc6)) == 0)
                            label_1280fc:
                                var_190 = ascensionrules::CStateProcessAcquireOrDefeatAnyCenterRow::SelectDefeatTrophy
                                i_12 = i_13
                                CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_13 + 8), 0xa045, 
                                    "Defeat %s", var_190)
                            label_128210:
                                
                                if (*(r6 + 0x30) u>= 2 && memchr(r4_5 + 0xabc, 3, __n_6) != 0)
                                    var_190 = ascensionrules::CStateProcessAcquireOrDefeatAnyCenterRow::SelectDefeatToDiscardPile
                                    i_12 = i_13
                                    CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_13 + 8), 
                                        0xa043, "Defeat %s to Discard Pile", var_190)
                            else
                                void* r2_42 = *(arg1 + 0x24c)
                                int32_t* r1_59 = *(r2_42 + 0x60)
                                int32_t r2_43 = *(r2_42 + 0x64)
                                
                                if (r1_59 == r2_43)
                                    goto label_1280fc
                                
                                int32_t r3_23 = 0
                                
                                do
                                    void* r6_2 = *r1_59
                                    r1_59 = &r1_59[1]
                                    int32_t r6_4 = *(*(r6_2 + 0x10) + 0xc)
                                    
                                    if (r6_4 == r0_85)
                                        goto label_12849c
                                    
                                    int32_t temp0_2 = 0
                                    void* j_1 = r6_4 - r0_85
                                    
                                    while (j_1 != 0)
                                        j_1 u>>= 1
                                        temp0_2 += 1
                                    
                                    r3_23 |= (0x20 - temp0_2) u>> 5
                                while (r2_43 != r1_59)
                                
                                if ((r3_23 & 1) == 0)
                                    goto label_1280fc
                case 7
                    if (*(r6 + 0x30) u>= 0x15 && zx.d(*(arg1 + 0xcec)) == 0
                            && zx.d(*(arg1 + 0x255)) != 0 && zx.d(*(arg1 + 0x256)) != 0)
                        int32_t r0_128 = *(arg1 + 0x250)
                        bool cond:20_1 = r0_128 s> 1
                        
                        if (r0_128 s>= 1)
                            cond:20_1 = *(i_13 + 0x14) s> r0_128
                        
                        if (not(cond:20_1))
                            var_190 = ascensionrules::CStateProcessAcquireOrDefeatAnyCenterRow::SelectAcquirePortal
                            i_12 = i_5
                            CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_13 + 8), 0xa02d, 
                                "Acquire %s", var_190)
                            var_16c += 1
        
    label_12849c:
        r6_1 = r6
    
    if (*(r6_1 + 0xb30) s> 0)
        int32_t r2_51 = *(*(r6_1 + 0xa4c) + 0x18)
        
        if (r2_51 s>= 1 && zx.d(*(arg1 + 0xcec)) == 0 && zx.d(*(arg1 + 0x255)) != 0)
            void* r0_173 = *(arg1 + 0xce0)
            
            if (r0_173 != 0)
                operator delete[](r0_173)
                *(arg1 + 0xce0) = 0
                r2_51 = *(*(r6_1 + 0xa4c) + 0x18)
            
            uint32_t r0_175
            int32_t r1_74
            r1_74:r0_175 = mulu.dp.d(r2_51, 0x44)
            
            if (r1_74 != 0)
                r1_74 = 1
            
            if (r1_74 != 0)
                r0_175 = 0xffffffff
            
            int32_t r0_176 = operator new[](r0_175)
            *(arg1 + 0xce0) = r0_176
            int32_t r2_52 = *(arg1 + 0x24c)
            int32_t var_158_1 = 6
            int32_t var_154_1 = 0
            str = _vtable_for_ascension::CEventQueryCardAcquireAttributes + 8
            int32_t var_110_1 = r2_52
            int32_t var_10c_1 = 0
            int32_t var_108_1 = r0_176
            void* r2_53 = *(r6_1 + 0xa4c)
            int32_t* i_6 = *(r2_53 + 0xc)
            
            if (i_6 != *(r2_53 + 0x10))
                void* __offset(vtable_for_ascension::CEventQueryCardDefeatAttributes, 0x8)* 
                    var_184_1 = &str
                
                do
                    int32_t r1_75 = *i_6
                    
                    if (r1_75 != 0)
                        int32_t* r0_178 = *(r1_75 + 0xc)
                        
                        if (r0_178[0x22] == 1)
                            int32_t r3_26 = *(arg1 + 0x250)
                            int32_t r7_6
                            
                            if (r3_26 s>= 1)
                                r7_6 = 0x98
                                
                                if (*(r6_1 + 0x30) u< 0x14)
                                    r7_6 = 0x9c
                            
                            if (r3_26 s< 1 || *(r0_178 + r7_6) s<= r3_26)
                                ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&str, 
                                    r1_75, 9)
                                r2_53 = *(r6_1 + 0xa4c)
                    
                    i_6 = &i_6[1]
                while (i_6 != *(r2_53 + 0x10))
            
            void* __offset(vtable_for_ascension::CEventQueryCardDefeatAttributes, 0x8)* var_184_2 =
                &str
            ascension::CWorld::HandleQuery(r6_1)
            
            if (var_10c_1 s>= 1)
                int32_t r3_28 = 0
                int32_t* r1_77 = *(arg1 + 0xce0) + 0xc
                
                do
                    r3_28 += 1
                    
                    if (*r1_77 s<= 0xffffffff)
                        *r1_77 = 0
                    
                    r1_77 = &r1_77[0x11]
                while (r3_28 s< var_10c_1)
            
            *(arg1 + 0xcdc) = var_10c_1
            void* r0_184 = *(r6_1 + 0xa4c)
            int32_t* i_7 = *(r0_184 + 0xc)
            
            if (i_7 != *(r0_184 + 0x10))
                int32_t var_17c_2 = 0
                
                do
                    void* i_14 = *i_7
                    
                    if (i_14 != 0)
                        int32_t* r0_186 = *(i_14 + 0xc)
                        
                        if (r0_186[0x22] == 1)
                            int32_t r1_79 = *(arg1 + 0x250)
                            int32_t r2_55
                            
                            if (r1_79 s>= 1)
                                r2_55 = 0x98
                                
                                if (*(r6_1 + 0x30) u< 0x14)
                                    r2_55 = 0x9c
                            
                            if (r1_79 s< 1 || *(r0_186 + r2_55) s<= r1_79)
                                void* r10_2 = *(arg1 + 0xce0) + var_17c_2 * 0x44
                                int32_t r6_8 = *(r10_2 + 0x40)
                                uint32_t __n_7 = *(r10_2 + 0x1c)
                                
                                if (r6_8 == 0xffffffff)
                                    i_12 = i_14
                                    CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_14 + 8), 
                                        0xa025, "Acquire %s", 
                                        ascensionrules::CStateProcessAcquireOrDefeatAnyCenterRow::SelectAcquireFromVoidToDiscard)
                                
                                if (memchr(r10_2 + 0x20, 1, __n_7) != 0 &&
                                        (r6_8 == 0xffffffff || zx.d(*(r10_2 + r6_8 + 0x20)) == 1))
                                    i_12 = i_14
                                    CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_14 + 8), 
                                        0xa028, "Acquire %s to Hand", 
                                        ascensionrules::CStateProcessAcquireOrDefeatAnyCenterRow::SelectAcquireFromVoidToHand)
                                
                                if (memchr(r10_2 + 0x20, 2, __n_7) != 0 &&
                                        (r6_8 == 0xffffffff || zx.d(*(r10_2 + r6_8 + 0x20)) == 2))
                                    i_12 = i_14
                                    CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_14 + 8), 
                                        0xa026, "Acquire %s to Top of Deck", 
                                        ascensionrules::CStateProcessAcquireOrDefeatAnyCenterRow::SelectAcquireFromVoidToTopOfDeck)
                                
                                var_190 = &var_164
                                var_17c_2 += 1
                                
                                if (ascension::CEventQueryCardAcquireAttributes::AcquireCardEntry::FindAcquireLocation(
                                        r10_2.b, 4, &var_160, &var_161) != 0
                                        && (r6_8 == 0xffffffff || r6_8 == var_160)
                                        && r9 s>= zx.d(var_161))
                                    var_190 = ascensionrules::CStateProcessAcquireOrDefeatAnyCenterRow::SelectAcquireFromVoidIntoPlay
                                    i_12 = i_14
                                    CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_14 + 8), 
                                        0xa027, "Acquire %s into Play", var_190)
                    
                    r6_1 = r6
                    i_7 = &i_7[1]
                while (i_7 != *(*(r6_1 + 0xa4c) + 0x10))
            
            ascension::CEvent::~CEvent()

if (zx.d(*(arg1 + 0x259)) != 0 && zx.d(*(arg1 + 0xcec)) == 0)
    void* r0_210 = *(*(arg1 + 0x24c) + 0x44)
    
    if (r0_210 != 0)
        void** i_8 = *(r0_210 + 0xc)
        
        if (i_8 != *(r0_210 + 0x10))
            do
                void* i_15 = *i_8
                void* r2_59 = *(i_15 + 0xc)
                int32_t r0_215 = *(r2_59 + 0x88)
                
                if (r0_215 == 9)
                    uint16_t r1_92 = *(i_15 + 8)
                    
                    if (zx.d(*(r2_59 + 0xd4)) == 0)
                        var_190 = ascensionrules::CStateProcessAcquireOrDefeatAnyCenterRow::SelectAcquireVisionFromDreamscape
                        i_12 = i_15
                        CGameStateOptions::AddSimpleUserOption(arg1.w, r1_92, 0xa02e, "Acquire %s", 
                            var_190)
                    else
                        var_190 = ascensionrules::CStateProcessAcquireOrDefeatAnyCenterRow::SelectAcquireOngoingVisionFromDreamscape
                        i_12 = i_15
                        CGameStateOptions::AddSimpleUserOption(arg1.w, r1_92, 0xa02f, "Acquire %s", 
                            var_190)
                    
                    var_16c += 1
                else if (r0_215 == 2)
                    void* r10_4 = arg1 + var_16c * 0x44
                    int32_t r0_233 = *(r10_4 + 0x2a0)
                    uint32_t __n_5 = *(r10_4 + 0x27c)
                    
                    if (r0_233 == 0xffffffff)
                        i_12 = i_15
                        CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_15 + 8), 0xa020, 
                            "Acquire %s", 
                            ascensionrules::CStateProcessAcquireOrDefeatAnyCenterRow::SelectAcquireFromDreamscape)
                    
                    if (memchr(r10_4 + 0x280, 1, __n_5) != 0
                            && (r0_233 == 0xffffffff || zx.d(*(r10_4 + r0_233 + 0x280)) == 1))
                        i_12 = i_15
                        CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_15 + 8), 0xa024, 
                            "Acquire %s to Hand", 
                            ascensionrules::CStateProcessAcquireOrDefeatAnyCenterRow::SelectAcquireFromDreamscapeToHand)
                    
                    if (memchr(r10_4 + 0x280, 2, __n_5) != 0
                            && (r0_233 == 0xffffffff || zx.d(*(r10_4 + r0_233 + 0x280)) == 2))
                        i_12 = i_15
                        CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_15 + 8), 0xa022, 
                            "Acquire %s to Top of Deck", 
                            ascensionrules::CStateProcessAcquireOrDefeatAnyCenterRow::SelectAcquireFromDreamscapeToTopOfDeck)
                    
                    var_190 = &var_164
                    
                    if (ascension::CEventQueryCardAcquireAttributes::AcquireCardEntry::FindAcquireLocation(
                            r10_4.b + 0x60, 4, &var_160, &var_161) != 0
                            && (r0_233 == 0xffffffff || r0_233 == var_160) && r9 s>= zx.d(var_161))
                        var_190 = ascensionrules::CStateProcessAcquireOrDefeatAnyCenterRow::SelectAcquireFromDreamscapeIntoPlay
                        i_12 = i_15
                        CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_15 + 8), 0xa023, 
                            "Acquire %s into play", var_190)
                    
                    var_16c += 1
                else if (r0_215 == 1)
                    void* r4_6 = arg1 + var_16c * 0x44
                    int32_t r10_3 = *(r4_6 + 0x2a0)
                    uint32_t __n_3 = *(r4_6 + 0x27c)
                    
                    if (r10_3 == 0xffffffff)
                        var_190 = ascensionrules::CStateProcessAcquireOrDefeatAnyCenterRow::SelectAcquireFromDreamscape
                        i_12 = i_15
                        CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_15 + 8), 0xa020, 
                            "Acquire %s", var_190)
                    
                    if (memchr(r4_6 + 0x280, 1, __n_3) != 0
                            && (r10_3 == 0xffffffff || zx.d(*(r4_6 + r10_3 + 0x280)) == 1))
                        var_190 = ascensionrules::CStateProcessAcquireOrDefeatAnyCenterRow::SelectAcquireFromDreamscapeToHand
                        i_12 = i_15
                        CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_15 + 8), 0xa024, 
                            "Acquire %s to Hand", var_190)
                    
                    if (memchr(r4_6 + 0x280, 2, __n_3) != 0
                            && (r10_3 == 0xffffffff || zx.d(*(r4_6 + r10_3 + 0x280)) == 2))
                        var_190 = ascensionrules::CStateProcessAcquireOrDefeatAnyCenterRow::SelectAcquireFromDreamscapeToTopOfDeck
                        i_12 = i_15
                        CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_15 + 8), 0xa022, 
                            "Acquire %s to Top of Deck", var_190)
                    
                    var_16c += 1
                
                i_8 = &i_8[1]
            while (i_8 != *(*(*(arg1 + 0x24c) + 0x44) + 0x10))

int32_t r10_5 = var_170
int32_t r0_300
void* const r3_40

if (zx.d(*(arg1 + 0x257)) == 0)
label_129130:
    r3_40 = &data_1bfacb
    
    if (zx.d(*(arg1 + 0x259)) != 0)
        r3_40 = " from your Dreamscape"
    
    r0_300 = 1
else
    if (zx.d(*(arg1 + 0xced)) == 0)
        void* r0_255 = *(arg1 + 0x24c)
        
        for (int32_t* i_9 = *(r0_255 + 0x54); i_9 != *(r0_255 + 0x58); i_9 = &i_9[1])
            void* i_16 = *i_9
            int32_t r1_99 = *(i_16 + 0x4c)
            
            if (r1_99 - *(i_16 + 0x48) == 4 && zx.d(*(*(*(i_16 + 0x10) + 0xc) + 0xcb)) != 0)
                void* r2_70 = *(*(r1_99 - 4) + 0xc)
                
                if (*(r2_70 + 0x88) == 3)
                    int32_t r1_102 = *(arg1 + 0x250)
                    bool cond:21_1 = r1_102 s> 1
                    
                    if (r1_102 s>= 1)
                        cond:21_1 = *(r2_70 + 0xa0) s> r1_102
                    
                    if (not(cond:21_1))
                        void* r3_32 = arg1 + r10_5 * 0x34
                        r10_5 += 1
                        uint32_t __n_8 = *(r3_32 + 0xab8)
                        uint32_t __n_4
                        
                        if (zx.d(*(r2_70 + 0xc5)) == 0)
                            __n_4 = __n_8
                            var_190 = ascensionrules::CStateProcessAcquireOrDefeatAnyCenterRow::SelectDefeatFromConstruct
                            i_12 = i_16
                            CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_16 + 8), 0xa040, 
                                "Defeat %s", var_190)
                            
                            if (*(*(arg1 + 0x24c) + 0xa8) s>= 1)
                                var_190 = ascensionrules::CStateProcessAcquireOrDefeatAnyCenterRow::SelectDefeatFromConstructIntoPlay
                                i_12 = i_16
                                CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_16 + 8), 0xa047, 
                                    "Defeat %s into Play", var_190)
                            
                            goto label_128cfc
                        
                        if (zx.d(*(r2_70 + 0xc6)) != 0)
                            int32_t* r3_33 = *(r0_255 + 0x60)
                            int32_t r0_256 = *(r0_255 + 0x64)
                            
                            if (r3_33 == r0_256)
                                goto label_128c54
                            
                            int32_t r7_9 = 0
                            
                            do
                                void* r1_110 = *r3_33
                                r3_33 = &r3_33[1]
                                int32_t r6_10 = *(*(r1_110 + 0x10) + 0xc)
                                
                                if (r6_10 == r2_70)
                                    goto label_128db0
                                
                                int32_t temp0_3 = 0
                                void* j_2 = r6_10 - r2_70
                                
                                while (j_2 != 0)
                                    j_2 u>>= 1
                                    temp0_3 += 1
                                
                                r7_9 |= (0x20 - temp0_3) u>> 5
                            while (r0_256 != r3_33)
                            
                            if ((r7_9 & 1) == 0)
                                goto label_128c54
                            
                        label_128db0:
                            var_190 = ascensionrules::CStateProcessAcquireOrDefeatAnyCenterRow::SelectDefeatFromConstruct
                            i_12 = i_16
                            CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_16 + 8), 0xa040, 
                                "Defeat %s", var_190)
                        else
                        label_128c54:
                            __n_4 = __n_8
                            var_190 = ascensionrules::CStateProcessAcquireOrDefeatAnyCenterRow::SelectDefeatTrophyFromConstruct
                            i_12 = i_16
                            CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_16 + 8), 0xa040, 
                                "Defeat %s", var_190)
                        label_128cfc:
                            
                            if (*(r6 + 0x30) u>= 2 && memchr(r3_32 + 0xabc, 3, __n_4) != 0)
                                var_190 = ascensionrules::CStateProcessAcquireOrDefeatAnyCenterRow::SelectDefeatFromConstructToDiscardPile
                                i_12 = i_16
                                CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_16 + 8), 0xa043, 
                                    "Defeat %s to Discard Pile", var_190)
            
            r0_255 = *(arg1 + 0x24c)
        
        ascension::CEvent* r6_11 = r6
        
        if (zx.d(*(r6_11 + 0xb34)) != 0 || *(r6_11 + 0xb38) s>= 1)
            int32_t r1_117 = *(*(r6_11 + 0xa4c) + 0x18)
            
            if (r1_117 s>= 1)
                void* r0_271 = *(arg1 + 0xce8)
                
                if (r0_271 != 0)
                    operator delete[](r0_271)
                    *(arg1 + 0xce8) = 0
                    r1_117 = *(*(r6_11 + 0xa4c) + 0x18)
                
                uint32_t r0_273
                int32_t r1_118
                r1_118:r0_273 = mulu.dp.d(r1_117, 0x34)
                
                if (r1_118 != 0)
                    r1_118 = 1
                
                if (r1_118 != 0)
                    r0_273 = 0xffffffff
                
                int32_t r0_274 = operator new[](r0_273)
                *(arg1 + 0xce8) = r0_274
                int32_t r2_72 = *(arg1 + 0x24c)
                int32_t var_158_2 = 8
                int32_t var_154_2 = 0
                str = _vtable_for_ascension::CEventQueryCardDefeatAttributes + 8
                int32_t var_110_2 = r2_72
                int32_t var_10c_2 = 0
                int32_t var_108_2 = r0_274
                void* r2_73 = *(r6_11 + 0xa4c)
                
                for (int32_t* i_10 = *(r2_73 + 0xc); i_10 != *(r2_73 + 0x10); i_10 = &i_10[1])
                    int32_t r1_119 = *i_10
                    
                    if (r1_119 != 0)
                        void* r0_277 = *(r1_119 + 0xc)
                        
                        if (*(r0_277 + 0x88) == 3
                                && (zx.d(*(r0_277 + 0xc5)) == 0 || zx.d(*(r6_11 + 0xb34)) != 0))
                            int32_t r3_38 = *(arg1 + 0x250)
                            bool cond:27_1 = r3_38 s> 1
                            
                            if (r3_38 s>= 1)
                                cond:27_1 = *(r0_277 + 0xa0) s> r3_38
                            
                            if (not(cond:27_1) || *(r6_11 + 0x30) u<= 0x11)
                                ascension::CEventQueryCardDefeatAttributes::AddQueryCard(&str, 
                                    r1_119)
                                r2_73 = *(r6_11 + 0xa4c)
                
                ascension::CWorld::HandleQuery(r6_11)
                
                if (var_10c_2 s>= 1)
                    int32_t r3_39 = 0
                    int32_t* r1_121 = *(arg1 + 0xce8) + 0xc
                    
                    do
                        r3_39 += 1
                        
                        if (*r1_121 s<= 0xffffffff)
                            *r1_121 = 0
                        
                        r1_121 = &r1_121[0xd]
                    while (r3_39 s< var_10c_2)
                
                *(arg1 + 0xce4) = var_10c_2
                void* r2_75 = *(r6_11 + 0xa4c)
                void** i_11 = *(r2_75 + 0xc)
                
                if (i_11 != *(r2_75 + 0x10))
                    int32_t r8_4 = 0
                    
                    do
                        void* i_18 = *i_11
                        
                        if (i_18 != 0)
                            void* r0_286 = *(i_18 + 0xc)
                            
                            if (*(r0_286 + 0x88) == 3
                                    && (zx.d(*(r0_286 + 0xc5)) == 0 || zx.d(*(r6 + 0xb34)) != 0))
                                int32_t r1_126 = *(arg1 + 0x250)
                                bool cond:29_1 = r1_126 s> 1
                                
                                if (r1_126 s>= 1)
                                    cond:29_1 = *(r0_286 + 0xa0) s> r1_126
                                
                                if (not(cond:29_1) || *(r6 + 0x30) u<= 0x11)
                                    var_190 = ascensionrules::CStateProcessAcquireOrDefeatAnyCenterRow::SelectDefeatFromTheVoid
                                    i_12 = i_18
                                    CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_18 + 8), 
                                        0xa042, "Defeat %s", var_190)
                                    
                                    if (*(*(arg1 + 0x24c) + 0xa8) s>= 1)
                                        var_190 = ascensionrules::CStateProcessAcquireOrDefeatAnyCenterRow::SelectDefeatFromTheVoidIntoPlay
                                        i_12 = i_18
                                        CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_18 + 8), 
                                            0xa048, "Defeat %s into Play", var_190)
                                    
                                    void* r0_293 = *(arg1 + 0xce8) + r8_4 * 0x34
                                    
                                    if (memchr(r0_293 + 0x1c, 3, *(r0_293 + 0x18)) != 0)
                                        var_190 = ascensionrules::CStateProcessAcquireOrDefeatAnyCenterRow::SelectDefeatFromTheVoidToDiscardPile
                                        i_12 = i_18
                                        CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_18 + 8), 
                                            0xa044, "Defeat %s to Discard Pile", var_190)
                                    
                                    r8_4 += 1
                                    r2_75 = *(r6 + 0xa4c)
                        
                        i_11 = &i_11[1]
                    while (i_11 != *(r2_75 + 0x10))
                
                ascension::CEvent::~CEvent()
    
    if (zx.d(*(arg1 + 0x257)) == 0)
        goto label_129130
    
    r0_300 = 0
    
    if (zx.d(*(arg1 + 0x258)) == 0)
        r3_40 = " from the Center Row"
        
        if (zx.d(*(arg1 + 0x259)) != 0)
            r3_40 = &data_1bfacb
    else
        r3_40 = &data_1bfacb

void* const r2_77

if (zx.d(*(arg1 + 0x255)) == 0)
    r2_77 = "Construct"
else
    r2_77 = "Hero"
    
    if (zx.d(*(arg1 + 0x256)) != 0)
        r2_77 = "Card"

if (zx.d(*(arg1 + 0x254)) == 0)
    if (r0_300 != 0 && zx.d(*(arg1 + 0x259)) != 0)
        sprintf(&str, "Acquire a %s%s")
    else
        sprintf(&str, "Acquire a %s or Defeat a Monster", r2_77)
else if (zx.d(*(arg1 + 0xcec)) != 0)
    sprintf(&str, "Defeat a Monster%s", r3_40)
else if (zx.d(*(arg1 + 0xced)) == 0)
    sprintf(&str, "Acquire a %s and Defeat a Monster", r2_77)
else
    sprintf(&str, "Acquire a %s%s")

int32_t entry_r1
(*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), &str, var_190, i_12)
ascension::CEvent::~CEvent()
ascension::CEvent::~CEvent()
int32_t r0_308 = *__stack_chk_guard

if (r0_308 == r0)
    return r0_308 - r0

__stack_chk_fail()
noreturn
