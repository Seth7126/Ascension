// 函数: NetworkAcceptGameInvite
// 地址: 0x19b6b0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (NetworkClientManager::GetActiveGame(*s_pNetworkClientManager) == 0)
    return 0

return NetworkClientManager::AcceptGameInvite(*s_pNetworkClientManager)
