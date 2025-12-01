// 函数: __cxa_begin_cleanup
// 地址: 0x19c284
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0 = __cxa_get_globals()
int32_t r2 = arg1[1]

if ((((*arg1 u>> 8 | r2 << 0x18) ^ 0x47432b2b) | (0x434c4e ^ r2 u>> 8)) != 0)
    if (*(r0 + 8) != 0)
        std::terminate()
        noreturn
    
    *(r0 + 8) = arg1 - 0x28
else
    int32_t r2_1 = *(arg1 - 8)
    
    if (r2_1 == 0)
        *(arg1 - 0xc) = *(r0 + 8)
        *(r0 + 8) = arg1 - 0x28
    
    *(arg1 - 8) = r2_1 + 1

return 1
