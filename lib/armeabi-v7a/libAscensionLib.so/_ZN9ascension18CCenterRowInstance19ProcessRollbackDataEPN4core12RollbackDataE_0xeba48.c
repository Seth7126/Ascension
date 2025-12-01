// 函数: _ZN9ascension18CCenterRowInstance19ProcessRollbackDataEPN4core12RollbackDataE
// 地址: 0xeba48
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* entry_r1

switch (*(entry_r1 + 8) - 0x11 - &__elf_symbol_table[0x21])
    case nullptr
        *(arg1 + 0x10) -= 8
    case 1
        *(entry_r1 + 0xc)
        int32_t r0_8 = core::CWorldBase::GetInstanceByID(*(arg1 + 4))
        int32_t r0_9 = *(entry_r1 + 0x14)
        int32_t* r0_10 = *(arg1 + 0x10)
        
        if (r0_10 == *(arg1 + 0x14))
            std::__ndk1::vector<ascension::CenterRowCardEntry, std::__ndk1::allocator<ascension::CenterRowCardEntry> >::__push_back_slow_path<ascension::CenterRowCardEntry const&>(
                arg1 + 0xc)
        else
            *r0_10 = r0_8
            r0_10[1] = r0_9
            *(arg1 + 0x10) += 8
    case 2
        int32_t r5_2 = *(arg1 + 0xc)
        int32_t r0_13 = *(arg1 + 0x10)
        
        if (r0_13 != r5_2 + 8)
            __aeabi_memmove4(r5_2)
        
        *(arg1 + 0x10) = r5_2 + ((r0_13 - (r5_2 + 8)) s>> 3 << 3)
    case 3
        *(*(arg1 + 0xc) + (zx.d(*(entry_r1 + 0x10)) << 3) + 4) = *(entry_r1 + 0x14)
    case 4
        *(entry_r1 + 0xc)
        int32_t var_28_2 = core::CWorldBase::GetInstanceByID(*(arg1 + 4))
        int32_t var_24_2 = *(entry_r1 + 0x14)
        uint32_t r0_21 = zx.d(*(entry_r1 + 0x10))
        ascension::CenterRowCardEntry* r1_6 = *(arg1 + 0xc)
        
        if (r0_21 != 0)
            int32_t i_1 = 0 - r0_21
            int32_t i
            
            do
                i = i_1
                i_1 += 1
                r1_6 += 8
            while (i != 0xffffffff)
        
        std::__ndk1::vector<ascension::CenterRowCardEntry, std::__ndk1::allocator<ascension::CenterRowCardEntry> >::insert(
            arg1 + 0xc, r1_6)
    case 0x10
        *(entry_r1 + 0xc)
        int32_t r0_24 = core::CWorldBase::GetInstanceByID(*(arg1 + 4))
        int32_t var_28_3 = r0_24
        int32_t* r1_8 = *(arg1 + 0x1c)
        
        if (r1_8 == *(arg1 + 0x20))
            std::__ndk1::vector<ascension::CActiveEffectInstance*, std::__ndk1::allocator<ascension::CActiveEffectInstance*> >::__push_back_slow_path<ascension::CActiveEffectInstance* const&>(
                arg1 + 0x18)
        else
            *r1_8 = r0_24
            *(arg1 + 0x1c) += 4
    case 0x11
        int32_t* r2_6 = *(arg1 + 0x1c) - 4
        int32_t var_28_4 = *r2_6
        core::CInstance* r0_27 = *(arg1 + 4)
        *(arg1 + 0x1c) = r2_6
        core::CWorldBase::RollbackInstance(r0_27)

int32_t r0_30 = *__stack_chk_guard

if (r0_30 == r0)
    return r0_30 - r0

__stack_chk_fail()
noreturn
