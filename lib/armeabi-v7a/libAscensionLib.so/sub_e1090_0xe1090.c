// 函数: sub_e1090
// 地址: 0xe1090
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = 0
int32_t r0 = *__stack_chk_guard

if (arg3 != 0)
    int32_t result_5 = *arg1
    int32_t result_1 = arg3
    int32_t r6_1 = arg2
    int32_t result_2
    int32_t result_3
    
    do
        int32_t r1
        
        if (result_5 == 0)
            int32_t result_4
            int32_t r0_2 = arg1[2](arg1[4], arg1[3], &result_4)
            
            if (r0_2 != 0)
                result_2 = result_4
            
            if (r0_2 == 0 || result_2 == 0)
                result = result_1
                break
            
            r1 = r0_2
            *arg1 = result_2
            arg1[1] = r0_2
        else
            r1 = arg1[1]
            result_2 = result_5
        
        if (result_1 u<= result_2)
            result_2 = result_1
        
        __aeabi_memcpy(r6_1, r1, result_2)
        result_3 = result_1
        result_1 -= result_2
        r6_1 += result_2
        result_5 = *arg1 - result_2
        int32_t r1_3 = arg1[1] + result_2
        *arg1 = result_5
        arg1[1] = r1_3
    while (result_3 != result_2)

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
