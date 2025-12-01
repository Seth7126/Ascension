// 函数: _ZN9ascension18CCenterRowInstance12PutCardUnderEPN4core13CCardInstanceEi
// 地址: 0xeb2c8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
ascension::CenterRowCardEntry* r6 = *(arg1 + 0xc)
int32_t r9 = *(arg1 + 0x10)
int32_t var_2c = arg2
int32_t entry_r2
int32_t var_28 = entry_r2
std::__ndk1::vector<ascension::CenterRowCardEntry, std::__ndk1::allocator<ascension::CenterRowCardEntry> >::insert(
    arg1 + 0xc, r6)
void* r0_3 = core::CWorldBase::AddRollbackData(*(arg1 + 4), zx.d(*(arg1 + 8)), 
    &__elf_symbol_table[0x22].st_name:3)

if (r0_3 != 0)
    uint32_t r3_1 = 0
    
    if (arg2 != 0)
        r3_1 = zx.d(*(arg2 + 8))
    
    *(r0_3 + 0x10) = 0
    *(r0_3 + 0xc) = r3_1
    *(r0_3 + 0x12) = ((r9 - r6) u>> 3).w
    *(r0_3 + 0x14) = entry_r2

int32_t r0_4 = *__stack_chk_guard

if (r0_4 == r0)
    return r0_4 - r0

__stack_chk_fail()
noreturn
