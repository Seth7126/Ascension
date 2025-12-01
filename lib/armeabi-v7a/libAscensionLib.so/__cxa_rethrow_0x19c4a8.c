// 函数: __cxa_rethrow
// 地址: 0x19c4a8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r0 = __cxa_get_globals()
void* r5 = *r0

if (r5 != 0)
    int32_t r2_1 = *(r5 + 0x2c) ^ 0x434c4e47
    int32_t r6_2 = ((*(r5 + 0x28) & 0xffffff00) ^ 0x432b2b00) | r2_1
    int32_t r1_7
    
    if (r6_2 != 0)
        r1_7 = 0
        *r0 = 0
    else
        *(r5 + 0x18) = 0 - *(r5 + 0x18)
        r1_7 = r0[1] + 1
        r0[1] = r1_7
    
    sub_1a8504(r5 + 0x28, r1_7, r2_1, 0x434c4e47)
    __cxa_begin_catch(r5 + 0x28)
    
    if (r6_2 == 0)
        sub_19c7bc(*(r5 + 0x10))
        noreturn

std::terminate()
noreturn
