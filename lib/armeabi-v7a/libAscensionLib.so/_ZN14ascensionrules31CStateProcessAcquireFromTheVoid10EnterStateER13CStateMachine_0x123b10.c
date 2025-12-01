// 函数: _ZN14ascensionrules31CStateProcessAcquireFromTheVoid10EnterStateER13CStateMachine
// 地址: 0x123b10
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* r4 = *(arg1 + 0x24c)
ascension::CPlayer* r6 = *(r4 + 4)
int32_t r0_2 = *(*(r6 + 0xa4c) + 0x18)

if (r0_2 s>= 1)
    int32_t r1 = *(r4 + 0x8c)
    int32_t r1_1 = *(r6 + 0xb40)
    int32_t r1_2 = *(r6 + 0xb44)
    int32_t r1_3 = *(r6 + 0xb48)
    uint32_t r0_3
    int32_t r1_4
    r1_4:r0_3 = mulu.dp.d(r0_2, 0x44)
    
    if (r1_4 != 0)
        r1_4 = 1
    
    if (r1_4 != 0)
        r0_3 = 0xffffffff
    
    int32_t r0_4 = operator new[](r0_3)
    *(arg1 + 0x25c) = r0_4
    int32_t var_7c_1 = 6
    int32_t var_78_1 = 0
    void* __offset(vtable_for_ascension::CEventQueryCardAcquireAttributes, 0x8) var_80 =
        _vtable_for_ascension::CEventQueryCardAcquireAttributes + 8
    void* var_34_1 = r4
    int32_t var_30_1 = 0
    int32_t var_2c_1 = r0_4
    void* r0_5 = *(r6 + 0xa4c)
    int32_t* i = *(r0_5 + 0xc)
    
    if (i != *(r0_5 + 0x10))
        void* __offset(vtable_for_ascension::CEventQueryCardAcquireAttributes, 0x8)* var_a0_1 =
            &var_80
        
        do
            int32_t r4_1 = *i
            
            if (r4_1 != 0)
                int32_t r0_8 = *(*(r4_1 + 0xc) + 0x88)
                
                if (r0_8 - 1 u< 2)
                    int32_t r1_6 = *(arg1 + 0x250)
                    
                    if (r1_6 == 0 || r0_8 == r1_6)
                        int32_t r0_10
                        
                        if (*(arg1 + 0x254) != 0)
                            r0_10 = ascension::CWorld::QueryCardFaction(r6, *(arg1 + 0x24c), r4_1)
                        
                        if (*(arg1 + 0x254) == 0 || r0_10 != 0)
                            ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_80, 
                                r4_1, 9)
            
            i = &i[1]
        while (i != *(*(r6 + 0xa4c) + 0x10))
    
    void* __offset(vtable_for_ascension::CEventQueryCardAcquireAttributes, 0x8)* var_a0_2 = &var_80
    ascension::CWorld::HandleQuery(r6)
    
    if (var_30_1 s>= 1)
        int32_t r3_3 = 0
        int32_t* r1_10 = *(arg1 + 0x25c) + 0xc
        
        do
            r3_3 += 1
            
            if (*r1_10 s<= 0xffffffff)
                *r1_10 = 0
            
            r1_10 = &r1_10[0x11]
        while (r3_3 s< var_30_1)
    
    *(arg1 + 0x258) = var_30_1
    void* r0_16 = *(r6 + 0xa4c)
    int32_t* i_1 = *(r0_16 + 0xc)
    
    if (i_1 != *(r0_16 + 0x10))
        int32_t var_84_1 = 0
        
        do
            void* r9_1 = *i_1
            
            if (r9_1 != 0)
                void* r7_2 = *(r9_1 + 0xc)
                int32_t r2_3 = *(r7_2 + 0x88)
                
                if (r2_3 - 1 u< 2)
                    int32_t r0_21 = *(arg1 + 0x250)
                    
                    if (r0_21 == 0 || r2_3 == r0_21)
                        if (*(arg1 + 0x254) == 0)
                            goto label_123d4c
                        
                        if (ascension::CWorld::QueryCardFaction(r6, *(arg1 + 0x24c), r9_1) != 0)
                            r2_3 = *(r7_2 + 0x88)
                        label_123d4c:
                            int32_t r1_12 = var_84_1 * 0x11
                            var_84_1 += 1
                            void* r8_1 = *(arg1 + 0x25c) + (r1_12 << 2)
                            int32_t r0_25 = *(r7_2 + 0xa0)
                            int32_t lr_1 = *(r8_1 + 0xc)
                            uint32_t r12_1 = zx.d(*(r8_1 + 0x18))
                            int32_t r1_16
                            
                            if (r2_3 == 1 && zx.d(*(r6 + 0xb2c)) != 0)
                                r1_16 = *(r7_2 + 0xa4) + lr_1 - *(r8_1 + 8)
                            
                            int32_t r3_4
                            int32_t r10_1
                            
                            if (r2_3 != 1 || zx.d(*(r6 + 0xb2c)) == 0 || lr_1 s<= r1_16)
                                if (r0_25 s< 1)
                                    goto label_123de0
                                
                                if (r1_3 s>= r0_25)
                                    r10_1 = r1_3 - r0_25
                                label_123df0:
                                    r3_4 = r1_1
                                    goto label_123e00
                                
                                int32_t r0_26 = r0_25 - r1_3
                                r10_1 = 0
                                
                                if (r0_26 s< 1)
                                    goto label_123df0
                                
                                if (r1_1 s>= r0_26 && zx.d(*(r6 + 0xb29)) != 0)
                                    r3_4 = r1_1 - r0_26
                                    goto label_123e00
                            else
                                lr_1 = r1_16 & not.d(r1_16 s>> 0x1f)
                            label_123de0:
                                r3_4 = r1_1
                                r10_1 = r1_3
                            label_123e00:
                                
                                if (r12_1 != 0 || zx.d(*(r7_2 + 0xd5)) != 0)
                                    r3_4 += r10_1
                                else if (zx.d(*(r6 + 0xb2b)) != 0)
                                    r3_4 += r10_1
                                
                                if (zx.d(*(r7_2 + 0xd6)) != 0)
                                    r3_4 += r1
                                
                                if (zx.d(*(r7_2 + 0xd6)) != 0 && zx.d(*(r6 + 0xb3d)) != 0
                                        && (zx.d(*(r7_2 + 0xd5)) | r12_1) == 0
                                        && zx.d(*(r6 + 0xb2b)) == 0)
                                    if (*(r6 + 0x30) u> 0x16)
                                        r3_4 += r10_1
                                    
                                    if (lr_1 s> r3_4)
                                        goto label_123e44
                                    
                                    goto label_123e80
                                
                                if (lr_1 s<= r3_4)
                                label_123e80:
                                    int32_t r10_2 = *(r8_1 + 0x40)
                                    uint32_t __n = *(r8_1 + 0x1c)
                                    
                                    if (*(r6 + 0x30) u< 2)
                                        void* var_a4_5 = r9_1
                                        CGameStateOptions::AddSimpleUserOption(arg1.w, *(r9_1 + 8), 
                                            0xa025, "Acquire %s", 
                                            ascensionrules::CStateProcessAcquireFromTheVoid::SelectAcquireFromTheVoid)
                                        
                                        if (*(r6 + 0x30) u>= 2)
                                            if (memchr(r8_1 + 0x20, 1, __n) != 0 && (
                                                    r10_2 == 0xffffffff
                                                    || zx.d(*(r8_1 + r10_2 + 0x20)) == 1))
                                                void* var_a4_6 = r9_1
                                                CGameStateOptions::AddSimpleUserOption(arg1.w, 
                                                    *(r9_1 + 8), 0xa028, "Acquire %s to Hand", 
                                                    ascensionrules::CStateProcessAcquireFromTheVoid::SelectAcquireFromTheVoidToHand)
                                            
                                            if (memchr(r8_1 + 0x20, 2, __n) != 0)
                                                void* var_a4_7 = r9_1
                                                CGameStateOptions::AddSimpleUserOption(arg1.w, 
                                                    *(r9_1 + 8), 0xa026, 
                                                    "Acquire %s to Top of Deck", 
                                                    ascensionrules::CStateProcessAcquireFromTheVoid::SelectAcquireFromTheVoidToTopOfDeck)
                                            
                                            if (memchr(r8_1 + 0x20, 4, __n) != 0)
                                                void* var_a4_8 = r9_1
                                                CGameStateOptions::AddSimpleUserOption(arg1.w, 
                                                    *(r9_1 + 8), 0xa027, "Acquire %s into play", 
                                                    ascensionrules::CStateProcessAcquireFromTheVoid::SelectAcquireFromTheVoidIntoPlay)
                                    else
                                        if (r10_2 == 0xffffffff)
                                            void* var_a4_1 = r9_1
                                            CGameStateOptions::AddSimpleUserOption(arg1.w, 
                                                *(r9_1 + 8), 0xa025, "Acquire %s", 
                                                ascensionrules::CStateProcessAcquireFromTheVoid::SelectAcquireFromTheVoid)
                                        
                                        if (memchr(r8_1 + 0x20, 1, __n) != 0 && (r10_2 == 0xffffffff
                                                || zx.d(*(r8_1 + r10_2 + 0x20)) == 1))
                                            void* var_a4_2 = r9_1
                                            CGameStateOptions::AddSimpleUserOption(arg1.w, 
                                                *(r9_1 + 8), 0xa028, "Acquire %s to Hand", 
                                                ascensionrules::CStateProcessAcquireFromTheVoid::SelectAcquireFromTheVoidToHand)
                                        
                                        if (memchr(r8_1 + 0x20, 2, __n) != 0 && (r10_2 == 0xffffffff
                                                || zx.d(*(r8_1 + r10_2 + 0x20)) == 2))
                                            void* var_a4_3 = r9_1
                                            CGameStateOptions::AddSimpleUserOption(arg1.w, 
                                                *(r9_1 + 8), 0xa026, "Acquire %s to Top of Deck", 
                                                ascensionrules::CStateProcessAcquireFromTheVoid::SelectAcquireFromTheVoidToTopOfDeck)
                                        
                                        if (memchr(r8_1 + 0x20, 4, __n) != 0 && (r10_2 == 0xffffffff
                                                || zx.d(*(r8_1 + r10_2 + 0x20)) == 4))
                                            void* var_a4_4 = r9_1
                                            CGameStateOptions::AddSimpleUserOption(arg1.w, 
                                                *(r9_1 + 8), 0xa027, "Acquire %s into play", 
                                                ascensionrules::CStateProcessAcquireFromTheVoid::SelectAcquireFromTheVoidIntoPlay)
                                else
                                label_123e44:
                                    
                                    if (r2_3 == 2 && lr_1 s<= r3_4 + r1_2 &&
                                            ascension::CWorld::QueryCardFaction(r6, 
                                            *(arg1 + 0x24c), r9_1) != 0)
                                        goto label_123e80
            
            i_1 = &i_1[1]
        while (i_1 != *(*(r6 + 0xa4c) + 0x10))
    
    ascension::CEvent::~CEvent()

int32_t var_a4_9 = 0
CGameStateOptions::AddSimpleUserOption(arg1.w, 0, 0xa000, "None", 0)
int32_t entry_r1
(*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), "You May Acquire a Card from the Void")
int32_t r0_72 = *__stack_chk_guard

if (r0_72 == r0)
    return r0_72 - r0

__stack_chk_fail()
noreturn
