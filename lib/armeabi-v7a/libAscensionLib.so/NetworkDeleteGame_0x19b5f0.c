// 函数: NetworkDeleteGame
// 地址: 0x19b5f0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (NetworkClientManager::GetActiveGame(*s_pNetworkClientManager) == 0)
    return 0

return NetworkClientManager::DeleteGame(*s_pNetworkClientManager)
