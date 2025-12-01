// 函数: sub_19facc
// 地址: 0x19facc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
char* r0_1 = *arg1
int32_t result

if (r0_1 == arg1[1])
    result = 1
else
    char* var_24
    int32_t var_20
    char* r0_4
    int32_t r1_3
    
    if (zx.d(*r0_1) == 0x68)
        *arg1 = &r0_1[1]
        result = 1
        sub_19ebc4(&var_24, arg1, 1)
        r0_4 = var_24
        r1_3 = var_20
    label_19fb04:
        
        if (r0_4 != r1_3)
            char* r0_5 = *arg1
            
            if (r0_5 == arg1[1] || zx.d(*r0_5) != 0x5f)
                result = 1
            else
                *arg1 = &r0_5[1]
                result = 0
    else if (zx.d(*r0_1) != 0x76)
        result = 1
    else
        *arg1 = &r0_1[1]
        result = 1
        sub_19ebc4(&var_24, arg1, 1)
        
        if (var_24 != var_20)
            char* r0_10 = *arg1
            
            if (r0_10 != arg1[1] && zx.d(*r0_10) == 0x5f)
                *arg1 = &r0_10[1]
                result = 1
                char* var_2c
                sub_19ebc4(&var_2c, arg1, 1)
                r0_4 = var_2c
                int32_t var_28
                r1_3 = var_28
                goto label_19fb04
            
            result = 1

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
