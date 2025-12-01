// 函数: _ZTSN14ascensionrules27CStatePutCardUnderConstructE
// 地址: 0x1d2b20
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
bool n
bool z
bool v

if (v)
    int32_t temp2_1 = lr s>> 2
    n = (arg5 ^ temp2_1) s< 0
    z = arg5 == temp2_1
    Coproc_SendOneWord(arg7, 3, 3, 5, 3, 3)
    Coproc_SendOneWord(arg7, 9, 3, 0xf, 3, 3)
    arg13 -= 0x572
    *arg13 = arg8.b

if (n)
    n = (arg8 ^ 0x30000007) s< 0
    z = arg8 == 0x30000007

void* r2

if (not(v))
    *arg2 = arg8.b
    arg2 -= 0x453
    arg6 = zx.d(*arg6) - 0x65
    r2 = arg3 - 0x473
    arg8 = zx.d(*r2)
else
    arg7 = zx.d(*arg3)
    r2 = arg3 - 0x143
    arg5 -= 0xe55
    *arg5 = arg7.b
    Coproc_SendOneWord(arg5, 3, 3, 0xf, 2, 3)

if (z)
    arg8 = arg6 - ror.d(arg4, 8)

if (v)
    int32_t temp3_1 = lr s>> 2
    n = (arg5 ^ temp3_1) s< 0
    z = arg5 == temp3_1
    Coproc_SendOneWord(arg7, 3, 3, 5, 3, 3)
    Coproc_SendOneWord(arg7, 9, 3, 0xf, 3, 3)
    arg13 -= 0x572
    *arg13 = arg8.b

if (n)
    n = (arg1 ^ 0xcc000001) s< 0
    z = arg1 == 0xcc000001

if (not(v))
    *arg2 = arg8.b
    arg2 -= 0x453
    arg6 = zx.d(*arg6) - 0x65
    unimplemented  {msrvc spsr_fsx, #0x134}

if (not(n))
    r2 -= 0x574
    arg7 = zx.d(*r2)

if (not(v))
    arg7 = 0x6e000000 - arg6
    unimplemented  {msrvc spsr_fsx, #0x10c}
else
    n = arg6 + 0x40000007 s< 0
    z = arg6 == 0xbffffff9
    v = add_overflow(arg6, 0x40000007)

if (z)
    arg5 = arg1 & ror.d(arg5, arg6 & 0xff)

if (v)
    int32_t temp4_1 = lr s>> 2
    n = (arg5 ^ temp4_1) s< 0
    z = arg5 == temp4_1
    Coproc_SendOneWord(arg7, 3, 3, 5, 3, 3)
    Coproc_SendOneWord(arg7, 9, 3, 0xf, 3, 3)
    arg13 -= 0x572
    *arg13 = arg8.b

if (n)
    n = (arg1 ^ 0xcc000001) s< 0
    z = arg1 == 0xcc000001

if (not(v))
    *arg2 = arg8.b
    arg2 -= 0x453
    arg6 = zx.d(*arg6) - 0x65
    unimplemented  {msrvc spsr_fsx, #0x10c}
else
    n = arg6 + 0x40000007 s< 0
    z = arg6 == 0xbffffff9
    v = add_overflow(arg6, 0x40000007)

if (n)
    unimplemented  {msrmi spsr_fsx, #0x1d0}

if (v)
    arg5 -= 0xe65
    arg7 = zx.d(*arg5)
    unimplemented  {msrvs spsr_sc, #0x72000000}

if (z)
    arg5 = arg1 & ror.d(arg12, 0xa)

if (v)
    int32_t temp5_1 = lr s>> 2
    n = (arg5 ^ temp5_1) s< 0
    z = arg5 == temp5_1
    Coproc_SendOneWord(arg7, 3, 3, 5, 3, 3)
    Coproc_SendOneWord(arg7, 9, 3, 0xf, 3, 3)
    arg13 -= 0x572
    *arg13 = arg8.b

if (n)
    z = arg10 == 0x30000007

if (not(v))
    *arg2 = arg8.b
    jump(0x1c2c9bc)

char* lr_1 = lr - 0x565
*lr_1 = arg5.b

if (v)
    unimplemented  {cdpvs p3, #0x6, c4, c15, c5, #0x3}
    unimplemented  {cdpvs p4, #0x4, c7, c9, c3, #0x3}
else
    r2 -= 0x473
    arg8 = zx.d(*r2)
    *(arg2 - 0x18) = arg5
    *(arg2 - 0x14) = arg7
    *(arg2 - 0x10) = arg11
    *(arg2 - 0xc) = arg12
    void arg_0
    *(arg2 - 8) = &arg_0
    *(arg2 - 4) = lr_1
    arg2 -= 0x18

if (z)
    arg1 &= arg6 s>> 0x20

if (v)
    Coproc_SendOneWord(arg7, 3, 3, 5, 3, 3)
    Coproc_SendOneWord(arg7, 9, 3, 0xf, 3, 3)
    arg13 -= 0x572
    *arg13 = arg8.b

bool n_1
bool z_1
bool v_1

if (not(v))
    *arg2 = arg8.b
    arg2 -= 0x453
label_1d2c34:
    arg8 = 0xb8000001 - arg5
    n_1 = 0xb8000001 - arg5 s< 0
    z_1 = 0xb8000001 == arg5
    v_1 = add_overflow(0xb8000001, neg.d(arg5))
else
    int32_t temp7_1 = ror.d(arg6, 8)
    n_1 = r2 + temp7_1 s< 0
    z_1 = r2 == neg.d(temp7_1)
    v_1 = add_overflow(r2, temp7_1)
    
    if (not(v_1))
        goto label_1d2c34
    
    syscall(arg8, arg1, arg2, r2, arg4, arg5, arg6, arg7)
    arg1 = syscall()

uint8_t* sp

if (n_1)
    arg1 = *(arg5 - 0x24)
    r2 = *(arg5 - 0x20)
    *(arg5 - 0x1c)
    arg6 = *(arg5 - 0x18)
    arg7 = *(arg5 - 0x14)
    arg9 = *(arg5 - 0x10)
    arg10 = *(arg5 - 0xc)
    sp = *(arg5 - 8)
    lr_1 = *(arg5 - 4)
    arg5 = undefined

if (v_1)
    unimplemented  {eretvs }

if (z_1)
    arg5 = arg1 & ror.d(arg10, arg6 & 0xff)

if (v_1)
    n_1 = (arg5 ^ lr_1 s>> 2) s< 0
    Coproc_SendOneWord(arg7, 3, 3, 5, 3, 3)
    Coproc_SendOneWord(arg7, 9, 3, 0xf, 3, 3)
    arg13 -= 0x572
    *arg13 = arg8.b

if (n_1)
    n_1 = (arg4 ^ 0x1cc00000) s< 0

if (not(v_1))
    *arg2 = arg8.b
    *(arg2 - 0x473) = arg1
    *(arg2 - 0x6f) = r2
    *(arg2 - 0x6b) = arg6
    *(arg2 - 0x67) = arg7
    *(arg2 - 0x63) = arg9
    *(arg2 - 0x5f) = arg11
    *(arg2 - 0x5b) = arg12
    *(arg2 - 0x57) = lr_1
    arg2 -= 0x473
else
    n_1 = arg4 + 0x110000 s< 0
    v_1 = add_overflow(arg4, 0x110000)

if (n_1)
    *arg5 = arg8.b
    arg5 -= ror.d(arg2, 4)

bool n_2
bool z_2
bool v_2

if (not(v_1))
    *arg2 = arg7.b
    arg2 -= 0xe61
    arg7 = arg5 + 0x5bffffff
    n_2 = arg5 + 0x5bffffff s< 0
    z_2 = arg5 == 0xa4000001
    v_2 = add_overflow(arg5, 0x5bffffff)

if (not(v_1) && not(v_2))
    *(arg9 - 0x24) = arg1
    *(arg9 - 0x20) = arg2
    *(arg9 - 0x1c) = r2
    *(arg9 - 0x18) = arg4
    *(arg9 - 0x14) = arg6
    *(arg9 - 0x10) = arg7
    *(arg9 - 0xc) = arg13
    *(arg9 - 8) = sp
    *(arg9 - 4) = lr_1
    arg9 -= 0x24
else
    int32_t temp9_1 = arg5 s>> (arg14 & 0xff)
    n_2 = arg4 - temp9_1 s< 0
    z_2 = arg4 == temp9_1
    v_2 = add_overflow(arg4, neg.d(temp9_1))
    
    if (v_2)
        *(arg5 - 0x576) = arg7.b
        arg1 = syscall(arg8, arg1, arg2, r2)

if (n_2)
    unimplemented  {msrmi spsr_s, #0x1e400000}

if (not(v_2))
    arg7 = zx.d(*arg4)
    *(arg4 - 0xe6f) = arg8.b
    arg4 -= 0x13e1

if (z_2)
    arg1 &= arg6 s>> 0x20

if (v_2)
    int32_t temp10_1 = lr_1 s>> 2
    n_2 = (arg5 ^ temp10_1) s< 0
    z_2 = arg5 == temp10_1
    Coproc_SendOneWord(arg7, 3, 3, 5, 3, 3)
    Coproc_SendOneWord(arg7, 9, 3, 0xf, 3, 3)
    arg13 -= 0x572
    *arg13 = arg8.b

if (n_2)
    n_2 = (arg2 ^ 0x30000007) s< 0
    z_2 = arg2 == 0x30000007

uint8_t* r9

if (not(v_2))
    *arg2 = arg8.b
    arg2 -= 0x453
    r9 = arg10 - 0x269
    *r9 = arg8.b
else
    unimplemented  {stclvs p2, c5, [pc],  #-0x194}
    unimplemented  {stclvs p4, c4, [r5],  #-0x1b0}
    r9 = arg10 - 0x46d
    *r9 = arg5.b

if (z_2)
    arg1 &= arg6 s>> 0x20

if (v_2)
    int32_t temp11_1 = lr_1 s>> 2
    n_2 = (arg5 ^ temp11_1) s< 0
    z_2 = arg5 == temp11_1
    Coproc_SendOneWord(arg7, 3, 3, 5, 3, 3)
    Coproc_SendOneWord(arg7, 9, 3, 0xf, 3, 3)
    arg13 -= 0x572
    *arg13 = arg8.b

if (n_2)
    n_2 = (arg4 ^ 0x30000007) s< 0
    z_2 = arg4 == 0x30000007

if (not(v_2))
    *arg2 = arg8.b
    arg2 -= 0x453
else
    n_2 = arg6 + 0x40000019 s< 0
    z_2 = arg6 == 0xbfffffe7
    v_2 = add_overflow(arg6, 0x40000019)
    
    if (v_2)
        Coproc_SendOneWord(arg7, 9, 3, 0xf, 4, 3)

if (n_2)
    arg2 = *(r2 - 0x24)
    *(r2 - 0x20)
    arg7 = *(r2 - 0x1c)
    arg9 = *(r2 - 0x18)
    r9 = *(r2 - 0x14)
    arg11 = *(r2 - 0x10)
    arg12 = *(r2 - 0xc)
    sp = *(r2 - 8)
    lr_1 = *(r2 - 4)
    r2 = undefined

if (v_2)
    r9 -= ror.d(lr_1, 6)
    *r9 = arg8.b

if (z_2)
    arg8 = arg6 - ror.d(arg9, 8)

if (v_2)
    n_2 = (arg5 ^ lr_1 s>> 2) s< 0
    Coproc_SendOneWord(arg7, 3, 3, 5, 3, 3)
    Coproc_SendOneWord(arg7, 9, 3, 0xf, 3, 3)
    arg13 -= 0x572
    *arg13 = arg8.b

if (n_2)
    n_2 = (r2 ^ 0xcc000001) s< 0

uint32_t r1_2

if (not(v_2))
    *arg2 = arg8.b
    r1_2 = arg2 - 0x453
else
    arg1, r1_2, r2, arg4, arg13, lr_1 = 0x1a27eb4(nop)
    
    if (v_2)
        unimplemented  {stclvs p1, c4, [r12],  #-0x194}
        arg1 = *(arg4 - 0x20)
        *(arg4 - 0x1c)
        arg7 = *(arg4 - 0x18)
        r9 = *(arg4 - 0x14)
        arg11 = *(arg4 - 0x10)
        arg12 = *(arg4 - 0xc)
        sp = *(arg4 - 8)
        lr_1 = *(arg4 - 4)
        arg4 = undefined

if (n_2)
    arg7 = zx.d(*arg5)
    arg5 -= ror.d(arg8, 0x10)
    arg1 = syscall()

if (v_2)
    Coproc_SendOneWord(arg8, 0, 3, 0xf, 0, 3)

if (n_2)
    arg5 -= 0xe65
    arg7 = zx.d(*arg5)

if (v_2)
    Coproc_SendOneWord(arg7, 3, 3, 5, 3, 3)
    Coproc_SendOneWord(arg7, 9, 3, 0xf, 3, 3)
    arg13 -= 0x572
    *arg13 = arg8.b

bool n_3
bool z_3
bool v_3

if (not(v_2))
    *r1_2 = arg8.b
    r1_2 -= 0x453
    n_3 = arg4 + 0x18c00000 s< 0
    z_3 = arg4 == 0xe7400000
    v_3 = add_overflow(arg4, 0x18c00000)
    
    if (v_3)
        goto label_1d2d60
else
    arg1 = syscall(arg8, arg1, r1_2)
label_1d2d60:
    n_3 = arg4 + 0x110000 s< 0
    z_3 = arg4 == 0xffef0000
    v_3 = add_overflow(arg4, 0x110000)

if (not(n_3))
    arg8 = 0x10000006 - arg5

if (v_3)
    arg1 = syscall(arg8, arg1, r1_2)
else
    arg5 = 0xb4000001 - r1_2

if (z_3)
    arg5 = arg1 & ror.d(arg5, 0xa)

if (v_3)
    Coproc_SendOneWord(arg7, 3, 3, 5, 3, 3)
    Coproc_SendOneWord(arg7, 9, 3, 0xf, 3, 3)
    arg13 -= 0x572
    *arg13 = arg8.b

bool n_4
bool v_4

if (not(v_3))
    *r1_2 = arg8.b
    r1_2 -= 0x453
    n_4 = arg4 + 0x18c00000 s< 0
    v_4 = add_overflow(arg4, 0x18c00000)
    
    if (v_4)
        goto label_1d2da0
else
    arg1 = syscall(arg8, arg1, r1_2)
label_1d2da0:
    n_4 = arg4 + 0x110000 s< 0
    v_4 = add_overflow(arg4, 0x110000)

if (n_4)
    *arg5 = arg8.b
    uint32_t r4_1 = arg5 - ror.d(r1_2, 4)
    *(sp - 0x24) = r1_2
    *(sp - 0x20) = r4_1
    *(sp - 0x1c) = arg6
    *(sp - 0x18) = arg7
    *(sp - 0x14) = arg9
    *(sp - 0x10) = r9
    *(sp - 0xc) = arg11
    *(sp - 8) = arg12
    *(sp - 4) = unimplemented  {stmdami sp!, {r1, r4, r5, r6, r8, r9, r10, r11, sp, lr} ^}
    *sp = lr_1
    sp -= 0x28
    arg5 = r4_1 - 0xe61
    *arg5 = arg7.b

if (v_4)
    Coproc_SendOneWord(arg7, 3, 3, 5, 3, 3)
    Coproc_SendOneWord(arg7, 9, 3, 0xf, 3, 3)
    arg13 -= 0x572
    *arg13 = arg8.b

bool n_5
bool z_5
bool v_5

if (not(v_4))
    *r1_2 = arg8.b
    r1_2 -= 0x453
    n_5 = arg4 + 0x18c00000 s< 0
    z_5 = arg4 == 0xe7400000
    v_5 = add_overflow(arg4, 0x18c00000)
    
    if (v_5)
        goto label_1d2de0
else
    arg1 = syscall(arg8, arg1, r1_2)
label_1d2de0:
    n_5 = arg4 + 0x110000 s< 0
    z_5 = arg4 == 0xffef0000
    v_5 = add_overflow(arg4, 0x110000)

if (n_5)
    unimplemented  {stclmi p2, c7, [r4,  #-0x184]!}

if (v_5)
    arg1 = *(arg5 - 0x24)
    r2 = *(arg5 - 0x20)
    *(arg5 - 0x1c)
    arg6 = *(arg5 - 0x18)
    arg7 = *(arg5 - 0x14)
    arg11 = *(arg5 - 0x10)
    arg12 = *(arg5 - 0xc)
    sp = *(arg5 - 8)
    lr_1 = *(arg5 - 4)
    arg5 = undefined

if (n_5)
    unimplemented  {msrmi spsr_sc, #0x7000}

if (not(v_5))
    unimplemented  {msrvc spsr_s, #0x10000006}

if (z_5)
    arg1 &= arg6 s>> 0x20

if (v_5)
    Coproc_SendOneWord(arg7, 3, 3, 5, 3, 3)
    Coproc_SendOneWord(arg7, 9, 3, 0xf, 3, 3)
    arg13 -= 0x572
    *arg13 = arg8.b

bool n_6
bool z_6
bool v_6

if (not(v_5))
    *r1_2 = arg8.b
    r1_2 -= 0x453
    n_6 = arg4 + 0x18c00000 s< 0
    z_6 = arg4 == 0xe7400000
    v_6 = add_overflow(arg4, 0x18c00000)
    
    if (v_6)
        goto label_1d2e20
else
    arg1 = syscall(arg8, arg1, r1_2)
label_1d2e20:
    n_6 = arg4 + 0x110000 s< 0
    z_6 = arg4 == 0xffef0000
    v_6 = add_overflow(arg4, 0x110000)

if (n_6)
    arg5 -= 0x261
    *arg5 = arg8.b

if (not(v_6))
    arg8 = 0x6e000000 - r9
else
    unimplemented  {cdpvs p8, #0x6, c4, c1, c5, #0x3}

if (z_6)
    arg5 = arg1 & ror.d(arg5, 0xa)

if (v_6)
    int32_t temp17_1 = lr_1 s>> 2
    n_6 = (arg5 ^ temp17_1) s< 0
    z_6 = arg5 == temp17_1
    Coproc_SendOneWord(arg7, 3, 3, 5, 3, 3)
    Coproc_SendOneWord(arg7, 9, 3, 0xf, 3, 3)
    arg13 -= 0x572
    *arg13 = arg8.b

if (n_6)
    n_6 = (arg7 ^ 0xcc000001) s< 0
    z_6 = arg7 == 0xcc000001

if (not(v_6))
    *r1_2 = arg8.b
    r1_2 -= 0x453
    uint32_t temp18_1 = ror.d(arg9, 0x1e)
    arg5 = ror.d(arg9, 0x1e) - arg1
    n_6 = temp18_1 - arg1 s< 0
    z_6 = temp18_1 == arg1
    v_6 = add_overflow(temp18_1, neg.d(arg1))
    
    if (v_6)
        goto label_1d2e60
    
    unimplemented  {msrvc spsr_fc, #0x74000000}
else
    unimplemented  {msrvs spsr_c, #0x19400000}
label_1d2e60:
    unimplemented  {cdpvs p14, #0x6, c6, c5, c15, #0x3}
    arg7 = zx.d(*r2)
    r2 -= 0x163
    Coproc_SendOneWord(arg6, 2, 3, 1, 3, 3)

if (n_6)
    unimplemented  {msrmi spsr_fsc, #0x190}
    arg5 -= 0x261
    *arg5 = arg8.b

if (v_6)
    int32_t temp19_1 = lr_1 s>> 2
    n_6 = (arg5 ^ temp19_1) s< 0
    z_6 = arg5 == temp19_1
    Coproc_SendOneWord(arg7, 3, 3, 5, 3, 3)
    Coproc_SendOneWord(arg7, 9, 3, 0xf, 3, 3)
    arg13 -= 0x572
    *arg13 = arg8.b

if (n_6)
    n_6 = (arg6 ^ 0xcc000001) s< 0
    z_6 = arg6 == 0xcc000001

if (not(v_6))
    *r1_2 = arg8.b
    r1_2 -= 0x453
else
    unimplemented  {stclvs p3, c5, [r5],  #-0x194}

if (n_6)
    arg1 = syscall(arg8, arg1, r1_2)

if (v_6)
    Coproc_SendOneWord(arg8, 0, 3, 0xf, 0, 3)

if (not(n_6))
    arg7 = zx.d(*arg5)
    arg5 -= 0xe65

if (v_6)
    unimplemented  {cdpvs p2, #0x6, c5, c1, c15, #0x3}

if (n_6)
    *sp = arg7.b
    sp -= 0xf64

if (v_6)
    unimplemented  {eretvs }

if (z_6)
    arg7 = arg6 - ror.d(r2, arg5 & 0xff)

if (v_6)
    int32_t temp20_1 = lr_1 s>> 2
    n_6 = (arg5 ^ temp20_1) s< 0
    z_6 = arg5 == temp20_1
    Coproc_SendOneWord(arg7, 3, 3, 5, 3, 3)
    Coproc_SendOneWord(arg7, 9, 3, 0xf, 3, 3)
    arg13 -= 0x572
    *arg13 = arg8.b

if (n_6)
    z_6 = arg5 == 0xcc000001

if (not(v_6))
    *r1_2 = arg8.b
    r1_2 -= 0x453
    uint32_t temp21_1 = ror.d(arg9, 0x1e)
    arg5 = ror.d(arg9, 0x1e) - arg1
    z_6 = temp21_1 == arg1
    v_6 = add_overflow(temp21_1, neg.d(arg1))
    
    if (v_6)
        goto label_1d2ee0
    
    unimplemented  {msrvc spsr_fc, #0x74000000}
else
    unimplemented  {msrvs spsr_c, #0x19400000}
label_1d2ee0:
    unimplemented  {cdpvs p14, #0x6, c6, c5, c15, #0x3}
    arg7 = zx.d(*r2)
    r2 -= 0x163
    arg1 = syscall(arg8, arg1, r1_2, r2)
    unimplemented  {cdpvs p8, #0x6, c4, c1, c13, #0x3}

if (z_6)
    arg5 = arg1 & ror.d(arg5, 0xa)

if (v_6)
    Coproc_SendOneWord(arg7, 3, 3, 5, 3, 3)
    Coproc_SendOneWord(arg7, 9, 3, 0xf, 3, 3)
    arg13 -= 0x572
    *arg13 = arg8.b

bool n_7
bool v_7

if (not(v_6))
    *r1_2 = arg8.b
    r1_2 -= 0x453
    n_7 = arg4 + 0x18c00000 s< 0
    v_7 = add_overflow(arg4, 0x18c00000)
    
    if (v_7)
        goto label_1d2f20
else
    arg1 = syscall(arg8, arg1, r1_2)
label_1d2f20:
    n_7 = arg4 + 0x110000 s< 0
    v_7 = add_overflow(arg4, 0x110000)

if (n_7)
    *arg5 = arg8.b
    void* r4_3 = arg5 - ror.d(r1_2, 4)
    *(sp - 0x24) = r1_2
    *(sp - 0x20) = r4_3
    *(sp - 0x1c) = arg6
    *(sp - 0x18) = arg7
    *(sp - 0x14) = arg9
    *(sp - 0x10) = r9
    *(sp - 0xc) = arg11
    *(sp - 8) = arg12
    *(sp - 4) = unimplemented  {stmdami sp!, {r1, r4, r5, r6, r8, r9, r10, r11, sp, lr} ^}
    *sp = lr_1
    sp -= 0x28
    *r4_3 = arg7.b
    arg5 = r4_3 - ror.d(r1_2, 0x1c)

if (v_7)
    unimplemented  {eretvs }
    arg1 = syscall(arg8, arg1, r1_2)
else
    arg8 = 0xb8000001 - arg5
    n_7 = 0xb8000001 - arg5 s< 0
    v_7 = add_overflow(0xb8000001, neg.d(arg5))

if (n_7)
    arg5 -= 0x375
    arg7 = zx.d(*arg5)

if (v_7)
    Coproc_SendOneWord(arg7, 3, 3, 5, 3, 3)
    Coproc_SendOneWord(arg7, 9, 3, 0xf, 3, 3)
    arg13 -= 0x572
    *arg13 = arg8.b

bool n_8
bool z_8
bool v_8

if (not(v_7))
    *r1_2 = arg8.b
    r1_2 -= 0x453
    uint32_t temp24_1 = ror.d(arg9, 0x1e)
    arg5 = ror.d(arg9, 0x1e) - arg1
    n_8 = temp24_1 - arg1 s< 0
    z_8 = temp24_1 == arg1
    v_8 = add_overflow(temp24_1, neg.d(arg1))
    
    if (v_8)
        goto label_1d2f70
    
    unimplemented  {msrvc spsr_fc, #0x74000000}
    arg5 = 0x622d074
    unimplemented  {msrvc spsr_fsx, #0x10c}
else
    unimplemented  {msrvs spsr_c, #0x19400000}
label_1d2f70:
    unimplemented  {cdpvs p14, #0x6, c6, c5, c15, #0x3}
    arg7 = zx.d(*r2)
    r2 -= 0x163
    arg1 = syscall(arg8, arg1, r1_2, r2)
    unimplemented  {cdpvs p8, #0x6, c4, c1, c13, #0x3}
    *(arg4 - 0x14) = arg1
    *(arg4 - 0x10) = r2
    *(arg4 - 0xc) = arg7
    *(arg4 - 8) = arg9
    *(arg4 - 4) = sp
    *arg4 = lr_1
    arg4 -= 0x18
    n_8 = arg6 + 0x40000007 s< 0
    z_8 = arg6 == 0xbffffff9
    v_8 = add_overflow(arg6, 0x40000007)

if (z_8)
    arg5 = arg1 & ror.d(arg5, arg6 & 0xff)

if (v_8)
    int32_t temp25_1 = lr_1 s>> 2
    n_8 = (arg5 ^ temp25_1) s< 0
    z_8 = arg5 == temp25_1
    Coproc_SendOneWord(arg7, 3, 3, 5, 3, 3)
    Coproc_SendOneWord(arg7, 9, 3, 0xf, 3, 3)
    arg13 -= 0x572
    *arg13 = arg8.b

if (n_8)
    n_8 = (arg8 ^ 0xcc000001) s< 0
    z_8 = arg8 == 0xcc000001

uint8_t* r1_3

if (not(v_8))
    *r1_2 = arg8.b
    r1_3 = r1_2 - 0x453
label_1d2fc8:
    uint32_t temp26_1 = ror.d(arg9, 0x1e)
    arg5 = ror.d(arg9, 0x1e) - arg1
    n_8 = temp26_1 - arg1 s< 0
    z_8 = temp26_1 == arg1
    v_8 = add_overflow(temp26_1, neg.d(arg1))
    
    if (v_8)
        goto label_1d2fcc
    
    unimplemented  {msrvc spsr_fc, #0x74000000}
else
    arg1, r1_3, r2, arg4, arg13, lr_1 = 0x1a28154(arg1, r1_2)
    
    if (not(v_8))
        goto label_1d2fc8
    
    arg1 = syscall(arg8)
    unimplemented  {msrvs spsr_c, #0x1b400000}
label_1d2fcc:
    unimplemented  {cdpvs p14, #0x6, c6, c5, c15, #0x3}
    arg7 = zx.d(*r2)
    r2 -= 0x163

if (z_8)
    arg1 &= arg6 s>> 0x20

if (v_8)
    int32_t temp27_1 = lr_1 s>> 2
    n_8 = (arg5 ^ temp27_1) s< 0
    z_8 = arg5 == temp27_1
    Coproc_SendOneWord(arg7, 3, 3, 5, 3, 3)
    Coproc_SendOneWord(arg7, 9, 3, 0xf, 3, 3)
    arg13 -= 0x572
    *arg13 = arg8.b

if (n_8)
    n_8 = (arg1 ^ 0xcc000001) s< 0
    z_8 = arg1 == 0xcc000001

uint32_t r6

if (not(v_8))
    *r1_3 = arg8.b
    arg6 = zx.d(*arg6) - 0x65
    *(r1_3 - 0x46b) = arg5
    *(r1_3 - 0x67) = arg7
    *(r1_3 - 0x63) = arg11
    *(r1_3 - 0x5f) = arg12
    *(r1_3 - 0x5b) = sp
    *(r1_3 - 0x57) = lr_1
    r1_3 -= 0x46b
    r6 = 0xcc000001 - r1_3
else
    r6 = zx.d(*r2)
    r2 -= 0x143
    arg1 = syscall(arg8, arg1, r1_3, r2)
    *(arg5 - 0x20) = arg1
    *(arg5 - 0x1c) = r2
    *(arg5 - 0x18) = arg6
    *(arg5 - 0x14) = r6
    *(arg5 - 0x10) = r9
    *(arg5 - 0xc) = arg13
    *(arg5 - 8) = sp
    *(arg5 - 4) = lr_1

if (z_8)
    arg5 = arg1 & ror.d(arg5, 0xa)

if (v_8)
    int32_t temp28_1 = lr_1 s>> 2
    n_8 = (arg5 ^ temp28_1) s< 0
    z_8 = arg5 == temp28_1
    Coproc_SendOneWord(r6, 3, 3, 5, 3, 3)
    Coproc_SendOneWord(r6, 9, 3, 0xf, 3, 3)
    arg13 -= 0x572
    *arg13 = arg8.b

if (n_8)
    n_8 = (arg1 ^ 0x73000000) s< 0
    z_8 = arg1 == 0x73000000

uint32_t lr_2

if (not(v_8))
    *r1_3 = arg8.b
    r1_3 -= 0x453
    arg6 = zx.d(*arg6) - 0x65
    arg8 = 0x73000000 - arg6
    *lr_1 = r6.b
    lr_2 = lr_1 - 0x56e
else
    lr_2 = lr_1 - 0x74f
    *lr_2 = arg8.b
    unimplemented  {cdpvs p13, #0x6, c4, c15, c4, #0x3}
    syscall()
    arg1 = syscall()
    n_8 = arg4 + 0x110000 s< 0
    z_8 = arg4 == 0xffef0000
    v_8 = add_overflow(arg4, 0x110000)

if (n_8)
    arg5 -= 0x261
    *arg5 = arg8.b

if (v_8)
    int32_t temp29_1 = lr_2 s>> 2
    n_8 = (arg5 ^ temp29_1) s< 0
    z_8 = arg5 == temp29_1
    Coproc_SendOneWord(r6, 3, 3, 5, 3, 3)
    Coproc_SendOneWord(r6, 9, 3, 0xf, 3, 3)
    arg13 -= 0x572
    *arg13 = arg8.b

if (n_8)
    n_8 = (arg4 ^ 0x73000000) s< 0
    z_8 = arg4 == 0x73000000

if (not(v_8))
    *r1_3 = arg8.b
    r1_3 -= 0x453
    arg6 = zx.d(*arg6) - 0x65
    unimplemented  {msrvc spsr_fsx, #0x134}

int32_t r6_1

if (n_8)
    r6_1 = ((r2 u>> 0x10) - (arg5 u>> 0x10)) u>> 1 << 0x10 | (r2.w - arg5.w) u>> 1
    *(arg5 - 0x28) = arg1
    *(arg5 - 0x24) = r1_3
    *(arg5 - 0x20) = r2
    *(arg5 - 0x1c) = arg4
    *(arg5 - 0x18) = arg6
    *(arg5 - 0x14) = r6_1
    *(arg5 - 0x10) = arg9
    *(arg5 - 0xc) = arg12
    *(arg5 - 8) = sp
    *(arg5 - 4) = lr_2
    arg5 -= 0x28
    arg1 = syscall(arg8)
else
    int16_t temp0_14 = sp.w - r2.w
    uint16_t temp1_1 = (sp u>> 0x10) - (r2 u>> 0x10)
    r6_1 =
        (temp1_1 & neg.w(temp1_1 u<= sp u>> 0x10)) << 0x10 | (temp0_14 & neg.w(temp0_14 u<= sp.w))

if (v_8)
    Coproc_SendOneWord(arg8, 0, 3, 0xf, 0, 3)

if (n_8)
    r6_1 = zx.d(*arg5)
    arg5 -= 0xe65

if (v_8)
    unimplemented  {eretvs }

if (z_8)
    r6_1 = arg6 - ror.d(r2, arg5 & 0xff)

if (v_8)
    int32_t temp30_1 = lr_2 s>> 2
    n_8 = (arg5 ^ temp30_1) s< 0
    z_8 = arg5 == temp30_1
    Coproc_SendOneWord(r6_1, 3, 3, 5, 3, 3)
    Coproc_SendOneWord(r6_1, 9, 3, 0xf, 3, 3)
    arg13 -= 0x572
    *arg13 = arg8.b

if (n_8)
    n_8 = (r1_3 ^ 0x73000000) s< 0
    z_8 = r1_3 == 0x73000000

if (not(v_8))
    *r1_3 = arg8.b
    r1_3 -= 0x453
    arg6 = zx.d(*arg6) - 0x65
    unimplemented  {msrvc spsr_fsx, #0x134}

uint32_t r6_2

if (n_8)
    r6_2 = ((r2 u>> 0x10) - (arg5 u>> 0x10)) u>> 1 << 0x10 | (r2.w - arg5.w) u>> 1
    arg1 = syscall(arg8, arg1, r1_3)
else
    int16_t temp0_17 = sp.w - r2.w
    uint16_t temp1_3 = (sp u>> 0x10) - (r2 u>> 0x10)
    r6_2 =
        (temp1_3 & neg.w(temp1_3 u<= sp u>> 0x10)) << 0x10 | (temp0_17 & neg.w(temp0_17 u<= sp.w))

if (not(v_8))
    arg6 = ror.d(lr_2, 8) - &data_1d30d4
else
    syscall(arg8, arg1, r1_3)
    unimplemented  {stclvs p4, c7, [r1],  #-0x1c8}
    arg1, r1_3, r2, arg4, arg13, lr_2 = 0x1aac5f0()

if (z_8)
    arg1 &= arg6 s>> 0x20

if (v_8)
    int32_t temp31_1 = lr_2 s>> 2
    n_8 = (arg5 ^ temp31_1) s< 0
    z_8 = arg5 == temp31_1
    Coproc_SendOneWord(r6_2, 3, 3, 5, 3, 3)
    Coproc_SendOneWord(r6_2, 9, 3, 0xf, 3, 3)
    arg13 -= 0x572
    *arg13 = arg8.b

if (n_8)
    n_8 = (r2 ^ 0xcc000001) s< 0
    z_8 = r2 == 0xcc000001

if (not(v_8))
    *r1_3 = arg8.b
    r1_3 -= 0x453
    n_8 = arg4 + 0x18c00000 s< 0
    z_8 = arg4 == 0xe7400000
    v_8 = add_overflow(arg4, 0x18c00000)
    
    if (v_8)
        r6_2 = zx.d(*(r6_2 - 0x552))
        arg1 = syscall(arg8, arg1, r1_3)
    else
        arg5 = 0xc0000001 - r1_3
else
    arg1 = syscall(arg8, arg1, r1_3)
    r6_2 = zx.d(*(r6_2 - 0x552))
    arg1 = syscall(arg8, arg1, r1_3)

if (n_8)
    *r6_2 = arg5.b
    r6_2 -= 0xf64
    arg12 -= 0x365
    *arg12 = r6_2.b

if (v_8)
    int32_t temp32_1 = lr_2 s>> 2
    n_8 = (arg5 ^ temp32_1) s< 0
    z_8 = arg5 == temp32_1
    Coproc_SendOneWord(r6_2, 3, 3, 5, 3, 3)
    Coproc_SendOneWord(r6_2, 9, 3, 0xf, 3, 3)
    arg13 -= 0x572
    *arg13 = arg8.b

if (n_8)
    n_8 = (r2 ^ 0xcc000001) s< 0
    z_8 = r2 == 0xcc000001

if (not(v_8))
    *r1_3 = arg8.b
    r1_3 -= 0x453
    n_8 = arg4 + 0x18c00000 s< 0
    z_8 = arg4 == 0xe7400000
    v_8 = add_overflow(arg4, 0x18c00000)
else
    arg1 = syscall(arg8, arg1, r1_3)

if (n_8)
    r6_2 = zx.d(*r9)
    r9 -= 0x14d

if (v_8)
    unimplemented  {eretvs }
    arg1 = syscall(arg8, arg1, r1_3)

if (n_8)
    *r6_2 = arg5.b
    r6_2 -= 0xf70
    arg12 -= 0x365
    *arg12 = r6_2.b

if (v_8)
    int32_t temp33_1 = lr_2 s>> 2
    n_8 = (arg5 ^ temp33_1) s< 0
    z_8 = arg5 == temp33_1
    Coproc_SendOneWord(r6_2, 3, 3, 5, 3, 3)
    Coproc_SendOneWord(r6_2, 9, 3, 0xf, 3, 3)
    arg13 -= 0x572
    *arg13 = arg8.b

if (n_8)
    n_8 = (arg6 ^ 0xcc000001) s< 0
    z_8 = arg6 == 0xcc000001

if (not(v_8))
    *r1_3 = arg8.b
    r1_3 -= 0x453
    n_8 = arg4 + 0x18c00000 s< 0
    z_8 = arg4 == 0xe7400000
    v_8 = add_overflow(arg4, 0x18c00000)
    
    if (v_8)
        r6_2 = ((arg6 u>> 0x10) - arg4.w) u>> 1 << 0x10 | (arg6.w + (arg4 u>> 0x10)) u>> 1
else
    arg1 = syscall(arg8, arg1, r1_3)
    r6_2 = ((arg6 u>> 0x10) - arg4.w) u>> 1 << 0x10 | (arg6.w + (arg4 u>> 0x10)) u>> 1

if (n_8)
    *arg6 = r6_2.b
    arg6 -= 0xc66

if (v_8)
    unimplemented  {eretvs }
    Coproc_SendOneWord(r6_2, 4, 2, 9, 2, 3)
    *(arg5 - 0xf74) = r6_2.b

if (z_8)
    r6_2 = arg6 - ror.d(arg4, 0x16)

if (v_8)
    Coproc_SendOneWord(r6_2, 3, 3, 5, 3, 3)
    Coproc_SendOneWord(r6_2, 9, 3, 0xf, 3, 3)
    arg13 -= 0x572
    *arg13 = arg8.b

bool n_9
bool z_9
bool v_9

if (not(v_8))
    *r1_3 = arg8.b
    r1_3 -= 0x453
    n_9 = arg4 + 0x18c00000 s< 0
    z_9 = arg4 == 0xe7400000
    v_9 = add_overflow(arg4, 0x18c00000)
    
    if (v_9)
        goto label_1d31c0
    
    arg6 = ror.d(arg8, arg5 & 0xff) - &data_1d31d4
else
    arg1 = syscall(arg8, arg1, r1_3)
label_1d31c0:
    r6_2 = zx.d(*(r6_2 - 0x552))
    unimplemented  {cdpvs p12, #0x4, c6, c1, c1, #0x3}
    int32_t temp35_1 = ror.d(arg5, 8)
    n_9 = r2 + temp35_1 s< 0
    z_9 = r2 == neg.d(temp35_1)
    v_9 = add_overflow(r2, temp35_1)
    
    if (not(v_9))
        arg6 = ror.d(arg8, arg5 & 0xff) - &data_1d31d4
    else
        *(arg5 - 0x64f) = r6_2.b
        unimplemented  {vnmlavs.f64 d22, d5, d19}

if (n_9)
    arg13 -= 0x974
    *arg13 = r6_2.b

if (v_9)
    arg1 = syscall(arg8, arg1, r1_3)
else
    *r9 = r6_2.b
    r9 -= 0x46e

if (n_9)
    lr_2 -= 0xf69
    *lr_2 = r6_2.b

if (v_9)
    int32_t temp36_1 = lr_2 s>> 2
    n_9 = (arg5 ^ temp36_1) s< 0
    z_9 = arg5 == temp36_1
    Coproc_SendOneWord(r6_2, 3, 3, 5, 3, 3)
    Coproc_SendOneWord(r6_2, 9, 3, 0xf, 3, 3)
    arg13 -= 0x572
    *arg13 = arg8.b

if (n_9)
    n_9 = (arg5 ^ 0x30000007) s< 0
    z_9 = arg5 == 0x30000007

if (not(v_9))
    *r1_3 = arg8.b
    r1_3 -= 0x453
    n_9 = arg4 + 0x18c00000 s< 0
    z_9 = arg4 == 0xe7400000
    v_9 = add_overflow(arg4, 0x18c00000)
    
    if (v_9)
        unimplemented  {cdpvs p1, #0x6, c6, c9, c7, #0x2}
        unimplemented  {ldclvs p15, c6, [r5],  #-0x14c}
else
    arg1 = syscall(arg8, arg1, r1_3)
    unimplemented  {cdpvs p1, #0x6, c6, c9, c7, #0x2}
    unimplemented  {ldclvs p15, c6, [r5],  #-0x14c}

if (n_9)
    sp -= 0x547
    *sp = r6_2.b

if (v_9)
    int32_t temp37_1 = lr_2 s>> 2
    n_9 = (arg5 ^ temp37_1) s< 0
    z_9 = arg5 == temp37_1
    Coproc_SendOneWord(r6_2, 3, 3, 5, 3, 3)
    Coproc_SendOneWord(r6_2, 9, 3, 0xf, 3, 3)
    arg13 -= 0x572
    *arg13 = arg8.b

if (n_9)
    n_9 = (r2 ^ 0x30000007) s< 0
    z_9 = r2 == 0x30000007

if (not(v_9))
    *r1_3 = arg8.b
    r1_3 -= 0x453
    n_9 = arg4 + 0x18c00000 s< 0
    z_9 = arg4 == 0xe7400000
    v_9 = add_overflow(arg4, 0x18c00000)
    
    if (not(v_9))
        r1_3 -= arg5 s>> 4
        *r1_3 = arg8.b
    else
        r6_2 = zx.d(*r2)
        r2 -= 0x143
else
    arg1 = syscall(arg8, arg1, r1_3)
    r6_2 = zx.d(*r2)
    r2 -= 0x143

if (z_9)
    arg5 = arg1 & ror.d(arg4, arg6 & 0xff)

if (v_9)
    int32_t temp38_1 = lr_2 s>> 2
    n_9 = (arg5 ^ temp38_1) s< 0
    z_9 = arg5 == temp38_1
    Coproc_SendOneWord(r6_2, 3, 3, 5, 3, 3)
    Coproc_SendOneWord(r6_2, 9, 3, 0xf, 3, 3)
    arg13 -= 0x572
    *arg13 = arg8.b

if (n_9)
    n_9 = (arg1 ^ 0xcc000001) s< 0
    z_9 = arg1 == 0xcc000001

uint8_t* r1_6

if (not(v_9))
    *r1_3 = arg8.b
    n_9 = arg4 + 0x18c00000 s< 0
    z_9 = arg4 == 0xe7400000
    v_9 = add_overflow(arg4, 0x18c00000)
    
    if (v_9)
        goto label_1d3270
    
    r1_6 = r1_3 - 0x453 - (arg5 s>> 4)
    *r1_6 = arg8.b
else
    syscall(arg8, arg1, r1_3)
label_1d3270:
    arg1 = *(arg5 - 0x20)
    r1_6 = *(arg5 - 0x1c)
    char* r2_2 = *(arg5 - 0x18)
    arg4 = *(arg5 - 0x14)
    arg13 = *(arg5 - 0xc)
    sp = *(arg5 - 8)
    lr_2 = *(arg5 - 4)
    arg5 -= 0x20
    unimplemented  {stclvs p14, c6, [r1],  #-0x1bc}
    r6_2 = zx.d(*r2_2)
    r2 = r2_2 - 0x143

if (z_9)
    arg5 = arg1 & ror.d(arg4, arg6 & 0xff)

if (v_9)
    int32_t temp39_1 = lr_2 s>> 2
    n_9 = (arg5 ^ temp39_1) s< 0
    z_9 = arg5 == temp39_1
    Coproc_SendOneWord(r6_2, 3, 3, 5, 3, 3)
    Coproc_SendOneWord(r6_2, 9, 3, 0xf, 3, 3)
    arg13 -= 0x572
    *arg13 = arg8.b

if (n_9)
    n_9 = (arg6 ^ 0xcc000001) s< 0
    z_9 = arg6 == 0xcc000001

if (not(v_9))
    *r1_6 = arg8.b
    r1_6 -= 0x453
    n_9 = arg4 + 0x18c00000 s< 0
    z_9 = arg4 == 0xe7400000
    v_9 = add_overflow(arg4, 0x18c00000)
    
    if (v_9)
        goto label_1d32b0
    
    r6_2 -= 0x1b400000
else
    arg1 = syscall(arg8, arg1, r1_6)
label_1d32b0:
    arg1 = syscall(arg8, arg1, r1_6)
    unimplemented  {hvcvs #0x3653}
    unimplemented  {hvcvs #0xe642}
    *(arg5 - 0xd6f) = r6_2.b

if (z_9)
    r6_2 = arg6 - ror.d(arg4, 0x16)

if (v_9)
    int32_t temp40_1 = lr_2 s>> 2
    n_9 = (arg5 ^ temp40_1) s< 0
    z_9 = arg5 == temp40_1
    Coproc_SendOneWord(r6_2, 3, 3, 5, 3, 3)
    Coproc_SendOneWord(r6_2, 9, 3, 0xf, 3, 3)
    arg13 -= 0x572
    *arg13 = arg8.b

if (n_9)
    n_9 = (arg8 ^ 0x30000007) s< 0
    z_9 = arg8 == 0x30000007

if (not(v_9))
    *r1_6 = arg8.b
    r1_6 -= 0x453
    n_9 = arg4 + 0x18c00000 s< 0
    z_9 = arg4 == 0xe7400000
    v_9 = add_overflow(arg4, 0x18c00000)
    
    if (v_9)
        goto label_1d32f0
else
    arg1 = syscall(arg8, arg1, r1_6)
label_1d32f0:
    arg1 = syscall(arg8, arg1, r1_6)
    *(arg9 - 0x573) = r6_2.b
    unimplemented  {hvcvs #0xe6f2}

if (z_9)
    r6_2 = arg6 - ror.d(sp, 0xa)

if (v_9)
    int32_t temp41_1 = lr_2 s>> 2
    n_9 = (arg5 ^ temp41_1) s< 0
    z_9 = arg5 == temp41_1
    Coproc_SendOneWord(r6_2, 3, 3, 5, 3, 3)
    Coproc_SendOneWord(r6_2, 9, 3, 0xf, 3, 3)
    arg13 -= 0x572
    *arg13 = arg8.b

if (n_9)
    n_9 = (r9 ^ 0x30000007) s< 0
    z_9 = r9 == 0x30000007

if (not(v_9))
    *r1_6 = arg8.b
    r1_6 -= 0x453
    arg6 = 0xffe2cd48
else
    unimplemented  {stclvs p13, c4, [r9],  #-0x194}

if (n_9)
    *arg13 = r6_2.b
    arg13 -= 0x174
else
    arg12 -= 0x365
    *arg12 = r6_2.b

if (v_9)
    unimplemented  {stclvs p4, c7, [r9],  #-0x1b8}
    arg1 = syscall(arg8, arg1, r1_6)

if (z_9)
    arg1 &= arg6 s>> 0x20

if (v_9)
    n_9 = (arg5 ^ lr_2 s>> 2) s< 0
    Coproc_SendOneWord(r6_2, 3, 3, 5, 3, 3)
    Coproc_SendOneWord(r6_2, 9, 3, 0xf, 3, 3)
    arg13 -= 0x572
    *arg13 = arg8.b

if (n_9)
    n_9 = (r9 ^ 0x73000000) s< 0

if (not(v_9))
    *r1_6 = arg8.b
    r1_6 -= 0x453
    *arg6 = arg6.b
    arg6 -= ror.d(arg6, 4)

if (not(n_9))
    r6_2 = ror.d(arg6, 2) - arg13

bool n_10
bool z_10
bool v_10

if (v_9)
    int32_t temp43_1 = ror.d(arg14, 4)
    n_10 = &arg5[temp43_1] s< 0
    z_10 = arg5 == neg.d(temp43_1)
    v_10 = add_overflow(arg5, temp43_1)

if (v_9 && v_10)
    unimplemented  {msrvs spsr_sc, #0x6c000000}
    *lr_2 = arg5.b
    lr_2 -= 0x16b
    unimplemented  {msrvs spsr_c, #0x5000}
    arg6 = zx.d(*(r2 - 0x465))
    *lr_2 = arg6.b
    lr_2 -= 0x565
else
    arg8 = 0x84000001 - arg6
    n_10 = 0x84000001 - arg6 s< 0
    z_10 = 0x84000001 == arg6
    v_10 = add_overflow(0x84000001, neg.d(arg6))
    
    if (v_10)
        *lr_2 = arg6.b
        lr_2 -= 0x565
    else
        arg8 = arg5 - 0x50000006
        n_10 = arg5 - 0x50000006 s< 0
        z_10 = arg5 == 0x50000006
        v_10 = add_overflow(arg5, 0xaffffffa)
        
        if (not(v_10))
            *(arg9 - 0x24) = arg1
            *(arg9 - 0x20) = r1_6
            *(arg9 - 0x1c) = r2
            *(arg9 - 0x18) = arg4
            *(arg9 - 0x14) = arg6
            *(arg9 - 0x10) = r6_2
            *(arg9 - 0xc) = arg13
            *(arg9 - 8) = sp
            *(arg9 - 4) = lr_2
            arg9 -= 0x24

if (z_10)
    arg1 &= arg6 s>> 0x20

if (v_10)
    int32_t temp44_1 = lr_2 s>> 2
    n_10 = (arg5 ^ temp44_1) s< 0
    z_10 = arg5 == temp44_1
    Coproc_SendOneWord(r6_2, 3, 3, 5, 3, 3)
    Coproc_SendOneWord(r6_2, 9, 3, 0xf, 3, 3)
    arg13 -= 0x572
    *arg13 = arg8.b

if (n_10)
    n_10 = (r9 ^ 0xcc000001) s< 0
    z_10 = r9 == 0xcc000001

if (not(v_10))
    *r1_6 = arg8.b
    r1_6 -= 0x453
    n_10 = arg4 + 0x18c00000 s< 0
    z_10 = arg4 == 0xe7400000
    v_10 = add_overflow(arg4, 0x18c00000)
    
    if (v_10)
        goto label_1d33b0
    
    r6_2 = &data_1d33c8 - ror.d(arg14, 0x1a)
else
    arg1 = syscall(arg8, arg1, r1_6)
label_1d33b0:
    *(arg12 - 0x154) = r6_2.b
    *lr_2 = r6_2.b
    unimplemented  {eretvs }
    lr_2 -= 0x10c2
    *lr_2 = r6_2.b

if (z_10)
    arg8 = arg6 - ror.d(lr_2, 8)

if (v_10)
    int32_t temp45_1 = lr_2 s>> 2
    n_10 = (arg5 ^ temp45_1) s< 0
    z_10 = arg5 == temp45_1
    Coproc_SendOneWord(r6_2, 3, 3, 5, 3, 3)
    Coproc_SendOneWord(r6_2, 9, 3, 0xf, 3, 3)
    arg13 -= 0x572
    *arg13 = arg8.b

if (n_10)
    n_10 = (arg9 ^ 0xcc000001) s< 0
    z_10 = arg9 == 0xcc000001

uint8_t* r1_7

if (not(v_10))
    *r1_6 = arg8.b
    r1_7 = r1_6 - 0x453
else
    arg1, r1_7, arg4, arg13, lr_2 = 0x1a28584(arg1, r1_6)
    
    if (v_10)
        unimplemented  {cdpvs p2, #0x6, c5, c1, c5, #0x3}

if (n_10)
    unimplemented  {msrmi spsr_fsc, #0x190}
    *arg5 = arg8.b
    arg5 -= ror.d(r1_7, 4)
else
    unimplemented  {msrpl spsr_fsc, #0x1c8}

if (v_10)
    unimplemented  {stclvs p14, c6, [r7],  #-0x1a4}
    unimplemented  {cdpvs p14, #0x6, c6, c5, c15, #0x3}
else
    uint32_t temp46_1 = ror.d(arg6, 0x1e)
    arg5 = ror.d(arg6, 0x1e) - arg1
    n_10 = temp46_1 - arg1 s< 0
    z_10 = temp46_1 == arg1
    v_10 = add_overflow(temp46_1, neg.d(arg1))
    
    if (v_10)
        unimplemented  {cdpvs p14, #0x6, c6, c5, c15, #0x3}

if (z_10)
    arg5 = arg1 & ror.d(arg5, arg6 & 0xff)

if (v_10)
    int32_t temp47_1 = lr_2 s>> 2
    n_10 = (arg5 ^ temp47_1) s< 0
    z_10 = arg5 == temp47_1
    Coproc_SendOneWord(r6_2, 3, 3, 5, 3, 3)
    Coproc_SendOneWord(r6_2, 9, 3, 0xf, 3, 3)
    arg13 -= 0x572
    *arg13 = arg8.b

if (n_10)
    n_10 = (r6_2 ^ 0xcc000001) s< 0
    z_10 = r6_2 == 0xcc000001

uint8_t* r1_8

if (not(v_10))
    *r1_7 = arg8.b
    r1_8 = r1_7 - 0x453
else
    arg1, r1_8, arg4, arg13, lr_2 = 0x1a285c4(arg1, r1_7)
    
    if (v_10)
        unimplemented  {cdpvs p2, #0x6, c5, c1, c5, #0x3}

if (n_10)
    unimplemented  {msrmi spsr_fsc, #0x190}
    *arg5 = arg8.b
    arg5 -= ror.d(r1_8, 4)
    *(sp - 0xf72) = r6_2.b
    arg1 = syscall()

if (v_10)
    Coproc_SendOneWord(arg8, 0, 3, 0xf, 0, 3)

if (n_10)
    arg5 -= 0xe65
    r6_2 = zx.d(*arg5)

if (v_10)
    int32_t temp48_1 = lr_2 s>> 2
    n_10 = (arg5 ^ temp48_1) s< 0
    z_10 = arg5 == temp48_1
    Coproc_SendOneWord(r6_2, 3, 3, 5, 3, 3)
    Coproc_SendOneWord(r6_2, 9, 3, 0xf, 3, 3)
    arg13 -= 0x572
    *arg13 = arg8.b

if (n_10)
    n_10 = (arg4 ^ 0x73000000) s< 0
    z_10 = arg4 == 0x73000000

if (not(v_10))
    *r1_8 = arg8.b
    r1_8 -= 0x453
    *arg6 = arg6.b
    arg6 -= ror.d(arg6, 4)

if (n_10)
    syscall(arg8, arg1, r1_8)

if (v_10)
    Coproc_SendOneWord(arg8, 0, 3, 0xf, 0, 3)

if (n_10)
    uint32_t r0_47 = *(arg5 - 0x20)
    *(arg5 - 0x1c)
    arg6 = *(arg5 - 0x18)
    r6_2 = *(arg5 - 0x14)
    *(arg5 - 0x10)
    *(arg5 - 0xc)
    uint32_t r11_1 = *(arg5 - 8)
    uint32_t sp_2 = *(arg5 - 4)
    int32_t lr_4 = *arg5
    arg5 = arg5 - 0x24 - ror.d(r1_8, 0x1c)
    *arg5 = r6_2.b
    *(lr_4 - 0x18) = r0_47
    *(lr_4 - 0x14) = arg6
    *(lr_4 - 0x10) = r6_2
    *(lr_4 - 0xc) = arg9
    *(lr_4 - 8) = r11_1
    *(lr_4 - 4) = sp_2
    *lr_4 = unimplemented  {stmdami lr!, {r0, r5, r6, r8, r11, sp, lr} ^}
    lr_2 = lr_4 - 0x1c

if (not(v_10))
    r6_2 = 0xffe2d268

if (n_10)
    unimplemented  {ldclmi p5, c6, [r2,  #-0x140]!}

if (not(v_10))
    r6_2 = zx.d(*arg4)

if (z_10)
    arg8 = arg6 - ror.d(arg6, 4)

if (v_10)
    n_10 = (arg5 ^ lr_2 s>> 2) s< 0
    Coproc_SendOneWord(r6_2, 3, 3, 5, 3, 3)
    Coproc_SendOneWord(r6_2, 9, 3, 0xf, 3, 3)
    *(arg13 - 0x572) = arg8.b

if (n_10)
    n_10 = (arg6 ^ 0x30000007) s< 0

if (not(v_10))
    *r1_8 = arg8.b
else
    unimplemented  {stclvs p2, c5, [r5,  #-0x194]!}

if (n_10)
    unimplemented  {msrmi spsr_sc, #0x6f00000}

if (v_10)
    *(arg5 - 0xe65)

undefined
