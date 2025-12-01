// 函数: _ZNK22CGameStateSimultaneous17GetPlayerTopStateEi
// 地址: 0xb8d18
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r12 = *(arg1 + 0x34)

if (r12 s< 1)
    return 0

void* r0_1 = arg1 + 0x38
int32_t r3 = 0

do
    int32_t entry_r1
    
    if (*(r0_1 + 0x20) == entry_r1)
        return *r0_1
    
    r3 += 1
    r0_1 += 0x30
while (r3 s< r12)

return 0
