// 函数: _ZN14ascensionrules37CStateProcessDefeatMonsterFromTheVoid10EnterStateER13CStateMachine
// 地址: 0x15d220
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* r7 = *(arg1 + 0x24c)
ascension::CEvent* r6 = *(r7 + 4)
int32_t r8 = *(r7 + 0x8c)
int32_t r1 = *(r6 + 0xb48)
int32_t r0_3

if (zx.d(*(r6 + 0xb29)) != 0)
    r1 += *(r6 + 0xb40)
    r0_3 = 0
else if (zx.d(*(r6 + 0xb2a)) != 0)
    r0_3 = *(r6 + 0xb40) + r1
else
    r0_3 = 0

int32_t r0_7 = *(*(r6 + 0xa4c) + 0x18)

if (r0_7 s>= 1)
    uint32_t r0_8
    int32_t r1_1
    r1_1:r0_8 = mulu.dp.d(r0_7, 0x34)
    
    if (r1_1 != 0)
        r1_1 = 1
    
    if (r1_1 != 0)
        r0_8 = 0xffffffff
    
    int32_t r0_9 = operator new[](r0_8)
    *(arg1 + 0x258) = r0_9
    int32_t var_7c_1 = 8
    int32_t var_78_1 = 0
    void* __offset(vtable_for_ascension::CEventQueryCardDefeatAttributes, 0x8) var_80 =
        _vtable_for_ascension::CEventQueryCardDefeatAttributes + 8
    void* var_34_1 = r7
    int32_t var_30_1 = 0
    int32_t var_2c_1 = r0_9
    void* r2_2 = *(r6 + 0xa4c)
    
    for (int32_t* i = *(r2_2 + 0xc); i != *(r2_2 + 0x10); i = &i[1])
        int32_t r1_2 = *i
        
        if (r1_2 != 0 && *(*(r1_2 + 0xc) + 0x88) == 3)
            ascension::CEventQueryCardDefeatAttributes::AddQueryCard(&var_80, r1_2)
            r2_2 = *(r6 + 0xa4c)
    
    void* __offset(vtable_for_ascension::CEventQueryCardDefeatAttributes, 0x8)* var_94_1 = &var_80
    ascension::CWorld::HandleQuery(r6)
    
    if (var_30_1 s>= 1)
        int32_t r3_1 = 0
        int32_t* r1_4 = *(arg1 + 0x258) + 0xc
        
        do
            r3_1 += 1
            
            if (*r1_4 s<= 0xffffffff)
                *r1_4 = 0
            
            r1_4 = &r1_4[0xd]
        while (r3_1 s< var_30_1)
    
    *(arg1 + 0x254) = var_30_1
    void* r0_17 = *(r6 + 0xa4c)
    int32_t r2_4 = r1
    int32_t* i_1 = *(r0_17 + 0xc)
    
    if (i_1 != *(r0_17 + 0x10))
        int32_t r4_1 = 0
        int32_t r0_19 = r2_4 + r8
        
        do
            void* r8_1 = *i_1
            
            if (r8_1 != 0)
                void* r10_1 = *(r8_1 + 0xc)
                
                if (*(r10_1 + 0x88) == 3)
                    if (zx.d(*(arg1 + 0x250)) == 0)
                    label_15d448:
                        void* var_9c_1 = r8_1
                        CGameStateOptions::AddSimpleUserOption(arg1.w, *(r8_1 + 8), 0xa042, 
                            "Defeat %s", 
                            ascensionrules::CStateProcessDefeatMonsterFromTheVoid::SelectDefeatFromTheVoid)
                        
                        if (*(*(arg1 + 0x24c) + 0xa8) s>= 1)
                            void* var_9c_2 = r8_1
                            CGameStateOptions::AddSimpleUserOption(arg1.w, *(r8_1 + 8), 0xa048, 
                                "Defeat %s into Play", 
                                ascensionrules::CStateProcessDefeatMonsterFromTheVoid::SelectDefeatFromTheVoidIntoPlay)
                        
                        if (*(r6 + 0x30) u>= 2)
                            void* r0_34 = *(arg1 + 0x258) + r4_1 * 0x34
                            
                            if (memchr(r0_34 + 0x1c, 3, *(r0_34 + 0x18)) != 0)
                                void* var_9c_3 = r8_1
                                CGameStateOptions::AddSimpleUserOption(arg1.w, *(r8_1 + 8), 0xa044, 
                                    "Defeat %s to Discard Pile", 
                                    ascensionrules::CStateProcessDefeatMonsterFromTheVoid::SelectDefeatFromTheVoidToDiscardPile)
                        
                        r4_1 += 1
                        r2_4 = r1
                    else
                        int32_t r7_2 = *(*(arg1 + 0x258) + r4_1 * 0x34 + 0xc)
                        
                        if (r2_4 s>= r7_2)
                            goto label_15d448
                        
                        if (r0_3 s>= r7_2 && ascension::CCard::IsCardFaction(r10_1) == 1)
                            goto label_15d448
                        
                        uint32_t r0_27 = zx.d(*(r10_1 + 0xd7))
                        int32_t r1_7 = r0_27 ^ 1
                        
                        if (r0_19 s< r7_2)
                            r1_7 = 1
                        
                        r4_1 += r1_7
                        
                        if (r0_19 s< r7_2)
                            r2_4 = r1
                        else
                            r2_4 = r1
                            
                            if (r0_27 != 0)
                                goto label_15d448
            
            i_1 = &i_1[1]
        while (i_1 != *(*(r6 + 0xa4c) + 0x10))
    
    ascension::CEvent::~CEvent()

int32_t var_9c_4 = 0
CGameStateOptions::AddSimpleUserOption(arg1.w, 0, 0xa000, "None", 0)
int32_t entry_r1
(*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), "You May Defeat a Monster in the Void")
int32_t r0_43 = *__stack_chk_guard

if (r0_43 == r0)
    return r0_43 - r0

__stack_chk_fail()
noreturn
