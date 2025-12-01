// 函数: GetKingdomStackList
// 地址: 0x18f950
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r2 = *s_pWorldData
int32_t result = 0

if (r2 != 0)
    void* r12_1 = *(r2 + *(s_InterfaceContext + 0x10) * 0x34 + 0x124)
    
    if (r12_1 != 0)
        int32_t r3_2 = *(r12_1 + 0xa30)
        int32_t r0 = *(r12_1 + 0xa34)
        result = (r0 - r3_2) s>> 2
        
        if (r0 != r3_2)
            int32_t r2_2 = 0xc
            int32_t r4_1 = 0
            
            do
                void* r5_1 = *(r3_2 + (r4_1 << 2))
                uint32_t* r7_2 = arg1 + (r4_1 << 4)
                *r7_2 = zx.d(*(r5_1 + 8))
                r7_2[1] = *(r5_1 + 0x10)
                void* r6_3 = *(r5_1 + 0x14)
                uint32_t r5_2 = 0
                
                if (r6_3 != 0)
                    r5_2 = zx.d(*(r6_3 + 8))
                
                void* r6_4 = arg1 + (r4_1 << 4)
                r4_1 += 1
                *(r6_4 + 8) = r5_2
                int16_t* r5_3 = arg1 + r2_2
                r2_2 += 0x10
                *r5_3 = 0
            while (r4_1 u< result)
        
        void* r2_3 = *(r12_1 + 0xa68)
        
        if (r2_3 != 0)
            int32_t r3_3 = *(r2_3 + 0x10)
            
            if (r3_3 != 0)
                void* r1_1 = arg1 + (result << 4)
                *r1_1 = zx.d(*(r2_3 + 8))
                *(r1_1 + 4) = r3_3
                void* r1_2 = arg1 + (result << 4)
                uint32_t r2_4 = *(r2_3 + 0x14)
                bool cond:1 = r2_4 == 0
                
                if (r2_4 != 0)
                    r2_4 = zx.d(*(r2_4 + 8))
                
                *(r1_2 + 0xc) = 1
                
                if (cond:1)
                    r2_4 = 0
                
                *(r1_2 + 8) = r2_4
                return result + 1

return result
