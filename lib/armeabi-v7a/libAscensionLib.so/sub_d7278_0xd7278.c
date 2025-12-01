// 函数: sub_d7278
// 地址: 0xd7278
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* var_14 = arg3
int32_t r6
int32_t var_1c = r6
int32_t* r5 = arg1
int32_t r0 = *__stack_chk_guard
int32_t* r4_1 = &arg2[2]

if (*r4_1 - 7 u>= 3)
    int64_t* pc
    sub_ce78c(r5, "syntax error", pc)
label_d74cc:
    sub_d6ecc(r5, 0x3d)
label_d74e0:
    void* r0_29
    int32_t r1_16
    int32_t lr
    char pc_1
    r0_29, r1_16, lr, pc_1 = sub_d4018(r5[0xc], 0xc8, "C levels")
    return sub_d74f0(r0_29, r1_16) __tailcall

int32_t r0_3 = r5[4]
int32_t* r0_21
int32_t* r1_7
int32_t* r2_3
void** i_1

if (r0_3 == 0x3d)
    sub_cea80(r5)
    int32_t r9_3 = sub_d56a0(r5, &i_1, 0, r6)
    int32_t r7_1 = 1
    
    if (r5[4] == 0x2c)
        r7_1 = 1
        
        do
            sub_cea80(r5)
            r4_1, r5 = sub_c482c(r5[0xc], &i_1, (__stack_chk_guard).b)
            r9_3 = sub_d56a0(r5, &i_1, 0, &i_1)
            r7_1 += 1
        while (r5[4] == 0x2c)
    
    if (r7_1 != r9_3)
        int32_t r9_4 = sub_d71e4(r5, r9_3, r7_1, &i_1)
        
        if (r7_1 s> r9_4)
            void* r0_25 = r5[0xc]
            *(r0_25 + 0x30) += r9_4.b - r7_1.b
        
        goto label_d73ac
    
    sub_c46bc(r5[0xc], &i_1)
    r0_21 = r5[0xc]
    r1_7 = r4_1
    r2_3 = &i_1
else
    if (r0_3 != 0x2c)
        goto label_d74cc
    
    void** i = arg2
    sub_cea80(r5)
    i_1 = i
    int32_t var_40
    int32_t r9_2 = sub_d62fc(r5, &var_40)
    int32_t r0_6 = var_40
    
    if (r0_6 != 9)
        arg3 = r5[0xc]
        int32_t r3_1 = 0
        uint32_t r2_1 = zx.d(arg3[0xc].b)
        int32_t var_38
        
        do
            if (i[2] == 9)
                if (r0_6 == zx.d(*(i + 0x13)) && var_38 == zx.d(*(i + 0x12)))
                    r3_1 = 1
                    *(i + 0x12) = r2_1.b
                    *(i + 0x13) = 7
                
                if (r0_6 == 7 && var_38 == sx.d(i[4].w))
                    r3_1 = 1
                    i[4].w = r2_1.w
            
            i = *i
        while (i != 0)
        
        if (r3_1 != 0)
            int32_t var_50 = 0
            int32_t r1_3 = r0_6 - 7
            
            if (r0_6 != 7)
                r1_3 = 5
            
            sub_c3d00(arg3, r1_3, r2_1, var_38, var_50)
            r9_2 = sub_c4328(arg3, 1)
    
    if (zx.d(*(r5[0xd] + 0x26)) + r9_2 s>= 0xc9)
        goto label_d74e0
    
    sub_d7278(r5, &i_1, r9_2 + 1)
label_d73ac:
    r0_21 = r5[0xc]
    uint32_t r1_5 = zx.d(r0_21[0xc].b)
    int32_t var_34_1 = 0xffffffff
    int32_t var_38_1 = 0xffffffff
    i_1 = 6
    r2_3 = &i_1
    var_40 = r1_5 - 1
    r1_7 = r4_1
sub_c4f28(r0_21, r1_7, r2_3)
int32_t r0_22 = *__stack_chk_guard

if (r0_22 == r0)
    return r0_22 - r0

__stack_chk_fail()
noreturn
