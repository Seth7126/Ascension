// 函数: _ZNK9ascension6CWorld20IsCardInKingdomStackEPN4core13CCardInstanceE
// 地址: 0xf4518
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r2 = *(arg1 + 0xa30)
int32_t r12 = *(arg1 + 0xa34)

if (r2 == r12)
    return 0

do
    void* lr_1 = *r2
    int32_t entry_r1
    
    if (*(lr_1 + 0x10) != 0 && *(lr_1 + 0x14) == entry_r1)
        return 1
    
    r2 = &r2[1]
while (r12 != r2)

return 0
