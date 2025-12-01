// 函数: _ZNK9ascension6CWorld33GetAcquiredCardCountFromCenterRowEv
// 地址: 0xf897c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* entry_r0
void* r1 = *(entry_r0 + 0xb90)
int32_t r2 = *(entry_r0 + 0xb94)
int32_t result = 0

if (r1 == r2)
    return 0

do
    uint32_t r3_1 = zx.d(*(r1 + 4))
    r1 += 8
    
    if (r3_1 == 7)
        result += 1
while (r2 != r1)

return result
