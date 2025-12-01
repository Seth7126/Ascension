// 函数: sub_d0600
// 地址: 0xd0600
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r11
int32_t var_8 = r11
int32_t r8
int32_t var_14 = r8
int32_t* r11_1 = &var_8
int32_t* r6 = arg1[0xf]
void** r4 = arg2
char r9 = (*arg1).b
int32_t* r5 = arg1
int32_t r1 = r6[1]
int32_t r2 = r6[2]
int32_t r3 = r1 + 1
int32_t* r0
char* r0_1
int64_t* pc

if (r3 u<= r2)
    r0_1 = *r6
label_d066c:
    r6[1] = r3
    r0_1[r1] = r9
    int32_t* r0_2 = r5[0xe]
    int32_t r1_2 = *r0_2
    *r0_2 = r1_2 - 1
    uint32_t r0_3
    
    if (r1_2 == 0)
        r0_3 = sub_e0ffc(r0_2)
    else
        char* r1_3 = r0_2[1]
        r0_2[1] = &r1_3[1]
        r0_3 = zx.d(*r1_3)
    
    *r5 = r0_3
    
    if (r0_3 == 0xd || r0_3 == 0xa)
        r4, r11_1 = sub_d03c8(r5, r8)
    
    int32_t r9_1 = 0xfffffffe
    int32_t r8_1 = 0xa
    
    while (true)
        int32_t r10_1 = *r5
        
        if (r10_1 s> 0xc)
            if (r10_1 == 0xd)
                goto label_d0724
            
            if (r10_1 != 0x5d)
                goto label_d0784
            
            if (sub_d047c(r5) != arg3)
                continue
            
            char** r6_3 = r5[0xf]
            char r9_2 = (*r5).b
            int32_t r1_11 = r6_3[1]
            int32_t r2_7 = r6_3[2]
            int32_t r3_6 = r1_11 + 1
            char* r0_14
            
            if (r3_6 u<= r2_7)
                r0_14 = *r6_3
            else
                if (r2_7 u>= 0x7ffffffe)
                    break
                
                r0 = r5[0xd]
                
                if (0xfffffffe == r2_7 << 1)
                    goto label_d09a0
                
                int32_t r7_4 = r2_7 << 1
                r0_14, r4, r5, r9_2 = sub_d14cc(r0, *r6_3, r2_7, r7_4)
                r1_11 = r6_3[1]
                *r6_3 = r0_14
                r3_6 = r1_11 + 1
                r6_3[2] = r7_4
            
            r6_3[1] = r3_6
            r0_14[r1_11] = r9_2
            int32_t* r0_15 = r5[0xe]
            int32_t r1_13 = *r0_15
            *r0_15 = r1_13 - 1
            uint32_t r0_16
            
            if (r1_13 == 0)
                r0_16 = sub_e0ffc(r0_15)
            else
                char* r1_14 = r0_15[1]
                r0_15[1] = &r1_14[1]
                r0_16 = zx.d(*r1_14)
            
            *r5 = r0_16
            
            if (r4 != 0)
                int32_t* r0_17 = r5[0xf]
                int32_t* r7_5 = r5[0xd]
                void* r6_4 = sub_d7eb4(r7_5, *r0_17 + arg3 + 2, r0_17[1] - ((arg3 + 2) << 1))
                void** r0_21 = r7_5[2]
                r7_5[2] = &r0_21[4]
                *r0_21 = r6_4
                r0_21[2] = zx.d(*(r6_4 + 4)) | 0x40
                int32_t* r0_24 =
                    sub_daf38(r7_5, *(r5[0xc] + 4), r7_5[2] - 0x10, r4, r5, r6_4, r10_1, r11_1)
                
                if (r0_24[2] == 0)
                    r0_24[2] = 1
                    *r0_24 = 1
                    
                    if (*(r7_5[3] + 0xc) s>= 1)
                        sub_cc158(r7_5)
                else
                    r6_4 = r0_24[4]
                
                r7_5[2] -= 0x10
                *r4 = r6_4
            
            *(r11_1 - 0x1c)
            *(r11_1 - 0x18)
            *(r11_1 - 0x14)
            *(r11_1 - 0x10)
            *(r11_1 - 0xc)
            *(r11_1 - 8)
            *(r11_1 - 4)
            *r11_1
            jump(r11_1[1])
        
        if (r10_1 != 0xa)
            if (r10_1 == 0xffffffff)
                char const* const r1_22 = "unfinished long comment"
                
                if (r4 != 0)
                    r1_22 = "unfinished long string"
                
                sub_ce79c(r5, r1_22, 0x11e, pc)
                break
            
        label_d0784:
            
            if (r4 != 0)
                int32_t* r6_2 = r5[0xf]
                int32_t r1_7 = r6_2[1]
                int32_t r2_4 = r6_2[2]
                int32_t r3_4 = r1_7 + 1
                char* r0_10
                
                if (r3_4 u<= r2_4)
                    r0_10 = *r6_2
                else
                    if (r2_4 u>= 0x7ffffffe)
                        break
                    
                    r0 = r5[0xd]
                    
                    if (r9_1 == r2_4 << 1)
                        goto label_d09a0
                    
                    int32_t r7_3 = r2_4 << 1
                    r0_10, r4, r5, r8_1, r9_1 = sub_d14cc(r0, *r6_2, r2_4, r7_3)
                    r1_7 = r6_2[1]
                    *r6_2 = r0_10
                    r3_4 = r1_7 + 1
                    r6_2[2] = r7_3
                
                r6_2[1] = r3_4
                r0_10[r1_7] = r10_1.b
            
            int32_t* r0_11 = r5[0xe]
            int32_t r1_9 = *r0_11
            *r0_11 = r1_9 - 1
            
            if (r1_9 == 0)
                *r5 = sub_e0ffc(r0_11)
            else
                char* r1_10 = r0_11[1]
                r0_11[1] = &r1_10[1]
                *r5 = zx.d(*r1_10)
        else
        label_d0724:
            int32_t* r6_1 = r5[0xf]
            int32_t r1_4 = r6_1[1]
            int32_t r2_3 = r6_1[2]
            int32_t r3_2 = r1_4 + 1
            char* r0_5
            
            if (r3_2 u<= r2_3)
                r0_5 = *r6_1
            else
                if (r2_3 u>= 0x7ffffffe)
                    break
                
                r0 = r5[0xd]
                
                if (r9_1 == r2_3 << 1)
                    goto label_d09a0
                
                int32_t r7_2 = r2_3 << 1
                r0_5, r5, r8_1 = sub_d14cc(r0, *r6_1, r2_3, r7_2)
                r1_4 = r6_1[1]
                *r6_1 = r0_5
                r3_2 = r1_4 + 1
                r6_1[2] = r7_2
            
            r6_1[1] = r3_2
            r0_5[r1_4] = r8_1.b
            r4, r9_1, r11_1 = sub_d03c8(r5, r8_1)
            
            if (r4 == 0)
                *(r5[0xf] + 4) = 0
    
    r0 = sub_ce79c(r5, "lexical element too long", nullptr, pc)
else if (r2 u>= 0x7ffffffe)
    r0 = sub_ce79c(r5, "lexical element too long", nullptr, pc)
else
    r0 = r5[0xd]
    
    if (0xfffffffe != r2 << 1)
        int32_t r7_1 = r2 << 1
        r0_1, r4, r5, r8, r9 = sub_d14cc(r0, *r6, r2, r7_1)
        r1 = r6[1]
        *r6 = r0_1
        r3 = r1 + 1
        r6[2] = r7_1
        goto label_d066c
label_d09a0:
sub_d14b4(r0)
noreturn
