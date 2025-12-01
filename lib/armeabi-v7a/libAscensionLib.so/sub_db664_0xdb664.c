// 函数: sub_db664
// 地址: 0xdb664
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r4
int32_t var_10 = r4
unimplemented  {vpush {d8}}

if (arg2 - 1 u>= *(arg1 + 0x1c))
    double q0
    q0.d = arg2
    unimplemented  {vcvt.f64.s32 d8, s0}
    unimplemented  {vmov.f64 d0, #1.000000e+00}
    double var_18 = arg4 + q0
    int32_t r1_2 = var_18:4.d + var_18.d
    int32_t r0_3
    
    if (r1_2 s<= 0xffffffff)
        r0_3 = r1_2 * 2
        
        if (r1_2 != neg.d(r1_2))
            r0_3 = 0 - r1_2
    else
        r0_3 = r1_2
    
    int32_t r1_6 = __aeabi_idivmod(r0_3, (1 | 0xffffffff << zx.d(*(arg1 + 7))) ^ 0xfffffffe, 
        0xfffffffe, 1, var_18)
    void* i = *(arg1 + 0x10) + (r1_6 << 5)
    
    do
        int32_t r2_1 = *(i + 0x18)
        
        if (r2_1 == 3)
            *(i + 0x10)
            unimplemented  {vcmp.f64 d0, d8}
            unimplemented  {vmrs apsr_nzcv, fpscr}
            
            if (r2_1 == 3)
                break
        
        i = *(i + 0x1c)
    while (i != 0)
else
    *(arg1 + 0xc)

unimplemented  {vpop {d8}}
jump(arg3)
