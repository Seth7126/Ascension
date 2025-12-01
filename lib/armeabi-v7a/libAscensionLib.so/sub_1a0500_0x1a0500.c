// 函数: sub_1a0500
// 地址: 0x1a0500
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t var_c = arg3
int32_t r5
int32_t var_10 = r5
int32_t r4
int32_t var_14 = r4
int32_t __saved_r7
int32_t* var_28 = &__saved_r7
int32_t var_30 = r5
int32_t var_34 = r4
int32_t r3
int32_t var_38 = r3
void* result = arg2
int32_t (__convention("cdecl")* const var_34_1)() = __stack_chk_guard
int32_t r0 = *__stack_chk_guard

while (true)
    char* r0_4 = *arg1
    
    if (r0_4 == arg1[1])
        break
    
    if (zx.d(*r0_4) != 0x42)
        break
    
    *arg1 = &r0_4[1]
    sub_1a3ecc(&var_30, arg1)
    int32_t r9_1 = var_30
    
    if (r9_1 == arg3)
        result = nullptr
        break
    
    void* result_1 = sub_19fbde(&arg1[0x5c], 0x14)
    char r1_2 = *(result + 7)
    int16_t r2_1 = *(result + 5)
    *result_1 = &_vtable_for_(anonymous namespace)::AbiTagAttr{for `(anonymous namespace)::Node'}
    *(result_1 + 5) = r2_1
    *(result_1 + 8) = result
    *(result_1 + 0xc) = r9_1
    result = result_1
    *(result_1 + 0x10) = arg3
    *(result_1 + 7) = r1_2
    *(result_1 + 4) = 8

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
