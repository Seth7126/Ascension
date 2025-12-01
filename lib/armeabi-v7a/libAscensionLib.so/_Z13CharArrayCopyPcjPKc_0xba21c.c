// 函数: _Z13CharArrayCopyPcjPKc
// 地址: 0xba21c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r2

if (zx.d(*arg3) == 0)
    r2 = 1
else
    int32_t r4_1 = 0
    char const* s = arg3
    
    do
        int32_t r0_3 = strlen(s) + 1
        r4_1 += r0_3
        s = &s[r0_3]
    while (zx.d(*s) != 0)
    
    r2 = r4_1 + 1

if (r2 u> arg2)
    r2 = arg2

__aeabi_memcpy(arg1, arg3, r2)
return arg1
