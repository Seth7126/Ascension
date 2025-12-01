// 函数: sinhl
// 地址: 0x1a6140
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int64_t var_18 = arg3.q
int64_t var_20 = arg3:8.q
int32_t r4 = arg2 & 0x7fffffff
int128_t q0
q0.q = arg2:arg1

if (r4 u< 0x7ff00000)
    q0:8.q = -0x4100000000000000
    arg3.q = 0x3f00000000000000
    
    if (arg2 s< 0)
        arg3.q = -0x4100000000000000
    
    if (r4 u<= 0x4035ffff)
        q0:8.q = 0x7b1f3cac
        arg3:8.q = 0x3f80000000000000
        q0:8.q = q0.q f+ 1.0205640906890983e-314
        unimplemented  {vcmpe.f64.F64 d1, d9}
        unimplemented  {vmrs apsr_nzcv, fpscr}
        
        if (r4 s<= 0x4035ffff || r4 u>= 0x3e300000)
            q0.q = fabs(q0.q)
            int32_t r0
            int32_t r1
            r1:r0 = q0.q
            int32_t r0_1
            int32_t r1_1
            r0_1, r1_1, q0 = expm1l(r0, r1)
            q0.q = r1_1:r0_1
            
            if (r4 u>= 0x3ff00000)
                q0:8.q = q0.q f+ 0.0078125
                q0:8.q = q0.q f/ q0:8.q
                q0.q = q0.q f+ q0:8.q
            else
                q0:8.q = q0.q f* q0.q
                q0:8.q = q0:8.q f/ (q0.q f+ 0.0078125)
                q0.q = q0.q f+ q0.q
                q0.q = q0.q f- q0:8.q
            
            q0.q = arg3.q f* q0.q
    else if (r4 u> 0x40862e41)
        if (r4 u> 0x408633ce)
            q0:8.q = 0x7b1f3cac
        else
            q0.q = fabs(q0.q)
            int32_t r0_4
            int32_t r1_4
            r1_4:r0_4 = q0.q
            int32_t r0_5
            int32_t r1_5
            r0_5, r1_5, q0 = sub_1a6394(r0_4, r1_4, 0xffffffff)
            q0.q = arg3.q f+ arg3.q
            q0:8.q = r1_5:r0_5
        
        q0.q = q0.q f* q0:8.q
    else
        q0.q = fabs(q0.q)
        int32_t r0_2
        int32_t r1_2
        r1_2:r0_2 = q0.q
        int32_t r0_3
        int32_t r1_3
        r0_3, r1_3, q0 = expl(r0_2, r1_2)
        q0.q = r1_3:r0_3
        q0.q = arg3.q f* q0.q
else
    q0.q = q0.q f+ q0.q

int32_t result
int32_t r1_6
r1_6:result = q0.q
arg3.q = var_20
arg3:8.q = var_18
return result
