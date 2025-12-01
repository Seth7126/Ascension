// 函数: _ZNK9ascension7CPlayer18HasConstructInPlayEPKN4core13CCardInstanceE
// 地址: 0xee82c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r2 = *(arg1 + 0x54)
int32_t r12 = *(arg1 + 0x58)

if (r2 == r12)
    return 0

do
    void* r3_1 = *r2
    r2 = &r2[1]
    int32_t entry_r1
    
    if (*(r3_1 + 0x10) == entry_r1)
        return 1
while (r12 != r2)

return 0
