// 函数: sub_d4098
// 地址: 0xd4098
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r11
int32_t var_8 = r11
void* var_18 = arg4
int32_t* var_1c = arg3
int32_t* var_20 = arg2
int32_t* r11_1 = &var_8
int32_t* r4 = arg1
int32_t (* const r10)() = __stack_chk_guard
int32_t var_28 = *__stack_chk_guard
void* r0_1 = r4[0xd]
int32_t* r8 = r4[1]
int16_t r1_1 = *(r0_1 + 0x26) + 1
*(r0_1 + 0x26) = r1_1
uint32_t r0_2 = zx.d(r1_1)
bool cond:5 = r0_2 == 0xc9
int32_t var_88
int32_t* r4_1
int64_t* pc_1

if (r0_2 u>= 0xc9)
label_d4fe4:
    r4, arg3 = sub_d4018(r4[0xc], 0xc8, "C levels")
label_d4ff0:
    r4 = sub_d6ecc(r4, 0x11d)
label_d4ffc:
    r4 = sub_d6ecc(r4, 0x103)
label_d5008:
    r4, pc_1 = sub_d6ecc(r4, 0x10c)
label_d5018:
    sub_ce78c(r4, "'=' or 'in' expected", pc_1)
label_d5028:
    sub_ce78c(r4, "syntax error", pc_1)
label_d5034:
    r4_1 = sub_d6ecc(r4, 0x3d)
label_d5040:
    void* r0_225
    int32_t r1_104
    int32_t r2_40
    int32_t r3_23
    int32_t r4_3
    int32_t r12_2
    int64_t* lr_2
    int32_t pc_6
    r0_225, r1_104, r2_40, r3_23, r4_3, r12_2, lr_2, pc_6 = sub_d6ecc(r4_1, 0x2c)
    
    if (cond:5 && (r0_225 & r12_2 s>> (r1_104 & 0xff)) == 0)
        r0_225 -= r8
        *lr_2 = (&var_88):(lr_2 & r3_23 << (arg3 & 0xff))
        void* lr_3 = lr_2 - pc_6
        *lr_3 = lr_3.w & (arg3 s>> 0x1d).w
    
    return sub_d507c(r0_225, r1_104, r2_40, r3_23) __tailcall

int32_t r0_3 = r4[4]
void* const var_48
char var_40

if (r0_3 - 0x102 u> 0x1b)
    if (r0_3 == 0x3b)
    label_d421c:
        sub_cea80(r4)
        goto label_d4f40
    
label_d418c:
    int32_t* r5 = r4[0xc]
    pc_1 = sub_d62fc(r4, &var_40)
    int32_t r0_8 = r4[4]
    
    if (r0_8 == 0x3d || r0_8 == 0x2c)
        var_48 = nullptr
        sub_d7278(r4, &var_48, r8)
        goto label_d4f40
    
    int32_t r0_162 = var_40.d
    cond:5 = r0_162 == 0xc
    
    if (r0_162 != 0xc)
        goto label_d5028
    
    int32_t r0_164 = *(*r5 + 0xc)
    int32_t var_38
    *(r0_164 + (var_38 << 2)) = (*(r0_164 + (var_38 << 2)) & 0xff803fff) | 0x4000
    goto label_d4f40

int32_t* var_70
int32_t var_60
int32_t var_34
int32_t* r0_92
int32_t r0_105
int32_t r1_48
void* r2_16
int32_t r9_8
int64_t* pc_4

switch (r0_3)
    case 0x102, 0x10a
        int32_t r0_5
        r0_5, r4, r11_1 = sub_c3d14(r4[0xc])
        sub_d510c(r4, r0_5, r10)
    label_d4f40:
        void* r0_207 = r4[0xc]
        *(r0_207 + 0x30) = *(r0_207 + 0x2e)
        void* r0_208 = r4[0xd]
        *(r0_208 + 0x26) -= 1
        
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
    case 0x103
        sub_cea80(r4)
        int32_t* r8_2 = r4[0xc]
        char var_3e_2 = 0
        var_40 = *(r8_2 + 0x2e)
        void* r1_51 = *(r8_2[3] + 0x40)
        int16_t var_44_2 = (*(r1_51 + 0x1c)).w
        char var_3f_2 = 0
        int16_t var_42_2 = (*(r1_51 + 0x10)).w
        var_48 = r8_2[4]
        r8_2[4] = &var_48
        int32_t i
        
        do
            i = r4[4]
            
            if (i - 0x104 u<= 0x1a && (0x4020007 & 1 << ((i - 0x104) & 0xff)) != 0)
                break
            
            sub_d4098(r4)
        while (i != 0x112)
        sub_d541c(r8_2)
        sub_d507c(r4, 0x106, 0x103, r8)
        goto label_d4f40
    case 0x104, 0x105, 0x106, 0x107, 0x10c, 0x10e, 0x10f, 0x110, 0x113, 0x114, 0x115, 0x117, 0x118, 
            0x119, 0x11a, 0x11b, 0x11c
        goto label_d418c
    case 0x108
        arg2 = r4[0xc]
        char var_56_1 = 1
        char var_58_1 = *(arg2 + 0x2e)
        void* r0_48 = *(arg2[3] + 0x40)
        int16_t var_5c_1 = (*(r0_48 + 0x1c)).w
        char var_57_1 = 0
        int16_t var_5a_1 = (*(r0_48 + 0x10)).w
        var_60 = arg2[4]
        arg2[4] = &var_60
        sub_cea80(r4)
        
        if (r4[4] == 0x120)
            void* r7_2 = r4[6]
            pc_1 = sub_cea80(r4)
            int32_t r0_53 = r4[4]
            int32_t* r6_5
            
            if (r0_53 != 0x2c && r0_53 != 0x10c)
                cond:5 = r0_53 == 0x3d
                
                if (r0_53 != 0x3d)
                    goto label_d5018
                
                arg3 = r8
                r8 = zx.d(*(r4[0xc] + 0x30))
                sub_d6678(r4, sub_ce954(r4, "(for index)", 0xb))
                sub_d6678(r4, sub_ce954(r4, "(for limit)", 0xb))
                sub_d6678(r4, sub_ce954(r4, "(for step)", 0xa))
                sub_d6678(r4, r7_2)
                int32_t r0_187 = r4[4]
                cond:5 = r0_187 == 0x3d
                
                if (r0_187 != 0x3d)
                    goto label_d5034
                
                sub_cea80(r4)
                sub_d56a0(r4, &var_48, 0, arg3)
                r4_1 = sub_c482c(r4[0xc], &var_48, r10.b)
                int32_t r0_191 = r4_1[4]
                cond:5 = r0_191 == 0x2c
                
                if (r0_191 != 0x2c)
                    goto label_d5040
                
                sub_cea80(r4_1)
                sub_d56a0(r4_1, &var_48, 0, arg3)
                int32_t* r9_10
                r4, r9_10 = sub_c482c(r4_1[0xc], &var_48, r10.b)
                
                if (r4[4] != 0x2c)
                    unimplemented  {vmov.f64 d0, #1.000000e+00}
                    unimplemented  {vmov r2, r3, d0}
                    sub_c4328(sub_c428c(r9_10, zx.d(r9_10[0xc].b), sub_c453c(r9_10)), 1)
                else
                    sub_cea80(r4)
                    sub_d56a0(r4, &var_48, 0, arg3)
                    r4 = sub_c482c(r4[0xc], &var_48, r10.b)
                
                var_88 = 1
                r6_5 = sub_d6f04(r4, r8, arg3, 1, var_88)
                goto label_d4f38
            
            int32_t* var_7c_1 = arg2
            var_70 = r8
            arg2 = r4[0xc]
            r8 = zx.d(arg2[0xc].b)
            sub_d6678(r4, sub_ce954(r4, "(for generator)", 0xf))
            sub_d6678(r4, sub_ce954(r4, "(for state)", 0xb))
            sub_d6678(r4, sub_ce954(r4, "(for control)", 0xd))
            sub_d6678(r4, r7_2)
            int32_t i_1 = r4[4]
            arg4 = 1
            
            if (i_1 == 0x2c)
                arg4 = 1
                
                do
                    sub_cea80(r4)
                    
                    if (r4[4] != 0x120)
                        goto label_d4ac8
                    
                    arg3 = r4[6]
                    sub_cea80(r4)
                    sub_d6678(r4, arg3)
                    i_1 = r4[4]
                    arg4 += 1
                while (i_1 == 0x2c)
            
            cond:5 = i_1 == 0x10c
            
            if (i_1 != 0x10c)
                goto label_d5008
            
            sub_cea80(r4)
            int32_t r6_4 = r4[1]
            sub_d56a0(r4, &var_48, 0, r6_4)
            int32_t r8_1 = 1
            int32_t* r5_6 = var_7c_1
            
            if (r4[4] == 0x2c)
                r8_1 = 1
                
                do
                    int32_t* r9_2 = sub_cea80(r4)
                    int32_t* r9_3
                    r4, r5_6, r9_3 = sub_c482c(r4[0xc], r9_2, r10.b)
                    sub_d56a0(r4, r9_3, 0, r6_4)
                    r8_1 += 1
                while (r4[4] == 0x2c)
            
            r11_1 = sub_c42e4(arg2, 3, r5_6, sub_d71e4(r4, 3, r8_1, &var_48))
            var_88 = 0
            sub_d6f04(r4, r8, r6_4, arg4, var_88)
            r6_5 = var_70
        label_d4f38:
            r0_92 = sub_d507c(r4, 0x106, 0x108, r6_5)
        label_d4f3c:
            sub_d541c(r0_92)
            goto label_d4f40
        
    label_d4ac8:
        r2_16, r4, r9_8, r11_1, pc_4 = sub_d6ecc(r4, 0x120)
    label_d4acc:
        int32_t r1_66 = *(arg4 + 0x18)
        int32_t* r0_142 = r4[0xd]
        var_88 = 0x7fff
        char const* const var_84_1 = "labels/gotos"
        r0_105 = sub_d1388(r0_142, r1_66, r2_16, 0x10, var_88)
        r1_48 = *(arg4 + 0x1c)
        *(arg4 + 0x18) = r0_105
    case 0x109
        sub_cea80(r4)
        sub_d6a80(r4, &var_48, arg4)
        int32_t r0_18
        
        while (true)
            r0_18 = r4[4]
            
            if (r0_18 != 0x2e)
                break
            
            sub_d680c(r4, &var_48)
        
        int32_t r2_4
        
        if (r0_18 != 0x3a)
            r2_4 = 0
        else
            sub_d680c(r4, &var_48)
            r2_4 = 1
        
        sub_d5e9c(r4, &var_60, r2_4, r8)
        sub_c4f28(r4[0xc], &var_48, &var_60)
        sub_c604c(r4[0xc], r8)
        goto label_d4f40
    case 0x10b
        r4[0xc]
        var_60 = 0xffffffff
        int32_t* r6_3 = sub_d51fc(r4, &var_60)
        int32_t r5_5 = 0x105
        int32_t r0_39
        
        while (true)
            r0_39 = r4[4]
            
            if (r0_39 != r5_5)
                break
            
            r5_5, r6_3 = sub_d51fc(r4, &var_60)
        
        if (r0_39 == 0x104)
            sub_cea80(r4)
            int32_t* r9_1 = r4[0xc]
            char var_3e_1 = 0
            var_40 = *(r9_1 + 0x2e)
            void* r1_25 = *(r9_1[3] + 0x40)
            int16_t var_44_1 = (*(r1_25 + 0x1c)).w
            char var_3f_1 = 0
            int16_t var_42_1 = (*(r1_25 + 0x10)).w
            var_48 = r9_1[4]
            r9_1[4] = &var_48
            int32_t i_2
            
            do
                i_2 = r4[4]
                
                if (i_2 - 0x104 u<= 0x1a && (0x4020007 & 1 << ((i_2 - 0x104) & 0xff)) != 0)
                    break
                
                sub_d4098(r4)
            while (i_2 != 0x112)
            sub_d541c(r9_1)
        
        int64_t* pc_2 = sub_d507c(r4, 0x106, 0x10b, r8)
        r11_1 = sub_c3f64(r6_3, var_60, r8, pc_2)
        goto label_d4f40
    case 0x10d
        sub_cea80(r4)
        int32_t r0_21 = r4[4]
        
        if (r0_21 == 0x109)
            sub_cea80(r4)
            
            if (r4[4] != 0x120)
                goto label_d4ac8
            
            int32_t* r6_1 = r4[0xc]
            void* r5_2 = r4[6]
            sub_cea80(r4)
            sub_d6678(r4, r5_2)
            int32_t* r0_26 = r4[0xc]
            void* r2_5 = r0_26[3]
            void* r1_12 = *r0_26
            char r5_4 = *(r0_26 + 0x2e) + 1
            int32_t r3_1 = r0_26[5]
            int32_t r7 = r0_26[0xa]
            *(r0_26 + 0x2e) = r5_4
            *(*(r1_12 + 0x18) + sx.d(*(**(r2_5 + 0x40) + ((r7 + zx.d(r5_4)) << 1) - 2)) * 0xc
                + 4) = r3_1
            sub_d5e9c(r4, &var_48, 0, r4[1])
            *(*(*r6_1 + 0x18) + sx.d(*(**(r6_1[3] + 0x40) + ((r6_1[0xa] + var_40.d) << 1))) * 0xc
                + 4) = r6_1[5]
            goto label_d4f40
        
        if (r0_21 != 0x120)
            goto label_d4ac8
        
        arg2 = 1
        arg4 = 1
        
        while (true)
            arg3 = r4[6]
            sub_cea80(r4)
            sub_d6678(r4, arg3)
            int32_t r0_138 = r4[4]
            
            if (r0_138 != 0x2c)
                int32_t r6_8
                
                if (r0_138 != 0x3d)
                    r6_8 = 0
                    var_48 = nullptr
                else
                    sub_cea80(r4)
                    sub_d56a0(r4, &var_48, 0, arg3)
                    r6_8 = 1
                    
                    if (r4[4] == 0x2c)
                        r6_8 = 1
                        
                        do
                            sub_cea80(r4)
                            r4, arg2 = sub_c482c(r4[0xc], &var_48, r10.b)
                            sub_d56a0(r4, &var_48, 0, r6_8)
                            r6_8 += 1
                        while (r4[4] == 0x2c)
                
                sub_d71e4(r4, arg2, r6_8, &var_48)
                int32_t* r1_93 = r4[0xc]
                char r2_32 = *(r1_93 + 0x2e)
                void* r3_17 = r1_93[3]
                void* r12_1 = *r1_93
                int32_t r0_200 = r1_93[5]
                int32_t lr_1 = r1_93[0xa]
                int32_t i_3 = 0xffffffff
                *(r1_93 + 0x2e) = r2_32 + arg2.b
                int32_t r1_94 = *(r12_1 + 0x18)
                int16_t* r2_36 = **(r3_17 + 0x40) + ((lr_1 + zx.d(r2_32 + arg4.b) - arg2) << 1)
                
                do
                    int32_t r6_11 = sx.d(*r2_36)
                    r2_36 = &r2_36[1]
                    i_3 += 1
                    *(r1_94 + r6_11 * 0xc + 4) = r0_200
                while (arg2 - 1 != i_3)
                
                break
            
            sub_cea80(r4)
            arg2 += 1
            arg4 += 1
            
            if (r4[4] != 0x120)
                goto label_d4ac8
        
        goto label_d4f40
    case 0x111
        void* r9_4 = r4[0xc]
        int32_t r0_79 = sub_c3e8c(r9_4)
        char var_56_2 = 1
        char r0_80 = *(r9_4 + 0x2e)
        char var_58_2 = r0_80
        int32_t r2_12 = *(r9_4 + 0x10)
        void* r1_39 = *(*(r9_4 + 0xc) + 0x40)
        int16_t r3_9 = *(r1_39 + 0x1c)
        int16_t var_5c_2 = r3_9
        int16_t r1_40 = *(r1_39 + 0x10)
        int16_t var_68_1 = r3_9
        int16_t var_66_1 = r1_40
        char var_63_1 = 0
        int32_t* var_6c = &var_60
        char var_57_2 = 0
        int16_t var_5a_2 = r1_40
        var_60 = r2_12
        *(r9_4 + 0x10) = &var_6c
        sub_cea80(r4)
        int32_t i_4
        
        do
            i_4 = r4[4]
            
            if (i_4 - 0x104 u<= 0x1a && (0x4020007 & 1 << ((i_4 - 0x104) & 0xff)) != 0)
                break
            
            sub_d4098(r4)
        while (i_4 != 0x112)
        sub_d507c(r4, 0x115, 0x111, r8)
        sub_d56a0(r4, &var_48, 0, 0x4020007)
        
        if (var_48 == 1)
            var_48 = 3
        
        int32_t* r9_5 = sub_c5104(r4[0xc], &var_48)
        
        if (zx.d(var_63_1) != 0)
            sub_c40e4(r9_5, var_34, zx.d(r0_80))
        
        r0_92 = sub_c3e9c(sub_d541c(r9_5), var_34, r0_79)
        goto label_d4f3c
    case 0x112
        sub_cea80(r4)
        int32_t r0_11 = r4[4]
        uint32_t r1_7 = 0
        int32_t* r5_1 = r4[0xc]
        int32_t r6
        
        if (r0_11 - 0x104 u> 0x1a || (0x4020007 & 1 << ((r0_11 - 0x104) & 0xff)) == 0)
            r6 = 0
            
            if (r0_11 != 0x3b)
                sub_d56a0(r4, &var_48, 0, 0)
                int32_t r7_5 = 1
                
                if (r4[4] == 0x2c)
                    r7_5 = 1
                    
                    do
                        sub_cea80(r4)
                        r4, r5_1 = sub_c482c(r4[0xc], &var_48, r10.b)
                        sub_d56a0(r4, &var_48, 0, &var_48)
                        r7_5 += 1
                    while (r4[4] == 0x2c)
                
                void** r1_80 = &var_48
                
                if ((var_48 & 0xfffffffe) == 0xc)
                    r6 = 0xffffffff
                    sub_c4608(r5_1, r1_80, 0xffffffff)
                    
                    if (r7_5 == 1 && var_48 == 0xc)
                        int32_t r1_81 = var_40.d
                        int32_t r0_176 = *(*r5_1 + 0xc)
                        *(r0_176 + (r1_81 << 2)) = (*(r0_176 + (r1_81 << 2)) & 0xffffffc0) | 0x1e
                    
                    r1_7 = zx.d(*(r5_1 + 0x2e))
                else if (r7_5 != 1)
                    r4, r5_1 = sub_c482c(r5_1, r1_80, r10.b)
                    r1_7 = zx.d(*(r5_1 + 0x2e))
                    r6 = r7_5
                else
                    uint32_t r0_212
                    r0_212, r4, r5_1 = sub_c4c4c(r5_1, r1_80)
                    r1_7 = r0_212
                    r6 = 1
        else
            r6 = 0
        
        sub_c3e78(r5_1, r1_7, r6)
        
        if (r4[4] != 0x3b)
            goto label_d4f40
        
        goto label_d421c
    case 0x116
        void* r6_6 = r4[0xc]
        sub_cea80(r4)
        int32_t r0_113 = sub_c3e8c(r6_6)
        sub_d56a0(r4, &var_48, 0, r6_6)
        int32_t* var_70_4 = r8
        
        if (var_48 == 1)
            var_48 = 3
        
        arg3 = sub_c5104(r4[0xc], &var_48)
        r8 = 1
        char var_56_3 = 1
        char var_58_3 = *(arg3 + 0x2e)
        void* r0_120 = *(arg3[3] + 0x40)
        int16_t var_5c_3 = (*(r0_120 + 0x1c)).w
        char var_57_3 = 0
        int16_t var_5a_3 = (*(r0_120 + 0x10)).w
        var_60 = arg3[4]
        arg3[4] = &var_60
        int32_t r0_122 = r4[4]
        cond:5 = r0_122 == 0x103
        
        if (r0_122 != 0x103)
            goto label_d4ffc
        
        sub_cea80(r4)
        int32_t* r7_3 = r4[0xc]
        char var_3e_3 = 0
        var_40 = *(r7_3 + 0x2e)
        void* r1_58 = *(r7_3[3] + 0x40)
        int16_t var_44_3 = (*(r1_58 + 0x1c)).w
        char var_3f_3 = 0
        int16_t var_42_3 = (*(r1_58 + 0x10)).w
        var_48 = r7_3[4]
        r7_3[4] = &var_48
        int32_t i_5
        
        do
            i_5 = r4[4]
            
            if (i_5 - 0x104 u<= 0x1a && (0x4020007 & 1 << ((i_5 - 0x104) & 0xff)) != 0)
                break
            
            sub_d4098(r4)
        while (i_5 != 0x112)
        sub_d541c(r7_3)
        int32_t r0_128
        r0_128, r4 = sub_c3d14(arg3)
        sub_c3e9c(arg3, r0_128, r0_113)
        sub_d507c(r4, 0x106, 0x116, var_70_4)
        r11_1 = sub_c3f64(arg3, var_34, 1, sub_d541c(arg3))
        goto label_d4f40
    case 0x11d
        sub_cea80(r4)
        
        if (r4[4] != 0x120)
            goto label_d4ac8
        
        arg3 = r4[6]
        sub_cea80(r4)
        int32_t* r0_96 = r4[0xc]
        arg4 = r4[0x10]
        var_70 = r0_96
        int32_t r5_8 = sx.d(*(r0_96[4] + 4))
        
        if (*(arg4 + 0x1c) s> r5_8)
            while (true)
                uint32_t r0_100 = sub_d7cc4(arg3, *(*(arg4 + 0x18) + (r5_8 << 4)))
                cond:5 = r0_100 == 0
                
                if (r0_100 != 0)
                    r4 = var_70
                    *(*(arg4 + 0x18) + (r5_8 << 4) + 8)
                    int32_t r0_215 = sub_d2f3c(*(r4[3] + 0x34), 
                        "label '%s' already defined on line %d", &arg3[4])
                    sub_d6de0(r4[3], r0_215)
                    break
                
                r5_8 += 1
                
                if (r5_8 s>= *(arg4 + 0x1c))
                    goto label_d47e4
            
            goto label_d4fe4
        
    label_d47e4:
        int32_t r0_102 = r4[4]
        cond:5 = r0_102 == 0x11d
        
        if (r0_102 != 0x11d)
            goto label_d4ff0
        
        pc_4 = sub_cea80(r4)
        r2_16 = arg4 + 0x20
        r9_8 = *(r2_16 - 4)
        arg2 = var_70[5]
        
        if (r9_8 s>= *r2_16)
            goto label_d4acc
        
        r0_105 = *(arg4 + 0x18)
        r1_48 = r9_8

int32_t** r0_143 = r0_105 + (r9_8 << 4)
*r0_143 = arg3
r0_143[2] = r8
char r2_23 = *(r4[0xc] + 0x2e)
r0_143[1] = arg2
r0_143[3].b = r2_23
*(arg4 + 0x1c) = r1_48 + 1
int32_t r0_149

while (true)
    int32_t r0_146 = r4[4]
    
    if (r0_146 s> 0x11c)
        if (r0_146 != 0x11d)
            if (r0_146 != 0x11e)
                r0_149 = *(arg4 + 0x18)
                break
            
        label_d4b6c:
            r0_149 = *(arg4 + 0x18)
            *(r0_149 + (r9_8 << 4) + 0xc) = *(var_70[4] + 8)
            break
    else if (r0_146 != 0x3b)
        if (r0_146 - 0x104 u< 3)
            goto label_d4b6c
        
        r0_149 = *(arg4 + 0x18)
        break
    
    sub_d4098(r4)

void* r7_4 = r4[0x10]
int32_t i_6 = sx.d(*(*(r4[0xc] + 0x10) + 6))

if (*(r7_4 + 0x10) s> i_6)
    int32_t* r6_7 = r0_149 + (r9_8 << 4)
    
    do
        if (sub_d7cc4(*(*(r7_4 + 0xc) + (i_6 << 4)), *r6_7) == 0)
            i_6 += 1
        else
            sub_d6d14(r4, i_6, r6_7, pc_4)
    while (i_6 s< *(r7_4 + 0x10))

goto label_d4f40
