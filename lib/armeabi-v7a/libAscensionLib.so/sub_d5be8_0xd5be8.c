// 函数: sub_d5be8
// 地址: 0xd5be8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r6 = arg1
int32_t r0 = *__stack_chk_guard
int32_t* r4 = r6[0xc]
int32_t r8 = r6[1]
int32_t var_58 = 0
int32_t r0_2
int32_t r9_1
r0_2, r9_1 = sub_c3d00(r4, 0xb, 0, 0, var_58)
uint32_t var_34 = 0
int32_t var_2c = 0
uint32_t var_30 = 0
arg2[4] = 0xffffffff
arg2[5] = 0xffffffff
*arg2 = r9_1
arg2[2] = r0_2
int32_t var_3c = 0xffffffff
int32_t var_40 = 0xffffffff
int32_t var_50 = 0
int32_t var_48 = 0
int32_t* r4_1 = sub_c482c(r6[0xc], arg2, r0_2.b)
int32_t r0_4 = r6[4]
bool cond:0 = r0_4 == 0x7b

if (r0_4 == 0x7b)
    sub_cea80(r6)
    
    if (r6[4] == 0x7d)
    label_d5d8c:
        sub_d507c(r6, 0x7d, 0x7b, r8)
        int32_t r3_1 = var_2c
        
        if (r3_1 != 0)
            int32_t r0_24 = var_50
            
            if (r0_24 - 0xc u>= 2)
                if (r0_24 != 0)
                    r4_1 = sub_c482c(r4_1, &var_50, r0_2.b)
                    r3_1 = var_2c
                
                sub_c6064(r4_1, arg2[2], var_30, r3_1)
            else
                sub_c4608(r4_1, &var_50, 0xffffffff)
                sub_c6064(r4_1, arg2[2], var_30, 0xffffffff)
                var_30 -= 1
        
        int32_t r5_5 = (*(*(*r4_1 + 0xc) + (r0_2 << 2)) & 0x7fffff) | sub_d27c0(var_30) << 0x17
        *(*(*r4_1 + 0xc) + (r0_2 << 2)) = r5_5
        *(*(*r4_1 + 0xc) + (r0_2 << 2)) = (r5_5 & 0xff803fff) | (sub_d27c0(var_34) & 0x1ff) << 0xe
        int32_t r0_38 = *__stack_chk_guard
        
        if (r0_38 == r0)
            return r0_38 - r0
        
        __stack_chk_fail()
        noreturn
    
    while (true)
        int32_t r0_12 = r6[4]
        int32_t r0_14
        
        if (r0_12 != 0x5b && r0_12 == 0x120)
            r0_14 = sub_d0328(r6)
        
        if (r0_12 != 0x5b && (r0_12 != 0x120 || r0_14 != 0x3d))
            sub_d56a0(r6, &var_50, 0, r6)
            cond:0 = var_30 == 0x7ffffffe
            
            if (var_30 s>= 0x7ffffffe)
                r6 = sub_d4018(r6[0xc], 0x7ffffffd, "items in a constructor")
                break
            
            var_30 += 1
            var_2c += 1
        else
            sub_d64fc(r6, &var_50)
        
        int32_t r0_20 = r6[4]
        
        if (r0_20 != 0x3b && r0_20 != 0x2c)
            goto label_d5d8c
        
        sub_cea80(r6)
        
        if (r6[4] == 0x7d)
            goto label_d5d8c
        
        if (var_50 != 0)
            int32_t r5_2
            r4_1, r5_2 = sub_c482c(r4_1, &var_50, r0_2.b)
            var_50 = r5_2
            
            if (var_2c == 0x32)
                sub_c6064(r4_1, arg2[2], var_30, 0x32)
                var_2c = r5_2

int32_t* r0_42
int32_t* r1_17
int32_t r2_4
int32_t r3_2
int32_t r4_2
int32_t r12
int32_t lr
r0_42, r1_17, r2_4, r3_2, r4_2, r12, lr = sub_d6ecc(r6, 0x7b)

if (cond:0)
    void* r0_43 = r0_42 - r12
    *r0_43
    r0_42 = r0_43 - r4_2

return sub_d5e9c(r0_42, r1_17, r2_4, r3_2) __tailcall
