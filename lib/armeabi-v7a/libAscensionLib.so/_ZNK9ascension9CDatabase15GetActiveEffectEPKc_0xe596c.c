// 函数: _ZNK9ascension9CDatabase15GetActiveEffectEPKc
// 地址: 0xe596c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r6 = *(arg1 + 0xc)
int32_t r7 = *(arg1 + 0x10)

if (r6 != r7)
    do
        void* result = *r6
        r6 = &r6[1]
        char* entry___s2
        
        if (strcasecmp(result + 0x1c, entry___s2) == 0)
            return result
    while (r7 != r6)

return 0
