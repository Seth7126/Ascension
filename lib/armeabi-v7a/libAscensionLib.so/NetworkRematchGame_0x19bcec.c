// 函数: NetworkRematchGame
// 地址: 0x19bcec
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t result = NetworkClientManager::GetActiveGame(*s_pNetworkClientManager)

if (result == 0)
    return result

return NetworkClientManager::SubmitGameRematch(*s_pNetworkClientManager) __tailcall
