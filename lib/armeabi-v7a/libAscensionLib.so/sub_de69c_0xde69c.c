// 函数: sub_de69c
// 地址: 0xde69c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r1 = *__stack_chk_guard
int32_t r1_1 = arg1[2]
int32_t* result

if (r1_1 != 3)
    result = nullptr
    
    if ((r1_1 & 0xf) == 4)
        void* r0 = *arg1
        int64_t var_28
        int64_t q0
        
        if (sub_d2950(r0 + 0x10, *(r0 + 0xc), &var_28, q0) != 0)
            int64_t q0_1 = var_28
            result = arg2
            arg2[2] = 3
            *arg2 = q0_1
else
    result = arg1

if (*__stack_chk_guard == r1)
    return result

__stack_chk_fail()
noreturn
