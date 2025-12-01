// 函数: sub_1a256c
// 地址: 0x1a256c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t var_c = arg4
char* r5
char* var_10 = r5
int32_t r4
int32_t var_14 = r4
int32_t __saved_r7
int32_t* var_24 = &__saved_r7
char* var_2c = r5
int32_t var_30 = r4
int32_t r0 = *__stack_chk_guard
char* r0_2 = sub_19ebc4(&var_2c, arg1, 1)
char* r5_1 = var_2c
bool cond:0 = r5_1 == arg4

if (r5_1 != arg4)
    r0_2 = *arg1
    cond:0 = r0_2 == arg1[1]

void* result

if (cond:0 || zx.d(*r0_2) != 0x45)
    result = nullptr
else
    *arg1 = &r0_2[1]
    result = sub_19fbde(&arg1[0x5c], 0x18)
    *result = &_vtable_for_(anonymous namespace)::IntegerExpr{for `(anonymous namespace)::Node'}
    *(result + 4) = 0x101012a
    *(result + 8) = arg2
    *(result + 0xc) = arg3
    *(result + 0x10) = r5_1
    *(result + 0x14) = arg4

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
