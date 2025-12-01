// 函数: sub_1a31a4
// 地址: 0x1a31a4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* result = nullptr
int32_t r0 = *__stack_chk_guard
int32_t var_20 = 0

if (sub_1a07fe(arg1, &var_20) == 0)
    int32_t r0_3 = *arg1
    int32_t r2_1 = var_20
    
    if (r2_1 - 1 u>= arg1[1] - r0_3)
        result = nullptr
    else
        int32_t r2_2 = r2_1 + r0_3
        int32_t var_28 = r0_3
        int32_t var_24_1 = r2_2
        *arg1 = r2_2
        
        if (sub_19f488(&var_28, "_GLOBAL__N", &data_1d0087[0xa]) == 0)
            result = sub_1a3248(arg1, &var_28)
        else
            result = sub_19fbde(&arg1[0x5c], 0x10)
            *result =
                &_vtable_for_(anonymous namespace)::NameType{for `(anonymous namespace)::Node'}
            *(result + 4) = 0x1010107
            *(result + 8) = "(anonymous namespace)"
            *(result + 0xc) = &data_1d0092[0x15]

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
