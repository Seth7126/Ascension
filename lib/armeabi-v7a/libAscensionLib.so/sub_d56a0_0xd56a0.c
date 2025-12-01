// 函数: sub_d56a0
// 地址: 0xd56a0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t var_1c = arg4
int32_t* r4 = arg1
int32_t* r10 = arg2
int32_t r0 = *__stack_chk_guard
void* r0_1 = r4[0xd]
int16_t r1_1 = *(r0_1 + 0x26) + 1
*(r0_1 + 0x26) = r1_1
uint32_t r0_2 = zx.d(r1_1)
bool cond:0 = r0_2 == 0xc9
int64_t* pc

if (r0_2 u>= 0xc9)
    r4, arg4, pc = sub_d4018(r4[0xc], 0xc8, "C levels")
else
    int32_t r0_3 = r4[4]
    int32_t r5_1
    
    if (r0_3 s<= 0x106)
        if (r0_3 != 0x23)
            if (r0_3 == 0x2d)
                r5_1 = 0
                goto label_d58b4
            
            if (r0_3 != 0x7b)
                goto label_d58ec
            
            sub_d5be8(r4, r10)
            goto label_d58f0
        
        r5_1 = 2
    label_d58b4:
        int32_t r6 = r4[1]
        int16_t* pc_1 = sub_cea80(r4)
        sub_d56a0(r4, r10, 8)
        r10 = sub_c55a4(r4[0xc], r5_1, r10, r6, r4, pc_1)
    label_d58f0:
        int32_t r2_1 = r4[4]
        int32_t result = 0xf
        int32_t result_1
        
        if (r2_1 - 0x25 u<= 0x39)
            result_1 = 0
            
            switch (r2_1)
                case 0x25
                    result_1 = 4
                label_d5b0c:
                    
                    while (true)
                        if (zx.d(*(&data_1d1520 + (result_1 << 1))) s<= arg3)
                            result = result_1
                            break
                        
                        r4[1]
                        int64_t* pc_2 = sub_cea80(r4)
                        int32_t* r5_2
                        int32_t r9_2
                        r4, r5_2, r9_2 = sub_c5ae0(r4[0xc], result_1, r10, r10.w, pc_2)
                        int32_t result_2 = sub_d56a0(r4, r5_2, zx.d(*((result_1 << 1) + 0x1d1521)))
                        sub_c5c20(r4[0xc], result_1, r10, r5_2, r9_2, arg3)
                        result_1 = result_2
                        
                        if (result_2 == 0xf)
                            result = 0xf
                            break
                case 0x2a
                    result_1 = 2
                    goto label_d5b0c
                case 0x2b
                    goto label_d5b0c
                case 0x2d
                    result_1 = 1
                    goto label_d5b0c
                case 0x2f
                    result_1 = 3
                    goto label_d5b0c
                case 0x3c
                    result_1 = 8
                    goto label_d5b0c
                case 0x3e
                    result_1 = 0xb
                    goto label_d5b0c
                case 0x5e
                    result_1 = 5
                    goto label_d5b0c
        else if (r2_1 - 0x101 u<= 0x1b)
            switch (r2_1)
                case 0x101
                    result_1 = 0xd
                    goto label_d5b0c
                case 0x110
                    result_1 = 0xe
                    goto label_d5b0c
                case 0x117
                    result_1 = 6
                    goto label_d5b0c
                case 0x119
                    result_1 = 7
                    goto label_d5b0c
                case 0x11a
                    result_1 = 0xc
                    goto label_d5b0c
                case 0x11b
                    result_1 = 9
                    goto label_d5b0c
                case 0x11c
                    result_1 = 0xa
                    goto label_d5b0c
        void* r2_7 = r4[0xd]
        *(r2_7 + 0x26) -= 1
        
        if (*__stack_chk_guard == r0)
            return result
        
        __stack_chk_fail()
        noreturn
    
    if (r0_3 - 0x107 u> 0x1a)
    label_d58ec:
        sub_d62fc(r4, r10)
        goto label_d58f0
    
    r5_1 = 1
    int32_t r0_6
    int32_t r0_10
    int32_t r1_5
    
    switch (r0_3)
        case 0x107
            r10[4] = 0xffffffff
            r10[5] = 0xffffffff
            r0_6 = 3
        label_d5828:
            *r10 = r0_6
            r10[2] = 0
            goto label_d589c
        case 0x108, 0x10a, 0x10b, 0x10c, 0x10d, 0x110, 0x111, 0x112, 0x113, 0x115, 0x116, 0x117, 
                0x119, 0x11a, 0x11b, 0x11c, 0x11d, 0x11e, 0x120
            goto label_d58ec
        case 0x109
            sub_cea80(r4)
            sub_d5e9c(r4, r10, 0, r4[1])
            goto label_d58f0
        case 0x10e
            r10[4] = 0xffffffff
            r10[5] = 0xffffffff
            r0_6 = 1
            goto label_d5828
        case 0x10f
            goto label_d58b4
        case 0x114
            r10[4] = 0xffffffff
            r10[5] = 0xffffffff
            r0_6 = 2
            goto label_d5828
        case 0x118
            int32_t* r0_12 = r4[0xc]
            uint32_t r1_7 = zx.d(*(*r0_12 + 0x4d))
            cond:0 = r1_7 == 0
            
            if (r1_7 != 0)
                r0_10 = sub_c3d00(r0_12, 0x26, 0, 1, 0)
                r10[4] = 0xffffffff
                r10[5] = 0xffffffff
                r1_5 = 0xd
                goto label_d5890
        case 0x11f
            r10[4] = 0xffffffff
            r10[5] = 0xffffffff
            *r10 = 5
            r10[2] = 0
            *(r10 + 8) = *(r4 + 0x18)
        label_d589c:
            sub_cea80(r4)
            goto label_d58f0
        case 0x121
            r0_10 = sub_c4370(r4[0xc], r4[6])
            r10[4] = 0xffffffff
            r10[5] = 0xffffffff
            r1_5 = 4
        label_d5890:
            *r10 = r1_5
            r10[2] = r0_10
            goto label_d589c

int32_t* r0_26
int32_t* r1_21
int32_t r12
int32_t lr
r0_26, r1_21, r12, lr = sub_ce78c(r4, "cannot use '...' outside a vararg function", pc)

if (cond:0)
    void* r8_1 = r0_26 & r12 s>> 0x16
    
    if (r8_1 == 0)
        void* r8_2 = r0_26 & r8_1 << 0xd
        
        if (r8_2 == 0)
            r0_26 = r8_2 * arg4

return sub_d5be8(r0_26, r1_21) __tailcall
