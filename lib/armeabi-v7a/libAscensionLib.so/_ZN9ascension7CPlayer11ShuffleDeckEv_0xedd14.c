// 函数: _ZN9ascension7CPlayer11ShuffleDeckEv
// 地址: 0xedd14
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t r0 = *__stack_chk_guard
void* entry_r0

if (*(entry_r0 + 0x9c) s>= 1)
    void* r0_3 = core::CWorldBase::AddRollbackData(*(entry_r0 + 4), zx.d(*(entry_r0 + 8)), 
        &__elf_program_headers[7].offset:1)
    
    if (r0_3 != 0)
        *(r0_3 + 0xc) = *(entry_r0 + 0x9c)
    
    *(entry_r0 + 0x9c) = 0

int32_t* r0_4 = *(entry_r0 + 0x188)

if (r0_4 != 0 && *r0_4 != 0)
    void* r5_1 = *(entry_r0 + 0x38)
    void* var_2c_1 = nullptr
    int32_t* var_30_1 = nullptr
    int32_t var_28_1 = 0
    int32_t r0_8 = *(r5_1 + 0xc)
    int32_t r1_6 = *(r5_1 + 0x10)
    uint32_t r0_9 = r1_6 - r0_8
    
    if (r1_6 != r0_8)
        int32_t r7_1 = r0_9 s>> 2
        
        if (r7_1 u>= 0x40000000)
            sub_1a86c0(std::__ndk1::__vector_base_common<true>::__throw_length_error())
            noreturn
        
        int32_t* r0_10 = operator new(r0_9)
        var_30_1 = r0_10
        var_2c_1 = r0_10
        void* var_28_2 = &r0_10[r7_1]
        int32_t r1_7 = *(r5_1 + 0xc)
        int32_t r7_2 = *(r5_1 + 0x10) - r1_7
        
        if (r7_2 s>= 1)
            __aeabi_memcpy4(r0_10, r1_7, r7_2)
            var_2c_1 = r0_10 + r7_2
    
    core::CCardStack::Clear()
    int32_t* r6_2 = var_30_1
    void* r0_16 = var_2c_1
    void* var_2c_2
    
    if (r6_2 == r0_16)
        r0_16 = r6_2
        
        if (r0_16 != 0)
            var_2c_2 = r0_16
            operator delete(r0_16)
    else
        do
            char* __s2
            
            if (r0_16 == r6_2)
                r6_2 = r0_16
                __s2 = **(entry_r0 + 0x188)
            label_ede88:
                printf("unable to find draw card: %s\n", __s2)
                r0_16 = r6_2
            else
                while (true)
                    char* __s1 = (*(**r6_2 + 0xc))()
                    __s2 = **(entry_r0 + 0x188)
                    
                    if (strcasecmp(__s1, __s2) == 0)
                        *r6_2
                        
                        if (var_2c_1 != &r6_2[1])
                            __aeabi_memmove4(r6_2)
                        
                        var_2c_1 = &r6_2[(var_2c_1 - &r6_2[1]) s>> 2]
                        core::CCardStack::PutCardOnBottom(*(entry_r0 + 0x38))
                        void* r0_24 = *(entry_r0 + 0x188)
                        *(entry_r0 + 0x188) = r0_24 + 4
                        void* r0_25 = *(r0_24 + 4)
                        
                        if (r0_25 != 0)
                            r0_25 = r0_24 + 4
                        
                        *(entry_r0 + 0x188) = r0_25
                        r0_16 = var_2c_1
                        break
                    
                    r6_2 = &r6_2[1]
                    
                    if (r6_2 == var_2c_1)
                        goto label_ede88
            r6_2 = var_30_1
        while (r6_2 != r0_16)
        
        if (r0_16 != 0)
            var_2c_2 = r0_16
            operator delete(r0_16)
    int32_t r0_26 = *__stack_chk_guard
    
    if (r0_26 == r0)
        return r0_26 - r0
else
    *(entry_r0 + 0x38)
    
    if (*__stack_chk_guard == r0)
        return core::CCardStack::Shuffle() __tailcall

__stack_chk_fail()
noreturn
