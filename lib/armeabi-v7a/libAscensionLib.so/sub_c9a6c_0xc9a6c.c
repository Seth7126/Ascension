// 函数: sub_c9a6c
// 地址: 0xc9a6c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r11
int32_t* var_8 = r11
void* var_18 = arg4
int32_t r4
int32_t var_20 = r4
int32_t* sp = &var_20
int32_t* r11_1 = &var_8
uint32_t r0 = zx.d(*(arg1 + 0x26))
int32_t* r8 = arg2
bool cond:0 = r0 == 0xc8
int32_t* r0_19
int32_t r4_4
int32_t r5_3
int32_t lr_3
char const* const r1_9

if (r0 u>= 0xc8)
    r1_9 = "C stack overflow"
label_c9c3c:
    r0_19, r4_4, r5_3, lr_3 = sub_ca22c(arg1, r1_9, r8, arg1)
    
    if (cond:0)
        arg4 = &data_c9c50 & r5_3 s>> (arg5 & 0xff)
else
    uint32_t r0_1 = zx.d(*(arg1 + 6))
    arg4 = arg1[4]
    
    if (r0_1 != 1)
        cond:0 = r0_1 == 0
        
        if (r0_1 != 0)
            r1_9 = "cannot resume dead coroutine"
        else
            cond:0 = arg4 == &arg1[0x12]
            
            if (arg4 == &arg1[0x12])
                int32_t result = sub_c90d4(arg1, r8 - 0x10, 0xffff)
                
                if (result == 0)
                    return sub_dfc88(arg1, arg6) __tailcall
                
                return result
            
            r1_9 = "cannot resume non-suspended coroutine"
        
        goto label_c9c3c
    
    *(arg1 + 6) = 0
    uint32_t r0_4 = zx.d(*(arg4 + 0x12))
    *arg4 = arg1[7] + *(arg4 + 0x14)
    
    if ((r0_4 & 1) != 0)
        sub_dfc88(arg1, r8)
    else
        int32_t r1_3 = *(arg4 + 0x1c)
        
        if (r1_3 != 0)
            *(arg4 + 0x12) = r0_4.b | 8
            *(arg4 + 0x25) = 1
            int32_t r0_7 = r1_3(arg1)
            arg4 = arg1[4]
            r8 = arg1[2] - (r0_7 << 4)
        
        uint32_t r0_8 = zx.d(arg1[0xa].b)
        void* r2_3
        
        if ((r0_8 & 6) == 0)
            r2_3 = *(arg4 + 8)
        else
            if ((r0_8 & 2) != 0)
                int32_t r7_1 = arg1[7]
                sub_c8f90(arg1, 1)
                r8 = arg1[7] + r8 - r7_1
            
            r2_3 = *(arg4 + 8)
            arg1[5] = *(r2_3 + 0x1c)
        
        int32_t r1_7 = sx.d(*(arg4 + 0x10))
        void* r5_2 = *arg4
        arg1[4] = r2_3
        
        if (r1_7 != 0)
            int32_t r2_4 = 0
            
            while (true)
                void* r3_2 = r8 + r2_4
                
                if (r3_2 u>= arg1[2])
                    r5_2 += r2_4
                    
                    if (r1_7 s>= 1)
                        void* r0_17 = r5_2 + 8
                        int32_t i = r1_7 + 1
                        
                        do
                            i -= 1
                            *r0_17 = 0
                            r0_17 += 0x10
                        while (i s> 1)
                        
                        r5_2 = r0_17 - 8
                    
                    break
                
                int32_t r6_2 = *(r3_2 + 4)
                int32_t temp2_1 = r1_7
                r1_7 -= 1
                int32_t* r0_16 = r5_2 + r2_4
                *r0_16 = *r3_2
                r2_4 += 0x10
                r0_16[1] = r6_2
                r0_16[2] = *(r3_2 + 8)
                
                if (temp2_1 == 1)
                    r5_2 += r2_4
                    break
        
        arg1[2] = r5_2
    
    r0_19 = arg1
    r4_4 = var_20
    r5_3 = arg3
    arg4 = var_18
    r8 = arg6
    r11_1 = var_8
    int32_t lr
    lr_3 = lr
    void arg_0
    sp = &arg_0
*(sp - 4) = lr_3
*(sp - 8) = r11_1
*(sp - 0xc) = arg8
*(sp - 0x10) = arg7
*(sp - 0x14) = r8
*(sp - 0x18) = arg5
*(sp - 0x1c) = arg4
*(sp - 0x20) = r5_3
*(sp - 0x24) = r4_4

for (void* i_1 = r0_19[4]; i_1 != &r0_19[0x12]; i_1 = r0_19[4])
    uint32_t r1_10 = zx.d(*(i_1 + 0x12))
    
    if ((r1_10 & 1) != 0)
        sub_dfa9c(r0_19)
        sub_dfc88(r0_19, 0xffff)
    else
        if ((r1_10 & 0x10) != 0)
            r1_10 &= 0xef
            *(i_1 + 0x12) = r1_10.b
            r0_19[0x11] = *(i_1 + 0x20)
        
        uint32_t r2_7 = zx.d(*(i_1 + 0x10))
        
        if (r2_7 == 0xffff)
            r2_7 = r0_19[2]
            
            if (*(i_1 + 4) u< r2_7)
                *(i_1 + 4) = r2_7
        
        int32_t temp1_1 = r1_10 & 0x20
        
        if (temp1_1 == 0)
            r2_7 = 1
        
        if (temp1_1 == 0)
            *(i_1 + 0x25) = r2_7.b
        
        int32_t r2_8 = *(i_1 + 0x1c)
        *(i_1 + 0x12) = (r1_10.b & 0xc7) | 8
        int32_t r0_21 = r2_8(r0_19)
        uint32_t r1_13 = zx.d(r0_19[0xa].b)
        int32_t* r5_4 = r0_19[4]
        int32_t* r6_3 = r0_19[2] - (r0_21 << 4)
        void* r1_15
        
        if ((r1_13 & 6) == 0)
            r1_15 = r5_4[2]
        else
            if ((r1_13 & 2) != 0)
                int32_t r8_3 = r0_19[7]
                sub_c8f90(r0_19, 1)
                r6_3 = r0_19[7] + r6_3 - r8_3
            
            r1_15 = r5_4[2]
            r0_19[5] = *(r1_15 + 0x1c)
        
        int32_t j_1 = sx.d(r5_4[4].w)
        void* r0_27 = *r5_4
        r0_19[4] = r1_15
        
        if (j_1 != 0)
            int32_t k = j_1 + 1
            void* r1_16 = r0_27 + 8
            int32_t j
            
            do
                if (r6_3 u>= r0_19[2])
                    if (j_1 s>= 1)
                        do
                            k -= 1
                            *r1_16 = 0
                            r1_16 += 0x10
                        while (k s> 1)
                        
                        r0_27 = r1_16 - 8
                    
                    break
                
                int32_t r7_5 = r6_3[1]
                k -= 1
                r1_16 += 0x10
                j = j_1
                j_1 -= 1
                int32_t* temp0_2 = r0_27
                *temp0_2 = *r6_3
                temp0_2[1] = r7_5
                int32_t r7_6 = r6_3[2]
                r6_3 = &r6_3[4]
                *(r0_27 + 8) = r7_6
                r0_27 += 0x10
            while (j != 1)
        
        r0_19[2] = r0_27

*(sp - 0x24)
*(sp - 0x20)
*(sp - 0x1c)
*(sp - 0x18)
*(sp - 0x14)
*(sp - 0x10)
*(sp - 0xc)
*(sp - 8)
jump(*(sp - 4))
