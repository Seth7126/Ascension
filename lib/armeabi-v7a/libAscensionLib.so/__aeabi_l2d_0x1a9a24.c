// 函数: __aeabi_l2d
// 地址: 0x1a9a24
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if ((arg1 | arg2) == 0)
    return 

if ((arg2 & 0x80000000) s< 0)
    int32_t temp2_1 = arg1
    arg1 = 0 - arg1
    arg2 = sbb.d(0, arg2, 0 u< temp2_1)

uint32_t r12 = arg2 u>> 0x16

if (r12 != 0)
    int32_t r2 = 3
    uint32_t r12_1 = r12 u>> 3
    
    if (r12_1 != 0)
        r2 = 6
    
    uint32_t r12_2 = r12_1 u>> 3
    
    if (r12_2 != 0)
        r2 += 3
    
    int32_t r2_1 = r2 + (r12_2 u>> 3)
    r12 = arg1 << (0x20 - r2_1)
    arg1 = arg1 u>> r2_1 | arg2 << ((0x20 - r2_1) & 0xff)
    arg2 u>>= r2_1

if (arg2 u>= 0x100000)
    return 

bool c_6 = test_bit(r12, 0x1f)
arg2 = adc.d(arg2, arg2, adc.d(arg1, arg1, c_6) u< arg1 || (c_6 && adc.d(arg1, arg1, c_6) == arg1))

if ((arg2 & 0x100000) != 0)
    return 

if (arg2 == 0)
    arg2 = adc.d(arg1, arg1, c_6)

int32_t temp0 = 0
uint32_t i = arg2

while (i != 0)
    i u>>= 1
    temp0 += 1
