// 函数: _Z13InitSocketTCPi
// 地址: 0x180134
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t __fd_1 = socket(2, 1, 0)
int32_t __fd

if (__fd_1 s<= 0xffffffff)
    printf("error: socket() failed")
    __fd = 0xffffffff
else
    __fd = __fd_1
    int32_t __optval = 1
    setsockopt(__fd, 6, 1, &__optval, 4)

if (*__stack_chk_guard == r0)
    return __fd

__stack_chk_fail()
noreturn
