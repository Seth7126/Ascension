// 函数: sqrtl
// 地址: 0x1a6234
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

double q0 = arg2:arg1

if ((arg2 & 0x7ff00000) == 0x7ff00000)
    unimplemented  {vmla.f64.F64 d0, d0, d0}
else if (arg2 s> 0)
label_1a625a:
    uint32_t r2_1
    
    if (0 == arg2 u>> 0x14)
        int32_t r2_4 = 0
        
        while (arg2 == 0)
            arg2 = arg1 u>> 0xb
            r2_4 -= 0x15
            arg1 <<= 0x15
        
        int32_t r3_2 = 0
        
        while (arg2 << 0xb s>= 0)
            r3_2 += 1
            arg2 <<= 1
        
        arg2 |= arg1 u>> (0x20 - r3_2)
        r2_1 = r2_4 - r3_2 + 1
        arg1 <<= r3_2
    else
        r2_1 = arg2 u>> 0x14
    
    int32_t r1 = (arg2 & 0xfffff) | 0x100000
    uint32_t r4_1 = 0x200000
    int32_t r3_3 = 0
    
    if ((r2_1 - 0x3ff) << 0x1f != 0)
        r1 = r1 << 1 | arg1 u>> 0x1f
        arg1 <<= 1
    
    int32_t r12_1 = 0
    int32_t r2_7 = arg1 u>> 0x1f | r1 << 1
    int32_t r1_2
    
    while (true)
        r1_2 = arg1 << 1
        
        if (r4_1 == 0)
            break
        
        int32_t r6_3 = r4_1 + r3_3
        
        if (r2_7 s>= r6_3)
            r12_1 += r4_1
            r2_7 -= r6_3
            r3_3 = r6_3 + r4_1
        
        r4_1 u>>= 1
        r2_7 = (arg1 u>> 0x1e & 1) | r2_7 << 1
        arg1 = r1_2
    
    int32_t r9_1 = 0
    uint32_t i = 0x80000000
    int32_t r8_1 = 0
    
    while (i != 0)
        int32_t r6_4 = r9_1 + i
        
        if (r2_7 s> r3_3)
        label_1a6312:
            r2_7 -= r3_3
            
            if (r1_2 u< r6_4)
                r2_7 -= 1
            
            int32_t r0_3 = 0
            r9_1 = r6_4 + i
            int32_t r5_3 = 0
            
            if (r6_4 s< 0)
                r0_3 = 1
            
            if (r9_1 s> 0xffffffff)
                r5_3 = 1
            
            r8_1 += i
            r3_3 += r0_3 & r5_3
            r1_2 -= r6_4
        else if (r2_7 == r3_3 && r1_2 u>= r6_4)
            goto label_1a6312
        
        r2_7 = r1_2 u>> 0x1f | r2_7 << 1
        i u>>= 1
        r1_2 <<= 1
    
    if ((r1_2 | r2_7) != 0)
        if (r8_1 == 0xffffffff)
            r12_1 += 1
            r8_1 = 0
        else
            r8_1 += r8_1 & 1
    
    q0 = (0x3fe00000 + ((r2_1 - 0x3ff) u>> 1 << 0x14) + (r12_1 s>> 1)):(r8_1 u>> 1 | r12_1 << 0x1f)
else if (((arg2 & 0x7fffffff) | arg1) != 0)
    if (arg2 s> 0xffffffff)
        goto label_1a625a
    
    q0 = q0 - q0
    q0 = q0 / q0

int32_t result
int32_t r1_5
r1_5:result = q0
return result
