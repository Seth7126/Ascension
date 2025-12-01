// 函数: _ZN4core10CWorldBase20RandomizePlayerOrderEv
// 地址: 0xb7b90
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* entry_r0
int32_t result = entry_r0[7] - entry_r0[6]

if (result s>= 5)
    int32_t r6_1 = 0xffffffff + (result u>> 2)
    bool cond:0_1
    
    do
        result = (*(*entry_r0 + 0xc))(entry_r0, r6_1 + 1)
        int32_t r1_2 = entry_r0[6]
        cond:0_1 = r6_1 + 1 s> 2
        int32_t r3_1 = *(r1_2 + (r6_1 << 2))
        *(r1_2 + (r6_1 << 2)) = *(r1_2 + (result << 2))
        r6_1 -= 1
        *(entry_r0[6] + (result << 2)) = r3_1
    while (cond:0_1)

return result
