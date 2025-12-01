// 函数: sub_d62fc
// 地址: 0xd62fc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r11
int32_t var_8 = r11
int32_t r6
int32_t var_1c = r6
int32_t* r11_1 = &var_8
int32_t* r4 = arg1
int32_t* r5 = arg2
int32_t r0 = *__stack_chk_guard
int32_t r0_1 = r4[4]
r4[1]
int32_t* r7 = r4[0xc]
int64_t* pc
bool cond:0_1

if (r0_1 == 0x120)
    sub_d6a80(r4, r5, r7)
label_d6388:
    int32_t var_40
    int32_t* r8_1 = &var_40
    
    while (true)
        int32_t r0_8 = r4[4]
        
        if (r0_8 == 0x5b)
            sub_c4d34(r7, r5)
            sub_cea80(r4)
            sub_d56a0(r4, r8_1, 0, r6)
            sub_c4d50(r4[0xc], r8_1)
            int32_t r0_21 = r4[4]
            cond:0_1 = r0_21 == 0x5d
            
            if (r0_21 != 0x5d)
                r4, pc = sub_d6ecc(r4, 0x5d)
                break
            
            sub_cea80(r4)
            sub_c5568(r7, r5, r8_1)
            continue
        
        if (r0_8 == 0x7b || r0_8 == 0x121)
            goto label_d6438
        
        if (r0_8 == 0x28)
        label_d6438:
            int32_t r9_2
            r4, r5, r9_2 = sub_c482c(r7, r5, 0xff)
            r6, r8_1, r11_1 = sub_d68b8(r4, r5, r9_2, 0xffffffff)
            continue
        else if (r0_8 == 0x2e)
            sub_d680c(r4, r5)
            continue
        else if (r0_8 == 0x3a)
            sub_cea80(r4)
            int32_t r0_10 = r4[4]
            cond:0_1 = r0_10 == 0x120
            
            if (r0_10 != 0x120)
                r4, pc = sub_d6ecc(sub_d6ecc(r4, 0x120), 0x5d)
                break
            
            void* r6_1 = r4[6]
            sub_cea80(r4)
            int32_t r0_13 = sub_c4370(r4[0xc], r6_1)
            int32_t var_30_1 = 0xffffffff
            int32_t var_2c_1 = 0xffffffff
            var_40 = 4
            int32_t var_38_1 = r0_13
            r6, r8_1, r11_1 = sub_d68b8(r4, r5, sub_c5020(r7, r5, r8_1), 0xffffffff)
            continue
        
        if (*__stack_chk_guard != r0)
            __stack_chk_fail()
            noreturn
        
        *(r11_1 - 0x1c)
        *(r11_1 - 0x18)
        *(r11_1 - 0x14)
        *(r11_1 - 0x10)
        *(r11_1 - 0xc)
        *(r11_1 - 8)
        *(r11_1 - 4)
        *r11_1
        jump(r11_1[1])
else
    cond:0_1 = r0_1 == 0x28
    
    if (r0_1 == 0x28)
        sub_cea80(r4)
        r5 = sub_d507c(r4, 0x29, 0x28, sub_d56a0(r4, r5, 0, r6))
        sub_c471c(r4[0xc], r5)
        goto label_d6388

void* r0_29
void* r1_13
int32_t r12
r0_29, r1_13, r12 = sub_ce78c(r4, "unexpected symbol", pc)

if (cond:0_1)
    r0_29 -= r4

return sub_d64fc(r0_29, r1_13) __tailcall
