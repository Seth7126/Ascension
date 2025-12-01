// 函数: _ZNK17CGameStateOptions17IsWaitingForInputEj
// 地址: 0xb851c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r3 = *(arg1 + 0x48)
int32_t entry_r1

if (r3 == 0 || *(r3 + 0x30) != 0 || *(r3 + 0xc) != entry_r1)
    return 0

int32_t r1 = *(arg1 + 0x38)

if (r1 s> 1)
    return 1

int32_t temp0 = 0
uint32_t i = (r1 ^ 1) | zx.d(*(arg1 + 0x44))

while (i != 0)
    i u>>= 1
    temp0 += 1

return (0x20 - temp0) u>> 5
