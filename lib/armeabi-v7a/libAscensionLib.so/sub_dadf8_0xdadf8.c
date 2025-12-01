// 函数: sub_dadf8
// 地址: 0xdadf8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r11
int32_t var_8 = r11
int32_t r8
int32_t var_10 = r8
int32_t r7
int32_t var_14 = r7
int32_t r6
int32_t var_18 = r6
int32_t r5
int32_t var_1c = r5
int32_t r4
int32_t var_20 = r4
unimplemented  {vpush {d8}}
int32_t r0 = *__stack_chk_guard
double var_38
int32_t* r0_2
double q0

if (arg3 - 1 u>= *(arg2 + 0x1c))
    q0.d = arg3
    unimplemented  {vcvt.f64.s32 d8, s0}
    unimplemented  {vmov.f64 d0, #1.000000e+00}
    var_38 = arg6 + q0
    int32_t r1_3 = var_38:4.d + var_38.d
    int32_t r0_4
    
    if (r1_3 s<= 0xffffffff)
        r0_4 = r1_3 * 2
        
        if (r1_3 != neg.d(r1_3))
            r0_4 = 0 - r1_3
    else
        r0_4 = r1_3
    
    int32_t r1_7 =
        __aeabi_idivmod(r0_4, (1 | 0xffffffff << zx.d(*(arg2 + 7))) ^ 0xfffffffe, 0xfffffffe, 1)
    r0_2 = *(arg2 + 0x10) + (r1_7 << 5)
    
    while (true)
        int32_t r1_8 = r0_2[6]
        
        if (r1_8 == 3)
            *(r0_2 + 0x10)
            unimplemented  {vcmp.f64 d0, d8}
            unimplemented  {vmrs apsr_nzcv, fpscr}
            
            if (r1_8 == 3)
                break
        
        r0_2 = r0_2[7]
        
        if (r0_2 == 0)
            goto label_daef0
else
    r0_2 = *(arg2 + 0xc) + ((arg3 - 1) << 4)

if (r0_2 == &data_1d13d0)
    q0.d = arg3
    unimplemented  {vcvt.f64.s32 d8, s0}
label_daef0:
    int32_t var_30_1 = 3
    var_38 = arg6
    int32_t r9
    r0_2 =
        sub_db070(arg1, arg2, &var_38, arg4, arg2, arg1, arg3, __stack_chk_guard, r9, arg5, &var_8)

int32_t r2_1 = arg4[1]
*r0_2 = *arg4
r0_2[1] = r2_1
r0_2[2] = arg4[2]

if (*__stack_chk_guard == r0)
    unimplemented  {vpopeq {d8}}
    jump(arg5)

__stack_chk_fail()
noreturn
