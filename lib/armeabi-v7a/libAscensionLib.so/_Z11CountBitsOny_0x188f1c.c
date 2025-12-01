// 函数: _Z11CountBitsOny
// 地址: 0x188f1c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t entry_r0
int32_t entry_r1

if ((entry_r0 | entry_r1) == 0)
    return 0

int32_t result = 0

do
    bool c_1 = entry_r0 u>= 1
    result += 1
    entry_r0 &= entry_r0 - 1
    entry_r1 &= sbb.d(entry_r1, entry_r0, not.b(c_1))
while ((entry_r0 | entry_r1) != 0)

return result
