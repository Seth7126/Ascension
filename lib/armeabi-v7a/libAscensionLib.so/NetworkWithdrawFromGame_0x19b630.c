// 函数: NetworkWithdrawFromGame
// 地址: 0x19b630
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (NetworkClientManager::GetActiveGame(*s_pNetworkClientManager) == 0)
    return 0

return NetworkClientManager::WithdrawFromGame(*s_pNetworkClientManager)
