// 函数: _ZN9ascension18CConstructInstance19ProcessRollbackDataEPN4core12RollbackDataE
// 地址: 0xe5310
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* entry_r1
int32_t r0_1 = *(entry_r1 + 8)

if (r0_1 == &__elf_symbol_table[2].st_value)
    int32_t var_28_1 = *(*(arg1 + 0x48) + (zx.d(*(entry_r1 + 0x10)) << 2))
    *(arg1 + 0x4c) -= 4
else if (r0_1 == &__elf_symbol_table[2].st_name:3)
    int32_t i_1 = *(entry_r1 + 0xc)
    *(arg1 + 0x4c) = *(arg1 + 0x48)
    
    if (i_1 s>= 1)
        void* r6_1 = entry_r1 + 0x10
        int32_t i
        
        do
            *r6_1
            int32_t r0_8 = core::CWorldBase::GetInstanceByID(*(arg1 + 4))
            int32_t var_28_2 = r0_8
            int32_t* r1_3 = *(arg1 + 0x4c)
            
            if (r1_3 == *(arg1 + 0x50))
                std::__ndk1::vector<core::CCardInstance*, std::__ndk1::allocator<core::CCardInstance*> >::__push_back_slow_path<core::CCardInstance* const&>(
                    arg1 + 0x48)
            else
                *r1_3 = r0_8
                *(arg1 + 0x4c) += 4
            
            r6_1 += 4
            i = i_1
            i_1 -= 1
        while (i != 1)
else if (r0_1 != &__elf_symbol_table[2].st_name:1)
    ascension::CCardInPlayInstance::ProcessRollbackData(arg1)
else
    core::CInstance* r0_2 = *(arg1 + 4)
    int32_t* r2_2 = *(arg1 + 0x40) - 4
    *r2_2
    *(arg1 + 0x40) = r2_2
    core::CWorldBase::RollbackInstance(r0_2)

int32_t r0_13 = *__stack_chk_guard

if (r0_13 == r0)
    return r0_13 - r0

__stack_chk_fail()
noreturn
