// 函数: _ZN15NetworkChatListD1Ev
// 地址: 0x181454
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* entry_r0
int32_t r2 = *(entry_r0 + 0x10)
void* r0 = *(entry_r0 + 0x14)

if (r2 != 0)
    int32_t r5_1 = 0
    
    do
        void* r1_1 = *(r0 + (r5_1 << 2))
        
        if (r1_1 != 0)
            operator delete(r1_1)
            r2 = *(entry_r0 + 0x10)
            r0 = *(entry_r0 + 0x14)
        
        r5_1 += 1
    while (r5_1 u< r2)

if (r0 != 0)
    operator delete[](r0)
