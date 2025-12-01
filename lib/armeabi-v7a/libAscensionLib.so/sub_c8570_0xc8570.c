// 函数: sub_c8570
// 地址: 0xc8570
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r10 = arg3
int32_t r6 = arg2
void* lr = arg1
char const* const result
int32_t r6_1

do
    void* r9_1 = lr
    int32_t r0_1 = sub_cad74(lr, r10 + 1, r6)
    *arg4 = r0_1
    
    if (r0_1 != 0)
        return "local"
    
    if (r6 s< 1)
        return 0
    
    int32_t r12_1 = *(r9_1 + 0xc)
    int32_t r8_1 = 0xffffffff
    lr = r9_1
    int32_t r0_2 = 0
    int32_t r2_1 = 0
    
    do
        int32_t r5_1 = *(r12_1 + (r0_2 << 2))
        int32_t r7_1 = r5_1 & 0x3f
        int32_t r3 = r5_1 u>> 6 & 0xff
        
        if (r7_1 - 4 u> 0x1e)
        label_c868c:
            
            if (r3 == r10 && (zx.d((*"`qATPP\l<")[r7_1]) & 0x40) != 0)
                goto label_c86f8
        else
            switch (r7_1)
                case 4
                    if (r3 s<= r10 && r3 + (r5_1 u>> 0x17) s>= r10)
                        goto label_c86f8
                case 5, 6, 7, 8, 9, 0xa, 0xb, 0xc, 0xd, 0xe, 0xf, 0x10, 0x11, 0x12, 0x13, 0x14, 
                        0x15, 0x16, 0x18, 0x19, 0x1a, 0x1c, 0x1f, 0x20, 0x21
                    goto label_c868c
                case 0x17
                    int32_t r3_1 = r2_1
                    
                    if (r0_2 s< r0_2 + (r5_1 u>> 0xe) - 0x1fffe)
                        r3_1 = r0_2 + (r5_1 u>> 0xe) - 0x1fffe
                    
                    if (r0_2 + (r5_1 u>> 0xe) - 0x1fffe s> r6)
                        r3_1 = r2_1
                    
                    if (r0_2 + (r5_1 u>> 0xe) - 0x1fffe s> r2_1)
                        r2_1 = r3_1
                case 0x1b
                    if (r3 == r10)
                        goto label_c86f8
                case 0x1d, 0x1e
                    if (r3 s<= r10)
                    label_c86f8:
                        r8_1 = r0_2
                        
                        if (r0_2 s< r2_1)
                            r8_1 = 0xffffffff
                case 0x22
                    if (r3 + 2 s<= r10)
                        goto label_c86f8
        
        r0_2 += 1
    while (r6 != r0_2)
    
    result = nullptr
    
    if (r8_1 == 0xffffffff)
        break
    
    r6_1 = *(r12_1 + (r8_1 << 2))
    int32_t r2_2 = r6_1 & 0x3f
    
    if (r2_2 != 0)
        if (r2_2 - 1 u<= 0xb)
            switch (r2_2)
                case 1, 2
                    uint32_t r1_13
                    
                    if (r2_2 != 1)
                        r1_13 = *(r12_1 + (r8_1 << 2) + 4) u>> 6
                    else
                        r1_13 = r6_1 u>> 0xe
                    
                    int32_t r2_10 = *(lr + 8)
                    
                    if ((*(r2_10 + (r1_13 << 4) + 8) & 0xf) == 4)
                        result = "constant"
                        *arg4 = *(r2_10 + (r1_13 << 4)) + 0x10
                case 5
                    void* r1_18 = *(*(lr + 0x1c) + (0xff8 & r6_1 u>> 0x14))
                    void* const r2_7 = &data_1bfd31
                    
                    if (r1_18 != 0)
                        r2_7 = r1_18 + 0x10
                    
                    *arg4 = r2_7
                    return "upvalue"
                case 6, 7
                    uint32_t r0_5 = r6_1 u>> 0x17
                    char* s1
                    
                    if (r2_2 != 7)
                        void* r0_16 = *(*(lr + 0x1c) + (r0_5 << 3))
                        s1 = &data_1bfd31
                        
                        if (r0_16 != 0)
                            s1 = r0_16 + 0x10
                        
                        if ((r6_1 & 0x400000) != 0)
                            goto label_c87e4
                        
                        goto label_c88f0
                    
                    char* s1_1 = sub_cad74(lr, r0_5 + 1, r8_1)
                    lr = r9_1
                    s1 = s1_1
                    
                    if ((r6_1 & 0x400000) == 0)
                    label_c88f0:
                        char* r0_18 = sub_c8570(lr, r8_1, r6_1 u>> 0xe & 0x1ff, arg4, arg4)
                        
                        if (r0_18 == 0 || zx.d(*r0_18) != 0x63)
                            *arg4 = &data_1bfd31
                    else
                    label_c87e4:
                        int32_t r0_7 = *(lr + 8)
                        uint32_t r1_16 = zx.d((r6_1 u>> 0xe).b)
                        
                        if ((*(r0_7 + (r1_16 << 4) + 8) & 0xf) != 4)
                            *arg4 = &data_1bfd31
                        else
                            *arg4 = *(r0_7 + (r1_16 << 4)) + 0x10
                    
                    if (s1 == 0)
                        return "field"
                    
                    if (strcmp(s1, "_ENV") != 0)
                        return "field"
                    
                    return "global"
                case 0xc
                    uint32_t r2_8 = r6_1 u>> 0xe
                    void* const r1_24
                    
                    if ((r6_1 & 0x400000) != 0)
                        int32_t r0_24 = *(lr + 8)
                        int32_t r1_29 = r2_8 & 0xff
                        
                        if ((*(r0_24 + (r1_29 << 4) + 8) & 0xf) != 4)
                            r1_24 = &data_1bfd31
                            result = "method"
                        else
                            result = "method"
                            r1_24 = *(r0_24 + (r1_29 << 4)) + 0x10
                    else
                        char* r0_13 = sub_c8570(lr, r8_1, r2_8 & 0x1ff, arg4, arg4)
                        
                        if (r0_13 != 0 && zx.d(*r0_13) == 0x63)
                            return "method"
                        
                        r1_24 = &data_1bfd31
                        result = "method"
                    
                    *arg4 = r1_24
        
        break
    
    r10 = r6_1 u>> 0x17
    r6 = r8_1
while ((r6_1 u>> 6 & 0xff) u> r6_1 u>> 0x17)
return result
