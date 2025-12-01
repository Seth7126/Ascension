// 函数: _ZNK9ascension7CPlayer16CountCardsInHandEv
// 地址: 0xedfec
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* entry_r0
void* r0_1 = *(entry_r0 + 0x3c)
int32_t i_1 = *(r0_1 + 0x18)

if (i_1 s< 1)
    return 0

int32_t* r2 = *(r0_1 + 0xc)
int32_t result = 0
int32_t i

do
    void* r3_1 = *r2
    r2 = &r2[1]
    
    if (*(*(r3_1 + 0xc) + 0x88) != 5)
        result += 1
    
    i = i_1
    i_1 -= 1
while (i != 1)
return result
