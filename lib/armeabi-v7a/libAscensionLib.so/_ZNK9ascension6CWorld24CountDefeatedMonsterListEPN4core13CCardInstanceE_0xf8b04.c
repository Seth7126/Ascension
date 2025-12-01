// 函数: _ZNK9ascension6CWorld24CountDefeatedMonsterListEPN4core13CCardInstanceE
// 地址: 0xf8b04
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r2 = *(arg1 + 0xb9c)
int32_t r12 = *(arg1 + 0xba0)
int32_t result = 0

if (r2 == r12)
    return 0

do
    int32_t r3_1 = *r2
    r2 = &r2[2]
    int32_t entry_r1
    int32_t lr_1 = r3_1 - entry_r1
    
    if (r3_1 != entry_r1)
        lr_1 = 1
    
    if (r3_1 != 0)
        r3_1 = 1
    
    result += lr_1 & r3_1
while (r12 != r2)

return result
