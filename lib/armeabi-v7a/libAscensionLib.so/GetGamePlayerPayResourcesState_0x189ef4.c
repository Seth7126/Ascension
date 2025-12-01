// 函数: GetGamePlayerPayResourcesState
// 地址: 0x189ef4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r0 = *s_pWorldData

if (r0 == 0)
labelid_1:
    __aeabi_memclr4(arg2, 0x2c)
else
    int32_t r2_1 = *(r0 + 0xd4)
    
    if (r2_1 s< 1)
    label_189fe4:
        __aeabi_memclr4(arg2, 0x2c)
    else
        int32_t* r3_1 = r0 + 0x14
        int32_t r7_1 = 0
        
        while (*r3_1 != arg1)
            r7_1 += 1
            r3_1 = &r3_1[0xc]
            
            if (r7_1 s>= r2_1)
                goto label_189fe4_2
        
        core::CCardInstance* r5_1 = *(r0 + *(s_InterfaceContext + 0x10) * 0x34 + 0x124)
        
        if (r5_1 == 0)
        label_189fe4_1:
            __aeabi_memclr4(arg2, 0x2c)
        else
            void* r0_3 = ascension::CWorld::GetPlayerByIndex(r5_1)
            
            if (r0_3 == 0)
            label_189fe4_2:
                __aeabi_memclr4(arg2, 0x2c)
            else
                int32_t* r7_2 = *(r0_3 + 0xac)
                int32_t r9_1 = *r7_2
                
                if (r9_1 == 0)
                label_18a044:
                    void* r0_15 = *(r5_1 + 0xa88)
                    
                    if (r0_15 == 0 || r9_1 != r0_15)
                        *arg2 = 0
                        arg2[1] = 0
                    else
                        *arg2 = zx.d(*(r0_15 + 8))
                        arg2[1] = 5
                else
                    void* r0_5 = __dynamic_cast(r9_1, _typeinfo_for_core::CInstance, 
                        _typeinfo_for_core::CCardInstance, 0)
                    
                    if (r0_5 == 0)
                        void* r0_13 = __dynamic_cast(r9_1, _typeinfo_for_core::CInstance, 
                            _typeinfo_for_ascension::CCardInPlayInstance, 0)
                        
                        if (r0_13 == 0)
                            r0_13 = __dynamic_cast(r9_1, _typeinfo_for_core::CInstance, 
                                _typeinfo_for_ascension::CConstructInstance, 0)
                            
                            if (r0_13 == 0)
                                goto label_18a044
                        
                        *arg2 = zx.d(*(*(r0_13 + 0x10) + 8))
                        arg2[1] = 3
                    else
                        *arg2 = zx.d(*(r0_5 + 8))
                        
                        if (ascension::CWorld::IsResolveEffect(r5_1) == 0)
                            int32_t r1_5 = 1
                            
                            if (*(*(r0_5 + 0xc) + 0x88) == 3)
                                r1_5 = 2
                            
                            arg2[1] = r1_5
                        else
                            arg2[1] = 4
                
                int32_t r2_6 = r7_2[8]
                arg2[2] = r2_6
                int32_t r1_6 = r7_2[9]
                arg2[3] = r1_6
                int32_t r12_1 = r7_2[0xa]
                arg2[4] = r12_1
                int32_t r0_19 = r7_2[5]
                arg2[5] = r0_19
                int32_t r6_3 = r7_2[6]
                bool cond:1_1 = r0_19 s>= 1
                arg2[6] = r6_3
                
                if (r0_19 s>= 1)
                    r0_19 = r2_6 | 2
                
                int32_t r3_2 = r7_2[7]
                arg2[7] = r3_2
                arg2[8] = *(r5_1 + 0xb40)
                arg2[9] = *(r5_1 + 0xb48)
                arg2[0xa] = *(r0_3 + 0x8c)
                
                if (cond:1_1)
                    arg2[2] = r0_19
                
                if (r6_3 s>= 1)
                    arg2[3] = r1_6 | 4
                
                if (r3_2 s>= 1)
                    arg2[4] = r12_1 | 8

return 0x2c
