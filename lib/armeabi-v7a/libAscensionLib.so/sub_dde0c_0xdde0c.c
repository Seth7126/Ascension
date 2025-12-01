// 函数: sub_dde0c
// 地址: 0xdde0c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t var_c = arg5
int32_t var_14 = arg4
int32_t var_1c = arg3
void* r5 = arg1
int32_t r0 = *__stack_chk_guard
int32_t** r7_1 = r5 + 4
int32_t var_30

if (sub_e1090(*r7_1, &var_30, 4) != 0)
    goto label_de5f8

int32_t r0_3 = var_30
bool cond:0_1 = r0_3 == 0xffffffff
bool cond:1_1 = r0_3 == 0xffffffff

if (r0_3 s> 0xffffffff)
    *(arg2 + 0x40) = r0_3
    
    if (sub_e1090(*r7_1, &var_30, 4) != 0)
        goto label_de5f8
    
    int32_t r0_6 = var_30
    cond:0_1 = r0_6 == 0xffffffff
    cond:1_1 = r0_6 == 0xffffffff
    
    if (r0_6 s> 0xffffffff)
        *(arg2 + 0x44) = r0_6
        
        if (sub_e1090(*r7_1, &var_30, 1) != 0)
            goto label_de5f8
        
        *(arg2 + 0x4c) = var_30.b
        
        if (sub_e1090(*r7_1, &var_30, 1) != 0)
            goto label_de5f8
        
        *(arg2 + 0x4d) = var_30.b
        
        if (sub_e1090(*r7_1, &var_30, 1) != 0)
            goto label_de5f8
        
        *(arg2 + 0x4e) = var_30.b
        
        if (sub_e1090(*r7_1, &var_30, 4) != 0)
            goto label_de5f8
        
        int32_t r4_1 = var_30
        cond:0_1 = r4_1 == 0xffffffff
        cond:1_1 = r4_1 == 0xffffffff
        
        if (r4_1 s> 0xffffffff)
            int32_t* r0_18 = *r5
            
            if (r4_1 + 1 u>= 0x40000000)
                sub_d14b4(r0_18)
                noreturn
            
            arg3 = r4_1 << 2
            int32_t r0_19
            int32_t r4_2
            void* r9_1
            r0_19, r4_2, r5, arg4, r9_1 = sub_d14cc(r0_18, 0, 0, arg3)
            *(r9_1 + 0xc) = r0_19
            *(r9_1 + 0x30) = r4_2
            
            if (sub_e1090(*r7_1, r0_19, arg3) != 0)
                goto label_de5f8
            
            if (sub_e1090(*r7_1, &var_30, 4) != 0)
                goto label_de5f8
            
            int32_t r4_3 = var_30
            cond:0_1 = r4_3 == 0xffffffff
            cond:1_1 = r4_3 == 0xffffffff
            
            if (r4_3 s> 0xffffffff)
                r0_18 = *r5
                void* var_38_1 = r5
                
                if (r4_3 + 1 u>= 0x10000000)
                    sub_d14b4(r0_18)
                    noreturn
                
                void** r0_24
                int32_t r4_4
                void* r9_2
                r0_24, r4_4, r5, r9_2 = sub_d14cc(r0_18, 0, 0, r4_3 << 4)
                *(r9_2 + 8) = r0_24
                *(r9_2 + 0x2c) = r4_4
                int32_t** var_34_1 = r7_1
                
                if (r4_4 s>= 1)
                    void** r10 = r0_24
                    int32_t r1_10 = 0
                    
                    do
                        r0_24[2 + r1_10 * 4] = r5
                        r1_10 += 1
                    while (r4_4 != r1_10)
                    
                    if (r4_4 s>= 1)
                        if (sub_e1090(*(var_38_1 + 4), &var_30, 1) != 0)
                            goto label_de134
                        
                        r5 = &var_30
                        int32_t r8 = 0
                        void** r6 = r10
                        
                        while (true)
                            int32_t r0_32 = sx.d(var_30.b)
                            
                            switch (r0_32)
                                case 0
                                    r6[r8 * 4 + 2] = r0_32
                                case 1
                                    if (sub_e1090(*r7_1, &var_30, 1) != 0)
                                        goto label_de134
                                    
                                    *r10 = sx.d(var_30.b)
                                    r6[r8 * 4 + 2] = 1
                                case 3
                                    if (sub_e1090(*r7_1, &var_30, 8) != 0)
                                        goto label_de134
                                    
                                    *r10 = var_30.q
                                    r6[r8 * 4 + 2] = 3
                                case 4
                                    if (sub_e1090(*r7_1, &var_30, 4) != 0)
                                        goto label_de134
                                    
                                    int32_t r2_3 = var_30
                                    void* r0_42
                                    
                                    if (r2_3 == 0)
                                        r0_42 = nullptr
                                    else
                                        r5 = var_38_1
                                        void* r0_38
                                        r0_38, r9_2 = sub_e116c(*r5, *(r5 + 8), r2_3)
                                        
                                        if (sub_e1090(*(r5 + 4), r0_38, var_30) != 0)
                                            goto label_de5f8
                                        
                                        r0_42 = sub_d7eb4(*r5, r0_38, var_30 - 1)
                                        r7_1 = var_34_1
                                        r5 = &var_30
                                    
                                    *r10 = r0_42
                                    r6[r8 * 4 + 2] = zx.d(*(r0_42 + 4)) | 0x40
                            
                            r8 += 1
                            
                            if (r8 s>= r4_4)
                                break
                            
                            r6 = *(r9_2 + 8)
                            r10 = &r6[r8 * 4]
                            
                            if (sub_e1090(*r7_1, &var_30, 1) != 0)
                                goto label_de134
                
                while (sub_e1090(*r7_1, &var_30, 4) != 0)
                label_de134:
                    sub_de668(var_38_1, r5.b)
                
                int32_t r4_5 = var_30
                
                if (r4_5 s> 0xffffffff)
                    r0_18 = *var_38_1
                    
                    if (r4_5 + 1 u>= 0x40000000)
                        sub_d14b4(r0_18)
                        noreturn
                    
                    void** r0_49
                    int32_t r4_6
                    void* r9_3
                    r0_49, r4_6, r5, r9_3 = sub_d14cc(r0_18, 0, 0, r4_5 << 2)
                    *(r9_3 + 0x10) = r0_49
                    *(r9_3 + 0x38) = r4_6
                    
                    if (r4_6 s>= 1)
                        *r0_49 = r5
                        
                        if (r4_6 != 1)
                            int32_t r0_50 = 1
                            
                            do
                                *(*(r9_3 + 0x10) + (r0_50 << 2)) = 0
                                r0_50 += 1
                            while (r4_6 != r0_50)
                        
                        if (r4_6 s>= 1)
                            r5 = nullptr
                            
                            do
                                void* r0_52
                                void* r9_4
                                r0_52, r9_4 = sub_cac44(*var_38_1)
                                *(*(r9_4 + 0x10) + (r5 << 2)) = r0_52
                                sub_dde0c(var_38_1, *(*(r9_4 + 0x10) + (r5 << 2)))
                                r5 += 1
                            while (r4_6 != r5)
                    
                    if (sub_e1090(*r7_1, &var_30, 4) != 0)
                    labelid_a:
                        sub_de668(var_38_1, r5.b)
                    else
                        int32_t r4_7 = var_30
                        
                        if (r4_7 s> 0xffffffff)
                            r0_18 = *var_38_1
                            
                            if (r4_7 + 1 u>= 0x20000000)
                                sub_d14b4(r0_18)
                                noreturn
                            
                            int32_t r0_57
                            int32_t r4_8
                            void* r9_5
                            r0_57, r4_8, r5, r9_5 = sub_d14cc(r0_18, 0, 0, r4_7 << 3)
                            *(r9_5 + 0x1c) = r0_57
                            *(r9_5 + 0x28) = r4_8
                            
                            if (r4_8 s>= 1)
                                int32_t r1_28 = 0
                                
                                do
                                    *(r0_57 + (r1_28 << 3)) = r5
                                    r1_28 += 1
                                while (r4_8 != r1_28)
                                
                                r5 = nullptr
                                
                                do
                                    if (sub_e1090(*r7_1, &var_30, 1) != 0)
                                        goto label_de5d8_2
                                    
                                    *(*(r9_5 + 0x1c) + (r5 << 3) + 4) = var_30.b
                                    
                                    if (sub_e1090(*r7_1, &var_30, 1) != 0)
                                        goto label_de5d8_2
                                    
                                    void* r1_34 = *(r9_5 + 0x1c) + (r5 << 3)
                                    r5 += 1
                                    *(r1_34 + 5) = var_30.b
                                while (r5 s< r4_8)
                            
                            if (sub_e1090(*r7_1, &var_30, 4) != 0)
                            labelid_a:
                                sub_de668(var_38_1, r5.b)
                            else
                                int32_t r2_7 = var_30
                                void* r0_71
                                
                                if (r2_7 == 0)
                                    r0_71 = nullptr
                                label_de328:
                                    *(r9_5 + 0x24) = r0_71
                                    
                                    if (sub_e1090(*r7_1, &var_30, 4) != 0)
                                    labelid_a:
                                        sub_de668(var_38_1, r5.b)
                                    else
                                        int32_t r4_9 = var_30
                                        
                                        if (r4_9 s> 0xffffffff)
                                            r0_18 = *var_38_1
                                            
                                            if (r4_9 + 1 u>= 0x40000000)
                                                sub_d14b4(r0_18)
                                                noreturn
                                            
                                            int32_t r6_2 = r4_9 << 2
                                            int32_t r0_74
                                            int32_t r4_10
                                            void* r9_6
                                            r0_74, r4_10, r5, r9_6 = sub_d14cc(r0_18, 0, 0, r6_2)
                                            *(r9_6 + 0x14) = r0_74
                                            *(r9_6 + 0x34) = r4_10
                                            
                                            if (sub_e1090(*r7_1, r0_74, r6_2) != 0)
                                            labelid_a:
                                                sub_de668(var_38_1, r5.b)
                                            else if (sub_e1090(*r7_1, &var_30, 4) != 0)
                                            label_de5d8:
                                                sub_de668(var_38_1, r5.b)
                                            else
                                                int32_t r8_1 = var_30
                                                
                                                if (r8_1 s> 0xffffffff)
                                                    r0_18 = *var_38_1
                                                    
                                                    if (r8_1 + 1 u>= 0x15555556)
                                                        sub_d14b4(r0_18)
                                                        noreturn
                                                    
                                                    int32_t* r0_79
                                                    int32_t r4_12
                                                    int32_t i_2
                                                    void* r9_7
                                                    r0_79, r4_12, r5, i_2, r9_7 =
                                                        sub_d14cc(r0_18, 0, 0, r8_1 * 0xc)
                                                    *(r9_7 + 0x18) = r0_79
                                                    *(r9_7 + 0x3c) = i_2
                                                    
                                                    if (i_2 s>= 1)
                                                        int32_t i_1 = i_2
                                                        int32_t i
                                                        
                                                        do
                                                            *r0_79 = r4_12
                                                            r0_79 = &r0_79[3]
                                                            i = i_1
                                                            i_1 -= 1
                                                        while (i != 1)
                                                        int32_t r4_13 = 0
                                                        r5 = nullptr
                                                        
                                                        do
                                                            if (sub_e1090(*r7_1, &var_30, 4) != 0)
                                                                goto label_de5d8_2
                                                            
                                                            int32_t r2_11 = var_30
                                                            void* r0_87
                                                            
                                                            if (r2_11 == 0)
                                                                r0_87 = nullptr
                                                            else
                                                                void* r0_83
                                                                r0_83, r9_7 = sub_e116c(*var_38_1, 
                                                                    *(var_38_1 + 8), r2_11)
                                                                
                                                                if (sub_e1090(*(var_38_1 + 4), r0_83, 
                                                                        var_30) != 0)
                                                                    goto label_de5d8_2
                                                                
                                                                r0_87 =
                                                                    sub_d7eb4(*var_38_1, r0_83, var_30 - 1)
                                                                r7_1 = var_34_1
                                                            
                                                            *(*(r9_7 + 0x18) + r4_13) = r0_87
                                                            
                                                            if (sub_e1090(*r7_1, &var_30, 4) != 0)
                                                                goto label_de5d8_2
                                                            
                                                            int32_t r0_90 = var_30
                                                            
                                                            if (r0_90 s<= 0xffffffff)
                                                                goto label_de5e8
                                                            
                                                            *(*(r9_7 + 0x18) + r4_13 + 4) = r0_90
                                                            
                                                            if (sub_e1090(*r7_1, &var_30, 4) != 0)
                                                                goto label_de5d8_2
                                                            
                                                            int32_t r0_93 = var_30
                                                            
                                                            if (r0_93 s<= 0xffffffff)
                                                                goto label_de5e8
                                                            
                                                            r5 += 1
                                                            void* r1_57 = *(r9_7 + 0x18) + r4_13
                                                            r4_13 += 0xc
                                                            *(r1_57 + 8) = r0_93
                                                        while (r5 s< i_2)
                                                    
                                                    if (sub_e1090(*r7_1, &var_30, 4) != 0)
                                                    label_de5d8_1:
                                                        sub_de668(var_38_1, r5.b)
                                                    else
                                                        int32_t r4_14 = var_30
                                                        
                                                        if (r4_14 s> 0xffffffff)
                                                            if (r4_14 != 0)
                                                                r5 = nullptr
                                                                
                                                                do
                                                                    if (sub_e1090(*r7_1, &var_30, 4) != 0)
                                                                        goto label_de5d8_2
                                                                    
                                                                    int32_t r2_14 = var_30
                                                                    void* r0_103
                                                                    
                                                                    if (r2_14 == 0)
                                                                        r0_103 = nullptr
                                                                    else
                                                                        void* r0_99
                                                                        r0_99, r9_7 = sub_e116c(*var_38_1, 
                                                                            *(var_38_1 + 8), r2_14)
                                                                        
                                                                        if (sub_e1090(*(var_38_1 + 4), r0_99, 
                                                                                var_30) != 0)
                                                                            goto label_de5d8_2
                                                                        
                                                                        r0_103 =
                                                                            sub_d7eb4(*var_38_1, r0_99, var_30 - 1)
                                                                        r7_1 = var_34_1
                                                                    
                                                                    *(*(r9_7 + 0x1c) + (r5 << 3)) = r0_103
                                                                    r5 += 1
                                                                while (r5 s< r4_14)
                                                            
                                                            int32_t r0_104 = *__stack_chk_guard
                                                            
                                                            if (r0_104 == r0)
                                                                return r0_104 - r0
                                                            
                                                            __stack_chk_fail()
                                                            noreturn
                                else
                                    void* r0_67
                                    r0_67, r9_5 = sub_e116c(*var_38_1, *(var_38_1 + 8), r2_7)
                                    
                                    if (sub_e1090(*(var_38_1 + 4), r0_67, var_30) == 0)
                                        r0_71 = sub_d7eb4(*var_38_1, r0_67, var_30 - 1)
                                        goto label_de328
                                    
                                label_de5d8_2:
                                    sub_de668(var_38_1, r5.b)
                
            label_de5e8:
                sub_de668(var_38_1, r5.b)
            label_de5f8:
                sub_d14b4(sub_de668(r5, r5.b))
                noreturn

int32_t* r0_110
int32_t r12
int64_t* lr
r0_110, r12, lr = sub_de668(r5, r5.b)

if (cond:0_1)
    *r0_110
    jump(&data_de620 & arg4 s>> (r12 & 0xff))

if (cond:1_1)
    int16_t r3_7
    int32_t r4_15
    r4_15:r3_7 = *lr
    void* lr_2 = lr - arg3
    *lr_2 = r3_7
    void* lr_3 = lr_2 - arg4
    *(lr_3 - r12) = *lr_3

return sub_de62c(r0_110) __tailcall
