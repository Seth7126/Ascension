// 函数: _ZN9ascension15CTrophyInstance19ProcessRollbackDataEPN4core12RollbackDataE
// 地址: 0xf1470
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* entry_r1
int32_t r0_1 = *(entry_r1 + 8)

if (r0_1 == &__elf_symbol_table[0x1003].st_name:2)
    int32_t var_28_2 = *(*(arg1 + 0x3c) + (zx.d(*(entry_r1 + 0x10)) << 2))
    *(arg1 + 0x40) -= 4
else if (r0_1 != &__elf_symbol_table[0x1003].st_name:1)
    ascension::CCardInPlayInstance::ProcessRollbackData(arg1)
else
    int32_t i_1 = *(entry_r1 + 0xc)
    *(arg1 + 0x40) = *(arg1 + 0x3c)
    
    if (i_1 s>= 1)
        void* r6_1 = entry_r1 + 0x10
        int32_t i
        
        do
            *r6_1
            int32_t r0_4 = core::CWorldBase::GetInstanceByID(*(arg1 + 4))
            int32_t var_28_1 = r0_4
            int32_t* r1_1 = *(arg1 + 0x40)
            
            if (r1_1 == *(arg1 + 0x44))
                std::__ndk1::vector<core::CCardInstance*, std::__ndk1::allocator<core::CCardInstance*> >::__push_back_slow_path<core::CCardInstance* const&>(
                    arg1 + 0x3c)
            else
                *r1_1 = r0_4
                *(arg1 + 0x40) += 4
            
            r6_1 += 4
            i = i_1
            i_1 -= 1
        while (i != 1)

int32_t r0_12 = *__stack_chk_guard

if (r0_12 == r0)
    return r0_12 - r0

__stack_chk_fail()
noreturn
