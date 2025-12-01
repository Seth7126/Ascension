// 函数: sub_19d828
// 地址: 0x19d828
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (arg2 != 0)
    void* r0_1 = __dynamic_cast(arg2, _typeinfo_for___cxxabiv1::__shim_type_info, 
        _typeinfo_for___cxxabiv1::__pointer_to_member_type_info, 0)
    
    if (r0_1 == 0)
        return 0
    
    if ((*(r0_1 + 8) & not.d(*(arg1 + 8))) == 0 && *(arg1 + 0xc) == *(r0_1 + 0xc))
        return __clz(*(arg1 + 0x10) - *(r0_1 + 0x10)) u>> 5

return 0
