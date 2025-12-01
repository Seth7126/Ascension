// 函数: GetGamePlayerLog
// 地址: 0x189a98
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = 0
uint32_t r0 = *s_pWorldData

if (r0 != 0)
    int32_t r2 = *(r0 + 0xd4)
    
    if (r2 s>= 1)
        int32_t* r3 = r0 + 0x14
        int32_t r6 = 0
        
        while (*r3 != arg1)
            r6 += 1
            r3 = &r3[0xc]
            
            if (r6 s>= r2)
                return 0
        
        result = 0
        int32_t r0_2 = *(r0 + *(s_InterfaceContext + 0x10) * 0x34 + 0x124)
        
        if (r0_2 != 0)
            int32_t r0_3 = ascension::CWorld::GetPlayerByIndex(r0_2)
            
            if (r0_3 != 0 && ascension::CPlayer::GetTurnLog(r0_3) != 0)
                void* r0_6 = ascension::CPlayer::GetTurnLog(r0_3)
                int32_t r1_1 = *(r0_6 + 0x10)
                bool cond:1_1 = arg5 s< 1
                int32_t r0_8 = *(r0_6 + 0x14) - r1_1
                
                if (arg5 s>= 1)
                    cond:1_1 = r0_8 s< 1
                
                result = r0_8 s>> 3
                
                if (not(cond:1_1))
                    int32_t r0_9 = 0
                    
                    do
                        *(arg3 + (r0_9 << 2)) = zx.d(*(*(r1_1 + (r0_9 << 3) + 4) + 8))
                        *(arg4 + (r0_9 << 2)) = *(r1_1 + (r0_9 << 3))
                        r0_9 += 1
                        
                        if (r0_9 s>= arg5)
                            break
                    while (r0_9 s< result)

return result
