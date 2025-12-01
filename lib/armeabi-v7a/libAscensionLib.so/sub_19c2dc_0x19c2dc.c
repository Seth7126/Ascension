// 函数: sub_19c2dc
// 地址: 0x19c2dc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r1_1 = __cxa_get_globals() + 8
void* r2 = *r1_1

if (r2 == 0)
    std::terminate()
    noreturn

int32_t r3 = *(r2 + 0x2c)

if ((((*(r2 + 0x28) u>> 8 | r3 << 0x18) ^ 0x47432b2b) | (0x434c4e ^ r3 u>> 8)) != 0)
    *r1_1 = 0
else
    int32_t r3_4 = *(r2 + 0x20)
    *(r2 + 0x20) = r3_4 - 1
    
    if (r3_4 == 1)
        int32_t* r2_1 = r2 + 0x1c
        *r1_1 = *r2_1
        *r2_1 = 0

return r2 + 0x28
