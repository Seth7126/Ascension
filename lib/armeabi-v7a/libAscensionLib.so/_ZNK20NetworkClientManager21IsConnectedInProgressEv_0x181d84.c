// 函数: _ZNK20NetworkClientManager21IsConnectedInProgressEv
// 地址: 0x181d84
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t result = 0
void* entry_r0

if (zx.d(*(entry_r0 + 0x8e)) == 0)
    void* r2 = *(entry_r0 + 4)
    
    if (r2 != 0)
        if (zx.d(*(entry_r0 + 0x8d)) != 0)
            return 1
        
        result = zx.d(*(r2 + 0x19))
        
        if (result != 0)
            return 1

return result
