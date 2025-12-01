// 函数: _ZNK17CGameStateOptions17IsWaitingForInputEv
// 地址: 0xb84d0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* entry_r0
void* r2_2 = *(entry_r0 + 0x48)
int32_t result = 0

if (r2_2 != 0 && *(r2_2 + 0x30) == 0)
    int32_t r2_1 = *(entry_r0 + 0x38)
    result = 1
    
    if (r2_1 s<= 1)
        int32_t temp0 = 0
        uint32_t i = (r2_1 ^ 1) | zx.d(*(entry_r0 + 0x44))
        
        while (i != 0)
            i u>>= 1
            temp0 += 1
        
        return (0x20 - temp0) u>> 5

return result
