// 函数: ForceUpdateStateMachineInput
// 地址: 0x19789c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r3 = *__stack_chk_guard
int32_t result

if (*s_pWorldData == 0)
    result = 0
else
    int32_t* r2_1 = *(s_InterfaceContext + 4)
    int32_t r12_1 = *(s_InterfaceContext + 0x10)
    data_1f5898 = arg1
    data_1f5894 = arg1
    data_1f589c = arg2
    data_1f5890 = 0
    data_1f4e48 = 0
    
    if (r2_1 != 0)
        int32_t* r0 = *r2_1
        
        if (r0 != 0 && (*(*r0 + 0x14))() != 0)
            uint32_t r1_6 = *s_pWorldData
            int32_t r4_1 = *(r1_6 + (r12_1 << 2) + 0xfc)
            
            if (r4_1 u< *(r1_6 + 0x10c) && r4_1 u< *(r1_6 + 0x114))
                int32_t* r0_13 = **(s_InterfaceContext + 4)
                
                if (r0_13 != 0)
                    int32_t r6_1 = *(r1_6 + 0x120)
                    int32_t i = *(r6_1 + (r4_1 << 4))
                    
                    if ((*(*r0_13 + 0x18))() != 0)
                        void* r0_15 = r6_1 + (r4_1 << 4)
                        uint32_t r8_1 = *s_pWorldData
                        int32_t r12_2 = r12_1
                        uint32_t r1_8 = zx.d(*(r0_15 + 6))
                        uint32_t lr_1 = zx.d(*(r0_15 + 8))
                        int32_t r3_1 = sx.d(*(r0_15 + 4))
                        int32_t* var_2c = *(r0_15 + 0xc)
                        *(r8_1 + (r12_1 << 2) + 0xfc) += 1
                        int32_t r1_11 = *(r8_1 + 0x110)
                        
                        if (r1_11 u< *(r8_1 + 0x10c))
                            *(r8_1 + (r12_1 << 2) + 0xfc) = r1_11
                            *(r8_1 + 0x10c) = *(r8_1 + 0x110)
                            *(r8_1 + 0x110) = 0xffffffff
                        
                        int32_t r1_12 = *(r8_1 + 0xd4)
                        int32_t var_38_1
                        int32_t r6_4
                        
                        if (r1_12 s< 1)
                        label_197b10:
                            r6_4 = 0
                            var_38_1 = 0
                        else
                            int32_t* r2_11 = r8_1 + 0x14
                            int32_t r0_20 = 0
                            
                            while (i != *r2_11)
                                r0_20 += 1
                                r2_11 = &r2_11[0xc]
                                
                                if (r0_20 s>= r1_12)
                                    goto label_197b10
                            
                            if (*(r8_1 + 0xf8) != 3)
                                *(r8_1 + 0xd8) &= (not.d(1 << (r0_20 & 0xff))).b
                            
                            void* r0_28 = r8_1 + r12_2 * 0x34 + (r0_20 << 2)
                            var_38_1 = *(r0_28 + 0x138)
                            r6_4 = *(r0_28 + 0x148)
                            *(r0_28 + 0x138) = 0
                            *(r0_28 + 0x148) = 0
                        
                        uint32_t r0_29 = *(s_InterfaceContext + 8)
                        
                        if (r0_29 != 0)
                            GameOptionManager::ResetPlayerOptionEntry(r0_29)
                            r12_2 = r12_1
                        
                        if (var_38_1 != 0)
                            int32_t* r1_22 = var_2c
                            int32_t* r2_16 = &var_2c
                            
                            if (r1_22 == 0)
                                r2_16 = r1_22
                            
                            var_38_1(*(r8_1 + r12_2 * 0x34 + 0x130), r6_4, i, r3_1, r1_8, lr_1, 
                                r2_16)
            else
                int32_t r2_6 = *(r1_6 + 0x1f8)
                
                if (r2_6 u< *(r1_6 + 0x1fc) && r4_1 u< *(r1_6 + 0x114))
                    int32_t* r0_22 = **(s_InterfaceContext + 4)
                    
                    if (r0_22 != 0)
                        int32_t r4_3 = r1_6 + (r2_6 << 4)
                        int32_t i_1 = *(r4_3 + 0x204)
                        
                        if ((*(*r0_22 + 0x18))() != 0)
                            uint32_t r8_2 = *s_pWorldData
                            uint32_t r0_24 = zx.d(*(r4_3 + 0x20a))
                            int32_t r3_2 = sx.d(*(r4_3 + 0x208))
                            int32_t r12_3 = r12_1
                            int32_t* r0_25 = *(r4_3 + 0x210)
                            uint32_t lr_2 = zx.d(*(r4_3 + 0x20c))
                            int32_t* var_30 = r0_25
                            int32_t r2_14 = *(r8_2 + 0x1fc)
                            int32_t r0_26 = *(r8_2 + 0x200)
                            *(r8_2 + 0x1f8) += 1
                            
                            if (r0_26 u< r2_14)
                                *(r8_2 + 0x1f8) = r0_26
                                *(r8_2 + 0x1fc) = r0_26
                                *(r8_2 + 0x200) = 0xffffffff
                            
                            int32_t r1_15 = *(r8_2 + 0xd4)
                            int32_t var_40_1
                            int32_t r6_6
                            
                            if (r1_15 s< 1)
                            label_197bdc:
                                r6_6 = 0
                                var_40_1 = 0
                            else
                                int32_t* r2_15 = r8_2 + 0x14
                                int32_t r0_27 = 0
                                
                                while (i_1 != *r2_15)
                                    r0_27 += 1
                                    r2_15 = &r2_15[0xc]
                                    
                                    if (r0_27 s>= r1_15)
                                        goto label_197bdc
                                
                                if (*(r8_2 + 0xf8) != 3)
                                    *(r8_2 + 0xd8) &= (not.d(1 << (r0_27 & 0xff))).b
                                
                                void* r0_32 = r8_2 + r12_3 * 0x34 + (r0_27 << 2)
                                var_40_1 = *(r0_32 + 0x148)
                                r6_6 = *(r0_32 + 0x138)
                                *(r0_32 + 0x138) = 0
                                *(r0_32 + 0x148) = 0
                            
                            uint32_t r0_33 = *(s_InterfaceContext + 8)
                            
                            if (r0_33 != 0)
                                GameOptionManager::ResetPlayerOptionEntry(r0_33)
                                r12_3 = r12_1
                            
                            if (r6_6 != 0)
                                int32_t* r1_31 = &var_30
                                
                                if (r0_25 == 0)
                                    r1_31 = r0_25
                                
                                r6_6(*(r8_2 + r12_3 * 0x34 + 0x130), var_40_1, i_1, r3_2, r0_24, 
                                    lr_2, r1_31)
            
            while (true)
                int32_t* r1_7 = **(s_InterfaceContext + 4)
                
                if (r1_7 != 0)
                    if ((*(*r1_7 + 0x14))(r1_7) != 0)
                        break
                    
                    *(s_InterfaceContext + 4)
                
                CStateMachine::Update()
    
    int32_t* r0_1 = data_1f5894
    
    if (r0_1 != 0 && &r0_1[1] u< data_1f5898 + data_1f589c)
        *r0_1 = 0
        data_1f5894 = &r0_1[1]
    
    data_1f5894 = 0
    data_1f5898 = 0
    data_1f589c = 0
    result = data_1f5890
    data_1f5890 = 0
    data_1f4e48 = 0

if (*__stack_chk_guard == r3)
    return result

__stack_chk_fail()
noreturn
