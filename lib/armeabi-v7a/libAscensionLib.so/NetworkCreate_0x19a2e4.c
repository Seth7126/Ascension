// 函数: NetworkCreate
// 地址: 0x19a2e4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t result = *s_pNetworkClientManager

if (result != 0)
    return result

void (* r0)(void*, AppWorldData*) = operator new(0x628)
NetworkClientManager::NetworkClientManager(r0, OnDeleteNetworkGame)
*s_pNetworkClientManager = r0
*s_networkState = 0
*s_pNetworkEvents = 0
return s_pNetworkEvents
