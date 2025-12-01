// 函数: _ZN22CReliableUDPConnection8ShutdownEv
// 地址: 0xba77c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* entry_r0
int32_t i = *(entry_r0 + 0x34)
int32_t result = 0
*(entry_r0 + 0x20) = 0

if (i != 0)
    do
        void* r0 = *(entry_r0 + 0x30)
        int32_t* temp0_1 = r0
        void* r2_1 = *temp0_1
        void* r5_1 = temp0_1[2]
        *(r2_1 + 4) = temp0_1[1]
        **(r0 + 4) = r2_1
        *(entry_r0 + 0x34) = i - 1
        result = operator delete(r0)
        
        if (r5_1 != 0)
            result = operator delete(r5_1)
        
        i = *(entry_r0 + 0x34)
    while (i != 0)

while (true)
    int32_t r1_1 = *(entry_r0 + 0x40)
    
    if (r1_1 == 0)
        break
    
    void* r0_3 = *(entry_r0 + 0x3c)
    int32_t* temp0_2 = r0_3
    void* r2_2 = *temp0_2
    void* r5_2 = temp0_2[2]
    *(r2_2 + 4) = temp0_2[1]
    **(r0_3 + 4) = r2_2
    *(entry_r0 + 0x40) = r1_1 - 1
    result = operator delete(r0_3)
    
    if (r5_2 != 0)
        result = operator delete(r5_2)

return result
