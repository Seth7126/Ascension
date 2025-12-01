// 函数: __adddf3
// 地址: 0x1a96d8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r4 = arg2 << 1
int32_t r5 = arg4 << 1

if (r4 == r5 || (r4 | arg1) == 0 || (r5 | arg3) == 0 || not.d(r4 s>> 0x15) == 0
        || not.d(r5 s>> 0x15) == 0)
    return 

uint32_t r4_1 = r4 u>> 0x15
uint32_t temp2_1 = r5 u>> 0x15
uint32_t r5_1 = (r5 u>> 0x15) - r4_1

if (temp2_1 s< r4_1)
    r5_1 = 0 - r5_1

if (temp2_1 s> r4_1)
    r4_1 += r5_1
    int32_t r2 = arg1 ^ arg3
    int32_t r3 = arg2 ^ arg4
    arg1 ^= r2
    arg2 ^= r3
    arg3 = arg1 ^ r2
    arg4 = arg2 ^ r3

if (r5_1 u> 0x36)
    return 

int32_t r1_1 = 0x100000 | arg2 << 0xc u>> 0xc

if ((arg2 & 0x80000000) != 0)
    int32_t temp7_1 = arg1
    arg1 = 0 - arg1
    r1_1 = sbb.d(0, r1_1, 0 u< temp7_1)

int32_t r3_2 = 0x100000 | arg4 << 0xc u>> 0xc

if ((arg4 & 0x80000000) != 0)
    int32_t temp8_1 = arg3
    arg3 = 0 - arg3
    r3_2 = sbb.d(0, r3_2, 0 u< temp8_1)

if (r4_1 == r5_1)
    r3_2 ^= 0x100000
    
    if (r4_1 == 0)
        r1_1 ^= 0x100000
    else
        r5_1 -= 1

int32_t r0_1
uint32_t i_1
int32_t r12_5
bool cond:5_1

if (0x20 s< r5_1)
    r12_5 = r3_2 << (0x20 * 2 - r5_1)
    
    if (arg3 u>= 1)
        r12_5 |= 2
    
    r0_1 = arg1 + (r3_2 s>> zx.d(r5_1.b - 0x20))
    i_1 = adc.d(r1_1, r3_2 s>> 0x1f, arg1 + (r3_2 s>> zx.d(r5_1.b - 0x20)) u< arg1)
    cond:5_1 = i_1 s>= 0
else
    r12_5 = arg3 << (0x20 - r5_1)
    int32_t r0 = arg1 + (arg3 u>> (r5_1 & 0xff))
    r0_1 = r0 + (r3_2 << ((0x20 - r5_1) & 0xff))
    i_1 = adc.d(adc.d(r1_1, 0, arg1 + (arg3 u>> (r5_1 & 0xff)) u< arg1), r3_2 s>> (r5_1 & 0xff), 
        r0 + (r3_2 << ((0x20 - r5_1) & 0xff)) u< r0)
    cond:5_1 = i_1 s>= 0

if (not(cond:5_1))
    int32_t temp15_1 = r12_5
    r12_5 = 0 - r12_5
    bool c_6 = 0 u>= temp15_1
    int32_t temp16_1 = r0_1
    bool cond:11_1 = not.b(c_6)
    r0_1 = sbb.d(0, r0_1, not.b(c_6))
    i_1 = sbb.d(0, i_1, 
        sbb.d(0, temp16_1, cond:11_1) u>= 0 && (sbb.d(0, temp16_1, cond:11_1) != 0 || not(c_6)))

if (i_1 u>= 0x100000)
    return 

bool c_12 = test_bit(r12_5, 0x1f)
i_1 = adc.d(i_1, i_1, adc.d(r0_1, r0_1, c_12) u< r0_1 || (c_12 && adc.d(r0_1, r0_1, c_12) == r0_1))

if ((i_1 & 0x100000) != 0)
    return 

if (i_1 == 0)
    i_1 = adc.d(r0_1, r0_1, c_12)

int32_t temp0 = 0
uint32_t i = i_1

while (i != 0)
    i u>>= 1
    temp0 += 1
