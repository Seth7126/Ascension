// 函数: sub_c593c
// 地址: 0xc593c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (*arg3 == 5 && arg3[4] == 0xffffffff && arg3[5] == 0xffffffff && *arg4 == 5
        && arg4[4] == 0xffffffff && arg4[5] == 0xffffffff)
    *(arg4 + 8)
    
    if ((arg2 | 1) != 0x11)
        unimplemented  {vmov r2, r3, d1}
        int32_t __saved_r11
        int32_t r0_17
        int64_t q0_1
        r0_17, q0_1 = sub_d2860(arg2 - 0xd, &__saved_r11, *(arg3 + 8))
        unimplemented  {vmov d0, r0, r1}
        *(arg3 + 8) = q0_1
        return r0_17
    
    unimplemented  {vcmpeq.f64 d0, #0.000000}
    unimplemented  {vmrseq apsr_nzcv, fpscr}

uint32_t r6 = 0

if (arg2 != 0x13 && arg2 != 0x15)
    r6 = sub_c4d64(arg1, arg4)

int32_t r1_5

if (sub_c4d64(arg1, arg3) s<= r6)
    if (*arg4 == 6)
        int32_t r1_7 = arg4[2]
        
        if ((r1_7 & 0x100) == 0 && r1_7 s>= zx.d(*(arg1 + 0x2e)))
            arg1[0xc].b -= 1
    
    if (*arg3 == 6)
        r1_5 = arg3[2]
        
        if ((r1_5 & 0x100) == 0)
        label_c5a04:
            
            if (r1_5 s>= zx.d(*(arg1 + 0x2e)))
                arg1[0xc].b -= 1
else
    if (*arg3 == 6)
        int32_t r1_3 = arg3[2]
        
        if ((r1_3 & 0x100) == 0 && r1_3 s>= zx.d(*(arg1 + 0x2e)))
            arg1[0xc].b -= 1
    
    if (*arg4 == 6)
        r1_5 = arg4[2]
        
        if ((r1_5 & 0x100) == 0)
            goto label_c5a04
int32_t r0_7
int32_t r9_1
r0_7, r9_1 = sub_c4198(arg1)
arg3[2] = r0_7
*arg3 = 0xb
int32_t r0_10 = *(*arg1 + 0x14) + (arg1[5] << 2)
*(r0_10 - 4) = r9_1
return r0_10
