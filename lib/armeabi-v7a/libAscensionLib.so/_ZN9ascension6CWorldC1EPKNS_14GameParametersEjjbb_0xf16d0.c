// 函数: _ZN9ascension6CWorldC1EPKNS_14GameParametersEjjbb
// 地址: 0xf16d0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t var_40 = arg5.d
core::CWorldBase::CWorldBase(arg1, 0x1000, arg3, arg4)
*(arg1 + 0xa2d) = 0
*(arg1 + 0xa28) = arg2
*arg1 = _vtable_for_ascension::CWorld + 8
char arg_4
*(arg1 + 0xa2c) = arg_4
*(arg1 + 0xa30) = 0
*(arg1 + 0xa34) = 0
*(arg1 + 0xa38) = 0
*(arg1 + 0xa44) = 0
*(arg1 + 0xa48) = 0
*(arg1 + 0xa50) = 0
*(arg1 + 0xa54) = 0
*(arg1 + 0xa58) = 0
*(arg1 + 0xb70) = 0
*(arg1 + 0xb74) = 0
*(arg1 + 0xb78) = 0
*(arg1 + 0xb80) = 0
*(arg1 + 0xb84) = 0
*(arg1 + 0xa40) = 0
__builtin_memset(arg1 + 0xa70, 0, 0x18)
*(arg1 + 0xb88) = 0
void* __offset(ascension::GameParameters, 0xa8c) var_38 = arg1 + 0xa8c
__aeabi_memclr4(arg1 + 0xa8c, 0x60, 0)
void* __offset(ascension::GameParameters, 0xb90) var_3c = arg1 + 0xb90
__aeabi_memclr4(arg1 + 0xb90, 0x60)
uint32_t r7 = *(ascension::CWorld::s_StartInstanceID + (arg3 << 2))
*(arg1 + 4) = r7
int32_t r0_7 = operator new(0x400)
*(arg1 + 0xabc) = r0_7
*(arg1 + 0xac0) = r0_7
*(arg1 + 0xac4) = r0_7 + 0x400
core::CWorldBase* r0_8 = operator new(0x20)
*(arg1 + 4) = r7 + 1
core::CCardStack::CCardStack(r0_8, arg1, r7)
*(arg1 + 0xa3c) = r0_8
*(r0_8 + 0x1c) = 1
core::CWorldBase::AddInstance(arg1)

if (arg3 u> 5)
    core::CWorldBase* r0_12 = operator new(0x20)
    uint32_t r2_1 = *(arg1 + 4)
    *(arg1 + 4) = r2_1 + 1
    core::CCardStack::CCardStack(r0_12, arg1, r2_1)
    *(arg1 + 0xa5c) = r0_12
    *(r0_12 + 0x1c) = 1
    core::CWorldBase::AddInstance(arg1)
    
    if (arg3 u> 0x15)
        core::CWorldBase* r0_16 = operator new(0x20)
        uint32_t r2_2 = *(arg1 + 4)
        *(arg1 + 4) = r2_2 + 1
        core::CCardStack::CCardStack(r0_16, arg1, r2_2)
        *(arg1 + 0xa60) = r0_16
        *(r0_16 + 0x1c) = 1
        core::CWorldBase::AddInstance(arg1)
        core::CWorldBase* r0_20 = operator new(0x20)
        uint32_t r2_3 = *(arg1 + 4)
        *(arg1 + 4) = r2_3 + 1
        core::CCardStack::CCardStack(r0_20, arg1, r2_3)
        *(arg1 + 0xa64) = r0_20
        core::CWorldBase::AddInstance(arg1)
    else
        *(arg1 + 0xa60) = 0
        *(arg1 + 0xa64) = 0
else
    *(arg1 + 0xa5c) = 0
    *(arg1 + 0xa60) = 0
    *(arg1 + 0xa64) = 0

core::CWorldBase* r0_24 = operator new(0x20)
uint32_t r2_4 = *(arg1 + 4)
*(arg1 + 4) = r2_4 + 1
core::CCardStack::CCardStack(r0_24, arg1, r2_4)
*(arg1 + 0xa4c) = r0_24
core::CWorldBase::AddInstance(arg1)
int32_t r0_28 = *(arg1 + 0xa50)
int32_t r1_13 = *(arg1 + 0xac8)
int32_t r2_5 = *(arg1 + 0xad4)
int32_t r3_5 = *(arg1 + 0xae0)
__builtin_memset(arg1 + 0xaec, 0, 0x20)
*(arg1 + 0xa68) = 0
*(arg1 + 0xa6c) = 0
*(arg1 + 0xa54) = r0_28
*(arg1 + 0xacc) = r1_13
*(arg1 + 0xad8) = r2_5
*(arg1 + 0xae4) = r3_5
*(arg1 + 0xa88) = 0
void* r6_4 = *(arg1 + 0xa98)

if ((*(arg1 + 0xaa0) - r6_4) s>> 2 u<= 7)
    int32_t r8_1 = *(arg1 + 0xa9c)
    void* r0_32 = operator new(0x20)
    void* r2_6 = r8_1 - r6_4
    
    if (r2_6 s>= 1)
        __aeabi_memcpy4(r0_32, r6_4)
    
    *(arg1 + 0xa98) = r0_32
    *(arg1 + 0xa9c) = r0_32 + r2_6
    *(arg1 + 0xaa0) = r0_32 + 0x20
    
    if (r6_4 != 0)
        operator delete(r6_4)

*(arg1 + 0xb3c) = 0
*(arg1 + 0xb18) = 0
*(arg1 + 0xb0c) = 0
*(arg1 + 0xb1c) = 0
*(arg1 + 0xb30) = 0
*(arg1 + 0xb34) = 0
*(arg1 + 0xb38) = 0
*(arg1 + 0xb2c) = 0
*(arg1 + 0xb20) = 0
*(arg1 + 0xb24) = 0
*(arg1 + 0xb28) = 0
*(arg1 + 0xb7c) = 0
__builtin_memset(arg1 + 0xb40, 0, 0x1c)
*(arg1 + 0xb5c) = 1
*(arg1 + 0xb60) = 0
*(arg1 + 0xb64) = 0
*(arg1 + 0xb68) = 0
*(arg1 + 0xb6c) = 0
int32_t r0_35 = *(arg1 + 4)
void* r6_5 = *(arg1 + 0xb80)
*(arg1 + 0xb10) = 6
int32_t r2_7 = *(arg1 + 0xb88)
*(arg1 + 0xb14) = 6
*(arg1 + 4) = r0_35 + 1

if ((r2_7 - r6_5) s>> 3 u<= 0xf)
    int32_t r5_1 = *(arg1 + 0xb84)
    void* r0_39 = operator new(0x80)
    void* r2_8 = r5_1 - r6_5
    
    if (r2_8 s>= 1)
        __aeabi_memcpy4(r0_39, r6_5)
    
    *(arg1 + 0xb80) = r0_39
    *(arg1 + 0xb84) = r0_39 + r2_8
    *(arg1 + 0xb88) = r0_39 + 0x80
    
    if (r6_5 != 0)
        operator delete(r6_5)

core::CWorldBase* r0_42 = operator new(0x20)
uint32_t r2_9 = *(arg1 + 4)
*(arg1 + 4) = r2_9 + 1
core::CCardStack::CCardStack(r0_42, arg1, r2_9)
*(arg1 + 0xb8c) = r0_42
core::CWorldBase::AddInstance(arg1)
void* r6_7 = *(arg1 + 0xb90)
int32_t r1_18 = *(arg1 + 0xb98)
int32_t r5_3 = *(arg1 + 4) + 1
*(arg1 + 4) = r5_3

if ((r1_18 - r6_7) s>> 3 u<= 7)
    int32_t r8_4 = *(arg1 + 0xb94)
    void* r0_49 = operator new(0x40)
    void* r2_10 = r8_4 - r6_7
    
    if (r2_10 s>= 1)
        __aeabi_memcpy4(r0_49, r6_7)
    
    *(arg1 + 0xb90) = r0_49
    *(arg1 + 0x94) = r0_49 + r2_10
    *(arg1 + 0x98) = r0_49 + 0x40
    
    if (r6_7 != 0)
        operator delete(r6_7)
        r5_3 = *(arg1 + 4)

void* r6_8 = *(arg1 + 0xb9c)
int32_t r0_53 = *(arg1 + 0xba4)
*(arg1 + 4) = r5_3 + 1

if ((r0_53 - r6_8) s>> 3 u<= 7)
    int32_t r5_4 = *(arg1 + 0xba0)
    void* r0_56 = operator new(0x40)
    void* r2_11 = r5_4 - r6_8
    
    if (r2_11 s>= 1)
        __aeabi_memcpy4(r0_56, r6_8)
    
    *(arg1 + 0xb9c) = r0_56
    *(arg1 + 0xba0) = r0_56 + r2_11
    *(arg1 + 0xba4) = r0_56 + 0x40
    
    if (r6_8 != 0)
        operator delete(r6_8)

void* r6_9 = *(arg1 + 0xa8c)

if ((*(arg1 + 0xa94) - r6_9) s>> 2 u<= 7)
    int32_t r5_6 = *(arg1 + 0xa90)
    void* r0_62 = operator new(0x20)
    void* r2_12 = r5_6 - r6_9
    
    if (r2_12 s>= 1)
        __aeabi_memcpy4(r0_62, r6_9)
    
    *(arg1 + 0xa8c) = r0_62
    *(arg1 + 0xa90) = r0_62 + r2_12
    *(arg1 + 0xa94) = r0_62 + 0x20
    
    if (r6_9 != 0)
        operator delete(r6_9)

void* r6_10 = *(arg1 + 0xaa4)

if ((*(arg1 + 0xaac) - r6_10) s>> 2 u<= 0x1f)
    int32_t r5_8 = *(arg1 + 0xaa8)
    void* r0_68 = operator new(0x80)
    void* r2_13 = r5_8 - r6_10
    
    if (r2_13 s>= 1)
        __aeabi_memcpy4(r0_68, r6_10)
    
    *(arg1 + 0xaa4) = r0_68
    *(arg1 + 0xaa8) = r0_68 + r2_13
    *(arg1 + 0xaac) = r0_68 + 0x80
    
    if (r6_10 != 0)
        operator delete(r6_10)

void* r6_11 = *(arg1 + 0xab0)

if ((*(arg1 + 0xab8) - r6_11) s>> 2 u<= 0x1f)
    int32_t r5_10 = *(arg1 + 0xab4)
    void* r0_74 = operator new(0x80)
    void* r2_14 = r5_10 - r6_11
    
    if (r2_14 s>= 1)
        __aeabi_memcpy4(r0_74, r6_11)
    
    *(arg1 + 0xab0) = r0_74
    *(arg1 + 0xab4) = r0_74 + r2_14
    *(arg1 + 0xab8) = r0_74 + 0x80
    
    if (r6_11 != 0)
        operator delete(r6_11)

void* r6_12 = *(arg1 + 0xbd8)

if ((*(arg1 + 0xbe0) - r6_12) s>> 3 u<= 7)
    int32_t r5_12 = *(arg1 + 0xbdc)
    void* r0_80 = operator new(0x40)
    void* r2_15 = r5_12 - r6_12
    
    if (r2_15 s>= 1)
        __aeabi_memcpy4(r0_80, r6_12)
    
    *(arg1 + 0xbd8) = r0_80
    *(arg1 + 0xbdc) = r0_80 + r2_15
    *(arg1 + 0xbe0) = r0_80 + 0x40
    
    if (r6_12 != 0)
        operator delete(r6_12)

void* r6_13 = *(arg1 + 0xbe4)

if (((*(arg1 + 0xbec) - r6_13) s>> 2) * 0xaaaaaaab u<= 3)
    int32_t r5_14 = *(arg1 + 0xbe8)
    void* r0_87 = operator new(0x30)
    void* r2_16 = r5_14 - r6_13
    void* r5_15 = r0_87 + r2_16
    int32_t r1_26 = (r2_16 * 0xd5555555) s>> 0x20
    void* r7_10 = r5_15 + ((r1_26 s>> 1) + (r1_26 u>> 0x1f)) * 0xc
    
    if (r2_16 s>= 1)
        __aeabi_memcpy4(r7_10, r6_13)
    
    *(arg1 + 0xbe4) = r7_10
    *(arg1 + 0xbe8) = r5_15
    *(arg1 + 0xbec) = r0_87 + 0x30
    
    if (r6_13 != 0)
        operator delete(r6_13)

core::CWorldBase* r0_90 = operator new(0x24)
*(arg1 + 4) += 1
ascension::CCenterRowInstance::CCenterRowInstance(r0_90, arg1)
core::CWorldBase::AddInstance(arg1)
int32_t* r0_94 = *(arg1 + 0xa44)

if (r0_94 == *(arg1 + 0xa48))
    std::__ndk1::vector<ascension::CCenterRowInstance*, std::__ndk1::allocator<ascension::CCenterRowInstance*> >::__push_back_slow_path<ascension::CCenterRowInstance* const&>(
        arg1 + 0xa40)
else
    *r0_94 = r0_90
    *(arg1 + 0xa44) += 4

core::CWorldBase* r0_98 = operator new(0x24)
*(arg1 + 4) += 1
ascension::CCenterRowInstance::CCenterRowInstance(r0_98, arg1)
core::CWorldBase::AddInstance(arg1)
int32_t* r0_102 = *(arg1 + 0xa44)

if (r0_102 == *(arg1 + 0xa48))
    std::__ndk1::vector<ascension::CCenterRowInstance*, std::__ndk1::allocator<ascension::CCenterRowInstance*> >::__push_back_slow_path<ascension::CCenterRowInstance* const&>(
        arg1 + 0xa40)
else
    *r0_102 = r0_98
    *(arg1 + 0xa44) += 4

core::CWorldBase* r0_106 = operator new(0x24)
*(arg1 + 4) += 1
ascension::CCenterRowInstance::CCenterRowInstance(r0_106, arg1)
core::CWorldBase::AddInstance(arg1)
int32_t* r0_110 = *(arg1 + 0xa44)

if (r0_110 == *(arg1 + 0xa48))
    std::__ndk1::vector<ascension::CCenterRowInstance*, std::__ndk1::allocator<ascension::CCenterRowInstance*> >::__push_back_slow_path<ascension::CCenterRowInstance* const&>(
        arg1 + 0xa40)
else
    *r0_110 = r0_106
    *(arg1 + 0xa44) += 4

core::CWorldBase* r0_114 = operator new(0x24)
*(arg1 + 4) += 1
ascension::CCenterRowInstance::CCenterRowInstance(r0_114, arg1)
core::CWorldBase::AddInstance(arg1)
int32_t* r0_118 = *(arg1 + 0xa44)

if (r0_118 == *(arg1 + 0xa48))
    std::__ndk1::vector<ascension::CCenterRowInstance*, std::__ndk1::allocator<ascension::CCenterRowInstance*> >::__push_back_slow_path<ascension::CCenterRowInstance* const&>(
        arg1 + 0xa40)
else
    *r0_118 = r0_114
    *(arg1 + 0xa44) += 4

core::CWorldBase* r0_122 = operator new(0x24)
*(arg1 + 4) += 1
ascension::CCenterRowInstance::CCenterRowInstance(r0_122, arg1)
core::CWorldBase::AddInstance(arg1)
int32_t* r0_126 = *(arg1 + 0xa44)

if (r0_126 == *(arg1 + 0xa48))
    std::__ndk1::vector<ascension::CCenterRowInstance*, std::__ndk1::allocator<ascension::CCenterRowInstance*> >::__push_back_slow_path<ascension::CCenterRowInstance* const&>(
        arg1 + 0xa40)
else
    *r0_126 = r0_122
    *(arg1 + 0xa44) += 4

core::CWorldBase* r0_130 = operator new(0x24)
*(arg1 + 4) += 1
ascension::CCenterRowInstance::CCenterRowInstance(r0_130, arg1)
core::CWorldBase::AddInstance(arg1)
int32_t* r0_134 = *(arg1 + 0xa44)

if (r0_134 == *(arg1 + 0xa48))
    std::__ndk1::vector<ascension::CCenterRowInstance*, std::__ndk1::allocator<ascension::CCenterRowInstance*> >::__push_back_slow_path<ascension::CCenterRowInstance* const&>(
        arg1 + 0xa40)
else
    *r0_134 = r0_130
    *(arg1 + 0xa44) += 4

if (*(arg1 + 0x30) u> 9)
    core::CWorldBase* r0_139 = operator new(0x24)
    *(arg1 + 4) += 1
    ascension::CCenterRowInstance::CCenterRowInstance(r0_139, arg1)
    core::CWorldBase::AddInstance(arg1)
    core::CWorldBase** r0_143 = *(arg1 + 0xa44)
    
    if (r0_143 == *(arg1 + 0xa48))
        std::__ndk1::vector<ascension::CCenterRowInstance*, std::__ndk1::allocator<ascension::CCenterRowInstance*> >::__push_back_slow_path<ascension::CCenterRowInstance* const&>(
            arg1 + 0xa40)
    else
        *r0_143 = r0_139
        *(arg1 + 0xa44) += 4

if (*__stack_chk_guard == r0)
    return 

__stack_chk_fail()
noreturn
