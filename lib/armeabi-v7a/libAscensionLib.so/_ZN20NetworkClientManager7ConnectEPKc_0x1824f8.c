// 函数: _ZN20NetworkClientManager7ConnectEPKc
// 地址: 0x1824f8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

NetworkClientManager::InitServerComms()
uint32_t result = *(arg1 + 4)
*(arg1 + 0x90) = 0

if (result != 0)
    if (zx.d(*(result + 0x18)) != 0)
        if (zx.d(arg1[0xc]) != 0)
            NetworkClientManager::SendCreateAccountLogin(arg1)
        else if (zx.d(arg1[0xd]) != 0)
            NetworkClientManager::SendPasswordLogin(arg1)
            undefined
        
        *(arg1 + 0xc) = 0
        return 0
    
    result = zx.d(*(result + 0x19))
    
    if (result != 0)
        result = 1
        arg1[0x8d] = 1

return result
