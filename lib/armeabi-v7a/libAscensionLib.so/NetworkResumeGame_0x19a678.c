// 函数: NetworkResumeGame
// 地址: 0x19a678
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r0_2 = NetworkClientManager::GetGameData(*s_pNetworkClientManager)
void* result = __aeabi_memclr4(s_localPlayerStats, 0x118)

if (r0_2 != 0)
    AppWorldData* r0_4 = *s_pNetworkClientManager
    *s_pWorldData = r0_2
    NetworkClientManager::SetMonitorGame(r0_4)
    uint32_t r1_2 = *s_pWorldData
    
    if ((*(r1_2 + 0xa04) & 0xfffffffe) == 2 && *(r1_2 + 0x114) u< *(r1_2 + 0x10c))
        NetworkClientManager::RequestGameMoveBuffer(*s_pNetworkClientManager)
        r1_2 = *s_pWorldData
    
    *(r1_2 + 4)
    NetworkClientManager::RequestChatMessageBuffer(*s_pNetworkClientManager)
    uint32_t r0_10 = *s_pWorldData
    int32_t r1_4 = *(r0_10 + 0xd4)
    uint32_t r0_11
    
    if (r1_4 s< 1)
        r0_11 = 0
    else
        char* r2_2 = r0_10 + 0x1c
        int32_t r3_1 = 0
        r0_11 = 0
        
        do
            r3_1 += 1
            
            if (zx.d(*r2_2) == 0)
                r0_11 = *(r2_2 - 8)
            
            r2_2 = &r2_2[0x30]
        while (r3_1 s< r1_4)
    
    SetLocalPlayer(r0_11)
    result = *s_InterfaceContext
    *s_bShowLoadingOverlay = 1
    *(result + 0x10) = 1

return result
