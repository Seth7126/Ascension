// 函数: coshl
// 地址: 0x1a59d0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t r4 = arg2 & 0x7fffffff
int128_t q0
q0.q = arg2:arg1

if (r4 u>= 0x7ff00000)
    q0.q = q0.q f* q0.q
else if (r4 u<= 0x3fd62e42)
    q0.q = fabs(q0.q)
    int32_t r0
    int32_t r1
    r1:r0 = q0.q
    int32_t r0_1
    int32_t r1_1
    r0_1, r1_1, q0 = expm1l(r0, r1)
    q0:8.q = 0x3f80000000000000
    double q1_1 = r1_1:r0_1
    q0.q = q1_1 + 0.0078125
    
    if (r4 u>= 0x3c800000)
        q0.q = q0.q f+ q0.q
        q0.q = q1_1 * q1_1 f/ q0.q
        q0.q = q0.q f+ q0:8.q
else if (r4 u<= 0x4035ffff)
    q0.q = fabs(q0.q)
    int32_t r0_2
    int32_t r1_2
    r1_2:r0_2 = q0.q
    int32_t r0_3
    int32_t r1_3
    r0_3, r1_3, q0 = expl(r0_2, r1_2)
    q0:8.q = 0x3f00000000000000
    q0.q = 3.0517578125e-05 f/ r1_3:r0_3
    unimplemented  {vmla.f64.F64 d0, d2, d1}
else if (r4 u> 0x40862e41)
    if (r4 u<= 0x408633ce)
        q0.q = fabs(q0.q)
        int32_t r0_6
        int32_t r1_6
        r1_6:r0_6 = q0.q
        return sub_1a6394(r0_6, r1_6, 0xffffffff) __tailcall
    
    q0.q = 0
else
    q0.q = fabs(q0.q)
    int32_t r0_4
    int32_t r1_4
    r1_4:r0_4 = q0.q
    int32_t r0_5
    int32_t r1_5
    r0_5, r1_5, q0 = expl(r0_4, r1_4)
    q0.q = 0x3f00000000000000
    q0:8.q = r1_5:r0_5
    q0.q = q0:8.q f* 3.0517578125e-05

int32_t result
int32_t r1_8
r1_8:result = q0.q
return result
