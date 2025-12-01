// 函数: sub_1a8504
// 地址: 0x1a8504
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r5
int32_t var_10 = r5
int32_t r0 = *__stack_chk_guard
void var_420
int32_t __saved_r7
int32_t r9
int32_t r10
int32_t r11
int32_t r12
sub_1a87b0(&var_420, arg2, arg3, arg4, arg1, r5, &var_420, &__saved_r7, __stack_chk_guard, r9, r10, 
    r11, r12)
*(arg1 + 0xc) = 0
void var_880
sub_1a87e0(&var_880, &var_420)
int32_t result

while (true)
    int32_t var_8a8
    int32_t var_89c
    
    if (sub_1a891e(&var_880, &var_8a8) == 0)
        if (var_89c == 0)
            continue
        else
            *(arg1 + 0x48) = var_8a8
            int32_t var_888
            *(arg1 + 0x4c) = var_888
            int32_t var_894
            *(arg1 + 0x50) = var_894
            int32_t r0_6 = var_89c(0, arg1, &var_880)
            
            if (r0_6 == 8)
                continue
            else
                if (r0_6 == 6)
                    sub_1a85a4(&var_420, &var_880, arg1, 0)
                    result = 2
                    break
                
                if (r0_6 == 9)
                    result = 9
                    break
    result = 3
    break

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
