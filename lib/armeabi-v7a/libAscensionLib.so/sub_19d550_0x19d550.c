// 函数: sub_19d550
// 地址: 0x19d550
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t r2_1

if ((zx.d(*(arg1 + 8)) & 0x18) == 0)
    void* r0_2
    
    if (arg2 != 0)
        r0_2 = __dynamic_cast(arg2, _typeinfo_for___cxxabiv1::__shim_type_info, 
            _typeinfo_for___cxxabiv1::__pbase_type_info, 0)
    
    if (arg2 == 0 || r0_2 == 0)
        return 0
    
    r2_1 = zx.d(*(r0_2 + 8)) & 0x18
    
    if (r2_1 != 0)
        r2_1 = 1
else
    r2_1 = 1

return sub_19d38c(arg1, arg2, r2_1) __tailcall
