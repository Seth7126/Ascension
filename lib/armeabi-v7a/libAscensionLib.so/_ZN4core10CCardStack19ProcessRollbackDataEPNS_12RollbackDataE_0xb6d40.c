// 函数: _ZN4core10CCardStack19ProcessRollbackDataEPNS_12RollbackDataE
// 地址: 0xb6d40
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* entry_r1

switch (*(entry_r1 + 8) - 0x110)
    case 0
        int32_t r1 = *(entry_r1 + 0xc)
        int32_t r0_4 = *(arg1 + 0xc)
        *(arg1 + 0x18) = r1
        *(arg1 + 0x10) = r0_4
        
        if (r1 s>= 1)
            int32_t i = 0
            
            do
                *(entry_r1 + 0x10 + (i << 2))
                int32_t r0_6 = core::CWorldBase::GetInstanceByID(*(arg1 + 4))
                int32_t var_28_1 = r0_6
                int32_t* r1_2 = *(arg1 + 0x10)
                
                if (r1_2 == *(arg1 + 0x14))
                    std::__ndk1::vector<core::CCardInstance*, std::__ndk1::allocator<core::CCardInstance*> >::__push_back_slow_path<core::CCardInstance* const&>(
                        arg1 + 0xc)
                else
                    *r1_2 = r0_6
                    *(arg1 + 0x10) += 4
                
                i += 1
            while (i s< *(arg1 + 0x18))
    case 1
        int32_t var_28_2 = *(*(arg1 + 0xc) + (zx.d(*(entry_r1 + 0x10)) << 2))
        *(arg1 + 0x10) -= 4
        *(arg1 + 0x18) = zx.d(*(entry_r1 + 0x12))
    case 2
        int32_t r6_3 = *(arg1 + 0xc)
        int32_t r2_3 = *(arg1 + 0x10)
        int32_t var_28_3 = *(r6_3 + (zx.d(*(entry_r1 + 0x10)) << 2))
        
        if (r2_3 != r6_3 + 4)
            __aeabi_memmove4(r6_3)
        
        *(arg1 + 0x10) = r6_3 + ((r2_3 - (r6_3 + 4)) s>> 2 << 2)
        *(arg1 + 0x18) = zx.d(*(entry_r1 + 0x12))
    case 3
        *(entry_r1 + 0xc)
        int32_t r0_19 = core::CWorldBase::GetInstanceByID(*(arg1 + 4))
        int32_t var_28_4 = r0_19
        int32_t* r1_6 = *(arg1 + 0x10)
        
        if (r1_6 == *(arg1 + 0x14))
            std::__ndk1::vector<core::CCardInstance*, std::__ndk1::allocator<core::CCardInstance*> >::__push_back_slow_path<core::CCardInstance* const&>(
                arg1 + 0xc)
        else
            *r1_6 = r0_19
            *(arg1 + 0x10) += 4
        
        *(arg1 + 0x18) = zx.d(*(entry_r1 + 0x12))
    case 4
        *(entry_r1 + 0xc)
        int32_t var_28_5 = core::CWorldBase::GetInstanceByID(*(arg1 + 4))
        uint32_t r2_6 = zx.d(*(entry_r1 + 0x10))
        core::CCardInstance** r1_8 = *(arg1 + 0xc)
        
        if (r2_6 != 0)
            int32_t i_2 = 0 - r2_6
            int32_t i_1
            
            do
                i_1 = i_2
                i_2 += 1
                r1_8 = &r1_8[1]
            while (i_1 != 0xffffffff)
        
        std::__ndk1::vector<core::CCardInstance*, std::__ndk1::allocator<core::CCardInstance*> >::insert(
            arg1 + 0xc, r1_8)
        *(arg1 + 0x18) = zx.d(*(entry_r1 + 0x12))

int32_t r0_28 = *__stack_chk_guard

if (r0_28 == r0)
    return r0_28 - r0

__stack_chk_fail()
noreturn
