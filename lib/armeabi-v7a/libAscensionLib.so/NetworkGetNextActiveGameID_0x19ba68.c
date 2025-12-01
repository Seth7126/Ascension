// 函数: NetworkGetNextActiveGameID
// 地址: 0x19ba68
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t lr = *s_pNetworkClientManager
int32_t i = *(lr + 0xa4)

if (i != 0)
    int32_t r12_1 = 0
    uint32_t r3_1 = *s_pWorldData
    
    if (r3_1 != 0)
        int32_t r2_1 = *(r3_1 + 0xd4)
        r12_1 = *(r3_1 + 4)
        
        if (r2_1 s>= 1)
            int32_t* r5_1 = r3_1 + 0x14
            int32_t r4_1 = 0
            
            do
                if (*r5_1 == i)
                    uint32_t r5_6
                    
                    if (*(r3_1 + 0xf8) == 3)
                        r5_6 = zx.d(*(r3_1 + 0xd8))
                    
                    if (*(r3_1 + 0xf8) != 3 || r5_6 == 0 || (r5_6 & 1 << (r4_1 & 0xff)) != 0
                            || *(r3_1 + (*(s_InterfaceContext + 0x10) << 2) + 0xfc)
                            u< *(r3_1 + 0x10c) || *(r3_1 + 0x1fc) != 0)
                        return 0
                    
                    break
                
                r4_1 += 1
                r5_1 = &r5_1[0xc]
            while (r4_1 s< r2_1)
    
    int32_t* r4_2 = *(lr + 0xdc)
    int32_t r9_1 = *(lr + 0xe0)
    
    if (r4_2 != r9_1)
        while (true)
            void* r6_2 = *r4_2
            int32_t result = *(r6_2 + 4)
            
            if (result != r12_1)
                uint32_t r3_2 = zx.d(*(r6_2 + 0xe))
                
                if ((r3_2 & arg1) == r3_2)
                    uint32_t r3_3 = zx.d(*(r6_2 + 0x10))
                    
                    if ((r3_3 & arg2) == r3_3)
                        int32_t r7_1 = *(r6_2 + 0xd4)
                        
                        if (r7_1 s>= 1)
                            void* r3_4 = r6_2 + 0x14
                            int32_t r5_4 = 0
                            
                            while (*r3_4 != i)
                                r5_4 += 1
                                r3_4 += 0x30
                                
                                if (r5_4 s>= r7_1)
                                    goto label_19bb64
                            
                            if ((zx.d(*(r6_2 + 0xd8)) & 1 << (r5_4 & 0xff)) != 0
                                    && *(r6_2 + 0xa04) != 3)
                                return result
            
        label_19bb64:
            r4_2 = &r4_2[1]
            
            if (r4_2 == r9_1)
                return 0

return 0
