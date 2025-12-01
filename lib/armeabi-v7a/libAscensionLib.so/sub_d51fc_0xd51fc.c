// 函数: sub_d51fc
// 地址: 0xd51fc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r11
int32_t var_8 = r11
int32_t r10
int32_t var_c = r10
int32_t* r11_1 = &var_8
int32_t var_28 = *__stack_chk_guard
int32_t* r4 = arg1[0xc]
sub_cea80(arg1)
void var_50
sub_d56a0(arg1, &var_50, 0, arg1)
int32_t r0_3 = arg1[4]

if (r0_3 != 0x113)
    int32_t* r0_28
    int32_t r4_3
    int32_t r12
    char lr
    r0_28, r4_3, r12, lr = sub_d6ecc(arg1, 0x113)
    
    if (r0_3 == 0x113)
        r0_28 -= r4_3
    
    return sub_d541c(r0_28) __tailcall

sub_cea80(arg1)
int32_t* var_54_1
int32_t var_34
int32_t* r6_1
int32_t r10_1

if ((arg1[4] | 8) != 0x10a)
    var_54_1 = arg2
    r6_1 = sub_c5104(arg1[0xc], &var_50)
    char var_2a_1 = 0
    char var_2c_1 = *(r4 + 0x2e)
    void* r1_10 = *(r4[3] + 0x40)
    int16_t var_30_1 = (*(r1_10 + 0x1c)).w
    char var_2b_1 = 0
    int16_t var_2e_1 = (*(r1_10 + 0x10)).w
    var_34 = r4[4]
    r4[4] = &var_34
    int32_t var_3c
    r10_1 = var_3c
label_d53a8:
    int32_t i
    
    do
        int32_t r0_16 = r6_1[4] - 0x104
        
        if (r0_16 u<= 0x1a && (0x4020007 & 1 << (r0_16 & 0xff)) != 0)
            break
        
        i = sub_d4098(r6_1, 0x112, r6_1, 0x4020007)
    while (i != 0x112)
    int64_t* pc_1 = sub_d541c(r4)
    
    if ((r6_1[4] & 0xfffffffe) == 0x104)
        int32_t r0_22
        int32_t* r4_1
        r0_22, r4_1 = sub_c3d14(r4)
        r4 = sub_c3ddc(r4_1, var_54_1, r0_22, 1)
    
    r11_1 = sub_c3f64(r4, r10_1, 1, pc_1)
else
    r6_1 = sub_c53f4(arg1[0xc], &var_50)
    char var_2a = 0
    char var_2c = *(r4 + 0x2e)
    void* r1_4 = *(r4[3] + 0x40)
    int16_t var_30 = (*(r1_4 + 0x1c)).w
    char var_2b = 0
    int16_t var_2e = (*(r1_4 + 0x10)).w
    var_34 = r4[4]
    r4[4] = &var_34
    int32_t var_40
    int32_t* r8_1 = sub_d510c(r6_1, var_40, r10)
    int32_t r0_10
    
    while (true)
        r0_10 = r6_1[4]
        
        if (r0_10 s> 0x11c)
            if (r0_10 != 0x11d)
                if (r0_10 == 0x11e)
                    goto label_d531c
                
                goto label_d52fc
        else if (r0_10 != 0x3b)
            break
        
        sub_d4098(r6_1, __stack_chk_guard, r6_1, 0x11d)
    
    if (r0_10 - 0x104 u>= 3)
    label_d52fc:
        var_54_1 = r8_1
        int32_t r0_12
        r0_12, r4 = sub_c3d14(r4)
        r10_1 = r0_12
        goto label_d53a8
    
label_d531c:
    sub_d541c(r4)

if (*__stack_chk_guard != *(r11_1 - 0x20))
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
