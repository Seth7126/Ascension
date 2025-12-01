// 函数: sub_d99ec
// 地址: 0xd99ec
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* var_20 = arg4
int32_t r0 = *arg1
void* r10 = arg2
char* i_11 = arg3
*arg1 = r0 - 1

if (r0 == 0)
    luaL_error(arg1[4], "pattern too complex")

while (true)
    char* var_28_1 = r10
    
    while (true)
        int32_t r0_3 = arg1[3]
        char* result
        
        if (i_11 == r0_3)
            result = var_28_1
        else
            int32_t r1_1 = sx.d(*i_11)
            char* s2 = var_28_1
            char* i_8
            char* i_9
            
            if (r1_1 == 0x25)
                int32_t r1_2 = sx.d(i_11[1])
                
                if (r1_2 == 0x66)
                    void* r8_2 = &i_11[2]
                    void* r6_1
                    void* r9
                    
                    if (zx.d(*r8_2) != 0x5b)
                        luaL_error(arg1[4], "missing '[' after '%%f' in pattern")
                        int32_t r0_6 = sx.d(i_11[2])
                        r6_1 = &i_11[3]
                        
                        if (r0_6 == 0x5b)
                            goto label_d9ae0
                        
                        if (r0_6 != 0x25)
                            r9 = r6_1
                        else
                            if (r6_1 == arg1[3])
                                luaL_error(arg1[4], "malformed pattern (ends with '%%')")
                            
                            r9 = &i_11[4]
                    else
                        r6_1 = &i_11[3]
                    label_d9ae0:
                        arg4 = r6_1
                        
                        if (zx.d(i_11[3]) == 0x5e)
                            arg4 = &i_11[4]
                        
                        void* r0_13
                        
                        do
                            if (arg4 == arg1[3])
                                luaL_error(arg1[4], "malformed pattern (missing ']')")
                            
                            r0_13 = arg4 + 1
                            
                            if (zx.d(*arg4) == 0x25 && r0_13 u< arg1[3])
                                r0_13 = arg4 + 2
                            
                            arg4 = r0_13
                        while (zx.d(*r0_13) != 0x5d)
                        r9 = arg4 + 1
                    
                    int32_t r0_15 = arg1[1]
                    uint32_t r0_16 = zx.d(*r6_1)
                    
                    if (s2 != r0_15)
                        arg4 = zx.d(*(s2 - 1))
                    
                    int32_t r10_1 = r0_16 - 0x5e
                    
                    if (s2 == r0_15)
                        arg4 = nullptr
                    
                    if (r0_16 == 0x5e)
                        r8_2 = r6_1
                    
                    void* r6_2 = r8_2 + 1
                    
                    if (r0_16 != 0x5e)
                        r10_1 = 1
                    
                    int32_t r0_20
                    
                    if (r6_2 u>= r9 - 1)
                    label_d9be8:
                        r0_20 = r10_1 ^ 1
                    else
                        void* r2 = r6_2
                        char* r0_17 = r8_2
                        
                        while (true)
                            int32_t r1_5 = zx.d(r0_17[2])
                            uint32_t r3_1 = zx.d(r0_17[1])
                            
                            if (r3_1 != 0x25)
                                if (r1_5 == 0x2d)
                                    r0_17 = &r0_17[3]
                                
                                if (r1_5 != 0x2d || r0_17 u>= r9 - 1)
                                    r0_17 = r2
                                    
                                    if (r3_1 == arg4)
                                        r0_20 = r10_1
                                        break
                                else if (r3_1 u<= arg4 && zx.d(*r0_17) u>= arg4)
                                    r0_20 = r10_1
                                    break
                            else
                                r0_17 = &r0_17[2]
                                
                                if (sub_da4b0(arg4, r1_5) != 0)
                                    r0_20 = r10_1
                                    break
                            
                            r2 = &r0_17[1]
                            
                            if (r2 u>= r9 - 1)
                                goto label_d9be8
                    
                    result = nullptr
                    
                    if (r0_20 == 0)
                        arg4 = r9
                        
                        if (r6_2 u>= r9 - 1)
                        label_d9c88:
                            r10_1 ^= 1
                        else
                            uint32_t r9_1 = zx.d(*var_28_1)
                            
                            while (true)
                                uint32_t r1_7 = zx.d(*(r8_2 + 2))
                                uint32_t r0_22 = zx.d(*(r8_2 + 1))
                                
                                if (r0_22 != 0x25)
                                    if (r1_7 == 0x2d)
                                        r8_2 += 3
                                    
                                    if (r1_7 != 0x2d || r8_2 u>= r9 - 1)
                                        r8_2 = r6_2
                                        
                                        if (r0_22 == r9_1)
                                            break
                                    else if (r0_22 u<= r9_1 && zx.d(*r8_2) u>= r9_1)
                                        break
                                else
                                    r8_2 += 2
                                    
                                    if (sub_da4b0(r9_1, r1_7) != 0)
                                        break
                                
                                r6_2 = r8_2 + 1
                                
                                if (r6_2 u>= r9 - 1)
                                    goto label_d9c88
                        
                        i_11 = arg4
                        
                        if (r10_1 != 0)
                            continue
                else if (r1_2 - 0x30 u< 0xa)
                    int32_t r1_19 = r1_2 & 0xff
                    arg4 = i_11
                    int32_t r0_43
                    uint32_t n
                    
                    if (r1_19 u< 0x31)
                        r0_43 = luaL_error(arg1[4], "invalid capture index %%%d", r1_19 - 0x30)
                        n = arg1[r0_43 * 2 + 7]
                    else
                        r0_43 = r1_19 - 0x31
                        
                        if (r0_43 s>= arg1[5])
                            r0_43 = luaL_error(arg1[4], "invalid capture index %%%d", r1_19 - 0x30)
                            n = arg1[r0_43 * 2 + 7]
                        else
                            n = arg1[r0_43 * 2 + 7]
                            
                            if (n == 0xffffffff)
                                r0_43 =
                                    luaL_error(arg1[4], "invalid capture index %%%d", r1_19 - 0x30)
                                n = arg1[r0_43 * 2 + 7]
                    
                    result = nullptr
                    
                    if (arg1[2] - s2 u>= n)
                        r10 = &s2[n]
                        
                        if (s2 != neg.d(n) && memcmp(arg1[r0_43 * 2 + 6], s2, n) == 0)
                            i_11 = arg4 + 2
                            break
                else
                    if (r1_2 != 0x62)
                        i_9 = &i_11[1]
                        
                        if (i_9 == r0_3)
                            luaL_error(arg1[4], "malformed pattern (ends with '%%')")
                        
                        i_8 = i_11
                        i_11 = &i_11[2]
                        goto label_d9d94
                    
                    arg4 = &i_11[2]
                    
                    if (r0_3 - 1 u<= arg4)
                        luaL_error(arg1[4], "malformed pattern (missing arguments to '%%b')")
                    
                    uint32_t r0_50 = zx.d(*s2)
                    result = nullptr
                    
                    if (r0_50 == zx.d(*arg4))
                        int32_t r2_7 = arg1[2]
                        void* r1_25 = &s2[1]
                        
                        if (r1_25 u< r2_7)
                            int32_t r7_3 = 1
                            
                            while (true)
                                uint32_t r6_5 = zx.d(*r1_25)
                                
                                if (r6_5 == zx.d(i_11[3]))
                                    int32_t temp3_1 = r7_3
                                    r7_3 -= 1
                                    
                                    if (temp3_1 == 1)
                                        i_11 = &i_11[4]
                                        r10 = r1_25 + 1
                                        break
                                else if (r6_5 == r0_50)
                                    r7_3 += 1
                                
                                r1_25 += 1
                                
                                if (r1_25 u>= r2_7)
                                    goto label_da078
                            
                            break
            else if (r1_1 == 0x24)
                i_9 = &i_11[1]
                i_8 = i_11
                i_11 = i_9
                
                if (i_9 != r0_3)
                label_d9d94:
                    int32_t r6_3 = arg1[2]
                    uint32_t r1_12
                    
                    if (r6_3 u<= s2)
                        r1_12 = zx.d(*i_11)
                    label_d9efc:
                        result = nullptr
                        
                        if (r1_12 - 0x2a u<= 0x15 && (0x200009 & 1 << ((r1_12 - 0x2a) & 0xff)) != 0)
                            i_11 = &i_11[1]
                            continue
                    else
                        int32_t r8_3 = zx.d(*s2)
                        arg4 = sx.d(*i_8)
                        void* r0_33 = arg4 & 0xff
                        uint32_t r0_35
                        
                        if (arg4 != 0x25)
                            if (arg4 != 0x5b)
                                if (arg4 != 0x2e)
                                    int32_t temp0_1 = 0
                                    void* i = r0_33 - r8_3
                                    
                                    while (i != 0)
                                        i u>>= 1
                                        temp0_1 += 1
                                    
                                    r0_35 = (0x20 - temp0_1) u>> 5
                                    goto label_d9ebc
                                
                                r1_12 = zx.d(*i_11)
                                
                                if (r1_12 == 0x3f)
                                    goto label_d9ed0
                                
                                goto label_da040
                            
                            char* i_10 = i_8
                            uint32_t r1_14 = zx.d(i_10[1])
                            uint32_t r1_15 = r1_14 - 0x5e
                            
                            if (r1_14 == 0x5e)
                                i_10 = i_9
                            
                            void* i_13 = &i_10[1]
                            
                            if (r1_14 != 0x5e)
                                r1_15 = 1
                            
                            if (i_13 u>= i_11 - 1)
                            label_d9ea4:
                                r0_35 = r1_15 ^ 1
                            else
                                while (true)
                                    uint32_t r1_16 = zx.d(i_10[2])
                                    uint32_t r3_2 = zx.d(i_10[1])
                                    
                                    if (r3_2 != 0x25)
                                        if (r1_16 == 0x2d)
                                            i_10 = &i_10[3]
                                        
                                        if (r1_16 != 0x2d || i_10 u>= i_11 - 1)
                                            i_10 = i_13
                                            
                                            if (r3_2 == r8_3)
                                                r0_35 = r1_15
                                                break
                                        else if (r3_2 u<= r8_3 && zx.d(*i_10) u>= r8_3)
                                            r0_35 = r1_15
                                            break
                                    else
                                        i_10 = &i_10[2]
                                        
                                        if (sub_da4b0(r8_3, r1_16) != 0)
                                            r0_35 = r1_15
                                            break
                                    
                                    i_13 = &i_10[1]
                                    
                                    if (i_13 u>= i_11 - 1)
                                        goto label_d9ea4
                            
                            goto label_d9ebc
                        
                        r0_35 = sub_da4b0(r8_3, zx.d(*i_9))
                    label_d9ebc:
                        r1_12 = zx.d(*i_11)
                        
                        if (r0_35 == 0)
                            goto label_d9efc
                        
                        char* result_1
                        
                        if (r1_12 != 0x3f)
                        label_da040:
                            int32_t r0_51 = r1_12 << 0xfffffffc s>> 0x18
                            void* var_3c_2
                            
                            if (r0_51 == 0x2a)
                                var_3c_2 = arg4
                            label_da1d0:
                                int32_t i_3 = 0
                                
                                if (r6_3 u> s2)
                                    void* s2_1 = s2
                                    i_3 = 0
                                    int32_t var_40_2 = r6_3
                                    
                                    do
                                        int32_t r5_6 = zx.d(*s2_1)
                                        uint32_t r6_8
                                        char* i_12
                                        
                                        if (var_3c_2 == 0x5b)
                                            char* i_6 = i_8
                                            i_12 = i_9
                                            uint32_t r1_35 = zx.d(i_6[1])
                                            r6_8 = r1_35 - 0x5e
                                            
                                            if (r1_35 == 0x5e)
                                                i_6 = i_9
                                            
                                            void* i_1 = &i_6[1]
                                            
                                            if (r1_35 != 0x5e)
                                                r6_8 = 1
                                            
                                            for (; i_1 u< i_11 - 1; i_1 = &i_6[1])
                                                int32_t r1_36 = zx.d(i_6[2])
                                                uint32_t r3_4 = zx.d(i_6[1])
                                                
                                                if (r3_4 != 0x25)
                                                    if (r1_36 == 0x2d)
                                                        i_6 = &i_6[3]
                                                    
                                                    if (r1_36 != 0x2d || i_6 u>= i_11 - 1)
                                                        i_6 = i_1
                                                        
                                                        if (r3_4 == r5_6)
                                                            goto label_da2e4
                                                    else if (r3_4 u<= r5_6 && zx.d(*i_6) u>= r5_6)
                                                        goto label_da2e4
                                                else
                                                    i_6 = &i_6[2]
                                                    
                                                    if (sub_da4b0(r5_6, r1_36) != 0)
                                                        goto label_da2e4
                                            
                                            r6_8 ^= 1
                                        label_da2e4:
                                            r6_3 = var_40_2
                                            i_9 = i_12
                                            
                                            if (r6_8 == 0)
                                                break
                                        else if (var_3c_2 != 0x2e)
                                            if (var_3c_2 != 0x25)
                                                i_12 = i_9
                                                int32_t temp0_2 = 0
                                                void* i_2 = r0_33 - r5_6
                                                
                                                while (i_2 != 0)
                                                    i_2 u>>= 1
                                                    temp0_2 += 1
                                                
                                                r6_8 = (0x20 - temp0_2) u>> 5
                                            else
                                                i_12 = i_9
                                                r6_8 = sub_da4b0(r5_6, zx.d(*i_9))
                                            
                                            goto label_da2e4
                                        i_3 += 1
                                        s2_1 = &s2[i_3]
                                    while (r6_3 u> s2_1)
                                
                                while (i_3 s>= 0)
                                    char* result_4 = sub_d99ec(arg1, &s2[i_3], &i_11[1])
                                    i_3 -= 1
                                    result = result_4
                                    
                                    if (result_4 != 0)
                                        goto label_da078
                                
                                result = nullptr
                            else
                                if (r0_51 == 0x2b)
                                    var_3c_2 = arg4
                                    s2 = &s2[1]
                                    goto label_da1d0
                                
                                if (r0_51 != 0x2d)
                                    r10 += 1
                                    break
                                
                                while (true)
                                    result_1 = sub_d99ec(arg1, var_28_1, &i_11[1])
                                    
                                    if (result_1 != 0)
                                        break
                                    
                                    result = nullptr
                                    
                                    if (arg1[2] u<= var_28_1)
                                        goto label_da078
                                    
                                    int32_t r0_84 = sx.d(*i_8)
                                    uint32_t r7_4 = zx.d(*var_28_1)
                                    uint32_t r6_11
                                    
                                    if (r0_84 == 0x5b)
                                        uint32_t r1_42 = zx.d(i_8[1])
                                        char* i_7 = i_8
                                        r6_11 = r1_42 - 0x5e
                                        
                                        if (r1_42 != 0x5e)
                                            r6_11 = 1
                                        else
                                            i_7 = i_9
                                        
                                        for (void* i_4 = &i_7[1]; i_4 u< i_11 - 1; i_4 = &i_7[1])
                                            int32_t r1_43 = zx.d(i_7[2])
                                            uint32_t r3_5 = zx.d(i_7[1])
                                            
                                            if (r3_5 != 0x25)
                                                if (r1_43 == 0x2d)
                                                    i_7 = &i_7[3]
                                                
                                                if (r1_43 != 0x2d || i_7 u>= i_11 - 1)
                                                    i_7 = i_4
                                                    
                                                    if (r3_5 == r7_4)
                                                        goto label_da478
                                                else if (r3_5 u<= r7_4 && zx.d(*i_7) u>= r7_4)
                                                    goto label_da478
                                            else
                                                i_7 = &i_7[2]
                                                
                                                if (sub_da4b0(r7_4, r1_43) != 0)
                                                    goto label_da478
                                        
                                        r6_11 ^= 1
                                    else if (r0_84 == 0x2e)
                                        r6_11 = 1
                                    else if (r0_84 != 0x25)
                                        int32_t temp0_3 = 0
                                        uint32_t i_5 = (r0_84 & 0xff) - r7_4
                                        
                                        while (i_5 != 0)
                                            i_5 u>>= 1
                                            temp0_3 += 1
                                        
                                        r6_11 = (0x20 - temp0_3) u>> 5
                                    else
                                        r6_11 = sub_da4b0(r7_4, zx.d(*i_9))
                                    
                                label_da478:
                                    var_28_1 = &var_28_1[1]
                                    
                                    if (r6_11 == 0)
                                        goto label_da078
                                
                                result = result_1
                        else
                        label_d9ed0:
                            i_11 = &i_11[1]
                            result_1 = sub_d99ec(arg1, r10 + 1, i_11)
                            
                            if (result_1 == 0)
                                continue
                            else
                                result = result_1
                else
                    if (s2 != arg1[2])
                        s2 = nullptr
                    
                    result = s2
            else if (r1_1 == 0x29)
                int32_t r0_55 = arg1[5]
                void* r1_28 = &arg1[r0_55 * 2 + 5]
                void* r6_6
                
                while (true)
                    if (r0_55 s< 1)
                        r0_55 = luaL_error(arg1[4], "invalid pattern capture")
                        r6_6 = &arg1[r0_55 * 2 + 7]
                        break
                    
                    int32_t r2_8 = *r1_28
                    r1_28 -= 8
                    r0_55 -= 1
                    
                    if (r2_8 == 0xffffffff)
                        r6_6 = r1_28 + 8
                        break
                
                *r6_6 = s2 - arg1[r0_55 * 2 + 6]
                char* result_2 = sub_d99ec(arg1, s2, &i_11[1])
                result = result_2
                
                if (result_2 == 0)
                    *r6_6 = 0xffffffff
                    result = nullptr
            else
                if (r1_1 != 0x28)
                    i_9 = &i_11[1]
                    i_8 = i_11
                    
                    if ((r1_1 & 0xff) != 0x5b)
                        i_11 = i_9
                    else
                        arg4 = i_9
                        
                        if (zx.d(i_11[1]) == 0x5e)
                            arg4 = &i_11[2]
                        
                        if (arg4 != r0_3)
                            goto label_d9d0c
                        
                        void* r1_11
                        
                        do
                            luaL_error(arg1[4], "malformed pattern (missing ']')")
                        label_d9d0c:
                            char* r1_10 = arg4
                            r1_11 = &r1_10[1]
                            
                            if (zx.d(*r1_10) == 0x25 && r1_11 u< arg1[3])
                                r1_11 = arg4 + 2
                            
                            if (zx.d(*r1_11) == 0x5d)
                                break
                            
                            arg4 = r1_11
                        while (arg4 == arg1[3])
                        
                        i_11 = r1_11 + 1
                    
                    goto label_d9d94
                
                void* r5_5 = &i_11[1]
                void* r0_64
                int32_t r1_29
                int32_t r6_7
                
                if (zx.d(*r5_5) != 0x29)
                    r6_7 = arg1[5]
                    
                    if (r6_7 s>= 0x20)
                        luaL_error(arg1[4], "too many captures")
                    
                    r0_64 = &arg1[r6_7 * 2]
                    r1_29 = 0xffffffff
                else
                    r6_7 = arg1[5]
                    r5_5 = &i_11[2]
                    
                    if (r6_7 s>= 0x20)
                        luaL_error(arg1[4], "too many captures")
                    
                    r0_64 = &arg1[r6_7 * 2]
                    r1_29 = 0xfffffffe
                
                *(r0_64 + 0x18) = s2
                *(r0_64 + 0x1c) = r1_29
                arg1[5] = r6_7 + 1
                char* result_3 = sub_d99ec(arg1, s2, r5_5)
                result = result_3
                
                if (result_3 == 0)
                    arg1[5] -= 1
                    result = nullptr
        
    label_da078:
        *arg1 += 1
        return result
