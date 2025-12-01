// 函数: NetworkForfeitGame
// 地址: 0x19b514
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r0_1 = *s_pNetworkClientManager

if (r0_1 != 0)
    void* r0_2 = NetworkClientManager::GetActiveGame(r0_1)
    
    if (r0_2 != 0)
        AppWorldData* r0_3 = *s_pNetworkClientManager
        
        if (*(r0_2 + 0xa04) == 2)
            return NetworkClientManager::ForfeitGame(r0_3, r0_2.b)
        
        NetworkClientManager::SubmitGameFinished(r0_3)
        return 1

return 0
