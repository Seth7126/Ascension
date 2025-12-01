// 函数: sub_ded90
// 地址: 0xded90
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = arg2[1].d

if (r0 == 3)
    int32_t r0_1 = arg3[1].d
    
    if (r0_1 == 3)
        int128_t q0
        q0:8.q = *arg2
        q0.q = *arg3
        unimplemented  {vcmpe.f64 d1, d0}
        unimplemented  {vmrs apsr_nzcv, fpscr}
        
        if (r0_1 u<= 3)
            return 1
        
        return 0
else if ((r0 & 0xf) == 4 && (arg3[1].d & 0xf) == 4)
    void* r7 = *arg3
    void* r6_1 = *arg2
    char* __s2 = r7 + 0x10
    char* r4_1 = r6_1 + 0x10
    int32_t i = strcoll(r4_1, __s2)
    
    if (i == 0)
        int32_t r6_2 = *(r6_1 + 0xc)
        int32_t r7_5 = *(r7 + 0xc)
        
        do
            uint32_t r0_37 = strlen(r4_1)
            
            if (r0_37 == r7_5)
                i = r0_37 - r6_2
                
                if (r0_37 != r6_2)
                    i = 1
                
                break
            
            if (r0_37 == r6_2)
                i = 0xffffffff
                break
            
            r4_1 = &r4_1[r0_37 + 1]
            __s2 = &__s2[r0_37 + 1]
            i = strcoll(r4_1, __s2)
            r7_5 -= r0_37 + 1
            r6_2 -= r0_37 + 1
        while (i == 0)
    
    if (i s< 1)
        return 1
    
    return 0

int32_t r8 = arg1[2]
int32_t* r0_9 = sub_dc704(arg1, arg2, 0xe)

if (r0_9[2] != 0)
label_dee6c:
    int32_t* r1_5 = arg1[2]
    int32_t r7_1 = arg1[7]
    arg1[2] = &r1_5[4]
    int32_t r3 = r0_9[1]
    *r1_5 = *r0_9
    r1_5[1] = r3
    r1_5[2] = r0_9[2]
    int32_t* r0_12 = arg1[2]
    arg1[2] = &r0_12[4]
    int32_t r2_2 = *(arg2 + 4)
    *r0_12 = *arg2
    r0_12[1] = r2_2
    r0_12[2] = arg2[1].d
    int32_t* r0_13 = arg1[2]
    arg1[2] = &r0_13[4]
    int32_t r2_3 = *(arg3 + 4)
    *r0_13 = *arg3
    r0_13[1] = r2_3
    r0_13[2] = arg3[1].d
    sub_c9774(arg1, arg1[2] - 0x30, 1, zx.d(*(arg1[4] + 0x12)) & 1, r8)
    int32_t r0_16 = arg1[2]
    void* r1_14 = arg1[7]
    arg1[2] = r0_16 - 0x10
    int32_t r3_2 = *(r0_16 - 0xc)
    int32_t* r1_15 = r1_14 + r8 - r7_1
    *r1_15 = *(r0_16 - 0x10)
    r1_15[1] = r3_2
    r1_15[2] = *(r0_16 - 8)
    int32_t* r0_18 = arg1[2]
    int32_t r1_16 = r0_18[2]
    
    if (r1_16 != 0)
        if (r1_16 != 1)
            return 1
        
        int32_t result = *r0_18
        
        if (result != 0)
            return 1
        
        return result
else
    r0_9 = sub_dc704(arg1, arg3, 0xe)
    
    if (r0_9[2] != 0)
        goto label_dee6c
    
    int32_t r8_1 = arg1[2]
    int32_t* r0_22 = sub_dc704(arg1, arg3, 0xd)
    
    if (r0_22[2] == 0)
        r0_22 = sub_dc704(arg1, arg2, 0xd)
        
        if (r0_22[2] == 0)
            sub_c8aa4(arg1, arg2, arg3)
            noreturn
    
    int32_t* r1_21 = arg1[2]
    int32_t r7_3 = arg1[7]
    arg1[2] = &r1_21[4]
    int32_t r3_3 = r0_22[1]
    *r1_21 = *r0_22
    r1_21[1] = r3_3
    r1_21[2] = r0_22[2]
    int32_t* r0_25 = arg1[2]
    arg1[2] = &r0_25[4]
    int32_t r2_9 = *(arg3 + 4)
    *r0_25 = *arg3
    r0_25[1] = r2_9
    r0_25[2] = arg3[1].d
    int32_t* r0_26 = arg1[2]
    arg1[2] = &r0_26[4]
    int32_t r2_10 = *(arg2 + 4)
    *r0_26 = *arg2
    r0_26[1] = r2_10
    r0_26[2] = arg2[1].d
    sub_c9774(arg1, arg1[2] - 0x30, 1, zx.d(*(arg1[4] + 0x12)) & 1, r8_1)
    int32_t r0_29 = arg1[2]
    void* r1_30 = arg1[7]
    arg1[2] = r0_29 - 0x10
    int32_t r3_5 = *(r0_29 - 0xc)
    int32_t* r1_31 = r1_30 + r8_1 - r7_3
    *r1_31 = *(r0_29 - 0x10)
    r1_31[1] = r3_5
    r1_31[2] = *(r0_29 - 8)
    int32_t* r0_31 = arg1[2]
    int32_t r1_32 = r0_31[2]
    
    if (r1_32 == 0)
        return 1
    
    if (r1_32 == 1)
        int32_t temp0_12 = 0
        uint32_t i_1 = *r0_31
        
        while (i_1 != 0)
            i_1 u>>= 1
            temp0_12 += 1
        
        return (0x20 - temp0_12) u>> 5

return 0
