// 函数: _Z18OutputNetworkEventii
// 地址: 0x19a1c8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r3 = *s_maxNetworkEvents
uint32_t r2 = *s_numNetworkEvents

if (r2 s< r3)
    uint32_t r3_1 = *s_pNetworkEvents
    *(r3_1 + (r2 << 3)) = arg1
    *(r3_1 + (*s_numNetworkEvents << 3) + 4) = arg2
    r3 = *s_maxNetworkEvents
    r2 = *s_numNetworkEvents + 1
    *s_numNetworkEvents = r2

if (r2 s< r3)
    return 1

return 0
