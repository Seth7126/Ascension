// 函数: _Z19OnDeleteNetworkGamePvP12AppWorldData
// 地址: 0x19a238
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r12 = 0

if (*s_pWorldData == arg2)
    *s_pWorldData = 0

uint32_t* const r0 = s_pNetworkClientManager

if (*s_pNetworkClientManager == 0)
    r0 = *0xe0 - *0xdc
    r12 = r0 s>> 2

uint32_t r2_1 = *s_numNetworkEvents

if (r2_1 s>= *s_maxNetworkEvents)
    return r0

uint32_t r3_1 = *s_pNetworkEvents
*(r3_1 + (r2_1 << 3)) = 6
*(r3_1 + (*s_numNetworkEvents << 3) + 4) = r12
uint32_t r0_5 = *s_numNetworkEvents + 1
*s_numNetworkEvents = r0_5
return r0_5
