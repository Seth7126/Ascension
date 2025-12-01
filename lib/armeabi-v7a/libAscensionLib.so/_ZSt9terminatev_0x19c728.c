// 函数: _ZSt9terminatev
// 地址: 0x19c728
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void** r0 = __cxa_get_globals_fast()
bool cond:0 = r0 != 0

if (r0 != 0)
    r0 = *r0
    cond:0 = r0 != 0

if (cond:0)
    int32_t r2_1 = r0[0xb]
    
    if ((((r0[0xa] u>> 8 | r2_1 << 0x18) ^ 0x47432b2b) | (0x434c4e ^ r2_1 u>> 8)) == 0)
        sub_19c7bc(r0[4])
        noreturn

uint32_t r0_1 = *__cxa_terminate_handler
__dmb_ISH()
sub_19c7bc(r0_1)
noreturn
