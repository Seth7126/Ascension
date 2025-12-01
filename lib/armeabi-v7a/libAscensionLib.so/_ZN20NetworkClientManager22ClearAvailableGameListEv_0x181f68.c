// 函数: _ZN20NetworkClientManager22ClearAvailableGameListEv
// 地址: 0x181f68
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* entry_r0
int32_t r1 = *(entry_r0 + 0xd0)
void** r2 = *(entry_r0 + 0xd4)

if (r1 == r2)
    return 

void* r4_1 = entry_r0

do
    r2 -= 4
    entry_r0 = *r2
    *(r4_1 + 0xd4) = r2
    
    if (entry_r0 != 0)
        operator delete(entry_r0)
        r1 = *(r4_1 + 0xd0)
        r2 = *(r4_1 + 0xd4)
while (r1 != r2)
