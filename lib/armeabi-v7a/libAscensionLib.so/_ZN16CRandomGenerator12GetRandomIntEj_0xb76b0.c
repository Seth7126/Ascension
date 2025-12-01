// 函数: _ZN16CRandomGenerator12GetRandomIntEj
// 地址: 0xb76b0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = 0
int32_t entry_r1

if (entry_r1 u>= 2)
    uint32_t r3_1 = entry_r1 - 1
    int32_t r2 = 0xffffffff
    bool cond:0_1
    
    do
        cond:0_1 = 0 != r3_1 u>> 1
        r2 <<= 1
        r3_1 u>>= 1
    while (cond:0_1)
    int32_t* r6_2 = *(arg1 + 0x9c0)
    int32_t r7_1 = *(arg1 + 0x9c4)
    
    do
        if (r7_1 == 0)
            int32_t r4_1 = *arg1
            
            for (int32_t i = 0; i != 0x38c; )
                void* r7_2 = arg1 + i
                int32_t r6_3 = *(r7_2 + 4)
                int32_t r4_4 = *(r7_2 + 0x634) ^ ((r6_3 & 0x7ffffffe) | (r4_1 & 0x80000000)) u>> 1
                
                if ((r6_3 & 1) != 0)
                    r4_4 ^= 0x9908b0df
                
                *(arg1 + i) = r4_4
                i += 4
                r4_1 = r6_3
            
            int32_t r6_4 = *(arg1 + 0x38c)
            
            for (int32_t i_1 = 0; i_1 != 0xfffffe74; )
                int32_t r4_6 = arg1 - (i_1 << 2)
                i_1 -= 1
                int32_t r7_4 = *(r4_6 + 0x390)
                int32_t r3_3 = (r7_4 & 0x7ffffffe) | (r6_4 & 0x80000000)
                r6_4 = r7_4
                int32_t r3_4 = *r4_6 ^ r3_3 u>> 1
                
                if ((r7_4 & 1) != 0)
                    r3_4 ^= 0x9908b0df
                
                *(r4_6 + 0x38c) = r3_4
            
            int32_t r2_1 = *(arg1 + 0x9bc)
            r7_1 = 0x26f
            int32_t r3_5 = *arg1
            r6_2 = arg1
            *(arg1 + 0x9c4) = 0x270
            int32_t r2_4 = *(arg1 + 0x630) ^ ((r3_5 & 0x7ffffffe) | (r2_1 & 0x80000000)) u>> 1
            
            if ((r3_5 & 1) != 0)
                r2_4 ^= 0x9908b0df
            
            *(arg1 + 0x9bc) = r2_4
        else
            r7_1 -= 1
        
        *(arg1 + 0x9c4) = r7_1
        int32_t r2_5 = *r6_2
        r6_2 = &r6_2[1]
        int32_t r2_6 = r2_5 ^ r2_5 u>> 0xb
        int32_t r2_7 = (0x9d2c5680 & r2_6 << 7) ^ r2_6
        int32_t r2_8 = (0xefc60000 & r2_7 << 0xf) ^ r2_7
        result = (r2_8 ^ r2_8 u>> 0x12) & not.d(r2)
    while (result u>= entry_r1)
    
    *(arg1 + 0x9c0) = r6_2

return result
