// 函数: _ZN22CReliableTCPConnection8ShutdownEv
// 地址: 0xbae3c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* entry_r0
int32_t fd = *(entry_r0 + 4)
*(entry_r0 + 0x18) = 0
int32_t result = close(fd)
*(entry_r0 + 0x1c) = 0
*(entry_r0 + 0x20) = 0
return result
