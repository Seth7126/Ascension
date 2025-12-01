// 函数: _ZN20NetworkClientManager19NetOptionSelectFuncEP13CStateMachinePvjittPj
// 地址: 0x18620c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard

if (*(arg2 + 0xf8) == 3)
    int32_t r0_2 = *(arg2 + 0xd4)
    int16_t r9_1 = arg4.w
    uint16_t r12_1 = arg6
    uint16_t lr_1 = arg5
    int32_t r8_1 = 1
    
    if (r0_2 s>= 1)
        void* r1 = arg2 + 0x130
        void* r2 = arg2 + 0x14
        int32_t r3 = 0
        
        do
            if (*r2 == arg3)
                int32_t* r7_2 = *r1
                
                if (r7_2 != 0)
                    int32_t* r0_3 = *r7_2
                    
                    if (r0_3 != 0)
                        if ((*(*r0_3 + 0x20))() s< 2)
                            r12_1 = arg6
                            lr_1 = arg5
                        else
                            int32_t* r0_18 = *r7_2
                            r12_1 = arg6
                            lr_1 = arg5
                            
                            if (r0_18 != 0)
                                lr_1 = arg5
                                r8_1 = (*(*r0_18 + 0x18))(r0_18, arg3) ^ 1
                                r12_1 = arg6
                
                break
            
            r3 += 1
            r2 += 0x30
            r1 += 0x34
        while (r3 s< r0_2)
    
    int32_t var_40_1 = *(arg2 + 4)
    int32_t var_44 = 0x4040404
    uint32_t r0_5 = *(arg2 + 0x10c)
    uint32_t var_38_1 = arg3
    uint32_t var_3c_1 = r0_5
    int16_t var_34_1 = r9_1
    uint16_t var_32_1 = r12_1
    uint16_t var_30_1 = lr_1
    
    if (arg7 != 0)
        r0_5 = *arg7
    
    if (arg7 == 0)
        r0_5 = 0
    
    uint32_t var_2c_1 = r0_5
    int32_t* r0_6 = *(*NetworkClientManager::s_pNetworkClientManager + 4)
    (*(*r0_6 + 8))(r0_6, &var_44, 0x1c)
    
    if (r8_1 != 0)
        int32_t r0_7 = *(arg2 + 0x11c)
        int32_t r7_3 = *(arg2 + 0x10c)
        int32_t r1_4 = r0_7
        int32_t r8_2 = r7_3 + 1
        
        if (r0_7 == 0)
            r1_4 = 0x100
        
        int32_t r9_2 = r1_4 - 0x80
        int32_t r10_2 = 0x800 - (r1_4 << 4)
        
        do
            r9_2 += 0x80
            r10_2 -= 0x800
        while (r8_2 s>= r9_2)
        
        int32_t r12_2
        
        if (r0_7 == r9_2)
            r12_2 = *(arg2 + 0x120)
        
        uint32_t* r2_1
        uint16_t r3_2
        uint16_t r4_1
        
        if (r0_7 != r9_2 || r12_2 == 0)
            uint32_t r0_8
            int32_t r1_5
            r1_5:r0_8 = mulu.dp.d(r9_2, 0x10)
            
            if (r1_5 != 0)
                r1_5 = 1
            
            if (r1_5 != 0)
                r0_8 = 0xffffffff
            
            int32_t r0_9 = operator new[](r0_8)
            void* r4_2 = *(arg2 + 0x120)
            int32_t r10_3
            
            if (r4_2 == 0)
                r10_3 = r0_9
                __aeabi_memclr4(r0_9, 0 - r10_2)
            else
                __aeabi_memcpy4(r0_9, r4_2, r7_3 << 4)
                r10_3 = r0_9
                __aeabi_memclr4(r0_9 + (r7_3 << 4), 0 - (r7_3 << 4) - r10_2)
                operator delete[](r4_2)
                r7_3 = *(arg2 + 0x10c)
                r8_2 = r7_3 + 1
            
            r2_1 = arg7
            r12_2 = r10_3
            r3_2 = arg6
            r4_1 = arg5
            *(arg2 + 0x11c) = r9_2
            *(arg2 + 0x120) = r10_3
        else
            r2_1 = arg7
            r3_2 = arg6
            r4_1 = arg5
        
        *(arg2 + 0x10c) = r8_2
        uint32_t* r0_13 = r12_2 + (r7_3 << 4)
        *r0_13 = arg3
        r0_13[1].w = r9_1
        *(r0_13 + 6) = r4_1
        r0_13[2].w = r3_2
        
        if (r2_1 != 0)
            r0_13 = *r2_1
        
        if (r2_1 == 0)
            r0_13 = nullptr
        
        *(r12_2 + (r7_3 << 4) + 0xc) = r0_13

if (*__stack_chk_guard == r0)
    return 1

__stack_chk_fail()
noreturn
