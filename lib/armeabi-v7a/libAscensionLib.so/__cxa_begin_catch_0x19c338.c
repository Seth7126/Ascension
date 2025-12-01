// 函数: __cxa_begin_catch
// 地址: 0x19c338
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r6 = *arg1
int32_t r5 = arg1[1]
void** r0 = __cxa_get_globals()

if (((0x47432b2b ^ (r6 u>> 8 | r5 << 0x18)) | (0x434c4e ^ r5 u>> 8)) != 0)
    if (*r0 != 0)
        std::terminate()
        noreturn
    
    *r0 = arg1 - 0x28
    return &arg1[0x16]

int32_t r2_1 = *(arg1 - 0x10)

if (r2_1 s< 0)
    r2_1 = 0 - r2_1

*(arg1 - 0x10) = r2_1 + 1
void* r2_3 = *r0

if (r2_3 != arg1 - 0x28)
    *(arg1 - 0x14) = r2_3
    *r0 = arg1 - 0x28

r0[1] -= 1
return arg1[9]
