// 函数: _ZN22CReliableTCPConnection7ConnectEv
// 地址: 0xbade4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* entry_r0

if (connect(entry_r0[1], &entry_r0[2], 0x10) == 0)
    (**entry_r0)(entry_r0)
    entry_r0[6].b = 1
    return 1

int32_t result = *__errno()

if (result == 0x73)
    result = 1
    *(entry_r0 + 0x19) = 1

return result
