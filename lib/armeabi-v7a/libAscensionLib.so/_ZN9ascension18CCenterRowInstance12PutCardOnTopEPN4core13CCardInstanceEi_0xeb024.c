// 函数: _ZN9ascension18CCenterRowInstance12PutCardOnTopEPN4core13CCardInstanceEi
// 地址: 0xeb024
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t r1 = *(arg1 + 0x18)
int32_t* r10 = *(arg1 + 0x1c)

if (r10 != r1)
    uint32_t r6_1 = *(arg1 + 4)
    
    do
        r10 -= 4
        void* r4_1 = *r10
        void* r0_2 = core::CWorldBase::AddRollbackData(r6_1, zx.d(*(arg1 + 8)), 
            &__elf_symbol_table[0x23].st_name:1)
        
        if (r0_2 != 0)
            *(r0_2 + 0xc) = zx.d(*(r4_1 + 8))
        
        ascension::CWorld::RemoveActiveEffect(r6_1)
        r1 = *(arg1 + 0x18)
    while (r10 != r1)

int32_t r4_2 = *(arg1 + 0xc)
int32_t* r6_2 = *(arg1 + 0x10)
int32_t r2 = *(arg1 + 0x14)
*(arg1 + 0x1c) = r1
int32_t entry_r2

if (r2 == r6_2)
    std::__ndk1::vector<ascension::CenterRowCardEntry, std::__ndk1::allocator<ascension::CenterRowCardEntry> >::__push_back_slow_path<ascension::CenterRowCardEntry const&>(
        arg1 + 0xc)
else
    *r6_2 = arg2
    r6_2[1] = entry_r2
    *(arg1 + 0x10) += 8

void* r0_10
uint32_t r2_1
r0_10, r2_1 = core::CWorldBase::AddRollbackData(*(arg1 + 4), zx.d(*(arg1 + 8)), 
    &__elf_symbol_table[0x22].st_name:1)

if (r0_10 != 0)
    if (arg2 != 0)
        r2_1 = zx.d(*(arg2 + 8))
    
    uint16_t r1_7 = ((r6_2 - r4_2) u>> 3).w
    
    if (arg2 == 0)
        r2_1 = 0
    
    *(r0_10 + 0x10) = r1_7
    *(r0_10 + 0xc) = r2_1
    *(r0_10 + 0x12) = r1_7
    *(r0_10 + 0x14) = entry_r2

ascension::CCenterRowInstance::CreateActiveEffects(arg1)
int32_t r0_12 = *__stack_chk_guard

if (r0_12 == r0)
    return r0_12 - r0

__stack_chk_fail()
noreturn
