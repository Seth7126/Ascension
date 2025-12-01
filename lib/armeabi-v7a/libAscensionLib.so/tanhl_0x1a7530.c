// 函数: tanhl
// 地址: 0x1a7530
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int64_t q4
int64_t var_18 = q4
int128_t q0
q0.q = arg2:arg1
int32_t r0 = arg2 & 0x7fffffff

if (r0 u>= 0x7ff00000)
    q0:8.q = 0x3f80000000000000
    q0.q = 0.0078125 f/ q0.q
    
    if (arg2 s< 0)
        q0:8.q = -0x4080000000000000
    
    q0.q = q0.q f+ q0:8.q
else if (r0 u> 0x4035ffff)
    q0.q = 0x3f80000000000000
    q0:8.q = 0xc2f8f359
    q0:8.q = 0.0078125 - 1.6161357275175407e-314
label_1a75e6:
    q0.q = fneg(q0:8.q)
    
    if (arg2 s> 0xffffffff)
        q0.q = q0:8.q
else
    q0:8.q = 0x8800759c
    q0:8.q = q0.q f+ 1.1273251392787659e-314
    unimplemented  {vcmpe.f64.F64 d1, d8}
    unimplemented  {vmrs apsr_nzcv, fpscr}
    
    if (r0 s<= 0x4035ffff || r0 u>= 0x3e300000)
        q0.q = fabs(q0.q)
        
        if (r0 u< 0x3ff00000)
            q0:8.q = -0x4000000000000000
            q0.q = q0.q f* -2.0
            int32_t r0_3
            int32_t r1_2
            r1_2:r0_3 = q0.q
            int32_t r0_4
            int32_t r1_3
            r0_4, r1_3, q0 = expm1l(r0_3, r1_2)
            q0.q = 0x4000000000000000
            q0:8.q = r1_3:r0_4
            q0.q = q0:8.q f+ 2.0
            q0:8.q = (r1_3 ^ 0x80000000):r0_4
            q0:8.q = q0:8.q f/ q0.q
        else
            q0.q = q0.q f+ q0.q
            int32_t r0_1
            int32_t r1
            r1:r0_1 = q0.q
            int32_t r0_2
            int32_t r1_1
            r0_2, r1_1, q0 = expm1l(r0_1, r1)
            q0.q = 0x4000000000000000
            q0:8.q = r1_1:r0_2
            q0:8.q = q0:8.q f+ 2.0
            q0.q = 2.0 f/ q0:8.q
            q0:8.q = 0.0078125 f- q0.q
        
        goto label_1a75e6

int32_t result
int32_t r1_5
r1_5:result = q0.q
return result
