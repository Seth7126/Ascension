// 函数: sub_c90d4
// 地址: 0xc90d4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r6 = arg2
int32_t* r9 = arg1
int32_t r7_1
int32_t r8_3

while (true)
    r7_1 = r9[7]
    int32_t r0_3 = r6[2] & 0x3f
    
    if (r0_3 == 6)
        int32_t r5_2 = r9[2]
        void* r12_2 = r6 - r7_1
        void* r4_2 = *(*r6 + 0xc)
        uint32_t r0_15 = zx.d(*(r4_2 + 0x4e))
        
        if (r0_15 s>= (r9[6] - r5_2) s>> 4)
            int32_t r2_3 = r9[8]
            
            if (r2_3 s> 0xf4240)
            label_c9678:
                sub_c8c5c(r9, 6)
            label_c9684:
                int32_t r2_16
                int32_t* r9_1
                r2_16, r9_1 = sub_c8d68(r9, 0xf4308)
                sub_c89f0(r9_1, "stack overflow", r2_16)
                noreturn
            
            int32_t r1_9 = 0xf4240
            
            if (0xf4240 s> r2_3 << 1)
                r1_9 = r2_3 << 1
            
            if (r1_9 s< r0_15 + ((r5_2 - r7_1) s>> 4) + 5)
                r1_9 = r0_15 + ((r5_2 - r7_1) s>> 4) + 5
            
            if (r1_9 s> 0xf4240)
                goto label_c9684
            
            r9 = sub_c8d68(r9, r1_9)
        
        void* r0_19 = r5_2 - r6
        uint32_t r6_2 = zx.d(*(r4_2 + 0x4c))
        int32_t r8_2 = 0xffffffff + (r0_19 s>> 4)
        
        if (r0_19 s>> 4 s<= r6_2)
            void* r0_21 = r9[2]
            
            do
                *(r0_21 + 8) = 0
                r8_2 += 1
                r0_21 += 0x10
            while (r8_2 s< r6_2)
            
            r9[2] = r0_21
        
        void* r5_5
        void* r7_3
        int16_t r10_1
        
        if (zx.d(*(r4_2 + 0x4d)) == 0)
            r10_1 = arg3
            r5_5 = r9[7] + r12_2
            r7_3 = r5_5 + 0x10
        else
            r7_3 = r9[2]
            uint32_t r0_23 = zx.d(*(r4_2 + 0x4e))
            
            if (r0_23 s>= (r9[6] - r7_3) s>> 4)
                int32_t r2_5 = r9[8]
                
                if (r2_5 s> 0xf4240)
                    goto label_c9678
                
                int32_t r1_12 = 0xf4240
                
                if (0xf4240 s> r2_5 << 1)
                    r1_12 = r2_5 << 1
                
                int32_t r0_25 = r0_23 + ((r7_3 - r9[7]) s>> 4) + 5
                
                if (r1_12 s< r0_25)
                    r1_12 = r0_25
                
                if (r1_12 s> 0xf4240)
                    goto label_c9684
                
                r9 = sub_c8d68(r9, r1_12)
                r7_3 = r9[2]
            
            r10_1 = arg3
            
            if (r6_2 != 0)
                void* r0_27 = r7_3 - (r8_2 << 4)
                r9[2] = r7_3 + 0x10
                int32_t r3_4 = *(r0_27 + 4)
                void* r1_14 = r7_3 + ((0 - r8_2) << 4)
                *r7_3 = *r0_27
                *(r7_3 + 4) = r3_4
                *(r7_3 + 8) = *(r1_14 + 8)
                *(r1_14 + 8) = 0
                
                if (r6_2 != 1)
                    int32_t i_2 = r6_2 - 1
                    void* r1_17 = r7_3 + ((1 - r8_2) << 4) + 8
                    int32_t i
                    
                    do
                        int32_t* r3_5 = r9[2]
                        i = i_2
                        i_2 -= 1
                        r9[2] = &r3_5[4]
                        int32_t r6_4 = *(r1_17 - 8)
                        r3_5[1] = *(r1_17 - 4)
                        *r3_5 = r6_4
                        r3_5[2] = *r1_17
                        *r1_17 = 0
                        r1_17 += 0x10
                    while (i != 1)
            
            r5_5 = r9[7] + r12_2
        
        int32_t* r6_8 = *(r9[4] + 0xc)
        
        if (r6_8 == 0)
            int32_t* r0_54
            r0_54, r9 = sub_d7508(r9)
            r6_8 = r0_54
        
        r9[4] = r6_8
        *r6_8 = r5_5
        r6_8[4].w = r10_1
        r6_8[6] = r7_3
        void* r0_56 = r7_3 + (zx.d(*(r4_2 + 0x4e)) << 4)
        r6_8[1] = r0_56
        int32_t r1_28 = *(r4_2 + 0xc)
        *(r6_8 + 0x12) = 1
        r6_8[7] = r1_28
        void* r1_29 = r9[3]
        r9[2] = r0_56
        
        if (*(r1_29 + 0xc) s>= 1)
            sub_cc158(r9)
        
        int32_t result = 0
        
        if ((zx.d(r9[0xa].b) & 1) != 0)
            result = 0
            void* r0_60 = r6_8[2]
            r6_8[7] += 4
            int32_t r1_33 = 0
            
            if ((zx.d(*(r0_60 + 0x12)) & 1) != 0)
                r1_33 = 0
                
                if ((*(*(r0_60 + 0x1c) - 4) & 0x3f) == 0x1e)
                    r1_33 = 4
                    *(r6_8 + 0x12) |= 0x40
            
            sub_c8f90(r9, r1_33)
            r6_8[7] -= 4
        
        return result
    
    int32_t* r1_6
    
    if (r0_3 == 0x26)
        r1_6 = *r6 + 0xc
    label_c93b0:
        int32_t r0_31 = r9[2]
        r8_3 = *r1_6
        
        if (r9[6] - r0_31 s>= 0x150)
            break
        
        int32_t r2_9 = r9[8]
        
        if (r2_9 s> 0xf4240)
            goto label_c9678
        
        int32_t r1_19 = 0xf4240
        
        if (0xf4240 s> r2_9 << 1)
            r1_19 = r2_9 << 1
        
        if (r1_19 s< 0x19 + ((r0_31 - r7_1) s>> 4))
            r1_19 = 0x19 + ((r0_31 - r7_1) s>> 4)
        
        if (r1_19 s> 0xf4240)
            goto label_c9684
        
        r9 = sub_c8d68(r9, r1_19)
        break
    
    if (r0_3 == 0x16)
        r1_6 = r6
        goto label_c93b0
    
    int32_t* r0_5 = sub_dc704(r9, r6, 0x10)
    
    if ((r0_5[2] & 0xf) != 6)
        sub_c841c(r9, r6, "call")
        noreturn
    
    int32_t* r0_8 = r9[2]
    int32_t r5_1 = r9[7]
    
    if (r0_8 u> r6)
        int32_t* r1_2 = r0_8
        
        do
            int32_t r3_1 = *(r0_8 - 8)
            r1_2 -= 0x10
            int32_t r2_1 = *(r0_8 - 0xc)
            *r0_8 = *r1_2
            r0_8[1] = r2_1
            r0_8[2] = r3_1
            r0_8 = r1_2
        while (r1_2 u> r6)
        
        r0_8 = r9[2]
    
    int32_t r1_3 = r9[6]
    r9[2] = &r0_8[4]
    
    if (r1_3 - &r0_8[4] s<= 0xf)
        int32_t r2_2 = r9[8]
        
        if (r2_2 s> 0xf4240)
            goto label_c9678
        
        int32_t r1_5 = 0xf4240
        
        if (0xf4240 s> r2_2 << 1)
            r1_5 = r2_2 << 1
        
        int32_t r0_11 = 5 + ((&r0_8[4] - r9[7]) s>> 4)
        
        if (r1_5 s< r0_11)
            r1_5 = r0_11
        
        if (r1_5 s> 0xf4240)
            goto label_c9684
        
        r9 = sub_c8d68(r9, r1_5)
    
    int32_t r2 = r0_5[1]
    r6 = r9[7] + r6 - r5_1
    *r6 = *r0_5
    r6[1] = r2
    r6[2] = r0_5[2]

void** r0_36 = *(r9[4] + 0xc)

if (r0_36 == 0)
    r0_36, r9 = sub_d7508(r9)

r9[4] = r0_36
r0_36[4].w = arg3
*r0_36 = r9[7] + r6 - r7_1
int32_t r1_23 = r9[2]
*(r0_36 + 0x12) = 0
r0_36[1] = r1_23 + 0x140

if (*(r9[3] + 0xc) s>= 1)
    sub_cc158(r9)

if ((zx.d(r9[0xa].b) & 1) != 0)
    sub_c8f90(r9, 0)

int32_t r0_44 = r8_3(r9)
uint32_t r1_25 = zx.d(r9[0xa].b)
int32_t* r6_6 = r9[4]
void* r8_4 = r9[2] - (r0_44 << 4)
void* r2_13

if ((r1_25 & 6) == 0)
    r2_13 = r6_6[2]
else
    if ((r1_25 & 2) != 0)
        int32_t r7_4 = r9[7]
        sub_c8f90(r9, 1)
        r8_4 = r9[7] + r8_4 - r7_4
    
    r2_13 = r6_6[2]
    r9[5] = *(r2_13 + 0x1c)

int32_t r1_27 = sx.d(r6_6[4].w)
void* r5_7 = *r6_6
r9[4] = r2_13

if (r1_27 != 0)
    int32_t r2_14 = 0
    
    while (true)
        int32_t* r3_6 = r8_4 + r2_14
        
        if (r3_6 u>= r9[2])
            r5_7 += r2_14
            
            if (r1_27 s>= 1)
                void* r0_50 = r5_7 + 8
                int32_t i_1 = r1_27 + 1
                
                do
                    i_1 -= 1
                    *r0_50 = 0
                    r0_50 += 0x10
                while (i_1 s> 1)
                
                r5_7 = r0_50 - 8
            
            break
        
        int32_t r6_7 = r3_6[1]
        int32_t temp2_1 = r1_27
        r1_27 -= 1
        int32_t* r0_49 = r5_7 + r2_14
        *r0_49 = *r3_6
        r2_14 += 0x10
        r0_49[1] = r6_7
        r0_49[2] = r3_6[2]
        
        if (temp2_1 == 1)
            r5_7 += r2_14
            break

r9[2] = r5_7
return 1
