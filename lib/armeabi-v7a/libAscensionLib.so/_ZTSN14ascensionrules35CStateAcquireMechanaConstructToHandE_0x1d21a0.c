// 函数: _ZTSN14ascensionrules35CStateAcquireMechanaConstructToHandE
// 地址: 0x1d21a0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
bool n
bool z
bool c
bool v

if (v)
    int32_t temp2_1 = lr s>> 2
    n = (arg5 ^ temp2_1) s< 0
    z = arg5 == temp2_1
    c = unimplemented  {teqvs r4, lr, asr  #0x2}
    Coproc_SendOneWord(arg7, 3, 3, 5, 3, 3)
    Coproc_SendOneWord(arg7, 9, 3, 0xf, 3, 3)
    arg12 -= 0x572
    *arg12 = arg8.b

if (n)
    n = (arg6 ^ 0xcc000001) s< 0
    z = arg6 == 0xcc000001
    c = unimplemented  {teqmi r5, #0xcc000001}

if (not(v))
    *arg2 = arg8.b
    arg2 -= 0x453
    unimplemented  {eretvc }
else
    arg3 -= 0x975
    uint32_t r6 = zx.d(*arg3)
    *(arg4 - 0x1c) = arg1
    *(arg4 - 0x18) = arg3
    *(arg4 - 0x14) = unimplemented  {stmdavs r3!, {r0, r2, r3, r6, r8, r10, sp, lr} ^}
    *(arg4 - 0x10) = r6
    *(arg4 - 0xc) = arg9
    *(arg4 - 8) = arg11
    void arg_0
    *(arg4 - 4) = &arg_0
    *arg4 = lr
    arg4 -= 0x20

if (n)
    unimplemented  {msrmi spsr_c, #0x610}

void* r6_1

if (not(v))
    r6_1 = zx.d(*arg4)
    *(arg4 - 0xe6f) = arg8.b
    arg4 -= 0x13e1
else
    int32_t r6_2 = arg5 + arg9 * 2
    r6_1 = r6_2 | neg.d(r6_2 s< arg5)

if (z)
    r6_1 = arg6 - ror.d(lr, 8)

if (v)
    int32_t temp3_1 = lr s>> 2
    n = (arg5 ^ temp3_1) s< 0
    z = arg5 == temp3_1
    c = unimplemented  {teqvs r4, lr, asr  #0x2}
    Coproc_SendOneWord(r6_1, 3, 3, 5, 3, 3)
    Coproc_SendOneWord(r6_1, 9, 3, 0xf, 3, 3)
    arg12 -= 0x572
    *arg12 = arg8.b

if (n)
    n = (arg10 ^ 0x73000000) s< 0
    z = arg10 == 0x73000000
    c = unimplemented  {teqmi r9, #0x73000000}

if (not(v))
    *arg2 = arg8.b
    arg2 -= 0x453
    n = arg4 + 0x18c00000 s< 0
    z = arg4 == 0xe7400000
    c = arg4 u>= 0xe7400000
    v = add_overflow(arg4, 0x18c00000)
    
    if (not(v))
        arg2 -= 0x341
        r6_1 = zx.d(*arg2)
else
    arg1 = syscall(arg8, arg1, arg2, arg3, arg4, arg5, arg6, r6_1)

if (n)
    unimplemented  {eretmi }

if (v)
    *(arg4 - 0xc6c) = r6_1.b
else
    arg8 = 0x6e000000 - arg6

if (n)
    arg2 = *(arg8 - 0x20)
    arg5 = *(arg8 - 0x1c)
    r6_1 = *(arg8 - 0x18)
    *(arg8 - 0x14)
    arg10 = *(arg8 - 0x10)
    *(arg8 - 0xc)
    *(arg8 - 8)
    lr = *arg8
    arg8 -= 0x24

if (v)
    unimplemented  {strbvs r7, 0x1d1fb7}

if (not(n))
    unimplemented  {strbtpl r5, 0x1d1dad}

if (v)
    *arg13 = arg8.b
    arg13 = &data_1d2224 - rrc.d(arg13, 1, c)
    arg1, arg2, arg3, arg4, arg12, lr = 0x1aab738(nop)

if (z)
    arg1 &= arg6 s>> 0x20

if (v)
    int32_t temp4_1 = lr s>> 2
    n = (arg5 ^ temp4_1) s< 0
    z = arg5 == temp4_1
    Coproc_SendOneWord(r6_1, 3, 3, 5, 3, 3)
    Coproc_SendOneWord(r6_1, 9, 3, 0xf, 3, 3)
    arg12 -= 0x572
    *arg12 = arg8.b

if (n)
    n = (arg8 ^ 0x73000000) s< 0
    z = arg8 == 0x73000000

if (not(v))
    *arg2 = arg8.b
    arg2 -= 0x453
    n = arg4 + 0x18c00000 s< 0
    z = arg4 == 0xe7400000
    v = add_overflow(arg4, 0x18c00000)
    
    if (not(v))
        arg2 -= 0x341
        r6_1 = zx.d(*arg2)
else
    arg1 = syscall(arg8, arg1, arg2)

if (n)
    syscall(arg8, arg1, arg2)

if (v)
    int16_t temp0_3 = arg6.w - arg3.w
    uint16_t temp1_1 = (arg6 u>> 0x10) - (arg3 u>> 0x10)
    arg5 =
        (temp1_1 & neg.w(temp1_1 u<= arg6 u>> 0x10)) << 0x10 | (temp0_3 & neg.w(temp0_3 u<= arg6.w))

if (n)
    int32_t temp5_1 = ror.d(arg6, 2)
    n = arg5 + temp5_1 s< 0
    z = arg5 == neg.d(temp5_1)
    v = add_overflow(arg5, temp5_1)

if (v)
    unimplemented  {eretvs }

if (n)
    arg2 = *(arg4 - 0x1c)
    arg5 = *(arg4 - 0x18)
    arg6 = *(arg4 - 0x14)
    r6_1 = *(arg4 - 0x10)
    *(arg4 - 0xc)
    *(arg4 - 8)
    lr = *(arg4 - 4)

if (v)
    unimplemented  {cdpvs p3, #0x6, c4, c5, c14, #0x3}

if (not(n))
    r6_1 = 0x1d000000 - arg3
    n = 0x1d000000 - arg3 s< 0
    z = 0x1d000000 == arg3
    v = add_overflow(0x1d000000, neg.d(arg3))

if (z)
    arg8 = arg6 - ror.d(arg13, 0xe)

if (v)
    n = (arg5 ^ lr s>> 2) s< 0
    Coproc_SendOneWord(r6_1, 3, 3, 5, 3, 3)
    Coproc_SendOneWord(r6_1, 9, 3, 0xf, 3, 3)
    *(arg12 - 0x572) = arg8.b

if (n)
    n = (arg10 ^ 0x30000007) s< 0

if (not(v))
    *arg2 = arg8.b
    *arg13 = arg5.b
    n = 0x84000001 - arg6 s< 0
    v = add_overflow(0x84000001, neg.d(arg6))
else
    *(arg3 - 0x465)

if (n)
    unimplemented  {msrmi spsr_fsx, #0x194000}

if (v)
    *(arg5 - 0xe65)

undefined
