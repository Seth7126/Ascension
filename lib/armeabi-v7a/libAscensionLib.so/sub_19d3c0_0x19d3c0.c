// 函数: sub_19d3c0
// 地址: 0x19d3c0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t result

if (arg1 == arg2)
    result = 1
else if (arg2 == 0)
    result = 0
else
    result = 0
    int32_t* r0_2 = __dynamic_cast(arg2, _typeinfo_for___cxxabiv1::__shim_type_info, 
        _typeinfo_for___cxxabiv1::__class_type_info, 0)
    
    if (r0_2 != 0)
        int32_t* var_60 = r0_2
        int32_t var_5c_1 = 0
        int32_t var_54_1 = 0xffffffff
        int32_t var_50
        __aeabi_memclr8(&var_50, 0x27)
        int32_t var_30_1 = 1
        (*(*r0_2 + 0x1c))(r0_2, &var_60, *arg3, 1, var_60, var_5c_1, arg1, var_54_1)
        int32_t var_48
        
        if (var_48 == 1)
            *arg3 = var_50
            result = 1

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
