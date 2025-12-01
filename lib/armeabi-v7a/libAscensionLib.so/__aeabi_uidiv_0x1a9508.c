// 函数: __aeabi_uidiv
// 地址: 0x1a9508
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (arg2 == 1)
    return 

if (arg2 u< 1)
    if (arg1 != 0)
        arg1 = 0xffffffff
    
    return __aeabi_idiv0(arg1) __tailcall

if (arg1 u<= arg2)
    return 

if ((arg2 & (arg2 - 1)) == 0)
    int32_t temp0_2 = 0
    uint32_t i = arg2
    
    while (i != 0)
        i u>>= 1
        temp0_2 += 1
    
    return 

int32_t temp0 = 0
uint32_t i_1 = arg2

while (i_1 != 0)
    i_1 u>>= 1
    temp0 += 1

int32_t temp0_1 = 0
uint32_t i_2 = arg1

while (i_2 != 0)
    i_2 u>>= 1
    temp0_1 += 1

int32_t r2_1 = 0x20 - temp0 - (0x20 - temp0_1)
int32_t r1 = arg2 << r2_1
int32_t r3_1 = 1 << r2_1
int32_t r2_2 = 0

while (true)
    if (arg1 u>= r1)
        arg1 -= r1
        r2_2 |= r3_1
    
    if (arg1 u>= r1 u>> 1)
        arg1 -= r1 u>> 1
        r2_2 |= r3_1 u>> 1
    
    if (arg1 u>= r1 u>> 2)
        arg1 -= r1 u>> 2
        r2_2 |= r3_1 u>> 2
    
    if (arg1 u>= r1 u>> 3)
        arg1 -= r1 u>> 3
        r2_2 |= r3_1 u>> 3
    
    if (arg1 == 0)
        break
    
    r3_1 u>>= 4
    
    if (r3_1 == 0)
        break
    
    r1 u>>= 4
