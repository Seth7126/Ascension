// 函数: _ZNK22CGameStateSimultaneous23GetWaitingForInputCountEv
// 地址: 0xb8ca8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* entry_r0
int32_t r2 = *(entry_r0 + 0x34)

if (r2 s< 1)
    return 0

void* r6 = entry_r0 + 0x38
int32_t r7 = 0
int32_t result = 0

do
    int32_t* r1_1 = *r6
    int32_t r0 = 0
    
    if (r1_1 != 0)
        r0 = (*(*r1_1 + 0x20))(r1_1)
        r2 = *(entry_r0 + 0x34)
    
    r7 += 1
    result += r0
    r6 += 0x30
while (r7 s< r2)

return result
