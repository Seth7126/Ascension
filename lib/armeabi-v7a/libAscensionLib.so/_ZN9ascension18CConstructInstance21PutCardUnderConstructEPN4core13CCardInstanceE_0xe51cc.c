// 函数: _ZN9ascension18CConstructInstance21PutCardUnderConstructEPN4core13CCardInstanceE
// 地址: 0xe51cc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t* r0_1 = *(arg1 + 0x4c)
uint32_t entry_r1

if (r0_1 == *(arg1 + 0x50))
    std::__ndk1::vector<core::CCardInstance*, std::__ndk1::allocator<core::CCardInstance*> >::__push_back_slow_path<core::CCardInstance* const&>(
        arg1 + 0x48)
else
    *r0_1 = entry_r1
    *(arg1 + 0x4c) += 4

void* r0_6 = core::CWorldBase::AddRollbackData(*(arg1 + 4), zx.d(*(arg1 + 8)), 
    &__elf_symbol_table[2].st_value)

if (r0_6 != 0)
    uint32_t r2_1 = entry_r1
    bool cond:0_1 = r2_1 == 0
    
    if (r2_1 != 0)
        r2_1 = zx.d(*(r2_1 + 8))
    
    if (cond:0_1)
        r2_1 = 0
    
    int16_t r1_4 = ((*(arg1 + 0x4c) - *(arg1 + 0x48)) u>> 2).w - 1
    *(r0_6 + 0x10) = r1_4
    *(r0_6 + 0xc) = r2_1
    *(r0_6 + 0x12) = r1_4

int32_t r0_7 = *__stack_chk_guard

if (r0_7 == r0)
    return r0_7 - r0

__stack_chk_fail()
noreturn
