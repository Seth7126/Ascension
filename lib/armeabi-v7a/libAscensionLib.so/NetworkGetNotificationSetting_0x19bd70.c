// 函数: NetworkGetNotificationSetting
// 地址: 0x19bd70
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

char* r0_1 = NetworkClientManager::GetNotificationSetting(*s_pNetworkClientManager)

if (arg1 == 0 || r0_1 == 0)
    return 0

*arg1 = zx.d(*r0_1)
arg1[1] = zx.d(r0_1[1])
return 1
