// 函数: _ZNSt6__ndk16vectorIPN9ascension21CActiveEffectInstanceENS_9allocatorIS3_EEE6insertENS_11__wrap_iterIPKS3_EERS8_
// 地址: 0xf6f54
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r5 = arg1
int32_t* r0 = *(arg1 + 4)
int32_t* entry_r2
int32_t* r8 = entry_r2
int32_t r1 = r5[2]

if (r0 u< r1)
    if (arg2 == r0)
        *arg2 = *r8
        r5[1] += 4
    else
        void* r2 = r0 - &arg2[1]
        int32_t* r1_2 = r0 - 4
        
        if (r1_2 u< r0)
            int32_t* r3_1 = r0
            
            do
                int32_t r7_1 = *r1_2
                r1_2 = &r1_2[1]
                *r3_1 = r7_1
                r3_1 = r5[1] + 4
                r5[1] = r3_1
            while (r1_2 u< r0)
        
        if (r2 != 0)
            __aeabi_memmove4(r0 - (r2 s>> 2 << 2), arg2)
        
        if (arg2 u<= r8 && r5[1] u> r8)
            r8 = &r8[1]
        
        *arg2 = *r8
    
    return arg2

int32_t r7_2 = *r5
int32_t r4_1 = 1 + ((r0 - r7_2) s>> 2)

if (r4_1 u>= 0x40000000)
    std::__ndk1::__vector_base_common<true>::__throw_length_error()
else
    int32_t r0_5 = r1 - r7_2
    void* r6_1
    
    if (r0_5 s>> 2 u>= 0x1fffffff)
        r4_1 = 0x3fffffff
        r6_1 = operator new(r4_1 << 2)
    else
        if (r4_1 u<= r0_5 s>> 1)
            r4_1 = r0_5 s>> 1
        
        if (r4_1 == 0)
            r4_1 = 0
            r6_1 = nullptr
        else
            if (r4_1 u>= 0x40000000)
                char* thrown_exception_2 = __cxa_allocate_exception(8)
                void** thrown_exception = thrown_exception_2
                std::logic_error::logic_error(thrown_exception_2)
                *thrown_exception = _vtable_for_std::length_error + 8
                __cxa_throw(thrown_exception, _typeinfo_for_std::length_error, 
                    std::length_error::~length_error)
                noreturn
            
            r6_1 = operator new(r4_1 << 2)
    
    void* r0_10 = arg2 - r7_2
    void* r2_2 = r6_1 + (r4_1 << 2)
    int32_t r1_8 = r0_10 s>> 2
    void* r10_1 = r6_1 + (r1_8 << 2)
    void* var_28_1
    
    if (r1_8 != r4_1)
        var_28_1 = r2_2
    label_f70c0:
        void* r2_3 = arg2 - r7_2
        int32_t r6_2 = r10_1 - r2_3
        *r10_1 = *r8
        
        if (r2_3 s>= 1)
            __aeabi_memcpy4(r6_2, r7_2)
        
        void* r7_3 = r10_1 + 4
        void* r4_2 = r5[1] - arg2
        
        if (r4_2 s>= 1)
            __aeabi_memcpy4(r7_3, arg2, r4_2)
            r7_3 += r4_2
        
        r5[1] = r7_3
        r5[2] = var_28_1
        void* r0_19 = *r5
        *r5 = r6_2
        
        if (r0_19 != 0)
            operator delete(r0_19)
        
        return r10_1
    
    if (r0_10 s>= 1)
        var_28_1 = r2_2
        r10_1 -= 0xfffffffc & (r1_8 + 1 + ((r1_8 + 1) u>> 0x1f)) << 1
        goto label_f70c0
    
    int32_t r4_3 = r0_10 s>> 1
    
    if (r0_10 == 0)
        r4_3 = 1
    
    int32_t r0_25
    
    if (r4_3 == 0)
        r0_25 = 0
    label_f7194:
        r10_1 = r0_25 + (r4_3 u>> 2 << 2)
        var_28_1 = r0_25 + (r4_3 << 2)
        
        if (r6_1 != 0)
            operator delete(r6_1)
            r7_2 = *r5
        
        goto label_f70c0
    
    if (r4_3 u< 0x40000000)
        r0_25 = operator new(r4_3 << 2)
        goto label_f7194

char* thrown_exception_3 = __cxa_allocate_exception(8)
void** thrown_exception_1 = thrown_exception_3
std::logic_error::logic_error(thrown_exception_3)
*thrown_exception_1 = _vtable_for_std::length_error + 8
__cxa_throw(thrown_exception_1, _typeinfo_for_std::length_error, std::length_error::~length_error)
noreturn
