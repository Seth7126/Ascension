// 函数: sub_de72c
// 地址: 0xde72c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t result = 0

if (arg2[1].d == 3)
    int128_t q0
    q0.q = *arg2
    unimplemented  {vmov r2, r3, d0}
    char str[0x20]
    void* r0_4 = sub_d7eb4(arg1, &str, sprintf(&str, "%.14g"))
    *arg2 = r0_4
    arg2[1].d = zx.d(*(r0_4 + 4)) | 0x40
    result = 1

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
