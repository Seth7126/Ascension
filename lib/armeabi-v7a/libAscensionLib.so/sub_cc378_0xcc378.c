// 函数: sub_cc378
// 地址: 0xcc378
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r5 = *(arg1 + 0x54)
int32_t result = zx.d(*(r5 + 4)) - 5
*(r5 + 5) |= 4

if (result u<= 0x21)
    result = jump_table_cc3b0[result]
    int32_t r0_42
    
    switch (result)
        case 0x88
            *(arg1 + 0x54) = *(r5 + 0x18)
            void* r1_2 = *(r5 + 8)
            
            if (r1_2 == 0)
            label_cc7b8:
                void** i = *(r5 + 0x10)
                int32_t r0_46 = *(r5 + 0x1c)
                void* r6_9 = &i[(1 << zx.d(*(r5 + 7))) * 8]
                
                if (r0_46 s>= 1)
                    int32_t r7_4 = 0
                    
                    do
                        int32_t r1_27 = *(r5 + 0xc)
                        
                        if ((zx.d(*(r1_27 + (r7_4 << 4) + 8)) & 0x40) != 0)
                            void* r1_28 = *(r1_27 + (r7_4 << 4))
                            
                            if ((zx.d(*(r1_28 + 5)) & 3) != 0)
                                sub_cae14(arg1, r1_28)
                                r0_46 = *(r5 + 0x1c)
                        
                        r7_4 += 1
                    while (r7_4 s< r0_46)
                    
                    i = *(r5 + 0x10)
                
                for (; i u< r6_9; i = &i[8])
                    int32_t r0_48 = i[2]
                    int32_t r1_30 = i[6] & 0x40
                    
                    if (r0_48 != 0)
                        if (r1_30 != 0)
                            void* r1_31 = i[4]
                            
                            if ((zx.d(*(r1_31 + 5)) & 3) != 0)
                                sub_cae14(arg1, r1_31)
                                r0_48 = i[2]
                        
                        if ((r0_48 & 0x40) != 0)
                            void* r1_32 = *i
                            
                            if ((zx.d(*(r1_32 + 5)) & 3) != 0)
                                sub_cae14(arg1, r1_32)
                    else if (r1_30 != 0 && (zx.d(*(i[4] + 5)) & 3) != 0)
                        i[6] = 0xb
            else
                int32_t* r6_1 = nullptr
                
                if ((zx.d(*(r1_2 + 6)) & 8) != 0)
                label_cc480:
                    
                    if ((zx.d(*(r1_2 + 5)) & 3) != 0)
                        sub_cae14(arg1, r1_2)
                        undefined
                else
                    int32_t* r0_4 = sub_dc6c8(r1_2, 3, *(arg1 + 0xc4))
                    r1_2 = *(r5 + 8)
                    r6_1 = r0_4
                    
                    if (r1_2 != 0)
                        goto label_cc480
                
                if (r6_1 == 0 || (r6_1[2] & 0xf) != 4)
                    goto label_cc7b8
                
                char* s = *r6_1 + 0x10
                char* r0_11 = strchr(s, 0x6b)
                char* r0_13 = strchr(s, 0x76)
                
                if ((r0_11 | r0_13) == 0)
                    goto label_cc7b8
                
                *(r5 + 5) &= 0xfb
                
                if (r0_11 == 0)
                    int32_t r7_5 = 0
                    uint32_t r0_62 = zx.d(*(r5 + 7))
                    
                    if (*(r5 + 0x1c) s> 0)
                        r7_5 = 1
                    
                    if (r0_62 != 0x1f)
                        void** i_1 = *(r5 + 0x10)
                        
                        do
                            int32_t r0_65 = i_1[6] & 0x40
                            
                            if (i_1[2] != 0)
                                if (r0_65 != 0)
                                    void* r1_41 = i_1[4]
                                    
                                    if ((zx.d(*(r1_41 + 5)) & 3) != 0)
                                        sub_cae14(arg1, r1_41)
                                        undefined
                                
                                if (r7_5 == 0)
                                    int32_t r0_68 = i_1[2]
                                    
                                    if ((r0_68 & 0x40) == 0)
                                        r7_5 = 0
                                    else
                                        void* r1_42 = *i_1
                                        
                                        if ((r0_68 & 0xf) != 4)
                                            r7_5 = 1
                                            
                                            if ((zx.d(*(r1_42 + 5)) & 3) == 0)
                                                r7_5 = 0
                                        else
                                            if (r1_42 != 0 && (zx.d(*(r1_42 + 5)) & 3) != 0)
                                                sub_cae14(arg1, r1_42)
                                            
                                            r7_5 = 0
                            else if (r0_65 != 0 && (zx.d(*(i_1[4] + 5)) & 3) != 0)
                                i_1[6] = 0xb
                            
                            i_1 = &i_1[8]
                        while (i_1 u< &i_1[(1 << r0_62) * 8])
                    
                    if (r7_5 == 0)
                        *(r5 + 0x18) = *(arg1 + 0x58)
                        *(arg1 + 0x58) = r5
                    else
                        *(r5 + 0x18) = *(arg1 + 0x5c)
                        *(arg1 + 0x5c) = r5
                else if (r0_13 == 0)
                    sub_ccb60(arg1, r5)
                else
                    *(r5 + 0x18) = *(arg1 + 0x64)
                    *(arg1 + 0x64) = r5
            
            result = *(arg1 + 0x10) + (*(r5 + 0x1c) << 4) + (0x20 << zx.d(*(r5 + 7))) + 0x20
            *(arg1 + 0x10) = result
        case 0x14c
            *(arg1 + 0x54) = *(r5 + 8)
            void* r1_6 = *(r5 + 0xc)
            
            if (r1_6 != 0 && (zx.d(*(r1_6 + 5)) & 3) != 0)
                sub_cae14(arg1, r1_6)
            
            uint32_t r0_18 = zx.d(*(r5 + 6))
            
            if (r0_18 == 0)
                r0_18 = 0
            else
                int32_t i_2 = 0
                
                do
                    void* r1_7 = *(r5 + 0x10 + (i_2 << 2))
                    
                    if (r1_7 != 0 && (zx.d(*(r1_7 + 5)) & 3) != 0)
                        sub_cae14(arg1, r1_7)
                        r0_18 = zx.d(*(r5 + 6))
                    
                    i_2 += 1
                while (i_2 u< (r0_18 & 0xff))
            
            result = *(arg1 + 0x10) + 0x10 + ((r0_18 & 0xff) << 2)
            *(arg1 + 0x10) = result
        case 0x1b4
            int32_t r1_9 = *(arg1 + 0x58)
            *(arg1 + 0x54) = *(r5 + 0x3c)
            *(r5 + 0x3c) = r1_9
            *(arg1 + 0x58) = r5
            void* i_3 = *(r5 + 0x1c)
            *(r5 + 5) &= 0xfb
            
            if (i_3 == 0)
                r0_42 = 1
            else
                int32_t r0_23 = *(r5 + 8)
                
                if (i_3 u< r0_23)
                    do
                        if ((zx.d(*(i_3 + 8)) & 0x40) != 0)
                            void* r1_11 = *i_3
                            
                            if ((zx.d(*(r1_11 + 5)) & 3) != 0)
                                sub_cae14(arg1, r1_11)
                                r0_23 = *(r5 + 8)
                        
                        i_3 += 0x10
                    while (i_3 u< r0_23)
                
                int32_t r0_59
                
                if (zx.d(*(arg1 + 0x3d)) != 1)
                    int32_t r1_36 = *(r5 + 0x10)
                    void* r2_19 = r5 + 0x48
                    r0_59 = 0x70
                    
                    if (r1_36 != r2_19)
                        do
                            r2_19 = *(r2_19 + 0xc)
                            r0_59 += 0x28
                        while (r2_19 != r1_36)
                else
                    int32_t r1_35 = *(r5 + 0x1c) + (*(r5 + 0x20) << 4)
                    r0_59 = 0x70
                    
                    for (; i_3 u< r1_35; i_3 += 0x10)
                        *(i_3 + 8) = 0
                
                r0_42 = r0_59 + (*(r5 + 0x20) << 4)
            
            result = *(arg1 + 0x10) + r0_42
            *(arg1 + 0x10) = result
        case 0x228
            *(arg1 + 0x54) = *(r5 + 0x48)
            void* r0_26 = *(r5 + 0x20)
            
            if (r0_26 != 0 && (zx.d(*(r0_26 + 5)) & 3) != 0)
                *(r5 + 0x20) = 0
            
            void* r1_12 = *(r5 + 0x24)
            
            if (r1_12 != 0 && (zx.d(*(r1_12 + 5)) & 3) != 0)
                sub_cae14(arg1, r1_12)
            
            int32_t r0_30 = *(r5 + 0x2c)
            
            if (r0_30 s>= 1)
                int32_t r6_4 = 0
                
                do
                    int32_t r1_13 = *(r5 + 8)
                    
                    if ((zx.d(*(r1_13 + (r6_4 << 4) + 8)) & 0x40) != 0)
                        void* r1_14 = *(r1_13 + (r6_4 << 4))
                        
                        if ((zx.d(*(r1_14 + 5)) & 3) != 0)
                            sub_cae14(arg1, r1_14)
                            r0_30 = *(r5 + 0x2c)
                    
                    r6_4 += 1
                while (r6_4 s< r0_30)
            
            int32_t r0_32 = *(r5 + 0x28)
            
            if (r0_32 s>= 1)
                int32_t r6_5 = 0
                
                do
                    void* r1_16 = *(*(r5 + 0x1c) + (r6_5 << 3))
                    
                    if (r1_16 != 0 && (zx.d(*(r1_16 + 5)) & 3) != 0)
                        sub_cae14(arg1, r1_16)
                        r0_32 = *(r5 + 0x28)
                    
                    r6_5 += 1
                while (r6_5 s< r0_32)
            
            int32_t r0_34 = *(r5 + 0x38)
            
            if (r0_34 s>= 1)
                int32_t r6_6 = 0
                
                do
                    void* r1_18 = *(*(r5 + 0x10) + (r6_6 << 2))
                    
                    if (r1_18 != 0 && (zx.d(*(r1_18 + 5)) & 3) != 0)
                        sub_cae14(arg1, r1_18)
                        r0_34 = *(r5 + 0x38)
                    
                    r6_6 += 1
                while (r6_6 s< r0_34)
            
            int32_t r2_9 = *(r5 + 0x3c)
            
            if (r2_9 s>= 1)
                int32_t r6_7 = 0
                int32_t r7_1 = 0
                
                do
                    void* r1_19 = *(*(r5 + 0x18) + r6_7)
                    
                    if (r1_19 != 0 && (zx.d(*(r1_19 + 5)) & 3) != 0)
                        sub_cae14(arg1, r1_19)
                        r2_9 = *(r5 + 0x3c)
                    
                    r7_1 += 1
                    r6_7 += 0xc
                while (r7_1 s< r2_9)
                
                r0_34 = *(r5 + 0x38)
            
            r0_42 = r2_9 * 0xc + (*(r5 + 0x2c) << 4) + (*(r5 + 0x28) << 3)
                + ((*(r5 + 0x30) + r0_34 + *(r5 + 0x34)) << 2) + 0x50
            result = *(arg1 + 0x10) + r0_42
            *(arg1 + 0x10) = result
        case 0x3a8
            *(arg1 + 0x54) = *(r5 + 8)
            uint32_t r0_44 = zx.d(*(r5 + 6))
            
            if (r0_44 == 0)
                r0_44 = 0
            else
                int32_t i_4 = 0
                
                do
                    void* r1_22 = r5 + (i_4 << 4)
                    
                    if ((zx.d(*(r1_22 + 0x18)) & 0x40) != 0)
                        void* r1_23 = *(r1_22 + 0x10)
                        
                        if ((zx.d(*(r1_23 + 5)) & 3) != 0)
                            sub_cae14(arg1, r1_23)
                            r0_44 = zx.d(*(r5 + 6))
                    
                    i_4 += 1
                while (i_4 u< (r0_44 & 0xff))
            
            result = *(arg1 + 0x10) + 0x10 + ((r0_44 & 0xff) << 4)
            *(arg1 + 0x10) = result

return result
