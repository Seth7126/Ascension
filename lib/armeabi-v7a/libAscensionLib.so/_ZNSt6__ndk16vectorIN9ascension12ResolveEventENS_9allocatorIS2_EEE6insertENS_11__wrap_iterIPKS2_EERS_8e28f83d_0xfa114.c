// 函数: _ZNSt6__ndk16vectorIN9ascension12ResolveEventENS_9allocatorIS2_EEE6insertENS_11__wrap_iterIPKS2_EERS7_
// 地址: 0xfa114
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r5 = arg1
int32_t* r0 = *(arg1 + 4)
int32_t* entry_r2
int32_t* r4 = entry_r2
int32_t r1 = r5[2]

if (r0 u< r1)
    if (arg2 == r0)
        int32_t r1_13 = r4[1]
        *arg2 = *r4
        *(arg2 + 4) = r1_13
        r5[1] += 8
    else
        void* r2 = r0 - (arg2 + 8)
        int32_t* r1_2 = r0 - 8
        
        if (r1_2 u< r0)
            int32_t* r3_1 = r0
            
            do
                int32_t r7_1 = *r1_2
                int32_t r6_1 = r1_2[1]
                r1_2 = &r1_2[2]
                *r3_1 = r7_1
                r3_1[1] = r6_1
                r3_1 = r5[1] + 8
                r5[1] = r3_1
            while (r1_2 u< r0)
        
        if (r2 != 0)
            __aeabi_memmove4(r0 - (r2 s>> 3 << 3), arg2)
        
        if (arg2 u<= r4 && r5[1] u> r4)
            r4 = &r4[2]
        
        int32_t r1_5 = r4[1]
        *arg2 = *r4
        *(arg2 + 4) = r1_5
    
    return arg2

int32_t r7_2 = *r5
int32_t r10_1 = 1 + ((r0 - r7_2) s>> 3)

if (r10_1 u>= 0x20000000)
    std::__ndk1::__vector_base_common<true>::__throw_length_error()
else
    int32_t r0_5 = r1 - r7_2
    void* r8_1
    
    if (r0_5 s>> 3 u>= 0xfffffff)
        r10_1 = 0x1fffffff
        r8_1 = operator new(r10_1 << 3)
    else
        if (r10_1 u<= r0_5 s>> 2)
            r10_1 = r0_5 s>> 2
        
        if (r10_1 == 0)
            r10_1 = 0
            r8_1 = nullptr
        else
            if (r10_1 u>= 0x20000000)
                char* thrown_exception_2 = __cxa_allocate_exception(8)
                void** thrown_exception = thrown_exception_2
                std::logic_error::logic_error(thrown_exception_2)
                *thrown_exception = _vtable_for_std::length_error + 8
                __cxa_throw(thrown_exception, _typeinfo_for_std::length_error, 
                    std::length_error::~length_error)
                noreturn
            
            r8_1 = operator new(r10_1 << 3)
    
    void* r0_10 = arg2 - r7_2
    void* r2_2 = r8_1 + (r10_1 << 3)
    int32_t r1_9 = r0_10 s>> 3
    void* r6_2 = r8_1 + (r1_9 << 3)
    void* r10_2
    
    if (r1_9 != r10_1)
        r10_2 = r2_2
    label_fa28c:
        int32_t r1_10 = r4[1]
        void* r2_3 = arg2 - r7_2
        int32_t r8_2 = r6_2 - r2_3
        *r6_2 = *r4
        *(r6_2 + 4) = r1_10
        
        if (r2_3 s>= 1)
            __aeabi_memcpy4(r8_2, r7_2)
        
        void* r7_3 = r6_2 + 8
        void* r4_1 = r5[1] - arg2
        
        if (r4_1 s>= 1)
            __aeabi_memcpy4(r7_3, arg2, r4_1)
            r7_3 += r4_1
        
        r5[1] = r7_3
        r5[2] = r10_2
        void* r0_18 = *r5
        *r5 = r8_2
        
        if (r0_18 != 0)
            operator delete(r0_18)
        
        return r6_2
    
    if (r0_10 s>= 1)
        r10_2 = r2_2
        r6_2 -= 0xfffffff8 & (r1_9 + 1 + ((r1_9 + 1) u>> 0x1f)) << 2
        goto label_fa28c
    
    int32_t r10_3 = r0_10 s>> 2
    
    if (r0_10 == 0)
        r10_3 = 1
    
    int32_t r0_24
    
    if (r10_3 == 0)
        r0_24 = 0
    label_fa354:
        r10_2 = r0_24 + (r10_3 << 3)
        r6_2 = r0_24 + (r10_3 u>> 2 << 3)
        
        if (r8_1 != 0)
            operator delete(r8_1)
            r7_2 = *r5
        
        goto label_fa28c
    
    if (r10_3 u< 0x20000000)
        r0_24 = operator new(r10_3 << 3)
        goto label_fa354

char* thrown_exception_3 = __cxa_allocate_exception(8)
void** thrown_exception_1 = thrown_exception_3
std::logic_error::logic_error(thrown_exception_3)
*thrown_exception_1 = _vtable_for_std::length_error + 8
__cxa_throw(thrown_exception_1, _typeinfo_for_std::length_error, std::length_error::~length_error)
noreturn
