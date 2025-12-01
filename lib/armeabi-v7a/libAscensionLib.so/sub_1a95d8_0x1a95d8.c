// 函数: sub_1a95d8
// 地址: 0x1a95d8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

bool n

if (n)
    arg2 = 0 - arg2

if (arg2 == 1)
    return 

uint32_t i_3 = arg1

if (i_3 s< 0)
    i_3 = 0 - arg1

if (i_3 u<= arg2)
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
uint32_t i_2 = i_3

while (i_2 != 0)
    i_2 u>>= 1
    temp0_1 += 1

int32_t r0_1 = 0x20 - temp0 - (0x20 - temp0_1)
int32_t r1 = arg2 << r0_1
int32_t r2_2 = 1 << r0_1
int32_t r0_2 = 0

while (true)
    if (i_3 u>= r1)
        i_3 -= r1
        r0_2 |= r2_2
    
    if (i_3 u>= r1 u>> 1)
        i_3 -= r1 u>> 1
        r0_2 |= r2_2 u>> 1
    
    if (i_3 u>= r1 u>> 2)
        i_3 -= r1 u>> 2
        r0_2 |= r2_2 u>> 2
    
    if (i_3 u>= r1 u>> 3)
        i_3 -= r1 u>> 3
        r0_2 |= r2_2 u>> 3
    
    if (i_3 == 0)
        break
    
    r2_2 u>>= 4
    
    if (r2_2 == 0)
        break
    
    r1 u>>= 4
