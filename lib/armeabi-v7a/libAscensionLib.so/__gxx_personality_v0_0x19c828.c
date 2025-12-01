// 函数: __gxx_personality_v0
// 地址: 0x19c828
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t result = 3

if (arg2 != 0 && arg3 != 0)
    int32_t r0_1 = arg1 & 0xfffffff7
    
    if (r0_1 == 2)
        result = sub_19c984(arg2, arg3)
    else
        int32_t r2 = *arg2
        int32_t r9_1 = arg2[1]
        int32_t r8_1 = r2 & 0xffffff00
        int32_t var_48
        int32_t result_1
        
        if (r0_1 == 1)
            if (arg2[8] != sub_19ccbc(arg3, 0xd, r2))
                sub_19c998(&var_48, 2, __clz((0x434c4e47 ^ r9_1) | (0x432b2b00 ^ r8_1)) u>> 5, 
                    arg2, arg3)
                result = result_1
                
                if (result == 8)
                    result = sub_19c984(arg2, arg3)
                else if (result == 6)
                    __cxa_begin_cleanup(arg2)
                    sub_19cd10(arg2, arg3, &var_48)
                    result = 7
            else
                if (((0x434c4e47 ^ r9_1) | (0x432b2b00 ^ r8_1)) != 0)
                    sub_19c998(&var_48, 6, 0, arg2, arg3)
                    
                    if (result_1 != 6)
                        sub_19ccf4(0, arg2)
                        noreturn
                else
                    int32_t r0_13 = arg2[0xd]
                    int32_t var_40_1 = arg2[0xa]
                    int32_t var_3c_1 = arg2[0xb]
                    int32_t var_38_1 = arg2[0xc]
                    int32_t var_34_1 = arg2[9]
                    var_48 = r0_13
                    int32_t var_30 = 6
                    int32_t var_44_1 = r0_13 s>> 0x1f
                
                sub_19cd10(arg2, arg3, &var_48)
                result = 7
        else if (r0_1 != 0)
            result = 3
        else if (arg1 << 0x1c s< 0)
            result = sub_19c984(arg2, arg3)
        else
            int32_t r8_2 = (0x432b2b00 ^ r8_1) | (0x434c4e47 ^ r9_1)
            int32_t r2_2 = sub_19c998(&var_48, 1, __clz(r8_2) u>> 5, arg2, arg3)
            result = result_1
            
            if (result == 8)
                result = sub_19c984(arg2, arg3)
            else if (result == 6)
                arg2[8] = sub_19ccbc(arg3, 0xd, r2_2)
                
                if (r8_2 == 0)
                    int32_t r5_2 = var_48
                    int32_t var_34
                    arg2[9] = var_34
                    int32_t var_40
                    arg2[0xa] = var_40
                    int32_t var_3c
                    arg2[0xb] = var_3c
                    int32_t var_38
                    arg2[0xc] = var_38
                    arg2[0xd] = r5_2
                
                result = 6

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
