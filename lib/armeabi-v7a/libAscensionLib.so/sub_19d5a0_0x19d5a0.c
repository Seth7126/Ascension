// 函数: sub_19d5a0
// 地址: 0x19d5a0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t r1 = *__stack_chk_guard
uint32_t result

if (arg2 == _typeinfo_for_std::nullptr_t)
    *arg3 = 0
    result = 1
else if (sub_19d550(arg1, arg2) != 0)
    int32_t* r0_2 = *arg3
    
    if (r0_2 == 0)
        result = 1
    else
        *arg3 = *r0_2
        result = 1
else if (arg2 == 0)
    result = 0
else
    result = 0
    void* r0_5 = __dynamic_cast(arg2, _typeinfo_for___cxxabiv1::__shim_type_info, 
        _typeinfo_for___cxxabiv1::__pointer_type_info, 0)
    
    if (r0_5 != 0)
        int32_t* r0_6 = *arg3
        
        if (r0_6 != 0)
            *arg3 = *r0_6
        
        int32_t r0_8 = *(arg1 + 8)
        int32_t r1_3 = *(r0_5 + 8)
        int32_t r2_2 = (r1_3 & not.d(r0_8)) << 0x1d
        bool cond:1_1 = r2_2 == 0
        
        if (r2_2 == 0)
            cond:1_1 = (r0_8 & not.d(r1_3) & 0x60) == 0
        
        if (cond:1_1)
            int32_t r0_13 = *(r0_5 + 0xc)
            int32_t r1_5 = *(arg1 + 0xc)
            
            if (r1_5 == r0_13)
                result = 1
            else if (r1_5 == _typeinfo_for_void)
                if (r0_13 == 0)
                    result = 1
                else
                    result = __clz(__dynamic_cast(r0_13, 
                        _typeinfo_for___cxxabiv1::__shim_type_info, 
                        _typeinfo_for___cxxabiv1::__function_type_info, 0)) u>> 5
            else if (r1_5 == 0)
                result = 0
            else
                int32_t r0_15 = __dynamic_cast(r1_5, _typeinfo_for___cxxabiv1::__shim_type_info, 
                    _typeinfo_for___cxxabiv1::__pointer_type_info, 0)
                
                if (r0_15 == 0)
                    int32_t r0_19 = *(arg1 + 0xc)
                    
                    if (r0_19 == 0)
                        result = 0
                    else
                        int32_t r0_20 = __dynamic_cast(r0_19, 
                            _typeinfo_for___cxxabiv1::__shim_type_info, 
                            _typeinfo_for___cxxabiv1::__pointer_to_member_type_info, 0)
                        
                        if (r0_20 == 0)
                            int32_t r0_22 = *(arg1 + 0xc)
                            
                            if (r0_22 == 0)
                                result = 0
                            else
                                result = 0
                                int32_t r0_23 = __dynamic_cast(r0_22, 
                                    _typeinfo_for___cxxabiv1::__shim_type_info, 
                                    _typeinfo_for___cxxabiv1::__class_type_info, 0)
                                
                                if (r0_23 != 0)
                                    int32_t r0_24 = *(r0_5 + 0xc)
                                    
                                    if (r0_24 == 0)
                                        result = 0
                                    else
                                        result = 0
                                        int32_t* r0_25 = __dynamic_cast(r0_24, 
                                            _typeinfo_for___cxxabiv1::__shim_type_info, 
                                            _typeinfo_for___cxxabiv1::__class_type_info, 0)
                                        
                                        if (r0_25 != 0)
                                            int32_t* var_60 = r0_25
                                            int32_t var_5c_1 = 0
                                            int32_t var_54_1 = 0xffffffff
                                            int32_t var_50
                                            __aeabi_memclr8(&var_50, 0x27)
                                            int32_t var_30_1 = 1
                                            (*(*r0_25 + 0x1c))(r0_25, &var_60, *arg3, 1, var_60, 
                                                var_5c_1, r0_23, var_54_1)
                                            int32_t var_48
                                            
                                            if (var_48 == 1)
                                                if (*arg3 == 0)
                                                    result = 1
                                                else
                                                    *arg3 = var_50
                                                    result = 1
                        else
                            if (zx.d(*(arg1 + 8)) << 0x1f != 0)
                                if (*__stack_chk_guard == r1)
                                    return sub_19d828(r0_20, *(r0_5 + 0xc)) __tailcall
                                
                                jump(0x19d6e4)
                            
                            result = 0
                else
                    if (zx.d(*(arg1 + 8)) << 0x1f != 0)
                        if (*__stack_chk_guard == r1)
                            return sub_19d788(r0_15, *(r0_5 + 0xc)) __tailcall
                        
                        jump(0x19d68e)
                    
                    result = 0
        else
            result = 0

if (*__stack_chk_guard == r1)
    return result

__stack_chk_fail()
noreturn
