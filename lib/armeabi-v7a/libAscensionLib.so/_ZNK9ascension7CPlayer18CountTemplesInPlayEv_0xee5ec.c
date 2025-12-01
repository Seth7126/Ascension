// 函数: _ZNK9ascension7CPlayer18CountTemplesInPlayEv
// 地址: 0xee5ec
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* entry_r0
int32_t* r1 = *(entry_r0 + 0x48)
int32_t r2 = *(entry_r0 + 0x4c)
int32_t result = 0

if (r1 == r2)
    return 0

do
    void* r3_2 = *(*r1 + 0x10)
    
    if (r3_2 != 0 && *(*(r3_2 + 0xc) + 0x88) == 0xa)
        result += 1
    
    r1 = &r1[1]
while (r2 != r1)

return result
