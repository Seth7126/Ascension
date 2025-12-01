// 函数: _ZNSt6__ndk16vectorIPN4core9CInstanceENS_9allocatorIS3_EEE21__push_back_slow_pathIS3_EEvOT_
// 地址: 0xf07f8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
core::CInstance* r9 = *arg1
void* r6 = arg1[1] - r9
int32_t r0_1 = 1 + (r6 s>> 2)

if (r0_1 u>= 0x40000000)
    std::__ndk1::__vector_base_common<true>::__throw_length_error()
else
    int32_t r4_1 = 0x3fffffff
    void* r1_1 = arg1[2] - r9
    int32_t r2_1 = r1_1 s>> 2
    int32_t r7
    
    if (r2_1 != 0x1ffffffe && r2_1 u>= 0x1ffffffe)
    label_f0860:
        r7 = operator new(r4_1 << 2)
    label_f0864:
        int32_t result = r6 s>> 2
        int32_t* r2_3 = r7 + (result << 2)
        int32_t* entry_r1
        *r2_3 = *entry_r1
        
        if (r6 s>= 1)
            result = __aeabi_memcpy4(r7, r9, r6)
        
        int32_t* temp0 = arg1
        *temp0 = r7
        temp0[1] = &r2_3[1]
        arg1[2] = r7 + (r4_1 << 2)
        
        if (r9 == 0)
            return result
        
        return operator delete(r9) __tailcall
    
    if (r0_1 u<= r1_1 s>> 1)
        r0_1 = r1_1 s>> 1
    
    if (r0_1 == 0)
        r4_1 = 0
        r7 = 0
        goto label_f0864
    
    r4_1 = r0_1
    
    if (r0_1 u< 0x40000000)
        goto label_f0860

char* thrown_exception_1 = __cxa_allocate_exception(8)
void** thrown_exception = thrown_exception_1
std::logic_error::logic_error(thrown_exception_1)
*thrown_exception = _vtable_for_std::length_error + 8
__cxa_throw(thrown_exception, _typeinfo_for_std::length_error, std::length_error::~length_error)
noreturn
