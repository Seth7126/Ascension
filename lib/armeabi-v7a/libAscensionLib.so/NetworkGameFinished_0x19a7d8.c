// 函数: NetworkGameFinished
// 地址: 0x19a7d8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

AppWorldData* result = *s_pNetworkClientManager

if (result != 0)
    uint32_t r1_1 = *s_pWorldData
    
    if (r1_1 != 0)
        if (*(r1_1 + 0xf8) != 3)
            return result
        
        return NetworkClientManager::SubmitGameFinished(result) __tailcall

return result
