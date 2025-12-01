// 函数: NetworkUpdate
// 地址: 0x19a4a0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

bool cond:0 = *s_pNetworkClientManager == 0
*s_maxNetworkEvents = arg2
*s_pNetworkEvents = arg1
*s_numNetworkEvents = 0

if (not(cond:0))
    NetworkClientManager::Update()
    uint32_t r0_1 = *s_networkState
    
    if (r0_1 == 2)
        uint32_t r0_4 = *s_pNetworkClientManager
        
        if (zx.d(*(r0_4 + 0x8e)) == 0)
            uint32_t r2_5 = *s_numNetworkEvents
            
            if (r2_5 s< *s_maxNetworkEvents)
                uint32_t r3_4 = *s_pNetworkEvents
                int32_t r0_5 = *(r0_4 + 0x90)
                *(r3_4 + (r2_5 << 3)) = 7
                *(r3_4 + (*s_numNetworkEvents << 3) + 4) = r0_5
                *s_numNetworkEvents += 1
            
            *s_networkState = 0
    else if (r0_1 == 1)
        uint32_t r0_2 = *s_pNetworkClientManager
        int32_t r2_1 = *(r0_2 + 0x90)
        
        if (r2_1 != 0)
            uint32_t r3 = *s_numNetworkEvents
            
            if (r3 s< *s_maxNetworkEvents)
                uint32_t r7_1 = *s_pNetworkEvents
                *(r7_1 + (r3 << 3)) = 3
                *(r7_1 + (*s_numNetworkEvents << 3) + 4) = r2_1
                *s_numNetworkEvents += 1
            
            *s_networkState = 2
            NetworkClientManager::Disconnect()
            return *s_numNetworkEvents
        
        if (zx.d(*(r0_2 + 0x8e)) != 0 && zx.d(*(r0_2 + 0x8f)) != 0)
            uint32_t r2_10 = *s_numNetworkEvents
            
            if (r2_10 s< *s_maxNetworkEvents)
                uint32_t r3_6 = *s_pNetworkEvents
                int32_t r0_9 = *(r0_2 + 0xa4)
                *(r3_6 + (r2_10 << 3)) = 2
                *(r3_6 + (*s_numNetworkEvents << 3) + 4) = r0_9
                *s_numNetworkEvents += 1
            
            *s_networkState = 2

return *s_numNetworkEvents
