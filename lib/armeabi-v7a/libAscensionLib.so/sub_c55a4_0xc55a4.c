// 函数: sub_c55a4
// 地址: 0xc55a4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t var_24 = arg5
int32_t r0 = *__stack_chk_guard
int32_t var_34 = 0
int32_t var_38 = 0
int32_t var_30 = 0xffffffff
int32_t var_2c = 0xffffffff
int32_t var_40 = 5

if (arg2 == 2)
    sub_c593c(sub_c4c4c(arg1, arg3), 0x15, arg3, &var_40, arg4)
else if (arg2 == 1)
    int32_t* r9_2 = sub_c471c(arg1, arg3)
    
    switch (*arg3 - 1)
        case 0, 2
            *arg3 = 2
        case 1, 3, 4
            *arg3 = 3
        case 5
        label_c5778:
            int32_t r0_20 = arg3[2]
            
            if ((r0_20 & 0x100) == 0 && r0_20 s>= zx.d(*(r9_2 + 0x2e)))
                r9_2[0xc].b -= 1
            
            goto label_c5798
        case 9
            int32_t r1_4 = arg3[2]
            int32_t* r0_14 = *(*r9_2 + 0xc) + (r1_4 << 2)
            int32_t* r1_6
            int32_t r2_1
            
            if (r1_4 s>= 1)
                r1_6 = r0_14 - 4
                r2_1 = *r1_6
            
            if (r1_4 s< 1 || sx.d((*"`qATPP\l<")[r2_1 & 0x3f]) s>= 0)
                r2_1 = *r0_14
                r1_6 = r0_14
            
            int32_t temp0_1 = 0
            uint32_t i = r2_1 & 0x3fc0
            
            while (i != 0)
                i u>>= 1
                temp0_1 += 1
            
            *r1_6 = (r2_1 & 0xffffc03f) | (0x20 - temp0_1) u>> 5 << 6
        case 0xa
            void* r1_7 = *r9_2
            uint32_t r2_5 = zx.d(r9_2[0xc].b)
            
            if (r2_5 u>= zx.d(*(r1_7 + 0x4e)))
                if (r2_5 u>= 0xf9)
                    int32_t* r0_46
                    int32_t r1_12
                    int32_t* r2_10
                    int32_t* r3_6
                    int32_t r12
                    r0_46, r1_12, r2_10, r3_6, r12 =
                        sub_ce78c(r9_2[3], "function or expression too complex", arg6)
                    
                    if (r2_5 == 0xf9 && (r1_12 & arg5 s>> 0x18) == 0
                            && (r0_46 & ror.d(arg5, 0x1b)) == 0 && (r0_46 & ror.d(r12, 0x19)) == 0
                            && (r0_46 & r12 s>> (r12 & 0xff)) == 0)
                        *arg6 = arg3.w
                    
                    int32_t var_48
                    return sub_c593c(r0_46, r1_12, r2_10, r3_6, var_48) __tailcall
                
                *(r1_7 + 0x4e) = r2_5.b + 1
            
            r9_2[0xc].b = r2_5.b + 1
            sub_c6170(r9_2, arg3, 0xffffffff + zx.d(r2_5.b + 1))
            
            if (*arg3 == 6)
                goto label_c5778
            
        label_c5798:
            arg3[2]
            int32_t r0_25
            r0_25, r9_2 = sub_c4198(r9_2)
            arg3[2] = r0_25
            *arg3 = 0xb
    
    int32_t i_4 = arg3[4]
    int32_t i_3 = arg3[5]
    *(arg3 + 0x10) = i_4:i_3
    
    if (i_4 != 0xffffffff)
        int32_t r2_8 = *(*r9_2 + 0xc)
        int32_t i_1
        
        do
            int32_t* r4 = r2_8 + (i_4 << 2)
            int32_t* r5_2
            int32_t r7_2
            
            if (i_4 s>= 1)
                r5_2 = r4 - 4
                r7_2 = *r5_2
            
            if (i_4 s< 1 || sx.d((*"`qATPP\l<")[r7_2 & 0x3f]) s>= 0)
                r7_2 = *r4
                r5_2 = r4
            
            if ((r7_2 & 0x3f) == 0x1c)
                *r5_2 = (r7_2 & 0x7fc000) | (0x7fc0 & r7_2 u>> 0x11) | 0x1b
            
            i_1 = 0xfffe0001 + (*r4 u>> 0xe)
            
            if (i_1 != 0xffffffff)
                i_1 = i_4 + i_1 + 1
            
            i_4 = i_1
        while (i_1 != 0xffffffff)
        i_3 = arg3[4]
    
    if (i_3 != 0xffffffff)
        int32_t r3_5 = *(*r9_2 + 0xc)
        int32_t i_2
        
        do
            int32_t* r5_3 = r3_5 + (i_3 << 2)
            int32_t* r4_2
            int32_t r7_4
            
            if (i_3 s>= 1)
                r4_2 = r5_3 - 4
                r7_4 = *r4_2
            
            if (i_3 s< 1 || sx.d((*"`qATPP\l<")[r7_4 & 0x3f]) s>= 0)
                r7_4 = *r5_3
                r4_2 = r5_3
            
            if ((r7_4 & 0x3f) == 0x1c)
                *r4_2 = (r7_4 & 0x7fc000) | (0x7fc0 & r7_4 u>> 0x11) | 0x1b
            
            i_2 = 0xfffe0001 + (*r5_3 u>> 0xe)
            
            if (i_2 != 0xffffffff)
                i_2 = i_3 + i_2 + 1
            
            i_3 = i_2
        while (i_2 != 0xffffffff)
else if (arg2 == 0)
    if (*arg3 != 5 || arg3[4] != 0xffffffff || arg3[5] != 0xffffffff)
        sub_c593c(sub_c4c4c(arg1, arg3), 0x13, arg3, &var_40, arg4)
    else
        unimplemented  {vneg.f64 d0, d0}
        *(arg3 + 8) = *(arg3 + 8)

int32_t r0_43 = *__stack_chk_guard

if (r0_43 == r0)
    return r0_43 - r0

__stack_chk_fail()
noreturn
