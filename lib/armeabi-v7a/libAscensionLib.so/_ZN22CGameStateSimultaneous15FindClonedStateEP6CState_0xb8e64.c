// 函数: _ZN22CGameStateSimultaneous15FindClonedStateEP6CState
// 地址: 0xb8e64
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t r1 = *(arg1 + 0x34)

if (r1 s>= 1)
    void* __offset(CState, 0x38) r6_1 = arg1 + 0x38
    int32_t r7_1 = 0
    
    do
        int32_t* r0 = *r6_1
        
        if (r0 != 0)
            int32_t entry_r1
            int32_t result = (*(*r0 + 0x30))(r0, entry_r1)
            
            if (result != 0)
                return result
            
            r1 = *(arg1 + 0x34)
        
        r7_1 += 1
        r6_1 += 0x30
    while (r7_1 s< r1)

return CState::FindClonedState(arg1) __tailcall
