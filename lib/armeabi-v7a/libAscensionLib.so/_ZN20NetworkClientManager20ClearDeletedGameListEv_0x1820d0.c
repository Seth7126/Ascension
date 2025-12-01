// 函数: _ZN20NetworkClientManager20ClearDeletedGameListEv
// 地址: 0x1820d0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* entry_r0
int32_t i = *(entry_r0 + 0xf8)

if (*(entry_r0 + 0xf4) != i)
    do
        void* r5_1 = *(i - 4)
        *(entry_r0 + 0xf8) = i - 4
        ClearAppWorldData(r5_1)
        
        if (r5_1 != 0)
            operator delete(r5_1)
        
        i = *(entry_r0 + 0xf8)
    while (*(entry_r0 + 0xf4) != i)

return i
