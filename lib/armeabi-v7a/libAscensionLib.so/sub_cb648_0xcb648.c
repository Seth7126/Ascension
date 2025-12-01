// 函数: sub_cb648
// 地址: 0xcb648
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = 0
int32_t r0 = *__stack_chk_guard
uint32_t r4 = arg1[3]

switch (zx.d(*(r4 + 0x3d)))
    case 0
        if (*(r4 + 0x54) == 0)
            int32_t r8_1 = *(r4 + 0x10)
            *(r4 + 0x3d) = 1
            *(r4 + 0x14) = r8_1
            
            if ((zx.d(*(arg1 + 5)) & 3) != 0)
                sub_cae14(r4, arg1)
            
            if ((zx.d(*(r4 + 0x30)) & 0x40) != 0)
                void* r1_13 = *(r4 + 0x28)
                
                if ((zx.d(*(r1_13 + 5)) & 3) != 0)
                    sub_cae14(r4, r1_13)
                    undefined
            
            sub_cca74(r4)
            void* i = *(r4 + 0x84)
            
            if (i != r4 + 0x70)
                do
                    if ((zx.d(*(i + 5)) & 7) == 0)
                        void** r0_32 = *(i + 8)
                        
                        if ((zx.d(r0_32[2].b) & 0x40) != 0)
                            void* r1_15 = *r0_32
                            
                            if ((zx.d(*(r1_15 + 5)) & 3) != 0)
                                sub_cae14(r4, r1_15)
                    
                    i = *(i + 0x14)
                while (i != r4 + 0x70)
            
            while (*(r4 + 0x54) != 0)
                sub_cc378(r4)
            
            int32_t r0_37 = *(r4 + 0x58)
            int32_t r9_1 = *(r4 + 0x10)
            int32_t r7_2 = *(r4 + 0x5c)
            int32_t r6_1 = *(r4 + 0x60)
            *(r4 + 0x54) = r0_37
            *(r4 + 0x58) = 0
            *(r4 + 0x5c) = 0
            *(r4 + 0x60) = 0
            
            if (r0_37 != 0)
                do
                    sub_cc378(r4)
                while (*(r4 + 0x54) != 0)
            
            *(r4 + 0x54) = r7_2
            
            if (r7_2 != 0)
                do
                    sub_cc378(r4)
                while (*(r4 + 0x54) != 0)
            
            *(r4 + 0x54) = r6_1
            
            if (r6_1 != 0)
                do
                    sub_cc378(r4)
                while (*(r4 + 0x54) != 0)
            
            int32_t r10_1 = r9_1 - r8_1 - *(r4 + 0x10)
            int32_t i_1
            
            do
                void* j = *(r4 + 0x60)
                *(r4 + 0x60) = 0
                
                if (j == 0)
                    break
                
                i_1 = 0
                
                do
                    void* j_1 = j
                    j = *(j + 0x18)
                    
                    if (sub_ccb60(r4, j_1) != 0)
                        i_1 = 1
                        
                        while (*(r4 + 0x54) != 0)
                            sub_cc378(r4)
                while (j != 0)
            while (i_1 != 0)
            sub_ccd7c(r4, *(r4 + 0x5c), nullptr)
            sub_ccd7c(r4, *(r4 + 0x64), nullptr)
            void* r0_52 = arg1[3]
            int32_t r8_2 = *(r4 + 0x10)
            void* r1_18 = *(r4 + 0x5c)
            int32_t* i_2 = r0_52 + 0x68
            void* r1_19 = *(r4 + 0x64)
            int32_t* i_10
            
            do
                i_10 = i_2
                i_2 = *i_2
            while (i_2 != 0)
            
            int32_t* i_13 = r0_52 + 0x48
            int32_t* i_12 = *i_13
            
            if (i_12 != 0)
                while (true)
                    uint32_t r3_4 = zx.d(*(i_12 + 5))
                    
                    if ((r3_4 & 3) != 0)
                        *(i_12 + 5) = r3_4.b | 8
                        *i_13 = *i_12
                        *i_12 = *i_10
                        *i_10 = i_12
                        i_10 = i_12
                        i_12 = *i_13
                        
                        if (i_12 == 0)
                            break
                    else
                        i_13 = i_12
                        i_12 = *i_12
                        
                        if (i_12 == 0)
                            break
            
            for (void** i_3 = *(r4 + 0x68); i_3 != 0; i_3 = *i_3)
                *(i_3 + 5) = (*(r4 + 0x3c) & 3) | (*(i_3 + 5) & 0xb8)
                sub_cae14(r4, i_3)
            
            while (*(r4 + 0x54) != 0)
                sub_cc378(r4)
            
            int32_t r0_60 = r10_1 + r8_2 - *(r4 + 0x10)
            
            while (true)
                void* i_4 = *(r4 + 0x60)
                *(r4 + 0x60) = 0
                
                if (i_4 == 0)
                    break
                
                int32_t r6_3 = 0
                
                do
                    void* i_11 = i_4
                    i_4 = *(i_4 + 0x18)
                    
                    if (sub_ccb60(r4, i_11) != 0)
                        r6_3 = 1
                        
                        while (*(r4 + 0x54) != 0)
                            sub_cc378(r4)
                while (i_4 != 0)
                
                if (r6_3 == 0)
                    for (void* i_5 = *(r4 + 0x60); i_5 != 0; i_5 = *(i_5 + 0x18))
                        uint32_t r0_66 = zx.d(*(i_5 + 7))
                        
                        if (r0_66 != 0x1f)
                            void* r10_2 = *(i_5 + 0x10)
                            void* r7_4 = r10_2 + (1 << r0_66 << 5)
                            
                            do
                                if (*(r10_2 + 8) != 0)
                                    int32_t r0_74 = *(r10_2 + 0x18)
                                    
                                    if ((r0_74 & 0x40) != 0)
                                        void* r1_23 = *(r10_2 + 0x10)
                                        
                                        if ((r0_74 & 0xf) != 4)
                                            if ((zx.d(*(r1_23 + 5)) & 3) != 0)
                                                *(r10_2 + 8) = 0
                                                
                                                if ((zx.d(*(r1_23 + 5)) & 3) != 0)
                                                    *(r10_2 + 0x18) = 0xb
                                        else if (r1_23 != 0 && (zx.d(*(r1_23 + 5)) & 3) != 0)
                                            sub_cae14(r4, r1_23)
                                
                                r10_2 += 0x20
                            while (r10_2 u< r7_4)
                    
                    break
            
            for (void* i_6 = *(r4 + 0x64); i_6 != 0; i_6 = *(i_6 + 0x18))
                uint32_t r0_75 = zx.d(*(i_6 + 7))
                
                if (r0_75 != 0x1f)
                    void* r9_2 = *(i_6 + 0x10)
                    void* r10_3 = r9_2 + (1 << r0_75 << 5)
                    
                    do
                        if (*(r9_2 + 8) != 0)
                            int32_t r0_83 = *(r9_2 + 0x18)
                            
                            if ((r0_83 & 0x40) != 0)
                                void* r1_24 = *(r9_2 + 0x10)
                                
                                if ((r0_83 & 0xf) != 4)
                                    if ((zx.d(*(r1_24 + 5)) & 3) != 0)
                                        *(r9_2 + 8) = 0
                                        
                                        if ((zx.d(*(r1_24 + 5)) & 3) != 0)
                                            *(r9_2 + 0x18) = 0xb
                                else if (r1_24 != 0 && (zx.d(*(r1_24 + 5)) & 3) != 0)
                                    sub_cae14(r4, r1_24)
                        
                        r9_2 += 0x20
                    while (r9_2 u< r10_3)
            
            sub_ccd7c(r4, *(r4 + 0x5c), r1_18)
            sub_ccd7c(r4, *(r4 + 0x64), r1_19)
            int32_t r2_3
            int32_t r3_5
            r3_5:r2_3 = *(r4 + 0x10)
            *(r4 + 0x3c) ^= 3
            result = r0_60 + r2_3
            *(r4 + 0x14) = r3_5 + result
            void* r8_3 = arg1[3]
            *(r8_3 + 0x40) = 0
            *(r8_3 + 0x3d) = 2
            int32_t* i_7
            
            do
                i_7 = sub_cb400(arg1, r8_3 + 0x48, 1)
                result += 5
            while (i_7 == r8_3 + 0x48)
            
            *(r8_3 + 0x50) = i_7
            int32_t* i_8
            
            do
                i_8 = sub_cb400(arg1, r8_3 + 0x44, 1)
                result += 5
            while (i_8 == r8_3 + 0x44)
            
            *(r8_3 + 0x4c) = i_8
        else
            int32_t r5_1 = *(r4 + 0x10)
            sub_cc378(r4)
            result = *(r4 + 0x10) - r5_1
    case 2
        int32_t r6 = 0
        int32_t r0_6
        int32_t r1_2
        
        while (true)
            r0_6 = *(r4 + 0x20)
            r1_2 = r6 + *(r4 + 0x40)
            
            if (r1_2 s>= r0_6)
                break
            
            sub_cb400(arg1, *(r4 + 0x18) + (r1_2 << 2), 0xfffffffd)
            r6 += 1
            
            if (r6 u>= 0x50)
                r0_6 = *(r4 + 0x20)
                r1_2 = *(r4 + 0x40) + r6
                break
        
        bool cond:2_1 = r1_2 s>= r0_6
        *(r4 + 0x40) = r1_2
        
        if (r1_2 s>= r0_6)
            r0_6 = 3
        
        result = r6 * 5
        
        if (cond:2_1)
            *(r4 + 0x3d) = r0_6.b
    case 3
        int32_t* r1_5 = *(r4 + 0x50)
        
        if (r1_5 == 0)
            *(r4 + 0x3d) = 4
        else
            *(r4 + 0x50) = sub_cb400(arg1, r1_5, 0x50)
            result = 0x190
    case 4
        int32_t* r1_6 = *(r4 + 0x4c)
        
        if (r1_6 == 0)
            int32_t var_2c = *(r4 + 0xac)
            sub_cb400(arg1, &var_2c, 1)
            void* r6_4 = arg1[3]
            
            if (zx.d(*(r6_4 + 0x3e)) != 1)
                int32_t r0_95 = *(r6_4 + 0x20)
                int32_t r0_96 = r0_95 + (r0_95 u>> 0x1f)
                
                if (*(r6_4 + 0x1c) u< r0_96 s>> 1)
                    sub_d7d88(arg1, r0_96 s>> 1)
                
                int32_t r0_99
                int32_t r8_5
                r0_99, r4, r8_5 = sub_d14cc(arg1, *(r6_4 + 0x90), *(r6_4 + 0x98), 0)
                *(r6_4 + 0x90) = r0_99
                *(r6_4 + 0x98) = r8_5
            
            result = 5
            *(r4 + 0x3d) = 5
        else
            *(r4 + 0x4c) = sub_cb400(arg1, r1_6, 0x50)
            result = 0x190
    case 5
        int32_t r0_13 = *(r4 + 0x20)
        void* r1_7 = *(r4 + 0xac)
        __builtin_memset(r4 + 0x54, 0, 0x14)
        *(r4 + 0x10) = r0_13 << 2
        
        if (r1_7 != 0 && (zx.d(*(r1_7 + 5)) & 3) != 0)
            sub_cae14(r4, r1_7)
        
        if ((zx.d(*(r4 + 0x30)) & 0x40) != 0)
            void* r1_8 = *(r4 + 0x28)
            
            if ((zx.d(*(r1_8 + 5)) & 3) != 0)
                sub_cae14(r4, r1_8)
                undefined
        
        sub_cca74(r4)
        
        for (void** i_9 = *(r4 + 0x68); i_9 != 0; i_9 = *i_9)
            *(i_9 + 5) = (*(r4 + 0x3c) & 3) | (*(i_9 + 5) & 0xb8)
            sub_cae14(r4, i_9)
        
        result = *(r4 + 0x10)
        *(r4 + 0x3d) = 0

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
