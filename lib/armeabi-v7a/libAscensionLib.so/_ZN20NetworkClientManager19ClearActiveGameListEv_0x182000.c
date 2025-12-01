// 函数: _ZN20NetworkClientManager19ClearActiveGameListEv
// 地址: 0x182000
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* entry_r0
int32_t i = *(entry_r0 + 0xe0)

if (*(entry_r0 + 0xdc) != i)
    do
        int32_t r2_1 = *(entry_r0 + 0x500)
        int32_t* r0 = i - 4
        void* r5_1 = *r0
        
        if (r2_1 != 0)
            r2_1(*(entry_r0 + 0x504), r5_1)
            r0 = *(entry_r0 + 0xe0) - 4
        
        *(entry_r0 + 0xe0) = r0
        ClearAppWorldData(r5_1)
        
        if (r5_1 != 0)
            operator delete(r5_1)
        
        i = *(entry_r0 + 0xe0)
    while (*(entry_r0 + 0xdc) != i)

return i
