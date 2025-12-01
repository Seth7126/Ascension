// 函数: _ZNK22CGameStateSimultaneous17IsWaitingForInputEv
// 地址: 0xb8b9c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* entry_r0
int32_t r1 = *(entry_r0 + 0x34)

if (r1 s>= 1)
    void* r5_1 = entry_r0 + 0x38
    int32_t r6_1 = 0
    
    do
        int32_t* r0 = *r5_1
        
        if (r0 != 0)
            if ((*(*r0 + 0x14))() != 0)
                return 1
            
            r1 = *(entry_r0 + 0x34)
        
        r6_1 += 1
        r5_1 += 0x30
    while (r6_1 s< r1)

return 0
