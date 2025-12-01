// 函数: GetIsOnlineGame
// 地址: 0x18a8a0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r0 = *s_pWorldData

if (r0 == 0)
    return 0

int32_t temp0_1 = 0
uint32_t i = *(r0 + 0xf8) - 3

while (i != 0)
    i u>>= 1
    temp0_1 += 1

return (0x20 - temp0_1) u>> 5
