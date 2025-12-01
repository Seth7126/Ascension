// 函数: sub_1a2fd4
// 地址: 0x1a2fd4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* result_1 = sub_1a31a4(arg1)
void* result_2 = result_1
void* result

if (result_1 == 0)
    result = nullptr
else
    result = result_1
    char* r0_2 = *arg1
    
    if (arg1[1] != r0_2 && zx.d(*r0_2) == 0x49)
        result = nullptr
        void* r0_5 = sub_19fe78(arg1, 0)
        void* var_24 = r0_5
        
        if (r0_5 != 0)
            result = sub_1a0150(arg1, &result_2, &var_24)

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
