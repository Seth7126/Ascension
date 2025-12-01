// 函数: _ZNSt6__ndk16vectorIN9ascension14CPlayerTurnLogENS_9allocatorIS2_EEE7reserveEj
// 地址: 0xece98
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
void* r5 = *arg1
void* result = ((*(arg1 + 8) - r5) s>> 2) * 0xb6db6db7
int32_t entry_r1

if (result u< entry_r1)
    if (entry_r1 u>= 0x924924a)
        char* thrown_exception_1 = __cxa_allocate_exception(8)
        void** thrown_exception = thrown_exception_1
        std::logic_error::logic_error(thrown_exception_1)
        *thrown_exception = _vtable_for_std::length_error + 8
        __cxa_throw(thrown_exception, _typeinfo_for_std::length_error, 
            std::length_error::~length_error)
        noreturn
    
    int32_t r7_1 = entry_r1 * 7
    int32_t r6_1 = *(arg1 + 4)
    void* r9_1 = r6_1 - r5
    result = operator new(r7_1 << 2)
    void* result_1 = result + (r7_1 << 2)
    void* r2_1 = result + r9_1
    
    if (r6_1 == r5)
        *arg1 = r2_1
        *(arg1 + 4) = r2_1
        *(arg1 + 8) = result_1
        
        if (r5 != 0)
            return operator delete(r5) __tailcall
    else
        int32_t i = 0
        void* r10_1 = result + (r9_1 s>> 2) * 0x1400000004
        
        do
            void* r9_2 = r10_1 + i
            int32_t r3_2 = r6_1 + i
            int32_t r12_1 = *(r3_2 - 0x1c)
            int32_t lr_1 = *(r3_2 - 0x18)
            int32_t r8_1 = *(r3_2 - 0x14)
            *(r9_2 - 0x10) = *(r3_2 - 0x10)
            void* r3_4 = r10_1 - 4 + i
            *(r9_2 - 0x1c) = r12_1
            *(r9_2 - 0x18) = lr_1
            *(r9_2 - 0x14) = r8_1
            *(r3_4 - 8) = 0
            *(r3_4 - 4) = 0
            *(r10_1 - 4 + i) = 0
            *(r3_4 - 8) = *(r6_1 - 0xc + i)
            *(r3_4 - 4) = *(r6_1 - 8 + i)
            *(r10_1 - 4 + i) = *(r6_1 - 4 + i)
            *(r6_1 - 4 + i) = 0
            *(r6_1 - 8 + i) = 0
            *(r6_1 - 0xc + i) = 0
            i -= 0x1c
        while (r5 - r6_1 != i)
        
        r5 = *arg1
        int32_t r1_4 = *(arg1 + 4)
        *arg1 = r10_1 + i
        *(arg1 + 4) = r2_1
        result = result_1
        *(arg1 + 8) = result
        
        if (r1_4 != r5)
            bool cond:2_1
            
            do
                result = *(r1_4 - 0xc)
                
                if (result != 0)
                    *(r1_4 - 8) = result
                    result = operator delete(result)
                
                cond:2_1 = r5 != r1_4 - 0x1c
                r1_4 -= 0x1c
            while (cond:2_1)
        
        if (r5 != 0)
            return operator delete(r5) __tailcall

return result
