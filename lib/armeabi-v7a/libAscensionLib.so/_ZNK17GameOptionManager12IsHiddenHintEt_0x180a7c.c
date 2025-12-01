// 函数: _ZNK17GameOptionManager12IsHiddenHintEt
// 地址: 0x180a7c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r2 = arg1
int32_t entry_r1

if (entry_r1 != 0)
    r2 = *(r2 + 0x3fc)

if (entry_r1 == 0 || r2 == 0)
    return 0

int32_t r12 = *(r2 + 0x98)

if (r12 s< 1)
    return 0

void* r2_1 = *(r2 + 0xa0)
int16_t* r0_1 = r2_1 + 6
int32_t r2_2 = 0

do
    if (zx.d(*(r2_1 + 8 + (r2_2 << 6))) != 0 && zx.d(*r0_1) == entry_r1)
        return 1
    
    r2_2 += 1
    r0_1 = &r0_1[0x20]
while (r2_2 s< r12)

return 0
