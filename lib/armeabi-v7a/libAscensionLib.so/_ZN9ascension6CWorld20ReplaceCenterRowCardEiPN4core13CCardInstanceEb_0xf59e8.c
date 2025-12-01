// 函数: _ZN9ascension6CWorld20ReplaceCenterRowCardEiPN4core13CCardInstanceEb
// 地址: 0xf59e8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* const result = nullptr
int32_t r0 = *__stack_chk_guard

if (arg2 s>= 0)
    int32_t r0_1 = *(arg1 + 0xa40)
    
    if (arg2 s< (*(arg1 + 0xa44) - r0_1) s>> 2)
        void* const r5_1
        
        if (arg3 == 0)
            void* r1_2 = *(r0_1 + (arg2 << 2))
            r5_1 = nullptr
            int32_t r1_3 = *(r1_2 + 0x10)
            
            if (*(r1_2 + 0xc) != r1_3)
                arg3 = (*(r1_3 - 8)).b
                
                if (arg3 != 0)
                    r5_1 = *(arg3 + 0xc)
        else
            r5_1 = *(arg3 + 0xc)
        
        void* r0_2 = *(r0_1 + (arg2 << 2))
        int32_t r0_3 = *(r0_2 + 0x10)
        
        if (*(r0_2 + 0xc) == r0_3 || *(r0_3 - 4) == 3)
            int32_t r0_6
            int32_t entry_r3
            
            if (entry_r3 != 0)
                r0_6 = ascension::CDatabase::GetCard(ascension::g_Database)
            
            void* __offset(core::CCardInstance, -0x1) r1_7
            void* result_1
            
            if (entry_r3 == 0 || r0_6 == 0)
                void* __offset(core::CCardInstance, -0x1) r3 = 0xffffffff
                
                if (arg2 s>= 1)
                    int32_t r0_9 = *(arg1 + 0xa40)
                    
                    if (arg2 s> (*(arg1 + 0xa44) - r0_9) s>> 2)
                        goto label_f5b08
                    
                    void* r0_10 = *(r0_9 + ((arg2 - 1) << 2))
                    int32_t r0_11 = *(r0_10 + 0x10)
                    
                    if (*(r0_10 + 0xc) == r0_11)
                        goto label_f5b08
                    
                    void* r0_12 = *(r0_11 - 8)
                    
                    if (r0_12 == 0 || r5_1 == 0 || *(r5_1 + 0x88) == 3)
                        goto label_f5b08
                    
                    r3 = 0xffffffff
                    
                    if (strcasecmp(*(r0_12 + 0xc) + 4, "Explosive Swarm") != 0)
                        goto label_f5b08
                    
                    void* result_5 = ascension::CWorld::CreateCard(arg1)
                    r1_7 = arg2 - 1
                    result_1 = result_5
                    r3 = r1_7
                    
                    if (result_5 != 0)
                        goto label_f5bb0
                    
                    goto label_f5b08
                
            label_f5b08:
                int32_t r0_13 = *(arg1 + 0xa40)
                
                if (arg2 + 1 s< (*(arg1 + 0xa44) - r0_13) s>> 2)
                    void* r0_14 = *(r0_13 + ((arg2 + 1) << 2))
                    int32_t r0_15 = *(r0_14 + 0x10)
                    
                    if (*(r0_14 + 0xc) == r0_15)
                        goto label_f5b54
                    
                    void* r0_16 = *(r0_15 - 8)
                    
                    if (r0_16 == 0 || r5_1 == 0 || *(r5_1 + 0x88) == 3)
                        goto label_f5b54
                    
                    r1_7 = r3
                    
                    if (strcasecmp(*(r0_16 + 0xc) + 4, "Explosive Swarm") != 0)
                        goto label_f5b60
                    
                    void* result_4 = ascension::CWorld::CreateCard(arg1)
                    result_1 = result_4
                    r1_7 = arg2 + 1
                    
                    if (result_4 != 0)
                        goto label_f5bb0
                    
                    goto label_f5b60
                
            label_f5b54:
                r1_7 = r3
            label_f5b60:
                void* result_2
                
                if (zx.d(*(arg1 + 0xa14)) == 0)
                    if (*(*(arg1 + 0xa3c) + 0x18) == 0)
                        ascension::CWorld::ShuffleVoidCardsIntoPortalDeck()
                        *(arg1 + 0xa3c)
                    
                    result_2 = core::CCardStack::RemoveTopCard()
                    result_1 = result_2
                
                if (zx.d(*(arg1 + 0xa14)) == 0 && result_2 != 0)
                    goto label_f5bb0
                
                result = nullptr
            else
                result_1 = ascension::CWorld::CreatePortalCard(arg1)
                r1_7 = 0xffffffff
            label_f5bb0:
                
                while (true)
                    int32_t r0_22 = *(*(result_1 + 0xc) + 0x88)
                    
                    if (r0_22 == 4)
                        int32_t r1_17 = *(arg1 + 0xa6c)
                        
                        if (r1_17 != 0)
                            ascension::CWorld::RemoveEventCardInPlay(arg1, r1_17.b)
                        
                        ascension::CWorld::PutEventCardInPlay(arg1)
                        void* r0_25 = *(arg1 + 0xa3c)
                        int32_t* r2_3 = *(r0_25 + 0xc)
                        int32_t r3_1 = *(r0_25 + 0x10)
                        
                        if (r2_3 != r3_1)
                            while (true)
                                void* r1_19 = *r2_3
                                r2_3 = &r2_3[1]
                                
                                if (*(*(r1_19 + 0xc) + 0x88) - 4 u>= 3)
                                    break
                                
                                if (r3_1 == r2_3)
                                    goto label_f5c14
                            
                        label_f5c7c:
                            
                            if (zx.d(*(arg1 + 0xa14)) != 0)
                                result = nullptr
                                break
                            
                            result = nullptr
                            
                            if (*(r0_25 + 0x18) == 0)
                                ascension::CWorld::ShuffleVoidCardsIntoPortalDeck()
                                *(arg1 + 0xa3c)
                            
                            void* result_3 = core::CCardStack::RemoveTopCard()
                            result_1 = result_3
                            
                            if (result_3 == 0)
                                break
                            
                            continue
                        
                    label_f5c14:
                        void* r1_23 = *(arg1 + 0xa4c)
                        
                        for (int32_t* i = *(r1_23 + 0xc); i != *(r1_23 + 0x10); i = &i[1])
                            void* r6 = *i
                            
                            if (*(*(r6 + 0xc) + 0x88) - 4 u>= 3)
                                int32_t* r1_27 = *(arg1 + 0xbd8)
                                int32_t r5_3 = *(arg1 + 0xbdc)
                                
                                if (r1_27 != r5_3)
                                    do
                                        int32_t r7_1 = *r1_27
                                        r1_27 = &r1_27[2]
                                        
                                        if (r7_1 == r6)
                                            goto label_f5c68
                                    while (r5_3 != r1_27)
                                
                                goto label_f5c7c
                            
                        label_f5c68:
                        
                        if (*(arg1 + 0x30) u> 8)
                            result = nullptr
                            break
                        
                        result = nullptr
                        
                        if (result_1 == 0)
                            break
                        
                        r0_22 = *(*(result_1 + 0xc) + 0x88)
                    
                    int32_t r1_31 = *(arg1 + 0xa40)
                    
                    if (arg2 s< (*(arg1 + 0xa44) - r1_31) s>> 2)
                        if (r0_22 == 8)
                            ascension::CWorld::AssignPortalCard(arg1)
                            r1_31 = *(arg1 + 0xa40)
                        
                        ascension::CCenterRowInstance::PutCardOnTop(*(r1_31 + (arg2 << 2)), 
                            result_1)
                    
                    int32_t var_48
                    char var_40_1
                    
                    if (r1_7 == 0xffffffff)
                        var_48 = 0x8000001
                        int32_t var_44_2 = 0x8000201
                        var_40_1 = 7
                        int32_t var_3c_2 = 0
                    else
                        var_48 = 0x8000001
                        int32_t var_44_1 = 0x7000701
                        var_40_1 = 7
                        void* __offset(core::CCardInstance, -0x1) var_3c_1 = r1_7
                    
                    core::CCardInstance* var_38_1 = arg2
                    int32_t var_30_1 = 0
                    uint32_t var_34_1 = zx.d(*(result_1 + 8))
                    int32_t var_2c_1 = 0
                    core::CWorldBase::SendStateChange(arg1, &var_48)
                    int32_t var_44_3 = 5
                    var_48 = 0x8000002
                    int32_t var_34_2 = 0
                    int32_t var_38_2 = 0
                    int32_t var_3c_3 = 0
                    var_40_1.d = 0
                    core::CWorldBase::SendStateChange(arg1, &var_48)
                    result = result_1
                    break

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
