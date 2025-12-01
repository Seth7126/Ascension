// 函数: NetworkGetChatChannelMessageCount
// 地址: 0x19b6f0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r0 = *s_pNetworkClientManager
void* r0_2

if (arg1 == 0)
    r0_2 = r0 + 0x5e0
else
    int32_t* r2_1 = *(r0 + 0xdc)
    int32_t lr_1 = *(r0 + 0xe0)
    
    if (r2_1 == lr_1)
        return 0
    
    while (true)
        void* r1_1 = *r2_1
        r2_1 = &r2_1[1]
        
        if (*(r1_1 + 4) == arg1)
            r0_2 = r1_1 + 0xa28
            break
        
        if (lr_1 == r2_1)
            return 0

void* r0_3 = *r0_2

if (r0_3 == 0)
    return 0

return *(r0_3 + 8)
