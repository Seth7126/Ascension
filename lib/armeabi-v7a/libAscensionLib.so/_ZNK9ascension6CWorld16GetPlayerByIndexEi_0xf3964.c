// 函数: _ZNK9ascension6CWorld16GetPlayerByIndexEi
// 地址: 0xf3964
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r2 = *(arg1 + 0x18)
int32_t r12 = *(arg1 + 0x1c)

if (r2 == r12)
    return 0

do
    void* result = *r2
    r2 = &r2[1]
    int32_t entry_r1
    
    if (*(result + 0xc) == entry_r1)
        return result
while (r12 != r2)

return 0
