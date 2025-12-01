// 函数: sub_19d878
// 地址: 0x19d878
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (arg2 == _typeinfo_for_std::nullptr_t)
    int32_t r0_4 = *(arg1 + 0xc)
    void* const r6_1 = &data_1d4578
    
    if (r0_4 != 0 && __dynamic_cast(r0_4, _typeinfo_for___cxxabiv1::__shim_type_info, 
            _typeinfo_for___cxxabiv1::__function_type_info, 0) != 0)
        r6_1 = &data_1d4570
    
    *arg3 = r6_1
else if (sub_19d550(arg1, arg2) == 0)
    if (arg2 != 0)
        void* r0_3 = __dynamic_cast(arg2, _typeinfo_for___cxxabiv1::__shim_type_info, 
            _typeinfo_for___cxxabiv1::__pointer_to_member_type_info, 0)
        
        if (r0_3 == 0)
            return 0
        
        int32_t r1_1 = *(arg1 + 8)
        int32_t r2_1 = *(r0_3 + 8)
        int32_t r3_2 = (r2_1 & not.d(r1_1)) << 0x1d
        bool cond:1_1 = r3_2 == 0
        
        if (r3_2 == 0)
            cond:1_1 = (r1_1 & not.d(r2_1) & 0x60) == 0
        
        if (cond:1_1 && *(arg1 + 0xc) == *(r0_3 + 0xc))
            return __clz(*(arg1 + 0x10) - *(r0_3 + 0x10)) u>> 5
    
    return 0

return 1
