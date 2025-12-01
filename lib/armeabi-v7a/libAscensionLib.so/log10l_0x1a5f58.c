// 函数: log10l
// 地址: 0x1a5f58
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int64_t q4
int64_t var_18 = q4
int128_t q0
q0.q = arg2:arg1
int32_t lr_1

if (arg2 s>= 0x100000)
    lr_1 = 0
label_1a5f92:
    
    if (arg2 s>= 0x7ff00000)
        q0.q = q0.q f+ q0.q
    else if (arg1 != 0 || arg2 != 0x3ff00000)
        int32_t r0
        int32_t r2_4
        r2_4:r0 = q0.q
        int32_t r4_2 = arg2 & 0xfffff
        q0.q = -0x4080000000000000
        int128_t q2
        q2.q = 0xdf3e5244
        q2:8.q = 0x96cb03de
        q0:8.q = ((((r4_2 + 0x95f64) & 0x100000) + r4_2) ^ 0x3ff00000):r0
        q0.q = q0:8.q f+ -0.0078125
        q0:8.q = 0x4000000000000000
        q0:8.q = q0.q f+ 2.0
        q0:8.q = q0.q f/ q0:8.q
        int128_t q1
        q1.q = q0:8.q f* q0:8.q
        q1:8.q = q1.q f* q1.q
        unimplemented  {vmla.f64.F64 d5, d3, d4}
        q2.q = 0x3f00000000000000
        unimplemented  {vmla.f64.F64 d6, d3, d5}
        q2.q = q0.q f* 3.0517578125e-05
        unimplemented  {vmla.f64.F64 d8, d3, d7}
        q2.q = q0.q f* q2.q
        q2:8.q = 0x55555593
        unimplemented  {vmla.f64.F64 d5, d3, d6}
        unimplemented  {vmla.f64.F64 d7, d3, d8}
        q1.q = q1.q f* 7.0733196078913893e-315
        unimplemented  {vmla.f64.F64 d2, d3, d7}
        q1:8.q = q0.q f- q2.q
        q1.q = q2.q f+ q1.q
        q0.q = q0.q f- q1:8.q
        q0.q = q0.q f- q2.q
        unimplemented  {vmla.f64.F64 d0, d1, d2}
        q1.q = 0x9438ca9a
        q2.d = lr_1 + (arg2 s>> 0x14) + ((r4_2 + 0x95f64) u>> 0x14) - 0x3ff
        q0:8.q = q0.q f+ q1:8.q
        q0:8.q = q0:8.q f* 1.228617670685873e-314
        q2.q = fconvert.s(q2.d)
        q2:8.q = 0x4413509f
        q1.q = 0xfef311f1
        q2:8.q = q2.q f* 5.6428053163316616e-315
        q1:8.q = q1:8.q f* 1.7510609798492726e-315
        unimplemented  {vmla.f64.F64 d1, d4, d2}
        q1.q = q2:8.q f+ q1:8.q
        unimplemented  {vmla.f64.F64 d1, d0, d6}
        q0.q = q2:8.q f- q1.q
        q0.q = q1:8.q f+ q0.q
        q0.q = q0.q f+ q0:8.q
        q0.q = q1.q f+ q0.q
    else
        q0.q = 0
else if (((arg2 & 0x7fffffff) | arg1) == 0)
    q0.q = 0
    q0:8.q = data_1f5b30
    q0.q = q0.q f/ q0:8.q
else
    if (arg2 s> 0xffffffff)
        q0:8.q = 0
        lr_1 = 0xffffffca
        q0.q = q0.q f* 0.0
        int32_t r2_3
        arg2:r2_3 = q0.q
        goto label_1a5f92
    
    q0.q = q0.q f- q0.q
    q0:8.q = 0
    q0.q = q0.q f/ q0:8.q
int32_t result
int32_t r1
r1:result = q0.q
return result
