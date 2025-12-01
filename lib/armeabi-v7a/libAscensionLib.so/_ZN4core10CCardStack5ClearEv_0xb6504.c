// 函数: _ZN4core10CCardStack5ClearEv
// 地址: 0xb6504
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* entry_r0
*(entry_r0 + 0x18)
void* r0_1 = core::CWorldBase::AddRollbackData(*(entry_r0 + 4), zx.d(*(entry_r0 + 8)), 0x110)

if (r0_1 != 0)
    int32_t r3_1 = *(entry_r0 + 0x18)
    *(r0_1 + 0xc) = r3_1
    
    if (r3_1 s>= 1)
        int32_t r2_1 = *(entry_r0 + 0xc)
        int32_t r4_1 = 0
        
        do
            *(r0_1 + 0x10 + (r4_1 << 2)) = zx.d(*(*(r2_1 + (r4_1 << 2)) + 8))
            r4_1 += 1
            r3_1 = *(entry_r0 + 0x18)
        while (r4_1 s< r3_1)
    
    *(r0_1 + (r3_1 << 2) + 0x10) = 0

int32_t result = *(entry_r0 + 0xc)
*(entry_r0 + 0x18) = 0
*(entry_r0 + 0x10) = result
return result
