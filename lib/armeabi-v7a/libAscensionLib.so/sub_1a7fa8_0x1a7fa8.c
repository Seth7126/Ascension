// 函数: sub_1a7fa8
// 地址: 0x1a7fa8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r6
int32_t var_c = r6
int32_t r5
int32_t var_10 = r5
int32_t r4
int32_t var_14 = r4
int32_t __saved_r7
int32_t* var_28 = &__saved_r7
int32_t var_2c = r6
int32_t var_30 = r5
int32_t var_34 = r4
int32_t var_38 = arg4
int32_t r10 = arg3
int32_t r11 = 0
int32_t (__convention("cdecl")* const var_34_1)() = __stack_chk_guard
int32_t r0 = *__stack_chk_guard
int32_t var_30_1 = 0
int32_t result

while (true)
    if (r11 << 0x1f == 0)
        int32_t r5_1 = r10
        
        if (r10 u< arg4)
            r10 = r5_1 + 1
            uint32_t r8_1 = zx.d(*(arg2 + (r5_1 ^ 3)))
            int32_t r2_1
            
            if (r8_1 << 0x18 s< 0)
                uint32_t r0_9 = ((r8_1 & 0xf0) - 0x80) u>> 4
                
                if (r0_9 u> 5)
                label_1a81d8:
                    result = 9
                    break
                
                int32_t r0_34
                int32_t r2_11
                void* r3
                void* r3_1
                
                switch (r0_9)
                    case 0
                        if (r10 u< arg4)
                            uint32_t r2_2 = zx.d((r8_1 << 0xc).w) | zx.d(*(arg2 + (r10 ^ 3))) << 4
                            
                            if (r2_2 != 0)
                                r11 = 0
                                sub_1a836c(arg1, 0, r2_2, nullptr)
                                r10 = r5_1 + 2
                                var_30_1 |= (r8_1 & 8) u>> 3
                                continue
                        
                        goto label_1a81d8
                    case 1
                        if (((r8_1 | 2) & 0xf) == 0xf)
                            goto label_1a81d8
                        
                        r11 = 0
                        sub_1a8214(arg1, 0, r8_1 & 0xf, 0, &var_2c)
                        sub_1a885c(arg1, 0xd, var_2c)
                        continue
                    case 2
                        r11 = 0
                        sub_1a836c(arg1, 0, ((0x20 << (r8_1 & 7)) - 0x10) | (r8_1 & 8) << 0xb, 
                            nullptr)
                        continue
                    case 3
                        if (r8_1 - 0xb0 u> 7)
                            r0_34 = (r8_1 & 7) + 1
                            r3_1 = 1
                        label_1a816e:
                            sub_1a836c(arg1, 1, &(*"teProcessDefeatMonsterFromTheVoidE")[r0_34], 
                                r3_1)
                            r11 = 0
                            continue
                        else
                            result = 9
                            r11 = 1
                            
                            switch (r8_1)
                                case 0xb0
                                    continue
                                case 0xb1
                                    if (r10 u>= arg4)
                                        goto label_1a81d8
                                    
                                    uint32_t r2_6 = zx.d(*(arg2 + (r10 ^ 3)))
                                    result = 9
                                    
                                    if (r2_6 == 0)
                                        break
                                    
                                    if ((r2_6 & 0xf0) != 0)
                                        break
                                    
                                    r11 = 0
                                    sub_1a836c(arg1, 0, r2_6, nullptr)
                                    r10 = r5_1 + 2
                                    continue
                                case 0xb2
                                    int32_t r5_2 = 0
                                    int32_t r0_37 = 0
                                    uint32_t r1_14
                                    
                                    do
                                        if (r10 u>= arg4)
                                            goto label_1a81d8
                                        
                                        int32_t r1_13 = r10 ^ 3
                                        r10 += 1
                                        r1_14 = zx.d(*(arg2 + r1_13))
                                        r5_2 |= (r1_14 & 0x7f) << r0_37
                                        r0_37 += 7
                                    while (r1_14 << 0x18 s< 0)
                                    sub_1a8828(arg1, 0xd, &var_2c)
                                    r2_1 = var_2c + (r5_2 << 2) + 0x204
                                case 0xb3
                                    r3 = 1
                                    uint32_t r0_42 = zx.d(*(arg2 + (r10 ^ 3)))
                                    r2_11 = ((r0_42 & 0xf) + 1) | (r0_42 & 0xf0) << 0xc
                                label_1a814a:
                                    sub_1a836c(arg1, 1, r2_11, r3)
                                    r10 = r5_1 + 2
                                    r11 = 0
                                    continue
                                case 0xb4, 0xb5, 0xb6, 0xb7
                                    break
                    case 4
                        if ((r8_1 & 0xfe) != 0xc8)
                            goto label_1a81d8
                        
                        int32_t r2_8 = __clz(r8_1 - 0xc8)
                        uint32_t r1_10 = zx.d(*(arg2 + (r10 ^ 3)))
                        int32_t r1_11 = r1_10 & 0xf
                        int32_t r0_30 = r1_10 u>> 4 | r2_8 u>> 5 << 4
                        
                        if (r0_30 + r1_11 u> 0x1f)
                            goto label_1a81d8
                        
                        r3 = 5
                        r2_11 = (r1_11 + 1) | r0_30 << 0x10
                        goto label_1a814a
                    case 5
                        if (r8_1 << 0x1c s< 0)
                            goto label_1a81d8
                        
                        r0_34 = (r8_1 & 7) + 1
                        r3_1 = 5
                        goto label_1a816e
            else
                sub_1a8828(arg1, 0xd, &var_2c)
                uint32_t r0_5 = r8_1 << 2
                
                if (r8_1 << 0x19 s< 0)
                    r2_1 = 0xfffffffc - (r0_5 & 0xfc) + var_2c
                else
                    r2_1 = r0_5 + var_2c + 4
            
            var_2c = r2_1
            sub_1a885c(arg1, 0xd, r2_1)
            r11 = 0
            continue
    
    if (var_30_1 << 0x1f == 0)
        sub_1a8828(arg1, 0xe, &var_2c)
        sub_1a885c(arg1, 0xf, var_2c)
    
    result = 8
    break

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
