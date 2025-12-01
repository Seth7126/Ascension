// 函数: _ZN14ascensionrules36CStateProcessPlayerChooseTurnActions21BuildActionOptionListER13CStateMachine
// 地址: 0x16c178
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
CStateMachine& r9 = arg1
int32_t r0 = *__stack_chk_guard

if (zx.d(*(r9 + 0x1ae4)) != 0)
    *(r9 + 0x38) = 0
    *(r9 + 0x3c) = 0x20
    *(r9 + 0x40) = r9 + 0x4c
    *(r9 + 0x1ae4) = 0

void* __offset(CStateMachine, 0x24c) r4_1 = r9 + 0x24c
void* r1_1 = *r4_1
uint32_t r0_3 = *(r1_1 + 4)
void* r1_2 = *(r0_3 + 0xa6c)
int32_t (* const var_198)(CStateMachine&, CState*, int32_t, uint32_t*) = nullptr
ascension::CWorld::OutputEvent(r0_3, 8, zx.d(*(r1_1 + 8)), 0)
core::CInstance* r2_1 = *r4_1
int32_t* r7 = *(r2_1 + 0x54)
CStateMachine* entry_r1

if (r7 == *(r2_1 + 0x58))
label_16c2a8:
    ascension::CEvent** i = *(r2_1 + 0x60)
    
    while (i != *(r2_1 + 0x64))
        ascension::CEvent* r4_3 = *i
        void* r0_15 = *(r4_3 + 0x10)
        
        if (r0_15 != 0)
            void* r7_1 = *(r0_15 + 0xc)
            ascension::CWorld* r0_16 = *(r7_1 + 0xf0)
            
            if (r0_16 != 0)
                var_198 = nullptr
                int32_t r0_17
                uint32_t* r3_5
                r0_17, r3_5 = ascension::CEffect::CanUseEffect(r0_16, r0_3, r2_1, r4_3)
                
                if (r0_17 != 0 && zx.d(*(r7_1 + 0x158)) != 0)
                    if (*__stack_chk_guard == r0)
                        return
                            ascensionrules::CStateProcessPlayerChooseTurnActions::SelectUseTrophy(
                            entry_r1, r9, zx.d(*(r4_3 + 8)), r3_5) __tailcall
                    
                    goto label_16f650
        
        i = &i[1]
        r2_1 = *r4_1
    
    int32_t* r6_2
    
    if (r1_2 != 0)
        r6_2 = *(r1_2 + 0x20)
    
    if (r1_2 == 0 || r6_2 == *(r1_2 + 0x24))
    label_16c398:
        uint32_t r5_3 = r0_3
        int32_t* r0_30 = *(r5_3 + 0xa70)
        int32_t r1_10 = *(r5_3 + 0xa74)
        
        if (r0_30 == r1_10)
        label_16c410:
            int32_t r2_6 = *r4_1
            
            if ((*(r5_3 + 0x1c) - *(r5_3 + 0x18)) s>> 2 u< 2)
            label_16c4c4:
                
                for (int32_t* i_1 = *(r2_6 + 0x48); i_1 != *(r2_6 + 0x4c); i_1 = &i_1[1])
                    void* r4_6 = *i_1
                    int32_t* r7_9 = *(r4_6 + 0x20)
                    
                    if (r7_9 != *(r4_6 + 0x24))
                        void* r6_7 = *(*(r4_6 + 0x10) + 0xc)
                        
                        while (true)
                            void* r5_4 = *r7_9
                            int32_t r0_44
                            
                            if (*(r6_7 + 0x88) != 0xa)
                                r0_44 = ascension::CWorld::HasPlayedCardInPlayAbility(r0_3)
                            
                            if (*(r6_7 + 0x88) == 0xa || r0_44 == 0)
                                ascension::CWorld* r0_45 = *(r5_4 + 0x10)
                                
                                if (zx.d(*(r0_45 + 0x191)) != 0)
                                    int32_t r0_46
                                    uint32_t* r3_12
                                    r0_46, r3_12 = ascension::CCardInPlayAbilityDefinition::CheckAbilityConditions(
                                        r0_45, r0_3, *r4_1)
                                    
                                    if (r0_46 != 0)
                                        if (*__stack_chk_guard == r0)
                                            return ascensionrules::CStateProcessPlayerChooseTurnActions::SelectUseCardInPlayAbility(
                                                entry_r1, r9, zx.d(*(r5_4 + 8)), r3_12) __tailcall
                                        
                                        break
                            
                            r7_9 = &r7_9[1]
                            
                            if (r7_9 == *(r4_6 + 0x24))
                                r5_3 = r0_3
                                r2_6 = *r4_1
                                goto label_16c560
                        
                        goto label_16f650
                    
                label_16c560:
                
                if (*(r5_3 + 0x30) u>= 0x10)
                    void* r0_51 = *(r2_6 + 0x3c)
                    int32_t* i_2 = *(r0_51 + 0xc)
                    
                    if (i_2 != *(r0_51 + 0x10))
                        do
                            ascension::CEvent* r4_7 = *i_2
                            void* r1_19 = *(r4_7 + 0xc)
                            ascension::CWorld* r0_53 = *(r1_19 + 0xfc)
                            
                            if (r0_53 != 0 && *(r1_19 + 0xb8) == 0)
                                var_198 = nullptr
                                int32_t r0_54
                                uint32_t* r3_14
                                r0_54, r3_14 =
                                    ascension::CEffect::CanUseEffect(r0_53, r0_3, r2_6, r4_7)
                                
                                if (r0_54 != 0)
                                    int32_t r0_590 = *__stack_chk_guard
                                    
                                    if (r0_590 == r0)
                                        return ascensionrules::CStateProcessPlayerChooseTurnActions::SelectUseTransformEffect(
                                            r0_590 - r0, r9, zx.d(*(r4_7 + 8)), r3_14) __tailcall
                                    
                                    goto label_16f650
                                
                                r2_6 = *r4_1
                            
                            i_2 = &i_2[1]
                        while (i_2 != *(*(r2_6 + 0x3c) + 0x10))
                
                uint32_t var_194
                
                if (*(r0_3 + 0xb64) s>= 1)
                    void* r0_60 = *(r2_6 + 0x3c)
                    int32_t* i_3 = *(r0_60 + 0xc)
                    
                    if (i_3 != *(r0_60 + 0x10))
                        do
                            uint32_t r0_62 = *i_3
                            
                            if (*(*(r0_62 + 0xc) + 0x88) != 5)
                                var_194 = r0_62
                                var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectCardToBanishForUpgrade
                                CGameStateOptions::AddSimpleUserOption(r9.w, *(r0_62 + 8), 0xa061, 
                                    "Banish %s from hand", var_198)
                                r2_6 = *(r9 + 0x24c)
                            
                            i_3 = &i_3[1]
                        while (i_3 != *(*(r2_6 + 0x3c) + 0x10))
                
                int32_t r0_66 = *(r2_6 + 0x8c)
                uint32_t r6_8 = r0_3
                int32_t r0_67 = *(r6_8 + 0xb44)
                int32_t r8_1 = *(r6_8 + 0xb40)
                int32_t r5_6 = *(r6_8 + 0xb48)
                uint32_t var_174_1
                int32_t var_160_1
                
                if (zx.d(*(r6_8 + 0xb29)) == 0)
                    uint32_t r0_91 = zx.d(*(r6_8 + 0xb2a))
                    
                    if (r0_91 != 0)
                        r0_91 = r5_6 + r8_1
                    
                    var_174_1 = r0_91
                    var_160_1 = r5_6
                else
                    var_160_1 = r5_6 + r8_1
                    var_174_1 = 0
                
                void* r0_93 = *(r2_6 + 0x3c)
                int32_t r1_43 = r0_66 + r5_6
                int32_t var_184_1 = r1_43
                
                if (zx.d(*(r6_8 + 0xb3d)) == 0)
                    r1_43 = r0_66
                
                if (*(r0_93 + 0x18) s>= 1)
                    var_194 = nullptr
                    var_198 =
                        ascensionrules::CStateProcessPlayerChooseTurnActions::SelectPlayEntireHand
                    CGameStateOptions::AddSimpleUserOption(r9.w, 0, 0xa015, "Play Entire Hand", 
                        var_198)
                    r2_6 = *(r9 + 0x24c)
                    r0_93 = *(r2_6 + 0x3c)
                
                int32_t* i_4 = *(r0_93 + 0xc)
                CStateMachine& var_148_1 = r9
                
                if (i_4 != *(r0_93 + 0x10))
                    do
                        ascension::CEvent* r5_7 = *i_4
                        void* r9_1 = *(r5_7 + 0xc)
                        int32_t r1_45 = *(r9_1 + 0x88)
                        uint32_t r1_44
                        
                        if (r1_45 != 3)
                            if (r1_45 != 2)
                                ascension::CWorld* r0_104 = *(r9_1 + 0xfc)
                                
                                if (r0_104 != 0)
                                    if (*(r9_1 + 0xb8) s>= 1)
                                        int32_t var_198_1 = 0
                                        
                                        if (ascension::CEffect::CanUseEffect(r0_104, r6_8, r2_6, 
                                                r5_7) != 0)
                                            int32_t r0_107 = r0_66
                                            
                                            if (zx.d(*(r6_8 + 0xb3d)) != 0)
                                                r0_107 = var_184_1
                                                
                                                if (zx.d(*(r6_8 + 0xb29)) != 0)
                                                    r0_107 += r8_1
                                            
                                            if (r0_107 s>= *(r9_1 + 0xb8))
                                                uint32_t r1_52 = zx.d(*(r5_7 + 8))
                                                uint32_t var_194_1 = r1_52
                                                CGameStateOptions::AddSimpleUserOption(var_148_1.w, 
                                                    r1_52.w, 0xa0c1, "Transform %s", 
                                                    ascensionrules::CStateProcessPlayerChooseTurnActions::SelectUseTransformEffect)
                                    
                                    r1_45 = *(r9_1 + 0x88)
                                
                                if (r1_45 != 1 || zx.d(*(*r4_1 + 0xa4)) == 0)
                                    goto label_16c9d0
                                
                                if (ascension::CCard::IsCardFaction(r9_1) == 0)
                                    goto label_16c9d0
                            
                            r1_44 = zx.d(*(r5_7 + 8))
                            var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectPlayFromHand
                            var_194 = r1_44
                            r9 = var_148_1
                            CGameStateOptions::AddSimpleUserOption(r9.w, r1_44.w, 0xa011, 
                                "Put %s into Play", var_198)
                        else if (*(r5_3 + 0x30) u>= 0x1a)
                        label_16c9d0:
                            r1_44 = zx.d(*(r5_7 + 8))
                            var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectPlayFromHand
                            var_194 = r1_44
                            r9 = var_148_1
                        label_16c9e8:
                            CGameStateOptions::AddSimpleUserOption(r9.w, r1_44.w, 0xa010, 
                                "Play %s from Hand", var_198)
                        else
                            int32_t* r6_9 = *(r2_6 + 0x48)
                            r9 = var_148_1
                            
                            if (r6_9 != *(r2_6 + 0x4c))
                                while (true)
                                    int32_t* r0_99 = *r6_9
                                    
                                    if (r0_99 != 0)
                                        if (strcasecmp((*(*r0_99 + 0xc))(), "Samael the Fallen")
                                                == 0)
                                            r1_44 = zx.d(*(r5_7 + 8))
                                            var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectPlayFromHand
                                            var_194 = r1_44
                                            break
                                        
                                        r2_6 = *r4_1
                                    
                                    r6_9 = &r6_9[1]
                                    
                                    if (r6_9 == *(r2_6 + 0x4c))
                                        goto label_16c9fc
                                
                                goto label_16c9e8
                    label_16c9fc:
                        i_4 = &i_4[1]
                        r6_8 = r0_3
                        r2_6 = *r4_1
                    while (i_4 != *(*(r2_6 + 0x3c) + 0x10))
                
                int32_t i_6 = 0
                int32_t var_80_1 = 6
                int32_t var_7c_1 = 0
                void* __offset(vtable_for_ascension::CEventQueryCardAcquireAttributes, 0x8) 
                    var_84 = _vtable_for_ascension::CEventQueryCardAcquireAttributes + 8
                int32_t var_38_1 = r2_6
                int32_t var_34_1 = 0
                void* __offset(CStateMachine, 0x258) var_30_1 = r9 + 0x258
                int32_t var_d8_1 = 8
                int32_t var_d4_1 = 0
                void* __offset(vtable_for_ascension::CEventQueryCardDefeatAttributes, 0x8) var_dc =
                    _vtable_for_ascension::CEventQueryCardDefeatAttributes + 8
                int32_t var_90_1 = r2_6
                int32_t var_8c_1 = 0
                void* __offset(CStateMachine, 0xcb8) var_88_1 = r9 + 0xcb8
                int32_t* i_5 = *(r6_8 + 0xa30)
                
                if (i_5 != *(r6_8 + 0xa34))
                    do
                        void* r0_124 = *i_5
                        
                        if (*(r0_124 + 0x10) != 0)
                            int32_t r1_55 = *(r0_124 + 0x14)
                            
                            if (r1_55 != 0)
                                int32_t r0_128 = *(*(r0_124 + 0xc) + 0x88)
                                
                                if (r0_128 == 3)
                                    ascension::CEventQueryCardDefeatAttributes::AddQueryCard(
                                        &var_dc, r1_55)
                                else if (r0_128 == 1)
                                    ascension::CEventQueryCardAcquireAttributes::AddQueryCard(
                                        &var_84, r1_55, 6)
                        
                        i_5 = &i_5[1]
                    while (i_5 != *(r0_3 + 0xa34))
                
                uint32_t r6_17 = r0_3
                
                do
                    int32_t r0_132 = ascension::CWorld::GetCenterRowCard(r6_17)
                    
                    if (r0_132 != 0)
                        switch (*(*(r0_132 + 0xc) + 0x88) - 1)
                            case 0
                                ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_84, 
                                    r0_132, 7)
                            case 1
                                ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_84, 
                                    r0_132, 7)
                            case 2
                                ascension::CEventQueryCardDefeatAttributes::AddQueryCard(&var_dc, 
                                    r0_132)
                            case 7
                                ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_84, 
                                    r0_132, 7)
                    
                    i_6 += 1
                while (i_6 u< 7)
                
                int32_t* i_7 = *(r6_17 + 0xa7c)
                
                for (int32_t r0_141 = *(r6_17 + 0xa80); i_7 != r0_141; i_7 = &i_7[1])
                    int32_t r1_58 = *i_7
                    
                    if (*(*(r1_58 + 0xc) + 0x88) == 1)
                        ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_84, r1_58, 
                            0x1b)
                        r0_141 = *(r6_17 + 0xa80)
                
                void* r0_144 = *r4_1
                void* r1_59 = *(r0_144 + 0x44)
                
                if (r1_59 != 0)
                    int32_t* i_8 = *(r1_59 + 0xc)
                    
                    if (i_8 != *(r1_59 + 0x10))
                        do
                            int32_t r1_61 = *i_8
                            int32_t r0_146 = *(*(r1_61 + 0xc) + 0x88)
                            
                            if (r0_146 == 9)
                                ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_84, 
                                    r1_61, 0x14)
                            else if (r0_146 == 2)
                                ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_84, 
                                    r1_61, 0x14)
                            else if (r0_146 == 1)
                                ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_84, 
                                    r1_61, 0x14)
                            
                            i_8 = &i_8[1]
                            r0_144 = *r4_1
                        while (i_8 != *(*(r0_144 + 0x44) + 0x10))
                
                for (int32_t* i_9 = *(r0_144 + 0x54); i_9 != *(r0_144 + 0x58); i_9 = &i_9[1])
                    void* r1_65 = *i_9
                    
                    if (zx.d(*(*(*(r1_65 + 0x10) + 0xc) + 0xcb)) != 0)
                        int32_t r1_66 = *(r1_65 + 0x4c)
                        
                        if (r1_66 - *(r1_65 + 0x48) == 4)
                            ascension::CEventQueryCardDefeatAttributes::AddQueryCard(&var_dc, 
                                *(r1_66 - 4))
                            r0_144 = *r4_1
                
                ascension::CWorld::HandleQuery(r6_17)
                
                if (var_34_1 s>= 1)
                    void* __offset(CStateMachine, 0x264) r1_69 = r9 + 0x264
                    int32_t r3_32 = 0
                    
                    do
                        r3_32 += 1
                        
                        if (*r1_69 s<= 0xffffffff)
                            *r1_69 = 0
                        
                        r1_69 += 0x44
                    while (r3_32 s< var_34_1)
                
                *(r9 + 0x254) = var_34_1
                ascension::CWorld::HandleQuery(r6_17)
                
                if (var_8c_1 s>= 1)
                    void* __offset(CStateMachine, 0xcc4) r1_70 = r9 + 0xcc4
                    int32_t r3_33 = 0
                    
                    do
                        r3_33 += 1
                        
                        if (*r1_70 s<= 0xffffffff)
                            *r1_70 = 0
                        
                        r1_70 += 0x34
                    while (r3_33 s< var_8c_1)
                
                *(r9 + 0xcb4) = var_8c_1
                int32_t i_11 = 0
                int32_t r1_71 = 0
                int32_t* i_10 = *(r6_17 + 0xa30)
                int32_t var_170_1 = r5_6 + r8_1
                int32_t var_14c_1 = 0
                
                if (i_10 != *(r6_17 + 0xa34))
                    r1_71 = 0
                    var_14c_1 = 0
                    
                    do
                        void* r8_3 = *i_10
                        
                        if (*(r8_3 + 0x10) != 0 && *(r8_3 + 0x14) != 0)
                            void* r0_160 = *(r8_3 + 0xc)
                            int32_t r10_1 = r1_71
                            int32_t r1_72 = *(r0_160 + 0x88)
                            
                            if (r1_72 == 3)
                                if (var_160_1 s< *(r9 + r10_1 * 0x34 + 0xcc4))
                                    r1_71 = r10_1 + 1
                                else if (zx.d(*(r0_160 + 0xc5)) == 0)
                                    uint32_t r1_93 = zx.d(*(r8_3 + 8))
                                    var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectDefeatFromKingdom
                                    var_194 = r1_93
                                    CGameStateOptions::AddSimpleUserOption(r9.w, r1_93.w, 0xa041, 
                                        "Defeat %s", var_198)
                                    r1_71 = r10_1 + 1
                                else if (zx.d(*(r0_160 + 0xc6)) == 0)
                                label_16d0cc:
                                    uint32_t r1_92 = zx.d(*(r8_3 + 8))
                                    var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectDefeatTrophyFromKingdom
                                    var_194 = r1_92
                                    CGameStateOptions::AddSimpleUserOption(r9.w, r1_92.w, 0xa045, 
                                        "Defeat %s", var_198)
                                    r1_71 = r10_1 + 1
                                else
                                    void* r1_83 = *r4_1
                                    int32_t* r2_36 = *(r1_83 + 0x60)
                                    int32_t r1_84 = *(r1_83 + 0x64)
                                    
                                    if (r2_36 == r1_84)
                                        goto label_16d0cc
                                    
                                    int32_t r3_35 = 0
                                    
                                    do
                                        void* r6_10 = *r2_36
                                        r2_36 = &r2_36[1]
                                        int32_t r6_12 = *(*(r6_10 + 0x10) + 0xc)
                                        
                                        if (r6_12 == r0_160)
                                            goto label_16cec8
                                        
                                        int32_t temp0_1 = 0
                                        void* j = r6_12 - r0_160
                                        
                                        while (j != 0)
                                            j u>>= 1
                                            temp0_1 += 1
                                        
                                        r3_35 |= (0x20 - temp0_1) u>> 5
                                    while (r1_84 != r2_36)
                                    
                                    if ((r3_35 & 1) == 0)
                                        goto label_16d0cc
                                    
                                label_16cec8:
                                    uint32_t r1_85 = zx.d(*(r8_3 + 8))
                                    var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectDefeatFromKingdom
                                    var_194 = r1_85
                                    CGameStateOptions::AddSimpleUserOption(r9.w, r1_85.w, 0xa041, 
                                        "Defeat %s", var_198)
                                    r1_71 = r10_1 + 1
                            else if (r1_72 != 1)
                                r1_71 = r10_1
                            else
                                int32_t r2_34 = var_170_1
                                void* r5_8 = r9 + var_14c_1 * 0x44
                                
                                if (zx.d(*(r5_8 + 0x270)) == 0)
                                    r2_34 = r8_1
                                    
                                    if (zx.d(*(r0_3 + 0xb2b)) != 0)
                                        r2_34 = var_170_1
                                
                                var_14c_1 += 1
                                
                                if (*(r5_8 + 0x264) s<= r2_34)
                                    uint32_t __n_1 = *(r5_8 + 0x274)
                                    
                                    if (*(r5_3 + 0x30) u< 3)
                                        uint32_t r1_89 = zx.d(*(r8_3 + 8))
                                        var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectAcquireFromKingdom
                                        var_194 = r1_89
                                        CGameStateOptions::AddSimpleUserOption(var_148_1.w, 
                                            r1_89.w, 0xa020, "Acquire %s", var_198)
                                        r1_71 = r10_1
                                        
                                        if (*(r5_3 + 0x30) u>= 2)
                                            if (memchr(r5_8 + 0x278, 1, __n_1) != 0)
                                                uint32_t r1_90 = zx.d(*(r8_3 + 8))
                                                var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectAcquireFromKingdomToHand
                                                var_194 = r1_90
                                                CGameStateOptions::AddSimpleUserOption(var_148_1.w, 
                                                    r1_90.w, 0xa024, "Acquire %s to Hand", var_198)
                                            
                                            if (memchr(r5_8 + 0x278, 2, __n_1) == 0)
                                                r1_71 = r10_1
                                            else
                                                uint32_t r1_91 = zx.d(*(r8_3 + 8))
                                                var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectAcquireFromKingdomToTopOfDeck
                                                var_194 = r1_91
                                                CGameStateOptions::AddSimpleUserOption(var_148_1.w, 
                                                    r1_91.w, 0xa022, "Acquire %s to Top of Deck", 
                                                    var_198)
                                                r1_71 = r10_1
                                    else
                                        int32_t r6_16 = *(r5_8 + 0x298)
                                        
                                        if (r6_16 == 0xffffffff)
                                            uint32_t r1_86 = zx.d(*(r8_3 + 8))
                                            var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectAcquireFromKingdom
                                            var_194 = r1_86
                                            CGameStateOptions::AddSimpleUserOption(var_148_1.w, 
                                                r1_86.w, 0xa020, "Acquire %s", var_198)
                                        
                                        if (memchr(r5_8 + 0x278, 1, __n_1) != 0 && (
                                                r6_16 == 0xffffffff
                                                || zx.d(*(r5_8 + r6_16 + 0x278)) == 1))
                                            uint32_t r1_87 = zx.d(*(r8_3 + 8))
                                            var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectAcquireFromKingdomToHand
                                            var_194 = r1_87
                                            CGameStateOptions::AddSimpleUserOption(var_148_1.w, 
                                                r1_87.w, 0xa024, "Acquire %s to Hand", var_198)
                                        
                                        if (memchr(r5_8 + 0x278, 2, __n_1) == 0 || (
                                                r6_16 != 0xffffffff
                                                && zx.d(*(r5_8 + r6_16 + 0x278)) != 2))
                                            r1_71 = r10_1
                                        else
                                            uint32_t r1_88 = zx.d(*(r8_3 + 8))
                                            var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectAcquireFromKingdomToTopOfDeck
                                            var_194 = r1_88
                                            CGameStateOptions::AddSimpleUserOption(var_148_1.w, 
                                                r1_88.w, 0xa022, "Acquire %s to Top of Deck", 
                                                var_198)
                                            r1_71 = r10_1
                                else
                                    r1_71 = r10_1
                        
                        r6_17 = r0_3
                        i_10 = &i_10[1]
                        r9 = var_148_1
                    while (i_10 != *(r6_17 + 0xa34))
                
                int32_t var_158_2 = r1_71
                int32_t r0_193 = var_160_1 + r0_66
                uint32_t __n
                int32_t var_13c(CStateMachine&, CState*, int32_t, uint32_t*)
                char var_139
                int32_t var_138
                
                do
                    uint32_t r0_197 = ascension::CWorld::GetCenterRowCard(r6_17)
                    
                    if (r0_197 != 0)
                        void* r10_2 = *(r0_197 + 0xc)
                        
                        switch (*(r10_2 + 0x88) - 1)
                            case 0
                                int32_t r0_201 = *(r10_2 + 0xa0)
                                int32_t r2_42 = var_14c_1 * 0x11
                                var_14c_1 += 1
                                void* r5_9 = r9 + (r2_42 << 2)
                                uint32_t r3_37 = zx.d(*(r5_9 + 0x270))
                                int32_t r2_43 = *(r5_9 + 0x264)
                                int32_t r1_99
                                
                                if (zx.d(*(r6_17 + 0xb2c)) != 0)
                                    r1_99 = *(r10_2 + 0xa4) + r2_43 - *(r5_9 + 0x260)
                                
                                int32_t r4_9
                                int32_t r6_28
                                
                                if (zx.d(*(r6_17 + 0xb2c)) == 0 || r2_43 s<= r1_99)
                                    if (r0_201 s< 1)
                                        goto label_16d474
                                    
                                    if (r5_6 s>= r0_201)
                                        r6_28 = r5_6 - r0_201
                                        goto label_16d5b8
                                    
                                    int32_t r0_220 = r0_201 - r5_6
                                    r6_28 = 0
                                    
                                    if (r0_220 s< 1)
                                        goto label_16d5b8
                                    
                                    if (r8_1 s>= r0_220 && zx.d(*(r0_3 + 0xb29)) != 0)
                                        r4_9 = r8_1 - r0_220
                                        goto label_16d5c8
                                    
                                    r6_17 = r0_3
                                else
                                    r2_43 = r1_99 & not.d(r1_99 s>> 0x1f)
                                label_16d474:
                                    r6_28 = r5_6
                                label_16d5b8:
                                    r4_9 = r8_1
                                label_16d5c8:
                                    
                                    if (r3_37 != 0 || zx.d(*(r10_2 + 0xd5)) != 0)
                                        r4_9 += r6_28
                                    else if (zx.d(*(r0_3 + 0xb2b)) != 0)
                                        r4_9 += r6_28
                                    
                                    if (zx.d(*(r10_2 + 0xd6)) != 0)
                                        r4_9 += r0_66
                                        
                                        if (zx.d(*(r0_3 + 0xb3d)) != 0
                                                && (zx.d(*(r10_2 + 0xd5)) | r3_37) == 0
                                                && zx.d(*(r0_3 + 0xb2b)) == 0
                                                && *(r5_3 + 0x30) u> 0x16)
                                            r4_9 += r6_28
                                    
                                    if (r2_43 s<= r4_9)
                                        __n = *(r5_9 + 0x274)
                                        
                                        if (*(r5_3 + 0x30) u< 3)
                                            uint32_t r1_126 = zx.d(*(r0_197 + 8))
                                            var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectAcquireFromCenterRow
                                            var_194 = r1_126
                                            CGameStateOptions::AddSimpleUserOption(r9.w, r1_126.w, 
                                                0xa020, "Acquire %s", var_198)
                                            
                                            if (*(r5_3 + 0x30) u>= 2)
                                                if (memchr(r5_9 + 0x278, 1, __n) != 0)
                                                    uint32_t r1_127 = zx.d(*(r0_197 + 8))
                                                    var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectAcquireFromCenterRowToHand
                                                    var_194 = r1_127
                                                    CGameStateOptions::AddSimpleUserOption(r9.w, 
                                                        r1_127.w, 0xa024, "Acquire %s to Hand", 
                                                        var_198)
                                                
                                                if (memchr(r5_9 + 0x278, 2, __n) != 0)
                                                    uint32_t r1_128 = zx.d(*(r0_197 + 8))
                                                    var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectAcquireFromCenterRowToTopOfDeck
                                                    var_194 = r1_128
                                                    CGameStateOptions::AddSimpleUserOption(r9.w, 
                                                        r1_128.w, 0xa022, 
                                                        "Acquire %s to Top of Deck", var_198)
                                        else
                                            int32_t r6_34 = *(r5_9 + 0x298)
                                            
                                            if (r6_34 == 0xffffffff)
                                                uint32_t r1_123 = zx.d(*(r0_197 + 8))
                                                var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectAcquireFromCenterRow
                                                var_194 = r1_123
                                                CGameStateOptions::AddSimpleUserOption(r9.w, 
                                                    r1_123.w, 0xa020, "Acquire %s", var_198)
                                            
                                            if (memchr(r5_9 + 0x278, 1, __n) != 0 && (
                                                    r6_34 == 0xffffffff
                                                    || zx.d(*(r5_9 + r6_34 + 0x278)) == 1))
                                                uint32_t r1_124 = zx.d(*(r0_197 + 8))
                                                var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectAcquireFromCenterRowToHand
                                                var_194 = r1_124
                                                CGameStateOptions::AddSimpleUserOption(r9.w, 
                                                    r1_124.w, 0xa024, "Acquire %s to Hand", var_198)
                                            
                                            if (memchr(r5_9 + 0x278, 2, __n) != 0 && (
                                                    r6_34 == 0xffffffff
                                                    || zx.d(*(r5_9 + r6_34 + 0x278)) == 2))
                                                uint32_t r1_125 = zx.d(*(r0_197 + 8))
                                                var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectAcquireFromCenterRowToTopOfDeck
                                                var_194 = r1_125
                                                CGameStateOptions::AddSimpleUserOption(r9.w, 
                                                    r1_125.w, 0xa022, "Acquire %s to Top of Deck", 
                                                    var_198)
                                    
                                    int32_t r2_51 = *(r10_2 + 0xb4)
                                    
                                    if (r2_51 s< 1)
                                        r6_17 = r0_3
                                    else
                                        r6_17 = r0_3
                                        int32_t r3_45 = r0_66
                                        
                                        if (zx.d(*(r6_17 + 0xb3d)) != 0)
                                            r3_45 = var_184_1
                                            
                                            if (zx.d(*(r6_17 + 0xb29)) != 0)
                                                r3_45 += r8_1
                                        
                                        if (r3_45 s>= r2_51)
                                            var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectBanishPhantasmFromCenterRow
                                            var_194 = r0_197
                                            CGameStateOptions::AddSimpleUserOption(r9.w, 
                                                *(r0_197 + 8), 0xa06a, "Banish %s for Phantasm", 
                                                var_198)
                            case 1
                                int32_t r6_23 = *(r10_2 + 0xa0)
                                int32_t r0_202 = var_14c_1 * 0x11
                                var_14c_1 += 1
                                void* r4_10 = r9 + (r0_202 << 2)
                                int32_t r3_38 = r5_6
                                int32_t r2_41 = r8_1
                                uint32_t r1_100 = zx.d(*(r4_10 + 0x270))
                                int32_t r0_203 = *(r4_10 + 0x264)
                                
                                if (r6_23 s< 1)
                                    goto label_16d490
                                
                                if (r5_6 s>= r6_23)
                                    r3_38 = r5_6 - r6_23
                                label_16d480:
                                    r2_41 = r8_1
                                label_16d490:
                                    
                                    if (r1_100 != 0 || zx.d(*(r10_2 + 0xd5)) != 0)
                                        r2_41 += r3_38
                                    else if (zx.d(*(r0_3 + 0xb2b)) != 0)
                                        r2_41 += r3_38
                                    
                                    if (zx.d(*(r10_2 + 0xd6)) != 0)
                                        r2_41 += r0_66
                                    
                                    if (zx.d(*(r10_2 + 0xd6)) != 0 && zx.d(*(r0_3 + 0xb3d)) != 0
                                            && (zx.d(*(r10_2 + 0xd5)) | r1_100) == 0)
                                        r6_17 = r0_3
                                        
                                        if (zx.d(*(r6_17 + 0xb2b)) == 0 && *(r5_3 + 0x30) u> 0x16)
                                            r2_41 += r3_38
                                        
                                        if (r0_203 s<= r2_41)
                                            goto label_16d8e4
                                        
                                        goto label_16d8b4
                                    
                                    r6_17 = r0_3
                                    
                                    if (r0_203 s> r2_41)
                                    label_16d8b4:
                                        
                                        if (r0_203 s<= r2_41 + r0_67 &&
                                                ascension::CWorld::QueryCardFaction(r6_17, *r4_1, 
                                                r0_197) != 0)
                                            goto label_16d8e4
                                    else
                                    label_16d8e4:
                                        uint32_t __n_6 = *(r4_10 + 0x274)
                                        int32_t r0_273 = *(r5_3 + 0x30)
                                        
                                        if (r0_273 u< 3)
                                            uint32_t r1_141 = zx.d(*(r0_197 + 8))
                                            var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectAcquireFromCenterRow
                                            var_194 = r1_141
                                            CGameStateOptions::AddSimpleUserOption(r9.w, r1_141.w, 
                                                0xa020, "Acquire %s", var_198)
                                            
                                            if (*(r5_3 + 0x30) u>= 2
                                                    && memchr(r4_10 + 0x278, 4, __n_6) != 0)
                                                uint32_t r1_142 = zx.d(*(r0_197 + 8))
                                                var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectAcquireFromCenterRowIntoPlay
                                                var_194 = r1_142
                                                CGameStateOptions::AddSimpleUserOption(r9.w, 
                                                    r1_142.w, 0xa023, "Acquire %s into play", 
                                                    var_198)
                                        else
                                            uint32_t __n_7 = *(r4_10 + 0x298)
                                            __n = __n_7
                                            
                                            if (__n_7 == 0xffffffff)
                                                uint32_t r1_135 = zx.d(*(r0_197 + 8))
                                                var_194 = r1_135
                                                CGameStateOptions::AddSimpleUserOption(r9.w, 
                                                    r1_135.w, 0xa020, "Acquire %s", 
                                                    ascensionrules::CStateProcessPlayerChooseTurnActions::SelectAcquireFromCenterRow)
                                                r0_273 = *(r5_3 + 0x30)
                                            
                                            if (r0_273 u>= 0xe)
                                                if (memchr(r4_10 + 0x278, 1, __n_6) != 0 && (
                                                        __n == 0xffffffff
                                                        || zx.d(*(r4_10 + __n + 0x278)) == 1))
                                                    uint32_t r1_136 = zx.d(*(r0_197 + 8))
                                                    var_194 = r1_136
                                                    CGameStateOptions::AddSimpleUserOption(r9.w, 
                                                        r1_136.w, 0xa024, "Acquire %s to Hand", 
                                                        ascensionrules::CStateProcessPlayerChooseTurnActions::SelectAcquireFromCenterRowToHand)
                                                
                                                if (memchr(r4_10 + 0x278, 2, __n_6) != 0 && (
                                                        __n == 0xffffffff
                                                        || zx.d(*(r4_10 + __n + 0x278)) == 2))
                                                    uint32_t r1_137 = zx.d(*(r0_197 + 8))
                                                    var_194 = r1_137
                                                    CGameStateOptions::AddSimpleUserOption(r9.w, 
                                                        r1_137.w, 0xa022, 
                                                        "Acquire %s to Top of Deck", 
                                                        ascensionrules::CStateProcessPlayerChooseTurnActions::SelectAcquireFromCenterRowToTopOfDeck)
                                            
                                            var_198 = &var_13c
                                            
                                            if (ascension::CEventQueryCardAcquireAttributes::AcquireCardEntry::FindAcquireLocation(
                                                    r4_10.b + 0x58, 4, &var_138, &var_139) != 0
                                                    && (__n == 0xffffffff || __n == var_138)
                                                    && r1_43 s>= zx.d(var_139))
                                                uint32_t r1_140 = zx.d(*(r0_197 + 8))
                                                var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectAcquireFromCenterRowIntoPlay
                                                var_194 = r1_140
                                                CGameStateOptions::AddSimpleUserOption(r9.w, 
                                                    r1_140.w, 0xa023, "Acquire %s into play", 
                                                    var_198)
                                else
                                    int32_t r2_47 = r6_23 - r5_6
                                    r3_38 = 0
                                    
                                    if (r2_47 s< 1)
                                        goto label_16d480
                                    
                                    if (r8_1 s>= r2_47 && zx.d(*(r0_3 + 0xb29)) != 0)
                                        r2_41 = r8_1 - r2_47
                                        goto label_16d490
                                    
                                    r6_17 = r0_3
                            case 2
                                void* r4_11 = r9 + var_158_2 * 0x34
                                int32_t r5_10 = *(r4_11 + 0xcc4)
                                
                                if (var_160_1 s>= r5_10)
                                label_16d320:
                                    
                                    if (zx.d(*(r10_2 + 0xc5)) == 0)
                                        uint32_t r1_117 = zx.d(*(r0_197 + 8))
                                        var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectDefeatFromCenterRow
                                        var_194 = r1_117
                                        CGameStateOptions::AddSimpleUserOption(r9.w, r1_117.w, 
                                            0xa040, "Defeat %s", var_198)
                                        
                                        if (*(*r4_1 + 0xa8) s>= 1)
                                            uint32_t r1_118 = zx.d(*(r0_197 + 8))
                                            var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectDefeatFromCenterRowIntoPlay
                                            var_194 = r1_118
                                            CGameStateOptions::AddSimpleUserOption(r9.w, r1_118.w, 
                                                0xa047, "Defeat %s into Play", var_198)
                                        
                                        goto label_16d54c
                                    
                                    if (zx.d(*(r10_2 + 0xc6)) == 0)
                                    label_16d384:
                                        uint32_t r1_104 = zx.d(*(r0_197 + 8))
                                        var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectDefeatTrophyFromCenterRow
                                        var_194 = r1_104
                                        CGameStateOptions::AddSimpleUserOption(r9.w, r1_104.w, 
                                            0xa045, "Defeat %s", var_198)
                                    label_16d54c:
                                        
                                        if (*(r5_3 + 0x30) u< 2)
                                            var_158_2 += 1
                                        else
                                            if (memchr(r4_11 + 0xcd4, 3, *(r4_11 + 0xcd0)) != 0)
                                                uint32_t r1_119 = zx.d(*(r0_197 + 8))
                                                var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectDefeatFromCenterRowToDiscardPile
                                                var_194 = r1_119
                                                CGameStateOptions::AddSimpleUserOption(r9.w, 
                                                    r1_119.w, 0xa043, "Defeat %s to Discard Pile", 
                                                    var_198)
                                            
                                            var_158_2 += 1
                                    else
                                        void* r1_102 = *r4_1
                                        int32_t* r0_214 = *(r1_102 + 0x60)
                                        int32_t r1_103 = *(r1_102 + 0x64)
                                        
                                        if (r0_214 == r1_103)
                                            goto label_16d384
                                        
                                        int32_t r2_48 = 0
                                        
                                        do
                                            void* r3_39 = *r0_214
                                            r0_214 = &r0_214[1]
                                            int32_t r3_41 = *(*(r3_39 + 0x10) + 0xc)
                                            
                                            if (r3_41 == r10_2)
                                                goto label_16daf0
                                            
                                            int32_t temp0_2 = 0
                                            void* j_1 = r3_41 - r10_2
                                            
                                            while (j_1 != 0)
                                                j_1 u>>= 1
                                                temp0_2 += 1
                                            
                                            r2_48 |= (0x20 - temp0_2) u>> 5
                                        while (r1_103 != r0_214)
                                        
                                        if ((r2_48 & 1) == 0)
                                            goto label_16d384
                                else if (var_174_1 s< r5_10)
                                    if (r0_193 s>= r5_10 && zx.d(*(r10_2 + 0xd7)) != 0)
                                        goto label_16d320
                                    
                                    var_158_2 += 1
                                else
                                    if (ascension::CCard::IsCardFaction(r10_2) != 0
                                            || (r0_193 s>= r5_10 && zx.d(*(r10_2 + 0xd7)) != 0))
                                        goto label_16d320
                                    
                                    var_158_2 += 1
                            case 7
                                int32_t r2_49 = var_170_1
                                void* r1_105 = r9 + var_14c_1 * 0x44
                                
                                if (zx.d(*(r1_105 + 0x270)) == 0)
                                    r2_49 = r8_1
                                    
                                    if (zx.d(*(r6_17 + 0xb2b)) != 0)
                                        r2_49 = var_170_1
                                
                                var_14c_1 += 1
                                
                                if (*(r1_105 + 0x264) s<= r2_49)
                                    uint32_t r1_110 = zx.d(*(r0_197 + 8))
                                    var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectAcquirePortalFromCenterRow
                                    var_194 = r1_110
                                    CGameStateOptions::AddSimpleUserOption(r9.w, r1_110.w, 0xa02d, 
                                        "Acquire %s", var_198)
                    
                label_16daf0:
                    i_11 += 1
                while (i_11 u< 7)
                
                int32_t* r8_5 = *(r6_17 + 0xa7c)
                int32_t r0_301 = *(r6_17 + 0xa80)
                int32_t r6_35
                int32_t r7_13
                
                if (r8_5 == r0_301)
                    r6_35 = r1_43
                    r7_13 = var_14c_1
                else
                    r6_35 = r1_43
                    r7_13 = var_14c_1
                    
                    do
                        void* r5_13 = *r8_5
                        
                        if (*(*(r5_13 + 0xc) + 0x88) == 1)
                            void* r10_3 = var_148_1 + r7_13 * 0x44
                            
                            if (r6_35 s>= *(r10_3 + 0x26c))
                                int32_t r6_36 = *(r10_3 + 0x298)
                                uint32_t __n_2 = *(r10_3 + 0x274)
                                
                                if (r6_36 == 0xffffffff)
                                    uint32_t r1_146 = zx.d(*(r5_13 + 8))
                                    var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectAcquireFromAvailableUniques
                                    var_194 = r1_146
                                    CGameStateOptions::AddSimpleUserOption(var_148_1.w, r1_146.w, 
                                        0xa020, "Acquire %s", var_198)
                                
                                if (memchr(r10_3 + 0x278, 1, __n_2) != 0 && (r6_36 == 0xffffffff
                                        || zx.d(*(r10_3 + r6_36 + 0x278)) == 1))
                                    uint32_t r1_147 = zx.d(*(r5_13 + 8))
                                    var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectAcquireFromAvailableUniquesToHand
                                    var_194 = r1_147
                                    CGameStateOptions::AddSimpleUserOption(var_148_1.w, r1_147.w, 
                                        0xa024, "Acquire %s to Hand", var_198)
                                
                                if (memchr(r10_3 + 0x278, 2, __n_2) != 0 && (r6_36 == 0xffffffff
                                        || zx.d(*(r10_3 + r6_36 + 0x278)) == 2))
                                    uint32_t r1_148 = zx.d(*(r5_13 + 8))
                                    var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectAcquireFromAvailableUniquesToTopOfDeck
                                    var_194 = r1_148
                                    CGameStateOptions::AddSimpleUserOption(var_148_1.w, r1_148.w, 
                                        0xa022, "Acquire %s to Top of Deck", var_198)
                            
                            r6_35 = r1_43
                            r7_13 += 1
                            r0_301 = *(r0_3 + 0xa80)
                        
                        r8_5 = &r8_5[1]
                    while (r8_5 != r0_301)
                
                CStateMachine& r4_13 = var_148_1
                core::CInstance* r2_63 = *r4_1
                void* r0_317 = *(r2_63 + 0x44)
                
                if (r0_317 != 0)
                    int32_t* i_12 = *(r0_317 + 0xc)
                    
                    if (i_12 != *(r0_317 + 0x10))
                        do
                            void* r10_4 = *i_12
                            void* r0_319 = *(r10_4 + 0xc)
                            int32_t r1_149 = *(r0_319 + 0x88)
                            
                            if (r1_149 == 9)
                                if (r6_35 s>= *(r4_13 + r7_13 * 0x44 + 0x26c))
                                    uint32_t r1_156 = zx.d(*(r10_4 + 8))
                                    
                                    if (zx.d(*(r0_319 + 0xd4)) == 0)
                                        var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectAcquireVisionFromDreamscape
                                        var_194 = r1_156
                                        CGameStateOptions::AddSimpleUserOption(r4_13.w, r1_156.w, 
                                            0xa02e, "Acquire %s", var_198)
                                    else
                                        var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectAcquireOngoingVisionFromDreamscape
                                        var_194 = r1_156
                                        CGameStateOptions::AddSimpleUserOption(r4_13.w, r1_156.w, 
                                            0xa02f, "Acquire %s", var_198)
                                
                                r7_13 += 1
                            else if (r1_149 == 2)
                                void* r9_4 = r4_13 + r7_13 * 0x44
                                int32_t r0_336 = *(r9_4 + 0x26c)
                                var_170_1 = r0_336
                                
                                if (r6_35 s>= r0_336)
                                    int32_t r7_17 = *(r9_4 + 0x298)
                                    uint32_t __n_3 = *(r9_4 + 0x274)
                                    
                                    if (r7_17 == 0xffffffff)
                                        uint32_t r1_157 = zx.d(*(r10_4 + 8))
                                        var_194 = r1_157
                                        CGameStateOptions::AddSimpleUserOption(var_148_1.w, 
                                            r1_157.w, 0xa020, "Acquire %s", 
                                            ascensionrules::CStateProcessPlayerChooseTurnActions::SelectAcquireFromDreamscape)
                                    
                                    if (memchr(r9_4 + 0x278, 1, __n_3) != 0 && (r7_17 == 0xffffffff
                                            || zx.d(*(r9_4 + r7_17 + 0x278)) == 1))
                                        uint32_t r1_158 = zx.d(*(r10_4 + 8))
                                        var_194 = r1_158
                                        CGameStateOptions::AddSimpleUserOption(var_148_1.w, 
                                            r1_158.w, 0xa024, "Acquire %s to Hand", 
                                            ascensionrules::CStateProcessPlayerChooseTurnActions::SelectAcquireFromDreamscapeToHand)
                                    
                                    if (memchr(r9_4 + 0x278, 2, __n_3) != 0 && (r7_17 == 0xffffffff
                                            || zx.d(*(r9_4 + r7_17 + 0x278)) == 2))
                                        uint32_t r1_159 = zx.d(*(r10_4 + 8))
                                        var_194 = r1_159
                                        CGameStateOptions::AddSimpleUserOption(var_148_1.w, 
                                            r1_159.w, 0xa022, "Acquire %s to Top of Deck", 
                                            ascensionrules::CStateProcessPlayerChooseTurnActions::SelectAcquireFromDreamscapeToTopOfDeck)
                                    
                                    var_198 = &var_13c
                                    
                                    if (ascension::CEventQueryCardAcquireAttributes::AcquireCardEntry::FindAcquireLocation(
                                            r9_4.b + 0x58, 4, &var_138, &var_139) != 0
                                            && (r7_17 == 0xffffffff || r7_17 == var_138)
                                            && r6_35 s>= var_170_1 + zx.d(var_139))
                                        uint32_t r1_161 = zx.d(*(r10_4 + 8))
                                        var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectAcquireFromDreamscapeIntoPlay
                                        var_194 = r1_161
                                        CGameStateOptions::AddSimpleUserOption(var_148_1.w, 
                                            r1_161.w, 0xa023, "Acquire %s into play", var_198)
                                
                                r4_13 = var_148_1
                                r7_13 += 1
                            else if (r1_149 == 1)
                                void* r7_15 = r4_13 + r7_13 * 0x44
                                
                                if (r6_35 s>= *(r7_15 + 0x26c))
                                    int32_t r6_37 = *(r7_15 + 0x298)
                                    uint32_t __n_5 = *(r7_15 + 0x274)
                                    
                                    if (r6_37 == 0xffffffff)
                                        uint32_t r1_150 = zx.d(*(r10_4 + 8))
                                        var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectAcquireFromDreamscape
                                        var_194 = r1_150
                                        CGameStateOptions::AddSimpleUserOption(r4_13.w, r1_150.w, 
                                            0xa020, "Acquire %s", var_198)
                                    
                                    if (memchr(r7_15 + 0x278, 1, __n_5) != 0 && (r6_37 == 0xffffffff
                                            || zx.d(*(r7_15 + r6_37 + 0x278)) == 1))
                                        uint32_t r1_151 = zx.d(*(r10_4 + 8))
                                        var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectAcquireFromDreamscapeToHand
                                        var_194 = r1_151
                                        CGameStateOptions::AddSimpleUserOption(r4_13.w, r1_151.w, 
                                            0xa024, "Acquire %s to Hand", var_198)
                                    
                                    if (memchr(r7_15 + 0x278, 2, __n_5) != 0 && (r6_37 == 0xffffffff
                                            || zx.d(*(r7_15 + r6_37 + 0x278)) == 2))
                                        uint32_t r1_152 = zx.d(*(r10_4 + 8))
                                        var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectAcquireFromDreamscapeToTopOfDeck
                                        var_194 = r1_152
                                        CGameStateOptions::AddSimpleUserOption(r4_13.w, r1_152.w, 
                                            0xa022, "Acquire %s to Top of Deck", var_198)
                                
                                r6_35 = r1_43
                                r7_13 += 1
                            
                            i_12 = &i_12[1]
                            r2_63 = *r4_1
                        while (i_12 != *(*(r2_63 + 0x44) + 0x10))
                
                int32_t* i_13 = *(r2_63 + 0x54)
                
                while (i_13 != *(r2_63 + 0x58))
                    void* r7_19 = *i_13
                    int32_t* j_2 = *(r7_19 + 0x3c)
                    void* r5_16 = *(*(r7_19 + 0x10) + 0xc)
                    
                    for (; j_2 != *(r7_19 + 0x40); j_2 = &j_2[1])
                        void* r4_14 = *j_2
                        
                        if (ascension::CWorld::HasPlayedConstructAbility(r0_3) == 0)
                            ascension::CWorld* r0_362 = *(r4_14 + 0x10)
                            
                            if (r0_362 == 0)
                            label_16e0a4:
                                uint32_t r1_167 = zx.d(*(r4_14 + 8))
                                var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectUseConstruct
                                var_194 = r1_167
                                CGameStateOptions::AddSimpleUserOption(var_148_1.w, r1_167.w, 
                                    0xa070, "Use %s", var_198)
                            else if (zx.d(*(r0_362 + 0x199)) == 0 &&
                                    ascension::CConstructAbilityDefinition::CheckAbilityConditions(
                                    r0_362, r0_3, *r4_1) != 0)
                                goto label_16e0a4
                    
                    if (zx.d(*(r5_16 + 0xcb)) != 0)
                        int32_t r0_367 = *(r7_19 + 0x4c)
                        
                        if (r0_367 - *(r7_19 + 0x48) == 4)
                            void* r5_17 = var_148_1 + var_158_2 * 0x34
                            void* r4_15 = *(*(r0_367 - 4) + 0xc)
                            int32_t r6_38 = *(r5_17 + 0xcc4)
                            
                            if (var_160_1 s>= r6_38)
                            label_16e164:
                                int32_t r1_171
                                
                                if (zx.d(*(r4_15 + 0xc5)) == 0)
                                    uint32_t r1_180 = zx.d(*(r7_19 + 8))
                                    var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectDefeatFromConstruct
                                    var_194 = r1_180
                                    CGameStateOptions::AddSimpleUserOption(var_148_1.w, r1_180.w, 
                                        0xa040, "Defeat %s", var_198)
                                    r1_171 = var_158_2
                                    
                                    if (*(*r4_1 + 0xa8) s>= 1)
                                        uint32_t r1_181 = zx.d(*(r7_19 + 8))
                                        var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectDefeatFromConstructIntoPlay
                                        var_194 = r1_181
                                        CGameStateOptions::AddSimpleUserOption(var_148_1.w, 
                                            r1_181.w, 0xa047, "Defeat %s into Play", var_198)
                                        r1_171 = var_158_2
                                    
                                    goto label_16e2a8
                                
                                if (zx.d(*(r4_15 + 0xc6)) == 0)
                                label_16e1f8:
                                    uint32_t r1_179 = zx.d(*(r7_19 + 8))
                                    var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectDefeatTrophyFromConstruct
                                    var_194 = r1_179
                                    CGameStateOptions::AddSimpleUserOption(var_148_1.w, r1_179.w, 
                                        0xa040, "Defeat %s", var_198)
                                    r1_171 = var_158_2
                                label_16e2a8:
                                    
                                    if (*(r5_3 + 0x30) u< 2)
                                        var_158_2 = r1_171 + 1
                                    else
                                        r1_171 = var_158_2
                                        
                                        if (memchr(r5_17 + 0xcd4, 3, *(r5_17 + 0xcd0)) != 0)
                                            uint32_t r1_182 = zx.d(*(r7_19 + 8))
                                            var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectDefeatFromConstructToDiscardPile
                                            var_194 = r1_182
                                            CGameStateOptions::AddSimpleUserOption(var_148_1.w, 
                                                r1_182.w, 0xa043, "Defeat %s to Discard Pile", 
                                                var_198)
                                            r1_171 = var_158_2
                                        
                                        var_158_2 = r1_171 + 1
                                else
                                    void* r0_378 = *r4_1
                                    int32_t* r2_71 = *(r0_378 + 0x60)
                                    int32_t r0_379 = *(r0_378 + 0x64)
                                    
                                    if (r2_71 == r0_379)
                                        goto label_16e1f8
                                    
                                    int32_t r3_50 = 0
                                    
                                    do
                                        void* r1_173 = *r2_71
                                        r2_71 = &r2_71[1]
                                        int32_t r6_39 = *(*(r1_173 + 0x10) + 0xc)
                                        
                                        if (r6_39 == r4_15)
                                            goto label_16e1c8
                                        
                                        int32_t temp0_3 = 0
                                        void* j_3 = r6_39 - r4_15
                                        
                                        while (j_3 != 0)
                                            j_3 u>>= 1
                                            temp0_3 += 1
                                        
                                        r3_50 |= (0x20 - temp0_3) u>> 5
                                    while (r0_379 != r2_71)
                                    
                                    if ((r3_50 & 1) == 0)
                                        goto label_16e1f8
                                    
                                label_16e1c8:
                                    uint32_t r1_178 = zx.d(*(r7_19 + 8))
                                    var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectDefeatFromConstruct
                                    var_194 = r1_178
                                    CGameStateOptions::AddSimpleUserOption(var_148_1.w, r1_178.w, 
                                        0xa040, "Defeat %s", var_198)
                            else if (var_174_1 s< r6_38)
                                if (r0_193 s>= r6_38 && zx.d(*(r4_15 + 0xd7)) != 0)
                                    goto label_16e164
                                
                                var_158_2 += 1
                            else
                                if (ascension::CCard::IsCardFaction(r4_15) != 0
                                        || (r0_193 s>= r6_38 && zx.d(*(r4_15 + 0xd7)) != 0))
                                    goto label_16e164
                                
                                var_158_2 += 1
                    
                    i_13 = &i_13[1]
                    r2_63 = *r4_1
                
                ascension::CEvent** i_14 = *(r2_63 + 0x60)
                
                while (i_14 != *(r2_63 + 0x64))
                    ascension::CEvent* r5_18 = *i_14
                    void* r0_395 = *(r5_18 + 0x10)
                    
                    if (r0_395 != 0)
                        ascension::CWorld* r0_397 = *(*(r0_395 + 0xc) + 0xf0)
                        
                        if (r0_397 != 0)
                            var_198 = nullptr
                            
                            if (ascension::CEffect::CanUseEffect(r0_397, r0_3, r2_63, r5_18) != 0)
                                uint32_t r1_185 = zx.d(*(r5_18 + 8))
                                var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectUseTrophy
                                var_194 = r1_185
                                CGameStateOptions::AddSimpleUserOption(var_148_1.w, r1_185.w, 
                                    0xa071, "Use %s", var_198)
                    
                    i_14 = &i_14[1]
                    r2_63 = *r4_1
                
                int32_t* i_15 = *(r2_63 + 0x48)
                
                if (i_15 != *(r2_63 + 0x4c))
                    do
                        void* r4_17 = *i_15
                        int32_t* j_4 = *(r4_17 + 0x20)
                        
                        if (j_4 != *(r4_17 + 0x24))
                            void* r5_19 = *(*(r4_17 + 0x10) + 0xc)
                            
                            do
                                void* r7_20 = *j_4
                                int32_t r0_407
                                
                                if (*(r5_19 + 0x88) != 0xa)
                                    r0_407 = ascension::CWorld::HasPlayedCardInPlayAbility(r0_3)
                                
                                if (*(r5_19 + 0x88) == 0xa || r0_407 == 0)
                                    ascension::CWorld* r0_408 = *(r7_20 + 0x10)
                                    
                                    if (zx.d(*(r0_408 + 0x191)) == 0 && ascension::CCardInPlayAbilityDefinition::CheckAbilityConditions(
                                            r0_408, r0_3, *r4_1) != 0)
                                        uint32_t r1_190 = zx.d(*(r7_20 + 8))
                                        var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectUseCardInPlayAbility
                                        var_194 = r1_190
                                        CGameStateOptions::AddSimpleUserOption(var_148_1.w, 
                                            r1_190.w, 0xa070, "Use %s", var_198)
                                
                                j_4 = &j_4[1]
                            while (j_4 != *(r4_17 + 0x24))
                        
                        i_15 = &i_15[1]
                    while (i_15 != *(*r4_1 + 0x4c))
                
                uint16_t r6_40 = var_148_1.w
                
                for (int32_t* i_16 = *(r0_3 + 0xa70); i_16 != *(r0_3 + 0xa74); i_16 = &i_16[1])
                    void* r7_21 = *i_16
                    void* r4_18 = *(r7_21 + 0xc)
                    
                    if (*(r4_18 + 0x88) == 0xa)
                        int32_t r0_418 = *(r4_18 + 0xbc)
                        
                        if (r0_418 s>= 1 && *(r0_3 + 0xb50) s>= r0_418)
                            uint32_t r1_195 = zx.d(*(r7_21 + 8))
                            var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectAcquireTempleFromAvailableTemples
                            var_194 = r1_195
                            CGameStateOptions::AddSimpleUserOption(r6_40, r1_195.w, 0xa029, 
                                "Acquire %s", var_198)
                        
                        int32_t r0_419 = *(r4_18 + 0xc0)
                        
                        if (r0_419 s>= 1 && *(r0_3 + 0xb54) s>= r0_419)
                            uint32_t r1_196 = zx.d(*(r7_21 + 8))
                            var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectAcquireTempleFromAvailableTemples
                            var_194 = r1_196
                            CGameStateOptions::AddSimpleUserOption(r6_40, r1_196.w, 0xa029, 
                                "Acquire %s", var_198)
                
                uint32_t r0_424 = r0_3
                
                if ((*(r0_424 + 0x1c) - *(r0_424 + 0x18)) s>> 2 u>= 2)
                    int32_t i_17 = 1
                    
                    do
                        void* r0_425 = ascension::CWorld::GetPlayerByTurnOrder(r0_424, *r4_1)
                        
                        for (int32_t* j_5 = *(r0_425 + 0x48); j_5 != *(r0_425 + 0x4c); 
                                j_5 = &j_5[1])
                            void* r7_22 = *j_5
                            void* r5_20 = *(*(r7_22 + 0x10) + 0xc)
                            
                            if (*(r5_20 + 0x88) == 0xa)
                                int32_t r0_429 = *(r5_20 + 0xbc)
                                
                                if (r0_429 s>= 1 && *(r0_3 + 0xb50) s>= r0_429)
                                    uint32_t r1_206 = zx.d(*(r7_22 + 8))
                                    var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectAcquireTempleFromOpponent
                                    var_194 = r1_206
                                    CGameStateOptions::AddSimpleUserOption(var_148_1.w, r1_206.w, 
                                        0xa029, "Acquire %s", var_198)
                                
                                int32_t r0_430 = *(r5_20 + 0xc0)
                                
                                if (r0_430 s>= 1 && *(r0_3 + 0xb54) s>= r0_430)
                                    uint32_t r1_207 = zx.d(*(r7_22 + 8))
                                    var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectAcquireTempleFromOpponent
                                    var_194 = r1_207
                                    CGameStateOptions::AddSimpleUserOption(var_148_1.w, r1_207.w, 
                                        0xa029, "Acquire %s", var_198)
                        
                        r0_424 = r0_3
                        i_17 += 1
                    while (i_17 u< (*(r0_424 + 0x1c) - *(r0_424 + 0x18)) s>> 2)
                
                CStateMachine& r8_6 = var_148_1
                
                if (r1_2 != 0)
                    for (int32_t* i_18 = *(r1_2 + 0x20); i_18 != *(r1_2 + 0x24); i_18 = &i_18[1])
                        void* r5_21 = *i_18
                        
                        if (ascension::CWorld::HasPlayedCardInPlayAbility(r0_3) == 0)
                            ascension::CWorld* r0_439 = *(r5_21 + 0x10)
                            
                            if (r0_439 == 0)
                            label_16e768:
                                uint32_t r1_214 = zx.d(*(r5_21 + 8))
                                var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectUseCurrentEventAbility
                                var_194 = r1_214
                                CGameStateOptions::AddSimpleUserOption(r8_6.w, r1_214.w, 0xa070, 
                                    "Use %s", var_198)
                            else if (zx.d(*(r0_439 + 0x191)) == 0 &&
                                    ascension::CCardInPlayAbilityDefinition::CheckAbilityConditions(
                                    r0_439, r0_3, *r4_1) != 0)
                                goto label_16e768
                
                uint32_t r7_23 = r0_3
                void* __offset(vtable_for_ascension::CEventQueryCardDefeatAttributes, 0x8) var_134
                
                if (*(r7_23 + 0xb30) s>= 1)
                    int32_t r1_215 = *(*(r7_23 + 0xa4c) + 0x18)
                    
                    if (r1_215 s>= 1)
                        void* r0_446 = *(r8_6 + 0xef8)
                        
                        if (r0_446 != 0)
                            operator delete[](r0_446)
                            *(r8_6 + 0xef8) = 0
                            r1_215 = *(*(r7_23 + 0xa4c) + 0x18)
                        
                        uint32_t r0_448
                        int32_t r1_216
                        r1_216:r0_448 = mulu.dp.d(r1_215, 0x44)
                        
                        if (r1_216 != 0)
                            r1_216 = 1
                        
                        if (r1_216 != 0)
                            r0_448 = 0xffffffff
                        
                        int32_t r0_449 = operator new[](r0_448)
                        *(r8_6 + 0xef8) = r0_449
                        int32_t r2_78 = *(r8_6 + 0x24c)
                        int32_t var_130_1 = 6
                        int32_t var_12c_1 = 0
                        var_134 = _vtable_for_ascension::CEventQueryCardAcquireAttributes + 8
                        int32_t var_e8_1 = r2_78
                        int32_t var_e4_1 = 0
                        int32_t var_e0_1 = r0_449
                        void* r3_55 = *(r7_23 + 0xa4c)
                        
                        for (int32_t* i_19 = *(r3_55 + 0xc); i_19 != *(r3_55 + 0x10); 
                                i_19 = &i_19[1])
                            int32_t r2_79 = *i_19
                            
                            if (r2_79 != 0 && *(*(r2_79 + 0xc) + 0x88) == 1)
                                ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_134, 
                                    r2_79, 9)
                                r3_55 = *(r7_23 + 0xa4c)
                        
                        uint32_t r4_20 = r7_23
                        void* __offset(vtable_for_ascension::CEventQueryCardDefeatAttributes, 0x8)* 
                            var_14c_4 = &var_134
                        ascension::CWorld::HandleQuery(r7_23)
                        
                        if (var_e4_1 s>= 1)
                            int32_t r3_57 = 0
                            int32_t* r1_219 = *(r8_6 + 0xef8) + 0xc
                            
                            do
                                r3_57 += 1
                                
                                if (*r1_219 s<= 0xffffffff)
                                    *r1_219 = 0
                                
                                r1_219 = &r1_219[0x11]
                            while (r3_57 s< var_e4_1)
                        
                        *(r8_6 + 0xef4) = var_e4_1
                        r7_23 = r4_20
                        void* r0_457 = *(r4_20 + 0xa4c)
                        int32_t* i_20 = *(r0_457 + 0xc)
                        
                        if (i_20 != *(r0_457 + 0x10))
                            int32_t r9_5 = 0
                            
                            do
                                void* r10_5 = *i_20
                                
                                if (r10_5 != 0)
                                    void* r3_58 = *(r10_5 + 0xc)
                                    
                                    if (*(r3_58 + 0x88) == 1)
                                        int32_t r7_25 = r9_5 * 0x11
                                        int32_t r0_462 = *(r3_58 + 0xa0)
                                        r9_5 += 1
                                        void* r7_26 = *(var_148_1 + 0xef8) + (r7_25 << 2)
                                        uint32_t r5_22 = zx.d(*(r7_26 + 0x18))
                                        int32_t r2_82 = *(r7_26 + 0xc)
                                        int32_t r1_223
                                        
                                        if (zx.d(*(r7_23 + 0xb2c)) != 0)
                                            r1_223 = *(r3_58 + 0xa4) + r2_82 - *(r7_26 + 8)
                                        
                                        int32_t r4_21
                                        int32_t r6_42
                                        
                                        if (zx.d(*(r7_23 + 0xb2c)) == 0 || r2_82 s<= r1_223)
                                            if (r0_462 s< 1)
                                                goto label_16e9cc
                                            
                                            if (r5_6 s>= r0_462)
                                                r6_42 = r5_6 - r0_462
                                            label_16ea84:
                                                r4_21 = r8_1
                                                goto label_16ea94
                                            
                                            int32_t r0_463 = r0_462 - r5_6
                                            r6_42 = 0
                                            
                                            if (r0_463 s< 1)
                                                goto label_16ea84
                                            
                                            if (r8_1 s>= r0_463 && zx.d(*(r0_3 + 0xb29)) != 0)
                                                r4_21 = r8_1 - r0_463
                                                goto label_16ea94
                                        else
                                            r2_82 = r1_223 & not.d(r1_223 s>> 0x1f)
                                        label_16e9cc:
                                            r4_21 = r8_1
                                            r6_42 = r5_6
                                        label_16ea94:
                                            
                                            if (r5_22 != 0 || zx.d(*(r3_58 + 0xd5)) != 0)
                                                r4_21 += r6_42
                                            else if (zx.d(*(r0_3 + 0xb2b)) != 0)
                                                r4_21 += r6_42
                                            
                                            if (zx.d(*(r3_58 + 0xd6)) != 0)
                                                r4_21 += r0_66
                                                
                                                if (zx.d(*(r0_3 + 0xb3d)) != 0
                                                        && (zx.d(*(r3_58 + 0xd5)) | r5_22) == 0
                                                        && zx.d(*(r0_3 + 0xb2b)) == 0)
                                                    r4_21 += r6_42
                                            
                                            if (r2_82 s<= r4_21)
                                                int32_t r6_43 = *(r7_26 + 0x40)
                                                uint32_t __n_4 = *(r7_26 + 0x1c)
                                                
                                                if (r6_43 == 0xffffffff)
                                                    uint32_t r1_230 = zx.d(*(r10_5 + 8))
                                                    var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectAcquireFromVoid
                                                    var_194 = r1_230
                                                    CGameStateOptions::AddSimpleUserOption(
                                                        var_148_1.w, r1_230.w, 0xa025, 
                                                        "Acquire %s", var_198)
                                                
                                                if (memchr(r7_26 + 0x20, 1, __n_4) != 0 && (
                                                        r6_43 == 0xffffffff
                                                        || zx.d(*(r7_26 + r6_43 + 0x20)) == 1))
                                                    uint32_t r1_231 = zx.d(*(r10_5 + 8))
                                                    var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectAcquireFromVoidToHand
                                                    var_194 = r1_231
                                                    CGameStateOptions::AddSimpleUserOption(
                                                        var_148_1.w, r1_231.w, 0xa028, 
                                                        "Acquire %s to Hand", var_198)
                                                
                                                if (memchr(r7_26 + 0x20, 2, __n_4) != 0 && (
                                                        r6_43 == 0xffffffff
                                                        || zx.d(*(r7_26 + r6_43 + 0x20)) == 2))
                                                    uint32_t r1_232 = zx.d(*(r10_5 + 8))
                                                    var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectAcquireFromVoidToTopOfDeck
                                                    var_194 = r1_232
                                                    CGameStateOptions::AddSimpleUserOption(
                                                        var_148_1.w, r1_232.w, 0xa026, 
                                                        "Acquire %s to Top of Deck", var_198)
                                
                                r7_23 = r0_3
                                i_20 = &i_20[1]
                            while (i_20 != *(*(r7_23 + 0xa4c) + 0x10))
                        
                        ascension::CEvent::~CEvent()
                        r8_6 = var_148_1
                
                if (zx.d(*(r7_23 + 0xb34)) != 0 || *(r7_23 + 0xb38) s>= 1)
                    int32_t r1_233 = *(*(r7_23 + 0xa4c) + 0x18)
                    
                    if (r1_233 s>= 1)
                        void* r0_488 = *(r8_6 + 0xf00)
                        
                        if (r0_488 != 0)
                            operator delete[](r0_488)
                            *(r8_6 + 0xf00) = 0
                            r1_233 = *(*(r7_23 + 0xa4c) + 0x18)
                        
                        uint32_t r0_490
                        int32_t r1_234
                        r1_234:r0_490 = mulu.dp.d(r1_233, 0x34)
                        
                        if (r1_234 != 0)
                            r1_234 = 1
                        
                        if (r1_234 != 0)
                            r0_490 = 0xffffffff
                        
                        int32_t r0_491 = operator new[](r0_490)
                        *(r8_6 + 0xf00) = r0_491
                        int32_t r2_85 = *(r8_6 + 0x24c)
                        int32_t var_130_2 = 8
                        int32_t var_12c_2 = 0
                        var_134 = _vtable_for_ascension::CEventQueryCardDefeatAttributes + 8
                        int32_t var_e8_2 = r2_85
                        int32_t var_e4_2 = 0
                        int32_t var_e0_2 = r0_491
                        void* r2_86 = *(r7_23 + 0xa4c)
                        
                        for (int32_t* i_21 = *(r2_86 + 0xc); i_21 != *(r2_86 + 0x10); 
                                i_21 = &i_21[1])
                            int32_t r1_235 = *i_21
                            
                            if (r1_235 != 0)
                                void* r0_493 = *(r1_235 + 0xc)
                                
                                if (*(r0_493 + 0x88) == 3 && (zx.d(*(r0_493 + 0xc5)) == 0
                                        || zx.d(*(r7_23 + 0xb34)) != 0))
                                    ascension::CEventQueryCardDefeatAttributes::AddQueryCard(
                                        &var_134, r1_235)
                                    r2_86 = *(r7_23 + 0xa4c)
                        
                        uint32_t r6_44 = r7_23
                        ascension::CWorld::HandleQuery(r7_23)
                        
                        if (var_e4_2 s>= 1)
                            int32_t r3_61 = 0
                            int32_t* r1_237 = *(r8_6 + 0xf00) + 0xc
                            
                            do
                                r3_61 += 1
                                
                                if (*r1_237 s<= 0xffffffff)
                                    *r1_237 = 0
                                
                                r1_237 = &r1_237[0xd]
                            while (r3_61 s< var_e4_2)
                        
                        *(r8_6 + 0xefc) = var_e4_2
                        void* r0_500 = *(r6_44 + 0xa4c)
                        int32_t* i_22 = *(r0_500 + 0xc)
                        
                        if (i_22 != *(r0_500 + 0x10))
                            int32_t r9_6 = 0
                            
                            do
                                void* r10_6 = *i_22
                                
                                if (r10_6 != 0)
                                    void* r4_22 = *(r10_6 + 0xc)
                                    
                                    if (*(r4_22 + 0x88) == 3 && (zx.d(*(r4_22 + 0xc5)) == 0
                                            || zx.d(*(r6_44 + 0xb34)) != 0))
                                        int32_t r6_45 = *(*(var_148_1 + 0xf00) + r9_6 * 0x34 + 0xc)
                                        
                                        if (var_160_1 s>= r6_45)
                                        label_16ede8:
                                            uint32_t r1_243 = zx.d(*(r10_6 + 8))
                                            var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectDefeatFromTheVoid
                                            var_194 = r1_243
                                            CGameStateOptions::AddSimpleUserOption(var_148_1.w, 
                                                r1_243.w, 0xa042, "Defeat %s", var_198)
                                            
                                            if (*(*r4_1 + 0xa8) s>= 1)
                                                uint32_t r1_244 = zx.d(*(r10_6 + 8))
                                                var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectDefeatFromTheVoidIntoPlay
                                                var_194 = r1_244
                                                CGameStateOptions::AddSimpleUserOption(var_148_1.w, 
                                                    r1_244.w, 0xa048, "Defeat %s into Play", 
                                                    var_198)
                                            
                                            if (*(r5_3 + 0x30) u>= 2)
                                                void* r0_519 = *(var_148_1 + 0xf00) + r9_6 * 0x34
                                                
                                                if (memchr(r0_519 + 0x1c, 3, *(r0_519 + 0x18)) != 0)
                                                    uint32_t r1_245 = zx.d(*(r10_6 + 8))
                                                    var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectDefeatFromTheVoidToDiscardPile
                                                    var_194 = r1_245
                                                    CGameStateOptions::AddSimpleUserOption(
                                                        var_148_1.w, r1_245.w, 0xa044, 
                                                        "Defeat %s to Discard Pile", var_198)
                                        else
                                            if (var_174_1 s>= r6_45)
                                                if (ascension::CCard::IsCardFaction(r4_22) != 0)
                                                    goto label_16ede8
                                                
                                                goto label_16edd4
                                            
                                        label_16edd4:
                                            
                                            if (r0_193 s>= r6_45 && zx.d(*(r4_22 + 0xd7)) != 0)
                                                goto label_16ede8
                                        
                                        r9_6 += 1
                                        r6_44 = r0_3
                                        r0_500 = *(r0_3 + 0xa4c)
                                
                                i_22 = &i_22[1]
                            while (i_22 != *(r0_500 + 0x10))
                        
                        ascension::CEvent::~CEvent()
                        r8_6 = var_148_1
                        r7_23 = r6_44
                
                if (zx.d(*(r7_23 + 0xb3c)) != 0)
                    void* r0_526 = ascension::CWorld::GetCenterRowCard(r7_23)
                    
                    if (r0_526 != 0)
                        int32_t* r1_248 = *(r0_526 + 0xc)
                        
                        if (r1_248[0x22] == 1)
                            int32_t r3_62 = 0x98
                            
                            if (*(r5_3 + 0x30) u< 0x14)
                                r3_62 = 0x9c
                            
                            if (var_160_1 s>= *(r1_248 + r3_62))
                                uint32_t r1_250 = zx.d(*(r0_526 + 8))
                                var_194 = r1_250
                                var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectDefeatHeroWithPower
                                CGameStateOptions::AddSimpleUserOption(r8_6.w, r1_250.w, 0xa046, 
                                    "Defeat %s", var_198)
                    
                    void* r0_529 = ascension::CWorld::GetCenterRowCard(r7_23)
                    
                    if (r0_529 != 0)
                        int32_t* r1_252 = *(r0_529 + 0xc)
                        
                        if (r1_252[0x22] == 1)
                            int32_t r3_63 = 0x98
                            
                            if (*(r5_3 + 0x30) u< 0x14)
                                r3_63 = 0x9c
                            
                            if (var_160_1 s>= *(r1_252 + r3_63))
                                uint32_t r1_254 = zx.d(*(r0_529 + 8))
                                var_194 = r1_254
                                var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectDefeatHeroWithPower
                                CGameStateOptions::AddSimpleUserOption(r8_6.w, r1_254.w, 0xa046, 
                                    "Defeat %s", var_198)
                    
                    void* r0_532 = ascension::CWorld::GetCenterRowCard(r7_23)
                    
                    if (r0_532 != 0)
                        int32_t* r1_256 = *(r0_532 + 0xc)
                        
                        if (r1_256[0x22] == 1)
                            int32_t r3_64 = 0x98
                            
                            if (*(r5_3 + 0x30) u< 0x14)
                                r3_64 = 0x9c
                            
                            if (var_160_1 s>= *(r1_256 + r3_64))
                                uint32_t r1_258 = zx.d(*(r0_532 + 8))
                                var_194 = r1_258
                                var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectDefeatHeroWithPower
                                CGameStateOptions::AddSimpleUserOption(r8_6.w, r1_258.w, 0xa046, 
                                    "Defeat %s", var_198)
                    
                    void* r0_535 = ascension::CWorld::GetCenterRowCard(r7_23)
                    
                    if (r0_535 != 0)
                        int32_t* r1_260 = *(r0_535 + 0xc)
                        
                        if (r1_260[0x22] == 1)
                            int32_t r3_65 = 0x98
                            
                            if (*(r5_3 + 0x30) u< 0x14)
                                r3_65 = 0x9c
                            
                            if (var_160_1 s>= *(r1_260 + r3_65))
                                uint32_t r1_262 = zx.d(*(r0_535 + 8))
                                var_194 = r1_262
                                var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectDefeatHeroWithPower
                                CGameStateOptions::AddSimpleUserOption(r8_6.w, r1_262.w, 0xa046, 
                                    "Defeat %s", var_198)
                    
                    void* r0_538 = ascension::CWorld::GetCenterRowCard(r7_23)
                    
                    if (r0_538 != 0)
                        int32_t* r1_264 = *(r0_538 + 0xc)
                        
                        if (r1_264[0x22] == 1)
                            int32_t r3_66 = 0x98
                            
                            if (*(r5_3 + 0x30) u< 0x14)
                                r3_66 = 0x9c
                            
                            if (var_160_1 s>= *(r1_264 + r3_66))
                                uint32_t r1_266 = zx.d(*(r0_538 + 8))
                                var_194 = r1_266
                                var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectDefeatHeroWithPower
                                CGameStateOptions::AddSimpleUserOption(r8_6.w, r1_266.w, 0xa046, 
                                    "Defeat %s", var_198)
                    
                    void* r0_541 = ascension::CWorld::GetCenterRowCard(r7_23)
                    
                    if (r0_541 != 0)
                        int32_t* r1_268 = *(r0_541 + 0xc)
                        
                        if (r1_268[0x22] == 1)
                            int32_t r3_67 = 0x98
                            
                            if (*(r5_3 + 0x30) u< 0x14)
                                r3_67 = 0x9c
                            
                            if (var_160_1 s>= *(r1_268 + r3_67))
                                uint32_t r1_270 = zx.d(*(r0_541 + 8))
                                var_194 = r1_270
                                var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectDefeatHeroWithPower
                                CGameStateOptions::AddSimpleUserOption(r8_6.w, r1_270.w, 0xa046, 
                                    "Defeat %s", var_198)
                    
                    void* r0_544 = ascension::CWorld::GetCenterRowCard(r7_23)
                    
                    if (r0_544 != 0)
                        int32_t* r1_272 = *(r0_544 + 0xc)
                        
                        if (r1_272[0x22] == 1)
                            int32_t r3_68 = 0x98
                            
                            if (*(r5_3 + 0x30) u< 0x14)
                                r3_68 = 0x9c
                            
                            if (var_160_1 s>= *(r1_272 + r3_68))
                                uint32_t r1_274 = zx.d(*(r0_544 + 8))
                                var_194 = r1_274
                                var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectDefeatHeroWithPower
                                CGameStateOptions::AddSimpleUserOption(r8_6.w, r1_274.w, 0xa046, 
                                    "Defeat %s", var_198)
                
                int32_t* i_23 = *(r7_23 + 0xb70)
                int32_t r1_276 = r8_1
                
                if (zx.d(*(r7_23 + 0xb2b)) != 0)
                    r1_276 += r5_6
                
                uint32_t var_14c_5
                
                if (i_23 == *(r7_23 + 0xb74))
                    var_14c_5 = 0
                else
                    var_14c_5 = 0
                    
                    do
                        uint32_t r10_7 = *i_23
                        int32_t r0_548 = core::CWorldBase::GetInstanceByID(r7_23)
                        void* const r9_7
                        
                        if (r0_548 == 0)
                            r9_7 = nullptr
                        else
                            void* r0_549 = __dynamic_cast(r0_548, _typeinfo_for_core::CInstance, 
                                _typeinfo_for_core::CCardInstance, 0, var_198, var_194, 
                                _vtable_for_ascension::CEventQueryCardAcquireAttributes + 8, 
                                _vtable_for_ascension::CEventQueryCardDefeatAttributes + 8, r0_67, 
                                var_184_1, __n, entry_r1, r0_193, var_174_1, var_170_1, r0_66, 
                                r1_43, r5_6, var_160_1, r5_3 + 0x30, var_158_2, r1_2, r1_276, 
                                var_14c_5, var_148_1, r4_1, r0_3)
                            r9_7 = r0_549
                        
                        uint32_t r4_23
                        
                        if ((r10_7 & 0xf000) == 0x7000 && r9_7 == 0)
                            r4_23 = r10_7 - 0x7000
                            int32_t r0_552 = core::CWorldBase::GetInstanceByID(r7_23)
                            
                            if (r0_552 == 0)
                                goto label_16f340
                            
                            void* r0_553 = __dynamic_cast(r0_552, _typeinfo_for_core::CInstance, 
                                _typeinfo_for_core::CCardInstance, 0, var_198, var_194, 
                                _vtable_for_ascension::CEventQueryCardAcquireAttributes + 8, 
                                _vtable_for_ascension::CEventQueryCardDefeatAttributes + 8, r0_67, 
                                var_184_1, __n, entry_r1, r0_193, var_174_1, var_170_1, r0_66, 
                                r1_43, r5_6, var_160_1, r5_3 + 0x30, var_158_2, r1_2, r1_276, 
                                var_14c_5, var_148_1, r4_1, r0_3)
                            
                            if (r0_553 == 0)
                                goto label_16f340
                            
                            r9_7 = r0_553
                            
                            if (*(r5_3 + 0x30) u<= 0x1d)
                                r4_23 = r10_7
                        else
                            r4_23 = r10_7
                            
                            if (r9_7 == 0)
                            label_16f340:
                                int32_t r0_557 = core::CWorldBase::GetInstanceByID(r7_23)
                                r9_7 = nullptr
                                
                                if (r0_557 == 0)
                                    r4_23 = r10_7
                                else
                                    void* r0_558 = __dynamic_cast(r0_557, 
                                        _typeinfo_for_core::CInstance, 
                                        _typeinfo_for_ascension::CConstructAbilityInstance, 0, 
                                        var_198, var_194, 
                                        _vtable_for_ascension::CEventQueryCardAcquireAttributes
                                            + 8, 
                                        _vtable_for_ascension::CEventQueryCardDefeatAttributes + 8, 
                                        r0_67, var_184_1, __n, entry_r1, r0_193, var_174_1, 
                                        var_170_1, r0_66, r1_43, r5_6, var_160_1, r5_3 + 0x30, 
                                        var_158_2, r1_2, r1_276, var_14c_5, var_148_1, r4_1, r0_3)
                                    r4_23 = r10_7
                                    
                                    if (r0_558 != 0)
                                        r9_7 = *(*(r0_558 + 0xc) + 0x10)
                                        r4_23 = r10_7
                        
                        int32_t r7_28 = i_23[1]
                        
                        if (r7_28 s>= r1_276)
                            r7_28 = r1_276
                        
                        if (r7_28 s>= 1)
                            uint16_t r8_7 = r4_23.w & 0xffff
                            var_194 = r10_7 | 0x1000000
                            var_198 =
                                ascensionrules::CStateProcessPlayerChooseTurnActions::SelectBuyHonor
                            CGameStateOptions::AddSimpleUserOption(var_148_1.w, r8_7, 0xa0e2, 
                                "Buy 1 Honor", var_198)
                            
                            if (r7_28 s>= 2)
                                var_194 = r10_7 | 0x2000000
                                var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectBuyHonor
                                CGameStateOptions::AddSimpleUserOption(var_148_1.w, r8_7, 0xa0e3, 
                                    "Buy 2 Honor", var_198)
                                
                                if (r7_28 s>= 3)
                                    var_194 = r10_7 | 0x3000000
                                    var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectBuyHonor
                                    CGameStateOptions::AddSimpleUserOption(var_148_1.w, r8_7, 
                                        0xa0e4, "Buy 3 Honor", var_198)
                                    
                                    if (r7_28 s>= 4)
                                        var_194 = r10_7 | 0x4000000
                                        var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectBuyHonor
                                        CGameStateOptions::AddSimpleUserOption(var_148_1.w, r8_7, 
                                            0xa0e5, "Buy 4 Honor", var_198)
                                        
                                        if (r7_28 s>= 5)
                                            var_194 = r10_7 | 0x5000000
                                            var_198 = ascensionrules::CStateProcessPlayerChooseTurnActions::SelectBuyHonor
                                            CGameStateOptions::AddSimpleUserOption(var_148_1.w, 
                                                r8_7, 0xa0e6, "Buy 5 Honor", var_198)
                            
                            if (r9_7 != 0)
                                uint32_t r0_573 = var_14c_5
                                
                                if (strcasecmp(*(r9_7 + 0xc) + 4, "The World Tree") == 0)
                                    r0_573 = r10_7
                                
                                var_14c_5 = r0_573
                        
                        r7_23 = r0_3
                        i_23 = &i_23[2]
                        r8_6 = var_148_1
                    while (i_23 != *(r7_23 + 0xb74))
                
                if ((zx.d(*(*(r7_23 + 0xa28) + 1)) & 0x10) != 0)
                    if (zx.d(*(r7_23 + 0xb3d)) == 0 || zx.d(*(r7_23 + 0xb29)) == 0)
                        if (r1_43 s>= 5)
                        label_16f56c:
                            void* r0_580 = *(r7_23 + 0xa88)
                            
                            if (r0_580 != 0)
                                int32_t var_194_2 = 0
                                CGameStateOptions::AddSimpleUserOption(r8_6.w, *(r0_580 + 8), 
                                    0xa0d5, "Pay Insight to Roll Delirium Die", 
                                    ascensionrules::CStateProcessPlayerChooseTurnActions::SelectPayForDeliriumDie)
                    else if (*(r7_23 + 0xb40) + r1_43 s>= 5)
                        goto label_16f56c
                
                int32_t var_194_3 = 0
                CGameStateOptions::AddSimpleUserOption(r8_6.w, 0, 0xa001, "End Turn", 
                    ascensionrules::CStateProcessPlayerChooseTurnActions::SelectEndTurn)
                (*(*r8_6 + 0x34))(r8_6, entry_r1, *(r8_6 + 0x24c), "Play Your Turn")
                
                if (var_14c_5 != 0)
                    int32_t var_198_11 = 0
                    ascension::CWorld::OutputEvent(r0_3, 0xb, zx.d(*(*r4_1 + 8)), var_14c_5)
                
                ascension::CEvent::~CEvent()
                ascension::CEvent::~CEvent()
                int32_t r0_588 = *__stack_chk_guard
                
                if (r0_588 == r0)
                    return r0_588 - r0
            else
                int32_t r4_5 = 1
                
                while (true)
                    void* r0_35 = ascension::CWorld::GetPlayerByTurnOrder(r5_3, r2_6)
                    int32_t* r1_13 = *(r0_35 + 0x48)
                    int32_t r0_36 = *(r0_35 + 0x4c)
                    
                    if (r1_13 != r0_36)
                        while (true)
                            void* r2_8 = *r1_13
                            uint32_t* r3_10 = *(*(r2_8 + 0x10) + 0xc)
                            
                            if (r3_10[0x22] == 0xa)
                                int32_t r7_7 = r3_10[0x2f]
                                
                                if (r7_7 s>= 1)
                                    r5_3 = r0_3
                                
                                if (r7_7 s>= 1 && *(r0_3 + 0xb50) s>= r7_7)
                                label_16c6d4:
                                    int32_t r0_74 = *__stack_chk_guard
                                    
                                    if (r0_74 == r0)
                                        return ascensionrules::CStateProcessPlayerChooseTurnActions::SelectAcquireTempleFromOpponent(
                                            r0_74 - r0, r9, zx.d(*(r2_8 + 8)), r3_10) __tailcall
                                    
                                    break
                                
                                r3_10 = r3_10[0x30]
                                
                                if (r3_10 s>= 1 && *(r5_3 + 0xb54) s>= r3_10)
                                    goto label_16c6d4
                            
                            r1_13 = &r1_13[1]
                            
                            if (r0_36 == r1_13)
                                goto label_16c4a4
                        
                        break
                    
                label_16c4a4:
                    r4_5 += 1
                    r2_6 = *r4_1
                    
                    if (r4_5 u>= (*(r5_3 + 0x1c) - *(r5_3 + 0x18)) s>> 2)
                        goto label_16c4c4
        else
            while (true)
                void* r2_4 = *r0_30
                uint32_t* r3_8 = *(r2_4 + 0xc)
                
                if (r3_8[0x22] == 0xa)
                    int32_t r7_4 = r3_8[0x2f]
                    
                    if (r7_4 s>= 1)
                        r5_3 = r0_3
                    
                    if (r7_4 s>= 1 && *(r0_3 + 0xb50) s>= r7_4)
                    label_16c6f8:
                        int32_t r0_77 = *__stack_chk_guard
                        
                        if (r0_77 == r0)
                            return ascensionrules::CStateProcessPlayerChooseTurnActions::SelectAcquireTempleFromAvailableTemples(
                                r0_77 - r0, r9, zx.d(*(r2_4 + 8)), r3_8) __tailcall
                        
                        break
                    
                    r3_8 = r3_8[0x30]
                    
                    if (r3_8 s>= 1 && *(r5_3 + 0xb54) s>= r3_8)
                        goto label_16c6f8
                
                r0_30 = &r0_30[1]
                
                if (r1_10 == r0_30)
                    goto label_16c410
    else
        while (true)
            void* r4_4 = *r6_2
            int32_t r0_23
            uint32_t* r3_6
            r0_23, r3_6 = ascension::CWorld::HasPlayedCardInPlayAbility(r0_3)
            
            if (r0_23 == 0)
                ascension::CWorld* r5_2 = *(r4_4 + 0x10)
                
                if (r5_2 == 0)
                label_16c380:
                    
                    if (*(r5_2 + 0x20) != 0)
                        if (*__stack_chk_guard == r0)
                            return ascensionrules::CStateProcessPlayerChooseTurnActions::SelectUseCurrentEventAbility(
                                entry_r1, r9, zx.d(*(r4_4 + 8)), r3_6) __tailcall
                        
                        break
                else if (zx.d(*(r5_2 + 0x191)) != 0)
                    int32_t r0_27
                    r0_27, r3_6 = ascension::CCardInPlayAbilityDefinition::CheckAbilityConditions(
                        r5_2, r0_3, *r4_1)
                    
                    if (r0_27 != 0)
                        goto label_16c380
            
            r6_2 = &r6_2[1]
            
            if (r6_2 == *(r1_2 + 0x24))
                goto label_16c398
else
    while (true)
        void* r4_2 = *r7
        int32_t* r6_1 = *(r4_2 + 0x3c)
        
        if (r6_1 != *(r4_2 + 0x40))
            while (true)
                void* r5_1 = *r6_1
                int32_t r0_7
                uint32_t* r3_2
                r0_7, r3_2 = ascension::CWorld::HasPlayedConstructAbility(r0_3)
                
                if (r0_7 == 0)
                    ascension::CWorld* r0_8 = *(r5_1 + 0x10)
                    
                    if (r0_8 == 0)
                    label_16c278:
                        
                        if (*(r5_1 + 0x14) == 0)
                            if (*__stack_chk_guard == r0)
                                return ascensionrules::CStateProcessPlayerChooseTurnActions::SelectUseConstruct(
                                    entry_r1, r9, zx.d(*(r5_1 + 8)), r3_2) __tailcall
                            
                            break
                    else if (zx.d(*(r0_8 + 0x199)) != 0)
                        int32_t r0_9
                        r0_9, r3_2 = ascension::CConstructAbilityDefinition::CheckAbilityConditions(
                            r0_8, r0_3, *r4_1)
                        
                        if (r0_9 != 0)
                            goto label_16c278
                
                r6_1 = &r6_1[1]
                
                if (r6_1 == *(r4_2 + 0x40))
                    r2_1 = *r4_1
                    goto label_16c29c
            
            break
        
    label_16c29c:
        r7 = &r7[1]
        
        if (r7 == *(r2_1 + 0x58))
            goto label_16c2a8
label_16f650:
__stack_chk_fail()
noreturn
