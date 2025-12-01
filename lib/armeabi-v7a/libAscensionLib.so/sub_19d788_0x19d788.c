// 函数: sub_19d788
// 地址: 0x19d788
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
void* r5 = arg1
int32_t result

while (true)
    if (arg2 != 0)
        result = 0
        void* r0_2 = __dynamic_cast(arg2, _typeinfo_for___cxxabiv1::__shim_type_info, 
            _typeinfo_for___cxxabiv1::__pointer_type_info, 0)
        
        if (r0_2 == 0)
            break
        
        int32_t r1_2 = *(r5 + 8)
        
        if ((*(r0_2 + 8) & not.d(r1_2)) == 0)
            int32_t r0_4 = *(r5 + 0xc)
            
            if (r0_4 == *(r0_2 + 0xc))
                return 1
            
            int32_t r1_3 = r1_2 << 0x1f
            bool cond:1_1 = r1_3 != 0
            result = 0
            
            if (r1_3 != 0)
                cond:1_1 = r0_4 != 0
            
            if (not(cond:1_1))
                break
            
            void* r0 = __dynamic_cast(r0_4, _typeinfo_for___cxxabiv1::__shim_type_info, 
                _typeinfo_for___cxxabiv1::__pointer_type_info, 0)
            
            if (r0 == 0)
                int32_t r0_6 = *(r5 + 0xc)
                
                if (r0_6 != 0)
                    result = 0
                    int32_t r0_7 = __dynamic_cast(r0_6, _typeinfo_for___cxxabiv1::__shim_type_info, 
                        _typeinfo_for___cxxabiv1::__pointer_to_member_type_info, 0)
                    
                    if (r0_7 != 0)
                        return sub_19d828(r0_7, *(r0_2 + 0xc)) __tailcall
                    
                    break
            else
                arg2 = *(r0_2 + 0xc)
                r5 = r0
                continue
    
    return 0

return result
