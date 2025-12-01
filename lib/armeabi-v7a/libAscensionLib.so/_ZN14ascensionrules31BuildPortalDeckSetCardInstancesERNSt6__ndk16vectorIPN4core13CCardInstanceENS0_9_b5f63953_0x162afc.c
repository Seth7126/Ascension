// 函数: _ZN14ascensionrules31BuildPortalDeckSetCardInstancesERNSt6__ndk16vectorIPN4core13CCardInstanceENS0_9allocatorIS4_EEEERjS9_PKNS_17StartingCardEntryEj
// 地址: 0x162afc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* r8 = *arg1
void* r4

if ((*(arg1 + 8) - r8) s>> 2 u> 0x7f)
    r4 = r8
else
    void* r10_1 = *(arg1 + 4) - r8
    void* r0_5 = operator new(0x200)
    r4 = r0_5
    
    if (r10_1 s>= 1)
        __aeabi_memcpy4(r4, r8, r10_1)
    
    int32_t* temp0_1 = arg1
    *temp0_1 = r4
    temp0_1[1] = r0_5 + r10_1
    *(arg1 + 8) = r0_5 + 0x200
    
    if (r8 != 0)
        operator delete(r8)
        r4 = *arg1

int32_t r1_1 = 0
*(arg1 + 4) = r4
*arg2 = 0

if (arg5 != 0)
    do
        *(arg4 + (r1_1 << 3))
        
        if (ascension::CDatabase::GetCard(ascension::g_Database) != 0
                && *(arg4 + (r1_1 << 3) + 4) != 0)
            int32_t i = 0
            
            do
                core::CWorldBase* r0_15 = operator new(0x10)
                uint32_t r2_1 = *arg3
                *arg3 = r2_1 + 1
                core::CCardInstance::CCardInstance(r0_15, 0, r2_1)
                core::CWorldBase* var_2c_1 = r0_15
                core::CWorldBase** r0_18 = *(arg1 + 4)
                
                if (r0_18 == *(arg1 + 8))
                    std::__ndk1::vector<core::CCardInstance*, std::__ndk1::allocator<core::CCardInstance*> >::__push_back_slow_path<core::CCardInstance* const&>(
                        arg1)
                else
                    *r0_18 = r0_15
                    *(arg1 + 4) += 4
                
                i += 1
                *arg2 += 1
            while (i u< *(arg4 + (r1_1 << 3) + 4))
        
        r1_1 += 1
    while (r1_1 u< arg5)

int32_t r0_26 = *__stack_chk_guard

if (r0_26 == r0)
    return r0_26 - r0

__stack_chk_fail()
noreturn
