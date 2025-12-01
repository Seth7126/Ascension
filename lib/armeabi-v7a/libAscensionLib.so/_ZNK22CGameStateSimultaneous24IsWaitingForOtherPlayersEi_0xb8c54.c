// 函数: _ZNK22CGameStateSimultaneous24IsWaitingForOtherPlayersEi
// 地址: 0xb8c54
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r12 = *(arg1 + 0x34)

if (r12 s>= 1)
    void* r0 = arg1 + 0x38
    int32_t r3_1 = 0
    
    do
        int32_t entry_r1
        
        if (*(r0 + 0x20) == entry_r1)
            int32_t* r0_2 = *r0
            
            if (r0_2 == 0)
                return 1
            
            jump(*(*r0_2 + 0x1c))
        
        r3_1 += 1
        r0 += 0x30
    while (r3_1 s< r12)

return 0
