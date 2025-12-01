// 函数: _ZN4core10CCardStack7ShuffleEv
// 地址: 0xb6af4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* entry_r0
uint32_t r5 = *(entry_r0 + 4)
*(entry_r0 + 0x18)
void* r0_2 = core::CWorldBase::AddRollbackData(r5, zx.d(*(entry_r0 + 8)), 0x110)

if (r0_2 != 0)
    int32_t r3_1 = *(entry_r0 + 0x18)
    *(r0_2 + 0xc) = r3_1
    
    if (r3_1 s>= 1)
        int32_t r2_1 = *(entry_r0 + 0xc)
        int32_t r7_1 = 0
        
        do
            *(r0_2 + 0x10 + (r7_1 << 2)) = zx.d(*(*(r2_1 + (r7_1 << 2)) + 8))
            r7_1 += 1
            r3_1 = *(entry_r0 + 0x18)
        while (r7_1 s< r3_1)
    
    *(r0_2 + (r3_1 << 2) + 0x10) = 0

int32_t result = *(entry_r0 + 0x18)

if (result s>= 2)
    int32_t r7_2 = result - 1
    bool cond:0_1
    
    do
        result = (*(*r5 + 0xc))(r5, r7_2 + 1)
        int32_t r1_3 = *(entry_r0 + 0xc)
        cond:0_1 = r7_2 + 1 s> 2
        int32_t r3_4 = *(r1_3 + (r7_2 << 2))
        *(r1_3 + (r7_2 << 2)) = *(r1_3 + (result << 2))
        r7_2 -= 1
        *(*(entry_r0 + 0xc) + (result << 2)) = r3_4
    while (cond:0_1)

return result
