// 函数: sub_1cc376
// 地址: 0x1cc376
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

char r6_1
int32_t sp
bool n
bool z
bool c
bool v

if (not(v))
    r6_1 = 0xc - arg3.b
    n = 0x10c - arg3 s< 0
    z = 0x10c == arg3
    c = 0x10c u>= arg3
    v = add_overflow(0x10c, neg.d(arg3))
    
    if (v)
        goto label_1cc37e
    
    *arg9 = arg7.b
else
label_1cc37e:
    arg1 = *(arg7 - 0x14)
    arg3 = *(arg7 - 0x10)
    arg6 = *(arg7 - 0xc)
    r6_1 = (*(arg7 - 8)).b
    sp = *(arg7 - 4)

if (z)
    int32_t temp1_1 = ror.d(arg5, 0x1e)
    r6_1 = (ror.d(arg5, 0x1e)).b - arg7.b
    n = temp1_1 - arg7 s< 0
    z = temp1_1 == arg7
    c = temp1_1 u>= arg7
    v = add_overflow(temp1_1, neg.d(arg7))

char* lr

if (not(v))
    arg3 -= 0x145
    arg4 = *(arg5 - 0x10)
    arg6 = *(arg5 - 0xc)
    r6_1 = (*(arg5 - 8)).b
    sp = *(arg5 - 4)
    *lr = r6_1
    lr -= 0x172
    arg5 = (arg1 << 0x1a) - arg6

if (z)
    int32_t temp2_1 = ror.d(arg8, 0x12)
    r6_1 = (ror.d(arg8, 0x12)).b - arg5.b
    n = temp2_1 - arg5 s< 0
    c = temp2_1 u>= arg5
    v = add_overflow(temp2_1, neg.d(arg5))

if (not(v))
    r6_1 = *arg4
    arg4 -= 0x94d

if (c)
    r6_1 = (ror.d(arg2, 0x16)).b - arg6.b

if (n)
    unimplemented  {hintmi #0x6f}

if (not(v))
    *arg2 = r6_1

uint32_t r6_4

if (v)
    int32_t r6_3 = arg4 - sp * 2
    r6_4 = r6_3 & neg.d(r6_3 s<= arg4)
    *(arg3 - 0x10)
    *(arg3 - 0xc)
    *(arg3 - 8)
    lr = *(arg3 - 4)
    arg3 -= 0x10
else
    unimplemented  {msrvc cpsr_sxc, #0x6500}
    r6_4 = zx.d(*arg4)

if (not(n))
    arg7 = 0x265
    *arg1 = r6_4

if (v)
    Coproc_SendOneWord(arg7, 2, 3, 1, 9, 3)
    syscall()
    Coproc_SendOneWord(r6_4, 0xd, 3, 5, 2, 3)

if (v)
    unimplemented  {ldclvs p15, c6, [r5],  #-0x14c}
    unimplemented  {cdpvs p7, #0x6, c5, c9, c0, #0}
else
    arg3 = *(arg5 - 0x10)
    *(arg5 - 0xc)
    *(arg5 - 4)
    *lr = (*(arg5 - 8)).b

if (v)
    *(arg10 - 0x544) = arg7.b

if (not(v))
    unimplemented  {msrvc spsr_sc, #0x130000}
else
    *(arg3 - 4)
    *arg3
    unimplemented  {cdpvs p0, #0x4, c2, c9, c1, #0x3}
    unimplemented  {eretvs }

breakpoint
