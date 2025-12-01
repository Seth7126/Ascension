// 函数: _Z13InitSocketUDPi
// 地址: 0x180094
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t __fd_1 = socket(2, 2, 0x11)
int32_t r0_3
int32_t __fd

if (__fd_1 s> 0xffffffff)
    __fd = __fd_1
    int32_t var_28_1 = 0
    int16_t __addr = 2
    int16_t var_2a_1 = (ror.w(arg1 u>> 0x10, 0x10) << 0x10).w | ror.w(arg1.w, 0x10)
    r0_3 = bind(__fd, &__addr, 0x10)

if (__fd_1 s<= 0xffffffff || r0_3 s<= 0xffffffff)
    printf("error: socket() failed")
    __fd = 0xffffffff

if (*__stack_chk_guard == r0)
    return __fd

__stack_chk_fail()
noreturn
