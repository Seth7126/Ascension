// 函数: sub_df3a0
// 地址: 0xdf3a0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t j_2
int32_t j_3 = j_2
int32_t i = arg2
int32_t r0 = *__stack_chk_guard
int32_t r9 = arg1[2]

do
    int32_t r0_15 = *(r9 - 0x18)
    void** r6_1 = r9 - 0x20
    
    if (r0_15 != 3 && (r0_15 & 0xf) != 4)
    label_df5e0:
        int32_t* r0_36 = sub_dc704(arg1, r6_1, 0xf)
        
        if (r0_36[2] == 0)
            r0_36 = sub_dc704(arg1, r9 - 0x10, 0xf)
            
            if (r0_36[2] == 0)
                sub_c8a2c(arg1, r6_1, r9 - 0x10)
                noreturn
        
        int32_t* r1_18 = arg1[2]
        int32_t r5_1 = arg1[7]
        arg1[2] = &r1_18[4]
        int32_t r3_1 = r0_36[1]
        *r1_18 = *r0_36
        r1_18[1] = r3_1
        r1_18[2] = r0_36[2]
        int32_t* r0_39 = arg1[2]
        arg1[2] = &r0_39[4]
        int32_t r2_10
        int32_t r3_2
        r3_2:r2_10 = *r6_1
        *r0_39 = r2_10
        r0_39[1] = r3_2
        r0_39[2] = *(r9 - 0x18)
        int32_t* r0_40 = arg1[2]
        arg1[2] = &r0_40[4]
        int32_t r2_11
        int32_t r3_3
        r3_3:r2_11 = *(r9 - 0x10)
        *r0_40 = r2_11
        r0_40[1] = r3_3
        r0_40[2] = *(r9 - 8)
        sub_c9774(arg1, arg1[2] - 0x30, 1, zx.d(*(arg1[4] + 0x12)) & 1, j_2)
        int32_t r0_43 = arg1[2]
        void* r1_25 = arg1[7]
        j_2 = 2
        arg1[2] = r0_43 - 0x10
        int32_t r3_5 = *(r0_43 - 0xc)
        void* r1_26 = r1_25 + r6_1 - r5_1
        *r1_26 = *(r0_43 - 0x10)
        *(r1_26 + 4) = r3_5
        *(r1_26 + 8) = *(r0_43 - 8)
        i = i
    else
        int32_t r1_3 = *(r9 - 8)
        int32_t r2_2 = r1_3 & 0xf
        
        if (r2_2 == 4)
            goto label_df4b0
        
        if (r1_3 != 3)
            goto label_df5e0
        
        int128_t q0
        q0.q = *(r9 - 0x10)
        unimplemented  {vmov r2, r3, d0}
        char str[0x20]
        void* r0_12
        r0_12, r2_2, q0 = sub_d7eb4(arg1, &str, sprintf(&str, "%.14g", r2_2))
        *(r9 - 0x10) = r0_12
        *(r9 - 8) = zx.d(*(r0_12 + 4)) | 0x40
        r0_15 = *(r9 - 0x18)
    label_df4b0:
        int32_t r7_1 = *(*(r9 - 0x10) + 0xc)
        int32_t r1_6 = r0_15 & 0xf
        
        if (r7_1 == 0)
            j_2 = 2
            
            if (r0_15 == 3 && r1_6 != 4)
                q0.q = *(r9 - 0x20)
                unimplemented  {vmov r2, r3, d0}
                void* r0_4
                r0_4, q0 = sub_d7eb4(arg1, &str, sprintf(&str, "%.14g"))
                *(r9 - 0x20) = r0_4
                *(r9 - 0x18) = zx.d(*(r0_4 + 4)) | 0x40
        else if (r1_6 != 4 || *(*r6_1 + 0xc) != 0)
            j_2 = 1
            
            if (i s>= 2)
                j_2 = 1
                
                do
                    int32_t r0_18 = r6_1[2]
                    
                    if ((r0_18 & 0xf) != 4)
                        if (r0_18 != 3)
                            break
                        
                        q0.q = *r6_1
                        unimplemented  {vmov r2, r3, d0}
                        void* r0_22
                        r0_22, r2_2, q0 = sub_d7eb4(arg1, &str, sprintf(&str, "%.14g"))
                        *r6_1 = r0_22
                        r6_1[2] = zx.d(*(r0_22 + 4)) | 0x40
                    
                    int32_t r0_26 = *(*r6_1 + 0xc)
                    
                    if (r0_26 u>= 0xfffffffd - r7_1)
                        sub_c89f0(arg1, "string length overflow", r2_2)
                        noreturn
                    
                    j_2 += 1
                    r7_1 += r0_26
                    r6_1 -= 0x10
                while (j_2 s< i)
            
            void* r0_29
            int32_t r9_1
            r0_29, r9_1 = sub_e116c(arg1, arg1[3] + 0x90, r7_1)
            uint32_t r7_2 = 0
            int32_t j_1 = j_2
            int32_t j
            
            do
                void* r1_11 = *(r9_1 - (j_1 << 4))
                int32_t r5 = *(r1_11 + 0xc)
                __aeabi_memcpy(r0_29 + r7_2, r1_11 + 0x10, r5)
                r7_2 += r5
                j = j_1
                j_1 -= 1
            while (j s> 1)
            void* r0_32
            r0_32, q0 = sub_d7eb4(arg1, r0_29, r7_2)
            void** r9_2 = r9_1 - (j_2 << 4)
            *r9_2 = r0_32
            r9_2[2] = zx.d(*(r0_32 + 4)) | 0x40
            i = i
        else
            j_2 = 2
            *r6_1 = *(r9 - 0x10)
            *(r9 - 0x18) = *(r9 - 8)
    
    r9 = arg1[2] + ((1 - j_2) << 4)
    i = i + 1 - j_2
    arg1[2] = r9
while (i s> 1)

int32_t r0_47 = *__stack_chk_guard

if (r0_47 == r0)
    return r0_47 - r0

__stack_chk_fail()
noreturn
