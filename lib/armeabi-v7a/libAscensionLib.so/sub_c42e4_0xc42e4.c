// 函数: sub_c42e4
// 地址: 0xc42e4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r12_1 = *arg1
uint32_t r2 = zx.d(*(r12_1 + 0x4e))
int32_t r1 = zx.d(arg1[0xc].b) + arg2

if (r1 s<= r2)
    return 

if (r1 s< 0xfa)
    *(r12_1 + 0x4e) = r1.b
    return 

int32_t lr
int32_t var_4 = lr
int32_t r11
int32_t var_8 = r11
int32_t* r0_1
int32_t r1_1
r0_1, r1_1 = sub_ce78c(arg1[3], "function or expression too complex", arg4, r2)

if (r1 == 0xfa)
    *arg4 = &var_8

return sub_c4328(r0_1, r1_1) __tailcall
