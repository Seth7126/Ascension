// 函数: __dynamic_cast
// 地址: 0x19d92c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t r0_1 = *arg1
int32_t r9 = *(r0_1 - 8)
int32_t* r6 = *(r0_1 - 4)
int32_t* var_60 = arg3
int32_t* var_5c = arg1
int32_t var_58 = arg2
int32_t r3
int32_t var_54 = r3
void* result_1
__aeabi_memclr8(&result_1, 0x27)
void* result_3 = arg1 + r9
void* result
int32_t var_48

if (r6 == arg3)
    int32_t var_30_1 = 1
    (*(*arg3 + 0x14))(arg3, &var_60, result_3, result_3, 1, 0)
    
    if (var_48 != 1)
        result_3 = nullptr
    
    result = result_3
else
    result = nullptr
    (*(*r6 + 0x18))(r6, &var_60, result_3, 1, 0)
    int32_t var_3c
    int32_t var_44
    int32_t var_40
    int32_t var_38
    
    if (var_3c == 1)
        if (var_48 == 1)
            result = result_1
        else
            result = nullptr
            
            if (var_38 == 0)
                bool cond:0_1 = var_44 != 1
                
                if (var_44 == 1)
                    cond:0_1 = var_40 != 1
                
                if (not(cond:0_1))
                    result = result_1
    else if (var_3c == 0)
        void* result_2
        result = result_2
        
        if (((var_44 ^ 1) | (var_38 ^ 1) | (var_40 ^ 1)) != 0)
            result = nullptr

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
