// 函数: _ZNK9ascension9CDatabase7GetCardEPKc
// 地址: 0xe5924
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r6 = *arg1
int32_t r7 = *(arg1 + 4)

if (r6 != r7)
    do
        void* result = *r6
        char* entry___s2
        
        if (strcasecmp(result + 4, entry___s2) == 0)
            return result
        
        r6 = &r6[1]
    while (r7 != r6)

return nullptr
