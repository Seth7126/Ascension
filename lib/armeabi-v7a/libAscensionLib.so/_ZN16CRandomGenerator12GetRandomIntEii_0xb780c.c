// 函数: _ZN16CRandomGenerator12GetRandomIntEii
// 地址: 0xb780c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t entry_result

if (entry_result == arg2)
    return entry_result

uint32_t r12_1 = entry_result - arg2
int32_t r10_1

if (entry_result == arg2)
    r10_1 = 0
else
    int32_t r2 = 0xffffffff
    uint32_t r7_1 = r12_1
    bool cond:1_1
    
    do
        cond:1_1 = 0 != r7_1 u>> 1
        r2 <<= 1
        r7_1 u>>= 1
    while (cond:1_1)
    r10_1 = not.d(r2)

int32_t* r6_2 = *(arg1 + 0x9c0)
int32_t r7_2 = *(arg1 + 0x9c4)
int32_t r4_4

do
    if (r7_2 == 0)
        int32_t r5_1 = *arg1
        
        for (int32_t i = 0; i != 0x38c; i += 4)
            void* r4_1 = arg1 + i
            int32_t r7_3 = *(r4_1 + 4)
            int32_t r3_2 = (r7_3 & 0x7ffffffe) | (r5_1 & 0x80000000)
            r5_1 = r7_3
            int32_t r3_3 = *(r4_1 + 0x634) ^ r3_2 u>> 1
            
            if ((r7_3 & 1) != 0)
                r3_3 ^= 0x9908b0df
            
            *(arg1 + i) = r3_3
        
        int32_t r7_4 = *(arg1 + 0x38c)
        
        for (int32_t i_1 = 0; i_1 != 0xfffffe74; )
            int32_t r3_5 = arg1 - (i_1 << 2)
            i_1 -= 1
            int32_t r5_3 = *(r3_5 + 0x390)
            int32_t r7_7 = *r3_5 ^ ((r5_3 & 0x7ffffffe) | (r7_4 & 0x80000000)) u>> 1
            
            if ((r5_3 & 1) != 0)
                r7_7 ^= 0x9908b0df
            
            *(r3_5 + 0x38c) = r7_7
            r7_4 = r5_3
        
        int32_t r3_6 = *(arg1 + 0x9bc)
        int32_t r7_8 = *arg1
        *(arg1 + 0x9c4) = 0x270
        r7_2 = 0x26f
        int32_t r3_9 = *(arg1 + 0x630) ^ ((r7_8 & 0x7ffffffe) | (r3_6 & 0x80000000)) u>> 1
        r6_2 = arg1
        
        if ((r7_8 & 1) != 0)
            r3_9 ^= 0x9908b0df
        
        *(arg1 + 0x9bc) = r3_9
    else
        r7_2 -= 1
    
    *(arg1 + 0x9c4) = r7_2
    int32_t r3_10 = *r6_2
    r6_2 = &r6_2[1]
    int32_t r3_11 = r3_10 ^ r3_10 u>> 0xb
    int32_t r3_12 = (0x9d2c5680 & r3_11 << 7) ^ r3_11
    int32_t r3_13 = (0xefc60000 & r3_12 << 0xf) ^ r3_12
    r4_4 = (r3_13 ^ r3_13 u>> 0x12) & r10_1
while (r4_4 u> r12_1)

*(arg1 + 0x9c0) = r6_2
return r4_4 + arg2
