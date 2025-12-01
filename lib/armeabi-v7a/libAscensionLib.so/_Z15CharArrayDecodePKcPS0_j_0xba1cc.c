// 函数: _Z15CharArrayDecodePKcPS0_j
// 地址: 0xba1cc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = 0

if (arg1 != 0)
    char const* s = arg1
    
    if (zx.d(*arg1) != 0)
        result = 0
        
        do
            arg2[result] = s
            result += 1
            s = &s[strlen(s) + 1]
        while (zx.d(*s) != 0)

return result
