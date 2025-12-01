// 函数: NetworkGetRematchGameData
// 地址: 0x19bbe0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r0 = *s_pNetworkClientManager

if (r0 == 0)
    return 0

void* r0_1 = NetworkClientManager::GetActiveGame(r0)

if (r0_1 != 0)
label_19bc2c:
    
    if (*(r0_1 + 0xa18) != 0)
        void* r0_4 = NetworkClientManager::GetGameData(*s_pNetworkClientManager)
        
        if (r0_4 != 0)
            *arg2 = 1
            int32_t r5_1 = 0
            int32_t r0_5 = *(r0_4 + 0xa04)
            int32_t r0_6 = r0_5 - 1
            
            if (r0_5 != 1)
                r0_6 = 1
            
            arg2[1] = r0_6
            int32_t i_1 = *(r0_4 + 0xd4)
            arg2[2] = 0
            arg2[3] = i_1
            
            if (i_1 s>= 1)
                void* r1_4 = r0_4 + 0x1e
                int32_t r6_1 = *(*s_pNetworkClientManager + 0xa4)
                int32_t i
                
                do
                    uint32_t r2_2 = zx.d(*r1_4)
                    
                    if (*(r1_4 - 0xa) != r6_1)
                        goto label_19bca8
                    
                    if ((r2_2 | 2) != 2)
                        arg2[1] = 1
                    label_19bca8:
                        
                        if (r2_2 == 1)
                            r5_1 += 1
                            arg2[2] = r5_1
                    
                    r1_4 += 0x30
                    i = i_1
                    i_1 -= 1
                while (i != 1)
            
            return 0x10
else
    r0_1 = NetworkClientManager::GetCompletedGame(*s_pNetworkClientManager)
    
    if (r0_1 != 0)
        goto label_19bc2c

*arg2 = 0
arg2[1] = 0
arg2[2] = 0
arg2[3] = 0
return 0x10
