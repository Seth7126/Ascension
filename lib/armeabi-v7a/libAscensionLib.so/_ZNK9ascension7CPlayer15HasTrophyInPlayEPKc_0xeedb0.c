// 函数: _ZNK9ascension7CPlayer15HasTrophyInPlayEPKc
// 地址: 0xeedb0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* i = *(arg1 + 0x60)

while (i != *(arg1 + 0x64))
    int32_t* r0_1 = *i
    i = &i[1]
    char* entry___s2
    
    if (strcasecmp((*(*r0_1 + 0xc))(), entry___s2) == 0)
        return 1

return 0
