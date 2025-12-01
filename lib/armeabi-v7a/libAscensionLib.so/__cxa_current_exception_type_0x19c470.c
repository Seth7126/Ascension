// 函数: __cxa_current_exception_type
// 地址: 0x19c470
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r0 = __cxa_get_globals_fast()

if (r0 != 0)
    void* r0_1 = *r0
    
    if (r0_1 != 0)
        int32_t r2_1 = *(r0_1 + 0x2c)
        
        if ((((*(r0_1 + 0x28) u>> 8 | r2_1 << 0x18) ^ 0x47432b2b) | (0x434c4e ^ r2_1 u>> 8)) == 0)
            return *(r0_1 + 4)

return 0
