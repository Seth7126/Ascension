// 函数: _ZNSt6__ndk16vectorIPN4core13CCardInstanceENS_9allocatorIS3_EEE7reserveEj
// 地址: 0xb6308
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
void* r4 = *arg1
void* result = *(arg1 + 8) - r4
int32_t entry_r1

if (entry_r1 u> result s>> 2)
    if (entry_r1 u>= 0x40000000)
        char* thrown_exception_1 = __cxa_allocate_exception(8)
        void** thrown_exception = thrown_exception_1
        std::logic_error::logic_error(thrown_exception_1)
        *thrown_exception = _vtable_for_std::length_error + 8
        __cxa_throw(thrown_exception, _typeinfo_for_std::length_error, 
            std::length_error::~length_error)
        noreturn
    
    int32_t r9_1 = *(arg1 + 4)
    result = operator new(entry_r1 << 2)
    void* r2_1 = r9_1 - r4
    void* r8_1 = result + (entry_r1 << 2)
    void* r6_2 = result + r2_1
    void* result_1 = result
    
    if (r2_1 s>= 1)
        result = __aeabi_memcpy4(result_1, r4)
    
    *arg1 = result_1
    *(arg1 + 4) = r6_2
    *(arg1 + 8) = r8_1
    
    if (r4 != 0)
        return operator delete(r4) __tailcall

return result
