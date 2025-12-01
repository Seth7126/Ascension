// 函数: GetResolveCardEntryList
// 地址: 0x18b344
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r1 = *s_pWorldData
int32_t result = 0

if (r1 != 0)
    void* r1_2 = *(r1 + *(s_InterfaceContext + 0x10) * 0x34 + 0x124)
    
    if (r1_2 != 0)
        int32_t r12_1 = *(r1_2 + 0xbd8)
        int32_t r1_3 = *(r1_2 + 0xbdc)
        
        if (r1_3 != r12_1)
            result = (r1_3 - r12_1) s>> 3
            int32_t r3_1 = 0
            
            do
                void* r1_5 = *(r12_1 + (r3_1 << 3))
                uint32_t r2_2 = 0
                
                if (r1_5 != 0)
                    r2_2 = zx.d(*(r1_5 + 8))
                
                *(arg1 + (r3_1 << 3)) = r2_2
                int32_t r1_7 = *(r12_1 + (r3_1 << 3) + 4)
                
                if (r1_7 == 9)
                    *(arg1 + (r3_1 << 3)) = r2_2 + 0x5000
                else if (r1_7 == 0xc)
                    *(arg1 + (r3_1 << 3)) = r2_2 + 0x6000
                
                void* r2_4 = arg1 + (r3_1 << 3)
                r3_1 += 1
                *(r2_4 + 4) = r1_7
            while (r3_1 u< result)

return result
