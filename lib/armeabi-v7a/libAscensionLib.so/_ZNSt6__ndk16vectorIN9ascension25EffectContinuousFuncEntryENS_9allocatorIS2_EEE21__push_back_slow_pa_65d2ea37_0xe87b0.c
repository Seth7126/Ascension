// 函数: _ZNSt6__ndk16vectorIN9ascension25EffectContinuousFuncEntryENS_9allocatorIS2_EEE21__push_back_slow_pathIRKS2_EEvOT_
// 地址: 0xe87b0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
ascension::EffectContinuousFuncEntry const& r8 = *arg1
void* r9 = arg1[1] - r8
int32_t r0_1 = 1 + (r9 s>> 4)

if (r0_1 u>= 0x10000000)
    std::__ndk1::__vector_base_common<true>::__throw_length_error()
else
    int32_t r10_1 = 0xfffffff
    void* r1_1 = arg1[2] - r8
    int32_t r2_1 = r1_1 s>> 4
    int32_t r6
    
    if (r2_1 != 0x7fffffe && r2_1 u>= 0x7fffffe)
    label_e881c:
        r6 = operator new(r10_1 << 4)
    label_e8820:
        int32_t* entry_r1
        int32_t r2_2 = entry_r1[1]
        int32_t r3 = entry_r1[2]
        int32_t r7_2 = entry_r1[3]
        int32_t result = r9 s>> 4
        int32_t* r4_1 = r6 + (result << 4)
        *r4_1 = *entry_r1
        r4_1[1] = r2_2
        r4_1[2] = r3
        r4_1[3] = r7_2
        
        if (r9 s>= 1)
            result = __aeabi_memcpy8(r6, r8, r9)
        
        int32_t* temp0_2 = arg1
        *temp0_2 = r6
        temp0_2[1] = &r4_1[4]
        arg1[2] = r6 + (r10_1 << 4)
        
        if (r8 == 0)
            return result
        
        return operator delete(r8) __tailcall
    
    if (r0_1 u<= r1_1 s>> 3)
        r0_1 = r1_1 s>> 3
    
    if (r0_1 == 0)
        r10_1 = 0
        r6 = 0
        goto label_e8820
    
    r10_1 = r0_1
    
    if (r0_1 u< 0x10000000)
        goto label_e881c

char* thrown_exception_1 = __cxa_allocate_exception(8)
void** thrown_exception = thrown_exception_1
std::logic_error::logic_error(thrown_exception_1)
*thrown_exception = _vtable_for_std::length_error + 8
__cxa_throw(thrown_exception, _typeinfo_for_std::length_error, std::length_error::~length_error)
noreturn
